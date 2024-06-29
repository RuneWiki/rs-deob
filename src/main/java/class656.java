import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class656 extends class545 {

    @OriginalMember(owner = "client!mw", name = "v", descriptor = "Lmba;")
    private class643 field9397;

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "Lur;")
    private class617 field9392;

    @OriginalMember(owner = "client!mw", name = "s", descriptor = "Lob;")
    private class4 field9394;

    @OriginalMember(owner = "client!mw", name = "u", descriptor = "Z")
    public static boolean field9396 = false;

    @OriginalMember(owner = "client!mw", name = "y", descriptor = "Llc;")
    public static class435 field9400 = new class435(26, 6);

    @OriginalMember(owner = "client!mw", name = "A", descriptor = "Luia;")
    public static class272 field9402 = new class272();

    @OriginalMember(owner = "client!mw", name = "C", descriptor = "I")
    public static int field9404 = -1;

    @OriginalMember(owner = "client!mw", name = "D", descriptor = "F")
    public static float field9405;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!mw", name = "t", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!mw", name = "w", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!mw", name = "x", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "I")
    public static int field9401;

    @OriginalMember(owner = "client!mw", name = "B", descriptor = "I")
    public static int field9403;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(BZ)V")
    public final void method457(byte arg0, boolean arg1) {
        ++field9401;
        OpenGL.glBindProgramARB(34336, this.field9394.field29);
        OpenGL.glEnable(34336);
        super.field7920.method230(class401.field5746, 0, 46);
        if (arg0 <= 101) {
            this.field9392 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "i", descriptor = "(I)V")
    public static void method3755(int arg0) {
        if (arg0 < -59) {
            field9400 = null;
            field9402 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IILec;)V")
    public final void method455(int arg0, int arg1, class101 arg2) {
        if (arg0 != 2) {
            field9400 = null;
        }
        ++field9398;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZZ)V")
    public final void method454(boolean arg0, boolean arg1) {
        ++field9399;
        super.field7920.method386((byte) -120, class684.field9720, class567.field8198);
        if (arg1) {
            field9404 = 117;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)V")
    public final void method451(int arg0, int arg1, int arg2) {
        ++field9393;
        if (!this.field9392.field8795) {
            int var4 = super.field7920.field585 % 4000 * 16 / 4000;
            super.field7920.method264(this.field9392.field8787[var4], -2);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field7920.field585 % 4000) / 4000.0F;
            super.field7920.method264(this.field9392.field8796, arg0 ^ -2);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
        if (arg0 != 0) {
            this.method457((byte) 64, false);
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
    public final void method452(int arg0) {
        ++field9395;
        super.field7920.method230(class234.field3509, 0, arg0 ^ 36);
        OpenGL.glBindProgramARB(34336, 0);
        if (arg0 == 2) {
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
        }
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lmba;Lla;Lur;)V")
    public class656(class643 arg0, class423 arg1, class617 arg2) {
        super(arg0);
        this.field9397 = arg0;
        this.field9392 = arg2;
        if (arg1 != null && this.field9392.method3581(128) && this.field9397.field9257) {
            this.field9394 = class78.method648(34336, arg1.method2591("gl", (byte) 71, "transparent_water"), this.field9397, 34933);
        } else {
            this.field9394 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)Z")
    public final boolean method459(int arg0) {
        ++field9403;
        if (arg0 < 63) {
            this.method455(-63, 93, (class101) null);
        }
        return this.field9394 != null;
    }
}
