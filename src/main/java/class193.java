import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class193 extends class381 {

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public int field2776;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field2778 = 0;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "[I")
    public static int[] field2775;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
    public static final void method1382(int arg0) {
        class151.field2308.method2539(116);
        if (arg0 == 0) {
            field2774++;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BZ)I")
    public static final int method1383(byte arg0, boolean arg1) {
        if (arg0 >= -56) {
            return -113;
        }
        field2780++;
        long var2 = class108.method902((byte) -93);
        for (class60 var4 = arg1 ? (class60) class184.field2671.method608(118) : (class60) class184.field2671.method606((byte) 90); var4 != null; var4 = (class60) class184.field2671.method606((byte) 83)) {
            if ((var4.field937 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field937 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field5349;
                    class414.field5782[var5] = class125.field1744[var5];
                    var4.method2367(5);
                    return var5;
                }
                var4.method2367(5);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
    public static void method1384(int arg0) {
        int var1 = 100 / ((arg0 + 15) / 32);
        field2775 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2781++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg0 - arg7;
        int var12 = arg4 - arg7;
        int var13 = arg0 * arg0;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg4 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class186.field2697[arg5];
        class396.method2436(-1070, arg2, arg1 - arg0, var39, arg1 - var11);
        class396.method2436(-1070, arg3, arg1 - var11, var39, arg1 + var11);
        class396.method2436(-1070, arg2, arg1 + var11, var39, arg1 + arg0);
        int var40 = 76 / ((33 - arg6) / 58);
        while (var9 > 0) {
            boolean var41 = var12 >= var9;
            if (var41) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var8++;
                var35 += var28;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var42 = arg5 - var9;
            int var43 = arg5 + var9;
            int var44 = arg1 + var8;
            int var45 = arg1 - var8;
            if (var41) {
                int var46 = arg1 + var10;
                int var47 = arg1 - var10;
                class396.method2436(-1070, arg2, var45, class186.field2697[var42], var47);
                class396.method2436(-1070, arg3, var47, class186.field2697[var42], var46);
                class396.method2436(-1070, arg2, var46, class186.field2697[var42], var44);
                class396.method2436(-1070, arg2, var45, class186.field2697[var43], var47);
                class396.method2436(-1070, arg3, var47, class186.field2697[var43], var46);
                class396.method2436(-1070, arg2, var46, class186.field2697[var43], var44);
            } else {
                class396.method2436(-1070, arg2, var45, class186.field2697[var42], var44);
                class396.method2436(-1070, arg2, var45, class186.field2697[var43], var44);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1386(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field2777++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg1 * arg1;
        int var9 = arg5 * arg5;
        int var10 = 66 % ((arg4 + 74) / 39);
        int var11 = var9 << 1;
        int var12 = var8 << 1;
        int var13 = arg5 << 1;
        int var14 = (1 - var13) * var8 + var11;
        int var15 = var9 - ((var13 - 1) * var12);
        int var16 = var8 << 2;
        int var17 = var9 << 2;
        int var18 = ((var6 << 1) + 3) * var11;
        int var19 = ((arg5 << 1) - 3) * var12;
        int var20 = (var6 + 1) * var17;
        class396.method2436(-1070, arg2, arg3 - arg1, class186.field2697[arg0], arg3 + arg1);
        int var21 = (arg5 - 1) * var16;
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var15 += var20;
                    var14 += var18;
                    var20 += var17;
                    var6++;
                    var18 += var17;
                }
            }
            if (var15 < 0) {
                var14 += var18;
                var15 += var20;
                var6++;
                var18 += var17;
                var20 += var17;
            }
            var15 += -var19;
            var14 += -var21;
            var7--;
            var21 -= var16;
            var19 -= var16;
            int var22 = arg0 - var7;
            int var23 = arg0 + var7;
            int var24 = arg3 + var6;
            int var25 = arg3 - var6;
            class396.method2436(-1070, arg2, var25, class186.field2697[var22], var24);
            class396.method2436(-1070, arg2, var25, class186.field2697[var23], var24);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;IZB)Z")
    public static final boolean method1387(String arg0, int arg1, boolean arg2, byte arg3) {
        field2773++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        if (arg3 != -41) {
            field2778 = 9;
        }
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg1) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if ((var10 / arg1) != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class193() {
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V")
    public class193(int arg0) {
        this.field2776 = arg0;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
    public static final void method1388(int arg0) {
        class210.field2929.method2533(arg0);
        field2779++;
        class286.field3833.method2533(arg0);
    }
}
