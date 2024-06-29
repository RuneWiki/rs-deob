import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class608 {

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "Lpja;")
    public static class43 field8484 = new class43(64);

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "Z")
    public static boolean field8486 = false;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "Z")
    public static boolean field8490 = false;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "[Lija;")
    public static class366[] field8491 = new class366[14];

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    public static int field8485;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "Leaa;")
    public static class528 field8487;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
    public static void method3452(int arg0) {
        field8487 = null;
        int var1 = 4 % ((arg0 + 47) / 52);
        field8491 = null;
        field8484 = null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)V")
    public static final void method3453(int arg0, int arg1) {
        field8488++;
        if (arg1 != -27019) {
            field8491 = null;
        }
        class281 var2 = class54.method395((byte) -53, (long) arg0, 7);
        var2.method1818((byte) 106);
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)V")
    public static final void method3454(int arg0) {
        class276.field3827.method272(20);
        if (arg0 > 100) {
            field8489++;
        }
    }
}
