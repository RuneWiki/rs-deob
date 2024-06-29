import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class277 extends class134 {

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public int field4579;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    private int field4591;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public int field4585;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    private int field4599;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    public int field4597;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    public int field4594;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    private int field4595;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    private int field4580;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    private int field4592;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    private int field4581;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field4593 = new String[200];

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "Lfa;")
    public static class273 field4598;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "[[[I")
    public static int[][][] field4583;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([IIII)V")
    public final void method1924(int[] arg0, int arg1, int arg2, int arg3) {
        arg0[arg3] = arg1 + this.field4599 - this.field4585;
        field4582++;
        arg0[0] = this.field4592;
        arg0[1] = arg2 + this.field4580 - this.field4594;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)V")
    public static final void method1925(int arg0, boolean arg1) {
        class60.field923.method147(arg0, (byte) -124);
        if (!arg1) {
            field4584++;
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
    public static void method1926(int arg0) {
        field4598 = null;
        field4583 = null;
        field4593 = null;
        if (arg0 != -30204) {
            field4593 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)Z")
    public final boolean method1927(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -98) {
            return true;
        } else {
            field4596++;
            return this.field4592 == arg0 && this.field4580 <= arg1 && this.field4581 >= arg1 && this.field4599 <= arg2 && arg2 <= this.field4591;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Lkc;")
    public static final class302 method1928(int arg0, int arg1) {
        field4600++;
        class302 var2 = (class302) class280.field4632.method1343(arg0 ^ 0x7FAA, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 32767) {
            method1925(43, false);
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class51.field694.method1877(arg1, 0, (byte) 68);
        } else {
            var3 = class87.field1362.method1877(arg1 & 0x7FFF, 0, (byte) 69);
        }
        class302 var4 = new class302();
        if (var3 != null) {
            var4.method2082(new class202(var3), false);
        }
        if (arg1 >= 32768) {
            var4.method2080(arg0 ^ 0x7FE1);
        }
        class280.field4632.method1337(var4, (long) arg1, -1);
        return var4;
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V")
    public static final void method1929(int arg0) {
        field4586++;
        class109.field1668.method145(-101);
        if (arg0 != 32768) {
            field4598 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[IIB)V")
    public final void method1930(int arg0, int[] arg1, int arg2, byte arg3) {
        arg1[1] = arg2 + this.field4594 - this.field4580;
        int var5 = 4 / ((arg3 + 28) / 57);
        field4587++;
        arg1[2] = this.field4585 - (this.field4599 - arg0);
        arg1[0] = this.field4595;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBI)Z")
    public final boolean method1931(int arg0, byte arg1, int arg2) {
        int var4 = -35 % ((arg1 - 17) / 55);
        field4588++;
        return this.field4580 <= arg2 && this.field4581 >= arg2 && this.field4599 <= arg0 && this.field4591 >= arg0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)Z")
    public final boolean method1932(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method1932(-37, 88, -28);
        }
        field4589++;
        return arg1 >= this.field4594 && this.field4579 >= arg1 && this.field4585 <= arg0 && this.field4597 >= arg0;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4579 = arg8;
        this.field4591 = arg5;
        this.field4585 = arg7;
        this.field4599 = arg3;
        this.field4597 = arg9;
        this.field4594 = arg6;
        this.field4595 = arg1;
        this.field4580 = arg2;
        this.field4592 = arg0;
        this.field4581 = arg4;
    }
}
