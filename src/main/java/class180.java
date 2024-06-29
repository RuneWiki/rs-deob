import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class180 extends RuntimeException {

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Ljava/lang/String;")
    public String field3565;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3563;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field3561 = 0;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field3559 = 0;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field3568 = 0;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field3569 = 0;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lcd;")
    private static class23 field3570 = class54.method414("as it was used to break our rules)3", -1);

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Lcd;")
    public static class23 field3571 = field3570;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lcc;")
    public static class22 field3566;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Z")
    public static final boolean method1116(int arg0, int arg1) {
        field3562++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            if (arg1 != 1645) {
                field3571 = null;
            }
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILkh;I)Z")
    public static final boolean method1117(int arg0, class97 arg1, int arg2) {
        field3567++;
        byte[] var3 = arg1.method653((byte) 117, arg2);
        if (var3 == null) {
            return false;
        }
        if (arg0 != -10267) {
            field3566 = null;
        }
        class175.method1100(arg0 ^ 0x2808, var3);
        return true;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lcd;Lcd;ILcd;)V")
    public static final void method1118(class23 arg0, class23 arg1, int arg2, class23 arg3) {
        if (arg2 != 24353) {
            method1119((byte) 72);
        }
        class105.field2276 = arg1;
        field3564++;
        class105.field2268 = arg0;
        class105.field2278 = arg3;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class180(Throwable arg0, String arg1) {
        this.field3565 = arg1;
        this.field3563 = arg0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method1119(byte arg0) {
        field3570 = null;
        if (arg0 >= 100) {
            field3566 = null;
            field3571 = null;
        }
    }
}
