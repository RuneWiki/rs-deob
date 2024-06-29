import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class151 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2900 = 0;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2905 = 0;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static final void method1048(byte arg0) {
        if (arg0 == 10) {
            class7.field120.method32(82, arg0 + 12875);
            field2901++;
            class7.field120.method978(-123, 0L);
            class158.field3059++;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Ltc;")
    public static final class192 method1049(int arg0, int arg1) {
        field2904++;
        class192 var2 = (class192) class160.field3095.method1383((long) arg1, (byte) 117);
        if (var2 != null) {
            return var2;
        }
        int var3 = 33 % ((arg0 - 25) / 40);
        byte[] var4 = class31.field628.method1065((byte) -97, arg1, 4);
        class192 var5 = new class192();
        if (var4 != null) {
            var5.method1269((byte) -28, arg1, new class146(var4));
        }
        class160.field3095.method1378(var5, (byte) -13, (long) arg1);
        return var5;
    }
}
