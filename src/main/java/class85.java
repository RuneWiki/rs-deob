import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class85 extends class139 {

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "I")
    private int field1869 = 1;

    @OriginalMember(owner = "client!ih", name = "fb", descriptor = "I")
    private int field1873 = 1;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "Lrf;")
    public static class163 field1862 = class53.method392(99, "VOLL");

    @OriginalMember(owner = "client!ih", name = "cb", descriptor = "Lrf;")
    public static class163 field1870 = class53.method392(67, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
    public static int field1867 = 0;

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
    public static int field1868 = 4;

    @OriginalMember(owner = "client!ih", name = "eb", descriptor = "Lrf;")
    public static class163 field1872 = class53.method392(106, ")1j");

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "[I")
    public static int[] field1863 = new int[field1868];

    @OriginalMember(owner = "client!ih", name = "gb", descriptor = "Lrf;")
    public static class163 field1874 = class53.method392(93, " loggt sich aus)3");

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "Lrf;")
    public static class163 field1865 = class53.method392(-90, "::autoshadow off");

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "[[Lpc;")
    public static class142[][] field1864 = new class142[field1868][500];

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!ih", name = "db", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!ih", name = "hb", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!ih", name = "ib", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        ++field1871;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field2872 = arg2.method344(arg1 ^ 234) == 1;
                }
            } else {
                this.field1873 = arg2.method344(255);
            }
        } else {
            this.field1869 = arg2.method344(255);
        }
        if (arg1 != 21) {
            this.method64(-7, -117, (class52) null);
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field1875;
        int[] var3 = super.field2859.method1319(-102, arg0);
        if (super.field2859.field3966) {
            int var4 = this.field1873 + 1 + this.field1873;
            int var5 = this.field1869 - -this.field1869 - -1;
            int[][] var6 = new int[var4][];
            for (int var7 = -this.field1873 + arg0; ~(arg0 - -this.field1873) <= ~var7; ++var7) {
                int[] var11 = this.method917(var7 & class15.field260, 0, true);
                int var12 = 0;
                int[] var13 = new int[class23.field402];
                for (int var14 = -this.field1869; ~this.field1869 <= ~var14; ++var14) {
                    var12 += var11[var14 & class29.field542];
                }
                int var15 = 0;
                while (var15 < class23.field402) {
                    var13[var15] = var12 / var5;
                    int var16 = var12 - var11[-this.field1869 + var15 & class29.field542];
                    ++var15;
                    var12 = var11[class29.field542 & this.field1869 + var15] + var16;
                }
                var6[-arg0 + this.field1873 + var7] = var13;
            }
            for (int var8 = 0; class23.field402 > var8; ++var8) {
                int var9 = 0;
                for (int var10 = 0; ~var10 > ~var4; ++var10) {
                    var9 += var6[var10][var8];
                }
                var3[var8] = var9 / var4;
            }
        }
        return arg1 != 7451 ? null : var3;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIII)Z")
    public static final boolean method600(int arg0, int arg1, int arg2, int arg3) {
        if (!class158.method1002(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class3.method30(var4 + 1, class99.field2086[arg0][arg1][arg2] + arg3, var5 + 1) && class3.method30(var4 + 128 - 1, class99.field2086[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class3.method30(var4 + 128 - 1, class99.field2086[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class3.method30(var4 + 1, class99.field2086[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class85() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        if (arg0 < 53) {
            this.method61(-17, 118);
        }
        ++field1876;
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (super.field2866.field885) {
            int var4 = this.field1873 + 1 + this.field1873;
            int[][][] var5 = new int[var4][][];
            int var6 = this.field1869 - -this.field1869 - -1;
            for (int var7 = -this.field1873 + arg1; ~var7 >= ~(this.field1873 + arg1); ++var7) {
                int[][] var17 = this.method910((byte) -34, class15.field260 & var7, 0);
                int var18 = 0;
                int[][] var19 = new int[3][class23.field402];
                int var20 = 0;
                int[] var21 = var17[1];
                int[] var22 = var17[2];
                int[] var23 = var17[0];
                int var24 = 0;
                for (int var25 = -this.field1869; ~var25 >= ~this.field1869; ++var25) {
                    int var35 = var25 & class29.field542;
                    var24 += var21[var35];
                    var18 += var23[var35];
                    var20 += var22[var35];
                }
                int[] var26 = var19[0];
                int[] var27 = var19[1];
                int[] var28 = var19[2];
                int var29 = 0;
                while (~class23.field402 < ~var29) {
                    var26[var29] = var18 / var6;
                    var27[var29] = var24 / var6;
                    var28[var29] = var20 / var6;
                    int var30 = var29 - this.field1869 & class29.field542;
                    int var31 = var18 - var23[var30];
                    int var32 = var24 - var21[var30];
                    ++var29;
                    int var33 = var20 - var22[var30];
                    int var34 = class29.field542 & this.field1869 + var29;
                    var20 = var22[var34] + var33;
                    var18 = var23[var34] + var31;
                    var24 = var21[var34] + var32;
                }
                var5[var7 - -this.field1873 + -arg1] = var19;
            }
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class23.field402 < ~var11; ++var11) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                for (int var15 = 0; var15 < var4; ++var15) {
                    int[][] var16 = var5[var15];
                    var12 += var16[0][var11];
                    var14 += var16[2][var11];
                    var13 += var16[1][var11];
                }
                var8[var11] = var12 / var4;
                var9[var11] = var13 / var4;
                var10[var11] = var14 / var4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
    public static void method601(int arg0) {
        field1864 = null;
        field1865 = null;
        field1872 = null;
        field1862 = null;
        if (arg0 >= -116) {
            field1874 = null;
        }
        field1863 = null;
        field1870 = null;
        field1874 = null;
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)V")
    public static final void method602(int arg0) {
        if (arg0 == 128) {
            ++field1861;
            for (int var1 = 0; var1 < class95.field2033; ++var1) {
                int var10002 = class188.field3746[var1]--;
                if (~class188.field3746[var1] <= 9) {
                    class110 var3 = class13.field247[var1];
                    if (var3 == null) {
                        var3 = class110.method767(class121.field2552, class16.field274[var1], 0);
                        if (var3 == null) {
                            continue;
                        }
                        class188.field3746[var1] += var3.method770();
                        class13.field247[var1] = var3;
                    }
                    if (~class188.field3746[var1] > -1) {
                        int var4;
                        if (~class202.field3988[var1] == -1) {
                            var4 = class197.field3920;
                        } else {
                            int var5 = (255 & class202.field3988[var1]) * 128;
                            int var6 = class202.field3988[var1] >> 8 & 255;
                            int var7 = (16718096 & class202.field3988[var1]) >> 16;
                            int var8 = var7 * 128 + 64 + -class56.field1136.field716;
                            if (~var8 > -1) {
                                var8 = -var8;
                            }
                            int var9 = var6 * 128 + 64 - class56.field1136.field679;
                            if (var9 < 0) {
                                var9 = -var9;
                            }
                            int var10 = var8 + var9 + -128;
                            if (~var5 > ~var10) {
                                class188.field3746[var1] = -100;
                                continue;
                            }
                            if (~var10 > -1) {
                                var10 = 0;
                            }
                            var4 = (-var10 + var5) * class151.field3113 / var5;
                        }
                        if (~var4 < -1) {
                            class153 var11 = var3.method769().method982(class27.field510);
                            class164 var12 = class164.method1099(var11, 100, var4);
                            var12.method1086(client.field599[var1] + -1);
                            class113.field2378.method285(var12);
                        }
                        class188.field3746[var1] = -100;
                    }
                } else {
                    --class95.field2033;
                    for (int var2 = var1; var2 < class95.field2033; ++var2) {
                        class16.field274[var2] = class16.field274[var2 + 1];
                        class13.field247[var2] = class13.field247[var2 + 1];
                        client.field599[var2] = client.field599[var2 + 1];
                        class188.field3746[var2] = class188.field3746[var2 + 1];
                        class202.field3988[var2] = class202.field3988[var2 + 1];
                    }
                    --var1;
                }
            }
            if (class107.field2234 && !class197.method1310(arg0 ^ 223)) {
                if (class144.field2961 != 0 && ~class103.field2165 != 0) {
                    class34.method220(false, class144.field2961, class134.field2777, -121, 0, class103.field2165);
                }
                class107.field2234 = false;
            } else if (~class144.field2961 != -1 && class103.field2165 != -1 && !class197.method1310(47)) {
                ++class202.field3982;
                class141.field2896.method326(104, 173);
                class141.field2896.method369(class103.field2165, (byte) -127);
                class103.field2165 = -1;
            }
        }
    }
}
