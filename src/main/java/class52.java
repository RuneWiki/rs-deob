import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class52 extends class36 {

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "[Lem;")
    public class260[] field703;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
    public static int field701 = 0;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "F")
    public static float field696;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "Lnj;")
    public static class223 field695;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([BB)[B", line = 6)
    public static final byte[] method354(byte[] arg0, byte arg1) {
        int var2 = 78 % ((6 - arg1) / 42);
        field705++;
        int var3 = arg0.length;
        byte[] var4 = new byte[var3];
        class281.method1943(arg0, 0, var4, 0, var3);
        return var4;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "()V", line = 19)
    public static final void method355() {
        class56.field769 = 0;
        label194: for (int var0 = 0; var0 < class22.field285; var0++) {
            class209 var1 = class190.field2621[var0];
            if (class119.field1603 != null) {
                for (int var2 = 0; var2 < class119.field1603.length; var2++) {
                    if (class119.field1603[var2] != -1000000 && (var1.field3005 <= class119.field1603[var2] || var1.field3008 <= class119.field1603[var2]) && (var1.field3016 <= class168.field2287[var2] || var1.field3024 <= class168.field2287[var2]) && (var1.field3016 >= class112.field1531[var2] || var1.field3024 >= class112.field1531[var2]) && (var1.field3019 <= class25.field312[var2] || var1.field3010 <= class25.field312[var2]) && (var1.field3019 >= class166.field2266[var2] || var1.field3010 >= class166.field2266[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field3004 == 1) {
                int var3 = var1.field3020 + class208.field2988 - class175.field2383;
                if (var3 >= 0 && var3 <= class208.field2988 + class208.field2988) {
                    int var4 = var1.field3026 + class208.field2988 - class25.field315;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3009 + class208.field2988 - class25.field315;
                    if (var5 > class208.field2988 + class208.field2988) {
                        var5 = class208.field2988 + class208.field2988;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class240.field3399[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class234.field3310 - var1.field3016;
                        if (var7 > 32) {
                            var1.field3007 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3007 = 2;
                            var7 = -var7;
                        }
                        var1.field3023 = (var1.field3019 - class113.field1539 << 8) / var7;
                        var1.field3018 = (var1.field3010 - class113.field1539 << 8) / var7;
                        var1.field3017 = (var1.field3005 - class173.field2353 << 8) / var7;
                        var1.field3013 = (var1.field3008 - class173.field2353 << 8) / var7;
                        class201.field2865[class56.field769++] = var1;
                    }
                }
            } else if (var1.field3004 == 2) {
                int var8 = var1.field3026 + class208.field2988 - class25.field315;
                if (var8 >= 0 && var8 <= class208.field2988 + class208.field2988) {
                    int var9 = var1.field3020 + class208.field2988 - class175.field2383;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3006 + class208.field2988 - class175.field2383;
                    if (var10 > class208.field2988 + class208.field2988) {
                        var10 = class208.field2988 + class208.field2988;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class240.field3399[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class113.field1539 - var1.field3019;
                        if (var12 > 32) {
                            var1.field3007 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3007 = 4;
                            var12 = -var12;
                        }
                        var1.field3021 = (var1.field3016 - class234.field3310 << 8) / var12;
                        var1.field3015 = (var1.field3024 - class234.field3310 << 8) / var12;
                        var1.field3017 = (var1.field3005 - class173.field2353 << 8) / var12;
                        var1.field3013 = (var1.field3008 - class173.field2353 << 8) / var12;
                        class201.field2865[class56.field769++] = var1;
                    }
                }
            } else if (var1.field3004 == 4) {
                int var13 = var1.field3005 - class173.field2353;
                if (var13 > 128) {
                    int var14 = var1.field3026 + class208.field2988 - class25.field315;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3009 + class208.field2988 - class25.field315;
                    if (var15 > class208.field2988 + class208.field2988) {
                        var15 = class208.field2988 + class208.field2988;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3020 + class208.field2988 - class175.field2383;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3006 + class208.field2988 - class175.field2383;
                        if (var17 > class208.field2988 + class208.field2988) {
                            var17 = class208.field2988 + class208.field2988;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class240.field3399[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3007 = 5;
                            var1.field3021 = (var1.field3016 - class234.field3310 << 8) / var13;
                            var1.field3015 = (var1.field3024 - class234.field3310 << 8) / var13;
                            var1.field3023 = (var1.field3019 - class113.field1539 << 8) / var13;
                            var1.field3018 = (var1.field3010 - class113.field1539 << 8) / var13;
                            class201.field2865[class56.field769++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZ[[I[[FB[[IIIILtk;III[[FIFI[[F)I", line = 252)
    public static final int method356(int arg0, boolean arg1, int[][] arg2, float[][] arg3, byte arg4, int[][] arg5, int arg6, int arg7, int arg8, class268 arg9, int arg10, int arg11, int arg12, float[][] arg13, int arg14, float arg15, int arg16, float[][] arg17) {
        field698++;
        if (arg6 == 1) {
            int var19 = arg8;
            arg8 = arg11;
            arg11 = 128 - var19;
        } else if (arg6 == 2) {
            arg8 = 128 - arg8;
            arg11 = 128 - arg11;
        } else if (arg6 == 3) {
            int var18 = arg8;
            arg8 = 128 - arg11;
            arg11 = var18;
        }
        if (arg4 > -41) {
            method354((byte[]) null, (byte) 60);
        }
        float var20;
        int var21;
        float var22;
        float var23;
        if (arg8 == 0 && arg11 == 0) {
            var20 = arg13[arg7][arg0];
            var21 = arg14;
            var22 = arg3[arg7][arg0];
            var23 = arg17[arg7][arg0];
        } else if (arg8 == 128 && arg11 == 0) {
            var22 = arg3[arg7 + 1][arg0];
            var20 = arg13[arg7 + 1][arg0];
            var23 = arg17[arg7 + 1][arg0];
            var21 = arg16;
        } else if (arg8 == 128 && arg11 == 128) {
            var22 = arg3[arg7 + 1][arg0 + 1];
            var20 = arg13[arg7 + 1][arg0 + 1];
            var21 = arg12;
            var23 = arg17[arg7 + 1][arg0 + 1];
        } else if (arg8 == 0 && arg11 == 128) {
            var20 = arg13[arg7][arg0 + 1];
            var22 = arg3[arg7][arg0 + 1];
            var23 = arg17[arg7][arg0 + 1];
            var21 = arg10;
        } else {
            float var24 = arg13[arg7][arg0];
            float var25 = arg17[arg7][arg0];
            float var26 = arg3[arg7][arg0];
            float var27 = arg17[arg7][arg0 + 1];
            float var28 = (float) arg11 / 128.0F;
            float var29 = (float) arg8 / 128.0F;
            float var30 = (arg17[arg7 + 1][arg0] - var25) * var29 + var25;
            float var31 = (arg17[arg7 + 1][arg0 + 1] - var27) * var29 + var27;
            float var32 = arg13[arg7][arg0 + 1];
            var23 = (var31 - var30) * var28 + var30;
            float var33 = arg3[arg7][arg0 + 1];
            float var34 = (arg13[arg7 + 1][arg0 + 1] - var32) * var29 + var32;
            float var35 = (arg13[arg7 + 1][arg0] - var24) * var29 + var24;
            var20 = (var34 - var35) * var28 + var35;
            float var36 = (arg3[arg7 + 1][arg0 + 1] - var33) * var29 + var33;
            float var37 = (arg3[arg7 + 1][arg0] - var26) * var29 + var26;
            var22 = (var36 - var37) * var28 + var37;
            int var38 = class64.method434(arg8, arg14, arg16, (byte) 71);
            int var39 = class64.method434(arg8, arg10, arg12, (byte) 71);
            var21 = class64.method434(arg11, var38, var39, (byte) 71);
        }
        int var40 = (arg0 << 7) + arg11;
        int var41 = (arg7 << 7) + arg8;
        int var42 = class316.method2178(arg7, arg8, 128, arg11, arg2, arg0);
        return arg9.method1850(var41, var42, var40, var23, var22, var20, arg1 ? var21 & 0xFFFFFF00 : var21, arg5 == null ? 0.0F : (float) (var42 - class316.method2178(arg7, arg8, 128, arg11, arg5, arg0)) / arg15);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Z", line = 363)
    public final boolean method357(int arg0, int arg1) {
        field700++;
        if (arg0 != -1) {
            method358(-105, -25, 122);
        }
        return this.field703[arg1].field3831;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V", line = 376)
    public static final void method358(int arg0, int arg1, int arg2) {
        field699++;
        if (class269.method1854((byte) -106, arg1)) {
            class342.method2357(class241.field3419[arg1], arg2 ^ arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)Z", line = 389)
    public final boolean method359(int arg0, int arg1) {
        field704++;
        if (arg1 != -12124) {
            field697 = 11;
        }
        return this.field703[arg0].field3823;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(III)Lco;", line = 401)
    public static final class280 method360(int arg0, int arg1, int arg2) {
        class202 var3 = class142.field1940[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2875; var4++) {
            class280 var5 = var3.field2896[var4];
            if ((var5.field4203 >> 29 & 0x3L) == 2L && var5.field4204 == arg1 && var5.field4200 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lkm;Lkm;IZ)V", line = 422)
    public class52(class133 arg0, class133 arg1, int arg2, boolean arg3) {
        class192 var5 = new class192();
        int var6 = arg0.method970(-92, arg2);
        this.field703 = new class260[var6];
        int[] var7 = arg0.method954(0, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method955(arg2, var7[var8], -21853);
            int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            class339 var11 = null;
            for (class339 var12 = (class339) var5.method1335(1); var12 != null; var12 = (class339) var5.method1336(3)) {
                if (var12.field5090 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method947(0, (byte) -122, var10);
                } else {
                    var13 = arg1.method947(var10, (byte) -110, 0);
                }
                var11 = new class339(var10, var13);
                var5.method1339((byte) -105, var11);
            }
            this.field703[var7[var8]] = new class260(var9, var11);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZI)Lom;", line = 482)
    public static final class125 method361(boolean arg0, int arg1) {
        field702++;
        if (!arg0) {
            return (class125) null;
        }
        class125 var2 = (class125) class26.field330.method716((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class210.field3041.method955(class150.method1091(-1058214713, arg1), class68.method505(arg0, arg1), -21853);
        class125 var4 = new class125();
        var4.field1686 = arg1;
        if (var3 != null) {
            var4.method907(new class316(var3), 1000);
        }
        var4.method898(-4);
        class26.field330.method721((long) arg1, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V", line = 507)
    public static void method362(boolean arg0) {
        field695 = null;
        if (arg0) {
            method358(-109, -26, -88);
        }
    }
}
