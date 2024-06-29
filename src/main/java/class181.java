import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class181 extends class10 {

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "[I")
    public int[] field2713;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "[I")
    public int[] field2719;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "F")
    public static float field2711 = 1024.0F;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "Lwt;")
    public static class205 field2718;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "Lya;")
    public static class38 field2717;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)I")
    public static final int method1206(int arg0, byte arg1) {
        field2714++;
        if (arg1 >= -1) {
            method1207(13);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
    public static void method1207(int arg0) {
        if (arg0 != 29737) {
            field2711 = 0.5776893F;
        }
        field2717 = null;
        field2718 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1208(int arg0, String arg1) {
        field2715++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 <= '߿') {
                var3 += 2;
            } else {
                var3 += 3;
            }
        }
        if (arg0 >= -59) {
            method1206(118, (byte) 50);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLhp;)V")
    public static final void method1209(boolean arg0, class217 arg1) {
        field2712++;
        if ((arg1.field3572.length - arg1.field3556) < 1) {
            return;
        }
        if (!arg0) {
            field2711 = -1.3524592F;
        }
        int var2 = arg1.method1515((byte) 122);
        if (var2 < 0 || var2 > 1 || (arg1.field3572.length - arg1.field3556) < 2) {
            return;
        }
        int var3 = arg1.method1511(125);
        if ((arg1.field3572.length - arg1.field3556) < (var3 * 6)) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg1.method1511(-34);
            int var6 = arg1.method1556(110);
            if (class505.field7385.length > var5 && class256.field3922[var5] && (class412.field6179.method1228(2, var5).field3844 != '1' || var6 >= -1 && var6 <= 1)) {
                class505.field7385[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(III)Luq;")
    public static final class114 method1210(int arg0, int arg1, int arg2) {
        field2716++;
        if (arg1 != -2) {
            method1206(124, (byte) -41);
        }
        class114 var3 = class475.method2864(true, arg2);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field1660 == null || arg0 >= var3.field1660.length) {
            return null;
        } else {
            return var3.field1660[arg0];
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(II[I[I)V")
    public class181(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field2713 = arg3;
        this.field2719 = arg2;
    }

    static {
        new class234("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        new class234(null, "der Spieler ist momentan nicht verfügbar.", null, null);
    }
}
