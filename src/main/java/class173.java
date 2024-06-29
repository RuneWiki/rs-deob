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

@OriginalClass("client!pja")
public class class173 implements class238 {

    @OriginalMember(owner = "client!pja", name = "c", descriptor = "[[B")
    private byte[][] field2606 = new byte[2][];

    @OriginalMember(owner = "client!pja", name = "f", descriptor = "[I")
    private int[] field2609 = new int[2];

    @OriginalMember(owner = "client!pja", name = "k", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field2614 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!pja", name = "d", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field2607 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!pja", name = "l", descriptor = "[Z")
    private boolean[] field2615 = new boolean[2];

    @OriginalMember(owner = "client!pja", name = "h", descriptor = "[I")
    private int[] field2611 = new int[2];

    @OriginalMember(owner = "client!pja", name = "m", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field2616 = new DSCursors[2];

    @OriginalMember(owner = "client!pja", name = "e", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field2608 = new DirectSound();

    @OriginalMember(owner = "client!pja", name = "i", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field2612 = new WaveFormatEx();

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "I")
    private int field2604;

    @OriginalMember(owner = "client!pja", name = "b", descriptor = "I")
    private int field2605;

    @OriginalMember(owner = "client!pja", name = "j", descriptor = "I")
    private int field2613;

    @OriginalMember(owner = "client!pja", name = "g", descriptor = "[I")
    private int[] field2610;

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(III)V")
    public final void method1271(int arg0, int arg1, int arg2) throws Exception {
        if (this.field2613 == 0 || this.field2607[arg2] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field2604 * 65536;
        if (this.field2606[arg2] == null || this.field2606[arg2].length != var4) {
            this.field2606[arg2] = new byte[var4];
            this.field2614[arg2].bufferBytes = var4;
        }
        this.field2607[arg2] = this.field2608.createSoundBuffer(this.field2614[arg2], this.field2612);
        this.field2615[arg2] = false;
        if (arg1 >= -84) {
            this.field2615 = null;
        }
        this.field2611[arg2] = 0;
        this.field2609[arg2] = arg0;
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(I[I)V")
    public final void method1272(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field2605 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field2611[arg0] * this.field2604;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field2606[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field2606[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field2607[arg0].writeBuffer(var4, var3 * 2, this.field2606[arg0], 0);
        this.field2611[arg0] = var3 / this.field2605 + this.field2611[arg0] & 0xFFFF;
        if (!this.field2615[arg0]) {
            this.field2607[arg0].play(1);
            this.field2615[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(IB)I")
    public final int method1273(int arg0, byte arg1) {
        if (!this.field2615[arg0]) {
            return 0;
        }
        if (arg1 != 88) {
            this.field2607 = null;
        }
        this.field2607[arg0].getCurrentPosition(this.field2616[arg0]);
        int var3 = this.field2616[arg0].write / this.field2604;
        int var4 = this.field2611[arg0] - var3 & 0xFFFF;
        if (var4 > this.field2609[arg0]) {
            for (int var5 = var3 - this.field2611[arg0] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method1272(arg0, this.field2610);
            }
            var4 = this.field2611[arg0] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(II)V")
    public final void method1274(int arg0, int arg1) {
        if (arg0 <= -89) {
            this.field2607[arg1].stop();
            this.field2615[arg1] = false;
            this.field2607[arg1].setCurrentPosition(0);
            this.field2611[arg1] = 0;
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
    public final void method1275(int arg0, Component arg1, boolean arg2, byte arg3) throws Exception {
        if (this.field2613 != 0) {
            return;
        }
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field2605 = arg2 ? 2 : 1;
        this.field2604 = arg2 ? 4 : 2;
        this.field2610 = new int[this.field2605 * 256];
        if (arg3 != -128) {
            this.field2612 = null;
        }
        this.field2608.initialize(null);
        this.field2608.setCooperativeLevel(arg1, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field2614[var5].flags = 16384;
        }
        this.field2612.channels = this.field2605;
        this.field2612.formatTag = 1;
        this.field2612.blockAlign = this.field2604;
        this.field2612.bitsPerSample = 16;
        this.field2613 = arg0;
        this.field2612.samplesPerSec = arg0;
        this.field2612.avgBytesPerSec = this.field2604 * arg0;
    }

    @OriginalMember(owner = "client!pja", name = "b", descriptor = "(II)V")
    public final void method1276(int arg0, int arg1) {
        if (this.field2607[arg0] != null) {
            try {
                this.field2607[arg0].stop();
            } catch (ComFailException var3) {
            }
            this.field2607[arg0] = null;
        }
        if (arg1 != 16766) {
            this.method1274(0, 11);
        }
    }

    @OriginalMember(owner = "client!pja", name = "<init>", descriptor = "()V")
    public class173() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field2614[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field2616[var2] = new DSCursors();
        }
    }
}
