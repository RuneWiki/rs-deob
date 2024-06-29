import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class521 {

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    private int field7627;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lob;")
    public static class521 field7623 = new class521(67, 2);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Lul;")
    public static class406 field7629;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field7631;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field7625;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3106(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII)V", line = 11)
    public static final void method3102(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7626++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        class359.method2255((byte) -122, class416.field6200[arg3], arg0 + arg2, -arg2 + arg0, arg1);
        if (arg4 != -734) {
            return;
        }
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class416.field6200[arg3 + var6];
                int[] var10 = class416.field6200[arg3 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class359.method2255((byte) -101, var9, var11, var12, arg1);
                class359.method2255((byte) -126, var10, var11, var12, arg1);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class416.field6200[arg3 + var5];
            int[] var16 = class416.field6200[arg3 - var5];
            class359.method2255((byte) -115, var15, var13, var14, arg1);
            class359.method2255((byte) -75, var16, var13, var14, arg1);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)I", line = 63)
    public final int method3103(int arg0) {
        field7628++;
        return arg0 == 536870912 ? this.field7627 : 88;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(II)V", line = 74)
    public class521(int arg0, int arg1) {
        this.field7627 = arg0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 84)
    public static void method3104(byte arg0) {
        field7625 = null;
        field7623 = null;
        int var1 = -50 / ((-arg0 - 30) / 34);
        field7629 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILya;I)Z", line = 96)
    public static final boolean method3105(int arg0, class38 arg1, int arg2) {
        field7622++;
        int var3 = (class69.field976 - 104) / 2;
        int var4 = (class285.field4328 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var51 = var4; var51 < (var4 + 104); var51++) {
                for (int var52 = arg2; var52 <= 3; var52++) {
                    if (class408.method2570(false, var6, var52, arg2, var51)) {
                        int var53 = var52;
                        if (class385.method2406(-17064, var6, var51)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class422.method2635(var51, 31154, var53, var6);
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
        if (arg0 != -19589) {
            method3102(-5, 80, 61, 48, 36);
        }
        class488.field7031 = arg1.method350(var7, 0, 512, 512, 512);
        class364.method2281(arg0 + 19529);
        int var9 = -(-((int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8)) - ((int) (Math.random() * 20.0D) + 238 - 10 << 16) - 238) - 10 | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
        boolean[][] var12 = new boolean[class426.field6341][class426.field6341];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class426.field6341) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class426.field6341) {
                arg1.method313(0, 0, class426.field6341 * 4, class426.field6341 * 4);
                arg1.method360(-16777216);
                for (int var37 = arg2; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class426.field6341; var44++) {
                        for (int var50 = 0; var50 < class426.field6341; var50++) {
                            var12[var44][var50] = class408.method2570(false, var13 + var44, var37, arg2, var36 + var50);
                        }
                    }
                    class289.field4358[var37].method400(0, 0, 1024, var13, var36, class426.field6341 + var13, class426.field6341 + var36, var12);
                    if (!class155.field2296) {
                        for (int var45 = -4; var45 < class426.field6341; var45++) {
                            for (int var46 = -4; var46 < class426.field6341; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var3 <= var47 && var48 >= var4 && class408.method2570(false, var47, var37, arg2, var48)) {
                                    int var49 = var37;
                                    if (class385.method2406(arg0 ^ 0xE23, var47, var48)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class98.method802(var45 * 4, var10, arg1, (byte) 31, (class426.field6341 - var46) * 4 - 4, var9, var49, var48, var47);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class155.field2296) {
                    class172 var38 = class184.field2758[arg2];
                    for (int var39 = 0; var39 < class426.field6341; var39++) {
                        for (int var40 = 0; var40 < class426.field6341; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field2573[var41 - var38.field2559][var42 - var38.field2565];
                            if ((var43 & 0x40240000) != 0) {
                                arg1.method364((class426.field6341 - var40) * 4 - 4, 1, -1713569622, 4, var39 * 4, 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg1.method278(var39 * 4, 4, -1713569622, (class426.field6341 - var40) * 4 - 4, true);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg1.method277((class426.field6341 - var40) * 4 - 4, 4, 104, var39 * 4 + 3, -1713569622);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg1.method278(var39 * 4, 4, -1713569622, (class426.field6341 - var40) * 4 + 3 - 4, true);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg1.method277((class426.field6341 - var40) * 4 - 4, 4, 64, var39 * 4, -1713569622);
                            }
                        }
                    }
                }
                arg1.method284(0, 0, class426.field6341 * 4, class426.field6341 * 4, var11, 2);
                class488.field7031.method140((var13 - var3) * 4 + 48, -(class426.field6341 * 4) + 464 + -((-var4 + var36) * 4), class426.field6341 * 4, class426.field6341 * 4, 0, 0);
            }
        }
        arg1.method267();
        arg1.method360(-16777215);
        class152.method1044((byte) -122);
        class407.field6056 = 0;
        class318.field4803.method993(98);
        if (!class155.field2296) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg2; arg2 + 1 >= var21 && var21 <= 3; var21++) {
                        if (class408.method2570(false, var14, var21, arg2, var20)) {
                            class164 var22 = (class164) class446.method2736(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class164) class154.method1057(var21, var14, var20, field7631 == null ? (field7631 = method3106("ig")) : field7631);
                            }
                            if (var22 == null) {
                                var22 = (class164) class85.method713(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class164) class188.method1263(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class69 var23 = class510.field7458.method2973(arg0 + 19463, var22.method624((byte) -122));
                                if (!var23.field962 || class531.field7753) {
                                    int var24 = var23.field903;
                                    if (var23.field906 != null) {
                                        for (int var25 = 0; var25 < var23.field906.length; var25++) {
                                            if (var23.field906[var25] != -1) {
                                                class69 var26 = class510.field7458.method2973(-126, var23.field906[var25]);
                                                if (var26.field903 >= 0) {
                                                    var24 = var26.field903;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class519 var28 = class107.field1502.method3071(-127, var24);
                                            if (var28 != null && var28.field7592) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class184.field2758[var21].field2573;
                                            int var32 = class184.field2758[var21].field2559;
                                            int var33 = class184.field2758[var21].field2565;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && var29 > var14 - 3 && (var31[var29 - (var32 + 1)][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var3 + 104 - 1 > var29 && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && (var20 - 3) < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var4 + 104 - 1 > var30 && var20 + 3 > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class460.field6692[class407.field6056] = var23.field964;
                                        class168.field2490[class407.field6056] = var29;
                                        class54.field666[class407.field6056] = var30;
                                        class407.field6056++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class130.field1992 != null) {
                class120.field1812.field6013 = 1;
                class107.field1502.method3072(false, 64, 1024);
                for (int var15 = 0; var15 < class130.field1992.field2238; var15++) {
                    int var16 = class130.field1992.field2237[var15];
                    if (var16 >> 28 == class398.field5947.field5826) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class390.field5842;
                        int var18 = (var16 & 0x3FFF) - class176.field2613;
                        if (var17 >= 0 && var17 < class69.field976 && var18 >= 0 && class285.field4328 > var18) {
                            class318.field4803.method994(new class308(var15), -3610);
                        } else {
                            class519 var19 = class107.field1502.method3071(-117, class130.field1992.field2239[var15]);
                            if (var19.field7578 != null && (var19.field7601 + var17) >= 0 && class69.field976 > (var19.field7602 + var17) && var18 + var19.field7567 >= 0 && class285.field4328 > (var19.field7571 + var18)) {
                                class318.field4803.method994(new class308(var15), arg0 ^ 0x429D);
                            }
                        }
                    }
                }
                class107.field1502.method3072(false, 64, 128);
                class120.field1812.field6013 = 2;
                class120.field1812.method2533(-7767);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ob", name = "toString", descriptor = "()Ljava/lang/String;", line = 507)
    public final String toString() {
        field7624++;
        throw new IllegalStateException();
    }
}
