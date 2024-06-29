import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lv;")
    public static class146 field1696 = class159.method1226((byte) -37, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Lv;")
    public static class146 field1697 = class159.method1226((byte) -37, "leuchten1:");

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Lv;")
    private static class146 field1695 = class159.method1226((byte) -37, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lv;")
    public static class146 field1699 = field1695;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "B")
    public static byte field1703 = 0;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lv;")
    public static class146 field1702 = class159.method1226((byte) -37, ")1");

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Lla;")
    public static class77 field1704;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)Lic;")
    public static final class59 method524(byte arg0, int arg1) {
        field1698++;
        class59 var2 = (class59) class127.field2929.method1045((long) arg1, -44);
        if (var2 != null) {
            return var2;
        } else if (arg0 < 61) {
            return null;
        } else {
            byte[] var3 = class141.field3225.method585(10, 82, arg1);
            class59 var4 = new class59();
            var4.field1322 = arg1;
            if (var3 != null) {
                var4.method411(new class95(var3), 112);
            }
            var4.method415(0);
            if (var4.field1333 != -1) {
                var4.method418(method524((byte) 78, var4.field1333), 1, method524((byte) 103, var4.field1353));
            }
            if (!class15.field246 && var4.field1320) {
                var4.field1309 = 0;
                var4.field1338 = class116.field2715;
                var4.field1321 = null;
                var4.field1372 = null;
            }
            class127.field2929.method1047(-1, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method525(int arg0) {
        field1699 = null;
        field1704 = null;
        field1696 = null;
        field1702 = null;
        field1697 = null;
        if (arg0 != 0) {
            method526((byte) -12);
        }
        field1695 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static final void method526(byte arg0) {
        if (arg0 != -57) {
            return;
        }
        if (class21.field320.toLowerCase().indexOf("microsoft") == -1) {
            class12.field191[46] = 72;
            class12.field191[47] = 73;
            class12.field191[92] = 74;
            class12.field191[91] = 42;
            if (class21.field322 == null) {
                class12.field191[192] = 58;
                class12.field191[222] = 59;
            } else {
                class12.field191[192] = 28;
                class12.field191[222] = 58;
                class12.field191[520] = 59;
            }
            class12.field191[45] = 26;
            class12.field191[59] = 57;
            class12.field191[93] = 43;
            class12.field191[44] = 71;
            class12.field191[61] = 27;
        } else {
            class12.field191[192] = 58;
            class12.field191[190] = 72;
            class12.field191[219] = 42;
            class12.field191[188] = 71;
            class12.field191[223] = 28;
            class12.field191[189] = 26;
            class12.field191[222] = 59;
            class12.field191[221] = 43;
            class12.field191[220] = 74;
            class12.field191[191] = 73;
            class12.field191[187] = 27;
            class12.field191[186] = 57;
        }
        field1700++;
    }
}
