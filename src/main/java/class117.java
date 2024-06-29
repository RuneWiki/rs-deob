import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class117 extends class88 {

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "Lcl;")
    public class101 field1657;

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "I")
    public static int field1656 = 0;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "[I")
    public static int[] field1661 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field1659 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "Z")
    public static boolean field1665 = false;

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "[I")
    public static int[] field1662;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "[S")
    public static short[] field1660;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "[[[B")
    public static byte[][][] field1664;

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lcl;)V")
    public class117(class101 arg0) {
        this.field1657 = arg0;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZIIIIIIZ)V")
    public static final void method757(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field1666++;
        if (!arg7 && class83.field1030 == arg3 && class118.field1674 == arg5 && class126.field2025 == arg6 || class226.method1599((byte) 97)) {
            return;
        }
        class126.field2025 = arg6;
        class118.field1674 = arg5;
        class83.field1030 = arg3;
        if (class226.method1599((byte) 92)) {
            class126.field2025 = 0;
        }
        if (arg0) {
            class2.method13(false, 28);
        } else {
            class2.method13(false, 25);
        }
        class210.method1478(true, class62.field813, (byte) -68);
        int var8 = class181.field2883;
        int var9 = class167.field2683;
        class167.field2683 = (arg3 - 6) * 8;
        class181.field2883 = (arg5 - 6) * 8;
        class228.field3686 = class56.method313(class118.field1674 * 8, 15, class83.field1030 * 8);
        int var10 = class167.field2683 - var9;
        int var11 = class181.field2883 - var8;
        int var12 = class181.field2883;
        int var13 = class167.field2683;
        class289.field4609 = null;
        if (arg0) {
            class134.field2122 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class200 var33 = class265.field4273[var17];
                if (var33 != null) {
                    var33.field3818 -= var10 * 128;
                    var33.field3820 -= var11 * 128;
                    if (var33.field3818 >= 0 && var33.field3818 <= 13184 && var33.field3820 >= 0 && var33.field3820 <= 13184) {
                        for (int var34 = 0; var34 < 10; var34++) {
                            var33.field3829[var34] -= var10;
                            var33.field3836[var34] -= var11;
                        }
                        class11.field121[class134.field2122++] = var17;
                    } else {
                        class265.field4273[var17].method1396((byte) 119, (class188) null);
                        class265.field4273[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class200 var15 = class265.field4273[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field3829[var16] -= var10;
                        var15.field3836[var16] -= var11;
                    }
                    var15.field3820 -= var11 * 128;
                    var15.field3818 -= var10 * 128;
                }
            }
        }
        if (arg4 > -1) {
            method757(false, -110, 8, -18, 90, 103, 118, false);
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class259 var31 = class89.field1113[var18];
            if (var31 != null) {
                for (int var32 = 0; var32 < 10; var32++) {
                    var31.field3829[var32] -= var10;
                    var31.field3836[var32] -= var11;
                }
                var31.field3820 -= var11 * 128;
                var31.field3818 -= var10 * 128;
            }
        }
        class244.field4011 = arg6;
        class286.field4571.method1768(arg1, false, 121, arg2);
        byte var19 = 0;
        byte var20 = 104;
        byte var21 = 0;
        byte var22 = 1;
        byte var23 = 1;
        if (var10 < 0) {
            var22 = -1;
            var20 = -1;
            var19 = 103;
        }
        byte var24 = 104;
        if (var11 < 0) {
            var24 = -1;
            var23 = -1;
            var21 = 103;
        }
        for (int var25 = var19; var25 != var20; var25 += var22) {
            for (int var27 = var21; var27 != var24; var27 += var23) {
                int var28 = var11 + var27;
                int var29 = var10 + var25;
                for (int var30 = 0; var30 < 4; var30++) {
                    if (var29 >= 0 && var28 >= 0 && var29 < 104 && var28 < 104) {
                        class206.field3296[var30][var25][var27] = class206.field3296[var30][var29][var28];
                    } else {
                        class206.field3296[var30][var25][var27] = null;
                    }
                }
            }
        }
        for (class220 var26 = (class220) class24.field339.method1802(43); var26 != null; var26 = (class220) class24.field339.method1815(0)) {
            var26.field3517 -= var10;
            var26.field3523 -= var11;
            if (var26.field3517 < 0 || var26.field3523 < 0 || var26.field3517 >= 104 || var26.field3523 >= 104) {
                var26.method1673(14510);
            }
        }
        if (class233.field3856 != 0) {
            class233.field3856 -= var10;
            class91.field1135 -= var11;
        }
        class288.field4599 = 0;
        class264.field4260 = -1;
        if (arg0) {
            class74.field932 -= var10 * 128;
            class148.field2322 -= var10;
            class191.field3085 -= var11;
            class41.field507 -= var10;
            class67.field849 -= var11;
            class36.field465 -= var11 * 128;
        } else {
            class283.field4513 = 1;
        }
        class272.field4346.method1805(-729782270);
        class196.field3122.method1805(-729782270);
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)V")
    public static void method758(int arg0) {
        if (arg0 >= -101) {
            method757(true, -73, -100, 79, 40, -62, 25, false);
        }
        field1659 = null;
        field1664 = null;
        field1661 = null;
        field1662 = null;
        field1660 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII)V")
    public static final void method759(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1663++;
        int var5 = arg1;
        int var6 = -1;
        int var7 = arg0;
        class78.method433(arg0 + arg2, -arg0 + arg2, class14.field186[arg4], arg3, (byte) 123);
        int var8 = -arg0;
        while (var7 > var5) {
            var6 += 2;
            var5++;
            var8 += var6;
            if (var8 >= 0) {
                var7--;
                var8 -= var7 << 1;
                int[] var9 = class14.field186[arg4 + var7];
                int var10 = arg2 + var5;
                int var11 = arg2 - var5;
                int[] var12 = class14.field186[arg4 - var7];
                class78.method433(var10, var11, var9, arg3, (byte) 123);
                class78.method433(var10, var11, var12, arg3, (byte) 123);
            }
            int var13 = arg2 - var7;
            int var14 = arg2 + var7;
            int[] var15 = class14.field186[arg4 + var5];
            int[] var16 = class14.field186[arg4 - var5];
            class78.method433(var14, var13, var15, arg3, (byte) 123);
            class78.method433(var14, var13, var16, arg3, (byte) 123);
        }
    }
}
