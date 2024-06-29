import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class372 extends class118 {

    @OriginalMember(owner = "client!ft", name = "H", descriptor = "I")
    private int field5420 = -1;

    @OriginalMember(owner = "client!ft", name = "P", descriptor = "J")
    public static long field5428 = 0L;

    @OriginalMember(owner = "client!ft", name = "T", descriptor = "Lwl;")
    public static class452 field5432;

    @OriginalMember(owner = "client!ft", name = "U", descriptor = "Lsf;")
    public static class398 field5433;

    @OriginalMember(owner = "client!ft", name = "W", descriptor = "Lnn;")
    public static class151 field5434;

    @OriginalMember(owner = "client!ft", name = "G", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!ft", name = "I", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!ft", name = "J", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!ft", name = "K", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!ft", name = "M", descriptor = "I")
    public int field5425;

    @OriginalMember(owner = "client!ft", name = "N", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!ft", name = "O", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!ft", name = "Q", descriptor = "I")
    public int field5429;

    @OriginalMember(owner = "client!ft", name = "R", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!ft", name = "L", descriptor = "[I")
    public int[] field5424;

    @OriginalMember(owner = "client!ft", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field5431;

    @OriginalMember(owner = "client!ft", name = "X", descriptor = "[[S")
    public static short[][] field5435;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V")
    public final void method706(int arg0) {
        ++field5430;
        super.method706(arg0);
        this.field5424 = null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (arg0 == 0) {
            this.field5420 = arg2.method2323(-14);
        }
        if (arg1 == 1) {
            ++field5421;
        }
    }

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "(I)I")
    public static final int method2236(int arg0) {
        ++field5422;
        if ((double) class223.field3385 == 3.0D) {
            return 37;
        } else if ((double) class223.field3385 == 4.0D) {
            return 50;
        } else {
            if (arg0 <= 48) {
                field5435 = null;
            }
            if ((double) class223.field3385 == 6.0D) {
                return 75;
            } else {
                return (double) class223.field3385 == 8.0D ? 100 : 200;
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZI)[[I")
    public int[][] method195(boolean arg0, int arg1) {
        ++field5423;
        if (arg0) {
            field5434 = null;
        }
        int[][] var3 = super.field1549.method2013(arg1, true);
        if (super.field1549.field4903 && this.method2237(114)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class289.field4403 != ~this.field5425 ? this.field5425 * arg1 / class289.field4403 : arg1) * this.field5429;
            if (~class440.field6474 != ~this.field5429) {
                for (int var8 = 0; class440.field6474 > var8; ++var8) {
                    int var9 = this.field5429 * var8 / class440.field6474;
                    int var10 = this.field5424[var7 + var9];
                    var6[var8] = class406.method2552(var10, 255) << 4;
                    var5[var8] = class406.method2552(65280, var10) >> 4;
                    var4[var8] = class406.method2552(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; var11 < class440.field6474; ++var11) {
                    int var12 = this.field5424[var7++];
                    var6[var11] = class406.method2552(var12 << 4, 4080);
                    var5[var11] = class406.method2552(4080, var12 >> 4);
                    var4[var11] = class406.method2552(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "(I)Z")
    public final boolean method2237(int arg0) {
        ++field5419;
        if (this.field5424 != null) {
            return true;
        } else {
            if (arg0 < 73) {
                this.method2237(-32);
            }
            if (~this.field5420 <= -1) {
                class4 var2 = ~class164.field2293 <= -1 ? class4.method36(class25.field324, class164.field2293, this.field5420) : class4.method27(class25.field324, this.field5420);
                var2.method37();
                this.field5424 = var2.method38();
                this.field5429 = var2.field46;
                this.field5425 = var2.field41;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "(I)V")
    public static void method2238(int arg0) {
        field5434 = null;
        if (arg0 != 100) {
            field5431 = null;
        }
        field5435 = null;
        field5431 = null;
        field5432 = null;
        field5433 = null;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
    public class372() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)I")
    public final int method704(byte arg0) {
        ++field5426;
        return arg0 != -92 ? -19 : this.field5420;
    }

    static {
        new class149(64);
        field5432 = new class452(50, 8);
        field5433 = new class398();
        new class151("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field5434 = new class151("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");
    }
}
