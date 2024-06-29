import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class454 extends class606 {

    @OriginalMember(owner = "client!rca", name = "u", descriptor = "Lfha;")
    private class378 field6412;

    @OriginalMember(owner = "client!rca", name = "s", descriptor = "Lic;")
    private class698 field6410;

    @OriginalMember(owner = "client!rca", name = "y", descriptor = "Lwba;")
    private class48 field6416;

    @OriginalMember(owner = "client!rca", name = "v", descriptor = "Leh;")
    public static class360 field6413 = new class360();

    @OriginalMember(owner = "client!rca", name = "w", descriptor = "I")
    public static int field6414 = -1;

    @OriginalMember(owner = "client!rca", name = "A", descriptor = "I")
    public static int field6418 = 0;

    @OriginalMember(owner = "client!rca", name = "x", descriptor = "I")
    public static int field6415 = -1;

    @OriginalMember(owner = "client!rca", name = "B", descriptor = "Z")
    public static boolean field6419 = false;

    @OriginalMember(owner = "client!rca", name = "o", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!rca", name = "p", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!rca", name = "q", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!rca", name = "r", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!rca", name = "t", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!rca", name = "z", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)V", line = 4)
    public final void method521(byte arg0) {
        super.field8525.method1664((byte) -47, class597.field8397, 0);
        ++field6407;
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        int var2 = -36 / ((arg0 - -26) / 56);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZI)V", line = 18)
    public final void method517(boolean arg0, int arg1) {
        OpenGL.glBindProgramARB(34336, this.field6416.field559);
        ++field6409;
        OpenGL.glEnable(34336);
        super.field8525.method1664((byte) -120, class240.field3203, 0);
        if (arg1 >= -64) {
            this.field6416 = null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(III)V", line = 31)
    public final void method516(int arg0, int arg1, int arg2) {
        ++field6406;
        if (this.field6410.field9625) {
            float var4 = (float) (super.field8525.field3567 % 4000) / 4000.0F;
            super.field8525.method1663(this.field6410.field9629, -2);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
        } else {
            int var5 = super.field8525.field3567 % 4000 * 16 / 4000;
            super.field8525.method1663(this.field6410.field9622[var5], -2);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        if (arg1 <= 91) {
            this.method523((class12) null, -15, -90);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lma;II)V", line = 56)
    public final void method523(class12 arg0, int arg1, int arg2) {
        ++field6417;
        if (arg2 != 3) {
            field6418 = -89;
        }
    }

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "(B)V", line = 68)
    public static void method2702(byte arg0) {
        field6413 = null;
        if (arg0 <= 22) {
            field6415 = 73;
        }
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)Z", line = 79)
    public final boolean method525(int arg0) {
        ++field6408;
        if (arg0 <= 19) {
            this.method517(false, -105);
        }
        return this.field6416 != null;
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lfha;Lfp;Lic;)V", line = 98)
    public class454(class378 arg0, class323 arg1, class698 arg2) {
        super(arg0);
        this.field6412 = arg0;
        this.field6410 = arg2;
        if (arg1 != null && this.field6410.method3925(-30571) && this.field6412.field5408) {
            this.field6416 = class63.method538(arg1.method2102("gl", "transparent_water", 0), this.field6412, (byte) -113, 34336);
        } else {
            this.field6416 = null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZ)V", line = 132)
    public final void method518(int arg0, boolean arg1) {
        if (arg0 != 5486) {
            this.method516(7, -33, 24);
        }
        super.field8525.method1613(arg0 ^ -5492, class719.field9987, class170.field2330);
        ++field6411;
    }
}
