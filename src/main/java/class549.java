import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class549 extends class595 {

    @OriginalMember(owner = "client!av", name = "q", descriptor = "[F")
    private float[] field7589 = new float[4];

    @OriginalMember(owner = "client!av", name = "r", descriptor = "Z")
    private boolean field7590;

    @OriginalMember(owner = "client!av", name = "t", descriptor = "Loj;")
    private class318 field7592;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "Loj;")
    private class318 field7583;

    @OriginalMember(owner = "client!av", name = "v", descriptor = "Loj;")
    private class318 field7594;

    @OriginalMember(owner = "client!av", name = "D", descriptor = "Loj;")
    private class318 field7602;

    @OriginalMember(owner = "client!av", name = "u", descriptor = "[[I")
    public static int[][] field7593 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!av", name = "C", descriptor = "Lcba;")
    public static class471 field7601 = new class471(22, -1);

    @OriginalMember(owner = "client!av", name = "F", descriptor = "I")
    public static int field7604 = 0;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!av", name = "p", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!av", name = "s", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!av", name = "w", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!av", name = "y", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!av", name = "z", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!av", name = "A", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!av", name = "B", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!av", name = "E", descriptor = "Lan;")
    public static class21 field7603;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "Z")
    private boolean field7587;

    @OriginalMember(owner = "client!av", name = "x", descriptor = "Z")
    private boolean field7596;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
    public final void method1488(byte arg0) {
        if (arg0 == 4) {
            ++field7585;
            int var2 = super.field8612.method2273(true);
            class557 var3 = super.field8612.method2285(2);
            var3.method3168(0.0F, 0.0F, (byte) 104, (float) var2, -1.0F, this.field7589);
            if (this.field7587) {
                OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field7602.field4312 : this.field7583.field4312);
            } else {
                OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field7594.field4312 : this.field7592.field4312);
            }
            OpenGL.glEnable(34336);
            this.field7596 = true;
            OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field7589[0], this.field7589[1], this.field7589[2], this.field7589[3]);
            this.method1484((byte) -124);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(III)V")
    public final void method303(int arg0, int arg1, int arg2) {
        if (arg2 >= -114) {
            this.method299(-121, false);
        }
        ++field7591;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIII)V")
    public static final void method3128(int arg0, int arg1, int arg2, int arg3) {
        ++field7600;
        class314 var4 = class483.method2819(9, arg0, 21303);
        if (arg3 == 1) {
            var4.method1959(19793);
            var4.field4227 = arg1;
            var4.field4230 = arg2;
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lpi;Lan;)V")
    public class549(class424 arg0, class21 arg1) {
        super(arg0);
        if (!arg0.field6021) {
            this.field7590 = false;
        } else {
            this.field7592 = class385.method2259(arg1.method228("uw_ground_unlit", 106, "gl"), 119, 34336, arg0);
            this.field7583 = class385.method2259(arg1.method228("uw_ground_lit", 94, "gl"), 95, 34336, arg0);
            this.field7594 = class385.method2259(arg1.method228("uw_model_unlit", 121, "gl"), 98, 34336, arg0);
            this.field7602 = class385.method2259(arg1.method228("uw_model_lit", 85, "gl"), 95, 34336, arg0);
            this.field7590 = this.field7602 != null & this.field7583 != null & this.field7592 != null & this.field7594 != null;
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(B)Z")
    public final boolean method297(byte arg0) {
        ++field7595;
        return arg0 >= -119 ? true : this.field7590;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "([BII)[B")
    public static final byte[] method3129(byte[] arg0, int arg1, int arg2) {
        ++field7584;
        if (arg2 != 3) {
            field7603 = null;
        }
        byte[] var3 = new byte[arg1];
        class416.method2498(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IZ)V")
    public final void method299(int arg0, boolean arg1) {
        ++field7598;
        if (arg0 != -1) {
            this.field7589 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(B)V")
    public final void method1484(byte arg0) {
        if (arg0 >= -123) {
            field7604 = 45;
        }
        if (this.field7596) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field8612.method1282() + -1280), (float) (super.field8612.method1282() - 768), 1.0F / (float) super.field8612.method2332((byte) 33), (float) super.field8612.method2272(true) / 255.0F);
        }
        ++field7588;
    }

    @OriginalMember(owner = "client!av", name = "e", descriptor = "(B)V")
    public final void method298(byte arg0) {
        ++field7597;
        if (arg0 != -60) {
            this.method1488((byte) 76);
        }
        if (this.field7596) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field7596 = false;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZZ)V")
    public final void method302(boolean arg0, boolean arg1) {
        this.field7587 = arg0;
        if (arg1) {
            ++field7586;
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(Z)V")
    public static void method3130(boolean arg0) {
        field7601 = null;
        field7593 = null;
        if (!arg0) {
            field7604 = 31;
        }
        field7603 = null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lbaa;II)V")
    public final void method301(class445 arg0, int arg1, int arg2) {
        ++field7599;
        if (arg1 != -1) {
            this.method299(81, false);
        }
        super.field8612.method2267(2, arg0);
    }
}
