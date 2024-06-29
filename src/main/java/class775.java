import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class775 extends class206 {

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "Lffa;")
    private class197 field11265;

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "Laq;")
    private class170 field11270;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "Luf;")
    private class471 field11268;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    private int field11259;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
    private int field11272;

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "I")
    private int field11254;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
    private int field11261;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "[[F")
    private float[][] field11251;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "[[F")
    private float[][] field11271;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "[[F")
    private float[][] field11269;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "I")
    private int field11260;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "Luo;")
    private class602 field11257;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "Lml;")
    private class407 field11256;

    @OriginalMember(owner = "client!pn", name = "y", descriptor = "Lraa;")
    private class633 field11262;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "Luo;")
    private class602 field11255;

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "Lib;")
    private class163 field11263;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "Ljo;")
    private class353 field11273;

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "Lqha;")
    private class112 field11266;

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field11274 = new String[] { method5617(method5616("!a$RL")), method5617(method5616("!a$,\r?f~.L")), method5617(method5616("*!$>\u0019")), method5617(method5616("?zf|")), method5617(method5616("!a$QL")), method5617(method5616("!a$SL")) };

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "Z")
    public static boolean field11253 = false;

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "I")
    private int field11252;

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "I")
    public static int field11258;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field11264;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
    public static int field11267;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZS)V")
    private final void method5613(boolean arg0, short arg1) {
        try {
            if (!arg0) {
                this.field11256 = null;
            }
            if (this.field11265.field2922) {
                this.field11263.method1406(arg1, 380332136);
            } else {
                this.field11263.method1465(arg1, (byte) -120);
            }
            field11264++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11274[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III[[ZI)V")
    public final void method5614(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        try {
            if (arg4 <= 81) {
                field11253 = true;
            }
            field11258++;
            if (this.field11262 != null && (arg0 + arg2) >= this.field11259 && this.field11272 >= arg0 - arg2 && this.field11254 <= (arg1 + arg2) && (arg1 - arg2) <= this.field11261) {
                for (int var6 = this.field11254; var6 <= this.field11261; var6++) {
                    for (int var7 = this.field11259; var7 <= this.field11272; var7++) {
                        int var8 = var7 - arg0;
                        int var9 = var6 - arg1;
                        if ((-arg2) < var8 && arg2 > var8 && -arg2 < var9 && var9 < arg2 && arg3[arg2 + var8][arg2 + var9]) {
                            this.field11265.method1693((int) (this.field11268.method3576((byte) -89) * 255.0F) << 24, 8705);
                            this.field11265.method1724(null, this.field11257, 2916, this.field11255, null);
                            this.field11265.method1694(this.field11262, 4, this.field11260, 6056, 0);
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field11274[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field11274[3] : field11274[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIII)V")
    private final void method5615(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field11267++;
            long var8 = -1L;
            int var10 = (arg6 << this.field11270.field4341) + arg3;
            int var11 = (arg0 << this.field11270.field4341) + arg5;
            int var12 = this.field11270.method2404((byte) 126, var10, var11);
            if ((arg3 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
                var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
                class206 var13 = this.field11266.method977(var8, 1);
                if (var13 != null) {
                    this.method5613(true, ((class695) var13).field10142);
                    return;
                }
            }
            if (arg1 == 6988) {
                short var14 = (short) (this.field11252++);
                if (var8 != -1L) {
                    this.field11266.method968((byte) -111, var8, new class695(var14));
                }
                float var15;
                float var16;
                float var17;
                if (arg3 == 0 && arg5 == 0) {
                    var15 = this.field11269[arg2][arg4];
                    var16 = this.field11271[arg2][arg4];
                    var17 = this.field11251[arg2][arg4];
                } else if (this.field11270.field4340 == arg3 && arg5 == 0) {
                    var15 = this.field11269[arg2 + 1][arg4];
                    var16 = this.field11271[arg2 + 1][arg4];
                    var17 = this.field11251[arg2 + 1][arg4];
                } else if (this.field11270.field4340 == arg3 && this.field11270.field4340 == arg5) {
                    var15 = this.field11269[arg2 + 1][arg4 + 1];
                    var17 = this.field11251[arg2 + 1][arg4 + 1];
                    var16 = this.field11271[arg2 + 1][arg4 + 1];
                } else if (arg3 == 0 && this.field11270.field4340 == arg5) {
                    var17 = this.field11251[arg2][arg4 + 1];
                    var15 = this.field11269[arg2][arg4 + 1];
                    var16 = this.field11271[arg2][arg4 + 1];
                } else {
                    float var18 = (float) arg3 / (float) this.field11270.field4340;
                    float var19 = (float) arg5 / (float) this.field11270.field4340;
                    float var20 = this.field11251[arg2][arg4];
                    float var21 = this.field11269[arg2][arg4];
                    float var22 = this.field11271[arg2][arg4];
                    float var23 = this.field11251[arg2 + 1][arg4];
                    float var24 = this.field11269[arg2 + 1][arg4];
                    float var25 = (this.field11269[arg2][arg4 + 1] - var21) * var18 + var21;
                    float var26 = (this.field11251[arg2 + 1][arg4 + 1] - var23) * var18 + var23;
                    float var27 = this.field11271[arg2 + 1][arg4];
                    float var28 = (this.field11251[arg2][arg4 + 1] - var20) * var18 + var20;
                    float var29 = (this.field11271[arg2][arg4 + 1] - var22) * var18 + var22;
                    float var30 = (this.field11269[arg2 + 1][arg4 + 1] - var24) * var18 + var24;
                    float var31 = (this.field11271[arg2 + 1][arg4 + 1] - var27) * var18 + var27;
                    var17 = (var26 - var28) * var19 + var28;
                    var15 = (var30 - var25) * var19 + var25;
                    var16 = (var31 - var29) * var19 + var29;
                }
                float var32 = (float) (this.field11268.method3577(-32630) - var10);
                float var33 = (float) (this.field11268.method3581(-115) - var12);
                float var34 = (float) (this.field11268.method3580((byte) 52) - var11);
                float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
                float var36 = 1.0F / var35;
                float var37 = var32 * var36;
                float var38 = var34 * var36;
                float var39 = var33 * var36;
                float var40 = var35 / (float) this.field11268.method3579((byte) 125);
                float var41 = 1.0F - (var40 * var40);
                if (var41 < 0.0F) {
                    var41 = 0.0F;
                }
                float var42 = var16 * var38 + var15 * var39 + var17 * var37;
                if (var42 < 0.0F) {
                    var42 = 0.0F;
                }
                float var43 = var41 * var42 * 2.0F;
                if (var43 > 1.0F) {
                    var43 = 1.0F;
                }
                int var44 = this.field11268.method3578(87);
                int var45 = (int) ((float) ((var44 & 0xFFA70C) >> 16) * var43);
                if (var45 > 255) {
                    var45 = 255;
                }
                int var46 = (int) ((float) ((var44 & 0xFFC1) >> 8) * var43);
                if (var46 > 255) {
                    var46 = 255;
                }
                int var47 = (int) ((float) (var44 & 0xFF) * var43);
                if (this.field11265.field2922) {
                    this.field11273.method2890((float) var10, (byte) 38);
                    this.field11273.method2890((float) var12, (byte) 45);
                    this.field11273.method2890((float) var11, (byte) -112);
                } else {
                    this.field11273.method2892(-1335387932, (float) var10);
                    this.field11273.method2892(-1335387932, (float) var12);
                    this.field11273.method2892(arg1 - 1335394920, (float) var11);
                }
                if (var47 > 255) {
                    var47 = 255;
                }
                this.field11273.method1428((byte) -24, var45);
                this.field11273.method1428((byte) -24, var46);
                this.field11273.method1428((byte) -24, var47);
                this.field11273.method1428((byte) -24, 255);
                this.method5613(true, var14);
            }
        } catch (RuntimeException var49) {
            throw class759.method5498(var49, field11274[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lffa;Laq;Luf;[I)V")
    public class775(class197 arg0, class170 arg1, class471 arg2, int[] arg3) {
        try {
            this.field11265 = arg0;
            this.field11270 = arg1;
            this.field11268 = arg2;
            int var5 = this.field11268.method3579((byte) 127) - (arg1.field4340 >> 1);
            this.field11259 = this.field11268.method3577(-32630) - var5 >> arg1.field4341;
            this.field11272 = this.field11268.method3577(-32630) + var5 >> arg1.field4341;
            this.field11254 = this.field11268.method3580((byte) 30) - var5 >> arg1.field4341;
            this.field11261 = this.field11268.method3580((byte) 54) + var5 >> arg1.field4341;
            int var6 = this.field11272 + 1 - this.field11259;
            int var7 = this.field11261 + 1 - this.field11254;
            this.field11251 = new float[var6 + 1][var7 + 1];
            this.field11271 = new float[var6 + 1][var7 + 1];
            this.field11269 = new float[var6 + 1][var7 + 1];
            for (int var8 = 0; var8 <= var7; var8++) {
                int var9 = this.field11254 + var8;
                if (var9 > 0 && var9 < (this.field11270.field4336 - 1)) {
                    for (int var10 = 0; var10 <= var6; var10++) {
                        int var11 = var10 + this.field11259;
                        if (var11 > 0 && var11 < this.field11270.field4337 - 1) {
                            int var12 = arg1.method2407(var9, var11 + 1, 61) - arg1.method2407(var9, var11 - 1, -127);
                            int var13 = arg1.method2407(var9 + 1, var11, -99) - arg1.method2407(var9 - 1, var11, -98);
                            float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var13 * var13 + 65536)));
                            this.field11251[var10][var8] = (float) var12 * var14;
                            this.field11269[var10][var8] = var14 * -256.0F;
                            this.field11271[var10][var8] = (float) var13 * var14;
                        }
                    }
                }
            }
            int var15 = 0;
            for (int var16 = this.field11254; var16 <= this.field11261; var16++) {
                if (var16 >= 0 && arg1.field4336 > var16) {
                    for (int var17 = this.field11259; var17 <= this.field11272; var17++) {
                        if (var17 >= 0 && var17 < arg1.field4337) {
                            int var18 = arg3[var15];
                            int[] var19 = arg1.field2319[var17][var16];
                            if (var19 != null && var18 != 0) {
                                if (var18 == 1) {
                                    int var20 = 0;
                                    while (var19.length > var20) {
                                        if (var19[var20++] != -1 && var19[var20++] != -1 && var19[var20++] != -1) {
                                            this.field11260 += 3;
                                        }
                                    }
                                } else {
                                    this.field11260 += 3;
                                }
                            }
                        }
                        var15++;
                    }
                } else {
                    var15 += this.field11272 - this.field11259;
                }
            }
            if (this.field11260 <= 0) {
                this.field11257 = null;
                this.field11256 = null;
                this.field11262 = null;
                this.field11255 = null;
            } else {
                this.field11263 = new class163(this.field11260 * 2);
                this.field11273 = new class353(this.field11260 * 16);
                this.field11266 = new class112(class12.method83((byte) -1, this.field11260));
                int var21 = 0;
                int var22 = 0;
                for (int var23 = this.field11254; var23 <= this.field11261; var23++) {
                    if (var23 >= 0 && var23 < arg1.field4336) {
                        int var24 = 0;
                        for (int var25 = this.field11259; var25 <= this.field11272; var25++) {
                            if (var25 >= 0 && var25 < arg1.field4337) {
                                int var26 = arg3[var21];
                                int[] var27 = arg1.field2319[var25][var23];
                                if (var27 != null && var26 != 0) {
                                    if (var26 == 1) {
                                        int[] var28 = arg1.field2331[var25][var23];
                                        int[] var29 = arg1.field2355[var25][var23];
                                        int var30 = 0;
                                        label163: while (true) {
                                            while (true) {
                                                if (var27.length <= var30) {
                                                    break label163;
                                                }
                                                if (var27[var30] == -1 || var27[var30 + 1] == -1 || var27[var30 + 2] == -1) {
                                                    var30 += 3;
                                                } else {
                                                    this.method5615(var23, 6988, var24, var28[var30], var22, var29[var30], var25);
                                                    var30++;
                                                    this.method5615(var23, 6988, var24, var28[var30], var22, var29[var30], var25);
                                                    var30++;
                                                    this.method5615(var23, 6988, var24, var28[var30], var22, var29[var30], var25);
                                                    var30++;
                                                }
                                            }
                                        }
                                    } else if (var26 == 3) {
                                        this.method5615(var23, 6988, var24, 0, var22, 0, var25);
                                        this.method5615(var23, 6988, var24, arg1.field4340, var22, 0, var25);
                                        this.method5615(var23, 6988, var24, 0, var22, arg1.field4340, var25);
                                    } else if (var26 == 2) {
                                        this.method5615(var23, 6988, var24, arg1.field4340, var22, 0, var25);
                                        this.method5615(var23, 6988, var24, arg1.field4340, var22, arg1.field4340, var25);
                                        this.method5615(var23, 6988, var24, 0, var22, 0, var25);
                                    } else if (var26 == 5) {
                                        this.method5615(var23, 6988, var24, arg1.field4340, var22, arg1.field4340, var25);
                                        this.method5615(var23, 6988, var24, 0, var22, arg1.field4340, var25);
                                        this.method5615(var23, 6988, var24, arg1.field4340, var22, 0, var25);
                                    } else if (var26 == 4) {
                                        this.method5615(var23, 6988, var24, 0, var22, arg1.field4340, var25);
                                        this.method5615(var23, 6988, var24, 0, var22, 0, var25);
                                        this.method5615(var23, 6988, var24, arg1.field4340, var22, arg1.field4340, var25);
                                    }
                                }
                            }
                            var24++;
                            var21++;
                        }
                    } else {
                        var21 += this.field11272 - this.field11259;
                    }
                    var22++;
                }
                this.field11262 = this.field11265.method1727(this.field11263.field2201, (byte) -92, this.field11263.field2209, 5123, false);
                this.field11256 = this.field11265.method1682((byte) -38, this.field11273.field2201, false, 16, this.field11273.field2209);
                this.field11257 = new class602(this.field11256, 5126, 3, 0);
                this.field11255 = new class602(this.field11256, 5121, 4, 12);
            }
            this.field11251 = this.field11269 = this.field11271 = null;
            this.field11266 = null;
            this.field11273 = null;
            this.field11263 = null;
        } catch (RuntimeException var32) {
            throw class759.method5498(var32, field11274[1] + (arg0 == null ? field11274[3] : field11274[2]) + ',' + (arg1 == null ? field11274[3] : field11274[2]) + ',' + (arg2 == null ? field11274[3] : field11274[2]) + ',' + (arg3 == null ? field11274[3] : field11274[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5616(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x64);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5617(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 15;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 16;
                    break;
                default:
                    var10005 = 100;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
