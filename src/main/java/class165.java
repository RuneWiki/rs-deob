import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class165 extends class135 {

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "Lob;")
    private class354 field2732;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Lig;")
    private class124 field2720;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "Z")
    private boolean field2726;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "[I")
    public static int[] field2719 = new int[4];

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Z")
    public static boolean field2721 = false;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field2730 = 0;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Z")
    private boolean field2727;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)Z")
    public final boolean method379(int arg0) {
        if (arg0 != -4931) {
            return true;
        } else {
            ++field2723;
            return this.field2726;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
    public static void method1253(byte arg0) {
        if (arg0 < -105) {
            field2719 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lad;Lvo;Lob;)V")
    public class165(class669 arg0, class345 arg1, class354 arg2) {
        super(arg0);
        this.field2732 = arg2;
        if (arg1 != null && arg0.field9525 && arg0.field9533) {
            class446 var4 = class660.method3712(arg1.method2073((byte) 91, "environment_mapped_water_v", "gl"), -31732, 35633, arg0);
            class446 var5 = class660.method3712(arg1.method2073((byte) 68, "environment_mapped_water_f", "gl"), -31732, 35632, arg0);
            this.field2720 = class247.method1586(new class446[] { var4, var5 }, (byte) 78, arg0);
            this.field2726 = this.field2720 != null && this.field2732.method2139(true);
        } else {
            this.field2726 = false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public final void method385(int arg0) {
        if (this.field2727) {
            super.field2179.method2953(1, 102);
            super.field2179.method2924(13528, (class402) null);
            super.field2179.method2953(0, 106);
            super.field2179.method2924(13528, (class402) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field2727 = false;
        }
        ++field2725;
        int var2 = 92 % ((-29 - arg0) / 45);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
    public final void method377(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method377(69, 58, -111);
        }
        if (this.field2727) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << ((59 & arg1) >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) (arg0 >> 16 & 3) / 8.0F;
            long var8 = this.field2720.field2050;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field2179.field7370 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field2722;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZILpn;Lvo;ZI)V")
    public static final void method1254(int arg0, boolean arg1, int arg2, class295 arg3, class345 arg4, boolean arg5, int arg6) {
        class513.method3050(arg0, arg4, arg2, 0, arg6, arg1);
        ++field2724;
        class484.field6903 = arg3;
        if (!arg5) {
            method1255((String) null, (String) null, 28);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Laj;II)V")
    public final void method384(class402 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method385(-98);
        }
        ++field2728;
        if (!this.field2727) {
            super.field2179.method2924(arg1 + 13528, arg0);
            super.field2179.method2956((byte) 47, arg2);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
    public final void method376(boolean arg0, int arg1) {
        if (arg1 != -25475) {
            this.method384((class402) null, 27, -64);
        }
        ++field2718;
        class639 var3 = super.field2179.method2923(112);
        if (this.field2726 && var3 != null) {
            super.field2179.method2953(1, 120);
            super.field2179.method2924(arg1 ^ -22363, var3);
            super.field2179.method2953(0, 107);
            super.field2179.method2924(arg1 ^ -22363, this.field2732.field4956);
            long var4 = this.field2720.field2050;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), super.field2179.field7360[0], -super.field2179.field7360[1], -super.field2179.field7360[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field2179.field7305, super.field2179.field7334, super.field2179.field7319, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field2179.field7360[1]) * 928.0F);
            this.field2727 = true;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method1255(String arg0, String arg1, int arg2) {
        class70.field1107 = -1;
        class133.field2155 = arg2;
        ++field2729;
        class218.method1466(false, arg0, (byte) -74, arg1);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V")
    public final void method375(int arg0, boolean arg1) {
        ++field2731;
        if (arg0 <= 14) {
            this.field2727 = false;
        }
    }
}
