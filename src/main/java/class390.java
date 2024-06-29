import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class390 {

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "I")
    public int field5616 = -1;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "Lkr;")
    public static class602 field5618 = new class602(59, 10);

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!wfa", name = "i", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "Lfi;")
    public class12 field5617;

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "[I")
    public int[] field5622;

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "[Ljava/lang/String;")
    public String[] field5621;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIC)C", line = 3)
    public static final char method2449(int arg0, int arg1, char arg2) {
        field5619++;
        if (arg0 < 94) {
            return (char) 65472;
        }
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V", line = 88)
    public static void method2450(int arg0) {
        if (arg0 != 67) {
            field5618 = null;
        }
        field5618 = null;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IZIII)V", line = 101)
    public static final void method2451(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field5623++;
        int var5 = class617.field8294;
        if (var5 == 0) {
            return;
        }
        if (var5 == 1) {
            class360.field5162 = arg2;
            class617.field8294 = 2;
            class758.field10573 = arg0;
            class439.field6127 = arg3;
            class134.field1908 = arg4;
        } else if (var5 == 2) {
            if (class134.field1908 < arg4) {
                class134.field1908 = arg4;
            }
            if (arg3 > class439.field6127) {
                class439.field6127 = arg3;
            }
            if (class758.field10573 > arg0) {
                class758.field10573 = arg0;
            }
            if (class360.field5162 > arg2) {
                class360.field5162 = arg2;
            }
        } else if (!arg1) {
            field5618 = null;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IZ)I", line = 167)
    public static final int method2452(int arg0, boolean arg1) {
        if (arg0 != -1) {
            return 60;
        }
        field5624++;
        int var2 = class521.field7260;
        if (var2 == 0) {
            return arg1 ? 0 : class154.field2107;
        } else if (var2 == 1) {
            return class154.field2107;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)I", line = 216)
    public static final int method2453(int arg0, int arg1) {
        field5620++;
        if (arg0 < 96) {
            return 0;
        } else if (arg1 == -13076) {
            return arg0 < 128 ? 2 : 3;
        } else {
            return 126;
        }
    }
}
