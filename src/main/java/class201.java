import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class201 extends class698 {

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    private int field3175;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    private int field3170;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    private int field3168;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    private int field3167;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3185 = new String[] { method1835(method1834("\u0019\fa\u0013")), method1835(method1834("\u0019\fb\u0013")), method1835(method1834("\u0019\fc\u0013")), method1835(method1834("\u0019\fe\u0013")), method1835(method1834("\u0019\fg\u0013")), method1835(method1834("\u0019\fd\u0013")), method1835(method1834("\u0019\f\u001aR>\u001dV\u0018\u0013")), method1835(method1834("\u0019\f`\u0013")) };

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Lhl;")
    public static class556 field3173 = new class556(40, 8);

    @OriginalMember(owner = "client!m", name = "v", descriptor = "Lwh;")
    public static class155 field3178 = new class155(1, 2);

    @OriginalMember(owner = "client!m", name = "n", descriptor = "[I")
    public static int[] field3180 = new int[13];

    @OriginalMember(owner = "client!m", name = "m", descriptor = "Lhl;")
    public static class556 field3179 = new class556(115, -1);

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field3184 = 1;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "Lhl;")
    public static class556 field3183 = new class556(34, -2);

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "Lwt;")
    public static class328 field3181;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "[[Z")
    public static boolean[][] field3182;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZZZ)I")
    public static final int method1830(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        try {
            ++field3171;
            class454 var5 = class173.method1596(arg2, 13510, arg1);
            if (var5 == null) {
                return 0;
            } else {
                int var6 = 0;
                for (int var7 = 0; ~var7 > ~var5.field7018.length; ++var7) {
                    if (var5.field7018[var7] >= 0 && ~class229.field3563.field625 < ~var5.field7018[var7]) {
                        class584 var8 = class229.field3563.method531(var5.field7018[var7], (byte) 89);
                        int var9 = var8.method4287(0, class289.field4655.method97(arg0, (byte) 38).field9501, arg0);
                        if (arg4) {
                            var6 += var5.field7013[var7] * var9;
                        } else {
                            var6 += var9;
                        }
                    }
                }
                if (arg3) {
                    return -60;
                } else {
                    return var6;
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field3185[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static final void method1831(byte arg0) {
        try {
            class182.method1716(9, -1, 255);
            ++field3176;
            if (arg0 > -36) {
                method1832(34);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3185[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method1832(int arg0) {
        try {
            field3182 = null;
            field3180 = null;
            field3179 = null;
            if (arg0 != -31879) {
                field3183 = null;
            }
            field3183 = null;
            field3178 = null;
            field3181 = null;
            field3173 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3185[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
    public final void method967(int arg0, int arg1, int arg2) {
        try {
            ++field3169;
            if (arg0 != 19388) {
                method1832(-36);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3185[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIB)V")
    public final void method964(int arg0, int arg1, byte arg2) {
        try {
            ++field3174;
            if (arg2 != -66) {
                field3178 = null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3185[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZII)V")
    public final void method965(boolean arg0, int arg1, int arg2) {
        try {
            if (arg0) {
                this.field3167 = 13;
            }
            ++field3177;
            int var4 = this.field3168 * arg1 >> 12;
            int var5 = this.field3170 * arg1 >> 12;
            int var6 = this.field3175 * arg2 >> 12;
            int var7 = this.field3167 * arg2 >> 12;
            class65.method690(0, super.field10052, var6, var4, var7, var5);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field3185[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1833(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            ++field3172;
            int var8 = 0;
            int var9 = arg2;
            int var10 = 0;
            int var11 = arg1 - arg3;
            int var12 = arg2 - arg3;
            int var13 = arg1 * arg1;
            int var14 = arg2 * arg2;
            if (arg4 > -111) {
                method1830(-50, 67, true, false, true);
            }
            int var15 = var11 * var11;
            int var16 = var12 * var12;
            int var17 = var14 << 1;
            int var18 = var13 << 1;
            int var19 = var16 << 1;
            int var20 = var15 << 1;
            int var21 = arg2 << 1;
            int var22 = var12 << 1;
            int var23 = (-var21 + 1) * var13 + var17;
            int var24 = var14 - (var21 + -1) * var18;
            int var25 = (1 - var22) * var15 - -var19;
            int var26 = -((var22 + -1) * var20) + var16;
            int var27 = var13 << 2;
            int var28 = var14 << 2;
            int var29 = var15 << 2;
            int var30 = var16 << 2;
            int var31 = var17 * 3;
            int var32 = (var21 + -3) * var18;
            int var33 = var19 * 3;
            int var34 = (var22 + -3) * var20;
            int var35 = var28;
            int var36 = (arg2 - 1) * var27;
            int var37 = var30;
            int var38 = (var12 + -1) * var29;
            int[] var39 = class193.field3047[arg0];
            class545.method4051(arg7 - arg1, arg6, -var11 + arg7, var39, -109);
            class545.method4051(-var11 + arg7, arg5, arg7 + var11, var39, -123);
            class545.method4051(arg7 + var11, arg6, arg1 + arg7, var39, -116);
            while (~var9 < -1) {
                boolean var40 = var12 >= var9;
                if (var40) {
                    if (var25 < 0) {
                        while (var25 < 0) {
                            var26 += var37;
                            var25 += var33;
                            ++var10;
                            var33 += var30;
                            var37 += var30;
                        }
                    }
                    if (var26 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        ++var10;
                        var37 += var30;
                    }
                    var26 += -var34;
                    var25 += -var38;
                    var34 -= var29;
                    var38 -= var29;
                }
                if (var23 < 0) {
                    while (var23 < 0) {
                        var24 += var35;
                        var23 += var31;
                        var35 += var28;
                        ++var8;
                        var31 += var28;
                    }
                }
                if (var24 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    ++var8;
                    var31 += var28;
                }
                var23 += -var36;
                var24 += -var32;
                --var9;
                var32 -= var27;
                var36 -= var27;
                int var41 = -var9 + arg0;
                int var42 = arg0 + var9;
                int var43 = arg7 + var8;
                int var44 = -var8 + arg7;
                if (!var40) {
                    class545.method4051(var44, arg6, var43, class193.field3047[var41], -113);
                    class545.method4051(var44, arg6, var43, class193.field3047[var42], -110);
                } else {
                    int var45 = arg7 + var10;
                    int var46 = -var10 + arg7;
                    class545.method4051(var44, arg6, var46, class193.field3047[var41], -120);
                    class545.method4051(var46, arg5, var45, class193.field3047[var41], -111);
                    class545.method4051(var45, arg6, var43, class193.field3047[var41], -115);
                    class545.method4051(var44, arg6, var46, class193.field3047[var42], -122);
                    class545.method4051(var46, arg5, var45, class193.field3047[var42], -110);
                    class545.method4051(var45, arg6, var43, class193.field3047[var42], -107);
                }
            }
        } catch (RuntimeException var48) {
            throw class590.method4333(var48, field3185[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIII)V")
    public class201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        try {
            this.field3175 = arg1;
            this.field3170 = arg2;
            this.field3168 = arg0;
            this.field3167 = arg3;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3185[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!m", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1834(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 80);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!m", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1835(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 34;
                    break;
                case 2:
                    var10005 = 38;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 80;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
