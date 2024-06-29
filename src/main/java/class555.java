import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class555 extends class518 {

    @OriginalMember(owner = "client!ps", name = "G", descriptor = "I")
    private int field8079 = 4096;

    @OriginalMember(owner = "client!ps", name = "D", descriptor = "Z")
    private boolean field8083 = true;

    @OriginalMember(owner = "client!ps", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field8086 = new String[] { method4159(method4158("\r\u001bxj\u001b")), method4159(method4158("\r\u001bxh\u001b")), method4159(method4158("\u0013\u001d:G")), method4159(method4158("\u0006Fx\u0005N")), method4159(method4158("\r\u001bxo\u001b")), method4159(method4158("]T5D_@XfMUEXh")), method4159(method4158("AG5D_C")), method4159(method4158("TTyH\\\u0011V")), method4159(method4158("]T5D_@\u000e0MUMXh")), method4159(method4158("]T5D_@\u000e0MU\u001b\u000eh")), method4159(method4158("]@")), method4159(method4158("\r\u001bxi\u001b")), method4159(method4158("\r\u001bxn\u001b")) };

    @OriginalMember(owner = "client!ps", name = "H", descriptor = "Ltf;")
    public static class524 field8080 = new class524();

    @OriginalMember(owner = "client!ps", name = "C", descriptor = "I")
    public static int field8081 = -2;

    @OriginalMember(owner = "client!ps", name = "I", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!ps", name = "B", descriptor = "I")
    public static int field8082;

    @OriginalMember(owner = "client!ps", name = "E", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!ps", name = "F", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZIII)V", line = 5)
    public static final void method4155(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        try {
            ++field8082;
            if (arg1 || class353.field5113 != arg3 || ~class427.field6145 != ~arg2 || class693.field9689 != class475.field6973 && class451.field6612.field9089.method5427(arg4 ^ -8) != 1) {
                class353.field5113 = arg3;
                class427.field6145 = arg2;
                class475.field6973 = class693.field9689;
                if (class451.field6612.field9089.method5427(arg4 ^ -8) == 1) {
                    class475.field6973 = 0;
                }
                class699.method5035(arg0, 31754);
                class649.method4730(2, class84.field1185, class537.field7842.method4068((byte) -54, class405.field5883), class23.field279, class236.field3418, true);
                int var5 = class537.field7895;
                class537.field7895 = (-(class625.field8929 >> 4) + class353.field5113) * 8;
                int var6 = class655.field9286;
                class655.field9286 = (-(class14.field187 >> 4) + class427.field6145) * 8;
                class450.field6600 = class534.method4040(class353.field5113 * 8, class427.field6145 * 8);
                class293.field4126 = null;
                int var7 = -var5 + class537.field7895;
                if (arg4 == -5) {
                    int var8 = -var6 + class655.field9286;
                    if (~arg0 != -13) {
                        boolean var9 = false;
                        class438.field6458 = 0;
                        int var10 = (class625.field8929 - 1) * 512;
                        int var11 = class14.field187 * 512 - 512;
                        for (int var12 = 0; class715.field10182 > var12; ++var12) {
                            class527 var13 = class677.field9494[var12];
                            if (var13 != null) {
                                class717 var14 = var13.field7672;
                                var14.field2984 -= var8 * 512;
                                var14.field2969 -= var7 * 512;
                                if (~var14.field2969 <= -1 && ~var10 <= ~var14.field2969 && ~var14.field2984 <= -1 && ~var11 <= ~var14.field2984) {
                                    boolean var15 = true;
                                    for (int var16 = 0; var16 < 10; ++var16) {
                                        var14.field2252[var16] -= var7;
                                        var14.field2256[var16] -= var8;
                                        if (~var14.field2252[var16] > -1 || var14.field2252[var16] >= class625.field8929 || var14.field2256[var16] < 0 || ~var14.field2256[var16] <= ~class14.field187) {
                                            var15 = false;
                                        }
                                    }
                                    if (!var15) {
                                        var14.method5200((class134) null, -1);
                                        var9 = true;
                                        var13.method4294(0);
                                    } else {
                                        class343.field4987[class438.field6458++] = var14.field2200;
                                    }
                                } else {
                                    var14.method5200((class134) null, arg4 ^ 4);
                                    var13.method4294(0);
                                    var9 = true;
                                }
                            }
                        }
                        if (var9) {
                            class715.field10182 = class479.field7063.method3692(21538);
                            class479.field7063.method3694((byte) -126, class677.field9494);
                        }
                    } else {
                        for (int var17 = 0; var17 < class715.field10182; ++var17) {
                            class527 var18 = class677.field9494[var17];
                            if (var18 != null) {
                                class717 var19 = var18.field7672;
                                for (int var20 = 0; ~var20 > -11; ++var20) {
                                    var19.field2252[var20] -= var7;
                                    var19.field2256[var20] -= var8;
                                }
                                var19.field2969 -= var7 * 512;
                                var19.field2984 -= var8 * 512;
                            }
                        }
                    }
                    for (int var21 = 0; var21 < 2048; ++var21) {
                        class339 var22 = class748.field10666[var21];
                        if (var22 != null) {
                            for (int var23 = 0; ~var23 > -11; ++var23) {
                                var22.field2252[var23] -= var7;
                                var22.field2256[var23] -= var8;
                            }
                            var22.field2984 -= var8 * 512;
                            var22.field2969 -= var7 * 512;
                        }
                    }
                    class337[] var24 = class99.field1336;
                    for (int var25 = 0; var24.length > var25; ++var25) {
                        class337 var26 = var24[var25];
                        if (var26 != null) {
                            var26.field4887 -= var8 * 512;
                            var26.field4879 -= var7 * 512;
                        }
                    }
                    for (class224 var27 = (class224) class486.field7127.method3977((byte) -91); var27 != null; var27 = (class224) class486.field7127.method3987(0)) {
                        var27.field3247 -= var8;
                        var27.field3248 -= var7;
                        if (class751.field10694 != 4 && (~var27.field3248 > -1 || ~var27.field3247 > -1 || class625.field8929 <= var27.field3248 || ~class14.field187 >= ~var27.field3247)) {
                            var27.method4294(0);
                        }
                    }
                    for (class224 var28 = (class224) class631.field8964.method3977((byte) -48); var28 != null; var28 = (class224) class631.field8964.method3987(0)) {
                        var28.field3247 -= var8;
                        var28.field3248 -= var7;
                        if (~class751.field10694 != -5 && (var28.field3248 < 0 || var28.field3247 < 0 || ~class625.field8929 >= ~var28.field3248 || ~var28.field3247 <= ~class14.field187)) {
                            var28.method4294(0);
                        }
                    }
                    if (class751.field10694 != 4) {
                        for (class413 var29 = (class413) class414.field5965.method3696(arg4 + 5); var29 != null; var29 = (class413) class414.field5965.method3697(arg4 ^ 40)) {
                            int var30 = (int) (var29.field8378 & 16383L);
                            int var31 = var30 - class537.field7895;
                            int var32 = (int) (16383L & var29.field8378 >> 14);
                            int var33 = var32 - class655.field9286;
                            if (var31 < 0 || ~var33 > -1 || var31 >= class625.field8929 || var33 >= class14.field187) {
                                var29.method4294(0);
                            }
                        }
                    }
                    if (class477.field7028 != 0) {
                        class477.field7028 -= var7;
                        class346.field5032 -= var8;
                    }
                    class551.method4122(4);
                    if (arg0 == 12) {
                        if (class596.field8579 == 4) {
                            class604.field8658 -= var8 * 512;
                            class222.field3217 -= var7 * 512;
                            class138.field1805 -= var8 * 512;
                            class36.field439 -= var7 * 512;
                        } else {
                            class596.field8579 = 1;
                            class301.field4188 = -1;
                            class171.field2267 = -1;
                        }
                    } else {
                        class688.field9635 -= var8 * 512;
                        class767.field10954 -= var8;
                        class86.field1220 -= var8;
                        class105.field1378 -= var7;
                        class152.field1944 -= var7;
                        class670.field9442 -= var7 * 512;
                        if (Math.abs(var7) > class625.field8929 || Math.abs(var8) > class14.field187) {
                            class180.method1498((byte) 58);
                        }
                    }
                    class239.method1980(6977);
                    class489.method3764(-15640);
                    class463.field6759.method3982(-127);
                    class574.field8309.method3982(-119);
                    class211.field3097.method3613((byte) 118);
                    class138.method1207((byte) -82);
                }
            }
        } catch (RuntimeException var35) {
            throw class665.method4799(var35, field8086[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 279)
    public static final String method4156(byte arg0, int arg1) {
        try {
            ++field8078;
            String var2 = Integer.toString(arg1);
            if (arg0 <= 85) {
                method4155(-65, false, -21, 81, -88);
            }
            for (int var3 = -3 + var2.length(); ~var3 < -1; var3 -= 3) {
                var2 = var2.substring(0, var3) + "," + var2.substring(var3);
            }
            if (~var2.length() < -10) {
                return field8086[5] + var2.substring(0, var2.length() - 8) + class537.field7863.method4068((byte) -65, class405.field5883) + field8086[10] + var2 + field8086[7];
            } else {
                return ~var2.length() < -7 ? field8086[9] + var2.substring(0, var2.length() + -4) + class537.field7865.method4068((byte) -78, class405.field5883) + field8086[10] + var2 + field8086[7] : field8086[8] + var2 + field8086[6];
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8086[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)[[I", line = 310)
    public final int[][] method349(int arg0, int arg1) {
        try {
            ++field8084;
            if (arg0 != 0) {
                field8080 = null;
            }
            int[][] var3 = super.field7575.method1955(arg1, arg0 ^ -2);
            if (super.field7575.field3416) {
                int[] var4 = this.method3944(class478.field7048 & arg1 + -1, 0, (byte) 73);
                int[] var5 = this.method3944(arg1, 0, (byte) 73);
                int[] var6 = this.method3944(class478.field7048 & arg1 + 1, 0, (byte) 73);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; var10 < class110.field1436; ++var10) {
                    int var11 = (var6[var10] + -var4[var10]) * this.field8079;
                    int var12 = (var5[class247.field3543 & var10 + 1] + -var5[class247.field3543 & var10 + -1]) * this.field8079;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var13 * var13 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 - -4096) / 4096.0F)) * 4096.0D);
                    int var18;
                    int var19;
                    int var20;
                    if (~var17 != -1) {
                        var18 = var12 / var17;
                        var19 = 16777216 / var17;
                        var20 = var11 / var17;
                    } else {
                        var19 = 0;
                        var18 = 0;
                        var20 = 0;
                    }
                    if (this.field8083) {
                        var18 = (var18 >> 1) + 2048;
                        var19 = (var19 >> 1) + 2048;
                        var20 = 2048 - -(var20 >> 1);
                    }
                    var7[var10] = var18;
                    var8[var10] = var20;
                    var9[var10] = var19;
                }
            }
            return var3;
        } catch (RuntimeException var22) {
            throw class665.method4799(var22, field8086[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V", line = 436)
    public class555() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILjc;I)V", line = 395)
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field8085;
            if (arg2 != -3) {
                field8080 = null;
            }
            if (arg0 != 0) {
                if (~arg0 == -2) {
                    this.field8083 = arg1.method5128(0) == 1;
                }
            } else {
                this.field8079 = arg1.method5116((byte) -124);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8086[1] + arg0 + ',' + (arg1 != null ? field8086[3] : field8086[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(B)V", line = 443)
    public static void method4157(byte arg0) {
        try {
            field8080 = null;
            if (arg0 != -68) {
                method4156((byte) -99, 58);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8086[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4158(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4159(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 125;
                    break;
                case 1:
                    var10005 = 104;
                    break;
                case 2:
                    var10005 = 86;
                    break;
                case 3:
                    var10005 = 43;
                    break;
                default:
                    var10005 = 51;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
