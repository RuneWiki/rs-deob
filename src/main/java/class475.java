import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class475 extends class213 {

    @OriginalMember(owner = "client!tfa", name = "t", descriptor = "[F")
    private float[] field6415 = new float[4];

    @OriginalMember(owner = "client!tfa", name = "B", descriptor = "Lwaa;")
    private class536 field6423;

    @OriginalMember(owner = "client!tfa", name = "z", descriptor = "Lwaa;")
    private class536 field6421;

    @OriginalMember(owner = "client!tfa", name = "y", descriptor = "Lwaa;")
    private class536 field6420;

    @OriginalMember(owner = "client!tfa", name = "v", descriptor = "Lwaa;")
    private class536 field6417;

    @OriginalMember(owner = "client!tfa", name = "A", descriptor = "Z")
    private boolean field6422;

    @OriginalMember(owner = "client!tfa", name = "l", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!tfa", name = "n", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!tfa", name = "o", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!tfa", name = "q", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!tfa", name = "r", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!tfa", name = "s", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!tfa", name = "u", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!tfa", name = "w", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!tfa", name = "x", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!tfa", name = "m", descriptor = "Z")
    private boolean field6408;

    @OriginalMember(owner = "client!tfa", name = "p", descriptor = "Z")
    private boolean field6411;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)V", line = 4)
    public final void method1326(byte arg0) {
        ++field6409;
        int var2 = super.field2766.method1934(9059);
        class492 var3 = super.field2766.method1966(false);
        var3.method2783(48, -1.0F, this.field6415, (float) var2, 0.0F, 0.0F);
        if (this.field6411) {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field6421.field7368 : this.field6417.field7368);
        } else {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field6420.field7368 : this.field6423.field7368);
        }
        OpenGL.glEnable(34336);
        if (arg0 < 72) {
            this.method1326((byte) -60);
        }
        this.field6408 = true;
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field6415[0], this.field6415[1], this.field6415[2], this.field6415[3]);
        this.method874(false);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Z)V", line = 33)
    public final void method874(boolean arg0) {
        ++field6418;
        if (arg0) {
            this.method20(-4);
        }
        if (this.field6408) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (-1280 + super.field2766.method1924()), (float) (super.field2766.method1924() + -768), 1.0F / (float) super.field2766.method1971(5), (float) super.field2766.method2012(!arg0) / 255.0F);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V", line = 51)
    public final void method20(int arg0) {
        if (arg0 < 32) {
            this.method19(-15, 37, (class619) null);
        }
        ++field6414;
        if (this.field6408) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field6408 = false;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(III)V", line = 75)
    public final void method28(int arg0, int arg1, int arg2) {
        if (arg0 != -16595) {
            this.field6411 = true;
        }
        ++field6410;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IILaw;)V", line = 86)
    public final void method19(int arg0, int arg1, class619 arg2) {
        if (arg1 != 8) {
            this.field6420 = null;
        }
        ++field6413;
        super.field2766.method1884(arg2, -2);
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lmc;Lpq;)V", line = 99)
    public class475(class381 arg0, class159 arg1) {
        super(arg0);
        if (arg0.field5548) {
            this.field6423 = class316.method2039(arg0, arg1.method1063("gl", "uw_ground_unlit", -118), 0, 34336);
            this.field6421 = class316.method2039(arg0, arg1.method1063("gl", "uw_ground_lit", 70), 0, 34336);
            this.field6420 = class316.method2039(arg0, arg1.method1063("gl", "uw_model_unlit", 79), 0, 34336);
            this.field6417 = class316.method2039(arg0, arg1.method1063("gl", "uw_model_lit", -101), 0, 34336);
            this.field6422 = this.field6417 != null & this.field6420 != null & this.field6421 != null & this.field6423 != null;
        } else {
            this.field6422 = false;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(ZI)V", line = 117)
    public final void method23(boolean arg0, int arg1) {
        ++field6416;
        if (arg1 != -18) {
            this.field6423 = null;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "(B)Z", line = 133)
    public final boolean method22(byte arg0) {
        if (arg0 != 75) {
            this.method17(false, -22);
        }
        ++field6419;
        return this.field6422;
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(ZI)V", line = 146)
    public final void method17(boolean arg0, int arg1) {
        ++field6412;
        this.field6411 = arg0;
        if (arg1 < 37) {
            this.field6420 = null;
        }
    }
}
