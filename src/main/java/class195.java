import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class195 extends class518 {

    @OriginalMember(owner = "client!we", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field2924 = new String[] { method1698(method1697("\u0015B-MI")), method1698(method1697("\fRog")), method1698(method1697("\u0015B-HI")), method1698(method1697("\u0019\t-%\u001c")), method1698(method1697("\u0015B-JI")), method1698(method1697("\u0015B-II")), method1698(method1697("\u0015B-LI")), method1698(method1697("\u0015B-CI")), method1698(method1697("\u0015B-OI")), method1698(method1697("\u0015B-NI")) };

    @OriginalMember(owner = "client!we", name = "K", descriptor = "[Luda;")
    public static class302[] field2919 = new class302[4];

    @OriginalMember(owner = "client!we", name = "D", descriptor = "F")
    public static float field2917;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V")
    public static void method1692(int arg0) {
        try {
            field2919 = null;
            if (arg0 != -2116253268) {
                method1694(24, 8);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2924[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class195() {
        super(3, false);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZIIII)V")
    public static final void method1693(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field2918;
            if (arg4 >= -52) {
                field2919 = null;
            }
            long var6 = (long) (arg5 | (!arg1 ? 0 : Integer.MIN_VALUE));
            class375 var8 = (class375) class191.field2530.method3693(false, var6);
            if (var8 == null) {
                var8 = new class375();
                class191.field2530.method3691(var8, var6, -1);
            }
            if (~var8.field5476.length >= ~arg3) {
                int[] var9 = new int[arg3 + 1];
                int[] var10 = new int[arg3 + 1];
                for (int var11 = 0; var11 < var8.field5476.length; ++var11) {
                    var9[var11] = var8.field5476[var11];
                    var10[var11] = var8.field5472[var11];
                }
                for (int var12 = var8.field5476.length; ~var12 > ~arg3; ++var12) {
                    var9[var12] = -1;
                    var10[var12] = 0;
                }
                var8.field5472 = var10;
                var8.field5476 = var9;
            }
            var8.field5476[arg3] = arg0;
            var8.field5472[arg3] = arg2;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field2924[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(II)I")
    public static final int method1694(int arg0, int arg1) {
        try {
            ++field2920;
            if (arg0 != 1438) {
                method1694(14, -76);
            }
            return arg1 >>> 8;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2924[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)[[I")
    public final int[][] method349(int arg0, int arg1) {
        try {
            ++field2923;
            int[][] var3 = super.field7575.method1955(arg1, -2);
            if (arg0 != 0) {
                this.method349(-106, -46);
            }
            if (super.field7575.field3416) {
                int[] var4 = this.method3944(arg1, 2, (byte) 73);
                int[][] var5 = this.method3943(0, arg1, arg0 + -23583);
                int[][] var6 = this.method3943(1, arg1, -23583);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; class110.field1436 > var16; ++var16) {
                    int var17 = var4[var16];
                    if (var17 != 4096) {
                        if (var17 == 0) {
                            var7[var16] = var13[var16];
                            var8[var16] = var14[var16];
                            var9[var16] = var15[var16];
                        } else {
                            int var18 = 4096 - var17;
                            var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                            var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                            var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                        }
                    } else {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    }
                }
            }
            return var3;
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field2924[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjc;I)V")
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            if (arg2 == -3) {
                ++field2915;
                if (arg0 == 0) {
                    super.field7565 = arg1.method5128(0) == 1;
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2924[2] + arg0 + ',' + (arg1 != null ? field2924[3] : field2924[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(II)Z")
    public static final boolean method1695(int arg0, int arg1) {
        try {
            ++field2914;
            if (arg0 != 14756) {
                field2922 = -48;
            }
            return arg1 == 7 || ~arg1 == -10;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2924[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field2916;
            int[] var3 = super.field7564.method4462(26041, arg0);
            if (super.field7564.field8652) {
                int[] var4 = this.method3944(arg0, 0, (byte) 73);
                int[] var5 = this.method3944(arg0, 1, (byte) 73);
                int[] var6 = this.method3944(arg0, 2, (byte) 73);
                for (int var7 = 0; class110.field1436 > var7; ++var7) {
                    int var8 = var6[var7];
                    if (var8 == 4096) {
                        var3[var7] = var4[var7];
                    } else if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                }
            }
            int var9 = -6 / ((arg1 - -57) / 55);
            return var3;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field2924[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1696(int arg0, byte arg1, int arg2) {
        try {
            ++field2921;
            if (arg1 != -45) {
                field2917 = -0.9327409F;
            }
            return ~(33 & arg0) != -1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2924[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!we", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1697(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 97);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!we", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1698(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 98;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 3;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 97;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
