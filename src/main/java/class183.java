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

@OriginalClass("client!ffa")
public class class183 implements class702 {

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field2474 = new DSCursors[2];

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "[I")
    private int[] field2479 = new int[2];

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "[I")
    private int[] field2480 = new int[2];

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "[Z")
    private boolean[] field2478 = new boolean[2];

    @OriginalMember(owner = "client!ffa", name = "l", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field2485 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "[[B")
    private byte[][] field2475 = new byte[2][];

    @OriginalMember(owner = "client!ffa", name = "m", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field2486 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field2483 = new DirectSound();

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field2477 = new WaveFormatEx();

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "I")
    private int field2476;

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "I")
    private int field2482;

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "I")
    private int field2484;

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "[I")
    private int[] field2481;

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "()V", line = 194)
    public class183() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field2485[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field2474[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(III)V", line = 12)
    public final void method1156(int arg0, int arg1, int arg2) throws Exception {
        if (this.field2482 == 0 || this.field2486[arg2] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field2484 * 65536;
        int var5 = -32 / ((arg0 - 55) / 45);
        if (this.field2475[arg2] == null || this.field2475[arg2].length != var4) {
            this.field2475[arg2] = new byte[var4];
            this.field2485[arg2].bufferBytes = var4;
        }
        this.field2486[arg2] = this.field2483.createSoundBuffer(this.field2485[arg2], this.field2477);
        this.field2478[arg2] = false;
        this.field2480[arg2] = 0;
        this.field2479[arg2] = arg1;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IB)V", line = 37)
    public final void method1157(int arg0, byte arg1) {
        this.field2486[arg0].stop();
        int var3 = 5 % ((arg1 - 53) / 47);
        this.field2478[arg0] = false;
        this.field2486[arg0].setCurrentPosition(0);
        this.field2480[arg0] = 0;
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(BI)I", line = 50)
    public final int method1158(byte arg0, int arg1) {
        if (!this.field2478[arg1]) {
            return 0;
        }
        this.field2486[arg1].getCurrentPosition(this.field2474[arg1]);
        int var3 = this.field2474[arg1].write / this.field2484;
        int var4 = this.field2480[arg1] - var3 & 0xFFFF;
        if (arg0 != -60) {
            this.field2486 = null;
        }
        if (this.field2479[arg1] < var4) {
            for (int var5 = var3 - this.field2480[arg1] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method1160(arg1, this.field2481);
            }
            var4 = this.field2480[arg1] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BI)V", line = 89)
    public final void method1159(byte arg0, int arg1) {
        if (arg0 != 36) {
            this.method1157(-27, (byte) -47);
        }
        if (this.field2486[arg1] == null) {
            return;
        }
        try {
            this.field2486[arg1].stop();
        } catch (ComFailException var3) {
        }
        this.field2486[arg1] = null;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I[I)V", line = 115)
    public final void method1160(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field2476 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field2480[arg0] * this.field2484;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field2475[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field2475[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field2486[arg0].writeBuffer(var4, var3 * 2, this.field2475[arg0], 0);
        this.field2480[arg0] = var3 / this.field2476 + this.field2480[arg0] & 0xFFFF;
        if (!this.field2478[arg0]) {
            this.field2486[arg0].play(1);
            this.field2478[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljava/awt/Component;ZII)V", line = 151)
    public final void method1161(Component arg0, boolean arg1, int arg2, int arg3) throws Exception {
        if (this.field2482 != arg3) {
            return;
        }
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field2484 = arg1 ? 4 : 2;
        this.field2476 = arg1 ? 2 : 1;
        this.field2481 = new int[this.field2476 * 256];
        this.field2483.initialize(null);
        this.field2483.setCooperativeLevel(arg0, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field2485[var5].flags = 16384;
        }
        this.field2477.formatTag = 1;
        this.field2477.avgBytesPerSec = this.field2484 * arg2;
        this.field2477.bitsPerSample = 16;
        this.field2477.samplesPerSec = arg2;
        this.field2477.blockAlign = this.field2484;
        this.field2482 = arg2;
        this.field2477.channels = this.field2476;
    }
}
