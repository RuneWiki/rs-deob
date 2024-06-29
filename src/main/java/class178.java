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

@OriginalClass("client!rt")
public class class178 implements class690 {

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field2298 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "[Z")
    private boolean[] field2299 = new boolean[2];

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "[I")
    private int[] field2303 = new int[2];

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "[I")
    private int[] field2301 = new int[2];

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field2308 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field2309 = new DSCursors[2];

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "[[B")
    private byte[][] field2304 = new byte[2][];

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field2305 = new DirectSound();

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field2310 = new WaveFormatEx();

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    private int field2302;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    private int field2306;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    private int field2307;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "[I")
    private int[] field2300;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(II)I")
    public final int method1123(int arg0, int arg1) {
        if (!this.field2299[arg1]) {
            return 0;
        }
        this.field2298[arg1].getCurrentPosition(this.field2309[arg1]);
        int var3 = this.field2309[arg1].write / this.field2302;
        if (arg0 <= 57) {
            return 16;
        }
        int var4 = this.field2303[arg1] - var3 & 0xFFFF;
        if (var4 > this.field2301[arg1]) {
            for (int var5 = var3 - this.field2303[arg1] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method1126(arg1, this.field2300);
            }
            var4 = this.field2303[arg1] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(II)V")
    public final void method1124(int arg0, int arg1) {
        this.field2298[arg0].stop();
        if (arg1 > 91) {
            this.field2299[arg0] = false;
            this.field2298[arg0].setCurrentPosition(0);
            this.field2303[arg0] = 0;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)V")
    public final void method1125(int arg0, int arg1) {
        if (arg0 > -118 || this.field2298[arg1] == null) {
            return;
        }
        try {
            this.field2298[arg1].stop();
        } catch (ComFailException var3) {
        }
        this.field2298[arg1] = null;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[I)V")
    public final void method1126(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field2307 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field2303[arg0] * this.field2302;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field2304[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field2304[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field2298[arg0].writeBuffer(var4, var3 * 2, this.field2304[arg0], 0);
        this.field2303[arg0] = var3 / this.field2307 + this.field2303[arg0] & 0xFFFF;
        if (!this.field2299[arg0]) {
            this.field2298[arg0].play(1);
            this.field2299[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZII)V")
    public final void method1127(boolean arg0, int arg1, int arg2) throws Exception {
        if (this.field2306 == 0 || this.field2298[arg2] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field2302 * 65536;
        if (this.field2304[arg2] == null || this.field2304[arg2].length != var4) {
            this.field2304[arg2] = new byte[var4];
            this.field2308[arg2].bufferBytes = var4;
        }
        this.field2298[arg2] = this.field2305.createSoundBuffer(this.field2308[arg2], this.field2310);
        this.field2299[arg2] = arg0;
        this.field2303[arg2] = 0;
        this.field2301[arg2] = arg1;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    public final void method1128(Component arg0, int arg1, boolean arg2, int arg3) throws Exception {
        if (~this.field2306 != arg3) {
            return;
        }
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field2307 = arg2 ? 2 : 1;
        this.field2302 = arg2 ? 4 : 2;
        this.field2300 = new int[this.field2307 * 256];
        this.field2305.initialize(null);
        this.field2305.setCooperativeLevel(arg0, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field2308[var5].flags = 16384;
        }
        this.field2306 = arg1;
        this.field2310.avgBytesPerSec = this.field2302 * arg1;
        this.field2310.channels = this.field2307;
        this.field2310.blockAlign = this.field2302;
        this.field2310.samplesPerSec = arg1;
        this.field2310.formatTag = 1;
        this.field2310.bitsPerSample = 16;
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "()V")
    public class178() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field2308[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field2309[var2] = new DSCursors();
        }
    }
}
