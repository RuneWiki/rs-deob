import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class311 extends class139 {

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "[F")
    private float[] field3907 = new float[4];

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "Z")
    private boolean field3922;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "Lnm;")
    private class441 field3917;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lnm;")
    private class441 field3904;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Lnm;")
    private class441 field3914;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Lnm;")
    private class441 field3909;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "[I")
    public static int[] field3919 = new int[2048];

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "Luc;")
    public static class27 field3915 = new class27(11, 7);

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Z")
    private boolean field3912;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "Z")
    private boolean field3918;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V", line = 6)
    public final void method148(int arg0, int arg1, int arg2) {
        ++field3906;
        if (arg0 != -2) {
            this.method151(44, false);
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V", line = 17)
    public final void method883(byte arg0) {
        ++field3911;
        int var2 = super.field1681.method1277(3);
        class581 var3 = super.field1681.method1319((byte) -121);
        var3.method3216((float) var2, 0.0F, -1.0F, this.field3907, 0.0F, (byte) 121);
        if (this.field3918) {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field3909.field5540 : this.field3904.field5540);
        } else {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field3917.field5540 : this.field3914.field5540);
        }
        int var4 = 120 % ((arg0 - 5) / 46);
        OpenGL.glEnable(34336);
        this.field3912 = true;
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field3907[0], this.field3907[1], this.field3907[2], this.field3907[3]);
        this.method881(true);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Z", line = 44)
    public final boolean method152(int arg0) {
        ++field3905;
        int var2 = 28 % ((50 - arg0) / 48);
        return this.field3922;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V", line = 55)
    public final void method881(boolean arg0) {
        if (arg0) {
            ++field3920;
            if (this.field3912) {
                OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field1681.method461() - 1280), (float) (-768 + super.field1681.method461()), 1.0F / (float) super.field1681.method1350((byte) -60), (float) super.field1681.method1308(-119) / 255.0F);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V", line = 70)
    public static void method1830(byte arg0) {
        int var1 = 28 / ((-49 - arg0) / 60);
        field3919 = null;
        field3915 = null;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lel;Lpfa;)V", line = 82)
    public class311(class513 arg0, class275 arg1) {
        super(arg0);
        if (!arg0.field6527) {
            this.field3922 = false;
        } else {
            this.field3917 = class492.method2667(6447, 34336, arg0, arg1.method1649(-1, "uw_ground_unlit", "gl"));
            this.field3904 = class492.method2667(6447, 34336, arg0, arg1.method1649(-1, "uw_ground_lit", "gl"));
            this.field3914 = class492.method2667(6447, 34336, arg0, arg1.method1649(-1, "uw_model_unlit", "gl"));
            this.field3909 = class492.method2667(6447, 34336, arg0, arg1.method1649(-1, "uw_model_lit", "gl"));
            this.field3922 = this.field3917 != null & this.field3904 != null & this.field3914 != null & this.field3909 != null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BILgl;)V", line = 101)
    public final void method150(byte arg0, int arg1, class562 arg2) {
        if (arg0 > 103) {
            ++field3908;
            super.field1681.method1349(arg2, false);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)V", line = 113)
    public final void method151(int arg0, boolean arg1) {
        if (arg0 != 43) {
            this.method149(-49);
        }
        ++field3913;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLwv;)V", line = 124)
    public static final void method1831(byte arg0, class32 arg1) {
        ++field3916;
        int var2 = -class665.field9027 + arg1.field470;
        int var3 = arg1.field456 * 512 - -(256 * arg1.method210(false));
        int var4 = arg1.field449 * 512 - -(arg1.method210(false) * 256);
        arg1.field8011 += (-arg1.field8011 + var4) / var2;
        arg1.field8018 += (var3 - arg1.field8018) / var2;
        arg1.field509 = 0;
        if (arg1.field409 == 0) {
            arg1.method228(118, 8192);
        }
        if (arg1.field409 == 1) {
            arg1.method228(83, 12288);
        }
        if (~arg1.field409 == -3) {
            arg1.method228(33, 0);
        }
        if (arg0 >= 84) {
            if (~arg1.field409 == -4) {
                arg1.method228(39, 4096);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 158)
    public final void method149(int arg0) {
        ++field3910;
        if (arg0 < -4) {
            if (this.field3912) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field3912 = false;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(JJ)J", line = 177)
    public static long method1832(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V", line = 187)
    public final void method153(boolean arg0, int arg1) {
        if (arg1 != 43) {
            this.field3907 = null;
        }
        this.field3918 = arg0;
        ++field3921;
    }
}
