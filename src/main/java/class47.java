import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class47 extends class264 {

    @OriginalMember(owner = "client!fg", name = "ib", descriptor = "[Lml;")
    public static class152[] field721 = new class152[500];

    @OriginalMember(owner = "client!fg", name = "hb", descriptor = "[S")
    public static short[] field720 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!fg", name = "kb", descriptor = "Lma;")
    private static class5 field723 = class12.method119("flash3:", (byte) 67);

    @OriginalMember(owner = "client!fg", name = "rb", descriptor = "Lma;")
    public static class5 field730 = field723;

    @OriginalMember(owner = "client!fg", name = "fb", descriptor = "Lma;")
    public static class5 field718 = field723;

    @OriginalMember(owner = "client!fg", name = "gb", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!fg", name = "jb", descriptor = "I")
    private int field722;

    @OriginalMember(owner = "client!fg", name = "lb", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!fg", name = "ob", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!fg", name = "pb", descriptor = "I")
    private int field728;

    @OriginalMember(owner = "client!fg", name = "sb", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!fg", name = "tb", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!fg", name = "ub", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!fg", name = "vb", descriptor = "I")
    private int field734;

    @OriginalMember(owner = "client!fg", name = "wb", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!fg", name = "qb", descriptor = "J")
    public static long field729;

    @OriginalMember(owner = "client!fg", name = "mb", descriptor = "Lsj;")
    public static class181 field725;

    @OriginalMember(owner = "client!fg", name = "nb", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field726;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "(I)V", line = 9)
    public static void method352(int arg0) {
        if (arg0 != 22885) {
            method353(72, -11, true);
        }
        field718 = null;
        field720 = null;
        field723 = null;
        field725 = null;
        field721 = null;
        field726 = null;
        field730 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIZ)Lma;", line = 26)
    public static final class5 method353(int arg0, int arg1, boolean arg2) {
        int var3 = arg1 - arg0;
        field727++;
        if (!arg2) {
            return (class5) null;
        } else if (var3 < -9) {
            return class268.field4613;
        } else if (var3 < -6) {
            return class213.field3388;
        } else if (var3 < -3) {
            return class238.field3932;
        } else if (var3 < 0) {
            return class150.field2180;
        } else if (var3 > 9) {
            return class105.field1558;
        } else if (var3 > 6) {
            return class261.field4465;
        } else if (var3 <= 3) {
            return var3 > 0 ? class248.field4112 : class230.field3827;
        } else {
            return class129.field1938;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([BII)I", line = 95)
    public static final int method354(byte[] arg0, int arg1, int arg2) {
        field731++;
        return arg1 == -4052 ? class301.method2041(10420, arg0, 0, arg2) : 87;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILii;)V", line = 118)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg0 == 0) {
            this.method355(arg2.method1497(3610), 807);
        }
        if (arg1 > -27) {
            method353(50, -15, true);
        }
        field719++;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(I)V", line = 143)
    private class47(int arg0) {
        super(0, false);
        this.method355(arg0, 807);
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(II)V", line = 152)
    private final void method355(int arg0, int arg1) {
        this.field734 = arg0 >> 12 & 0xFF0;
        this.field728 = (arg0 & 0xFF00) >> 4;
        if (arg1 != 807) {
            method354((byte[]) null, 115, 58);
        }
        field732++;
        this.field722 = (arg0 & 0xFF) << 4;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V", line = 167)
    public class47() {
        this(0);
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(BI)[[I", line = 177)
    public final int[][] method138(byte arg0, int arg1) {
        field733++;
        int var3 = -14 / ((arg0 + 43) / 55);
        int[][] var4 = this.field4524.method1462(-15077, arg1);
        if (this.field4524.field3506) {
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class226.field3716; var8++) {
                var6[var8] = this.field734;
                var5[var8] = this.field728;
                var7[var8] = this.field722;
            }
        }
        return var4;
    }
}
