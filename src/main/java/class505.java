import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class505 extends class657 {

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "Lur;")
    private class537 field7031;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "Llha;")
    private class625 field7025;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "Z")
    private boolean field7032;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "Lmu;")
    public static class303 field7023 = new class303(37, 7);

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "Lin;")
    public static class91 field7027;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "Z")
    private boolean field7029;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field7034;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)V")
    public final void method730(int arg0, int arg1, int arg2) {
        ++field7028;
        if (this.field7029) {
            int var4 = 1 << (arg1 & 3);
            float var5 = (float) (1 << (7 & arg1 >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (3 & arg2 >> 16) / 8.0F;
            long var8 = this.field7025.field8603;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field9010.field10260 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg0 != 10756) {
            this.field7031 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
    public final void method728(byte arg0) {
        if (arg0 != 87) {
            this.field7032 = true;
        }
        if (this.field7029) {
            super.field9010.method4126(1, -4382);
            super.field9010.method4097((byte) 70, (class357) null);
            super.field9010.method4126(0, -4382);
            super.field9010.method4097((byte) 107, (class357) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field7029 = false;
        }
        ++field7024;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
    public static final String method2968(int arg0, int arg1, int arg2, boolean arg3) {
        ++field7030;
        if (arg1 >= 2 && arg1 <= 36) {
            if (arg3 && ~arg2 <= -1) {
                int var4 = 2;
                int var5 = arg2 / arg1;
                while (var5 != 0) {
                    var5 /= arg1;
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                int var7 = var4 + -1;
                if (arg0 != 8320) {
                    return null;
                } else {
                    while (var7 > 0) {
                        int var8 = arg2;
                        arg2 /= arg1;
                        int var9 = -(arg1 * arg2) + var8;
                        if (var9 < 10) {
                            var6[var7] = (char) (var9 + 48);
                        } else {
                            var6[var7] = (char) (var9 + 87);
                        }
                        --var7;
                    }
                    return new String(var6);
                }
            } else {
                return Integer.toString(arg2, arg1);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)Z")
    public final boolean method731(int arg0) {
        if (arg0 >= -57) {
            this.field7029 = true;
        }
        ++field7022;
        return this.field7032;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILdu;I)V")
    public final void method736(int arg0, class357 arg1, int arg2) {
        if (arg2 != -16776) {
            method2969(-90);
        }
        ++field7036;
        if (!this.field7029) {
            super.field9010.method4097((byte) 102, arg1);
            super.field9010.method4144(true, arg0);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZB)V")
    public final void method734(boolean arg0, byte arg1) {
        ++field7033;
        if (arg1 != -103) {
            field7035 = -84;
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lbga;Lin;Lur;)V")
    public class505(class358 arg0, class91 arg1, class537 arg2) {
        super(arg0);
        this.field7031 = arg2;
        if (arg1 != null && arg0.field5172 && arg0.field5173) {
            class428 var4 = class248.method1694(arg0, arg1.method844("gl", "environment_mapped_water_v", -29832), -108, 35633);
            class428 var5 = class248.method1694(arg0, arg1.method844("gl", "environment_mapped_water_f", -29832), -122, 35632);
            this.field7025 = class60.method644(arg0, new class428[] { var4, var5 }, -2113);
            this.field7032 = this.field7025 != null && this.field7031.method3092((byte) 120);
        } else {
            this.field7032 = false;
        }
    }

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)V")
    public static void method2969(int arg0) {
        field7027 = null;
        field7023 = null;
        field7034 = null;
        if (arg0 != 87) {
            field7035 = 80;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ)V")
    public final void method735(int arg0, boolean arg1) {
        ++field7026;
        if (arg0 != 15192) {
            method2968(58, -50, 40, true);
        }
        class247 var3 = super.field9010.method4086(-16777216);
        if (this.field7032 && var3 != null) {
            super.field9010.method4126(1, arg0 + -19574);
            super.field9010.method4097((byte) -63, var3);
            super.field9010.method4126(0, -4382);
            super.field9010.method4097((byte) -107, this.field7031.field7425);
            long var4 = this.field7025.field8603;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field9010.field10284[0], -super.field9010.field10284[1], -super.field9010.field10284[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field9010.field10294, super.field9010.field10201, super.field9010.field10282, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0F * Math.abs(super.field9010.field10284[1]) + 96.0F);
            this.field7029 = true;
        }
    }
}
