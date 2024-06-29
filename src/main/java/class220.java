import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class220 extends class595 {

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Lpi;")
    private class424 field3146;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "Lpaa;")
    private class534 field3155;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "Loj;")
    private class318 field3156;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "[I")
    public static int[] field3148 = new int[1];

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Ldea;")
    public static class205 field3147 = new class205(64);

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "[I")
    public static int[] field3153 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Lcba;")
    public static class471 field3150 = new class471(14, 1);

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lpi;Lan;Lpaa;)V")
    public class220(class424 arg0, class21 arg1, class534 arg2) {
        super(arg0);
        this.field3146 = arg0;
        this.field3155 = arg2;
        if (this.field3155.method3067(125) && this.field3146.field6021) {
            this.field3156 = class385.method2259(arg1.method228("transparent_water", 125, "gl"), 106, 34336, this.field3146);
        } else {
            this.field3156 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V")
    public final void method299(int arg0, boolean arg1) {
        if (arg0 != -1) {
            field3148 = null;
        }
        super.field8612.method2313(class205.field2890, 114, class137.field2155);
        ++field3149;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)V")
    public final void method298(byte arg0) {
        super.field8612.method2315(class583.field8185, 0, arg0 + 68);
        ++field3152;
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        if (arg0 != -60) {
            this.field3156 = null;
        }
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)Z")
    public final boolean method297(byte arg0) {
        if (arg0 > -119) {
            this.method297((byte) 87);
        }
        ++field3151;
        return this.field3156 != null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lbaa;II)V")
    public final void method301(class445 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.field3146 = null;
        }
        ++field3145;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZZ)V")
    public final void method302(boolean arg0, boolean arg1) {
        ++field3144;
        if (!arg1) {
            this.method298((byte) 34);
        }
        OpenGL.glBindProgramARB(34336, this.field3156.field4312);
        OpenGL.glEnable(34336);
        super.field8612.method2315(class459.field6466, 0, 8);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
    public final void method303(int arg0, int arg1, int arg2) {
        if (arg2 >= -114) {
            this.method303(-78, 28, -100);
        }
        if (this.field3155.field7467) {
            float var4 = (float) (super.field8612.field5401 % 4000) / 4000.0F;
            super.field8612.method2267(2, this.field3155.field7469);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
        } else {
            int var5 = super.field8612.field5401 % 4000 * 16 / 4000;
            super.field8612.method2267(2, this.field3155.field7468[var5]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        ++field3154;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
    public static void method1418(int arg0) {
        field3147 = null;
        field3150 = null;
        field3148 = null;
        field3153 = null;
        if (arg0 != 34336) {
            method1418(42);
        }
    }
}
