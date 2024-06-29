import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class447 extends class261 {

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    public int field6650;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
    private int field6655;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    private int field6646;

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
    private int field6656;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
    private int field6658;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
    public int field6659;

    @OriginalMember(owner = "client!tq", name = "D", descriptor = "I")
    public int field6664;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
    public int field6649;

    @OriginalMember(owner = "client!tq", name = "E", descriptor = "I")
    private int field6665;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "[I")
    public static int[] field6648 = new int[5];

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public static int field6651 = 0;

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
    public static int field6657 = -1;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!tq", name = "B", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!tq", name = "C", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!tq", name = "G", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(III[I)V", line = 4)
    public final void method2670(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg2 >= -109) {
            this.field6658 = 118;
        }
        arg3[0] = 0;
        field6654++;
        arg3[2] = arg0 + this.field6650 - this.field6665;
        arg3[1] = arg1 - (this.field6658 - this.field6664);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBI[I)V", line = 20)
    public final void method2671(int arg0, byte arg1, int arg2, int[] arg3) {
        arg3[1] = this.field6658 + arg2 - this.field6664;
        arg3[0] = this.field6656;
        arg3[2] = -this.field6650 - (-this.field6665 - arg0);
        if (arg1 != -107) {
            this.field6646 = -91;
        }
        field6652++;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)Z", line = 35)
    public final boolean method2672(int arg0, int arg1, int arg2) {
        field6666++;
        if (arg2 != 13967) {
            this.field6656 = -65;
        }
        return this.field6664 <= arg0 && arg0 <= this.field6649 && arg1 >= this.field6650 && this.field6659 >= arg1;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(III)Z", line = 56)
    public final boolean method2673(int arg0, int arg1, int arg2) {
        if (arg2 != -2035) {
            this.field6650 = -17;
        }
        field6660++;
        return arg0 >= this.field6658 && arg0 <= this.field6646 && this.field6665 <= arg1 && arg1 <= this.field6655;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI[B)V", line = 79)
    public static final void method2674(boolean arg0, int arg1, byte[] arg2) {
        if (class21.field331 == null) {
            class21.field331 = new class289(20000);
        }
        field6645++;
        class21.field331.method1813(arg2.length, arg1, arg2, arg1 + 9262);
        if (!arg0) {
            return;
        }
        class122.method980(class21.field331.field4408, -93);
        class35.field533 = new class255[class373.field5470];
        int var3 = 0;
        for (int var4 = class17.field282; var4 <= class21.field327; var4++) {
            class255 var5 = class327.method2073(var4, (byte) 39);
            if (var5 != null) {
                class35.field533[var3++] = var5;
            }
        }
        class186.field2988 = false;
        class515.field7479 = class423.method2578(-19698);
        class21.field331 = null;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)V", line = 117)
    public static final void method2675(int arg0, int arg1) {
        if (arg1 != -1) {
            field6657 = -70;
        }
        if (class385.field5619 == null || arg0 > class385.field5619.length) {
            class385.field5619 = new int[arg0];
        }
        field6647++;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 140)
    public static void method2676(int arg0) {
        field6648 = null;
        if (arg0 != 0) {
            method2677(78, 117, -16);
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(III)Lgh;", line = 151)
    public static final class388 method2677(int arg0, int arg1, int arg2) {
        field6662++;
        class388 var3 = class271.method1716(27411, arg2);
        if (arg0 == -1) {
            return var3;
        } else {
            if (arg1 != 0) {
                field6661 = -81;
            }
            return var3 == null || var3.field5819 == null || var3.field5819.length <= arg0 ? null : var3.field5819[arg0];
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIII)Z", line = 171)
    public final boolean method2678(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            this.method2671(58, (byte) 6, 112, null);
        }
        field6653++;
        return this.field6656 == arg0 && arg2 >= this.field6658 && this.field6646 >= arg2 && arg1 >= this.field6665 && this.field6655 >= arg1;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(IIIIIIIII)V", line = 193)
    public class447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field6650 = arg6;
        this.field6655 = arg4;
        this.field6646 = arg3;
        this.field6656 = arg0;
        this.field6658 = arg1;
        this.field6659 = arg8;
        this.field6664 = arg5;
        this.field6649 = arg7;
        this.field6665 = arg2;
    }
}
