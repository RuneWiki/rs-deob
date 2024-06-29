import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class766 {

    @OriginalMember(owner = "client!it", name = "d", descriptor = "Luf;")
    public static class519 field10586 = null;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "Lup;")
    public static class547 field10585 = new class547();

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field10583;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field10587;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field10588;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    public static int field10589;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "I")
    public static int field10590;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field10593;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "I")
    public static int field10594;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "I")
    public static int field10595;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "J")
    public long field10592;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "Lit;")
    public class766 field10584;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "Lit;")
    public class766 field10591;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIII)V", line = 3)
    public static final void method4231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field10587++;
        class251.method1664(arg3 + 51, arg6);
        int var7 = 0;
        int var8 = arg6 - arg0;
        if (~var8 > arg3) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class515.field7102 <= arg5 && arg5 <= class698.field9801) {
            int[] var15 = class74.field1144[arg5];
            int var16 = class645.method3656(class435.field6058, class742.field10301, arg1 - arg6, 26289);
            int var17 = class645.method3656(class435.field6058, class742.field10301, arg1 + arg6, 26289);
            int var18 = class645.method3656(class435.field6058, class742.field10301, arg1 - var8, 26289);
            int var19 = class645.method3656(class435.field6058, class742.field10301, arg1 + var8, 26289);
            class379.method2284(var16, var18, var15, arg2, 2);
            class379.method2284(var18, var19, var15, arg4, 2);
            class379.method2284(var19, var17, var15, arg2, 2);
        }
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class691.field9751[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg5 - var9;
                int var21 = arg5 + var9;
                if (var21 >= class515.field7102 && var20 <= class698.field9801) {
                    if (var9 < var8) {
                        int var22 = class691.field9751[var9];
                        int var23 = class645.method3656(class435.field6058, class742.field10301, arg1 + var7, 26289);
                        int var24 = class645.method3656(class435.field6058, class742.field10301, arg1 - var7, arg3 + 26290);
                        int var25 = class645.method3656(class435.field6058, class742.field10301, arg1 + var22, 26289);
                        int var26 = class645.method3656(class435.field6058, class742.field10301, arg1 - var22, 26289);
                        if (var21 <= class698.field9801) {
                            int[] var27 = class74.field1144[var21];
                            class379.method2284(var24, var26, var27, arg2, arg3 ^ 0xFFFFFFFD);
                            class379.method2284(var26, var25, var27, arg4, 2);
                            class379.method2284(var25, var23, var27, arg2, arg3 + 3);
                        }
                        if (var20 >= class515.field7102) {
                            int[] var28 = class74.field1144[var20];
                            class379.method2284(var24, var26, var28, arg2, 2);
                            class379.method2284(var26, var25, var28, arg4, 2);
                            class379.method2284(var25, var23, var28, arg2, 2);
                        }
                    } else {
                        int var29 = class645.method3656(class435.field6058, class742.field10301, arg1 + var7, 26289);
                        int var30 = class645.method3656(class435.field6058, class742.field10301, arg1 - var7, 26289);
                        if (var21 <= class698.field9801) {
                            class379.method2284(var30, var29, class74.field1144[var21], arg2, arg3 ^ 0xFFFFFFFD);
                        }
                        if (class515.field7102 <= var20) {
                            class379.method2284(var30, var29, class74.field1144[var20], arg2, arg3 ^ 0xFFFFFFFD);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (class515.field7102 <= var32 && class698.field9801 >= var31) {
                int var33 = arg1 + var9;
                int var34 = arg1 - var9;
                if (var33 >= class742.field10301 && class435.field6058 >= var34) {
                    int var35 = class645.method3656(class435.field6058, class742.field10301, var33, 26289);
                    int var36 = class645.method3656(class435.field6058, class742.field10301, var34, 26289);
                    if (var8 > var7) {
                        int var37 = var11 < var7 ? class691.field9751[var7] : var11;
                        int var38 = class645.method3656(class435.field6058, class742.field10301, arg1 + var37, 26289);
                        int var39 = class645.method3656(class435.field6058, class742.field10301, arg1 - var37, 26289);
                        if (class698.field9801 >= var32) {
                            int[] var40 = class74.field1144[var32];
                            class379.method2284(var36, var39, var40, arg2, arg3 + 3);
                            class379.method2284(var39, var38, var40, arg4, 2);
                            class379.method2284(var38, var35, var40, arg2, arg3 ^ 0xFFFFFFFD);
                        }
                        if (var31 >= class515.field7102) {
                            int[] var41 = class74.field1144[var31];
                            class379.method2284(var36, var39, var41, arg2, 2);
                            class379.method2284(var39, var38, var41, arg4, 2);
                            class379.method2284(var38, var35, var41, arg2, 2);
                        }
                    } else {
                        if (class698.field9801 >= var32) {
                            class379.method2284(var36, var35, class74.field1144[var32], arg2, 2);
                        }
                        if (class515.field7102 <= var31) {
                            class379.method2284(var36, var35, class74.field1144[var31], arg2, 2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "(B)V", line = 190)
    public static void method4232(byte arg0) {
        field10585 = null;
        int var1 = 34 % ((arg0 + 50) / 44);
        field10586 = null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IBI)Z", line = 200)
    public static final boolean method4233(int arg0, byte arg1, int arg2) {
        field10583++;
        if (arg1 != -86) {
            method4234((byte) 4);
        }
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!it", name = "e", descriptor = "(B)V", line = 211)
    public static final void method4234(byte arg0) {
        field10594++;
        if (class686.field9702 != null) {
            if (class593.field8489) {
                class309.method1900(-12053);
            }
            class316.field4495.method4018((byte) 73);
            class647.method3663();
            class726.method4025(false);
            class364.method2190(-28517);
            class446.method2644(0);
            class265.method1705((byte) -104);
            if (class283.field4157 != null) {
                class283.field4157.method2322((byte) -122);
            }
            class469.method2738(2);
            class727.method4035(-43);
            class368.method2201((byte) -126);
            class322.method1948(false);
            class180.method1313(false, 25932);
            for (int var1 = 0; var1 < 2048; var1++) {
                class21 var5 = class588.field8451[var1];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field4143.length; var6++) {
                        var5.field4143[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class51.field731; var2++) {
                class506 var3 = class654.field9252[var2].field9191;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4143.length; var4++) {
                        var3.field4143[var4] = null;
                    }
                }
            }
            class390.field5441 = null;
            class443.field6148 = null;
            class686.field9702.method2779((byte) 26);
            class686.field9702 = null;
        }
        if (arg0 >= -56) {
            field10585 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(I)Z", line = 291)
    public final boolean method4235(int arg0) {
        field10589++;
        if (this.field10584 == null) {
            return false;
        } else if (arg0 > -126) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)V", line = 307)
    public static final void method4236(byte arg0, int arg1) {
        class100.field1486.method2888(arg1, 125);
        if (arg0 >= 97) {
            field10588++;
        }
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "(I)V", line = 320)
    public final void method4237(int arg0) {
        field10593++;
        if (arg0 != -1) {
            this.field10592 = -18L;
        }
        if (this.field10584 != null) {
            this.field10584.field10591 = this.field10591;
            this.field10591.field10584 = this.field10584;
            this.field10584 = null;
            this.field10591 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "e", descriptor = "(I)Lo;", line = 341)
    public static final class210 method4238(int arg0) {
        field10595++;
        try {
            return (class210) Class.forName("ej").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            if (arg0 < 61) {
                method4238(123);
            }
            return new class299();
        }
    }
}
