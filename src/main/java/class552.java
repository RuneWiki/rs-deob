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

@OriginalClass("client!lh")
public class class552 implements class703 {

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "[[B")
    private byte[][] field8217 = new byte[2][];

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "[Z")
    private boolean[] field8216 = new boolean[2];

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "[I")
    private int[] field8219 = new int[2];

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field8224 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field8225 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "[I")
    private int[] field8221 = new int[2];

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field8226 = new DSCursors[2];

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field8222 = new DirectSound();

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field8223 = new WaveFormatEx();

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    private int field8215;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    private int field8220;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    private int field8227;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "[I")
    private int[] field8218;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
    public final void method4153(int arg0, int arg1) {
        if (this.field8224[arg1] != null) {
            try {
                this.field8224[arg1].stop();
            } catch (ComFailException var4) {
            }
            this.field8224[arg1] = null;
        }
        int var3 = 7 / ((arg0 - 45) / 38);
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)I")
    public final int method4154(int arg0, int arg1) {
        if (!this.field8216[arg0]) {
            return 0;
        }
        if (arg1 != 1) {
            this.method4158(115, null);
        }
        this.field8224[arg0].getCurrentPosition(this.field8226[arg0]);
        int var3 = this.field8226[arg0].write / this.field8220;
        int var4 = this.field8219[arg0] - var3 & 0xFFFF;
        if (this.field8221[arg0] < var4) {
            for (int var5 = var3 - this.field8219[arg0] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method4158(arg0, this.field8218);
            }
            var4 = this.field8219[arg0] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    public final void method4155(int arg0, int arg1, boolean arg2, Component arg3) throws Exception {
        if (this.field8227 != 0) {
            return;
        }
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field8215 = arg2 ? 2 : 1;
        this.field8220 = arg2 ? 4 : 2;
        this.field8218 = new int[this.field8215 * 256];
        this.field8222.initialize(null);
        this.field8222.setCooperativeLevel(arg3, 2);
        if (arg0 > -95) {
            this.field8225 = null;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            this.field8225[var5].flags = 16384;
        }
        this.field8223.bitsPerSample = 16;
        this.field8223.blockAlign = this.field8220;
        this.field8223.samplesPerSec = arg1;
        this.field8223.avgBytesPerSec = this.field8220 * arg1;
        this.field8227 = arg1;
        this.field8223.channels = this.field8215;
        this.field8223.formatTag = 1;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V")
    public final void method4156(int arg0, int arg1, int arg2) throws Exception {
        if (this.field8227 == 0 || this.field8224[arg1] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field8220 * 65536;
        if (this.field8217[arg1] == null || this.field8217[arg1].length != var4) {
            this.field8217[arg1] = new byte[var4];
            this.field8225[arg1].bufferBytes = var4;
        }
        this.field8224[arg1] = this.field8222.createSoundBuffer(this.field8225[arg1], this.field8223);
        if (arg0 == 7916) {
            this.field8216[arg1] = false;
            this.field8219[arg1] = 0;
            this.field8221[arg1] = arg2;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)V")
    public final void method4157(int arg0, int arg1) {
        this.field8224[arg0].stop();
        this.field8216[arg0] = false;
        this.field8224[arg0].setCurrentPosition(0);
        this.field8219[arg0] = 0;
        if (arg1 != 12699) {
            this.field8223 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[I)V")
    public final void method4158(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field8215 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field8219[arg0] * this.field8220;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field8217[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field8217[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field8224[arg0].writeBuffer(var4, var3 * 2, this.field8217[arg0], 0);
        this.field8219[arg0] = var3 / this.field8215 + this.field8219[arg0] & 0xFFFF;
        if (!this.field8216[arg0]) {
            this.field8224[arg0].play(1);
            this.field8216[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class552() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field8225[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field8226[var2] = new DSCursors();
        }
    }
}
