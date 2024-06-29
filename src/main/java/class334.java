import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class334 extends class698 {

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "I")
    private int field5459;

    @OriginalMember(owner = "client!uea", name = "p", descriptor = "I")
    private int field5457;

    @OriginalMember(owner = "client!uea", name = "r", descriptor = "I")
    private int field5461;

    @OriginalMember(owner = "client!uea", name = "v", descriptor = "I")
    private int field5455;

    @OriginalMember(owner = "client!uea", name = "m", descriptor = "I")
    private int field5460;

    @OriginalMember(owner = "client!uea", name = "t", descriptor = "I")
    private int field5450;

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
    private int field5464;

    @OriginalMember(owner = "client!uea", name = "l", descriptor = "I")
    private int field5462;

    @OriginalMember(owner = "client!uea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5465 = new String[] { method2822(method2821("sC~\u0003p")), method2822(method2821("}\b1\u0003L ")), method2822(method2821("f\u0018<A")), method2822(method2821("}\b1\u00031a\u00039Y3 ")), method2822(method2821("}\b1\u0003J ")), method2822(method2821("}\b1\u0003N ")), method2822(method2821("}\b1\u0003I ")), method2822(method2821("}\b1\u0003O ")), method2822(method2821("}\b1\u0003K ")), method2822(method2821("%@n\r")), method2822(method2821("}\b1\u0003H ")), method2822(method2821("J\u00189Ai2Mf\u0018;")) };

    @OriginalMember(owner = "client!uea", name = "o", descriptor = "Lwc;")
    public static class71 field5449 = new class71();

    @OriginalMember(owner = "client!uea", name = "n", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!uea", name = "u", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!uea", name = "s", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!uea", name = "q", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "Lhk;")
    public static class107 field5452;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZII)V", line = 3)
    public final void method965(boolean arg0, int arg1, int arg2) {
        try {
            ++field5463;
            if (arg0) {
                this.method967(39, -98, 68);
            }
            int var4 = this.field5460 * arg1 >> 12;
            int var5 = this.field5450 * arg2 >> 12;
            int var6 = this.field5462 * arg1 >> 12;
            int var7 = this.field5461 * arg2 >> 12;
            int var8 = this.field5455 * arg1 >> 12;
            int var9 = this.field5459 * arg2 >> 12;
            int var10 = this.field5457 * arg1 >> 12;
            int var11 = this.field5464 * arg2 >> 12;
            class530.method3961(var11, var10, var9, var6, var7, var8, var5, var4, super.field10052, arg0);
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field5465[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IILha;B)V", line = 30)
    public static final void method2817(int arg0, int arg1, class63 arg2, byte arg3) {
        try {
            ++field5454;
            class603.field8714 = new class758[arg0][arg1];
            class617.field8910 = arg2;
            if (class706.field10126 != null) {
                class628.field9042 = class236.method2044(arg3 ^ 71, class706.field10126[0], class706.field10126[1], class706.field10126[2], class706.field10126[3], class706.field10126[5], class706.field10126[4]);
            }
            class601.field8699 = new class758();
            if (arg3 != 50) {
                method2819(-33);
            }
            class126.method1213((byte) 54);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5465[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5465[0] : field5465[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", line = 49)
    public static final boolean method2818(boolean arg0, String arg1, String arg2, String arg3, String arg4) {
        try {
            ++field5456;
            if (!arg0) {
                field5452 = null;
            }
            if (arg1 != null && arg2 != null) {
                return !arg1.startsWith("#") && !arg2.startsWith("#") ? arg4.equals(arg3) : arg1.equals(arg2);
            } else {
                return false;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5465[1] + arg0 + ',' + (arg1 != null ? field5465[0] : field5465[2]) + ',' + (arg2 != null ? field5465[0] : field5465[2]) + ',' + (arg3 != null ? field5465[0] : field5465[2]) + ',' + (arg4 != null ? field5465[0] : field5465[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(III)V", line = 75)
    public final void method967(int arg0, int arg1, int arg2) {
        try {
            if (arg0 == 19388) {
                ++field5458;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5465[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V", line = 85)
    public static void method2819(int arg0) {
        try {
            field5449 = null;
            int var1 = -123 % ((arg0 - -27) / 37);
            field5452 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5465[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIB)V", line = 97)
    public final void method964(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 != -66) {
                field5449 = null;
            }
            ++field5451;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5465[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 114)
    public class334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        try {
            this.field5459 = arg5;
            this.field5457 = arg6;
            this.field5461 = arg3;
            this.field5455 = arg4;
            this.field5460 = arg0;
            this.field5450 = arg1;
            this.field5464 = arg7;
            this.field5462 = arg2;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field5465[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lha;B)V", line = 132)
    public static final void method2820(class63 arg0, byte arg1) {
        try {
            ++field5453;
            int var2 = 0;
            int var3 = 0;
            if (class316.field5141) {
                var2 = class50.method516(false);
                var3 = class568.method4171(0);
            }
            arg0.method221(var2, var3, class64.field881 - -var2, var3 + 350);
            arg0.method242(var2, var3, class64.field881, 350, 3351159 | class37.field427 << 24, 1);
            class458.method3552(var3, class64.field881 + var2, var3 + 350, var2, -125);
            if (arg1 <= 101) {
                field5449 = null;
            }
            int var4 = 350 / class136.field1918;
            if (class455.field7020 > 0) {
                int var5 = -class136.field1918 + -4 + 346;
                int var6 = var4 * var5 / (class455.field7020 + var4 + -1);
                int var7 = 4;
                if (class455.field7020 > 1) {
                    var7 += (class455.field7020 + -1 + -class582.field8381) * (-var6 + var5) / (class455.field7020 + -1);
                }
                arg0.method242(var2 - -class64.field881 + -16, var3 - -var7, 12, var6, class37.field427 << 24 | 3351159, 2);
                for (int var8 = class582.field8381; class582.field8381 - -var4 > var8 && ~class455.field7020 < ~var8; ++var8) {
                    String[] var9 = class444.method3476('\b', 11206, class585.field8479[var8]);
                    int var10 = (class64.field881 + -8 + -16) / var9.length;
                    for (int var11 = 0; var11 < var9.length; ++var11) {
                        int var12 = var10 * var11 + 8;
                        arg0.method221(var2 + var12, var3, var2 + var10 + var12 + -8, var3 + 350);
                        class213.field3367.method679(0, var2 - -var12, -16777216, -1, class553.method4094(var9[var11], 111), -class404.field6402 + -2 + -class64.field877.field583 + var3 + 350 - (-class582.field8381 + var8) * class136.field1918);
                    }
                }
            }
            class355.field5718.method674(field5465[11], -1, var3 + -20 - -350, -16777216, class64.field881 + var2 - 25, 10475);
            arg0.method221(var2, var3, var2 - -class64.field881, var3 + 350);
            arg0.method658(class64.field881, 27174, var2, var3 + 350 + -class404.field6402, -1);
            class461.field7108.method679(0, var2 - -10, -16777216, -1, field5465[9] + class553.method4094(class54.field683, 121), -client.field5163.field583 + -1 + var3 + 350);
            if (class198.field3143) {
                int var13 = -1;
                if (~(class431.field6776 % 30) < -16) {
                    var13 = 16777215;
                }
                arg0.method662(var13, (byte) 93, 12, client.field5163.method498(field5465[9] + class553.method4094(class54.field683, 123).substring(0, class635.field9120), -1) + var2 - -10, -client.field5163.field583 + 350 + var3 + -11);
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field5465[10] + (arg0 != null ? field5465[0] : field5465[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2821(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2822(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 8;
                    break;
                case 1:
                    var10005 = 109;
                    break;
                case 2:
                    var10005 = 80;
                    break;
                case 3:
                    var10005 = 45;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
