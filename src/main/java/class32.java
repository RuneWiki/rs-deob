import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class32 extends class209 {

    @OriginalMember(owner = "client!na", name = "F", descriptor = "Z")
    public boolean field580 = false;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "Lae;")
    public class176 field579;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "Z")
    private boolean field583;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "Z")
    private boolean field575;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "F")
    private float field584;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "I")
    private int field577;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "[I")
    private int[] field576;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "[I")
    public static int[] field581;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()V")
    public static void method318() {
        field581 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lqh;Lub;)Z")
    public final boolean method319(class212 arg0, class92 arg1) {
        return this.field579.method1260(0, arg1, arg0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lqh;Lub;FZ)[I")
    public final int[] method320(class212 arg0, class92 arg1, float arg2, boolean arg3) {
        if (this.field576 == null || this.field584 != arg2) {
            if (!this.field579.method1260(0, arg1, arg0)) {
                return null;
            }
            this.field577 = arg3 ? 64 : 128;
            this.field576 = this.field579.method1255(this.field577, -22647, this.field575, (double) arg2, this.field577, true, arg1, arg0);
            this.field584 = arg2;
            if (this.field583) {
                int[] var5 = new int[this.field577];
                int[] var6 = new int[this.field577];
                int[] var7 = new int[this.field577];
                int[] var8 = new int[this.field577 * this.field577];
                int var9 = this.field577;
                int var10 = this.field577;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field576[var14];
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
                        int var27 = this.field576[var14];
                        var15--;
                        int var28 = this.field576[var15];
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
                this.field576 = var8;
            }
        }
        return this.field576;
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
    public final void method321(int arg0) {
        if (this.field576 == null || this.field578 == 0 && this.field582 == 0) {
            return;
        }
        if (field581 == null || field581.length < this.field576.length) {
            field581 = new int[this.field576.length];
        }
        int var2 = this.field576.length;
        int var3 = this.field582 * arg0;
        int var4 = this.field577 - 1;
        int var5 = this.field577 * arg0 * this.field578;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field577) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field577; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field581[var11] = this.field576[var12];
            }
        }
        int[] var8 = this.field576;
        this.field576 = field581;
        field581 = var8;
    }

    @OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lha;)V")
    public class32(class31 arg0) {
        this.field579 = new class176(arg0);
        this.field583 = arg0.method265(-101) == 1;
        this.field575 = arg0.method265(-98) == 1;
        arg0.method265(-102);
        arg0.method265(-123);
        int var2 = arg0.method265(-82) & 0x3;
        this.field582 = arg0.method266(-129);
        this.field578 = arg0.method266(-129);
        arg0.method265(-126);
        arg0.method265(-121);
        arg0.method265(-84);
    }
}
