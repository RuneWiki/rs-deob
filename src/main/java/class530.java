import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class530 extends class428 {

    @OriginalMember(owner = "client!is", name = "m", descriptor = "Ltia;")
    private class278 field7794;

    @OriginalMember(owner = "client!is", name = "u", descriptor = "Lb;")
    private class352 field7791;

    @OriginalMember(owner = "client!is", name = "o", descriptor = "Lwja;")
    private class279 field7786;

    @OriginalMember(owner = "client!is", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field7799 = new String[] { method3965(method3964("N^C3$")), method3965(method3964("\\\u0003CTq")), method3965(method3964("[\u0005\u0001q")), method3965(method3964("\\\u0003C\\q")), method3965(method3964("\\\u0003C_q")), method3965(method3964("\\\u0003CZq")), method3965(method3964("\\\u0003CUq")), method3965(method3964("\\\u0003CYq")), method3965(method3964("\\\u0003C^q")), method3965(method3964("A\u0002\fs*E\u0011\u001fx7A/\u001a|-P\u0002")), method3965(method3964("\\\u0003C!0[\u0019\u0019#q")), method3965(method3964("R\u001c")), method3965(method3964("\\\u0003CXq")), method3965(method3964("\\\u0003C[q")) };

    @OriginalMember(owner = "client!is", name = "s", descriptor = "Lhl;")
    public static class556 field7790 = new class556(33, 28);

    @OriginalMember(owner = "client!is", name = "t", descriptor = "[I")
    public static int[] field7796 = new int[32];

    @OriginalMember(owner = "client!is", name = "n", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!is", name = "x", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!is", name = "q", descriptor = "I")
    public static int field7788;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!is", name = "v", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!is", name = "z", descriptor = "I")
    public static int field7793;

    @OriginalMember(owner = "client!is", name = "y", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!is", name = "r", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!is", name = "w", descriptor = "Lnp;")
    public static class518 field7797;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
    public final void method1219(int arg0, int arg1, int arg2) {
        try {
            ++field7788;
            if (this.field7791.field5689) {
                float var4 = (float) (super.field6741.field4214 % 4000) / 4000.0F;
                super.field6741.method2233((byte) -76, this.field7791.field5687);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
            } else {
                int var5 = super.field6741.field4214 % 4000 * 16 / 4000;
                super.field6741.method2233((byte) -90, this.field7791.field5681[var5]);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
            }
            if (arg1 != 100) {
                this.method1222((class399) null, (byte) 90, 85);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7799[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "f", descriptor = "(I)Z")
    public final boolean method1226(int arg0) {
        try {
            ++field7795;
            if (arg0 > -111) {
                this.field7786 = null;
            }
            return this.field7786 != null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7799[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIIIIIZ)V")
    public static final void method3961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        try {
            ++field7792;
            if (arg9) {
                field7796 = null;
            }
            if (class546.field8030 <= arg7 && class779.field11374 >= arg7 && ~arg3 <= ~class546.field8030 && ~class779.field11374 <= ~arg3 && ~arg5 <= ~class546.field8030 && arg5 <= class779.field11374 && class546.field8030 <= arg1 && ~arg1 >= ~class779.field11374 && ~arg6 <= ~class310.field5088 && class478.field7264 >= arg6 && ~arg4 <= ~class310.field5088 && class478.field7264 >= arg4 && ~class310.field5088 >= ~arg2 && ~arg2 >= ~class478.field7264 && ~arg0 <= ~class310.field5088 && ~arg0 >= ~class478.field7264) {
                class440.method3450(arg3, arg2, (byte) 70, arg8, arg4, arg1, arg0, arg7, arg5, arg6);
            } else {
                class297.method2560(arg3, arg7, arg8, arg4, arg5, arg0, arg6, arg2, 14091, arg1);
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field7799[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BLjava/lang/String;Lwq;)I")
    public static final int method3962(byte arg0, String arg1, class176 arg2) {
        try {
            ++field7787;
            int var3 = arg2.field2799;
            byte[] var4 = client.method2707(0, arg1);
            arg2.method1673((byte) -70, var4.length);
            if (arg0 < 119) {
                method3962((byte) -69, (String) null, (class176) null);
            }
            arg2.field2799 += class784.field11460.method2941(var4, (byte) 88, 0, arg2.field2799, var4.length, arg2.field2805);
            return arg2.field2799 - var3;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7799[1] + arg0 + ',' + (arg1 != null ? field7799[0] : field7799[2]) + ',' + (arg2 != null ? field7799[0] : field7799[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "h", descriptor = "(I)V")
    public static void method3963(int arg0) {
        try {
            if (arg0 != 23540) {
                method3962((byte) 89, (String) null, (class176) null);
            }
            field7797 = null;
            field7796 = null;
            field7790 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7799[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ZI)V")
    public final void method1225(boolean arg0, int arg1) {
        try {
            if (arg1 != 29145) {
                method3962((byte) 32, (String) null, (class176) null);
            }
            OpenGL.glBindProgramARB(34336, this.field7786.field4561);
            ++field7789;
            OpenGL.glEnable(34336);
            super.field6741.method2262((byte) -106, class612.field8798, 0);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7799[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Ltia;Lgda;Lb;)V")
    public class530(class278 arg0, class58 arg1, class352 arg2) {
        super(arg0);
        try {
            this.field7794 = arg0;
            this.field7791 = arg2;
            if (arg1 != null && this.field7791.method2924(20) && this.field7794.field4554) {
                this.field7786 = class376.method3093(arg1.method591(true, field7799[9], field7799[11]), this.field7794, 34336, (byte) -110);
            } else {
                this.field7786 = null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7799[10] + (arg0 != null ? field7799[0] : field7799[2]) + ',' + (arg1 != null ? field7799[0] : field7799[2]) + ',' + (arg2 != null ? field7799[0] : field7799[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IZ)V")
    public final void method1221(int arg0, boolean arg1) {
        try {
            if (arg0 != 6056) {
                this.method1219(-85, -67, 68);
            }
            super.field6741.method2223(class440.field6863, class434.field6809, (byte) 104);
            ++field7785;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7799[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lln;BI)V")
    public final void method1222(class399 arg0, byte arg1, int arg2) {
        try {
            ++field7798;
            if (arg1 < 7) {
                field7797 = null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7799[13] + (arg0 != null ? field7799[0] : field7799[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)V")
    public final void method1224(boolean arg0) {
        try {
            super.field6741.method2262((byte) 67, class339.field5532, 0);
            ++field7793;
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            if (!arg0) {
                this.field7791 = null;
            }
            OpenGL.glDisable(34336);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7799[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3964(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 89);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!is", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3965(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 53;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 109;
                    break;
                case 3:
                    var10005 = 29;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
