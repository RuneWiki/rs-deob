import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class493 {

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "B")
    public byte field7444;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public int field7445;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "Ljava/lang/String;")
    public String field7442;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "Ljava/lang/String;")
    public String field7446;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "Ljava/lang/String;")
    public String field7447;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "Ljava/lang/String;")
    public String field7448;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)S")
    public static final short method3014(int arg0, int arg1) {
        if (arg1 != -1947159711) {
            return -61;
        }
        field7441++;
        int var2 = arg0 >> 10 & 0x3F;
        int var3 = (arg0 & 0x382) >> 3;
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IBI)I")
    public static final int method3015(int arg0, byte arg1, int arg2) {
        if (arg1 != -102) {
            method3015(93, (byte) -2, 49);
        }
        field7443++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }
}
