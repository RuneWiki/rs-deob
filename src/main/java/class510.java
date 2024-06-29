import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class510 {

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "Loc;")
    public class502 field7577 = new class502();

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "Z")
    public boolean field7580 = false;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "F")
    public static float field7572;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "I")
    public int field7579;

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
    public int field7581;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIIBI)I", line = 7)
    public static final int method3044(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field7573++;
        if ((arg0 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg3;
            arg3 = var7;
        }
        if (arg5 != -45) {
            method3044(18, 125, 29, -87, 31, (byte) 14, 34);
        }
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return 7 + 1 - arg2 - arg6;
        } else if (var8 == 2) {
            return 1 + 7 - arg3 - arg1;
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)V", line = 51)
    public static final void method3045(int arg0, int arg1) {
        if (class110.field1406 == arg0) {
            class240.field3505.method2548(arg1, (byte) -100);
        } else {
            class636.field9266 = arg1;
        }
        field7574++;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILdda;II)Ldd;", line = 72)
    public static final class166 method3046(int arg0, class597 arg1, int arg2, int arg3) {
        field7575++;
        byte[] var4 = arg1.method3486((byte) -86, arg2, arg0);
        if (arg3 != -6724) {
            method3045(60, 86);
        }
        return var4 == null ? null : new class166(var4);
    }
}
