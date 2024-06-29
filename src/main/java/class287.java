import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public abstract class class287 {

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "[I")
    public static int[] field4587 = new int[32768];

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field4586 = -1;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public static int field4597 = 1;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field4595 = 0;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "[I")
    public static int[] field4594 = new int[100];

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public int field4591;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public int field4598;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public int field4601;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)Z")
    public final boolean method1929(int arg0) {
        field4600++;
        if (arg0 != 0) {
            method1935(false);
        }
        return (this.field4601 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)I")
    public static final int method1930(int arg0, int arg1) {
        if (arg0 == 22409) {
            field4590++;
            return arg1 >>> 7;
        } else {
            return 25;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method1931(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        int var9 = -35 / ((arg5 + 2) / 43);
        field4593++;
        int var10 = arg1 - arg3;
        int var11 = arg0 - arg7;
        int var12 = (arg6 - arg8 << 16) / var11;
        int var13 = (arg4 - arg2 << 16) / var10;
        class155.method1123(var13, 0, 0, arg0, var12, true, arg1, arg2, arg7, arg8, arg3);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)Z")
    public final boolean method1932(byte arg0) {
        field4585++;
        int var2 = 68 % ((arg0 + 59) / 37);
        return (this.field4601 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLsb;II)[Lwf;")
    public static final class17[] method1933(byte arg0, class124 arg1, int arg2, int arg3) {
        field4589++;
        if (arg0 >= -125) {
            method1934(14, 16, (byte) 88, -120, 111, 18, -11);
        }
        return class113.method833(arg2, arg1, arg3, 56) ? class228.method1522((byte) 73) : null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1934(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field4602++;
        if (class32.field540 <= arg3 && arg5 <= class61.field1034 && class108.field1650 <= arg0 && arg4 <= class154.field2509) {
            if (arg1 == 1) {
                class274.method1860(arg3, arg0, arg4, arg5, arg6, (byte) 125);
            } else {
                class84.method670(arg5, arg6, arg4, arg0, arg1, 2, arg3);
            }
        } else if (arg1 == 1) {
            class242.method1607((byte) -104, arg4, arg3, arg6, arg0, arg5);
        } else {
            class238.method1574(arg5, arg1, arg4, arg0, 3, arg6, arg3);
        }
        if (arg2 > -58) {
            method1933((byte) 61, (class124) null, 67, 55);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V")
    public static void method1935(boolean arg0) {
        field4594 = null;
        if (!arg0) {
            field4597 = -62;
        }
        field4587 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1936(int arg0, String arg1) {
        if (arg0 != -22994) {
            return;
        }
        int var2 = class211.method1402(arg1, (byte) 125);
        field4584++;
        if (var2 != -1) {
            int[] var3 = class152.field2484.method869(class143.field2358.field4042[var2] & 0x3FFF, (class143.field2358.field4042[var2] & 0xFFFC7DB) >> 14, class143.field2358.field4042[var2] >> 28 & 0x3, (byte) -87);
            class15.method102(var3[2], var3[1], 70);
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)Z")
    public final boolean method1937(int arg0) {
        int var2 = 118 % ((-arg0 - 7) / 34);
        field4596++;
        return (this.field4601 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)Z")
    public final boolean method1938(int arg0) {
        if (arg0 > -4) {
            method1935(false);
        }
        field4588++;
        return (this.field4601 & 0x2) != 0;
    }
}
