import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class202 extends class34 {

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
    private int field2925 = 1;

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "I")
    private int field2927 = 1;

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "Lkc;")
    public static class157 field2926 = new class157("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "I")
    public static int field2931 = 0;

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "Lkc;")
    public static class157 field2930 = new class157("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!dn", name = "L", descriptor = "Lkc;")
    public static class157 field2932 = new class157("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V", line = 12)
    public class202() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)[I", line = 16)
    public final int[] method64(int arg0, byte arg1) {
        ++field2924;
        int var3 = -119 / (arg1 / 50);
        int[] var4 = super.field537.method1780(arg0, (byte) 76);
        if (super.field537.field4191) {
            int var5 = this.field2925 + this.field2925 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field2927 - (-this.field2927 + -1);
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            for (int var10 = -this.field2925 + arg0; this.field2925 + arg0 >= var10; ++var10) {
                int[] var14 = this.method252(false, class343.field4968 & var10, 0);
                int[] var15 = new int[class383.field5502];
                int var16 = 0;
                for (int var17 = -this.field2927; this.field2927 >= var17; ++var17) {
                    var16 += var14[class120.field1872 & var17];
                }
                int var18 = 0;
                while (~var18 > ~class383.field5502) {
                    var15[var18] = var8 * var16 >> 16;
                    int var19 = var16 - var14[class120.field1872 & var18 - this.field2927];
                    ++var18;
                    var16 = var14[class120.field1872 & this.field2927 + var18] + var19;
                }
                var9[var10 - -this.field2925 - arg0] = var15;
            }
            for (int var11 = 0; var11 < class383.field5502; ++var11) {
                int var12 = 0;
                for (int var13 = 0; var13 < var5; ++var13) {
                    var12 += var9[var13][var11];
                }
                var4[var11] = var6 * var12 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)[[I", line = 104)
    public final int[][] method66(byte arg0, int arg1) {
        if (arg0 != -11) {
            field2930 = null;
        }
        ++field2928;
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (super.field536.field726) {
            int var4 = this.field2925 + 1 + this.field2925;
            int var5 = 65536 / var4;
            int var6 = this.field2927 + this.field2927 - -1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field2925 + arg1; arg1 - -this.field2925 >= var9; ++var9) {
                int[][] var19 = this.method254(0, 0, var9 & class343.field4968);
                int[][] var20 = new int[3][class383.field5502];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field2927; this.field2927 >= var27; ++var27) {
                    int var37 = class120.field1872 & var27;
                    var22 += var25[var37];
                    var23 += var26[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class383.field5502 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class120.field1872 & -this.field2927 + var31;
                    int var33 = var21 - var24[var32];
                    ++var31;
                    int var34 = var22 - var25[var32];
                    int var35 = var23 - var26[var32];
                    int var36 = class120.field1872 & this.field2927 + var31;
                    var22 = var25[var36] + var34;
                    var21 = var24[var36] + var33;
                    var23 = var26[var36] + var35;
                }
                var8[this.field2925 + var9 + -arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class383.field5502; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lsv;II)V", line = 236)
    public final void method69(class319 arg0, int arg1, int arg2) {
        ++field2929;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field533 = ~arg0.method1869(-92) == -2;
                }
            } else {
                this.field2925 = arg0.method1869(-95);
            }
        } else {
            this.field2927 = arg0.method1869(-85);
        }
        if (arg1 < 16) {
            field2931 = 20;
        }
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)V", line = 295)
    public static void method1309(int arg0) {
        field2926 = null;
        field2930 = null;
        if (arg0 != 716) {
            field2932 = null;
        }
        field2932 = null;
    }
}
