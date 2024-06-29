import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class309 extends class315 {

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "Lom;")
    public static class243 field4386 = new class243(0, 0);

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "Z")
    public static boolean field4387 = false;

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "[[I")
    public static int[][] field4389 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public int field4378;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
    public int field4379;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    public int field4384;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "Luq;")
    public class316 field4382;

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4390;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "[Lr;")
    public class63[] field4383;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V", line = 7)
    public static void method1974(byte arg0) {
        field4386 = null;
        field4389 = null;
        field4390 = null;
        if (arg0 >= -32) {
            field4388 = -74;
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V", line = 19)
    public static final void method1975(int arg0) {
        field4380++;
        if (class207.field3050) {
            return;
        }
        class289.method1899((byte) 26, class36.field393);
        if (class267.field3862 != null) {
            class289.method1899((byte) 26, class267.field3862);
        }
        class207.field3050 = true;
        if (arg0 <= 9) {
            field4391 = 14;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILvc;I)Z", line = 49)
    public final boolean method1976(int arg0, int arg1, class89 arg2, int arg3) {
        if (arg0 < 105) {
            return false;
        }
        field4381++;
        if (this.field4383 != null) {
            for (int var5 = 0; var5 < this.field4383.length; var5++) {
                if (this.field4383[var5].method572(arg1, arg3) && this.field4382.method77(0, arg2, arg1, arg3)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILae;I)V", line = 84)
    public static final void method1977(int arg0, int arg1, class172 arg2, int arg3) {
        field4385++;
        if (arg2.field2533 == 0) {
            arg2.field2466 = arg2.field2552;
        } else if (arg2.field2533 == 1) {
            arg2.field2466 = (arg0 - arg2.field2579) / 2 + arg2.field2552;
        } else if (arg2.field2533 == 2) {
            arg2.field2466 = arg0 - arg2.field2552 - arg2.field2579;
        } else if (arg2.field2533 == 3) {
            arg2.field2466 = arg2.field2552 * arg0 >> 14;
        } else if (arg2.field2533 == 4) {
            arg2.field2466 = (arg2.field2552 * arg0 >> 14) + (arg0 - arg2.field2579) / 2;
        } else {
            arg2.field2466 = arg0 - arg2.field2579 - (arg2.field2552 * arg0 >> 14);
        }
        if (arg3 != 2) {
            method1974((byte) -24);
        }
        if (arg2.field2601 == 0) {
            arg2.field2502 = arg2.field2536;
        } else if (arg2.field2601 == 1) {
            arg2.field2502 = (arg1 - arg2.field2554) / 2 + arg2.field2536;
        } else if (arg2.field2601 == 2) {
            arg2.field2502 = arg1 - arg2.field2536 - arg2.field2554;
        } else if (arg2.field2601 == 3) {
            arg2.field2502 = arg2.field2536 * arg1 >> 14;
        } else if (arg2.field2601 == 4) {
            arg2.field2502 = (arg2.field2536 * arg1 >> 14) + (arg1 - arg2.field2554) / 2;
        } else {
            arg2.field2502 = arg1 - arg2.field2554 - (arg2.field2536 * arg1 >> 14);
        }
        if (!class79.field1162 || client.method547(arg2).field1544 == 0 && arg2.field2602 != 0) {
            return;
        }
        if (arg2.field2502 < 0) {
            arg2.field2502 = 0;
        } else if (arg2.field2554 + arg2.field2502 > arg1) {
            arg2.field2502 = arg1 - arg2.field2554;
        }
        if (arg2.field2466 < 0) {
            arg2.field2466 = 0;
        } else if (arg2.field2579 + arg2.field2466 > arg0) {
            arg2.field2466 = arg0 - arg2.field2579;
            return;
        }
    }
}
