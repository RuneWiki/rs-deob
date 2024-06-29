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

@OriginalClass("client!no")
public class class731 implements class244 {

    @OriginalMember(owner = "client!no", name = "c", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field10084 = new DSCursors[2];

    @OriginalMember(owner = "client!no", name = "b", descriptor = "[I")
    private int[] field10083 = new int[2];

    @OriginalMember(owner = "client!no", name = "e", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field10086 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!no", name = "a", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field10082 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!no", name = "i", descriptor = "[I")
    private int[] field10090 = new int[2];

    @OriginalMember(owner = "client!no", name = "m", descriptor = "[[B")
    private byte[][] field10094 = new byte[2][];

    @OriginalMember(owner = "client!no", name = "f", descriptor = "[Z")
    private boolean[] field10087 = new boolean[2];

    @OriginalMember(owner = "client!no", name = "l", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field10093 = new DirectSound();

    @OriginalMember(owner = "client!no", name = "g", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field10088 = new WaveFormatEx();

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    private int field10085;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    private int field10091;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    private int field10092;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "[I")
    private int[] field10089;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I[I)V", line = 5)
    public final void method1628(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field10092 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field10090[arg0] * this.field10091;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field10094[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field10094[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field10082[arg0].writeBuffer(var4, var3 * 2, this.field10094[arg0], 0);
        this.field10090[arg0] = var3 / this.field10092 + this.field10090[arg0] & 0xFFFF;
        if (!this.field10087[arg0]) {
            this.field10082[arg0].play(1);
            this.field10087[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZILjava/awt/Component;I)V", line = 38)
    public final void method1627(boolean arg0, int arg1, Component arg2, int arg3) throws Exception {
        if (this.field10085 != arg1) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field10092 = arg0 ? 2 : 1;
        this.field10091 = arg0 ? 4 : 2;
        this.field10089 = new int[this.field10092 * 256];
        this.field10093.initialize(null);
        this.field10093.setCooperativeLevel(arg2, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field10086[var5].flags = 16384;
        }
        this.field10088.avgBytesPerSec = this.field10091 * arg3;
        this.field10088.blockAlign = this.field10091;
        this.field10088.bitsPerSample = 16;
        this.field10088.channels = this.field10092;
        this.field10085 = arg3;
        this.field10088.samplesPerSec = arg3;
        this.field10088.formatTag = 1;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IZ)I", line = 72)
    public final int method1629(int arg0, boolean arg1) {
        if (!this.field10087[arg0]) {
            return 0;
        }
        this.field10082[arg0].getCurrentPosition(this.field10084[arg0]);
        int var3 = this.field10084[arg0].write / this.field10091;
        int var4 = this.field10090[arg0] - var3 & 0xFFFF;
        if (this.field10083[arg0] < var4) {
            int var5 = var3 - this.field10090[arg0] & 0xFFFF;
            while (var5 > 0) {
                var5 -= 256;
                this.method1628(arg0, this.field10089);
            }
            var4 = this.field10090[arg0] - var3 & 0xFFFF;
        }
        if (arg1) {
            this.method1632(27, (byte) -81);
        }
        return var4;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V", line = 172)
    public class731() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field10086[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field10084[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)V", line = 124)
    public final void method1630(int arg0, byte arg1) {
        this.field10082[arg0].stop();
        if (arg1 < 20) {
            this.field10088 = null;
        }
        this.field10087[arg0] = false;
        this.field10082[arg0].setCurrentPosition(0);
        this.field10090[arg0] = 0;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(IB)V", line = 137)
    public final void method1632(int arg0, byte arg1) {
        if (arg1 != 37) {
            this.method1628(116, null);
        }
        if (this.field10082[arg0] == null) {
            return;
        }
        try {
            this.field10082[arg0].stop();
        } catch (ComFailException var3) {
        }
        this.field10082[arg0] = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V", line = 195)
    public final void method1631(int arg0, int arg1, int arg2) throws Exception {
        if (this.field10085 == 0 || this.field10082[arg0] != null) {
            throw new IllegalStateException();
        }
        if (arg1 != -10628) {
            this.method1628(-127, null);
        }
        int var4 = this.field10091 * 65536;
        if (this.field10094[arg0] == null || this.field10094[arg0].length != var4) {
            this.field10094[arg0] = new byte[var4];
            this.field10086[arg0].bufferBytes = var4;
        }
        this.field10082[arg0] = this.field10093.createSoundBuffer(this.field10086[arg0], this.field10088);
        this.field10087[arg0] = false;
        this.field10090[arg0] = 0;
        this.field10083[arg0] = arg2;
    }
}
