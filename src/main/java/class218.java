import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class218 extends class55 {

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "Z")
    public boolean field3088 = false;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "Lvf;")
    public class30 field3086;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "Z")
    private boolean field3089;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "Z")
    private boolean field3083;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "I")
    private int field3087;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    private int field3085;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "F")
    private float field3082;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    private int field3084;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "[I")
    public static int[] field3090;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "[I")
    private int[] field3091;

    @OriginalMember(owner = "client!ii", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()V")
    public static void method1418() {
        field3090 = null;
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
    public final void method1419(int arg0) {
        if (this.field3091 == null || this.field3085 == 0 && this.field3087 == 0) {
            return;
        }
        if (field3090 == null || field3090.length < this.field3091.length) {
            field3090 = new int[this.field3091.length];
        }
        int var2 = this.field3091.length;
        int var3 = this.field3087 * arg0;
        int var4 = this.field3084 - 1;
        int var5 = this.field3084 * arg0 * this.field3085;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field3084) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field3084; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field3090[var11] = this.field3091[var12];
            }
        }
        int[] var8 = this.field3091;
        this.field3091 = field3090;
        field3090 = var8;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lee;Lbc;FZ)[I")
    public final int[] method1420(class69 arg0, class282 arg1, float arg2, boolean arg3) {
        if (this.field3091 == null || this.field3082 != arg2) {
            if (!this.field3086.method186((byte) -67, arg0, arg1)) {
                return null;
            }
            this.field3084 = arg3 ? 64 : 128;
            this.field3091 = this.field3086.method179(-111, (double) arg2, this.field3084, arg1, this.field3084, true, arg0, this.field3083);
            this.field3082 = arg2;
            if (this.field3089) {
                int[] var5 = new int[this.field3084];
                int[] var6 = new int[this.field3084];
                int[] var7 = new int[this.field3084];
                int[] var8 = new int[this.field3084 * this.field3084];
                int var9 = this.field3084;
                int var10 = this.field3084;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field3091[var14];
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
                        int var27 = this.field3091[var14];
                        var15--;
                        int var28 = this.field3091[var15];
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
                this.field3091 = var8;
            }
        }
        return this.field3091;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lee;Lbc;)Z")
    public final boolean method1421(class69 arg0, class282 arg1) {
        return this.field3086.method186((byte) -67, arg0, arg1);
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lqi;)V")
    public class218(class216 arg0) {
        this.field3086 = new class30(arg0);
        this.field3089 = arg0.method1407(116) == 1;
        this.field3083 = arg0.method1407(105) == 1;
        arg0.method1407(119);
        arg0.method1407(126);
        int var2 = arg0.method1407(120) & 0x3;
        this.field3087 = arg0.method1355(true);
        this.field3085 = arg0.method1355(true);
        arg0.method1407(121);
        arg0.method1407(118);
        arg0.method1407(122);
    }
}
