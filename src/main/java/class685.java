import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class685 {

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Lda;")
    public class402 field9519 = null;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Lej;")
    public class179 field9523 = null;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "[Lsg;")
    public static class17[] field9522 = new class17[37];

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field9518;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field9521;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lefa;")
    public static class531 field9520;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIII)Z", line = 6)
    public static final boolean method3858(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9518++;
        if (!class762.field10630 || !class280.field4072) {
            return false;
        } else if (class527.field7314 < 100) {
            return false;
        } else if (arg4 != 1) {
            return false;
        } else if (class409.method2565(arg1, arg3, arg2, 0)) {
            int var5 = arg2 << class371.field5241;
            int var6 = arg1 << class371.field5241;
            if (class450.method2756(1820, class368.field5213, arg0, var6, class368.field5213, class433.field6043[arg3].method2171(arg1, arg2, arg4 + 30), var5)) {
                class78.field1129++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 38)
    public static final void method3859(int arg0) {
        field9521++;
        for (int var1 = 0; var1 < class726.field10070; var1++) {
            class625.field8414[var1] = null;
        }
        class726.field10070 = 0;
        for (int var2 = 0; var2 < class370.field5229; var2++) {
            for (int var42 = 0; var42 < class61.field877; var42++) {
                for (int var43 = 0; var43 < class713.field9959; var43++) {
                    class262 var44 = class137.field1948[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field3851 > 0) {
                            var44.field3851 = (short) (var44.field3851 * -1);
                        }
                        if (var44.field3840 > 0) {
                            var44.field3840 = (short) (var44.field3840 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class370.field5229; var3++) {
            for (int var4 = 0; var4 < class61.field877; var4++) {
                for (int var5 = 0; var5 < class713.field9959; var5++) {
                    class262 var6 = class137.field1948[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class137.field1948[0][var5][var4] != null && class137.field1948[0][var5][var4].field3847 != null;
                        if (var6.field3840 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class262 var12 = class137.field1948[var3][var5][var4 - 1];
                            int var13 = class550.field7649[var3].method2171(var4, var5, arg0 - 21507);
                            while (var8 > 0 && var12 != null && var12.field3840 < 0 && var6.field3840 == var12.field3840 && var6.field3843 == var12.field3843 && var13 == class550.field7649[var3].method2171(var8 - 1, var5, 31) && ((var8 - 1) <= 0 || var13 == class550.field7649[var3].method2171(var8 - 2, var5, arg0 - 21507))) {
                                var8--;
                                var12 = class137.field1948[var3][var5][var8 - 1];
                            }
                            for (class262 var14 = class137.field1948[var3][var5][var4 + 1]; var9 < class713.field9959 && var14 != null && var14.field3840 < 0 && var6.field3840 == var14.field3840 && var6.field3843 == var14.field3843 && class550.field7649[var3].method2171(var9 + 1, var5, 31) == var13 && (class713.field9959 <= (var9 + 1) || class550.field7649[var3].method2171(var9 + 2, var5, arg0 - 21507) == var13); var14 = class137.field1948[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class550.field7649[var7 ? var3 + 1 : var3].method2171(var8, var5, arg0 ^ 0x543D);
                            int var17 = var6.field3840 * var15 + var16;
                            int var18 = class550.field7649[var7 ? var3 + 1 : var3].method2171(var9 + 1, var5, 31);
                            int var19 = var6.field3840 * var15 + var18;
                            int var20 = var5 << class371.field5241;
                            int var21 = var8 << class371.field5241;
                            int var22 = (var9 << class371.field5241) + class368.field5213;
                            class625.field8414[class726.field10070++] = new class616(1, var3, var6.field3843 + var20, var6.field3843 + var20, var6.field3843 + var20, var6.field3843 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class137.field1948[var23][var5][var24].field3840 = (short) (class137.field1948[var23][var5][var24].field3840 * -1);
                                }
                            }
                        }
                        if (var6.field3851 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class262 var29 = class137.field1948[var3][var5 - 1][var4];
                            int var30 = class550.field7649[var3].method2171(var4, var5, 31);
                            while (var25 > 0 && var29 != null && var29.field3851 < 0 && var6.field3851 == var29.field3851 && var6.field3849 == var29.field3849 && var30 == class550.field7649[var3].method2171(var4, var25 - 1, 31) && (var25 - 1 <= 0 || class550.field7649[var3].method2171(var4, var25 - 2, 31) == var30)) {
                                var25--;
                                var29 = class137.field1948[var3][var25 - 1][var4];
                            }
                            for (class262 var31 = class137.field1948[var3][var5 + 1][var4]; class61.field877 > var26 && var31 != null && var31.field3851 < 0 && var6.field3851 == var31.field3851 && var6.field3849 == var31.field3849 && var30 == class550.field7649[var3].method2171(var4, var26 + 1, 31) && (class61.field877 <= (var26 + 1) || class550.field7649[var3].method2171(var4, var26 + 2, 31) == var30); var31 = class137.field1948[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class550.field7649[var7 ? var3 + 1 : var3].method2171(var4, var25, arg0 ^ 0x543D);
                            int var34 = var6.field3851 * var32 + var33;
                            int var35 = class550.field7649[var7 ? var3 + 1 : var3].method2171(var4, var26 + 1, arg0 ^ 0x543D);
                            int var36 = var6.field3851 * var32 + var35;
                            int var37 = var25 << class371.field5241;
                            int var38 = (var26 << class371.field5241) + class368.field5213;
                            int var39 = var4 << class371.field5241;
                            class625.field8414[class726.field10070++] = new class616(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var6.field3849 + var39, var6.field3849 + var39, var6.field3849 + var39, var6.field3849 + var39);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class137.field1948[var40][var41][var4].field3851 = (short) (class137.field1948[var40][var41][var4].field3851 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 == 21538) {
            class491.field6907 = true;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 264)
    public static void method3860(int arg0) {
        field9522 = null;
        field9520 = null;
        if (arg0 > -103) {
            method3858(28, 52, 107, -123, -77);
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lda;)V", line = 285)
    public class685(class402 arg0) {
        this.field9519 = arg0;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lda;Lej;)V", line = 292)
    public class685(class402 arg0, class179 arg1) {
        this.field9519 = arg0;
        this.field9523 = arg1;
    }
}
