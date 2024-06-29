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

@OriginalClass("client!df")
public class class400 implements class466 {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "[I")
    private int[] field5469 = new int[2];

    @OriginalMember(owner = "client!df", name = "a", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field5467 = new DSCursors[2];

    @OriginalMember(owner = "client!df", name = "f", descriptor = "[I")
    private int[] field5472 = new int[2];

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field5473 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!df", name = "i", descriptor = "[[B")
    private byte[][] field5475 = new byte[2][];

    @OriginalMember(owner = "client!df", name = "j", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field5476 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!df", name = "d", descriptor = "[Z")
    private boolean[] field5470 = new boolean[2];

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field5477 = new DirectSound();

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field5474 = new WaveFormatEx();

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    private int field5468;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    private int field5478;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    private int field5479;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[I")
    private int[] field5471;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
    public final void method2445(int arg0, int arg1, int arg2) throws Exception {
        if (this.field5468 == 0 || this.field5476[arg1] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field5478 * 65536;
        if (this.field5475[arg1] == null || this.field5475[arg1].length != var4) {
            this.field5475[arg1] = new byte[var4];
            this.field5473[arg1].bufferBytes = var4;
        }
        this.field5476[arg1] = this.field5477.createSoundBuffer(this.field5473[arg1], this.field5474);
        if (arg2 > 90) {
            this.field5470[arg1] = false;
            this.field5472[arg1] = 0;
            this.field5469[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[I)V")
    public final void method2446(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field5479 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field5472[arg0] * this.field5478;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field5475[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field5475[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field5476[arg0].writeBuffer(var4, var3 * 2, this.field5475[arg0], 0);
        this.field5472[arg0] = var3 / this.field5479 + this.field5472[arg0] & 0xFFFF;
        if (!this.field5470[arg0]) {
            this.field5476[arg0].play(1);
            this.field5470[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)V")
    public final void method2447(byte arg0, int arg1) {
        if (this.field5476[arg1] != null) {
            try {
                this.field5476[arg1].stop();
            } catch (ComFailException var3) {
            }
            this.field5476[arg1] = null;
        }
        if (arg0 >= -50) {
            this.method2446(113, null);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)I")
    public final int method2448(int arg0, int arg1) {
        if (!this.field5470[arg0]) {
            return 0;
        }
        this.field5476[arg0].getCurrentPosition(this.field5467[arg0]);
        int var3 = this.field5467[arg0].write / this.field5478;
        int var4 = this.field5472[arg0] - var3 & 0xFFFF;
        if (this.field5469[arg0] < var4) {
            for (int var5 = var3 - this.field5472[arg0] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method2446(arg0, this.field5471);
            }
            var4 = this.field5472[arg0] - var3 & 0xFFFF;
        }
        return arg1 == -2089 ? var4 : -123;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
    public final void method2449(int arg0, int arg1) {
        this.field5476[arg1].stop();
        this.field5470[arg1] = false;
        this.field5476[arg1].setCurrentPosition(0);
        this.field5472[arg1] = 0;
        if (arg0 <= 59) {
            this.field5478 = 40;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/awt/Component;BZ)V")
    public final void method2450(int arg0, Component arg1, byte arg2, boolean arg3) throws Exception {
        if (this.field5468 != 0) {
            return;
        }
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field5479 = arg3 ? 2 : 1;
        this.field5478 = arg3 ? 4 : 2;
        if (arg2 > -12) {
            this.field5471 = null;
        }
        this.field5471 = new int[this.field5479 * 256];
        this.field5477.initialize(null);
        this.field5477.setCooperativeLevel(arg1, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field5473[var5].flags = 16384;
        }
        this.field5474.formatTag = 1;
        this.field5474.avgBytesPerSec = this.field5478 * arg0;
        this.field5474.bitsPerSample = 16;
        this.field5474.samplesPerSec = arg0;
        this.field5468 = arg0;
        this.field5474.channels = this.field5479;
        this.field5474.blockAlign = this.field5478;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class400() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field5473[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field5467[var2] = new DSCursors();
        }
    }
}
