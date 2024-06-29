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

@OriginalClass("client!mda")
public class class240 implements class146 {

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "[Z")
    private boolean[] field3290 = new boolean[2];

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "[I")
    private int[] field3288 = new int[2];

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "[I")
    private int[] field3291 = new int[2];

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field3287 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field3286 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "[[B")
    private byte[][] field3295 = new byte[2][];

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field3289 = new DSCursors[2];

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field3292 = new DirectSound();

    @OriginalMember(owner = "client!mda", name = "l", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field3297 = new WaveFormatEx();

    @OriginalMember(owner = "client!mda", name = "h", descriptor = "I")
    private int field3293;

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "I")
    private int field3296;

    @OriginalMember(owner = "client!mda", name = "m", descriptor = "I")
    private int field3298;

    @OriginalMember(owner = "client!mda", name = "i", descriptor = "[I")
    private int[] field3294;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I[I)V")
    public final void method1020(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field3298 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field3291[arg0] * this.field3296;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field3295[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field3295[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field3287[arg0].writeBuffer(var4, var3 * 2, this.field3295[arg0], 0);
        this.field3291[arg0] = var3 / this.field3298 + this.field3291[arg0] & 0xFFFF;
        if (!this.field3290[arg0]) {
            this.field3287[arg0].play(1);
            this.field3290[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
    public final void method1017(Component arg0, boolean arg1, int arg2, int arg3) throws Exception {
        if (this.field3293 != 0) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field3298 = arg1 ? 2 : 1;
        this.field3296 = arg1 ? 4 : 2;
        if (arg2 != 14204) {
            this.field3292 = null;
        }
        this.field3294 = new int[this.field3298 * 256];
        this.field3292.initialize(null);
        this.field3292.setCooperativeLevel(arg0, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field3286[var5].flags = 16384;
        }
        this.field3297.avgBytesPerSec = this.field3296 * arg3;
        this.field3297.bitsPerSample = 16;
        this.field3297.formatTag = 1;
        this.field3297.blockAlign = this.field3296;
        this.field3293 = arg3;
        this.field3297.samplesPerSec = arg3;
        this.field3297.channels = this.field3298;
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(II)I")
    public final int method1019(int arg0, int arg1) {
        if (!this.field3290[arg0]) {
            return 0;
        }
        this.field3287[arg0].getCurrentPosition(this.field3289[arg0]);
        int var3 = this.field3289[arg0].write / this.field3296;
        int var4 = this.field3291[arg0] - var3 & arg1;
        if (this.field3288[arg0] < var4) {
            for (int var5 = var3 - this.field3291[arg0] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method1020(arg0, this.field3294);
            }
            var4 = this.field3291[arg0] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(BI)V")
    public final void method1018(byte arg0, int arg1) {
        if (this.field3287[arg1] != null) {
            try {
                this.field3287[arg1].stop();
            } catch (ComFailException var3) {
            }
            this.field3287[arg1] = null;
        }
        if (arg0 != -79) {
            this.field3288 = null;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(II)V")
    public final void method1016(int arg0, int arg1) {
        this.field3287[arg0].stop();
        this.field3290[arg0] = false;
        this.field3287[arg0].setCurrentPosition(arg1);
        this.field3291[arg0] = 0;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IZI)V")
    public final void method1015(int arg0, boolean arg1, int arg2) throws Exception {
        if (this.field3293 == 0 || this.field3287[arg0] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field3296 * 65536;
        if (this.field3295[arg0] == null || this.field3295[arg0].length != var4) {
            this.field3295[arg0] = new byte[var4];
            this.field3286[arg0].bufferBytes = var4;
        }
        this.field3287[arg0] = this.field3292.createSoundBuffer(this.field3286[arg0], this.field3297);
        this.field3290[arg0] = arg1;
        this.field3291[arg0] = 0;
        this.field3288[arg0] = arg2;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "()V")
    public class240() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field3286[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field3289[var2] = new DSCursors();
        }
    }
}
