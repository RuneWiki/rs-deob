import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class332 extends class669 {

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "[F")
    private float[] field4541 = new float[4];

    @OriginalMember(owner = "client!ws", name = "B", descriptor = "Z")
    private boolean field4556;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "Lmi;")
    private class463 field4545;

    @OriginalMember(owner = "client!ws", name = "E", descriptor = "Lmi;")
    private class463 field4559;

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "Lmi;")
    private class463 field4554;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "Lmi;")
    private class463 field4546;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "Ldb;")
    public static class298 field4547 = new class298(78, 10);

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!ws", name = "A", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!ws", name = "C", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!ws", name = "D", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "Z")
    private boolean field4544;

    @OriginalMember(owner = "client!ws", name = "y", descriptor = "Z")
    private boolean field4553;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)Z", line = 6)
    public final boolean method1(int arg0) {
        if (arg0 != 9567) {
            this.method4(true, 34);
        }
        ++field4549;
        return this.field4556;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BII)V", line = 18)
    public final void method2(byte arg0, int arg1, int arg2) {
        if (arg0 <= 77) {
            this.method5(false, true);
        }
        ++field4555;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZZ)V", line = 29)
    public final void method5(boolean arg0, boolean arg1) {
        ++field4542;
        if (!arg1) {
            this.field4553 = arg0;
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(Z)V", line = 45)
    public static void method1970(boolean arg0) {
        field4547 = null;
        if (!arg0) {
            method1971(16, 25, -95);
        }
    }

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "(I)V", line = 55)
    public final void method6(int arg0) {
        if (this.field4544) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field4544 = false;
        }
        ++field4543;
        if (arg0 != -21106) {
            this.field4554 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IILnq;)V", line = 75)
    public final void method7(int arg0, int arg1, class430 arg2) {
        super.field9490.method897(arg2, true);
        ++field4552;
        if (arg1 != -21254) {
            this.field4559 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)Z", line = 95)
    public static final boolean method1971(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            field4547 = null;
        }
        ++field4551;
        return class254.method1556(arg0 ^ -2, arg1, arg2) & class623.method3405(arg1, arg0 + 2047, arg2);
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V", line = 107)
    public final void method1972(byte arg0) {
        ++field4558;
        int var2 = 46 % ((arg0 - -74) / 44);
        int var3 = super.field9490.method832((byte) 62);
        class74 var4 = super.field9490.method870((byte) -32);
        var4.method561(0.0F, 0.0F, (byte) 77, (float) var3, this.field4541, -1.0F);
        if (this.field4553) {
            OpenGL.glBindProgramARB(34336, var3 != Integer.MAX_VALUE ? this.field4546.field6258 : this.field4559.field6258);
        } else {
            OpenGL.glBindProgramARB(34336, ~var3 != Integer.MIN_VALUE ? this.field4554.field6258 : this.field4545.field6258);
        }
        OpenGL.glEnable(34336);
        this.field4544 = true;
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field4541[0], this.field4541[1], this.field4541[2], this.field4541[3]);
        this.method1974(true);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZI)V", line = 135)
    public final void method4(boolean arg0, int arg1) {
        ++field4557;
        if (arg1 != 9512) {
            this.field4556 = false;
        }
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Ldc;Lbi;)V", line = 189)
    public class332(class5 arg0, class449 arg1) {
        super(arg0);
        if (!arg0.field143) {
            this.field4556 = false;
        } else {
            this.field4545 = class290.method1787(arg1.method2532("gl", "uw_ground_unlit", -24518), arg0, 34336, (byte) 21);
            this.field4559 = class290.method1787(arg1.method2532("gl", "uw_ground_lit", -24518), arg0, 34336, (byte) 21);
            this.field4554 = class290.method1787(arg1.method2532("gl", "uw_model_unlit", -24518), arg0, 34336, (byte) 21);
            this.field4546 = class290.method1787(arg1.method2532("gl", "uw_model_lit", -24518), arg0, 34336, (byte) 21);
            this.field4556 = this.field4545 != null & this.field4559 != null & this.field4554 != null & this.field4546 != null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lee;B)Z", line = 149)
    public static final boolean method1973(class634 arg0, byte arg1) {
        ++field4548;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field8540) {
            return false;
        } else if (!arg0.method3507(class567.field7495, true)) {
            return false;
        } else {
            int var2 = -29 % ((arg1 - -5) / 56);
            if (class169.field2612.method2918((long) arg0.field8533, (byte) -125) != null) {
                return false;
            } else {
                return class375.field5058.method2918((long) arg0.field8516, (byte) -125) == null;
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V", line = 176)
    public final void method1974(boolean arg0) {
        if (this.field4544) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (-1280 + super.field9490.method411()), (float) (-768 + super.field9490.method411()), 1.0F / (float) super.field9490.method867(-100), (float) super.field9490.method880((byte) 125) / 255.0F);
        }
        if (arg0) {
            ++field4550;
        }
    }
}
