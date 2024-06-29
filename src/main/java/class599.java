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

@OriginalClass("client!nea")
public class class599 implements class147 {

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "[I")
    private int[] field8385 = new int[2];

    @OriginalMember(owner = "client!nea", name = "h", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field8391 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field8389 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!nea", name = "i", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field8392 = new DSCursors[2];

    @OriginalMember(owner = "client!nea", name = "k", descriptor = "[Z")
    private boolean[] field8394 = new boolean[2];

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "[I")
    private int[] field8387 = new int[2];

    @OriginalMember(owner = "client!nea", name = "m", descriptor = "[[B")
    private byte[][] field8396 = new byte[2][];

    @OriginalMember(owner = "client!nea", name = "g", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field8390 = new DirectSound();

    @OriginalMember(owner = "client!nea", name = "j", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field8393 = new WaveFormatEx();

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "I")
    private int field8384;

    @OriginalMember(owner = "client!nea", name = "e", descriptor = "I")
    private int field8388;

    @OriginalMember(owner = "client!nea", name = "l", descriptor = "I")
    private int field8395;

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "[I")
    private int[] field8386;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    public final void method975(int arg0, boolean arg1, Component arg2, int arg3) throws Exception {
        if (this.field8388 != 0) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field8395 = arg1 ? 2 : 1;
        this.field8384 = arg1 ? 4 : 2;
        this.field8386 = new int[this.field8395 * 256];
        this.field8390.initialize(null);
        this.field8390.setCooperativeLevel(arg2, 2);
        int var5 = -31 / ((81 - arg0) / 42);
        for (int var6 = 0; var6 < 2; var6++) {
            this.field8391[var6].flags = 16384;
        }
        this.field8393.channels = this.field8395;
        this.field8388 = arg3;
        this.field8393.bitsPerSample = 16;
        this.field8393.blockAlign = this.field8384;
        this.field8393.samplesPerSec = arg3;
        this.field8393.formatTag = 1;
        this.field8393.avgBytesPerSec = this.field8384 * arg3;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(II)V")
    public final void method977(int arg0, int arg1) {
        if (this.field8389[arg1] != null) {
            try {
                this.field8389[arg1].stop();
            } catch (ComFailException var3) {
            }
            this.field8389[arg1] = null;
        }
        if (arg0 != -22127) {
            this.method978(18, null);
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I[I)V")
    public final void method978(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field8395 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field8385[arg0] * this.field8384;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field8396[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field8396[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field8389[arg0].writeBuffer(var4, var3 * 2, this.field8396[arg0], 0);
        this.field8385[arg0] = var3 / this.field8395 + this.field8385[arg0] & 0xFFFF;
        if (!this.field8394[arg0]) {
            this.field8389[arg0].play(1);
            this.field8394[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)V")
    public final void method979(int arg0, int arg1, int arg2) throws Exception {
        if (this.field8388 == 0 || this.field8389[arg1] != null) {
            throw new IllegalStateException();
        } else if (arg0 == 2) {
            int var4 = this.field8384 * 65536;
            if (this.field8396[arg1] == null || this.field8396[arg1].length != var4) {
                this.field8396[arg1] = new byte[var4];
                this.field8391[arg1].bufferBytes = var4;
            }
            this.field8389[arg1] = this.field8390.createSoundBuffer(this.field8391[arg1], this.field8393);
            this.field8394[arg1] = false;
            this.field8385[arg1] = 0;
            this.field8387[arg1] = arg2;
        }
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(II)V")
    public final void method980(int arg0, int arg1) {
        this.field8389[arg0].stop();
        this.field8394[arg0] = false;
        this.field8389[arg0].setCurrentPosition(0);
        this.field8385[arg0] = arg1;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BI)I")
    public final int method976(byte arg0, int arg1) {
        if (!this.field8394[arg1]) {
            return 0;
        }
        if (arg0 != 55) {
            this.field8391 = null;
        }
        this.field8389[arg1].getCurrentPosition(this.field8392[arg1]);
        int var3 = this.field8392[arg1].write / this.field8384;
        int var4 = this.field8385[arg1] - var3 & 0xFFFF;
        if (this.field8387[arg1] < var4) {
            for (int var5 = var3 - this.field8385[arg1] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method978(arg1, this.field8386);
            }
            var4 = this.field8385[arg1] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "()V")
    public class599() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field8391[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field8392[var2] = new DSCursors();
        }
    }
}
