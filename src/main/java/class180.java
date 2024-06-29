import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class180 extends class129 {

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "Z")
    public boolean field2956 = false;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "Lhl;")
    public class136 field2959;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "Z")
    private boolean field2961;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "Z")
    private boolean field2963;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    private int field2955;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    private int field2962;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "F")
    private float field2957;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    private int field2958;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "[I")
    private int[] field2960;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "[I")
    public static int[] field2964;

    @OriginalMember(owner = "client!sg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Luf;Lvh;)Z")
    public final boolean method1190(class164 arg0, class108 arg1) {
        return this.field2959.method959(arg1, arg0, 37);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Luf;Lvh;FZ)[I")
    public final int[] method1191(class164 arg0, class108 arg1, float arg2, boolean arg3) {
        if (this.field2960 == null || this.field2957 != arg2) {
            if (!this.field2959.method959(arg1, arg0, 57)) {
                return null;
            }
            this.field2958 = arg3 ? 64 : 128;
            this.field2960 = this.field2959.method956(this.field2958, arg0, 44, arg1, (double) arg2, true, this.field2958, this.field2963);
            this.field2957 = arg2;
            if (this.field2961) {
                int[] var5 = new int[this.field2958];
                int[] var6 = new int[this.field2958];
                int[] var7 = new int[this.field2958];
                int[] var8 = new int[this.field2958 * this.field2958];
                int var9 = this.field2958;
                int var10 = this.field2958;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field2960[var14];
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
                        int var27 = this.field2960[var14];
                        var15--;
                        int var28 = this.field2960[var15];
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
                this.field2960 = var8;
            }
        }
        return this.field2960;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V")
    public final void method1192(int arg0) {
        if (this.field2960 == null || this.field2962 == 0 && this.field2955 == 0) {
            return;
        }
        if (field2964 == null || field2964.length < this.field2960.length) {
            field2964 = new int[this.field2960.length];
        }
        int var2 = this.field2960.length;
        int var3 = this.field2955 * arg0;
        int var4 = this.field2958 - 1;
        int var5 = this.field2958 * arg0 * this.field2962;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field2958) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field2958; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field2964[var11] = this.field2960[var12];
            }
        }
        int[] var8 = this.field2960;
        this.field2960 = field2964;
        field2964 = var8;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()V")
    public static void method1193() {
        field2964 = null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Leh;)V")
    public class180(class101 arg0) {
        this.field2959 = new class136(arg0);
        this.field2961 = arg0.method669((byte) 36) == 1;
        this.field2963 = arg0.method669((byte) 36) == 1;
        arg0.method669((byte) 36);
        arg0.method669((byte) 36);
        int var2 = arg0.method669((byte) 36) & 0x3;
        this.field2955 = arg0.method646(72);
        this.field2962 = arg0.method646(113);
        arg0.method669((byte) 36);
        arg0.method669((byte) 36);
        arg0.method669((byte) 36);
    }
}
