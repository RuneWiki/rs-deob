import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class121 extends class8 {

    @OriginalMember(owner = "client!me", name = "H", descriptor = "Lbg;")
    public class18 field2458 = new class18();

    @OriginalMember(owner = "client!me", name = "L", descriptor = "Lga;")
    public class62 field2462 = new class62();

    @OriginalMember(owner = "client!me", name = "v", descriptor = "Lub;")
    private class190 field2446;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "[Llh;")
    public static class115[] field2451 = new class115[23];

    @OriginalMember(owner = "client!me", name = "z", descriptor = "Ljd;")
    public static class92 field2450 = class202.method1325((byte) 90, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!me", name = "B", descriptor = "Ljd;")
    public static class92 field2452 = class202.method1325((byte) 90, ": ");

    @OriginalMember(owner = "client!me", name = "K", descriptor = "Ljd;")
    public static class92 field2461 = class202.method1325((byte) 90, "::clientdrop");

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "[Lrf;")
    public static class167[] field2457;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "()Lag;")
    public final class8 method57() {
        class188 var1 = (class188) this.field2458.method103(57);
        field2448++;
        if (var1 == null) {
            return null;
        } else if (var1.field3551 == null) {
            return this.method51();
        } else {
            return var1.field3551;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()Lag;")
    public final class8 method51() {
        field2460++;
        class188 var1;
        do {
            var1 = (class188) this.field2458.method100(-49);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3551 == null);
        return var1.field3551;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILu;II[II)V")
    private final void method811(int arg0, class188 arg1, int arg2, int arg3, int[] arg4, int arg5) {
        field2444++;
        if ((this.field2446.field3637[arg1.field3562] & 0x4) != arg0 && arg1.field3564 < 0) {
            int var7 = this.field2446.field3676[arg1.field3562] / class175.field3378;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field3573) / var7;
                if (var8 > arg2) {
                    arg1.field3573 += arg2 * var7;
                    break;
                }
                arg2 -= var8;
                arg1.field3551.method52(arg4, arg3, var8);
                arg1.field3573 += var7 * var8 - 1048576;
                int var9 = 262144 / var7;
                class71 var10 = arg1.field3551;
                int var11 = class175.field3378 / 100;
                arg3 += var8;
                if (var11 > var9) {
                    var11 = var9;
                }
                if (this.field2446.field3621[arg1.field3562] == 0) {
                    arg1.field3551 = class71.method494(arg1.field3574, var10.method469(), var10.method479(), var10.method473());
                } else {
                    arg1.field3551 = class71.method494(arg1.field3574, var10.method469(), 0, var10.method473());
                    this.field2446.method1230(arg1.field3555.field2512[arg1.field3575] < 0, (byte) 85, arg1);
                    arg1.field3551.method491(var11, var10.method479());
                }
                if (arg1.field3555.field2512[arg1.field3575] < 0) {
                    arg1.field3551.method500(-1);
                }
                var10.method478(var11);
                var10.method52(arg4, arg3, arg5 - arg3);
                if (var10.method472()) {
                    this.field2462.method375(var10);
                }
            }
        }
        arg1.field3551.method52(arg4, arg3, arg2);
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "()I")
    public final int method54() {
        field2445++;
        return 0;
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    public static void method812(int arg0) {
        field2452 = null;
        field2451 = null;
        field2461 = null;
        if (arg0 != -38) {
            field2457 = null;
        }
        field2457 = null;
        field2450 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BILu;)V")
    private final void method813(byte arg0, int arg1, class188 arg2) {
        if (arg0 >= -12) {
            return;
        }
        if ((this.field2446.field3637[arg2.field3562] & 0x4) != 0 && arg2.field3564 < 0) {
            int var4 = this.field2446.field3676[arg2.field3562] / class175.field3378;
            int var5 = (var4 + 1048575 - arg2.field3573) / var4;
            arg2.field3573 = arg2.field3573 + arg1 * var4 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field2446.field3621[arg2.field3562] == 0) {
                    arg2.field3551 = class71.method494(arg2.field3574, arg2.field3551.method469(), arg2.field3551.method479(), arg2.field3551.method473());
                } else {
                    arg2.field3551 = class71.method494(arg2.field3574, arg2.field3551.method469(), 0, arg2.field3551.method473());
                    this.field2446.method1230(arg2.field3555.field2512[arg2.field3575] < 0, (byte) 85, arg2);
                }
                if (arg2.field3555.field2512[arg2.field3575] < 0) {
                    arg2.field3551.method500(-1);
                }
                arg1 = arg2.field3573 / var4;
            }
        }
        field2449++;
        arg2.field3551.method56(arg1);
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V")
    public static final void method814(int arg0) {
        field2447++;
        if (class115.field2319 != null || class6.field298 != null) {
            return;
        }
        int var1 = class74.field1559;
        if (class72.field1524) {
            if (var1 != 1) {
                int var6 = class29.field641;
                int var7 = class192.field3756;
                if (class10.field362 - 10 > var6 || var6 > class211.field4084 + class10.field362 + 10 || var7 < class166.field3264 - 10 || class186.field3513 + class166.field3264 + 10 < var7) {
                    class72.field1524 = false;
                    class168.method1116(class211.field4084, (byte) 82, class10.field362, class186.field3513, class166.field3264);
                }
            }
            if (var1 == 1) {
                int var8 = class10.field362;
                int var9 = class211.field4084;
                int var10 = class31.field705;
                int var11 = class166.field3264;
                int var12 = class81.field1645;
                int var13 = -1;
                for (int var14 = 0; var14 < class3.field182; var14++) {
                    int var15 = (class3.field182 - var14 - 1) * 15 + var11 + 31;
                    if (var10 > var8 && var10 < var8 + var9 && var15 - 13 < var12 && var12 < var15 + 3) {
                        var13 = var14;
                    }
                }
                if (var13 != -1) {
                    class131.method865((byte) -82, var13);
                }
                class72.field1524 = false;
                class168.method1116(class211.field4084, (byte) 82, class10.field362, class186.field3513, class166.field3264);
            }
        } else {
            if (var1 == 1 && class3.field182 > 0) {
                short var2 = class13.field383[class3.field182 - 1];
                if (var2 == 35 || var2 == 46 || var2 == 41 || var2 == 30 || var2 == 13 || var2 == 57 || var2 == 14 || var2 == 37 || var2 == 51 || var2 == 31 || var2 == 29 || var2 == 1007) {
                    int var3 = class137.field2741[class3.field182 - 1];
                    int var4 = class186.field3520[class3.field182 - 1];
                    class1 var5 = class175.method1155(var3, (byte) 127);
                    if (class165.method1068(-107, class114.method766(96, var5)) || class74.method516((byte) 16, class114.method766(-94, var5))) {
                        class164.field3211 = false;
                        class68.field1384 = 0;
                        if (class115.field2319 != null) {
                            class3.method21(arg0 + 26692, class115.field2319);
                        }
                        class115.field2319 = class175.method1155(var3, (byte) -123);
                        class177.field3414 = var4;
                        class175.field3381 = class81.field1645;
                        class113.field2276 = class31.field705;
                        class3.method21(26702, class115.field2319);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class98.field1992 == 1 && class3.field182 > 2 || class177.method1167(false, class3.field182 - 1))) {
                var1 = 2;
            }
            if (var1 == 1 && class3.field182 > 0) {
                class131.method865((byte) -82, class3.field182 - 1);
            }
            if (var1 == 2 && class3.field182 > 0) {
                class45.method285((byte) -5);
            }
        }
        if (arg0 != 10) {
            field2451 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([S[Ljd;III)V")
    public static final void method815(short[] arg0, class92[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 < arg3) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            class92 var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            for (int var9 = arg2; var9 < arg3; var9++) {
                if (var7 == null || arg1[var9] != null && arg1[var9].method608(var7, arg4 ^ 0xFFFFFFFE) < (var9 & 0x1)) {
                    class92 var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var8;
            method815(arg0, arg1, arg2, var6 - 1, -1);
            method815(arg0, arg1, var6 + 1, arg3, -1);
        }
        if (arg4 != -1) {
            field2461 = null;
        }
        field2454++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([III)V")
    public final void method52(int[] arg0, int arg1, int arg2) {
        this.field2462.method52(arg0, arg1, arg2);
        field2455++;
        for (class188 var4 = (class188) this.field2458.method103(57); var4 != null; var4 = (class188) this.field2458.method100(-49)) {
            if (!this.field2446.method1254(-1, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field3558 >= var5) {
                        this.method811(0, var4, var5, var6, arg0, var5 + var6);
                        var4.field3558 -= var5;
                        break;
                    }
                    this.method811(0, var4, var4.field3558, var6, arg0, var5 + var6);
                    var6 += var4.field3558;
                    var5 -= var4.field3558;
                } while (!this.field2446.method1242(var6, var5, (byte) -53, arg0, var4));
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
    public final void method56(int arg0) {
        this.field2462.method56(arg0);
        for (class188 var2 = (class188) this.field2458.method103(57); var2 != null; var2 = (class188) this.field2458.method100(-49)) {
            if (!this.field2446.method1254(-1, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field3558 >= var3) {
                        this.method813((byte) -35, var3, var2);
                        var2.field3558 -= var3;
                        break;
                    }
                    this.method813((byte) -97, var2.field3558, var2);
                    var3 -= var2.field3558;
                } while (!this.field2446.method1242(0, var3, (byte) -42, null, var2));
            }
        }
        field2453++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIB)I")
    public static final int method816(int arg0, int arg1, byte arg2) {
        field2456++;
        class116 var3 = (class116) class29.field637.method216(-98, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2347.length; var5++) {
                if (var3.field2356[var5] == arg0) {
                    var4 += var3.field2347[var5];
                }
            }
            int var6 = 78 % ((-arg2 - 78) / 48);
            return var4;
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lub;)V")
    public class121(class190 arg0) {
        this.field2446 = arg0;
    }
}
