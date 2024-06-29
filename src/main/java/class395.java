import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class395 extends class252 {

    @OriginalMember(owner = "client!ss", name = "w", descriptor = "Luk;")
    private class234 field5863;

    @OriginalMember(owner = "client!ss", name = "v", descriptor = "Law;")
    private class68 field5862;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "Z")
    private boolean field5858;

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "Lnea;")
    public static class664 field5860 = new class664(37, 16);

    @OriginalMember(owner = "client!ss", name = "x", descriptor = "Ldg;")
    public static class376 field5864 = new class376(80, -1);

    @OriginalMember(owner = "client!ss", name = "y", descriptor = "[I")
    public static int[] field5865 = new int[8];

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!ss", name = "A", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!ss", name = "B", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!ss", name = "u", descriptor = "Z")
    private boolean field5861;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
    public final void method788(boolean arg0) {
        if (this.field5861) {
            super.field3884.method2351(0, 1);
            super.field3884.method2337(false, (class301) null);
            super.field3884.method2351(0, 0);
            super.field3884.method2337(false, (class301) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5861 = false;
        }
        ++field5866;
        if (!arg0) {
            this.field5861 = false;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)V")
    public final void method796(int arg0, int arg1, int arg2) {
        ++field5855;
        if (arg2 > -105) {
            field5864 = null;
        }
        if (this.field5861) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) ((259339 & arg0) >> 16) / 8.0F;
            long var8 = this.field5862.field1241;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field3884.field5688 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "(I)Z")
    public final boolean method792(int arg0) {
        if (arg0 != 6439) {
            field5864 = null;
        }
        ++field5859;
        return this.field5858;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZI)V")
    public final void method794(boolean arg0, int arg1) {
        if (arg1 != -1) {
            this.method792(-123);
        }
        ++field5856;
        class45 var3 = super.field3884.method2353(1);
        if (this.field5858 && var3 != null) {
            super.field3884.method2351(0, 1);
            super.field3884.method2337(false, var3);
            super.field3884.method2351(arg1 + 1, 0);
            super.field3884.method2337(false, this.field5863.field3629);
            long var4 = this.field5862.field1241;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), super.field3884.field5635[0], -super.field3884.field5635[1], -super.field3884.field5635[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field3884.field5650, super.field3884.field5690, super.field3884.field5717, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field3884.field5635[1]) * 928.0F + 96.0F);
            this.field5861 = true;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lbb;II)V")
    public final void method790(class301 arg0, int arg1, int arg2) {
        ++field5867;
        if (!this.field5861) {
            super.field3884.method2337(false, arg0);
            super.field3884.method2308(-1, arg1);
        }
        if (arg2 != -1) {
            this.method790((class301) null, -118, 9);
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(ZI)V")
    public final void method791(boolean arg0, int arg1) {
        if (arg1 == 1) {
            ++field5857;
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lhp;Lpu;Luk;)V")
    public class395(class296 arg0, class522 arg1, class234 arg2) {
        super(arg0);
        this.field5863 = arg2;
        if (arg1 != null && arg0.field4440 && arg0.field4434) {
            class287 var4 = class594.method3363(false, 35633, arg1.method3009("environment_mapped_water_v", "gl", 0), arg0);
            class287 var5 = class594.method3363(false, 35632, arg1.method3009("environment_mapped_water_f", "gl", 0), arg0);
            this.field5862 = class428.method2564(arg0, new class287[] { var4, var5 }, 16317);
            this.field5858 = this.field5862 != null && this.field5863.method1601((byte) -128);
        } else {
            this.field5858 = false;
        }
    }

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "(I)V")
    public static void method2436(int arg0) {
        if (arg0 > -110) {
            method2436(112);
        }
        field5860 = null;
        field5864 = null;
        field5865 = null;
    }
}
