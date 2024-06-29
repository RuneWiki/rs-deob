import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class174 extends class138 {

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    private final int field3118;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    private final int field3132;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    private final int field3130;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    private final int field3135;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field3121 = 0;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field3125 = -1;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "Lvf;")
    public static class265 field3128 = class87.method582(-46, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lvf;")
    private static class265 field3117 = class87.method582(-46, "flash2:");

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "Lvf;")
    public static class265 field3120 = field3117;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "Lvf;")
    public static class265 field3133 = field3117;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "[[Z")
    public static boolean[][] field3116;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(III)V")
    public static final void method1140(int arg0, int arg1, int arg2) {
        ++field3124;
        class178 var3 = class188.method1282(arg2, 13, 261360480);
        if (arg0 > 10) {
            var3.method1162(true);
            var3.field3172 = arg1;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static void method1141(byte arg0) {
        field3133 = null;
        field3117 = null;
        field3128 = null;
        field3116 = null;
        int var1 = 121 / ((-30 - arg0) / 40);
        field3120 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)Lt;")
    public static final class216 method1142(int arg0, boolean arg1) {
        ++field3126;
        class216 var2 = (class216) class213.field3820.method1887(126, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class123.field2212.method1332(true, class135.method931(arg0, -110), class169.method1114((byte) 79, arg0));
            class216 var4 = new class216();
            if (arg1) {
                field3125 = -51;
            }
            if (var3 != null) {
                var4.method1490(new class135(var3), -6748);
            }
            var4.method1482(-2621);
            class213.field3820.method1892(var4, (long) arg0, (byte) -123);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIIII)V")
    public class174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3118 = arg2;
        this.field3132 = arg1;
        this.field3130 = arg0;
        this.field3135 = arg3;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZ)V")
    public final void method378(int arg0, int arg1, boolean arg2) {
        ++field3134;
        if (arg2) {
            field3117 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method1143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field3129;
        int var11 = -arg2 + arg7;
        int var12 = -arg9 + arg8;
        boolean var13;
        if (~class8.field274 < -1 && class8.field274 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg10;
        int var15 = 983040 / arg3;
        int var16 = -var14;
        int var17 = -72 / ((-84 - arg6) / 33);
        while (~(var12 - -var14) < ~var16) {
            int var19 = (var16 + 1) * arg10 + arg0 >> 16;
            int var20 = arg10 * var16 + arg0 >> 16;
            int var21 = -var20 + var19;
            if (var21 > 0) {
                int var10000 = arg1 + var19;
                int var23 = arg1 + var20;
                int var24 = arg9 + var16 >> 6;
                if (var24 >= 0 && var24 <= class177.field3162.length + -1) {
                    int[][] var25 = class177.field3162[var24];
                    for (int var26 = -var15; ~var26 > ~(var11 + var15); ++var26) {
                        int var27 = (var26 + 1) * arg3 + arg5 >> 16;
                        int var28 = arg3 * var26 + arg5 >> 16;
                        int var29 = -var28 + var27;
                        if (~var29 < -1) {
                            int var30 = arg2 + var26 >> 6;
                            var10000 = arg4 + var27;
                            int var32 = arg4 + var28;
                            if (~var30 <= -1 && var25.length + -1 >= var30 && var25[var30] != null) {
                                int var33 = ((63 & var26 - -arg2) << 6) + (63 & arg9 + var16);
                                int var34 = var25[var30][var33];
                                if (var34 != 0) {
                                    class130 var35 = class84.method574(-126, var34 + -1);
                                    if (!class246.field4282[var35.field2317]) {
                                        if (var13 && ~class260.field4480 == ~var35.field2317) {
                                            class79 var36 = new class79();
                                            var36.field1505 = var35.field2317;
                                            var36.field1498 = var23;
                                            var36.field1499 = var32;
                                            class56.field1141.method785(var36, -29);
                                        } else {
                                            class6.field170[var35.field2317].method585(var23 + -7, var32 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ++var16;
        }
        for (class79 var18 = (class79) class56.field1141.method789((byte) -61); var18 != null; var18 = (class79) class56.field1141.method787((byte) -76)) {
            class6.field170[var18.field1505].method585(var18.field1498 + -7, var18.field1499 + -7);
            class35.method286(var18.field1498, var18.field1499, 15, 16776960, 128);
            class35.method286(var18.field1498, var18.field1499, 7, 16777215, 256);
        }
        class56.field1141.method791(114);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V")
    public final void method380(int arg0, int arg1, int arg2) {
        ++field3119;
        int var4 = this.field3130 * arg0 >> 12;
        if (arg1 != 10) {
            method1143(98, -69, 91, 109, -62, 95, -86, -29, 69, -64, -55);
        }
        int var5 = this.field3118 * arg0 >> 12;
        int var6 = this.field3132 * arg2 >> 12;
        int var7 = this.field3135 * arg2 >> 12;
        class202.method1384(var4, var5, 45443148, super.field2527, var6, var7);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public static final void method1144(int arg0) {
        if (arg0 != -5436) {
            field3120 = null;
        }
        ++field3122;
        class52.field1085.method1893(arg0 ^ 5417);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBI)V")
    public final void method375(int arg0, byte arg1, int arg2) {
        if (arg1 >= -21) {
            method1140(30, 41, -30);
        }
        ++field3123;
    }
}
