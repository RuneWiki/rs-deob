import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lge;")
    private class511 field29 = new class511(64);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Lci;")
    private class320 field23;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lqv;")
    public static class316 field25 = new class316(24, 6);

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lbd;")
    public static class44 field30 = new class44("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Lqv;")
    public static class316 field31;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)V")
    public static final void method12(int arg0, byte arg1) {
        field26++;
        class275 var2 = class213.method1433((byte) 86, 3, arg0);
        if (arg1 != -58) {
            method14(94);
        }
        var2.method1774((byte) 113);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)Lrl;")
    public final class518 method13(int arg0, boolean arg1) {
        if (!arg1) {
            method12(59, (byte) -97);
        }
        field27++;
        class511 var3 = this.field29;
        class518 var4;
        synchronized (this.field29) {
            var4 = (class518) this.field29.method2982(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class320 var5 = this.field23;
        byte[] var6;
        synchronized (this.field23) {
            var6 = this.field23.method2037(arg0, (byte) -111, 19);
        }
        class518 var7 = new class518();
        if (var6 != null) {
            var7.method3009(new class519(var6), true);
        }
        class511 var8 = this.field29;
        synchronized (this.field29) {
            this.field29.method2981(var7, 42, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method14(int arg0) {
        field25 = null;
        field31 = null;
        field30 = null;
        if (arg0 != -22345) {
            field31 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Lpn;")
    public static final class535 method15(int arg0, int arg1) {
        if (arg0 != 24) {
            field25 = null;
        }
        field24++;
        if (arg1 == 0) {
            return new class228();
        } else if (arg1 == 1) {
            return new class11();
        } else if (arg1 == 2) {
            return new class322();
        } else if (arg1 == 3) {
            return new class89();
        } else if (arg1 == 4) {
            return new class195();
        } else if (arg1 == 5) {
            return new class513();
        } else if (arg1 == 6) {
            return new class30();
        } else if (arg1 == 7) {
            return new class272();
        } else if (arg1 == 8) {
            return new class506();
        } else if (arg1 == 9) {
            return new class132();
        } else if (arg1 == 10) {
            return new class69();
        } else if (arg1 == 11) {
            return new class153();
        } else if (arg1 == 12) {
            return new class516();
        } else if (arg1 == 13) {
            return new class253();
        } else if (arg1 == 14) {
            return new class501();
        } else if (arg1 == 15) {
            return new class363();
        } else if (arg1 == 16) {
            return new class47();
        } else if (arg1 == 17) {
            return new class337();
        } else if (arg1 == 18) {
            return new class476();
        } else if (arg1 == 19) {
            return new class340();
        } else if (arg1 == 20) {
            return new class76();
        } else if (arg1 == 21) {
            return new class27();
        } else if (arg1 == 22) {
            return new class350();
        } else if (arg1 == 23) {
            return new class451();
        } else if (arg1 == 24) {
            return new class387();
        } else if (arg1 == 25) {
            return new class540();
        } else if (arg1 == 26) {
            return new class504();
        } else if (arg1 == 27) {
            return new class245();
        } else if (arg1 == 28) {
            return new class12();
        } else if (arg1 == 29) {
            return new class458();
        } else if (arg1 == 30) {
            return new class110();
        } else if (arg1 == 31) {
            return new class475();
        } else if (arg1 == 32) {
            return new class345();
        } else if (arg1 == 33) {
            return new class531();
        } else if (arg1 == 34) {
            return new class442();
        } else if (arg1 == 35) {
            return new class479();
        } else if (arg1 == 36) {
            return new class100();
        } else if (arg1 == 37) {
            return new class36();
        } else if (arg1 == 38) {
            return new class26();
        } else if (arg1 == 39) {
            return new class57();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lsn;ILci;)V")
    public class5(class453 arg0, int arg1, class320 arg2) {
        this.field23 = arg2;
        this.field28 = this.field23.method2030(-10914, 19);
    }

    static {
        new class44("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field31 = new class316(33, 2);
    }
}
