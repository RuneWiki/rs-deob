import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class754 extends class232 {

    @OriginalMember(owner = "client!pea", name = "j", descriptor = "Llo;")
    private class785 field10430;

    @OriginalMember(owner = "client!pea", name = "p", descriptor = "Lfja;")
    private class782 field10436;

    @OriginalMember(owner = "client!pea", name = "r", descriptor = "Z")
    private boolean field10438;

    @OriginalMember(owner = "client!pea", name = "k", descriptor = "[F")
    public static float[] field10431 = new float[4];

    @OriginalMember(owner = "client!pea", name = "i", descriptor = "I")
    public static int field10429;

    @OriginalMember(owner = "client!pea", name = "l", descriptor = "I")
    public static int field10432;

    @OriginalMember(owner = "client!pea", name = "n", descriptor = "I")
    public static int field10434;

    @OriginalMember(owner = "client!pea", name = "o", descriptor = "I")
    public static int field10435;

    @OriginalMember(owner = "client!pea", name = "q", descriptor = "I")
    public static int field10437;

    @OriginalMember(owner = "client!pea", name = "s", descriptor = "I")
    public static int field10439;

    @OriginalMember(owner = "client!pea", name = "u", descriptor = "I")
    public static int field10441;

    @OriginalMember(owner = "client!pea", name = "v", descriptor = "I")
    public static int field10442;

    @OriginalMember(owner = "client!pea", name = "m", descriptor = "Leh;")
    public static class378 field10433;

    @OriginalMember(owner = "client!pea", name = "t", descriptor = "Z")
    private boolean field10440;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZI)V")
    public final void method572(boolean arg0, int arg1) {
        ++field10442;
        if (arg1 < 21) {
            this.field10436 = null;
        }
    }

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "(I)I")
    public static final int method4177(int arg0) {
        ++field10441;
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class27.field395.field8334 && !class27.field395.field8345) {
            var1 = true;
            if (class357.field5197.field1506 < 512 && ~class357.field5197.field1506 != -1) {
                var1 = false;
            }
            if (class590.field8347.startsWith("win")) {
                var3 = true;
                var2 = true;
            } else {
                var2 = true;
            }
        }
        if (class261.field3672) {
            var2 = false;
        }
        if (class489.field6924) {
            var1 = false;
        }
        if (class135.field1753) {
            var3 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class179.method1346(-1);
        } else {
            int var4 = -1;
            int var5 = -1;
            if (var1) {
                try {
                    var4 = class332.method2151(2, 1000, -114);
                } catch (Exception var16) {
                }
            }
            int var6 = -67 / ((22 - arg0) / 41);
            int var7 = -1;
            if (var3) {
                try {
                    var7 = class332.method2151(3, 1000, 95);
                    if (~class145.field1852.field9002.method2258((byte) -76) == -4) {
                        class689 var8 = class638.field8979.method483();
                        long var9 = 281474976710655L & var8.field9747;
                        int var11 = var8.field9753;
                        if (var11 != 4318) {
                            if (~var11 == -4099) {
                                var2 &= var9 >= 60129613779L;
                            }
                        } else {
                            var2 &= ~var9 <= -64425238955L;
                        }
                    }
                } catch (Exception var15) {
                }
            }
            if (var2) {
                try {
                    var5 = class332.method2151(1, 1000, 80);
                } catch (Exception var14) {
                }
            }
            if (~var4 == 0 && var5 == -1 && ~var7 == 0) {
                return class179.method1346(-1);
            } else {
                int var12 = (int) ((float) var7 * 1.1F);
                int var13 = (int) ((float) var5 * 1.1F);
                if (var12 < var4 && var13 < var4) {
                    return class144.method992(-3, var4);
                } else {
                    return var13 < var12 ? class90.method636((byte) 119, var12, 3) : class90.method636((byte) 109, var13, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "(I)Z")
    public final boolean method571(int arg0) {
        if (arg0 != -30998) {
            this.field10440 = true;
        }
        ++field10432;
        return this.field10438;
    }

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "(I)V")
    public static void method4178(int arg0) {
        field10431 = null;
        field10433 = null;
        if (arg0 != 1) {
            method4178(-31);
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ILdr;I)V")
    public final void method570(int arg0, class749 arg1, int arg2) {
        ++field10437;
        if (arg0 != 2305) {
            this.field10440 = true;
        }
        if (!this.field10440) {
            super.field3368.method1104(true, arg1);
            super.field3368.method1088((byte) -31, arg2);
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZB)V")
    public final void method568(boolean arg0, byte arg1) {
        ++field10434;
        if (arg1 == -126) {
            class320 var3 = super.field3368.method1046(88);
            if (this.field10438 && var3 != null) {
                super.field3368.method1140((byte) -76, 1);
                super.field3368.method1104(true, var3);
                super.field3368.method1140((byte) -15, 0);
                super.field3368.method1104(true, this.field10430.field10793);
                long var4 = this.field10436.field10765;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field3368.field2172[0], -super.field3368.field2172[1], -super.field3368.field2172[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field3368.field2212, super.field3368.field2144, super.field3368.field2221, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field3368.field2172[1]) * 928.0F + 96.0F);
                this.field10440 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(III)V")
    public final void method569(int arg0, int arg1, int arg2) {
        int var4 = -92 / ((arg0 - 48) / 51);
        if (this.field10440) {
            int var5 = 1 << (arg2 & 3);
            float var6 = (float) (1 << ((arg2 & 56) >> 3)) / 32.0F;
            int var7 = 65535 & arg1;
            float var8 = (float) ((arg1 & 232199) >> 16) / 8.0F;
            long var9 = this.field10436.field10765;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, "time"), (float) (super.field3368.field2209 * var5 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, "scale"), var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, "breakWaterDepth"), (float) var7);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, "breakWaterOffset"), var8);
        }
        ++field10439;
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Log;Lcb;Llo;)V")
    public class754(class673 arg0, class544 arg1, class785 arg2) {
        super(arg0);
        this.field10430 = arg2;
        if (arg1 != null && arg0.field9538 && arg0.field9536) {
            class134 var4 = class331.method2145((byte) -68, arg1.method3126((byte) -112, "gl", "environment_mapped_water_v"), arg0, 35633);
            class134 var5 = class331.method2145((byte) -115, arg1.method3126((byte) -117, "gl", "environment_mapped_water_f"), arg0, 35632);
            this.field10436 = class474.method2800((byte) -73, new class134[] { var4, var5 }, arg0);
            this.field10438 = this.field10436 != null && this.field10430.method4299(true);
        } else {
            this.field10438 = false;
        }
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(B)V")
    public final void method573(byte arg0) {
        ++field10429;
        if (arg0 < 77) {
            field10433 = null;
        }
        if (this.field10440) {
            super.field3368.method1140((byte) -95, 1);
            super.field3368.method1104(true, (class749) null);
            super.field3368.method1140((byte) -64, 0);
            super.field3368.method1104(true, (class749) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field10440 = false;
        }
    }
}
