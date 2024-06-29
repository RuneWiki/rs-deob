import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class363 extends class573 {

    @OriginalMember(owner = "client!oq", name = "v", descriptor = "Lwda;")
    private class639 field5105;

    @OriginalMember(owner = "client!oq", name = "E", descriptor = "Lkga;")
    private class546 field5114;

    @OriginalMember(owner = "client!oq", name = "y", descriptor = "Z")
    private boolean field5108;

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "Lkaa;")
    public static class47 field5109 = new class47(19, 3);

    @OriginalMember(owner = "client!oq", name = "C", descriptor = "I")
    public static int field5112 = -1;

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!oq", name = "u", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!oq", name = "x", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!oq", name = "A", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!oq", name = "D", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!oq", name = "G", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!oq", name = "F", descriptor = "Lon;")
    public static class340 field5115;

    @OriginalMember(owner = "client!oq", name = "B", descriptor = "Z")
    private boolean field5111;

    @OriginalMember(owner = "client!oq", name = "w", descriptor = "[[I")
    public static int[][] field5106;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(Z)V", line = 7)
    public final void method603(boolean arg0) {
        ++field5103;
        if (this.field5111) {
            super.field7517.method934(1, (byte) -65);
            super.field7517.method823((class67) null, -8423);
            super.field7517.method934(0, (byte) -65);
            super.field7517.method823((class67) null, -8423);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5111 = false;
        }
        if (!arg0) {
            field5106 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z[FI)[F", line = 29)
    public static final float[] method2157(boolean arg0, float[] arg1, int arg2) {
        if (arg0) {
            return null;
        } else {
            ++field5107;
            float[] var3 = new float[arg2];
            class335.method2018(arg1, 0, var3, 0, arg2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Llaa;Lwu;Lwda;)V", line = 44)
    public class363(class122 arg0, class376 arg1, class639 arg2) {
        super(arg0);
        this.field5105 = arg2;
        if (arg1 != null && arg0.field2051 && arg0.field2048) {
            class239 var4 = class511.method2856(77, arg0, arg1.method2204("environment_mapped_water_v", "gl", (byte) 81), 35633);
            class239 var5 = class511.method2856(35, arg0, arg1.method2204("environment_mapped_water_f", "gl", (byte) 123), 35632);
            this.field5114 = class325.method1970((byte) 37, arg0, new class239[] { var4, var5 });
            this.field5108 = this.field5114 != null && this.field5105.method3494(-17546);
        } else {
            this.field5108 = false;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZI)V", line = 65)
    public final void method610(boolean arg0, int arg1) {
        if (arg1 < 109) {
            this.method607((class67) null, -44, (byte) -95);
        }
        ++field5116;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lwc;IB)V", line = 75)
    public final void method607(class67 arg0, int arg1, byte arg2) {
        if (arg2 < 68) {
            this.method611(false, false);
        }
        ++field5113;
        if (!this.field5111) {
            super.field7517.method823(arg0, -8423);
            super.field7517.method887((byte) 125, arg1);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZZ)V", line = 95)
    public final void method611(boolean arg0, boolean arg1) {
        ++field5104;
        class493 var3 = super.field7517.method868(0);
        if (this.field5108 && var3 != null) {
            super.field7517.method934(1, (byte) -65);
            super.field7517.method823(var3, -8423);
            super.field7517.method934(0, (byte) -65);
            super.field7517.method823(this.field5105.field8473, -8423);
            long var4 = this.field5114.field7221;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field7517.field1754[0], -super.field7517.field1754[1], -super.field7517.field1754[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field7517.field1757, super.field7517.field1796, super.field7517.field1774, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field7517.field1754[1]));
            this.field5111 = true;
        }
        if (!arg0) {
            this.method605(41);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)V", line = 126)
    public final void method602(int arg0, int arg1, int arg2) {
        if (this.field5111) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (arg2 >> 16 & 3) / 8.0F;
            long var8 = this.field5114.field7221;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field7517.field1759 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg0 == -26427) {
            ++field5110;
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)Z", line = 163)
    public final boolean method605(int arg0) {
        if (arg0 != 4095) {
            return true;
        } else {
            ++field5102;
            return this.field5108;
        }
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(B)V", line = 174)
    public static void method2158(byte arg0) {
        int var1 = -51 / ((-20 - arg0) / 47);
        field5109 = null;
        field5106 = null;
        field5115 = null;
    }
}
