import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public abstract class class634 extends class134 {

    @OriginalMember(owner = "client!qt", name = "v", descriptor = "Z")
    public boolean field9121;

    @OriginalMember(owner = "client!qt", name = "D", descriptor = "[Lqt;")
    public class634[] field9129;

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "I")
    public static int field9125 = -1;

    @OriginalMember(owner = "client!qt", name = "B", descriptor = "[I")
    public static int[] field9127 = new int[4];

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "I")
    public static int field9120 = 0;

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "Lof;")
    public static class620 field9110 = new class620(8);

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
    public static int field9112;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public int field9113;

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "I")
    public static int field9116;

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
    public static int field9118;

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!qt", name = "w", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!qt", name = "x", descriptor = "I")
    public static int field9123;

    @OriginalMember(owner = "client!qt", name = "y", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!qt", name = "C", descriptor = "I")
    public static int field9128;

    @OriginalMember(owner = "client!qt", name = "E", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!qt", name = "A", descriptor = "Lqaa;")
    public class27 field9126;

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "Lcd;")
    public class313 field9114;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BI)[[I")
    public int[][] method7(byte arg0, int arg1) {
        int var3 = 15 / ((arg0 + 56) / 53);
        field9116++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILig;Z)V")
    public void method3(int arg0, class244 arg1, boolean arg2) {
        if (arg2) {
            this.field9126 = null;
        }
        field9109++;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
    public static void method3639(byte arg0) {
        field9127 = null;
        int var1 = 100 % ((-arg0 - 8) / 49);
        field9110 = null;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)I")
    public int method1484(int arg0) {
        field9130++;
        int var2 = 41 / ((arg0 + 6) / 54);
        return -1;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I[Lhu;)V")
    public static final void method3640(int arg0, class131[] arg1) {
        class502.field7057 = arg1.length;
        field9112++;
        class126.field1322 = new class131[class502.field7057 + 10];
        class740.field10345 = new int[class502.field7057 + 10];
        class143.method892(arg1, 0, class126.field1322, 0, class502.field7057);
        if (arg0 != -21722) {
            field9125 = 7;
        }
        for (int var2 = 0; var2 < class502.field7057; var2++) {
            class740.field10345[var2] = class126.field1322[var2].method510();
        }
        for (int var3 = class502.field7057; var3 < class126.field1322.length; var3++) {
            class740.field10345[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(III)[I")
    public final int[] method3641(int arg0, int arg1, int arg2) {
        if (arg1 != 20604) {
            this.method13((byte) 25, -20);
        }
        field9122++;
        return this.field9129[arg2].field9121 ? this.field9129[arg2].method13((byte) -93, arg0) : this.field9129[arg2].method7((byte) 80, arg0)[0];
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(B)V")
    public void method1483(byte arg0) {
        if (this.field9121) {
            this.field9114.method1862((byte) 123);
            this.field9114 = null;
        } else {
            this.field9126.method129(114);
            this.field9126 = null;
        }
        field9118++;
        int var2 = -1 / ((42 - arg0) / 49);
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(BI)[I")
    public int[] method13(byte arg0, int arg1) {
        if (arg0 >= -55) {
            this.method13((byte) -7, 52);
        }
        field9123++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(B)V")
    public void method87(byte arg0) {
        if (arg0 >= 65) {
            field9117++;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIB)V")
    public void method1487(int arg0, int arg1, byte arg2) {
        field9124++;
        int var4 = this.field9113 == 255 ? arg0 : this.field9113;
        if (this.field9121) {
            this.field9114 = new class313(var4, arg0, arg1);
        } else {
            this.field9126 = new class27(var4, arg0, arg1);
        }
        if (arg2 <= 89) {
            field9111 = -117;
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IZ)V")
    public class634(int arg0, boolean arg1) {
        this.field9121 = arg1;
        this.field9129 = new class634[arg0];
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIZ)[[I")
    public final int[][] method3642(int arg0, int arg1, boolean arg2) {
        field9128++;
        if (!arg2) {
            return null;
        } else if (this.field9129[arg0].field9121) {
            int[] var4 = this.field9129[arg0].method13((byte) -128, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field9129[arg0].method7((byte) -110, arg1);
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)I")
    public int method3643(int arg0) {
        if (arg0 != -1) {
            this.method1483((byte) -74);
        }
        field9119++;
        return -1;
    }
}
