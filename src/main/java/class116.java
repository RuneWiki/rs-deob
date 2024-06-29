import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class116 extends class241 {

    @OriginalMember(owner = "client!u", name = "n", descriptor = "Loh;")
    public static class263 field2162 = class253.method1681(-125, ")4");

    @OriginalMember(owner = "client!u", name = "v", descriptor = "[I")
    public static int[] field2170 = new int[1000];

    @OriginalMember(owner = "client!u", name = "E", descriptor = "Loh;")
    private static class263 field2179 = class253.method1681(-120, "slide:");

    @OriginalMember(owner = "client!u", name = "w", descriptor = "Loh;")
    public static class263 field2171 = field2179;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "Loh;")
    public static class263 field2178 = field2179;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public int field2165;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public int field2167;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public int field2169;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public int field2176;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Lpc;")
    public class21 field2166;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "Lpc;")
    public class21 field2168;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "Loh;")
    public class263 field2174;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "Z")
    public boolean field2177;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "[Ljava/lang/Object;")
    public Object[] field2173;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIZ)V")
    public static final void method759(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class254.field4425 = arg1;
        class85.field1678 = arg2;
        class263.field4590 = arg3;
        class219.field3887 = new class2[arg0][class254.field4425][class85.field1678];
        class163.field2968 = new int[arg0][class254.field4425 + 1][class85.field1678 + 1];
        if (arg4) {
            class137.field2518 = new class2[1][class254.field4425][class85.field1678];
            class112.field2103 = new int[class254.field4425][class85.field1678];
            class157.field2825 = new int[1][class254.field4425 + 1][class85.field1678 + 1];
        } else {
            class137.field2518 = null;
            class112.field2103 = null;
            class157.field2825 = null;
        }
        class165.method1087(false);
        class70.field1415 = new class253[500];
        class59.field1229 = 0;
        class14.field354 = new class253[500];
        class196.field3568 = 0;
        class35.field820 = new int[arg0][class254.field4425 + 1][class85.field1678 + 1];
        class93.field1827 = new class70[5000];
        class86.field1728 = 0;
        class165.field3001 = new class70[100];
        class22.field647 = new boolean[class263.field4590 + class263.field4590 + 1][class263.field4590 + class263.field4590 + 1];
        class134.field2466 = new boolean[class263.field4590 + class263.field4590 + 2][class263.field4590 + class263.field4590 + 2];
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIILnj;JZ)V")
    public static final void method760(int arg0, int arg1, int arg2, int arg3, class139 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class165 var8 = new class165();
        var8.field3002 = arg4;
        var8.field3014 = arg1 * 128 + 64;
        var8.field3008 = arg2 * 128 + 64;
        var8.field3000 = arg3;
        var8.field3013 = arg5;
        if (class18.field417[arg0][arg1][arg2] == null) {
            class18.field417[arg0][arg1][arg2] = new class2(arg0, arg1, arg2);
        }
        class18.field417[arg0][arg1][arg2].field52 = var8;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([BI)Lrc;")
    public static final class65 method761(byte[] arg0, int arg1) {
        field2175++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != 1) {
            method762(-28);
        }
        class192 var2 = new class192(arg0, class198.field3584, class46.field1003, class198.field3583, class181.field3289, class191.field3425);
        class14.method111(arg1 - 1);
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
    public static void method762(int arg0) {
        int var1 = 31 % ((-arg0 - 3) / 33);
        field2178 = null;
        field2179 = null;
        field2170 = null;
        field2171 = null;
        field2162 = null;
    }
}
