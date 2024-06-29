import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class110 {

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public int field1163;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)Z")
    public static final boolean method748(int arg0, int arg1, int arg2) {
        field1166++;
        if (!class149.field1652) {
            return false;
        }
        int var3 = -117 / ((arg2 + 37) / 61);
        int var4 = arg0 >> 16;
        int var5 = arg0 & 0xFFFF;
        if (class643.field9209[var4] == null || class643.field9209[var4][var5] == null) {
            return false;
        }
        class532 var6 = class643.field9209[var4][var5];
        if (arg1 == -1 && var6.field7543 == 0) {
            for (class649 var7 = (class649) class265.field3289.method1719(65280); var7 != null; var7 = (class649) class265.field3289.method1723(-20665)) {
                if (var7.field9270 == 13 || var7.field9270 == 1002 || var7.field9270 == 12 || var7.field9270 == 5 || var7.field9270 == 9) {
                    for (class532 var8 = class269.method1608((byte) -72, var7.field9274); var8 != null; var8 = class235.method1393((byte) -86, var8)) {
                        if (var6.field7704 == var8.field7704) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class649 var9 = (class649) class265.field3289.method1719(65280); var9 != null; var9 = (class649) class265.field3289.method1723(-20665)) {
                if (var9.field9271 == arg1 && var6.field7704 == var9.field9274 && (var9.field9270 == 13 || var9.field9270 == 1002 || var9.field9270 == 12 || var9.field9270 == 5 || var9.field9270 == 9)) {
                    return true;
                }
            }
        }
        return false;
    }
}
