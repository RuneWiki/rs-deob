import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class50 extends class54 {

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "Lvf;")
    public static class233 field998 = new class233(5000);

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "Ldc;")
    private static class37 field1011 = class185.method1233((byte) 86, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "[I")
    public static int[] field1013 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "Ldc;")
    public static class37 field1016 = null;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "Ldc;")
    public static class37 field1006 = field1011;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public static int field1019 = 0;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    public static int field1018 = 0;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "[[I")
    public static int[][] field1017 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
    public int field1004;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public int field1008;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public int field1010;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public int field1014;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    public int field1022;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "Lkc;")
    public class111 field1000;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Lkc;")
    public class111 field996;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "Lrb;")
    public static class187 field1012;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "Lcg;")
    public class30 field1002;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "[I")
    public int[] field1007;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "[[B")
    public static byte[][] field1003;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V")
    public final void method424(byte arg0) {
        field1020++;
        if (arg0 < 12) {
            return;
        }
        int var2 = this.field995;
        class30 var3 = this.field1002.method256(176743434);
        if (var3 == null) {
            this.field1007 = null;
            this.field995 = -1;
            this.field1001 = 0;
            this.field1004 = 0;
            this.field1009 = 0;
        } else {
            this.field1009 = var3.field590;
            this.field995 = var3.field551;
            this.field1001 = var3.field596 * 128;
            this.field1007 = var3.field609;
            this.field1004 = var3.field563;
        }
        if (this.field995 != var2 && this.field996 != null) {
            class49.field969.method1452(this.field996);
            this.field996 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)I")
    public static final int method425(byte arg0) {
        field1015++;
        int var1 = -26 / ((43 - arg0) / 61);
        return 6;
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(B)V")
    public static void method426(byte arg0) {
        field1012 = null;
        field1017 = null;
        field1003 = null;
        field998 = null;
        field1006 = null;
        field1011 = null;
        field1013 = null;
        field1016 = null;
        if (arg0 != -3) {
            method426((byte) -101);
        }
    }
}
