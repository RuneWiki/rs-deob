import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class313 extends class712 {

    @OriginalMember(owner = "client!haa", name = "A", descriptor = "Lhj;")
    private class47 field4351;

    @OriginalMember(owner = "client!haa", name = "z", descriptor = "Lep;")
    private class374 field4350;

    @OriginalMember(owner = "client!haa", name = "x", descriptor = "Ljfa;")
    private class707 field4348;

    @OriginalMember(owner = "client!haa", name = "B", descriptor = "Lst;")
    public static class335 field4352 = new class335(62, 2);

    @OriginalMember(owner = "client!haa", name = "C", descriptor = "[I")
    public static int[] field4353 = new int[500];

    @OriginalMember(owner = "client!haa", name = "r", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!haa", name = "s", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!haa", name = "t", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!haa", name = "u", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!haa", name = "v", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!haa", name = "w", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!haa", name = "y", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BZ)V")
    public final void method394(byte arg0, boolean arg1) {
        if (arg0 <= 39) {
            this.method396(false);
        }
        super.field9945.method1388(class161.field2237, (byte) 52, class87.field1239);
        ++field4342;
    }

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "(Z)Z")
    public final boolean method396(boolean arg0) {
        ++field4347;
        if (arg0) {
            this.method393(33, 41, 81);
        }
        return this.field4348 != null;
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(Z)V")
    public final void method389(boolean arg0) {
        super.field9945.method1408(0, 0, class15.field140);
        if (!arg0) {
            ++field4345;
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZB)V")
    public final void method399(boolean arg0, byte arg1) {
        ++field4349;
        OpenGL.glBindProgramARB(34336, this.field4348.field9846);
        if (arg1 <= 44) {
            this.method394((byte) 33, true);
        }
        OpenGL.glEnable(34336);
        super.field9945.method1408(0, 0, class231.field3142);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IILhba;)V")
    public final void method391(int arg0, int arg1, class190 arg2) {
        if (arg1 != 0) {
            this.field4351 = null;
        }
        ++field4343;
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(III)V")
    public final void method393(int arg0, int arg1, int arg2) {
        if (arg2 >= 96) {
            if (!this.field4350.field5268) {
                int var4 = super.field9945.field3380 % 4000 * 16 / 4000;
                super.field9945.method1458(399403340, this.field4350.field5262[var4]);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
            } else {
                float var5 = (float) (super.field9945.field3380 % 4000) / 4000.0F;
                super.field9945.method1458(399403340, this.field4350.field5259);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
            }
            ++field4344;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BI)V")
    public static final void method2048(byte arg0, int arg1) {
        ++field4346;
        class346 var2 = class299.method1976(0, 2, arg1);
        var2.method2208(-1719);
        if (arg0 >= -22) {
            method2048((byte) -32, -90);
        }
    }

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "(I)V")
    public static void method2049(int arg0) {
        if (arg0 != 34820) {
            field4353 = null;
        }
        field4353 = null;
        field4352 = null;
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lhj;Luu;Lep;)V")
    public class313(class47 arg0, class237 arg1, class374 arg2) {
        super(arg0);
        this.field4351 = arg0;
        this.field4350 = arg2;
        if (arg1 != null && this.field4350.method2350(2) && this.field4351.field712) {
            this.field4348 = class152.method959(this.field4351, -98, 34336, arg1.method1582("transparent_water", false, "gl"));
        } else {
            this.field4348 = null;
        }
    }
}
