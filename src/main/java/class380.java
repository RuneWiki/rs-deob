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

@OriginalClass("client!fr")
public class class380 implements class191 {

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field5618 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "[[B")
    private byte[][] field5619 = new byte[2][];

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field5625 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "[Z")
    private boolean[] field5622 = new boolean[2];

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "[I")
    private int[] field5623 = new int[2];

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field5630 = new DSCursors[2];

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "[I")
    private int[] field5624 = new int[2];

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field5626 = new DirectSound();

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field5627 = new WaveFormatEx();

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    private int field5621;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    private int field5628;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
    private int field5629;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "[I")
    private int[] field5620;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)V")
    public final void method1388(int arg0, int arg1) {
        if (this.field5625[arg1] != null) {
            try {
                this.field5625[arg1].stop();
            } catch (ComFailException var4) {
            }
            this.field5625[arg1] = null;
        }
        int var3 = 13 % ((26 - arg0) / 41);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I[I)V")
    public final void method1387(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field5621 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field5623[arg0] * this.field5628;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field5619[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field5619[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field5625[arg0].writeBuffer(var4, var3 * 2, this.field5619[arg0], 0);
        this.field5623[arg0] = var3 / this.field5621 + this.field5623[arg0] & 0xFFFF;
        if (!this.field5622[arg0]) {
            this.field5625[arg0].play(1);
            this.field5622[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
    public final void method1384(boolean arg0, Component arg1, int arg2, int arg3) throws Exception {
        if (this.field5629 != 0) {
            return;
        }
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field5621 = arg0 ? 2 : 1;
        this.field5628 = arg0 ? 4 : 2;
        this.field5620 = new int[this.field5621 * 256];
        this.field5626.initialize(null);
        this.field5626.setCooperativeLevel(arg1, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field5618[var5].flags = 16384;
        }
        if (arg3 <= 38) {
            this.field5621 = 81;
        }
        this.field5629 = arg2;
        this.field5627.formatTag = 1;
        this.field5627.blockAlign = this.field5628;
        this.field5627.bitsPerSample = 16;
        this.field5627.samplesPerSec = arg2;
        this.field5627.avgBytesPerSec = this.field5628 * arg2;
        this.field5627.channels = this.field5621;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
    public final void method1386(int arg0, int arg1) {
        this.field5625[arg1].stop();
        this.field5622[arg1] = false;
        this.field5625[arg1].setCurrentPosition(0);
        if (arg0 > -106) {
            this.field5630 = null;
        }
        this.field5623[arg1] = 0;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IB)I")
    public final int method1383(int arg0, byte arg1) {
        if (arg1 <= 66) {
            this.field5620 = null;
        }
        if (!this.field5622[arg0]) {
            return 0;
        }
        this.field5625[arg0].getCurrentPosition(this.field5630[arg0]);
        int var3 = this.field5630[arg0].write / this.field5628;
        int var4 = this.field5623[arg0] - var3 & 0xFFFF;
        if (var4 > this.field5624[arg0]) {
            for (int var5 = var3 - this.field5623[arg0] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method1387(arg0, this.field5620);
            }
            var4 = this.field5623[arg0] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)V")
    public final void method1385(int arg0, int arg1, int arg2) throws Exception {
        if (this.field5629 == 0 || this.field5625[arg1] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field5628 * 65536;
        if (this.field5619[arg1] == null || this.field5619[arg1].length != var4) {
            this.field5619[arg1] = new byte[var4];
            this.field5618[arg1].bufferBytes = var4;
        }
        this.field5625[arg1] = this.field5626.createSoundBuffer(this.field5618[arg1], this.field5627);
        if (arg0 < 73) {
            this.field5618 = null;
        }
        this.field5622[arg1] = false;
        this.field5623[arg1] = 0;
        this.field5624[arg1] = arg2;
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
    public class380() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field5618[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field5630[var2] = new DSCursors();
        }
    }
}
