import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class89 extends class312 {

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "[Lwa;")
    public class65[] field1354;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "[I")
    public static int[] field1355 = new int[500];

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1357 = "cyan:";

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "Lwe;")
    public static class224 field1359;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "Lwf;")
    public static class306 field1353;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "Lcl;")
    public static class63 field1362;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)Z", line = 5)
    public static final boolean method610(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class268.field4136; var3++) {
            class58 var4 = class38.field485[var3];
            if (var4.field808 == 1) {
                int var5 = var4.field804 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field813 * var5 >> 8) + var4.field809;
                    int var7 = (var4.field822 * var5 >> 8) + var4.field820;
                    int var8 = (var4.field821 * var5 >> 8) + var4.field807;
                    int var9 = (var4.field806 * var5 >> 8) + var4.field803;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field808 == 2) {
                int var10 = arg0 - var4.field804;
                if (var10 > 0) {
                    int var11 = (var4.field813 * var10 >> 8) + var4.field809;
                    int var12 = (var4.field822 * var10 >> 8) + var4.field820;
                    int var13 = (var4.field821 * var10 >> 8) + var4.field807;
                    int var14 = (var4.field806 * var10 >> 8) + var4.field803;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field808 == 3) {
                int var15 = var4.field809 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field812 * var15 >> 8) + var4.field804;
                    int var17 = (var4.field805 * var15 >> 8) + var4.field811;
                    int var18 = (var4.field821 * var15 >> 8) + var4.field807;
                    int var19 = (var4.field806 * var15 >> 8) + var4.field803;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field808 == 4) {
                int var20 = arg2 - var4.field809;
                if (var20 > 0) {
                    int var21 = (var4.field812 * var20 >> 8) + var4.field804;
                    int var22 = (var4.field805 * var20 >> 8) + var4.field811;
                    int var23 = (var4.field821 * var20 >> 8) + var4.field807;
                    int var24 = (var4.field806 * var20 >> 8) + var4.field803;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field808 == 5) {
                int var25 = arg1 - var4.field807;
                if (var25 > 0) {
                    int var26 = (var4.field812 * var25 >> 8) + var4.field804;
                    int var27 = (var4.field805 * var25 >> 8) + var4.field811;
                    int var28 = (var4.field813 * var25 >> 8) + var4.field809;
                    int var29 = (var4.field822 * var25 >> 8) + var4.field820;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lkg;IIIIIIIZ)V", line = 134)
    public static final void method611(class212 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class343.field5342;
        int var11;
        int var12 = var11 = (arg7 << 7) - class246.field3859;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = client.field2034[arg1][arg6][arg7] - class99.field1542;
        int var18 = client.field2034[arg1][arg6 + 1][arg7] - class99.field1542;
        int var19 = client.field2034[arg1][arg6 + 1][arg7 + 1] - class99.field1542;
        int var20 = client.field2034[arg1][arg6][arg7 + 1] - class99.field1542;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class12.field119;
        int var46 = (var24 << 9) / var25 + class12.field128;
        int var47 = (var27 << 9) / var31 + class12.field119;
        int var48 = (var30 << 9) / var31 + class12.field128;
        int var49 = (var33 << 9) / var37 + class12.field119;
        int var50 = (var36 << 9) / var37 + class12.field128;
        int var51 = (var39 << 9) / var43 + class12.field119;
        int var52 = (var42 << 9) / var43 + class12.field128;
        class12.field115 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class230.field3717 && class210.method1407(class12.field119 + class101.field1573, class45.field637 + class12.field128, var50, var52, var48, var49, var51, var47)) {
                class13.field140 = arg6;
                class220.field3496 = arg7;
            }
            if (!class333.field5166 && !arg8) {
                class12.field118 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class12.field117 || var51 > class12.field117 || var47 > class12.field117) {
                    class12.field118 = true;
                }
                if (arg0.field3361 == -1) {
                    if (arg0.field3364 != 12345678) {
                        class12.method86(var50, var52, var48, var49, var51, var47, arg0.field3364, arg0.field3365, arg0.field3359);
                    }
                } else if (!class124.field1935) {
                    int var53 = class12.field126.method477(7053, arg0.field3361);
                    class12.method86(var50, var52, var48, var49, var51, var47, class77.method541(var53, arg0.field3364), class77.method541(var53, arg0.field3365), class77.method541(var53, arg0.field3359));
                } else if (arg0.field3363) {
                    class12.method90(var50, var52, var48, var49, var51, var47, arg0.field3364, arg0.field3365, arg0.field3359, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3361);
                } else {
                    class12.method90(var50, var52, var48, var49, var51, var47, arg0.field3364, arg0.field3365, arg0.field3359, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3361);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class230.field3717 && class210.method1407(class12.field119 + class101.field1573, class45.field637 + class12.field128, var46, var48, var52, var45, var47, var51)) {
            class13.field140 = arg6;
            class220.field3496 = arg7;
        }
        if (class333.field5166 || arg8) {
            return;
        }
        class12.field118 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class12.field117 || var47 > class12.field117 || var51 > class12.field117) {
            class12.field118 = true;
        }
        if (arg0.field3361 == -1) {
            if (arg0.field3357 != 12345678) {
                class12.method86(var46, var48, var52, var45, var47, var51, arg0.field3357, arg0.field3359, arg0.field3365);
            }
        } else if (class124.field1935) {
            class12.method90(var46, var48, var52, var45, var47, var51, arg0.field3357, arg0.field3359, arg0.field3365, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3361);
        } else {
            int var54 = class12.field126.method477(7053, arg0.field3361);
            class12.method86(var46, var48, var52, var45, var47, var51, class77.method541(var54, arg0.field3357), class77.method541(var54, arg0.field3359), class77.method541(var54, arg0.field3365));
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIZI)V", line = 298)
    public static final void method612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field1361++;
        if (arg0 == arg5) {
            class259.method1730(arg4, arg2, arg1, arg3, 0, arg5, arg7);
        } else if (!arg6) {
            if (arg2 - arg5 >= class256.field3995 && class118.field1834 >= arg2 + arg5 && class323.field5030 <= (arg7 - arg0) && arg0 + arg7 <= class88.field1324) {
                class230.method1576(-32750, arg5, arg2, arg7, arg4, arg3, arg0, arg1);
            } else {
                class24.method181(arg2, -1, arg0, arg7, arg3, arg1, arg4, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)Z", line = 323)
    public final boolean method613(byte arg0, int arg1) {
        field1358++;
        int var3 = -88 % ((35 - arg0) / 62);
        return this.field1354[arg1].field993;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(BI)Z", line = 333)
    public final boolean method614(byte arg0, int arg1) {
        if (arg0 < 14) {
            this.field1354 = (class65[]) null;
        }
        field1352++;
        return this.field1354[arg1].field981;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V", line = 344)
    public static void method615(int arg0) {
        if (arg0 <= 7) {
            method615(-23);
        }
        field1362 = null;
        field1353 = null;
        field1357 = null;
        field1359 = null;
        field1355 = null;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lwf;Lwf;IZ)V", line = 368)
    public class89(class306 arg0, class306 arg1, int arg2, boolean arg3) {
        class2 var5 = new class2();
        int var6 = arg0.method2086(0, arg2);
        this.field1354 = new class65[var6];
        int[] var7 = arg0.method2080(2820, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2103(0, arg2, var7[var8]);
            class42 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class42 var12 = (class42) var5.method10((byte) 116); var12 != null; var12 = (class42) var5.method13((byte) -32)) {
                if (var12.field593 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2083(0, var11, -95);
                } else {
                    var13 = arg1.method2083(var11, 0, -71);
                }
                var10 = new class42(var11, var13);
                var5.method7((byte) -51, var10);
            }
            this.field1354[var7[var8]] = new class65(var9, var10);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Lhf;", line = 427)
    public static final class309 method616(int arg0, int arg1) {
        field1356++;
        class309 var2 = (class309) class221.field3513.method1294((long) arg0, 116);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class315.field4963.method2103(0, 32, arg0);
        class309 var4 = new class309();
        if (var3 != null) {
            var4.method2121(new class303(var3), (byte) -107);
        }
        var4.method2125(false);
        class221.field3513.method1292((long) arg0, 109, var4);
        if (arg1 > -113) {
            method612(95, -67, -82, -19, -126, -115, false, 45);
        }
        return var4;
    }
}
