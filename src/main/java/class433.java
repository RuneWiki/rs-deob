import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class433 extends class551 {

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
    private int field6333;

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "[J")
    public static long[] field6337;

    @OriginalMember(owner = "client!vq", name = "A", descriptor = "Lnj;")
    public static class487 field6341;

    @OriginalMember(owner = "client!vq", name = "G", descriptor = "Lqp;")
    public static class586 field6346;

    @OriginalMember(owner = "client!vq", name = "H", descriptor = "Lrb;")
    public static class352 field6347;

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!vq", name = "C", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!vq", name = "E", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!vq", name = "F", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "[J")
    public static long[] field6340;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "[Lvaa;")
    public class246[] field6335;

    @OriginalMember(owner = "client!vq", name = "B", descriptor = "[[B")
    private byte[][] field6342;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(CB)C")
    public static final char method2640(char arg0, byte arg1) {
        field6344++;
        if (arg1 != -5) {
            return (char) 65533;
        } else if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)Z")
    public final boolean method2641(byte arg0) {
        if (arg0 > -8) {
            return false;
        }
        field6334++;
        if (this.field6335 != null) {
            return true;
        }
        if (this.field6342 == null) {
            if (!class277.field4071.method3474(-100, this.field6333)) {
                return false;
            }
            int[] var2 = class277.field4071.method3465(0, this.field6333);
            this.field6342 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field6342[var3] = class277.field4071.method3486((byte) -49, var2[var3], this.field6333);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field6342.length; var5++) {
            byte[] var14 = this.field6342[var5];
            int var15 = (var14[0] & 0xFF) << 8 | var14[1] & 0xFF;
            var4 &= class346.field5036.method3491(105, var15);
        }
        if (!var4) {
            return false;
        }
        class419 var6 = new class419();
        int var7 = class277.field4071.method3462(this.field6333, -52);
        this.field6335 = new class246[var7];
        int[] var8 = class277.field4071.method3465(0, this.field6333);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field6342[var9];
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            class181 var12 = null;
            for (class181 var13 = (class181) var6.method2496((byte) -96); var13 != null; var13 = (class181) var6.method2494(59)) {
                if (var13.field2781 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class181(var11, class346.field5036.method3469(var11, 118));
                var6.method2492(var12, (byte) -120);
            }
            this.field6335[var8[var9]] = new class246(var10, var12);
        }
        this.field6342 = null;
        return true;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V")
    public static void method2642(byte arg0) {
        field6341 = null;
        field6346 = null;
        field6340 = null;
        field6337 = null;
        field6347 = null;
        if (arg0 > -15) {
            field6346 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)Z")
    public final boolean method2643(int arg0, int arg1) {
        if (arg1 == -239) {
            field6336++;
            return this.field6335[arg0].field3607;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(I)V")
    public class433(int arg0) {
        this.field6333 = arg0;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BI)Z")
    public final boolean method2644(byte arg0, int arg1) {
        int var3 = -21 / ((71 - arg0) / 54);
        field6343++;
        return this.field6335[arg1].field3606;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2645(int arg0, int arg1, byte arg2) {
        field6339++;
        int var3 = -15 / ((arg2 + 59) / 56);
        return (arg1 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZI)Z")
    public final boolean method2646(boolean arg0, int arg1) {
        field6345++;
        if (!arg0) {
            field6338 = -17;
        }
        return this.field6335[arg1].field3600;
    }

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "(I)V")
    public static final void method2647(int arg0) {
        class386.field5658 = arg0;
        for (int var1 = 0; var1 < class331.field4909; var1++) {
            for (int var2 = 0; var2 < class366.field5271; var2++) {
                if (class526.field7777[arg0][var1][var2] == null) {
                    class526.field7777[arg0][var1][var2] = new class415(arg0, var1, var2);
                }
            }
        }
    }

    static {
        new class487("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field6338 = 1;
        field6337 = new long[32];
        field6341 = new class487("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");
        field6346 = new class586(52, 0);
        new class487("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field6347 = new class352(14, 0, 4, 1);
    }
}
