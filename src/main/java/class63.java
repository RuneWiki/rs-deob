import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class63 {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Z")
    public static volatile boolean field1239 = true;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field1240 = 0;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lvf;")
    public static class265 field1238 = class87.method582(-46, "m");

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lfl;BLfl;Lod;Lfl;)Z")
    public static final boolean method461(class192 arg0, byte arg1, class192 arg2, class21 arg3, class192 arg4) {
        class11.field380 = arg0;
        field1237++;
        if (arg1 != -43) {
            field1240 = 93;
        }
        class42.field941 = arg2;
        class208.field3754 = arg4;
        class270.field4818 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method462(int arg0) {
        if (arg0 == 88) {
            field1238 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public static final void method463(int arg0) {
        field1241++;
        class62.field1221++;
        class55.field1133.method1863(true, 88);
        int var1 = 116 % ((arg0 + 2) / 51);
        class55.field1133.method921(123, class126.field2262);
    }
}
