import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class118 extends class46 {

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "Lmf;")
    public class136 field2243;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "[I")
    public static int[] field2242 = new int[50];

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "Ljh;")
    public static class106 field2241 = new class106(5000);

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "Lmb;")
    public static class132 field2245 = class166.method1092("; Expires=", 117);

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "Lmb;")
    private static class132 field2247 = class166.method1092(" from your ignore list first)3", 120);

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "Lmb;")
    public static class132 field2246 = field2247;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "[I")
    public static int[] field2244;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(B)V")
    public static void method787(byte arg0) {
        field2242 = null;
        field2245 = null;
        int var1 = 84 % ((24 - arg0) / 59);
        field2244 = null;
        field2246 = null;
        field2247 = null;
        field2241 = null;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lmf;)V")
    public class118(class136 arg0) {
        this.field2243 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(B)I")
    public static final int method788(byte arg0) {
        field2240++;
        if (class53.field902 == 3.0D) {
            return 37;
        } else if (class53.field902 == 4.0D) {
            return 50;
        } else if (class53.field902 == 6.0D) {
            return 75;
        } else if (arg0 == -7) {
            return 100;
        } else {
            return 68;
        }
    }
}
