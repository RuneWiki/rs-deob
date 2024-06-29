import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class49 {

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "Lof;")
    private class328 field623 = new class328(64);

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "Lmn;")
    private class162 field622;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public int field620;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "Lbi;")
    public static class104 field619 = new class104(50, -2);

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "Lnj;")
    public static class317 field626 = new class317();

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
    public static void method351(int arg0) {
        field619 = null;
        if (arg0 != 1) {
            field625 = -115;
        }
        field626 = null;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIILjava/lang/Class;)Ltm;")
    public static final class423 method352(int arg0, int arg1, int arg2, Class arg3) {
        class409 var4 = class217.field3699[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class192 var5 = var4.field6175; var5 != null; var5 = var5.field2841) {
            class423 var6 = var5.field2845;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6423 == arg1 && var6.field6424 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(II)Lbr;")
    public final class388 method353(int arg0, int arg1) {
        field617++;
        class328 var3 = this.field623;
        class388 var4;
        synchronized (this.field623) {
            var4 = (class388) this.field623.method2191((byte) -73, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field622;
        byte[] var6;
        synchronized (this.field622) {
            var6 = this.field622.method1004(arg0, false, arg1);
        }
        class388 var7 = new class388();
        if (var6 != null) {
            var7.method2492(new class208(var6), (byte) 121);
        }
        class328 var8 = this.field623;
        synchronized (this.field623) {
            this.field623.method2188(-125, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lgi;B)Lgi;")
    public static final class437 method354(class437 arg0, byte arg1) {
        field618++;
        if (arg0.field6599 != -1) {
            return class255.method1747(arg0.field6599, false);
        }
        int var2 = arg0.field6751 >>> 16;
        if (arg1 != -22) {
            return null;
        }
        class51 var3 = new class51(class423.field6414);
        for (class301 var4 = (class301) var3.method364((byte) 107); var4 != null; var4 = (class301) var3.method363(arg1 + 18120)) {
            if (var4.field4721 == var2) {
                return class255.method1747((int) var4.field7780, false);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lpr;ILmn;)V")
    public class49(class236 arg0, int arg1, class162 arg2) {
        this.field622 = arg2;
        this.field620 = this.field622.method1008(19, (byte) -21);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method355(String arg0, byte arg1) {
        field621++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        if (arg1 < 52) {
            method351(-62);
        }
        String var2 = class114.method736((byte) -61, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class162.field2352; var3++) {
            String var4 = class401.field6038[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class114.method736((byte) -61, var4);
            if (var5 != null && var5.equals(var2)) {
                class162.field2352--;
                for (int var6 = var3; var6 < class162.field2352; var6++) {
                    class401.field6038[var6] = class401.field6038[var6 + 1];
                    class180.field2621[var6] = class180.field2621[var6 + 1];
                    class214.field3648[var6] = class214.field3648[var6 + 1];
                    class294.field4633[var6] = class294.field4633[var6 + 1];
                    class294.field4640[var6] = class294.field4640[var6 + 1];
                    class101.field1452[var6] = class101.field1452[var6 + 1];
                }
                class446.field6915++;
                class76.field1138 = class387.field5910;
                class81.method578((byte) 66, class520.field7706);
                class170.field2488.method1479((byte) -99, class147.method896(arg0, (byte) -99));
                class170.field2488.method1458(arg0, (byte) 78);
                return;
            }
        }
    }

    static {
        new class213("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        new class213("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }
}
