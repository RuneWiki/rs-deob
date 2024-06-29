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

@OriginalClass("client!rfa")
public class class526 implements class671 {

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field7426 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "[Z")
    private boolean[] field7425 = new boolean[2];

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "[I")
    private int[] field7432 = new int[2];

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "[[B")
    private byte[][] field7430 = new byte[2][];

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field7437 = new DSCursors[2];

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "[I")
    private int[] field7433 = new int[2];

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field7435 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field7434 = new DirectSound();

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field7431 = new WaveFormatEx();

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "I")
    private int field7427;

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
    private int field7428;

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "I")
    private int field7436;

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "[I")
    private int[] field7429;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[I)V")
    public final void method3014(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field7428 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field7432[arg0] * this.field7427;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field7430[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field7430[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field7435[arg0].writeBuffer(var4, var3 * 2, this.field7430[arg0], 0);
        this.field7432[arg0] = var3 / this.field7428 + this.field7432[arg0] & 0xFFFF;
        if (!this.field7425[arg0]) {
            this.field7435[arg0].play(1);
            this.field7425[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BI)V")
    public final void method3015(byte arg0, int arg1) {
        this.field7435[arg1].stop();
        if (arg0 != -69) {
            this.method3014(-97, null);
        }
        this.field7425[arg1] = false;
        this.field7435[arg1].setCurrentPosition(0);
        this.field7432[arg1] = 0;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    public final void method3016(boolean arg0, int arg1, int arg2, Component arg3) throws Exception {
        if (this.field7436 != 0) {
            return;
        }
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field7428 = arg0 ? 2 : 1;
        this.field7427 = arg0 ? 4 : 2;
        this.field7429 = new int[this.field7428 * 256];
        this.field7434.initialize(null);
        this.field7434.setCooperativeLevel(arg3, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field7426[var5].flags = 16384;
        }
        this.field7431.avgBytesPerSec = this.field7427 * arg1;
        this.field7431.blockAlign = this.field7427;
        this.field7431.channels = this.field7428;
        this.field7431.bitsPerSample = 16;
        this.field7431.formatTag = 1;
        this.field7431.samplesPerSec = arg1;
        if (arg2 <= 15) {
            this.method3015((byte) -70, 127);
        }
        this.field7436 = arg1;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)V")
    public final void method3017(int arg0, int arg1) {
        if (this.field7435[arg1] != null) {
            try {
                this.field7435[arg1].stop();
            } catch (ComFailException var3) {
            }
            this.field7435[arg1] = null;
        }
        if (arg0 < 35) {
            this.field7433 = null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(II)I")
    public final int method3018(int arg0, int arg1) {
        if (!this.field7425[arg1]) {
            return 0;
        }
        this.field7435[arg1].getCurrentPosition(this.field7437[arg1]);
        if (arg0 != 2) {
            this.method3018(72, -69);
        }
        int var3 = this.field7437[arg1].write / this.field7427;
        int var4 = this.field7432[arg1] - var3 & 0xFFFF;
        if (this.field7433[arg1] < var4) {
            for (int var5 = var3 - this.field7432[arg1] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method3014(arg1, this.field7429);
            }
            var4 = this.field7432[arg1] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(III)V")
    public final void method3019(int arg0, int arg1, int arg2) throws Exception {
        if (this.field7436 == 0 || this.field7435[arg1] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field7427 * 65536;
        if (this.field7430[arg1] == null || this.field7430[arg1].length != var4) {
            this.field7430[arg1] = new byte[var4];
            this.field7426[arg1].bufferBytes = var4;
        }
        if (arg0 != -30711) {
            this.field7430 = null;
        }
        this.field7435[arg1] = this.field7434.createSoundBuffer(this.field7426[arg1], this.field7431);
        this.field7425[arg1] = false;
        this.field7432[arg1] = 0;
        this.field7433[arg1] = arg2;
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V")
    public class526() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field7426[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field7437[var2] = new DSCursors();
        }
    }
}
