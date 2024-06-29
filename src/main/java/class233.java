import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class233 extends class223 {

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "[Lfh;")
    public static class136[] field3682 = new class136[2048];

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public static int field3686 = 0;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "Lub;")
    public static class92 field3687;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "[[[I")
    public static int[][][] field3684;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        ++field3688;
        int[] var3 = super.field3588.method1611(0, arg1);
        if (arg0 <= 14) {
            return null;
        } else {
            if (super.field3588.field3722) {
                int[] var4 = this.method1533(0, arg1, -62);
                int[] var5 = this.method1533(1, arg1, -68);
                int[] var6 = this.method1533(2, arg1, -112);
                for (int var7 = 0; ~var7 > ~class250.field4008; ++var7) {
                    int var8 = var6[var7];
                    if (var8 == 4096) {
                        var3[var7] = var4[var7];
                    } else if (~var8 != -1) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)V")
    public static final void method1600(byte arg0) {
        ++field3681;
        class59.method487(class84.field1259, 0);
        int var1 = (class226.field3616 >> 10) + (class138.field2072 >> 3);
        int var2 = (class159.field2379 >> 3) + (class118.field1787 >> 10);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class7.field124 = new int[var6];
        class61.field960 = new int[var6];
        class121.field1833 = new int[var6];
        class27.field464 = new int[var6][4];
        class130.field1942 = new byte[var6][];
        class268.field4248 = new byte[var6][];
        class234.field3693 = new int[var6];
        class274.field4370 = new int[var6];
        class82.field1243 = new byte[var6][];
        class174.field2691 = new int[var6];
        int var7 = 0;
        int var8 = 124 % ((arg0 - -40) / 47);
        for (int var9 = (var1 + -6) / 8; (var1 + 6) / 8 >= var9; ++var9) {
            for (int var11 = (var2 + -6) / 8; ~var11 >= ~((var2 + 6) / 8); ++var11) {
                int var12 = (var9 << 8) + var11;
                class174.field2691[var7] = var12;
                class274.field4370[var7] = class274.field4369.method717(104, "m" + var9 + "_" + var11);
                class61.field960[var7] = class274.field4369.method717(104, "l" + var9 + "_" + var11);
                class234.field3693[var7] = class274.field4369.method717(104, "n" + var9 + "_" + var11);
                class121.field1833[var7] = class274.field4369.method717(104, "um" + var9 + "_" + var11);
                class7.field124[var7] = class274.field4369.method717(104, "ul" + var9 + "_" + var11);
                if (~class234.field3693[var7] == 0) {
                    class274.field4370[var7] = -1;
                    class61.field960[var7] = -1;
                    class121.field1833[var7] = -1;
                    class7.field124[var7] = -1;
                }
                ++var7;
            }
        }
        for (int var10 = var7; ~class234.field3693.length < ~var10; ++var10) {
            class234.field3693[var10] = -1;
            class274.field4370[var10] = -1;
            class61.field960[var10] = -1;
            class121.field1833[var10] = -1;
            class7.field124[var10] = -1;
        }
        class207.method1450(false, var3, var1, true, var5, var2, var4, true);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        ++field3683;
        int[][] var3 = super.field3572.method1818(arg1, false);
        if (arg0 < 0) {
            field3687 = null;
        }
        if (super.field3572.field4257) {
            int[] var4 = this.method1533(2, arg1, -114);
            int[][] var5 = this.method1534(false, 0, arg1);
            int[][] var6 = this.method1534(false, 1, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var6[2];
            int[] var13 = var6[0];
            int[] var14 = var5[2];
            int[] var15 = var6[1];
            for (int var16 = 0; var16 < class250.field4008; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (~var17 != -1) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var9[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                        var8[var16] = var12[var16] * var18 + var14[var16] * var17 >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var9[var16] = var15[var16];
                        var8[var16] = var12[var16];
                    }
                } else {
                    var7[var16] = var10[var16];
                    var9[var16] = var11[var16];
                    var8[var16] = var14[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg2 != 102) {
            field3684 = null;
        }
        ++field3685;
        if (arg1 == 0) {
            super.field3583 = ~arg0.method265(arg2 ^ -17) == -2;
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class233() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(B)V")
    public static void method1601(byte arg0) {
        field3687 = null;
        field3682 = null;
        if (arg0 >= -50) {
            method1601((byte) 19);
        }
        field3684 = null;
    }
}
