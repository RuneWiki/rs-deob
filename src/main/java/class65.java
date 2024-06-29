import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class65 {

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1546 = 0;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Ldd;")
    public static class35 field1545 = class180.method1196((byte) -116, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Ldd;")
    public static class35 field1548 = class180.method1196((byte) -113, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field1547 = 0;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lph;")
    public static class151 field1549;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Ldd;")
    public static final class35 method535(int arg0, int arg1) {
        field1550++;
        class35 var2 = class3.method19(arg1, -29578);
        if (arg0 != -4) {
            return null;
        }
        for (int var3 = var2.method347((byte) -126) - 3; var3 > 0; var3 -= 3) {
            var2 = class63.method529(new class35[] { var2.method326(0, arg0 ^ 0xFFFFFF8F, var3), class134.field2872, var2.method344(var3, -26886) }, (byte) 105);
        }
        if (var2.method347((byte) -116) > 9) {
            return class63.method529(new class35[] { class160.field3249, var2.method326(0, -45, var2.method347((byte) -117) - 8), class37.field833, class200.field3999, var2, class36.field802 }, (byte) 93);
        } else if (var2.method347((byte) -97) > 6) {
            return class63.method529(new class35[] { class174.field3525, var2.method326(0, 3, var2.method347((byte) -124) - 4), class56.field1397, class200.field3999, var2, class36.field802 }, (byte) 63);
        } else {
            return class63.method529(new class35[] { class175.field3583, var2, class62.field1509 }, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static void method536(byte arg0) {
        field1549 = null;
        field1548 = null;
        field1545 = null;
        if (arg0 != 123) {
            field1548 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
    public static final void method537(int arg0, int arg1, int arg2) {
        class54 var3 = class191.field3853[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field1218; var4++) {
            class131 var5 = var3.field1225[var4];
            if ((var5.field2822 >> 29 & 0x3L) == 2L && var5.field2816 == arg1 && var5.field2812 == arg2) {
                class82.method622(var5);
                return;
            }
        }
    }
}
