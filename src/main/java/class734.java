import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class734 extends class155 {

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "Luw;")
    private class440 field10139;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "Loca;")
    private class278 field10141;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Z")
    private boolean field10138;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field10132;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field10133;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field10134;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field10135;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field10136;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field10137;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field10140;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public static int field10142;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field10143;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public static int field10144;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "Z")
    private boolean field10145;

    static {
        new class780("", 73);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIB)V", line = 5)
    public final void method254(int arg0, int arg1, byte arg2) {
        if (arg2 != -92) {
            this.field10138 = false;
        }
        ++field10143;
        if (this.field10145) {
            int var4 = 1 << (3 & arg0);
            float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) ((arg1 & 207116) >> 16) / 8.0F;
            long var8 = this.field10141.field3843;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field2533.field7757 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)V", line = 35)
    public final void method258(int arg0, boolean arg1) {
        ++field10140;
        if (arg0 == 205) {
            class158 var3 = super.field2533.method3097(0);
            if (this.field10138 && var3 != null) {
                super.field2533.method3114(1, false);
                super.field2533.method3090(var3, (byte) 110);
                super.field2533.method3114(0, false);
                super.field2533.method3090(this.field10139.field5975, (byte) -66);
                long var4 = this.field10141.field3843;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field2533.field7726[0], -super.field2533.field7726[1], -super.field2533.field7726[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field2533.field7700, super.field2533.field7692, super.field2533.field7715, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field2533.field7726[1]) * 928.0F);
                this.field10145 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lbea;IZI)J", line = 68)
    public static final long method4073(class237 arg0, int arg1, boolean arg2, int arg3) {
        ++field10132;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class445 var8 = class414.field5670.method2319(arg0.method1032(false), arg2);
        long var9 = (long) (arg0.method1034(-126) << 14 | arg3 | arg1 << 7 | arg0.method1033(-122) << 20 | 1073741824);
        if (~var8.field6050 == -1) {
            var9 |= var6;
        }
        if (~var8.field6072 == -2) {
            var9 |= var4;
        }
        return var9 | (long) arg0.method1032(arg2) << 32;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Loia;Lgj;Luw;)V", line = 93)
    public class734(class97 arg0, class662 arg1, class440 arg2) {
        super(arg0);
        this.field10139 = arg2;
        if (arg1 != null && arg0.field1589 && arg0.field1593) {
            class283 var4 = class481.method2755(arg1.method3726(-97, "gl", "environment_mapped_water_v"), arg0, 1, 35633);
            class283 var5 = class481.method2755(arg1.method3726(-64, "gl", "environment_mapped_water_f"), arg0, 1, 35632);
            this.field10141 = class125.method1078(new class283[] { var4, var5 }, arg0, 13286);
            this.field10138 = this.field10141 != null && this.field10139.method2561(14864);
        } else {
            this.field10138 = false;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)Z", line = 114)
    public final boolean method250(int arg0) {
        ++field10133;
        int var2 = 77 % ((arg0 - -8) / 41);
        return this.field10138;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)I", line = 125)
    public static final int method4074(byte arg0) {
        ++field10134;
        if (class84.field1157 == null) {
            if (!class611.field8532 && class603.field8440 != null) {
                return class603.field8440.field7238;
            }
            int var1 = class420.field5727.method1326((byte) -81);
            int var2 = class420.field5727.method1319((byte) 126);
            if (class11.field181) {
                if (var1 > class480.field6479 && var1 < class480.field6479 + class326.field4452) {
                    int var3 = -1;
                    for (int var4 = 0; ~class430.field5861 < ~var4; ++var4) {
                        if (!class608.field8486) {
                            int var8 = var4 * 16 + class207.field3113 + 31;
                            if (~var2 < ~(var8 + -13) && ~(var8 + 3) <= ~var2) {
                                var3 = var4;
                            }
                        } else {
                            int var9 = class207.field3113 - -(var4 * 16) + 33;
                            if (var2 > var9 - 13 && ~var2 >= ~(var9 - -3)) {
                                var3 = var4;
                            }
                        }
                    }
                    if (var3 != -1) {
                        int var5 = 0;
                        class127 var6 = new class127(class142.field2405);
                        for (class606 var7 = (class606) var6.method1088(0); var7 != null; var7 = (class606) var6.method1086(34379)) {
                            if (~var3 == ~(var5++)) {
                                return ((class534) var7.field8460.field4189.field7006).field7238;
                            }
                        }
                    }
                } else if (class426.field5815 != null && ~class396.field5471 > ~var1 && var1 < class396.field5471 + class119.field2183) {
                    int var10 = -1;
                    for (int var11 = 0; ~var11 > ~class426.field5815.field8457; ++var11) {
                        if (!class608.field8486) {
                            int var15 = var11 * 16 + 31 + class429.field5856;
                            if (~var2 < ~(var15 + -13) && ~(var15 + 3) <= ~var2) {
                                var10 = var11;
                            }
                        } else {
                            int var16 = class429.field5856 - (-33 - var11 * 16);
                            if (~var2 < ~(var16 + -13) && ~(var16 - -3) <= ~var2) {
                                var10 = var11;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var12 = 0;
                        class127 var13 = new class127(class426.field5815.field8460);
                        for (class534 var14 = (class534) var13.method1088(0); var14 != null; var14 = (class534) var13.method1086(34379)) {
                            if (~var10 == ~(var12++)) {
                                return var14.field7238;
                            }
                        }
                    }
                }
            } else if (~var1 < ~class480.field6479 && class480.field6479 + class326.field4452 > var1) {
                int var17 = -1;
                for (int var18 = 0; class690.field9574 > var18; ++var18) {
                    if (!class608.field8486) {
                        int var22 = (-var18 + class690.field9574 + -1) * 16 + 31 + class207.field3113;
                        if (var2 > var22 + -13 && var22 + 3 >= var2) {
                            var17 = var18;
                        }
                    } else {
                        int var23 = (class690.field9574 - (var18 + 1)) * 16 + class207.field3113 + 33;
                        if (var23 + -13 < var2 && ~var2 >= ~(var23 + 3)) {
                            var17 = var18;
                        }
                    }
                }
                if (var17 != -1) {
                    int var19 = 0;
                    class359 var20 = new class359(class208.field3119);
                    for (class534 var21 = (class534) var20.method2210((byte) 61); var21 != null; var21 = (class534) var20.method2212(-85)) {
                        if (var17 == var19++) {
                            return var21.field7238;
                        }
                    }
                }
            }
        }
        return arg0 < 58 ? -94 : -1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZZ)V", line = 325)
    public final void method257(boolean arg0, boolean arg1) {
        ++field10137;
        if (arg0) {
            this.method250(-105);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lbr;II)V", line = 340)
    public final void method259(class416 arg0, int arg1, int arg2) {
        ++field10144;
        if (!this.field10145) {
            super.field2533.method3090(arg0, (byte) -94);
            super.field2533.method3113(-3334, arg2);
        }
        if (arg1 >= -71) {
            this.field10141 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)V", line = 356)
    public final void method255(int arg0) {
        if (arg0 < -119) {
            if (this.field10145) {
                super.field2533.method3114(1, false);
                super.field2533.method3090((class416) null, (byte) -82);
                super.field2533.method3114(0, false);
                super.field2533.method3090((class416) null, (byte) 126);
                OpenGL.glUseProgramObjectARB(0L);
                this.field10145 = false;
            }
            ++field10136;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLjava/lang/Object;Z)[B", line = 378)
    public static final byte[] method4075(byte arg0, Object arg1, boolean arg2) {
        ++field10142;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return !arg2 ? var3 : class106.method915(var3, 0);
        } else if (arg1 instanceof class531) {
            class531 var4 = (class531) arg1;
            return var4.method1502(127);
        } else if (arg0 < 103) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZIIZI)I", line = 414)
    public static final int method4076(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field10135;
        class539 var5 = class210.method1479(arg3, -114, arg4);
        if (arg1 >= -45) {
            return 33;
        } else if (var5 == null) {
            return 0;
        } else {
            int var6 = 0;
            for (int var7 = 0; ~var5.field7320.length < ~var7; ++var7) {
                if (~var5.field7320[var7] <= -1 && var5.field7320[var7] < class143.field2427.field2961) {
                    class730 var8 = class143.field2427.method1410((byte) 16, var5.field7320[var7]);
                    int var9 = var8.method4061(class117.field2153.method1159((byte) -97, arg2).field6560, (byte) 110, arg2);
                    if (arg0) {
                        var6 += var5.field7323[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        }
    }
}
