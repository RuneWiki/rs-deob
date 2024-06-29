import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class83 extends class262 {

    @OriginalMember(owner = "client!qfa", name = "n", descriptor = "Lvt;")
    private class276 field1180;

    @OriginalMember(owner = "client!qfa", name = "p", descriptor = "Lka;")
    private class438 field1182;

    @OriginalMember(owner = "client!qfa", name = "y", descriptor = "Z")
    private boolean field1191;

    @OriginalMember(owner = "client!qfa", name = "o", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!qfa", name = "q", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!qfa", name = "r", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!qfa", name = "s", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!qfa", name = "t", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!qfa", name = "u", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!qfa", name = "w", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!qfa", name = "x", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!qfa", name = "v", descriptor = "Z")
    private boolean field1188;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZI)V")
    public final void method372(boolean arg0, int arg1) {
        if (arg1 != 0) {
            field1189 = 99;
        }
        ++field1186;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IZI)V")
    public final void method373(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            if (this.field1188) {
                int var4 = 1 << (3 & arg0);
                float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
                int var6 = 65535 & arg2;
                float var7 = (float) (3 & arg2 >> 16) / 8.0F;
                long var8 = this.field1182.field6257;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field3601.field5487 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            }
            ++field1184;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILoa;B)V")
    public final void method371(int arg0, class644 arg1, byte arg2) {
        ++field1185;
        if (!this.field1188) {
            super.field3601.method2316((byte) 107, arg1);
            super.field3601.method2362(arg0, false);
        }
        if (arg2 < 80) {
            this.field1180 = null;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)Z")
    public final boolean method375(int arg0) {
        if (arg0 != -18095) {
            this.method373(84, false, -117);
        }
        ++field1183;
        return this.field1191;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IZ)V")
    public final void method377(int arg0, boolean arg1) {
        ++field1181;
        if (arg0 >= 37) {
            class629 var3 = super.field3601.method2372((byte) 113);
            if (this.field1191 && var3 != null) {
                super.field3601.method2318(1, -30954);
                super.field3601.method2316((byte) 96, var3);
                super.field3601.method2318(0, -30954);
                super.field3601.method2316((byte) 91, this.field1180.field3768);
                long var4 = this.field1182.field6257;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), super.field3601.field5520[0], -super.field3601.field5520[1], -super.field3601.field5520[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field3601.field5446, super.field3601.field5512, super.field3601.field5481, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 928.0F * Math.abs(super.field3601.field5520[1]) + 96.0F);
                this.field1188 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Ldda;Ljn;Lvt;)V")
    public class83(class349 arg0, class668 arg1, class276 arg2) {
        super(arg0);
        this.field1180 = arg2;
        if (arg1 != null && arg0.field4661 && arg0.field4667) {
            class591 var4 = class657.method3724(arg0, false, 35633, arg1.method3778(-33, "gl", "environment_mapped_water_v"));
            class591 var5 = class657.method3724(arg0, false, 35632, arg1.method3778(89, "gl", "environment_mapped_water_f"));
            this.field1182 = class178.method1112((byte) 40, arg0, new class591[] { var4, var5 });
            this.field1191 = this.field1182 != null && this.field1180.method1672(-53);
        } else {
            this.field1191 = false;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(I)V")
    public final void method374(int arg0) {
        ++field1190;
        if (this.field1188) {
            super.field3601.method2318(1, -30954);
            super.field3601.method2316((byte) 103, (class644) null);
            super.field3601.method2318(0, -30954);
            super.field3601.method2316((byte) 118, (class644) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1188 = false;
        }
        if (arg0 < 42) {
            this.field1180 = null;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method675(String arg0, byte arg1) {
        ++field1187;
        if (arg1 == -125) {
            if (class642.field9171 != null) {
                ++class620.field8885;
                class543 var2 = class299.method1780(class84.field1196, class437.field6253, 56);
                var2.field7872.method2281((byte) 58, class251.method1534(arg0, (byte) 115));
                var2.field7872.method2269(arg0, arg1 ^ 66);
                class511.method3028(7482, var2);
            }
        }
    }
}
