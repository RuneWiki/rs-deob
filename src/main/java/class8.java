import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class8 extends class155 {

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "Z")
    public boolean field163 = false;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "Lej;")
    public class101 field165;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "Z")
    private boolean field168;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "Z")
    private boolean field160;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    private int field164;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "F")
    private float field159;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "[I")
    private int[] field161;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "[I")
    public static int[] field166;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lve;Laj;FZ)[I")
    public final int[] method54(class198 arg0, class151 arg1, float arg2, boolean arg3) {
        if (this.field161 == null || this.field159 != arg2) {
            if (!this.field165.method714(arg0, -72, arg1)) {
                return null;
            }
            this.field167 = arg3 ? 64 : 128;
            this.field161 = this.field165.method720((byte) -28, this.field167, true, arg1, arg0, this.field167, (double) arg2, this.field160);
            this.field159 = arg2;
            if (this.field168) {
                int[] var5 = new int[this.field167];
                int[] var6 = new int[this.field167];
                int[] var7 = new int[this.field167];
                int[] var8 = new int[this.field167 * this.field167];
                int var9 = this.field167;
                int var10 = this.field167;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field161[var14];
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
                        int var27 = this.field161[var14];
                        var15--;
                        int var28 = this.field161[var15];
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
                this.field161 = var8;
            }
        }
        return this.field161;
    }

    @OriginalMember(owner = "client!mi", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lve;Laj;)Z")
    public final boolean method55(class198 arg0, class151 arg1) {
        return this.field165.method714(arg0, 68, arg1);
    }

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "(I)V")
    public final void method56(int arg0) {
        if (this.field161 == null || this.field164 == 0 && this.field162 == 0) {
            return;
        }
        if (field166 == null || field166.length < this.field161.length) {
            field166 = new int[this.field161.length];
        }
        int var2 = this.field161.length;
        int var3 = this.field162 * arg0;
        int var4 = this.field167 - 1;
        int var5 = this.field167 * arg0 * this.field164;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field167) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field167; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field166[var11] = this.field161[var12];
            }
        }
        int[] var8 = this.field161;
        this.field161 = field166;
        field166 = var8;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()V")
    public static void method57() {
        field166 = null;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lab;)V")
    public class8(class249 arg0) {
        this.field165 = new class101(arg0);
        this.field168 = arg0.method1802((byte) -104) == 1;
        this.field160 = arg0.method1802((byte) -107) == 1;
        arg0.method1802((byte) 88);
        arg0.method1802((byte) -103);
        int var2 = arg0.method1802((byte) -89) & 0x3;
        this.field162 = arg0.method1768(85);
        this.field164 = arg0.method1768(109);
        arg0.method1802((byte) -114);
        arg0.method1802((byte) -96);
        arg0.method1802((byte) 101);
    }
}
