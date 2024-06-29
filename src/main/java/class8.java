import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class8 extends class509 {

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "[F")
    private float[] field66 = new float[4];

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "Lon;")
    private class596 field73;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "Lon;")
    private class596 field77;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "Lon;")
    private class596 field75;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "Lon;")
    private class596 field69;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "Z")
    private boolean field65;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "Lrg;")
    public static class563 field74;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "Z")
    private boolean field67;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "Z")
    private boolean field70;

    static {
        new class145("", 76);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZB)V", line = 7)
    public final void method35(boolean arg0, byte arg1) {
        ++field79;
        this.field70 = arg0;
        int var3 = -97 / ((40 - arg1) / 36);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V", line = 18)
    public final void method36(boolean arg0) {
        ++field71;
        int var2 = super.field7558.method1131(-83);
        class124 var3 = super.field7558.method1132(1);
        var3.method765(this.field66, -1.0F, 15, (float) var2, 0.0F, 0.0F);
        if (this.field70) {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field69.field8783 : this.field77.field8783);
        } else {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field75.field8783 : this.field73.field8783);
        }
        OpenGL.glEnable(34336);
        if (!arg0) {
            this.field67 = true;
            OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field66[0], this.field66[1], this.field66[2], this.field66[3]);
            this.method41(-92);
        }
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)V", line = 48)
    public static void method37(int arg0) {
        field74 = null;
        if (arg0 >= -16) {
            field74 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V", line = 58)
    public final void method38(byte arg0) {
        if (arg0 != 59) {
            this.field67 = false;
        }
        if (this.field67) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field67 = false;
        }
        ++field68;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lqba;Ldda;)V", line = 79)
    public class8(class540 arg0, class597 arg1) {
        super(arg0);
        if (arg0.field8074) {
            this.field73 = class483.method2925(arg1.method3466("uw_ground_unlit", 0, "gl"), -29157, arg0, 34336);
            this.field77 = class483.method2925(arg1.method3466("uw_ground_lit", 0, "gl"), -29157, arg0, 34336);
            this.field75 = class483.method2925(arg1.method3466("uw_model_unlit", 0, "gl"), -29157, arg0, 34336);
            this.field69 = class483.method2925(arg1.method3466("uw_model_lit", 0, "gl"), -29157, arg0, 34336);
            this.field65 = this.field69 != null & this.field73 != null & this.field77 != null & this.field75 != null;
        } else {
            this.field65 = false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)V", line = 108)
    public final void method39(int arg0, boolean arg1) {
        if (arg0 == 0) {
            ++field78;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)Z", line = 123)
    public final boolean method40(int arg0) {
        ++field76;
        if (arg0 <= 44) {
            this.method41(93);
        }
        return this.field65;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 134)
    public final void method41(int arg0) {
        if (arg0 <= -88) {
            ++field81;
            if (this.field67) {
                OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (-1280 + super.field7558.method960()), (float) (-768 + super.field7558.method960()), 1.0F / (float) super.field7558.method1156((byte) 113), (float) super.field7558.method1116((byte) -124) / 255.0F);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZILmn;)V", line = 147)
    public final void method42(boolean arg0, int arg1, class60 arg2) {
        super.field7558.method1152(arg2, arg0);
        ++field72;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBI)V", line = 155)
    public final void method43(int arg0, byte arg1, int arg2) {
        if (arg1 != -60) {
            this.field66 = null;
        }
        ++field80;
    }
}
