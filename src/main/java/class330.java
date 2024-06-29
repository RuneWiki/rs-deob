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

@OriginalClass("client!gga")
public class class330 implements class459 {

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field4425 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!gga", name = "i", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field4433 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!gga", name = "j", descriptor = "[[B")
    private byte[][] field4434 = new byte[2][];

    @OriginalMember(owner = "client!gga", name = "g", descriptor = "[I")
    private int[] field4431 = new int[2];

    @OriginalMember(owner = "client!gga", name = "f", descriptor = "[Z")
    private boolean[] field4430 = new boolean[2];

    @OriginalMember(owner = "client!gga", name = "l", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field4436 = new DSCursors[2];

    @OriginalMember(owner = "client!gga", name = "m", descriptor = "[I")
    private int[] field4437 = new int[2];

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field4426 = new DirectSound();

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field4427 = new WaveFormatEx();

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "I")
    private int field4428;

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "I")
    private int field4429;

    @OriginalMember(owner = "client!gga", name = "h", descriptor = "I")
    private int field4432;

    @OriginalMember(owner = "client!gga", name = "k", descriptor = "[I")
    private int[] field4435;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(ZZLjava/awt/Component;I)V", line = 4)
    public final void method1916(boolean arg0, boolean arg1, Component arg2, int arg3) throws Exception {
        if (this.field4432 != 0) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field4428 = arg1 ? 2 : 1;
        this.field4429 = arg1 ? 4 : 2;
        this.field4435 = new int[this.field4428 * 256];
        this.field4426.initialize(null);
        this.field4426.setCooperativeLevel(arg2, 2);
        int var5 = 0;
        if (!arg0) {
            this.field4425 = null;
        }
        while (var5 < 2) {
            this.field4425[var5].flags = 16384;
            var5++;
        }
        this.field4427.formatTag = 1;
        this.field4427.avgBytesPerSec = this.field4429 * arg3;
        this.field4427.bitsPerSample = 16;
        this.field4427.channels = this.field4428;
        this.field4427.samplesPerSec = arg3;
        this.field4427.blockAlign = this.field4429;
        this.field4432 = arg3;
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "()V", line = 194)
    public class330() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field4425[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field4436[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(II)I", line = 43)
    public final int method1917(int arg0, int arg1) {
        if (!this.field4430[arg1]) {
            return 0;
        }
        this.field4433[arg1].getCurrentPosition(this.field4436[arg1]);
        int var3 = this.field4436[arg1].write / this.field4429;
        if (arg0 != 2) {
            this.method1917(112, 57);
        }
        int var4 = this.field4437[arg1] - var3 & 0xFFFF;
        if (var4 > this.field4431[arg1]) {
            int var5 = var3 - this.field4437[arg1] & 0xFFFF;
            while (var5 > 0) {
                var5 -= 256;
                this.method1918(arg1, this.field4435);
            }
            var4 = this.field4437[arg1] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I[I)V", line = 79)
    public final void method1918(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field4428 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field4437[arg0] * this.field4429;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field4434[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field4434[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field4433[arg0].writeBuffer(var4, var3 * 2, this.field4434[arg0], 0);
        this.field4437[arg0] = var3 / this.field4428 + this.field4437[arg0] & 0xFFFF;
        if (!this.field4430[arg0]) {
            this.field4433[arg0].play(1);
            this.field4430[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)V", line = 116)
    public final void method1919(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method1919(-120, -2);
        }
        if (this.field4433[arg1] == null) {
            return;
        }
        try {
            this.field4433[arg1].stop();
        } catch (ComFailException var3) {
        }
        this.field4433[arg1] = null;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(III)V", line = 141)
    public final void method1920(int arg0, int arg1, int arg2) throws Exception {
        if (this.field4432 == 0 || this.field4433[arg0] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field4429 * 65536;
        if (this.field4434[arg0] == null || this.field4434[arg0].length != var4) {
            this.field4434[arg0] = new byte[var4];
            this.field4425[arg0].bufferBytes = var4;
        }
        this.field4433[arg0] = this.field4426.createSoundBuffer(this.field4425[arg0], this.field4427);
        if (arg2 != 17656) {
            this.method1921(86, 126);
        }
        this.field4430[arg0] = false;
        this.field4437[arg0] = 0;
        this.field4431[arg0] = arg1;
    }

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "(II)V", line = 170)
    public final void method1921(int arg0, int arg1) {
        this.field4433[arg1].stop();
        this.field4430[arg1] = false;
        this.field4433[arg1].setCurrentPosition(0);
        this.field4437[arg1] = arg0;
    }
}
