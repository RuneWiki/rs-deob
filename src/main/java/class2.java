import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Ljd;")
    public static class85 field15 = class221.method1499("leuchten2:", (byte) 101);

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Ljd;")
    public static class85 field18 = class221.method1499("::", (byte) 104);

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Z")
    public static boolean field17 = false;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field21 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Lfc;")
    public static class118 field22 = new class118();

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Lhe;")
    public static class19 field23 = new class19(0, 0);

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field24 = -1;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "B")
    public static byte field14;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Lge;")
    public static class68 field19;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "[I")
    public static int[] field20;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static final void method7(int arg0) {
        field16++;
        if (!class32.field487) {
            return;
        }
        class32.field487 = false;
        if (arg0 == -1) {
            class183.field3131 = null;
            class252.field4348 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method8(byte arg0) {
        field22 = null;
        field23 = null;
        field20 = null;
        field18 = null;
        field19 = null;
        if (arg0 < -74) {
            field15 = null;
        }
    }
}
