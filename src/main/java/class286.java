import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class286 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "[I")
    private int[] field4817;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "[I")
    private int[] field4815;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Lnl;")
    private class219 field4830;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lnl;")
    private class219 field4821;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "[Lnl;")
    private class219[] field4826;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field4822 = 0;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "[Z")
    public static boolean[] field4818 = new boolean[8];

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field4828 = -1;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Lbd;")
    public static class162 field4829 = class17.method142(0, "; Expires=");

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Lbj;")
    public static class276 field4831;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZILda;ZDLgj;)[B", line = 14)
    public final byte[] method1969(int arg0, boolean arg1, int arg2, class143 arg3, boolean arg4, double arg5, class294 arg6) {
        field4814++;
        byte[] var9 = new byte[arg0 * 4 * arg2];
        class92.method700(-383561044, arg5);
        class216.field3614 = arg6;
        class301.field5012 = arg3;
        class260.method1795(8827, arg2, arg0);
        if (arg1) {
            return (byte[]) null;
        }
        for (int var10 = 0; var10 < this.field4826.length; var10++) {
            this.field4826[var10].method1584(arg0, arg2, (byte) -125);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg4) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field4830.field3647) {
                int[] var17 = this.field4830.method41(true, var12);
                var14 = var17;
                var16 = var17;
                var15 = var17;
            } else {
                int[][] var13 = this.field4830.method219(var12, (byte) 83);
                var14 = var13[2];
                var15 = var13[1];
                var16 = var13[0];
            }
            int[] var18;
            if (this.field4821.field3647) {
                var18 = this.field4821.method41(!arg1, var12);
            } else {
                var18 = this.field4821.method219(var12, (byte) 83)[0];
            }
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = var16[var19] >> 4;
                int var21 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = class125.field2277[var20];
                int var23 = var14[var19] >> 4;
                int var24 = class125.field2277[var21];
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class125.field2277[var23];
                int var26;
                if (var22 == 0 && var24 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (byte) var22;
                var9[var11++] = (byte) var24;
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var26;
                if (arg4) {
                    var11 += (arg2 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field4826.length; var27++) {
            this.field4826[var27].method216(-70);
        }
        return var9;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 156)
    public static void method1970(int arg0) {
        field4818 = null;
        if (arg0 == -16777216) {
            field4831 = null;
            field4829 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Laf;", line = 182)
    public static final class223 method1971(int arg0) {
        field4823++;
        class123.field2240 = arg0;
        return class47.method341((byte) 63);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLbd;I)V", line = 197)
    public static final void method1972(boolean arg0, class162 arg1, int arg2) {
        field4827++;
        class162 var3 = arg1.method1250(68);
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class173.field2988; var6++) {
            class116 var7 = class304.method2075(var6, 4);
            if ((!arg0 || var7.field2121) && var7.field2102 == -1 && var7.field2063 == -1 && var7.field2074 == 0 && var7.field2091.method1250(123).method1244((byte) 23, var3) != -1) {
                if (var5 >= 250) {
                    class72.field1149 = null;
                    class66.field1029 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var8 = new short[var4.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var4[var9];
                    }
                    var4 = var8;
                }
                var4[var5++] = (short) var6;
            }
        }
        int var10 = 31 % ((62 - arg2) / 46);
        class72.field1149 = var4;
        class66.field1029 = var5;
        class70.field1127 = 0;
        class162[] var11 = new class162[class66.field1029];
        for (int var12 = 0; var12 < class66.field1029; var12++) {
            var11[var12] = class304.method2075(var4[var12], 4).field2091;
        }
        class151.method1186(class72.field1149, 1, var11);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lda;ZZILgj;IID)[I", line = 268)
    public final int[] method1973(class143 arg0, boolean arg1, boolean arg2, int arg3, class294 arg4, int arg5, int arg6, double arg7) {
        field4816++;
        class92.method700(-383561044, arg7);
        class301.field5012 = arg0;
        class216.field3614 = arg4;
        int[] var10 = new int[arg5 * arg6];
        class260.method1795(8827, arg5, arg6);
        for (int var11 = 0; var11 < this.field4826.length; var11++) {
            this.field4826[var11].method1584(arg6, arg5, (byte) -96);
        }
        if (arg3 != -1976238812) {
            this.field4830 = (class219) null;
        }
        int var12;
        byte var13;
        int var14;
        if (arg1) {
            var12 = -1;
            var13 = -1;
            var14 = arg5 - 1;
        } else {
            var13 = 1;
            var12 = arg5;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field4830.field3647) {
                int[] var17 = this.field4830.method41(true, var16);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field4830.method219(var16, (byte) 83);
                var18 = var21[0];
                var19 = var21[1];
                var20 = var21[2];
            }
            for (int var22 = var14; var22 != var12; var22 += var13) {
                int var23 = var20[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class125.field2277[var23];
                int var25 = var18[var22] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                int var26 = var19[var22] >> 4;
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class125.field2277[var25];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class125.field2277[var26];
                var10[var15++] = (var27 << 16) + (var28 << 8) + var24;
                if (arg2) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field4826.length; var29++) {
            this.field4826[var29].method216(arg3 + 1976238797);
        }
        return var10;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Lud;", line = 416)
    public static final class79 method1974(boolean arg0) {
        if (arg0) {
            method1972(false, (class162) null, 80);
        }
        field4819++;
        int var1 = class260.field4333[0] * class190.field3253[0];
        byte[] var2 = class317.field5350[0];
        class79 var5;
        if (class120.field2194[0]) {
            byte[] var6 = class101.field1848[0];
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class289.method2005(class306.field5152[class92.method695(255, var2[var8])], class92.method695(-16777216, var6[var8] << 24));
            }
            var5 = new class232(class238.field3962, class277.field4637, class127.field2312[0], class40.field646[0], class190.field3253[0], class260.field4333[0], var7);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class306.field5152[class92.method695(var2[var4], 255)];
            }
            var5 = new class79(class238.field3962, class277.field4637, class127.field2312[0], class40.field646[0], class190.field3253[0], class260.field4333[0], var3);
        }
        class247.method1738(1);
        return var5;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V", line = 466)
    public static final void method1975(int arg0) {
        int var1 = -2 % ((arg0 + 78) / 38);
        class62.field955.method1529(false);
        field4825++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V", line = 481)
    public static final void method1976(int arg0, int arg1, int arg2) {
        field4833++;
        if (arg2 < 74) {
            field4824 = -104;
        }
        class63 var3 = class46.method332(5, arg0, -12770);
        var3.method430(false);
        var3.field971 = arg1;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 496)
    public class286() {
        this.field4817 = new int[0];
        this.field4815 = new int[0];
        this.field4830 = new class314();
        this.field4830.field3653 = 1;
        this.field4821 = new class314();
        this.field4826 = new class219[] { this.field4830, this.field4821 };
        this.field4821.field3653 = 1;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lb;)V", line = 509)
    public class286(class94 arg0) {
        int var2 = arg0.method756(915905888);
        this.field4826 = new class219[var2];
        int var3 = 0;
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class219 var7 = class1.method2((byte) -118, arg0);
            if (var7.method215((byte) -127) >= 0) {
                var3++;
            }
            if (var7.method1396(1) >= 0) {
                var5++;
            }
            int var8 = var7.field3649.length;
            var4[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var4[var6][var9] = arg0.method756(915905888);
            }
            this.field4826[var6] = var7;
        }
        this.field4815 = new int[var5];
        int var10 = 0;
        this.field4817 = new int[var3];
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class219 var13 = this.field4826[var12];
            int var14 = var13.field3649.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field3649[var15] = this.field4826[var4[var12][var15]];
            }
            int var16 = var13.method215((byte) -128);
            int var17 = var13.method1396(1);
            if (var16 > 0) {
                this.field4817[var11++] = var16;
            }
            if (var17 > 0) {
                this.field4815[var10++] = var17;
            }
            var4[var12] = null;
        }
        this.field4830 = this.field4826[arg0.method756(915905888)];
        this.field4821 = this.field4826[arg0.method756(915905888)];
        int[][] var18 = (int[][]) null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLda;Lgj;)Z", line = 596)
    public final boolean method1977(byte arg0, class143 arg1, class294 arg2) {
        field4832++;
        for (int var4 = 0; var4 < this.field4817.length; var4++) {
            if (!arg1.method1118(this.field4817[var4], 26604)) {
                return false;
            }
        }
        int var5 = -74 / ((29 - arg0) / 63);
        for (int var6 = 0; var6 < this.field4815.length; var6++) {
            if (!arg2.method148(this.field4815[var6], (byte) -81)) {
                return false;
            }
        }
        return true;
    }
}
