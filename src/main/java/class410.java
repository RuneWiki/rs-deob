import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class410 extends class393 {

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public volatile int field6138 = -1;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Ljava/lang/String;")
    public volatile String field6137;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field6139;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field6140;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "[I")
    public static int[] field6134;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2665(byte arg0, String arg1) {
        field6135++;
        if (arg1.equals("")) {
            return;
        }
        class28.field494++;
        class232.field3279.method756(0, 36);
        class232.field3279.method1707(37, method2668((byte) -118, arg1));
        class232.field3279.method1662(arg1, (byte) 124);
        int var2 = -17 % ((-arg0 - 23) / 52);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public static final void method2666(int arg0) {
        class24 var1 = class70.field966;
        synchronized (class70.field966) {
            class70.field966.method212(arg0 ^ 0xFFFFFFC2);
            if (arg0 != 104) {
                method2666(78);
            }
        }
        field6133++;
        class24 var2 = class132.field1770;
        synchronized (class132.field1770) {
            class132.field1770.method212(-99);
        }
        class261 var3 = class114.field1551;
        synchronized (class114.field1551) {
            class114.field1551.method1633((byte) 88);
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
    public static void method2667(byte arg0) {
        field6134 = null;
        if (arg0 != 64) {
            method2667((byte) 15);
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(BLjava/lang/String;)I")
    public static final int method2668(byte arg0, String arg1) {
        field6136++;
        if (arg0 > -102) {
            field6134 = null;
        }
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([Ljava/lang/Object;[JIBI)V")
    public static final void method2669(Object[] arg0, long[] arg1, int arg2, byte arg3, int arg4) {
        field6132++;
        if (arg3 < 106) {
            method2669((Object[]) null, (long[]) null, -94, (byte) 94, -55);
        }
        if (arg4 >= arg2) {
            return;
        }
        int var5 = (arg2 + arg4) / 2;
        int var6 = arg4;
        long var7 = arg1[var5];
        arg1[var5] = arg1[arg2];
        arg1[arg2] = var7;
        Object var9 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var9;
        for (int var10 = arg4; var10 < arg2; var10++) {
            if (arg1[var10] < ((long) (var10 & 0x1) + var7)) {
                long var11 = arg1[var10];
                arg1[var10] = arg1[var6];
                arg1[var6] = var11;
                Object var13 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6++] = var13;
            }
        }
        arg1[arg2] = arg1[var6];
        arg1[var6] = var7;
        arg0[arg2] = arg0[var6];
        arg0[var6] = var9;
        method2669(arg0, arg1, var6 - 1, (byte) 117, arg4);
        method2669(arg0, arg1, arg2, (byte) 112, var6 + 1);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lnr;II)Z")
    public static final boolean method2670(class437 arg0, int arg1, int arg2) {
        field6139++;
        int var3 = (class324.field4652 - 104) / 2;
        int var4 = (class336.field4964 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg1; var52 <= 3; var52++) {
                    if (class226.method1404(var6, true, var51, var52, arg1)) {
                        int var53 = var52;
                        if (class161.method1010(var51, (byte) 72, var6)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class198.method1240(arg2 ^ 0xFFFFFC01, var53, var51, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class419.field6227 = arg0.method2158(var7, 0, 512, 512, 512);
        class60.method403((byte) 57);
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 228 - (-(((int) (Math.random() * 20.0D) - 10) + 238 << 8) - ((int) (Math.random() * 20.0D))) | 0xFF000000;
        int var10 = ((int) ((double) arg2 * Math.random()) - 10) + 238 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
        boolean[][] var12 = new boolean[class54.field801][class54.field801];
        for (int var13 = var3; var13 < var3 + 104; var13 += class54.field801) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class54.field801) {
                arg0.method2155(0, 0, class54.field801 * 4, class54.field801 * 4);
                arg0.method2118(-16777216);
                for (int var37 = arg1; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class54.field801; var44++) {
                        for (int var50 = 0; var50 < class54.field801; var50++) {
                            var12[var44][var50] = class226.method1404(var13 + var44, true, var36 + var50, var37, arg1);
                        }
                    }
                    class198.field2829[var37].method780(0, 0, 1024, var13, var36, class54.field801 + var13, class54.field801 + var36, var12);
                    if (!class170.field2245) {
                        for (int var45 = -4; var45 < class54.field801; var45++) {
                            for (int var46 = -4; var46 < class54.field801; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var3 <= var47 && var48 >= var4 && class226.method1404(var47, true, var48, var37, arg1)) {
                                    int var49 = var37;
                                    if (class161.method1010(var48, (byte) 72, var47)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class446.method2802(var9, var10, var45 * 4, var49, arg0, true, var48, var47, (class54.field801 - var46) * 4 - 4);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class170.field2245) {
                    class138 var38 = class119.field1605[arg1];
                    for (int var39 = 0; var39 < class54.field801; var39++) {
                        for (int var40 = 0; var40 < class54.field801; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field1844[var41 - var38.field1828][var42 - var38.field1840];
                            if ((var43 & 0x40240000) != 0) {
                                arg0.method2766(4, 4, var39 * 4, (class54.field801 - var40) * 4 - 4, -1713569622, -91);
                            } else if ((var43 & 0x800000) != 0) {
                                arg0.method2769(var39 * 4, -1713569622, (byte) -99, 4, (class54.field801 - var40) * 4 - 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg0.method2771(true, (class54.field801 - var40) * 4 - 4, -1713569622, var39 * 4 + 3, 4);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg0.method2769(var39 * 4, -1713569622, (byte) -118, 4, (class54.field801 - var40) * 4 - 1);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg0.method2771(true, (class54.field801 - var40) * 4 - 4, -1713569622, var39 * 4, 4);
                            }
                        }
                    }
                }
                arg0.method2188(0, 0, class54.field801 * 4, class54.field801 * 4, var11, 2);
                class419.field6227.method36((var13 - var3) * 4 + 48, 464 - (var36 - var4) * 4 + -(class54.field801 * 4), class54.field801 * 4, class54.field801 * 4, 0, 0);
            }
        }
        arg0.method2034();
        arg0.method2118(-16777215);
        class176.method1075((byte) -125);
        class86.field1205 = 0;
        class315.field4508.method2654(0);
        if (!class170.field2245) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg1; arg1 + 1 >= var21 && var21 <= 3; var21++) {
                        if (class226.method1404(var14, true, var20, var21, arg1)) {
                            class351 var22 = (class351) class135.method910(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class351) class312.method1947(var21, var14, var20, field6140 == null ? (field6140 = method2671("im")) : field6140);
                            }
                            if (var22 == null) {
                                var22 = (class351) class87.method539(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class351) class117.method822(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class404 var23 = class165.method1020(var22.method150((byte) -127), 114);
                                if (!var23.field6067 || class17.field208) {
                                    int var24 = var23.field6034;
                                    if (var23.field5999 != null) {
                                        for (int var25 = 0; var25 < var23.field5999.length; var25++) {
                                            if (var23.field5999[var25] != -1) {
                                                class404 var26 = class165.method1020(var23.field5999[var25], -115);
                                                if (var26.field6034 >= 0) {
                                                    var24 = var26.field6034;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class80 var28 = class27.method248(var24, (byte) 1);
                                            if (var28 != null && var28.field1107) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class119.field1605[var21].field1844;
                                            int var32 = class119.field1605[var21].field1828;
                                            int var33 = class119.field1605[var21].field1840;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var14 - 3 < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < var3 + 104 - 1 && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && (var4 + 104 - 1) > var30 && var30 < var20 + 3 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class200.field2857[class86.field1205] = var23.field6059;
                                        class226.field3182[class86.field1205] = var29;
                                        class229.field3236[class86.field1205] = var30;
                                        class86.field1205++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class403.field5987 != null) {
                class180.field2387.field3348 = 1;
                class292.method1872(1024, 64, 119);
                for (int var15 = 0; var15 < class403.field5987.field5943; var15++) {
                    int var16 = class403.field5987.field5945[var15];
                    if ((var16 >> 28) == class193.field2688) {
                        int var17 = ((var16 & 0xFFFEADA) >> 14) - class184.field2482;
                        int var18 = (var16 & 0x3FFF) - class38.field620;
                        if (var17 >= 0 && var17 < class324.field4652 && var18 >= 0 && class336.field4964 > var18) {
                            class315.field4508.method2660((byte) -125, new class231(var15));
                        } else {
                            class80 var19 = class27.method248(class403.field5987.field5946[var15], (byte) 1);
                            if (var19.field1126 != null && var19.field1093 + var17 >= 0 && (var19.field1124 + var17) < class324.field4652 && var18 + var19.field1116 >= 0 && class336.field4964 > var19.field1109 + var18) {
                                class315.field4508.method2660((byte) -127, new class231(var15));
                            }
                        }
                    }
                }
                class292.method1872(128, 64, 4);
                class180.field2387.field3348 = 2;
                class180.field2387.method1464(false);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class410(String arg0) {
        this.field6137 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2671(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
