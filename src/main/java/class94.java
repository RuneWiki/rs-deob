import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class94 extends class23 {

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    private int field1754 = 1;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
    private int field1759 = 1;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        ++field1753;
        int[] var3 = super.field379.method1080(false, arg0);
        if (arg1 <= 19) {
            method675(-83, (class46) null);
        }
        if (super.field379.field3100) {
            int var4 = this.field1754 - -this.field1754 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field1759 + this.field1759 + 1;
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var6;
            for (int var9 = -this.field1754 + arg0; arg0 - -this.field1754 >= var9; ++var9) {
                int[] var13 = this.method120(class220.field4160 & var9, false, 0);
                int[] var14 = new int[class70.field1276];
                int var15 = 0;
                for (int var16 = -this.field1759; ~var16 >= ~this.field1759; ++var16) {
                    var15 += var13[class45.field789 & var16];
                }
                int var17 = 0;
                while (class70.field1276 > var17) {
                    var14[var17] = var8 * var15 >> 16;
                    int var18 = var15 - var13[-this.field1759 + var17 & class45.field789];
                    ++var17;
                    var15 = var13[class45.field789 & this.field1759 + var17] + var18;
                }
                var7[this.field1754 + var9 + -arg0] = var14;
            }
            for (int var10 = 0; ~var10 > ~class70.field1276; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var7[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILea;)Lc;")
    public static final class23 method675(int arg0, class46 arg1) {
        arg1.method347(arg0 + 26119);
        ++field1756;
        int var2 = arg1.method347(26119);
        class23 var3 = class233.method1554(var2, (byte) 16);
        var3.field363 = arg1.method347(26119);
        int var4 = arg1.method347(26119);
        for (int var5 = arg0; var4 > var5; ++var5) {
            int var6 = arg1.method347(arg0 ^ 26119);
            var3.method11(arg1, arg0 ^ -3, var6);
        }
        var3.method123((byte) -69);
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg1 != -3) {
            this.field1759 = 73;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field369 = ~arg0.method347(arg1 + 26122) == -2;
                }
            } else {
                this.field1754 = arg0.method347(26119);
            }
        } else {
            this.field1759 = arg0.method347(26119);
        }
        ++field1758;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIILnc;JLnc;Lnc;)V")
    public static final void method676(int arg0, int arg1, int arg2, int arg3, class145 arg4, long arg5, class145 arg6, class145 arg7) {
        class239 var9 = new class239();
        var9.field4445 = arg4;
        var9.field4453 = arg1 * 128 + 64;
        var9.field4441 = arg2 * 128 + 64;
        var9.field4446 = arg3;
        var9.field4442 = arg5;
        var9.field4448 = arg6;
        var9.field4450 = arg7;
        int var10 = 0;
        class52 var11 = class29.field489[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field962; ++var12) {
                class108 var13 = var11.field963[var12];
                if ((var13.field1950 & 4194304L) == 4194304L) {
                    int var14 = var13.field1945.method88();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field4437 = -var10;
        if (class29.field489[arg0][arg1][arg2] == null) {
            class29.field489[arg0][arg1][arg2] = new class52(arg0, arg1, arg2);
        }
        class29.field489[arg0][arg1][arg2].field948 = var9;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        ++field1755;
        int[][] var3 = super.field364.method1541(true, arg0);
        if (arg1 != 13) {
            this.field1754 = 83;
        }
        if (super.field364.field4312) {
            int var4 = this.field1754 + this.field1754 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field1759 - -this.field1759 + 1;
            int[][][] var7 = new int[var4][][];
            int var8 = 65536 / var6;
            for (int var9 = -this.field1754 + arg0; this.field1754 + arg0 >= var9; ++var9) {
                int var19 = 0;
                int var20 = 0;
                int[][] var21 = this.method121(0, (byte) -110, class220.field4160 & var9);
                int var22 = 0;
                int[][] var23 = new int[3][class70.field1276];
                int[] var24 = var21[0];
                int[] var25 = var21[1];
                int[] var26 = var21[2];
                for (int var27 = -this.field1759; ~this.field1759 <= ~var27; ++var27) {
                    int var37 = var27 & class45.field789;
                    var20 += var26[var37];
                    var22 += var24[var37];
                    var19 += var25[var37];
                }
                int[] var28 = var23[1];
                int[] var29 = var23[0];
                int[] var30 = var23[2];
                int var31 = 0;
                while (~class70.field1276 < ~var31) {
                    var29[var31] = var8 * var22 >> 16;
                    var28[var31] = var8 * var19 >> 16;
                    var30[var31] = var8 * var20 >> 16;
                    int var32 = -this.field1759 + var31 & class45.field789;
                    int var33 = var22 - var24[var32];
                    int var34 = var19 - var25[var32];
                    int var35 = var20 - var26[var32];
                    ++var31;
                    int var36 = class45.field789 & this.field1759 + var31;
                    var20 = var26[var36] + var35;
                    var22 = var24[var36] + var33;
                    var19 = var25[var36] + var34;
                }
                var7[this.field1754 + var9 + -arg0] = var23;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class70.field1276; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var7[var17];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    public class94() {
        super(1, false);
    }
}
