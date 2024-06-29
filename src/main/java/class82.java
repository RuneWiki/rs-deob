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

@OriginalClass("client!mq")
public class class82 implements class78 {

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field843 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "[I")
    private int[] field847 = new int[2];

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field846 = new DSCursors[2];

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field842 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "[I")
    private int[] field848 = new int[2];

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "[[B")
    private byte[][] field850 = new byte[2][];

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "[Z")
    private boolean[] field851 = new boolean[2];

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field844 = new DirectSound();

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field841 = new WaveFormatEx();

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    private int field840;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    private int field849;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    private int field852;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "[I")
    private int[] field845;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BI)V", line = 3)
    public final void method415(byte arg0, int arg1) {
        this.field842[arg1].stop();
        this.field851[arg1] = false;
        this.field842[arg1].setCurrentPosition(0);
        if (arg0 < 70) {
            this.method413(-50, null);
        }
        this.field847[arg1] = 0;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V", line = 194)
    public class82() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field843[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field846[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)I", line = 24)
    public final int method411(int arg0, int arg1) {
        if (!this.field851[arg0]) {
            return 0;
        }
        this.field842[arg0].getCurrentPosition(this.field846[arg0]);
        if (arg1 != 2) {
            return -57;
        }
        int var3 = this.field846[arg0].write / this.field852;
        int var4 = this.field847[arg0] - var3 & 0xFFFF;
        if (this.field848[arg0] < var4) {
            int var5 = var3 - this.field847[arg0] & 0xFFFF;
            while (var5 > 0) {
                var5 -= 256;
                this.method413(arg0, this.field845);
            }
            var4 = this.field847[arg0] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)V", line = 60)
    public final void method414(int arg0, int arg1, int arg2) throws Exception {
        if (this.field849 == 0 || this.field842[arg2] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field852 * arg0;
        if (this.field850[arg2] == null || this.field850[arg2].length != var4) {
            this.field850[arg2] = new byte[var4];
            this.field843[arg2].bufferBytes = var4;
        }
        this.field842[arg2] = this.field844.createSoundBuffer(this.field843[arg2], this.field841);
        this.field851[arg2] = false;
        this.field847[arg2] = 0;
        this.field848[arg2] = arg1;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)V", line = 86)
    public final void method416(int arg0, int arg1) {
        if (this.field842[arg0] != null) {
            try {
                this.field842[arg0].stop();
            } catch (ComFailException var3) {
            }
            this.field842[arg0] = null;
        }
        if (arg1 != 65535) {
            this.field841 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I[I)V", line = 107)
    public final void method413(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field840 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field847[arg0] * this.field852;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field850[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field850[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field842[arg0].writeBuffer(var4, var3 * 2, this.field850[arg0], 0);
        this.field847[arg0] = var3 / this.field840 + this.field847[arg0] & 0xFFFF;
        if (!this.field851[arg0]) {
            this.field842[arg0].play(1);
            this.field851[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/awt/Component;ZII)V", line = 150)
    public final void method412(Component arg0, boolean arg1, int arg2, int arg3) throws Exception {
        if (this.field849 != 0) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field840 = arg1 ? 2 : 1;
        this.field852 = arg1 ? 4 : 2;
        this.field845 = new int[this.field840 * 256];
        this.field844.initialize(null);
        this.field844.setCooperativeLevel(arg0, arg2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field843[var5].flags = 16384;
        }
        this.field849 = arg3;
        this.field841.samplesPerSec = arg3;
        this.field841.blockAlign = this.field852;
        this.field841.avgBytesPerSec = this.field852 * arg3;
        this.field841.bitsPerSample = 16;
        this.field841.formatTag = 1;
        this.field841.channels = this.field840;
    }
}
