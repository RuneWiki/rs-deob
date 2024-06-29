import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class177 {

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
    private int field2600 = 0;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    public int field2585;

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "[Lwh;")
    public class529[] field2599;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "Llm;")
    public static class31 field2583 = new class31(5, 16);

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
    public static int field2594 = 0;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "J")
    private long field2589;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "Lwh;")
    private class529 field2590;

    @OriginalMember(owner = "client!ru", name = "s", descriptor = "Lwh;")
    private class529 field2601;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)Lwh;")
    public final class529 method1119(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field2588++;
            this.field2600 = 0;
            return this.method1121((byte) 58);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "([Lwh;I)I")
    public final int method1120(class529[] arg0, int arg1) {
        field2587++;
        int var3 = 0;
        for (int var4 = arg1; var4 < this.field2585; var4++) {
            class529 var5 = this.field2599[var4];
            for (class529 var6 = var5.field7779; var6 != var5; var6 = var6.field7779) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)Lwh;")
    public final class529 method1121(byte arg0) {
        field2592++;
        int var2 = 112 / ((arg0 + 68) / 56);
        if (this.field2600 > 0 && this.field2599[this.field2600 - 1] != this.field2601) {
            class529 var3 = this.field2601;
            this.field2601 = var3.field7779;
            return var3;
        }
        while (this.field2585 > this.field2600) {
            class529 var4 = this.field2599[this.field2600++].field7779;
            if (this.field2599[this.field2600 - 1] != var4) {
                this.field2601 = var4.field7779;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BJ)Lwh;")
    public final class529 method1122(byte arg0, long arg1) {
        this.field2589 = arg1;
        if (arg0 != 59) {
            this.method1119(true);
        }
        field2598++;
        class529 var4 = this.field2599[(int) ((long) (this.field2585 - 1) & arg1)];
        for (this.field2590 = var4.field7779; this.field2590 != var4; this.field2590 = this.field2590.field7779) {
            if (this.field2590.field7780 == arg1) {
                class529 var5 = this.field2590;
                this.field2590 = this.field2590.field7779;
                return var5;
            }
        }
        this.field2590 = null;
        return null;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BIIII)V")
    public static final void method1123(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2584++;
        class170.field2488.field3162 = 0;
        class170.field2488.method1479((byte) -103, class432.field6525.field4683);
        class170.field2488.method1479((byte) -93, arg2);
        class170.field2488.method1479((byte) -117, arg4);
        if (arg0 != -20) {
            method1125(-31);
        }
        class170.field2488.method1437(arg3, 0);
        class170.field2488.method1437(arg1, arg0 + 20);
        class457.field7048 = 1;
        class76.field1141 = 0;
        class360.field5582 = 0;
        class271.field4327 = -3;
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)Lwh;")
    public final class529 method1124(byte arg0) {
        field2595++;
        if (this.field2590 == null) {
            return null;
        }
        if (arg0 >= -37) {
            this.method1126(-112);
        }
        class529 var2 = this.field2599[(int) (this.field2589 & (long) (this.field2585 - 1))];
        while (this.field2590 != var2) {
            if (this.field2590.field7780 == this.field2589) {
                class529 var3 = this.field2590;
                this.field2590 = this.field2590.field7779;
                return var3;
            }
            this.field2590 = this.field2590.field7779;
        }
        this.field2590 = null;
        return null;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
    public static void method1125(int arg0) {
        field2583 = null;
        if (arg0 != 5) {
            method1123((byte) 98, 93, 10, -72, -2);
        }
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)I")
    public final int method1126(int arg0) {
        field2591++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 != 24946) {
            method1123((byte) 5, 76, 113, -67, 24);
        }
        while (this.field2585 > var3) {
            class529 var4 = this.field2599[var3];
            class529 var5 = var4.field7779;
            while (var4 != var5) {
                var5 = var5.field7779;
                var2++;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lwh;BJ)V")
    public final void method1127(class529 arg0, byte arg1, long arg2) {
        if (arg0.field7776 != null) {
            arg0.method3149(69);
        }
        field2597++;
        class529 var5 = this.field2599[(int) (arg2 & (long) (this.field2585 - 1))];
        arg0.field7779 = var5;
        arg0.field7776 = var5.field7776;
        arg0.field7776.field7779 = arg0;
        if (arg1 <= 18) {
            this.method1124((byte) 54);
        }
        arg0.field7779.field7776 = arg0;
        arg0.field7780 = arg2;
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)V")
    public final void method1128(int arg0) {
        int var2 = 0;
        int var3 = 48 / (-arg0 / 32);
        while (this.field2585 > var2) {
            class529 var4 = this.field2599[var2];
            while (true) {
                class529 var5 = var4.field7779;
                if (var4 == var5) {
                    var2++;
                    break;
                }
                var5.method3149(113);
            }
        }
        field2586++;
        this.field2590 = null;
        this.field2601 = null;
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)I")
    public final int method1129(byte arg0) {
        field2593++;
        int var2 = -125 / ((-arg0 - 64) / 49);
        return this.field2585;
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(I)V")
    public class177(int arg0) {
        this.field2585 = arg0;
        this.field2599 = new class529[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class529 var3 = this.field2599[var2] = new class529();
            var3.field7776 = var3;
            var3.field7779 = var3;
        }
    }
}
