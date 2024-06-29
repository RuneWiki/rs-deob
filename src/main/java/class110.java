import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class110 extends class279 {

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Lno;")
    private class67 field1715;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "Loo;")
    private class647 field1725;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Z")
    private boolean field1720;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field1710 = 1403;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "[I")
    public static int[] field1713 = new int[8];

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field1714 = 0;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "J")
    public static long field1717;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "Lla;")
    public static class422 field1724;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "Z")
    private boolean field1718;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "[I")
    public static int[] field1723;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZLiu;)V")
    public final void method437(int arg0, boolean arg1, class506 arg2) {
        ++field1721;
        if (arg1) {
            method900(36, (byte) -32, 82, -79, 41);
        }
        if (!this.field1718) {
            super.field4267.method215(8, arg2);
            super.field4267.method405(arg0, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lom;Lla;Lno;)V")
    public class110(class642 arg0, class422 arg1, class67 arg2) {
        super(arg0);
        this.field1715 = arg2;
        if (arg1 != null && arg0.field9167 && arg0.field9169) {
            class74 var4 = class677.method3774(arg0, 35633, arg1.method2638("environment_mapped_water_v", 104, "gl"), (byte) 55);
            class74 var5 = class677.method3774(arg0, 35632, arg1.method2638("environment_mapped_water_f", 35, "gl"), (byte) 31);
            this.field1725 = class411.method2531(0, arg0, new class74[] { var4, var5 });
            this.field1720 = this.field1725 != null && this.field1715.method645(true);
        } else {
            this.field1720 = false;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V")
    public static void method899(byte arg0) {
        if (arg0 >= -32) {
            field1713 = null;
        }
        field1713 = null;
        field1724 = null;
        field1723 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BZ)V")
    public final void method441(byte arg0, boolean arg1) {
        ++field1726;
        if (arg0 != 9) {
            this.method443(-78, -21, -89);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)V")
    public final void method435(boolean arg0, int arg1) {
        ++field1712;
        class295 var3 = super.field4267.method389(119);
        if (arg1 == 2048) {
            if (this.field1720 && var3 != null) {
                super.field4267.method411(1, (byte) -87);
                super.field4267.method215(8, var3);
                super.field4267.method411(0, (byte) -102);
                super.field4267.method215(8, this.field1715.field1055);
                long var4 = this.field1725.field9211;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field4267.field642[0], -super.field4267.field642[1], -super.field4267.field642[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field4267.field626, super.field4267.field593, super.field4267.field661, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + Math.abs(super.field4267.field642[1]) * 928.0F);
                this.field1718 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Z")
    public final boolean method438(byte arg0) {
        if (arg0 > -32) {
            field1713 = null;
        }
        ++field1711;
        return this.field1720;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
    public final void method443(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field1715 = null;
        }
        if (this.field1718) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << ((57 & arg0) >> 3)) / 32.0F;
            int var6 = 65535 & arg2;
            float var7 = (float) ((arg2 & 207210) >> 16) / 8.0F;
            long var8 = this.field1725.field9211;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field4267.field649 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        ++field1722;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public final void method442(boolean arg0) {
        if (this.field1718) {
            super.field4267.method411(1, (byte) -114);
            super.field4267.method215(8, (class506) null);
            super.field4267.method411(0, (byte) -116);
            super.field4267.method215(8, (class506) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field1718 = false;
        }
        if (arg0) {
            field1717 = -8L;
        }
        ++field1719;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBIII)V")
    public static final void method900(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class461.field6699 = arg0;
        class184.field3102 = arg4;
        if (arg1 != -3) {
            method900(-39, (byte) 52, 81, 116, 121);
        }
        class76.field1126 = arg2;
        class657.field9347 = arg3;
        ++field1716;
    }
}
