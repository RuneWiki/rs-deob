import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class77 extends class65 {

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "Lpj;")
    public static class237 field1450 = class33.method353("logo", 111);

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "Lpj;")
    public static class237 field1451 = class33.method353("overlay", 67);

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "Laj;")
    public static class46 field1449;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)Z")
    public static final boolean method593(int arg0, byte arg1) {
        field1454++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = -51 / ((arg1 - 43) / 53);
        int var3 = class235.field4090[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        return var3 == 1004;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)V")
    public static void method594(boolean arg0) {
        field1450 = null;
        field1451 = null;
        field1449 = null;
        if (!arg0) {
            method595(95, -84);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
    public static final void method595(int arg0, int arg1) {
        if (arg1 <= 115) {
            method593(30, (byte) 80);
        }
        field1453++;
        class41.field926.method939(arg0, 1);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static final void method596(int arg0) {
        field1452++;
        if (arg0 == 32631) {
            class64.field1276.method942(0);
        }
    }
}
