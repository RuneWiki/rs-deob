import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class24 {

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Lma;")
    private static class5 field410 = class12.method119("RuneScape is loading )2 please wait)3)3)3", (byte) 96);

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "Lma;")
    public static class5 field414 = field410;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field416 = 0;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "[I")
    public static int[] field411 = new int[50];

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Lma;")
    public static class5 field413 = null;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field415 = 99;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Ltj;")
    public static class73 field412 = new class73(5);

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "Lma;")
    private static class5 field421 = class12.method119("wave:", (byte) 110);

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "J")
    public static long field420 = 0L;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "Lma;")
    public static class5 field419 = field421;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Lma;")
    public static class5 field418 = field421;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "Lbf;")
    public static class209 field422 = new class209(4096);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIIZI)V", line = 15)
    public static final void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        for (int var9 = 0; var9 < class46.field704.field403; var9++) {
            int var10 = class289.field4918 + class97.field1460 - class46.field704.field395[var9] - 1;
            int var11 = class46.field704.field396[var9] - class206.field3284;
            int var12 = arg4 + ((var11 - arg1) * (arg2 - arg4) / (arg8 - arg1));
            int var13 = 16777215;
            int var14 = class46.field704.method185(var9, -18321);
            class295 var15 = null;
            if (var14 == 0) {
                if ((double) class98.field1473 == 3.0D) {
                    var15 = class70.field1112;
                }
                if ((double) class98.field1473 == 4.0D) {
                    var15 = class50.field787;
                }
                if ((double) class98.field1473 == 6.0D) {
                    var15 = class69.field1090;
                }
                if ((double) class98.field1473 == 8.0D) {
                    var15 = class86.field1307;
                }
            }
            int var16 = arg5 + ((var10 - arg3) * (arg6 - arg5) / (arg0 - arg3));
            if (var14 == 1) {
                if ((double) class98.field1473 == 3.0D) {
                    var15 = class69.field1090;
                }
                if ((double) class98.field1473 == 4.0D) {
                    var15 = class86.field1307;
                }
                if ((double) class98.field1473 == 6.0D) {
                    var15 = class236.field3905;
                }
                if ((double) class98.field1473 == 8.0D) {
                    var15 = class274.field4678;
                }
            }
            if (var14 == 2) {
                if ((double) class98.field1473 == 3.0D) {
                    var15 = class236.field3905;
                }
                var13 = 16755200;
                if ((double) class98.field1473 == 4.0D) {
                    var15 = class274.field4678;
                }
                if ((double) class98.field1473 == 6.0D) {
                    var15 = class167.field2551;
                }
                if ((double) class98.field1473 == 8.0D) {
                    var15 = class96.field1433;
                }
            }
            if (class46.field704.field398[var9] != -1) {
                var13 = class46.field704.field398[var9];
            }
            if (var15 != null) {
                class5[] var17 = new class5[class46.field704.field397[var9].method27(0, 60) + 1];
                class282.field4791.method2022(class46.field704.field397[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var16 - (var18 - 1) * var15.method1983() / 2;
                int var20 = var19 + var15.method1986() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class5 var22 = (var18 - 1) == var21 ? var17[var21] : var17[var21].method76(0, 0, var17[var21].method36(30673) - 4);
                    var15.method1988(var22, var12, var20, var13, true);
                    var20 += var15.method1983();
                }
            }
        }
        if (arg7) {
            field424 = -80;
        }
        field408++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIII)I", line = 131)
    public static final int method187(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field409++;
        if (arg2 != -32496) {
            return -81;
        } else if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg1;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)Z", line = 153)
    public static final boolean method188(int arg0, int arg1, int arg2) {
        int var3 = class74.field1167[arg0][arg1][arg2];
        if (-class172.field2645 == var3) {
            return false;
        } else if (class172.field2645 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class232.method1653(var4 + 1, class208.field3304[arg0][arg1][arg2], var5 + 1) && class232.method1653(var4 + 128 - 1, class208.field3304[arg0][arg1 + 1][arg2], var5 + 1) && class232.method1653(var4 + 128 - 1, class208.field3304[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class232.method1653(var4 + 1, class208.field3304[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class74.field1167[arg0][arg1][arg2] = class172.field2645;
                return true;
            } else {
                class74.field1167[arg0][arg1][arg2] = -class172.field2645;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 179)
    public static void method189(int arg0) {
        field410 = null;
        field413 = null;
        field418 = null;
        field419 = null;
        field422 = null;
        if (arg0 > -42) {
            field416 = -54;
        }
        field421 = null;
        field411 = null;
        field412 = null;
        field414 = null;
    }
}
