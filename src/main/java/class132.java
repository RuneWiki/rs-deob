import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class132 extends class264 {

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    public int field1799 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public int field1797 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    public int field1803 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public int field1802 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public int field1808 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    public int field1811 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "I")
    public int field1796 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public int field1810 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "Leg;")
    public class376 field1807;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "[I")
    public static int[] field1795 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!om", name = "v", descriptor = "[[I")
    public static int[][] field1801 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    public static int field1809 = 0;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "Ljn;")
    public static class409 field1805 = new class409("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V", line = 4)
    public static final void method884(int arg0) {
        if (class344.field5064 < 0) {
            class71.field929 = -1;
            class344.field5064 = 0;
            class4.field68 = -1;
        }
        field1804++;
        if (class66.field877 < class344.field5064) {
            class71.field929 = -1;
            class344.field5064 = class66.field877;
            class4.field68 = -1;
        }
        if (arg0 != -1) {
            method885(120, -2);
        }
        if (class134.field1843 < 0) {
            class71.field929 = -1;
            class134.field1843 = 0;
            class4.field68 = -1;
        }
        if (class134.field1843 > class66.field872) {
            class71.field929 = -1;
            class134.field1843 = class66.field872;
            class4.field68 = -1;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Lef;", line = 44)
    public static final class354 method885(int arg0, int arg1) {
        field1800++;
        if (arg1 != -1) {
            field1801 = null;
        }
        class354 var2 = (class354) class264.field3902.method2310((byte) -124, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class294.field4279.method715(arg0, (byte) 94, 26);
        class354 var4 = new class354();
        if (var3 != null) {
            var4.method2269(true, new class256(var3));
        }
        class264.field3902.method2299(true, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)Z", line = 76)
    public final boolean method886(int arg0, int arg1, int arg2) {
        field1806++;
        if (this.field1808 <= arg0 && this.field1811 >= arg0 && this.field1797 <= arg1 && arg1 <= this.field1802) {
            return true;
        } else {
            if (arg2 != -10546) {
                method884(51);
            }
            return arg0 >= this.field1796 && this.field1803 >= arg0 && arg1 >= this.field1799 && arg1 <= this.field1810;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII)V", line = 95)
    public static final void method887(int arg0, int arg1, int arg2, int arg3) {
        class369 var4 = class178.field2530[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class233 var5 = var4.field5327;
        class233 var6 = var4.field5334;
        if (var5 != null) {
            var5.field3491 = var5.field3491 * arg3 / 16;
            var5.field3495 = var5.field3495 * arg3 / 16;
        }
        if (var6 != null) {
            var6.field3491 = var6.field3491 * arg3 / 16;
            var6.field3495 = var6.field3495 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Leg;)V", line = 176)
    public class132(class376 arg0) {
        this.field1807 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V", line = 132)
    public static void method888(int arg0) {
        field1801 = null;
        if (arg0 != 28559) {
            field1809 = 112;
        }
        field1805 = null;
        field1795 = null;
    }
}
