import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class414 extends class40 {

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    private int field5915 = 585;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field5914;

    static {
        new class349("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILlf;)V", line = 3)
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field5914;
        if (arg1 < 79) {
            this.field5915 = 55;
        }
        if (~arg0 == -1) {
            this.field5915 = arg2.method798(false);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)[I", line = 35)
    public final int[] method44(byte arg0, int arg1) {
        if (arg0 > -20) {
            this.field5915 = 55;
        }
        ++field5913;
        int[] var3 = super.field551.method185(65280, arg1);
        if (super.field551.field441) {
            int var4 = class86.field1123[arg1];
            for (int var5 = 0; class410.field5886 > var5; ++var5) {
                int var6 = class9.field124[var5];
                if (~var6 < ~this.field5915 && ~(-this.field5915 + 4096) < ~var6 && -this.field5915 + 2048 < var4 && ~var4 > ~(2048 - -this.field5915)) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field5915 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field5915 + 2048 < var6 && ~(2048 - -this.field5915) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field5915;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field5915);
                } else if (this.field5915 <= var4 && var4 <= -this.field5915 + 4096) {
                    if (var6 >= this.field5915 && -this.field5915 + 4096 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field5915 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field5915;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field5915);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 118)
    public class414() {
        super(0, true);
    }
}
