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

@OriginalClass("client!kl")
public class class80 implements class157 {

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field1093 = new DSCursors[2];

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "[I")
    private int[] field1097 = new int[2];

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field1102 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "[Z")
    private boolean[] field1103 = new boolean[2];

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "[[B")
    private byte[][] field1104 = new byte[2][];

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field1101 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "[I")
    private int[] field1095 = new int[2];

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field1099 = new DirectSound();

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field1096 = new WaveFormatEx();

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    private int field1092;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    private int field1094;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    private int field1100;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "[I")
    private int[] field1098;

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V", line = 190)
    public class80() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field1101[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field1093[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZI)V", line = 8)
    public final void method596(int arg0, boolean arg1, int arg2) throws Exception {
        if (this.field1094 == 0 || this.field1102[arg2] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field1100 * 65536;
        if (this.field1104[arg2] == null || this.field1104[arg2].length != var4) {
            this.field1104[arg2] = new byte[var4];
            this.field1101[arg2].bufferBytes = var4;
        }
        this.field1102[arg2] = this.field1099.createSoundBuffer(this.field1101[arg2], this.field1096);
        this.field1103[arg2] = arg1;
        this.field1095[arg2] = 0;
        this.field1097[arg2] = arg0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V", line = 30)
    public final void method597(int arg0, int arg1) {
        if (arg0 < 84) {
            this.method598((byte) -82, -40);
        }
        if (this.field1102[arg1] == null) {
            return;
        }
        try {
            this.field1102[arg1].stop();
        } catch (ComFailException var3) {
        }
        this.field1102[arg1] = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)I", line = 50)
    public final int method598(byte arg0, int arg1) {
        if (!this.field1103[arg1]) {
            return 0;
        }
        this.field1102[arg1].getCurrentPosition(this.field1093[arg1]);
        int var3 = this.field1093[arg1].write / this.field1100;
        int var4 = -117 % ((arg0 - 60) / 57);
        int var5 = this.field1095[arg1] - var3 & 0xFFFF;
        if (this.field1097[arg1] < var5) {
            for (int var6 = var3 - this.field1095[arg1] & 0xFFFF; var6 > 0; var6 -= 256) {
                this.method599(arg1, this.field1098);
            }
            var5 = this.field1095[arg1] - var3 & 0xFFFF;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[I)V", line = 83)
    public final void method599(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field1092 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field1095[arg0] * this.field1100;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field1104[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field1104[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field1102[arg0].writeBuffer(var4, var3 * 2, this.field1104[arg0], 0);
        this.field1095[arg0] = var3 / this.field1092 + this.field1095[arg0] & 0xFFFF;
        if (!this.field1103[arg0]) {
            this.field1102[arg0].play(1);
            this.field1103[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZILjava/awt/Component;I)V", line = 114)
    public final void method600(boolean arg0, int arg1, Component arg2, int arg3) throws Exception {
        if (this.field1094 != 0) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field1100 = arg0 ? 4 : 2;
        this.field1092 = arg0 ? 2 : 1;
        this.field1098 = new int[this.field1092 * 256];
        this.field1099.initialize(null);
        this.field1099.setCooperativeLevel(arg2, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field1101[var5].flags = 16384;
        }
        this.field1096.bitsPerSample = 16;
        this.field1096.channels = this.field1092;
        this.field1096.formatTag = 1;
        int var6 = -61 % ((-arg1 - 53) / 61);
        this.field1096.avgBytesPerSec = this.field1100 * arg3;
        this.field1096.blockAlign = this.field1100;
        this.field1096.samplesPerSec = arg3;
        this.field1094 = arg3;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)V", line = 148)
    public final void method601(int arg0, byte arg1) {
        this.field1102[arg0].stop();
        this.field1103[arg0] = false;
        this.field1102[arg0].setCurrentPosition(0);
        this.field1095[arg0] = 0;
        if (arg1 >= -117) {
            this.field1099 = null;
        }
    }
}
