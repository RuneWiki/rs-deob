import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class23 extends class139 {

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Lel;")
    private class513 field265;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Ltca;")
    private class161 field263;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "Lnm;")
    private class441 field270;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field260 = 0;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "F")
    public static float field266 = 1024.0F;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lel;Lpfa;Ltca;)V")
    public class23(class513 arg0, class275 arg1, class161 arg2) {
        super(arg0);
        this.field265 = arg0;
        this.field263 = arg2;
        if (this.field263.method989(16) && this.field265.field6527) {
            this.field270 = class492.method2667(6447, 34336, this.field265, arg1.method1649(-1, "transparent_water", "gl"));
        } else {
            this.field270 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
    public final void method148(int arg0, int arg1, int arg2) {
        if (!this.field263.field1890) {
            int var4 = super.field1681.field2822 % 4000 * 16 / 4000;
            super.field1681.method1349(this.field263.field1896[var4], false);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field1681.field2822 % 4000) / 4000.0F;
            super.field1681.method1349(this.field263.field1891, false);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
        ++field261;
        if (arg0 != -2) {
            this.method153(false, 98);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public final void method149(int arg0) {
        super.field1681.method1274((byte) -126, class290.field3662, 0);
        ++field262;
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
        if (arg0 >= -4) {
            this.method150((byte) -52, 86, (class562) null);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BILgl;)V")
    public final void method150(byte arg0, int arg1, class562 arg2) {
        if (arg0 <= 103) {
            this.method148(-58, -63, -120);
        }
        ++field264;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)V")
    public final void method151(int arg0, boolean arg1) {
        super.field1681.method1287(class375.field4829, (byte) 57, class291.field3672);
        if (arg0 != 43) {
            this.method148(56, -7, 80);
        }
        ++field268;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)Z")
    public final boolean method152(int arg0) {
        int var2 = 43 % ((50 - arg0) / 48);
        ++field267;
        return this.field270 != null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)V")
    public final void method153(boolean arg0, int arg1) {
        if (arg1 != 43) {
            field260 = -107;
        }
        ++field269;
        OpenGL.glBindProgramARB(34336, this.field270.field5540);
        OpenGL.glEnable(34336);
        super.field1681.method1274((byte) 44, class251.field3237, 0);
    }
}
