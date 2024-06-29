import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class440 extends class648 {

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "Lpba;")
    private class333 field6507;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "Ltm;")
    private class391 field6509;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "Z")
    private boolean field6518;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
    public static int field6511 = 0;

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
    public static int field6517 = -1;

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "Z")
    private boolean field6508;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lbca;II)V", line = 9)
    public final void method1455(class663 arg0, int arg1, int arg2) {
        if (arg1 != 12885) {
            this.method1449(117);
        }
        ++field6510;
        if (!this.field6508) {
            super.field9139.method2294(arg0, arg1 + -12887);
            super.field9139.method2353((byte) -121, arg2);
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)Z", line = 29)
    public final boolean method1449(int arg0) {
        if (arg0 != 13003) {
            return true;
        } else {
            ++field6506;
            return this.field6518;
        }
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)V", line = 44)
    public final void method1450(int arg0) {
        ++field6513;
        if (arg0 > -67) {
            field6515 = -35;
        }
        if (this.field6508) {
            super.field9139.method2375((byte) 14, 1);
            super.field9139.method2294((class663) null, -2);
            super.field9139.method2375((byte) -70, 0);
            super.field9139.method2294((class663) null, -2);
            OpenGL.glUseProgramObjectARB(0L);
            this.field6508 = false;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZZ)V", line = 66)
    public final void method1451(boolean arg0, boolean arg1) {
        ++field6512;
        if (arg0) {
            this.method1451(false, true);
        }
        class584 var3 = super.field9139.method2303((byte) 125);
        if (this.field6518 && var3 != null) {
            super.field9139.method2375((byte) -85, 1);
            super.field9139.method2294(var3, -2);
            super.field9139.method2375((byte) -112, 0);
            super.field9139.method2294(this.field6507.field4777, -2);
            long var4 = this.field6509.field5891;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field9139.field5617[0], -super.field9139.field5617[1], -super.field9139.field5617[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field9139.field5602, super.field9139.field5639, super.field9139.field5576, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field9139.field5617[1]) * 928.0F);
            this.field6508 = true;
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lno;Lvd;Lpba;)V", line = 95)
    public class440(class704 arg0, class39 arg1, class333 arg2) {
        super(arg0);
        this.field6507 = arg2;
        if (arg1 != null && arg0.field9925 && arg0.field9915) {
            class656 var4 = class39.method205(arg1.method233(-101, "gl", "environment_mapped_water_v"), 35633, 0, arg0);
            class656 var5 = class39.method205(arg1.method233(-98, "gl", "environment_mapped_water_f"), 35632, 0, arg0);
            this.field6509 = class81.method654(new class656[] { var4, var5 }, 0, arg0);
            this.field6518 = this.field6509 != null && this.field6507.method2100(29275);
        } else {
            this.field6518 = false;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BII)V", line = 116)
    public final void method1453(byte arg0, int arg1, int arg2) {
        ++field6516;
        if (this.field6508) {
            int var4 = 1 << (3 & arg1);
            float var5 = (float) (1 << ((arg1 & 61) >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) ((arg2 & 199868) >> 16) / 8.0F;
            long var8 = this.field6509.field5891;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field9139.field5552 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        if (arg0 < 33) {
            this.method1449(-120);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZI)V", line = 144)
    public final void method1448(boolean arg0, int arg1) {
        ++field6514;
        if (arg1 != 0) {
            field6517 = 98;
        }
    }
}
