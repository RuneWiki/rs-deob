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

@OriginalClass("client!mo")
public class class685 implements class365 {

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "[I")
    private int[] field9633 = new int[2];

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field9632 = new DSCursors[2];

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field9631 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "[I")
    private int[] field9637 = new int[2];

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "[Z")
    private boolean[] field9640 = new boolean[2];

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "[[B")
    private byte[][] field9635 = new byte[2][];

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field9641 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field9630 = new DirectSound();

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field9636 = new WaveFormatEx();

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    private int field9634;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    private int field9639;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    private int field9642;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "[I")
    private int[] field9638;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)V")
    public final void method2137(int arg0, int arg1) {
        this.field9641[arg1].stop();
        this.field9640[arg1] = false;
        this.field9641[arg1].setCurrentPosition(arg0);
        this.field9633[arg1] = 0;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)I")
    public final int method2136(int arg0, int arg1) {
        if (!this.field9640[arg1]) {
            return 0;
        }
        this.field9641[arg1].getCurrentPosition(this.field9632[arg1]);
        int var3 = this.field9632[arg1].write / this.field9634;
        int var4 = this.field9633[arg1] - var3 & arg0;
        if (var4 > this.field9637[arg1]) {
            for (int var5 = var3 - this.field9633[arg1] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method2139(arg1, this.field9638);
            }
            var4 = this.field9633[arg1] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
    public final void method2134(int arg0, int arg1, Component arg2, boolean arg3) throws Exception {
        if (this.field9642 != 0) {
            return;
        }
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field9639 = arg3 ? 2 : 1;
        this.field9634 = arg3 ? 4 : 2;
        this.field9638 = new int[this.field9639 * 256];
        this.field9630.initialize(null);
        this.field9630.setCooperativeLevel(arg2, arg1);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field9631[var5].flags = 16384;
        }
        this.field9636.bitsPerSample = 16;
        this.field9636.blockAlign = this.field9634;
        this.field9636.avgBytesPerSec = this.field9634 * arg0;
        this.field9636.formatTag = 1;
        this.field9636.samplesPerSec = arg0;
        this.field9636.channels = this.field9639;
        this.field9642 = arg0;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I[I)V")
    public final void method2139(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field9639 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field9633[arg0] * this.field9634;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field9635[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field9635[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field9641[arg0].writeBuffer(var4, var3 * 2, this.field9635[arg0], 0);
        this.field9633[arg0] = var3 / this.field9639 + this.field9633[arg0] & 0xFFFF;
        if (!this.field9640[arg0]) {
            this.field9641[arg0].play(1);
            this.field9640[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BII)V")
    public final void method2135(byte arg0, int arg1, int arg2) throws Exception {
        if (this.field9642 == 0 || this.field9641[arg1] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field9634 * 65536;
        if (this.field9635[arg1] == null || this.field9635[arg1].length != var4) {
            this.field9635[arg1] = new byte[var4];
            this.field9631[arg1].bufferBytes = var4;
        }
        this.field9641[arg1] = this.field9630.createSoundBuffer(this.field9631[arg1], this.field9636);
        this.field9640[arg1] = false;
        if (arg0 <= 58) {
            this.method2136(87, 54);
        }
        this.field9633[arg1] = 0;
        this.field9637[arg1] = arg2;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)V")
    public final void method2138(int arg0, boolean arg1) {
        if (arg1 || this.field9641[arg0] == null) {
            return;
        }
        try {
            this.field9641[arg0].stop();
        } catch (ComFailException var3) {
        }
        this.field9641[arg0] = null;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
    public class685() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field9631[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field9632[var2] = new DSCursors();
        }
    }
}
