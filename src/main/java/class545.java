import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class545 extends class232 {

    @OriginalMember(owner = "client!fo", name = "R", descriptor = "I")
    private int field8013 = 4096;

    @OriginalMember(owner = "client!fo", name = "T", descriptor = "I")
    private int field8016 = 409;

    @OriginalMember(owner = "client!fo", name = "S", descriptor = "I")
    private int field8022 = 4096;

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "I")
    private int field8023 = 4096;

    @OriginalMember(owner = "client!fo", name = "N", descriptor = "[I")
    private int[] field8014 = new int[3];

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field8027 = new String[] { method4054(method4053("\u0007';7:")), method4054(method4053("\u001af;Ro")), method4054(method4053("\u0012|yu")), method4054(method4053("\u001af;[o")), method4054(method4053("\u001af;So")), method4054(method4053("\u001af;]o")), method4054(method4053("\u001af;_o")), method4054(method4053("\u001af;\\o")), method4054(method4053("\u001af;Xo")) };

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "Lhl;")
    public static class556 field8019 = new class556(72, 7);

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
    public static int field8021 = 0;

    @OriginalMember(owner = "client!fo", name = "M", descriptor = "Lmp;")
    public static class796 field8024 = new class796(method4054(method4053("+]DX")), method4054(method4053("\u0013osp$\u0019")), method4054(method4053("#xt")), 2);

    @OriginalMember(owner = "client!fo", name = "Q", descriptor = "I")
    public static int field8015;

    @OriginalMember(owner = "client!fo", name = "O", descriptor = "I")
    public static int field8017;

    @OriginalMember(owner = "client!fo", name = "K", descriptor = "I")
    public static int field8018;

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
    public static int field8020;

    @OriginalMember(owner = "client!fo", name = "U", descriptor = "I")
    public static int field8025;

    @OriginalMember(owner = "client!fo", name = "P", descriptor = "I")
    public static int field8026;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)[[I")
    public final int[][] method122(int arg0, int arg1) {
        try {
            ++field8026;
            if (arg0 != -3093) {
                return null;
            } else {
                int[][] var3 = super.field3599.method1580(arg1, (byte) -78);
                if (super.field3599.field2743) {
                    int[][] var4 = this.method2023((byte) 94, arg1, 0);
                    int[] var5 = var4[0];
                    int[] var6 = var4[1];
                    int[] var7 = var4[2];
                    int[] var8 = var3[0];
                    int[] var9 = var3[1];
                    int[] var10 = var3[2];
                    for (int var11 = 0; var11 < class449.field6969; ++var11) {
                        int var12 = var5[var11];
                        int var13 = -this.field8014[0] + var12;
                        if (var13 < 0) {
                            var13 = -var13;
                        }
                        if (var13 > this.field8016) {
                            var8[var11] = var12;
                            var9[var11] = var6[var11];
                            var10[var11] = var7[var11];
                        } else {
                            int var14 = var6[var11];
                            int var15 = -this.field8014[1] + var14;
                            if (~var15 > -1) {
                                var15 = -var15;
                            }
                            if (~this.field8016 > ~var15) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var7[var11];
                            } else {
                                int var16 = var7[var11];
                                int var17 = var16 - this.field8014[2];
                                if (~var17 > -1) {
                                    var17 = -var17;
                                }
                                if (var17 > this.field8016) {
                                    var8[var11] = var12;
                                    var9[var11] = var14;
                                    var10[var11] = var16;
                                } else {
                                    var8[var11] = this.field8013 * var12 >> 12;
                                    var9[var11] = this.field8022 * var14 >> 12;
                                    var10[var11] = this.field8023 * var16 >> 12;
                                }
                            }
                        }
                    }
                }
                return var3;
            }
        } catch (RuntimeException var19) {
            throw class590.method4333(var19, field8027[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(II)Z")
    public static final boolean method4048(int arg0, int arg1) {
        try {
            ++field8018;
            if (arg1 != 9) {
                return false;
            } else {
                return ~arg0 == -23 || arg0 == 9 || ~arg0 == -1008 || arg0 == 53 || ~arg0 == -49;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8027[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(II)S")
    public static final short method4049(int arg0, int arg1) {
        try {
            ++field8020;
            int var2 = 63 & arg0 >> 10;
            int var3 = 112 & arg0 >> 3;
            int var4 = arg0 & 127;
            int var5 = ~var4 < -65 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
            int var6 = var4 + var5;
            if (arg1 <= 13) {
                method4049(75, 14);
            }
            int var7;
            if (var6 != 0) {
                var7 = (var5 << 8) / var6;
            } else {
                var7 = var5 << 1;
            }
            return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field8027[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIII)V")
    public static final void method4050(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            for (class195 var5 = (class195) class669.field9510.method3228(11); var5 != null; var5 = (class195) class669.field9510.method3216(true)) {
                class558.method4114((byte) 109, arg4, arg2, arg0, var5, arg1);
            }
            ++field8017;
            if (arg3 != 3) {
                method4051(111, -43, 20, (int[]) null, -102);
            }
            for (class195 var6 = (class195) class190.field3010.method3228(11); var6 != null; var6 = (class195) class190.field3010.method3216(true)) {
                byte var7 = 1;
                class707 var8 = var6.field3087.method802(-65);
                if (var6.field3087.field1121 != -1 && !var6.field3087.field1150) {
                    if (~var6.field3087.field1121 != ~var8.field10142 && ~var6.field3087.field1121 != ~var8.field10133 && ~var6.field3087.field1121 != ~var8.field10165 && var6.field3087.field1121 != var8.field10153) {
                        if (var6.field3087.field1121 == var8.field10177 || ~var6.field3087.field1121 == ~var8.field10134 || var6.field3087.field1121 == var8.field10181 || ~var6.field3087.field1121 == ~var8.field10149) {
                            var7 = 3;
                        }
                    } else {
                        var7 = 2;
                    }
                } else {
                    var7 = 0;
                }
                if (~var6.field3086 != ~var7) {
                    int var9 = class356.method2949(var6.field3087, 50);
                    class162 var10 = var6.field3087.field6716;
                    if (var10.field2620 != null) {
                        var10 = var10.method1530(-43, class398.field6315);
                    }
                    if (var10 != null && var9 != -1) {
                        if (var6.field3103 == var9 && var6.field3088 == var10.field2613) {
                            var6.field3086 = var7;
                            var6.field3096 = var10.field2557;
                        } else {
                            boolean var11 = false;
                            if (var6.field3081 != null) {
                                var6.field3096 -= 512;
                                if (~var6.field3096 >= -1) {
                                    class476.field7253.method2594(var6.field3081);
                                    var11 = true;
                                    var6.field3081 = null;
                                }
                            } else {
                                var11 = true;
                            }
                            if (var11) {
                                var6.field3086 = var7;
                                var6.field3104 = null;
                                var6.field3088 = var10.field2613;
                                var6.field3103 = var9;
                                var6.field3080 = null;
                                var6.field3096 = var10.field2557;
                            }
                        }
                    } else {
                        var6.field3103 = -1;
                        var6.field3086 = var7;
                        var6.field3088 = false;
                    }
                }
                var6.field3094 = var6.field3087.field9985;
                var6.field3109 = var6.field3087.field9985 + (var6.field3087.method804(true) << 8);
                var6.field3110 = var6.field3087.field9983;
                var6.field3082 = var6.field3087.field9983 - -(var6.field3087.method804(true) << 8);
                class558.method4114((byte) 69, arg4, arg2, arg0, var6, arg1);
            }
            for (class195 var12 = (class195) class787.field11511.method735(0); var12 != null; var12 = (class195) class787.field11511.method734((byte) -50)) {
                byte var13 = 1;
                class707 var14 = var12.field3079.method802(arg3 + -62);
                if (var12.field3079.field1121 != -1 && !var12.field3079.field1150) {
                    if (~var12.field3079.field1121 != ~var14.field10142 && var12.field3079.field1121 != var14.field10133 && var12.field3079.field1121 != var14.field10165 && ~var12.field3079.field1121 != ~var14.field10153) {
                        if (var12.field3079.field1121 == var14.field10177 || var12.field3079.field1121 == var14.field10134 || var12.field3079.field1121 == var14.field10181 || ~var12.field3079.field1121 == ~var14.field10149) {
                            var13 = 3;
                        }
                    } else {
                        var13 = 2;
                    }
                } else {
                    var13 = 0;
                }
                if (var12.field3086 != var13) {
                    int var15 = class543.method4041(arg3 + -3, var12.field3079);
                    if (var12.field3103 == var15 && !var12.field3079.field10856 != var12.field3088) {
                        var12.field3086 = var13;
                        var12.field3096 = var12.field3079.field10832;
                    } else {
                        boolean var16 = false;
                        if (var12.field3081 == null) {
                            var16 = true;
                        } else {
                            var12.field3096 -= 512;
                            if (var12.field3096 <= 0) {
                                class476.field7253.method2594(var12.field3081);
                                var12.field3081 = null;
                                var16 = true;
                            }
                        }
                        if (var16) {
                            var12.field3103 = var15;
                            var12.field3096 = var12.field3079.field10832;
                            var12.field3104 = null;
                            var12.field3080 = null;
                            var12.field3088 = var12.field3079.field10856;
                            var12.field3086 = var13;
                        }
                    }
                }
                var12.field3094 = var12.field3079.field9985;
                var12.field3109 = var12.field3079.field9985 + (var12.field3079.method804(true) << 8);
                var12.field3110 = var12.field3079.field9983;
                var12.field3082 = var12.field3079.field9983 + (var12.field3079.method804(true) << 8);
                class558.method4114((byte) 76, arg4, arg2, arg0, var12, arg1);
            }
        } catch (RuntimeException var18) {
            throw class590.method4333(var18, field8027[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III[II)V")
    public static final void method4051(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        try {
            --arg0;
            if (arg4 > -105) {
                field8019 = null;
            }
            ++field8025;
            int var13 = arg2 - 1;
            int var5 = -7 + var13;
            while (arg0 < var5) {
                int var8 = arg0 + 1;
                arg3[var8] = arg1;
                int var9 = var8 + 1;
                arg3[var9] = arg1;
                int var10 = var9 + 1;
                arg3[var10] = arg1;
                int var11 = var10 + 1;
                arg3[var11] = arg1;
                int var12 = var11 + 1;
                arg3[var12] = arg1;
                int var14 = var12 + 1;
                arg3[var14] = arg1;
                int var15 = var14 + 1;
                arg3[var15] = arg1;
                arg0 = var15 + 1;
                arg3[arg0] = arg1;
            }
            while (arg0 < var13) {
                ++arg0;
                arg3[arg0] = arg1;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field8027[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8027[0] : field8027[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(B)V")
    public static void method4052(byte arg0) {
        try {
            if (arg0 != -57) {
                method4052((byte) -35);
            }
            field8024 = null;
            field8019 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8027[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V")
    public class545() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILwq;I)V")
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            ++field8015;
            if (arg0 < 96) {
                this.field8013 = -100;
            }
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (~arg2 != -4) {
                            if (~arg2 == -5) {
                                int var5 = arg1.method1685(false);
                                this.field8014[2] = class292.method2485(var5 >> 12, 0);
                                this.field8014[0] = class292.method2485(var5 << 4, 267386880);
                                this.field8014[1] = class292.method2485(var5, 65280) >> 4;
                            }
                        } else {
                            this.field8013 = arg1.method1687((byte) -57);
                        }
                    } else {
                        this.field8022 = arg1.method1687((byte) -100);
                    }
                } else {
                    this.field8023 = arg1.method1687((byte) -47);
                }
            } else {
                this.field8016 = arg1.method1687((byte) -63);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field8027[7] + arg0 + ',' + (arg1 != null ? field8027[0] : field8027[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4053(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 71);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4054(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 124;
                    break;
                case 1:
                    var10005 = 9;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 25;
                    break;
                default:
                    var10005 = 71;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
