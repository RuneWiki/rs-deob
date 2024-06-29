import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class662 extends class440 {

    @OriginalMember(owner = "client!lga", name = "I", descriptor = "I")
    private int field9356 = 0;

    @OriginalMember(owner = "client!lga", name = "J", descriptor = "I")
    private int field9357 = 10;

    @OriginalMember(owner = "client!lga", name = "H", descriptor = "I")
    private int field9355 = 2048;

    @OriginalMember(owner = "client!lga", name = "L", descriptor = "Lnea;")
    public static class664 field9359 = new class664(75, -2);

    @OriginalMember(owner = "client!lga", name = "N", descriptor = "[I")
    public static int[] field9361 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!lga", name = "E", descriptor = "I")
    public static int field9352;

    @OriginalMember(owner = "client!lga", name = "G", descriptor = "I")
    public static int field9354;

    @OriginalMember(owner = "client!lga", name = "K", descriptor = "I")
    public static int field9358;

    @OriginalMember(owner = "client!lga", name = "M", descriptor = "I")
    public static int field9360;

    @OriginalMember(owner = "client!lga", name = "D", descriptor = "[I")
    private int[] field9351;

    @OriginalMember(owner = "client!lga", name = "F", descriptor = "[I")
    private int[] field9353;

    @OriginalMember(owner = "client!lga", name = "g", descriptor = "(I)V")
    public static void method3664(int arg0) {
        field9359 = null;
        field9361 = null;
        if (arg0 != 4096) {
            method3664(-51);
        }
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)V")
    private final void method3665(byte arg0) {
        ++field9360;
        int var2 = 0;
        this.field9353 = new int[this.field9357 + 1];
        if (arg0 != 86) {
            this.field9353 = null;
        }
        this.field9351 = new int[this.field9357 + 1];
        int var3 = 4096 / this.field9357;
        int var4 = this.field9355 * var3 >> 12;
        for (int var5 = 0; this.field9357 > var5; ++var5) {
            this.field9353[var5] = var2;
            this.field9351[var5] = var2 + var4;
            var2 += var3;
        }
        this.field9353[this.field9357] = 4096;
        this.field9351[this.field9357] = this.field9351[0] + 4096;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)V")
    public final void method230(int arg0) {
        if (arg0 == -9) {
            ++field9352;
            this.method3665((byte) 86);
        }
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "()V")
    public class662() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILmo;I)V")
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field9358;
        if (arg0 != 5) {
            this.method230(75);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field9356 = arg1.method3826(false);
                }
            } else {
                this.field9355 = arg1.method3847((byte) 118);
            }
        } else {
            this.field9357 = arg1.method3826(false);
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        ++field9354;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        int var4 = -8 % ((-56 - arg0) / 41);
        if (super.field6412.field8047) {
            int var5 = class418.field6099[arg1];
            if (~this.field9356 == -1) {
                short var6 = 0;
                for (int var7 = 0; ~var7 > ~this.field9357; ++var7) {
                    if (~this.field9353[var7] >= ~var5 && this.field9353[var7 + 1] > var5) {
                        if (this.field9351[var7] > var5) {
                            var6 = 4096;
                        }
                        break;
                    }
                }
                class476.method2790(var3, 0, class549.field7715, var6);
            } else {
                for (int var8 = 0; var8 < class549.field7715; ++var8) {
                    int var9 = 0;
                    short var10 = 0;
                    int var11 = class499.field7073[var8];
                    int var12 = this.field9356;
                    if (~var12 != -2) {
                        if (var12 != 2) {
                            if (~var12 == -4) {
                                var9 = (-var5 + var11 >> 1) + 2048;
                            }
                        } else {
                            var9 = (var11 - -var5 - 4096 >> 1) + 2048;
                        }
                    } else {
                        var9 = var11;
                    }
                    for (int var13 = 0; ~var13 > ~this.field9357; ++var13) {
                        if (this.field9353[var13] <= var9 && var9 < this.field9353[var13 + 1]) {
                            if (var9 < this.field9351[var13]) {
                                var10 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var8] = var10;
                }
            }
        }
        return var3;
    }
}
