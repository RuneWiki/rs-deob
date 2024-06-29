import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public abstract class class436 {

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "Lclient;")
    public static client field6522;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field6516;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "[Z")
    public static boolean[] field6519;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
    public static final void method2618(byte arg0) {
        field6521++;
        if (arg0 != -80) {
            method2620(-117);
        }
        if (class266.field3891 == null) {
            return;
        }
        if (class266.field3891.field4032 == 1) {
            class266.field3891 = null;
            return;
        }
        if (class266.field3891.field4032 == 2) {
            class296.method1872(10294, 2, field6516, class485.field7178);
            class266.field3891 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(CI)C")
    public static final char method2619(char arg0, int arg1) {
        field6517++;
        if (arg1 != 105) {
            field6516 = null;
        }
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public static void method2620(int arg0) {
        if (arg0 == -204) {
            field6519 = null;
            field6522 = null;
            field6516 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Z")
    public static final boolean method2621(int arg0, int arg1, int arg2) {
        field6518++;
        if (arg0 == -23633) {
            return (arg2 & 0x70000) != 0 | class146.method965(arg1, arg2, true) || class163.method1134(arg2, (byte) -91, arg1);
        } else {
            return false;
        }
    }
}
