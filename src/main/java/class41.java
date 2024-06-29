import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class41 {

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Loa;")
    private static class99 field693 = class221.method1463(2844, "green:");

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Loa;")
    public static class99 field691 = class221.method1463(2844, "_labels");

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Loa;")
    public static class99 field695 = field693;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field694 = 0;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Loa;")
    public static class99 field696 = field693;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Z")
    public static volatile boolean field698 = false;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field702 = 0;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field703 = 0;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Ltf;")
    public static class107 field700;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "Ltg;")
    public static class182 field701;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    public static final void method312(int arg0, int arg1) {
        class216 var2 = class128.field2236[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class216 var4 = class128.field2236[var3][arg0][arg1] = class128.field2236[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3747--;
                for (int var5 = 0; var5 < var4.field3748; var5++) {
                    class77 var6 = var4.field3743[var5];
                    if ((var6.field1372 >> 29 & 0x3L) == 2L && var6.field1362 == arg0 && var6.field1357 == arg1) {
                        var6.field1374--;
                    }
                }
            }
        }
        if (class128.field2236[0][arg0][arg1] == null) {
            class128.field2236[0][arg0][arg1] = new class216(0, arg0, arg1);
        }
        class128.field2236[0][arg0][arg1].field3740 = var2;
        class128.field2236[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static final void method313(byte arg0) {
        field692++;
        class249.field4294.method1812(arg0 - 181);
        if (arg0 == 56) {
            class247.field4250.method1812(arg0 - 129);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILtg;)V")
    public static final void method314(int arg0, class182 arg1) {
        class37.field634 = arg1;
        if (arg0 < -77) {
            field697++;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lgi;B)V")
    public static final void method315(class156 arg0, byte arg1) {
        field699++;
        if (arg1 != 90) {
            field698 = true;
        }
        for (class80 var2 = (class80) class111.field2002.method529(arg1 - 80); var2 != null; var2 = (class80) class111.field2002.method533(arg1 ^ 0xFFFFFF91)) {
            if (var2.field1420 == arg0) {
                if (var2.field1425 != null) {
                    class165.field2899.method1076(var2.field1425);
                    var2.field1425 = null;
                }
                var2.method828((byte) 126);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public static void method316(byte arg0) {
        field693 = null;
        field695 = null;
        field701 = null;
        if (arg0 <= -109) {
            field700 = null;
            field691 = null;
            field696 = null;
        }
    }
}
