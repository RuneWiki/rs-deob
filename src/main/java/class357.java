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

@OriginalClass("client!pp")
public class class357 implements class649 {

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "[Z")
    private boolean[] field5115 = new boolean[2];

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "[[B")
    private byte[][] field5119 = new byte[2][];

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "[I")
    private int[] field5121 = new int[2];

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field5117 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field5116 = new DSCursors[2];

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "[I")
    private int[] field5126 = new int[2];

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field5123 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field5122 = new DirectSound();

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field5120 = new WaveFormatEx();

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    private int field5118;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    private int field5124;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    private int field5125;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "[I")
    private int[] field5114;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)V")
    public final void method2175(int arg0, int arg1, int arg2) throws Exception {
        if (this.field5118 == 0 || this.field5117[arg2] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field5125 * 65536;
        if (this.field5119[arg2] == null || this.field5119[arg2].length != var4) {
            this.field5119[arg2] = new byte[var4];
            this.field5123[arg2].bufferBytes = var4;
        }
        this.field5117[arg2] = this.field5122.createSoundBuffer(this.field5123[arg2], this.field5120);
        this.field5115[arg2] = false;
        this.field5126[arg2] = arg1;
        this.field5121[arg2] = arg0;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)I")
    public final int method2176(int arg0, int arg1) {
        if (!this.field5115[arg0]) {
            return 0;
        }
        this.field5117[arg0].getCurrentPosition(this.field5116[arg0]);
        int var3 = this.field5116[arg0].write / this.field5125;
        int var4 = arg1 & this.field5126[arg0] - var3;
        if (var4 > this.field5121[arg0]) {
            for (int var5 = var3 - this.field5126[arg0] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method2177(arg0, this.field5114);
            }
            var4 = this.field5126[arg0] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I[I)V")
    public final void method2177(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field5124 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field5126[arg0] * this.field5125;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field5119[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field5119[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field5117[arg0].writeBuffer(var4, var3 * 2, this.field5119[arg0], 0);
        this.field5126[arg0] = var3 / this.field5124 + this.field5126[arg0] & 0xFFFF;
        if (!this.field5115[arg0]) {
            this.field5117[arg0].play(1);
            this.field5115[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(II)V")
    public final void method2178(int arg0, int arg1) {
        if (arg1 <= -102) {
            this.field5117[arg0].stop();
            this.field5115[arg0] = false;
            this.field5117[arg0].setCurrentPosition(0);
            this.field5126[arg0] = 0;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/awt/Component;IBZ)V")
    public final void method2179(Component arg0, int arg1, byte arg2, boolean arg3) throws Exception {
        if (this.field5118 != 0) {
            return;
        }
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field5125 = arg3 ? 4 : 2;
        this.field5124 = arg3 ? 2 : 1;
        this.field5114 = new int[this.field5124 * 256];
        this.field5122.initialize(null);
        this.field5122.setCooperativeLevel(arg0, 2);
        int var5 = 0;
        if (arg2 > -26) {
            return;
        }
        while (var5 < 2) {
            this.field5123[var5].flags = 16384;
            var5++;
        }
        this.field5120.blockAlign = this.field5125;
        this.field5120.channels = this.field5124;
        this.field5120.avgBytesPerSec = this.field5125 * arg1;
        this.field5120.formatTag = 1;
        this.field5118 = arg1;
        this.field5120.bitsPerSample = 16;
        this.field5120.samplesPerSec = arg1;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(II)V")
    public final void method2180(int arg0, int arg1) {
        if (this.field5117[arg0] != null) {
            try {
                this.field5117[arg0].stop();
            } catch (ComFailException var3) {
            }
            this.field5117[arg0] = null;
        }
        if (arg1 != 1) {
            this.field5114 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
    public class357() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field5123[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field5116[var2] = new DSCursors();
        }
    }
}
