import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class188 extends class377 {

    @OriginalMember(owner = "client!cfa", name = "z", descriptor = "I")
    private int field2833 = -1;

    @OriginalMember(owner = "client!cfa", name = "C", descriptor = "I")
    private int field2836 = -1;

    @OriginalMember(owner = "client!cfa", name = "x", descriptor = "I")
    public int field2831;

    @OriginalMember(owner = "client!cfa", name = "G", descriptor = "I")
    public int field2839;

    @OriginalMember(owner = "client!cfa", name = "D", descriptor = "I")
    public int field2837;

    @OriginalMember(owner = "client!cfa", name = "A", descriptor = "[I")
    public static int[] field2834 = new int[14];

    @OriginalMember(owner = "client!cfa", name = "F", descriptor = "Lin;")
    public static class380 field2838 = new class380(131, -1);

    @OriginalMember(owner = "client!cfa", name = "J", descriptor = "F")
    public static float field2841;

    @OriginalMember(owner = "client!cfa", name = "v", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!cfa", name = "w", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!cfa", name = "y", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!cfa", name = "B", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!cfa", name = "H", descriptor = "I")
    public static int field2840;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cfa", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field2842;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1362(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Luf;B)Luf;", line = 3)
    public static final class519 method1357(class519 arg0, byte arg1) {
        ++field2829;
        if (~arg0.field7223 != 0) {
            return class604.method3506(arg0.field7223, 255);
        } else {
            int var2 = arg0.field7247 >>> 16;
            class577 var3 = new class577(class37.field437);
            for (class27 var4 = (class27) var3.method3397(false); var4 != null; var4 = (class27) var3.method3396(3)) {
                if (var4.field284 == var2) {
                    return class604.method3506((int) var4.field10592, 255);
                }
            }
            return arg1 <= 103 ? null : null;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIBIIIII)V", line = 36)
    public static final void method1358(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2832;
        if (~arg5 <= -1 && arg7 >= 0 && ~arg5 > ~(class192.field2891 + -1) && arg7 < class456.field6225 + -1) {
            if (class514.field7096 == null) {
                return;
            }
            if (~arg6 == -1) {
                class226 var8 = (class226) class133.method1109(arg3, arg5, arg7);
                class226 var9 = (class226) class774.method4266(arg3, arg5, arg7);
                if (var8 != null && ~arg4 != -3) {
                    if (!(var8 instanceof class266)) {
                        class381.method2298(arg5, arg6, arg0, arg3, arg1, arg4, -6968, arg7, var8.method1165((byte) 99));
                    } else {
                        ((class266) var8).field3757.method2146(arg1, arg2 ^ -15545);
                    }
                }
                if (var9 != null) {
                    if (var9 instanceof class266) {
                        ((class266) var9).field3757.method2146(arg1, 15601);
                    } else {
                        class381.method2298(arg5, arg6, arg0, arg3, arg1, arg4, -6968, arg7, var9.method1165((byte) 119));
                    }
                }
            } else if (~arg6 == -2) {
                class226 var10 = (class226) class87.method770(arg3, arg5, arg7);
                if (var10 != null) {
                    if (var10 instanceof class413) {
                        ((class413) var10).field5671.method2146(arg1, 15601);
                    } else {
                        int var11 = var10.method1165((byte) 97);
                        if (~arg4 != -5 && arg4 != 5) {
                            if (arg4 == 6) {
                                class381.method2298(arg5, arg6, arg0 + 4, arg3, arg1, 4, arg2 ^ 7038, arg7, var11);
                            } else if (~arg4 == -8) {
                                class381.method2298(arg5, arg6, (arg0 + 2 & 3) - -4, arg3, arg1, 4, arg2 + -6894, arg7, var11);
                            } else if (~arg4 == -9) {
                                class381.method2298(arg5, arg6, arg0 + 4, arg3, arg1, 4, -6968, arg7, var11);
                                class381.method2298(arg5, arg6, (3 & arg0 + 2) + 4, arg3, arg1, 4, -6968, arg7, var11);
                            }
                        } else {
                            class381.method2298(arg5, arg6, arg0, arg3, arg1, 4, -6968, arg7, var11);
                        }
                    }
                }
            } else if (~arg6 != -3) {
                if (arg6 == 3) {
                    class226 var12 = (class226) class180.method1311(arg3, arg5, arg7);
                    if (var12 != null) {
                        if (var12 instanceof class457) {
                            ((class457) var12).field6240.method2146(arg1, 15601);
                        } else {
                            class381.method2298(arg5, arg6, arg0, arg3, arg1, arg4, arg2 ^ 7038, arg7, var12.method1165((byte) 126));
                        }
                    }
                }
            } else {
                class226 var13 = (class226) class608.method3523(arg3, arg5, arg7, field2842 != null ? field2842 : (field2842 = method1362("vu")));
                if (var13 != null) {
                    if (arg4 == 11) {
                        arg4 = 10;
                    }
                    if (!(var13 instanceof class148)) {
                        class381.method2298(arg5, arg6, arg0, arg3, arg1, arg4, -6968, arg7, var13.method1165((byte) 115));
                    } else {
                        ((class148) var13).field2387.method2146(arg1, 15601);
                    }
                }
            }
        }
        if (arg2 != -74) {
            field2834 = null;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Llea;IIII)V", line = 155)
    public class188(class573 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field2831 = arg4;
        this.field2839 = arg3;
        this.field2837 = arg2;
        super.field5288.method3384(this, (byte) 104);
        OpenGL.glTexImage3Dub(super.field5298, 0, super.field5289, this.field2837, this.field2839, this.field2831, 0, class137.method1128(super.field5289, 75), 5121, (byte[]) null, 0);
        this.method2266(80, true);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)V", line = 171)
    public final void method1359(int arg0) {
        ++field2830;
        OpenGL.glFramebufferTexture3DEXT(this.field2836, this.field2833, super.field5298, 0, 0, 0);
        if (arg0 != 3314) {
            field2841 = 0.65605056F;
        }
        this.field2836 = -1;
        this.field2833 = -1;
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Llea;IIII[BI)V", line = 211)
    public class188(class573 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field2831 = arg4;
        this.field2839 = arg3;
        this.field2837 = arg2;
        super.field5288.method3384(this, (byte) 61);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field5298, 0, super.field5289, this.field2837, this.field2839, this.field2831, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2266(37, true);
    }

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "(I)V", line = 193)
    public static void method1360(int arg0) {
        field2838 = null;
        field2834 = null;
        if (arg0 != 3317) {
            field2841 = 0.99757135F;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIIIIII)V", line = 227)
    public final void method1361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2835;
        super.field5288.method3384(this, (byte) 123);
        OpenGL.glCopyTexSubImage3D(super.field5298, arg2, arg4, arg7, arg1, arg3, arg6, arg0, arg5);
        OpenGL.glFlush();
    }
}
