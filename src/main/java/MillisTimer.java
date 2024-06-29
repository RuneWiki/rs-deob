import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class MillisTimer extends Timer {

    @OriginalMember(owner = "mapview!ja", name = "o", descriptor = "[J")
    private long[] otim = new long[10];

    @OriginalMember(owner = "mapview!ja", name = "n", descriptor = "Lv;")
    public static JagString field140 = class1.method2(255, "Achievement Start");

    @OriginalMember(owner = "mapview!ja", name = "q", descriptor = "Lv;")
    public static JagString field143 = class1.method2(255, "Prev page");

    @OriginalMember(owner = "mapview!ja", name = "x", descriptor = "Lv;")
    public static JagString field150;

    @OriginalMember(owner = "mapview!ja", name = "A", descriptor = "[I")
    public static int[] crctable;

    @OriginalMember(owner = "mapview!ja", name = "z", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "mapview!ja", name = "B", descriptor = "Lv;")
    public static JagString field154;

    @OriginalMember(owner = "mapview!ja", name = "C", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "mapview!ja", name = "t", descriptor = "I")
    private int count;

    @OriginalMember(owner = "mapview!ja", name = "u", descriptor = "I")
    private int delta;

    @OriginalMember(owner = "mapview!ja", name = "v", descriptor = "I")
    private int opos;

    @OriginalMember(owner = "mapview!ja", name = "w", descriptor = "I")
    private int ratio;

    @OriginalMember(owner = "mapview!ja", name = "s", descriptor = "J")
    private long ntime;

    @OriginalMember(owner = "mapview!ja", name = "p", descriptor = "Lu;")
    public static Signlink field142;

    @OriginalMember(owner = "mapview!ja", name = "y", descriptor = "Lq;")
    public static WorldmapOverlay field151;

    static {
        ByteArrayPool.maxPool = new byte[50][];
        field150 = class1.method2(255, "Chainmail Shop");
        crctable = new int[256];
        field152 = 0;
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            crctable[var0] = var1;
        }
        field154 = class1.method2(255, "Amulet Shop");
        field155 = 0;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(B)V", line = 26)
    public final void init(byte arg0) {
        this.count = 0;
        this.delta = 1;
        this.ratio = 256;
        this.ntime = MonotonicTime.method75(arg0 - 4929);
        if (arg0 != -49) {
            this.sleep(102, -81, -68);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.otim[var2] = this.ntime;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "<init>", descriptor = "()V", line = 56)
    public MillisTimer() {
        this.init((byte) -49);
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(III)I", line = 77)
    public final int sleep(int arg0, int arg1, int arg2) {
        int var4 = this.ratio;
        int var5 = this.delta;
        this.delta = 1;
        this.ratio = 300;
        this.ntime = MonotonicTime.method75(-4978);
        if (this.otim[this.opos] == 0L) {
            this.ratio = var4;
            this.delta = var5;
        } else if (this.ntime > this.otim[this.opos]) {
            this.ratio = (int) ((long) (arg2 * 2560) / (this.ntime - this.otim[this.opos]));
        }
        if (this.ratio < 25) {
            this.ratio = 25;
        }
        if (this.ratio > 256) {
            this.ratio = 256;
            this.delta = (int) ((long) arg2 - (this.ntime - this.otim[this.opos]) / 10L);
        }
        if (arg2 < this.delta) {
            this.delta = arg2;
        }
        this.otim[this.opos] = this.ntime;
        this.opos = (this.opos + 1) % 10;
        if (this.delta > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.otim[var6] != 0L) {
                    this.otim[var6] += this.delta;
                }
            }
        }
        int var7 = arg1;
        if (arg0 > this.delta) {
            this.delta = arg0;
        }
        ByteArray.method55((long) this.delta, (byte) 12);
        while (this.count < 256) {
            var7++;
            this.count += this.ratio;
        }
        this.count &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(I)V", line = 147)
    public static void method61(int arg0) {
        field140 = null;
        ByteArrayPool.maxPool = null;
        crctable = null;
        field150 = null;
        if (arg0 >= -76) {
            ByteArrayPool.maxPool = null;
        }
        field143 = null;
        field154 = null;
        field151 = null;
        field142 = null;
    }
}
