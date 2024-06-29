import jaggl.OpenGL;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class189 extends class188 {

    @OriginalMember(owner = "client!dca", name = "m", descriptor = "Llja;")
    private class745 field2515;

    @OriginalMember(owner = "client!dca", name = "l", descriptor = "Los;")
    private class469 field2514;

    @OriginalMember(owner = "client!dca", name = "t", descriptor = "Z")
    private boolean field2522;

    @OriginalMember(owner = "client!dca", name = "j", descriptor = "Loaa;")
    public static class305 field2512 = null;

    @OriginalMember(owner = "client!dca", name = "v", descriptor = "Lor;")
    public static class668 field2524 = null;

    @OriginalMember(owner = "client!dca", name = "i", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!dca", name = "k", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!dca", name = "n", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!dca", name = "o", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!dca", name = "q", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!dca", name = "r", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!dca", name = "s", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!dca", name = "w", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!dca", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2518;

    @OriginalMember(owner = "client!dca", name = "u", descriptor = "Z")
    private boolean field2523;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IBLbm;)V")
    public final void method959(int arg0, byte arg1, class123 arg2) {
        ++field2525;
        if (!this.field2523) {
            super.field2510.method3520(true, arg2);
            super.field2510.method3503((byte) 62, arg0);
        }
        int var4 = -51 / ((arg1 - 60) / 61);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lor;BLor;)V")
    public static final void method1309(class668 arg0, byte arg1, class668 arg2) {
        ++class292.field4267;
        ++field2513;
        class267 var3 = class545.method3099((byte) 101, class269.field3966, class562.field7544);
        var3.field3938.method2354(arg0.field9221, (byte) 109);
        var3.field3938.method2363(29262, arg2.field9283);
        var3.field3938.method2400(arg2.field9221, (byte) 66);
        if (arg1 >= 40) {
            var3.field3938.method2415(false, arg0.field9318);
            var3.field3938.method2382(-25724, arg0.field9283);
            var3.field3938.method2362((byte) -60, arg2.field9318);
            class617.method3392(var3, true);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZ)V")
    public final void method962(int arg0, boolean arg1) {
        ++field2517;
        if (arg0 != 22789) {
            method1309((class668) null, (byte) 72, (class668) null);
        }
    }

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "(I)V")
    public static void method1310(int arg0) {
        field2524 = null;
        field2518 = null;
        if (arg0 != 0) {
            field2518 = null;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)Z")
    public final boolean method956(int arg0) {
        ++field2521;
        return arg0 <= 53 ? true : this.field2522;
    }

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "(B)V")
    public final void method955(byte arg0) {
        if (arg0 <= 54) {
            field2524 = null;
        }
        if (this.field2523) {
            super.field2510.method3470((byte) 1, 1);
            super.field2510.method3520(true, (class123) null);
            super.field2510.method3470((byte) 27, 0);
            super.field2510.method3520(true, (class123) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field2523 = false;
        }
        ++field2520;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Ljava/lang/Object;Lqn;I)V")
    public static final void method1311(Object arg0, class70 arg1, int arg2) {
        ++field2519;
        if (arg1.field996 != null) {
            for (int var3 = 0; var3 < 50 && arg1.field996.peekEvent() != null; ++var3) {
                class438.method2636(true, 1L);
            }
            try {
                if (arg0 != null) {
                    arg1.field996.postEvent(new ActionEvent(arg0, 1001, "dummy"));
                }
                if (arg2 != 28569) {
                    method1310(-103);
                }
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lpa;Laj;Llja;)V")
    public class189(class391 arg0, class333 arg1, class745 arg2) {
        super(arg0);
        this.field2515 = arg2;
        if (arg1 != null && arg0.field5790 && arg0.field5794) {
            class138 var4 = class493.method2861(35633, arg1.method2111("gl", "environment_mapped_water_v", 3), 3431, arg0);
            class138 var5 = class493.method2861(35632, arg1.method2111("gl", "environment_mapped_water_f", 3), 3431, arg0);
            this.field2514 = class192.method1324(false, new class138[] { var4, var5 }, arg0);
            this.field2522 = this.field2514 != null && this.field2515.method4125((byte) -26);
        } else {
            this.field2522 = false;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZI)V")
    public final void method961(boolean arg0, int arg1) {
        if (arg1 != 2) {
            this.field2522 = true;
        }
        ++field2516;
        class149 var3 = super.field2510.method3519(-55);
        if (this.field2522 && var3 != null) {
            super.field2510.method3470((byte) -58, 1);
            super.field2510.method3520(true, var3);
            super.field2510.method3470((byte) -124, 0);
            super.field2510.method3520(true, this.field2515.field10281);
            long var4 = this.field2514.field6502;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field2510.field8700[0], -super.field2510.field8700[1], -super.field2510.field8700[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field2510.field8658, super.field2510.field8740, super.field2510.field8687, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field2510.field8700[1]));
            this.field2523 = true;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIZ)V")
    public final void method958(int arg0, int arg1, boolean arg2) {
        ++field2511;
        if (arg2) {
            if (this.field2523) {
                int var4 = 1 << (3 & arg0);
                float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
                int var6 = arg1 & 65535;
                float var7 = (float) ((241814 & arg1) >> 16) / 8.0F;
                long var8 = this.field2514.field6502;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field2510.field8699 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            }
        }
    }
}
