import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class209 extends class211 {

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
    private int field3197 = 0;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    private int field3203 = 1;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
    private int field3205 = 0;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "[Ljava/lang/String;")
    private static final String[] field3211 = new String[] { method1846(method1845("\u0004\u0017>\u0016")), method1846(method1845("\u0011L|T7")), method1846(method1845("\u001a\t|>b")), method1846(method1845("\u001a\t|=b")), method1846(method1845("\u001a\t|?b")), method1846(method1845("/-\u0014")), method1846(method1845("\u001a\t|8b")), method1846(method1845("\u001a\t|1b")), method1846(method1845("\u001a\t|2b")), method1846(method1845("\u001a\t|9b")), method1846(method1845("\u001a\t|<b")), method1846(method1845("\u001a\t|;b")) };

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "[I")
    public static int[] field3206 = new int[32];

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "Lwia;")
    public static class790 field3201 = new class790(54, 6);

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
    public static int field3210 = 0;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZLcn;I)V")
    public static final void method1839(int arg0, boolean arg1, class541 arg2, int arg3) {
        try {
            ++field3207;
            if (arg2 != null) {
                if (arg2.field7987 != null) {
                    class86 var4 = new class86();
                    var4.field959 = arg2;
                    var4.field957 = arg2.field7987;
                    class782.method5663(var4);
                }
                class517.field7484 = arg3;
                if (!arg1) {
                    class729.field10569 = arg2.field7999;
                    class311.field4926 = arg2.field8040;
                    class728.field10555 = true;
                    class586.field8637 = arg2.field8050;
                    class547.field8162 = arg2.field8100;
                    class173.field2406 = arg2.field8034;
                    class263.field4037 = arg0;
                    class115.method1013(!arg1, arg2);
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3211[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3211[1] : field3211[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class209() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "(I)V")
    public static void method1840(int arg0) {
        try {
            field3206 = null;
            if (arg0 != -5570) {
                method1843(-113);
            }
            field3201 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3211[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BILib;)V")
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            ++field3202;
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 == -4) {
                        this.field3203 = arg2.method1455((byte) 62);
                    }
                } else {
                    this.field3197 = arg2.method1455((byte) 62);
                }
            } else {
                this.field3205 = arg2.method1455((byte) 62);
            }
            if (arg0 < 67) {
                this.field3203 = -27;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3211[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3211[1] : field3211[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([II[FIIII[F[IIZII)V")
    public static final void method1841(int[] arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int[] arg8, int arg9, boolean arg10, int arg11, int arg12) {
        try {
            ++field3208;
            if (!arg10) {
                int var13 = arg5 * arg9 + arg3;
                int var14 = arg1 * arg11 + arg12;
                int var15 = -arg6 + arg5;
                int var16 = -arg6 + arg1;
                if (arg0 == null) {
                    for (int var17 = 0; var17 < arg4; ++var17) {
                        int var18 = var13 - -arg6;
                        while (var13 < var18) {
                            arg7[var14++] = arg2[var13++];
                        }
                        var14 += var16;
                        var13 += var15;
                    }
                } else if (arg2 == null) {
                    for (int var19 = 0; var19 < arg4; ++var19) {
                        int var20 = arg6 + var13;
                        while (~var13 > ~var20) {
                            arg8[var14++] = arg0[var13++];
                        }
                        var14 += var16;
                        var13 += var15;
                    }
                } else {
                    for (int var21 = 0; arg4 > var21; ++var21) {
                        int var22 = arg6 + var13;
                        while (~var22 < ~var13) {
                            arg8[var14] = arg0[var13];
                            arg7[var14++] = arg2[var13++];
                        }
                        var14 += var16;
                        var13 += var15;
                    }
                }
            }
        } catch (RuntimeException var24) {
            throw class759.method5498(var24, field3211[3] + (arg0 != null ? field3211[1] : field3211[0]) + ',' + arg1 + ',' + (arg2 != null ? field3211[1] : field3211[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field3211[1] : field3211[0]) + ',' + (arg8 != null ? field3211[1] : field3211[0]) + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B[BII)Ljava/lang/String;")
    public static final String method1842(byte arg0, byte[] arg1, int arg2, int arg3) {
        try {
            ++field3199;
            char[] var4 = new char[arg3];
            int var5 = 0;
            for (int var6 = 0; ~var6 > ~arg3; ++var6) {
                int var7 = arg1[arg2 + var6] & 255;
                if (~var7 != -1) {
                    if (~var7 <= -129 && ~var7 > -161) {
                        char var8 = class118.field1403[var7 + -128];
                        if (var8 == 0) {
                            var8 = '?';
                        }
                        var7 = var8;
                    }
                    var4[var5++] = (char) var7;
                }
            }
            int var9 = -47 / ((14 - arg0) / 54);
            return new String(var4, 0, var5);
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field3211[11] + arg0 + ',' + (arg1 != null ? field3211[1] : field3211[0]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)[I")
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field3200;
            if (arg0 != 8217) {
                this.method201((byte) -69, -1, (class163) null);
            }
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (super.field3231.field57) {
                int var4 = class302.field4735[arg1];
                int var5 = var4 - 2048 >> 1;
                for (int var6 = 0; class343.field5332 > var6; ++var6) {
                    int var7 = class88.field997[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var9;
                    if (~this.field3205 == -1) {
                        var9 = (-var4 + var7) * this.field3203;
                    } else {
                        int var10 = var5 * var5 + var8 * var8 >> 12;
                        int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                        var9 = (int) ((double) (this.field3203 * var11) * 3.141592653589793D);
                    }
                    int var12 = var9 - (-4096 & var9);
                    if (~this.field3197 == -1) {
                        var12 = class100.field1109[(4091 & var12) >> 4] - -4096 >> 1;
                    } else if (~this.field3197 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field3211[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)Lhia;")
    public static final class73 method1843(int arg0) {
        try {
            ++field3198;
            class236 var1 = null;
            class73 var2 = new class73(class447.field6576, arg0);
            try {
                class42 var3 = class580.field8601.method213((byte) 118, true, "");
                while (~var3.field503 == -1) {
                    class151.method1269(false, 1L);
                }
                if (~var3.field503 == -2) {
                    var1 = (class236) var3.field499;
                    byte[] var4 = new byte[(int) var1.method2014((byte) 93)];
                    int var6;
                    for (int var5 = 0; ~var4.length < ~var5; var5 += var6) {
                        var6 = var1.method2013(var4.length + -var5, var4, true, var5);
                        if (~var6 == 0) {
                            throw new IOException(field3211[5]);
                        }
                    }
                    var2 = new class73(new class163(var4), class447.field6576, 0);
                }
            } catch (Exception var9) {
            }
            try {
                if (var1 != null) {
                    var1.method2011(-2968);
                }
            } catch (Exception var8) {
            }
            return var2;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field3211[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public final void method437(int arg0) {
        try {
            if (arg0 != 27132) {
                field3206 = null;
            }
            ++field3204;
            class100.method826(15667);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3211[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lha;Lap;Z)I")
    public static final int method1844(class66 arg0, class502 arg1, boolean arg2) {
        try {
            if (arg2) {
                method1840(-63);
            }
            ++field3196;
            if (~arg1.field7264 == 0) {
                if (arg1.field7268 != -1) {
                    class439 var3 = arg0.field679.method1366((byte) -120, arg1.field7268);
                    if (!var3.field6474) {
                        return var3.field6472;
                    }
                }
                return arg1.field7263;
            } else {
                return arg1.field7264;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3211[10] + (arg0 != null ? field3211[1] : field3211[0]) + ',' + (arg1 != null ? field3211[1] : field3211[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1845(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 74);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1846(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 106;
                    break;
                case 1:
                    var10005 = 98;
                    break;
                case 2:
                    var10005 = 82;
                    break;
                case 3:
                    var10005 = 122;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
