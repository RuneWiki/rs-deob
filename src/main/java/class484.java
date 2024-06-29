import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class484 extends class396 {

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field6993 = new String[] { method3691(method3690("}\tYb")), method3691(method3690("hR\u001b S")), method3691(method3690("`\u0016\u001bH\u0006")), method3691(method3690("`\u0016\u001bJ\u0006")), method3691(method3690("`\u0016\u001bK\u0006")), method3691(method3690("`\u0016\u001bL\u0006")), method3691(method3690("`\u0016\u001bM\u0006")), method3691(method3690("@\u0014TjKa\\VaCc\u0015Yk\u000eu\u001d\\bKwF")), method3691(method3690("`\u0016\u001bO\u0006")), method3691(method3690("`\u0016\u001bI\u0006")) };

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "Lwia;")
    public static class790 field6991 = new class790(23, 2);

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "Lfs;")
    private class581 field6989;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZIBI)V", line = 7)
    public final void method188(boolean arg0, int arg1, byte arg2, int arg3) {
        try {
            int var5 = 19 / ((-64 - arg2) / 40);
            class610.field8913.method527(arg1 + -2, arg3, super.field5922.field5809 - -4, super.field5922.field5810 + 2, ((class265) super.field5922).field4048, 0);
            ++field6986;
            class610.field8913.method527(arg1 + -1, arg3 + 1, super.field5922.field5809 + 2, super.field5922.field5810, 0, 0);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6993[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lla;Lla;Lsr;)V", line = 18)
    public class484(class476 arg0, class476 arg1, class265 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lffa;BILjava/lang/String;)Lwj;", line = 21)
    public static final class414 method3687(class197 arg0, byte arg1, int arg2, String arg3) {
        try {
            ++field6990;
            long var4 = OpenGL.glCreateShaderObjectARB(arg2);
            OpenGL.glShaderSourceARB(var4, arg3);
            OpenGL.glCompileShaderARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35713, class772.field11227, 0);
            if (~class772.field11227[0] == -1) {
                if (~class772.field11227[0] == -1) {
                    System.out.println(field6993[7]);
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class772.field11227, 1);
                if (~class772.field11227[1] < -2) {
                    byte[] var6 = new byte[class772.field11227[1]];
                    OpenGL.glGetInfoLogARB(var4, class772.field11227[1], class772.field11227, 0, var6, 0);
                    System.out.println(new String(var6));
                }
                if (~class772.field11227[0] == -1) {
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            int var7 = 29 / ((13 - arg1) / 55);
            return new class414(arg0, var4, arg2);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field6993[8] + (arg0 != null ? field6993[1] : field6993[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6993[1] : field6993[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V", line = 59)
    public final void method370(byte arg0) {
        try {
            super.method370((byte) -104);
            ++field6985;
            this.field6989 = class670.method4933(-86, super.field5925, ((class265) super.field5922).field4049);
            if (arg0 >= -98) {
                this.method187(true, -52, true, 122);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6993[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILcn;)V", line = 72)
    public static final void method3688(int arg0, int arg1, int arg2, class541 arg3) {
        try {
            if (arg1 != 2) {
                method3687((class197) null, (byte) 54, 38, (String) null);
            }
            if (~arg3.field7971 == -1) {
                arg3.field8013 = arg3.field8056;
            } else if (arg3.field7971 != 1) {
                if (~arg3.field7971 == -3) {
                    arg3.field8013 = -arg3.field8056 + arg2 + -arg3.field8045;
                } else if (arg3.field7971 != 3) {
                    if (arg3.field7971 == 4) {
                        arg3.field8013 = (arg3.field8056 * arg2 >> 14) + (arg2 - arg3.field8045) / 2;
                    } else {
                        arg3.field8013 = arg2 - (arg3.field8045 - -(arg3.field8056 * arg2 >> 14));
                    }
                } else {
                    arg3.field8013 = arg3.field8056 * arg2 >> 14;
                }
            } else {
                arg3.field8013 = (arg2 - arg3.field8045) / 2 + arg3.field8056;
            }
            if (~arg3.field8051 != -1) {
                if (arg3.field8051 == 1) {
                    arg3.field8019 = (-arg3.field8029 + arg0) / 2 + arg3.field8016;
                } else if (~arg3.field8051 == -3) {
                    arg3.field8019 = -arg3.field8016 + arg0 - arg3.field8029;
                } else if (~arg3.field8051 != -4) {
                    if (arg3.field8051 != 4) {
                        arg3.field8019 = -arg3.field8029 + arg0 - (arg3.field8016 * arg0 >> 14);
                    } else {
                        arg3.field8019 = (arg3.field8016 * arg0 >> 14) + (-arg3.field8029 + arg0) / 2;
                    }
                } else {
                    arg3.field8019 = arg3.field8016 * arg0 >> 14;
                }
            } else {
                arg3.field8019 = arg3.field8016;
            }
            ++field6984;
            if (class90.field1028) {
                if (client.method2670(arg3).field6808 != 0 || arg3.field8042 == 0) {
                    if (arg3.field8019 < 0) {
                        arg3.field8019 = 0;
                    } else if (~(arg3.field8019 - -arg3.field8029) < ~arg0) {
                        arg3.field8019 = -arg3.field8029 + arg0;
                    }
                    if (arg3.field8013 < 0) {
                        arg3.field8013 = 0;
                        return;
                    }
                    if (~arg2 <= ~(arg3.field8045 + arg3.field8013)) {
                        return;
                    }
                    arg3.field8013 = -arg3.field8045 + arg2;
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6993[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6993[1] : field6993[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)Z", line = 144)
    public final boolean method369(int arg0) {
        try {
            ++field6988;
            return !super.method369(arg0) ? false : super.field5925.method3618(((class265) super.field5922).field4049, 65);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6993[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V", line = 156)
    public static void method3689(byte arg0) {
        try {
            if (arg0 != 15) {
                field6992 = -111;
            }
            field6991 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6993[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZIZI)V", line = 166)
    public final void method187(boolean arg0, int arg1, boolean arg2, int arg3) {
        try {
            ++field6987;
            int var5 = this.method3130(-1) * super.field5922.field5809 / 10000;
            int[] var6 = new int[4];
            if (!arg0) {
                method3687((class197) null, (byte) -14, -98, (String) null);
            }
            class610.field8913.method543(var6);
            class610.field8913.method489(arg1, arg3 + 2, arg1 + var5, super.field5922.field5810 + arg3);
            this.field6989.method4350(arg1, arg3 + 2, super.field5922.field5809, super.field5922.field5810);
            class610.field8913.method489(var6[0], var6[1], var6[2], var6[3]);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6993[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3690(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 46);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3691(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 19;
                    break;
                case 1:
                    var10005 = 124;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 14;
                    break;
                default:
                    var10005 = 46;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
