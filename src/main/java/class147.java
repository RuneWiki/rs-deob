import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class147 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Lqe;")
    public static class179 field2658 = class206.method1380("Ihr Charakter)2Profil wird in:", (byte) 97);

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field2665 = 0;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Lqe;")
    private static class179 field2664 = class206.method1380("white:", (byte) 118);

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Lqe;")
    public static class179 field2663 = field2664;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "[Z")
    public static boolean[] field2667 = new boolean[100];

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Lqe;")
    public static class179 field2662 = field2664;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Lpc;")
    public static class166 field2666;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lcd;")
    public static class26 field2661;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lra;II)Lqe;")
    public static final class179 method943(class185 arg0, int arg1, int arg2) {
        field2660++;
        try {
            if (arg1 != -26) {
                field2663 = null;
            }
            class179 var3 = new class179();
            var3.field3277 = arg0.method1215((byte) 93);
            if (var3.field3277 > arg2) {
                var3.field3277 = arg2;
            }
            var3.field3256 = new byte[var3.field3277];
            arg0.field3432 += class185.field3435.method737(0, var3.field3256, 9158, var3.field3277, arg0.field3432, arg0.field3397);
            return var3;
        } catch (Exception var4) {
            return class117.field2222;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method944(byte arg0) {
        field2663 = null;
        field2662 = null;
        field2661 = null;
        field2667 = null;
        field2664 = null;
        field2658 = null;
        if (arg0 >= -18) {
            method943(null, 97, 81);
        }
        field2666 = null;
    }
}
