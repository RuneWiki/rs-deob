import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class535 extends class330 {

    @OriginalMember(owner = "client!vda", name = "H", descriptor = "I")
    private int field7402 = 1;

    @OriginalMember(owner = "client!vda", name = "L", descriptor = "I")
    private int field7406 = 1;

    @OriginalMember(owner = "client!vda", name = "F", descriptor = "I")
    public static int field7400 = -1;

    @OriginalMember(owner = "client!vda", name = "C", descriptor = "Ljn;")
    public static class134 field7397 = new class134(31, 4);

    @OriginalMember(owner = "client!vda", name = "M", descriptor = "[I")
    public static int[] field7407 = new int[1000];

    @OriginalMember(owner = "client!vda", name = "D", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!vda", name = "E", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!vda", name = "G", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!vda", name = "I", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!vda", name = "J", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!vda", name = "K", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!vda", name = "N", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIIZI)V", line = 5)
    public static final void method3178(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field7401;
        class32.field309 = arg2;
        class685.field9575 = arg3;
        class383.field5490 = arg6;
        class262.field3838 = arg0;
        int var7 = -6 % ((arg1 - 70) / 39);
        class350.field5094 = arg4;
        if (arg5 && class262.field3838 >= 100) {
            class412.field5779 = class383.field5490 * 512 + 256;
            class497.field6818 = class350.field5094 * 512 + 256;
            class479.field6645 = class373.method2316(class497.field6818, class435.field6040, class412.field5779, 110) - class32.field309;
        }
        class362.field5225 = -1;
        class5.field30 = -1;
        class695.field9691 = 2;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V", line = 33)
    public static void method3179(int arg0) {
        field7397 = null;
        if (arg0 != 1) {
            field7400 = -4;
        }
        field7407 = null;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IZ)[I", line = 48)
    public final int[] method464(int arg0, boolean arg1) {
        ++field7399;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (arg1) {
            method3179(-85);
        }
        if (super.field4630.field5704) {
            int var4 = this.field7406 - -this.field7406 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field7402 - -this.field7402 - -1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field7406 + arg0; this.field7406 + arg0 >= var9; ++var9) {
                int[] var13 = this.method2084(0, var9 & class385.field5505, (byte) 56);
                int[] var14 = new int[class80.field901];
                int var15 = 0;
                for (int var16 = -this.field7402; ~var16 >= ~this.field7402; ++var16) {
                    var15 += var13[class639.field8988 & var16];
                }
                int var17 = 0;
                while (~class80.field901 < ~var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field7402 + var17 & class639.field8988];
                    ++var17;
                    var15 = var13[this.field7402 + var17 & class639.field8988] + var18;
                }
                var8[var9 - -this.field7406 - arg0] = var14;
            }
            for (int var10 = 0; ~var10 > ~class80.field901; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljava/lang/String;II)Z", line = 135)
    public static final boolean method3180(String arg0, int arg1, int arg2) {
        ++field7404;
        if (class129.field1674.field10576) {
            class735.field10134 = new class589();
            class735.field10134.field8306 = arg2;
            class735.field10134.field8299 = arg0;
            if (class425.field5937 != class224.field3414) {
                class735.field10134.field8310 = class735.field10134.field8306 + 40000;
                class735.field10134.field8302 = 50000 - -class735.field10134.field8306;
            }
            for (int var3 = 0; ~class254.field3765.length < ~var3; ++var3) {
                if (~class254.field3765[var3].field1767 == ~arg2) {
                    class291.field4283 = class254.field3765[var3].field2275;
                }
            }
            return true;
        } else {
            String var4 = "";
            if (class425.field5937 != class224.field3414) {
                var4 = ":" + (arg2 + 7000);
            }
            String var5 = "";
            if (class704.field9801 != null) {
                var5 = "/p=" + class704.field9801;
            }
            int var6 = -42 / ((-57 - arg1) / 39);
            String var7 = "http://" + arg0 + var4 + "/l=" + class553.field7667 + "/a=" + class718.field9946 + var5 + "/j" + (!class359.field5181 ? "0" : "1") + ",o" + (class736.field10137 ? "1" : "0") + ",a2";
            try {
                class274.field3958.getAppletContext().showDocument(new URL(var7), "_self");
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIIII)V", line = 187)
    public static final void method3181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7405;
        int var7 = arg3 + arg5;
        if (arg4 != 816931216) {
            field7400 = 35;
        }
        int var8 = -arg5 + arg1;
        for (int var9 = arg3; ~var7 < ~var9; ++var9) {
            class128.method883(arg6, arg0, arg2, class705.field9804[var9], 7);
        }
        for (int var10 = arg1; var10 > var8; --var10) {
            class128.method883(arg6, arg0, arg2, class705.field9804[var10], 7);
        }
        int var11 = arg0 - -arg5;
        int var12 = arg2 - arg5;
        for (int var13 = var7; ~var13 >= ~var8; ++var13) {
            int[] var14 = class705.field9804[var13];
            class128.method883(arg6, arg0, var11, var14, arg4 + -816931209);
            class128.method883(arg6, var12, arg2, var14, 7);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)[[I", line = 237)
    public final int[][] method537(int arg0, int arg1) {
        ++field7408;
        if (arg0 != 0) {
            this.method464(9, true);
        }
        int[][] var3 = super.field4621.method1597(arg1, true);
        if (super.field4621.field3510) {
            int var4 = this.field7406 + 1 - -this.field7406;
            int var5 = 65536 / var4;
            int var6 = this.field7402 + this.field7402 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field7406 + arg1; this.field7406 + arg1 >= var9; ++var9) {
                int[][] var19 = this.method2082(var9 & class385.field5505, 0, 124);
                int[][] var20 = new int[3][class80.field901];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field7402; this.field7402 >= var27; ++var27) {
                    int var37 = var27 & class639.field8988;
                    var23 += var26[var37];
                    var22 += var25[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class80.field901) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field7402 + var31 & class639.field8988;
                    ++var31;
                    int var33 = var22 - var25[var32];
                    int var34 = var23 - var26[var32];
                    int var35 = var21 - var24[var32];
                    int var36 = this.field7402 + var31 & class639.field8988;
                    var21 = var24[var36] + var35;
                    var22 = var25[var36] + var33;
                    var23 = var26[var36] + var34;
                }
                var8[this.field7406 + var9 + -arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class80.field901 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "()V", line = 422)
    public class535() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lgga;IB)V", line = 380)
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field7403;
        int var4 = -14 % ((arg2 - -41) / 42);
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field4636 = ~arg0.method3013(-99) == -2;
                }
            } else {
                this.field7406 = arg0.method3013(-120);
            }
        } else {
            this.field7402 = arg0.method3013(113);
        }
    }
}
