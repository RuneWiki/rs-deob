import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class294 extends class499 {

    @OriginalMember(owner = "client!re", name = "E", descriptor = "Z")
    private boolean field3734 = false;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "[F")
    private float[] field3736 = new float[4];

    @OriginalMember(owner = "client!re", name = "D", descriptor = "Lvia;")
    private class494 field3733;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "Lvia;")
    private class494 field3721;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "Lvia;")
    private class494 field3727;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "Lvia;")
    private class494 field3731;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Z")
    private boolean field3720;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "Lw;")
    private class471 field3722;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "Ltq;")
    public static class536 field3738 = new class536(3000000, 200);

    @OriginalMember(owner = "client!re", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field3739 = new String[100];

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "Z")
    private boolean field3726;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "Z")
    private boolean field3735;

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Ljc;Lwm;)V", line = 3)
    public class294(class179 arg0, class30 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field2457) {
            this.field3733 = class113.method659((byte) 54, arg1.method142(-1, "gl", "uw_ground_unlit"), 34336, arg0);
            this.field3721 = class113.method659((byte) 85, arg1.method142(-1, "gl", "uw_ground_lit"), 34336, arg0);
            this.field3727 = class113.method659((byte) 126, arg1.method142(-1, "gl", "uw_model_unlit"), 34336, arg0);
            this.field3731 = class113.method659((byte) 22, arg1.method142(-1, "gl", "uw_model_lit"), 34336, arg0);
            if (!(this.field3727 != null & this.field3733 != null & this.field3721 != null & this.field3731 != null)) {
                this.field3720 = false;
            } else {
                this.field3722 = super.field6405.method3719(2, new int[] { 0, -1 }, (byte) -117, 1, false);
                this.field3722.method1131(false, false, 72);
                this.field3720 = true;
            }
        } else {
            this.field3720 = false;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V", line = 31)
    public final void method205(int arg0) {
        ++field3725;
        super.field6405.method3712(arg0 ^ -14720, 1);
        super.field6405.method3756(10, (class132) null);
        super.field6405.method3759(false, class137.field1820, class137.field1820);
        super.field6405.method3736(class171.field2262, 0, (byte) -88);
        super.field6405.method3736(class324.field4001, 2, (byte) -88);
        super.field6405.method3718(arg0, class171.field2262, 1);
        super.field6405.method3712(-14720, 0);
        if (this.field3734) {
            super.field6405.method3736(class171.field2262, 0, (byte) -88);
            super.field6405.method3718(0, class171.field2262, 1);
            this.field3734 = false;
        }
        if (this.field3726) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3726 = false;
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V", line = 62)
    public final void method196(int arg0) {
        if (arg0 != 7) {
            this.field3720 = false;
        }
        ++field3732;
        if (this.field3726) {
            int var2 = super.field6405.method985();
            int var3 = super.field6405.method951();
            float var4 = (float) var2 - (float) (var2 - var3) * 0.125F;
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field6405.method3741(false), (float) super.field6405.method3747(-57) / 255.0F);
            super.field6405.method3712(-14720, 1);
            super.field6405.method3771(super.field6405.method3710(arg0 + 9200), -9445);
            super.field6405.method3712(-14720, 0);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)V", line = 101)
    public final void method201(int arg0, boolean arg1) {
        this.field3735 = arg1;
        ++field3728;
        super.field6405.method3712(-14720, 1);
        super.field6405.method3756(arg0 ^ 81, this.field3722);
        super.field6405.method3759(false, class361.field4395, class174.field2285);
        super.field6405.method3736(class324.field4001, 0, (byte) -88);
        super.field6405.method1205(2, arg0 + 31, class171.field2262, true, false);
        super.field6405.method3718(0, class13.field134, arg0 ^ 90);
        super.field6405.method3712(-14720, 0);
        this.method1766((byte) 67);
        if (arg0 != 91) {
            this.method205(34);
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V", line = 120)
    public final void method1766(byte arg0) {
        ++field3723;
        int var2 = super.field6405.method3785(3261);
        class588 var3 = super.field6405.method3780(1);
        int var4 = 13 % ((-41 - arg0) / 33);
        if (this.field3735) {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field3731.field6325 : this.field3721.field6325);
        } else {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field3727.field6325 : this.field3733.field6325);
        }
        OpenGL.glEnable(34336);
        this.field3726 = true;
        var3.method3154((float) var2, this.field3736, -1.0F, 81, 0.0F, 0.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field3736[0], this.field3736[1], this.field3736[2], this.field3736[3]);
        this.method196(7);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BII)V", line = 147)
    public final void method204(byte arg0, int arg1, int arg2) {
        ++field3737;
        if (arg0 < 11) {
            this.field3726 = true;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)Z", line = 157)
    public final boolean method200(boolean arg0) {
        ++field3730;
        if (!arg0) {
            this.field3733 = null;
        }
        return this.field3720;
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V", line = 168)
    public static void method1767(int arg0) {
        field3739 = null;
        field3738 = null;
        if (arg0 != 34336) {
            method1767(-34);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZZ)V", line = 188)
    public final void method202(boolean arg0, boolean arg1) {
        ++field3724;
        if (arg1) {
            this.method205(-38);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILsfa;I)V", line = 205)
    public final void method206(int arg0, class132 arg1, int arg2) {
        if (arg1 == null) {
            if (!this.field3734) {
                super.field6405.method3756(10, super.field6405.field9128);
                super.field6405.method3740(1, 37);
                super.field6405.method3736(class13.field134, 0, (byte) -88);
                super.field6405.method3718(0, class13.field134, arg2 ^ 26916);
                this.field3734 = true;
            }
        } else {
            if (this.field3734) {
                super.field6405.method3736(class171.field2262, 0, (byte) -88);
                super.field6405.method3718(0, class171.field2262, arg2 + -26916);
                this.field3734 = false;
            }
            super.field6405.method3756(10, arg1);
            super.field6405.method3740(arg0, 83);
        }
        ++field3729;
        if (arg2 != 26917) {
            this.method200(false);
        }
    }
}
