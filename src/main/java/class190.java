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

@OriginalClass("client!jb")
public class class190 implements class371 {

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "[I")
    private int[] field2651 = new int[2];

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field2647 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "[Z")
    private boolean[] field2649 = new boolean[2];

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "[[B")
    private byte[][] field2646 = new byte[2][];

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "[I")
    private int[] field2650 = new int[2];

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field2652 = new DSCursors[2];

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field2655 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field2657 = new DirectSound();

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field2654 = new WaveFormatEx();

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    private int field2645;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    private int field2648;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    private int field2656;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "[I")
    private int[] field2653;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)I", line = 10)
    public final int method1329(int arg0, int arg1) {
        if (!this.field2649[arg1]) {
            return 0;
        }
        this.field2647[arg1].getCurrentPosition(this.field2652[arg1]);
        int var3 = this.field2652[arg1].write / this.field2645;
        int var4 = this.field2651[arg1] - var3 & 0xFFFF;
        if (arg0 != 256) {
            this.field2646 = null;
        }
        if (var4 > this.field2650[arg1]) {
            int var5 = var3 - this.field2651[arg1] & 0xFFFF;
            while (var5 > 0) {
                var5 -= 256;
                this.method1331(arg1, this.field2653);
            }
            var4 = this.field2651[arg1] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBI)V", line = 44)
    public final void method1330(int arg0, byte arg1, int arg2) throws Exception {
        if (this.field2656 == 0 || this.field2647[arg2] != null) {
            throw new IllegalStateException();
        }
        if (arg1 > -76) {
            this.method1331(-51, null);
        }
        int var4 = this.field2645 * 65536;
        if (this.field2646[arg2] == null || this.field2646[arg2].length != var4) {
            this.field2646[arg2] = new byte[var4];
            this.field2655[arg2].bufferBytes = var4;
        }
        this.field2647[arg2] = this.field2657.createSoundBuffer(this.field2655[arg2], this.field2654);
        this.field2649[arg2] = false;
        this.field2651[arg2] = 0;
        this.field2650[arg2] = arg0;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 195)
    public class190() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field2655[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field2652[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[I)V", line = 75)
    public final void method1331(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field2648 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field2651[arg0] * this.field2645;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field2646[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field2646[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field2647[arg0].writeBuffer(var4, var3 * 2, this.field2646[arg0], 0);
        this.field2651[arg0] = var3 / this.field2648 + this.field2651[arg0] & 0xFFFF;
        if (!this.field2649[arg0]) {
            this.field2647[arg0].play(1);
            this.field2649[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V", line = 113)
    public final void method1332(int arg0, int arg1) {
        if (this.field2647[arg1] != null) {
            try {
                this.field2647[arg1].stop();
            } catch (ComFailException var3) {
            }
            this.field2647[arg1] = null;
        }
        if (arg0 != 2) {
            this.field2647 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZIILjava/awt/Component;)V", line = 142)
    public final void method1333(boolean arg0, int arg1, int arg2, Component arg3) throws Exception {
        if (this.field2656 != 0) {
            return;
        }
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field2648 = arg0 ? 2 : 1;
        this.field2645 = arg0 ? 4 : 2;
        this.field2653 = new int[this.field2648 * 256];
        this.field2657.initialize(null);
        this.field2657.setCooperativeLevel(arg3, 2);
        for (int var5 = arg1; var5 < 2; var5++) {
            this.field2655[var5].flags = 16384;
        }
        this.field2656 = arg2;
        this.field2654.samplesPerSec = arg2;
        this.field2654.blockAlign = this.field2645;
        this.field2654.bitsPerSample = 16;
        this.field2654.formatTag = 1;
        this.field2654.avgBytesPerSec = this.field2645 * arg2;
        this.field2654.channels = this.field2648;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V", line = 179)
    public final void method1334(int arg0, int arg1) {
        this.field2647[arg1].stop();
        this.field2649[arg1] = false;
        this.field2647[arg1].setCurrentPosition(0);
        if (arg0 != -21944) {
            this.field2655 = null;
        }
        this.field2651[arg1] = 0;
    }
}
