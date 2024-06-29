import java.io.IOException;
import java.lang.reflect.Field;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class126 extends class211 {

    @OriginalMember(owner = "client!lfa", name = "J", descriptor = "I")
    private int field1491 = 6;

    @OriginalMember(owner = "client!lfa", name = "M", descriptor = "[Ljava/lang/String;")
    private static final String[] field1494 = new String[] { method1107(method1106("z\u0003Cam>")), method1107(method1106("e\rM8\u007f\u007f\u0001G hr")), method1107(method1106("q\u000fC")), method1107(method1106("z\u0003Cah>")), method1107(method1106("~\fC")), method1107(method1106("z\u0003Ca`>")), method1107(method1106("z\u0003Caj>")), method1107(method1106("x\u0010N#")), method1107(method1106("mK\faT")), method1107(method1106("z\u0003Cao>")), method1107(method1106("z\u0003Cak>")), method1107(method1106("z\u0003Cal>")) };

    @OriginalMember(owner = "client!lfa", name = "F", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!lfa", name = "G", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!lfa", name = "K", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!lfa", name = "E", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!lfa", name = "H", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!lfa", name = "I", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!lfa", name = "D", descriptor = "I")
    public static int field1490;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lfa", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field1492;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lfa", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field1493;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1105(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "(I)I", line = 4)
    public static final int method1101(int arg0) {
        try {
            ++field1487;
            int var1 = 0;
            Field[] var2 = (field1492 != null ? field1492 : (field1492 = method1105(field1494[4]))).getDeclaredFields();
            if (arg0 > -19) {
                return -118;
            } else {
                Field[] var3 = var2;
                for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
                    Field var5 = var3[var4];
                    if ((field1493 != null ? field1493 : (field1493 = method1105(field1494[2]))).isAssignableFrom(var5.getType())) {
                        ++var1;
                    }
                }
                return var1 + 1;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field1494[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(II)[[I", line = 35)
    public final int[][] method234(int arg0, int arg1) {
        try {
            ++field1490;
            if (arg1 >= -38) {
                this.field1491 = -49;
            }
            int[][] var3 = super.field3230.method5463((byte) -8, arg0);
            if (super.field3230.field10931) {
                int[][] var4 = this.method1853(0, 0, arg0);
                int[][] var5 = this.method1853(1, 0, arg0);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field1491;
                if (var15 != 1) {
                    if (~var15 != -3) {
                        if (var15 != 3) {
                            if (~var15 != -5) {
                                if (~var15 != -6) {
                                    if (var15 != 6) {
                                        if (~var15 != -8) {
                                            if (~var15 != -9) {
                                                if (var15 != 9) {
                                                    if (var15 != 10) {
                                                        if (var15 != 11) {
                                                            if (~var15 == -13) {
                                                                for (int var57 = 0; class343.field5332 > var57; ++var57) {
                                                                    int var58 = var13[var57];
                                                                    int var59 = var11[var57];
                                                                    int var60 = var14[var57];
                                                                    int var61 = var10[var57];
                                                                    int var62 = var12[var57];
                                                                    int var63 = var9[var57];
                                                                    var6[var57] = var62 + var63 + -(var62 * var63 >> 11);
                                                                    var7[var57] = -(var58 * var61 >> 11) + var61 + var58;
                                                                    var8[var57] = var59 + var60 - (var59 * var60 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var50 = 0; ~var50 > ~class343.field5332; ++var50) {
                                                                int var51 = var10[var50];
                                                                int var52 = var12[var50];
                                                                int var53 = var14[var50];
                                                                int var54 = var13[var50];
                                                                int var55 = var11[var50];
                                                                int var56 = var9[var50];
                                                                var6[var50] = ~var52 <= ~var56 ? -var56 + var52 : var56 - var52;
                                                                var7[var50] = var51 <= var54 ? -var51 + var54 : -var54 + var51;
                                                                var8[var50] = ~var53 <= ~var55 ? -var55 + var53 : -var53 + var55;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var43 = 0; ~var43 > ~class343.field5332; ++var43) {
                                                            int var44 = var13[var43];
                                                            int var45 = var11[var43];
                                                            int var46 = var9[var43];
                                                            int var47 = var10[var43];
                                                            int var48 = var12[var43];
                                                            int var49 = var14[var43];
                                                            var6[var43] = var48 < var46 ? var46 : var48;
                                                            var7[var43] = ~var44 > ~var47 ? var47 : var44;
                                                            var8[var43] = var49 < var45 ? var45 : var49;
                                                        }
                                                    }
                                                } else {
                                                    for (int var36 = 0; var36 < class343.field5332; ++var36) {
                                                        int var37 = var13[var36];
                                                        int var38 = var12[var36];
                                                        int var39 = var11[var36];
                                                        int var40 = var9[var36];
                                                        int var41 = var14[var36];
                                                        int var42 = var10[var36];
                                                        var6[var36] = ~var38 < ~var40 ? var40 : var38;
                                                        var7[var36] = var42 >= var37 ? var37 : var42;
                                                        var8[var36] = ~var41 >= ~var39 ? var41 : var39;
                                                    }
                                                }
                                            } else {
                                                for (int var32 = 0; class343.field5332 > var32; ++var32) {
                                                    int var33 = var10[var32];
                                                    int var34 = var9[var32];
                                                    int var35 = var11[var32];
                                                    var6[var32] = var34 == 0 ? 0 : -((-var12[var32] + 4096 << 12) / var34) + 4096;
                                                    var7[var32] = ~var33 == -1 ? 0 : -((-var13[var32] + 4096 << 12) / var33) + 4096;
                                                    var8[var32] = ~var35 != -1 ? -((-var14[var32] + 4096 << 12) / var35) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var28 = 0; ~var28 > ~class343.field5332; ++var28) {
                                                int var29 = var10[var28];
                                                int var30 = var9[var28];
                                                int var31 = var11[var28];
                                                var6[var28] = var30 == 4096 ? 4096 : (var12[var28] << 12) / (-var30 + 4096);
                                                var7[var28] = ~var29 != -4097 ? (var13[var28] << 12) / (-var29 + 4096) : 4096;
                                                var8[var28] = var31 != 4096 ? (var14[var28] << 12) / (-var31 + 4096) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var24 = 0; class343.field5332 > var24; ++var24) {
                                            int var25 = var14[var24];
                                            int var26 = var12[var24];
                                            int var27 = var13[var24];
                                            var6[var24] = var26 >= 2048 ? -((4096 - var26) * (-var9[var24] + 4096) >> 11) + 4096 : var9[var24] * var26 >> 11;
                                            var7[var24] = ~var27 > -2049 ? var10[var24] * var27 >> 11 : 4096 - ((4096 - var27) * (-var10[var24] + 4096) >> 11);
                                            var8[var24] = var25 < 2048 ? var11[var24] * var25 >> 11 : -((4096 - var11[var24]) * (-var25 + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class343.field5332 < ~var23; ++var23) {
                                        var6[var23] = -((-var9[var23] + 4096) * (-var12[var23] + 4096) >> 12) + 4096;
                                        var7[var23] = 4096 - ((4096 - var13[var23]) * (-var10[var23] + 4096) >> 12);
                                        var8[var23] = -((4096 - var14[var23]) * (-var11[var23] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var19 = 0; ~class343.field5332 < ~var19; ++var19) {
                                    int var20 = var13[var19];
                                    int var21 = var14[var19];
                                    int var22 = var12[var19];
                                    var6[var19] = var22 == 0 ? 4096 : (var9[var19] << 12) / var22;
                                    var7[var19] = ~var20 == -1 ? 4096 : (var10[var19] << 12) / var20;
                                    var8[var19] = var21 == 0 ? 4096 : (var11[var19] << 12) / var21;
                                }
                            }
                        } else {
                            for (int var18 = 0; ~var18 > ~class343.field5332; ++var18) {
                                var6[var18] = var9[var18] * var12[var18] >> 12;
                                var7[var18] = var10[var18] * var13[var18] >> 12;
                                var8[var18] = var11[var18] * var14[var18] >> 12;
                            }
                        }
                    } else {
                        for (int var17 = 0; ~var17 > ~class343.field5332; ++var17) {
                            var6[var17] = var9[var17] + -var12[var17];
                            var7[var17] = var10[var17] + -var13[var17];
                            var8[var17] = var11[var17] + -var14[var17];
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < class343.field5332; ++var16) {
                        var6[var16] = var9[var16] + var12[var16];
                        var7[var16] = var10[var16] - -var13[var16];
                        var8[var16] = var11[var16] - -var14[var16];
                    }
                }
            }
            return var3;
        } catch (RuntimeException var65) {
            throw class759.method5498(var65, field1494[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "(Z)V", line = 352)
    public static final void method1102(boolean arg0) {
        try {
            ++field1486;
            if (class545.field8147 != 0) {
                try {
                    if (++class388.field5854 > 2000) {
                        if (class629.field9198 != null) {
                            class629.field9198.method2700((byte) 120);
                            class629.field9198 = null;
                        }
                        if (~class236.field3560 <= -3) {
                            class325.field5130 = -5;
                            class545.field8147 = 0;
                            return;
                        }
                        class149.field1830.method145((byte) 126);
                        class388.field5854 = 0;
                        ++class236.field3560;
                        class545.field8147 = 1;
                    }
                    if (class545.field8147 == 1) {
                        class695.field10144 = class149.field1830.method146(class580.field8601, (byte) -125);
                        class545.field8147 = 2;
                    }
                    if (class545.field8147 == 2) {
                        if (class695.field10144.field503 == 2) {
                            throw new IOException();
                        }
                        if (~class695.field10144.field503 != -2) {
                            return;
                        }
                        class629.field9198 = class341.method2835(15000, false, (Socket) class695.field10144.field499);
                        class695.field10144 = null;
                        class443.method3401(-1);
                        class545.field8147 = 4;
                    }
                    if (~class545.field8147 == -5) {
                        if (!class629.field9198.method2698(84, 1)) {
                            return;
                        }
                        class629.field9198.method2697(0, 1, 2, class430.field6332.field2209);
                        int var1 = 255 & class430.field6332.field2209[0];
                        class545.field8147 = 0;
                        class325.field5130 = var1;
                        class629.field9198.method2700((byte) 121);
                        class629.field9198 = null;
                        return;
                    }
                } catch (IOException var3) {
                    if (class629.field9198 != null) {
                        class629.field9198.method2700((byte) 126);
                        class629.field9198 = null;
                    }
                    if (class236.field3560 < 2) {
                        class149.field1830.method145((byte) 109);
                        class545.field8147 = 1;
                        class388.field5854 = 0;
                        ++class236.field3560;
                    } else {
                        class325.field5130 = -4;
                        class545.field8147 = 0;
                    }
                }
                if (arg0) {
                    ;
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1494[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "(I)Z", line = 453)
    public static final boolean method1103(int arg0) {
        try {
            ++field1488;
            if (arg0 != 4) {
                method1102(false);
            }
            if (class296.field4464) {
                try {
                    class600.method4461(class629.field9206, field1494[1], (byte) -21);
                    return true;
                } catch (Throwable var2) {
                }
            }
            return false;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1494[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZLjava/lang/String;B)V", line = 474)
    public static final void method1104(boolean arg0, String arg1, byte arg2) {
        try {
            class784.method5675(-1, 1, -1, arg1, arg0);
            ++field1484;
            if (arg2 != -29) {
                method1103(-20);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1494[11] + arg0 + ',' + (arg1 != null ? field1494[8] : field1494[7]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BILib;)V", line = 487)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (~arg1 != -1) {
                if (arg1 == 1) {
                    super.field3235 = arg2.method1455((byte) 62) == 1;
                }
            } else {
                this.field1491 = arg2.method1455((byte) 62);
            }
            if (arg0 >= 67) {
                ++field1489;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1494[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1494[8] : field1494[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "()V", line = 523)
    public class126() {
        super(2, false);
    }

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "(II)[I", line = 527)
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field1485;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (arg0 != 8217) {
                return null;
            } else {
                if (super.field3231.field57) {
                    int[] var4 = this.method1856(0, arg1, 16);
                    int[] var5 = this.method1856(1, arg1, 29);
                    int var6 = this.field1491;
                    if (var6 != 1) {
                        if (~var6 != -3) {
                            if (var6 != 3) {
                                if (~var6 != -5) {
                                    if (var6 != 5) {
                                        if (~var6 != -7) {
                                            if (~var6 != -8) {
                                                if (~var6 != -9) {
                                                    if (~var6 != -10) {
                                                        if (var6 != 10) {
                                                            if (var6 != 11) {
                                                                if (~var6 == -13) {
                                                                    for (int var28 = 0; var28 < class343.field5332; ++var28) {
                                                                        int var29 = var5[var28];
                                                                        int var30 = var4[var28];
                                                                        var3[var28] = -(var29 * var30 >> 11) + var29 + var30;
                                                                    }
                                                                }
                                                            } else {
                                                                for (int var25 = 0; ~class343.field5332 < ~var25; ++var25) {
                                                                    int var26 = var4[var25];
                                                                    int var27 = var5[var25];
                                                                    var3[var25] = ~var27 > ~var26 ? -var27 + var26 : -var26 + var27;
                                                                }
                                                            }
                                                        } else {
                                                            for (int var22 = 0; ~class343.field5332 < ~var22; ++var22) {
                                                                int var23 = var4[var22];
                                                                int var24 = var5[var22];
                                                                var3[var22] = var23 <= var24 ? var24 : var23;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var19 = 0; ~var19 > ~class343.field5332; ++var19) {
                                                            int var20 = var4[var19];
                                                            int var21 = var5[var19];
                                                            var3[var19] = var21 > var20 ? var20 : var21;
                                                        }
                                                    }
                                                } else {
                                                    for (int var17 = 0; var17 < class343.field5332; ++var17) {
                                                        int var18 = var4[var17];
                                                        var3[var17] = var18 != 0 ? -((-var5[var17] + 4096 << 12) / var18) + 4096 : 0;
                                                    }
                                                }
                                            } else {
                                                for (int var15 = 0; var15 < class343.field5332; ++var15) {
                                                    int var16 = var4[var15];
                                                    var3[var15] = ~var16 == -4097 ? 4096 : (var5[var15] << 12) / (-var16 + 4096);
                                                }
                                            }
                                        } else {
                                            for (int var13 = 0; class343.field5332 > var13; ++var13) {
                                                int var14 = var5[var13];
                                                var3[var13] = var14 >= 2048 ? -((4096 - var4[var13]) * (-var14 + 4096) >> 11) + 4096 : var4[var13] * var14 >> 11;
                                            }
                                        }
                                    } else {
                                        for (int var12 = 0; var12 < class343.field5332; ++var12) {
                                            var3[var12] = -((-var4[var12] + 4096) * (-var5[var12] + 4096) >> 12) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var10 = 0; class343.field5332 > var10; ++var10) {
                                        int var11 = var5[var10];
                                        var3[var10] = var11 == 0 ? 4096 : (var4[var10] << 12) / var11;
                                    }
                                }
                            } else {
                                for (int var9 = 0; ~class343.field5332 < ~var9; ++var9) {
                                    var3[var9] = var4[var9] * var5[var9] >> 12;
                                }
                            }
                        } else {
                            for (int var8 = 0; ~var8 > ~class343.field5332; ++var8) {
                                var3[var8] = var4[var8] + -var5[var8];
                            }
                        }
                    } else {
                        for (int var7 = 0; ~var7 > ~class343.field5332; ++var7) {
                            var3[var7] = var4[var7] - -var5[var7];
                        }
                    }
                }
                return var3;
            }
        } catch (RuntimeException var32) {
            throw class759.method5498(var32, field1494[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1106(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 41);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1107(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 22;
                    break;
                case 1:
                    var10005 = 101;
                    break;
                case 2:
                    var10005 = 34;
                    break;
                case 3:
                    var10005 = 79;
                    break;
                default:
                    var10005 = 41;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
