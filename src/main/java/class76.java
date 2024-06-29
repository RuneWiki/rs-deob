import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class class76 extends class256 {

    @OriginalMember(owner = "client!te", name = "B", descriptor = "Ljd;")
    public static class86 field1511 = class122.method868("cookiehost", true);

    @OriginalMember(owner = "client!te", name = "C", descriptor = "[I")
    public static int[] field1512 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!te", name = "E", descriptor = "Ljd;")
    public static class86 field1514 = class122.method868(" <col=00ff80>", true);

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public static int field1515 = 0;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static int field1507 = 0;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "Ljd;")
    public static class86 field1508 = class122.method868("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", true);

    @OriginalMember(owner = "client!te", name = "G", descriptor = "Z")
    public static boolean field1516 = false;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "S")
    public static short field1518 = 256;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "Lkh;")
    public static class44 field1517;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "[[[Lsa;")
    public static class249[][][] field1506;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method392(int arg0);

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V")
    public static void method544(int arg0) {
        field1514 = null;
        field1511 = null;
        if (arg0 >= -23) {
            field1511 = null;
        }
        field1517 = null;
        field1506 = null;
        field1508 = null;
        field1512 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1509++;
        int var9 = arg8 - arg3;
        int var10 = arg2 - arg7;
        int var11 = (arg0 - arg5 << 16) / var10;
        int var12 = -14 / ((46 - arg6) / 50);
        int var13 = (arg4 - arg1 << 16) / var9;
        class16.method126(arg8, arg3, var11, (byte) -63, arg7, 0, 0, var13, arg1, arg5, arg2);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Z")
    public abstract boolean method391(boolean arg0);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjd;)I")
    public static final int method546(int arg0, class86 arg1) {
        field1520++;
        if (arg0 != 27168) {
            return 10;
        }
        for (int var2 = 0; var2 < class63.field1234.length; var2++) {
            if (class63.field1234[var2].method631(12508, arg1)) {
                return var2;
            }
        }
        return -1;
    }
}
