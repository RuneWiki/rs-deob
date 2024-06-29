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

@OriginalClass("client!iga")
public class class484 implements class340 {

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field6684 = new DSCursors[2];

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field6685 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "[I")
    private int[] field6687 = new int[2];

    @OriginalMember(owner = "client!iga", name = "j", descriptor = "[I")
    private int[] field6693 = new int[2];

    @OriginalMember(owner = "client!iga", name = "i", descriptor = "[Z")
    private boolean[] field6692 = new boolean[2];

    @OriginalMember(owner = "client!iga", name = "l", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field6695 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!iga", name = "m", descriptor = "[[B")
    private byte[][] field6696 = new byte[2][];

    @OriginalMember(owner = "client!iga", name = "h", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field6691 = new DirectSound();

    @OriginalMember(owner = "client!iga", name = "g", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field6690 = new WaveFormatEx();

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
    private int field6686;

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "I")
    private int field6688;

    @OriginalMember(owner = "client!iga", name = "f", descriptor = "I")
    private int field6689;

    @OriginalMember(owner = "client!iga", name = "k", descriptor = "[I")
    private int[] field6694;

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "()V", line = 192)
    public class484() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field6695[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field6684[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(IZ)V", line = 7)
    public final void method2156(int arg0, boolean arg1) {
        if (this.field6685[arg0] != null) {
            try {
                this.field6685[arg0].stop();
            } catch (ComFailException var3) {
            }
            this.field6685[arg0] = null;
        }
        if (arg1) {
            this.method2155(-12, null);
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(III)V", line = 29)
    public final void method2154(int arg0, int arg1, int arg2) throws Exception {
        if (this.field6686 == 0 || this.field6685[arg0] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field6689 * 65536;
        if (this.field6696[arg0] == null || this.field6696[arg0].length != var4) {
            this.field6696[arg0] = new byte[var4];
            this.field6695[arg0].bufferBytes = var4;
        }
        if (arg1 != -3227) {
            this.method2159(68, -126);
        }
        this.field6685[arg0] = this.field6691.createSoundBuffer(this.field6695[arg0], this.field6690);
        this.field6692[arg0] = false;
        this.field6693[arg0] = 0;
        this.field6687[arg0] = arg2;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(II)I", line = 56)
    public final int method2157(int arg0, int arg1) {
        if (!this.field6692[arg1]) {
            return 0;
        }
        this.field6685[arg1].getCurrentPosition(this.field6684[arg1]);
        int var3 = this.field6684[arg1].write / this.field6689;
        int var4 = this.field6693[arg1] - var3 & 0xFFFF;
        if (arg0 != 0) {
            this.method2156(12, false);
        }
        if (this.field6687[arg1] < var4) {
            int var5 = var3 - this.field6693[arg1] & 0xFFFF;
            while (var5 > 0) {
                var5 -= 256;
                this.method2155(arg1, this.field6694);
            }
            var4 = this.field6693[arg1] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(IIZLjava/awt/Component;)V", line = 95)
    public final void method2158(int arg0, int arg1, boolean arg2, Component arg3) throws Exception {
        if (this.field6686 != 0) {
            return;
        }
        if (arg0 < arg1 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field6689 = arg2 ? 4 : 2;
        this.field6688 = arg2 ? 2 : 1;
        this.field6694 = new int[this.field6688 * 256];
        this.field6691.initialize(null);
        this.field6691.setCooperativeLevel(arg3, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field6695[var5].flags = 16384;
        }
        this.field6690.formatTag = 1;
        this.field6690.bitsPerSample = 16;
        this.field6690.samplesPerSec = arg0;
        this.field6686 = arg0;
        this.field6690.channels = this.field6688;
        this.field6690.avgBytesPerSec = this.field6689 * arg0;
        this.field6690.blockAlign = this.field6689;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I[I)V", line = 131)
    public final void method2155(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field6688 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field6693[arg0] * this.field6689;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field6696[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field6696[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field6685[arg0].writeBuffer(var4, var3 * 2, this.field6696[arg0], 0);
        this.field6693[arg0] = var3 / this.field6688 + this.field6693[arg0] & 0xFFFF;
        if (!this.field6692[arg0]) {
            this.field6685[arg0].play(1);
            this.field6692[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(II)V", line = 163)
    public final void method2159(int arg0, int arg1) {
        this.field6685[arg0].stop();
        this.field6692[arg0] = false;
        this.field6685[arg0].setCurrentPosition(arg1);
        this.field6693[arg0] = 0;
    }
}
