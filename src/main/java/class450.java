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

@OriginalClass("client!laa")
public class class450 implements class212 {

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field5871 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "[I")
    private int[] field5876 = new int[2];

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "[Z")
    private boolean[] field5873 = new boolean[2];

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "[[B")
    private byte[][] field5872 = new byte[2][];

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field5880 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field5879 = new DSCursors[2];

    @OriginalMember(owner = "client!laa", name = "m", descriptor = "[I")
    private int[] field5883 = new int[2];

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field5878 = new DirectSound();

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field5874 = new WaveFormatEx();

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "I")
    private int field5875;

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
    private int field5877;

    @OriginalMember(owner = "client!laa", name = "k", descriptor = "I")
    private int field5881;

    @OriginalMember(owner = "client!laa", name = "l", descriptor = "[I")
    private int[] field5882;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(II)V", line = 3)
    public final void method1363(int arg0, int arg1) {
        if (arg0 != -6142) {
            this.field5872 = null;
        }
        if (this.field5871[arg1] == null) {
            return;
        }
        try {
            this.field5871[arg1].stop();
        } catch (ComFailException var3) {
        }
        this.field5871[arg1] = null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IZ)I", line = 24)
    public final int method1364(int arg0, boolean arg1) {
        if (!this.field5873[arg0]) {
            return 0;
        }
        this.field5871[arg0].getCurrentPosition(this.field5879[arg0]);
        if (!arg1) {
            this.method1364(-39, false);
        }
        int var3 = this.field5879[arg0].write / this.field5877;
        int var4 = this.field5883[arg0] - var3 & 0xFFFF;
        if (var4 > this.field5876[arg0]) {
            for (int var5 = var3 - this.field5883[arg0] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method1366(arg0, this.field5882);
            }
            var4 = this.field5883[arg0] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IB)V", line = 62)
    public final void method1361(int arg0, byte arg1) {
        this.field5871[arg0].stop();
        this.field5873[arg0] = false;
        this.field5871[arg0].setCurrentPosition(0);
        this.field5883[arg0] = 0;
        if (arg1 >= -24) {
            this.field5871 = null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(BILjava/awt/Component;Z)V", line = 76)
    public final void method1365(byte arg0, int arg1, Component arg2, boolean arg3) throws Exception {
        int var5 = -4 / ((37 - arg0) / 32);
        if (this.field5881 != 0) {
            return;
        }
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field5877 = arg3 ? 4 : 2;
        this.field5875 = arg3 ? 2 : 1;
        this.field5882 = new int[this.field5875 * 256];
        this.field5878.initialize(null);
        this.field5878.setCooperativeLevel(arg2, 2);
        for (int var6 = 0; var6 < 2; var6++) {
            this.field5880[var6].flags = 16384;
        }
        this.field5874.avgBytesPerSec = this.field5877 * arg1;
        this.field5881 = arg1;
        this.field5874.formatTag = 1;
        this.field5874.samplesPerSec = arg1;
        this.field5874.bitsPerSample = 16;
        this.field5874.channels = this.field5875;
        this.field5874.blockAlign = this.field5877;
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "()V", line = 197)
    public class450() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field5880[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field5879[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IBI)V", line = 117)
    public final void method1362(int arg0, byte arg1, int arg2) throws Exception {
        if (this.field5881 == 0 || this.field5871[arg0] != null) {
            throw new IllegalStateException();
        }
        if (arg1 != -84) {
            this.method1366(38, null);
        }
        int var4 = this.field5877 * 65536;
        if (this.field5872[arg0] == null || this.field5872[arg0].length != var4) {
            this.field5872[arg0] = new byte[var4];
            this.field5880[arg0].bufferBytes = var4;
        }
        this.field5871[arg0] = this.field5878.createSoundBuffer(this.field5880[arg0], this.field5874);
        this.field5873[arg0] = false;
        this.field5883[arg0] = 0;
        this.field5876[arg0] = arg2;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I[I)V", line = 146)
    public final void method1366(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field5875 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field5883[arg0] * this.field5877;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field5872[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field5872[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field5871[arg0].writeBuffer(var4, var3 * 2, this.field5872[arg0], 0);
        this.field5883[arg0] = var3 / this.field5875 + this.field5883[arg0] & 0xFFFF;
        if (!this.field5873[arg0]) {
            this.field5871[arg0].play(1);
            this.field5873[arg0] = true;
        }
    }
}
