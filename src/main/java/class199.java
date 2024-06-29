import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class199 extends class295 {

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
    public static int field2831 = 0;

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "[Z")
    public static boolean[] field2836 = new boolean[8];

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "Z")
    public static boolean field2834 = false;

    @OriginalMember(owner = "client!vo", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2839 = "Cancel";

    @OriginalMember(owner = "client!vo", name = "N", descriptor = "I")
    public static int field2841 = 0;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
    public static int field2833 = 0;

    @OriginalMember(owner = "client!vo", name = "Q", descriptor = "[Z")
    public static boolean[] field2844 = new boolean[100];

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!vo", name = "O", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!vo", name = "P", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!vo", name = "R", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "Lao;")
    public static class116 field2832;

    @OriginalMember(owner = "client!vo", name = "K", descriptor = "Lor;")
    public static class296 field2838;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vo", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field2846;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILpe;I)Z")
    public static final boolean method1405(int arg0, class391 arg1, int arg2) {
        field2835++;
        int var3 = (class116.field1621 - 104) / 2;
        int var4 = (class385.field5425 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < (var4 + 104); var51++) {
                for (int var52 = arg0; var52 <= 3; var52++) {
                    if (class113.method921(var6, var51, var52, arg0, false)) {
                        int var53 = var52;
                        if (class272.method1741(var51, -1, var6)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class100.method851(var6, -127, var53, var51);
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
        class32.field526 = arg1.method188(var7, 0, 512, 512, 512);
        class267.method1720(2070);
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D) + 228 << 16) - (-((int) (Math.random() * 20.0D)) - 228)) | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x20CFFF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class283.field3791][class283.field3791];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class283.field3791) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class283.field3791) {
                arg1.method111(0, 0, class283.field3791 * 4, class283.field3791 * 4);
                arg1.method104(-16777216);
                for (int var37 = arg0; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class283.field3791; var44++) {
                        for (int var50 = 0; var50 < class283.field3791; var50++) {
                            var12[var44][var50] = class113.method921(var13 + var44, var36 + var50, var37, arg0, false);
                        }
                    }
                    class265.field3566[var37].method1512(0, 0, 1024, var13, var36, var13 + class283.field3791, class283.field3791 + var36, var12);
                    if (!class264.field3548) {
                        for (int var45 = -4; var45 < class283.field3791; var45++) {
                            for (int var46 = -4; var46 < class283.field3791; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var3 <= var47 && var4 <= var48 && class113.method921(var47, var48, var37, arg0, false)) {
                                    int var49 = var37;
                                    if (class272.method1741(var48, -1, var47)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class73.method630(var49, var9, var45 * 4, arg2 ^ 0xFFFFFF98, arg1, var10, (class283.field3791 - var46) * 4 - 4, var47, var48);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class264.field3548) {
                    class151 var38 = class235.field3247[arg0];
                    for (int var39 = 0; var39 < class283.field3791; var39++) {
                        for (int var40 = 0; var40 < class283.field3791; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field2303[var41 - var38.field2320][var42 - var38.field2316];
                            if ((var43 & 0x40240000) != 0) {
                                arg1.method2414((class283.field3791 - var40) * 4 - 4, var39 * 4, 4, true, 4, -1713569622);
                            } else if ((var43 & 0x800000) != 0) {
                                arg1.method2411(var39 * 4, 4, (class283.field3791 - var40) * 4 - 4, -1713569622, true);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg1.method2410(-1713569622, var39 * 4 + 3, 4, (byte) 115, (class283.field3791 - var40) * 4 - 4);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg1.method2411(var39 * 4, 4, (class283.field3791 - var40) * 4 + 3 - 4, -1713569622, true);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg1.method2410(-1713569622, var39 * 4, 4, (byte) -14, (class283.field3791 - var40) * 4 - 4);
                            }
                        }
                    }
                }
                arg1.method95(0, 0, class283.field3791 * 4, class283.field3791 * 4, var11, 2);
                class32.field526.method736((var13 - var3) * 4 + 48, -((var36 - var4) * 4) - class283.field3791 * 4 + 464, class283.field3791 * 4, class283.field3791 * 4, 0, 0);
            }
        }
        arg1.method122();
        arg1.method104(-16777215);
        class125.method973(arg2 ^ arg2);
        class243.field3350 = 0;
        class392.field5496.method1250(10346);
        if (!class264.field3548) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg0; arg0 + 1 >= var21 && var21 <= 3; var21++) {
                        if (class113.method921(var14, var20, var21, arg0, false)) {
                            class111 var22 = (class111) class314.method2001(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class111) class95.method815(var21, var14, var20, field2846 == null ? (field2846 = method1411("gd")) : field2846);
                            }
                            if (var22 == null) {
                                var22 = (class111) class194.method1394(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class111) class434.method2691(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class372 var23 = class10.method53(var22.method582((byte) 22), true);
                                if (!var23.field5213 || class78.field1178) {
                                    int var24 = var23.field5214;
                                    if (var23.field5192 != null) {
                                        for (int var25 = 0; var25 < var23.field5192.length; var25++) {
                                            if (var23.field5192[var25] != -1) {
                                                class372 var26 = class10.method53(var23.field5192[var25], true);
                                                if (var26.field5214 >= 0) {
                                                    var24 = var26.field5214;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class384 var28 = class212.method1451(var24, 36);
                                            if (var28 != null && var28.field5380) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class235.field3247[var21].field2303;
                                            int var32 = class235.field3247[var21].field2320;
                                            int var33 = class235.field3247[var21].field2316;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var29 > var14 - 3 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < (var3 + 104 - 1) && var14 + 3 > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && var20 - 3 < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && (var4 + 104 - 1) > var30 && var30 < (var20 + 3) && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class335.field4546[class243.field3350] = var23.field5157;
                                        class323.field4387[class243.field3350] = var29;
                                        class96.field1388[class243.field3350] = var30;
                                        class243.field3350++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class264.field3549 != null) {
                class396.field5548.field6055 = 1;
                class97.method818((byte) 117, 1024, 64);
                for (int var15 = 0; var15 < class264.field3549.field1116; var15++) {
                    int var16 = class264.field3549.field1121[var15];
                    if ((var16 >> 28) == class69.field1046) {
                        int var17 = ((var16 & 0xFFFF82D) >> 14) - class283.field3794;
                        int var18 = (var16 & 0x3FFF) - class296.field3988;
                        if (var17 >= 0 && var17 < class116.field1621 && var18 >= 0 && var18 < class385.field5425) {
                            class392.field5496.method1249(new class193(var15), (byte) -117);
                        } else {
                            class384 var19 = class212.method1451(class264.field3549.field1117[var15], 36);
                            if (var19.field5384 != null && (var19.field5417 + var17) >= 0 && class116.field1621 > var17 + var19.field5401 && (var19.field5409 + var18) >= 0 && (var18 + var19.field5388) < class385.field5425) {
                                class392.field5496.method1249(new class193(var15), (byte) -110);
                            }
                        }
                    }
                }
                class97.method818((byte) 119, 128, 64);
                class396.field5548.field6055 = 2;
                class396.field5548.method2631((byte) -1);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)V")
    public static void method1406(int arg0) {
        field2844 = null;
        field2838 = null;
        if (arg0 > 108) {
            field2836 = null;
            field2839 = null;
            field2832 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I[[I)V")
    public static final void method1407(int arg0, int[][] arg1) {
        class186.field2697 = arg1;
        field2842++;
        int var2 = 86 / ((arg0 - 16) / 60);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "([Ljava/lang/Object;[II)V")
    public static final void method1408(Object[] arg0, int[] arg1, int arg2) {
        if (arg2 == 8239) {
            field2837++;
            class180.method1329(arg1, arg1.length - 1, arg0, (byte) -115, 0);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIII)I")
    public static final int method1409(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2845++;
        if (arg1 == 12470) {
            int var5 = arg4 & 0xF;
            int var6 = var5 >= 8 ? arg0 : arg3;
            int var7 = var5 < 4 ? arg0 : (var5 == 12 || var5 == 14 ? arg3 : arg2);
            return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
        } else {
            return -105;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lqo;IILcc;Lkk;III)V")
    public static final void method1410(class127 arg0, int arg1, int arg2, class338 arg3, class372 arg4, int arg5, int arg6, int arg7) {
        field2840++;
        class417 var8 = new class417();
        var8.field5850 = arg1 * 128;
        var8.field5854 = arg6 * 128;
        var8.field5831 = arg2;
        if (arg5 != 1) {
            method1408((Object[]) null, (int[]) null, 120);
        }
        if (arg4 != null) {
            var8.field5835 = arg4;
            int var10 = arg4.field5206;
            int var11 = arg4.field5147;
            if (arg7 == 1 || arg7 == 3) {
                var11 = arg4.field5206;
                var10 = arg4.field5147;
            }
            var8.field5838 = (arg1 + var10) * 128;
            var8.field5860 = (arg6 + var11) * 128;
            var8.field5839 = arg4.field5156;
            var8.field5852 = arg4.field5166;
            var8.field5834 = arg4.field5195;
            var8.field5859 = arg4.field5163;
            var8.field5830 = arg4.field5152;
            var8.field5840 = arg4.field5154 * 128;
            if (arg4.field5192 != null) {
                var8.field5842 = true;
                var8.method2584((byte) 53);
            }
            if (var8.field5830 != null) {
                var8.field5843 = var8.field5852 + ((int) ((double) (var8.field5859 - var8.field5852) * Math.random()));
            }
            class329.field4465.method1249(var8, (byte) -122);
        } else if (arg0 != null) {
            var8.field5849 = arg0;
            class15 var9 = arg0.field1784;
            if (var9.field177 != null) {
                var8.field5842 = true;
                var9 = var9.method78(arg5 ^ 0x1);
            }
            if (var9 != null) {
                var8.field5838 = (var9.field133 + arg1) * 128;
                var8.field5860 = (arg6 + var9.field133) * 128;
                var8.field5839 = class73.method629(arg0, arg5 - 100);
                var8.field5834 = var9.field119;
                var8.field5840 = var9.field160 * 128;
            }
            client.field3444.method1249(var8, (byte) -118);
        } else if (arg3 != null) {
            var8.field5841 = arg3;
            var8.field5838 = (arg3.method2146(-121) + arg1) * 128;
            var8.field5860 = (arg3.method2146(-116) + arg6) * 128;
            var8.field5839 = class340.method2162(arg5 ^ 0x53, arg3);
            var8.field5834 = arg3.field4575;
            var8.field5840 = arg3.field4578 * 128;
            class218.field3018.method612((long) arg3.field4957, -1, var8);
            return;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1411(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
