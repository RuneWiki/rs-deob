import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class417 extends class381 {

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public int field5832 = 0;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "Lik;")
    public static class410 field5844 = new class410(64);

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "[S")
    public static short[] field5846 = new short[256];

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "[[I")
    public static int[][] field5845 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field5858 = " from your friend list first.";

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "Lio;")
    public static class286 field5851 = new class286(5000);

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public int field5831;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public int field5834;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public int field5838;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public int field5839;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    public int field5840;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public int field5843;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    public int field5850;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public int field5852;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    public int field5854;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public int field5859;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    public int field5860;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "Lqo;")
    public class127 field5849;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "Lcc;")
    public class338 field5841;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "Lkk;")
    public class372 field5835;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "Lrk;")
    public static class427 field5833;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "Ltk;")
    public class79 field5836;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "Ltk;")
    public class79 field5847;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "Z")
    public boolean field5842;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "[I")
    public int[] field5830;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "[I")
    public static int[] field5848;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "[[S")
    public static short[][] field5857;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)Ltj;", line = 8)
    public static final class430 method2580(int arg0) {
        field5829++;
        if (class99.field1416 == null || class383.field5373 == null) {
            return null;
        }
        if (arg0 != 4) {
            method2583((class295) null, (class295) null, -84);
        }
        for (class430 var1 = (class430) class383.field5373.method1421((byte) 74); var1 != null; var1 = (class430) class383.field5373.method1421((byte) 74)) {
            class384 var2 = class212.method1451(var1.field6119, arg0 + 32);
            if (var2 != null && var2.field5414 && var2.method2382(-14605)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)Lap;", line = 41)
    public static final class289 method2581(byte arg0) {
        field5837++;
        class289 var1 = new class289(37);
        var1.method1824(84, 14);
        var1.method1824(89, class73.field1095);
        var1.method1824(116, class215.field2978 ? 1 : 0);
        var1.method1824(45, class173.field2554 ? 1 : 0);
        var1.method1824(123, class162.field2401 ? 1 : 0);
        var1.method1824(88, class416.field5823 ? 1 : 0);
        var1.method1824(125, 0);
        var1.method1824(85, class109.field1580 ? 1 : 0);
        var1.method1824(49, class441.field6352 ? 1 : 0);
        int var2 = -36 % ((arg0 + 3) / 61);
        var1.method1824(65, class61.field952 ? 1 : 0);
        var1.method1824(41, class179.field2633);
        var1.method1824(87, class385.field5429 ? 1 : 0);
        var1.method1824(108, class223.field3086 ? 1 : 0);
        var1.method1824(74, class130.field1846 ? 1 : 0);
        var1.method1824(70, class32.field527);
        var1.method1824(90, class177.field2610 ? 1 : 0);
        var1.method1824(73, class40.field626);
        var1.method1824(107, class148.field2284);
        var1.method1824(38, class331.field4504);
        var1.method1877(true, class42.field638);
        var1.method1877(true, class422.field5903);
        var1.method1824(73, class170.method1275(false));
        var1.method1854(class264.field3557, true);
        var1.method1824(45, class102.field1513);
        var1.method1824(73, class27.field476 ? 1 : 0);
        var1.method1824(80, class100.field1443 ? 1 : 0);
        var1.method1824(90, class41.field630);
        var1.method1824(69, class318.field4308 ? 1 : 0);
        var1.method1824(44, class338.field4590 ? 1 : 0);
        var1.method1824(61, class275.field3703);
        var1.method1824(62, class26.field467 ? 1 : 0);
        var1.method1824(75, class447.field6440);
        return var1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V", line = 87)
    public static void method2582(boolean arg0) {
        field5848 = null;
        field5858 = null;
        field5851 = null;
        field5857 = null;
        if (arg0) {
            field5846 = null;
            field5845 = null;
            field5833 = null;
            field5844 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ltg;Ltg;I)V", line = 104)
    public static final void method2583(class295 arg0, class295 arg1, int arg2) {
        field5855++;
        if (arg0.field3980 != null) {
            arg0.method1902(32);
        }
        arg0.field3979 = arg1.field3979;
        arg0.field3980 = arg1;
        arg0.field3980.field3979 = arg0;
        int var3 = -126 / ((arg2 - 1) / 42);
        arg0.field3979.field3980 = arg0;
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(B)V", line = 161)
    public final void method2584(byte arg0) {
        if (arg0 <= 20) {
            return;
        }
        field5828++;
        int var2 = this.field5839;
        if (this.field5835 != null) {
            class372 var3 = this.field5835.method2323((byte) -107);
            if (var3 == null) {
                this.field5830 = null;
                this.field5840 = 0;
                this.field5834 = 0;
                this.field5839 = -1;
                this.field5852 = 0;
                this.field5859 = 0;
            } else {
                this.field5852 = var3.field5166;
                this.field5839 = var3.field5156;
                this.field5830 = var3.field5152;
                this.field5859 = var3.field5163;
                this.field5840 = var3.field5154 * 128;
                this.field5834 = var3.field5195;
            }
        } else if (this.field5849 != null) {
            int var4 = class73.method629(this.field5849, -124);
            if (var2 != var4) {
                this.field5839 = var4;
                class15 var5 = this.field5849.field1784;
                if (var5.field177 != null) {
                    var5 = var5.method78(0);
                }
                if (var5 == null) {
                    this.field5834 = this.field5840 = 0;
                } else {
                    this.field5834 = var5.field119;
                    this.field5840 = var5.field160 * 128;
                }
            }
        } else if (this.field5841 != null) {
            this.field5839 = class340.method2162(82, this.field5841);
            this.field5840 = this.field5841.field4578 * 128;
            this.field5834 = this.field5841.field4575;
        }
        if (this.field5839 != var2 && this.field5836 != null) {
            class315.field4277.method1431(this.field5836);
            this.field5836 = null;
        }
    }
}
