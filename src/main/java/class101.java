import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class101 {

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field1526 = 0;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1530 = "Checking for updates - ";

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field1527 = 1;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "[S")
    public static short[] field1532 = new short[] { 60, 6, 36, 15, 20, 10, 30, 28 };

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lwk;")
    public static class157 field1525;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method711(byte arg0) {
        field1525 = null;
        if (arg0 != 59) {
            field1530 = null;
        }
        field1532 = null;
        field1530 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILcb;)V")
    public static final void method712(int arg0, class255 arg1) {
        class14 var2 = null;
        field1531++;
        try {
            class137 var3 = arg1.method1671((byte) -120, "runescape");
            while (var3.field2271 == 0) {
                class208.method1408(127, 1L);
            }
            if (var3.field2271 == 1) {
                var2 = (class14) var3.field2266;
                class264 var4 = class181.method1251(false);
                var2.method111(var4.field4195, var4.field4198, 1, 0);
            }
            if (arg0 < 13) {
                field1532 = null;
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method109(-73);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI)V")
    public static final void method713(boolean arg0, int arg1) {
        field1529++;
        class185.field2970 = arg0;
        if (arg1 != -21793) {
            method712(-18, (class255) null);
        }
        class130.field2177 = !class200.method1349(false);
    }
}
