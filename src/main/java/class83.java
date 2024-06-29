import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class83 extends class94 {

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    private final int field1366;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    private final int field1386;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    private final int field1369;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "I")
    private final int field1373;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "Lp;")
    public static class280 field1363 = class18.method140((byte) -121, " s(West d-Bconnect-B)3");

    @OriginalMember(owner = "client!b", name = "B", descriptor = "Lhe;")
    public static class19 field1370 = new class19(16);

    @OriginalMember(owner = "client!b", name = "K", descriptor = "[I")
    public static int[] field1379 = new int[5];

    @OriginalMember(owner = "client!b", name = "H", descriptor = "Z")
    public static boolean field1376 = true;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "Lp;")
    public static class280 field1375 = class18.method140((byte) -120, "Veuillez patienter)3)3)3");

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    public static int field1380 = 0;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "Lp;")
    private static class280 field1378 = class18.method140((byte) -118, "Loading sprites )2 ");

    @OriginalMember(owner = "client!b", name = "N", descriptor = "Lp;")
    public static class280 field1382 = field1378;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "Lp;")
    public static class280 field1385 = class18.method140((byte) -122, "welle2:");

    @OriginalMember(owner = "client!b", name = "P", descriptor = "Lp;")
    public static class280 field1384 = class18.method140((byte) -128, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!b", name = "F", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "Lbc;")
    public static class174 field1372;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "Ltg;")
    public static class180 field1377;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)Lqf;")
    public static final class240 method596(int arg0, int arg1) {
        class240 var2 = (class240) class55.field897.method1699((long) arg1, 109);
        ++field1368;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class246.field4335.method1258(arg0, arg1, (byte) 93);
            class240 var4 = new class240();
            if (var3 != null) {
                var4.method1629(false, new class25(var3));
            }
            class55.field897.method1703(var4, (byte) 111, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIB)V")
    public final void method597(int arg0, int arg1, byte arg2) {
        int var4 = this.field1369 * arg1 >> 12;
        ++field1387;
        int var5 = this.field1366 * arg0 >> 12;
        int var6 = this.field1386 * arg0 >> 12;
        int var7 = this.field1373 * arg1 >> 12;
        class58.method416(var7, (byte) -37, var4, super.field1521, super.field1528, var6, super.field1520, var5);
        int var8 = -83 / ((arg2 - -53) / 60);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(II)I")
    public static final int method598(int arg0, int arg1) {
        if (arg1 != -157) {
            return -121;
        } else {
            ++field1358;
            return 127 & arg0;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(BI)V")
    public static final void method599(byte arg0, int arg1) {
        if (arg1 != 17982) {
            field1376 = true;
        }
        ++field1362;
        if (class268.field4705 == null) {
            class268.field4705 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; ++var2) {
            for (int var3 = 0; ~var3 > -105; ++var3) {
                for (int var4 = 0; ~var4 > -105; ++var4) {
                    class268.field4705[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public static final void method600(int arg0) {
        int var1 = -1;
        if (arg0 == 880) {
            while (var1 < class205.field3554) {
                int var2;
                if (var1 == -1) {
                    var2 = 2047;
                } else {
                    var2 = class250.field4376[var1];
                }
                class142 var3 = class280.field4940[var2];
                if (var3 != null) {
                    class99.method693(var3, var3.method984((byte) -34), (byte) -39);
                }
                ++var1;
            }
            ++field1367;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBI)V")
    public final void method601(int arg0, byte arg1, int arg2) {
        ++field1361;
        if (arg1 == 77) {
            int var4 = this.field1373 * arg2 >> 12;
            int var5 = this.field1366 * arg0 >> 12;
            int var6 = this.field1369 * arg2 >> 12;
            int var7 = this.field1386 * arg0 >> 12;
            class38.method305(var5, var6, var7, super.field1528, false, super.field1520, var4);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BII)V")
    public final void method602(byte arg0, int arg1, int arg2) {
        ++field1359;
        int var4 = this.field1373 * arg2 >> 12;
        int var5 = -54 / ((arg0 - 12) / 45);
        int var6 = this.field1369 * arg2 >> 12;
        int var7 = this.field1366 * arg1 >> 12;
        int var8 = this.field1386 * arg1 >> 12;
        class158.method1125(super.field1521, (byte) -53, var7, var4, var6, var8);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        ++field1365;
        class86.method613(-27280, arg1);
        int var7 = 0;
        int var8 = -arg1;
        int var9 = arg1 - arg2;
        if (arg6 != 104) {
            method599((byte) -111, -60);
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        int var11 = var9;
        int var12 = -var9;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class91.field1484[arg3];
        int var16 = arg4 - var9;
        class162.method1151(var16, arg0, -72, -arg1 + arg4, var15);
        int var17 = arg4 + var9;
        class162.method1151(var17, arg5, -6, var16, var15);
        class162.method1151(arg1 + arg4, arg0, -67, var17, var15);
        while (~var10 < ~var7) {
            var13 += 2;
            var8 += var13;
            var14 += 2;
            var12 += var14;
            if (~var12 <= -1 && var11 >= 1) {
                class145.field2531[var11] = var7;
                --var11;
                var12 -= var11 << 1;
            }
            ++var7;
            if (~var8 <= -1) {
                --var10;
                var8 -= var10 << 1;
                if (var9 > var10) {
                    int[] var18 = class91.field1484[-var10 + arg3];
                    int[] var19 = class91.field1484[arg3 + var10];
                    int var20 = class145.field2531[var10];
                    int var21 = arg4 - -var7;
                    int var22 = -var20 + arg4;
                    int var23 = -var7 + arg4;
                    int var24 = arg4 + var20;
                    class162.method1151(var22, arg0, 112, var23, var19);
                    class162.method1151(var24, arg5, 120, var22, var19);
                    class162.method1151(var21, arg0, 100, var24, var19);
                    class162.method1151(var22, arg0, -20, var23, var18);
                    class162.method1151(var24, arg5, 115, var22, var18);
                    class162.method1151(var21, arg0, 110, var24, var18);
                } else {
                    int[] var25 = class91.field1484[arg3 + var10];
                    int[] var26 = class91.field1484[-var10 + arg3];
                    int var27 = -var7 + arg4;
                    int var28 = arg4 + var7;
                    class162.method1151(var28, arg0, arg6 + -80, var27, var25);
                    class162.method1151(var28, arg0, 103, var27, var26);
                }
            }
            int[] var29 = class91.field1484[arg3 + var7];
            int var30 = arg4 - var10;
            int[] var31 = class91.field1484[-var7 + arg3];
            int var32 = arg4 + var10;
            if (~var9 < ~var7) {
                int var33 = var11 >= var7 ? var11 : class145.field2531[var7];
                int var34 = arg4 + var33;
                int var35 = -var33 + arg4;
                class162.method1151(var35, arg0, 118, var30, var29);
                class162.method1151(var34, arg5, 109, var35, var29);
                class162.method1151(var32, arg0, 94, var34, var29);
                class162.method1151(var35, arg0, 127, var30, var31);
                class162.method1151(var34, arg5, -83, var35, var31);
                class162.method1151(var32, arg0, -123, var34, var31);
            } else {
                class162.method1151(var32, arg0, 111, var30, var29);
                class162.method1151(var32, arg0, 97, var30, var31);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(II)V")
    public static final void method604(int arg0, int arg1) {
        ++field1381;
        if (arg0 != -14006) {
            method603(74, 7, -42, 83, -83, 99, (byte) -125);
        }
        class157 var2 = class257.method1740(arg1, (byte) 88, 10);
        var2.method1121(24223);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBIIII)V")
    public static final void method605(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg5 + arg4;
        ++field1360;
        int var7 = -arg0 + arg3;
        if (~var7 != -1) {
            if (~var6 == -1) {
                class73.method540(arg5, arg3, -3123, arg2, arg0);
            } else {
                if (~var6 > -1) {
                    var6 = -var6;
                }
                if (~var7 > -1) {
                    var7 = -var7;
                }
                boolean var8 = ~var6 < ~var7;
                if (var8) {
                    int var9 = arg0;
                    int var10 = arg3;
                    arg0 = arg5;
                    arg3 = arg4;
                    arg4 = var10;
                    arg5 = var9;
                }
                if (arg0 > arg3) {
                    int var11 = arg0;
                    arg0 = arg3;
                    int var12 = arg5;
                    arg3 = var11;
                    arg5 = arg4;
                    arg4 = var12;
                }
                if (arg1 > -41) {
                    field1375 = null;
                }
                int var13 = -arg5 + arg4;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                int var14 = arg3 - arg0;
                int var15 = arg5;
                int var16 = arg5 < arg4 ? 1 : -1;
                int var17 = -(var14 >> 1);
                if (var8) {
                    for (int var18 = arg0; ~arg3 <= ~var18; ++var18) {
                        class91.field1484[var18][var15] = arg2;
                        var17 += var13;
                        if (~var17 < -1) {
                            var15 += var16;
                            var17 -= var14;
                        }
                    }
                } else {
                    for (int var19 = arg0; ~var19 >= ~arg3; ++var19) {
                        class91.field1484[var15][var19] = arg2;
                        var17 += var13;
                        if (var17 > 0) {
                            var15 += var16;
                            var17 -= var14;
                        }
                    }
                }
            }
        } else {
            if (~var6 != -1) {
                class127.method876(arg4, arg2, arg5, 4096, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public static void method606(int arg0) {
        field1378 = null;
        field1375 = null;
        field1377 = null;
        field1370 = null;
        field1385 = null;
        field1363 = null;
        field1382 = null;
        field1372 = null;
        field1379 = null;
        if (arg0 >= -55) {
            field1363 = null;
        }
        field1384 = null;
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(II)Z")
    public static final boolean method607(int arg0, int arg1) {
        ++field1383;
        if (arg1 != -157) {
            field1379 = null;
        }
        return arg0 == 198 || ~arg0 == -231 || ~arg0 == -157 || arg0 == 140 || arg0 == 223;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIII)V")
    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1366 = arg1;
        this.field1386 = arg3;
        this.field1369 = arg2;
        this.field1373 = arg0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static final void method608(byte arg0) {
        if (~class246.field4315 != 0) {
            class89.method638(class246.field4315, 32588);
        }
        ++field1357;
        int var1 = -46 / ((-30 - arg0) / 32);
        for (int var2 = 0; class31.field585 > var2; ++var2) {
            if (class207.field3583[var2]) {
                class120.field2130[var2] = true;
            }
            class255.field4515[var2] = class207.field3583[var2];
            class207.field3583[var2] = false;
        }
        class157.field2754 = -1;
        class33.field612 = null;
        class17.field321 = class117.field2104;
        class54.field891 = -1;
        if (~class246.field4315 != 0) {
            class31.field585 = 0;
            class175.method1201(0, class246.field4315, 0, 0, 0, -8648, class103.field1724, class190.field3328, -1);
        }
        class151.method1053();
        class165.field2889 = 0;
    }
}
