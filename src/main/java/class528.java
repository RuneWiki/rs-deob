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

@OriginalClass("client!hh")
public class class528 implements class179 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
    private int[] field7588 = new int[2];

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field7589 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "[I")
    private int[] field7592 = new int[2];

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "[[B")
    private byte[][] field7596 = new byte[2][];

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field7597 = new DSCursors[2];

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field7594 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "[Z")
    private boolean[] field7599 = new boolean[2];

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field7598 = new DirectSound();

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field7593 = new WaveFormatEx();

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    private int field7591;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    private int field7595;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    private int field7600;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "[I")
    private int[] field7590;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLjava/awt/Component;ZI)V")
    public final void method1389(byte arg0, Component arg1, boolean arg2, int arg3) throws Exception {
        if (this.field7595 != 0) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field7600 = arg2 ? 2 : 1;
        this.field7591 = arg2 ? 4 : 2;
        this.field7590 = new int[this.field7600 * 256];
        this.field7598.initialize(null);
        this.field7598.setCooperativeLevel(arg1, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field7594[var5].flags = 16384;
        }
        if (arg0 != -120) {
            this.method1392((byte) 52, -58);
        }
        this.field7593.samplesPerSec = arg3;
        this.field7593.blockAlign = this.field7591;
        this.field7593.avgBytesPerSec = this.field7591 * arg3;
        this.field7593.channels = this.field7600;
        this.field7593.formatTag = 1;
        this.field7593.bitsPerSample = 16;
        this.field7595 = arg3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[I)V")
    public final void method1390(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field7600 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field7588[arg0] * this.field7591;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field7596[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field7596[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field7589[arg0].writeBuffer(var4, var3 * 2, this.field7596[arg0], 0);
        this.field7588[arg0] = var3 / this.field7600 + this.field7588[arg0] & 0xFFFF;
        if (!this.field7599[arg0]) {
            this.field7589[arg0].play(1);
            this.field7599[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
    public final void method1388(int arg0, boolean arg1) {
        this.field7589[arg0].stop();
        this.field7599[arg0] = arg1;
        this.field7589[arg0].setCurrentPosition(0);
        this.field7588[arg0] = 0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZI)V")
    public final void method1391(int arg0, boolean arg1, int arg2) throws Exception {
        if (this.field7595 == 0 || this.field7589[arg2] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field7591 * 65536;
        if (this.field7596[arg2] == null || this.field7596[arg2].length != var4) {
            this.field7596[arg2] = new byte[var4];
            this.field7594[arg2].bufferBytes = var4;
        }
        this.field7589[arg2] = this.field7598.createSoundBuffer(this.field7594[arg2], this.field7593);
        this.field7599[arg2] = arg1;
        this.field7588[arg2] = 0;
        this.field7592[arg2] = arg0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)I")
    public final int method1392(byte arg0, int arg1) {
        if (!this.field7599[arg1]) {
            return 0;
        }
        this.field7589[arg1].getCurrentPosition(this.field7597[arg1]);
        int var3 = this.field7597[arg1].write / this.field7591;
        if (arg0 <= 86) {
            return -39;
        }
        int var4 = this.field7588[arg1] - var3 & 0xFFFF;
        if (var4 > this.field7592[arg1]) {
            for (int var5 = var3 - this.field7588[arg1] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method1390(arg1, this.field7590);
            }
            var4 = this.field7588[arg1] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
    public final void method1387(int arg0, int arg1) {
        if (arg0 != 31) {
            this.field7590 = null;
        }
        if (this.field7589[arg1] == null) {
            return;
        }
        try {
            this.field7589[arg1].stop();
        } catch (ComFailException var3) {
        }
        this.field7589[arg1] = null;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class528() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field7594[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field7597[var2] = new DSCursors();
        }
    }
}
