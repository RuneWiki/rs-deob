import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class342 {

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "Lqj;")
    public class324 field4574 = new class324();

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "Z")
    public boolean field4580 = false;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "Lgd;")
    public static class206 field4573 = new class206("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "Lh;")
    public static class434 field4583 = new class434(101, 14);

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public int field4579;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
    public int field4582;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(CB)C", line = 9)
    public static final char method1937(char arg0, byte arg1) {
        field4578++;
        if (arg1 != -105) {
            return (char) 65521;
        } else if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
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

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 402)
    public static void method1938(int arg0) {
        field4583 = null;
        if (arg0 != 194) {
            field4573 = null;
        }
        field4573 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLoe;)I", line = 414)
    public static final int method1939(byte arg0, class121 arg1) {
        field4576++;
        class429 var2 = arg1.field1780;
        if (var2.field5824 != null) {
            var2 = var2.method2531(class38.field562, -110);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 != -47) {
            field4583 = null;
        }
        int var3 = var2.field5810;
        class280 var4 = arg1.method549(-84);
        if (arg1.field1111) {
            var3 = var2.field5848;
        } else if (arg1.field1122 == var4.field3717 || arg1.field1122 == var4.field3753 || arg1.field1122 == var4.field3763 || arg1.field1122 == var4.field3726) {
            var3 = var2.field5829;
        } else if (arg1.field1122 == var4.field3719 || arg1.field1122 == var4.field3761 || arg1.field1122 == var4.field3722 || arg1.field1122 == var4.field3741) {
            var3 = var2.field5800;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)V", line = 460)
    public static final void method1940(boolean arg0) {
        field4575++;
        class468 var1 = null;
        try {
            class474 var2 = class251.field3359.method1338((byte) -126);
            while (var2.field6534 == 0) {
                class374.method2298(-28114, 1L);
            }
            if (var2.field6534 == 1) {
                var1 = (class468) var2.field6529;
                class32 var3 = new class32(class106.field1597 * 6 + 3);
                var3.method228(1, 32);
                var3.method229(class106.field1597, 1309449544);
                for (int var4 = 0; var4 < class311.field4102.length; var4++) {
                    if (class387.field5359[var4]) {
                        var3.method229(var4, 1309449544);
                        var3.method199((byte) -117, class311.field4102[var4]);
                    }
                }
                var1.method2750(0, var3.field472, var3.field456, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method2748((byte) -106);
            }
        } catch (Exception var5) {
        }
        class385.field5329 = class440.method2583(25267);
        class485.field6703 = arg0;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BZLjava/lang/String;I)Z", line = 515)
    public static final boolean method1941(byte arg0, boolean arg1, String arg2, int arg3) {
        field4581++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var4 = 85 / ((-arg0 - 33) / 50);
        boolean var5 = false;
        boolean var6 = false;
        int var7 = 0;
        int var8 = arg2.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg2.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var5 = true;
                    continue;
                }
                if (var10 == '+' && arg1) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                return false;
            }
            if (arg3 <= var12) {
                return false;
            }
            if (var5) {
                var12 = -var12;
            }
            int var11 = arg3 * var7 + var12;
            if ((var11 / arg3) != var7) {
                return false;
            }
            var7 = var11;
            var6 = true;
        }
        return var6;
    }
}
