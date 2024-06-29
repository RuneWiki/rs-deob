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

@OriginalClass("client!ku")
public class class168 implements class283 {

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "[Z")
    private boolean[] field2339 = new boolean[2];

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "[Lcom/ms/directX/DSCursors;")
    private DSCursors[] field2345 = new DSCursors[2];

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "[[B")
    private byte[][] field2346 = new byte[2][];

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "[Lcom/ms/directX/DSBufferDesc;")
    private DSBufferDesc[] field2348 = new DSBufferDesc[2];

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "[I")
    private int[] field2350 = new int[2];

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "[I")
    private int[] field2349 = new int[2];

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "[Lcom/ms/directX/DirectSoundBuffer;")
    private DirectSoundBuffer[] field2340 = new DirectSoundBuffer[2];

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "Lcom/ms/directX/DirectSound;")
    private DirectSound field2342 = new DirectSound();

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "Lcom/ms/directX/WaveFormatEx;")
    private WaveFormatEx field2338 = new WaveFormatEx();

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
    private int field2343;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
    private int field2344;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
    private int field2347;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "[I")
    private int[] field2341;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(IZ)V")
    public final void method1076(int arg0, boolean arg1) {
        if (!arg1 || this.field2340[arg0] == null) {
            return;
        }
        try {
            this.field2340[arg0].stop();
        } catch (ComFailException var3) {
        }
        this.field2340[arg0] = null;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)V")
    public final void method1077(int arg0, int arg1) {
        this.field2340[arg1].stop();
        this.field2339[arg1] = false;
        this.field2340[arg1].setCurrentPosition(0);
        this.field2349[arg1] = 0;
        if (arg0 != 9380) {
            this.field2339 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I[I)V")
    public final void method1078(int arg0, int[] arg1) {
        int var3 = arg1.length;
        if (this.field2343 * 256 != var3) {
            throw new IllegalArgumentException();
        }
        int var4 = this.field2349[arg0] * this.field2347;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg1[var5];
            if ((var6 + 8388608 & 0xFF000000) != 0) {
                var6 = var6 >> 31 ^ 0x7FFFFF;
            }
            this.field2346[arg0][var5 * 2 + var4] = (byte) (var6 >> 8);
            this.field2346[arg0][var5 * 2 + var4 + 1] = (byte) (var6 >> 16);
        }
        this.field2340[arg0].writeBuffer(var4, var3 * 2, this.field2346[arg0], 0);
        this.field2349[arg0] = var3 / this.field2343 + this.field2349[arg0] & 0xFFFF;
        if (!this.field2339[arg0]) {
            this.field2340[arg0].play(1);
            this.field2339[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)V")
    public final void method1079(int arg0, int arg1, int arg2) throws Exception {
        if (this.field2344 == 0 || this.field2340[arg0] != null) {
            throw new IllegalStateException();
        }
        int var4 = this.field2347 * 65536;
        if (this.field2346[arg0] == null || this.field2346[arg0].length != var4) {
            this.field2346[arg0] = new byte[var4];
            this.field2348[arg0].bufferBytes = var4;
        }
        if (arg2 != -12765) {
            this.method1076(46, true);
        }
        this.field2340[arg0] = this.field2342.createSoundBuffer(this.field2348[arg0], this.field2338);
        this.field2339[arg0] = false;
        this.field2349[arg0] = 0;
        this.field2350[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZ)I")
    public final int method1080(int arg0, boolean arg1) {
        if (!arg1) {
            this.field2342 = null;
        }
        if (!this.field2339[arg0]) {
            return 0;
        }
        this.field2340[arg0].getCurrentPosition(this.field2345[arg0]);
        int var3 = this.field2345[arg0].write / this.field2347;
        int var4 = this.field2349[arg0] - var3 & 0xFFFF;
        if (this.field2350[arg0] < var4) {
            for (int var5 = var3 - this.field2349[arg0] & 0xFFFF; var5 > 0; var5 -= 256) {
                this.method1078(arg0, this.field2341);
            }
            var4 = this.field2349[arg0] - var3 & 0xFFFF;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
    public final void method1081(int arg0, int arg1, Component arg2, boolean arg3) throws Exception {
        if (this.field2344 != 0) {
            return;
        }
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        this.field2347 = arg3 ? 4 : 2;
        this.field2343 = arg3 ? 2 : 1;
        this.field2341 = new int[this.field2343 * 256];
        this.field2342.initialize(null);
        this.field2342.setCooperativeLevel(arg2, 2);
        int var5 = 25 / ((arg1 + 43) / 54);
        for (int var6 = 0; var6 < 2; var6++) {
            this.field2348[var6].flags = 16384;
        }
        this.field2338.avgBytesPerSec = this.field2347 * arg0;
        this.field2338.bitsPerSample = 16;
        this.field2338.samplesPerSec = arg0;
        this.field2338.channels = this.field2343;
        this.field2338.blockAlign = this.field2347;
        this.field2344 = arg0;
        this.field2338.formatTag = 1;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
    public class168() throws Exception {
        for (int var1 = 0; var1 < 2; var1++) {
            this.field2348[var1] = new DSBufferDesc();
        }
        for (int var2 = 0; var2 < 2; var2++) {
            this.field2345[var2] = new DSCursors();
        }
    }
}
