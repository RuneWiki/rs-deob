import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class781 {

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "B")
    public byte field11405;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "[I")
    public int[] field11403;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "B")
    public byte field11399;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "[I")
    public int[] field11400;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "[I")
    public int[] field11409;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "S")
    public short field11401;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "S")
    public short field11396;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "S")
    public short field11394;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "[S")
    public short[] field11398;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "[S")
    public short[] field11407;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "S")
    public short field11404;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "[S")
    public short[] field11395;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11410 = new String[] { method5613(method5612("\u000fO\u0004DA")), method5613(method5612("\u000fRFk")), method5613(method5612("\u001a\t\u0004)\u0014")), method5613(method5612("\u000fO\u0004CA")), method5613(method5612("\u000fO\u0004;\u0000\u000fN^9A")), method5613(method5612("\u000fO\u0004EA")), method5613(method5612("\u000fO\u0004FA")), method5613(method5612("\u000eWOi\u0003\u0012")) };

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field11393 = 0;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field11397;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field11402;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field11406;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field11408;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)I", line = 3)
    public static final int method5608(int arg0) {
        try {
            if (arg0 == -19025) {
                field11406++;
                return class395.field6272;
            } else {
                return 47;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11410[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)Z", line = 18)
    public static final boolean method5609(int arg0) {
        try {
            field11397++;
            if (arg0 != -6509) {
                field11393 = -119;
            }
            return class516.field7614 != 0;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11410[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;ILtga;I)Luga;", line = 37)
    public static final class218 method5610(String arg0, int arg1, class61 arg2, int arg3) {
        try {
            field11408++;
            return arg3 == 2 ? class360.method2976(true, arg0, field11410[7], arg1, arg2) : null;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11410[6] + (arg0 == null ? field11410[1] : field11410[2]) + ',' + arg1 + ',' + (arg2 == null ? field11410[1] : field11410[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIILmj;)V", line = 48)
    public static final void method5611(int arg0, int arg1, int arg2, class683 arg3) {
        try {
            if (arg3.field9889 == 0) {
                arg3.field9806 = arg3.field9814;
            } else if (arg3.field9889 == 1) {
                arg3.field9806 = (arg1 - arg3.field9777) / 2 + arg3.field9814;
            } else if (arg3.field9889 == 2) {
                arg3.field9806 = arg1 - arg3.field9777 - arg3.field9814;
            } else if (arg3.field9889 == 3) {
                arg3.field9806 = arg3.field9814 * arg1 >> 14;
            } else if (arg3.field9889 == 4) {
                arg3.field9806 = (arg3.field9814 * arg1 >> 14) + (arg1 - arg3.field9777) / 2;
            } else {
                arg3.field9806 = arg1 - arg3.field9777 - (arg3.field9814 * arg1 >> 14);
            }
            field11402++;
            if (arg3.field9820 == 0) {
                arg3.field9883 = arg3.field9796;
            } else if (arg3.field9820 == 1) {
                arg3.field9883 = (arg0 - arg3.field9797) / 2 + arg3.field9796;
            } else if (arg3.field9820 == 2) {
                arg3.field9883 = arg0 - arg3.field9796 - arg3.field9797;
            } else if (arg3.field9820 == 3) {
                arg3.field9883 = arg3.field9796 * arg0 >> 14;
            } else if (arg3.field9820 == 4) {
                arg3.field9883 = (arg3.field9796 * arg0 >> 14) + (arg0 - arg3.field9797) / 2;
            } else {
                arg3.field9883 = arg0 - (arg3.field9796 * arg0 >> 14) - arg3.field9797;
            }
            if (arg2 == 2 && class531.field7804 && client.method2695(arg3).field6926 != 0 || arg3.field9782 == 0) {
                if (arg3.field9883 < 0) {
                    arg3.field9883 = 0;
                } else if (arg0 < (arg3.field9883 + arg3.field9797)) {
                    arg3.field9883 = arg0 - arg3.field9797;
                }
                if (arg3.field9806 < 0) {
                    arg3.field9806 = 0;
                    return;
                }
                if (arg1 >= (arg3.field9806 + arg3.field9777)) {
                    return;
                }
                arg3.field9806 = arg1 - arg3.field9777;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11410[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field11410[1] : field11410[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 127)
    public class781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        try {
            this.field11405 = (byte) arg0;
            this.field11403 = new int[4];
            this.field11399 = (byte) arg1;
            this.field11400 = new int[4];
            this.field11409 = new int[4];
            this.field11403[0] = arg2;
            this.field11403[2] = arg4;
            this.field11403[1] = arg3;
            this.field11403[3] = arg5;
            this.field11409[3] = arg9;
            this.field11409[1] = arg7;
            this.field11409[0] = arg6;
            this.field11409[2] = arg8;
            this.field11400[3] = arg13;
            this.field11400[0] = arg10;
            this.field11401 = (short) (arg2 >> class165.field2688);
            this.field11400[1] = arg11;
            this.field11400[2] = arg12;
            this.field11396 = (short) (arg4 >> class165.field2688);
            this.field11394 = (short) (arg10 >> class165.field2688);
            this.field11398 = new short[4];
            this.field11407 = new short[4];
            this.field11404 = (short) (arg12 >> class165.field2688);
            this.field11395 = new short[4];
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field11410[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5612(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x69);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5613(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 97;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 42;
                    break;
                case 3:
                    var10005 = 7;
                    break;
                default:
                    var10005 = 105;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
