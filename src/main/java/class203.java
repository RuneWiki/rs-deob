import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wa")
public class class203 extends class86 {

    @OriginalMember(owner = "wa", name = "Cb", descriptor = "Ljava/lang/Object;")
    public static Object field3987 = new Object();

    @OriginalMember(owner = "wa", name = "Lb", descriptor = "[I")
    public static int[] field3996 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "wa", name = "Hb", descriptor = "[[S")
    public static short[][] field3992 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "wa", name = "Jb", descriptor = "I")
    public static int field3994 = (int) (Math.random() * 33.0D) + -16;

    @OriginalMember(owner = "wa", name = "zb", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "wa", name = "Ab", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "wa", name = "Bb", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "wa", name = "Db", descriptor = "I")
    private int field3988;

    @OriginalMember(owner = "wa", name = "Eb", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "wa", name = "Gb", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "wa", name = "Ib", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "wa", name = "Kb", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "wa", name = "Mb", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "wa", name = "Ob", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "wa", name = "Nb", descriptor = "J")
    public static long field3998;

    @OriginalMember(owner = "wa", name = "Fb", descriptor = "Lbd;")
    private class15 field3990;

    @OriginalMember(owner = "wa", name = "a", descriptor = "(ILbg;II)Z")
    public static final boolean method1333(int arg0, class18 arg1, int arg2, int arg3) {
        if (arg0 != -21957) {
            return true;
        } else {
            ++field3986;
            byte[] var4 = arg1.method147(0, arg2, arg3);
            if (var4 == null) {
                return false;
            } else {
                class6.method28((byte) -55, var4);
                return true;
            }
        }
    }

    @OriginalMember(owner = "wa", name = "q", descriptor = "(I)I")
    public final int method1334(int arg0) {
        if (arg0 != 30882) {
            this.method1339((byte) -123, 36);
        }
        ++field3999;
        return 255 & super.field1808[super.field1773++] - this.field3990.method101(arg0 ^ -11800);
    }

    @OriginalMember(owner = "wa", name = "a", descriptor = "(Z[I)V")
    public final void method1335(boolean arg0, int[] arg1) {
        if (arg0) {
            field3998 = -53L;
        }
        ++field3993;
        this.field3990 = new class15(arg1);
    }

    @OriginalMember(owner = "wa", name = "r", descriptor = "(I)V")
    public static void method1336(int arg0) {
        field3987 = null;
        field3992 = null;
        if (arg0 == 5681) {
            field3996 = null;
        }
    }

    @OriginalMember(owner = "wa", name = "e", descriptor = "(Z)V")
    public final void method1337(boolean arg0) {
        ++field3991;
        if (!arg0) {
            this.method1340(-93, (byte) -127);
        }
        super.field1773 = (this.field3988 + 7) / 8;
    }

    @OriginalMember(owner = "wa", name = "<init>", descriptor = "(I)V")
    public class203(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "wa", name = "s", descriptor = "(I)V")
    public final void method1338(int arg0) {
        ++field3997;
        this.field3988 = super.field1773 * 8;
        if (arg0 != 11045) {
            this.field3988 = -6;
        }
    }

    @OriginalMember(owner = "wa", name = "e", descriptor = "(BI)V")
    public final void method1339(byte arg0, int arg1) {
        if (arg0 >= 80) {
            super.field1808[super.field1773++] = (byte) (this.field3990.method101(-22198) + arg1);
            ++field3985;
        }
    }

    @OriginalMember(owner = "wa", name = "b", descriptor = "(IB)I")
    public final int method1340(int arg0, byte arg1) {
        if (arg1 <= 8) {
            this.method1338(-87);
        }
        ++field3984;
        return arg0 * 8 - this.field3988;
    }

    @OriginalMember(owner = "wa", name = "f", descriptor = "(BI)I")
    public final int method1341(byte arg0, int arg1) {
        int var3 = this.field3988 >> 3;
        int var4 = -(this.field3988 & 7) + 8;
        if (arg0 <= 61) {
            this.method1334(63);
        }
        int var5 = 0;
        this.field3988 += arg1;
        ++field3995;
        while (arg1 > var4) {
            var5 += (class28.field616[var4] & super.field1808[var3++]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 != var4) {
            var6 = (super.field1808[var3] >> -arg1 + var4 & class28.field616[arg1]) + var5;
        } else {
            var6 = (super.field1808[var3] & class28.field616[var4]) + var5;
        }
        return var6;
    }
}
