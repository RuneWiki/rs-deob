import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class226 extends class18 {

    @OriginalMember(owner = "client!og", name = "F", descriptor = "Z")
    public boolean field3452 = false;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "Lgf;")
    public class126 field3449;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "Z")
    private boolean field3455;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "Z")
    private boolean field3448;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    private int field3457;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "I")
    private int field3453;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "F")
    private float field3456;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    private int field3454;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "[I")
    private int[] field3450;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "[I")
    private static int[] field3451;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()V")
    public static void method1503() {
        field3451 = null;
    }

    @OriginalMember(owner = "client!og", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lwk;Lhc;)Z")
    public final boolean method1504(class279 arg0, class235 arg1) {
        return this.field3449.method876(arg0, arg1, -44);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lwk;Lhc;FZ)[I")
    public final int[] method1505(class279 arg0, class235 arg1, float arg2, boolean arg3) {
        if (this.field3450 == null || this.field3456 != arg2) {
            if (!this.field3449.method876(arg0, arg1, -69)) {
                return null;
            }
            this.field3454 = arg3 ? 64 : 128;
            this.field3450 = this.field3449.method873(this.field3454, (double) arg2, this.field3448, arg0, true, arg1, -16005, this.field3454);
            this.field3456 = arg2;
            if (this.field3455) {
                int[] var5 = new int[this.field3454];
                int[] var6 = new int[this.field3454];
                int[] var7 = new int[this.field3454];
                int[] var8 = new int[this.field3454 * this.field3454];
                int var9 = this.field3454;
                int var10 = this.field3454;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field3450[var14];
                        var5[var32] += var33 >> 16 & 0xFF;
                        var6[var32] += var33 >> 8 & 0xFF;
                        var7[var32] += var33 & 0xFF;
                    }
                    if (var14 == 0) {
                        var14 = var13;
                    }
                }
                int var17 = var13;
                for (int var18 = var12; var18 >= 0; var18--) {
                    int var19 = 1;
                    int var20 = 1;
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    for (int var24 = 2; var24 >= 0; var24--) {
                        var20--;
                        var23 += var5[var20];
                        var21 += var6[var20];
                        var22 += var7[var20];
                        if (var20 == 0) {
                            var20 = var9;
                        }
                    }
                    for (int var25 = var11; var25 >= 0; var25--) {
                        var20--;
                        var19--;
                        int var29 = var23 / 9;
                        int var30 = var21 / 9;
                        int var31 = var22 / 9;
                        var17--;
                        var8[var17] = var29 << 16 | var30 << 8 | var31;
                        var23 += var5[var20] - var5[var19];
                        var22 += var7[var20] - var7[var19];
                        var21 += var6[var20] - var6[var19];
                        if (var20 == 0) {
                            var20 = var9;
                        }
                        if (var19 == 0) {
                            var19 = var9;
                        }
                    }
                    for (int var26 = var11; var26 >= 0; var26--) {
                        var14--;
                        int var27 = this.field3450[var14];
                        var15--;
                        int var28 = this.field3450[var15];
                        var5[var26] += (var27 >> 16 & 0xFF) - (var28 >> 16 & 0xFF);
                        var6[var26] += (var27 >> 8 & 0xFF) - (var28 >> 8 & 0xFF);
                        var7[var26] += (var27 & 0xFF) - (var28 & 0xFF);
                    }
                    if (var14 == 0) {
                        var14 = var13;
                    }
                    if (var15 == 0) {
                        var15 = var13;
                    }
                }
                this.field3450 = var8;
            }
        }
        return this.field3450;
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
    public final void method1506(int arg0) {
        if (this.field3450 == null || this.field3453 == 0 && this.field3457 == 0) {
            return;
        }
        if (field3451 == null || field3451.length < this.field3450.length) {
            field3451 = new int[this.field3450.length];
        }
        int var2 = this.field3450.length;
        int var3 = this.field3457 * arg0;
        int var4 = this.field3454 - 1;
        int var5 = this.field3454 * arg0 * this.field3453;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field3454) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field3454; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field3451[var11] = this.field3450[var12];
            }
        }
        int[] var8 = this.field3450;
        this.field3450 = field3451;
        field3451 = var8;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lai;)V")
    public class226(class88 arg0) {
        this.field3449 = new class126(arg0);
        this.field3455 = arg0.method633(102) == 1;
        this.field3448 = arg0.method633(126) == 1;
        arg0.method633(110);
        arg0.method633(126);
        int var2 = arg0.method633(68) & 0x3;
        this.field3457 = arg0.method656(-252);
        this.field3453 = arg0.method656(-252);
        arg0.method633(119);
        arg0.method633(61);
        arg0.method633(72);
    }
}
