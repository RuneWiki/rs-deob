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

@OriginalClass("client!st")
public class class395 implements class578 {

    @OriginalMember(owner = "client!st", name = "a", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field5253 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!st", name = "e", descriptor = "[I")
    private int[] field5257 = new int[2];

    @OriginalMember(owner = "client!st", name = "f", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field5258 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!st", name = "i", descriptor = "[[B")
    private byte[][] field5261 = new byte[2][];

    @OriginalMember(owner = "client!st", name = "j", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field5262 = new DSCursors[2];

    @OriginalMember(owner = "client!st", name = "m", descriptor = "[I")
    private int[] field5265 = new int[2];

    @OriginalMember(owner = "client!st", name = "l", descriptor = "[Z")
    private boolean[] field5264 = new boolean[2];

    @OriginalMember(owner = "client!st", name = "g", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field5259 = new DirectSound();

    @OriginalMember(owner = "client!st", name = "c", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field5255 = new WaveFormatEx();

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    private int field5256;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "I")
    private int field5260;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    private int field5263;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "[I")
    private int[] field5254;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
    public final void method2153(boolean arg0, Component arg1, int arg2, int arg3) throws Exception {
        if (this.field5256 != 0) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field5263 = arg0 ? 2 : 1;
        this.field5260 = arg0 ? 4 : 2;
        this.field5254 = new int[this.field5263 * 256];
        this.field5259.initialize(null);
        this.field5259.setCooperativeLevel(arg1, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field5258[var5].flags = 16384;
        }
        this.field5255.formatTag = 1;
        if (arg2 != 48000) {
            this.method2156(1, false);
        }
        this.field5255.channels = this.field5263;
        this.field5255.avgBytesPerSec = this.field5260 * arg3;
        this.field5256 = arg3;
        this.field5255.blockAlign = this.field5260;
        this.field5255.samplesPerSec = arg3;
        this.field5255.bitsPerSample = 16;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I[I)V")
    public final void method2154(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field5263 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field5257[arg0] * this.field5260;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field5261[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field5261[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field5253[arg0].writeBuffer(var4, var3 * 2, this.field5261[arg0], 0);
        this.field5257[arg0] = var3 / this.field5263 + this.field5257[arg0] & 0xFFFF;
        if (!this.field5264[arg0]) {
            this.field5253[arg0].play(1);
            this.field5264[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IB)V")
    public final void method2155(int arg0, byte arg1) {
        this.field5253[arg0].stop();
        this.field5264[arg0] = false;
        this.field5253[arg0].setCurrentPosition(0);
        this.field5257[arg0] = 0;
        if (arg1 >= -81) {
            this.method2155(-13, (byte) 80);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IZ)V")
    public final void method2156(int arg0, boolean arg1) {
        if (!arg1) {
            this.method2154(-23, null);
        }
        if (this.field5253[arg0] == null) {
            return;
        }
        try {
            this.field5253[arg0].stop();
        } catch (ComFailException var3) {
        }
        this.field5253[arg0] = null;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(III)V")
    public final void method2157(int arg0, int arg1, int arg2) throws Exception {
        if (this.field5256 == 0 || this.field5253[arg2] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field5260 * 65536;
        if (this.field5261[arg2] == null || this.field5261[arg2].length != var4) {
            this.field5261[arg2] = new byte[var4];
            this.field5258[arg2].bufferBytes = var4;
        }
        this.field5253[arg2] = this.field5259.createSoundBuffer(this.field5258[arg2], this.field5255);
        int var5 = 24 % ((arg1 + 53) / 57);
        this.field5264[arg2] = false;
        this.field5257[arg2] = 0;
        this.field5265[arg2] = arg0;
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
    public class395() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field5258[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field5262[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(IB)I")
    public final int method2158(int arg0, byte arg1) {
        if (!this.field5264[arg0]) {
            return 0;
        }
        this.field5253[arg0].getCurrentPosition(this.field5262[arg0]);
        int var3 = this.field5262[arg0].write / this.field5260;
        int var4 = this.field5257[arg0] - var3 & 0xFFFF;
        if (this.field5265[arg0] < var4) {
            int var5 = var3 - this.field5257[arg0] & 0xFFFF;
            while (var5 > 0) {
                var5 -= 256;
                this.method2154(arg0, this.field5254);
            }
            var4 = this.field5257[arg0] - var3 & 0xFFFF;
        }
        int var6 = 1 % ((arg1 - 34) / 60);
        return var4;
    }
}
