import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class174 extends class681 {

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "Lst;")
    private class398 field2528;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Lgda;")
    private class50 field2519;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "Z")
    private boolean field2523;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public static int field2526 = 0;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "Z")
    private boolean field2531;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "[I")
    public static int[] field2527;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "[Lok;")
    public static class230[] field2525;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIB)V")
    public final void method742(int arg0, int arg1, byte arg2) {
        ++field2532;
        if (this.field2531) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << ((arg1 & 57) >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float) ((229134 & arg0) >> 16) / 8.0F;
            long var8 = this.field2519.field592;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field9721.field5307 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        int var10 = -75 / ((arg2 - -38) / 35);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(CIB)I")
    public static final int method1225(char arg0, int arg1, byte arg2) {
        if (arg2 > -42) {
            method1225((char) 65502, -98, (byte) -19);
        }
        ++field2530;
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var4 = Character.toLowerCase(arg0);
            var3 = (var4 << 4) - -1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "(I)V")
    public static void method1226(int arg0) {
        if (arg0 != -9081) {
            field2525 = null;
        }
        field2525 = null;
        field2527 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)Z")
    public final boolean method751(boolean arg0) {
        ++field2522;
        if (!arg0) {
            this.field2528 = null;
        }
        return this.field2523;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(DI)V")
    public static final void method1227(double arg0, int arg1) {
        if (arg1 != 30890) {
            field2526 = 19;
        }
        if (class501.field6869 != arg0) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg0));
                class40.field471[var3] = ~var4 >= -256 ? var4 : 255;
            }
            class501.field6869 = arg0;
        }
        ++field2520;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILrga;I)V")
    public final void method744(int arg0, class218 arg1, int arg2) {
        if (arg2 == -3) {
            if (!this.field2531) {
                super.field9721.method2241(arg1, (byte) 44);
                super.field9721.method2246(arg0, arg2 ^ -26769);
            }
            ++field2521;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Ltba;Lsea;Lst;)V")
    public class174(class147 arg0, class648 arg1, class398 arg2) {
        super(arg0);
        this.field2528 = arg2;
        if (arg1 != null && arg0.field2179 && arg0.field2174) {
            class318 var4 = class408.method2382(35633, arg1.method3642(111, "environment_mapped_water_v", "gl"), 12889, arg0);
            class318 var5 = class408.method2382(35632, arg1.method3642(85, "environment_mapped_water_f", "gl"), 12889, arg0);
            this.field2519 = class578.method3300(new class318[] { var4, var5 }, arg0, false);
            this.field2523 = this.field2519 != null && this.field2528.method2330((byte) 0);
        } else {
            this.field2523 = false;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(ZI)V")
    public final void method741(boolean arg0, int arg1) {
        ++field2518;
        class388 var3 = super.field9721.method2197((byte) -122);
        if (this.field2523 && var3 != null) {
            super.field9721.method2201((byte) 117, 1);
            super.field9721.method2241(var3, (byte) 44);
            super.field9721.method2201((byte) -67, 0);
            super.field9721.method2241(this.field2528.field5592, (byte) 44);
            long var4 = this.field2519.field592;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), super.field9721.field5349[0], -super.field9721.field5349[1], -super.field9721.field5349[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field9721.field5332, super.field9721.field5358, super.field9721.field5324, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field9721.field5349[1]));
            this.field2531 = true;
        }
        if (arg1 != 3) {
            field2525 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V")
    public final void method740(int arg0) {
        if (arg0 != -3) {
            this.field2523 = true;
        }
        ++field2524;
        if (this.field2531) {
            super.field9721.method2201((byte) -82, 1);
            super.field9721.method2241((class218) null, (byte) 44);
            super.field9721.method2201((byte) -21, 0);
            super.field9721.method2241((class218) null, (byte) 44);
            OpenGL.glUseProgramObjectARB(0L);
            this.field2531 = false;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V")
    public final void method739(boolean arg0, int arg1) {
        if (arg1 == 7) {
            ++field2529;
        }
    }
}
