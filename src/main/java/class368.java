import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class368 {

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Ljava/lang/String;")
    private String field5017 = "null";

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "C")
    public char field5015;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "C")
    public char field5028;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    private int field5020;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Lqh;")
    public class50 field5019;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Lqh;")
    private class50 field5024;

    static {
        new class305("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)I", line = 3)
    public final int method2183(byte arg0, int arg1) {
        field5021++;
        if (this.field5019 == null) {
            return this.field5020;
        }
        class488 var3 = (class488) this.field5019.method295((long) arg1, -95);
        if (arg0 <= 90) {
            this.field5017 = null;
        }
        return var3 == null ? this.field5020 : var3.field7162;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Ljava/lang/String;", line = 27)
    public final String method2184(int arg0, int arg1) {
        field5027++;
        if (this.field5019 == null) {
            return this.field5017;
        } else if (arg1 < 1) {
            return null;
        } else {
            class53 var3 = (class53) this.field5019.method295((long) arg0, -110);
            return var3 == null ? this.field5017 : var3.field618;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lug;IB)V", line = 50)
    private final void method2185(class396 arg0, int arg1, byte arg2) {
        int var4 = 105 % ((-arg2 - 15) / 35);
        if (arg1 == 1) {
            this.field5028 = class42.method246(0, arg0.method2418(121));
        } else if (arg1 == 2) {
            this.field5015 = class42.method246(0, arg0.method2418(106));
        } else if (arg1 == 3) {
            this.field5017 = arg0.method2432((byte) 125);
        } else if (arg1 == 4) {
            this.field5020 = arg0.method2406((byte) -123);
        } else if (arg1 == 5 || arg1 == 6) {
            int var5 = arg0.method2386(-23648);
            this.field5019 = new class50(class111.method682(16, var5));
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg0.method2406((byte) -85);
                class435 var8;
                if (arg1 == 5) {
                    var8 = new class53(arg0.method2432((byte) 125));
                } else {
                    var8 = new class488(arg0.method2406((byte) -125));
                }
                this.field5019.method291((long) var7, var8, -96);
            }
        }
        field5022++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lug;I)V", line = 103)
    public final void method2186(class396 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2388((byte) -125);
            if (var3 == 0) {
                field5025++;
                if (arg1 < 90) {
                    this.method2189((byte) 27, null);
                    return;
                }
                return;
            }
            this.method2185(arg0, var3, (byte) 69);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/String;[BB)I", line = 129)
    public static final int method2187(int arg0, String arg1, byte[] arg2, byte arg3) {
        field5023++;
        int var4 = -104 % ((-arg3 - 35) / 40);
        int var5 = arg1.length();
        int var6 = arg0;
        for (int var7 = 0; var7 < var5; var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 <= '\u007F') {
                arg2[var6++] = (byte) var8;
            } else if (var8 > '߿') {
                arg2[var6++] = (byte) class219.method1381(var8 >> 12, 224);
                arg2[var6++] = (byte) class219.method1381(128, class95.method534(63, var8 >> 6));
                arg2[var6++] = (byte) class219.method1381(class95.method534(var8, 63), 128);
            } else {
                arg2[var6++] = (byte) (class219.method1381(var8, 12324) >> 6);
                arg2[var6++] = (byte) class219.method1381(class95.method534(63, var8), 128);
            }
        }
        return var6 - arg0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)Z", line = 173)
    public final boolean method2188(int arg0, byte arg1) {
        field5016++;
        if (this.field5019 == null) {
            return false;
        }
        if (this.field5024 == null) {
            this.method2190(128);
        }
        class488 var3 = (class488) this.field5024.method295((long) arg0, -100);
        if (arg1 != -123) {
            this.method2188(-43, (byte) -19);
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 202)
    public final boolean method2189(byte arg0, String arg1) {
        if (arg0 >= -111) {
            this.field5019 = null;
        }
        field5026++;
        if (this.field5019 == null) {
            return false;
        }
        if (this.field5024 == null) {
            this.method2191(6);
        }
        for (class213 var3 = (class213) this.field5024.method295(class375.method2216(-61, arg1), -123); var3 != null; var3 = (class213) this.field5024.method297((byte) 127)) {
            if (var3.field2920.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 230)
    private final void method2190(int arg0) {
        field5018++;
        this.field5024 = new class50(this.field5019.method294((byte) 0));
        for (class488 var2 = (class488) this.field5019.method300((byte) -113); var2 != null; var2 = (class488) this.field5019.method301(-124)) {
            class488 var3 = new class488((int) var2.field6348);
            this.field5024.method291((long) var2.field7162, var3, -98);
        }
        if (arg0 != 128) {
            this.field5019 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V", line = 254)
    private final void method2191(int arg0) {
        this.field5024 = new class50(this.field5019.method294((byte) 0));
        field5014++;
        for (class53 var2 = (class53) this.field5019.method300((byte) -107); var2 != null; var2 = (class53) this.field5019.method301(-125)) {
            class213 var3 = new class213(var2.field618, (int) var2.field6348);
            this.field5024.method291(class375.method2216(-119, var2.field618), var3, arg0 - 37);
        }
        if (arg0 != 6) {
            this.method2185(null, 21, (byte) 54);
        }
    }
}
