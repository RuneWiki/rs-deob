import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class279 extends class429 {

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "Lnc;")
    private class227 field4029;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "Lnw;")
    private class695 field4020;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "Z")
    private boolean field4023;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field4027 = 4;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "[B")
    public static byte[] field4025 = new byte[2048];

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "Z")
    private boolean field4028;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1778(boolean arg0) {
        if (arg0) {
            field4027 = -116;
        }
        field4025 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)V", line = 14)
    public final void method43(int arg0, boolean arg1) {
        ++field4024;
        if (arg0 != 0) {
            this.field4023 = true;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lfc;Lgga;Lnc;)V", line = 25)
    public class279(class642 arg0, class513 arg1, class227 arg2) {
        super(arg0);
        this.field4029 = arg2;
        if (arg1 != null && arg0.field9133 && arg0.field9142) {
            class679 var4 = class120.method1055(26, 35633, arg0, arg1.method3017(0, "environment_mapped_water_v", "gl"));
            class679 var5 = class120.method1055(-127, 35632, arg0, arg1.method3017(0, "environment_mapped_water_f", "gl"));
            this.field4020 = class211.method1458(arg0, -76, new class679[] { var4, var5 });
            this.field4023 = this.field4020 != null && this.field4029.method1542(-123);
        } else {
            this.field4023 = false;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZZ)V", line = 46)
    public final void method44(boolean arg0, boolean arg1) {
        ++field4026;
        if (!arg1) {
            class540 var3 = super.field5939.method1020(512);
            if (this.field4023 && var3 != null) {
                super.field5939.method959(1, 121);
                super.field5939.method988(1, var3);
                super.field5939.method959(0, -100);
                super.field5939.method988(1, this.field4029.field3300);
                long var4 = this.field4020.field9780;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field5939.field1940[0], -super.field5939.field1940[1], -super.field5939.field1940[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field5939.field1912, super.field5939.field1883, super.field5939.field1882, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field5939.field1940[1]));
                this.field4028 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V", line = 76)
    public final void method47(byte arg0) {
        int var2 = -34 / ((-56 - arg0) / 48);
        ++field4022;
        if (this.field4028) {
            super.field5939.method959(1, 100);
            super.field5939.method988(1, (class408) null);
            super.field5939.method959(0, 109);
            super.field5939.method988(1, (class408) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field4028 = false;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Len;ZI)V", line = 103)
    public final void method45(class408 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field4020 = null;
        }
        if (!this.field4028) {
            super.field5939.method988(1, arg0);
            super.field5939.method949(arg2, (byte) 57);
        }
        ++field4019;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)Z", line = 121)
    public final boolean method48(byte arg0) {
        ++field4021;
        if (arg0 != -128) {
            this.method47((byte) 21);
        }
        return this.field4023;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V", line = 138)
    public final void method46(int arg0, int arg1, int arg2) {
        ++field4030;
        if (this.field4028) {
            int var4 = 1 << (arg2 & 3);
            float var5 = (float) (1 << ((56 & arg2) >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) (arg1 >> 16 & 3) / 8.0F;
            long var8 = this.field4020.field9780;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field5939.field1928 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg0 != 37) {
            this.method46(-28, -40, -84);
        }
    }
}
