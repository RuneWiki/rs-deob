import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class54 {

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field632 = 0;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "Liq;")
    public static class362 field630 = new class362("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!er", name = "v", descriptor = "[J")
    public static long[] field650 = new long[32];

    @OriginalMember(owner = "client!er", name = "y", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!er", name = "w", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!er", name = "z", descriptor = "Liq;")
    public static class362 field654;

    @OriginalMember(owner = "client!er", name = "B", descriptor = "Liq;")
    public static class362 field656;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "client!er", name = "s", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!er", name = "u", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!er", name = "A", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "Lnl;")
    public class328 field637;

    @OriginalMember(owner = "client!er", name = "t", descriptor = "Ltq;")
    public static class376 field648;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "[I")
    public int[] field631;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "[I")
    public int[] field639;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "[I")
    public int[] field640;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "[I")
    public int[] field641;

    @OriginalMember(owner = "client!er", name = "p", descriptor = "[I")
    public int[] field644;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "[I")
    public int[] field645;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "[Lnl;")
    public class328[] field646;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "[[I")
    public int[][] field636;

    @OriginalMember(owner = "client!er", name = "x", descriptor = "[[I")
    public int[][] field652;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lfj;I)I")
    public static final int method309(class396 arg0, int arg1) {
        field647++;
        if (arg0.field5577 == arg1) {
            return 0;
        }
        if (arg0.field5574 != -1 && arg0.field5574 < 32768) {
            class77 var2 = class167.field2335[arg0.field5574];
            if (var2 != null) {
                int var3 = arg0.field3284 - var2.field3284;
                int var4 = arg0.field3269 - var2.field3269;
                if (var3 != 0 || var4 != 0) {
                    arg0.method2527((int) (Math.atan2((double) var3, (double) var4) * 2607.5945876176133D) & 0x3FFF, arg1 ^ 0xFFFFFF92);
                }
            }
        }
        if (arg0.field5574 >= 32768) {
            int var5 = arg0.field5574 - 32768;
            if (class414.field5948 == var5) {
                var5 = 2047;
            }
            class40 var6 = class26.field314[var5];
            if (var6 != null) {
                int var7 = arg0.field3284 - var6.field3284;
                int var8 = arg0.field3269 - var6.field3269;
                if (var7 != 0 || var8 != 0) {
                    arg0.method2527((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF, -45);
                }
            }
        }
        if ((arg0.field5614 != 0 || arg0.field5639 != 0) && (arg0.field5674 == 0 || arg0.field5666 > 0)) {
            int var9 = arg0.field3284 - (arg0.field5614 - class114.field1403 - class114.field1403) * 64;
            int var10 = arg0.field3269 - ((arg0.field5639 - class41.field496 - class41.field496) * 64);
            if (var9 != 0 || var10 != 0) {
                arg0.method2527((int) (Math.atan2((double) var9, (double) var10) * 2607.5945876176133D) & 0x3FFF, -120);
            }
            arg0.field5614 = 0;
            arg0.field5639 = 0;
        }
        return arg0.method2520(false);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "([BI)V")
    private final void method310(byte[] arg0, int arg1) {
        field635++;
        class236 var3 = new class236(class19.method135(arg0, (byte) -128));
        int var4 = var3.method1574(-80);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field643 = var3.method1597(3641);
        } else {
            this.field643 = 0;
        }
        int var5 = var3.method1574(-127);
        this.field629 = var3.method1617((byte) 48);
        int var6 = 0;
        int var7 = -1;
        this.field639 = new int[this.field629];
        for (int var8 = 0; var8 < this.field629; var8++) {
            this.field639[var8] = var6 += var3.method1617((byte) 48);
            if (this.field639[var8] > var7) {
                var7 = this.field639[var8];
            }
        }
        this.field633 = var7 + 1;
        this.field631 = new int[this.field633];
        this.field645 = new int[this.field633];
        this.field640 = new int[this.field633];
        this.field641 = new int[this.field633];
        this.field652 = new int[this.field633][];
        if (arg1 != 5509) {
            method312(118);
        }
        if (var5 != 0) {
            this.field644 = new int[this.field633];
            for (int var9 = 0; var9 < this.field633; var9++) {
                this.field644[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field629; var10++) {
                this.field644[this.field639[var10]] = var3.method1597(3641);
            }
            this.field637 = new class328(this.field644);
        }
        for (int var11 = 0; var11 < this.field629; var11++) {
            this.field641[this.field639[var11]] = var3.method1597(3641);
        }
        for (int var12 = 0; var12 < this.field629; var12++) {
            this.field631[this.field639[var12]] = var3.method1597(3641);
        }
        for (int var13 = 0; var13 < this.field629; var13++) {
            this.field640[this.field639[var13]] = var3.method1617((byte) 48);
        }
        for (int var14 = 0; var14 < this.field629; var14++) {
            int var21 = this.field639[var14];
            int var22 = 0;
            int var23 = this.field640[var21];
            int var24 = -1;
            this.field652[var21] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field652[var21][var25] = var22 += var3.method1617((byte) 48);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field645[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field652[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field646 = new class328[var7 + 1];
        this.field636 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field629; var15++) {
            int var16 = this.field639[var15];
            int var17 = this.field640[var16];
            this.field636[var16] = new int[this.field645[var16]];
            for (int var18 = 0; var18 < this.field645[var16]; var18++) {
                this.field636[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field652[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field652[var16][var19];
                }
                this.field636[var16][var20] = var3.method1597(3641);
            }
            this.field646[var16] = new class328(this.field636[var16]);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ltq;B)V")
    public static final void method311(class376 arg0, byte arg1) {
        if (arg1 != 87) {
            field656 = null;
        }
        field638++;
        class240.field3416 = arg0;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
    public static void method312(int arg0) {
        field654 = null;
        if (arg0 >= 45) {
            field650 = null;
            field630 = null;
            field648 = null;
            field656 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BIZIZII)V")
    public static final void method313(byte arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var7 = 104 / ((arg0 + 16) / 35);
        if (arg1 < arg3) {
            int var8 = (arg1 + arg3) / 2;
            int var9 = arg1;
            class130 var10 = class355.field5009[var8];
            class355.field5009[var8] = class355.field5009[arg3];
            class355.field5009[arg3] = var10;
            for (int var11 = arg1; var11 < arg3; var11++) {
                if (class176.method1196(var10, arg5, arg6, class355.field5009[var11], arg2, 83, arg4) <= 0) {
                    class130 var12 = class355.field5009[var11];
                    class355.field5009[var11] = class355.field5009[var9];
                    class355.field5009[var9++] = var12;
                }
            }
            class355.field5009[arg3] = class355.field5009[var9];
            class355.field5009[var9] = var10;
            method313((byte) -90, arg1, arg2, var9 - 1, arg4, arg5, arg6);
            method313((byte) 68, var9 + 1, arg2, arg3, arg4, arg5, arg6);
        }
        field634++;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "([BI)V")
    public class54(byte[] arg0, int arg1) {
        this.field642 = class25.method174(arg0.length, arg0, 101);
        if (this.field642 != arg1) {
            throw new RuntimeException();
        }
        this.method310(arg0, 5509);
    }

    static {
        new class362("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field653 = 0;
        field651 = 1;
        field654 = new class362("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");
        field656 = new class362("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
    }
}
