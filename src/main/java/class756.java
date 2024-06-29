import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class756 extends class741 {

    @OriginalMember(owner = "client!pea", name = "C", descriptor = "[Z")
    public static boolean[] field10500 = new boolean[100];

    @OriginalMember(owner = "client!pea", name = "q", descriptor = "Ljw;")
    public static class581 field10488 = new class581(29, 17);

    @OriginalMember(owner = "client!pea", name = "t", descriptor = "I")
    public static int field10491;

    @OriginalMember(owner = "client!pea", name = "v", descriptor = "I")
    public static int field10493;

    @OriginalMember(owner = "client!pea", name = "w", descriptor = "I")
    public static int field10494;

    @OriginalMember(owner = "client!pea", name = "z", descriptor = "I")
    public static int field10497;

    @OriginalMember(owner = "client!pea", name = "A", descriptor = "I")
    public static int field10498;

    @OriginalMember(owner = "client!pea", name = "B", descriptor = "I")
    public static int field10499;

    @OriginalMember(owner = "client!pea", name = "p", descriptor = "Lvr;")
    private class147 field10487;

    @OriginalMember(owner = "client!pea", name = "r", descriptor = "Lvr;")
    private class147 field10489;

    @OriginalMember(owner = "client!pea", name = "s", descriptor = "Lvr;")
    private class147 field10490;

    @OriginalMember(owner = "client!pea", name = "u", descriptor = "Lvr;")
    public class147 field10492;

    @OriginalMember(owner = "client!pea", name = "x", descriptor = "Lvr;")
    private class147 field10495;

    @OriginalMember(owner = "client!pea", name = "y", descriptor = "Lvr;")
    private class147 field10496;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)V")
    public final void method16(int arg0) {
        ++field10499;
        super.method16(126);
        class731 var2 = (class731) super.field10222;
        this.field10492 = class454.method2694(47, super.field10223, var2.field10134);
        if (arg0 < 36) {
            this.method3386(-10, true, 18, 111, 116);
        }
        this.field10489 = class454.method2694(47, super.field10223, var2.field10132);
        this.field10495 = class454.method2694(47, super.field10223, var2.field10137);
        this.field10487 = class454.method2694(47, super.field10223, var2.field10135);
        this.field10496 = class454.method2694(47, super.field10223, var2.field10138);
        this.field10490 = class454.method2694(47, super.field10223, var2.field10136);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZII)V")
    public final void method13(int arg0, boolean arg1, int arg2, int arg3) {
        ++field10494;
        int var5 = this.field10495.method1096() + arg3;
        int var6 = arg3 - -super.field10222.field9033 - this.field10487.method1096();
        int var7 = this.field10496.method1106() + arg0;
        int var8 = super.field10222.field9025 + (arg0 - this.field10490.method1106());
        int var9 = var6 - var5;
        int var10 = var8 - var7;
        int var11 = this.method4103(2048) * var9 / 10000;
        int[] var12 = new int[4];
        if (arg2 > 102) {
            class379.field5542.method494(var12);
            class379.field5542.method456(var5, var7, var5 + var11, var8);
            this.method3386(var9, true, var7, var5, var10);
            class379.field5542.method456(var5 + var11, var7, var6, var8);
            this.field10489.method1111(var5, var7, var9, var10);
            class379.field5542.method456(var12[0], var12[1], var12[2], var12[3]);
        }
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Laj;Laj;Lgn;)V")
    public class756(class333 arg0, class333 arg1, class731 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZIII)V")
    public void method3386(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field10498;
        if (!arg1) {
            this.field10490 = null;
        }
        this.field10492.method1111(arg3, arg2, arg0, arg4);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZBII)V")
    public final void method14(boolean arg0, byte arg1, int arg2, int arg3) {
        int var5 = 27 % ((arg1 - 64) / 35);
        ++field10493;
        if (arg0) {
            int[] var6 = new int[4];
            class379.field5542.method494(var6);
            class379.field5542.method456(arg2, arg3, super.field10222.field9033 + arg2, super.field10222.field9025 + arg3);
            int var7 = this.field10495.method1096();
            int var8 = this.field10495.method1106();
            int var9 = this.field10487.method1096();
            int var10 = this.field10487.method1106();
            this.field10495.method1102(arg2, (-var8 + super.field10222.field9025) / 2 + arg3);
            this.field10487.method1102(super.field10222.field9033 + arg2 + -var9, (-var10 + super.field10222.field9025) / 2 + arg3);
            class379.field5542.method456(arg2, arg3, arg2 - -super.field10222.field9033, this.field10496.method1106() + arg3);
            this.field10496.method1111(arg2 - -var7, arg3, -var7 + -var9 + super.field10222.field9033, super.field10222.field9025);
            int var11 = this.field10490.method1106();
            class379.field5542.method456(arg2, arg3 - var11 + super.field10222.field9025, super.field10222.field9033 + arg2, arg3 - -super.field10222.field9025);
            this.field10490.method1111(arg2 - -var7, arg3 - -super.field10222.field9025 - var11, -var7 + super.field10222.field9033 - var9, super.field10222.field9025);
            class379.field5542.method456(var6[0], var6[1], var6[2], var6[3]);
        }
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)Z")
    public final boolean method15(int arg0) {
        ++field10497;
        if (!super.method15(arg0)) {
            return false;
        } else {
            class731 var2 = (class731) super.field10222;
            if (!super.field10223.method2104(99, var2.field10134)) {
                return false;
            } else if (!super.field10223.method2104(38, var2.field10132)) {
                return false;
            } else if (!super.field10223.method2104(125, var2.field10137)) {
                return false;
            } else if (!super.field10223.method2104(arg0 ^ 20645, var2.field10135)) {
                return false;
            } else if (!super.field10223.method2104(arg0 ^ -20681, var2.field10138)) {
                return false;
            } else {
                return super.field10223.method2104(109, var2.field10136);
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V")
    public static void method4212(byte arg0) {
        if (arg0 != -6) {
            field10491 = -124;
        }
        field10500 = null;
        field10488 = null;
    }
}
