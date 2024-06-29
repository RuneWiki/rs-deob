import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class457 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field6689 = 16777215;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "[I")
    public static int[] field6694;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field6693;

    static {
        new class347("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field6694 = new int[2048];
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 4)
    public static void method2652(byte arg0) {
        if (arg0 == 67) {
            field6694 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 14)
    public static final void method2653(int arg0) {
        int var1 = -43 % (-arg0 / 47);
        for (int var2 = 0; var2 < 5; var2++) {
            class233.field3277[var2] = false;
        }
        field6690++;
        class350.field5388 = 1;
        class215.field3065 = 0;
        class305.field4564 = 0;
        class39.field520 = -1;
        class96.field1501 = -1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)V", line = 39)
    public static final void method2654(boolean arg0, int arg1) {
        if (class232.field3269 != null) {
            class232.field3269.method669((byte) 67);
            class232.field3269 = null;
        }
        field6692++;
        class130.field1926 = 0;
        class147.method1068((byte) -46);
        class517.method3064();
        for (int var2 = 0; var2 < 4; var2++) {
            class151.field2300[var2].method1959(13734);
        }
        class151.method1090(false, (byte) 112);
        System.gc();
        class12.method165(2, (byte) 121);
        class120.field1840 = -1;
        class520.field7641 = false;
        class77.method564(true, 0);
        class161.field2414 = 0;
        class267.field3979 = 0;
        class241.field3358 = 0;
        class311.field4830 = 0;
        class116.field1743 = 0;
        for (int var3 = 0; var3 < class390.field5874.length; var3++) {
            class390.field5874[var3] = null;
        }
        class520.method3081(-21703);
        for (int var4 = 0; var4 < 2048; var4++) {
            class83.field1327[var4] = null;
        }
        class519.field7609 = 0;
        for (int var5 = 0; var5 < 32768; var5++) {
            class88.field1375[var5] = null;
        }
        class491.field7318.method3056(true);
        method2653(-102);
        class209.field3019 = 0;
        class307.field4619.method1034(128);
        class300.method1869((byte) -85);
        class169.method1172(32);
        class12.field120 = null;
        if (arg1 < 103) {
            return;
        }
        class397.field5932 = 0L;
        if (arg0) {
            class526.method3137(11, 2270);
            return;
        }
        class526.method3137(2, 2270);
        try {
            class331.method2049(class25.field375.field1611, "loggedout", -3460);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lvi;I)I", line = 128)
    public static final int method2655(class480 arg0, int arg1) {
        field6693++;
        int var2 = arg0.field7100;
        class192 var3 = arg0.method2415(arg1);
        if (arg0.field5979) {
            var2 = arg0.field7065;
        } else if (arg0.field6043 == var3.field2832 || arg0.field6043 == var3.field2834 || arg0.field6043 == var3.field2802 || arg0.field6043 == var3.field2815) {
            var2 = arg0.field7077;
        } else if (arg0.field6043 == var3.field2814 || arg0.field6043 == var3.field2809 || arg0.field6043 == var3.field2813 || arg0.field6043 == var3.field2841) {
            var2 = arg0.field7083;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Lcs;", line = 152)
    public static final class219 method2656(int arg0) {
        field6691++;
        if (class137.field2025 == null || class516.field7570 == null) {
            return null;
        }
        class516.field7570.method3163(class137.field2025, (byte) -66);
        class219 var1 = (class219) class516.field7570.method3164((byte) -48);
        if (var1 == null) {
            return null;
        }
        class473 var2 = class137.field2014.method699(var1.field3137, arg0 + 114);
        if (arg0 != -1) {
            method2655(null, 20);
        }
        return var2 != null && var2.field6941 && var2.method2818(class137.field2016, -126) ? var1 : class267.method1666(0);
    }
}
