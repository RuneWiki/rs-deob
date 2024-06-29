import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public abstract class class373 extends class43 {

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public static int field5052 = -1;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "Z")
    public static boolean field5049 = true;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "Lhq;")
    public static class365 field5051 = new class365(64);

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public static int field5057 = 0;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "Lcq;")
    public static class72 field5060 = new class72("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "Ljk;")
    public static class117 field5059;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "Lwo;")
    public static class285 field5055;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "Lwo;")
    public static class285 field5058;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V", line = 3)
    public static void method2335(int arg0) {
        field5058 = null;
        if (arg0 < 11) {
            field5051 = null;
        }
        field5060 = null;
        field5059 = null;
        field5051 = null;
        field5055 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(CI)C", line = 19)
    public static final char method2336(char arg0, int arg1) {
        field5053++;
        if (arg1 != -6) {
            method2337((byte) -106, (char) 65533, 33);
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

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BCI)I", line = 414)
    public static final int method2337(byte arg0, char arg1, int arg2) {
        field5050++;
        int var3 = arg1 << 4;
        if (arg0 >= -7) {
            return -33;
        }
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V", line = 451)
    public static final void method2338(int arg0, int arg1) {
        int var2 = 22 / ((arg0 - 51) / 56);
        field5056++;
        class28.method177(-27506);
        class394.method2442(8);
        class336.method2155(arg1, -108, true);
        class225.method1389(class267.field3454, 31, class15.field177, class201.field2370);
        class244.method1606(class15.field177, 5356, class267.field3454);
        class207.method1268(-16998, class333.field4546);
        class126.method814((byte) 0);
        class11.method53(16026);
        if (class174.field2017 == 10) {
            class169.method1074(false, -101);
        } else if (class174.field2017 == 30) {
            class259.method1637(25, (byte) 79);
        } else if (class174.field2017 == 5) {
            class308.method1961((byte) -120, class267.field3454, class15.field177);
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)J")
    public abstract long method3(byte arg0);

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)I")
    public abstract int method6(boolean arg0);

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(Z)I")
    public abstract int method2(boolean arg0);

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)I")
    public abstract int method5(int arg0);
}
