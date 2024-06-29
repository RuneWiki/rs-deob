import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class330 extends class74 {

    @OriginalMember(owner = "client!pr", name = "G", descriptor = "Lbd;")
    private class190 field4216;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "Ldl;")
    private class115 field4204;

    @OriginalMember(owner = "client!pr", name = "E", descriptor = "Z")
    private boolean field4214;

    @OriginalMember(owner = "client!pr", name = "y", descriptor = "Lwp;")
    public static class453 field4208 = new class453(112, 8);

    @OriginalMember(owner = "client!pr", name = "D", descriptor = "J")
    public static long field4213 = 0L;

    @OriginalMember(owner = "client!pr", name = "H", descriptor = "I")
    public static int field4217 = -1;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!pr", name = "B", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!pr", name = "C", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!pr", name = "F", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!pr", name = "A", descriptor = "Z")
    private boolean field4210;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIB)V")
    public final void method340(int arg0, int arg1, byte arg2) {
        ++field4206;
        if (this.field4210) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << ((62 & arg0) >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) ((arg1 & 227306) >> 16) / 8.0F;
            long var8 = this.field4204.field1486;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field1011.field6279 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg2 != 65) {
            this.field4204 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)I")
    public static final int method1875(int arg0, int arg1) {
        ++field4215;
        if (arg0 > -8) {
            field4217 = 29;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BII)I")
    public static final int method1876(byte arg0, int arg1, int arg2) {
        ++field4211;
        int var3 = arg1 >>> 24;
        int var4 = -var3 + 255;
        int var5 = -10 / ((arg0 - -55) / 48);
        int var6 = ((16711935 & arg1) * var3 & -16711936 | 16711680 & (65280 & arg1) * var3) >>> 8;
        return ((-16711936 & (16711935 & arg2) * var4 | (arg2 & 65280) * var4 & 16711680) >>> 8) - -var6;
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)V")
    public final void method343(int arg0) {
        if (arg0 != -19092) {
            this.field4210 = false;
        }
        ++field4212;
        if (this.field4210) {
            super.field1011.method2589(0, 1);
            super.field1011.method2596((class466) null, 0);
            super.field1011.method2589(0, 0);
            super.field1011.method2596((class466) null, 0);
            OpenGL.glUseProgramObjectARB(0L);
            this.field4210 = false;
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(Z)V")
    public static void method1877(boolean arg0) {
        field4208 = null;
        if (arg0) {
            method1875(-32, 106);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZZ)V")
    public final void method339(boolean arg0, boolean arg1) {
        ++field4209;
        if (!arg0) {
            this.field4210 = false;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZ)V")
    public final void method347(int arg0, boolean arg1) {
        ++field4207;
        class660 var3 = super.field1011.method2581(2);
        if (this.field4214 && var3 != null) {
            super.field1011.method2589(0, 1);
            super.field1011.method2596(var3, 0);
            super.field1011.method2589(0, 0);
            super.field1011.method2596(this.field4216.field2375, 0);
            long var4 = this.field4204.field1486;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), super.field1011.field6332[0], -super.field1011.field6332[1], -super.field1011.field6332[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field1011.field6251, super.field1011.field6295, super.field1011.field6275, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0F * Math.abs(super.field1011.field6332[1]) + 96.0F);
            this.field4210 = true;
        }
        int var6 = -107 / ((52 - arg0) / 36);
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Llm;Lpl;Lbd;)V")
    public class330(class337 arg0, class612 arg1, class190 arg2) {
        super(arg0);
        this.field4216 = arg2;
        if (arg1 != null && arg0.field4378 && arg0.field4369) {
            class80 var4 = class445.method2380(35633, arg1.method3345(123, "gl", "environment_mapped_water_v"), arg0, (byte) 125);
            class80 var5 = class445.method2380(35632, arg1.method3345(106, "gl", "environment_mapped_water_f"), arg0, (byte) 97);
            this.field4204 = class516.method2796(false, new class80[] { var4, var5 }, arg0);
            this.field4214 = this.field4204 != null && this.field4216.method1155(true);
        } else {
            this.field4214 = false;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IILhfa;)V")
    public final void method341(int arg0, int arg1, class466 arg2) {
        ++field4203;
        if (!this.field4210) {
            super.field1011.method2596(arg2, 0);
            super.field1011.method2595(arg0, 0);
        }
        if (arg1 < 47) {
            this.field4210 = true;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)Z")
    public final boolean method346(int arg0) {
        if (arg0 != -16777216) {
            return false;
        } else {
            ++field4205;
            return this.field4214;
        }
    }
}
