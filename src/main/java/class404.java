import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class404 extends class369 {

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "Ltt;")
    private class341 field5405;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "Luj;")
    private class626 field5413;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Z")
    private boolean field5408;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "[I")
    public static int[] field5403 = new int[3];

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field5407 = 0;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "Z")
    private boolean field5410;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)Z", line = 5)
    public static final boolean method2268(int arg0, int arg1, int arg2) {
        if (arg0 >= -37) {
            method2269(-8);
        }
        ++field5406;
        return (arg2 & 65536) != 0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)V", line = 20)
    public final void method10(boolean arg0, int arg1) {
        if (arg1 != -14330) {
            this.field5413 = null;
        }
        ++field5412;
        class219 var3 = super.field5047.method2031(-126);
        if (this.field5408 && var3 != null) {
            super.field5047.method2015(1, arg1 ^ 14328);
            super.field5047.method1997(arg1 + 14456, var3);
            super.field5047.method2015(0, -2);
            super.field5047.method1997(126, this.field5405.field4313);
            long var4 = this.field5413.field8842;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), super.field5047.field4563[0], -super.field5047.field4563[1], -super.field5047.field4563[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field5047.field4589, super.field5047.field4526, super.field5047.field4572, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field5047.field4563[1]) * 928.0F + 96.0F);
            this.field5410 = true;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V", line = 57)
    public final void method3(byte arg0) {
        if (this.field5410) {
            super.field5047.method2015(1, -2);
            super.field5047.method1997(126, (class686) null);
            super.field5047.method2015(0, -2);
            super.field5047.method1997(126, (class686) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5410 = false;
        }
        ++field5415;
        int var2 = -37 % ((arg0 - 54) / 47);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BILlc;)V", line = 82)
    public final void method9(byte arg0, int arg1, class686 arg2) {
        if (arg0 == -94) {
            ++field5404;
            if (!this.field5410) {
                super.field5047.method1997(arg0 + 221, arg2);
                super.field5047.method2004(arg1, arg0 ^ -96);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lmr;Ltf;Ltt;)V", line = 98)
    public class404(class221 arg0, class701 arg1, class341 arg2) {
        super(arg0);
        this.field5405 = arg2;
        if (arg1 != null && arg0.field2735 && arg0.field2741) {
            class141 var4 = class43.method221(arg0, 35633, arg1.method3862("environment_mapped_water_v", "gl", (byte) 81), 0);
            class141 var5 = class43.method221(arg0, 35632, arg1.method3862("environment_mapped_water_f", "gl", (byte) 109), 0);
            this.field5413 = class408.method2285(new class141[] { var4, var5 }, 5000, arg0);
            this.field5408 = this.field5413 != null && this.field5405.method1975(true);
        } else {
            this.field5408 = false;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V", line = 118)
    public final void method7(int arg0, int arg1, int arg2) {
        if (arg1 != 8250) {
            this.method9((byte) -71, 87, (class686) null);
        }
        ++field5411;
        if (this.field5410) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << ((arg0 & 61) >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) ((arg2 & 245195) >> 16) / 8.0F;
            long var8 = this.field5413.field8842;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field5047.field4585 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V", line = 147)
    public static void method2269(int arg0) {
        if (arg0 == 3) {
            field5403 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)Z", line = 157)
    public final boolean method8(int arg0) {
        ++field5409;
        int var2 = 8 / ((arg0 - 37) / 36);
        return this.field5408;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)V", line = 168)
    public final void method5(int arg0, boolean arg1) {
        ++field5414;
        if (arg0 != 382) {
            this.field5405 = null;
        }
    }
}
