import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class702 extends class232 {

    @OriginalMember(owner = "client!vfa", name = "V", descriptor = "I")
    private int field10081 = 0;

    @OriginalMember(owner = "client!vfa", name = "J", descriptor = "I")
    private int field10088 = 0;

    @OriginalMember(owner = "client!vfa", name = "O", descriptor = "I")
    private int field10089 = 0;

    @OriginalMember(owner = "client!vfa", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field10092 = new String[] { method5090(method5089("\rO\u0007qQS")), method5090(method5089("\rO\u0007qPS")), method5090(method5089("\u0000\u0007Hqh")), method5090(method5089("\u0015\\\n3")), method5090(method5089("\rO\u0007qWS")), method5090(method5089("\rO\u0007qSS")), method5090(method5089("\rO\u0007qTS")) };

    @OriginalMember(owner = "client!vfa", name = "K", descriptor = "S")
    public static short field10084 = 32767;

    @OriginalMember(owner = "client!vfa", name = "W", descriptor = "Lat;")
    public static class398 field10091 = new class398();

    @OriginalMember(owner = "client!vfa", name = "X", descriptor = "I")
    private int field10076;

    @OriginalMember(owner = "client!vfa", name = "M", descriptor = "I")
    public static int field10077;

    @OriginalMember(owner = "client!vfa", name = "R", descriptor = "I")
    private int field10078;

    @OriginalMember(owner = "client!vfa", name = "N", descriptor = "I")
    public static int field10079;

    @OriginalMember(owner = "client!vfa", name = "G", descriptor = "I")
    private int field10080;

    @OriginalMember(owner = "client!vfa", name = "H", descriptor = "I")
    public static int field10082;

    @OriginalMember(owner = "client!vfa", name = "S", descriptor = "I")
    public static int field10083;

    @OriginalMember(owner = "client!vfa", name = "T", descriptor = "I")
    private int field10085;

    @OriginalMember(owner = "client!vfa", name = "U", descriptor = "I")
    public static int field10086;

    @OriginalMember(owner = "client!vfa", name = "Q", descriptor = "I")
    private int field10087;

    @OriginalMember(owner = "client!vfa", name = "P", descriptor = "I")
    private int field10090;

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(IIII)V")
    private final void method5086(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field10083;
            if (arg0 < 45) {
                this.field10078 = 41;
            }
            int var5 = arg3 > 2048 ? -(arg1 * arg3 >> 12) + arg1 + arg3 : (arg1 + 4096) * arg3 >> 12;
            if (var5 <= 0) {
                this.field10076 = this.field10078 = this.field10087 = arg3;
            } else {
                int var18 = arg2 * 6;
                int var6 = arg3 + arg3 + -var5;
                int var7 = (-var6 + var5 << 12) / var5;
                int var8 = var18 >> 12;
                int var9 = var18 - (var8 << 12);
                int var11 = var7 * var5 >> 12;
                int var12 = var9 * var11 >> 12;
                int var13 = var6 + var12;
                int var14 = -var12 + var5;
                if (var8 != 0) {
                    if (var8 != 1) {
                        if (var8 != 2) {
                            if (var8 != 3) {
                                if (~var8 != -5) {
                                    if (var8 == 5) {
                                        this.field10076 = var5;
                                        this.field10078 = var6;
                                        this.field10087 = var14;
                                    }
                                } else {
                                    this.field10076 = var13;
                                    this.field10078 = var6;
                                    this.field10087 = var5;
                                }
                            } else {
                                this.field10087 = var5;
                                this.field10076 = var6;
                                this.field10078 = var14;
                            }
                        } else {
                            this.field10078 = var5;
                            this.field10076 = var6;
                            this.field10087 = var13;
                        }
                    } else {
                        this.field10087 = var6;
                        this.field10078 = var5;
                        this.field10076 = var14;
                    }
                } else {
                    this.field10078 = var13;
                    this.field10076 = var5;
                    this.field10087 = var6;
                }
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field10092[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ILwq;I)V")
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            ++field10086;
            if (arg0 < 96) {
                this.method5086(-100, -29, -124, -14);
            }
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        this.field10089 = (arg1.method1672(-48) << 12) / 100;
                    }
                } else {
                    this.field10088 = (arg1.method1672(-118) << 12) / 100;
                }
            } else {
                this.field10081 = arg1.method1657(125);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field10092[1] + arg0 + ',' + (arg1 != null ? field10092[2] : field10092[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "()V")
    public class702() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(B)V")
    public static void method5087(byte arg0) {
        try {
            field10091 = null;
            if (arg0 != -75) {
                method5087((byte) 21);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10092[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(II)[[I")
    public final int[][] method122(int arg0, int arg1) {
        try {
            ++field10082;
            if (arg0 != -3093) {
                this.method122(-17, 82);
            }
            int[][] var3 = super.field3599.method1580(arg1, (byte) -111);
            if (super.field3599.field2743) {
                int[][] var4 = this.method2023((byte) 95, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class449.field6969 < ~var11; ++var11) {
                    this.method5088(var5[var11], arg0 ^ 3118, var7[var11], var6[var11]);
                    this.field10085 += this.field10089;
                    this.field10080 += this.field10088;
                    for (this.field10090 += this.field10081; this.field10090 < 0; this.field10090 += 4096) {
                    }
                    if (~this.field10080 > -1) {
                        this.field10080 = 0;
                    }
                    while (~this.field10090 < -4097) {
                        this.field10090 -= 4096;
                    }
                    if (this.field10080 > 4096) {
                        this.field10080 = 4096;
                    }
                    if (this.field10085 < 0) {
                        this.field10085 = 0;
                    }
                    if (this.field10085 > 4096) {
                        this.field10085 = 4096;
                    }
                    this.method5086(94, this.field10080, this.field10090, this.field10085);
                    var8[var11] = this.field10076;
                    var9[var11] = this.field10078;
                    var10[var11] = this.field10087;
                }
            }
            return var3;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field10092[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIII)V")
    private final void method5088(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field10079;
            int var5 = arg0 <= arg3 ? arg3 : arg0;
            if (arg1 < -56) {
                int var6 = arg0 < arg3 ? arg0 : arg3;
                int var7 = arg2 <= var5 ? var5 : arg2;
                int var8 = ~var6 >= ~arg2 ? var6 : arg2;
                this.field10085 = (var7 + var8) / 2;
                int var9 = -var8 + var7;
                if (~var9 < -1) {
                    int var10 = (var7 - arg0 << 12) / var9;
                    int var11 = (var7 - arg3 << 12) / var9;
                    int var12 = (-arg2 + var7 << 12) / var9;
                    if (arg0 == var7) {
                        this.field10090 = arg3 != var8 ? 4096 - var11 : var12 + 20480;
                    } else if (~arg3 == ~var7) {
                        this.field10090 = arg2 != var8 ? -var12 + 12288 : 4096 - -var10;
                    } else {
                        this.field10090 = ~arg0 == ~var8 ? var11 + 12288 : -var10 + 20480;
                    }
                    this.field10090 /= 6;
                } else {
                    this.field10090 = 0;
                }
                if (~this.field10085 < -1 && this.field10085 < 4096) {
                    this.field10080 = (var9 << 12) / (~this.field10085 >= -2049 ? this.field10085 * 2 : -(this.field10085 * 2) + 8192);
                } else {
                    this.field10080 = 0;
                }
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field10092[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5089(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 21);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5090(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 123;
                    break;
                case 1:
                    var10005 = 41;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 95;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
