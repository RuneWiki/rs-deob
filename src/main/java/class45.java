import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class45 extends class2 {

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    private int field1102;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "[I")
    public int[] field1100;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "[[I")
    public int[][] field1091;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Lkc;")
    public static class67 field1092 = class19.method144("(X", 101);

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field1096 = -1;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "[J")
    public static long[] field1104 = new long[100];

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "Z")
    public static boolean field1105 = false;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "Lkc;")
    public static class67 field1106 = class19.method144("leuchten3:", 110);

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "Lkc;")
    private static class67 field1097 = class19.method144("flash3:", 75);

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Lkc;")
    public static class67 field1093 = field1097;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "Z")
    public static boolean field1098;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "[[[B")
    public static byte[][][] field1095;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I", line = 8)
    public static final int method380(int arg0, int arg1, int arg2) {
        field1089++;
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var5 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var5;
        }
        int var4 = 49 / ((arg0 - 6) / 36);
        return arg2;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)I", line = 84)
    public static final int method381(int arg0, int arg1, int arg2) {
        if (arg0 > -71) {
            method382(5);
        }
        field1101++;
        class102 var3 = (class102) class82.field1954.method462(false, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && var3.field2298.length > arg1) {
            return var3.field2298[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I[B)V", line = 108)
    public class45(int arg0, byte[] arg1) {
        this.field1103 = arg0;
        class140 var3 = new class140(arg1);
        this.field1102 = var3.method1105(255);
        this.field1100 = new int[this.field1102];
        this.field1091 = new int[this.field1102][];
        for (int var4 = 0; var4 < this.field1102; var4++) {
            this.field1100[var4] = var3.method1105(255);
        }
        for (int var5 = 0; var5 < this.field1102; var5++) {
            this.field1091[var5] = new int[var3.method1105(255)];
        }
        for (int var6 = 0; var6 < this.field1102; var6++) {
            for (int var7 = 0; var7 < this.field1091[var6].length; var7++) {
                this.field1091[var6][var7] = var3.method1105(255);
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V", line = 153)
    public static void method382(int arg0) {
        field1097 = null;
        if (arg0 < 69) {
            method382(115);
        }
        field1095 = null;
        field1092 = null;
        field1106 = null;
        field1104 = null;
        field1093 = null;
    }
}
