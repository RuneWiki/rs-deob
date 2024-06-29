import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class126 {

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public int field1704 = -1;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field1703 = 0;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lss;")
    public static class213 field1700 = new class213("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "Lss;")
    public static class213 field1719 = new class213("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "Lss;")
    public static class213 field1721 = new class213("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Lru;")
    private class177 field1702;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Ljava/lang/String;")
    private String field1705;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "Ljava/lang/String;")
    private String field1706;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
    private int[] field1694;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "[I")
    private int[] field1695;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "[I")
    private int[] field1698;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "[I")
    private int[] field1699;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "[I")
    private int[] field1711;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "[I")
    private int[] field1714;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "[I")
    private int[] field1716;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "[I")
    private int[] field1717;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "[Ljava/lang/String;")
    private String[] field1707;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "[Ljava/lang/String;")
    private String[] field1709;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "[[I")
    private int[][] field1696;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "[[I")
    private int[][] field1708;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "[[I")
    private int[][] field1715;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BZ)V")
    public static final void method784(byte arg0, boolean arg1) {
        field1710++;
        if (class55.field827.length() == 0) {
            return;
        }
        if (arg0 >= -100) {
            method785(-64);
        }
        class142.method857((byte) 95, "--> " + class55.field827);
        class311.method2091(-17516, class55.field827, arg1, false);
        class243.field3948 = 0;
        class55.field827 = "";
        class446.field6918 = 0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method785(int arg0) {
        field1719 = null;
        if (arg0 != -14) {
            field1718 = -126;
        }
        field1700 = null;
        field1721 = null;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public final void method786(int arg0) {
        if (this.field1705 == null) {
            this.field1705 = this.field1706;
        }
        if (arg0 <= 31) {
            this.field1704 = -76;
        }
        field1712++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)Z")
    public static final boolean method787(int arg0, byte arg1) {
        class159.field2168 = arg0 + 1 & 0xFFFF;
        class352.field5485 = true;
        field1697++;
        return arg1 > -52 ? true : true;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lhw;II)V")
    private final void method788(class208 arg0, int arg1, int arg2) {
        if (arg2 != -30080) {
            return;
        }
        if (arg1 == 1) {
            this.field1706 = arg0.method1463((byte) -108);
        } else if (arg1 == 2) {
            this.field1705 = arg0.method1463((byte) -112);
        } else if (arg1 == 3) {
            int var22 = arg0.method1445(-110);
            this.field1708 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field1708[var23][0] = arg0.method1455(arg2 + 26693);
                this.field1708[var23][1] = arg0.method1436((byte) 103);
                this.field1708[var23][2] = arg0.method1436((byte) 94);
            }
        } else if (arg1 == 4) {
            int var4 = arg0.method1445(33);
            this.field1696 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1696[var5][0] = arg0.method1455(-3387);
                this.field1696[var5][1] = arg0.method1436((byte) 97);
                this.field1696[var5][2] = arg0.method1436((byte) 103);
            }
        } else if (arg1 == 5) {
            arg0.method1455(-3387);
        } else if (arg1 == 6) {
            arg0.method1445(arg2 ^ 0xFFFF8A95);
        } else if (arg1 == 7) {
            arg0.method1445(arg2 + 30174);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method1445(56);
            } else if (arg1 == 10) {
                int var20 = arg0.method1445(48);
                this.field1717 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field1717[var21] = arg0.method1436((byte) 90);
                }
            } else if (arg1 == 12) {
                arg0.method1436((byte) 86);
            } else if (arg1 == 13) {
                int var6 = arg0.method1445(arg2 ^ 0x751F);
                this.field1695 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field1695[var7] = arg0.method1455(-3387);
                }
            } else if (arg1 == 14) {
                int var8 = arg0.method1445(arg2 + 29973);
                this.field1715 = new int[var8][2];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field1715[var9][0] = arg0.method1445(arg2 + 29955);
                    this.field1715[var9][1] = arg0.method1445(arg2 + 29955);
                }
            } else if (arg1 == 15) {
                arg0.method1455(-3387);
            } else if (arg1 == 17) {
                this.field1704 = arg0.method1455(arg2 ^ 0x7845);
            } else if (arg1 == 18) {
                int var18 = arg0.method1445(45);
                this.field1714 = new int[var18];
                this.field1707 = new String[var18];
                this.field1698 = new int[var18];
                this.field1699 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field1714[var19] = arg0.method1436((byte) 98);
                    this.field1699[var19] = arg0.method1436((byte) 125);
                    this.field1698[var19] = arg0.method1436((byte) 99);
                    this.field1707[var19] = arg0.method1448(65535);
                }
            } else if (arg1 == 19) {
                int var16 = arg0.method1445(-91);
                this.field1711 = new int[var16];
                this.field1694 = new int[var16];
                this.field1716 = new int[var16];
                this.field1709 = new String[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field1711[var17] = arg0.method1436((byte) 107);
                    this.field1716[var17] = arg0.method1436((byte) 119);
                    this.field1694[var17] = arg0.method1436((byte) 123);
                    this.field1709[var17] = arg0.method1448(65535);
                }
            } else if (arg1 == 249) {
                int var10 = arg0.method1445(51);
                if (this.field1702 == null) {
                    int var11 = class123.method774(arg2 + 29988, var10);
                    this.field1702 = new class177(var11);
                }
                for (int var12 = 0; var12 < var10; var12++) {
                    boolean var13 = arg0.method1445(73) == 1;
                    int var14 = arg0.method1452(3);
                    class529 var15;
                    if (var13) {
                        var15 = new class446(arg0.method1448(65535));
                    } else {
                        var15 = new class330(arg0.method1436((byte) 120));
                    }
                    this.field1702.method1127(var15, (byte) 37, (long) var14);
                }
            }
        }
        field1713++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILhw;)V")
    public final void method789(int arg0, class208 arg1) {
        while (true) {
            int var3 = arg1.method1445(-115);
            if (var3 == 0) {
                if (arg0 > -78) {
                    return;
                }
                field1701++;
                return;
            }
            this.method788(arg1, var3, -30080);
        }
    }
}
