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

@OriginalClass("client!ow")
public class class458 implements class678 {

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "[[B")
    private byte[][] field6225 = new byte[2][];

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field6230 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "[Z")
    private boolean[] field6232 = new boolean[2];

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field6228 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!ow", name = "j", descriptor = "[I")
    private int[] field6234 = new int[2];

    @OriginalMember(owner = "client!ow", name = "l", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field6236 = new DSCursors[2];

    @OriginalMember(owner = "client!ow", name = "m", descriptor = "[I")
    private int[] field6237 = new int[2];

    @OriginalMember(owner = "client!ow", name = "i", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field6233 = new DirectSound();

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field6231 = new WaveFormatEx();

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    private int field6226;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
    private int field6227;

    @OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
    private int field6235;

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "[I")
    private int[] field6229;

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "()V", line = 191)
    public class458() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field6230[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field6236[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(II)V", line = 9)
    public final void method2588(int arg0, int arg1) {
        this.field6228[arg1].stop();
        this.field6232[arg1] = false;
        this.field6228[arg1].setCurrentPosition(arg0);
        this.field6237[arg1] = 0;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IB)I", line = 24)
    public final int method2589(int arg0, byte arg1) {
        if (!this.field6232[arg0]) {
            return 0;
        }
        this.field6228[arg0].getCurrentPosition(this.field6236[arg0]);
        int var3 = this.field6236[arg0].write / this.field6227;
        if (arg1 != -26) {
            this.field6232 = null;
        }
        int var4 = this.field6237[arg0] - var3 & 0xFFFF;
        if (var4 > this.field6234[arg0]) {
            int var5 = var3 - this.field6237[arg0] & 0xFFFF;
            while (var5 > 0) {
                var5 -= 256;
                this.method2590(arg0, this.field6229);
            }
            var4 = this.field6237[arg0] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I[I)V", line = 60)
    public final void method2590(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field6226 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field6237[arg0] * this.field6227;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field6225[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field6225[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field6228[arg0].writeBuffer(var4, var3 * 2, this.field6225[arg0], 0);
        this.field6237[arg0] = var3 / this.field6226 + this.field6237[arg0] & 0xFFFF;
        if (!this.field6232[arg0]) {
            this.field6228[arg0].play(1);
            this.field6232[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(III)V", line = 91)
    public final void method2591(int arg0, int arg1, int arg2) throws Exception {
        if (this.field6235 == 0 || this.field6228[arg1] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field6227 * 65536;
        if (this.field6225[arg1] == null || this.field6225[arg1].length != var4) {
            this.field6225[arg1] = new byte[var4];
            this.field6230[arg1].bufferBytes = var4;
        }
        this.field6228[arg1] = this.field6233.createSoundBuffer(this.field6230[arg1], this.field6231);
        if (arg0 != 17181) {
            this.method2592(-12, 14);
        }
        this.field6232[arg1] = false;
        this.field6237[arg1] = 0;
        this.field6234[arg1] = arg2;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)V", line = 126)
    public final void method2592(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field6231 = null;
        }
        if (this.field6228[arg1] == null) {
            return;
        }
        try {
            this.field6228[arg1].stop();
        } catch (ComFailException var3) {
        }
        this.field6228[arg1] = null;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IZLjava/awt/Component;I)V", line = 154)
    public final void method2593(int arg0, boolean arg1, Component arg2, int arg3) throws Exception {
        if (~this.field6235 != arg0) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field6227 = arg1 ? 4 : 2;
        this.field6226 = arg1 ? 2 : 1;
        this.field6229 = new int[this.field6226 * 256];
        this.field6233.initialize(null);
        this.field6233.setCooperativeLevel(arg2, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field6230[var5].flags = 16384;
        }
        this.field6231.samplesPerSec = arg3;
        this.field6231.blockAlign = this.field6227;
        this.field6231.formatTag = 1;
        this.field6231.bitsPerSample = 16;
        this.field6235 = arg3;
        this.field6231.channels = this.field6226;
        this.field6231.avgBytesPerSec = this.field6227 * arg3;
    }
}
