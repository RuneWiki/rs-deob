import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class678 extends class712 {

    @OriginalMember(owner = "client!jda", name = "x", descriptor = "Lep;")
    private class374 field9413;

    @OriginalMember(owner = "client!jda", name = "z", descriptor = "Ljp;")
    private class471 field9415;

    @OriginalMember(owner = "client!jda", name = "u", descriptor = "Z")
    private boolean field9410;

    @OriginalMember(owner = "client!jda", name = "r", descriptor = "I")
    public static int field9407;

    @OriginalMember(owner = "client!jda", name = "s", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!jda", name = "t", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!jda", name = "v", descriptor = "I")
    public static int field9411;

    @OriginalMember(owner = "client!jda", name = "w", descriptor = "I")
    public static int field9412;

    @OriginalMember(owner = "client!jda", name = "A", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!jda", name = "B", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!jda", name = "y", descriptor = "Z")
    private boolean field9414;

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "(I)I")
    public static final int method3816(int arg0) {
        ++field9408;
        return arg0 != 928 ? -75 : class709.field9896;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)I")
    public static int method3817(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ZB)V")
    public final void method399(boolean arg0, byte arg1) {
        ++field9407;
        class492 var3 = super.field9945.method1436(0);
        if (arg1 < 44) {
            this.method396(true);
        }
        if (this.field9410 && var3 != null) {
            super.field9945.method1431(0, 1);
            super.field9945.method1458(399403340, var3);
            super.field9945.method1431(0, 0);
            super.field9945.method1458(399403340, this.field9413.field5265);
            long var4 = this.field9415.field6536;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field9945.field3355[0], -super.field9945.field3355[1], -super.field9945.field3355[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field9945.field3420, super.field9945.field3413, super.field9945.field3365, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field9945.field3355[1]) * 928.0F + 96.0F);
            this.field9414 = true;
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(Z)V")
    public final void method389(boolean arg0) {
        if (this.field9414) {
            super.field9945.method1431(0, 1);
            super.field9945.method1458(399403340, (class190) null);
            super.field9945.method1431(0, 0);
            super.field9945.method1458(399403340, (class190) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field9414 = false;
        }
        if (arg0) {
            this.field9413 = null;
        }
        ++field9411;
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(III)V")
    public final void method393(int arg0, int arg1, int arg2) {
        ++field9416;
        if (arg2 >= 96) {
            if (this.field9414) {
                int var4 = 1 << (arg1 & 3);
                float var5 = (float) (1 << ((arg1 & 58) >> 3)) / 32.0F;
                int var6 = 65535 & arg0;
                float var7 = (float) (3 & arg0 >> 16) / 8.0F;
                long var8 = this.field9415.field6536;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field9945.field3380 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "(Z)Z")
    public final boolean method396(boolean arg0) {
        if (arg0) {
            this.field9410 = true;
        }
        ++field9412;
        return this.field9410;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IILhba;)V")
    public final void method391(int arg0, int arg1, class190 arg2) {
        if (arg1 == 0) {
            ++field9417;
            if (!this.field9414) {
                super.field9945.method1458(399403340, arg2);
                super.field9945.method1503(arg0, (byte) 100);
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BZ)V")
    public final void method394(byte arg0, boolean arg1) {
        ++field9409;
        if (arg0 <= 39) {
            this.field9415 = null;
        }
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lhj;Luu;Lep;)V")
    public class678(class47 arg0, class237 arg1, class374 arg2) {
        super(arg0);
        this.field9413 = arg2;
        if (arg1 != null && arg0.field721 && arg0.field710) {
            class696 var4 = class181.method1143(35633, arg1.method1582("environment_mapped_water_v", false, "gl"), Integer.MAX_VALUE, arg0);
            class696 var5 = class181.method1143(35632, arg1.method1582("environment_mapped_water_f", false, "gl"), Integer.MAX_VALUE, arg0);
            this.field9415 = class331.method2122(arg0, new class696[] { var4, var5 }, (byte) 120);
            this.field9410 = this.field9415 != null && this.field9413.method2352(true);
        } else {
            this.field9410 = false;
        }
    }
}
