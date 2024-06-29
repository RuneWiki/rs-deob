import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class283 {

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lmh;")
    public static class128 field4865 = class22.method156(122, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lmh;")
    private static class128 field4863 = class22.method156(125, "Loaded interfaces");

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Lmh;")
    public static class128 field4867 = field4863;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "[Lmh;")
    public static class128[] field4868 = new class128[500];

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field4870 = 0;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Lmh;")
    public static class128 field4866 = class22.method156(127, "; Expires=");

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field4872 = 0;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Lqg;")
    public static class231 field4871;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "[Lvd;")
    public static class127[] field4869;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BII)V", line = 7)
    public static final void method1964(byte arg0, int arg1, int arg2) {
        field4864++;
        int var3 = arg2--;
        int var4 = class104.field1776[arg2];
        int var5 = class103.field1770[arg2];
        if (var3 > 25) {
            var3 = 25;
        }
        if (arg1 == 0) {
            class71.field1320.method570(236, -1);
            class71.field1320.method1352(7528, var3 + var3 + 3);
            class289.field4934++;
        }
        if (arg1 == 1) {
            class289.field4946++;
            class71.field1320.method570(207, -1);
            class71.field1320.method1352(7528, var3 + var3 + 14 + 3);
        }
        if (arg0 > -94) {
            field4866 = (class128) null;
        }
        if (arg1 == 2) {
            class71.field1320.method570(84, -1);
            class188.field3268++;
            class71.field1320.method1352(7528, var3 + var3 + 3);
        }
        class71.field1320.method1324(class4.field72 + var4, 15803);
        class71.field1320.method1342(class257.field4426[82] ? 1 : 0, false);
        class114.field1907 = class104.field1776[0];
        class219.field3863 = class103.field1770[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg2--;
            class71.field1320.method1296(true, class103.field1770[arg2] - var5);
            class71.field1320.method1296(true, class104.field1776[arg2] - var4);
        }
        class71.field1320.method1298(class221.field3889 + var5, (byte) -106);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 110)
    public static void method1965(int arg0) {
        field4863 = null;
        field4865 = null;
        field4866 = null;
        field4867 = null;
        field4869 = null;
        if (arg0 == 32) {
            field4871 = null;
            field4868 = null;
        }
    }
}
