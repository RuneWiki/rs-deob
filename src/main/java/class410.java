import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class410 extends class262 {

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "Ldda;")
    private class349 field5800;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "Lvt;")
    private class276 field5801;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "Lqd;")
    private class415 field5798;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "Lia;")
    public static class544 field5804;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "[Lf;")
    public static class701[] field5803;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field5806;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZI)V")
    public final void method372(boolean arg0, int arg1) {
        if (arg1 == 0) {
            super.field3601.method2303((byte) 107, class698.field9875, class231.field3011);
            ++field5808;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILoa;B)V")
    public final void method371(int arg0, class644 arg1, byte arg2) {
        if (arg2 < 80) {
            field5806 = null;
        }
        ++field5809;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V")
    public static final void method2473(boolean arg0) {
        if (arg0) {
            class281.field3808 = class551.field8014;
            class155.field1899 = class340.field4500;
        } else {
            class281.field3808 = class177.field2183;
            class155.field1899 = class399.field5631;
        }
        class663.field9391 = class281.field3808.length;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
    public final void method374(int arg0) {
        super.field3601.method2301(0, class519.field7612, 2);
        if (arg0 < 42) {
            field5804 = null;
        }
        ++field5799;
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IZI)V")
    public final void method373(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method375(117);
        }
        ++field5805;
        if (!this.field5801.field3776) {
            int var4 = super.field3601.field5487 % 4000 * 16 / 4000;
            super.field3601.method2316((byte) 90, this.field5801.field3770[var4]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field3601.field5487 % 4000) / 4000.0F;
            super.field3601.method2316((byte) 96, this.field5801.field3777);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)Z")
    public final boolean method375(int arg0) {
        if (arg0 != -18095) {
            return true;
        } else {
            ++field5802;
            return this.field5798 != null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "(I)V")
    public static void method2474(int arg0) {
        field5804 = null;
        if (arg0 == 0) {
            field5806 = null;
            field5803 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IZ)V")
    public final void method377(int arg0, boolean arg1) {
        ++field5807;
        OpenGL.glBindProgramARB(34336, this.field5798.field5871);
        OpenGL.glEnable(34336);
        if (arg0 >= 37) {
            super.field3601.method2301(0, class141.field1760, 2);
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Ldda;Ljn;Lvt;)V")
    public class410(class349 arg0, class668 arg1, class276 arg2) {
        super(arg0);
        this.field5800 = arg0;
        this.field5801 = arg2;
        if (arg1 != null && this.field5801.method1670(false) && this.field5800.field4668) {
            this.field5798 = class400.method2419(arg1.method3778(94, "gl", "transparent_water"), this.field5800, -70, 34336);
        } else {
            this.field5798 = null;
        }
    }
}
