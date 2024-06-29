import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class160 {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lkj;")
    public class171 field2696 = new class171();

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "J")
    public static long field2699 = 0L;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
    public static boolean field2704 = true;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Loh;")
    public static class15 field2711;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Lkj;")
    private class171 field2708;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "[I")
    public static int[] field2709;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "[[I")
    public static int[][] field2707;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BIII)I", line = 6)
    public static final int method1250(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -26) {
            method1250((byte) -108, -31, -104, 120);
        }
        field2698++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return 1023 - arg1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Lkj;", line = 38)
    public final class171 method1251(int arg0) {
        field2702++;
        class171 var2 = this.field2696.field2896;
        if (this.field2696 == var2) {
            this.field2708 = null;
            return null;
        } else {
            int var3 = 81 / ((-arg0 - 2) / 47);
            this.field2708 = var2.field2896;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLkj;)V", line = 64)
    public final void method1252(byte arg0, class171 arg1) {
        field2703++;
        if (arg1.field2895 != null) {
            arg1.method1325(-2935);
        }
        arg1.field2895 = this.field2696;
        arg1.field2896 = this.field2696.field2896;
        arg1.field2895.field2896 = arg1;
        arg1.field2896.field2895 = arg1;
        if (arg0 != -60) {
            this.method1251(107);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Lkj;", line = 92)
    public final class171 method1253(int arg0) {
        field2706++;
        class171 var2 = this.field2708;
        if (this.field2696 == var2) {
            this.field2708 = null;
            return null;
        }
        if (arg0 < 25) {
            this.method1259(-59);
        }
        this.field2708 = var2.field2896;
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 212)
    public class160() {
        this.field2696.field2895 = this.field2696;
        this.field2696.field2896 = this.field2696;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)Lkj;", line = 126)
    public final class171 method1254(int arg0) {
        field2705++;
        if (arg0 != 0) {
            this.method1251(-4);
        }
        class171 var2 = this.field2696.field2896;
        if (this.field2696 == var2) {
            return null;
        } else {
            var2.method1325(arg0 - 2935);
            return var2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V", line = 149)
    public static void method1255(int arg0) {
        int var1 = 20 / ((-arg0 - 16) / 57);
        field2709 = null;
        field2707 = (int[][]) null;
        field2711 = null;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)Lkj;", line = 167)
    public final class171 method1256(int arg0) {
        field2697++;
        class171 var2 = this.field2696.field2895;
        if (arg0 != 24791) {
            field2711 = (class15) null;
        }
        if (this.field2696 == var2) {
            this.field2708 = null;
            return null;
        } else {
            this.field2708 = var2.field2895;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V", line = 189)
    public final void method1257(int arg0) {
        field2701++;
        if (arg0 != 2) {
            this.method1252((byte) -5, (class171) null);
        }
        while (true) {
            class171 var2 = this.field2696.field2896;
            if (this.field2696 == var2) {
                this.field2708 = null;
                return;
            }
            var2.method1325(-2935);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILkj;)V", line = 223)
    public final void method1258(int arg0, class171 arg1) {
        if (arg1.field2895 != null) {
            arg1.method1325(-2935);
        }
        field2710++;
        arg1.field2895 = this.field2696.field2895;
        arg1.field2896 = this.field2696;
        if (arg0 == 0) {
            arg1.field2895.field2896 = arg1;
            arg1.field2896.field2895 = arg1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)Lkj;", line = 243)
    public final class171 method1259(int arg0) {
        field2695++;
        if (arg0 != 0) {
            return (class171) null;
        }
        class171 var2 = this.field2708;
        if (this.field2696 == var2) {
            this.field2708 = null;
            return null;
        } else {
            this.field2708 = var2.field2895;
            return var2;
        }
    }
}
