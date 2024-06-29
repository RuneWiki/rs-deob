import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class126 {

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public int field1518 = -1;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Z")
    public static boolean field1509 = true;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public int field1507;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public int field1508;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public int field1512;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public int field1514;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public int field1515;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)I", line = 6)
    public static final int method814(byte arg0) {
        field1513++;
        if (class627.field8740 == null) {
            if (arg0 != 23) {
                method815(-98, 75, 40);
            }
            return class501.field7062 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Z", line = 22)
    public static final boolean method815(int arg0, int arg1, int arg2) {
        field1510++;
        if (arg1 != 3) {
            method814((byte) 14);
        }
        return class467.method2759(6509, arg2, arg0) & class439.method2592(-64, arg0, arg2);
    }
}
