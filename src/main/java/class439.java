import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class439 extends class546 {

    @OriginalMember(owner = "client!oga", name = "n", descriptor = "Ltj;")
    private class181 field6685;

    @OriginalMember(owner = "client!oga", name = "p", descriptor = "Lmd;")
    private class504 field6687;

    @OriginalMember(owner = "client!oga", name = "z", descriptor = "Z")
    private boolean field6697;

    @OriginalMember(owner = "client!oga", name = "t", descriptor = "Z")
    public static boolean field6691 = false;

    @OriginalMember(owner = "client!oga", name = "y", descriptor = "[I")
    public static int[] field6696 = new int[4096];

    @OriginalMember(owner = "client!oga", name = "r", descriptor = "F")
    public static float field6689;

    @OriginalMember(owner = "client!oga", name = "v", descriptor = "F")
    public static float field6693;

    @OriginalMember(owner = "client!oga", name = "o", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!oga", name = "q", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!oga", name = "s", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!oga", name = "u", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!oga", name = "w", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!oga", name = "A", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!oga", name = "B", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!oga", name = "x", descriptor = "Z")
    private boolean field6695;

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field6696[var0] = class136.method1179((byte) -128, var0);
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)Z", line = 6)
    public final boolean method787(byte arg0) {
        ++field6688;
        return arg0 != -109 ? true : this.field6697;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IZ)V", line = 17)
    public final void method793(int arg0, boolean arg1) {
        if (arg0 < -39) {
            ++field6694;
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(III)V", line = 31)
    public final void method785(int arg0, int arg1, int arg2) {
        ++field6698;
        if (this.field6695) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) (arg2 >> 16 & 3) / 8.0F;
            long var8 = this.field6687.field7374;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field7937.field5327 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg0 != 8) {
            this.method783(2);
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(ZI)V", line = 64)
    public final void method788(boolean arg0, int arg1) {
        if (arg1 == 0) {
            ++field6690;
            class270 var3 = super.field7937.method2249(arg1 + -118);
            if (this.field6697 && var3 != null) {
                super.field7937.method2244(1, arg1 + -121);
                super.field7937.method2271(var3, 5180);
                super.field7937.method2244(0, arg1 + -93);
                super.field7937.method2271(this.field6685.field3039, arg1 ^ 5180);
                long var4 = this.field6687.field7374;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), super.field7937.field5423[0], -super.field7937.field5423[1], -super.field7937.field5423[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field7937.field5326, super.field7937.field5383, super.field7937.field5351, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field7937.field5423[1]) * 928.0F + 96.0F);
                this.field6695 = true;
            }
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IZLwq;)V", line = 95)
    public final void method794(int arg0, boolean arg1, class152 arg2) {
        if (!this.field6695) {
            super.field7937.method2271(arg2, 5180);
            super.field7937.method2280(2, arg0);
        }
        ++field6692;
        if (arg1) {
            this.field6685 = null;
        }
    }

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "(I)V", line = 113)
    public final void method783(int arg0) {
        if (arg0 == 255) {
            if (this.field6695) {
                super.field7937.method2244(1, -65);
                super.field7937.method2271((class152) null, 5180);
                super.field7937.method2244(0, -120);
                super.field7937.method2271((class152) null, 5180);
                OpenGL.glUseProgramObjectARB(0L);
                this.field6695 = false;
            }
            ++field6686;
        }
    }

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "(I)V", line = 137)
    public static void method2779(int arg0) {
        field6696 = null;
        if (arg0 != 2) {
            field6696 = null;
        }
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lbea;Lri;Ltj;)V", line = 148)
    public class439(class205 arg0, class97 arg1, class181 arg2) {
        super(arg0);
        this.field6685 = arg2;
        if (arg1 != null && arg0.field3436 && arg0.field3440) {
            class379 var4 = class118.method1065(arg1.method923("gl", -25124, "environment_mapped_water_v"), 35633, arg0, (byte) -90);
            class379 var5 = class118.method1065(arg1.method923("gl", -25124, "environment_mapped_water_f"), 35632, arg0, (byte) -127);
            this.field6687 = class132.method1145(-98, arg0, new class379[] { var4, var5 });
            this.field6697 = this.field6687 != null && this.field6685.method1481((byte) 114);
        } else {
            this.field6697 = false;
        }
    }
}
