import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class251 {

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "Lwd;")
    private class287 field3891;

    @OriginalMember(owner = "client!tea", name = "l", descriptor = "Lcg;")
    private class149 field3884;

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field3893;

    @OriginalMember(owner = "client!tea", name = "p", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field3888;

    @OriginalMember(owner = "client!tea", name = "o", descriptor = "Lih;")
    private class727 field3882;

    @OriginalMember(owner = "client!tea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3900 = new String[] { method2130(method2129(")P\u007f$")), method2130(method2129("<\u000b=fx")), method2130(method2129("3@rf9.Kz<;o")), method2130(method2129("3@rfMo")), method2130(method2129("3@rfCo")), method2130(method2129("3@rfAo")), method2130(method2129("3@rfFo")), method2130(method2129("gv)h")), method2130(method2129("3@rfDo")), method2130(method2129("3@rfLo")), method2130(method2129("j\b-h")), method2130(method2129("3@rfGo")), method2130(method2129("3@rf@o")), method2130(method2129("3@rfBo")) };

    @OriginalMember(owner = "client!tea", name = "k", descriptor = "Lel;")
    public static class573 field3889 = new class573(115, 3);

    @OriginalMember(owner = "client!tea", name = "m", descriptor = "Lgq;")
    public static class540 field3894 = new class540();

    @OriginalMember(owner = "client!tea", name = "s", descriptor = "I")
    public static int field3897 = 0;

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!tea", name = "n", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!tea", name = "r", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!tea", name = "q", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "J")
    public static long field3899;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "Lib;")
    private class163 field3890;

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "[Loga;")
    private class499[] field3892;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZILlp;ILlp;)Loga;")
    private final class499 method2120(boolean arg0, int arg1, class411 arg2, int arg3, class411 arg4) {
        try {
            field3887++;
            if (this.field3890 == null) {
                throw new RuntimeException();
            } else if (arg3 < 0 || arg3 >= this.field3892.length) {
                throw new RuntimeException();
            } else if (this.field3892[arg3] == null) {
                if (arg1 != 115) {
                    this.method2122((byte) 66);
                }
                this.field3890.field2201 = arg3 * 72 + 6;
                int var6 = this.field3890.method1453((byte) 99);
                int var7 = this.field3890.method1453((byte) 86);
                byte[] var8 = new byte[64];
                this.field3890.method1413(var8, -16385, 64, 0);
                class499 var9 = new class499(arg3, arg2, arg4, this.field3884, this.field3891, var6, var8, var7, arg0);
                this.field3892[arg3] = var9;
                return var9;
            } else {
                return this.field3892[arg3];
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field3900[9] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3900[0] : field3900[1]) + ',' + arg3 + ',' + (arg4 == null ? field3900[0] : field3900[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
    public static void method2121(int arg0) {
        try {
            field3889 = null;
            field3894 = null;
            if (arg0 != 64) {
                method2123(null, -64);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3900[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)Z")
    public final boolean method2122(byte arg0) {
        try {
            field3883++;
            if (this.field3890 != null) {
                return true;
            }
            if (this.field3882 == null) {
                if (this.field3884.method1247(0)) {
                    return false;
                }
                this.field3882 = this.field3884.method1259(true, 255, 8133, 255, (byte) 0);
            }
            if (this.field3882.field8473) {
                return false;
            }
            class163 var2 = new class163(this.field3882.method4281((byte) -68));
            var2.field2201 = 5;
            int var3 = var2.method1455((byte) 62);
            var2.field2201 += var3 * 72;
            byte[] var4 = new byte[var2.field2209.length - var2.field2201];
            var2.method1413(var4, arg0 ^ 0x4000, var4.length, 0);
            byte[] var5;
            if (this.field3893 == null || this.field3888 == null) {
                var5 = var4;
            } else {
                BigInteger var6 = new BigInteger(var4);
                BigInteger var7 = var6.modPow(this.field3893, this.field3888);
                var5 = var7.toByteArray();
            }
            if (var5.length != 65) {
                throw new RuntimeException();
            }
            if (arg0 != -1) {
                this.field3884 = null;
            }
            byte[] var8 = class127.method1108((byte) -83, var2.field2201 - var4.length - 5, 5, var2.field2209);
            for (int var9 = 0; var9 < 64; var9++) {
                if (var8[var9] != var5[var9 + 1]) {
                    throw new RuntimeException();
                }
            }
            this.field3892 = new class499[var3];
            this.field3890 = var2;
            return true;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field3900[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2123(String arg0, int arg1) {
        try {
            field3881++;
            if (!arg0.equals("")) {
                class76.field879++;
                class280 var2 = class610.method4508(class554.field8253, class279.field4190, (byte) -100);
                if (arg1 == 9749) {
                    var2.field4197.method1428((byte) -24, class554.method4169(23827, arg0));
                    var2.field4197.method1464(arg0, 255);
                    class106.method934((byte) 53, var2);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3900[3] + (arg0 == null ? field3900[0] : field3900[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(B)V")
    public final void method2124(byte arg0) {
        try {
            field3898++;
            if (this.field3892 != null) {
                for (int var2 = 0; var2 < this.field3892.length; var2++) {
                    if (this.field3892[var2] != null) {
                        this.field3892[var2].method3774(118);
                    }
                }
                if (arg0 >= -58) {
                    this.field3888 = null;
                }
                for (int var3 = 0; var3 < this.field3892.length; var3++) {
                    if (this.field3892[var3] != null) {
                        this.field3892[var3].method3775((byte) 125);
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3900[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZLib;)Lph;")
    public static final class669 method2125(boolean arg0, class163 arg1) {
        try {
            field3896++;
            if (arg0) {
                return null;
            } else {
                class358 var2 = class424.method3274(arg1, 106);
                int var3 = arg1.method1442(65280);
                return new class669(var2.field5805, var2.field5813, var2.field5804, var2.field5807, var2.field5809, var2.field5810, var2.field5814, var2.field5806, var2.field5815, var2.field5489, var2.field5486, var2.field5482, var2.field5480, var2.field5479, var2.field5490, var3);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3900[5] + arg0 + ',' + (arg1 == null ? field3900[0] : field3900[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IILum;I)Lnf;")
    public static final class603 method2126(int arg0, int arg1, class550 arg2, int arg3) {
        try {
            field3886++;
            int var4 = arg3 << 10 | arg2.field8202;
            class603 var5 = (class603) class375.field5718.method637((byte) -39, (long) var4 << 16);
            if (var5 != null) {
                return var5;
            }
            byte[] var6 = class743.field10810.method3638(64, class743.field10810.method3619((byte) 105, var4));
            if (var6 == null) {
                int var9 = arg0 + 65536 << 10 | arg2.field8202;
                class603 var10 = (class603) class375.field5718.method637((byte) -15, (long) var9 << 16);
                if (var10 != null) {
                    return var10;
                }
                byte[] var11 = class743.field10810.method3638(arg1 + 999722286, class743.field10810.method3619((byte) 94, var9));
                if (var11 == null) {
                    int var14 = arg2.field8202 | 0x3FFFC00;
                    class603 var15 = (class603) class375.field5718.method637((byte) -121, (long) var14 << 16);
                    if (arg1 != -999722160) {
                        field3894 = null;
                    }
                    if (var15 != null) {
                        return var15;
                    }
                    byte[] var16 = class743.field10810.method3638(-114, class743.field10810.method3619((byte) 125, var14));
                    if (var16 == null) {
                        return null;
                    } else if (var16.length <= 1) {
                        return null;
                    } else {
                        class603 var17;
                        try {
                            var17 = class38.method251((byte) -48, var16);
                        } catch (Exception var22) {
                            throw new RuntimeException(var22.getMessage() + field3900[7] + var14);
                        }
                        var17.field8843 = arg2;
                        class375.field5718.method636(var17, 0, (long) var14 << 16);
                        return var17;
                    }
                } else if (var11.length <= 1) {
                    return null;
                } else {
                    class603 var12;
                    try {
                        var12 = class38.method251((byte) -48, var11);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + field3900[7] + var9);
                    }
                    var12.field8843 = arg2;
                    class375.field5718.method636(var12, arg1 + 999722160, (long) var9 << 16);
                    return var12;
                }
            } else if (var6.length <= 1) {
                return null;
            } else {
                class603 var7;
                try {
                    var7 = class38.method251((byte) -48, var6);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + field3900[7] + var4);
                }
                var7.field8843 = arg2;
                class375.field5718.method636(var7, 0, (long) var4 << 16);
                return var7;
            }
        } catch (RuntimeException var23) {
            throw class759.method5498(var23, field3900[8] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3900[0] : field3900[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Llp;ILlp;I)Loga;")
    public final class499 method2127(class411 arg0, int arg1, class411 arg2, int arg3) {
        try {
            field3895++;
            return arg3 == -804221168 ? this.method2120(true, 115, arg2, arg1, arg0) : null;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3900[12] + (arg0 == null ? field3900[0] : field3900[1]) + ',' + arg1 + ',' + (arg2 == null ? field3900[0] : field3900[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZI)V")
    public static final void method2128(boolean arg0, int arg1) {
        try {
            field3885++;
            if (class194.field2609.length() != 0) {
                class437.method3350(arg1 ^ 0x20, field3900[10] + class194.field2609);
                class328.method2778(false, arg0, arg1 ^ 0xFFFFA777, class194.field2609);
                class698.field10153 = 0;
                class194.field2609 = "";
                class373.field5696 = arg1;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3900[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lcg;Lwd;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class251(class149 arg0, class287 arg1, BigInteger arg2, BigInteger arg3) {
        try {
            this.field3891 = arg1;
            this.field3884 = arg0;
            this.field3893 = arg2;
            this.field3888 = arg3;
            if (!this.field3884.method1247(-106)) {
                this.field3882 = this.field3884.method1259(true, 255, 8133, 255, (byte) 0);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3900[2] + (arg0 == null ? field3900[0] : field3900[1]) + ',' + (arg1 == null ? field3900[0] : field3900[1]) + ',' + (arg2 == null ? field3900[0] : field3900[1]) + ',' + (arg3 == null ? field3900[0] : field3900[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2129(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2130(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 71;
                    break;
                case 1:
                    var10005 = 37;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 72;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
