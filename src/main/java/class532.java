import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class532 {

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public int field7828;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "[I")
    public static int[] field7834 = new int[1000];

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Lap;")
    public static class335 field7823 = new class335("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!f", name = "u", descriptor = "Lap;")
    public static class335 field7838 = new class335(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public int field7821;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public int field7831;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public int field7836;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Lft;")
    public static class4 field7825;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "Lto;")
    public class8 field7832;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[I")
    public int[] field7818;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "[I")
    public int[] field7826;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "[I")
    public int[] field7827;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "[I")
    public int[] field7830;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "[I")
    public int[] field7833;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "[I")
    public int[] field7837;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "[Ll;")
    public static class16[] field7820;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "[Lto;")
    public class8[] field7822;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "[[I")
    public int[][] field7829;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "[[I")
    public int[][] field7835;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([BI)V", line = 6)
    private final void method3153(byte[] arg0, int arg1) {
        field7819++;
        class463 var3 = new class463(class271.method1608((byte) -117, arg0));
        int var4 = var3.method2737(false);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field7821 = 0;
        } else {
            this.field7821 = var3.method2727(-107);
        }
        int var5 = var3.method2737(false);
        this.field7836 = var3.method2758((byte) 76);
        int var6 = 0;
        this.field7827 = new int[this.field7836];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field7836; var8++) {
            this.field7827[var8] = var6 += var3.method2758((byte) 105);
            if (var7 < this.field7827[var8]) {
                var7 = this.field7827[var8];
            }
        }
        int var9 = 45 / ((-arg1 - 58) / 62);
        this.field7831 = var7 + 1;
        this.field7835 = new int[this.field7831][];
        this.field7826 = new int[this.field7831];
        this.field7837 = new int[this.field7831];
        this.field7818 = new int[this.field7831];
        this.field7830 = new int[this.field7831];
        if (var5 != 0) {
            this.field7833 = new int[this.field7831];
            for (int var10 = 0; var10 < this.field7831; var10++) {
                this.field7833[var10] = -1;
            }
            for (int var11 = 0; var11 < this.field7836; var11++) {
                this.field7833[this.field7827[var11]] = var3.method2727(-117);
            }
            this.field7832 = new class8(this.field7833);
        }
        for (int var12 = 0; var12 < this.field7836; var12++) {
            this.field7837[this.field7827[var12]] = var3.method2727(-122);
        }
        for (int var13 = 0; var13 < this.field7836; var13++) {
            this.field7826[this.field7827[var13]] = var3.method2727(-74);
        }
        for (int var14 = 0; var14 < this.field7836; var14++) {
            this.field7818[this.field7827[var14]] = var3.method2758((byte) 86);
        }
        for (int var15 = 0; var15 < this.field7836; var15++) {
            int var22 = this.field7827[var15];
            int var23 = 0;
            int var24 = this.field7818[var22];
            int var25 = -1;
            this.field7835[var22] = new int[var24];
            for (int var26 = 0; var26 < var24; var26++) {
                int var27 = this.field7835[var22][var26] = var23 += var3.method2758((byte) 82);
                if (var27 > var25) {
                    var25 = var27;
                }
            }
            this.field7830[var22] = var25 + 1;
            if ((var25 + 1) == var24) {
                this.field7835[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field7822 = new class8[var7 + 1];
        this.field7829 = new int[var7 + 1][];
        for (int var16 = 0; var16 < this.field7836; var16++) {
            int var17 = this.field7827[var16];
            int var18 = this.field7818[var17];
            this.field7829[var17] = new int[this.field7830[var17]];
            for (int var19 = 0; var19 < this.field7830[var17]; var19++) {
                this.field7829[var17][var19] = -1;
            }
            for (int var20 = 0; var20 < var18; var20++) {
                int var21;
                if (this.field7835[var17] == null) {
                    var21 = var20;
                } else {
                    var21 = this.field7835[var17][var20];
                }
                this.field7829[var17][var21] = var3.method2727(-105);
            }
            this.field7822[var17] = new class8(this.field7829[var17]);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 181)
    public static void method3154(int arg0) {
        field7823 = null;
        field7825 = null;
        field7834 = null;
        field7820 = null;
        field7838 = null;
        if (arg0 != 0) {
            method3155(42, -18, 40);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Z", line = 214)
    public static final boolean method3155(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method3155(-21, 86, 18);
        }
        field7824++;
        return false;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "([BI)V", line = 227)
    public class532(byte[] arg0, int arg1) {
        this.field7828 = class242.method1478(3, arg0, arg0.length);
        if (this.field7828 != arg1) {
            throw new RuntimeException();
        }
        this.method3153(arg0, 92);
    }
}
