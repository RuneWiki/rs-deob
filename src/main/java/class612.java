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

@OriginalClass("client!mj")
public class class612 implements class185 {

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "[I")
    private int[] field8086 = new int[2];

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "[I")
    private int[] field8093 = new int[2];

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "[Z")
    private boolean[] field8088 = new boolean[2];

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "[[B")
    private byte[][] field8095 = new byte[2][];

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field8094 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field8087 = new DSCursors[2];

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field8096 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field8091 = new DirectSound();

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field8089 = new WaveFormatEx();

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    private int field8084;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    private int field8090;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    private int field8092;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "[I")
    private int[] field8085;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
    public final void method1222(int arg0, Component arg1, boolean arg2, byte arg3) throws Exception {
        if (this.field8092 != 0) {
            return;
        }
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field8084 = arg2 ? 4 : 2;
        this.field8090 = arg2 ? 2 : 1;
        this.field8085 = new int[this.field8090 * 256];
        this.field8091.initialize(null);
        this.field8091.setCooperativeLevel(arg1, 2);
        int var5 = 0;
        if (arg3 != 27) {
            return;
        }
        while (var5 < 2) {
            this.field8094[var5].flags = 16384;
            var5++;
        }
        this.field8089.avgBytesPerSec = this.field8084 * arg0;
        this.field8089.blockAlign = this.field8084;
        this.field8089.samplesPerSec = arg0;
        this.field8089.formatTag = 1;
        this.field8089.bitsPerSample = 16;
        this.field8089.channels = this.field8090;
        this.field8092 = arg0;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
    public final void method1221(int arg0, int arg1) {
        this.field8096[arg0].stop();
        this.field8088[arg0] = false;
        this.field8096[arg0].setCurrentPosition(0);
        this.field8093[arg0] = arg1;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[I)V")
    public final void method1225(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field8090 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field8093[arg0] * this.field8084;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field8095[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field8095[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field8096[arg0].writeBuffer(var4, var3 * 2, this.field8095[arg0], 0);
        this.field8093[arg0] = var3 / this.field8090 + this.field8093[arg0] & 0xFFFF;
        if (!this.field8088[arg0]) {
            this.field8096[arg0].play(1);
            this.field8088[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)I")
    public final int method1224(int arg0, int arg1) {
        if (!this.field8088[arg1]) {
            return 0;
        }
        if (arg0 != 256) {
            this.field8096 = null;
        }
        this.field8096[arg1].getCurrentPosition(this.field8087[arg1]);
        int var3 = this.field8087[arg1].write / this.field8084;
        int var4 = this.field8093[arg1] - var3 & 0xFFFF;
        if (var4 > this.field8086[arg1]) {
            for (int var5 = var3 - this.field8093[arg1] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method1225(arg1, this.field8085);
            }
            var4 = this.field8093[arg1] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
    public final void method1223(int arg0, int arg1, int arg2) throws Exception {
        if (this.field8092 == 0 || this.field8096[arg2] != null) {
            throw new IllegalStateException();
        }
        int var4 = 102 % ((arg0 - 19) / 48);
        int var5 = this.field8084 * 65536;
        if (this.field8095[arg2] == null || this.field8095[arg2].length != var5) {
            this.field8095[arg2] = new byte[var5];
            this.field8094[arg2].bufferBytes = var5;
        }
        this.field8096[arg2] = this.field8091.createSoundBuffer(this.field8094[arg2], this.field8089);
        this.field8088[arg2] = false;
        this.field8093[arg2] = 0;
        this.field8086[arg2] = arg1;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)V")
    public final void method1226(boolean arg0, int arg1) {
        if (this.field8096[arg1] != null) {
            try {
                this.field8096[arg1].stop();
            } catch (ComFailException var3) {
            }
            this.field8096[arg1] = null;
        }
        if (!arg0) {
            this.field8084 = 110;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class612() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field8094[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field8087[var2] = new DSCursors();
        }
    }
}
