import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class113 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lja;")
    public static class63 field2636 = new class63(64);

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Lec;")
    public static class32 field2637 = class73.method594("gelb:", true);

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field2639 = 0;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Lec;")
    public static class32 field2638 = class73.method594("Verbinde mit Server)3)3)3", true);

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field2640 = 500;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Lec;")
    public static class32 field2643 = class73.method594("Spieler", true);

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field2642 = 0;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Lec;")
    public static class32 field2645 = class73.method594("T", true);

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)I")
    public static final int method887(byte arg0) {
        int var1 = 78 % ((22 - arg0) / 60);
        field2641++;
        return class157.field3588++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static final void method888(int arg0) {
        class85.field1982.method57(125);
        for (int var1 = 0; var1 < 32; var1++) {
            class44.field1030[var1] = 0L;
        }
        field2644++;
        for (int var2 = 0; var2 < 32; var2++) {
            class125.field2905[var2] = 0L;
        }
        class105.field2490 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public static void method889(int arg0) {
        field2636 = null;
        field2645 = null;
        field2638 = null;
        field2637 = null;
        if (arg0 > 49) {
            field2643 = null;
        }
    }
}
