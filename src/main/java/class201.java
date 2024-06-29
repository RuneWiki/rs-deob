import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class201 extends class349 {

    @OriginalMember(owner = "client!gfa", name = "K", descriptor = "I")
    private int field2638 = 1;

    @OriginalMember(owner = "client!gfa", name = "N", descriptor = "I")
    private int field2641 = 1;

    @OriginalMember(owner = "client!gfa", name = "L", descriptor = "[F")
    public static float[] field2639 = new float[4];

    @OriginalMember(owner = "client!gfa", name = "B", descriptor = "Lrh;")
    public static class59 field2631 = new class59();

    @OriginalMember(owner = "client!gfa", name = "O", descriptor = "I")
    public static int field2642 = 0;

    @OriginalMember(owner = "client!gfa", name = "D", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!gfa", name = "E", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!gfa", name = "G", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!gfa", name = "H", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!gfa", name = "I", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!gfa", name = "J", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!gfa", name = "M", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg0 != 4095) {
            field2639 = null;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field5100 = ~arg2.method957((byte) -122) == -2;
                }
            } else {
                this.field2641 = arg2.method957((byte) -91);
            }
        } else {
            this.field2638 = arg2.method957((byte) -66);
        }
        ++field2635;
    }

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "(I)V")
    public static void method1269(int arg0) {
        if (arg0 < 116) {
            method1270(-84);
        }
        field2639 = null;
        field2631 = null;
    }

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "(I)V")
    public static final void method1270(int arg0) {
        if (arg0 < -15) {
            ++field2634;
            class648.field9178.method306(-119);
            class168.field2093 = null;
            class369.field5301 = 1;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field2633;
        int[] var3 = super.field5109.method3088(arg1, (byte) 26);
        int var4 = -1 / ((56 - arg0) / 41);
        if (super.field5109.field7515) {
            int var5 = this.field2641 - -this.field2641 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field2638 + 1 + this.field2638;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            for (int var10 = -this.field2641 + arg1; var10 <= this.field2641 + arg1; ++var10) {
                int[] var14 = this.method2181(0, -1090477337, var10 & class4.field38);
                int[] var15 = new int[class39.field497];
                int var16 = 0;
                for (int var17 = -this.field2638; ~this.field2638 <= ~var17; ++var17) {
                    var16 += var14[var17 & class144.field1839];
                }
                int var18 = 0;
                while (~class39.field497 < ~var18) {
                    var15[var18] = var8 * var16 >> 16;
                    int var19 = var16 - var14[-this.field2638 + var18 & class144.field1839];
                    ++var18;
                    var16 = var14[class144.field1839 & var18 - -this.field2638] + var19;
                }
                var9[var10 - -this.field2641 + -arg1] = var15;
            }
            for (int var11 = 0; class39.field497 > var11; ++var11) {
                int var12 = 0;
                for (int var13 = 0; ~var13 > ~var5; ++var13) {
                    var12 += var9[var13][var11];
                }
                var3[var11] = var6 * var12 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IB)[[I")
    public final int[][] method9(int arg0, byte arg1) {
        int var3 = 49 / ((arg1 - -32) / 47);
        ++field2632;
        int[][] var4 = super.field5103.method2268(true, arg0);
        if (super.field5103.field5314) {
            int var5 = this.field2641 + 1 + this.field2641;
            int var6 = 65536 / var5;
            int var7 = this.field2638 + this.field2638 - -1;
            int var8 = 65536 / var7;
            int[][][] var9 = new int[var5][][];
            for (int var10 = -this.field2641 + arg0; ~(this.field2641 + arg0) <= ~var10; ++var10) {
                int[][] var20 = this.method2180(0, 98, class4.field38 & var10);
                int[][] var21 = new int[3][class39.field497];
                int var22 = 0;
                int var23 = 0;
                int var24 = 0;
                int[] var25 = var20[0];
                int[] var26 = var20[1];
                int[] var27 = var20[2];
                for (int var28 = -this.field2638; ~this.field2638 <= ~var28; ++var28) {
                    int var38 = class144.field1839 & var28;
                    var23 += var26[var38];
                    var22 += var25[var38];
                    var24 += var27[var38];
                }
                int[] var29 = var21[0];
                int[] var30 = var21[1];
                int[] var31 = var21[2];
                int var32 = 0;
                while (~var32 > ~class39.field497) {
                    var29[var32] = var8 * var22 >> 16;
                    var30[var32] = var8 * var23 >> 16;
                    var31[var32] = var8 * var24 >> 16;
                    int var33 = var32 - this.field2638 & class144.field1839;
                    ++var32;
                    int var34 = var24 - var27[var33];
                    int var35 = var22 - var25[var33];
                    int var36 = var23 - var26[var33];
                    int var37 = var32 - -this.field2638 & class144.field1839;
                    var24 = var27[var37] + var34;
                    var23 = var26[var37] + var36;
                    var22 = var25[var37] + var35;
                }
                var9[var10 - arg0 + this.field2641] = var21;
            }
            int[] var11 = var4[0];
            int[] var12 = var4[1];
            int[] var13 = var4[2];
            for (int var14 = 0; var14 < class39.field497; ++var14) {
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; var5 > var18; ++var18) {
                    int[][] var19 = var9[var18];
                    var16 += var19[1][var14];
                    var15 += var19[0][var14];
                    var17 += var19[2][var14];
                }
                var11[var14] = var6 * var15 >> 16;
                var12[var14] = var6 * var16 >> 16;
                var13[var14] = var6 * var17 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(II)V")
    public static final void method1271(int arg0, int arg1) {
        ++field2636;
        class19 var2 = class364.method2236(1248116640, arg0, arg1);
        var2.method104(10);
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "()V")
    public class201() {
        super(1, false);
    }
}
