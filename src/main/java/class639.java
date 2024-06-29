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

@OriginalClass("client!jm")
public class class639 implements class392 {

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "[[B")
    private byte[][] field9139 = new byte[2][];

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field9137 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "[I")
    private int[] field9142 = new int[2];

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "[Z")
    private boolean[] field9143 = new boolean[2];

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field9144 = new DSCursors[2];

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field9140 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "[I")
    private int[] field9147 = new int[2];

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field9146 = new DirectSound();

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field9136 = new WaveFormatEx();

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    private int field9135;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    private int field9138;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    private int field9145;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "[I")
    private int[] field9141;

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V", line = 161)
    public class639() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field9137[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field9144[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)I", line = 13)
    public final int method2294(int arg0, int arg1) {
        if (!this.field9143[arg1]) {
            return 0;
        }
        this.field9140[arg1].getCurrentPosition(this.field9144[arg1]);
        int var3 = this.field9144[arg1].write / this.field9135;
        int var4 = this.field9147[arg1] - var3 & 0xFFFF;
        if (var4 > this.field9142[arg1]) {
            for (int var5 = var3 - this.field9147[arg1] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method2295(arg1, this.field9141);
            }
            var4 = this.field9147[arg1] - var3 & 0xFFFF;
        }
        return arg0 == 16486 ? var4 : 68;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(II)V", line = 58)
    public final void method2296(int arg0, int arg1) {
        if (arg1 != -22376 || this.field9140[arg0] == null) {
            return;
        }
        try {
            this.field9140[arg0].stop();
        } catch (ComFailException var3) {
        }
        this.field9140[arg0] = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZ)V", line = 80)
    public final void method2297(int arg0, boolean arg1) {
        this.field9140[arg0].stop();
        this.field9143[arg0] = arg1;
        this.field9140[arg0].setCurrentPosition(0);
        this.field9147[arg0] = 0;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZILjava/awt/Component;)V", line = 97)
    public final void method2299(int arg0, boolean arg1, int arg2, Component arg3) throws Exception {
        if (this.field9145 != 0) {
            return;
        }
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field9138 = arg1 ? 2 : 1;
        this.field9135 = arg1 ? 4 : 2;
        this.field9141 = new int[this.field9138 * 256];
        this.field9146.initialize(null);
        this.field9146.setCooperativeLevel(arg3, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field9137[var5].flags = 16384;
        }
        int var6 = 14 / ((51 - arg2) / 54);
        this.field9136.formatTag = 1;
        this.field9136.bitsPerSample = 16;
        this.field9145 = arg0;
        this.field9136.samplesPerSec = arg0;
        this.field9136.blockAlign = this.field9135;
        this.field9136.channels = this.field9138;
        this.field9136.avgBytesPerSec = this.field9135 * arg0;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)V", line = 130)
    public final void method2298(int arg0, int arg1, int arg2) throws Exception {
        if (this.field9145 == 0 || this.field9140[arg2] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field9135 * 65536;
        int var5 = -111 / ((-arg1 - 2) / 33);
        if (this.field9139[arg2] == null || this.field9139[arg2].length != var4) {
            this.field9139[arg2] = new byte[var4];
            this.field9137[arg2].bufferBytes = var4;
        }
        this.field9140[arg2] = this.field9146.createSoundBuffer(this.field9137[arg2], this.field9136);
        this.field9143[arg2] = false;
        this.field9147[arg2] = 0;
        this.field9142[arg2] = arg0;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[I)V", line = 185)
    public final void method2295(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field9138 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field9147[arg0] * this.field9135;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field9139[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field9139[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field9140[arg0].writeBuffer(var4, var3 * 2, this.field9139[arg0], 0);
        this.field9147[arg0] = var3 / this.field9138 + this.field9147[arg0] & 0xFFFF;
        if (!this.field9143[arg0]) {
            this.field9140[arg0].play(1);
            this.field9143[arg0] = true;
        }
    }
}
