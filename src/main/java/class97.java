import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class97 {

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "[I")
    public static int[] field1154 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Lik;")
    public class409 field1150;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "[I")
    public int[] field1151;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method530(int arg0) {
        field1154 = null;
        if (arg0 != -98) {
            method531(-78, -38);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
    public static final void method531(int arg0, int arg1) {
        int var2 = 47 / ((-arg1 - 65) / 44);
        field1152++;
        class40 var3 = class162.method872(arg0, (byte) 92, 8);
        var3.method193(-55);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IC)Z")
    public static final boolean method532(int arg0, char arg1) {
        field1153++;
        if (arg0 != -19611) {
            method532(45, '\n');
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }
}
