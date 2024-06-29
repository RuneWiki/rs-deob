import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class63 {

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Lh;")
    public static class434 field834 = new class434(98, -2);

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "F")
    public static float field842 = 0.0F;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "[I")
    public static int[] field843;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "Lad;")
    public static class268 field845;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public int field829;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public int field836;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Loc;")
    public class123 field825;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "[I")
    public int[] field830;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "[I")
    public int[] field831;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "[I")
    public int[] field838;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "[I")
    public int[] field839;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "[I")
    public int[] field840;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "[I")
    public int[] field844;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "[Loc;")
    public class123[] field827;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "[[I")
    public int[][] field828;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "[[I")
    public int[][] field837;

    static {
        new class206("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field843 = new int[14];
        field845 = new class268(16);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lhc;IIIII)V", line = 6)
    public static final void method426(class84 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field1100 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field1107[var6] != null) {
                arg0.field1100++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field1100; var7++) {
            long var8 = class132.field1943[arg1][arg2][arg3];
            while (var8 != 0L) {
                class263 var14 = class276.field3652[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field1107[var7] == var14) {
                    continue label50;
                }
            }
            long var10 = class132.field1943[arg1][arg4][arg5];
            while (var10 != 0L) {
                class263 var13 = class276.field3652[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field1107[var7] == var13) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field1100 - 1; var12++) {
                arg0.field1107[var12] = arg0.field1107[var12 + 1];
            }
            arg0.field1100--;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 61)
    public static final void method427(int arg0) {
        field832++;
        class449.field6111.method877(14194);
        class34.field523.method1924(-71);
        if (class210.field2840 != null) {
            class210.field2840.method731(-547, class28.field378);
        }
        class6.field81.method1504(-1);
        int var1 = -58 % ((arg0 + 53) / 37);
        class28.field378.setBackground(Color.black);
        class66.field883 = -1;
        class449.field6111 = class200.method1144(0, class28.field378);
        class34.field523 = class239.method1325(true, class28.field378, 115);
        if (class210.field2840 != null) {
            class210.field2840.method730((byte) 108, class28.field378);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([BI)V", line = 86)
    private final void method428(byte[] arg0, int arg1) {
        field835++;
        class32 var3 = new class32(class205.method1170(arg0, 13112));
        int var4 = var3.method201((byte) -107);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field829 = 0;
        } else {
            this.field829 = var3.method222(1024);
        }
        int var5 = var3.method201((byte) -108);
        this.field836 = var3.method215((byte) 99);
        int var6 = 0;
        this.field840 = new int[this.field836];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field836; var8++) {
            this.field840[var8] = var6 += var3.method215((byte) 105);
            if (this.field840[var8] > var7) {
                var7 = this.field840[var8];
            }
        }
        this.field841 = var7 + 1;
        this.field831 = new int[this.field841];
        this.field828 = new int[this.field841][];
        this.field838 = new int[this.field841];
        int var9 = 17 % ((18 - arg1) / 60);
        this.field844 = new int[this.field841];
        this.field830 = new int[this.field841];
        if (var5 != 0) {
            this.field839 = new int[this.field841];
            for (int var10 = 0; var10 < this.field841; var10++) {
                this.field839[var10] = -1;
            }
            for (int var11 = 0; var11 < this.field836; var11++) {
                this.field839[this.field840[var11]] = var3.method222(1024);
            }
            this.field825 = new class123(this.field839);
        }
        for (int var12 = 0; var12 < this.field836; var12++) {
            this.field844[this.field840[var12]] = var3.method222(1024);
        }
        for (int var13 = 0; var13 < this.field836; var13++) {
            this.field838[this.field840[var13]] = var3.method222(1024);
        }
        for (int var14 = 0; var14 < this.field836; var14++) {
            this.field830[this.field840[var14]] = var3.method215((byte) 107);
        }
        for (int var15 = 0; var15 < this.field836; var15++) {
            int var22 = this.field840[var15];
            int var23 = 0;
            int var24 = this.field830[var22];
            this.field828[var22] = new int[var24];
            int var25 = -1;
            for (int var26 = 0; var26 < var24; var26++) {
                int var27 = this.field828[var22][var26] = var23 += var3.method215((byte) 118);
                if (var27 > var25) {
                    var25 = var27;
                }
            }
            this.field831[var22] = var25 + 1;
            if ((var25 + 1) == var24) {
                this.field828[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field837 = new int[var7 + 1][];
        this.field827 = new class123[var7 + 1];
        for (int var16 = 0; var16 < this.field836; var16++) {
            int var17 = this.field840[var16];
            int var18 = this.field830[var17];
            this.field837[var17] = new int[this.field831[var17]];
            for (int var19 = 0; var19 < this.field831[var17]; var19++) {
                this.field837[var17][var19] = -1;
            }
            for (int var20 = 0; var20 < var18; var20++) {
                int var21;
                if (this.field828[var17] == null) {
                    var21 = var20;
                } else {
                    var21 = this.field828[var17][var20];
                }
                this.field837[var17][var21] = var3.method222(1024);
            }
            this.field827[var17] = new class123(this.field837[var17]);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 269)
    public static void method429(int arg0) {
        field845 = null;
        if (arg0 == 1) {
            field843 = null;
            field834 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "([BI)V", line = 298)
    public class63(byte[] arg0, int arg1) {
        this.field833 = class111.method717(arg0, arg0.length, (byte) -50);
        if (this.field833 != arg1) {
            throw new RuntimeException();
        }
        this.method428(arg0, 119);
    }
}
