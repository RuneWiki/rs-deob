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

@OriginalClass("client!ns")
public class class131 implements class642 {

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field1772 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field1774 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field1777 = new DSCursors[2];

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "[Z")
    private boolean[] field1780 = new boolean[2];

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "[I")
    private int[] field1778 = new int[2];

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "[I")
    private int[] field1775 = new int[2];

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "[[B")
    private byte[][] field1783 = new byte[2][];

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field1776 = new DirectSound();

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field1781 = new WaveFormatEx();

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    private int field1773;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    private int field1779;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    private int field1782;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "[I")
    private int[] field1771;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IB)V")
    public final void method831(int arg0, byte arg1) {
        int var3 = -46 / ((6 - arg1) / 36);
        if (this.field1772[arg0] == null) {
            return;
        }
        try {
            this.field1772[arg0].stop();
        } catch (ComFailException var4) {
        }
        this.field1772[arg0] = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)I")
    public final int method832(int arg0, int arg1) {
        if (!this.field1780[arg1]) {
            return 0;
        }
        this.field1772[arg1].getCurrentPosition(this.field1777[arg1]);
        int var3 = this.field1777[arg1].write / this.field1773;
        if (arg0 != -7072) {
            return 18;
        }
        int var4 = this.field1775[arg1] - var3 & 0xFFFF;
        if (this.field1778[arg1] < var4) {
            int var5 = var3 - this.field1775[arg1] & 0xFFFF;
            while (var5 > 0) {
                var5 -= 256;
                this.method834(arg1, this.field1771);
            }
            var4 = this.field1775[arg1] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
    public final void method833(int arg0, Component arg1, boolean arg2, int arg3) throws Exception {
        if (this.field1779 != 0) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field1773 = arg2 ? 4 : 2;
        this.field1782 = arg2 ? 2 : 1;
        if (arg0 > -53) {
            this.field1771 = null;
        }
        this.field1771 = new int[this.field1782 * 256];
        this.field1776.initialize(null);
        this.field1776.setCooperativeLevel(arg1, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field1774[var5].flags = 16384;
        }
        this.field1781.avgBytesPerSec = this.field1773 * arg3;
        this.field1781.channels = this.field1782;
        this.field1781.bitsPerSample = 16;
        this.field1779 = arg3;
        this.field1781.blockAlign = this.field1773;
        this.field1781.formatTag = 1;
        this.field1781.samplesPerSec = arg3;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I[I)V")
    public final void method834(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field1782 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field1775[arg0] * this.field1773;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field1783[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field1783[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field1772[arg0].writeBuffer(var4, var3 * 2, this.field1783[arg0], 0);
        this.field1775[arg0] = var3 / this.field1782 + this.field1775[arg0] & 0xFFFF;
        if (!this.field1780[arg0]) {
            this.field1772[arg0].play(1);
            this.field1780[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
    public class131() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field1774[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field1777[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)V")
    public final void method835(int arg0, int arg1) {
        this.field1772[arg1].stop();
        this.field1780[arg1] = false;
        this.field1772[arg1].setCurrentPosition(0);
        this.field1775[arg1] = arg0;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBI)V")
    public final void method836(int arg0, byte arg1, int arg2) throws Exception {
        if (this.field1779 == 0 || this.field1772[arg0] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field1773 * 65536;
        if (this.field1783[arg0] == null || this.field1783[arg0].length != var4) {
            this.field1783[arg0] = new byte[var4];
            this.field1774[arg0].bufferBytes = var4;
        }
        this.field1772[arg0] = this.field1776.createSoundBuffer(this.field1774[arg0], this.field1781);
        this.field1780[arg0] = false;
        if (arg1 != 110) {
            this.field1772 = null;
        }
        this.field1775[arg0] = 0;
        this.field1778[arg0] = arg2;
    }
}
