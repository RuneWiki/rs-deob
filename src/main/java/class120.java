import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class120 extends class12 {

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    public static int field2158 = -1;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "Ltg;")
    public static class184 field2164 = class135.method812("(U1", 3);

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "Ltg;")
    private static class184 field2157 = class135.method812("No response from server)3", 3);

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "Ltg;")
    public static class184 field2156 = field2157;

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "Ltg;")
    public static class184 field2166 = class135.method812("rect_debug=", 3);

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "[Z")
    public static boolean[] field2163 = new boolean[112];

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "Z")
    public static boolean field2167;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "[Loe;")
    public static class137[] field2159;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)V")
    public static final void method724(byte arg0, int arg1) {
        class149.field2678 = false;
        ++field2161;
        class101.field1875 = 1;
        class111.field2011 = -1;
        class113.field2045 = arg1;
        class122.field2177 = null;
        class209.field4006 = -1;
        class175.field3325 = 0;
        if (arg0 != 125) {
            method726(-53);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III[B)Ltg;")
    public static final class184 method725(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field2154;
        class184 var4 = new class184();
        var4.field3555 = arg2;
        var4.field3527 = new byte[arg1];
        for (int var5 = arg0; ~(arg0 + arg1) < ~var5; ++var5) {
            if (arg3[var5] != 0) {
                var4.field3527[var4.field3555++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        int var3 = 106 % ((arg1 - -58) / 34);
        int[][] var4 = super.field232.method673(arg0, -40);
        ++field2162;
        if (super.field232.field1962) {
            int[] var5 = this.method77(2, arg0, -126);
            int[][] var6 = this.method76(arg0, 6218, 0);
            int[][] var7 = this.method76(arg0, 6218, 1);
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int[] var10 = var6[0];
            int[] var11 = var6[1];
            int[] var12 = var4[0];
            int[] var13 = var6[2];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            for (int var17 = 0; class201.field3889 > var17; ++var17) {
                int var18 = var5[var17];
                if (~var18 != -4097) {
                    if (var18 != 0) {
                        int var19 = -var18 + 4096;
                        var12[var17] = var10[var17] * var18 - -(var14[var17] * var19) >> 12;
                        var8[var17] = var11[var17] * var18 + var15[var17] * var19 >> 12;
                        var9[var17] = var13[var17] * var18 + var16[var17] * var19 >> 12;
                    } else {
                        var12[var17] = var14[var17];
                        var8[var17] = var15[var17];
                        var9[var17] = var16[var17];
                    }
                } else {
                    var12[var17] = var10[var17];
                    var8[var17] = var11[var17];
                    var9[var17] = var13[var17];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)I")
    public static final int method726(int arg0) {
        if (arg0 != 1) {
            field2157 = null;
        }
        ++field2153;
        return class74.field1383++;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class120() {
        super(3, false);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (~arg1 == -1) {
            super.field211 = arg0.method588((byte) -37) == 1;
        }
        ++field2165;
        if (arg2) {
            method726(-111);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field2155;
        int[] var3 = super.field224.method7((byte) 101, arg0);
        if (arg1 != 17) {
            field2166 = null;
        }
        if (super.field224.field53) {
            int[] var4 = this.method77(0, arg0, -126);
            int[] var5 = this.method77(1, arg0, -125);
            int[] var6 = this.method77(2, arg0, -127);
            for (int var7 = 0; var7 < class201.field3889; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)V")
    public static void method727(int arg0) {
        field2166 = null;
        field2156 = null;
        field2163 = null;
        if (arg0 >= -85) {
            field2156 = null;
        }
        field2157 = null;
        field2164 = null;
        field2159 = null;
    }
}
