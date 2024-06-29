import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class207 extends class381 {

    @OriginalMember(owner = "client!iw", name = "l", descriptor = "I")
    public int field2817;

    @OriginalMember(owner = "client!iw", name = "m", descriptor = "I")
    private int field2818;

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "[I")
    private int[] field2814;

    @OriginalMember(owner = "client!iw", name = "j", descriptor = "I")
    public int field2815;

    @OriginalMember(owner = "client!iw", name = "k", descriptor = "Z")
    public boolean field2816;

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "[I")
    private static int[] field2813;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)V", line = 4)
    public final void method1327(int arg0, int arg1) {
        if (arg0 == 0 && arg1 == 0) {
            return;
        }
        if (field2813 == null || field2813.length != this.field2814.length) {
            field2813 = new int[this.field2814.length];
        }
        int var3 = this.field2814.length;
        int var4 = arg0;
        int var5 = this.field2818 - 1;
        int var6 = this.field2818 * arg1;
        int var7 = var3 - 1;
        for (int var8 = 0; var8 < var3; var8 += this.field2818) {
            int var10 = var6 + var8 & var7;
            for (int var11 = 0; var11 < this.field2818; var11++) {
                int var12 = var8 + var11;
                int var13 = (var4 + var11 & var5) + var10;
                field2813[var12] = this.field2814[var13];
            }
        }
        int[] var9 = this.field2814;
        this.field2814 = field2813;
        field2813 = var9;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "()[I", line = 50)
    public final int[] method1328() {
        return this.field2814;
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "()V", line = 56)
    public static void method1329() {
        field2813 = null;
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(II[IZ)V", line = 59)
    public class207(int arg0, int arg1, int[] arg2, boolean arg3) {
        this.field2817 = arg0;
        this.field2818 = arg1;
        this.field2814 = arg2;
        if (arg3) {
            int[] var5 = new int[this.field2818];
            int[] var6 = new int[this.field2818];
            int[] var7 = new int[this.field2818];
            if (field2813 == null || field2813.length < this.field2814.length) {
                field2813 = new int[this.field2814.length];
            }
            int var8 = this.field2818;
            int var9 = this.field2818;
            int var10 = var8 - 1;
            int var11 = var9 - 1;
            int var12 = var8 * var9;
            int var13 = var8;
            int var14 = var8;
            for (int var15 = 2; var15 >= 0; var15--) {
                for (int var32 = var10; var32 >= 0; var32--) {
                    var13--;
                    int var33 = this.field2814[var13];
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
                    field2813[var16] = var29 << 16 | var30 << 8 | var31;
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
                    int var27 = this.field2814[var13];
                    var14--;
                    int var28 = this.field2814[var14];
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
            int[] var18 = this.field2814;
            this.field2814 = field2813;
            field2813 = var18;
        }
    }
}
