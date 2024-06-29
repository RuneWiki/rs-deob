import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class267 extends class59 {

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "Z")
    public boolean field4341 = false;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "Lqd;")
    public class40 field4342;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "Z")
    private boolean field4340;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "Z")
    private boolean field4338;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    private int field4343;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    private int field4339;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "F")
    private float field4334;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    private int field4336;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "[I")
    public static int[] field4335;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "[I")
    private int[] field4337;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lsd;Lvl;FZ)[I")
    public final int[] method1860(class26 arg0, class73 arg1, float arg2, boolean arg3) {
        if (this.field4337 == null || this.field4334 != arg2) {
            if (!this.field4342.method230(arg1, 0, arg0)) {
                return null;
            }
            this.field4336 = arg3 ? 64 : 128;
            this.field4337 = this.field4342.method232(arg0, this.field4338, arg1, this.field4336, true, this.field4336, (double) arg2, false);
            this.field4334 = arg2;
            if (this.field4340) {
                int[] var5 = new int[this.field4336];
                int[] var6 = new int[this.field4336];
                int[] var7 = new int[this.field4336];
                int[] var8 = new int[this.field4336 * this.field4336];
                int var9 = this.field4336;
                int var10 = this.field4336;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field4337[var14];
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
                        int var27 = this.field4337[var14];
                        var15--;
                        int var28 = this.field4337[var15];
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
                this.field4337 = var8;
            }
        }
        return this.field4337;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
    public final void method1861(int arg0) {
        if (this.field4337 == null || this.field4339 == 0 && this.field4343 == 0) {
            return;
        }
        if (field4335 == null || field4335.length < this.field4337.length) {
            field4335 = new int[this.field4337.length];
        }
        int var2 = this.field4337.length;
        int var3 = this.field4343 * arg0;
        int var4 = this.field4336 - 1;
        int var5 = this.field4336 * arg0 * this.field4339;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field4336) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field4336; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field4335[var11] = this.field4337[var12];
            }
        }
        int[] var8 = this.field4337;
        this.field4337 = field4335;
        field4335 = var8;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "()V")
    public static void method1862() {
        field4335 = null;
    }

    @OriginalMember(owner = "client!ud", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lsd;Lvl;)Z")
    public final boolean method1863(class26 arg0, class73 arg1) {
        return this.field4342.method230(arg1, 0, arg0);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lim;)V")
    public class267(class170 arg0) {
        this.field4342 = new class40(arg0);
        this.field4340 = arg0.method1218(-108) == 1;
        this.field4338 = arg0.method1218(90) == 1;
        arg0.method1218(-82);
        arg0.method1218(93);
        int var2 = arg0.method1218(120) & 0x3;
        this.field4343 = arg0.method1215(128);
        this.field4339 = arg0.method1215(128);
        arg0.method1218(-92);
        arg0.method1218(105);
        arg0.method1218(95);
    }
}
