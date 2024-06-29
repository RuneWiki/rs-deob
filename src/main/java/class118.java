import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class118 extends class82 {

    @OriginalMember(owner = "client!ki", name = "U", descriptor = "Ldj;")
    public static class44 field2104 = class89.method650(255, "Cabbage");

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "I")
    public static int field2103 = 0;

    @OriginalMember(owner = "client!ki", name = "X", descriptor = "I")
    public static int field2107 = 0;

    @OriginalMember(owner = "client!ki", name = "Y", descriptor = "I")
    public static int field2108 = 0;

    @OriginalMember(owner = "client!ki", name = "db", descriptor = "J")
    public static long field2113 = 0L;

    @OriginalMember(owner = "client!ki", name = "ab", descriptor = "Ldj;")
    private static class44 field2110 = class89.method650(255, " has logged out)3");

    @OriginalMember(owner = "client!ki", name = "V", descriptor = "Ldj;")
    public static class44 field2105 = field2110;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!ki", name = "W", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!ki", name = "Z", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!ki", name = "bb", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!ki", name = "cb", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "Lve;")
    public static class225 field2100;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (arg2 != 68) {
            field2106 = 17;
        }
        ++field2112;
        if (~arg1 == -1) {
            super.field1599 = arg0.method506(255) == 1;
        }
    }

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "(I)I")
    public static final int method823(int arg0) {
        ++field2109;
        if (class32.field565 == 3.0D) {
            return 37;
        } else if (class32.field565 == 4.0D) {
            return 50;
        } else if (class32.field565 == 6.0D) {
            return 75;
        } else {
            if (arg0 != -5827) {
                field2110 = null;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V")
    public static void method824(byte arg0) {
        field2110 = null;
        field2104 = null;
        if (arg0 <= 46) {
            field2108 = -65;
        }
        field2105 = null;
        field2100 = null;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    public class118() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(III)V")
    private final void method825(int arg0, int arg1, int arg2) {
        ++field2101;
        if (arg0 > 41) {
            int var4 = class212.field3809[arg2];
            int var5 = class49.field912[arg1];
            float var6 = (float) Math.atan2((double) (var5 + -2048), (double) (var4 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class143.field2546 = arg1;
                class188.field3255 = arg2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class188.field3255 = arg1;
                class143.field2546 = arg2;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class143.field2546 = -arg2 + class129.field2287;
                class188.field3255 = arg1;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class143.field2546 = arg1;
                class188.field3255 = -arg2 + client.field609;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class143.field2546 = -arg1 + class129.field2287;
                class188.field3255 = client.field609 - arg2;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class188.field3255 = client.field609 - arg1;
                class143.field2546 = class129.field2287 - arg2;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class143.field2546 = arg2;
                class188.field3255 = -arg1 + client.field609;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class188.field3255 = arg2;
                class143.field2546 = class129.field2287 - arg1;
            }
            class143.field2546 &= class53.field943;
            class188.field3255 &= class101.field1850;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        int[] var3 = super.field1595.method603(true, arg1);
        if (super.field1595.field1538) {
            for (int var4 = 0; class129.field2287 > var4; ++var4) {
                this.method825(108, var4, arg1);
                int[] var5 = this.method620(2652, class188.field3255, 0);
                var3[var4] = var5[class143.field2546];
            }
        }
        if (arg0 != 25238) {
            field2100 = null;
        }
        ++field2102;
        return var3;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        int[][] var3 = super.field1601.method548(arg1, true);
        if (super.field1601.field1343) {
            int[] var4 = var3[2];
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            for (int var7 = 0; ~var7 > ~class129.field2287; ++var7) {
                this.method825(110, var7, arg1);
                int[][] var8 = this.method619(class188.field3255, true, 0);
                var5[var7] = var8[0][class143.field2546];
                var6[var7] = var8[1][class143.field2546];
                var4[var7] = var8[2][class143.field2546];
            }
        }
        if (arg0 > -59) {
            this.method3(-43, -94);
        }
        ++field2111;
        return var3;
    }
}
