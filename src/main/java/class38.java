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

@OriginalClass("client!uja")
public class class38 implements class623 {

    @OriginalMember(owner = "client!uja", name = "b", descriptor = "[[B")
    private byte[][] field493 = new byte[2][];

    @OriginalMember(owner = "client!uja", name = "h", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field499 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!uja", name = "c", descriptor = "[Z")
    private boolean[] field494 = new boolean[2];

    @OriginalMember(owner = "client!uja", name = "k", descriptor = "[I")
    private int[] field502 = new int[2];

    @OriginalMember(owner = "client!uja", name = "g", descriptor = "[I")
    private int[] field498 = new int[2];

    @OriginalMember(owner = "client!uja", name = "j", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field501 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!uja", name = "e", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field496 = new DSCursors[2];

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field492 = new DirectSound();

    @OriginalMember(owner = "client!uja", name = "l", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field503 = new WaveFormatEx();

    @OriginalMember(owner = "client!uja", name = "d", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client!uja", name = "f", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client!uja", name = "i", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client!uja", name = "m", descriptor = "[I")
    private int[] field504;

    @OriginalMember(owner = "client!uja", name = "b", descriptor = "(II)V")
    public final void method291(int arg0, int arg1) {
        if (this.field499[arg0] != null) {
            try {
                this.field499[arg0].stop();
            } catch (ComFailException var3) {
            }
            this.field499[arg0] = null;
        }
        if (arg1 != 16384) {
            this.method293(5, 84);
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(IB)I")
    public final int method292(int arg0, byte arg1) {
        if (!this.field494[arg0]) {
            return 0;
        }
        this.field499[arg0].getCurrentPosition(this.field496[arg0]);
        int var3 = this.field496[arg0].write / this.field497;
        int var4 = this.field498[arg0] - var3 & 0xFFFF;
        if (arg1 >= -1) {
            this.method293(85, 36);
        }
        if (var4 > this.field502[arg0]) {
            for (int var5 = var3 - this.field498[arg0] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method295(arg0, this.field504);
            }
            var4 = this.field498[arg0] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(II)V")
    public final void method293(int arg0, int arg1) {
        this.field499[arg1].stop();
        this.field494[arg1] = false;
        if (arg0 < 59) {
            this.field501 = null;
        }
        this.field499[arg1].setCurrentPosition(0);
        this.field498[arg1] = 0;
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(Ljava/awt/Component;BIZ)V")
    public final void method294(Component arg0, byte arg1, int arg2, boolean arg3) throws Exception {
        if (this.field495 != 0) {
            return;
        }
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field500 = arg3 ? 2 : 1;
        this.field497 = arg3 ? 4 : 2;
        this.field504 = new int[this.field500 * 256];
        this.field492.initialize(null);
        this.field492.setCooperativeLevel(arg0, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field501[var5].flags = 16384;
        }
        this.field503.channels = this.field500;
        this.field503.avgBytesPerSec = this.field497 * arg2;
        this.field503.samplesPerSec = arg2;
        this.field503.bitsPerSample = 16;
        this.field503.blockAlign = this.field497;
        this.field495 = arg2;
        this.field503.formatTag = 1;
        if (arg1 > -40) {
            this.field498 = null;
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(I[I)V")
    public final void method295(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field500 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field498[arg0] * this.field497;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field493[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field493[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field499[arg0].writeBuffer(var4, var3 * 2, this.field493[arg0], 0);
        this.field498[arg0] = var3 / this.field500 + this.field498[arg0] & 0xFFFF;
        if (!this.field494[arg0]) {
            this.field499[arg0].play(1);
            this.field494[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(III)V")
    public final void method296(int arg0, int arg1, int arg2) throws Exception {
        if (this.field495 == 0 || this.field499[arg2] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field497 * 65536;
        if (this.field493[arg2] == null || this.field493[arg2].length != var4) {
            this.field493[arg2] = new byte[var4];
            this.field501[arg2].bufferBytes = var4;
        }
        this.field499[arg2] = this.field492.createSoundBuffer(this.field501[arg2], this.field503);
        this.field494[arg2] = false;
        int var5 = 68 / ((arg1 - 19) / 54);
        this.field498[arg2] = 0;
        this.field502[arg2] = arg0;
    }

    @OriginalMember(owner = "client!uja", name = "<init>", descriptor = "()V")
    public class38() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field501[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field496[var2] = new DSCursors();
        }
    }
}
