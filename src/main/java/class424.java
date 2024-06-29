import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class424 extends class38 {

    @OriginalMember(owner = "client!un", name = "F", descriptor = "Z")
    public static boolean field6300 = false;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "[[I")
    public static int[][] field6303 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!un", name = "L", descriptor = "[I")
    public static int[] field6305 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!un", name = "M", descriptor = "Lqe;")
    public static class469 field6306 = new class469(1, 10);

    @OriginalMember(owner = "client!un", name = "D", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!un", name = "G", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!un", name = "I", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[[I")
    public final int[][] method196(int arg0, int arg1) {
        ++field6302;
        if (arg0 != -18210) {
            this.method199((byte) -114, 54);
        }
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (super.field387.field6792) {
            int[] var4 = this.method189(arg1, 2, (byte) -92);
            int[][] var5 = this.method195(true, 0, arg1);
            int[][] var6 = this.method195(true, 1, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class729.field10216 > var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (var17 != 0) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IILrg;)V")
    public final void method190(int arg0, int arg1, class645 arg2) {
        if (arg1 == 0) {
            super.field388 = ~arg2.method3745(-6314) == -2;
        }
        if (arg0 <= 34) {
            this.method196(-76, 114);
        }
        ++field6299;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
    public static void method2654(int arg0) {
        field6305 = null;
        if (arg0 != 1) {
            method2654(2);
        }
        field6306 = null;
        field6303 = null;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
    public class424() {
        super(3, false);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(CI)Z")
    public static final boolean method2655(char arg0, int arg1) {
        if (arg1 != 4) {
            return true;
        } else {
            ++field6304;
            return ~arg0 <= -66 && arg0 <= 'Z' || ~arg0 <= -98 && arg0 <= 'z';
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        if (arg0 > -43) {
            field6303 = null;
        }
        ++field6301;
        int[] var3 = super.field397.method1376(arg1, (byte) -47);
        if (super.field397.field3005) {
            int[] var4 = this.method189(arg1, 0, (byte) -92);
            int[] var5 = this.method189(arg1, 1, (byte) -92);
            int[] var6 = this.method189(arg1, 2, (byte) -92);
            for (int var7 = 0; ~class729.field10216 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 != 0) {
                    var3[var7] = var4[var7] * var8 - -((4096 - var8) * var5[var7]) >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return var3;
    }
}
