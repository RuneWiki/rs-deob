import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class438 extends class593 {

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "Z")
    private boolean field6455 = false;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "Z")
    private boolean field6465;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "[Lnm;")
    private class361[] field6453;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6466 = new String[] { method3420(method3419(".x=\u0011\u0012")), method3420(method3419(".x=\u001f\u0012")), method3420(method3419("2;=pG")), method3420(method3419(".x=\u0019\u0012")), method3420(method3419("'`\u007f2")), method3420(method3419(".x=\u001b\u0012")), method3420(method3419(".x=\u0016\u0012")), method3420(method3419(".x=\u0017\u0012")), method3420(method3419(".x=\u0018\u0012")), method3420(method3419(".x=\u001c\u0012")), method3420(method3419(".x=bS'|g`\u0012")), method3420(method3419(".x=\u001d\u0012")), method3420(method3419(".x=\u001a\u0012")) };

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    public static int field6458 = 0;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "[I")
    public static int[] field6457 = new int[1000];

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lwb;Lwb;B)V")
    public static final void method3415(class578 arg0, class578 arg1, byte arg2) {
        try {
            if (arg1.field8374 != null) {
                arg1.method4294(0);
            }
            ++field6463;
            arg1.field8374 = arg0.field8374;
            arg1.field8373 = arg0;
            arg1.field8374.field8373 = arg1;
            arg1.field8373.field8374 = arg1;
            if (arg2 >= -22) {
                field6457 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6466[9] + (arg0 != null ? field6466[2] : field6466[4]) + ',' + (arg1 != null ? field6466[2] : field6466[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Ljj;)V")
    public class438(class334 arg0) {
        super(arg0);
        try {
            if (arg0.field4750) {
                this.field6465 = ~arg0.field4733 > -4;
                int var2 = this.field6465 ? 48 : 127;
                int[][] var3 = new int[6][4096];
                int[][] var4 = new int[6][4096];
                int[][] var5 = new int[6][4096];
                int var6 = 0;
                for (int var7 = 0; var7 < 64; ++var7) {
                    for (int var8 = 0; ~var8 > -65; ++var8) {
                        float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                        float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                        float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                        float var12 = var10 * var11;
                        float var13 = var9 * var11;
                        for (int var14 = 0; var14 < 6; ++var14) {
                            float var15;
                            if (~var14 != -1) {
                                if (~var14 != -2) {
                                    if (~var14 != -3) {
                                        if (var14 != 3) {
                                            if (~var14 == -5) {
                                                var15 = var11;
                                            } else {
                                                var15 = -var11;
                                            }
                                        } else {
                                            var15 = -var13;
                                        }
                                    } else {
                                        var15 = var13;
                                    }
                                } else {
                                    var15 = var12;
                                }
                            } else {
                                var15 = -var12;
                            }
                            int var16;
                            int var17;
                            int var18;
                            if (var15 > 0.0F) {
                                var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                                var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                                var18 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                            } else {
                                var18 = 0;
                                var17 = 0;
                                var16 = 0;
                            }
                            var4[var14][var6] = var16 << 24;
                            var5[var14][var6] = var17 << 24;
                            var3[var14][var6] = var18 << 24;
                        }
                        ++var6;
                    }
                }
                this.field6453 = new class361[3];
                this.field6453[0] = super.field8530.method2083(1, 64, var4, false);
                this.field6453[1] = super.field8530.method2083(1, 64, var5, false);
                this.field6453[2] = super.field8530.method2083(1, 64, var3, false);
            }
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field6466[10] + (arg0 != null ? field6466[2] : field6466[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIB)V")
    public final void method463(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 > -98) {
                method3415((class578) null, (class578) null, (byte) 100);
            }
            if (this.field6455) {
                super.field8530.method2661(84, 1);
                super.field8530.method2668(24, this.field6453[arg0 + -1]);
                super.field8530.method2661(80, 0);
            }
            ++field6452;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6466[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Z")
    public final boolean method458(int arg0) {
        try {
            ++field6460;
            if (arg0 < 70) {
                field6458 = -113;
            }
            return true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6466[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V")
    public final void method455(int arg0) {
        try {
            if (this.field6455) {
                super.field8530.method2661(arg0 + 15321, 1);
                super.field8530.method2668(24, (class764) null);
                super.field8530.method2062(arg0 + 10088, class289.field4086);
                super.field8530.method2625(arg0 + -2147468423);
                if (this.field6465) {
                    super.field8530.method2624(class539.field7920, (byte) 124, class539.field7920);
                    super.field8530.method2655(1, 0, class784.field11325);
                    super.field8530.method2670(-128, 0, class784.field11325);
                } else {
                    super.field8530.method2624(class539.field7920, (byte) 125, class539.field7920);
                    super.field8530.method2655(1, 0, class784.field11325);
                    super.field8530.method2661(117, 2);
                    super.field8530.method2624(class539.field7920, (byte) 95, class539.field7920);
                    super.field8530.method2655(1, 0, class784.field11325);
                    super.field8530.method2655(arg0 + 15227, 1, class514.field7551);
                    super.field8530.method2670(-128, 0, class784.field11325);
                    super.field8530.method2668(arg0 + 15250, (class764) null);
                }
                super.field8530.method2661(42, 0);
                this.field6455 = false;
            } else {
                super.field8530.method2670(-128, 0, class784.field11325);
            }
            ++field6459;
            super.field8530.method2624(class539.field7920, (byte) 96, class539.field7920);
            if (arg0 != -15226) {
                this.field6455 = false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6466[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "(I)V")
    public static void method3416(int arg0) {
        try {
            if (arg0 != 64) {
                method3415((class578) null, (class578) null, (byte) -15);
            }
            field6457 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6466[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lhia;IIII)V")
    public static final void method3417(class197 arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field6454;
            long var5 = (long) (arg1 | arg2 << 28 | arg4 << 14);
            class413 var7 = (class413) class414.field5965.method3693(false, var5);
            if (var7 == null) {
                class413 var8 = new class413();
                class414.field5965.method3691(var8, var5, -1);
                var8.field5934.method3984(arg0, 0);
            } else {
                if (arg3 <= 20) {
                    method3416(114);
                }
                class371 var9 = class153.field1955.method3237(arg0.field2926, 0);
                int var10 = var9.field5434;
                if (~var9.field5366 == -2) {
                    var10 = (arg0.field2925 + 1) * var10;
                }
                for (class197 var11 = (class197) var7.field5934.method3977((byte) -44); var11 != null; var11 = (class197) var7.field5934.method3987(0)) {
                    class371 var12 = class153.field1955.method3237(var11.field2926, 0);
                    int var13 = var12.field5434;
                    if (~var12.field5366 == -2) {
                        var13 = (var11.field2925 + 1) * var13;
                    }
                    if (var13 < var10) {
                        method3415(var11, arg0, (byte) -127);
                        return;
                    }
                }
                var7.field5934.method3984(arg0, 0);
            }
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field6466[11] + (arg0 != null ? field6466[2] : field6466[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IFFF)F")
    public static final float method3418(int arg0, float arg1, float arg2, float arg3) {
        try {
            ++field6462;
            if (arg0 != 0) {
                field6458 = -124;
            }
            return (arg1 - arg3) * arg2 + arg3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6466[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IZ)V")
    public final void method454(int arg0, boolean arg1) {
        try {
            if (this.field6453 != null && arg1) {
                super.field8530.method2661(39, 1);
                super.field8530.method2062(-5138, class643.field9155);
                class639 var3 = super.field8530.method2642(true);
                var3.method742(1024);
                super.field8530.method2650(class433.field6275, -128);
                if (!this.field6465) {
                    super.field8530.method2624(class256.field3668, (byte) 111, class539.field7920);
                    super.field8530.method2655(1, 0, class514.field7551);
                    super.field8530.method2661(80, 2);
                    super.field8530.method2624(class647.field9205, (byte) 109, class256.field3668);
                    super.field8530.method2655(1, 0, class514.field7551);
                    super.field8530.method2096(true, false, (byte) 103, class514.field7551, 1);
                    super.field8530.method2670(-128, 0, class801.field11657);
                    super.field8530.method2668(24, super.field8530.field4751);
                } else {
                    super.field8530.method2624(class647.field9205, (byte) 127, class256.field3668);
                    super.field8530.method2096(true, false, (byte) -115, class784.field11325, 0);
                    super.field8530.method2670(-128, 0, class801.field11657);
                }
                super.field8530.method2661(62, 0);
                this.field6455 = true;
            } else {
                super.field8530.method2670(-128, 0, class801.field11657);
            }
            int var4 = 66 % ((-51 - arg0) / 39);
            ++field6456;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6466[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BZ)V")
    public final void method460(byte arg0, boolean arg1) {
        try {
            ++field6461;
            super.field8530.method2624(class539.field7920, (byte) 122, class256.field3668);
            if (arg0 != -20) {
                this.method455(23);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6466[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IBLah;)V")
    public final void method452(int arg0, byte arg1, class764 arg2) {
        try {
            ++field6464;
            super.field8530.method2668(24, arg2);
            if (arg1 == -106) {
                super.field8530.method2679(2, arg0);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6466[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6466[2] : field6466[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3419(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 58);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3420(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 73;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 94;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
