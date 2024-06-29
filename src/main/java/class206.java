import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class206 {

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Loa;")
    public static class99 field3568 = class221.method1463(2844, "unzap");

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field3570 = -1;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Loa;")
    public static class99 field3563 = class221.method1463(2844, "Jeter");

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lpg;I)V")
    public static final void method1380(class75 arg0, int arg1) {
        field3569++;
        int var2 = arg0.field1314 - class56.field926;
        int var3 = arg0.field1289 * 128 + arg0.method516((byte) -65) * 64;
        int var4 = arg0.field1332 * 128 + (arg1 * arg0.method516((byte) -65));
        arg0.field1325 += (var3 - arg0.field1325) / var2;
        if (arg0.field1310 == 0) {
            arg0.field1275 = 1024;
        }
        if (arg0.field1310 == 1) {
            arg0.field1275 = 1536;
        }
        arg0.field1311 = 0;
        if (arg0.field1310 == 2) {
            arg0.field1275 = 0;
        }
        arg0.field1301 += (var4 - arg0.field1301) / var2;
        if (arg0.field1310 == 3) {
            arg0.field1275 = 512;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIII)V")
    public static final void method1381(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 119) {
            return;
        }
        field3566++;
        if (arg1 >= class178.field3101 && class137.field2414 >= arg1) {
            int var5 = class166.method1127(class79.field1395, arg0, class197.field3437, 8946);
            int var6 = class166.method1127(class79.field1395, arg3, class197.field3437, 8946);
            class51.method355((byte) 120, arg1, var6, arg4, var5);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method1382(byte arg0) {
        field3568 = null;
        if (arg0 == 120) {
            field3563 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ltg;ILtg;)V")
    public static final void method1383(class182 arg0, int arg1, class182 arg2) {
        field3564++;
        class244.field4208 = class77.method543(arg2, 0, arg1 - 236, class168.field2996, arg0);
        class152.field2667 = (class26) class244.field4208;
        if (arg1 != 128) {
            field3568 = null;
        }
        class44.field768 = class77.method543(arg2, 0, arg1 ^ 0x8A, class215.field3733, arg0);
        class228.field3950 = class77.method543(arg2, 0, 117, class280.field4914, arg0);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public static final void method1384(boolean arg0) {
        class201.field3489.method1813(-1);
        field3567++;
        if (arg0) {
            method1380((class75) null, 127);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)I")
    public static final int method1385(int arg0, boolean arg1) {
        if (arg0 != 0) {
            method1384(true);
        }
        long var2 = class231.method1513(-83);
        field3571++;
        for (class172 var4 = arg1 ? (class172) class276.field4852.method1552(102) : (class172) class276.field4852.method1549(96); var4 != null; var4 = (class172) class276.field4852.method1549(arg0 ^ 0x51)) {
            if (var2 > (var4.field3049 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field3049 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2187;
                    class43.field733[var5] = class209.field3613[var5];
                    var4.method828((byte) 127);
                    return var5;
                }
                var4.method828((byte) 122);
            }
        }
        return -1;
    }
}
