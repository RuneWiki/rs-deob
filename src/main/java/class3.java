import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 extends class214 {

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "Lfn;")
    public static class52 field27 = new class52(94, 15);

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "Lcs;")
    public static class351 field30 = new class351(11, 7);

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "Ltm;")
    public static class112 field32;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "Lsq;")
    public static class454 field33;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "Ltm;")
    public static class112 field34;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "[I")
    public static int[] field35;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field31;

    static {
        new class112("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field32 = new class112("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");
        field33 = new class454(16);
        field34 = new class112("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");
        field35 = new int[13];
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 6)
    public class3() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)[[I", line = 9)
    public final int[][] method11(int arg0, byte arg1) {
        ++field26;
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (arg1 != 92) {
            field34 = null;
        }
        if (super.field3030.field6644) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class399.field5585 > var7; ++var7) {
                this.method16(arg0, (byte) 107, var7);
                int[][] var8 = this.method1354(0, class349.field4786, (byte) 23);
                var4[var7] = var8[0][class115.field1627];
                var5[var7] = var8[1][class115.field1627];
                var6[var7] = var8[2][class115.field1627];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)[I", line = 52)
    public final int[] method14(byte arg0, int arg1) {
        ++field25;
        if (arg0 != 123) {
            return null;
        } else {
            int[] var3 = super.field3024.method2585(arg1, 0);
            if (super.field3024.field6135) {
                for (int var4 = 0; var4 < class399.field5585; ++var4) {
                    this.method16(arg1, (byte) 107, var4);
                    int[] var5 = this.method1352(class349.field4786, 0, -100);
                    var3[var4] = var5[class115.field1627];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)V", line = 87)
    private final void method16(int arg0, byte arg1, int arg2) {
        ++field24;
        int var4 = class436.field5989[arg2];
        int var5 = class56.field909[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class115.field1627 = arg2;
            class349.field4786 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class349.field4786 = arg2;
            class115.field1627 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class115.field1627 = -arg0 + class399.field5585;
            class349.field4786 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class349.field4786 = class490.field6924 - arg0;
            class115.field1627 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class349.field4786 = -arg0 + class490.field6924;
            class115.field1627 = class399.field5585 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class115.field1627 = class399.field5585 - arg0;
            class349.field4786 = -arg2 + class490.field6924;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class115.field1627 = arg0;
            class349.field4786 = -arg2 + class490.field6924;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class349.field4786 = arg0;
            class115.field1627 = class399.field5585 - arg2;
        }
        if (arg1 != 107) {
            this.method11(-106, (byte) 48);
        }
        class349.field4786 &= class183.field2659;
        class115.field1627 &= class467.field6551;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Llk;II)V", line = 165)
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field31;
        if (arg1 <= -114) {
            if (arg2 == 0) {
                super.field3032 = ~arg0.method2503(true) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V", line = 178)
    public static void method17(byte arg0) {
        field34 = null;
        field30 = null;
        if (arg0 == -22) {
            field27 = null;
            field32 = null;
            field35 = null;
            field33 = null;
        }
    }
}
