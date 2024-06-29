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

@OriginalClass("client!ac")
public class class540 implements class676 {

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field7475 = new DSCursors[2];

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field7472 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[Z")
    private boolean[] field7476 = new boolean[2];

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field7473 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "[[B")
    private byte[][] field7479 = new byte[2][];

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "[I")
    private int[] field7480 = new int[2];

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
    private int[] field7484 = new int[2];

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field7482 = new DirectSound();

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field7483 = new WaveFormatEx();

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    private int field7477;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    private int field7478;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    private int field7481;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
    private int[] field7474;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(BI)V", line = 5)
    public final void method3110(byte arg0, int arg1) {
        this.field7473[arg1].stop();
        this.field7476[arg1] = false;
        if (arg0 > 96) {
            this.field7473[arg1].setCurrentPosition(0);
            this.field7480[arg1] = 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)V", line = 20)
    public final void method3111(int arg0, byte arg1) {
        if (this.field7473[arg0] != null) {
            try {
                this.field7473[arg0].stop();
            } catch (ComFailException var4) {
            }
            this.field7473[arg0] = null;
        }
        int var3 = 73 / ((arg1 - 79) / 43);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[I)V", line = 41)
    public final void method3112(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field7477 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field7480[arg0] * this.field7481;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field7479[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field7479[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field7473[arg0].writeBuffer(var4, var3 * 2, this.field7479[arg0], 0);
        this.field7480[arg0] = var3 / this.field7477 + this.field7480[arg0] & 0xFFFF;
        if (!this.field7476[arg0]) {
            this.field7473[arg0].play(1);
            this.field7476[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V", line = 197)
    public class540() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field7472[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field7475[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)I", line = 84)
    public final int method3113(byte arg0, int arg1) {
        if (arg0 >= -79) {
            return -15;
        } else if (this.field7476[arg1]) {
            this.field7473[arg1].getCurrentPosition(this.field7475[arg1]);
            int var3 = this.field7475[arg1].write / this.field7481;
            int var4 = this.field7480[arg1] - var3 & 0xFFFF;
            if (this.field7484[arg1] < var4) {
                for (int var5 = var3 - this.field7480[arg1] & 0xFFFF; var5 > 0; var5 -= 256) {
                    this.method3112(arg1, this.field7474);
                }
                var4 = this.field7480[arg1] - var3 & 0xFFFF;
            }
            return var4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZLjava/awt/Component;I)V", line = 126)
    public final void method3114(int arg0, boolean arg1, Component arg2, int arg3) throws Exception {
        if (this.field7478 != 0) {
            return;
        }
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field7477 = arg1 ? 2 : 1;
        if (arg3 != 27929) {
            this.field7482 = null;
        }
        this.field7481 = arg1 ? 4 : 2;
        this.field7474 = new int[this.field7477 * 256];
        this.field7482.initialize(null);
        this.field7482.setCooperativeLevel(arg2, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field7472[var5].flags = 16384;
        }
        this.field7483.avgBytesPerSec = this.field7481 * arg0;
        this.field7483.formatTag = 1;
        this.field7483.bitsPerSample = 16;
        this.field7483.blockAlign = this.field7481;
        this.field7483.channels = this.field7477;
        this.field7478 = arg0;
        this.field7483.samplesPerSec = arg0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIB)V", line = 169)
    public final void method3115(int arg0, int arg1, byte arg2) throws Exception {
        if (this.field7478 == 0 || this.field7473[arg1] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field7481 * 65536;
        if (this.field7479[arg1] == null || this.field7479[arg1].length != var4) {
            this.field7479[arg1] = new byte[var4];
            this.field7472[arg1].bufferBytes = var4;
        }
        this.field7473[arg1] = this.field7482.createSoundBuffer(this.field7472[arg1], this.field7483);
        this.field7476[arg1] = false;
        if (arg2 < 106) {
            this.method3111(-6, (byte) -123);
        }
        this.field7480[arg1] = 0;
        this.field7484[arg1] = arg0;
    }
}
