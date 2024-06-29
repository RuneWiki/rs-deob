import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class69 {

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1378 = 0;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Z")
    public static volatile boolean field1381 = false;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Led;")
    public static class43 field1383 = class191.method1219("Lade Texturen )2 ", false);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lpg;")
    public static class143 field1377;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "Lga;")
    public static class58 field1384;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "[Ltg;")
    public static class179[] field1380;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method427(byte arg0) {
        field1383 = null;
        field1377 = null;
        int var1 = 56 / ((arg0 + 3) / 49);
        field1380 = null;
        field1384 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Lla;")
    public static final class101 method428(int arg0, int arg1) {
        field1376++;
        class101 var2 = (class101) class206.field4012.method1106(100, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class101 var3 = class68.method426(class166.field3290, arg1, class65.field1318, false, arg0 ^ arg0);
        if (var3 != null) {
            class206.field4012.method1107((long) arg1, var3, 76);
        }
        return var3;
    }
}
