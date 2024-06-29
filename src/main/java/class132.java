import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class132 {

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    private int field1595 = 0;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    private int field1601 = -1;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Lwq;")
    private class92 field1599 = new class92();

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "Z")
    public boolean field1610 = false;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    private int field1596;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    private int field1609;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "[Lgn;")
    private class419[] field1598;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "[[I")
    private int[][] field1597;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "Liq;")
    public static class362 field1603 = new class362("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "Liq;")
    public static class362 field1605 = new class362("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field1607 = 0;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Lts;")
    public static class315 field1602;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static final void method815(byte arg0) {
        field1606++;
        if (arg0 != 82) {
            return;
        }
        for (class450 var1 = (class450) class39.field441.method506((byte) -128); var1 != null; var1 = (class450) class39.field441.method514(true)) {
            class178 var2 = var1.field6448;
            if (class129.field1570 != var2.field3285 || class189.field2726 > var2.field2423) {
                var1.method2594((byte) -22);
                var2.method1208(127);
            } else if (var2.field2448 <= class189.field2726) {
                if (var2.field2429 > 0) {
                    class77 var3 = class167.field2335[var2.field2429 - 1];
                    if (var3 != null && var3.field3284 >= 0 && class176.field2403 * 128 > var3.field3284 && var3.field3269 >= 0 && (class383.field5395 * 128) > var3.field3269) {
                        var2.method1207(false, class114.method709(var2.field3285, var3.field3284, 0, var3.field3269) - var2.field2410, class189.field2726, var3.field3269, var3.field3284);
                    }
                }
                if (var2.field2429 < 0) {
                    int var4 = -var2.field2429 - 1;
                    class40 var5;
                    if (class414.field5948 == var4) {
                        var5 = class384.field5422;
                    } else {
                        var5 = class26.field314[var4];
                    }
                    if (var5 != null && var5.field3284 >= 0 && (class176.field2403 * 128) > var5.field3284 && var5.field3269 >= 0 && var5.field3269 < class383.field5395 * 128) {
                        var2.method1207(false, class114.method709(var2.field3285, var5.field3284, arg0 ^ 0x52, var5.field3269) - var2.field2410, class189.field2726, var5.field3269, var5.field3284);
                    }
                }
                var2.method1202(class34.field392, -1);
                class371.method2364(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)[[I")
    public final int[][] method816(int arg0) {
        field1608++;
        if (this.field1609 != this.field1596) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 > -123) {
            method819(122);
        }
        for (int var2 = 0; var2 < this.field1596; var2++) {
            this.field1598[var2] = class355.field5006;
        }
        return this.field1597;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
    public final void method817(int arg0) {
        int var2 = -7 % ((-arg0 - 24) / 61);
        for (int var3 = 0; var3 < this.field1596; var3++) {
            this.field1597[var3] = null;
        }
        field1600++;
        this.field1597 = null;
        this.field1598 = null;
        this.field1599.method505((byte) 44);
        this.field1599 = null;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V")
    public static void method818(byte arg0) {
        field1603 = null;
        field1605 = null;
        if (arg0 > 55) {
            field1602 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
    public static final void method819(int arg0) {
        field1594++;
        if (class40.field475 == 10 || class40.field475 == 28) {
            class218.method1461((byte) 114, class334.field4730 >> 10, 5000, class265.field3774 >> 10);
        } else {
            class218.method1461((byte) 126, class384.field5422.field5677[0] >> 3, 5000, class384.field5422.field5664[0] >> 3);
        }
        class164.method1124(4777);
        class181.method1220(-1);
        class443.method2761(3650);
        class151.method916(false);
        int var1 = 92 % ((arg0 - 25) / 59);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZ)[I")
    public final int[] method820(int arg0, boolean arg1) {
        if (!arg1) {
            this.method817(-101);
        }
        field1604++;
        if (this.field1609 == this.field1596) {
            this.field1610 = this.field1598[arg0] == null;
            this.field1598[arg0] = class355.field5006;
            return this.field1597[arg0];
        } else if (this.field1596 == 1) {
            this.field1610 = this.field1601 != arg0;
            this.field1601 = arg0;
            return this.field1597[0];
        } else {
            class419 var3 = this.field1598[arg0];
            if (var3 == null) {
                this.field1610 = true;
                if (this.field1596 > this.field1595) {
                    var3 = new class419(arg0, this.field1595);
                    this.field1595++;
                } else {
                    class419 var4 = (class419) this.field1599.method510((byte) 105);
                    var3 = new class419(arg0, var4.field5991);
                    this.field1598[var4.field5987] = null;
                    var4.method2594((byte) -22);
                }
                this.field1598[arg0] = var3;
            } else {
                this.field1610 = false;
            }
            this.field1599.method511(var3, (byte) -106);
            return this.field1597[var3.field5991];
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(III)V")
    public class132(int arg0, int arg1, int arg2) {
        this.field1596 = arg0;
        this.field1609 = arg1;
        this.field1598 = new class419[this.field1609];
        this.field1597 = new int[this.field1596][arg2];
    }

    static {
        new class362("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }
}
