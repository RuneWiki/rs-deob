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

@OriginalClass("client!fq")
public class class203 implements class688 {

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "[I")
    private int[] field3037 = new int[2];

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field3036 = new DSCursors[2];

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "[Z")
    private boolean[] field3039 = new boolean[2];

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "[[B")
    private byte[][] field3041 = new byte[2][];

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "[I")
    private int[] field3046 = new int[2];

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field3047 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field3048 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field3045 = new DirectSound();

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field3042 = new WaveFormatEx();

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    private int field3038;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    private int field3040;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    private int field3043;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "[I")
    private int[] field3044;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(II)V", line = 4)
    public final void method1361(int arg0, int arg1) {
        if (this.field3047[arg0] != null) {
            try {
                this.field3047[arg0].stop();
            } catch (ComFailException var3) {
            }
            this.field3047[arg0] = null;
        }
        if (arg1 != 16) {
            this.method1363(-51, null);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BII)V", line = 27)
    public final void method1362(byte arg0, int arg1, int arg2) throws Exception {
        if (this.field3043 == 0 || this.field3047[arg2] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field3040 * 65536;
        if (this.field3041[arg2] == null || this.field3041[arg2].length != var4) {
            this.field3041[arg2] = new byte[var4];
            this.field3048[arg2].bufferBytes = var4;
        }
        this.field3047[arg2] = this.field3045.createSoundBuffer(this.field3048[arg2], this.field3042);
        this.field3039[arg2] = false;
        this.field3037[arg2] = 0;
        if (arg0 != 27) {
            this.method1363(-53, null);
        }
        this.field3046[arg2] = arg1;
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V", line = 163)
    public class203() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field3048[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field3036[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[I)V", line = 62)
    public final void method1363(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field3038 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field3037[arg0] * this.field3040;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field3041[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field3041[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field3047[arg0].writeBuffer(var4, var3 * 2, this.field3041[arg0], 0);
        this.field3037[arg0] = var3 / this.field3038 + this.field3037[arg0] & 0xFFFF;
        if (!this.field3039[arg0]) {
            this.field3047[arg0].play(1);
            this.field3039[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)I", line = 99)
    public final int method1364(int arg0, int arg1) {
        if (!this.field3039[arg0]) {
            return 0;
        }
        this.field3047[arg0].getCurrentPosition(this.field3036[arg0]);
        int var3 = this.field3036[arg0].write / this.field3040;
        int var4 = this.field3037[arg0] - var3 & 0xFFFF;
        if (var4 > this.field3046[arg0]) {
            int var5 = var3 - this.field3037[arg0] & 0xFFFF;
            while (var5 > 0) {
                var5 -= 256;
                this.method1363(arg0, this.field3044);
            }
            var4 = this.field3037[arg0] - var3 & 0xFFFF;
        }
        if (arg1 != 23707) {
            this.method1364(95, -92);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IB)V", line = 134)
    public final void method1365(int arg0, byte arg1) {
        this.field3047[arg0].stop();
        this.field3039[arg0] = false;
        this.field3047[arg0].setCurrentPosition(0);
        this.field3037[arg0] = 0;
        if (arg1 != -14) {
            this.method1363(5, null);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZLjava/awt/Component;II)V", line = 186)
    public final void method1366(boolean arg0, Component arg1, int arg2, int arg3) throws Exception {
        if (this.field3043 != 0) {
            return;
        }
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field3040 = arg0 ? 4 : 2;
        this.field3038 = arg0 ? 2 : 1;
        this.field3044 = new int[this.field3038 * 256];
        this.field3045.initialize(null);
        this.field3045.setCooperativeLevel(arg1, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field3048[var5].flags = 16384;
        }
        this.field3043 = arg2;
        this.field3042.channels = this.field3038;
        this.field3042.bitsPerSample = 16;
        this.field3042.samplesPerSec = arg2;
        this.field3042.formatTag = 1;
        this.field3042.blockAlign = this.field3040;
        int var6 = 98 / ((arg3 + 59) / 57);
        this.field3042.avgBytesPerSec = this.field3040 * arg2;
    }
}
