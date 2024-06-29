import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class629 extends class292 {

    @OriginalMember(owner = "client!lt", name = "t", descriptor = "Ljq;")
    private class475 field9067;

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "Lj;")
    private class504 field9065;

    @OriginalMember(owner = "client!lt", name = "A", descriptor = "Lrga;")
    private class220 field9074;

    @OriginalMember(owner = "client!lt", name = "v", descriptor = "Lqfa;")
    public static class85 field9069 = new class85(21, 3);

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "I")
    public static int field9066;

    @OriginalMember(owner = "client!lt", name = "u", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!lt", name = "w", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!lt", name = "x", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!lt", name = "y", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!lt", name = "z", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!lt", name = "B", descriptor = "I")
    public static int field9075;

    @OriginalMember(owner = "client!lt", name = "C", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!lt", name = "D", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "(III)Z")
    public static final boolean method3599(int arg0, int arg1, int arg2) {
        ++field9066;
        if (arg1 > -82) {
            method3602(-65, -95, 20, (class56) null, -10, (class167) null);
        }
        if (!class597.method3399(arg0, (byte) 88, arg2)) {
            return false;
        } else {
            return (arg0 & 45056) != 0 | class183.method1340(540800, arg2, arg0) | class284.method1876(arg0, arg2, 0) ? true : (55 & arg2) == 0 & (class594.method3395(arg2, arg0, false) | class113.method1013(arg2, arg0, (byte) 58));
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)V")
    public final void method600(int arg0, int arg1, int arg2) {
        ++field9075;
        int var4 = -25 / ((-45 - arg1) / 59);
        if (!this.field9065.field7154) {
            int var5 = super.field4393.field8123 % 4000 * 16 / 4000;
            super.field4393.method3266(-2, this.field9065.field7152[var5]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var6 = (float) (super.field4393.field8123 % 4000) / 4000.0F;
            super.field4393.method3266(-2, this.field9065.field7155);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var6, 0.0F, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BILhw;)V")
    public final void method603(byte arg0, int arg1, class116 arg2) {
        if (arg0 >= 28) {
            ++field9064;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IB)Z")
    public static final boolean method3600(int arg0, byte arg1) {
        class130.field2351 = arg0 + 1 & 65535;
        ++field9071;
        if (arg1 < 83) {
            method3600(105, (byte) 57);
        }
        class590.field8486 = true;
        return true;
    }

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "(I)V")
    public static void method3601(int arg0) {
        field9069 = null;
        if (arg0 != 6454) {
            method3599(14, -38, 0);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZB)V")
    public final void method602(boolean arg0, byte arg1) {
        super.field4393.method3232(class525.field7399, class121.field2184, (byte) -119);
        if (arg1 != 54) {
            this.field9067 = null;
        }
        ++field9072;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Ljq;Lom;Lj;)V")
    public class629(class475 arg0, class344 arg1, class504 arg2) {
        super(arg0);
        this.field9067 = arg0;
        this.field9065 = arg2;
        if (arg1 != null && this.field9065.method2996(true) && this.field9067.field6839) {
            this.field9074 = class316.method2041((byte) 99, 34336, arg1.method2211("gl", 19558, "transparent_water"), this.field9067);
        } else {
            this.field9074 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
    public final void method601(int arg0) {
        super.field4393.method3231(0, class435.field6296, (byte) -127);
        if (arg0 <= 27) {
            this.method599(true, (byte) 115);
        }
        ++field9070;
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIILbd;ILr;)V")
    public static final void method3602(int arg0, int arg1, int arg2, class56 arg3, int arg4, class167 arg5) {
        ++field9068;
        class661 var6 = class597.field8568.method2803(arg3.field1233, -28997);
        if (var6.field9526 != -1) {
            int var8;
            if (arg3.field1256) {
                int var7 = arg3.field1314 + arg2;
                var8 = var7 & 3;
            } else {
                var8 = 0;
            }
            class702 var9 = var6.method3759(arg5, -1, arg3.field1295, var8);
            if (var9 != null) {
                if (arg0 != 7427) {
                    method3601(109);
                }
                int var10 = arg3.field1238;
                int var11 = arg3.field1244;
                if (~(var8 & 1) == -2) {
                    var10 = arg3.field1244;
                    var11 = arg3.field1238;
                }
                int var12 = var9.method1784();
                int var13 = var9.method1789();
                if (var6.field9522) {
                    var12 = var10 * 4;
                    var13 = var11 * 4;
                }
                if (var6.field9529 != 0) {
                    var9.method3919(arg4, -((var11 + -1) * 4) + arg1, var12, var13, 0, var6.field9529 | -16777216, 1);
                } else {
                    var9.method3922(arg4, -(var11 * 4) + 4 + arg1, var12, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "(I)Z")
    public final boolean method604(int arg0) {
        ++field9077;
        if (arg0 != 24561) {
            this.field9067 = null;
        }
        return this.field9074 != null;
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(ZB)V")
    public final void method599(boolean arg0, byte arg1) {
        if (arg1 != -116) {
            this.field9074 = null;
        }
        OpenGL.glBindProgramARB(34336, this.field9074.field3328);
        ++field9073;
        OpenGL.glEnable(34336);
        super.field4393.method3231(0, class661.field9521, (byte) -97);
    }
}
