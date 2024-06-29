import com.ms.com.ComFailException;
import com.ms.com._Guid;
import com.ms.directX.DSBufferDesc;
import com.ms.directX.DSCursors;
import com.ms.directX.DirectSound;
import com.ms.directX.DirectSoundBuffer;
import com.ms.directX.WaveFormatEx;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class232 implements class431 {

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "[I")
    private int[] field2969 = new int[2];

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "[I")
    private int[] field2974 = new int[2];

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "[Z")
    private boolean[] field2975 = new boolean[2];

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field2977 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "[[B")
    private byte[][] field2972 = new byte[2][];

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field2978 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field2970 = new DSCursors[2];

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field2979 = new DirectSound();

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field2976 = new WaveFormatEx();

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    private int field2967;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    private int field2971;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
    private int field2973;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "[I")
    private int[] field2968;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZI)V", line = 3)
    public final void method1461(boolean arg0, int arg1) {
        if (this.field2977[arg1] != null) {
            try {
                this.field2977[arg1].stop();
            } catch (ComFailException var3) {
            }
            this.field2977[arg1] = null;
        }
        if (arg0) {
            this.field2972 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I[I)V", line = 24)
    public final void method1462(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field2967 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field2974[arg0] * this.field2971;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field2972[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field2972[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field2977[arg0].writeBuffer(var4, var3 * 2, this.field2972[arg0], 0);
        this.field2974[arg0] = var3 / this.field2967 + this.field2974[arg0] & 0xFFFF;
        if (!this.field2975[arg0]) {
            this.field2977[arg0].play(1);
            this.field2975[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BIZLjava/awt/Component;)V", line = 57)
    public final void method1463(byte arg0, int arg1, boolean arg2, Component arg3) throws Exception {
        if (this.field2973 != 0) {
            return;
        }
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field2971 = arg2 ? 4 : 2;
        this.field2967 = arg2 ? 2 : 1;
        this.field2968 = new int[this.field2967 * 256];
        if (arg0 != 88) {
            this.field2974 = null;
        }
        this.field2979.initialize(null);
        this.field2979.setCooperativeLevel(arg3, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field2978[var5].flags = 16384;
        }
        this.field2976.avgBytesPerSec = this.field2971 * arg1;
        this.field2976.formatTag = 1;
        this.field2976.channels = this.field2967;
        this.field2976.samplesPerSec = arg1;
        this.field2976.bitsPerSample = 16;
        this.field2976.blockAlign = this.field2971;
        this.field2973 = arg1;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "()V", line = 190)
    public class232() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field2978[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field2970[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)V", line = 98)
    public final void method1464(int arg0, int arg1, int arg2) throws Exception {
        if (~this.field2973 == arg1 || this.field2977[arg2] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field2971 * 65536;
        if (this.field2972[arg2] == null || this.field2972[arg2].length != var4) {
            this.field2972[arg2] = new byte[var4];
            this.field2978[arg2].bufferBytes = var4;
        }
        this.field2977[arg2] = this.field2979.createSoundBuffer(this.field2978[arg2], this.field2976);
        this.field2975[arg2] = false;
        this.field2974[arg2] = 0;
        this.field2969[arg2] = arg0;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BI)I", line = 134)
    public final int method1465(byte arg0, int arg1) {
        if (!this.field2975[arg1]) {
            return 0;
        }
        this.field2977[arg1].getCurrentPosition(this.field2970[arg1]);
        int var3 = -79 % ((11 - arg0) / 57);
        int var4 = this.field2970[arg1].write / this.field2971;
        int var5 = this.field2974[arg1] - var4 & 0xFFFF;
        if (var5 > this.field2969[arg1]) {
            int var6 = var4 - this.field2974[arg1] & 0xFFFF;
            while (var6 > 0) {
                var6 -= 256;
                this.method1462(arg1, this.field2968);
            }
            var5 = this.field2974[arg1] - var4 & 0xFFFF;
        }
        return var5;
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(ZI)V", line = 167)
    public final void method1466(boolean arg0, int arg1) {
        this.field2977[arg1].stop();
        this.field2975[arg1] = arg0;
        this.field2977[arg1].setCurrentPosition(0);
        this.field2974[arg1] = 0;
    }
}
