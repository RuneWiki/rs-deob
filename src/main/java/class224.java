import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class224 extends class104 {

    @OriginalMember(owner = "client!gj", name = "Z", descriptor = "Ljava/lang/Object;")
    private Object field3769;

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "Lia;")
    public static class257 field3762 = class28.method234(-35, ":duelstake:");

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "Lia;")
    public static class257 field3767 = class28.method234(-36, " loggt sich aus)3");

    @OriginalMember(owner = "client!gj", name = "ab", descriptor = "Lia;")
    private static class257 field3770 = class28.method234(-100, "white:");

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "Lia;")
    public static class257 field3761 = field3770;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "Lia;")
    public static class257 field3764 = field3770;

    @OriginalMember(owner = "client!gj", name = "db", descriptor = "Lia;")
    public static class257 field3773 = class28.method234(-104, "::qa_op_test");

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!gj", name = "bb", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!gj", name = "cb", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(B)V")
    public static final void method1469(byte arg0) {
        class226.field3800 = 0;
        field3771++;
        int var1 = (class137.field2441.field4143 >> 7) + class231.field3878;
        int var2 = (class137.field2441.field4177 >> 7) + class244.field4232;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class226.field3800 = 1;
        }
        if (arg0 != -38) {
            return;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class226.field3800 = 1;
        }
        if (class226.field3800 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class226.field3800 = 0;
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method752(byte arg0) {
        field3768++;
        int var2 = -62 / ((-arg0 - 21) / 63);
        return this.field3769;
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V")
    public static void method1470(int arg0) {
        field3761 = null;
        field3773 = null;
        field3764 = null;
        field3770 = null;
        field3767 = null;
        if (arg0 < -101) {
            field3762 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field3772++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = arg5 - arg4;
        int var11 = 0;
        int var12 = arg0 - arg4;
        int var13 = arg5 * arg5;
        int var14 = arg0 * arg0;
        int var15 = var10 * var10;
        if (arg6 > -84) {
            return;
        }
        int var16 = var14 << 1;
        int var17 = var12 * var12;
        int var18 = var13 << 1;
        int var19 = var17 << 1;
        int var20 = var15 << 1;
        int var21 = var12 << 1;
        int var22 = arg0 << 1;
        int var23 = (1 - var22) * var13 + var16;
        int var24 = (1 - var21) * var15 + var19;
        int var25 = var14 - ((var22 - 1) * var18);
        int var26 = var17 - ((var21 - 1) * var20);
        int var27 = var14 << 2;
        int var28 = var17 << 2;
        int var29 = var15 << 2;
        int var30 = (var22 - 3) * var18;
        int var31 = var13 << 2;
        int var32 = var19 * 3;
        int var33 = var16 * 3;
        int var34 = (var21 - 3) * var20;
        int var35 = var27;
        int var36 = (var12 - 1) * var29;
        int[] var37 = class185.field3220[arg3];
        class94.method692(var37, (byte) 78, arg1 - arg5, arg2, arg1 - var10);
        class94.method692(var37, (byte) -127, arg1 - var10, arg7, arg1 + var10);
        class94.method692(var37, (byte) -123, arg1 + var10, arg2, arg1 + arg5);
        int var38 = (arg0 - 1) * var31;
        int var39 = var28;
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var23 += var33;
                    var25 += var35;
                    var35 += var27;
                    var33 += var27;
                }
            }
            if (var25 < 0) {
                var8++;
                var23 += var33;
                var33 += var27;
                var25 += var35;
                var35 += var27;
            }
            var9--;
            var23 += -var38;
            var25 += -var30;
            var38 -= var31;
            int var41 = arg1 + var8;
            int var42 = arg1 - var8;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var11++;
                        var24 += var32;
                        var32 += var28;
                        var26 += var39;
                        var39 += var28;
                    }
                }
                if (var26 < 0) {
                    var11++;
                    var26 += var39;
                    var39 += var28;
                    var24 += var32;
                    var32 += var28;
                }
                var24 += -var36;
                var26 += -var34;
                var34 -= var29;
                var36 -= var29;
            }
            int var43 = arg3 + var9;
            var30 -= var31;
            int var44 = arg3 - var9;
            if (var40) {
                int var45 = arg1 - var11;
                int var46 = arg1 + var11;
                class94.method692(class185.field3220[var44], (byte) 79, var42, arg2, var45);
                class94.method692(class185.field3220[var44], (byte) -126, var45, arg7, var46);
                class94.method692(class185.field3220[var44], (byte) -14, var46, arg2, var41);
                class94.method692(class185.field3220[var43], (byte) 18, var42, arg2, var45);
                class94.method692(class185.field3220[var43], (byte) 116, var45, arg7, var46);
                class94.method692(class185.field3220[var43], (byte) -123, var46, arg2, var41);
            } else {
                class94.method692(class185.field3220[var44], (byte) 82, var42, arg2, var41);
                class94.method692(class185.field3220[var43], (byte) -7, var42, arg2, var41);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)Z")
    public final boolean method755(byte arg0) {
        if (arg0 > -9) {
            field3773 = null;
        }
        field3763++;
        return false;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class224(Object arg0) {
        this.field3769 = arg0;
    }
}
