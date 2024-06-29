import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class104 extends class627 {

    @OriginalMember(owner = "client!cea", name = "m", descriptor = "I")
    public int field1284;

    @OriginalMember(owner = "client!cea", name = "n", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client!cea", name = "o", descriptor = "[I")
    private int[] field1286;

    @OriginalMember(owner = "client!cea", name = "l", descriptor = "I")
    public int field1283;

    @OriginalMember(owner = "client!cea", name = "k", descriptor = "Z")
    public boolean field1282;

    @OriginalMember(owner = "client!cea", name = "j", descriptor = "[I")
    private static int[] field1281;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "()[I")
    public final int[] method721() {
        return this.field1286;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)V")
    public final void method722(int arg0, int arg1) {
        if (arg0 == 0 && arg1 == 0) {
            return;
        }
        if (field1281 == null || field1281.length != this.field1286.length) {
            field1281 = new int[this.field1286.length];
        }
        int var3 = this.field1286.length;
        int var4 = arg0;
        int var5 = this.field1285 - 1;
        int var6 = this.field1285 * arg1;
        int var7 = var3 - 1;
        for (int var8 = 0; var8 < var3; var8 += this.field1285) {
            int var10 = var6 + var8 & var7;
            for (int var11 = 0; var11 < this.field1285; var11++) {
                int var12 = var8 + var11;
                int var13 = (var4 + var11 & var5) + var10;
                field1281[var12] = this.field1286[var13];
            }
        }
        int[] var9 = this.field1286;
        this.field1286 = field1281;
        field1281 = var9;
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(II[IZ)V")
    public class104(int arg0, int arg1, int[] arg2, boolean arg3) {
        this.field1284 = arg0;
        this.field1285 = arg1;
        this.field1286 = arg2;
        if (arg3) {
            int[] var5 = new int[this.field1285];
            int[] var6 = new int[this.field1285];
            int[] var7 = new int[this.field1285];
            int[] var8 = new int[this.field1285];
            if (field1281 == null || field1281.length != this.field1286.length) {
                field1281 = new int[this.field1286.length];
            }
            int var9 = this.field1285;
            int var10 = this.field1285;
            int var11 = var9 - 1;
            int var12 = var10 - 1;
            int var13 = var9 * var10;
            int var14 = var9;
            int var15 = var9;
            for (int var16 = 2; var16 >= 0; var16--) {
                for (int var35 = var11; var35 >= 0; var35--) {
                    var14--;
                    int var36 = this.field1286[var14];
                    var5[var35] += var36 >> 24 & 0xFF;
                    var6[var35] += var36 >> 16 & 0xFF;
                    var7[var35] += var36 >> 8 & 0xFF;
                    var8[var35] += var36 & 0xFF;
                }
                if (var14 == 0) {
                    var14 = var13;
                }
            }
            int var17 = var13;
            for (int var18 = var12; var18 >= 0; var18--) {
                int var20 = 1;
                int var21 = 1;
                int var22 = 0;
                int var23 = 0;
                int var24 = 0;
                int var25 = 0;
                for (int var26 = 2; var26 >= 0; var26--) {
                    var21--;
                    var25 += var5[var21];
                    var24 += var6[var21];
                    var22 += var7[var21];
                    var23 += var8[var21];
                    if (var21 == 0) {
                        var21 = var9;
                    }
                }
                for (int var27 = var11; var27 >= 0; var27--) {
                    var21--;
                    var20--;
                    int var31 = var25 / 9;
                    int var32 = var24 / 9;
                    int var33 = var22 / 9;
                    int var34 = var23 / 9;
                    var17--;
                    field1281[var17] = var31 << 24 | var32 << 16 | var33 << 8 | var34;
                    var25 += var5[var21] - var5[var20];
                    var24 += var6[var21] - var6[var20];
                    var23 += var8[var21] - var8[var20];
                    var22 += var7[var21] - var7[var20];
                    if (var21 == 0) {
                        var21 = var9;
                    }
                    if (var20 == 0) {
                        var20 = var9;
                    }
                }
                for (int var28 = var11; var28 >= 0; var28--) {
                    var14--;
                    int var29 = this.field1286[var14];
                    var15--;
                    int var30 = this.field1286[var15];
                    var5[var28] += (var29 >> 24 & 0xFF) - (var30 >> 24 & 0xFF);
                    var6[var28] += (var29 >> 16 & 0xFF) - (var30 >> 16 & 0xFF);
                    var7[var28] += (var29 >> 8 & 0xFF) - (var30 >> 8 & 0xFF);
                    var8[var28] += (var29 & 0xFF) - (var30 & 0xFF);
                }
                if (var14 == 0) {
                    var14 = var13;
                }
                if (var15 == 0) {
                    var15 = var13;
                }
            }
            int[] var19 = this.field1286;
            this.field1286 = field1281;
            field1281 = var19;
        }
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "()V")
    public static void method723() {
        field1281 = null;
    }
}
