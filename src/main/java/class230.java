import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class230 extends class766 {

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public int field3370;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    private int field3371;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "[I")
    private int[] field3373;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public int field3372;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "Z")
    public boolean field3374;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "[I")
    private static int[] field3369;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V", line = 5)
    public final void method1575(int arg0, int arg1) {
        if (arg0 == 0 && arg1 == 0) {
            return;
        }
        if (field3369 == null || field3369.length != this.field3373.length) {
            field3369 = new int[this.field3373.length];
        }
        int var3 = this.field3373.length;
        int var4 = arg0;
        int var5 = this.field3371 - 1;
        int var6 = this.field3371 * arg1;
        int var7 = var3 - 1;
        for (int var8 = 0; var8 < var3; var8 += this.field3371) {
            int var10 = var6 + var8 & var7;
            for (int var11 = 0; var11 < this.field3371; var11++) {
                int var12 = var8 + var11;
                int var13 = (var4 + var11 & var5) + var10;
                field3369[var12] = this.field3373[var13];
            }
        }
        int[] var9 = this.field3373;
        this.field3373 = field3369;
        field3369 = var9;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()V", line = 51)
    public static void method1576() {
        field3369 = null;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "()[I", line = 57)
    public final int[] method1577() {
        return this.field3373;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(II[IZ)V", line = 59)
    public class230(int arg0, int arg1, int[] arg2, boolean arg3) {
        this.field3370 = arg0;
        this.field3371 = arg1;
        this.field3373 = arg2;
        if (arg3) {
            int[] var5 = new int[this.field3371];
            int[] var6 = new int[this.field3371];
            int[] var7 = new int[this.field3371];
            int[] var8 = new int[this.field3371];
            if (field3369 == null || field3369.length != this.field3373.length) {
                field3369 = new int[this.field3373.length];
            }
            int var9 = this.field3371;
            int var10 = this.field3371;
            int var11 = var9 - 1;
            int var12 = var10 - 1;
            int var13 = var9 * var10;
            int var14 = var9;
            int var15 = var9;
            for (int var16 = 2; var16 >= 0; var16--) {
                for (int var35 = var11; var35 >= 0; var35--) {
                    var14--;
                    int var36 = this.field3373[var14];
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
                    field3369[var17] = var31 << 24 | var32 << 16 | var33 << 8 | var34;
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
                    int var29 = this.field3373[var14];
                    var15--;
                    int var30 = this.field3373[var15];
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
            int[] var19 = this.field3373;
            this.field3373 = field3369;
            field3369 = var19;
        }
    }
}
