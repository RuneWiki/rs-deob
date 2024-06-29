import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class10 {

    @OriginalMember(owner = "client!em", name = "g", descriptor = "[I")
    public static int[] field152 = new int[2];

    @OriginalMember(owner = "client!em", name = "j", descriptor = "[I")
    public static int[] field155 = new int[4];

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field153 = 0;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field158 = 0;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "Ljava/lang/String;")
    public static String field150 = "Please wait...";

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "Lvl;")
    public static class73 field164;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "S")
    public short field160;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "Z")
    public boolean field147;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "Z")
    public boolean field156;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "Z")
    public boolean field162;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "Z")
    public boolean field163;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lvl;I)V")
    public static final void method56(class73 arg0, int arg1) {
        if (arg1 != -21119) {
            method59(-87);
        }
        class64.field929 = arg0;
        field151++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
    public static void method57(int arg0) {
        field164 = null;
        field150 = null;
        field155 = null;
        if (arg0 != 249) {
            field152 = null;
        }
        field152 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIBLu;II)V")
    public static final void method58(int arg0, int arg1, int arg2, byte arg3, class243 arg4, int arg5, int arg6) {
        class245.method1748(arg3 ^ 0x31, arg4.field3915, arg5, arg0, arg6, arg1, arg4.field3920, arg2);
        if (arg3 != 46) {
            field153 = 35;
        }
        field154++;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)Lrb;")
    public static final class210 method59(int arg0) {
        int var1 = -95 / ((arg0 + 20) / 62);
        class171.field2683 = 0;
        field161++;
        return class299.method2014((byte) 92);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIC)C")
    public static final char method60(int arg0, int arg1, char arg2) {
        field157++;
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
            if (arg2 == 'Ñ' && arg0 != 0) {
                return 'N';
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
            if (arg2 == 'ñ' && arg0 != 0) {
                return 'n';
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
        } else {
            int var3 = -83 / ((arg1 + 34) / 40);
            return arg2 == 'Ÿ' ? 'Y' : arg2;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lim;BLjava/lang/String;)I")
    public static final int method61(class170 arg0, byte arg1, String arg2) {
        field159++;
        int var3 = arg0.field2676;
        byte[] var4 = class250.method1788(-43, arg2);
        if (arg1 > -30) {
            return -116;
        } else {
            arg0.method1192(var4.length, 119);
            arg0.field2676 += class27.field318.method2027(699173731, var4.length, arg0.field2676, var4, arg0.field2650, 0);
            return arg0.field2676 - var3;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)Z")
    public static final boolean method62(int arg0, boolean arg1) {
        field146++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class192.field3056[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1009) {
            return true;
        } else {
            return !arg1;
        }
    }
}
