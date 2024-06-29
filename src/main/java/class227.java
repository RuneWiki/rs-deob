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

@OriginalClass("client!ui")
public class class227 implements class751 {

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "[[B")
    private byte[][] field3244 = new byte[2][];

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field3243 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field3242 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "[I")
    private int[] field3241 = new int[2];

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "[Z")
    private boolean[] field3246 = new boolean[2];

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "[I")
    private int[] field3248 = new int[2];

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field3250 = new DSCursors[2];

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field3238 = new DirectSound();

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field3245 = new WaveFormatEx();

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    private int field3239;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    private int field3247;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    private int field3249;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "[I")
    private int[] field3240;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
    public final void method1561(int arg0, int arg1, int arg2) throws Exception {
        if (this.field3239 == 0 || this.field3243[arg0] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field3249 * 65536;
        if (this.field3244[arg0] == null || this.field3244[arg0].length != var4) {
            this.field3244[arg0] = new byte[var4];
            this.field3242[arg0].bufferBytes = var4;
        }
        this.field3243[arg0] = this.field3238.createSoundBuffer(this.field3242[arg0], this.field3245);
        this.field3246[arg0] = false;
        if (arg1 == -22684) {
            this.field3248[arg0] = 0;
            this.field3241[arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V")
    public final void method1562(boolean arg0, int arg1) {
        this.field3243[arg1].stop();
        this.field3246[arg1] = false;
        if (!arg0) {
            this.field3250 = null;
        }
        this.field3243[arg1].setCurrentPosition(0);
        this.field3248[arg1] = 0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLjava/awt/Component;IZ)V")
    public final void method1563(byte arg0, Component arg1, int arg2, boolean arg3) throws Exception {
        if (arg0 != 81) {
            this.method1562(true, 85);
        }
        if (this.field3239 != 0) {
            return;
        }
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field3249 = arg3 ? 4 : 2;
        this.field3247 = arg3 ? 2 : 1;
        this.field3240 = new int[this.field3247 * 256];
        this.field3238.initialize(null);
        this.field3238.setCooperativeLevel(arg1, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field3242[var5].flags = 16384;
        }
        this.field3245.samplesPerSec = arg2;
        this.field3245.avgBytesPerSec = this.field3249 * arg2;
        this.field3245.formatTag = 1;
        this.field3245.blockAlign = this.field3249;
        this.field3245.channels = this.field3247;
        this.field3239 = arg2;
        this.field3245.bitsPerSample = 16;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[I)V")
    public final void method1564(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field3247 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field3248[arg0] * this.field3249;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field3244[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field3244[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field3243[arg0].writeBuffer(var4, var3 * 2, this.field3244[arg0], 0);
        this.field3248[arg0] = var3 / this.field3247 + this.field3248[arg0] & 0xFFFF;
        if (!this.field3246[arg0]) {
            this.field3243[arg0].play(1);
            this.field3246[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
    public final void method1565(int arg0, int arg1) {
        if (this.field3243[arg0] != null) {
            try {
                this.field3243[arg0].stop();
            } catch (ComFailException var4) {
            }
            this.field3243[arg0] = null;
        }
        int var3 = -124 / ((arg1 - 28) / 40);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)I")
    public final int method1566(int arg0, boolean arg1) {
        if (!this.field3246[arg0]) {
            return 0;
        }
        this.field3243[arg0].getCurrentPosition(this.field3250[arg0]);
        int var3 = this.field3250[arg0].write / this.field3249;
        int var4 = this.field3248[arg0] - var3 & 0xFFFF;
        if (var4 > this.field3241[arg0]) {
            int var5 = var3 - this.field3248[arg0] & 0xFFFF;
            while (var5 > 0) {
                var5 -= 256;
                this.method1564(arg0, this.field3240);
            }
            var4 = this.field3248[arg0] - var3 & 0xFFFF;
        }
        if (arg1) {
            this.field3247 = 0;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class227() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field3242[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field3250[var2] = new DSCursors();
        }
    }
}
