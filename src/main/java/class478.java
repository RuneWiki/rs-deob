import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class478 extends class512 {

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Lwp;")
    public class191 field6958;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6959 = new String[] { method3662(method3661("t!`5")), method3662(method3661("n0\"emt=xg,")), method3662(method3661("az\"wy")), method3662(method3661("n0\"\u001b,")) };

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Z")
    public static boolean field6955 = false;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lel;")
    public static class573 field6956 = new class573(94, 6);

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 3)
    public static void method3659(int arg0) {
        try {
            field6956 = null;
            if (arg0 != 0) {
                method3660(38, -91, 0, -19, null, null, null, null, null, null, 6, (byte) -55, 74, -22, false, false, -42, 31, true);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6959[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V", line = 20)
    public static final void method3660(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class16.field197 = true;
        class142.field1713 = class606.field8877.method578() > 0;
        class121.field1431 = arg15;
        class247.field3811 = arg1 >> class602.field8828;
        class5.field52 = arg3 >> class602.field8828;
        class595.field8733 = arg1;
        class317.field5029 = arg3;
        class192.field2594 = arg2;
        class265.field4055 = class247.field3811 - class396.field5921;
        if (class265.field4055 < 0) {
            class252.field3905 = -class265.field4055;
            class265.field4055 = 0;
        } else {
            class252.field3905 = 0;
        }
        class550.field8200 = class5.field52 - class396.field5921;
        if (class550.field8200 < 0) {
            class660.field9544 = -class550.field8200;
            class550.field8200 = 0;
        } else {
            class660.field9544 = 0;
        }
        class143.field1716 = class396.field5921 + class247.field3811;
        if (class143.field1716 > class132.field1543) {
            class143.field1716 = class132.field1543;
        }
        class598.field8806 = class5.field52 + class396.field5921;
        if (class598.field8806 > class216.field3296) {
            class598.field8806 = class216.field3296;
        }
        boolean[][] var19 = class91.field1038;
        boolean[][] var20 = class11.field135;
        if (class121.field1431) {
            for (int var21 = 0; var21 < class396.field5921 + class396.field5921 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class396.field5921 + class396.field5921 + 2; var24++) {
                    if (var24 > 1) {
                        class259.field4002[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class247.field3811 + var21 - class396.field5921;
                    int var26 = class5.field52 + var24 - class396.field5921;
                    if (var25 >= 0 && var26 >= 0 && var25 < class132.field1543 && var26 < class216.field3296) {
                        int var27 = var25 << class602.field8828;
                        int var28 = var26 << class602.field8828;
                        int var29 = class184.field2541[class184.field2541.length - 1].method2407(var26, var25, 24) - (0x3E8 << class602.field8828 - 7);
                        int var30 = class195.field2617 == null ? class184.field2541[0].method2407(var26, var25, -116) + class358.field5488 : class195.field2617[0].method2407(var26, var25, 85) + class358.field5488;
                        var23 = arg16 >= 0 ? class606.field8877.method541(var27, var29, var28, var27, var30, var28, arg16) : class606.field8877.method572(var27, var29, var28, var27, var30, var28);
                        class11.field135[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class11.field135[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class259.field4002[var24 - 1] & class259.field4002[var24] & var22 & var23;
                        class91.field1038[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class259.field4002[class396.field5921 + class396.field5921] = var22;
                class259.field4002[class396.field5921 + class396.field5921 + 1] = var23;
            }
            if (arg16 >= 0) {
                class16.field197 = false;
            } else {
                class564.field8371 = arg5;
                class48.field550 = arg6;
                class81.field922 = arg7;
                class233.field3509 = arg8;
                class196.field2632 = arg9;
                class12.method82(arg10, class606.field8877, 113);
            }
        } else {
            if (class27.field342 == null) {
                class27.field342 = new boolean[class132.field1543 + class132.field1543 + 1][class216.field3296 + class132.field1543 + 1];
            }
            for (int var32 = 0; var32 < class27.field342.length; var32++) {
                for (int var42 = 0; var42 < class27.field342[0].length; var42++) {
                    class27.field342[var32][var42] = true;
                }
            }
            class11.field135 = class27.field342;
            class91.field1038 = class27.field342;
            class265.field4055 = 0;
            class550.field8200 = 0;
            class143.field1716 = class132.field1543;
            class598.field8806 = class216.field3296;
            class16.field197 = false;
        }
        class74.method668((byte) -31, class606.field8877);
        if (!class675.field9785.field3271) {
            class614 var33 = class675.field9785.field3269;
            for (class310 var34 = (class310) var33.method4538(false); var34 != null; var34 = (class310) var33.method4543(0)) {
                var34.method4696(109);
                class79.method692(var34, 0);
            }
        }
        if (class142.field1713) {
            for (int var35 = 0; var35 < class559.field8328; var35++) {
                class96.field1076[var35].method4708(arg14, (byte) 80, arg0);
            }
        }
        if (class329.field5187) {
            class595.field8726 = class606.field8877.method548();
            class606.field8877.method543(class501.field7247);
            int var36 = (class501.field7247[2] - class501.field7247[0]) / class574.field8475;
            for (int var37 = 0; var37 < class574.field8475 - 1; var37++) {
                class733.field10653[var37] = (var37 + 1) * var36 + class85.field951[var37];
            }
            for (int var38 = 0; var38 < class108.field1259.length; var38++) {
                class108.field1259[var38].method4796();
            }
        }
        if (class80.field907 != null) {
            if (class329.field5187) {
                class639.method4690(0);
            }
            class106.method931(true);
            class606.field8877.method538(-1, 1583160, 40, 127);
            class231.method1981(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class329.field5187) {
                class128.method1119();
            }
            class606.field8877.method523();
            class106.method931(false);
        }
        class231.method1981(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class329.field5187) {
            for (int var39 = 0; var39 < class501.field7246; var39++) {
                class296.field4542[var39] = class549.field8190[var39];
            }
            class639.method4690(0);
            for (int var40 = 0; var40 < class108.field1259.length; var40++) {
                class108.field1259[var40].method4796();
            }
        }
        if (class329.field5187) {
            class128.method1119();
            for (int var41 = 0; var41 < class501.field7246; var41++) {
                class549.field8190[var41] = class296.field4542[var41];
            }
            if (class630.field9216 == 2) {
                int var10002;
                if (class463.field6745[0] < class463.field6745[1]) {
                    if (class85.field951[0] + class733.field10653[0] > class501.field7247[0]) {
                        var10002 = class85.field951[0]++;
                    }
                } else if (class463.field6745[0] > class463.field6745[1] && class85.field951[0] + class733.field10653[0] < class501.field7247[2]) {
                    var10002 = class85.field951[0]--;
                }
            }
        }
        if (!class121.field1431) {
            class91.field1038 = var19;
            class11.field135 = var20;
        }
        class177.method1552();
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lkd;II[B)V", line = 305)
    public class478(class296 arg0, int arg1, int arg2, byte[] arg3) {
        try {
            this.field6958 = arg0.method2448(false, true, class667.field9691, arg2, arg3, arg1);
            this.field6958.method751(false, 43, false);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6959[1] + (arg0 == null ? field6959[0] : field6959[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field6959[0] : field6959[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lkd;II[I)V", line = 317)
    public class478(class296 arg0, int arg1, int arg2, int[] arg3) {
        try {
            this.field6958 = arg0.method2447(arg3, arg1, arg2, false, 26236);
            this.field6958.method751(false, 35, false);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6959[1] + (arg0 == null ? field6959[0] : field6959[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field6959[0] : field6959[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!td", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3661(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!td", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3662(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 26;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 12;
                    break;
                case 3:
                    var10005 = 89;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
