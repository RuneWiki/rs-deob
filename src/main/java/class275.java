import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class275 extends class114 {

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "I")
    private int field4363 = 3072;

    @OriginalMember(owner = "client!gk", name = "fb", descriptor = "I")
    private int field4379 = 2048;

    @OriginalMember(owner = "client!gk", name = "hb", descriptor = "I")
    private int field4381 = 1024;

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "I")
    public static int field4366 = 0;

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "[[B")
    public static byte[][] field4362 = new byte[250][];

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
    public static int field4360 = -1;

    @OriginalMember(owner = "client!gk", name = "Y", descriptor = "Z")
    public static boolean field4372 = false;

    @OriginalMember(owner = "client!gk", name = "eb", descriptor = "[B")
    public static byte[] field4378 = new byte[520];

    @OriginalMember(owner = "client!gk", name = "N", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!gk", name = "V", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!gk", name = "W", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!gk", name = "X", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!gk", name = "ab", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!gk", name = "bb", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!gk", name = "db", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!gk", name = "gb", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!gk", name = "ib", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "Lnh;")
    public static class305 field4367;

    @OriginalMember(owner = "client!gk", name = "Z", descriptor = "Lnh;")
    public static class305 field4373;

    @OriginalMember(owner = "client!gk", name = "cb", descriptor = "[I")
    public static int[] field4376;

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "[[I")
    public static int[][] field4364;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        if (arg0 >= 101) {
            ++field4368;
            this.field4379 = -this.field4381 + this.field4363;
        }
    }

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "(I)V")
    public static void method1784(int arg0) {
        field4376 = null;
        field4364 = null;
        field4367 = null;
        if (arg0 < -119) {
            field4362 = null;
            field4373 = null;
            field4378 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZB)V")
    public static final void method1785(boolean arg0, byte arg1) {
        ++field4380;
        int var2 = class117.field1685.length;
        byte[][] var3 = class110.field1583;
        int var4 = 0;
        if (arg1 <= -66) {
            while (var2 > var4) {
                byte[] var5 = var3[var4];
                if (var5 != null) {
                    int var6 = (class213.field3218[var4] >> 8) * 64 - class228.field3570;
                    int var7 = (255 & class213.field3218[var4]) * 64 + -class170.field2421;
                    class8.method45(4087);
                    class102.method650(var6, arg0, var7, class156.field2153, 4096, var5);
                }
                ++var4;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZLgh;)V")
    public static final void method1786(int arg0, boolean arg1, class33 arg2) {
        ++field4369;
        if (arg1) {
            int var3 = class174.field2460;
            int var4 = var3 * 956 / 503;
            class207.field3083.method685((-var4 + class218.field3386) / 2, 0, var4, var3);
            class179.field2711.method487(class218.field3386 / 2 + -(class179.field2711.field4566 / 2), 18);
        }
        arg2.method211(class188.field2856 != 1 ? class126.field1779 : class154.field2135, class218.field3386 / 2, class174.field2460 / 2 + -26, 16777215, -1);
        int var5 = class174.field2460 / 2 + -18;
        class266.method1743(class218.field3386 / 2 + -152, var5, 304, 34, 9179409);
        class266.method1743(class218.field3386 / 2 - 151, var5 + 1, 302, 32, 0);
        class266.method1730(class218.field3386 / 2 + -150, var5 + 2, class311.field5008 * 3, 30, 9179409);
        class266.method1730(class311.field5008 * 3 + class218.field3386 / 2 + -150, var5 + 2, 300 - class311.field5008 * 3, 30, 0);
        int var6 = -108 / ((arg0 - 60) / 39);
        arg2.method211(class84.field1185, class218.field3386 / 2, class174.field2460 / 2 - -4, 16777215, -1);
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
    public class275() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B[BII)I")
    public static final int method1787(byte arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = -1;
        ++field4382;
        int var5 = -23 % ((-40 - arg0) / 33);
        for (int var6 = arg3; ~arg2 < ~var6; ++var6) {
            var4 = var4 >>> 8 ^ class71.field1025[255 & (arg1[var6] ^ var4)];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
    public static final void method1788(boolean arg0, String arg1, boolean arg2) {
        ++field4377;
        if (arg1 != null) {
            if (class256.field4092 >= 100) {
                class89.method573(class128.field1784, (byte) -127);
            } else {
                String var3 = class248.method1618((byte) 93, arg1);
                if (var3 != null) {
                    for (int var4 = 0; ~class256.field4092 < ~var4; ++var4) {
                        String var8 = class248.method1618((byte) 59, class195.field2970[var4]);
                        if (var8 != null && var8.equals(var3)) {
                            class89.method573(arg1 + class238.field3694, (byte) -122);
                            return;
                        }
                        if (class228.field3573[var4] != null) {
                            String var9 = class248.method1618((byte) 56, class228.field3573[var4]);
                            if (var9 != null && var9.equals(var3)) {
                                class89.method573(arg1 + class238.field3694, (byte) -122);
                                return;
                            }
                        }
                    }
                    if (!arg2) {
                        method1784(-128);
                    }
                    for (int var5 = 0; ~var5 > ~class43.field643; ++var5) {
                        String var6 = class248.method1618((byte) 22, class206.field3081[var5]);
                        if (var6 != null && var6.equals(var3)) {
                            class89.method573(class280.field4452 + arg1 + class101.field1451, (byte) -128);
                            return;
                        }
                        if (class151.field2095[var5] != null) {
                            String var7 = class248.method1618((byte) 102, class151.field2095[var5]);
                            if (var7 != null && var7.equals(var3)) {
                                class89.method573(class280.field4452 + arg1 + class101.field1451, (byte) -120);
                                return;
                            }
                        }
                    }
                    if (class248.method1618((byte) 92, class250.field3905.field5053).equals(var3)) {
                        class89.method573(class58.field799, (byte) -118);
                    } else {
                        ++class134.field1856;
                        class231.field3614.method809(206, 0);
                        class231.field3614.method1363(1 + class231.method1518(arg1, 38), 107);
                        class231.field3614.method1384(arg1, -595448376);
                        class231.field3614.method1363(!arg0 ? 0 : 1, -43);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        if (arg0 != -112) {
            return null;
        } else {
            ++field4361;
            int[][] var3 = super.field1627.method104(arg1, (byte) 111);
            if (super.field1627.field280) {
                int[][] var4 = this.method727(0, arg1, 842);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class145.field2009; ++var11) {
                    var8[var11] = (var5[var11] * this.field4379 >> 12) + this.field4381;
                    var9[var11] = (var6[var11] * this.field4379 >> 12) + this.field4381;
                    var10[var11] = (var7[var11] * this.field4379 >> 12) + this.field4381;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([ILam;Z[I[I)V")
    public static final void method1789(int[] arg0, class314 arg1, boolean arg2, int[] arg3, int[] arg4) {
        if (arg2) {
            field4372 = false;
        }
        ++field4365;
        for (int var5 = 0; ~arg3.length < ~var5; ++var5) {
            int var6 = arg3[var5];
            int var7 = arg4[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && ~var9 > ~arg1.field4110.length; ++var9) {
                if ((1 & var7) != 0) {
                    if (var6 != -1) {
                        class195 var10 = class280.method1815(var6, -25);
                        class113 var11 = arg1.field4110[var9];
                        int var12 = var10.field2967;
                        if (var11 != null) {
                            if (var11.field1619 == var6) {
                                if (~var12 != -1) {
                                    if (~var12 != -2) {
                                        if (~var12 == -3) {
                                            var11.field1622 = 0;
                                        }
                                    } else {
                                        var11.field1623 = 0;
                                        var11.field1624 = var8;
                                        var11.field1626 = 0;
                                        var11.field1622 = 0;
                                        var11.field1620 = 1;
                                        class181.method1152(class250.field3905 == arg1, arg1.field4081, 0, arg1.field4140, false, var10);
                                    }
                                } else {
                                    var11 = arg1.field4110[var9] = null;
                                }
                            } else if (~var10.field2992 <= ~class280.method1815(var11.field1619, -76).field2992) {
                                var11 = arg1.field4110[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class113 var13 = arg1.field4110[var9] = new class113();
                            var13.field1622 = 0;
                            var13.field1620 = 1;
                            var13.field1623 = 0;
                            var13.field1619 = var6;
                            var13.field1626 = 0;
                            var13.field1624 = var8;
                            class181.method1152(class250.field3905 == arg1, arg1.field4081, 0, arg1.field4140, arg2, var10);
                        }
                    } else {
                        arg1.field4110[var9] = null;
                    }
                }
                var7 >>>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZBII)V")
    public static final void method1790(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        class178.field2586 = 0L;
        ++field4374;
        if (arg2 != 93) {
            method1785(true, (byte) 30);
        }
        int var5 = class246.method1611(100);
        boolean var6 = false;
        if (arg4 <= 0 != ~var5 >= -1) {
            var6 = true;
        }
        if (arg4 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (class52.field736.startsWith("mac") && ~arg4 < -1) {
            arg1 = true;
        }
        if (arg1 && arg4 > 0) {
            var6 = true;
        }
        class39.method260(arg1, arg3, var6, arg2 ^ 16744, arg0, arg4, var5);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)I")
    public static final int method1791(int arg0, int arg1, int arg2, int arg3) {
        ++field4375;
        int var4 = arg3 + -1 & arg1;
        int var5 = arg1 / arg3;
        int var6 = arg2 / arg3;
        int var7 = arg2 & arg3 - 1;
        int var8 = class20.method133(var5, var6, (byte) -13);
        int var9 = -20 / ((arg0 - 70) / 46);
        int var10 = class20.method133(var5 - -1, var6, (byte) -13);
        int var11 = class20.method133(var5, var6 + 1, (byte) -13);
        int var12 = class20.method133(var5 + 1, var6 + 1, (byte) -13);
        int var13 = class106.method672(var8, var4, 51, var10, arg3);
        int var14 = class106.method672(var11, var4, -122, var12, arg3);
        return class106.method672(var13, var7, -115, var14, arg3);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (arg2 == 12953) {
            ++field4371;
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        super.field1648 = ~arg0.method1374((byte) -60) == -2;
                    }
                } else {
                    this.field4363 = arg0.method1379(arg2 ^ -13006);
                }
            } else {
                this.field4381 = arg0.method1379(-83);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        int[] var3 = super.field1630.method302(arg0, -119);
        ++field4370;
        if (super.field1630.field710) {
            int[] var4 = this.method729(arg0, 0, 0);
            for (int var5 = 0; ~var5 > ~class145.field2009; ++var5) {
                var3[var5] = (var4[var5] * this.field4379 >> 12) + this.field4381;
            }
        }
        if (arg1) {
            method1784(62);
        }
        return var3;
    }
}
