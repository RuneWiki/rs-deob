import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class119 {

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field58 = 0;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "[I")
    public static int[] field62 = new int[1000];

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public static int field61 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "Lai;")
    public static class10 field65 = class44.method278(" ", 115);

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "Lvb;")
    public static class192 field54 = new class192();

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field66 = 0;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public int field49;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public int field50;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "Lai;")
    public class10 field57;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "Lmb;")
    public static class111 field67;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "Lwa;")
    public class200 field55;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "Lwa;")
    public class200 field56;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "[Lai;")
    public static class10[] field51;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "[Ljava/lang/Object;")
    public Object[] field53;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static final void method13(int arg0) {
        for (class170 var1 = (class170) class145.field2777.method1223(true); var1 != null; var1 = (class170) class145.field2777.method1226((byte) -57)) {
            if (var1.field3277 != null) {
                class122.field2344.method1253(var1.field3277);
                var1.field3277 = null;
            }
            if (var1.field3288 != null) {
                class122.field2344.method1253(var1.field3288);
                var1.field3288 = null;
            }
        }
        if (arg0 != -8) {
            method14(-33);
        }
        class145.field2777.method1224((byte) 24);
        field64++;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
    public static void method14(int arg0) {
        field54 = null;
        field65 = null;
        int var1 = -95 % ((arg0 - 33) / 36);
        field67 = null;
        field51 = null;
        field62 = null;
    }
}
