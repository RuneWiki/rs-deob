import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class489 extends class138 {

    @OriginalMember(owner = "client!jq", name = "A", descriptor = "[I")
    private int[] field7107 = new int[this.field1510];

    @OriginalMember(owner = "client!jq", name = "K", descriptor = "[I")
    public static int[] field7116 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "[F")
    public static float[] field7108 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!jq", name = "H", descriptor = "[I")
    public static int[] field7114 = new int[256];

    @OriginalMember(owner = "client!jq", name = "O", descriptor = "[F")
    public static float[] field7120;

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!jq", name = "y", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!jq", name = "F", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
    private int field7113;

    @OriginalMember(owner = "client!jq", name = "I", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!jq", name = "L", descriptor = "I")
    private int field7117;

    @OriginalMember(owner = "client!jq", name = "M", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!jq", name = "N", descriptor = "Ltf;")
    public static class701 field7119;

    @OriginalMember(owner = "client!jq", name = "C", descriptor = "[B")
    private byte[] field7109;

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if (~(1 & var1) == -2) {
                    var1 = -306674912 ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field7114[var0] = var1;
        }
        field7120 = new float[4];
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Lwd;", line = 5)
    public static final class357 method2835(int arg0, int arg1) {
        ++field7111;
        class357[] var2 = class360.method2116((byte) -88);
        for (int var3 = arg0; ~var3 > ~var2.length; ++var3) {
            if (var2[var3].field4792 == arg1) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V", line = 28)
    public final void method772(int arg0) {
        this.field7113 = 0;
        ++field7115;
        if (arg0 != 30321) {
            field7120 = null;
        }
        this.field7117 = 0;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "([BZZ)Ljava/lang/Object;", line = 40)
    public static final Object method2836(byte[] arg0, boolean arg1, boolean arg2) {
        ++field7106;
        if (!arg2) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else {
            if (~arg0.length < -137 && !class259.field3256) {
                try {
                    class277 var3 = (class277) Class.forName("kd").newInstance();
                    var3.method1617(arg0, -1250804670);
                    return var3;
                } catch (Throwable var4) {
                    class259.field3256 = true;
                }
            }
            return arg1 ? class556.method3152(arg0, (byte) 83) : arg0;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BII)V", line = 72)
    public void method2247(byte arg0, int arg1, int arg2) {
        ++field7104;
        if (arg2 == 24982) {
            this.field7109[this.field7117++] = (byte) (127 + class105.method572(127, arg0 >> 1));
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IILr;III[[[BIIIIII)V", line = 83)
    public static final void method2837(int arg0, int arg1, class564 arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field7110;
        if (~arg12 != -1 && ~arg9 != -1) {
            if (~arg12 == -10) {
                arg4 = 3 & arg4 - -1;
                arg12 = 1;
            }
            if (~arg12 == -11) {
                arg12 = 1;
                arg4 = 3 & arg4 + 3;
            }
            if (~arg12 == -12) {
                arg12 = 8;
                arg4 = 3 & arg4 + 3;
            }
            arg2.method1039(arg11, arg5, arg3, arg10, arg1, arg8, arg6[arg12 + -1][arg4], arg9, arg0);
            if (arg7 != 8) {
                field7116 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIZ)V", line = 118)
    public static final void method2838(int arg0, int arg1, int arg2, boolean arg3) {
        ++field7103;
        class390 var4 = class266.field3308[arg1][arg0];
        class648.method3627(var4 == null ? class662.field9282 : var4, arg3, arg2);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I[BILmr;)Liea;", line = 130)
    public static final class131 method2839(int arg0, byte[] arg1, int arg2, class221 arg3) {
        ++field7112;
        if (arg1 == null) {
            return null;
        } else {
            int var4 = OpenGL.glGenProgramARB();
            if (arg0 != 155) {
                field7116 = null;
            }
            OpenGL.glBindProgramARB(arg2, var4);
            OpenGL.glProgramRawARB(arg2, 34933, arg1);
            OpenGL.glGetIntegerv(34379, class156.field1750, 0);
            if (~class156.field1750[0] != 0) {
                OpenGL.glBindProgramARB(arg2, 0);
                return null;
            } else {
                OpenGL.glBindProgramARB(arg2, 0);
                return new class131(arg3, arg2, var4);
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(IIIIIF)V", line = 160)
    public class489(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < super.field1510; ++var7) {
            this.field7107[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V", line = 177)
    public final void method770(byte arg0) {
        ++field7118;
        this.field7113 = Math.abs(this.field7113);
        if (~this.field7113 <= -4097) {
            this.field7113 = 4095;
        }
        this.method2247((byte) (this.field7113 >> 4), this.field7117++, 24982);
        if (arg0 == -60) {
            this.field7113 = 0;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)V", line = 196)
    public final void method776(int arg0, int arg1, int arg2) {
        this.field7113 += this.field7107[arg2] * arg0 >> 12;
        ++field7102;
        if (arg1 != 0) {
            this.field7117 = -115;
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V", line = 215)
    public static void method2840(int arg0) {
        field7119 = null;
        if (arg0 > 76) {
            field7108 = null;
            field7114 = null;
            field7120 = null;
            field7116 = null;
        }
    }
}
