import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class740 extends class38 {

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    private int field10373 = 1;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    private int field10375 = 1;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "[[Z")
    public static boolean[][] field10374 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public static int field10376;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public static int field10377;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public static int field10378;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    public static int field10380;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field10381;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "Lkp;")
    public static class490 field10382;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "[[I")
    public static int[][] field10379;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILrg;)V")
    public final void method190(int arg0, int arg1, class645 arg2) {
        if (arg0 < 34) {
            field10379 = null;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field388 = ~arg2.method3745(-6314) == -2;
                }
            } else {
                this.field10373 = arg2.method3745(-6314);
            }
        } else {
            this.field10375 = arg2.method3745(-6314);
        }
        ++field10380;
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(B)V")
    public static void method4143(byte arg0) {
        field10379 = null;
        field10374 = null;
        field10382 = null;
        if (arg0 != 26) {
            field10382 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)[[I")
    public final int[][] method196(int arg0, int arg1) {
        if (arg0 != -18210) {
            this.field10375 = -66;
        }
        ++field10378;
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (super.field387.field6792) {
            int var4 = this.field10373 + 1 + this.field10373;
            int var5 = 65536 / var4;
            int var6 = this.field10375 + 1 - -this.field10375;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field10373 + arg1; var9 <= this.field10373 + arg1; ++var9) {
                int[][] var19 = this.method195(true, 0, class619.field8708 & var9);
                int[][] var20 = new int[3][class729.field10216];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field10375; ~var27 >= ~this.field10375; ++var27) {
                    int var37 = class554.field7909 & var27;
                    var21 += var24[var37];
                    var23 += var26[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class729.field10216 > var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field10375 + var31 & class554.field7909;
                    int var33 = var22 - var25[var32];
                    ++var31;
                    int var34 = var21 - var24[var32];
                    int var35 = var23 - var26[var32];
                    int var36 = class554.field7909 & this.field10375 + var31;
                    var21 = var24[var36] + var34;
                    var23 = var26[var36] + var35;
                    var22 = var25[var36] + var33;
                }
                var8[this.field10373 + var9 + -arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class729.field10216 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        ++field10381;
        int[] var3 = super.field397.method1376(arg1, (byte) 0);
        if (arg0 >= -43) {
            return null;
        } else {
            if (super.field397.field3005) {
                int var4 = this.field10373 - (-this.field10373 + -1);
                int var5 = 65536 / var4;
                int var6 = this.field10375 + this.field10375 + 1;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = arg1 - this.field10373; ~var9 >= ~(this.field10373 + arg1); ++var9) {
                    int[] var13 = this.method189(var9 & class619.field8708, 0, (byte) -92);
                    int[] var14 = new int[class729.field10216];
                    int var15 = 0;
                    for (int var16 = -this.field10375; ~this.field10375 <= ~var16; ++var16) {
                        var15 += var13[var16 & class554.field7909];
                    }
                    int var17 = 0;
                    while (var17 < class729.field10216) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[class554.field7909 & var17 - this.field10375];
                        ++var17;
                        var15 = var13[class554.field7909 & this.field10375 + var17] + var18;
                    }
                    var8[var9 - arg1 + this.field10373] = var14;
                }
                for (int var10 = 0; ~var10 > ~class729.field10216; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; ~var4 < ~var12; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lvs;Z[[[BIB)Z")
    public static final boolean method4144(class593 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class557.field7949) {
            return false;
        } else {
            int var5 = arg0.field8423 >> class459.field6769;
            int var6 = var5;
            int var7 = arg0.field8428 >> class459.field6769;
            int var8 = var7;
            if (arg0 instanceof class119) {
                var6 = ((class119) arg0).field1632;
                var8 = ((class119) arg0).field1624;
                var5 = ((class119) arg0).field1628;
                var7 = ((class119) arg0).field1626;
            }
            for (int var9 = var5; var9 <= var6; ++var9) {
                for (int var10 = var7; var10 <= var8; ++var10) {
                    if (arg0.field8417 < class409.field6165 && var9 >= class358.field5196 && var9 < class595.field8439 && var10 >= class8.field110 && var10 < class87.field1242) {
                        if ((arg2 == null || arg0.field8429 < arg3 || arg2[arg0.field8429][var9][var10] != arg4) && arg0.method85(-97) && !arg0.method79(class118.field1620, 9721)) {
                            return false;
                        }
                        if (!arg1 && var9 >= class736.field10315 - 16 && var9 <= class736.field10315 + 16 && var10 >= class116.field1600 - 16 && var10 <= class116.field1600 + 16) {
                            if (class413.field6206) {
                                class379.field5736[class152.field2352++].method296(arg0, (byte) 29);
                                class152.field2352 %= class412.field6191;
                            } else {
                                arg0.method314(class118.field1620, false);
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIIIIJLvd;I)V")
    public static final void method4145(boolean arg0, int arg1, int arg2, int arg3, int arg4, long arg5, class39 arg6, int arg7) {
        class706.field9945 = arg0;
        class354.field5152 = arg6;
        class622.field8727 = arg5;
        class152.field2350 = 1;
        class183.field2803 = arg2;
        class347.field5018 = arg7;
        class758.field10600 = arg1;
        ++field10376;
        class581.field8257 = arg4;
        class242.field3529 = 10000;
        class2.field18 = null;
        if (arg3 > -105) {
            method4143((byte) -91);
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class740() {
        super(1, false);
    }
}
