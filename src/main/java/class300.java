import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class300 {

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Ler;")
    private class157 field4432 = new class157(64);

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "Ler;")
    private class157 field4441 = new class157(100);

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Lns;")
    private class438 field4429;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lui;")
    public static class375 field4427 = new class375("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field4438 = 0;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field4435 = new String[200];

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4436 = null;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "F")
    public static float field4437;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public static final void method1929(byte arg0) {
        if (class374.field5734 != null) {
            class374.field5734.method1591(arg0 + 12469);
        }
        field4443++;
        if (arg0 != -4) {
            field4436 = null;
        }
        if (class133.field1929 != null) {
            class133.field1929.method1591(12465);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static final void method1930(int arg0) {
        if (arg0 != -15514) {
            return;
        }
        for (int var1 = 0; var1 < class240.field3386; var1++) {
            class491 var2 = class19.field284[var1];
            if (var2.field7174 == 2) {
                if (var2.field7173 == null) {
                    var2.field7175 = Integer.MIN_VALUE;
                } else {
                    class325.field4996.method1274(var2.field7173);
                }
            }
        }
        field4430++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public final void method1931(boolean arg0) {
        class157 var2 = this.field4432;
        synchronized (this.field4432) {
            this.field4432.method1015((byte) 108);
        }
        field4431++;
        if (arg0) {
            this.field4432 = null;
        }
        class157 var3 = this.field4441;
        synchronized (this.field4441) {
            this.field4441.method1015((byte) 124);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)V")
    public final void method1932(byte arg0, int arg1) {
        class157 var3 = this.field4432;
        synchronized (this.field4432) {
            if (arg0 != 125) {
                return;
            }
            this.field4432.method1016(arg1, (byte) 126);
        }
        field4428++;
        class157 var4 = this.field4441;
        synchronized (this.field4441) {
            this.field4441.method1016(arg1, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
    public final void method1933(byte arg0) {
        field4440++;
        class157 var2 = this.field4432;
        synchronized (this.field4432) {
            this.field4432.method1022((byte) -34);
            if (arg0 != -120) {
                field4435 = null;
            }
        }
        class157 var3 = this.field4441;
        synchronized (this.field4441) {
            this.field4441.method1022((byte) -34);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Ltq;")
    public final class270 method1934(int arg0, int arg1) {
        field4433++;
        class157 var3 = this.field4432;
        class270 var4;
        synchronized (this.field4432) {
            var4 = (class270) this.field4432.method1013((long) arg1, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4429.method2650(class152.method992(127, arg1), -90, class225.method1514(arg1, -31938));
        class270 var6 = new class270();
        var6.field3757 = arg1;
        var6.field3753 = this;
        if (arg0 <= 112) {
            method1937(-89);
        }
        if (var5 != null) {
            var6.method1727(32, new class91(var5));
        }
        var6.method1726(512);
        class157 var7 = this.field4432;
        synchronized (this.field4432) {
            this.field4432.method1012(-105, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)Z")
    public static final boolean method1935(int arg0, int arg1, int arg2) {
        if (arg2 != 101) {
            field4437 = -1.4421897F;
        }
        field4434++;
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)Lnl;")
    public final class472 method1936(int arg0, int arg1) {
        field4442++;
        class157 var3 = this.field4441;
        class472 var4;
        synchronized (this.field4441) {
            var4 = (class472) this.field4441.method1013((long) arg0, (byte) -106);
            if (var4 == null) {
                var4 = new class472(arg0);
                this.field4441.method1012(-85, (long) arg0, var4);
            }
        }
        synchronized (var4) {
            if (var4.method2838(false)) {
                if (arg1 != 213) {
                    field4438 = 9;
                }
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public static void method1937(int arg0) {
        field4435 = null;
        field4427 = null;
        if (arg0 != 64) {
            field4435 = null;
        }
        field4436 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZC)C")
    public static final char method1938(boolean arg0, char arg1) {
        if (arg0) {
            field4435 = null;
        }
        field4439++;
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

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lgo;ILns;Lns;Lns;)V")
    public class300(class331 arg0, int arg1, class438 arg2, class438 arg3, class438 arg4) {
        this.field4429 = arg2;
        if (this.field4429 != null) {
            int var6 = this.field4429.method2649(76) - 1;
            this.field4429.method2645(1, var6);
        }
        class388.method2392(arg4, arg3, -20955);
    }

    static {
        new class375("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
    }
}
