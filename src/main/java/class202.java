import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class202 extends class278 {

    @OriginalMember(owner = "client!wt", name = "L", descriptor = "I")
    private int field2878 = 585;

    @OriginalMember(owner = "client!wt", name = "M", descriptor = "I")
    public static int field2879 = 0;

    @OriginalMember(owner = "client!wt", name = "N", descriptor = "I")
    public static int field2880 = -1;

    @OriginalMember(owner = "client!wt", name = "I", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!wt", name = "K", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!wt", name = "O", descriptor = "I")
    public static int field2881;

    static {
        new class83("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V", line = 4)
    public class202() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Llh;II)V", line = 15)
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (arg1 == -30446) {
            if (arg2 == 0) {
                this.field2878 = arg0.method2062((byte) 14);
            }
            ++field2876;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIIII)V", line = 42)
    public static final void method1237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2881;
        if (~class437.field6374.field4262 != -1 && ~arg0 != -1 && ~class292.field3915 > -51 && arg4 != -1) {
            class526.field7723[class292.field3915++] = new class20((byte) 1, arg4, arg0, arg2, arg3, arg5);
        }
        if (arg1 != 2048) {
            field2880 = 31;
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)[I", line = 73)
    public final int[] method208(int arg0, int arg1) {
        ++field2877;
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (arg0 != -9) {
            this.method210((class365) null, -76, 75);
        }
        if (super.field3750.field554) {
            int var4 = class454.field6637[arg1];
            for (int var5 = 0; ~var5 > ~class507.field7456; ++var5) {
                int var6 = class192.field2736[var5];
                if (var6 > this.field2878 && ~(-this.field2878 + 4096) < ~var6 && -this.field2878 + 2048 < var4 && 2048 - -this.field2878 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2878 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > -this.field2878 + 2048 && var6 < this.field2878 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field2878;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field2878 + 2048);
                } else if (~var4 <= ~this.field2878 && ~var4 >= ~(-this.field2878 + 4096)) {
                    if (~this.field2878 >= ~var6 && ~var6 >= ~(-this.field2878 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field2878);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field2878;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field2878 + 2048);
                }
            }
        }
        return var3;
    }
}
