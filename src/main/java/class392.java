import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class392 extends class741 {

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Loaa;")
    private class556 field5571;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "Loca;")
    private class639 field5583;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "Leca;")
    private class356 field5582;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "[I")
    public static int[] field5575 = new int[8];

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "Ltq;")
    public static class397 field5578 = new class397();

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public static int field5586 = -1;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "Lqk;")
    public static class1 field5580 = new class1(17, 2);

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "Lae;")
    public static class283 field5585;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILml;)V", line = 3)
    public final void method433(int arg0, int arg1, class34 arg2) {
        if (arg0 != -1) {
            this.method430(-32, false);
        }
        ++field5573;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)Z", line = 17)
    public final boolean method425(byte arg0) {
        ++field5584;
        if (arg0 > -37) {
            return false;
        } else {
            return this.field5582 != null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BZ)V", line = 28)
    public final void method429(byte arg0, boolean arg1) {
        ++field5576;
        OpenGL.glBindProgramARB(34336, this.field5582.field5135);
        OpenGL.glEnable(34336);
        if (arg0 < 15) {
            method2420((byte) 85, -6);
        }
        super.field10209.method1409(class224.field3416, 0, -107);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V", line = 41)
    public final void method430(int arg0, boolean arg1) {
        ++field5574;
        if (arg0 > 96) {
            super.field10209.method1494(class92.field1073, 775, class587.field8280);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V", line = 53)
    public final void method432(int arg0, int arg1, int arg2) {
        int var4 = 118 % ((-18 - arg2) / 51);
        ++field5579;
        if (!this.field5583.field8984) {
            int var5 = super.field10209.field3373 % 4000 * 16 / 4000;
            super.field10209.method1492(this.field5583.field8980[var5], 2);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var6 = (float) (super.field10209.field3373 % 4000) / 4000.0F;
            super.field10209.method1492(this.field5583.field8983, 2);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var6, 0.0F, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V", line = 80)
    public static void method2419(int arg0) {
        field5578 = null;
        field5575 = null;
        field5585 = null;
        int var1 = -55 % ((arg0 - -24) / 54);
        field5580 = null;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Loaa;Lae;Loca;)V", line = 92)
    public class392(class556 arg0, class283 arg1, class639 arg2) {
        super(arg0);
        this.field5571 = arg0;
        this.field5583 = arg2;
        if (arg1 != null && this.field5583.method3674(28) && this.field5571.field7812) {
            this.field5582 = class363.method2285(this.field5571, 34336, arg1.method1861(true, "gl", "transparent_water"), -750);
        } else {
            this.field5582 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)I", line = 109)
    public static final int method2420(byte arg0, int arg1) {
        ++field5581;
        if (arg0 != 18) {
            method2419(55);
        }
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(B)Z", line = 120)
    public static final boolean method2421(byte arg0) {
        ++field5572;
        if (arg0 > -127) {
            method2420((byte) 4, -39);
        }
        return class640.field8992 > 0;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(III)Z", line = 138)
    public static final boolean method2422(int arg0, int arg1, int arg2) {
        if (arg2 != 2048) {
            method2420((byte) 121, 56);
        }
        ++field5577;
        return ~(arg0 & 2048) != -1;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V", line = 154)
    public final void method434(int arg0) {
        ++field5570;
        super.field10209.method1409(class157.field2039, 0, -107);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
        int var2 = -69 % ((arg0 - 10) / 44);
    }
}
