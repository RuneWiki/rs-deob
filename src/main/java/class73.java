import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class73 {

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Lwd;")
    public static class232 field1422 = null;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public int field1424;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "J")
    public long field1421;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Lwg;")
    public class235 field1423;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)I")
    public static final int method478(int arg0, int arg1) {
        if (arg0 != 156) {
            method478(73, -70);
        }
        field1420++;
        if (arg1 >= 65 && arg1 <= 90 || arg1 >= 192 && arg1 <= 222 && arg1 != 215) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)I")
    public static int method479(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static void method480(byte arg0) {
        if (arg0 == 127) {
            field1422 = null;
        }
    }
}
