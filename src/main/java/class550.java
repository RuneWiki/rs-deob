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

@OriginalClass("client!uba")
public class class550 implements class22 {

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "[[B")
    private byte[][] field6893 = new byte[2][];

    @OriginalMember(owner = "client!uba", name = "h", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field6899 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field6896 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "[Z")
    private boolean[] field6894 = new boolean[2];

    @OriginalMember(owner = "client!uba", name = "k", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field6902 = new DSCursors[2];

    @OriginalMember(owner = "client!uba", name = "l", descriptor = "[I")
    private int[] field6903 = new int[2];

    @OriginalMember(owner = "client!uba", name = "g", descriptor = "[I")
    private int[] field6898 = new int[2];

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field6895 = new DirectSound();

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field6892 = new WaveFormatEx();

    @OriginalMember(owner = "client!uba", name = "f", descriptor = "I")
    private int field6897;

    @OriginalMember(owner = "client!uba", name = "i", descriptor = "I")
    private int field6900;

    @OriginalMember(owner = "client!uba", name = "j", descriptor = "I")
    private int field6901;

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "[I")
    private int[] field6904;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIZ)V")
    public final void method102(int arg0, int arg1, boolean arg2) throws Exception {
        if (this.field6900 == 0 || this.field6896[arg0] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field6901 * 65536;
        if (this.field6893[arg0] == null || this.field6893[arg0].length != var4) {
            this.field6893[arg0] = new byte[var4];
            this.field6899[arg0].bufferBytes = var4;
        }
        this.field6896[arg0] = this.field6895.createSoundBuffer(this.field6899[arg0], this.field6892);
        this.field6894[arg0] = arg2;
        this.field6898[arg0] = 0;
        this.field6903[arg0] = arg1;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I[I)V")
    public final void method99(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field6897 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field6898[arg0] * this.field6901;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field6893[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field6893[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field6896[arg0].writeBuffer(var4, var3 * 2, this.field6893[arg0], 0);
        this.field6898[arg0] = var3 / this.field6897 + this.field6898[arg0] & 0xFFFF;
        if (!this.field6894[arg0]) {
            this.field6896[arg0].play(1);
            this.field6894[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(II)V")
    public final void method98(int arg0, int arg1) {
        this.field6896[arg1].stop();
        this.field6894[arg1] = false;
        this.field6896[arg1].setCurrentPosition(0);
        this.field6898[arg1] = 0;
        int var3 = -39 / ((59 - arg0) / 63);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)I")
    public final int method97(int arg0, int arg1) {
        if (!this.field6894[arg1]) {
            return 0;
        }
        this.field6896[arg1].getCurrentPosition(this.field6902[arg1]);
        int var3 = -77 / ((10 - arg0) / 39);
        int var4 = this.field6902[arg1].write / this.field6901;
        int var5 = this.field6898[arg1] - var4 & 0xFFFF;
        if (var5 > this.field6903[arg1]) {
            for (int var6 = var4 - this.field6898[arg1] & 0xFFFF; var6 > 0; var6 -= 256) {
                this.method99(arg1, this.field6904);
            }
            var5 = this.field6898[arg1] - var4 & 0xFFFF;
        }
        return var5;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IB)V")
    public final void method101(int arg0, byte arg1) {
        if (this.field6896[arg0] != null) {
            try {
                this.field6896[arg0].stop();
            } catch (ComFailException var4) {
            }
            this.field6896[arg0] = null;
        }
        int var3 = -86 % ((21 - arg1) / 47);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    public final void method100(int arg0, boolean arg1, Component arg2, int arg3) throws Exception {
        if (this.field6900 != 0) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field6901 = arg1 ? 4 : 2;
        this.field6897 = arg1 ? 2 : 1;
        this.field6904 = new int[this.field6897 * 256];
        this.field6895.initialize(null);
        this.field6895.setCooperativeLevel(arg2, 2);
        for (int var5 = arg0; var5 < 2; var5++) {
            this.field6899[var5].flags = 16384;
        }
        this.field6892.blockAlign = this.field6901;
        this.field6892.avgBytesPerSec = this.field6901 * arg3;
        this.field6892.bitsPerSample = 16;
        this.field6892.formatTag = 1;
        this.field6892.samplesPerSec = arg3;
        this.field6892.channels = this.field6897;
        this.field6900 = arg3;
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "()V")
    public class550() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field6899[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field6902[var2] = new DSCursors();
        }
    }
}
