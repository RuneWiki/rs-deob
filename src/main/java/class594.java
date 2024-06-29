import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class594 extends class188 {

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "Z")
    private boolean field8104 = false;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "[F")
    private float[] field8098 = new float[4];

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "Lru;")
    private class205 field8103;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "Lru;")
    private class205 field8101;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Lru;")
    private class205 field8097;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "Lru;")
    private class205 field8106;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "Z")
    private boolean field8109;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Lec;")
    private class248 field8100;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "I")
    public static int field8116 = 0;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "Lmga;")
    public static class739 field8112 = new class739(35, 4);

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field8102;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public static int field8105;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
    public static int field8114;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "Z")
    private boolean field8107;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "Z")
    private boolean field8111;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(B)V")
    public final void method1306(byte arg0) {
        if (arg0 != -36) {
            this.field8098 = null;
        }
        ++field8102;
        int var2 = super.field2510.method3521(125);
        class754 var3 = super.field2510.method3448(0);
        if (!this.field8111) {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field8097.field2683 : this.field8103.field2683);
        } else {
            OpenGL.glBindProgramARB(34336, ~var2 == Integer.MIN_VALUE ? this.field8101.field2683 : this.field8106.field2683);
        }
        OpenGL.glEnable(34336);
        this.field8107 = true;
        var3.method4207(-1.0F, 1, 0.0F, (float) var2, 0.0F, this.field8098);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field8098[0], this.field8098[1], this.field8098[2], this.field8098[3]);
        this.method1305((byte) -128);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)Z")
    public final boolean method956(int arg0) {
        if (arg0 < 53) {
            this.method956(51);
        }
        ++field8114;
        return this.field8109;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lpa;Laj;)V")
    public class594(class391 arg0, class333 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field5791) {
            this.field8103 = class685.method3807((byte) -63, arg1.method2111("gl", "uw_ground_unlit", 3), 34336, arg0);
            this.field8101 = class685.method3807((byte) -63, arg1.method2111("gl", "uw_ground_lit", 3), 34336, arg0);
            this.field8097 = class685.method3807((byte) -63, arg1.method2111("gl", "uw_model_unlit", 3), 34336, arg0);
            this.field8106 = class685.method3807((byte) -63, arg1.method2111("gl", "uw_model_lit", 3), 34336, arg0);
            if (!(this.field8097 != null & this.field8101 != null & this.field8103 != null & this.field8106 != null)) {
                this.field8109 = false;
            } else {
                this.field8100 = super.field2510.method3517((byte) -121, 2, 1, false, new int[] { 0, -1 });
                this.field8100.method1667(false, false, 30135);
                this.field8109 = true;
            }
        } else {
            this.field8109 = false;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBLbm;)V")
    public final void method959(int arg0, byte arg1, class123 arg2) {
        if (arg2 != null) {
            if (this.field8104) {
                super.field2510.method3514((byte) -78, class122.field1782, 0);
                super.field2510.method3509(0, class122.field1782, -111);
                this.field8104 = false;
            }
            super.field2510.method3520(true, arg2);
            super.field2510.method3503((byte) 73, arg0);
        } else if (!this.field8104) {
            super.field2510.method3520(true, super.field2510.field8683);
            super.field2510.method3503((byte) 101, 1);
            super.field2510.method3514((byte) 95, class386.field5627, 0);
            super.field2510.method3509(0, class386.field5627, -110);
            this.field8104 = true;
        }
        ++field8110;
        int var4 = -92 % ((60 - arg1) / 61);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)V")
    public final void method962(int arg0, boolean arg1) {
        ++field8105;
        if (arg0 != 22789) {
            this.method955((byte) 25);
        }
    }

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "(B)V")
    public final void method955(byte arg0) {
        ++field8108;
        super.field2510.method3470((byte) 124, 1);
        super.field2510.method3520(true, (class123) null);
        if (arg0 <= 54) {
            method3319(70);
        }
        super.field2510.method3513(class364.field5299, class364.field5299, 100);
        super.field2510.method3514((byte) 115, class122.field1782, 0);
        super.field2510.method3514((byte) 97, class109.field1493, 2);
        super.field2510.method3509(0, class122.field1782, -123);
        super.field2510.method3470((byte) -64, 0);
        if (this.field8104) {
            super.field2510.method3514((byte) 106, class122.field1782, 0);
            super.field2510.method3509(0, class122.field1782, -82);
            this.field8104 = false;
        }
        if (this.field8107) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field8107 = false;
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)V")
    public static void method3319(int arg0) {
        field8112 = null;
        if (arg0 != 0) {
            field8116 = -84;
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(B)V")
    public final void method1305(byte arg0) {
        if (arg0 <= -126) {
            ++field8113;
            if (this.field8107) {
                int var2 = super.field2510.method457();
                int var3 = super.field2510.method539();
                float var4 = (float) var2 + -((float) (var2 - var3) * 0.125F);
                float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field2510.method3450((byte) 127), (float) super.field2510.method3455((byte) 97) / 255.0F);
                super.field2510.method3470((byte) -51, 1);
                super.field2510.method3525(super.field2510.method3474(false), 1);
                super.field2510.method3470((byte) 126, 0);
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIZ)V")
    public final void method958(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method1306((byte) -57);
        }
        ++field8099;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)V")
    public final void method961(boolean arg0, int arg1) {
        ++field8115;
        this.field8111 = arg0;
        super.field2510.method3470((byte) 17, 1);
        super.field2510.method3520(true, this.field8100);
        super.field2510.method3513(class521.field7150, class412.field5923, 121);
        super.field2510.method3514((byte) -50, class109.field1493, 0);
        super.field2510.method907(true, false, (byte) -67, arg1, class122.field1782);
        super.field2510.method3509(0, class386.field5627, arg1 + -89);
        super.field2510.method3470((byte) 123, 0);
        this.method1306((byte) -36);
    }
}
