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

@OriginalClass("client!dda")
public class class205 implements class662 {

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "[[B")
    private byte[][] field3011 = new byte[2][];

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field3014 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field3008 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "[I")
    private int[] field3017 = new int[2];

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "[Z")
    private boolean[] field3015 = new boolean[2];

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field3018 = new DSCursors[2];

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "[I")
    private int[] field3020 = new int[2];

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field3012 = new DirectSound();

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field3009 = new WaveFormatEx();

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
    private int field3013;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
    private int field3016;

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
    private int field3019;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "[I")
    private int[] field3010;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)V", line = 4)
    public final void method1753(int arg0, int arg1, int arg2) throws Exception {
        if (this.field3019 == 0 || this.field3014[arg0] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field3013 * 65536;
        if (this.field3011[arg0] == null || this.field3011[arg0].length != var4) {
            this.field3011[arg0] = new byte[var4];
            this.field3008[arg0].bufferBytes = var4;
        }
        this.field3014[arg0] = this.field3012.createSoundBuffer(this.field3008[arg0], this.field3009);
        this.field3015[arg0] = false;
        int var5 = 3 % ((arg2 - 62) / 35);
        this.field3017[arg0] = 0;
        this.field3020[arg0] = arg1;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(BI)V", line = 33)
    public final void method1754(byte arg0, int arg1) {
        if (this.field3014[arg1] != null) {
            try {
                this.field3014[arg1].stop();
            } catch (ComFailException var3) {
            }
            this.field3014[arg1] = null;
        }
        if (arg0 < 33) {
            this.method1755(60, 120);
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(II)I", line = 53)
    public final int method1755(int arg0, int arg1) {
        if (arg1 != 2) {
            this.field3009 = null;
        }
        if (!this.field3015[arg0]) {
            return 0;
        }
        this.field3014[arg0].getCurrentPosition(this.field3018[arg0]);
        int var3 = this.field3018[arg0].write / this.field3013;
        int var4 = this.field3017[arg0] - var3 & 0xFFFF;
        if (var4 > this.field3020[arg0]) {
            for (int var5 = var3 - this.field3017[arg0] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method1758(arg0, this.field3010);
            }
            var4 = this.field3017[arg0] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "()V", line = 198)
    public class205() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field3008[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field3018[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(II)V", line = 102)
    public final void method1756(int arg0, int arg1) {
        if (arg0 <= -52) {
            this.field3014[arg1].stop();
            this.field3015[arg1] = false;
            this.field3014[arg1].setCurrentPosition(0);
            this.field3017[arg1] = 0;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZZLjava/awt/Component;I)V", line = 120)
    public final void method1757(boolean arg0, boolean arg1, Component arg2, int arg3) throws Exception {
        if (this.field3019 != 0) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field3016 = arg1 ? 2 : 1;
        this.field3013 = arg1 ? 4 : 2;
        this.field3010 = new int[this.field3016 * 256];
        this.field3012.initialize(null);
        this.field3012.setCooperativeLevel(arg2, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field3008[var5].flags = 16384;
        }
        if (!arg0) {
            this.field3013 = -44;
        }
        this.field3019 = arg3;
        this.field3009.blockAlign = this.field3013;
        this.field3009.channels = this.field3016;
        this.field3009.bitsPerSample = 16;
        this.field3009.avgBytesPerSec = this.field3013 * arg3;
        this.field3009.samplesPerSec = arg3;
        this.field3009.formatTag = 1;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I[I)V", line = 157)
    public final void method1758(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field3016 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field3017[arg0] * this.field3013;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field3011[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field3011[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field3014[arg0].writeBuffer(var4, var3 * 2, this.field3011[arg0], 0);
        this.field3017[arg0] = var3 / this.field3016 + this.field3017[arg0] & 0xFFFF;
        if (!this.field3015[arg0]) {
            this.field3014[arg0].play(1);
            this.field3015[arg0] = true;
        }
    }
}
