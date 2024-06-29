import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class548 extends class724 {

    @OriginalMember(owner = "client!baa", name = "p", descriptor = "I")
    private int field8176;

    @OriginalMember(owner = "client!baa", name = "x", descriptor = "Lkd;")
    private class296 field8183;

    @OriginalMember(owner = "client!baa", name = "v", descriptor = "I")
    private int field8175;

    @OriginalMember(owner = "client!baa", name = "l", descriptor = "I")
    private int field8174;

    @OriginalMember(owner = "client!baa", name = "t", descriptor = "I")
    private int field8172;

    @OriginalMember(owner = "client!baa", name = "w", descriptor = "I")
    private int field8187;

    @OriginalMember(owner = "client!baa", name = "q", descriptor = "I")
    private int field8178;

    @OriginalMember(owner = "client!baa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8189 = new String[] { method4138(method4137("<U\u000f\u0004")), method4138(method4137("0A\u0002FHz")), method4138(method4137(")\u000eMF\u007f")), method4138(method4137("0A\u0002FAz")), method4138(method4137("0A\u0002F>;N\n\u001c<z")), method4138(method4137("0A\u0002FJz")), method4138(method4137("0A\u0002FKz")), method4138(method4137("0A\u0002FDz")), method4138(method4137("0A\u0002FEz")), method4138(method4137("0A\u0002FGz")) };

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "Lwq;")
    public static class178 field8184 = new class178(5);

    @OriginalMember(owner = "client!baa", name = "k", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!baa", name = "u", descriptor = "I")
    public static int field8177;

    @OriginalMember(owner = "client!baa", name = "n", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
    public static int field8181;

    @OriginalMember(owner = "client!baa", name = "s", descriptor = "I")
    public static int field8182;

    @OriginalMember(owner = "client!baa", name = "m", descriptor = "I")
    public static int field8185;

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!baa", name = "r", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!baa", name = "o", descriptor = "Lrr;")
    private class380 field8179;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method4130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            int var10 = -84 / ((-arg5 - 80) / 38);
            if (arg2 >= class200.field3119 && class676.field9797 >= arg2 && arg3 >= class200.field3119 && class676.field9797 >= arg3 && arg7 >= class200.field3119 && class676.field9797 >= arg7 && arg8 >= class200.field3119 && arg8 <= class676.field9797 && arg1 >= class676.field9807 && class381.field5786 >= arg1 && class676.field9807 <= arg4 && class381.field5786 >= arg4 && arg6 >= class676.field9807 && class381.field5786 >= arg6 && class676.field9807 <= arg9 && arg9 <= class381.field5786) {
                class242.method2063(arg2, arg0, arg9, arg3, arg1, arg6, arg8, arg4, arg7, 3);
            } else {
                class264.method2212(arg2, arg8, false, arg4, arg7, arg1, arg3, arg9, arg0, arg6);
            }
            field8173++;
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field8189[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method4131(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field8181++;
            int var8 = 0;
            int var9 = arg6;
            int var10 = 0;
            int var11 = arg5 - arg3;
            int var12 = arg6 - arg3;
            int var13 = arg5 * arg5;
            int var14 = arg6 * arg6;
            int var15 = var11 * var11;
            int var16 = var12 * var12;
            int var17 = var14 << 1;
            int var18 = var13 << 1;
            int var19 = var16 << 1;
            int var20 = var15 << 1;
            int var21 = arg6 << 1;
            int var22 = var12 << 1;
            int var23 = (1 - var21) * var13 + var17;
            int var24 = var14 - ((var21 - 1) * var18);
            if (arg0 == 41) {
                int var25 = (1 - var22) * var15 + var19;
                int var26 = var16 - ((var22 - 1) * var20);
                int var27 = var13 << 2;
                int var28 = var14 << 2;
                int var29 = var15 << 2;
                int var30 = var16 << 2;
                int var31 = var17 * 3;
                int var32 = (var21 - 3) * var18;
                int var33 = var19 * 3;
                int var34 = (var22 - 3) * var20;
                int var35 = var28;
                int var36 = (arg6 - 1) * var27;
                int var37 = var30;
                int var38 = (var12 - 1) * var29;
                int[] var39 = class243.field3731[arg1];
                class319.method2702(var39, arg7 - arg5, -var11 + arg7, true, arg2);
                class319.method2702(var39, arg7 - var11, arg7 - -var11, true, arg4);
                class319.method2702(var39, arg7 + var11, arg5 + arg7, true, arg2);
                while (var9 > 0) {
                    boolean var40 = var9 <= var12;
                    if (var40) {
                        if (var25 < 0) {
                            while (var25 < 0) {
                                var25 += var33;
                                var26 += var37;
                                var37 += var30;
                                var10++;
                                var33 += var30;
                            }
                        }
                        if (var26 < 0) {
                            var26 += var37;
                            var25 += var33;
                            var10++;
                            var37 += var30;
                            var33 += var30;
                        }
                        var25 += -var38;
                        var26 += -var34;
                        var38 -= var29;
                        var34 -= var29;
                    }
                    if (var23 < 0) {
                        while (var23 < 0) {
                            var23 += var31;
                            var24 += var35;
                            var35 += var28;
                            var8++;
                            var31 += var28;
                        }
                    }
                    if (var24 < 0) {
                        var23 += var31;
                        var24 += var35;
                        var35 += var28;
                        var31 += var28;
                        var8++;
                    }
                    var24 += -var32;
                    var23 += -var36;
                    var32 -= var27;
                    var36 -= var27;
                    var9--;
                    int var41 = arg1 - var9;
                    int var42 = arg1 + var9;
                    int var43 = arg7 + var8;
                    int var44 = arg7 - var8;
                    if (var40) {
                        int var45 = arg7 + var10;
                        int var46 = arg7 - var10;
                        class319.method2702(class243.field3731[var41], var44, var46, true, arg2);
                        class319.method2702(class243.field3731[var41], var46, var45, true, arg4);
                        class319.method2702(class243.field3731[var41], var45, var43, true, arg2);
                        class319.method2702(class243.field3731[var42], var44, var46, true, arg2);
                        class319.method2702(class243.field3731[var42], var46, var45, true, arg4);
                        class319.method2702(class243.field3731[var42], var45, var43, true, arg2);
                    } else {
                        class319.method2702(class243.field3731[var41], var44, var43, true, arg2);
                        class319.method2702(class243.field3731[var42], var44, var43, true, arg2);
                    }
                }
            }
        } catch (RuntimeException var48) {
            throw class759.method5498(var48, field8189[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "(I)V")
    public static void method4132(int arg0) {
        try {
            field8184 = null;
            if (arg0 != 6) {
                field8184 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8189[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lib;B)Lrg;")
    public static final class668 method4133(class163 arg0, byte arg1) {
        try {
            field8180++;
            if (arg1 == -74) {
                int var2 = arg0.method1453((byte) 88);
                return new class668(var2);
            } else {
                return null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8189[6] + (arg0 == null ? field8189[0] : field8189[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Ljh;I)I")
    public static final int method4134(class169 arg0, int arg1) {
        try {
            field8186++;
            if (class312.field4948 == arg0) {
                return 9216;
            } else if (class211.field3233 == arg0) {
                return 34065;
            } else if (class571.field8447 == arg0) {
                return 34066;
            } else if (arg1 == 9216) {
                throw new IllegalArgumentException();
            } else {
                return -65;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8189[1] + (arg0 == null ? field8189[0] : field8189[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "(I)Lrr;")
    public final class380 method4135(int arg0) {
        try {
            field8182++;
            if (this.field8179 == null) {
                class788.field11495[4] = this.field8178;
                class160 var2 = this.field8183.field679;
                class788.field11495[3] = this.field8172;
                class788.field11495[5] = this.field8176;
                class788.field11495[0] = this.field8174;
                class788.field11495[1] = this.field8175;
                class788.field11495[2] = this.field8187;
                byte var3 = 0;
                int var4 = 0;
                for (int var5 = 0; var5 < 6; var5++) {
                    if (!var2.method1363(class788.field11495[var5], (byte) -92)) {
                        return null;
                    }
                    class439 var6 = var2.method1366((byte) -103, class788.field11495[var5]);
                    int var7 = var6.field6481 ? 64 : 128;
                    if (var6.field6469 > 0) {
                        var3 = 1;
                    }
                    if (var7 > var4) {
                        var4 = var7;
                    }
                }
                for (int var8 = 0; var8 < 6; var8++) {
                    class593.field8706[var8] = var2.method1364(-25656, false, class788.field11495[var8], var4, var4, 1.0F);
                }
                this.field8179 = this.field8183.method904(class593.field8706, -127, ~var3 != -1, var4);
            }
            return arg0 == -1 ? this.field8179 : null;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field8189[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method4136(String arg0, int arg1) throws ClassNotFoundException {
        try {
            field8185++;
            if (arg0.equals("B")) {
                return Byte.TYPE;
            } else if (arg0.equals("I")) {
                return Integer.TYPE;
            } else if (arg0.equals("S")) {
                return Short.TYPE;
            } else if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else {
                if (arg1 != 3925) {
                    method4131((byte) 33, -96, -45, 121, 75, 4, 114, -70);
                }
                if (arg0.equals("D")) {
                    return Double.TYPE;
                } else if (arg0.equals("C")) {
                    return Character.TYPE;
                } else {
                    return Class.forName(arg0);
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8189[9] + (arg0 == null ? field8189[0] : field8189[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lkd;IIIIII)V")
    public class548(class296 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.field8176 = arg6;
            this.field8183 = arg0;
            this.field8175 = arg2;
            this.field8174 = arg1;
            this.field8172 = arg4;
            this.field8187 = arg3;
            this.field8178 = arg5;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8189[4] + (arg0 == null ? field8189[0] : field8189[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!baa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4137(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!baa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4138(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 82;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 104;
                    break;
                default:
                    var10005 = 2;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
