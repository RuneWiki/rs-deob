import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class661 extends class214 {

    @OriginalMember(owner = "client!dw", name = "G", descriptor = "I")
    private int field9414 = 1;

    @OriginalMember(owner = "client!dw", name = "H", descriptor = "I")
    private int field9415 = 1;

    @OriginalMember(owner = "client!dw", name = "I", descriptor = "I")
    public static int field9416 = 0;

    @OriginalMember(owner = "client!dw", name = "D", descriptor = "I")
    public static int field9411;

    @OriginalMember(owner = "client!dw", name = "E", descriptor = "I")
    public static int field9412;

    @OriginalMember(owner = "client!dw", name = "F", descriptor = "I")
    public static int field9413;

    @OriginalMember(owner = "client!dw", name = "J", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!dw", name = "K", descriptor = "I")
    public static int field9418;

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V", line = 7)
    public class661() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILofa;I)V", line = 14)
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg0 >= 92) {
            ++field9418;
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        super.field3540 = ~arg1.method1987(-67) == -2;
                    }
                } else {
                    this.field9415 = arg1.method1987(-119);
                }
            } else {
                this.field9414 = arg1.method1987(-72);
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IB)[I", line = 59)
    public final int[] method64(int arg0, byte arg1) {
        ++field9417;
        int[] var3 = super.field3544.method3869(arg0, -126);
        if (arg1 != 5) {
            this.field9415 = 114;
        }
        if (super.field3544.field9836) {
            int var4 = this.field9415 + this.field9415 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field9414 + this.field9414 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field9415 + arg0; var9 <= this.field9415 + arg0; ++var9) {
                int[] var13 = this.method1545(class580.field8203 & var9, 0, -1);
                int[] var14 = new int[class626.field8787];
                int var15 = 0;
                for (int var16 = -this.field9414; var16 <= this.field9414; ++var16) {
                    var15 += var13[var16 & class245.field3948];
                }
                int var17 = 0;
                while (var17 < class626.field8787) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class245.field3948 & var17 - this.field9414];
                    ++var17;
                    var15 = var13[class245.field3948 & var17 - -this.field9414] + var18;
                }
                var8[this.field9415 + var9 + -arg0] = var14;
            }
            for (int var10 = 0; ~var10 > ~class626.field8787; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(II)[[I", line = 146)
    public final int[][] method62(int arg0, int arg1) {
        ++field9412;
        if (arg1 != -256) {
            this.method59(-46, (class301) null, 4);
        }
        int[][] var3 = super.field3545.method2996((byte) 122, arg0);
        if (super.field3545.field7147) {
            int var4 = this.field9415 - -this.field9415 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field9414 + 1 - -this.field9414;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field9415 + arg0; this.field9415 + arg0 >= var9; ++var9) {
                int[][] var19 = this.method1539(true, 0, var9 & class580.field8203);
                int[][] var20 = new int[3][class626.field8787];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field9414; ~this.field9414 <= ~var27; ++var27) {
                    int var37 = var27 & class245.field3948;
                    var21 += var24[var37];
                    var23 += var26[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class626.field8787 > var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field9414 + var31 & class245.field3948;
                    int var33 = var22 - var25[var32];
                    int var34 = var23 - var26[var32];
                    ++var31;
                    int var35 = var21 - var24[var32];
                    int var36 = var31 - -this.field9414 & class245.field3948;
                    var22 = var25[var36] + var33;
                    var21 = var24[var36] + var35;
                    var23 = var26[var36] + var34;
                }
                var8[-arg0 + this.field9415 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class626.field8787; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
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

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "(I)V", line = 284)
    public static final void method3721(int arg0) {
        class654.field9289.method2292(66, 1, class654.field9289.field5403);
        ++field9413;
        class654.field9289.method2292(-86, arg0, class654.field9289.field5453);
        class654.field9289.method2292(-60, 2, class654.field9289.field5444);
        class654.field9289.method2292(100, 2, class654.field9289.field5404);
        class654.field9289.method2292(-105, 1, class654.field9289.field5433);
        class654.field9289.method2292(-46, 1, class654.field9289.field5427);
        class654.field9289.method2292(arg0 ^ 123, 1, class654.field9289.field5434);
        class654.field9289.method2292(-82, 1, class654.field9289.field5438);
        class654.field9289.method2292(arg0 ^ 94, 1, class654.field9289.field5445);
        class654.field9289.method2292(68, 1, class654.field9289.field5448);
        class654.field9289.method2292(arg0 + 100, 2, class654.field9289.field5431);
        class654.field9289.method2292(-90, 1, class654.field9289.field5447);
        class654.field9289.method2292(-51, 2, class654.field9289.field5440);
        class654.field9289.method2292(arg0 + 116, 1, class654.field9289.field5436);
        class654.field9289.method2292(arg0 + -120, 0, class654.field9289.field5412);
        class654.field9289.method2292(-38, 0, class654.field9289.field5417);
        class654.field9289.method2292(86, 2, class654.field9289.field5441);
        class654.field9289.method2292(arg0 + 119, 0, class654.field9289.field5422);
        class654.field9289.method2292(126, 0, class654.field9289.field5429);
        class298.method1916(arg0 + -118);
        class654.field9289.method2292(-47, 0, class654.field9289.field5407);
        class654.field9289.method2292(122, 4, class654.field9289.field5443);
        class710.method3930((byte) 41);
        class525.method3121(-11701);
        class515.field7466 = true;
    }
}
