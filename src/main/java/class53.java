import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class53 {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field873 = 0;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "[Lpi;")
    public static class139[] field872;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method364(int arg0) {
        field872 = null;
        if (arg0 != -49) {
            field872 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Loa;Z)Z")
    public static final boolean method365(class99 arg0, boolean arg1) {
        if (!arg1) {
            return true;
        }
        field871++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class82.field1450; var2++) {
            if (arg0.method706(class57.field955[var2], 117)) {
                return true;
            }
        }
        return arg0.method706(class168.field3006.field3224, 122);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IS)Z")
    public static final boolean method366(int arg0, short arg1) {
        field876++;
        if (arg1 == 13 || arg1 == 36 || arg1 == 43 || arg1 == 32 || arg1 == 14 || arg1 == 29 || arg1 == 3 || arg1 == 7) {
            return true;
        } else if ((short) arg0 == arg1 || arg1 == 19 || arg1 == 1007 || arg1 == 1002) {
            return true;
        } else if (arg1 == 38 || arg1 == 24 || arg1 == 26 || arg1 == 48 || arg1 == 9) {
            return true;
        } else {
            return arg1 == 28 || arg1 == 21 || arg1 == 17 || arg1 == 46 || arg1 == 23 || arg1 == 4;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBILtf;I)V")
    public static final void method367(int arg0, byte arg1, int arg2, class107 arg3, int arg4) {
        field874++;
        if (class105.field1761 >= 3) {
            class68.method454(arg0, arg4, 0, arg3.field1930, arg3.field1858);
        } else {
            ((class4) class48.field795).method42(arg0, arg4, arg3.field1933, arg3.field1793, class48.field795.field2458 / 2, class48.field795.field2455 / 2, class239.field4129, 256, arg3.field1930, arg3.field1858);
        }
        class101.field1720[arg2] = true;
        if (arg1 != -107) {
            field873 = -64;
        }
    }
}
