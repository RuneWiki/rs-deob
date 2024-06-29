import jaggl.OpenGL;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class641 extends class657 {

    @OriginalMember(owner = "client!or", name = "r", descriptor = "Z")
    private boolean field8813 = false;

    @OriginalMember(owner = "client!or", name = "G", descriptor = "[F")
    private float[] field8827 = new float[4];

    @OriginalMember(owner = "client!or", name = "n", descriptor = "Lqr;")
    private class65 field8809;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "Lqr;")
    private class65 field8806;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "Lqr;")
    private class65 field8818;

    @OriginalMember(owner = "client!or", name = "z", descriptor = "Lqr;")
    private class65 field8821;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "Z")
    private boolean field8805;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "Lwfa;")
    private class200 field8804;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    public static int field8810 = 0;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "[I")
    public static int[] field8811 = new int[4096];

    @OriginalMember(owner = "client!or", name = "q", descriptor = "Lmu;")
    public static class303 field8812 = new class303(16, 6);

    @OriginalMember(owner = "client!or", name = "I", descriptor = "Lib;")
    public static class155 field8829 = new class155(8);

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "I")
    public static int field8815;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "I")
    public static int field8817;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!or", name = "A", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!or", name = "B", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!or", name = "C", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!or", name = "F", descriptor = "I")
    public static int field8826;

    @OriginalMember(owner = "client!or", name = "H", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!or", name = "y", descriptor = "Z")
    private boolean field8820;

    @OriginalMember(owner = "client!or", name = "E", descriptor = "Z")
    private boolean field8825;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "[B")
    public static byte[] field8808;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V", line = 5)
    public final void method3636(int arg0) {
        if (arg0 <= 45) {
            method3639(true);
        }
        ++field8815;
        int var2 = super.field9010.method4152(102);
        class81 var3 = super.field9010.method4119((byte) 98);
        if (!this.field8825) {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field8818.field1246 : this.field8809.field1246);
        } else {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field8806.field1246 : this.field8821.field1246);
        }
        OpenGL.glEnable(34336);
        this.field8820 = true;
        var3.method755(0.0F, this.field8827, -1.0F, 0.0F, (float) var2, (byte) -120);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field8827[0], this.field8827[1], this.field8827[2], this.field8827[3]);
        this.method1312(-16252);
    }

    @OriginalMember(owner = "client!or", name = "e", descriptor = "(I)Z", line = 34)
    public final boolean method731(int arg0) {
        ++field8828;
        return arg0 > -57 ? false : this.field8805;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V", line = 45)
    public final void method728(byte arg0) {
        ++field8822;
        super.field9010.method4126(1, -4382);
        super.field9010.method4097((byte) -128, (class357) null);
        super.field9010.method4112(class534.field7355, 116, class534.field7355);
        super.field9010.method4096((byte) 47, 0, class755.field10544);
        super.field9010.method4096((byte) 47, 2, class4.field31);
        super.field9010.method4117(0, true, class755.field10544);
        super.field9010.method4126(0, -4382);
        if (this.field8813) {
            super.field9010.method4096((byte) 47, 0, class755.field10544);
            super.field9010.method4117(0, true, class755.field10544);
            this.field8813 = false;
        }
        if (arg0 != 87) {
            field8829 = null;
        }
        if (this.field8820) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field8820 = false;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(III)V", line = 81)
    public final void method730(int arg0, int arg1, int arg2) {
        if (arg0 != 10756) {
            this.method736(113, (class357) null, 113);
        }
        ++field8816;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILdu;I)V", line = 92)
    public final void method736(int arg0, class357 arg1, int arg2) {
        if (arg1 != null) {
            if (this.field8813) {
                super.field9010.method4096((byte) 47, 0, class755.field10544);
                super.field9010.method4117(0, true, class755.field10544);
                this.field8813 = false;
            }
            super.field9010.method4097((byte) -122, arg1);
            super.field9010.method4144(true, arg0);
        } else if (!this.field8813) {
            super.field9010.method4097((byte) 99, super.field9010.field10261);
            super.field9010.method4144(true, 1);
            super.field9010.method4096((byte) 47, 0, class380.field5528);
            super.field9010.method4117(0, true, class380.field5528);
            this.field8813 = true;
        }
        if (arg2 != -16776) {
            this.method735(16, true);
        }
        ++field8823;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 127)
    public final void method1312(int arg0) {
        if (arg0 != -16252) {
            this.field8825 = true;
        }
        if (this.field8820) {
            int var2 = super.field9010.method186();
            int var3 = super.field9010.method323();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field9010.method4085((byte) -58), (float) super.field9010.method4082((byte) -70) / 255.0F);
            super.field9010.method4126(1, -4382);
            super.field9010.method4123(-28186, super.field9010.method4104(-104));
            super.field9010.method4126(0, -4382);
        }
        ++field8826;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lin;IZJIII)V", line = 153)
    public static final void method3637(class91 arg0, int arg1, boolean arg2, long arg3, int arg4, int arg5, int arg6) {
        ++field8824;
        class698.method3901(arg6, arg5, arg3, 0, arg2, arg0, (byte) 126, arg4);
        int var8 = -35 / ((-41 - arg1) / 38);
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(Z)V", line = 175)
    public static final void method3638(boolean arg0) {
        ++field8819;
        if (!arg0) {
            client var1 = class334.field4684;
            synchronized (class334.field4684) {
                if (class699.field9455 == null) {
                    Container var2;
                    if (class684.field9263 != null) {
                        var2 = class684.field9263;
                    } else if (class675.field9193 == null) {
                        var2 = class566.field7798;
                    } else {
                        var2 = class675.field9193;
                    }
                    class288.field4004 = var2.getSize().width;
                    class751.field10508 = var2.getSize().height;
                    if (class684.field9263 == var2) {
                        Insets var3 = class684.field9263.getInsets();
                        class288.field4004 -= var3.left - -var3.right;
                        class751.field10508 -= var3.top + var3.bottom;
                    }
                    if (class324.method2072(-86) != 1) {
                        class700.method3913((byte) 56);
                    } else {
                        class467.field6559 = class478.field6661;
                        class14.field244 = 0;
                        class688.field9288 = (class288.field4004 - class478.field6661) / 2;
                        class582.field7968 = class22.field488;
                    }
                    if (class740.field9967 != class436.field6234) {
                        boolean var10000;
                        if (~class467.field6559 > -1025 && class582.field7968 < 768) {
                            var10000 = true;
                        } else {
                            var10000 = false;
                        }
                    }
                    class458.field6458.setSize(class467.field6559, class582.field7968);
                    if (class272.field3822 != null) {
                        if (class241.field3529) {
                            class281.method1850(120, class458.field6458);
                        } else {
                            class272.field3822.method280(class458.field6458, class467.field6559, class582.field7968);
                        }
                    }
                    if (class684.field9263 != var2) {
                        class458.field6458.setLocation(class688.field9288, class14.field244);
                    } else {
                        Insets var4 = class684.field9263.getInsets();
                        class458.field6458.setLocation(var4.left - -class688.field9288, class14.field244 + var4.top);
                    }
                    if (~class184.field2784 != 0) {
                        class212.method1455(true, 520);
                    }
                    class205.method1423((byte) -78);
                }
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lbga;Lin;)V", line = 263)
    public class641(class358 arg0, class91 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field5174) {
            this.field8809 = class221.method1571(34336, arg1.method844("gl", "uw_ground_unlit", -29832), arg0, 4);
            this.field8806 = class221.method1571(34336, arg1.method844("gl", "uw_ground_lit", -29832), arg0, 4);
            this.field8818 = class221.method1571(34336, arg1.method844("gl", "uw_model_unlit", -29832), arg0, 4);
            this.field8821 = class221.method1571(34336, arg1.method844("gl", "uw_model_lit", -29832), arg0, 4);
            if (!(this.field8809 != null & this.field8806 != null & this.field8818 != null & this.field8821 != null)) {
                this.field8805 = false;
            } else {
                this.field8804 = super.field9010.method4091(1, 2, -15137, false, new int[] { 0, -1 });
                this.field8804.method1014(false, false, 25688);
                this.field8805 = true;
            }
        } else {
            this.field8805 = false;
        }
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(Z)V", line = 289)
    public static void method3639(boolean arg0) {
        field8811 = null;
        field8829 = null;
        if (arg0) {
            field8812 = null;
            field8808 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IZ)V", line = 303)
    public final void method735(int arg0, boolean arg1) {
        ++field8814;
        this.field8825 = arg1;
        super.field9010.method4126(1, arg0 ^ -10822);
        super.field9010.method4097((byte) -32, this.field8804);
        super.field9010.method4112(class720.field9793, 109, class295.field4131);
        super.field9010.method4096((byte) 47, 0, class4.field31);
        if (arg0 == 15192) {
            super.field9010.method2248(true, false, 2, class755.field10544, false);
            super.field9010.method4117(0, true, class380.field5528);
            super.field9010.method4126(0, arg0 + -19574);
            this.method3636(75);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZB)V", line = 339)
    public final void method734(boolean arg0, byte arg1) {
        ++field8807;
        if (arg1 != -103) {
            this.field8806 = null;
        }
    }
}
