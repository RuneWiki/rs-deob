import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class18 extends class232 {

    @OriginalMember(owner = "client!l", name = "J", descriptor = "Z")
    private boolean field183 = true;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "Z")
    private boolean field191 = true;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "[Ljava/lang/String;")
    private static final String[] field193 = new String[] { method129(method128("\u0002^'\b")), method129(method128("\u0002^ \b")), method129(method128("\u0002^-\b")), method129(method128("\u0002^#\b")), method129(method128("\u0002^*\b")), method129(method128("\u0002^+\b")), method129(method128("\u0002^$\b")), method129(method128("\u0000\u0005\rL")), method129(method128("\u0015^O\u000eX")) };

    @OriginalMember(owner = "client!l", name = "L", descriptor = "[I")
    public static int[] field186 = new int[4096];

    @OriginalMember(owner = "client!l", name = "O", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public static int field192;

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field186[var0] = class245.method2111(var0, 26762);
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)[[I", line = 4)
    public final int[][] method122(int arg0, int arg1) {
        try {
            ++field184;
            int[][] var3 = super.field3599.method1580(arg1, (byte) -109);
            if (super.field3599.field2743) {
                int[][] var4 = this.method2023((byte) 94, !this.field183 ? arg1 : class315.field5126 - arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (this.field191) {
                    for (int var11 = 0; ~class449.field6969 < ~var11; ++var11) {
                        var8[var11] = var5[-var11 + class250.field3824];
                        var9[var11] = var6[-var11 + class250.field3824];
                        var10[var11] = var7[class250.field3824 - var11];
                    }
                } else {
                    for (int var12 = 0; class449.field6969 > var12; ++var12) {
                        var8[var12] = var5[var12];
                        var9[var12] = var6[var12];
                        var10[var12] = var7[var12];
                    }
                }
            }
            if (arg0 != -3093) {
                this.field191 = false;
            }
            return var3;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field193[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)[I", line = 69)
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field188;
            if (arg1 != 123) {
                this.field191 = true;
            }
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (super.field3601.field6907) {
                int[] var4 = this.method2022(this.field183 ? -arg0 + class315.field5126 : arg0, 0, arg1 ^ 123);
                if (!this.field191) {
                    class405.method3262(var4, 0, var3, 0, class449.field6969);
                } else {
                    for (int var5 = 0; ~var5 > ~class449.field6969; ++var5) {
                        var3[var5] = var4[-var5 + class250.field3824];
                    }
                }
            }
            return var3;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field193[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V", line = 110)
    public static final void method123(int arg0) {
        try {
            if (arg0 != 2) {
                field189 = 50;
            }
            class617.field8910.method159(class172.field2757, class428.field6749, class409.field6539);
            ++field192;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field193[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "j", descriptor = "(I)V", line = 121)
    public static final void method124(int arg0) {
        if (arg0 == 0) {
            if (class586.field8501 == 2) {
                class780.field11382[0].method3312(class764.field11209[0]);
                class780.field11382[1].method3312(class764.field11209[1]);
            } else if (class586.field8501 == 3) {
                class780.field11382[0].method3312(class764.field11209[0]);
                class780.field11382[1].method3312(class764.field11209[1]);
                class780.field11382[2].method3312(class764.field11209[2]);
            } else {
                class780.field11382[0].method3312(class764.field11209[0]);
                class780.field11382[1].method3312(class764.field11209[1]);
                class780.field11382[2].method3312(class764.field11209[2]);
                class780.field11382[3].method3312(class764.field11209[3]);
            }
        } else if (arg0 == 1) {
            if (class586.field8501 == 2) {
                class780.field11382[0].method3312(class764.field11209[2]);
            } else if (class586.field8501 == 3) {
                class780.field11382[0].method3312(class764.field11209[3]);
                class780.field11382[1].method3312(class764.field11209[4]);
            } else {
                class780.field11382[0].method3312(class764.field11209[4]);
                class780.field11382[1].method3312(class764.field11209[5]);
                class780.field11382[2].method3312(class764.field11209[6]);
            }
        } else {
            if (arg0 == 2) {
                if (class586.field8501 == 2) {
                    class780.field11382[0].method3312(class764.field11209[3]);
                    return;
                }
                if (class586.field8501 == 3) {
                    class780.field11382[0].method3312(class764.field11209[5]);
                    return;
                }
                class780.field11382[0].method3312(class764.field11209[7]);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILwq;I)V", line = 191)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            ++field185;
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        super.field3605 = arg1.method1645((byte) -85) == 1;
                    }
                } else {
                    this.field183 = arg1.method1645((byte) -87) == 1;
                }
            } else {
                this.field191 = ~arg1.method1645((byte) -121) == -2;
            }
            if (arg0 <= 96) {
                this.field183 = true;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field193[6] + arg0 + ',' + (arg1 != null ? field193[8] : field193[7]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 237)
    public class18() {
        super(1, false);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IB)I", line = 254)
    public static final int method125(int arg0, byte arg1) {
        try {
            if (arg1 != 25) {
                method125(-42, (byte) 73);
            }
            ++field187;
            byte var2;
            if (arg0 > 12000) {
                var2 = 4;
                class502.method3785(92);
            } else if (arg0 <= 5000) {
                if (arg0 <= 2000) {
                    class360.method2979(true, -80);
                    var2 = 1;
                } else {
                    class752.method5459((byte) -92);
                    var2 = 2;
                }
            } else {
                var2 = 3;
                class190.method1764(-2137);
            }
            if (~class623.field8996.field6379.method4132(true) != -3) {
                class623.field8996.method3244(22733, class623.field8996.field6378, 2);
                class679.method4942(false, (byte) 121, 2);
            }
            class574.method4222((byte) -79);
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field193[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V", line = 305)
    public static final void method126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field190;
            class52.method542(0, arg5);
            int var7 = 0;
            int var8 = arg5 - arg6;
            if (var8 < 0) {
                var8 = 0;
            }
            int var9 = arg5;
            int var10 = -arg5;
            int var11 = var8;
            int var12 = -var8;
            int var13 = -1;
            int var14 = -1;
            int[] var15 = class193.field3047[arg0];
            int var16 = arg1 - var8;
            class545.method4051(arg1 - arg5, arg2, var16, var15, -121);
            int var17 = arg1 + var8;
            class545.method4051(var16, arg3, var17, var15, -123);
            class545.method4051(var17, arg2, arg1 + arg5, var15, -119);
            while (~var7 > ~var9) {
                var13 += 2;
                var14 += 2;
                var10 += var13;
                var12 += var14;
                if (~var12 <= -1 && var11 >= 1) {
                    class30.field329[var11] = var7;
                    --var11;
                    var12 -= var11 << 1;
                }
                ++var7;
                if (~var10 <= -1) {
                    --var9;
                    var10 -= var9 << 1;
                    if (var9 >= var8) {
                        int[] var18 = class193.field3047[arg0 + var9];
                        int[] var19 = class193.field3047[-var9 + arg0];
                        int var20 = arg1 - -var7;
                        int var21 = -var7 + arg1;
                        class545.method4051(var21, arg2, var20, var18, -128);
                        class545.method4051(var21, arg2, var20, var19, -116);
                    } else {
                        int[] var22 = class193.field3047[arg0 + var9];
                        int[] var23 = class193.field3047[-var9 + arg0];
                        int var24 = class30.field329[var9];
                        int var25 = arg1 + var7;
                        int var26 = -var7 + arg1;
                        int var27 = arg1 + var24;
                        int var28 = -var24 + arg1;
                        class545.method4051(var26, arg2, var28, var22, -106);
                        class545.method4051(var28, arg3, var27, var22, -124);
                        class545.method4051(var27, arg2, var25, var22, -121);
                        class545.method4051(var26, arg2, var28, var23, -111);
                        class545.method4051(var28, arg3, var27, var23, -118);
                        class545.method4051(var27, arg2, var25, var23, -109);
                    }
                }
                int[] var29 = class193.field3047[arg0 - -var7];
                int[] var30 = class193.field3047[-var7 + arg0];
                int var31 = arg1 + var9;
                int var32 = -var9 + arg1;
                if (var8 > var7) {
                    int var33 = var11 >= var7 ? var11 : class30.field329[var7];
                    int var34 = arg1 + var33;
                    int var35 = arg1 - var33;
                    class545.method4051(var32, arg2, var35, var29, -123);
                    class545.method4051(var35, arg3, var34, var29, -120);
                    class545.method4051(var34, arg2, var31, var29, -122);
                    class545.method4051(var32, arg2, var35, var30, -110);
                    class545.method4051(var35, arg3, var34, var30, -125);
                    class545.method4051(var34, arg2, var31, var30, -106);
                } else {
                    class545.method4051(var32, arg2, var31, var29, -125);
                    class545.method4051(var32, arg2, var31, var30, -112);
                }
            }
            if (arg4 > -89) {
                method125(-56, (byte) -117);
            }
        } catch (RuntimeException var37) {
            throw class590.method4333(var37, field193[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V", line = 434)
    public static void method127(int arg0) {
        try {
            field186 = null;
            if (arg0 != 0) {
                field189 = 3;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field193[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method128(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 37);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!l", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method129(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 110;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 97;
                    break;
                case 3:
                    var10005 = 32;
                    break;
                default:
                    var10005 = 37;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
