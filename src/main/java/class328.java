import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class328 extends class134 {

    @OriginalMember(owner = "client!ofa", name = "k", descriptor = "I")
    public int field4251;

    @OriginalMember(owner = "client!ofa", name = "j", descriptor = "I")
    private int field4250;

    @OriginalMember(owner = "client!ofa", name = "n", descriptor = "[I")
    private int[] field4254;

    @OriginalMember(owner = "client!ofa", name = "o", descriptor = "I")
    public int field4255;

    @OriginalMember(owner = "client!ofa", name = "l", descriptor = "Z")
    public boolean field4252;

    @OriginalMember(owner = "client!ofa", name = "m", descriptor = "[I")
    private static int[] field4253;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(II)V", line = 5)
    public final void method1960(int arg0, int arg1) {
        if (arg0 == 0 && arg1 == 0) {
            return;
        }
        if (field4253 == null || field4253.length != this.field4254.length) {
            field4253 = new int[this.field4254.length];
        }
        int var3 = this.field4254.length;
        int var4 = arg0;
        int var5 = this.field4250 - 1;
        int var6 = this.field4250 * arg1;
        int var7 = var3 - 1;
        for (int var8 = 0; var8 < var3; var8 += this.field4250) {
            int var10 = var6 + var8 & var7;
            for (int var11 = 0; var11 < this.field4250; var11++) {
                int var12 = var8 + var11;
                int var13 = (var4 + var11 & var5) + var10;
                field4253[var12] = this.field4254[var13];
            }
        }
        int[] var9 = this.field4254;
        this.field4254 = field4253;
        field4253 = var9;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "()[I", line = 50)
    public final int[] method1961() {
        return this.field4254;
    }

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "()V", line = 56)
    public static void method1962() {
        field4253 = null;
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(II[IZ)V", line = 59)
    public class328(int arg0, int arg1, int[] arg2, boolean arg3) {
        this.field4251 = arg0;
        this.field4250 = arg1;
        this.field4254 = arg2;
        if (arg3) {
            int[] var5 = new int[this.field4250];
            int[] var6 = new int[this.field4250];
            int[] var7 = new int[this.field4250];
            int[] var8 = new int[this.field4250];
            if (field4253 == null || field4253.length != this.field4254.length) {
                field4253 = new int[this.field4254.length];
            }
            int var9 = this.field4250;
            int var10 = this.field4250;
            int var11 = var9 - 1;
            int var12 = var10 - 1;
            int var13 = var9 * var10;
            int var14 = var9;
            int var15 = var9;
            for (int var16 = 2; var16 >= 0; var16--) {
                for (int var35 = var11; var35 >= 0; var35--) {
                    var14--;
                    int var36 = this.field4254[var14];
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
                    field4253[var17] = var31 << 24 | var32 << 16 | var33 << 8 | var34;
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
                    int var29 = this.field4254[var14];
                    var15--;
                    int var30 = this.field4254[var15];
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
            int[] var19 = this.field4254;
            this.field4254 = field4253;
            field4253 = var19;
        }
    }
}
