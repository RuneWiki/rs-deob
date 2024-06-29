import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class481 {

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "Ljo;")
    public static class351 field6845 = new class351(60, 6);

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "Ljo;")
    public static class351 field6846 = new class351(77, 0);

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "[[S")
    public static short[][] field6844;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V")
    public static void method2821(boolean arg0) {
        field6845 = null;
        field6844 = null;
        if (!arg0) {
            field6844 = null;
        }
        field6846 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
    public static final void method2822(int arg0) {
        field6843++;
        class145.field1852.method3632(class145.field1852.field9026, true, 1);
        class145.field1852.method3632(class145.field1852.field9018, true, 1);
        class145.field1852.method3632(class145.field1852.field9015, true, 2);
        class145.field1852.method3632(class145.field1852.field8994, true, 2);
        class145.field1852.method3632(class145.field1852.field8993, true, 1);
        class145.field1852.method3632(class145.field1852.field9030, true, 1);
        class145.field1852.method3632(class145.field1852.field9033, true, 1);
        class145.field1852.method3632(class145.field1852.field8998, true, 1);
        class145.field1852.method3632(class145.field1852.field9008, true, 1);
        class145.field1852.method3632(class145.field1852.field9031, true, 1);
        class145.field1852.method3632(class145.field1852.field9017, true, 2);
        class145.field1852.method3632(class145.field1852.field8986, true, 1);
        class145.field1852.method3632(class145.field1852.field9011, true, 2);
        class145.field1852.method3632(class145.field1852.field8996, true, 1);
        class145.field1852.method3632(class145.field1852.field9023, true, 0);
        class145.field1852.method3632(class145.field1852.field8991, true, 0);
        class145.field1852.method3632(class145.field1852.field9021, true, 2);
        class145.field1852.method3632(class145.field1852.field8999, true, 0);
        class145.field1852.method3632(class145.field1852.field8981, true, arg0);
        class518.method3015(-79);
        class145.field1852.method3632(class145.field1852.field9010, true, 0);
        class145.field1852.method3632(class145.field1852.field8995, true, 4);
        class292.method1978(true);
        class696.method3921((byte) -21);
        class654.field9234 = true;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lcb;I)V")
    public static final void method2823(class544 arg0, int arg1) {
        class698.field9857 = arg0.method3134(0, "hitmarks");
        field6841++;
        class573.field8113 = arg0.method3134(0, "hitbar_default");
        class14.field259 = arg0.method3134(0, "timerbar_default");
        class269.field3780 = arg0.method3134(0, "headicons_pk");
        class237.field3414 = arg0.method3134(0, "headicons_prayer");
        class264.field3728 = arg0.method3134(0, "hint_headicons");
        class305.field4565 = arg0.method3134(0, "hint_mapmarkers");
        class631.field8904 = arg0.method3134(0, "mapflag");
        class631.field8913 = arg0.method3134(0, "cross");
        class37.field523 = arg0.method3134(0, "mapdots");
        class325.field4870 = arg0.method3134(0, "scrollbar");
        class181.field2757 = arg0.method3134(0, "name_icons");
        class758.field10469 = arg0.method3134(arg1 - 23381, "floorshadows");
        class688.field9746 = arg0.method3134(arg1 ^ arg1, "compass");
        class75.field1003 = arg0.method3134(arg1 - 23381, "otherlevel");
        class645.field9083 = arg0.method3134(0, "hint_mapedge");
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)V")
    public static final void method2824(int arg0, int arg1) {
        field6842++;
        if (class458.field6562 == arg1) {
            return;
        }
        class109.field1314 = class760.field10479 = class406.field5738[arg1];
        if (arg0 != 11423) {
            return;
        }
        class17.method145((byte) -116);
        class303.field4547 = new int[class109.field1314][class760.field10479];
        class502.field7185 = new int[class109.field1314][class760.field10479];
        class626.field8833 = new int[4][class109.field1314 >> 3][class760.field10479 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class234.field3394[var2] = class459.method2736(class109.field1314, class760.field10479, 22204);
        }
        class278.field3871 = new byte[4][class109.field1314][class760.field10479];
        class779.method4281(class109.field1314, class760.field10479, (byte) 126, 4);
        class340.method2179(class109.field1314 >> 3, (byte) -87, class760.field10479 >> 3, class638.field8979);
        class458.field6562 = arg1;
    }
}
