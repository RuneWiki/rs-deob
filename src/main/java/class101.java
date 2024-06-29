import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class101 extends class532 {

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "Lrfa;")
    private class213 field1317;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "Lct;")
    private class157 field1312;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "Z")
    private boolean field1309;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "Z")
    private boolean field1314;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZB)V")
    public final void method702(boolean arg0, byte arg1) {
        ++field1316;
        if (arg1 == -10) {
            class69 var3 = super.field7494.method2676(arg1 + 10);
            if (this.field1309 && var3 != null) {
                super.field7494.method2691(false, 1);
                super.field7494.method2643(arg1 + 8, var3);
                super.field7494.method2691(false, 0);
                super.field7494.method2643(-2, this.field1317.field2510);
                long var4 = this.field1312.field1958;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field7494.field6283[0], -super.field7494.field6283[1], -super.field7494.field6283[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field7494.field6276, super.field7494.field6323, super.field7494.field6281, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field7494.field6283[1]));
                this.field1314 = true;
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IBI)V")
    public final void method700(int arg0, byte arg1, int arg2) {
        if (arg1 != 94) {
            this.field1314 = true;
        }
        ++field1319;
        if (this.field1314) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << ((arg0 & 63) >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) (3 & arg2 >> 16) / 8.0F;
            long var8 = this.field1312.field1958;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field7494.field6229 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lnv;Lbt;Lrfa;)V")
    public class101(class439 arg0, class48 arg1, class213 arg2) {
        super(arg0);
        this.field1317 = arg2;
        if (arg1 != null && arg0.field5895 && arg0.field5889) {
            class158 var4 = class618.method3499(35633, (byte) -119, arg1.method436("gl", -3637, "environment_mapped_water_v"), arg0);
            class158 var5 = class618.method3499(35632, (byte) -119, arg1.method436("gl", -3637, "environment_mapped_water_f"), arg0);
            this.field1312 = class612.method3464(1, new class158[] { var4, var5 }, arg0);
            this.field1309 = this.field1312 != null && this.field1317.method1341(-93);
        } else {
            this.field1309 = false;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V")
    public final void method699(boolean arg0) {
        ++field1310;
        if (this.field1314) {
            super.field7494.method2691(false, 1);
            super.field7494.method2643(-2, (class315) null);
            super.field7494.method2691(false, 0);
            super.field7494.method2643(-2, (class315) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1314 = false;
        }
        if (arg0) {
            this.method701(true, -81, (class315) null);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)Z")
    public static final boolean method848(int arg0, int arg1, int arg2) {
        ++field1320;
        if (arg2 != -1585328959) {
            method849(-6, 107, 6, 39, -71, 113, 78, 118);
        }
        return class17.method208(-6409, arg1, arg0) | (arg1 & 458752) != 0 || class372.method2181(arg1, arg0, 10504);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method849(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1315;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = -arg2 + arg1;
        int var12 = -arg2 + arg6;
        int var13 = arg1 * arg1;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        if (arg4 != 40000) {
            method848(40, 35, -46);
        }
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg6 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = -((var21 + -1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 + var19;
        int var26 = var16 - (var22 + -1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = var28;
        int var36 = (arg6 + -1) * var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var29;
        int[] var39 = class4.field49[arg3];
        class455.method2755(arg0, var39, (byte) 40, -var11 + arg5, arg5 - arg1);
        class455.method2755(arg7, var39, (byte) 45, arg5 + var11, arg5 - var11);
        class455.method2755(arg0, var39, (byte) 121, arg5 - -arg1, arg5 - -var11);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    ++var8;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var40) {
                if (~var25 > -1) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        ++var10;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    ++var10;
                    var33 += var30;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (~var24 > -1) {
                var23 += var31;
                var24 += var35;
                ++var8;
                var31 += var28;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var32 -= var27;
            --var9;
            int var41 = -var9 + arg3;
            int var42 = arg3 + var9;
            int var43 = arg5 + var8;
            int var44 = -var8 + arg5;
            if (!var40) {
                class455.method2755(arg0, class4.field49[var41], (byte) 87, var43, var44);
                class455.method2755(arg0, class4.field49[var42], (byte) 127, var43, var44);
            } else {
                int var45 = arg5 + var10;
                int var46 = -var10 + arg5;
                class455.method2755(arg0, class4.field49[var41], (byte) 125, var46, var44);
                class455.method2755(arg7, class4.field49[var41], (byte) 112, var45, var46);
                class455.method2755(arg0, class4.field49[var41], (byte) 116, var43, var45);
                class455.method2755(arg0, class4.field49[var42], (byte) 21, var46, var44);
                class455.method2755(arg7, class4.field49[var42], (byte) 118, var45, var46);
                class455.method2755(arg0, class4.field49[var42], (byte) 111, var43, var45);
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(B)Z")
    public final boolean method703(byte arg0) {
        if (arg0 <= 126) {
            return true;
        } else {
            ++field1313;
            return this.field1309;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZILgaa;)V")
    public final void method701(boolean arg0, int arg1, class315 arg2) {
        if (!this.field1314) {
            super.field7494.method2643(-2, arg2);
            super.field7494.method2649((byte) 126, arg1);
        }
        if (arg0) {
            ++field1311;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZI)V")
    public final void method707(boolean arg0, int arg1) {
        ++field1318;
        if (arg1 != 30902) {
            this.method703((byte) -53);
        }
    }
}
