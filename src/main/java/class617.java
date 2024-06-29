import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class617 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public int field8882 = -1;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Z")
    public static boolean field8887 = false;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public int field8883;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public int field8884;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field8885;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public int field8886;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public int field8888;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public int field8889;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public int field8890;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public int field8891;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public int field8892;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIBI)I")
    public static final int method3532(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field8885++;
        if (arg4 != 44) {
            method3532(98, -56, -33, 115, (byte) -5, -94);
        }
        if (class501.field6947 == null) {
            return 0;
        }
        if (arg5 < 3) {
            int var6 = arg1 >> 9;
            int var7 = arg0 >> 9;
            if (arg3 < 0 || arg2 < 0 || class139.field1760 - 1 < arg3 || arg2 > (class369.field5135 - 1)) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > (class139.field1760 - 1) || var7 > class369.field5135 - 1) {
                return 0;
            }
            boolean var8 = (class310.field3971[1][arg1 >> 9][arg0 >> 9] & 0x2) != 0;
            if ((arg1 & 0x1FF) == 0) {
                boolean var9 = (class310.field3971[1][var6 - 1][arg0 >> 9] & 0x2) != 0;
                boolean var10 = (class310.field3971[1][var6][arg0 >> 9] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class310.field3971[1][arg3][arg2] & 0x2) != 0;
                }
            }
            if ((arg0 & 0x1FF) == 0) {
                boolean var11 = (class310.field3971[1][arg1 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class310.field3971[1][arg1 >> 9][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class310.field3971[1][arg3][arg2] & 0x2) != 0;
                }
            }
            if (var8) {
                arg5++;
            }
        }
        return class501.field6947[arg5].method1040(arg1, arg0);
    }
}
