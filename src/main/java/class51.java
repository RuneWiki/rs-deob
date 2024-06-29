import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class51 {

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field901 = 0;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Lr;")
    public static class66 field899 = class93.method641(43, "k");

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Ldd;")
    public static class43 field897;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Lha;")
    public static class63 field902;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)Ltc;")
    public static final class93 method352(int arg0, int arg1) {
        field900++;
        class93 var2 = (class93) class156.field2768.method1617(14366, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class1.field8.method135(arg0, 0, arg1);
        class93 var4 = new class93();
        if (var3 != null) {
            var4.method649(true, new class249(var3));
        }
        class156.field2768.method1615(var4, 110, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)Z")
    public static final boolean method353(int arg0, int arg1) {
        field904++;
        if (arg1 != 31155) {
            return true;
        } else if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lha;I)Z")
    public static final boolean method354(class63 arg0, int arg1) {
        if (arg1 != 29905) {
            return false;
        }
        field903++;
        if (arg0.field1131 == 205) {
            class125.field2365 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static void method355(byte arg0) {
        field897 = null;
        int var1 = 41 / ((50 - arg0) / 46);
        field899 = null;
        field902 = null;
    }
}
