import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class171 extends class497 {

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "Lui;")
    private class240 field2670;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "Lgl;")
    private class625 field2666;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "Z")
    private boolean field2661;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "Z")
    private boolean field2664;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field2665;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)V", line = 3)
    public static void method1258(int arg0) {
        if (arg0 == 1) {
            field2665 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V", line = 14)
    public final void method926(int arg0) {
        if (this.field2664) {
            super.field7086.method1192(-22137, 1);
            super.field7086.method1118(0, (class684) null);
            super.field7086.method1192(arg0 ^ 22314, 0);
            super.field7086.method1118(0, (class684) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field2664 = false;
        }
        if (arg0 != -339) {
            method1258(5);
        }
        ++field2669;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZ)V", line = 37)
    public final void method929(int arg0, boolean arg1) {
        if (arg0 <= -83) {
            ++field2667;
            class461 var3 = super.field7086.method1157(0);
            if (this.field2661 && var3 != null) {
                super.field7086.method1192(-22137, 1);
                super.field7086.method1118(0, var3);
                super.field7086.method1192(-22137, 0);
                super.field7086.method1118(0, this.field2670.field3607);
                long var4 = this.field2666.field8755;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field7086.field2416[0], -super.field7086.field2416[1], -super.field7086.field2416[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field7086.field2489, super.field7086.field2457, super.field7086.field2458, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field7086.field2416[1]));
                this.field2664 = true;
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BILkja;)V", line = 66)
    public final void method925(byte arg0, int arg1, class684 arg2) {
        if (!this.field2664) {
            super.field7086.method1118(0, arg2);
            super.field7086.method1189(94, arg1);
        }
        ++field2662;
        if (arg0 <= 83) {
            this.method921(-65);
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)Z", line = 83)
    public final boolean method921(int arg0) {
        int var2 = -22 % ((19 - arg0) / 52);
        ++field2663;
        return this.field2661;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZB)V", line = 97)
    public final void method928(boolean arg0, byte arg1) {
        int var3 = -51 % ((24 - arg1) / 46);
        ++field2668;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lko;Lwia;Lui;)V", line = 107)
    public class171(class529 arg0, class791 arg1, class240 arg2) {
        super(arg0);
        this.field2670 = arg2;
        if (arg1 != null && arg0.field7669 && arg0.field7662) {
            class246 var4 = class452.method2704(arg1.method4362("environment_mapped_water_v", "gl", (byte) 85), (byte) 56, arg0, 35633);
            class246 var5 = class452.method2704(arg1.method4362("environment_mapped_water_f", "gl", (byte) 16), (byte) -80, arg0, 35632);
            this.field2666 = class385.method2389(new class246[] { var4, var5 }, arg0, true);
            this.field2661 = this.field2666 != null && this.field2670.method1601((byte) -112);
        } else {
            this.field2661 = false;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBI)V", line = 128)
    public final void method923(int arg0, byte arg1, int arg2) {
        if (arg1 > 5) {
            if (this.field2664) {
                int var4 = 1 << (arg0 & 3);
                float var5 = (float) (1 << ((58 & arg0) >> 3)) / 32.0F;
                int var6 = 65535 & arg2;
                float var7 = (float) (3 & arg2 >> 16) / 8.0F;
                long var8 = this.field2666.field8755;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field7086.field2434 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            }
            ++field2671;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZZ)Z", line = 159)
    public static boolean method1259(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }
}
