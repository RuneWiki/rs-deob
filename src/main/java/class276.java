import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class276 extends class252 {

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "Z")
    public boolean field4515 = false;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "Lma;")
    public class202 field4516;

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "Z")
    private boolean field4521;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "Z")
    private boolean field4520;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "I")
    private int field4514;

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "I")
    private int field4518;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "F")
    private float field4512;

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "I")
    private int field4519;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "[I")
    public static int[] field4513;

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "[I")
    private int[] field4517;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "()V")
    public static void method1884() {
        field4513 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Loa;Lgi;FZ)[I")
    public final int[] method1885(class105 arg0, class164 arg1, float arg2, boolean arg3) {
        if (this.field4517 == null || this.field4512 != arg2) {
            if (!this.field4516.method1413(arg1, arg0, 127)) {
                return null;
            }
            this.field4519 = arg3 ? 64 : 128;
            this.field4517 = this.field4516.method1416(this.field4520, arg0, (double) arg2, arg1, this.field4519, true, 4329, this.field4519);
            this.field4512 = arg2;
            if (this.field4521) {
                int[] var5 = new int[this.field4519];
                int[] var6 = new int[this.field4519];
                int[] var7 = new int[this.field4519];
                int[] var8 = new int[this.field4519 * this.field4519];
                int var9 = this.field4519;
                int var10 = this.field4519;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field4517[var14];
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
                        int var27 = this.field4517[var14];
                        var15--;
                        int var28 = this.field4517[var15];
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
                this.field4517 = var8;
            }
        }
        return this.field4517;
    }

    @OriginalMember(owner = "client!jk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V")
    public final void method1886(int arg0) {
        if (this.field4517 == null || this.field4518 == 0 && this.field4514 == 0) {
            return;
        }
        if (field4513 == null || field4513.length < this.field4517.length) {
            field4513 = new int[this.field4517.length];
        }
        int var2 = this.field4517.length;
        int var3 = this.field4514 * arg0;
        int var4 = this.field4519 - 1;
        int var5 = this.field4519 * arg0 * this.field4518;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field4519) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field4519; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field4513[var11] = this.field4517[var12];
            }
        }
        int[] var8 = this.field4517;
        this.field4517 = field4513;
        field4513 = var8;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Loa;Lgi;)Z")
    public final boolean method1887(class105 arg0, class164 arg1) {
        return this.field4516.method1413(arg1, arg0, 126);
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lfj;)V")
    public class276(class274 arg0) {
        this.field4516 = new class202(arg0);
        this.field4521 = arg0.method1849(255) == 1;
        this.field4520 = arg0.method1849(255) == 1;
        arg0.method1849(255);
        arg0.method1849(255);
        int var2 = arg0.method1849(255) & 0x3;
        this.field4514 = arg0.method1830((byte) 86);
        this.field4518 = arg0.method1830((byte) 79);
        arg0.method1849(255);
        arg0.method1849(255);
        arg0.method1849(255);
    }
}
