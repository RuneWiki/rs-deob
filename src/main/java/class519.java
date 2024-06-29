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

@OriginalClass("client!vaa")
public class class519 implements class502 {

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field7657 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!vaa", name = "j", descriptor = "[[B")
    private byte[][] field7664 = new byte[2][];

    @OriginalMember(owner = "client!vaa", name = "k", descriptor = "[Z")
    private boolean[] field7665 = new boolean[2];

    @OriginalMember(owner = "client!vaa", name = "h", descriptor = "[I")
    private int[] field7662 = new int[2];

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field7659 = new DSCursors[2];

    @OriginalMember(owner = "client!vaa", name = "l", descriptor = "[I")
    private int[] field7666 = new int[2];

    @OriginalMember(owner = "client!vaa", name = "m", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field7667 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field7655 = new DirectSound();

    @OriginalMember(owner = "client!vaa", name = "i", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field7663 = new WaveFormatEx();

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
    private int field7658;

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "I")
    private int field7660;

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "I")
    private int field7661;

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "[I")
    private int[] field7656;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I[I)V", line = 8)
    public final void method2997(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field7660 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field7662[arg0] * this.field7661;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field7664[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field7664[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field7657[arg0].writeBuffer(var4, var3 * 2, this.field7664[arg0], 0);
        this.field7662[arg0] = var3 / this.field7660 + this.field7662[arg0] & 0xFFFF;
        if (!this.field7665[arg0]) {
            this.field7657[arg0].play(1);
            this.field7665[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BII)V", line = 40)
    public final void method2999(byte arg0, int arg1, int arg2) throws Exception {
        if (this.field7658 == 0 || this.field7657[arg1] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field7661 * 65536;
        if (arg0 >= -41) {
            this.method2998(101, 116);
        }
        if (this.field7664[arg1] == null || this.field7664[arg1].length != var4) {
            this.field7664[arg1] = new byte[var4];
            this.field7667[arg1].bufferBytes = var4;
        }
        this.field7657[arg1] = this.field7655.createSoundBuffer(this.field7667[arg1], this.field7663);
        this.field7665[arg1] = false;
        this.field7662[arg1] = 0;
        this.field7666[arg1] = arg2;
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(II)V", line = 67)
    public final void method2998(int arg0, int arg1) {
        if (this.field7657[arg1] != null) {
            try {
                this.field7657[arg1].stop();
            } catch (ComFailException var3) {
            }
            this.field7657[arg1] = null;
        }
        if (arg0 != 2) {
            this.field7659 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "()V", line = 196)
    public class519() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field7667[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field7659[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZ)V", line = 94)
    public final void method2996(int arg0, boolean arg1) {
        this.field7657[arg0].stop();
        this.field7665[arg0] = arg1;
        this.field7657[arg0].setCurrentPosition(0);
        this.field7662[arg0] = 0;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)I", line = 105)
    public final int method2995(int arg0, int arg1) {
        if (arg1 >= -96) {
            this.method2996(-120, true);
        }
        if (!this.field7665[arg0]) {
            return 0;
        }
        this.field7657[arg0].getCurrentPosition(this.field7659[arg0]);
        int var3 = this.field7659[arg0].write / this.field7661;
        int var4 = this.field7662[arg0] - var3 & 0xFFFF;
        if (this.field7666[arg0] < var4) {
            int var5 = var3 - this.field7662[arg0] & 0xFFFF;
            while (var5 > 0) {
                var5 -= 256;
                this.method2997(arg0, this.field7656);
            }
            var4 = this.field7662[arg0] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Ljava/awt/Component;ZII)V", line = 144)
    public final void method2994(Component arg0, boolean arg1, int arg2, int arg3) throws Exception {
        if (this.field7658 != 0) {
            return;
        }
        int var5 = 36 % ((30 - arg2) / 43);
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field7660 = arg1 ? 2 : 1;
        this.field7661 = arg1 ? 4 : 2;
        this.field7656 = new int[this.field7660 * 256];
        this.field7655.initialize(null);
        this.field7655.setCooperativeLevel(arg0, 2);
        for (int var6 = 0; var6 < 2; var6++) {
            this.field7667[var6].flags = 16384;
        }
        this.field7658 = arg3;
        this.field7663.blockAlign = this.field7661;
        this.field7663.bitsPerSample = 16;
        this.field7663.samplesPerSec = arg3;
        this.field7663.channels = this.field7660;
        this.field7663.formatTag = 1;
        this.field7663.avgBytesPerSec = this.field7661 * arg3;
    }
}
