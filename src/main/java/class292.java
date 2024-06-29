import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class292 extends class154 {

    @OriginalMember(owner = "client!em", name = "L", descriptor = "I")
    private int field4668;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "I")
    private int field4653;

    @OriginalMember(owner = "client!em", name = "E", descriptor = "I")
    public int field4662;

    @OriginalMember(owner = "client!em", name = "B", descriptor = "I")
    public int field4659;

    @OriginalMember(owner = "client!em", name = "M", descriptor = "I")
    public int field4669;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    private int field4646;

    @OriginalMember(owner = "client!em", name = "y", descriptor = "I")
    private int field4656;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    private int field4648;

    @OriginalMember(owner = "client!em", name = "D", descriptor = "I")
    private int field4661;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    public int field4649;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "S")
    public static short field4655 = 1;

    @OriginalMember(owner = "client!em", name = "I", descriptor = "Z")
    public static volatile boolean field4665 = true;

    @OriginalMember(owner = "client!em", name = "z", descriptor = "I")
    public static int field4657 = 0;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4652 = "wave2:";

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!em", name = "w", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!em", name = "A", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!em", name = "G", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!em", name = "J", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!em", name = "N", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!em", name = "K", descriptor = "Lkk;")
    public static class67 field4667;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I[III)V")
    public final void method1958(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[2] = this.field4659 - (this.field4646 - arg0);
        field4651++;
        arg1[1] = arg3 + this.field4669 - this.field4656;
        int var5 = 41 / ((-arg2 - 45) / 57);
        arg1[0] = this.field4668;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lhd;ZLhd;)V")
    public static final void method1959(class128 arg0, boolean arg1, class128 arg2) {
        field4654++;
        if (arg2.field1786 != null) {
            arg2.method819((byte) -12);
        }
        if (!arg1) {
            field4667 = null;
        }
        arg2.field1786 = arg0;
        arg2.field1789 = arg0.field1789;
        arg2.field1786.field1789 = arg2;
        arg2.field1789.field1786 = arg2;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([IIII)V")
    public final void method1960(int[] arg0, int arg1, int arg2, int arg3) {
        field4660++;
        arg0[2] = arg2 + this.field4646 - this.field4659;
        arg0[arg1] = this.field4656 + arg3 - this.field4669;
        arg0[0] = this.field4661;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIII)Z")
    public final boolean method1961(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= -113) {
            this.method1960((int[]) null, 58, -33, -89);
        }
        field4664++;
        return this.field4661 == arg0 && this.field4656 <= arg1 && arg1 <= this.field4653 && arg3 >= this.field4646 && arg3 <= this.field4648;
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(II)Lkd;")
    public static final class242 method1962(int arg0, int arg1) {
        field4658++;
        class242 var2 = (class242) class2.field1.method950((long) arg0, (byte) -45);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class255.field4031.method2050(94, 34, arg0);
        class242 var4 = new class242();
        if (var3 != null) {
            var4.method1589(arg0, new class215(var3), 95);
        }
        class2.field1.method942((long) arg0, (byte) 70, var4);
        if (arg1 != 19423) {
            field4665 = false;
        }
        return var4;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BII)Z")
    public final boolean method1963(byte arg0, int arg1, int arg2) {
        field4647++;
        int var4 = 13 / ((-arg0 - 23) / 62);
        return arg2 >= this.field4656 && arg2 <= this.field4653 && this.field4646 <= arg1 && arg1 <= this.field4648;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(BII)Z")
    public final boolean method1964(byte arg0, int arg1, int arg2) {
        int var4 = -43 % ((arg0 + 6) / 41);
        field4666++;
        return arg1 >= this.field4669 && this.field4662 >= arg1 && this.field4659 <= arg2 && arg2 <= this.field4649;
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(II)V")
    public static final void method1965(int arg0, int arg1) {
        if (arg1 != 1) {
            method1962(-32, 62);
        }
        field4663++;
        class277.field4401.method943(arg0, true);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V")
    public static void method1966(byte arg0) {
        if (arg0 != -117) {
            field4657 = -30;
        }
        field4652 = null;
        field4667 = null;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4668 = arg1;
        this.field4653 = arg4;
        this.field4662 = arg8;
        this.field4659 = arg7;
        this.field4669 = arg6;
        this.field4646 = arg3;
        this.field4656 = arg2;
        this.field4648 = arg5;
        this.field4661 = arg0;
        this.field4649 = arg9;
    }
}
