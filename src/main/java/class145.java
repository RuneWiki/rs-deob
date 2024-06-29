import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class145 {

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "Lfq;")
    private class111 field2170 = new class111();

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Lpm;")
    public static class349 field2172 = new class349("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field2179 = 0;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "Lpm;")
    public static class349 field2181 = new class349("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field2182 = 1;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field2183 = 0;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Lfq;")
    private class111 field2174;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)I")
    public final int method1070(int arg0) {
        field2173++;
        int var2 = arg0;
        class111 var3 = this.field2170.field1433;
        while (this.field2170 != var3) {
            var3 = var3.field1433;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)Z")
    public final boolean method1071(int arg0) {
        int var2 = 70 / ((-arg0 - 38) / 40);
        field2177++;
        return this.field2170.field1433 == this.field2170;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;Z)J")
    public static final long method1072(String arg0, boolean arg1) {
        field2165++;
        if (arg1) {
            return 122L;
        }
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg0.charAt(var5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Lao;")
    public static final class158 method1073(int arg0, int arg1) {
        if (arg1 <= 86) {
            method1081(78, (byte) 118);
        }
        field2171++;
        return class320.field4689 && class19.field254 <= arg0 && arg0 <= class241.field3566 ? class440.field6295[arg0 - class19.field254] : null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ltj;I)V")
    public static final void method1074(class108 arg0, int arg1) {
        field2178++;
        if (arg1 == -1898332859) {
            class421.field6022 = arg0;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)Lfq;")
    public final class111 method1075(byte arg0) {
        field2176++;
        class111 var2 = this.field2170.field1433;
        if (this.field2170 == var2) {
            return null;
        }
        if (arg0 != -49) {
            field2179 = 85;
        }
        var2.method674(-1);
        return var2;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILfq;)V")
    public final void method1076(int arg0, class111 arg1) {
        if (arg1.field1436 != null) {
            arg1.method674(-1);
        }
        field2169++;
        arg1.field1436 = this.field2170.field1436;
        if (arg0 <= 113) {
            this.field2174 = null;
        }
        arg1.field1433 = this.field2170;
        arg1.field1436.field1433 = arg1;
        arg1.field1433.field1436 = arg1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
    public static void method1077(boolean arg0) {
        field2172 = null;
        field2181 = null;
        if (arg0) {
            method1074((class108) null, 110);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)Lfq;")
    public final class111 method1078(boolean arg0) {
        field2175++;
        class111 var2 = this.field2174;
        if (this.field2170 == var2) {
            this.field2174 = null;
            return null;
        } else if (arg0) {
            return null;
        } else {
            this.field2174 = var2.field1433;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(Z)Lfq;")
    public final class111 method1079(boolean arg0) {
        field2167++;
        if (arg0) {
            this.method1079(true);
        }
        class111 var2 = this.field2170.field1436;
        if (this.field2170 == var2) {
            this.field2174 = null;
            return null;
        } else {
            this.field2174 = var2.field1436;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILtj;)V")
    public static final void method1080(int arg0, class108 arg1) {
        if (arg0 == -12919) {
            field2164++;
            class115.field1486 = arg1;
            class115.field1486.method651(0, 35);
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
    public class145() {
        this.field2170.field1436 = this.field2170;
        this.field2170.field1433 = this.field2170;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)V")
    public static final void method1081(int arg0, byte arg1) {
        if (arg1 < -53) {
            field2166++;
            class262.field3867.method91(4, arg0);
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)Lfq;")
    public final class111 method1082(int arg0) {
        field2168++;
        class111 var2 = this.field2170.field1433;
        if (this.field2170 == var2) {
            this.field2174 = null;
            return null;
        }
        this.field2174 = var2.field1433;
        if (arg0 <= 108) {
            field2182 = 54;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
    public final void method1083(byte arg0) {
        while (true) {
            class111 var2 = this.field2170.field1433;
            if (this.field2170 == var2) {
                field2180++;
                if (arg0 >= -65) {
                    field2182 = 28;
                }
                this.field2174 = null;
                return;
            }
            var2.method674(-1);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)Lfl;")
    public static final class441 method1084(int arg0, int arg1, int arg2) {
        class74 var3 = class385.field5449[arg0][arg1][arg2];
        return var3 == null ? null : var3.field967;
    }
}
