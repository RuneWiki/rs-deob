import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class198 extends class618 implements class125 {

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field3147 = new String[] { method1818(method1817("\bkIL^")), method1818(method1817("\u00055I \u000b")), method1818(method1817("\u0010n\u000bb")), method1818(method1817("\bkIO^")), method1818(method1817("\bkI2\u001f\u0010r\u00130^")), method1818(method1817("\bkIM^")), method1818(method1817("\bkIJ^")) };

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "Lwh;")
    public static class155 field3140 = new class155(9, 2);

    @OriginalMember(owner = "client!vp", name = "y", descriptor = "Lhl;")
    public static class556 field3144 = new class556(36, 7);

    @OriginalMember(owner = "client!vp", name = "A", descriptor = "I")
    public static int field3145 = 0;

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "[Ljv;")
    public static class85[] field3146 = null;

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!vp", name = "C", descriptor = "Z")
    public static boolean field3143;

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Ltia;IZ[[I)V", line = 3)
    public class198(class278 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class313.field5120, class544.field8004, arg1 * arg1 * 6, arg2);
        try {
            super.field8938.method2233((byte) -80, this);
            if (!arg2) {
                for (int var5 = 0; var5 < 6; ++var5) {
                    OpenGL.glTexImage2Di(var5 + 34069, 0, this.method4512((byte) 83), arg1, arg1, 0, class284.method2418(super.field8936, 6410), super.field8938.field4549, arg3[var5], 0);
                }
            } else {
                for (int var6 = 0; var6 < 6; ++var6) {
                    this.method4520(arg1, arg3[var6], arg1, (byte) -23, var6 + 34069);
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3147[4] + (arg0 != null ? field3147[1] : field3147[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3147[1] : field3147[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lhu;IZLhu;B)I", line = 38)
    public static final int method1813(class139 arg0, int arg1, boolean arg2, class139 arg3, byte arg4) {
        try {
            ++field3142;
            if (arg1 == 1) {
                int var5 = arg0.field5434;
                int var6 = arg3.field5434;
                if (!arg2) {
                    if (~var6 == 0) {
                        var6 = 2001;
                    }
                    if (var5 == -1) {
                        var5 = 2001;
                    }
                }
                return var5 - var6;
            } else if (~arg1 == -3) {
                return class620.method4530(0, class795.field11624, arg3.method1290((byte) -101).field2882, arg0.method1290((byte) -53).field2882);
            } else if (arg1 == 3) {
                if (arg0.field1945.equals("-")) {
                    if (arg3.field1945.equals("-")) {
                        return 0;
                    } else {
                        return arg2 ? -1 : 1;
                    }
                } else if (arg3.field1945.equals("-")) {
                    return !arg2 ? -1 : 1;
                } else {
                    return class620.method4530(0, class795.field11624, arg3.field1945, arg0.field1945);
                }
            } else if (~arg1 == -5) {
                if (arg0.method2806((byte) 115)) {
                    return arg3.method2806((byte) 105) ? 0 : 1;
                } else {
                    return !arg3.method2806((byte) 63) ? 0 : -1;
                }
            } else if (~arg1 == -6) {
                if (arg0.method2808((byte) 100)) {
                    return !arg3.method2808((byte) 123) ? 1 : 0;
                } else {
                    return !arg3.method2808((byte) 102) ? 0 : -1;
                }
            } else if (arg1 == 6) {
                if (!arg0.method2807(-1)) {
                    return !arg3.method2807(-1) ? 0 : -1;
                } else {
                    return !arg3.method2807(-1) ? 1 : 0;
                }
            } else if (~arg1 == -8) {
                if (arg0.method2809((byte) 79)) {
                    return arg3.method2809((byte) 117) ? 0 : 1;
                } else {
                    return arg3.method2809((byte) 114) ? -1 : 0;
                }
            } else if (arg4 != 45) {
                return 0;
            } else if (~arg1 == -9) {
                int var7 = arg0.field1950;
                int var8 = arg3.field1950;
                if (!arg2) {
                    if (~var7 == 0) {
                        var7 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                } else {
                    if (~var8 == -1001) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                }
                return var7 - var8;
            } else {
                return -arg3.field1949 + arg0.field1949;
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field3147[5] + (arg0 != null ? field3147[1] : field3147[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3147[1] : field3147[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lka;IIII)Lrga;", line = 136)
    public static final class250 method1814(class499 arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field3139;
            if (arg0 == null) {
                return null;
            } else {
                return arg1 != 34069 ? null : new class250(arg2, arg4, arg3, arg0.method400(), arg0.method417(), arg0.method396(), arg0.method438(), arg0.method434(), arg0.method388(), arg0.method422());
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3147[3] + (arg0 != null ? field3147[1] : field3147[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V", line = 158)
    public static void method1815(int arg0) {
        try {
            field3140 = null;
            if (arg0 != 5121) {
                method1814((class499) null, 2, -23, 82, 34);
            }
            field3144 = null;
            field3146 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3147[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BI[BI)[B", line = 171)
    public static final byte[] method1816(byte arg0, int arg1, byte[] arg2, int arg3) {
        try {
            ++field3141;
            byte[] var4;
            if (arg3 <= 0) {
                var4 = arg2;
            } else {
                var4 = new byte[arg1];
                for (int var5 = 0; ~var5 > ~arg1; ++var5) {
                    var4[var5] = arg2[arg3 + var5];
                }
            }
            class341 var6 = new class341();
            var6.method2869(96);
            var6.method2867((byte) 60, var4, (long) (arg1 * 8));
            byte[] var7 = new byte[64];
            if (arg0 >= -6) {
                return null;
            } else {
                var6.method2868(var7, 0, 1376312589);
                return var7;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field3147[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3147[1] : field3147[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1817(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 118);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1818(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 126;
                    break;
                case 1:
                    var10005 = 27;
                    break;
                case 2:
                    var10005 = 103;
                    break;
                case 3:
                    var10005 = 14;
                    break;
                default:
                    var10005 = 118;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
