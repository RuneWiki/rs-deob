import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class62 {

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Lcd;")
    private static class23 field1430 = class54.method414("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", -1);

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "[I")
    public static int[] field1433 = new int[256];

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field1434 = 0;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Lcd;")
    private static class23 field1437 = class54.method414("Loaded wordpack", -1);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lcd;")
    public static class23 field1428 = field1437;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "[Lfh;")
    public static class54[] field1435 = new class54[4];

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lcd;")
    public static class23 field1438 = field1430;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Lcf;")
    public static class25 field1436 = new class25();

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Lcd;")
    public static class23 field1440 = class54.method414("Benutzername: ", -1);

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "[I")
    public static int[] field1441 = new int[50];

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "[Lcd;")
    public static class23[] field1439 = new class23[1000];

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Lfa;")
    public static class47 field1442;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Lfe;")
    public static class51 field1431;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)Li;")
    public static final class72 method460(byte arg0) {
        field1432++;
        if (arg0 != -62) {
            field1439 = null;
        }
        if (class9.field172 == null) {
            class9.field172 = new class72();
        }
        return class9.field172;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static void method461(int arg0) {
        field1431 = null;
        if (arg0 != 4) {
            method462(-96, true, -106);
        }
        field1441 = null;
        field1436 = null;
        field1440 = null;
        field1437 = null;
        field1430 = null;
        field1442 = null;
        field1428 = null;
        field1433 = null;
        field1438 = null;
        field1435 = null;
        field1439 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZI)Lcd;")
    public static final class23 method462(int arg0, boolean arg1, int arg2) {
        if (arg0 == 256) {
            field1429++;
            return class156.method956(false, 10, arg2, arg1);
        } else {
            return null;
        }
    }
}
