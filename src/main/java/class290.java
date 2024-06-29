import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class290 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    private int field4121 = 0;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    private int field4124 = 0;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Lih;")
    private class492 field4126 = null;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    private int field4131 = 0;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lvj;")
    private class303 field4134;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Lpo;")
    private class389 field4123;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "[Lg;")
    private class106[] field4129;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Ltl;")
    public class436 field4130;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "J")
    public static long field4125 = -1L;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field4136 = -1;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Lbu;")
    public static class17 field4133;

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lvj;)V", line = 140)
    public class290(class303 arg0) {
        this.field4134 = arg0;
        this.field4123 = new class389(arg0);
        this.field4129 = new class106[10];
        this.field4129[1] = new class455(arg0);
        this.field4129[2] = new class202(arg0, this.field4123);
        this.field4129[4] = new class252(arg0, this.field4123);
        this.field4129[5] = new class338(arg0, this.field4123);
        this.field4129[6] = new class32(arg0);
        this.field4129[7] = new class247(arg0);
        this.field4129[3] = this.field4130 = new class436(arg0);
        this.field4129[8] = new class383(arg0, this.field4123);
        this.field4129[9] = new class214(arg0, this.field4123);
        if (!this.field4129[8].method348(-22884)) {
            this.field4129[8] = this.field4129[4];
        }
        if (!this.field4129[9].method348(-22884)) {
            this.field4129[9] = this.field4129[8];
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)Z", line = 13)
    public final boolean method1832(int arg0, boolean arg1) {
        field4132++;
        return arg1 ? this.field4129[arg0].method348(-22884) : true;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lih;BI)Z", line = 28)
    public final boolean method1833(class492 arg0, byte arg1, int arg2) {
        if (arg1 <= 106) {
            return false;
        }
        field4127++;
        if (this.field4121 == 0) {
            return false;
        }
        if (this.field4126 != arg0) {
            this.field4129[this.field4121 & Integer.MAX_VALUE].method346(128, arg2, arg0);
            this.field4126 = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 49)
    public static void method1834(int arg0) {
        field4133 = null;
        if (arg0 >= -23) {
            field4136 = 84;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZII)V", line = 65)
    public final void method1835(boolean arg0, int arg1, int arg2) {
        field4122++;
        if (arg0) {
            this.field4124 = 77;
        }
        if ((this.field4131 != arg2 | this.field4124 != arg1) & this.field4121 != 0) {
            this.field4129[Integer.MAX_VALUE & this.field4121].method347(arg2, (byte) 43, arg1);
            this.field4131 = arg2;
            this.field4124 = arg1;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZZB)V", line = 89)
    public final void method1836(int arg0, boolean arg1, boolean arg2, byte arg3) {
        field4135++;
        boolean var5 = arg1 & this.field4134.method283();
        if (!var5 && (arg0 == 4 || arg0 == 8)) {
            arg0 = 2;
        }
        if (arg0 != 0 && arg2) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (arg3 != -11) {
            this.method1833(null, (byte) -80, -39);
        }
        if (this.field4121 != arg0) {
            if (this.field4121 != 0) {
                this.field4129[this.field4121 & Integer.MAX_VALUE].method342(3);
            }
            if (arg0 != 0) {
                this.field4129[arg0 & Integer.MAX_VALUE].method343(arg2, 1);
                this.field4129[arg0 & Integer.MAX_VALUE].method344(arg2, (byte) 123);
            }
            this.field4124 = Integer.MIN_VALUE;
            this.field4131 = Integer.MIN_VALUE;
            this.field4126 = null;
            this.field4121 = arg0;
        } else if (this.field4121 != 0) {
            this.field4129[Integer.MAX_VALUE & this.field4121].method344(arg2, (byte) 125);
            return;
        }
    }
}
