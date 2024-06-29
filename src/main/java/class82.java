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

@OriginalClass("client!gv")
public class class82 implements class292 {

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "[I")
    private int[] field1146 = new int[2];

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "[[B")
    private byte[][] field1150 = new byte[2][];

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field1154 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "[I")
    private int[] field1153 = new int[2];

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field1152 = new DSCursors[2];

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "[Z")
    private boolean[] field1157 = new boolean[2];

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field1148 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field1158 = new DirectSound();

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field1147 = new WaveFormatEx();

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    private int field1149;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    private int field1151;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
    private int field1155;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "[I")
    private int[] field1156;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I[I)V", line = 6)
    public final void method657(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field1155 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field1153[arg0] * this.field1151;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field1150[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field1150[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field1148[arg0].writeBuffer(var4, var3 * 2, this.field1150[arg0], 0);
        this.field1153[arg0] = var3 / this.field1155 + this.field1153[arg0] & 0xFFFF;
        if (!this.field1157[arg0]) {
            this.field1148[arg0].play(1);
            this.field1157[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "()V", line = 197)
    public class82() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field1154[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field1152[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BI)I", line = 48)
    public final int method658(byte arg0, int arg1) {
        if (!this.field1157[arg1]) {
            return 0;
        }
        this.field1148[arg1].getCurrentPosition(this.field1152[arg1]);
        int var3 = this.field1152[arg1].write / this.field1151;
        if (arg0 < 119) {
            this.method659(-113, 7);
        }
        int var4 = this.field1153[arg1] - var3 & 0xFFFF;
        if (this.field1146[arg1] < var4) {
            for (int var5 = var3 - this.field1153[arg1] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method657(arg1, this.field1156);
            }
            var4 = this.field1153[arg1] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V", line = 82)
    public final void method659(int arg0, int arg1) {
        if (this.field1148[arg1] != null) {
            try {
                this.field1148[arg1].stop();
            } catch (ComFailException var3) {
            }
            this.field1148[arg1] = null;
        }
        if (arg0 != 30546) {
            this.field1149 = -48;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)V", line = 110)
    public final void method660(int arg0, int arg1, int arg2) throws Exception {
        if (arg1 != -26857) {
            return;
        }
        if (this.field1149 == 0 || this.field1148[arg2] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field1151 * 65536;
        if (this.field1150[arg2] == null || this.field1150[arg2].length != var4) {
            this.field1150[arg2] = new byte[var4];
            this.field1154[arg2].bufferBytes = var4;
        }
        this.field1148[arg2] = this.field1158.createSoundBuffer(this.field1154[arg2], this.field1147);
        this.field1157[arg2] = false;
        this.field1153[arg2] = 0;
        this.field1146[arg2] = arg0;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZBLjava/awt/Component;I)V", line = 136)
    public final void method661(boolean arg0, byte arg1, Component arg2, int arg3) throws Exception {
        if (this.field1149 != 0) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field1151 = arg0 ? 4 : 2;
        this.field1155 = arg0 ? 2 : 1;
        this.field1156 = new int[this.field1155 * 256];
        this.field1158.initialize(null);
        this.field1158.setCooperativeLevel(arg2, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field1154[var5].flags = 16384;
        }
        this.field1147.formatTag = 1;
        this.field1147.samplesPerSec = arg3;
        this.field1149 = arg3;
        this.field1147.avgBytesPerSec = this.field1151 * arg3;
        this.field1147.blockAlign = this.field1151;
        this.field1147.channels = this.field1155;
        int var6 = -1 / ((arg1 + 67) / 41);
        this.field1147.bitsPerSample = 16;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IB)V", line = 173)
    public final void method662(int arg0, byte arg1) {
        this.field1148[arg0].stop();
        if (arg1 != -118) {
            this.field1152 = null;
        }
        this.field1157[arg0] = false;
        this.field1148[arg0].setCurrentPosition(0);
        this.field1153[arg0] = 0;
    }
}
