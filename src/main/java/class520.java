import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class520 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field7699 = -1;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "[Lak;")
    public static class231[] field7703 = new class231[50];

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Liu;")
    public static class406 field7700;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIB)V")
    public static final void method3062(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field7702++;
        if (class154.field2244.field7767 != 0 && arg3 != 0 && class104.field1527 < 50 && arg2 != -1) {
            field7703[class104.field1527++] = new class231((byte) 2, arg2, arg3, arg1, arg0, 0);
        }
        if (arg4 != -47) {
            method3062(65, 58, -86, 31, (byte) -92);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static final void method3063(byte arg0) {
        class250.field3321 = null;
        class324.field4285 = null;
        field7698++;
        if (arg0 != 124) {
            method3063((byte) -74);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
    public static final void method3064(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class308.field4055 <= arg1 - arg2 && class71.field1077 >= (arg1 + arg2) && arg0 - arg2 >= class353.field4777 && arg0 + arg2 <= class300.field3971) {
            class366.method2133(arg0, arg4 - 109, arg3, arg2, arg1);
        } else {
            class241.method1485((byte) 62, arg0, arg1, arg3, arg2);
        }
        if (arg4 != 0) {
            method3063((byte) -93);
        }
        field7701++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method3065(int arg0) {
        field7703 = null;
        field7700 = null;
        if (arg0 != -1) {
            field7699 = 34;
        }
    }
}
