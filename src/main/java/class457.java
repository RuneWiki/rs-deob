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

@OriginalClass("client!rba")
public class class457 implements class166 {

    @OriginalMember(owner = "client!rba", name = "k", descriptor = "[Z")
    private boolean[] field6452 = new boolean[2];

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "[I")
    private int[] field6444 = new int[2];

    @OriginalMember(owner = "client!rba", name = "h", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field6449 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!rba", name = "i", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field6450 = new DSCursors[2];

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "[[B")
    private byte[][] field6445 = new byte[2][];

    @OriginalMember(owner = "client!rba", name = "m", descriptor = "[I")
    private int[] field6454 = new int[2];

    @OriginalMember(owner = "client!rba", name = "l", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field6453 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field6447 = new DirectSound();

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field6442 = new WaveFormatEx();

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
    private int field6443;

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "I")
    private int field6448;

    @OriginalMember(owner = "client!rba", name = "j", descriptor = "I")
    private int field6451;

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "[I")
    private int[] field6446;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(III)V")
    public final void method1156(int arg0, int arg1, int arg2) throws Exception {
        if (this.field6451 == 0 || this.field6449[arg1] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field6448 * arg0;
        if (this.field6445[arg1] == null || this.field6445[arg1].length != var4) {
            this.field6445[arg1] = new byte[var4];
            this.field6453[arg1].bufferBytes = var4;
        }
        this.field6449[arg1] = this.field6447.createSoundBuffer(this.field6453[arg1], this.field6442);
        this.field6452[arg1] = false;
        this.field6454[arg1] = 0;
        this.field6444[arg1] = arg2;
    }

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "(II)I")
    public final int method1158(int arg0, int arg1) {
        if (arg0 >= -119) {
            this.method1158(67, 69);
        }
        if (!this.field6452[arg1]) {
            return 0;
        }
        this.field6449[arg1].getCurrentPosition(this.field6450[arg1]);
        int var3 = this.field6450[arg1].write / this.field6448;
        int var4 = this.field6454[arg1] - var3 & 0xFFFF;
        if (var4 > this.field6444[arg1]) {
            int var5 = var3 - this.field6454[arg1] & 0xFFFF;
            while (var5 > 0) {
                var5 -= 256;
                this.method1157(arg1, this.field6446);
            }
            var4 = this.field6454[arg1] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(II)V")
    public final void method1155(int arg0, int arg1) {
        if (this.field6449[arg1] != null) {
            try {
                this.field6449[arg1].stop();
            } catch (ComFailException var3) {
            }
            this.field6449[arg1] = null;
        }
        if (arg0 > -73) {
            this.field6454 = null;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
    public final void method1153(boolean arg0, Component arg1, int arg2, int arg3) throws Exception {
        if (this.field6451 != 0) {
            return;
        }
        if (arg2 > -49) {
            this.field6449 = null;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field6443 = arg0 ? 2 : 1;
        this.field6448 = arg0 ? 4 : 2;
        this.field6446 = new int[this.field6443 * 256];
        this.field6447.initialize(null);
        this.field6447.setCooperativeLevel(arg1, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field6453[var5].flags = 16384;
        }
        this.field6442.formatTag = 1;
        this.field6442.bitsPerSample = 16;
        this.field6442.samplesPerSec = arg3;
        this.field6442.channels = this.field6443;
        this.field6442.blockAlign = this.field6448;
        this.field6451 = arg3;
        this.field6442.avgBytesPerSec = this.field6448 * arg3;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I[I)V")
    public final void method1157(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field6443 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field6454[arg0] * this.field6448;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field6445[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field6445[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field6449[arg0].writeBuffer(var4, var3 * 2, this.field6445[arg0], 0);
        this.field6454[arg0] = var3 / this.field6443 + this.field6454[arg0] & 0xFFFF;
        if (!this.field6452[arg0]) {
            this.field6449[arg0].play(1);
            this.field6452[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(II)V")
    public final void method1154(int arg0, int arg1) {
        this.field6449[arg0].stop();
        this.field6452[arg0] = false;
        this.field6449[arg0].setCurrentPosition(0);
        this.field6454[arg0] = arg1;
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "()V")
    public class457() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field6453[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field6450[var2] = new DSCursors();
        }
    }
}
