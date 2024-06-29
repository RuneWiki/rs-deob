import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class114 extends class449 {

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public int field1597;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public int field1603;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "[I")
    public static int[] field1601 = new int[2];

    @OriginalMember(owner = "client!al", name = "r", descriptor = "Lch;")
    public static class151 field1598 = new class151(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!al", name = "x", descriptor = "Ljava/lang/String;")
    public static String field1604 = null;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IC)C")
    public static final char method902(int arg0, char arg1) {
        if (arg0 != 4561) {
            method902(-57, 'Q');
        }
        field1599++;
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII)V")
    public static final void method903(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1600++;
        if (arg1 <= -23 && class444.field6338 <= arg3 && arg3 <= class151.field2091) {
            int var5 = class67.method630(0, arg4, class103.field1457, class295.field4153);
            int var6 = class67.method630(0, arg0, class103.field1457, class295.field4153);
            class34.method211(var6, arg2, arg3, -13782, var5);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZII)V")
    public static final void method904(int arg0, boolean arg1, int arg2, int arg3) {
        field1602++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        int var4 = -89 % ((-arg3 - 8) / 53);
        class192.field2868 = arg2;
        class217.field3139 = arg1;
        class282.field4060 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(II)V")
    public class114(int arg0, int arg1) {
        this.field1597 = arg0;
        this.field1603 = arg1;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)V")
    public static void method905(int arg0) {
        field1601 = null;
        if (arg0 < 75) {
            method903(-74, 99, -39, -127, 53);
        }
        field1604 = null;
        field1598 = null;
    }
}
