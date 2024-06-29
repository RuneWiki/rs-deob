import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class764 extends class459 {

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "Lqja;")
    public class326 field11205;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field11212 = new String[] { method5517(method5516("z9\u0010\u0006Mw3J\u0004\f")), method5517(method5516("w/RV")), method5517(method5516("bt\u0010\u0014Y")), method5517(method5516("z9\u0010{\f")), method5517(method5516("z9\u0010y\f")), method5517(method5516("z9\u0010\u007f\f")), method5517(method5516("z9\u0010x\f")) };

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "Lvn;")
    public static class330 field11204 = new class330(56, 16);

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "Llt;")
    public static class706 field11208 = new class706(11, 7);

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public static int field11210 = -1;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field11202;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
    public static int field11203;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field11206;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field11207;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public static int field11211;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "[Lpha;")
    public static class172[] field11209;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)V", line = 3)
    public static final void method5511(int arg0, int arg1) {
        try {
            field11203++;
            if (class504.method3798(127, arg1)) {
                if (arg0 < 5) {
                    field11211 = -42;
                }
                class206.method1864((byte) -121, class309.field5028[arg1], -1);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11212[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)V", line = 21)
    public static final void method5512(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class192.field3020 != null) {
            class192.field3020[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class148.field2073 != null) {
            class148.field2073[arg0][arg1] = (short) arg3;
        }
        if (class54.field691 != null) {
            class54.field691[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 34)
    public static void method5513(int arg0) {
        try {
            field11204 = null;
            if (arg0 != -29053) {
                method5514(-9, -55, -43, null, 71, null, 3, null, -21, 96, null, -115, 75);
            }
            field11208 = null;
            field11209 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11212[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III[FI[II[III[FII)V", line = 47)
    public static final void method5514(int arg0, int arg1, int arg2, float[] arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9, float[] arg10, int arg11, int arg12) {
        try {
            field11206++;
            int var13 = arg2 * arg6 + arg4;
            int var14 = 28 % ((-arg12 - 23) / 43);
            int var15 = arg1 * arg11 + arg0;
            int var16 = arg2 - arg9;
            int var17 = arg1 - arg9;
            if (arg5 == null) {
                for (int var18 = 0; var18 < arg8; var18++) {
                    int var19 = var13 + arg9;
                    while (var13 < var19) {
                        arg3[var15++] = arg10[var13++];
                    }
                    var15 += var17;
                    var13 += var16;
                }
            } else if (arg10 == null) {
                for (int var22 = 0; var22 < arg8; var22++) {
                    int var23 = arg9 + var13;
                    while (var23 > var13) {
                        arg7[var15++] = arg5[var13++];
                    }
                    var13 += var16;
                    var15 += var17;
                }
            } else {
                for (int var20 = 0; var20 < arg8; var20++) {
                    int var21 = arg9 + var13;
                    while (var21 > var13) {
                        arg7[var15] = arg5[var13];
                        arg3[var15++] = arg10[var13++];
                    }
                    var13 += var16;
                    var15 += var17;
                }
            }
        } catch (RuntimeException var25) {
            throw class590.method4333(var25, field11212[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field11212[1] : field11212[2]) + ',' + arg4 + ',' + (arg5 == null ? field11212[1] : field11212[2]) + ',' + arg6 + ',' + (arg7 == null ? field11212[1] : field11212[2]) + ',' + arg8 + ',' + arg9 + ',' + (arg10 == null ? field11212[1] : field11212[2]) + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lqja;)V", line = 128)
    public class764(class326 arg0) {
        try {
            this.field11205 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11212[0] + (arg0 == null ? field11212[1] : field11212[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)I", line = 136)
    public static final int method5515(int arg0, int arg1) {
        try {
            if (arg0 != 16) {
                method5514(-127, -107, -61, null, -35, null, 60, null, -23, -49, null, 8, 87);
            }
            field11202++;
            return arg1 >>> 8;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11212[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5516(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5517(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 25;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 62;
                    break;
                case 3:
                    var10005 = 58;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
