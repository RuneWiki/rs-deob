import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class46 {

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field607 = -1;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field609 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field605 = 0;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field608 = 0;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILql;)V", line = 8)
    public static final void method358(int arg0, class337 arg1) {
        field606++;
        if (arg0 >= -8) {
            field608 = 9;
        }
        class166 var2 = (class166) class99.field1304.method2168(class83.method608(arg1.field5277, (byte) -73), (byte) -104);
        if (var2 == null) {
            class58.method475((class212) null, arg1, 0, class154.field2392, arg1.field4708[0], 128, arg1.field4675[0], (class121) null);
        } else {
            var2.method1246(false);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)Llm;", line = 27)
    public static final class221 method359(int arg0, int arg1) {
        field610++;
        int var2 = 6 % ((-arg0 - 75) / 36);
        class221 var3 = (class221) class194.field3088.method1351((long) arg1, 63);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class126.field1826.method1813(class66.method525(1023, arg1), class284.method2014(arg1, -508020886), true);
        class221 var5 = new class221();
        if (var4 != null) {
            var5.method1618(new class6(var4), (byte) -40);
        }
        class194.field3088.method1347(var5, (long) arg1, (byte) -109);
        return var5;
    }
}
