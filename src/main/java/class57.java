import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class57 {

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "Ler;")
    private class157 field765 = new class157(16);

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Lns;")
    private class438 field768;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "[Loc;")
    public static class314[] field759 = new class314[2048];

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field763 = 0;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "Lui;")
    public static class375 field771 = new class375("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "J")
    public static long field772 = 0L;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "Lcm;")
    public static class449 field773 = new class449(35, 16);

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IB)V", line = 7)
    public final void method386(int arg0, byte arg1) {
        field761++;
        if (arg1 < -83) {
            class157 var3 = this.field765;
            synchronized (this.field765) {
                this.field765.method1016(arg0, (byte) 123);
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljb;ZI)V", line = 20)
    public static final void method387(class499 arg0, boolean arg1, int arg2) {
        field767++;
        int var3 = arg0.field7303 == 0 ? arg0.field7348 : arg0.field7303;
        int var4 = arg0.field7293 == 0 ? arg0.field7386 : arg0.field7293;
        class332.method2140(true, arg0.field7312, class59.field791[arg0.field7312 >> 16], var3, var4, arg1);
        if (arg0.field7423 != null) {
            class332.method2140(true, arg0.field7312, arg0.field7423, var3, var4, arg1);
        }
        if (arg2 == -16180) {
            class407 var5 = (class407) class27.field449.method943((long) arg0.field7312, -1);
            if (var5 != null) {
                class220.method1491(arg1, (byte) 114, var4, var5.field6155, var3);
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 43)
    public final void method388(int arg0) {
        class157 var2 = this.field765;
        synchronized (this.field765) {
            if (arg0 != 35) {
                method389((byte) -101, -76, 53);
            }
            this.field765.method1015((byte) 126);
        }
        field769++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BII)Z", line = 57)
    public static final boolean method389(byte arg0, int arg1, int arg2) {
        field760++;
        if (arg0 >= -50) {
            return true;
        } else {
            return (arg2 & 0x10) != 0;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(IB)Lkf;", line = 68)
    private final class246 method390(int arg0, byte arg1) {
        field770++;
        class157 var3 = this.field765;
        class246 var4;
        synchronized (this.field765) {
            var4 = (class246) this.field765.method1013((long) arg0, (byte) -106);
            if (arg1 != 19) {
                method387(null, false, -73);
            }
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field768.method2650(arg0, -50, 29);
        class246 var6 = new class246();
        if (var5 != null) {
            var6.method1629(new class91(var5), arg1 ^ 0xFFFFFF8F);
        }
        class157 var7 = this.field765;
        synchronized (this.field765) {
            this.field765.method1012(arg1 ^ 0xFFFFFF9C, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V", line = 103)
    public static void method391(int arg0) {
        field773 = null;
        if (arg0 == 0) {
            field759 = null;
            field771 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V", line = 115)
    public final void method392(byte arg0) {
        int var2 = 9 % ((42 - arg0) / 39);
        class157 var3 = this.field765;
        synchronized (this.field765) {
            this.field765.method1022((byte) -34);
        }
        field762++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILgd;IIII)Ljk;", line = 131)
    public final class528 method393(int arg0, class259 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 > -66) {
            field772 = 85L;
        }
        field766++;
        class184[] var7 = null;
        class246 var8 = this.method390(arg3, (byte) 19);
        if (var8.field3435 != null) {
            var7 = new class184[var8.field3435.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class163 var10 = arg1.method1681((byte) -121, var8.field3435[var9]);
                var7[var9] = new class184(var10.field2381, var10.field2382, var10.field2390, var10.field2393, var10.field2391, var10.field2380, var10.field2383, var10.field2387);
            }
        }
        return new class528(var8.field3436, var7, var8.field3433, arg5, arg0, arg2);
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lgo;ILns;)V", line = 169)
    public class57(class331 arg0, int arg1, class438 arg2) {
        this.field768 = arg2;
        this.field768.method2645(1, 29);
    }
}
