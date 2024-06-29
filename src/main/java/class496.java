import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class496 extends class555 {

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "[F")
    private float[] field6830 = new float[4];

    @OriginalMember(owner = "client!ru", name = "x", descriptor = "Lqaa;")
    private class133 field6840;

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "Lqaa;")
    private class133 field6833;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "Lqaa;")
    private class133 field6829;

    @OriginalMember(owner = "client!ru", name = "t", descriptor = "Lqaa;")
    private class133 field6836;

    @OriginalMember(owner = "client!ru", name = "A", descriptor = "Z")
    private boolean field6843;

    @OriginalMember(owner = "client!ru", name = "y", descriptor = "Lgn;")
    private class691 field6841;

    @OriginalMember(owner = "client!ru", name = "s", descriptor = "Luf;")
    public static class380 field6835 = new class380(10);

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!ru", name = "v", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!ru", name = "w", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!ru", name = "u", descriptor = "Z")
    private boolean field6837;

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "Z")
    private boolean field6842;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2824(int arg0, String arg1) {
        ++field6824;
        if (!arg1.equals("")) {
            ++class183.field2547;
            class229 var2 = class97.method550(class71.field841, false, class407.field5360);
            if (arg0 == 34336) {
                var2.field2971.method915(-31914, class206.method1313((byte) -81, arg1));
                var2.field2971.method936(arg1, -58);
                class307.method1805(var2, -14704);
            }
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(III)V")
    public final void method126(int arg0, int arg1, int arg2) {
        ++field6839;
        if (arg0 < 81) {
            this.field6843 = true;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lot;BI)V")
    public final void method127(class222 arg0, byte arg1, int arg2) {
        super.field7580.method3613((byte) 102, arg0);
        ++field6832;
        if (arg1 >= -93) {
            this.field6830 = null;
        }
        super.field7580.method3676(arg2, (byte) -84);
    }

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "(I)V")
    public static void method2825(int arg0) {
        field6835 = null;
        if (arg0 > -57) {
            field6835 = null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)V")
    public final void method121(byte arg0) {
        if (arg0 < 45) {
            method2825(-42);
        }
        ++field6825;
        super.field7580.method3635(true, 1);
        super.field7580.method3613((byte) 119, (class222) null);
        super.field7580.method3672((byte) 40, class274.field3642, class274.field3642);
        super.field7580.method3624(class630.field8719, -117, 0);
        super.field7580.method3624(class137.field1869, -123, 2);
        super.field7580.method3666(0, class630.field8719, (byte) -83);
        super.field7580.method3635(true, 0);
        if (this.field6842) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field6842 = false;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IBII)I")
    public static final int method2826(int arg0, byte arg1, int arg2, int arg3) {
        ++field6826;
        if (arg1 != 36) {
            method2826(91, (byte) 92, -81, -110);
        }
        if (arg0 < arg2) {
            return arg2;
        } else {
            return arg0 <= arg3 ? arg0 : arg3;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZZ)V")
    public final void method124(boolean arg0, boolean arg1) {
        ++field6834;
        this.field6837 = arg1;
        super.field7580.method3635(true, 1);
        super.field7580.method3613((byte) 107, this.field6841);
        super.field7580.method3672((byte) 45, class298.field3941, class305.field4076);
        super.field7580.method3624(class137.field1869, -126, 0);
        super.field7580.method2011(2, class630.field8719, 12080, false, arg0);
        super.field7580.method3666(0, class533.field7324, (byte) -83);
        super.field7580.method3635(true, 0);
        this.method128(-6486);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZI)V")
    public final void method117(boolean arg0, int arg1) {
        if (arg1 != -13443) {
            method2826(75, (byte) 90, -87, -43);
        }
        ++field6828;
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)Z")
    public final boolean method125(int arg0) {
        if (arg0 != -20112) {
            this.method117(false, -3);
        }
        ++field6838;
        return this.field6843;
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lqi;Lga;)V")
    public class496(class510 arg0, class332 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field7134) {
            this.field6840 = class85.method466(2251, arg1.method1947(5, "uw_ground_unlit", "gl"), 34336, arg0);
            this.field6833 = class85.method466(2251, arg1.method1947(5, "uw_ground_lit", "gl"), 34336, arg0);
            this.field6829 = class85.method466(2251, arg1.method1947(5, "uw_model_unlit", "gl"), 34336, arg0);
            this.field6836 = class85.method466(2251, arg1.method1947(5, "uw_model_lit", "gl"), 34336, arg0);
            if (!(this.field6836 != null & this.field6833 != null & this.field6840 != null & this.field6829 != null)) {
                this.field6843 = false;
            } else {
                this.field6841 = super.field7580.method3662(1, false, 2, -122, new int[] { 0, -1 });
                this.field6841.method846(false, (byte) 70, false);
                this.field6843 = true;
            }
        } else {
            this.field6843 = false;
        }
    }

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "(I)V")
    public final void method128(int arg0) {
        ++field6827;
        int var2 = super.field7580.method3688((byte) -43);
        class149 var3 = super.field7580.method3637((byte) 44);
        if (this.field6837) {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field6836.field1847 : this.field6833.field1847);
        } else {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field6829.field1847 : this.field6840.field1847);
        }
        OpenGL.glEnable(34336);
        if (arg0 != -6486) {
            this.field6843 = true;
        }
        this.field6842 = true;
        var3.method864(-80, -1.0F, 0.0F, 0.0F, (float) var2, this.field6830);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field6830[0], this.field6830[1], this.field6830[2], this.field6830[3]);
        this.method120((byte) -124);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
    public final void method120(byte arg0) {
        if (this.field6842) {
            int var2 = super.field7580.method1108();
            int var3 = super.field7580.method1054();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field7580.method3657((byte) -100), (float) super.field7580.method3655(1) / 255.0F);
            super.field7580.method3635(true, 1);
            super.field7580.method3678(-128, super.field7580.method3677((byte) 34));
            super.field7580.method3635(true, 0);
        }
        ++field6831;
        if (arg0 >= -118) {
            this.method126(7, -27, 48);
        }
    }
}
