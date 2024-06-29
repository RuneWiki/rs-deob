import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class25 {

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lck;")
    public static class119 field377 = class298.method1987((byte) 106, "cross");

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field380 = 0;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Lck;")
    public static class119 field381 = class298.method1987((byte) 78, ":clanreq:");

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lva;")
    public static class36 field379;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "[[Lib;")
    public static class145[][] field374;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "[[Lib;")
    public static class145[][] field376;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)Z", line = 28)
    public static final boolean method187(byte arg0, int arg1) {
        if (arg0 == 65) {
            field378++;
            return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BZ)V", line = 48)
    public static final void method188(byte arg0, boolean arg1) {
        int var2 = -108 % ((arg0 - 49) / 44);
        class199.method1272(class119.field1822, (byte) -125, class131.field2000, class269.field4437, arg1);
        field375++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 60)
    public static void method189(byte arg0) {
        field379 = null;
        field374 = (class145[][]) null;
        field377 = null;
        if (arg0 == 21) {
            field381 = null;
            field376 = (class145[][]) null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)I", line = 77)
    public static final int method190(int arg0, int arg1, int arg2) {
        field373++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (arg2 > var3) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }
}
