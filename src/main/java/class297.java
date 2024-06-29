import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class297 extends class642 {

    @OriginalMember(owner = "client!uba", name = "D", descriptor = "I")
    private int field4371 = 1;

    @OriginalMember(owner = "client!uba", name = "E", descriptor = "I")
    private int field4372 = 1;

    @OriginalMember(owner = "client!uba", name = "I", descriptor = "I")
    public static int field4376 = 0;

    @OriginalMember(owner = "client!uba", name = "F", descriptor = "Z")
    public static volatile boolean field4373 = true;

    @OriginalMember(owner = "client!uba", name = "B", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!uba", name = "G", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!uba", name = "H", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!uba", name = "J", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!uba", name = "C", descriptor = "[[[Z")
    public static boolean[][][] field4370;

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "()V", line = 7)
    public class297() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(B)V", line = 11)
    public static void method1853(byte arg0) {
        if (arg0 != -27) {
            field4376 = -107;
        }
        field4370 = null;
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(II)[I", line = 35)
    public final int[] method3(int arg0, int arg1) {
        ++field4369;
        int[] var3 = super.field9216.method1185(arg0, -105);
        if (arg1 != -9) {
            return null;
        } else {
            if (super.field9216.field2418) {
                int var4 = this.field4371 + 1 + this.field4371;
                int var5 = 65536 / var4;
                int var6 = this.field4372 + this.field4372 + 1;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field4371 + arg0; ~var9 >= ~(this.field4371 + arg0); ++var9) {
                    int[] var13 = this.method3658((byte) 97, var9 & class553.field8133, 0);
                    int[] var14 = new int[class338.field4909];
                    int var15 = 0;
                    for (int var16 = -this.field4372; ~var16 >= ~this.field4372; ++var16) {
                        var15 += var13[var16 & class412.field6121];
                    }
                    int var17 = 0;
                    while (~var17 > ~class338.field4909) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[class412.field6121 & -this.field4372 + var17];
                        ++var17;
                        var15 = var13[this.field4372 + var17 & class412.field6121] + var18;
                    }
                    var8[var9 - -this.field4371 + -arg0] = var14;
                }
                for (int var10 = 0; class338.field4909 > var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; var12 < var4; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILgk;B)V", line = 128)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field9207 = ~arg1.method3115(29871) == -2;
                }
            } else {
                this.field4371 = arg1.method3115(29871);
            }
        } else {
            this.field4372 = arg1.method3115(29871);
        }
        ++field4377;
        if (arg2 < 29) {
            this.field4371 = -10;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)[[I", line = 172)
    public final int[][] method138(int arg0, int arg1) {
        ++field4374;
        int[][] var3 = super.field9211.method1068(arg0 ^ arg0, arg1);
        if (super.field9211.field2131) {
            int var4 = this.field4371 + this.field4371 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field4372 + 1 + this.field4372;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field4371 + arg1; arg1 - -this.field4371 >= var9; ++var9) {
                int[][] var19 = this.method3657(class553.field8133 & var9, true, 0);
                int[][] var20 = new int[3][class338.field4909];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field4372; this.field4372 >= var27; ++var27) {
                    int var37 = var27 & class412.field6121;
                    var21 += var24[var37];
                    var22 += var25[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~var31 > ~class338.field4909) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = var31 - this.field4372 & class412.field6121;
                    ++var31;
                    int var33 = var23 - var26[var32];
                    int var34 = var22 - var25[var32];
                    int var35 = var21 - var24[var32];
                    int var36 = class412.field6121 & this.field4372 + var31;
                    var21 = var24[var36] + var35;
                    var23 = var26[var36] + var33;
                    var22 = var25[var36] + var34;
                }
                var8[this.field4371 + var9 + -arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class338.field4909; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
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
}
