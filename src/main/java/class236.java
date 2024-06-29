import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class236 extends class135 {

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "I")
    private int field4190 = 1;

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "I")
    private int field4192 = 1;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
    public static int field4191 = 0;

    @OriginalMember(owner = "client!rh", name = "cb", descriptor = "Z")
    public static boolean field4195 = false;

    @OriginalMember(owner = "client!rh", name = "db", descriptor = "Ldf;")
    public static class231 field4196 = new class231(4096);

    @OriginalMember(owner = "client!rh", name = "jb", descriptor = "Lqj;")
    public static class196 field4202 = class80.method502("www)2wtrc", -48);

    @OriginalMember(owner = "client!rh", name = "ib", descriptor = "Lah;")
    public static class22 field4201 = new class22(5);

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!rh", name = "eb", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!rh", name = "fb", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!rh", name = "gb", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!rh", name = "hb", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "[I")
    public static int[] field4189;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)Lqj;")
    public static final class196 method1584(boolean arg0, int arg1) {
        if (arg0) {
            method1586((class196) null, -43, -66, (class196) null);
        }
        ++field4193;
        if (~arg1 > -100001) {
            return class93.method572(-72, new class196[] { class9.field89, class163.method1029(arg1, false), class104.field1509 });
        } else {
            return ~arg1 > -10000001 ? class93.method572(-106, new class196[] { class218.field3914, class163.method1029(arg1 / 1000, false), class45.field536, class104.field1509 }) : class93.method572(-82, new class196[] { class67.field953, class163.method1029(arg1 / 1000000, false), class225.field4030, class104.field1509 });
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        ++field4200;
        int[][] var3 = super.field1947.method511(arg1, -1);
        if (arg0 != 260028743) {
            method1587(32, (byte) 58);
        }
        if (super.field1947.field1180) {
            int var4 = this.field4192 - (-this.field4192 + -1);
            int var5 = 65536 / var4;
            int var6 = this.field4190 - -this.field4190 - -1;
            int[][][] var7 = new int[var4][][];
            int var8 = 65536 / var6;
            for (int var9 = arg1 - this.field4192; ~var9 >= ~(this.field4192 + arg1); ++var9) {
                int[][] var19 = this.method818(2, class53.field667 & var9, 0);
                int var20 = 0;
                int[][] var21 = new int[3][class131.field1862];
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field4190; ~var27 >= ~this.field4190; ++var27) {
                    int var37 = var27 & class61.field816;
                    var20 += var24[var37];
                    var23 += var26[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var21[0];
                int[] var29 = var21[1];
                int[] var30 = var21[2];
                int var31 = 0;
                while (~var31 > ~class131.field1862) {
                    var28[var31] = var8 * var20 >> 16;
                    var29[var31] = var8 * var22 >> 16;
                    var30[var31] = var8 * var23 >> 16;
                    int var32 = -this.field4190 + var31 & class61.field816;
                    int var33 = var22 - var25[var32];
                    ++var31;
                    int var34 = var23 - var26[var32];
                    int var35 = var20 - var24[var32];
                    int var36 = class61.field816 & this.field4190 + var31;
                    var20 = var24[var36] + var35;
                    var23 = var26[var36] + var34;
                    var22 = var25[var36] + var33;
                }
                var7[-arg1 + this.field4192 + var9] = var21;
            }
            int[] var10 = var3[2];
            int[] var11 = var3[1];
            int[] var12 = var3[0];
            for (int var13 = 0; var13 < class131.field1862; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var7[var17];
                    var16 += var18[2][var13];
                    var14 += var18[1][var13];
                    var15 += var18[0][var13];
                }
                var12[var13] = var5 * var15 >> 16;
                var11[var13] = var5 * var14 >> 16;
                var10[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        ++field4198;
        if (arg1) {
            field4202 = null;
        }
        int[] var3 = super.field1954.method110(arg0, 29);
        if (super.field1954.field244) {
            int var4 = this.field4190 + this.field4190 - -1;
            int var5 = this.field4192 + 1 + this.field4192;
            int var6 = 65536 / var4;
            int[][] var7 = new int[var5][];
            for (int var8 = -this.field4192 + arg0; ~var8 >= ~(this.field4192 + arg0); ++var8) {
                int[] var13 = this.method819(-104, 0, var8 & class53.field667);
                int[] var14 = new int[class131.field1862];
                int var15 = 0;
                for (int var16 = -this.field4190; this.field4190 >= var16; ++var16) {
                    var15 += var13[var16 & class61.field816];
                }
                int var17 = 0;
                while (var17 < class131.field1862) {
                    var14[var17] = var6 * var15 >> 16;
                    int var18 = var15 - var13[class61.field816 & -this.field4190 + var17];
                    ++var17;
                    var15 = var13[var17 - -this.field4190 & class61.field816] + var18;
                }
                var7[this.field4192 + var8 + -arg0] = var14;
            }
            int var9 = 65536 / var5;
            for (int var10 = 0; ~class131.field1862 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var5 > var12; ++var12) {
                    var11 += var7[var12][var10];
                }
                var3[var10] = var9 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(B)V")
    public static void method1585(byte arg0) {
        field4189 = null;
        field4202 = null;
        field4196 = null;
        int var1 = -99 / ((arg0 - 27) / 46);
        field4201 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field1962 = arg0.method367(arg2 + 16232) == 1;
                }
            } else {
                this.field4192 = arg0.method367(1);
            }
        } else {
            this.field4190 = arg0.method367(arg2 ^ -16232);
        }
        if (arg2 != -16231) {
            field4196 = null;
        }
        ++field4197;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class236() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lqj;IILqj;)V")
    public static final void method1586(class196 arg0, int arg1, int arg2, class196 arg3) {
        ++field4199;
        if (arg1 < 94) {
            method1584(false, -88);
        }
        class3.method10((class196) null, arg3, -1, arg0, 99, arg2);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)Z")
    public static final boolean method1587(int arg0, byte arg1) {
        ++field4194;
        if (arg1 <= 81) {
            return true;
        } else {
            return ~(1 & arg0 >> 31) != -1;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B[B)V")
    public static final void method1588(byte arg0, byte[] arg1) {
        ++field4188;
        if (arg0 <= -47) {
            int var2 = 0;
            while (true) {
                while (~var2 > ~arg1.length) {
                    int var3 = -class212.field3809 + (arg1[var2++] & 255) * 64;
                    int var4 = -class83.field1203 + 64 * (255 & arg1[var2++]);
                    if (~var3 < -1 && ~var4 < -1 && ~(var3 + 64) > ~class144.field2221 && var4 + 64 < class83.field1213) {
                        int var5 = var3 >> 6;
                        int var6 = class83.field1213 - 1 + -var4 >> 6;
                        for (int var7 = 0; ~var7 > -65; ++var7) {
                            for (int var8 = -64; ~var8 > -1; ++var8) {
                                byte var9 = arg1[var2++];
                                if (~var9 != -1) {
                                    if (class71.field1013[var5][var6] == null) {
                                        class71.field1013[var5][var6] = new byte[4096];
                                    }
                                    class71.field1013[var5][var6][(-(var8 + 1) << 6) - -var7] = var9;
                                    byte var10 = arg1[var2++];
                                    if (class64.field893[var5][var6] == null) {
                                        class64.field893[var5][var6] = new byte[4096];
                                    }
                                    class64.field893[var5][var6][(-(var8 + 1) << 6) - -var7] = var10;
                                }
                            }
                        }
                    } else {
                        for (int var11 = -4096; var11 < 0; ++var11) {
                            byte var12 = arg1[var2++];
                            if (var12 != 0) {
                                ++var2;
                            }
                        }
                    }
                }
                return;
            }
        }
    }
}
