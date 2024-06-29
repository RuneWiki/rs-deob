import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class562 extends class741 {

    @OriginalMember(owner = "client!br", name = "k", descriptor = "Loca;")
    private class639 field7904;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "Lpt;")
    private class582 field7910;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "Z")
    private boolean field7906;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "Z")
    public static boolean field7912 = false;

    @OriginalMember(owner = "client!br", name = "u", descriptor = "Ljn;")
    public static class134 field7914 = new class134(53, 2);

    @OriginalMember(owner = "client!br", name = "n", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "I")
    public static int field7908;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    public static int field7909;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "I")
    public static int field7911;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "I")
    public static int field7913;

    @OriginalMember(owner = "client!br", name = "v", descriptor = "I")
    public static int field7915;

    @OriginalMember(owner = "client!br", name = "w", descriptor = "I")
    public static int field7916;

    @OriginalMember(owner = "client!br", name = "x", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!br", name = "y", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!br", name = "z", descriptor = "Ltf;")
    public static class245 field7919;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "Z")
    private boolean field7905;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "(I)V", line = 3)
    public static void method3324(int arg0) {
        field7914 = null;
        field7919 = null;
        if (arg0 < 11) {
            field7919 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Loaa;Lae;Loca;)V", line = 15)
    public class562(class556 arg0, class283 arg1, class639 arg2) {
        super(arg0);
        this.field7904 = arg2;
        if (arg1 != null && arg0.field7807 && arg0.field7810) {
            class544 var4 = class498.method2929((byte) 113, 35633, arg0, arg1.method1861(true, "gl", "environment_mapped_water_v"));
            class544 var5 = class498.method2929((byte) 114, 35632, arg0, arg1.method1861(true, "gl", "environment_mapped_water_f"));
            this.field7910 = class261.method1724(3171, new class544[] { var4, var5 }, arg0);
            this.field7906 = this.field7910 != null && this.field7904.method3675((byte) 91);
        } else {
            this.field7906 = false;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILae;)V", line = 35)
    public static final void method3325(int arg0, class283 arg1) {
        if (arg0 != 2) {
            field7912 = true;
        }
        ++field7916;
        class502.field6860 = arg1;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)V", line = 51)
    public static final void method3326(byte arg0, int arg1) {
        ++field7911;
        if (~class166.field2120 != ~arg1) {
            class741.field10208 = class525.field7224 = class260.field3810[arg1];
            class305.method1988((byte) -27);
            class465.field6476 = new int[4][class741.field10208 >> 3][class525.field7224 >> 3];
            class712.field9919 = new int[class741.field10208][class525.field7224];
            class356.field5138 = new int[class741.field10208][class525.field7224];
            int var2 = 0;
            if (arg0 != -86) {
                field7914 = null;
            }
            while (~var2 > -5) {
                client.field1305[var2] = class545.method3224(class741.field10208, (byte) -79, class525.field7224);
                ++var2;
            }
            class244.field3608 = new byte[4][class741.field10208][class525.field7224];
            class404.method2479(class741.field10208, (byte) -71, 4, class525.field7224);
            class195.method1281(class111.field1332, class525.field7224 >> 3, class741.field10208 >> 3, arg0 + -1227);
            class166.field2120 = arg1;
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(B)Z", line = 82)
    public final boolean method425(byte arg0) {
        ++field7907;
        return arg0 > -37 ? true : this.field7906;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IILml;)V", line = 99)
    public final void method433(int arg0, int arg1, class34 arg2) {
        if (arg0 != -1) {
            this.method430(-21, false);
        }
        if (!this.field7905) {
            super.field10209.method1492(arg2, 2);
            super.field10209.method1509(4, arg1);
        }
        ++field7908;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BZ)V", line = 117)
    public final void method429(byte arg0, boolean arg1) {
        ++field7918;
        class596 var3 = super.field10209.method1487(0);
        if (this.field7906 && var3 != null) {
            super.field10209.method1473(1, (byte) 33);
            super.field10209.method1492(var3, 2);
            super.field10209.method1473(0, (byte) 80);
            super.field10209.method1492(this.field7904.field8989, 2);
            long var4 = this.field7910.field8247;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field10209.field3314[0], -super.field10209.field3314[1], -super.field10209.field3314[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field10209.field3305, super.field10209.field3323, super.field10209.field3375, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field10209.field3314[1]) * 928.0F);
            this.field7905 = true;
        }
        if (arg0 < 15) {
            this.field7905 = true;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III)V", line = 150)
    public final void method432(int arg0, int arg1, int arg2) {
        if (this.field7905) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << ((arg0 & 58) >> 3)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) (arg1 >> 16 & 3) / 8.0F;
            long var8 = this.field7910.field8247;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field10209.field3373 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field7913;
        int var10 = -88 % ((-18 - arg2) / 51);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)I", line = 178)
    public static final int method3327(int arg0, int arg1) {
        if (arg1 != 255) {
            field7912 = true;
        }
        ++field7917;
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)V", line = 192)
    public final void method430(int arg0, boolean arg1) {
        if (arg0 <= 96) {
            this.method432(-64, -115, 6);
        }
        ++field7909;
    }

    @OriginalMember(owner = "client!br", name = "d", descriptor = "(I)V", line = 206)
    public final void method434(int arg0) {
        int var2 = 103 % ((arg0 - 10) / 44);
        if (this.field7905) {
            super.field10209.method1473(1, (byte) 77);
            super.field10209.method1492((class34) null, 2);
            super.field10209.method1473(0, (byte) 87);
            super.field10209.method1492((class34) null, 2);
            OpenGL.glUseProgramObjectARB(0L);
            this.field7905 = false;
        }
        ++field7915;
    }
}
