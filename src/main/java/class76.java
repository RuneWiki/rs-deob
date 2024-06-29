import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class76 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Z")
    public static boolean field1107 = false;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lmba;")
    public static class646 field1112 = new class646();

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field1114 = 0;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lbk;")
    public static class446 field1115 = new class446("WIP", 2);

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Lwn;")
    public static class585 field1116 = new class585("", 18);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 5)
    public static void method567(int arg0) {
        field1115 = null;
        field1116 = null;
        if (arg0 != -15477) {
            field1107 = true;
        }
        field1112 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lvi;", line = 21)
    public static final class370 method568(int arg0, int arg1) {
        field1109++;
        if (class711.field9940 && arg0 >= class650.field8719 && arg0 <= class15.field147) {
            if (arg1 != 1) {
                field1107 = true;
            }
            return class393.field5649[arg0 - class650.field8719];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V", line = 37)
    public static final void method569(String arg0, byte arg1, String arg2) {
        class73.field1096 = 1;
        if (arg1 < 24) {
            field1114 = 122;
        }
        class336.field4726 = -1;
        field1108++;
        class115.method733(arg0, false, arg2, (byte) 113);
    }
}
