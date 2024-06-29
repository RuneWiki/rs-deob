import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class38 extends class137 {

    @OriginalMember(owner = "client!w", name = "N", descriptor = "Z")
    public boolean field538 = false;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "Lmh;")
    public class64 field540;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "Z")
    private boolean field536;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "Z")
    private boolean field539;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    private int field535;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "F")
    private float field533;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "[I")
    public static int[] field531;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "[I")
    private int[] field532;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ltd;Ldk;FZ)[I")
    public final int[] method236(class226 arg0, class251 arg1, float arg2, boolean arg3) {
        if (this.field532 == null || this.field533 != arg2) {
            if (!this.field540.method446(arg1, arg0, -100)) {
                return null;
            }
            this.field537 = arg3 ? 64 : 128;
            this.field532 = this.field540.method449(arg1, arg0, this.field539, this.field537, true, (double) arg2, this.field537, (byte) 80);
            this.field533 = arg2;
            if (this.field536) {
                int[] var5 = new int[this.field537];
                int[] var6 = new int[this.field537];
                int[] var7 = new int[this.field537];
                int[] var8 = new int[this.field537 * this.field537];
                int var9 = this.field537;
                int var10 = this.field537;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field532[var14];
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
                        int var27 = this.field532[var14];
                        var15--;
                        int var28 = this.field532[var15];
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
                this.field532 = var8;
            }
        }
        return this.field532;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()V")
    public static void method237() {
        field531 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ltd;Ldk;)Z")
    public final boolean method238(class226 arg0, class251 arg1) {
        return this.field540.method446(arg1, arg0, -88);
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lwd;)V")
    public class38(class162 arg0) {
        this.field540 = new class64(arg0);
        this.field536 = arg0.method1133((byte) 53) == 1;
        this.field539 = arg0.method1133((byte) 53) == 1;
        arg0.method1133((byte) 53);
        arg0.method1133((byte) 53);
        int var2 = arg0.method1133((byte) 53) & 0x3;
        this.field534 = arg0.method1107((byte) -101);
        this.field535 = arg0.method1107((byte) -82);
        arg0.method1133((byte) 53);
        arg0.method1133((byte) 53);
        arg0.method1133((byte) 53);
    }

    @OriginalMember(owner = "client!w", name = "i", descriptor = "(I)V")
    public final void method239(int arg0) {
        if (this.field532 == null || this.field535 == 0 && this.field534 == 0) {
            return;
        }
        if (field531 == null || field531.length < this.field532.length) {
            field531 = new int[this.field532.length];
        }
        int var2 = this.field532.length;
        int var3 = this.field534 * arg0;
        int var4 = this.field537 - 1;
        int var5 = this.field537 * arg0 * this.field535;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field537) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field537; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field531[var11] = this.field532[var12];
            }
        }
        int[] var8 = this.field532;
        this.field532 = field531;
        field531 = var8;
    }
}
