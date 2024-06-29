import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class184 {

    @OriginalMember(owner = "client!u", name = "B", descriptor = "Z")
    private boolean field3670;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Z")
    private boolean field3660;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Lrf;")
    public static class163 field3651 = class53.method392(62, "(U");

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Lrf;")
    public static class163 field3666 = class53.method392(103, "<col=00ff80>");

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field3678 = 0;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "Z")
    public static boolean field3671 = false;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "Z")
    public static boolean field3687 = true;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    private int field3654;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    public int field3681;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "Lia;")
    private class79 field3656;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Z")
    public static boolean field3645;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "[I")
    private int[] field3653;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "[I")
    public int[] field3664;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "[I")
    public int[] field3665;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "[I")
    private int[] field3674;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "[I")
    public int[] field3682;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "[Lia;")
    private class79[] field3662;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "[Ljava/lang/Object;")
    public Object[] field3650;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "[[I")
    private int[][] field3658;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "[[I")
    private int[][] field3684;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3646;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)I")
    public final int method1225(int arg0, boolean arg1) {
        if (!arg1) {
            this.method1249((byte) -85);
        }
        field3683++;
        return this.field3646[arg0].length;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lrf;Lrf;B)Z")
    public final boolean method1226(class163 arg0, class163 arg1, byte arg2) {
        class163 var4 = arg1.method1060(-18265);
        field3649++;
        if (arg2 < 24) {
            this.method1227(95, null);
        }
        class163 var5 = arg0.method1060(-18265);
        int var6 = this.field3656.method542((byte) 63, var4.method1056(-1));
        int var7 = this.field3662[var6].method542((byte) 63, var5.method1056(-1));
        return this.method1248(var6, var7, 114);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I[B)V")
    public final void method1227(int arg0, byte[] arg1) {
        field3667++;
        this.field3681 = class97.method676((byte) 124, arg1, arg1.length);
        class52 var3 = new class52(class142.method925(arg1, 0));
        int var4 = var3.method344(255);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        int var5 = 0;
        int var6 = -1;
        if (var4 >= 6) {
            var3.method383(32);
        }
        int var7 = var3.method344(255);
        this.field3654 = var3.method390((byte) 93);
        if (arg0 != 1) {
            this.method1246(-67, 111);
        }
        this.field3674 = new int[this.field3654];
        for (int var8 = 0; var8 < this.field3654; var8++) {
            this.field3674[var8] = var5 += var3.method390((byte) 100);
            if (var6 < this.field3674[var8]) {
                var6 = this.field3674[var8];
            }
        }
        this.field3658 = new int[var6 + 1][];
        this.field3664 = new int[var6 + 1];
        this.field3665 = new int[var6 + 1];
        this.field3650 = new Object[var6 + 1];
        this.field3682 = new int[var6 + 1];
        this.field3646 = new Object[var6 + 1][];
        if (var7 != 0) {
            this.field3653 = new int[var6 + 1];
            for (int var9 = 0; var9 < var6 + 1; var9++) {
                this.field3653[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3654; var10++) {
                this.field3653[this.field3674[var10]] = var3.method383(class70.method502(arg0, 17));
            }
            this.field3656 = new class79(this.field3653);
        }
        for (int var11 = 0; var11 < this.field3654; var11++) {
            this.field3665[this.field3674[var11]] = var3.method383(94);
        }
        for (int var12 = 0; var12 < this.field3654; var12++) {
            this.field3664[this.field3674[var12]] = var3.method383(122);
        }
        for (int var13 = 0; var13 < this.field3654; var13++) {
            this.field3682[this.field3674[var13]] = var3.method390((byte) 95);
        }
        for (int var14 = 0; var14 < this.field3654; var14++) {
            int var21 = this.field3674[var14];
            int var22 = this.field3682[var21];
            int var23 = -1;
            int var24 = 0;
            this.field3658[var21] = new int[var22];
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field3658[var21][var25] = var24 += var3.method390((byte) 100);
                if (var23 < var26) {
                    var23 = var26;
                }
            }
            if (var23 + 1 == var22) {
                this.field3658[var21] = null;
            }
            this.field3646[var21] = new Object[var23 + 1];
        }
        if (var7 == 0) {
            return;
        }
        this.field3662 = new class79[var6 + 1];
        this.field3684 = new int[var6 + 1][];
        for (int var15 = 0; var15 < this.field3654; var15++) {
            int var16 = this.field3674[var15];
            int var17 = this.field3682[var16];
            this.field3684[var16] = new int[this.field3646[var16].length];
            for (int var18 = 0; var18 < this.field3646[var16].length; var18++) {
                this.field3684[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field3658[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field3658[var16][var19];
                }
                this.field3684[var16][var20] = var3.method383(22);
            }
            this.field3662[var16] = new class79(this.field3684[var16]);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILrf;)I")
    public final int method1228(int arg0, class163 arg1) {
        field3663++;
        class163 var3 = arg1.method1060(-18265);
        return arg0 < 87 ? 100 : this.field3656.method542((byte) 63, var3.method1056(-1));
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method1229(byte arg0) {
        field3666 = null;
        int var1 = 101 % ((arg0 + 56) / 39);
        field3651 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[I")
    public final int[] method1230(int arg0, int arg1) {
        field3669++;
        int var3 = 121 % ((arg0 - 57) / 42);
        int[] var4 = this.field3658[arg1];
        if (var4 == null) {
            var4 = new int[this.field3682[arg1]];
            int var5 = 0;
            while (var4.length > var5) {
                var4[var5] = var5++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lrf;II)I")
    public final int method1231(class163 arg0, int arg1, int arg2) {
        if (arg2 == 2) {
            field3644++;
            class163 var4 = arg0.method1060(-18265);
            return this.field3662[arg1].method542((byte) 63, var4.method1056(-1));
        } else {
            return -40;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V")
    public final void method1232(int arg0, byte arg1) {
        field3680++;
        if (arg1 > 36) {
            for (int var3 = 0; var3 < this.field3646[arg0].length; var3++) {
                this.field3646[arg0][var3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLne;Lne;)V")
    public static final void method1233(byte arg0, class126 arg1, class126 arg2) {
        field3673++;
        if (class96.field2041) {
            class48.method290(arg1, 5, arg2);
            return;
        }
        if (class16.field277 == 0 || class16.field277 == 5) {
            byte var3 = 20;
            arg1.method583(class118.field2488, 382, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class173.method1177(230, var4, 304, 34, 9179409);
            class173.method1177(231, var4 + 1, 302, 32, 0);
            class173.method1173(232, var4 + 2, class44.field900 * 3, 30, 9179409);
            class173.method1173(class44.field900 * 3 + 232, var4 + 2, 300 - class44.field900 * 3, 30, 0);
            arg1.method583(class202.field3979, 382, 276 - var3, 16777215, -1);
        }
        if (class16.field277 == 20) {
            class125.field2607.method944(382 - class125.field2607.field2972 / 2, 271 - class125.field2607.field2976 / 2);
            short var5 = 211;
            arg1.method583(class202.field3995, 382, var5, 16776960, 0);
            int var24 = var5 + 15;
            arg1.method583(class202.field3985, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            arg1.method583(class202.field3994, 382, var25, 16776960, 0);
            int var26 = var25 + 15;
            int var27 = var26 + 10;
            arg1.method577(class180.method1216(new class163[] { class170.field3453, class83.method580(class202.field3989) }, false), 272, var27, 16777215, 0);
            int var29 = var27 + 15;
            arg1.method577(class180.method1216(new class163[] { class196.field3894, class202.field3990.method1050(true) }, false), 274, var29, 16777215, 0);
            int var30 = var29 + 15;
        }
        if (class16.field277 == 10) {
            class125.field2607.method944(202, 171);
            if (class34.field661 == 0) {
                short var6 = 251;
                short var7 = 302;
                arg1.method583(class99.field2090, 382, var6, 16776960, 0);
                short var8 = 291;
                class107.field2232.method944(var7 - 73, var8 + -20);
                int var28 = var6 + 30;
                arg1.method568(class175.field3525, var7 - 73, var8 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var9 = 462;
                class107.field2232.method944(var9 - 73, var8 + -20);
                arg1.method568(class136.field2803, var9 - 73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class34.field661 == 2) {
                short var13 = 302;
                short var14 = 211;
                arg1.method583(class202.field3995, 382, var14, 16776960, 0);
                int var35 = var14 + 15;
                arg1.method583(class202.field3985, 382, var35, 16776960, 0);
                int var36 = var35 + 15;
                short var15 = 321;
                arg1.method583(class202.field3994, 382, var36, 16776960, 0);
                boolean var16;
                if (class122.field2574 == 0 && class51.field1023 % 40 < 20 && class189.field3755) {
                    var16 = true;
                } else {
                    var16 = false;
                }
                var35 = var36 + 15;
                var35 += 10;
                arg1.method577(class180.method1216(new class163[] { class170.field3453, class83.method580(class202.field3989), var16 ? class189.field3757 : class202.field3986 }, false), 272, var35, 16777215, 0);
                var35 += 15;
                boolean var17;
                if (class122.field2574 == 1 && class51.field1023 % 40 < 20 && class189.field3755) {
                    var17 = true;
                } else {
                    var17 = false;
                }
                arg1.method577(class180.method1216(new class163[] { class196.field3894, class202.field3990.method1050(true), var17 ? class189.field3757 : class202.field3986 }, false), 274, var35, 16777215, 0);
                var35 += 15;
                class107.field2232.method944(var13 - 73, var15 + -20);
                arg1.method583(class210.field4083, var13, var15 + 5, 16777215, 0);
                short var18 = 462;
                class107.field2232.method944(var18 - 73, var15 + -20);
                arg1.method583(class75.field1559, var18, var15 + 5, 16777215, 0);
            } else if (class34.field661 == 3) {
                short var10 = 236;
                arg1.method583(class101.field2120, 382, 211, 16776960, 0);
                short var11 = 382;
                arg1.method583(class128.field2637, 382, var10, 16777215, 0);
                int var31 = var10 + 15;
                short var12 = 321;
                arg1.method583(class141.field2909, 382, var31, 16777215, 0);
                int var32 = var31 + 15;
                arg1.method583(class152.field3120, 382, var32, 16777215, 0);
                int var33 = var32 + 15;
                arg1.method583(class33.field649, 382, var33, 16777215, 0);
                int var34 = var33 + 15;
                class107.field2232.method944(var11 - 73, var12 + -20);
                arg1.method583(class75.field1559, var11, var12 + 5, 16777215, 0);
            }
        }
        int var19 = 25 % ((70 - arg0) / 45);
        if (class89.field1932 != 1) {
            if (class93.field2012 > 0) {
                class210.method1367(116, class93.field2012);
                class93.field2012 = 0;
            }
            class26.method159((byte) 10);
        }
        class168.field3432[class163.field3327 ? 1 : 0].method944(725, 463);
        if (class16.field277 <= 5 || class20.field343 == 2 || class133.field2763 != 0) {
            return;
        }
        if (class82.field1653 == null) {
            class82.field1653 = class15.method104(class175.field3517, class202.field3986, 1, class12.field239);
            return;
        }
        byte var20 = 5;
        byte var21 = 100;
        short var22 = 463;
        class82.field1653.method944(var20, var22);
        byte var23 = 35;
        arg1.method583(class180.method1216(new class163[] { class130.field2706, class162.field3268, class34.method217(class27.field503, -76) }, false), var21 / 2 + var20, var23 / 2 + var22 - 2, 16777215, 0);
        if (class205.field4013 == null) {
            arg2.method583(class8.field174, var21 / 2 + var20, var23 / 2 + 12 + var22, 16777215, 0);
        } else {
            arg2.method583(class201.field3974, var20 + var21 / 2, var23 / 2 + 12 + var22, 16777215, 0);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
    public static final void method1234(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class41.field847; var3++) {
            for (int var4 = 0; var4 < class80.field1620; var4++) {
                for (int var5 = 0; var5 < class92.field2007; var5++) {
                    class111 var6 = class97.field2054[var3][var4][var5];
                    if (var6 != null) {
                        class72 var7 = var6.field2345;
                        if (var7 != null && var7.field1502 instanceof class50) {
                            class50 var8 = (class50) var7.field1502;
                            class59.method427(var8, var3, var4, var5, 1, 1);
                            if (var7.field1504 instanceof class50) {
                                class50 var9 = (class50) var7.field1504;
                                class59.method427(var9, var3, var4, var5, 1, 1);
                                class50.method315(var8, var9, 0, 0, 0, false);
                                var7.field1504 = var9.method308(var9.field966, var9.field972, arg0, arg1, arg2, false, false);
                            }
                            var7.field1502 = var8.method308(var8.field966, var8.field972, arg0, arg1, arg2, false, false);
                        }
                        for (int var10 = 0; var10 < var6.field2359; var10++) {
                            class121 var13 = var6.field2344[var10];
                            if (var13 != null && var13.field2546 instanceof class50) {
                                class50 var14 = (class50) var13.field2546;
                                class59.method427(var14, var3, var4, var5, var13.field2548 + 1 - var13.field2544, var13.field2535 - var13.field2542 + 1);
                                var13.field2546 = var14.method308(var14.field966, var14.field972, arg0, arg1, arg2, false, false);
                            }
                        }
                        class9 var11 = var6.field2357;
                        if (var11 != null && var11.field184 instanceof class50) {
                            class50 var12 = (class50) var11.field184;
                            class180.method1213(var12, var3, var4, var5);
                            var11.field184 = var12.method308(var12.field966, var12.field972, arg0, arg1, arg2, false, false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IBI)[B")
    public final byte[] method1235(int arg0, byte arg1, int arg2) {
        field3655++;
        return arg1 == -64 ? this.method1241(arg0, (byte) 104, null, arg2) : null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Z")
    public final boolean method1236(int arg0) {
        if (arg0 > -1) {
            this.method1242(-106, null, 18);
        }
        field3686++;
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field3674.length; var3++) {
            int var4 = this.field3674[var3];
            if (this.field3650[var4] == null) {
                this.method1250(-5210, var4);
                if (this.field3650[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)Z")
    public final boolean method1237(int arg0, int arg1) {
        field3657++;
        if (this.field3646.length == 1) {
            return this.method1248(0, arg0, -92);
        } else if (this.field3646[arg0].length == 1) {
            return this.method1248(arg0, 0, 98);
        } else if (arg1 == -19816) {
            throw new RuntimeException();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(II)Z")
    public final boolean method1238(int arg0, int arg1) {
        field3652++;
        if (this.field3650[arg0] != null) {
            return true;
        }
        this.method1250(-5210, arg0);
        if (this.field3650[arg0] == null) {
            int var3 = -42 / ((-arg1 - 8) / 43);
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lrf;I)V")
    public final void method1239(class163 arg0, int arg1) {
        field3647++;
        class163 var3 = arg0.method1060(-18265);
        if (arg1 >= -52) {
            this.method1228(-61, null);
        }
        int var4 = this.field3656.method542((byte) 63, var3.method1056(-1));
        if (var4 >= 0) {
            this.method1244(var4, 8);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lrf;BLrf;)[B")
    public final byte[] method1240(class163 arg0, byte arg1, class163 arg2) {
        field3668++;
        class163 var4 = arg2.method1060(-18265);
        class163 var5 = arg0.method1060(-18265);
        int var6 = this.field3656.method542((byte) 63, var4.method1056(-1));
        int var7 = this.field3662[var6].method542((byte) 63, var5.method1056(-1));
        return arg1 <= 28 ? null : this.method1235(var7, (byte) -64, var6);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB[II)[B")
    public final byte[] method1241(int arg0, byte arg1, int[] arg2, int arg3) {
        field3679++;
        if (arg3 < 0 || arg3 >= this.field3646.length || this.field3646[arg3] == null || arg0 < 0 || this.field3646[arg3].length <= arg0) {
            return null;
        }
        if (this.field3646[arg3][arg0] == null) {
            boolean var5 = this.method1242(arg3, arg2, -98);
            if (!var5) {
                this.method1250(-5210, arg3);
                boolean var6 = this.method1242(arg3, arg2, -123);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class56.method408(this.field3646[arg3][arg0], false, (byte) -112);
        if (arg1 < 95) {
            this.method1237(67, -63);
        }
        if (this.field3660) {
            this.field3646[arg3][arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I[II)Z")
    private final boolean method1242(int arg0, int[] arg1, int arg2) {
        field3648++;
        if (this.field3650[arg0] == null) {
            return false;
        }
        int var4 = this.field3682[arg0];
        int[] var5 = this.field3658[arg0];
        if (arg2 >= -59) {
            this.field3665 = null;
        }
        boolean var6 = true;
        Object[] var7 = this.field3646[arg0];
        for (int var8 = 0; var8 < var4; var8++) {
            int var9;
            if (var5 == null) {
                var9 = var8;
            } else {
                var9 = var5[var8];
            }
            if (var7[var9] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var10;
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var10 = class56.method408(this.field3650[arg0], false, (byte) -121);
        } else {
            var10 = class56.method408(this.field3650[arg0], true, (byte) -98);
            class52 var11 = new class52(var10);
            var11.method375(-1, 5, var11.field1054.length, arg1);
        }
        byte[] var12;
        try {
            var12 = class142.method925(var10, 0);
        } catch (RuntimeException var31) {
            throw class34.method216(var31, "T3 - " + (arg1 != null) + "," + arg0 + "," + var10.length + "," + class97.method676((byte) 124, var10, var10.length) + "," + class97.method676((byte) 126, var10, var10.length - 2) + "," + this.field3665[arg0] + "," + this.field3681);
        }
        if (this.field3670) {
            this.field3650[arg0] = null;
        }
        if (var4 <= 1) {
            int var14;
            if (var5 == null) {
                var14 = 0;
            } else {
                var14 = var5[0];
            }
            if (this.field3660) {
                var7[var14] = var12;
            } else {
                var7[var14] = class22.method136(false, var12, 98);
            }
        } else {
            int var15 = var12.length;
            int var32 = var15 - 1;
            int var16 = var12[var32] & 0xFF;
            int var17 = var32 - var4 * 4 * var16;
            class52 var18 = new class52(var12);
            var18.field1033 = var17;
            int[] var19 = new int[var4];
            for (int var20 = 0; var20 < var16; var20++) {
                int var21 = 0;
                for (int var22 = 0; var22 < var4; var22++) {
                    var21 += var18.method383(23);
                    var19[var22] += var21;
                }
            }
            byte[][] var23 = new byte[var4][];
            for (int var24 = 0; var24 < var4; var24++) {
                var23[var24] = new byte[var19[var24]];
                var19[var24] = 0;
            }
            var18.field1033 = var17;
            int var25 = 0;
            for (int var26 = 0; var26 < var16; var26++) {
                int var27 = 0;
                for (int var28 = 0; var28 < var4; var28++) {
                    var27 += var18.method383(85);
                    class123.method830(var12, var25, var23[var28], var19[var28], var27);
                    var19[var28] += var27;
                    var25 += var27;
                }
            }
            for (int var29 = 0; var29 < var4; var29++) {
                int var30;
                if (var5 == null) {
                    var30 = var29;
                } else {
                    var30 = var5[var29];
                }
                if (this.field3660) {
                    var7[var30] = var23[var29];
                } else {
                    var7[var30] = class22.method136(false, var23[var29], 120);
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(III)[B")
    public final byte[] method1243(int arg0, int arg1, int arg2) {
        field3685++;
        if (arg1 < ~arg2 || arg2 >= this.field3646.length || this.field3646[arg2] == null || arg0 < 0 || this.field3646[arg2].length <= arg0) {
            return null;
        }
        if (this.field3646[arg2][arg0] == null) {
            boolean var4 = this.method1242(arg2, null, -61);
            if (!var4) {
                this.method1250(arg1 - 5209, arg2);
                boolean var5 = this.method1242(arg2, null, -110);
                if (!var5) {
                    return null;
                }
            }
        }
        return class56.method408(this.field3646[arg2][arg0], false, (byte) -82);
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(II)V")
    public void method1244(int arg0, int arg1) {
        if (arg1 == 8) {
            field3643++;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)I")
    public final int method1245(int arg0) {
        if (arg0 != 382) {
            this.field3681 = 118;
        }
        field3659++;
        return this.field3646.length;
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(II)[B")
    public final byte[] method1246(int arg0, int arg1) {
        field3677++;
        if (this.field3646.length == 1) {
            return this.method1235(arg1, (byte) -64, 0);
        }
        if (arg0 >= -85) {
            this.method1241(41, (byte) 98, null, -117);
        }
        if (this.field3646[arg1].length != 1) {
            throw new RuntimeException();
        }
        return this.method1235(0, (byte) -64, arg1);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIILfa;II)V")
    public static final void method1247(int arg0, int arg1, int arg2, int arg3, int arg4, class52 arg5, int arg6, int arg7) {
        if (arg2 >= 0 && arg2 < 104 && arg6 >= 0 && arg6 < 104) {
            class21.field372[arg0][arg2][arg6] = 0;
            while (true) {
                int var8 = arg5.method344(arg1 ^ 0xE7);
                if (var8 == 0) {
                    if (arg0 == 0) {
                        class154.field3199[0][arg2][arg6] = -class62.method450(arg6 + arg3 + 556238, 932731 - -arg2 - -arg4, -26079) * 8;
                    } else {
                        class154.field3199[arg0][arg2][arg6] = class154.field3199[arg0 - 1][arg2][arg6] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg5.method344(255);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg0 == 0) {
                        class154.field3199[0][arg2][arg6] = -var9 * 8;
                    } else {
                        class154.field3199[arg0][arg2][arg6] = class154.field3199[arg0 - 1][arg2][arg6] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class26.field488[arg0][arg2][arg6] = arg5.method353(19);
                    class43.field884[arg0][arg2][arg6] = (byte) ((var8 - 2) / 4);
                    class64.field1362[arg0][arg2][arg6] = (byte) class133.method887(var8 + arg7 - 2, 3);
                } else if (var8 <= 81) {
                    class21.field372[arg0][arg2][arg6] = (byte) (var8 - 49);
                } else {
                    class102.field2138[arg0][arg2][arg6] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg5.method344(255);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg5.method344(255);
                    break;
                }
                if (var10 <= 49) {
                    arg5.method344(255);
                }
            }
        }
        if (arg1 == 24) {
            field3661++;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(III)Z")
    public final boolean method1248(int arg0, int arg1, int arg2) {
        field3672++;
        if (arg0 < 0 || this.field3646.length <= arg0 || this.field3646[arg0] == null || arg1 < 0 || this.field3646[arg0].length <= arg1) {
            return false;
        } else if (this.field3646[arg0][arg1] != null) {
            return true;
        } else if (this.field3650[arg0] == null) {
            this.method1250(-5210, arg0);
            int var4 = -60 / ((35 - arg2) / 54);
            return this.field3650[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
    public final void method1249(byte arg0) {
        for (int var2 = 0; var2 < this.field3646.length; var2++) {
            if (this.field3646[var2] != null) {
                for (int var4 = 0; var4 < this.field3646[var2].length; var4++) {
                    this.field3646[var2][var4] = null;
                }
            }
        }
        int var3 = -96 % ((-arg0 - 18) / 43);
        field3676++;
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(II)V")
    public void method1250(int arg0, int arg1) {
        field3675++;
        if (arg0 != -5210) {
            this.method1231(null, -41, -52);
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(ZZ)V")
    public class184(boolean arg0, boolean arg1) {
        this.field3670 = arg0;
        this.field3660 = arg1;
    }
}
