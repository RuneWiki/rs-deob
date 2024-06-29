import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class65 extends class715 {

    @OriginalMember(owner = "client!hia", name = "u", descriptor = "Lwv;")
    private class34 field1174;

    @OriginalMember(owner = "client!hia", name = "w", descriptor = "Lpga;")
    private class531 field1176;

    @OriginalMember(owner = "client!hia", name = "t", descriptor = "Z")
    private boolean field1173;

    @OriginalMember(owner = "client!hia", name = "x", descriptor = "I")
    public static int field1177 = 0;

    @OriginalMember(owner = "client!hia", name = "p", descriptor = "Lnga;")
    public static class510 field1169 = new class510(64);

    @OriginalMember(owner = "client!hia", name = "z", descriptor = "Lqe;")
    public static class465 field1179 = new class465(85, -1);

    @OriginalMember(owner = "client!hia", name = "B", descriptor = "Lqaa;")
    public static class27 field1180 = new class27(47, 2);

    @OriginalMember(owner = "client!hia", name = "m", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!hia", name = "n", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!hia", name = "o", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!hia", name = "r", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!hia", name = "s", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!hia", name = "v", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!hia", name = "y", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!hia", name = "q", descriptor = "Z")
    private boolean field1170;

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Leea;Leq;Lwv;)V", line = 3)
    public class65(class132 arg0, class209 arg1, class34 arg2) {
        super(arg0);
        this.field1174 = arg2;
        if (arg1 != null && arg0.field2091 && arg0.field2095) {
            class152 var4 = class344.method2177(45, arg0, arg1.method1475("environment_mapped_water_v", (byte) 116, "gl"), 35633);
            class152 var5 = class344.method2177(126, arg0, arg1.method1475("environment_mapped_water_f", (byte) 116, "gl"), 35632);
            this.field1176 = class643.method3668(new class152[] { var4, var5 }, arg0, -32169);
            this.field1173 = this.field1176 != null && this.field1174.method222((byte) -21);
        } else {
            this.field1173 = false;
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(BZ)V", line = 26)
    public final void method686(byte arg0, boolean arg1) {
        if (arg0 >= -105) {
            this.method689(42);
        }
        ++field1175;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(III)V", line = 38)
    public final void method687(int arg0, int arg1, int arg2) {
        if (this.field1170) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) (3 & arg2 >> 16) / 8.0F;
            long var8 = this.field1176.field7520;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field9979.field6479 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg1 != 1782) {
            method688(true, 23);
        }
        ++field1166;
    }

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "(ZI)V", line = 69)
    public static final void method688(boolean arg0, int arg1) {
        ++field1167;
        class166.field2454.method3049(arg1, (byte) 127);
        class467.field6734.method3049(arg1, (byte) 127);
        class309.field4361.method3049(arg1, (byte) 126);
        class157.field2355.method3049(arg1, (byte) 127);
        if (arg0) {
            field1179 = null;
        }
    }

    @OriginalMember(owner = "client!hia", name = "c", descriptor = "(I)V", line = 83)
    public final void method689(int arg0) {
        if (this.field1170) {
            super.field9979.method2753((byte) -17, 1);
            super.field9979.method2732(-107, (class355) null);
            super.field9979.method2753((byte) -17, 0);
            super.field9979.method2732(-102, (class355) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1170 = false;
        }
        int var2 = -112 % ((arg0 - -71) / 42);
        ++field1171;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(B)Z", line = 103)
    public final boolean method690(byte arg0) {
        ++field1178;
        if (arg0 != -3) {
            this.method690((byte) -100);
        }
        return this.field1173;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(ZI)V", line = 115)
    public final void method691(boolean arg0, int arg1) {
        ++field1168;
        class326 var3 = super.field9979.method2759(-105);
        if (arg1 != 4) {
            this.field1170 = true;
        }
        if (this.field1173 && var3 != null) {
            super.field9979.method2753((byte) -17, 1);
            super.field9979.method2732(arg1 ^ -96, var3);
            super.field9979.method2753((byte) -17, 0);
            super.field9979.method2732(-69, this.field1174.field448);
            long var4 = this.field1176.field7520;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field9979.field6540[0], -super.field9979.field6540[1], -super.field9979.field6540[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field9979.field6474, super.field9979.field6536, super.field9979.field6547, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field9979.field6540[1]));
            this.field1170 = true;
        }
    }

    @OriginalMember(owner = "client!hia", name = "f", descriptor = "(I)V", line = 153)
    public static void method692(int arg0) {
        field1179 = null;
        if (arg0 == -19636) {
            field1169 = null;
            field1180 = null;
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(ILdu;I)V", line = 165)
    public final void method693(int arg0, class355 arg1, int arg2) {
        int var4 = 70 / ((arg0 - 31) / 50);
        ++field1172;
        if (!this.field1170) {
            super.field9979.method2732(-118, arg1);
            super.field9979.method2721(arg2, true);
        }
    }
}
