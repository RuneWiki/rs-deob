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

@OriginalClass("client!jc")
public class class376 implements class420 {

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "[Z")
    private boolean[] field5721 = new boolean[2];

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "[[B")
    private byte[][] field5718 = new byte[2][];

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field5720 = new DSCursors[2];

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field5717 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field5715 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "[I")
    private int[] field5716 = new int[2];

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "[I")
    private int[] field5727 = new int[2];

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field5722 = new DirectSound();

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field5723 = new WaveFormatEx();

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    private int field5719;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    private int field5724;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    private int field5725;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "[I")
    private int[] field5726;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
    public final void method2416(int arg0, int arg1) {
        int var3 = -78 / ((-arg1 - 53) / 55);
        if (this.field5715[arg0] == null) {
            return;
        }
        try {
            this.field5715[arg0].stop();
        } catch (ComFailException var4) {
        }
        this.field5715[arg0] = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)V")
    public final void method2417(byte arg0, int arg1) {
        this.field5715[arg1].stop();
        int var3 = 29 % ((37 - arg0) / 48);
        this.field5721[arg1] = false;
        this.field5715[arg1].setCurrentPosition(0);
        this.field5716[arg1] = 0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)I")
    public final int method2418(int arg0, boolean arg1) {
        if (!this.field5721[arg0]) {
            return 0;
        }
        if (!arg1) {
            this.method2417((byte) 50, -108);
        }
        this.field5715[arg0].getCurrentPosition(this.field5720[arg0]);
        int var3 = this.field5720[arg0].write / this.field5719;
        int var4 = this.field5716[arg0] - var3 & 0xFFFF;
        if (this.field5727[arg0] < var4) {
            for (int var5 = var3 - this.field5716[arg0] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method2421(arg0, this.field5726);
            }
            var4 = this.field5716[arg0] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
    public final void method2419(int arg0, int arg1, int arg2) throws Exception {
        if (this.field5725 == 0 || this.field5715[arg2] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field5719 * 65536;
        if (this.field5718[arg2] == null || this.field5718[arg2].length != var4) {
            this.field5718[arg2] = new byte[var4];
            this.field5717[arg2].bufferBytes = var4;
        }
        this.field5715[arg2] = this.field5722.createSoundBuffer(this.field5717[arg2], this.field5723);
        this.field5721[arg2] = false;
        if (arg1 == 11695) {
            this.field5716[arg2] = 0;
            this.field5727[arg2] = arg0;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBLjava/awt/Component;Z)V")
    public final void method2420(int arg0, byte arg1, Component arg2, boolean arg3) throws Exception {
        if (this.field5725 != 0) {
            return;
        }
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field5719 = arg3 ? 4 : 2;
        this.field5724 = arg3 ? 2 : 1;
        this.field5726 = new int[this.field5724 * 256];
        this.field5722.initialize(null);
        this.field5722.setCooperativeLevel(arg2, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field5717[var5].flags = 16384;
        }
        this.field5723.samplesPerSec = arg0;
        this.field5723.blockAlign = this.field5719;
        this.field5723.avgBytesPerSec = this.field5719 * arg0;
        this.field5723.formatTag = 1;
        this.field5725 = arg0;
        this.field5723.channels = this.field5724;
        this.field5723.bitsPerSample = 16;
        if (arg1 != 64) {
            this.field5718 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class376() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field5717[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field5720[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[I)V")
    public final void method2421(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field5724 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field5716[arg0] * this.field5719;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field5718[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field5718[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field5715[arg0].writeBuffer(var4, var3 * 2, this.field5718[arg0], 0);
        this.field5716[arg0] = var3 / this.field5724 + this.field5716[arg0] & 0xFFFF;
        if (!this.field5721[arg0]) {
            this.field5715[arg0].play(1);
            this.field5721[arg0] = true;
        }
    }
}
