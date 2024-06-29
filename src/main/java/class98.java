import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class98 {

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field1432 = 0;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Lok;")
    public static class41 field1435 = class137.method956("underlay", 45);

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field1436 = 10;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Lmh;")
    public static class65 field1433;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 12)
    public static final void method699(int arg0) {
        int var1 = 0;
        field1431++;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class226.method1620(true, var2, var1, class205.field3312, 16752871, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 <= 107) {
            field1436 = 54;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V", line = 63)
    public static void method700(byte arg0) {
        field1435 = null;
        int var1 = -42 % ((arg0 - 15) / 57);
        field1433 = null;
    }
}
