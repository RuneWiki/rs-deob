import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class39 extends class719 {

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "Lgaa;")
    private class314 field410;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "Ljd;")
    private class243 field407;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "Z")
    private boolean field403;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "Lkw;")
    public static class263 field406 = new class263("game3", 2);

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "Z")
    private boolean field400;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)Z")
    public final boolean method218(byte arg0) {
        if (arg0 < 16) {
            this.field400 = false;
        }
        ++field413;
        return this.field403;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
    public final void method219(int arg0, int arg1, int arg2) {
        if (this.field400) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float) (1 << (7 & arg2 >> 3)) / 32.0F;
            int var6 = arg0 & 65535;
            float var7 = (float) (3 & arg0 >> 16) / 8.0F;
            long var8 = this.field407.field3191;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field9776.field9602 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field408;
        if (arg1 != 0) {
            method226(97);
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lsha;Luq;Lgaa;)V")
    public class39(class757 arg0, class172 arg1, class314 arg2) {
        super(arg0);
        this.field410 = arg2;
        if (arg1 != null && arg0.field10345 && arg0.field10338) {
            class33 var4 = class117.method844(arg1.method1189("environment_mapped_water_v", 0, "gl"), arg0, (byte) -95, 35633);
            class33 var5 = class117.method844(arg1.method1189("environment_mapped_water_f", 0, "gl"), arg0, (byte) -94, 35632);
            this.field407 = class561.method3201(new class33[] { var4, var5 }, arg0, 1);
            this.field403 = this.field407 != null && this.field410.method2012(false);
        } else {
            this.field403 = false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V")
    public final void method220(int arg0) {
        if (this.field400) {
            super.field9776.method3886(124, 1);
            super.field9776.method3882(0, (class352) null);
            super.field9776.method3886(107, 0);
            super.field9776.method3882(arg0 + -23363, (class352) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field400 = false;
        }
        ++field412;
        if (arg0 != 23363) {
            this.method225(true, false);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLb;I)V")
    public final void method221(boolean arg0, class352 arg1, int arg2) {
        ++field405;
        if (arg0) {
            if (!this.field400) {
                super.field9776.method3882(0, arg1);
                super.field9776.method3871(0, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)V")
    public final void method222(int arg0, boolean arg1) {
        if (arg0 >= -126) {
            this.method220(92);
        }
        ++field404;
        class165 var3 = super.field9776.method3865(0);
        if (this.field403 && var3 != null) {
            super.field9776.method3886(103, 1);
            super.field9776.method3882(0, var3);
            super.field9776.method3886(91, 0);
            super.field9776.method3882(0, this.field410.field4427);
            long var4 = this.field407.field3191;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field9776.field9558[0], -super.field9776.field9558[1], -super.field9776.field9558[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field9776.field9540, super.field9776.field9581, super.field9776.field9532, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field9776.field9558[1]) * 928.0F + 96.0F);
            this.field400 = true;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(FBFF)F")
    public static final float method223(float arg0, byte arg1, float arg2, float arg3) {
        ++field411;
        if (arg1 != -52) {
            method224(-110L, -60);
        }
        return (-arg0 + arg3) * arg2 + arg0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(JI)V")
    public static final void method224(long arg0, int arg1) {
        ++field409;
        int var3 = class318.field4529 + class625.field8475.field2802;
        if (arg1 < 90) {
            field406 = null;
        }
        int var4 = class90.field1280 + class625.field8475.field2810;
        if (class439.field6328 - var3 < -2000 || class439.field6328 - var3 > 2000 || ~(-var4 + class400.field5722) > 1999 || ~(-var4 + class400.field5722) < -2001) {
            class400.field5722 = var4;
            class439.field6328 = var3;
        }
        if (class439.field6328 != var3) {
            int var5 = -class439.field6328 + var3;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (~var5 < -1) {
                if (~var6 != -1) {
                    if (var6 > var5) {
                        var6 = var5;
                    }
                } else {
                    var6 = 1;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class439.field6328 += var6;
        }
        if (~class400.field5722 != ~var4) {
            int var7 = -class400.field5722 + var4;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (~var8 == -1) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (~var8 != -1) {
                if (var7 < var8) {
                    var8 = var7;
                }
            } else {
                var8 = 1;
            }
            class400.field5722 += var8;
        }
        class294.field4169 += (float) arg0 * class49.field495 / 6.0F;
        class514.field7144 += (float) arg0 * class495.field6971 / 6.0F;
        class454.method2696(4);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZ)V")
    public final void method225(boolean arg0, boolean arg1) {
        ++field401;
        if (!arg0) {
            this.field403 = false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)V")
    public static void method226(int arg0) {
        field406 = null;
        int var1 = -78 % ((arg0 - -37) / 42);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method227(String arg0, int arg1) {
        ++field402;
        if (arg0 == null) {
            return -1;
        } else {
            if (arg1 != 1) {
                method224(-119L, -28);
            }
            for (int var2 = 0; var2 < class525.field7289; ++var2) {
                if (arg0.equalsIgnoreCase(class316.field4458[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }
}
