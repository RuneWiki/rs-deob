import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class349 extends class469 {

    @OriginalMember(owner = "client!nu", name = "y", descriptor = "I")
    private int field5064 = -1;

    @OriginalMember(owner = "client!nu", name = "w", descriptor = "I")
    private int field5059 = -1;

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
    public int field5063;

    @OriginalMember(owner = "client!nu", name = "B", descriptor = "I")
    public int field5058;

    @OriginalMember(owner = "client!nu", name = "t", descriptor = "I")
    public int field5056;

    @OriginalMember(owner = "client!nu", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field5066 = new String[] { method2791(method2790("78'\u0002\u00057$}\u0000D")), method2791(method2790("78eR")), method2791(method2790("\"c'\u0010\u0011")), method2791(method2790("78'tD")), method2791(method2790("78'\u007fD")), method2791(method2790("78'uD")), method2791(method2790("78'rD")), method2791(method2790("78'sD")) };

    @OriginalMember(owner = "client!nu", name = "x", descriptor = "I")
    public static int field5061 = 0;

    @OriginalMember(owner = "client!nu", name = "s", descriptor = "F")
    public static float field5057 = 0.0F;

    @OriginalMember(owner = "client!nu", name = "u", descriptor = "I")
    public static int field5065 = 0;

    @OriginalMember(owner = "client!nu", name = "r", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!nu", name = "C", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!nu", name = "v", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!nu", name = "A", descriptor = "Lha;")
    public static class18 field5060;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
    public final void method992(int arg0) {
        try {
            OpenGL.glFramebufferTexture3DEXT(this.field5059, this.field5064, super.field6861, 0, 0, 0);
            ++field5055;
            this.field5059 = arg0;
            this.field5064 = -1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5066[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)V")
    public static void method2786(int arg0) {
        try {
            field5060 = null;
            if (arg0 != -4) {
                method2787(79, 20, 16);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5066[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)Z")
    public static final boolean method2787(int arg0, int arg1, int arg2) {
        try {
            if (arg1 != -28272) {
                method2786(-9);
            }
            ++field5053;
            return ~(540800 & arg0) != -1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5066[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIILvo;)V")
    public static final void method2788(int arg0, int arg1, int arg2, class782 arg3) {
        try {
            ++field5054;
            if (arg1 != -20537) {
                method2787(83, 89, -74);
            }
            if (~arg3.field11268 == -1) {
                arg3.field11218 = arg3.field11264;
            } else if (arg3.field11268 == 1) {
                arg3.field11218 = (-arg3.field11244 + arg0) / 2 - -arg3.field11264;
            } else if (arg3.field11268 != 2) {
                if (~arg3.field11268 == -4) {
                    arg3.field11218 = arg3.field11264 * arg0 >> 14;
                } else if (~arg3.field11268 != -5) {
                    arg3.field11218 = -arg3.field11244 + arg0 - (arg3.field11264 * arg0 >> 14);
                } else {
                    arg3.field11218 = (arg3.field11264 * arg0 >> 14) + (-arg3.field11244 + arg0) / 2;
                }
            } else {
                arg3.field11218 = -arg3.field11264 + arg0 - arg3.field11244;
            }
            if (arg3.field11188 == 0) {
                arg3.field11288 = arg3.field11251;
            } else if (~arg3.field11188 == -2) {
                arg3.field11288 = (-arg3.field11295 + arg2) / 2 + arg3.field11251;
            } else if (~arg3.field11188 == -3) {
                arg3.field11288 = -arg3.field11295 + arg2 + -arg3.field11251;
            } else if (~arg3.field11188 != -4) {
                if (arg3.field11188 == 4) {
                    arg3.field11288 = (arg3.field11251 * arg2 >> 14) + (arg2 - arg3.field11295) / 2;
                } else {
                    arg3.field11288 = arg2 - (arg3.field11295 - -(arg3.field11251 * arg2 >> 14));
                }
            } else {
                arg3.field11288 = arg3.field11251 * arg2 >> 14;
            }
            if (class556.field8095) {
                if (~client.method4957(arg3).field1739 != -1 || arg3.field11291 == 0) {
                    if (~arg3.field11218 <= -1) {
                        if (arg3.field11244 + arg3.field11218 > arg0) {
                            arg3.field11218 = arg0 - arg3.field11244;
                        }
                    } else {
                        arg3.field11218 = 0;
                    }
                    if (arg3.field11288 < 0) {
                        arg3.field11288 = 0;
                        return;
                    }
                    if (arg3.field11295 + arg3.field11288 <= arg2) {
                        return;
                    }
                    arg3.field11288 = -arg3.field11295 + arg2;
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5066[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5066[2] : field5066[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lml;IIII)V")
    public class349(class194 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        try {
            this.field5063 = arg3;
            this.field5058 = arg2;
            this.field5056 = arg4;
            super.field6859.method1618((byte) 35, this);
            OpenGL.glTexImage3Dub(super.field6861, 0, super.field6870, this.field5058, this.field5063, this.field5056, 0, class393.method3078(5, super.field6870), 5121, (byte[]) null, 0);
            this.method3600(119, true);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field5066[0] + (arg0 != null ? field5066[2] : field5066[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lml;IIII[BI)V")
    public class349(class194 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        try {
            this.field5063 = arg3;
            this.field5056 = arg4;
            this.field5058 = arg2;
            super.field6859.method1618((byte) 31, this);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glTexImage3Dub(super.field6861, 0, super.field6870, this.field5058, this.field5063, this.field5056, 0, arg6, 5121, arg5, 0);
            OpenGL.glPixelStorei(3317, 4);
            this.method3600(121, true);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field5066[0] + (arg0 != null ? field5066[2] : field5066[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field5066[2] : field5066[1]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIBIIII)V")
    public final void method2789(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            super.field6859.method1618((byte) 110, this);
            ++field5062;
            if (arg3 != -17) {
                field5060 = null;
            }
            OpenGL.glCopyTexSubImage3D(super.field6861, 0, arg1, arg7, arg2, arg6, arg0, arg4, arg5);
            OpenGL.glFlush();
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field5066[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2790(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 108);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2791(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 89;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 9;
                    break;
                case 3:
                    var10005 = 62;
                    break;
                default:
                    var10005 = 108;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
