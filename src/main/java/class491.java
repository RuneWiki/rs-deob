import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class491 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Ljava/lang/String;")
    public static String field7167;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "F")
    public static float field7170;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method2877(int arg0) {
        int var1 = 72 / ((arg0 - 55) / 38);
        field7167 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLdi;)V")
    public static final void method2878(byte arg0, class83 arg1) {
        class481.field7027.method1281(arg1.method653((byte) -13), -3);
        field7171++;
        if (arg0 != 92) {
            field7168 = -11;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZBILjava/lang/String;)I")
    public static final int method2879(boolean arg0, byte arg1, int arg2, String arg3) {
        field7169++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = 61 % ((30 - arg1) / 56);
        int var8 = arg3.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg3.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg0) {
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
                throw new NumberFormatException();
            }
            if (arg2 <= var12) {
                throw new NumberFormatException();
            }
            if (var4) {
                var12 = -var12;
            }
            int var11 = arg2 * var6 + var12;
            if (var11 / arg2 != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var11;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    static {
        new class466("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field7167 = "";
    }
}
