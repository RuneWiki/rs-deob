import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class25 {

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lch;")
    public static class151 field266;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "F")
    public static float field269;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public int field262;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lnl;")
    public static class435 field264;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Ljava/lang/String;")
    public String field261;

    static {
        new class151("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field265 = 0;
        field266 = new class151("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");
        field268 = 1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILld;)Ljava/lang/String;", line = 3)
    public static final String method173(int arg0, class73 arg1) {
        if (arg0 != 31230) {
            method174(false, (class84) null);
        }
        field260++;
        return arg1.field1045 == null || arg1.field1045.length() <= 0 ? arg1.field1058 : arg1.field1058 + class114.field1598.method1078(class66.field967, 100) + arg1.field1045;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLvh;)V", line = 18)
    public static final void method174(boolean arg0, class84 arg1) {
        field259++;
        arg1.method710(!arg0);
        int var2 = 0;
        for (int var3 = 0; var3 < class143.field1996; var3++) {
            int var15 = class464.field6536[var3];
            if ((class232.field3389[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class232.field3389[var15] = (byte) class142.method1024(class232.field3389[var15], 2);
                } else {
                    int var16 = arg1.method712(false, 1);
                    if (var16 == 0) {
                        var2 = class233.method1632(arg1, (byte) 89);
                        class232.field3389[var15] = (byte) class142.method1024(class232.field3389[var15], 2);
                    } else {
                        class285.method1882(arg1, -16, var15);
                    }
                }
            }
        }
        arg1.method715((byte) 127);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method710(false);
        for (int var4 = 0; var4 < class143.field1996; var4++) {
            int var13 = class464.field6536[var4];
            if ((class232.field3389[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class232.field3389[var13] = (byte) class142.method1024(class232.field3389[var13], 2);
                    var2--;
                } else {
                    int var14 = arg1.method712(!arg0, 1);
                    if (var14 == 0) {
                        var2 = class233.method1632(arg1, (byte) 120);
                        class232.field3389[var13] = (byte) class142.method1024(class232.field3389[var13], 2);
                    } else {
                        class285.method1882(arg1, -16, var13);
                    }
                }
            }
        }
        arg1.method715((byte) 121);
        if (!arg0) {
            field266 = null;
        }
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method710(!arg0);
        for (int var5 = 0; var5 < class138.field1921; var5++) {
            int var11 = class441.field6263[var5];
            if ((class232.field3389[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class232.field3389[var11] = (byte) class142.method1024(class232.field3389[var11], 2);
                } else {
                    int var12 = arg1.method712(!arg0, 1);
                    if (var12 == 0) {
                        var2 = class233.method1632(arg1, (byte) 78);
                        class232.field3389[var11] = (byte) class142.method1024(class232.field3389[var11], 2);
                    } else if (class131.method977(arg1, var11, -8)) {
                        class232.field3389[var11] = (byte) class142.method1024(class232.field3389[var11], 2);
                    }
                }
            }
        }
        arg1.method715((byte) 124);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method710(!arg0);
        for (int var6 = 0; var6 < class138.field1921; var6++) {
            int var9 = class441.field6263[var6];
            if ((class232.field3389[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class232.field3389[var9] = (byte) class142.method1024(class232.field3389[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method712(false, 1);
                    if (var10 == 0) {
                        var2 = class233.method1632(arg1, (byte) 115);
                        class232.field3389[var9] = (byte) class142.method1024(class232.field3389[var9], 2);
                    } else if (class131.method977(arg1, var9, -8)) {
                        class232.field3389[var9] = (byte) class142.method1024(class232.field3389[var9], 2);
                    }
                }
            }
        }
        arg1.method715((byte) 126);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class138.field1921 = 0;
        class143.field1996 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class232.field3389[var7] = (byte) (class232.field3389[var7] >> 1);
            class39 var8 = class112.field1570[var7];
            if (var8 == null) {
                class441.field6263[class138.field1921++] = var7;
            } else {
                class464.field6536[class143.field1996++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 223)
    public static void method175(int arg0) {
        field264 = null;
        if (arg0 != -1) {
            field267 = -3;
        }
        field266 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)I", line = 241)
    public static final int method176(byte arg0, int arg1) {
        field263++;
        return arg0 == -76 ? arg1 & 0xFF : -25;
    }
}
