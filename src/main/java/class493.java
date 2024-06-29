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

@OriginalClass("client!np")
public class class493 implements class727 {

    @OriginalMember(owner = "client!np", name = "a", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field6980 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!np", name = "f", descriptor = "[I")
    private int[] field6985 = new int[2];

    @OriginalMember(owner = "client!np", name = "h", descriptor = "[[B")
    private byte[][] field6987 = new byte[2][];

    @OriginalMember(owner = "client!np", name = "j", descriptor = "[Z")
    private boolean[] field6989 = new boolean[2];

    @OriginalMember(owner = "client!np", name = "c", descriptor = "[I")
    private int[] field6982 = new int[2];

    @OriginalMember(owner = "client!np", name = "e", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field6984 = new DSCursors[2];

    @OriginalMember(owner = "client!np", name = "m", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field6992 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!np", name = "d", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field6983 = new DirectSound();

    @OriginalMember(owner = "client!np", name = "k", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field6990 = new WaveFormatEx();

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    private int field6986;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    private int field6988;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    private int field6991;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "[I")
    private int[] field6981;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    public final void method2903(int arg0, boolean arg1, Component arg2, int arg3) throws Exception {
        if (this.field6988 != 0) {
            return;
        }
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field6986 = arg1 ? 2 : 1;
        this.field6991 = arg1 ? 4 : 2;
        this.field6981 = new int[this.field6986 * 256];
        int var5 = -115 / ((32 - arg3) / 54);
        this.field6983.initialize(null);
        this.field6983.setCooperativeLevel(arg2, 2);
        for (int var6 = 0; var6 < 2; var6++) {
            this.field6992[var6].flags = 16384;
        }
        this.field6990.formatTag = 1;
        this.field6990.blockAlign = this.field6991;
        this.field6990.bitsPerSample = 16;
        this.field6990.samplesPerSec = arg0;
        this.field6990.avgBytesPerSec = this.field6991 * arg0;
        this.field6990.channels = this.field6986;
        this.field6988 = arg0;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I[I)V")
    public final void method2904(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field6986 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field6985[arg0] * this.field6991;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field6987[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field6987[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field6980[arg0].writeBuffer(var4, var3 * 2, this.field6987[arg0], 0);
        this.field6985[arg0] = var3 / this.field6986 + this.field6985[arg0] & 0xFFFF;
        if (!this.field6989[arg0]) {
            this.field6980[arg0].play(1);
            this.field6989[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IZI)V")
    public final void method2905(int arg0, boolean arg1, int arg2) throws Exception {
        if (this.field6988 == 0 || this.field6980[arg0] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field6991 * 65536;
        if (!arg1) {
            return;
        }
        if (this.field6987[arg0] == null || this.field6987[arg0].length != var4) {
            this.field6987[arg0] = new byte[var4];
            this.field6992[arg0].bufferBytes = var4;
        }
        this.field6980[arg0] = this.field6983.createSoundBuffer(this.field6992[arg0], this.field6990);
        this.field6989[arg0] = false;
        this.field6985[arg0] = 0;
        this.field6982[arg0] = arg2;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)I")
    public final int method2906(byte arg0, int arg1) {
        if (!this.field6989[arg1]) {
            return 0;
        }
        this.field6980[arg1].getCurrentPosition(this.field6984[arg1]);
        int var3 = -20 % ((arg0 + 8) / 55);
        int var4 = this.field6984[arg1].write / this.field6991;
        int var5 = this.field6985[arg1] - var4 & 0xFFFF;
        if (var5 > this.field6982[arg1]) {
            for (int var6 = var4 - this.field6985[arg1] & 0xFFFF; var6 > 0; var6 -= 256) {
                this.method2904(arg1, this.field6981);
            }
            var5 = this.field6985[arg1] - var4 & 0xFFFF;
        }
        return var5;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V")
    public final void method2907(int arg0, int arg1) {
        this.field6980[arg1].stop();
        this.field6989[arg1] = false;
        this.field6980[arg1].setCurrentPosition(0);
        this.field6985[arg1] = 0;
        if (arg0 != 3069) {
            this.field6985 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZI)V")
    public final void method2908(boolean arg0, int arg1) {
        if (!arg0 || this.field6980[arg1] == null) {
            return;
        }
        try {
            this.field6980[arg1].stop();
        } catch (ComFailException var3) {
        }
        this.field6980[arg1] = null;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "()V")
    public class493() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field6992[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field6984[var2] = new DSCursors();
        }
    }
}
