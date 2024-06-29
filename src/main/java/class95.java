import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class95 {

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field1277 = 127;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "[Lmi;")
    public static class88[] field1268 = new class88[6];

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "B")
    public static byte field1278;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lnb;")
    public static class129 field1267;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "S")
    public short field1272;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Z")
    public boolean field1273;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Z")
    public boolean field1275;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Z")
    public boolean field1276;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Z")
    public boolean field1279;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "[I")
    public static int[] field1274;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIZI)V")
    public static final void method570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (!arg7) {
            method570(-25, 115, 49, -29, 54, 108, -102, true, 46);
        }
        int var9 = arg1 - arg4;
        int var10 = (arg8 - arg5 << 16) / var9;
        field1271++;
        int var11 = arg6 - arg0;
        int var12 = (arg2 - arg3 << 16) / var11;
        class122.method797(0, var12, (byte) -119, arg4, var10, arg6, 0, arg0, arg5, arg3, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method571(byte arg0) {
        field1267 = null;
        field1274 = null;
        field1268 = null;
        if (arg0 >= -53) {
            field1268 = null;
        }
    }
}
