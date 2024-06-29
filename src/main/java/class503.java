import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class503 {

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Z")
    public boolean field7351 = true;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    private int field7345 = -1;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    private int field7350;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "Lml;")
    private class194 field7354;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    private int field7347;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Lko;")
    private class1 field7348;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    private int field7346;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "Lbp;")
    private class117 field7343;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lbda;")
    private class181 field7355;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lcm;")
    private class526 field7356;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7358 = new String[] { method3852(method3851("\u0010d\u0011b")), method3852(method3851("\u0012?Ag?\u0017eC&")), method3852(method3851("\u0005?S ,")), method3852(method3851("\u0012?8&")), method3852(method3851("\u0012?9&")), method3852(method3851("\u0012?<&")), method3852(method3851("\u0012?>&")), method3852(method3851("\u0012??&")) };

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Liea;")
    public static class421 field7340 = new class421();

    @OriginalMember(owner = "client!l", name = "b", descriptor = "F")
    public static float field7341;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "J")
    public static long field7352;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "[I")
    public static int[] field7338;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "[Llt;")
    public static class182[] field7357;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "[Ltb;")
    public static class392[] field7353;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V", line = 10)
    public final void method3846(int arg0) {
        try {
            if (arg0 != 6406) {
                this.field7351 = true;
            }
            field7349++;
            this.method3849((byte) 96, this.field7346, this.field7355);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7358[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 27)
    public static void method3847(int arg0) {
        try {
            if (arg0 >= 92) {
                field7353 = null;
                field7357 = null;
                field7340 = null;
                field7338 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7358[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lml;Lko;Lqd;IIIII)V", line = 53)
    public class503(class194 arg0, class1 arg1, class622 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.field7350 = arg6;
            this.field7354 = arg0;
            this.field7347 = arg7;
            this.field7348 = arg1;
            int var9 = 0x1 << arg5;
            int var10 = 0;
            int var11 = arg3 << arg5;
            int var12 = arg4 << arg5;
            for (int var13 = 0; var13 < var9; var13++) {
                int var14 = (var12 + var13) * arg2.field10701 + var11;
                for (int var15 = 0; var15 < var9; var15++) {
                    short[] var16 = arg2.field8872[var14++];
                    if (var16 != null) {
                        var10 += var16.length;
                    }
                }
            }
            this.field7346 = var10;
            if (var10 <= 0) {
                this.field7343 = null;
            } else {
                class711 var17 = new class711(var10 * 2);
                if (this.field7354.field2842) {
                    for (int var18 = 0; var18 < var9; var18++) {
                        int var19 = (var12 + var18) * arg2.field10701 + var11;
                        for (int var20 = 0; var20 < var9; var20++) {
                            short[] var21 = arg2.field8872[var19++];
                            if (var21 != null) {
                                for (int var22 = 0; var22 < var21.length; var22++) {
                                    var17.method5138((byte) -119, var21[var22] & 0xFFFF);
                                }
                            }
                        }
                    }
                } else {
                    for (int var23 = 0; var23 < var9; var23++) {
                        int var24 = (var12 + var23) * arg2.field10701 + var11;
                        for (int var25 = 0; var25 < var9; var25++) {
                            short[] var26 = arg2.field8872[var24++];
                            if (var26 != null) {
                                for (int var27 = 0; var27 < var26.length; var27++) {
                                    var17.method5106(var26[var27] & 0xFFFF, -78);
                                }
                            }
                        }
                    }
                }
                this.field7355 = this.field7354.method1612(var17.field9945, false, 5123, true, var17.field9996);
                this.field7356 = new class526(this.field7354, 5123, null, 1);
            }
        } catch (RuntimeException var29) {
            throw class665.method4799(var29, field7358[1] + (arg0 == null ? field7358[0] : field7358[2]) + ',' + (arg1 == null ? field7358[0] : field7358[2]) + ',' + (arg2 == null ? field7358[0] : field7358[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 175)
    private final void method3848(int arg0) {
        try {
            field7344++;
            if (this.field7351) {
                this.field7351 = false;
                byte[] var2 = this.field7348.field15;
                byte[] var3 = this.field7354.field2912;
                if (arg0 != -1) {
                    this.method3849((byte) -66, 56, null);
                }
                int var4 = 0;
                int var5 = this.field7348.field16;
                int var6 = this.field7348.field16 * this.field7347 + this.field7350;
                for (int var7 = -128; var7 < 0; var7++) {
                    var4 = (var4 << 8) - var4;
                    for (int var8 = -128; var8 < 0; var8++) {
                        if (var2[var6++] != 0) {
                            var4++;
                        }
                    }
                    var6 += var5 - 128;
                }
                if (this.field7343 != null && this.field7345 == var4) {
                    this.field7351 = false;
                } else {
                    this.field7345 = var4;
                    int var9 = 0;
                    int var10 = this.field7347 * var5 + this.field7350;
                    for (int var11 = -128; var11 < 0; var11++) {
                        for (int var12 = -128; var12 < 0; var12++) {
                            if (var2[var10] == 0) {
                                int var13 = 0;
                                if (var2[var10 - 1] != 0) {
                                    var13++;
                                }
                                if (var2[var10 + 1] != 0) {
                                    var13++;
                                }
                                if (var2[var10 - var5] != 0) {
                                    var13++;
                                }
                                if (var2[var10 + var5] != 0) {
                                    var13++;
                                }
                                var3[var9++] = (byte) (var13 * 17);
                            } else {
                                var3[var9++] = 68;
                            }
                            var10++;
                        }
                        var10 += this.field7348.field16 - 128;
                    }
                    if (this.field7343 == null) {
                        this.field7343 = new class117(this.field7354, 3553, 6406, 128, 128, false, this.field7354.field2912, 6406, false);
                        this.field7343.method1065(false, (byte) 115, false);
                        this.field7343.method3600(117, true);
                    } else {
                        this.field7343.method1064(0, this.field7354.field2912, 0, 6406, 128, false, 0, 128, (byte) 62, 0);
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field7358[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BILbda;)V", line = 282)
    private final void method3849(byte arg0, int arg1, class181 arg2) {
        try {
            field7339++;
            if (arg1 != 0) {
                this.method3848(-1);
                this.field7354.method1618((byte) 8, this.field7343);
                if (arg0 != 96) {
                    this.method3849((byte) -31, 124, null);
                }
                this.field7354.method1647(0, arg1, arg2, -106, 4);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7358[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7358[0] : field7358[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B[BII)V", line = 301)
    public final void method3850(byte arg0, byte[] arg1, int arg2, int arg3) {
        try {
            field7342++;
            this.field7356.method1507(arg2 * this.field7354.method1665(arg0 ^ 0xFFFFB517, arg3), -32534, arg3, arg1);
            if (arg0 != -16) {
                this.method3846(-107);
            }
            this.method3849((byte) 96, arg2, this.field7356);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7358[7] + arg0 + ',' + (arg1 == null ? field7358[0] : field7358[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3851(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!l", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3852(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 126;
                    break;
                case 1:
                    var10005 = 17;
                    break;
                case 2:
                    var10005 = 125;
                    break;
                case 3:
                    var10005 = 14;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
