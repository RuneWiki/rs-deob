import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class336 {

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "[B")
    private byte[] field5245;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
    private int[] field5248;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
    private int[] field5239;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5249 = new String[] { method2813(method2812("`g\u0011.E")), method2813(method2812("`g\u0011(E")), method2813(method2812("`wS\u0000")), method2813(method2812("@m\u001f\u000f\u0002jgH\u0003\u001fj\"Y\u0003\u001f.f^\u0018\f.t^\u0000\u0018k\"")), method2813(method2812("u,\u0011B\u0010")), method2813(method2812("`g\u0011/E")), method2813(method2812("`g\u0011P\u0004`kKRE")), method2813(method2812("`g\u0011-E")) };

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "S")
    public static short field5243 = 32767;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[I")
    public static int[] field5247 = new int[13];

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Z")
    public static boolean field5242;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5240;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II[B[BII)I")
    public final int method2808(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        try {
            field5246++;
            int var7 = 0;
            int var18 = arg0 + arg4;
            int var8 = arg1 << 3;
            while (arg4 < var18) {
                int var9 = arg3[arg4] & 0xFF;
                int var10 = this.field5248[var9];
                byte var11 = this.field5245[var9];
                if (var11 == 0) {
                    throw new RuntimeException(field5249[3] + var9);
                }
                int var12 = var8 >> 3;
                int var13 = var8 & 0x7;
                int var14 = var7 & -var13 >> 31;
                int var15 = (var13 + var11 - 1 >> 3) + var12;
                int var19 = var13 + 24;
                arg2[var12] = (byte) (var7 = class544.method4107(var14, var10 >>> var19));
                if (var12 < var15) {
                    var13 = var19 - 8;
                    var12++;
                    arg2[var12] = (byte) (var7 = var10 >>> var13);
                    if (var15 > var12) {
                        var13 -= 8;
                        var12++;
                        arg2[var12] = (byte) (var7 = var10 >>> var13);
                        if (var12 < var15) {
                            var13 -= 8;
                            var12++;
                            arg2[var12] = (byte) (var7 = var10 >>> var13);
                            if (var12 < var15) {
                                var13 -= 8;
                                var12++;
                                arg2[var12] = (byte) (var7 = var10 << -var13);
                            }
                        }
                    }
                }
                var8 += var11;
                arg4++;
            }
            if (arg5 != -277513377) {
                method2810((byte) 84);
            }
            return (var8 + 7 >> 3) - arg1;
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field5249[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5249[2] : field5249[4]) + ',' + (arg3 == null ? field5249[2] : field5249[4]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([BI[BBII)I")
    public final int method2809(byte[] arg0, int arg1, byte[] arg2, byte arg3, int arg4, int arg5) {
        try {
            field5244++;
            if (arg4 == 0) {
                return 0;
            }
            int var7 = 0;
            int var21 = arg1 + arg4;
            int var8 = -35 % ((arg3 - 58) / 39);
            int var9 = arg5;
            while (true) {
                byte var10 = arg0[var9];
                if (var10 < 0) {
                    var7 = this.field5239[var7];
                } else {
                    var7++;
                }
                int var11;
                if ((var11 = this.field5239[var7]) < 0) {
                    arg2[arg1++] = (byte) (~var11);
                    if (var21 <= arg1) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var7++;
                } else {
                    var7 = this.field5239[var7];
                }
                int var12;
                if ((var12 = this.field5239[var7]) < 0) {
                    arg2[arg1++] = (byte) (~var12);
                    if (var21 <= arg1) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var7++;
                } else {
                    var7 = this.field5239[var7];
                }
                int var13;
                if ((var13 = this.field5239[var7]) < 0) {
                    arg2[arg1++] = (byte) (~var13);
                    if (arg1 >= var21) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var7++;
                } else {
                    var7 = this.field5239[var7];
                }
                int var14;
                if ((var14 = this.field5239[var7]) < 0) {
                    arg2[arg1++] = (byte) (~var14);
                    if (arg1 >= var21) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var7++;
                } else {
                    var7 = this.field5239[var7];
                }
                int var15;
                if ((var15 = this.field5239[var7]) < 0) {
                    arg2[arg1++] = (byte) (~var15);
                    if (var21 <= arg1) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var7++;
                } else {
                    var7 = this.field5239[var7];
                }
                int var16;
                if ((var16 = this.field5239[var7]) < 0) {
                    arg2[arg1++] = (byte) (~var16);
                    if (var21 <= arg1) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var7++;
                } else {
                    var7 = this.field5239[var7];
                }
                int var17;
                if ((var17 = this.field5239[var7]) < 0) {
                    arg2[arg1++] = (byte) (~var17);
                    if (var21 <= arg1) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var7++;
                } else {
                    var7 = this.field5239[var7];
                }
                int var18;
                if ((var18 = this.field5239[var7]) < 0) {
                    arg2[arg1++] = (byte) (~var18);
                    if (arg1 >= var21) {
                        break;
                    }
                    var7 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg5;
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field5249[5] + (arg0 == null ? field5249[2] : field5249[4]) + ',' + arg1 + ',' + (arg2 == null ? field5249[2] : field5249[4]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)Z")
    public static final boolean method2810(byte arg0) {
        try {
            field5241++;
            int var1 = 23 / ((67 - arg0) / 43);
            return class138.field1645 >= 1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5249[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static void method2811(byte arg0) {
        try {
            if (arg0 == 45) {
                field5240 = null;
                field5247 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5249[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
    public class336(byte[] arg0) {
        try {
            int var2 = arg0.length;
            this.field5245 = arg0;
            this.field5248 = new int[var2];
            this.field5239 = new int[8];
            int[] var3 = new int[33];
            int var4 = 0;
            for (int var5 = 0; var5 < var2; var5++) {
                byte var6 = arg0[var5];
                if (var6 != 0) {
                    int var7 = 0x1 << 32 - var6;
                    int var8 = var3[var6];
                    this.field5248[var5] = var8;
                    int var9;
                    if ((var7 & var8) == 0) {
                        var9 = var7 | var8;
                        for (int var10 = var6 - 1; var10 >= 1; var10--) {
                            int var11 = var3[var10];
                            if (var8 != var11) {
                                break;
                            }
                            int var12 = 0x1 << 32 - var10;
                            if ((var12 & var11) != 0) {
                                var3[var10] = var3[var10 - 1];
                                break;
                            }
                            var3[var10] = class544.method4107(var12, var11);
                        }
                    } else {
                        var9 = var3[var6 - 1];
                    }
                    var3[var6] = var9;
                    for (int var13 = var6 + 1; var13 <= 32; var13++) {
                        if (var3[var13] == var8) {
                            var3[var13] = var9;
                        }
                    }
                    int var14 = 0;
                    for (int var15 = 0; var15 < var6; var15++) {
                        int var16 = Integer.MIN_VALUE >>> var15;
                        if ((var8 & var16) == 0) {
                            var14++;
                        } else {
                            if (this.field5239[var14] == 0) {
                                this.field5239[var14] = var4;
                            }
                            var14 = this.field5239[var14];
                        }
                        if (this.field5239.length <= var14) {
                            int[] var17 = new int[this.field5239.length * 2];
                            for (int var18 = 0; var18 < this.field5239.length; var18++) {
                                var17[var18] = this.field5239[var18];
                            }
                            this.field5239 = var17;
                        }
                        int var19 = var16 >>> 1;
                    }
                    if (var14 >= var4) {
                        var4 = var14 + 1;
                    }
                    this.field5239[var14] = ~var5;
                }
            }
        } catch (RuntimeException var21) {
            throw class759.method5498(var21, field5249[6] + (arg0 == null ? field5249[2] : field5249[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2812(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2813(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 2;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 108;
                    break;
                default:
                    var10005 = 109;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
