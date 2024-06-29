import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class171 extends class45 {

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    private int field2643 = 1;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    private int field2645 = 1;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "Llu;")
    public static class500 field2646;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "Ljv;")
    public static class55 field2647;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2649;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "Z")
    public static boolean field2648;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
    public static void method1249(int arg0) {
        field2646 = null;
        field2649 = null;
        field2647 = null;
        if (arg0 != -1424070544) {
            method1249(-36);
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class171() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        ++field2642;
        if (arg1 != -26471) {
            field2646 = null;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field844 = ~arg0.method1063((byte) 111) == -2;
                }
            } else {
                this.field2645 = arg0.method1063((byte) 111);
            }
        } else {
            this.field2643 = arg0.method1063((byte) 118);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)[[I")
    public final int[][] method49(int arg0, int arg1) {
        ++field2641;
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (super.field833.field1888) {
            int var4 = this.field2645 + this.field2645 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field2643 + this.field2643 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg1 - this.field2645; arg1 - -this.field2645 >= var9; ++var9) {
                int[][] var19 = this.method437(0, var9 & class506.field7463, 102);
                int[][] var20 = new int[3][class259.field3768];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field2643; ~var27 >= ~this.field2643; ++var27) {
                    int var37 = var27 & class290.field4128;
                    var21 += var24[var37];
                    var23 += var26[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class259.field3768 > var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field2643 + var31 & class290.field4128;
                    ++var31;
                    int var33 = var23 - var26[var32];
                    int var34 = var22 - var25[var32];
                    int var35 = var21 - var24[var32];
                    int var36 = var31 - -this.field2643 & class290.field4128;
                    var23 = var26[var36] + var33;
                    var21 = var24[var36] + var35;
                    var22 = var25[var36] + var34;
                }
                var8[this.field2645 + var9 - arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class259.field3768; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        if (arg0 != 8) {
            method1249(25);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field2644;
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field854.method863((byte) 12, arg1);
            if (super.field854.field1928) {
                int var4 = this.field2645 + this.field2645 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field2643 + this.field2643 - -1;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field2645 + arg1; var9 <= this.field2645 + arg1; ++var9) {
                    int[] var13 = this.method434(0, class506.field7463 & var9, arg0 + 116);
                    int[] var14 = new int[class259.field3768];
                    int var15 = 0;
                    for (int var16 = -this.field2643; ~var16 >= ~this.field2643; ++var16) {
                        var15 += var13[var16 & class290.field4128];
                    }
                    int var17 = 0;
                    while (var17 < class259.field3768) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[-this.field2643 + var17 & class290.field4128];
                        ++var17;
                        var15 = var13[class290.field4128 & this.field2643 + var17] + var18;
                    }
                    var8[-arg1 + var9 + this.field2645] = var14;
                }
                for (int var10 = 0; ~class259.field3768 < ~var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; ~var12 > ~var4; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    static {
        new class342(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        new class342("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field2646 = class179.method1268(true);
        field2647 = new class55(8);
    }
}
