import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class97 extends class88 {

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "Z")
    public boolean field1288 = false;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "Lsa;")
    public class73 field1293;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "Z")
    private boolean field1292;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "Z")
    private boolean field1287;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    private int field1294;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "F")
    private float field1289;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "[I")
    private int[] field1285;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "[I")
    public static int[] field1290;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lvl;Leh;)Z")
    public final boolean method599(class6 arg0, class137 arg1) {
        return this.field1293.method410(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!fc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lvl;Leh;FZ)[I")
    public final int[] method600(class6 arg0, class137 arg1, float arg2, boolean arg3) {
        if (this.field1285 == null || this.field1289 != arg2) {
            if (!this.field1293.method410(arg0, arg1, 0)) {
                return null;
            }
            this.field1291 = arg3 ? 64 : 128;
            this.field1285 = this.field1293.method411(this.field1291, this.field1287, arg1, arg0, this.field1291, true, (double) arg2, 121);
            this.field1289 = arg2;
            if (this.field1292) {
                int[] var5 = new int[this.field1291];
                int[] var6 = new int[this.field1291];
                int[] var7 = new int[this.field1291];
                int[] var8 = new int[this.field1291 * this.field1291];
                int var9 = this.field1291;
                int var10 = this.field1291;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field1285[var14];
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
                        int var27 = this.field1285[var14];
                        var15--;
                        int var28 = this.field1285[var15];
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
                this.field1285 = var8;
            }
        }
        return this.field1285;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
    public final void method601(int arg0) {
        if (this.field1285 == null || this.field1294 == 0 && this.field1286 == 0) {
            return;
        }
        if (field1290 == null || field1290.length < this.field1285.length) {
            field1290 = new int[this.field1285.length];
        }
        int var2 = this.field1285.length;
        int var3 = this.field1286 * arg0;
        int var4 = this.field1291 - 1;
        int var5 = this.field1291 * arg0 * this.field1294;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field1291) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field1291; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field1290[var11] = this.field1285[var12];
            }
        }
        int[] var8 = this.field1285;
        this.field1285 = field1290;
        field1290 = var8;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()V")
    public static void method602() {
        field1290 = null;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lpd;)V")
    public class97(class96 arg0) {
        this.field1293 = new class73(arg0);
        this.field1292 = arg0.method584(255) == 1;
        this.field1287 = arg0.method584(255) == 1;
        arg0.method584(255);
        arg0.method584(255);
        int var2 = arg0.method584(255) & 0x3;
        this.field1286 = arg0.method587(121);
        this.field1294 = arg0.method587(-9);
        arg0.method584(255);
        arg0.method584(255);
        arg0.method584(255);
    }
}
