import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class184 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Llt;")
    public static class475 field2739 = new class475("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Llt;")
    public static class475 field2740 = new class475("M", "M", "M", "M");

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "[I")
    public static int[] field2744 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lri;")
    public static class73 field2743 = new class73(47, 5);

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Lnd;")
    public static class380 field2745;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "[Llj;")
    public static class430[] field2746;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
    public static final int method1270(int arg0, int arg1) {
        field2741++;
        if (arg0 < 96) {
            return 0;
        } else if (arg1 == 2) {
            return arg0 < 128 ? 2 : 3;
        } else {
            return -36;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method1271(byte arg0) {
        field2739 = null;
        field2746 = null;
        field2745 = null;
        field2744 = null;
        field2740 = null;
        if (arg0 != -61) {
            field2746 = null;
        }
        field2743 = null;
    }
}
