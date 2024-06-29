import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class561 extends class155 {

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "Loia;")
    private class97 field7953;

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "Luw;")
    private class440 field7950;

    @OriginalMember(owner = "client!tp", name = "r", descriptor = "Lll;")
    private class386 field7955;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "Ljia;")
    public static class645 field7952 = new class645();

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!tp", name = "q", descriptor = "I")
    public static int field7954;

    @OriginalMember(owner = "client!tp", name = "s", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!tp", name = "t", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!tp", name = "v", descriptor = "I")
    public static int field7959;

    @OriginalMember(owner = "client!tp", name = "x", descriptor = "I")
    public static int field7961;

    @OriginalMember(owner = "client!tp", name = "y", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!tp", name = "w", descriptor = "Lrt;")
    public static class241 field7960;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "(I)V")
    public static void method3250(int arg0) {
        field7960 = null;
        if (arg0 != 34336) {
            method3251(67, (byte) -34);
        }
        field7952 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZZ)V")
    public final void method257(boolean arg0, boolean arg1) {
        if (!arg0) {
            ++field7959;
            super.field2533.method3118(class639.field8801, class371.field5051, 0);
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)Z")
    public final boolean method250(int arg0) {
        ++field7954;
        int var2 = 84 % ((-8 - arg0) / 41);
        return this.field7955 != null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lbr;II)V")
    public final void method259(class416 arg0, int arg1, int arg2) {
        ++field7951;
        if (arg1 > -71) {
            field7960 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZ)V")
    public final void method258(int arg0, boolean arg1) {
        ++field7958;
        OpenGL.glBindProgramARB(34336, this.field7955.field5312);
        if (arg0 != 205) {
            this.field7955 = null;
        }
        OpenGL.glEnable(34336);
        super.field2533.method3143(class606.field8459, true, 0);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIB)V")
    public final void method254(int arg0, int arg1, byte arg2) {
        if (!this.field7950.field5974) {
            int var4 = super.field2533.field7757 % 4000 * 16 / 4000;
            super.field2533.method3090(this.field7950.field5970[var4], (byte) -16);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field2533.field7757 % 4000) / 4000.0F;
            super.field2533.method3090(this.field7950.field5973, (byte) 99);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
        if (arg2 != -92) {
            this.method257(false, true);
        }
        ++field7957;
    }

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "(I)V")
    public final void method255(int arg0) {
        super.field2533.method3143(class327.field4459, true, 0);
        ++field7961;
        OpenGL.glBindProgramARB(34336, 0);
        if (arg0 < -119) {
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
        }
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Loia;Lgj;Luw;)V")
    public class561(class97 arg0, class662 arg1, class440 arg2) {
        super(arg0);
        this.field7953 = arg0;
        this.field7950 = arg2;
        if (arg1 != null && this.field7950.method2564(128) && this.field7953.field1597) {
            this.field7955 = class9.method59(34336, this.field7953, 0, arg1.method3726(-74, "gl", "transparent_water"));
        } else {
            this.field7955 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IB)V")
    public static final void method3251(int arg0, byte arg1) {
        class276.field3827.method265(arg0, -82);
        ++field7956;
        if (arg1 > -31) {
            field7962 = 89;
        }
    }
}
