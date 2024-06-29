import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class196 {

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3067 = "Use";

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Loi;")
    public static class83 field3068 = new class83(0, 0);

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "[I")
    public static int[] field3069;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
    public static final void method1397(int arg0, int arg1) {
        class69 var2 = class255.method1723((byte) 32, arg0, 11);
        if (arg1 != 984031332) {
            method1397(-81, 66);
        }
        var2.method554(2009563296);
        field3070++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ICI)I")
    public static final int method1398(int arg0, char arg1, int arg2) {
        field3066++;
        int var3 = 125 % (arg0 / 33);
        int var4 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var4 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg2 == 0) {
            var4 = 1762;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public static void method1399(int arg0) {
        field3067 = null;
        field3068 = null;
        if (arg0 == 0) {
            field3069 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILub;IB)[Lel;")
    public static final class213[] method1400(int arg0, class92 arg1, int arg2, byte arg3) {
        field3071++;
        if (class246.method1668(arg0, arg1, arg2, arg3 ^ 0xFFFFFFB6)) {
            return arg3 == 73 ? class89.method683((byte) -83) : null;
        } else {
            return null;
        }
    }
}
