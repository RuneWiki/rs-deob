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

@OriginalClass("client!dg")
public class class435 implements class160 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "[Z")
    private boolean[] field6820 = new boolean[2];

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field6815 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "[I")
    private int[] field6825 = new int[2];

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "[I")
    private int[] field6822 = new int[2];

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field6826 = new DSCursors[2];

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field6827 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "[[B")
    private byte[][] field6824 = new byte[2][];

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field6823 = new DirectSound();

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field6818 = new WaveFormatEx();

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    private int field6816;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    private int field6819;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    private int field6821;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "[I")
    private int[] field6817;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[I)V")
    public final void method1509(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field6819 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field6825[arg0] * this.field6821;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field6824[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field6824[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field6827[arg0].writeBuffer(var4, var3 * 2, this.field6824[arg0], 0);
        this.field6825[arg0] = var3 / this.field6819 + this.field6825[arg0] & 0xFFFF;
        if (!this.field6820[arg0]) {
            this.field6827[arg0].play(1);
            this.field6820[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(IB)V")
    public final void method1511(int arg0, byte arg1) {
        this.field6827[arg0].stop();
        int var3 = -26 / ((39 - arg1) / 37);
        this.field6820[arg0] = false;
        this.field6827[arg0].setCurrentPosition(0);
        this.field6825[arg0] = 0;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
    public final int method1507(int arg0, int arg1) {
        if (!this.field6820[arg0]) {
            return 0;
        }
        this.field6827[arg0].getCurrentPosition(this.field6826[arg0]);
        int var3 = this.field6826[arg0].write / this.field6821;
        int var4 = this.field6825[arg0] - var3 & arg1;
        if (var4 > this.field6822[arg0]) {
            int var5 = var3 - this.field6825[arg0] & 0xFFFF;
            while (var5 > 0) {
                var5 -= 256;
                this.method1509(arg0, this.field6817);
            }
            var4 = this.field6825[arg0] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
    public final void method1510(int arg0, int arg1, int arg2) throws Exception {
        if (this.field6816 == 0 || this.field6827[arg1] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field6821 * 65536;
        if (this.field6824[arg1] == null || this.field6824[arg1].length != var4) {
            this.field6824[arg1] = new byte[var4];
            this.field6815[arg1].bufferBytes = var4;
        }
        this.field6827[arg1] = this.field6823.createSoundBuffer(this.field6815[arg1], this.field6818);
        this.field6820[arg1] = false;
        this.field6825[arg1] = arg0;
        this.field6822[arg1] = arg2;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
    public final void method1512(int arg0, Component arg1, boolean arg2, byte arg3) throws Exception {
        if (this.field6816 != 0) {
            return;
        }
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg3 != -67) {
            this.method1508(-122, (byte) -72);
        }
        this.field6819 = arg2 ? 2 : 1;
        this.field6821 = arg2 ? 4 : 2;
        this.field6817 = new int[this.field6819 * 256];
        this.field6823.initialize(null);
        this.field6823.setCooperativeLevel(arg1, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field6815[var5].flags = 16384;
        }
        this.field6818.blockAlign = this.field6821;
        this.field6818.avgBytesPerSec = this.field6821 * arg0;
        this.field6818.bitsPerSample = 16;
        this.field6816 = arg0;
        this.field6818.channels = this.field6819;
        this.field6818.formatTag = 1;
        this.field6818.samplesPerSec = arg0;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V")
    public final void method1508(int arg0, byte arg1) {
        if (arg1 <= 123) {
            this.method1511(36, (byte) 32);
        }
        if (this.field6827[arg0] == null) {
            return;
        }
        try {
            this.field6827[arg0].stop();
        } catch (ComFailException var3) {
        }
        this.field6827[arg0] = null;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class435() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field6815[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field6826[var2] = new DSCursors();
        }
    }
}
