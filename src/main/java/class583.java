import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class583 extends class353 {

    @OriginalMember(owner = "client!ns", name = "v", descriptor = "Lgb;")
    private class465 field8475;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "Lro;")
    private class257 field8468;

    @OriginalMember(owner = "client!ns", name = "y", descriptor = "Z")
    private boolean field8478;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    public static int field8467;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
    public static int field8470;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
    public static int field8471;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!ns", name = "w", descriptor = "I")
    public static int field8476;

    @OriginalMember(owner = "client!ns", name = "x", descriptor = "I")
    public static int field8477;

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "Lmv;")
    public static class295 field8473;

    @OriginalMember(owner = "client!ns", name = "u", descriptor = "Lida;")
    public static class604 field8474;

    @OriginalMember(owner = "client!ns", name = "A", descriptor = "Z")
    private boolean field8480;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(IZ)V", line = 5)
    public final void method485(int arg0, boolean arg1) {
        if (arg0 < 1) {
            this.field8478 = false;
        }
        ++field8476;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lkd;Lmv;Lgb;)V", line = 17)
    public class583(class700 arg0, class295 arg1, class465 arg2) {
        super(arg0);
        this.field8475 = arg2;
        if (arg1 != null && arg0.field9955 && arg0.field9953) {
            class581 var4 = class229.method1427(arg1.method1817(127, "gl", "environment_mapped_water_v"), -20947, arg0, 35633);
            class581 var5 = class229.method1427(arg1.method1817(126, "gl", "environment_mapped_water_f"), -20947, arg0, 35632);
            this.field8468 = class262.method1579(arg0, new class581[] { var4, var5 }, (byte) 107);
            this.field8478 = this.field8468 != null && this.field8475.method2694((byte) -123);
        } else {
            this.field8478 = false;
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V", line = 39)
    public final void method490(int arg0) {
        if (arg0 != -2144900407) {
            this.field8478 = true;
        }
        ++field8471;
        if (this.field8480) {
            super.field5242.method3050(1, 0);
            super.field5242.method3011(-128, (class689) null);
            super.field5242.method3050(0, arg0 + 2144900407);
            super.field5242.method3011(-128, (class689) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field8480 = false;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZ)V", line = 60)
    public final void method491(int arg0, boolean arg1) {
        ++field8470;
        class447 var3 = super.field5242.method2999(true);
        if (this.field8478 && var3 != null) {
            super.field5242.method3050(1, 0);
            super.field5242.method3011(-128, var3);
            super.field5242.method3050(0, 0);
            super.field5242.method3011(-127, this.field8475.field6711);
            long var4 = this.field8468.field3341;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), super.field5242.field7747[0], -super.field5242.field7747[1], -super.field5242.field7747[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field5242.field7776, super.field5242.field7737, super.field5242.field7734, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0F * Math.abs(super.field5242.field7747[1]) + 96.0F);
            this.field8480 = true;
        }
        if (arg0 > -121) {
            this.method491(104, false);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILqda;I)V", line = 89)
    public final void method484(int arg0, class689 arg1, int arg2) {
        ++field8472;
        if (!this.field8480) {
            super.field5242.method3011(arg0 ^ -7944, arg1);
            super.field5242.method3037(arg2, true);
        }
        if (arg0 != 8056) {
            field8474 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILjava/lang/String;)J", line = 107)
    public static final long method3343(int arg0, String arg1) {
        ++field8479;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && ~var6 >= -91) {
                var2 += (long) (var6 + -64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (1 - -var6 + -97);
            } else if (var6 >= '0' && ~var6 >= -58) {
                var2 += (long) (var6 + -21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        if (arg0 > -106) {
            return -39L;
        } else {
            while (~(var2 % 37L) == -1L && var2 != 0L) {
                var2 /= 37L;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)Z", line = 154)
    public final boolean method493(byte arg0) {
        ++field8467;
        if (arg0 >= -20) {
            this.method491(-39, false);
        }
        return this.field8478;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZI)V", line = 168)
    public final void method486(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field8469 = 74;
        }
        if (this.field8480) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) ((arg2 & 218550) >> 16) / 8.0F;
            long var8 = this.field8468.field3341;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field5242.field7753 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field8477;
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)V", line = 198)
    public static void method3344(byte arg0) {
        field8473 = null;
        if (arg0 >= 116) {
            field8474 = null;
        }
    }
}
