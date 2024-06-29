import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class173 extends class69 {

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "Lsj;")
    public static class48 field2784 = new class48();

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2800 = "level: ";

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public int field2785;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public int field2787;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public int field2788;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public int field2789;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public int field2797;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "Leb;")
    public class103 field2796;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "Leb;")
    public class103 field2804;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "Lch;")
    public static class125 field2801;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "Ljj;")
    public static class134 field2803;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "Ljava/lang/String;")
    public String field2793;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "Z")
    public boolean field2786;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "[I")
    public static int[] field2790;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "[Ljava/lang/Object;")
    public Object[] field2798;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
    public static void method1202(byte arg0) {
        if (arg0 <= 45) {
            method1204((class103) null, 85);
        }
        field2800 = null;
        field2803 = null;
        field2790 = null;
        field2801 = null;
        field2784 = null;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)I")
    public static final int method1203(byte arg0) {
        int var1 = -117 % ((-arg0 - 64) / 57);
        field2795++;
        return class219.field3507 && class247.field3975[81] && class202.field3248 > 2 ? class3.field36[class202.field3248 - 2] : class3.field36[class202.field3248 - 1];
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Leb;I)V")
    public static final void method1204(class103 arg0, int arg1) {
        field2791++;
        class103 var2 = class113.method816((byte) -26, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class107.field1856;
            var4 = class97.field1469;
        } else {
            var3 = var2.field1691;
            var4 = var2.field1693;
        }
        if (arg1 == 1) {
            class254.method1660(var4, false, arg0, var3, arg1 ^ 0xFFFFFFFC);
            class242.method1593(var3, var4, 14988, arg0);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([S[Ljava/lang/String;B)V")
    public static final void method1205(short[] arg0, String[] arg1, byte arg2) {
        field2802++;
        class108.method790(arg1, 1, 0, arg1.length - 1, arg0);
        if (arg2 < 12) {
            field2803 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)I")
    public static final int method1206(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 243) {
            arg1 >>= 0x4;
        } else if (arg0 > 217) {
            arg1 >>= 0x3;
        } else if (arg0 > 192) {
            arg1 >>= 0x2;
        } else if (arg0 > 179) {
            arg1 >>= 0x1;
        }
        field2794++;
        if (arg3 <= 54) {
            field2801 = null;
        }
        return (arg1 >> 5 << 7) + (arg2 >> 2 << 10) + (arg0 >> 1);
    }
}
