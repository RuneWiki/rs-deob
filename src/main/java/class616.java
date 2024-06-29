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

@OriginalClass("client!nu")
public class class616 implements class107 {

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "[Z")
    private boolean[] field8686 = new boolean[2];

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "[I")
    private int[] field8688 = new int[2];

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field8689 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field8690 = new DSCursors[2];

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "[I")
    private int[] field8694 = new int[2];

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "[[B")
    private byte[][] field8691 = new byte[2][];

    @OriginalMember(owner = "client!nu", name = "j", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field8695 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field8687 = new DirectSound();

    @OriginalMember(owner = "client!nu", name = "l", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field8697 = new WaveFormatEx();

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "I")
    private int field8692;

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "I")
    private int field8693;

    @OriginalMember(owner = "client!nu", name = "m", descriptor = "I")
    private int field8698;

    @OriginalMember(owner = "client!nu", name = "k", descriptor = "[I")
    private int[] field8696;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IBI)V")
    public final void method723(int arg0, byte arg1, int arg2) throws Exception {
        if (this.field8698 == 0 || this.field8695[arg0] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field8692 * 65536;
        if (this.field8691[arg0] == null || this.field8691[arg0].length != var4) {
            this.field8691[arg0] = new byte[var4];
            this.field8689[arg0].bufferBytes = var4;
        }
        this.field8695[arg0] = this.field8687.createSoundBuffer(this.field8689[arg0], this.field8697);
        this.field8686[arg0] = false;
        this.field8688[arg0] = 0;
        if (arg1 >= -36) {
            this.field8691 = null;
        }
        this.field8694[arg0] = arg2;
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(II)V")
    public final void method725(int arg0, int arg1) {
        if (arg0 != 4729) {
            this.method720(57, null);
        }
        this.field8695[arg1].stop();
        this.field8686[arg1] = false;
        this.field8695[arg1].setCurrentPosition(0);
        this.field8688[arg1] = 0;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IB)I")
    public final int method722(int arg0, byte arg1) {
        if (!this.field8686[arg0]) {
            return 0;
        }
        int var3 = 1 % ((-arg1 - 32) / 38);
        this.field8695[arg0].getCurrentPosition(this.field8690[arg0]);
        int var4 = this.field8690[arg0].write / this.field8692;
        int var5 = this.field8688[arg0] - var4 & 0xFFFF;
        if (var5 > this.field8694[arg0]) {
            int var6 = var4 - this.field8688[arg0] & 0xFFFF;
            while (var6 > 0) {
                var6 -= 256;
                this.method720(arg0, this.field8696);
            }
            var5 = this.field8688[arg0] - var4 & 0xFFFF;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IZZLjava/awt/Component;)V")
    public final void method721(int arg0, boolean arg1, boolean arg2, Component arg3) throws Exception {
        if (arg2) {
            this.field8690 = null;
        }
        if (this.field8698 != 0) {
            return;
        }
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field8693 = arg1 ? 2 : 1;
        this.field8692 = arg1 ? 4 : 2;
        this.field8696 = new int[this.field8693 * 256];
        this.field8687.initialize(null);
        this.field8687.setCooperativeLevel(arg3, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field8689[var5].flags = 16384;
        }
        this.field8697.blockAlign = this.field8692;
        this.field8697.avgBytesPerSec = this.field8692 * arg0;
        this.field8697.samplesPerSec = arg0;
        this.field8697.formatTag = 1;
        this.field8697.bitsPerSample = 16;
        this.field8697.channels = this.field8693;
        this.field8698 = arg0;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I[I)V")
    public final void method720(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field8693 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field8688[arg0] * this.field8692;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field8691[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field8691[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field8695[arg0].writeBuffer(var4, var3 * 2, this.field8691[arg0], 0);
        this.field8688[arg0] = var3 / this.field8693 + this.field8688[arg0] & 0xFFFF;
        if (!this.field8686[arg0]) {
            this.field8695[arg0].play(1);
            this.field8686[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)V")
    public final void method724(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method724(75, -40);
        }
        if (this.field8695[arg1] == null) {
            return;
        }
        try {
            this.field8695[arg1].stop();
        } catch (ComFailException var3) {
        }
        this.field8695[arg1] = null;
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
    public class616() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field8689[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field8690[var2] = new DSCursors();
        }
    }
}
