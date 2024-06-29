import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class532 extends class517 {

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    private int field7806 = -1;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    private int field7804 = -1;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public int field7805;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field7811 = new String[] { method4027(method4026("b MVu")), method4027(method4026("b M)4c-\u0017+u")), method4027(method4026("c1\u000fy")), method4027(method4026("vjM; ")), method4027(method4026("b MSu")), method4027(method4026("b MQu")), method4027(method4026("b MWu")), method4027(method4026("b MTu")) };

    @OriginalMember(owner = "client!od", name = "D", descriptor = "Lbda;")
    public static class531 field7803 = new class531();

    @OriginalMember(owner = "client!od", name = "A", descriptor = "Lwia;")
    public static class790 field7810 = new class790(59, 4);

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 5)
    public final void method705(int arg0) {
        try {
            OpenGL.glFramebufferTexture2DEXT(this.field7804, this.field7806, 3553, 0, 0);
            if (arg0 >= -115) {
                this.method4025(45, -97, -70, (byte) 44, 98);
            }
            ++field7809;
            this.field7804 = -1;
            this.field7806 = -1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7811[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V", line = 18)
    public static final void method4022(boolean arg0) {
        try {
            if (arg0) {
                class385.method3079(15611);
                ++field7807;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7811[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V", line = 30)
    public static void method4023(int arg0) {
        try {
            field7810 = null;
            field7803 = null;
            if (arg0 != 0) {
                field7803 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7811[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lffa;IIZ[[BI)V", line = 45)
    public class532(class197 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        try {
            this.field7805 = arg2;
            super.field7474.method1733(this, 17237);
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field7464, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
            }
            this.method3923(25768, true);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field7811[1] + (arg0 != null ? field7811[3] : field7811[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7811[3] : field7811[2]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lffa;IIZ[[I)V", line = 64)
    public class532(class197 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        try {
            this.field7805 = arg2;
            super.field7474.method1733(this, 17237);
            if (!arg3) {
                for (int var6 = 0; ~var6 > -7; ++var6) {
                    OpenGL.glTexImage2Di(var6 + 34069, 0, super.field7464, arg2, arg2, 0, 32993, super.field7474.field2889, arg4[var6], 0);
                }
            } else {
                for (int var7 = 0; var7 < 6; ++var7) {
                    class451.method3462(32993, super.field7464, arg2, 9, super.field7474.field2889, arg2, var7 + 34069, arg4[var7]);
                }
            }
            this.method3923(25768, true);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field7811[1] + (arg0 != null ? field7811[3] : field7811[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7811[3] : field7811[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lffa;II)V", line = 177)
    public class532(class197 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        try {
            this.field7805 = arg2;
            super.field7474.method1733(this, 17237);
            for (int var4 = 0; ~var4 > -7; ++var4) {
                OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field7464, arg2, arg2, 0, class330.method2790(true, super.field7464), 5121, (byte[]) null, 0);
            }
            this.method3923(25768, true);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7811[1] + (arg0 != null ? field7811[3] : field7811[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V", line = 100)
    public static final void method4024(int arg0) {
        try {
            ++field7808;
            class704.method5137(-6224);
            class180.field2497 = 0;
            class476.field6930 = 0;
            class662.field9567 = null;
            class430.field6332.field2201 = 0;
            class6.field68 = null;
            class515.field7449 = null;
            class70.field750 = null;
            class533.field7812 = 0;
            class94.method798(126);
            class296.method2455((byte) -85);
            for (int var1 = 0; ~var1 > -2049; ++var1) {
                class197.field2685[var1] = null;
            }
            class225.field3446 = null;
            for (int var2 = 0; ~class750.field10912 < ~var2; ++var2) {
                class612 var3 = class753.field10966[var2].field5799;
                if (var3 != null) {
                    var3.field3842 = -1;
                }
            }
            int var4 = 35 / ((16 - arg0) / 37);
            class367.method2974(-2);
            class185.field2559 = 1;
            class238.field3617 = -1;
            class730.field10605 = -1;
            class86.method728(10, (byte) -96);
            for (int var5 = 0; ~var5 > -101; ++var5) {
                class26.field321[var5] = true;
            }
            class122.method1063(-116);
            class785.field11442 = null;
            class778.field11310 = 0L;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field7811[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIBI)V", line = 160)
    public final void method4025(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        try {
            OpenGL.glFramebufferTexture2DEXT(arg1, arg4, arg0, super.field7463, arg2);
            ++field7802;
            this.field7806 = arg4;
            this.field7804 = arg1;
            if (arg3 != -6) {
                this.method705(61);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field7811[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!od", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4026(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 93);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!od", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4027(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 13;
                    break;
                case 1:
                    var10005 = 68;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 93;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
