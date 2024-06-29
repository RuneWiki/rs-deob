import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class197 extends class499 {

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "Ljga;")
    private class135 field2746;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "Lhia;")
    private class595 field2747;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "Z")
    private boolean field2742;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "[I")
    public static int[] field2741 = new int[8];

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    public static int field2744 = 1407;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "Luw;")
    public static class208 field2734 = new class208(94, 6);

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "Z")
    private boolean field2737;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILsfa;I)V")
    public final void method206(int arg0, class132 arg1, int arg2) {
        if (!this.field2737) {
            super.field6405.method3756(arg2 ^ 26927, arg1);
            super.field6405.method3740(arg0, 38);
        }
        if (arg2 == 26917) {
            ++field2738;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(Z)V")
    public static void method1357(boolean arg0) {
        if (!arg0) {
            method1358((class733) null, 48);
        }
        field2734 = null;
        field2741 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZ)V")
    public final void method201(int arg0, boolean arg1) {
        ++field2739;
        if (arg0 == 91) {
            class445 var3 = super.field6405.method3728(false);
            if (this.field2742 && var3 != null) {
                super.field6405.method3712(-14720, 1);
                super.field6405.method3756(10, var3);
                super.field6405.method3712(-14720, 0);
                super.field6405.method3756(10, this.field2746.field1790);
                long var4 = this.field2747.field7559;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field6405.field9203[0], -super.field6405.field9203[1], -super.field6405.field9203[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field6405.field9179, super.field6405.field9188, super.field6405.field9213, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field6405.field9203[1]));
                this.field2737 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lck;I)V")
    public static final void method1358(class733 arg0, int arg1) {
        ++field2743;
        if (class525.field6680 == null) {
            class84 var2 = new class84();
            byte[] var3 = var2.method530(16, 128, 23483, 128);
            class525.field6680 = class287.method1743(99999999, false, var3);
        }
        if (arg1 > -53) {
            method1358((class733) null, -60);
        }
        if (class362.field4411 == null) {
            class547 var4 = new class547();
            byte[] var5 = var4.method2960(128, -108, 16, 128);
            class362.field4411 = class287.method1743(99999999, false, var5);
        }
        class34 var6 = arg0.field9808;
        if (var6.method195((byte) 86) && class110.field1479 == null) {
            byte[] var7 = class325.method1883(16, 16.0F, -18369, 0.5F, 8, 0.6F, 4.0F, 128, new class565(419684), 128, 4.0F);
            class110.field1479 = class287.method1743(99999999, false, var7);
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
    public final void method205(int arg0) {
        if (arg0 != 0) {
            this.method206(0, (class132) null, -121);
        }
        ++field2736;
        if (this.field2737) {
            super.field6405.method3712(-14720, 1);
            super.field6405.method3756(10, (class132) null);
            super.field6405.method3712(-14720, 0);
            super.field6405.method3756(10, (class132) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field2737 = false;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZZ)V")
    public final void method202(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method205(-2);
        }
        ++field2735;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Ljc;Lwm;Ljga;)V")
    public class197(class179 arg0, class30 arg1, class135 arg2) {
        super(arg0);
        this.field2746 = arg2;
        if (arg1 != null && arg0.field2456 && arg0.field2453) {
            class578 var4 = class533.method2912(35633, -128, arg0, arg1.method142(-1, "gl", "environment_mapped_water_v"));
            class578 var5 = class533.method2912(35632, -127, arg0, arg1.method142(-1, "gl", "environment_mapped_water_f"));
            this.field2747 = class157.method1004(new class578[] { var4, var5 }, arg0, false);
            this.field2742 = this.field2747 != null && this.field2746.method784(104);
        } else {
            this.field2742 = false;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)Z")
    public final boolean method200(boolean arg0) {
        ++field2745;
        return !arg0 ? true : this.field2742;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BII)V")
    public final void method204(byte arg0, int arg1, int arg2) {
        if (arg0 < 11) {
            this.method204((byte) -56, 59, 23);
        }
        if (this.field2737) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float) (1 << ((arg2 & 58) >> 3)) / 32.0F;
            int var6 = 65535 & arg1;
            float var7 = (float) (3 & arg1 >> 16) / 8.0F;
            long var8 = this.field2747.field7559;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field6405.field9192 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field2740;
    }
}
