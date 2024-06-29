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

@OriginalClass("client!wr")
public class class426 implements class622 {

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "[[B")
    private byte[][] field5386 = new byte[2][];

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "[Z")
    private boolean[] field5388 = new boolean[2];

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "[I")
    private int[] field5393 = new int[2];

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "[I")
    private int[] field5392 = new int[2];

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field5394 = new DSCursors[2];

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field5395 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field5385 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field5391 = new DirectSound();

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field5396 = new WaveFormatEx();

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    private int field5387;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    private int field5389;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    private int field5390;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "[I")
    private int[] field5397;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)V", line = 9)
    public final void method2345(int arg0, int arg1, int arg2) throws Exception {
        if (this.field5389 == 0 || this.field5395[arg0] != null) {
            throw new IllegalStateException();
        }
        if (arg2 != 65535) {
            this.method2347(72, 94);
        }
        int var4 = this.field5390 * 65536;
        if (this.field5386[arg0] == null || this.field5386[arg0].length != var4) {
            this.field5386[arg0] = new byte[var4];
            this.field5385[arg0].bufferBytes = var4;
        }
        this.field5395[arg0] = this.field5391.createSoundBuffer(this.field5385[arg0], this.field5396);
        this.field5388[arg0] = false;
        this.field5393[arg0] = 0;
        this.field5392[arg0] = arg1;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BILjava/awt/Component;Z)V", line = 35)
    public final void method2346(byte arg0, int arg1, Component arg2, boolean arg3) throws Exception {
        if (this.field5389 != 0) {
            return;
        }
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field5390 = arg3 ? 4 : 2;
        this.field5387 = arg3 ? 2 : 1;
        this.field5397 = new int[this.field5387 * 256];
        this.field5391.initialize(null);
        this.field5391.setCooperativeLevel(arg2, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field5385[var5].flags = 16384;
        }
        this.field5396.avgBytesPerSec = this.field5390 * arg1;
        this.field5396.channels = this.field5387;
        this.field5389 = arg1;
        this.field5396.formatTag = 1;
        this.field5396.samplesPerSec = arg1;
        this.field5396.bitsPerSample = 16;
        this.field5396.blockAlign = this.field5390;
        if (arg0 >= -33) {
            this.method2347(85, -105);
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V", line = 199)
    public class426() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field5385[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field5394[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(II)V", line = 74)
    public final void method2347(int arg0, int arg1) {
        if (arg0 != -3) {
            this.field5386 = null;
        }
        if (this.field5395[arg1] == null) {
            return;
        }
        try {
            this.field5395[arg1].stop();
        } catch (ComFailException var3) {
        }
        this.field5395[arg1] = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[I)V", line = 100)
    public final void method2348(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field5387 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field5393[arg0] * this.field5390;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field5386[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field5386[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field5395[arg0].writeBuffer(var4, var3 * 2, this.field5386[arg0], 0);
        this.field5393[arg0] = var3 / this.field5387 + this.field5393[arg0] & 0xFFFF;
        if (!this.field5388[arg0]) {
            this.field5395[arg0].play(1);
            this.field5388[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)I", line = 135)
    public final int method2349(byte arg0, int arg1) {
        if (!this.field5388[arg1]) {
            return 0;
        }
        this.field5395[arg1].getCurrentPosition(this.field5394[arg1]);
        if (arg0 >= -20) {
            this.field5396 = null;
        }
        int var3 = this.field5394[arg1].write / this.field5390;
        int var4 = this.field5393[arg1] - var3 & 0xFFFF;
        if (var4 > this.field5392[arg1]) {
            int var5 = var3 - this.field5393[arg1] & 0xFFFF;
            while (var5 > 0) {
                var5 -= 256;
                this.method2348(arg1, this.field5397);
            }
            var4 = this.field5393[arg1] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)V", line = 172)
    public final void method2350(int arg0, int arg1) {
        if (arg0 == 31736) {
            this.field5395[arg1].stop();
            this.field5388[arg1] = false;
            this.field5395[arg1].setCurrentPosition(0);
            this.field5393[arg1] = 0;
        }
    }
}
