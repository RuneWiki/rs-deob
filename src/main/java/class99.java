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

@OriginalClass("client!so")
public class class99 implements class123 {

    @OriginalMember(owner = "client!so", name = "a", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field1504 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!so", name = "e", descriptor = "[I")
    private int[] field1508 = new int[2];

    @OriginalMember(owner = "client!so", name = "d", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field1507 = new DSCursors[2];

    @OriginalMember(owner = "client!so", name = "h", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field1511 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!so", name = "j", descriptor = "[I")
    private int[] field1513 = new int[2];

    @OriginalMember(owner = "client!so", name = "f", descriptor = "[[B")
    private byte[][] field1509 = new byte[2][];

    @OriginalMember(owner = "client!so", name = "g", descriptor = "[Z")
    private boolean[] field1510 = new boolean[2];

    @OriginalMember(owner = "client!so", name = "m", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field1516 = new DirectSound();

    @OriginalMember(owner = "client!so", name = "i", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field1512 = new WaveFormatEx();

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    private int field1505;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "[I")
    private int[] field1506;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(II)V")
    public final void method719(int arg0, int arg1) {
        this.field1511[arg0].stop();
        this.field1510[arg0] = false;
        this.field1511[arg0].setCurrentPosition(0);
        this.field1513[arg0] = arg1;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BI)V")
    public final void method720(byte arg0, int arg1) {
        if (arg0 < 70 || this.field1511[arg1] == null) {
            return;
        }
        try {
            this.field1511[arg1].stop();
        } catch (ComFailException var3) {
        }
        this.field1511[arg1] = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    public final void method721(int arg0, boolean arg1, Component arg2, int arg3) throws Exception {
        if (this.field1515 != 0) {
            return;
        }
        if (arg3 < ~arg0 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field1514 = arg1 ? 4 : 2;
        this.field1505 = arg1 ? 2 : 1;
        this.field1506 = new int[this.field1505 * 256];
        this.field1516.initialize(null);
        this.field1516.setCooperativeLevel(arg2, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field1504[var5].flags = 16384;
        }
        this.field1512.channels = this.field1505;
        this.field1512.samplesPerSec = arg0;
        this.field1512.blockAlign = this.field1514;
        this.field1512.avgBytesPerSec = this.field1514 * arg0;
        this.field1515 = arg0;
        this.field1512.formatTag = 1;
        this.field1512.bitsPerSample = 16;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)I")
    public final int method722(int arg0, int arg1) {
        if (!this.field1510[arg0]) {
            return 0;
        }
        this.field1511[arg0].getCurrentPosition(this.field1507[arg0]);
        int var3 = this.field1507[arg0].write / this.field1514;
        int var4 = this.field1513[arg0] - var3 & 0xFFFF;
        if (arg1 != 0) {
            return -20;
        }
        if (this.field1508[arg0] < var4) {
            for (int var5 = var3 - this.field1513[arg0] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method724(arg0, this.field1506);
            }
            var4 = this.field1513[arg0] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(III)V")
    public final void method723(int arg0, int arg1, int arg2) throws Exception {
        if (this.field1515 == 0 || this.field1511[arg0] != null) {
            throw new IllegalStateException();
        }
        if (arg2 != 10196) {
            this.field1515 = 54;
        }
        int var4 = this.field1514 * 65536;
        if (this.field1509[arg0] == null || this.field1509[arg0].length != var4) {
            this.field1509[arg0] = new byte[var4];
            this.field1504[arg0].bufferBytes = var4;
        }
        this.field1511[arg0] = this.field1516.createSoundBuffer(this.field1504[arg0], this.field1512);
        this.field1510[arg0] = false;
        this.field1513[arg0] = 0;
        this.field1508[arg0] = arg1;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I[I)V")
    public final void method724(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field1505 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field1513[arg0] * this.field1514;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field1509[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field1509[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field1511[arg0].writeBuffer(var4, var3 * 2, this.field1509[arg0], 0);
        this.field1513[arg0] = var3 / this.field1505 + this.field1513[arg0] & 0xFFFF;
        if (!this.field1510[arg0]) {
            this.field1511[arg0].play(1);
            this.field1510[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
    public class99() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field1504[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field1507[var2] = new DSCursors();
        }
    }
}
