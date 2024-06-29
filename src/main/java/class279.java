import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class279 extends class445 {

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public int field3700 = 0;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "[[I")
    public static int[][] field3699 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field3691 = 1;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "Lcc;")
    public static class474 field3714;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "Lij;")
    public static class266 field3715;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public int field3690;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public int field3692;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public int field3693;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public int field3697;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public int field3701;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public int field3703;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public int field3704;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public int field3705;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public int field3707;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    public int field3708;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public int field3713;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "Loe;")
    public class121 field3698;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "Lqn;")
    public class44 field3694;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "Lqn;")
    public class44 field3706;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Lnh;")
    public class487 field3689;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "Lct;")
    public class88 field3710;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "Z")
    public boolean field3696;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "[I")
    public int[] field3711;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B[I)Ljava/lang/String;")
    public static final String method1573(byte arg0, int[] arg1) {
        field3702++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class190.field2585;
        int var4 = 0;
        if (arg0 != -50) {
            field3714 = null;
        }
        while (arg1.length > var4) {
            class26 var5 = class477.field6580.method834(9636, arg1[var4]);
            if (var5.field329 != -1) {
                class139 var6 = (class139) class91.field1341.method493((byte) 19, (long) var5.field329);
                if (var6 == null) {
                    class325 var7 = class325.method1817(class473.field6525, var5.field329, 0);
                    if (var7 != null) {
                        var6 = class98.field1432.method2050(var7, true);
                        class91.field1341.method505((long) var5.field329, var6, 46);
                    }
                }
                if (var6 != null) {
                    class467.field6465[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
            var4++;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1574(String arg0, int arg1) {
        field3695++;
        int var2 = 49 % ((arg1 - 63) / 39);
        if (class471.field6495 == null) {
            class266.method1500((byte) 126);
        }
        String[] var3 = class490.method2852(0, '\n', arg0);
        for (int var4 = 0; var4 < var3.length; var4++) {
            for (int var5 = class11.field130; var5 > 0; var5--) {
                class471.field6495[var5] = class471.field6495[var5 - 1];
            }
            class471.field6495[0] = var3[var4];
            if (class471.field6495.length - 1 > class11.field130) {
                if (class390.field5423 > 0) {
                    class390.field5423++;
                }
                class11.field130++;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
    public final void method1575(boolean arg0) {
        field3712++;
        int var2 = this.field3690;
        if (this.field3710 != null) {
            class88 var5 = this.field3710.method574(-5, class38.field562);
            if (var5 == null) {
                this.field3690 = -1;
                this.field3703 = 0;
                this.field3707 = 0;
                this.field3711 = null;
                this.field3701 = 0;
                this.field3693 = 0;
            } else {
                this.field3703 = var5.field1262;
                this.field3693 = var5.field1234;
                this.field3707 = var5.field1239;
                this.field3701 = var5.field1221 * 128;
                this.field3690 = var5.field1246;
                this.field3711 = var5.field1267;
            }
        } else if (this.field3698 != null) {
            int var3 = class342.method1939((byte) -47, this.field3698);
            if (var2 != var3) {
                this.field3690 = var3;
                class429 var4 = this.field3698.field1780;
                if (var4.field5824 != null) {
                    var4 = var4.method2531(class38.field562, 103);
                }
                if (var4 == null) {
                    this.field3707 = this.field3701 = 0;
                } else {
                    this.field3701 = var4.field5823 * 128;
                    this.field3707 = var4.field5870;
                }
            }
        } else if (this.field3689 != null) {
            this.field3690 = class90.method577(false, this.field3689);
            this.field3701 = this.field3689.field6760 * 128;
            this.field3707 = this.field3689.field6785;
        }
        if (arg0) {
            method1578(34, (byte[]) null);
        }
        if (this.field3690 != var2 && this.field3706 != null) {
            class181.field2494.method2204(this.field3706);
            this.field3706 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
    public static void method1576(byte arg0) {
        field3715 = null;
        int var1 = 4 / ((-arg0 - 10) / 54);
        field3714 = null;
        field3699 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
    public static final void method1577(int arg0, int arg1) {
        class491 var2 = class289.field3897[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class491 var4 = class289.field3897[var3][arg0][arg1] = class289.field3897[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field6848--;
                for (class309 var5 = var4.field6845; var5 != null; var5 = var5.field4084) {
                    class471 var6 = var5.field4091;
                    if (var6.field6500 == arg0 && var6.field6491 == arg1) {
                        var6.field6502--;
                    }
                }
            }
        }
        if (class289.field3897[0][arg0][arg1] == null) {
            class289.field3897[0][arg0][arg1] = new class491(0, arg0, arg1);
            class289.field3897[0][arg0][arg1].field6836 = 1;
        }
        class289.field3897[0][arg0][arg1].field6862 = var2;
        class289.field3897[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[B)Z")
    public static final boolean method1578(int arg0, byte[] arg1) {
        field3709++;
        class32 var2 = new class32(arg1);
        int var3 = var2.method201((byte) -109);
        if (arg0 < 123) {
            method1577(122, -102);
        }
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method201((byte) -126) == 1;
        if (var4) {
            class48.method346(var2, -43);
        }
        class348.method2153(false, var2);
        return true;
    }

    static {
        new class206("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field3714 = null;
        new class206("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field3715 = new class266();
        field3716 = -1;
    }
}
