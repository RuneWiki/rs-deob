import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class87 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field1404 = 1;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lwb;")
    public static class76 field1405 = new class76(5000);

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1411 = "glow2:";

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field1410;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method681(int arg0) {
        field1410 = null;
        field1411 = null;
        if (arg0 != 99) {
            method682(-101, (char) 65433, false);
        }
        field1405 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ICZ)C")
    public static final char method682(int arg0, char arg1, boolean arg2) {
        field1407++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg0 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg0 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        }
        if (!arg2) {
            method681(-93);
        }
        if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static final void method683(int arg0) {
        field1408++;
        class127.field2095.method1156(-52);
        if (arg0 > -126) {
            field1411 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lsb;B)V")
    public static final void method684(class124 arg0, byte arg1) {
        int var2 = -50 / ((arg1 + 27) / 58);
        class293.field4658 = arg0;
        field1406++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILjava/lang/String;Lsb;)Lv;")
    public static final class254 method685(int arg0, String arg1, class124 arg2) {
        field1409++;
        int var3 = arg2.method889(arg1, -1);
        if (var3 == -1) {
            return new class254(0);
        }
        int[] var4 = arg2.method910(arg0, var3);
        class254 var5 = new class254(var4.length);
        for (int var6 = arg0; var6 < var5.field4048; var6++) {
            class136 var7 = new class136(arg2.method900(var3, var4[var6], false));
            var5.field4057[var6] = var7.method1010(arg0 - 120);
            var5.field4060[var6] = var7.method981(false);
            var5.field4042[var6] = var7.method1022(-45);
            var5.field4045[var6] = var7.method1022(106);
        }
        return var5;
    }
}
