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

@OriginalClass("client!pq")
public class class178 implements class45 {

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field2916 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "[I")
    private int[] field2917 = new int[2];

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field2920 = new DSCursors[2];

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "[I")
    private int[] field2924 = new int[2];

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field2921 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "[[B")
    private byte[][] field2925 = new byte[2][];

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "[Z")
    private boolean[] field2927 = new boolean[2];

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field2926 = new DirectSound();

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field2915 = new WaveFormatEx();

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    private int field2918;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    private int field2919;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    private int field2922;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "[I")
    private int[] field2923;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZI)V", line = 6)
    public final void method540(boolean arg0, int arg1) {
        this.field2916[arg1].stop();
        this.field2927[arg1] = false;
        this.field2916[arg1].setCurrentPosition(0);
        this.field2924[arg1] = 0;
        if (!arg0) {
            this.field2919 = 43;
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V", line = 195)
    public class178() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field2921[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field2920[var2] = new DSCursors();
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/awt/Component;ZII)V", line = 27)
    public final void method537(Component arg0, boolean arg1, int arg2, int arg3) throws Exception {
        if (this.field2918 != 0) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field2919 = arg1 ? 4 : 2;
        this.field2922 = arg1 ? 2 : 1;
        this.field2923 = new int[this.field2922 * 256];
        this.field2926.initialize(null);
        this.field2926.setCooperativeLevel(arg0, 2);
        for (int var5 = 0; var5 < 2; var5++) {
            this.field2921[var5].flags = 16384;
        }
        this.field2915.avgBytesPerSec = this.field2919 * arg3;
        this.field2915.samplesPerSec = arg3;
        this.field2918 = arg3;
        if (arg2 != 23151) {
            this.method538(-89, -110);
        }
        this.field2915.blockAlign = this.field2919;
        this.field2915.channels = this.field2922;
        this.field2915.bitsPerSample = 16;
        this.field2915.formatTag = 1;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I[I)V", line = 66)
    public final void method539(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field2922 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field2924[arg0] * this.field2919;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field2925[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field2925[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field2916[arg0].writeBuffer(var4, var3 * 2, this.field2925[arg0], 0);
        this.field2924[arg0] = var3 / this.field2922 + this.field2924[arg0] & 0xFFFF;
        if (!this.field2927[arg0]) {
            this.field2916[arg0].play(1);
            this.field2927[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)V", line = 101)
    public final void method536(int arg0, int arg1, int arg2) throws Exception {
        if (this.field2918 == 0 || this.field2916[arg1] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field2919 * arg2;
        if (this.field2925[arg1] == null || this.field2925[arg1].length != var4) {
            this.field2925[arg1] = new byte[var4];
            this.field2921[arg1].bufferBytes = var4;
        }
        this.field2916[arg1] = this.field2926.createSoundBuffer(this.field2921[arg1], this.field2915);
        this.field2927[arg1] = false;
        this.field2924[arg1] = 0;
        this.field2917[arg1] = arg0;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IB)V", line = 124)
    public final void method541(int arg0, byte arg1) {
        if (this.field2916[arg0] != null) {
            try {
                this.field2916[arg0].stop();
            } catch (ComFailException var3) {
            }
            this.field2916[arg0] = null;
        }
        if (arg1 != 19) {
            this.method540(true, -26);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)I", line = 150)
    public final int method538(int arg0, int arg1) {
        if (!this.field2927[arg0]) {
            return 0;
        } else if (arg1 == 0) {
            this.field2916[arg0].getCurrentPosition(this.field2920[arg0]);
            int var3 = this.field2920[arg0].write / this.field2919;
            int var4 = this.field2924[arg0] - var3 & 0xFFFF;
            if (this.field2917[arg0] < var4) {
                for (int var5 = var3 - this.field2924[arg0] & 0xFFFF; var5 > 0; var5 -= 256) {
                    this.method539(arg0, this.field2923);
                }
                var4 = this.field2924[arg0] - var3 & 0xFFFF;
            }
            return var4;
        } else {
            return -93;
        }
    }
}
