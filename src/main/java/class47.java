import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class47 extends class545 {

    @OriginalMember(owner = "client!jea", name = "x", descriptor = "[F")
    private float[] field773 = new float[4];

    @OriginalMember(owner = "client!jea", name = "t", descriptor = "Z")
    private boolean field769 = false;

    @OriginalMember(owner = "client!jea", name = "C", descriptor = "Lob;")
    private class4 field778;

    @OriginalMember(owner = "client!jea", name = "E", descriptor = "Lob;")
    private class4 field780;

    @OriginalMember(owner = "client!jea", name = "r", descriptor = "Lob;")
    private class4 field767;

    @OriginalMember(owner = "client!jea", name = "s", descriptor = "Lob;")
    private class4 field768;

    @OriginalMember(owner = "client!jea", name = "q", descriptor = "Lug;")
    private class60 field766;

    @OriginalMember(owner = "client!jea", name = "I", descriptor = "Z")
    private boolean field784;

    @OriginalMember(owner = "client!jea", name = "A", descriptor = "Z")
    public static boolean field776 = false;

    @OriginalMember(owner = "client!jea", name = "K", descriptor = "[I")
    public static int[] field786 = new int[50];

    @OriginalMember(owner = "client!jea", name = "u", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!jea", name = "v", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!jea", name = "w", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!jea", name = "z", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!jea", name = "B", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!jea", name = "D", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!jea", name = "F", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!jea", name = "G", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!jea", name = "J", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!jea", name = "y", descriptor = "Z")
    private boolean field774;

    @OriginalMember(owner = "client!jea", name = "H", descriptor = "Z")
    private boolean field783;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(III)V")
    public final void method451(int arg0, int arg1, int arg2) {
        ++field771;
        if (arg0 != 0) {
            field776 = true;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)V")
    public final void method452(int arg0) {
        super.field7920.method208(8, 1);
        ++field785;
        super.field7920.method264((class101) null, -2);
        super.field7920.method386((byte) -8, class281.field3934, class281.field3934);
        super.field7920.method230(class234.field3509, 0, arg0 + 84);
        super.field7920.method230(class231.field3462, arg0, 93);
        super.field7920.method242((byte) -113, class234.field3509, 0);
        super.field7920.method208(8, 0);
        if (this.field769) {
            super.field7920.method230(class234.field3509, 0, 23);
            super.field7920.method242((byte) -121, class234.field3509, 0);
            this.field769 = false;
        }
        if (this.field774) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field774 = false;
        }
    }

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "(I)V")
    public final void method453(int arg0) {
        if (this.field774) {
            int var2 = super.field7920.method227();
            int var3 = super.field7920.method387();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 - (float) (var2 - var3) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field7920.method400(-226058728), (float) super.field7920.method220((byte) 45) / 255.0F);
            super.field7920.method208(8, 1);
            super.field7920.method213(super.field7920.method410(105), arg0 + 3);
            super.field7920.method208(8, 0);
        }
        if (arg0 != 0) {
            method458((byte) -79);
        }
        ++field779;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ZZ)V")
    public final void method454(boolean arg0, boolean arg1) {
        if (!arg1) {
            ++field777;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IILec;)V")
    public final void method455(int arg0, int arg1, class101 arg2) {
        if (arg0 == 2) {
            ++field770;
            if (arg2 == null) {
                if (!this.field769) {
                    super.field7920.method264(super.field7920.field547, arg0 + -4);
                    super.field7920.method411(arg0 + 17022, 1);
                    super.field7920.method230(class401.field5746, 0, arg0 ^ 37);
                    super.field7920.method242((byte) -111, class401.field5746, 0);
                    this.field769 = true;
                    return;
                }
            } else {
                if (this.field769) {
                    super.field7920.method230(class234.field3509, 0, 50);
                    super.field7920.method242((byte) -116, class234.field3509, 0);
                    this.field769 = false;
                }
                super.field7920.method264(arg2, -2);
                super.field7920.method411(17024, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "(I)V")
    public final void method456(int arg0) {
        ++field772;
        int var2 = super.field7920.method237((byte) -50);
        class417 var3 = super.field7920.method323((byte) -26);
        if (!this.field783) {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field767.field29 : this.field778.field29);
        } else {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field768.field29 : this.field780.field29);
        }
        OpenGL.glEnable(34336);
        this.field774 = true;
        var3.method2524(-1.0F, this.field773, (float) arg0, (float) var2, false, 0.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field773[0], this.field773[1], this.field773[2], this.field773[3]);
        this.method453(0);
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lmba;Lla;)V")
    public class47(class643 arg0, class423 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field9257) {
            this.field778 = class78.method648(34336, arg1.method2591("gl", (byte) 71, "uw_ground_unlit"), arg0, 34933);
            this.field780 = class78.method648(34336, arg1.method2591("gl", (byte) 71, "uw_ground_lit"), arg0, 34933);
            this.field767 = class78.method648(34336, arg1.method2591("gl", (byte) 71, "uw_model_unlit"), arg0, 34933);
            this.field768 = class78.method648(34336, arg1.method2591("gl", (byte) 71, "uw_model_lit"), arg0, 34933);
            if (this.field767 != null & this.field780 != null & this.field778 != null & this.field768 != null) {
                this.field766 = super.field7920.method303(false, 1, 2, new int[] { 0, -1 }, -5);
                this.field766.method560(false, 16609, false);
                this.field784 = true;
            } else {
                this.field784 = false;
            }
        } else {
            this.field784 = false;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(BZ)V")
    public final void method457(byte arg0, boolean arg1) {
        ++field782;
        this.field783 = arg1;
        super.field7920.method208(8, 1);
        super.field7920.method264(this.field766, -2);
        super.field7920.method386((byte) -23, class567.field8198, class596.field8472);
        super.field7920.method230(class231.field3462, 0, 81);
        super.field7920.method282(false, true, (byte) -60, 2, class234.field3509);
        super.field7920.method242((byte) -113, class401.field5746, 0);
        super.field7920.method208(8, 0);
        this.method456(0);
        if (arg0 <= 101) {
            this.method451(112, -12, -1);
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)V")
    public static void method458(byte arg0) {
        if (arg0 > 88) {
            field786 = null;
        }
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)Z")
    public final boolean method459(int arg0) {
        if (arg0 <= 63) {
            this.method455(117, -77, (class101) null);
        }
        ++field781;
        return this.field784;
    }
}
