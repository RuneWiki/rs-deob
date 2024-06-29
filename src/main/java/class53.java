import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class53 extends class96 {

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    private int field723 = 1;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    private int field724 = 1;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "[B")
    public static byte[] field720 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field718 = new String[100];

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "Lpi;")
    public static class340 field725 = new class340(59, -2);

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILbt;)V", line = 3)
    public final void method31(int arg0, int arg1, class88 arg2) {
        ++field722;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field1329 = arg2.method617(2) == 1;
                }
            } else {
                this.field723 = arg2.method617(2);
            }
        } else {
            this.field724 = arg2.method617(2);
        }
        if (arg1 != -1) {
            method314((byte) -4);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V", line = 45)
    public class53() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[[I", line = 51)
    public final int[][] method36(int arg0, int arg1) {
        ++field721;
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (super.field1333.field1423) {
            int var4 = this.field723 + 1 - -this.field723;
            int var5 = 65536 / var4;
            int var6 = this.field724 + this.field724 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field723 + arg1; var9 <= arg1 - -this.field723; ++var9) {
                int[][] var19 = this.method659(0, arg0 ^ -70, var9 & class380.field4948);
                int[][] var20 = new int[3][class269.field3403];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field724; var27 <= this.field724; ++var27) {
                    int var37 = var27 & class292.field3781;
                    var23 += var26[var37];
                    var21 += var24[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~var31 > ~class269.field3403) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field724 + var31 & class292.field3781;
                    int var33 = var21 - var24[var32];
                    int var34 = var22 - var25[var32];
                    int var35 = var23 - var26[var32];
                    ++var31;
                    int var36 = class292.field3781 & var31 - -this.field724;
                    var23 = var26[var36] + var35;
                    var22 = var25[var36] + var34;
                    var21 = var24[var36] + var33;
                }
                var8[this.field723 + var9 + -arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class269.field3403; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
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

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(B)V", line = 183)
    public static void method314(byte arg0) {
        field720 = null;
        if (arg0 <= 60) {
            field727 = -43;
        }
        field718 = null;
        field725 = null;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)[I", line = 201)
    public final int[] method37(int arg0, int arg1) {
        if (arg1 != 255) {
            this.method37(-87, 70);
        }
        ++field726;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (super.field1331.field863) {
            int var4 = this.field723 + 1 + this.field723;
            int var5 = 65536 / var4;
            int var6 = this.field724 - -1 + this.field724;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field723 + arg0; ~var9 >= ~(arg0 - -this.field723); ++var9) {
                int[] var13 = this.method657(0, var9 & class380.field4948, arg1 + -256);
                int[] var14 = new int[class269.field3403];
                int var15 = 0;
                for (int var16 = -this.field724; ~this.field724 <= ~var16; ++var16) {
                    var15 += var13[var16 & class292.field3781];
                }
                int var17 = 0;
                while (var17 < class269.field3403) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field724 + var17 & class292.field3781];
                    ++var17;
                    var15 = var13[class292.field3781 & this.field724 + var17] + var18;
                }
                var8[-arg0 + this.field723 + var9] = var14;
            }
            for (int var10 = 0; class269.field3403 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILjava/lang/String;)V", line = 305)
    public static final void method315(int arg0, String arg1) {
        ++field728;
        if (arg1 != null) {
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            if (arg0 != 2) {
                method314((byte) 2);
            }
            String var2 = class61.method347(31608, arg1);
            if (var2 != null) {
                for (int var3 = 0; ~var3 > ~class104.field1424; ++var3) {
                    String var4 = class271.field3444[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class61.method347(arg0 ^ 31610, var4);
                    if (var5 != null && var5.equals(var2)) {
                        --class104.field1424;
                        for (int var6 = var3; ~var6 > ~class104.field1424; ++var6) {
                            class271.field3444[var6] = class271.field3444[var6 + 1];
                            field718[var6] = field718[var6 + 1];
                            class303.field3925[var6] = class303.field3925[var6 - -1];
                            class246.field3153[var6] = class246.field3153[var6 + 1];
                            class93.field1305[var6] = class93.field1305[var6 - -1];
                        }
                        class162.field2107 = class165.field2140;
                        ++class9.field94;
                        class420.method2472((byte) -101, class109.field1501);
                        class319.field4112.method565(38, class415.method2442(arg0 ^ 110, arg1));
                        class319.field4112.method597(-128, arg1);
                        return;
                    }
                }
            }
        }
    }
}
