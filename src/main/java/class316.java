import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class316 extends class376 {

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public int field4361;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    private int field4358;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "[I")
    private int[] field4356;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public int field4359;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "Z")
    public boolean field4360;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "[I")
    private static int[] field4357;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()[I", line = 4)
    public final int[] method2013() {
        return this.field4356;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "()V", line = 11)
    public static void method2014() {
        field4357 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V", line = 14)
    public final void method2015(int arg0, int arg1) {
        if (arg0 == 0 && arg1 == 0) {
            return;
        }
        if (field4357 == null || field4357.length < this.field4356.length) {
            field4357 = new int[this.field4356.length];
        }
        int var3 = this.field4356.length;
        int var4 = arg0;
        int var5 = this.field4358 - 1;
        int var6 = this.field4358 * arg1;
        int var7 = var3 - 1;
        for (int var8 = 0; var8 < var3; var8 += this.field4358) {
            int var10 = var6 + var8 & var7;
            for (int var11 = 0; var11 < this.field4358; var11++) {
                int var12 = var8 + var11;
                int var13 = (var4 + var11 & var5) + var10;
                field4357[var12] = this.field4356[var13];
            }
        }
        int[] var9 = this.field4356;
        this.field4356 = field4357;
        field4357 = var9;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(II[IZ)V", line = 59)
    public class316(int arg0, int arg1, int[] arg2, boolean arg3) {
        this.field4361 = arg0;
        this.field4358 = arg1;
        this.field4356 = arg2;
        if (arg3) {
            int[] var5 = new int[this.field4358];
            int[] var6 = new int[this.field4358];
            int[] var7 = new int[this.field4358];
            if (field4357 == null || field4357.length < this.field4356.length) {
                field4357 = new int[this.field4356.length];
            }
            int var8 = this.field4358;
            int var9 = this.field4358;
            int var10 = var8 - 1;
            int var11 = var9 - 1;
            int var12 = var8 * var9;
            int var13 = var8;
            int var14 = var8;
            for (int var15 = 2; var15 >= 0; var15--) {
                for (int var32 = var10; var32 >= 0; var32--) {
                    var13--;
                    int var33 = this.field4356[var13];
                    var5[var32] += var33 >> 16 & 0xFF;
                    var6[var32] += var33 >> 8 & 0xFF;
                    var7[var32] += var33 & 0xFF;
                }
                if (var13 == 0) {
                    var13 = var12;
                }
            }
            int var16 = var12;
            for (int var17 = var11; var17 >= 0; var17--) {
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
                        var20 = var8;
                    }
                }
                for (int var25 = var10; var25 >= 0; var25--) {
                    var20--;
                    var19--;
                    int var29 = var23 / 9;
                    int var30 = var21 / 9;
                    int var31 = var22 / 9;
                    var16--;
                    field4357[var16] = var29 << 16 | var30 << 8 | var31;
                    var23 += var5[var20] - var5[var19];
                    var22 += var7[var20] - var7[var19];
                    var21 += var6[var20] - var6[var19];
                    if (var20 == 0) {
                        var20 = var8;
                    }
                    if (var19 == 0) {
                        var19 = var8;
                    }
                }
                for (int var26 = var10; var26 >= 0; var26--) {
                    var13--;
                    int var27 = this.field4356[var13];
                    var14--;
                    int var28 = this.field4356[var14];
                    var5[var26] += (var27 >> 16 & 0xFF) - (var28 >> 16 & 0xFF);
                    var6[var26] += (var27 >> 8 & 0xFF) - (var28 >> 8 & 0xFF);
                    var7[var26] += (var27 & 0xFF) - (var28 & 0xFF);
                }
                if (var13 == 0) {
                    var13 = var12;
                }
                if (var14 == 0) {
                    var14 = var12;
                }
            }
            int[] var18 = this.field4356;
            this.field4356 = field4357;
            field4357 = var18;
        }
    }
}
