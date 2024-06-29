import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public abstract class class460 {

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "Lsk;")
    public static class423 field7084 = new class423(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "Loe;")
    public static class127 field7085 = new class127(3, -2);

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "[I")
    public static int[] field7086 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Lsk;")
    public static class423 field7087 = new class423("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field7088 = 0;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 10)
    public static void method2749(int arg0) {
        field7084 = null;
        if (arg0 <= 114) {
            field7085 = null;
        }
        field7085 = null;
        field7086 = null;
        field7087 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)Z", line = 23)
    public static final boolean method2750(int arg0, int arg1, int arg2) {
        field7081++;
        if (arg1 < 69) {
            field7087 = null;
        }
        return class496.method2984(arg0, arg2, (byte) 57) || class78.method567(arg2, (byte) -128, arg0);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)S", line = 34)
    public static final short method2751(int arg0, int arg1) {
        field7083++;
        int var2 = (arg0 & 0xFE64) >> 10;
        int var3 = (arg1 & arg0) >> 3;
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZZLjava/lang/String;Llt;)Lws;", line = 59)
    public static final class230 method2752(boolean arg0, boolean arg1, String arg2, class458 arg3) {
        field7080++;
        int var4 = arg3.method2720(arg2, 1);
        if (!arg0) {
            return null;
        } else if (var4 == -1) {
            return new class230(0);
        } else {
            int[] var5 = arg3.method2730(0, var4);
            class230 var6 = new class230(var5.length);
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (var7 < var6.field3505) {
                    class40 var9 = new class40(arg3.method2715(var5[var8++], var4, false));
                    int var10 = var9.method255((byte) 96);
                    int var11 = var9.method254((byte) -109);
                    int var12 = var9.method257((byte) 64);
                    if (!arg1 && var12 == 1) {
                        var6.field3505--;
                    } else {
                        var6.field3503[var7] = var10;
                        var6.field3506[var7] = var11;
                        var7++;
                    }
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)Log;")
    public abstract class441 method2317(boolean arg0);

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)I")
    public abstract int method2319(byte arg0, int arg1);

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)V")
    public abstract void method2322(int arg0, byte arg1);

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)[B")
    public abstract byte[] method2328(int arg0, int arg1);
}
