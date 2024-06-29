import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class405 extends class384 {

    @OriginalMember(owner = "client!mha", name = "u", descriptor = "Z")
    private boolean field5712 = false;

    @OriginalMember(owner = "client!mha", name = "y", descriptor = "[F")
    private float[] field5716 = new float[4];

    @OriginalMember(owner = "client!mha", name = "p", descriptor = "Lhg;")
    private class502 field5707;

    @OriginalMember(owner = "client!mha", name = "A", descriptor = "Lhg;")
    private class502 field5718;

    @OriginalMember(owner = "client!mha", name = "B", descriptor = "Lhg;")
    private class502 field5719;

    @OriginalMember(owner = "client!mha", name = "z", descriptor = "Lhg;")
    private class502 field5717;

    @OriginalMember(owner = "client!mha", name = "G", descriptor = "Z")
    private boolean field5724;

    @OriginalMember(owner = "client!mha", name = "F", descriptor = "Lbaa;")
    private class620 field5723;

    @OriginalMember(owner = "client!mha", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field5714 = new String[5];

    @OriginalMember(owner = "client!mha", name = "E", descriptor = "Z")
    public static boolean field5722 = false;

    @OriginalMember(owner = "client!mha", name = "n", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!mha", name = "q", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!mha", name = "r", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!mha", name = "s", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!mha", name = "t", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!mha", name = "v", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!mha", name = "x", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!mha", name = "C", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!mha", name = "H", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!mha", name = "I", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!mha", name = "o", descriptor = "Z")
    private boolean field5706;

    @OriginalMember(owner = "client!mha", name = "D", descriptor = "Z")
    private boolean field5721;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IBI)V", line = 6)
    public final void method1025(int arg0, byte arg1, int arg2) {
        if (arg1 == 102) {
            ++field5725;
        }
    }

    @OriginalMember(owner = "client!mha", name = "e", descriptor = "(I)V", line = 17)
    public static void method2401(int arg0) {
        if (arg0 <= -101) {
            field5714 = null;
        }
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(B)V", line = 29)
    public final void method1019(byte arg0) {
        ++field5705;
        super.field5337.method3723(true, 1);
        super.field5337.method3711(false, (class329) null);
        super.field5337.method3708(100, class155.field1901, class155.field1901);
        super.field5337.method3777(false, 0, class632.field8774);
        if (arg0 == -60) {
            super.field5337.method3777(false, 2, class663.field9083);
            super.field5337.method3713(class632.field8774, 0, (byte) 87);
            super.field5337.method3723(true, 0);
            if (this.field5712) {
                super.field5337.method3777(false, 0, class632.field8774);
                super.field5337.method3713(class632.field8774, 0, (byte) 106);
                this.field5712 = false;
            }
            if (this.field5706) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field5706 = false;
            }
        }
    }

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Lck;Lkha;)V", line = 61)
    public class405(class221 arg0, class687 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field2904) {
            this.field5707 = class606.method3327(34336, arg1.method3813("gl", "uw_ground_unlit", -48), arg0, -12409);
            this.field5718 = class606.method3327(34336, arg1.method3813("gl", "uw_ground_lit", -43), arg0, -12409);
            this.field5719 = class606.method3327(34336, arg1.method3813("gl", "uw_model_unlit", -66), arg0, -12409);
            this.field5717 = class606.method3327(34336, arg1.method3813("gl", "uw_model_lit", -72), arg0, -12409);
            if (!(this.field5718 != null & this.field5707 != null & this.field5719 != null & this.field5717 != null)) {
                this.field5724 = false;
            } else {
                this.field5723 = super.field5337.method3731(new int[] { 0, -1 }, false, (byte) 119, 2, 1);
                this.field5723.method381(false, -13021, false);
                this.field5724 = true;
            }
        } else {
            this.field5724 = false;
        }
    }

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "(I)V", line = 89)
    public final void method2311(int arg0) {
        ++field5708;
        int var2 = super.field5337.method3767(arg0 + -31360);
        class462 var3 = super.field5337.method3718(-81);
        if (!this.field5721) {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field5707.field7072 : this.field5719.field7072);
        } else {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field5717.field7072 : this.field5718.field7072);
        }
        OpenGL.glEnable(34336);
        this.field5706 = true;
        var3.method2734(-1.0F, this.field5716, 0.0F, 0.0F, arg0 ^ -30864, (float) var2);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field5716[0], this.field5716[arg0], this.field5716[2], this.field5716[3]);
        this.method1867(-7);
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZB)V", line = 116)
    public final void method1020(boolean arg0, byte arg1) {
        ++field5715;
        this.field5721 = arg0;
        super.field5337.method3723(true, 1);
        super.field5337.method3711(false, this.field5723);
        super.field5337.method3708(86, class409.field5765, class353.field4729);
        super.field5337.method3777(false, 0, class663.field9083);
        super.field5337.method1395(false, 2, true, -125, class632.field8774);
        super.field5337.method3713(class155.field1970, 0, (byte) -104);
        if (arg1 < 23) {
            method2402(-14, -29);
        }
        super.field5337.method3723(true, 0);
        this.method2311(1);
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(II)I", line = 138)
    public static final int method2402(int arg0, int arg1) {
        ++field5709;
        if (arg0 != 0) {
            method2403(true, (byte) 2, 13, -86);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(Lbia;BI)V", line = 159)
    public final void method1015(class329 arg0, byte arg1, int arg2) {
        ++field5710;
        if (arg0 == null) {
            if (!this.field5712) {
                super.field5337.method3711(false, super.field5337.field9593);
                super.field5337.method3781(-3, 1);
                super.field5337.method3777(false, 0, class155.field1970);
                super.field5337.method3713(class155.field1970, 0, (byte) -117);
                this.field5712 = true;
            }
        } else {
            if (this.field5712) {
                super.field5337.method3777(false, 0, class632.field8774);
                super.field5337.method3713(class632.field8774, 0, (byte) 102);
                this.field5712 = false;
            }
            super.field5337.method3711(false, arg0);
            super.field5337.method3781(-3, arg2);
        }
        if (arg1 != 80) {
            this.field5717 = null;
        }
    }

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "(B)Z", line = 195)
    public final boolean method1021(byte arg0) {
        ++field5711;
        if (arg0 < 78) {
            this.method1018(-107, false);
        }
        return this.field5724;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZBII)I", line = 210)
    public static final int method2403(boolean arg0, byte arg1, int arg2, int arg3) {
        ++field5720;
        class464 var4 = class175.method1082(arg0, arg2, (byte) 20);
        if (var4 == null) {
            return 0;
        } else {
            int var5 = 87 % ((arg1 - 31) / 56);
            return ~arg3 <= -1 && ~arg3 > ~var4.field6712.length ? var4.field6712[arg3] : 0;
        }
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(I)V", line = 231)
    public final void method1867(int arg0) {
        if (this.field5706) {
            int var2 = super.field5337.method108();
            int var3 = super.field5337.method147();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field5337.method3779(14), (float) super.field5337.method3709(-11036) / 255.0F);
            super.field5337.method3723(true, 1);
            super.field5337.method3717(super.field5337.method3761((byte) -38), (byte) -86);
            super.field5337.method3723(true, 0);
        }
        int var6 = 104 / ((-45 - arg0) / 32);
        ++field5726;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IZ)V", line = 260)
    public final void method1018(int arg0, boolean arg1) {
        ++field5713;
        if (arg0 != 4) {
            method2401(-115);
        }
    }
}
