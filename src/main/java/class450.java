import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class450 extends class606 {

    @OriginalMember(owner = "client!jea", name = "u", descriptor = "Lic;")
    private class698 field6381;

    @OriginalMember(owner = "client!jea", name = "p", descriptor = "Lrd;")
    private class336 field6376;

    @OriginalMember(owner = "client!jea", name = "o", descriptor = "Z")
    private boolean field6375;

    @OriginalMember(owner = "client!jea", name = "q", descriptor = "[[I")
    public static int[][] field6377 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!jea", name = "s", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!jea", name = "t", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!jea", name = "v", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!jea", name = "w", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!jea", name = "x", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!jea", name = "y", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!jea", name = "z", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!jea", name = "r", descriptor = "Z")
    private boolean field6378;

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lfha;Lfp;Lic;)V")
    public class450(class378 arg0, class323 arg1, class698 arg2) {
        super(arg0);
        this.field6381 = arg2;
        if (arg1 != null && arg0.field5416 && arg0.field5407) {
            class649 var4 = class400.method2500(arg1.method2102("gl", "environment_mapped_water_v", 0), 35633, arg0, 1625554944);
            class649 var5 = class400.method2500(arg1.method2102("gl", "environment_mapped_water_f", 0), 35632, arg0, 1625554944);
            this.field6376 = class720.method4044(-127, arg0, new class649[] { var4, var5 });
            this.field6375 = this.field6376 != null && this.field6381.method3924(false);
        } else {
            this.field6375 = false;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lma;II)V")
    public final void method523(class12 arg0, int arg1, int arg2) {
        if (!this.field6378) {
            super.field8525.method1663(arg0, arg2 + -5);
            super.field8525.method1628((byte) 14, arg1);
        }
        if (arg2 == 3) {
            ++field6382;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ZI)V")
    public final void method517(boolean arg0, int arg1) {
        ++field6380;
        class168 var3 = super.field8525.method1590(65);
        if (arg1 < -64) {
            if (this.field6375 && var3 != null) {
                super.field8525.method1648(1, (byte) 66);
                super.field8525.method1663(var3, -2);
                super.field8525.method1648(0, (byte) 66);
                super.field8525.method1663(this.field6381.field9630, -2);
                long var4 = this.field6376.field4675;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field8525.field3569[0], -super.field8525.field3569[1], -super.field8525.field3569[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field8525.field3617, super.field8525.field3604, super.field8525.field3624, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field8525.field3569[1]));
                this.field6378 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(III)V")
    public final void method516(int arg0, int arg1, int arg2) {
        ++field6383;
        if (this.field6378) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float) (1 << (7 & arg2 >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) ((arg0 & 233190) >> 16) / 8.0F;
            long var8 = this.field6376.field4675;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field8525.field3567 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg1 < 91) {
            this.method517(true, 35);
        }
    }

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "(I)V")
    public static void method2693(int arg0) {
        if (arg0 != 5) {
            field6384 = 37;
        }
        field6377 = null;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)V")
    public final void method521(byte arg0) {
        if (this.field6378) {
            super.field8525.method1648(1, (byte) 66);
            super.field8525.method1663((class12) null, -2);
            super.field8525.method1648(0, (byte) 66);
            super.field8525.method1663((class12) null, -2);
            OpenGL.glUseProgramObjectARB(0L);
            this.field6378 = false;
        }
        ++field6385;
        int var2 = 10 / ((arg0 - -26) / 56);
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IZ)V")
    public final void method518(int arg0, boolean arg1) {
        if (arg0 != 5486) {
            this.method518(102, true);
        }
        ++field6379;
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)Z")
    public final boolean method525(int arg0) {
        if (arg0 <= 19) {
            this.method523((class12) null, 20, 2);
        }
        ++field6386;
        return this.field6375;
    }
}
