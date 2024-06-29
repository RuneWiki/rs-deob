import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class77 {

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "Lrv;")
    private class111 field941;

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "Lvia;")
    private class564 field934;

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
    private int field931;

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "[B")
    public byte[] field940;

    @OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
    private int field945;

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
    private int field932;

    @OriginalMember(owner = "client!qw", name = "s", descriptor = "I")
    private int field946;

    @OriginalMember(owner = "client!qw", name = "h", descriptor = "Lbo;")
    public static class731 field935 = new class731(0, 0);

    @OriginalMember(owner = "client!qw", name = "v", descriptor = "I")
    public static int field949 = 0;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!qw", name = "t", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!qw", name = "u", descriptor = "Luq;")
    public static class163 field948;

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "[[Lkj;")
    private class567[][] field942;

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "[[[B")
    public static byte[][][] field943;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(BILr;I)Z")
    public final boolean method613(byte arg0, int arg1, class184 arg2, int arg3) {
        field937++;
        class520 var5 = (class520) arg2;
        int var6 = var5.field6939 + arg1 + 1;
        int var7 = var5.field6941 + arg3 + 1;
        if (arg0 != 95) {
            this.field940 = null;
        }
        int var8 = this.field933 * var6 + var7;
        int var9 = var5.field6925;
        int var10 = var5.field6931;
        int var11 = this.field933 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var6 = 1;
            var9 -= var12;
            var8 += this.field933 * var12;
        }
        if (this.field931 <= var6 + var9) {
            int var13 = var9 + var6 + 1 - this.field931;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var11 += var14;
            var10 -= var14;
            var8 += var14;
            var7 = 1;
        }
        if ((var7 + var10) >= this.field933) {
            int var15 = var10 + var7 + 1 - this.field933;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field933 + var11;
            return class315.method1924(this.field940, var8, var10, var16, 1, var17, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "([[ZIIIZI)V")
    public final void method614(boolean[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field944++;
        this.field941.method817(false, -8043);
        this.field941.method844((byte) 36, false);
        this.field941.method836(arg3 - 129, 1);
        this.field941.method887((byte) 117, 1);
        this.field941.method856(-2, arg3 + 105, false, false);
        float var7 = 1.0F / (float) (this.field941.field1765 * 128);
        if (arg3 != 0) {
            method618(null, -73, -54, 76, null, false, -34, -14);
        }
        if (arg4) {
            for (int var26 = 0; var26 < this.field946; var26++) {
                int var27 = var26 << this.field945;
                int var28 = var26 + 1 << this.field945;
                label94: for (int var29 = 0; var29 < this.field932; var29++) {
                    if (this.field942[var29][var26] != null) {
                        int var30 = var29 << this.field945;
                        int var31 = var29 + 1 << this.field945;
                        for (int var32 = var30; var32 < var31; var32++) {
                            if ((-arg1) <= (var32 - arg2) && var32 - arg2 <= arg1) {
                                for (int var33 = var27; var33 < var28; var33++) {
                                    if ((var33 - arg5) >= (-arg1) && (var33 - arg5) <= arg1 && arg0[var32 + arg1 - arg2][arg1 + var33 - arg5]) {
                                        class615 var34 = this.field941.method916(arg3);
                                        var34.method3366(var7, var7, 1.0F, (byte) -49);
                                        var34.method1730(-var29, -var26, 0);
                                        this.field941.method878(arg3 + 3, class91.field1105);
                                        this.field942[var29][var26].method3132((byte) -67);
                                        continue label94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field946; var8++) {
                int var9 = var8 << this.field945;
                int var10 = var8 + 1 << this.field945;
                for (int var11 = 0; var11 < this.field932; var11++) {
                    class567 var12 = this.field942[var11][var8];
                    if (var12 != null) {
                        class268 var13 = this.field941.method855((byte) -107, var12.field7460 * 3);
                        Buffer var14 = var13.method587(arg3 ^ 0x78BB, true);
                        if (var14 != null) {
                            Stream var15 = this.field941.method820((byte) -20, var14);
                            int var16 = 0;
                            int var17 = var11 << this.field945;
                            int var18 = var11 + 1 << this.field945;
                            for (int var19 = var9; var19 < var10; var19++) {
                                if (-arg1 <= var19 - arg5 && (var19 - arg5) <= arg1) {
                                    int var21 = this.field934.field3992 * var19 + var17;
                                    for (int var22 = var17; var22 < var18; var22++) {
                                        if ((var22 - arg2) >= (-arg1) && (var22 - arg2) <= arg1 && arg0[arg1 + var22 - arg2][var19 + arg1 - arg5]) {
                                            short[] var23 = this.field934.field7388[var21];
                                            if (var23 != null) {
                                                if (Stream.method3739()) {
                                                    for (int var24 = 0; var24 < var23.length; var24++) {
                                                        var15.method3735(var23[var24] & 0xFFFF);
                                                        var16++;
                                                    }
                                                } else {
                                                    for (int var25 = 0; var25 < var23.length; var25++) {
                                                        var16++;
                                                        var15.method3737(var23[var25] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var21++;
                                    }
                                }
                            }
                            var15.method3734();
                            if (var13.method586(-17694) && var16 > 0) {
                                class615 var20 = this.field941.method916(arg3);
                                var20.method3366(var7, var7, 1.0F, (byte) -49);
                                var20.method1730(-var11, -var8, 0);
                                this.field941.method878(arg3 + 3, class91.field1105);
                                var12.method3131(var13, var16 / 3, 0);
                            }
                        }
                    }
                }
            }
        }
        this.field941.method819(-79);
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILr;II)V")
    public final void method615(int arg0, class184 arg1, int arg2, int arg3) {
        field936++;
        class520 var5 = (class520) arg1;
        int var6 = var5.field6939 + arg0 + arg3;
        int var7 = var5.field6941 + arg2 + 1;
        int var8 = var7 + (this.field933 * var6);
        int var9 = 0;
        int var10 = var5.field6925;
        int var11 = var5.field6931;
        int var12 = this.field933 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 += var11 * var14;
            var6 = 1;
            var8 += this.field933 * var14;
            var10 -= var14;
        }
        if (this.field931 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field931;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var7 = 1;
            var8 += var16;
            var13 += var16;
            var11 -= var16;
            var9 += var16;
        }
        if (this.field933 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field933;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class684.method3858(var10, var12, var9, var5.field6934, arg0 + 2, var11, this.field940, var8, var13);
            this.method620(var11, 42, var6, var7, var10);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(BII)Z")
    public static final boolean method616(byte arg0, int arg1, int arg2) {
        field930++;
        int var3 = 15 / ((arg0 - 37) / 39);
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V")
    public static void method617(byte arg0) {
        field935 = null;
        field943 = null;
        field948 = null;
        if (arg0 < 20) {
            method616((byte) 82, 68, -58);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lha;IIILjava/lang/String;ZII)V")
    public static final void method618(class59 arg0, int arg1, int arg2, int arg3, String arg4, boolean arg5, int arg6, int arg7) {
        if (class575.field7552 == null || class588.field7676 == null) {
            if (class84.field1023.method2216(class300.field4269, 111) && class84.field1023.method2216(class756.field10507, 125)) {
                class575.field7552 = arg0.method415(class720.method4034(class84.field1023, class300.field4269, 0), true);
                class720 var8 = class720.method4034(class84.field1023, class756.field10507, 0);
                class588.field7676 = arg0.method415(var8, true);
                var8.method4044();
                class295.field4222 = arg0.method415(var8, true);
            } else {
                arg0.method504(arg3, arg7, arg2, arg1, 255 - class540.field7153 << 24 | class591.field7695, 1);
            }
        }
        field929++;
        if (class575.field7552 != null && class588.field7676 != null) {
            int var9 = (arg2 - class588.field7676.method1042() * 2) / class575.field7552.method1042();
            for (int var10 = 0; var10 < var9; var10++) {
                class575.field7552.method1035(class588.field7676.method1042() + (arg3 + (class575.field7552.method1042() * var10)), arg7);
            }
            class588.field7676.method1035(arg3, arg7);
            class295.field4222.method1035(arg2 + arg3 - class295.field4222.method1042(), arg7);
        }
        class64.field785.method527(arg5, arg3 + 3, arg4, arg7 + 14, -1, -16777216 | class117.field1893);
        arg0.method504(arg3, arg1 + arg7, arg2, arg6 - arg1, class591.field7695 | -class540.field7153 + 255 << 24, 1);
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIILr;)V")
    public final void method619(int arg0, int arg1, int arg2, class184 arg3) {
        field938++;
        class520 var5 = (class520) arg3;
        int var6 = var5.field6939 + arg0 + 1;
        int var7 = var5.field6941 + arg1 + 1;
        int var8 = var7 + (this.field933 * var6);
        int var9 = 0;
        int var10 = var5.field6925;
        int var11 = var5.field6931;
        int var12 = this.field933 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var9 += var11 * var14;
            var10 -= var14;
            var8 += this.field933 * var14;
        }
        if ((var6 + var10) >= this.field931) {
            int var15 = var6 + var10 + 1 - this.field931;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var8 += var16;
            var7 = 1;
            var13 += var16;
            var12 += var16;
            var9 += var16;
        }
        if (arg2 != -11697) {
            return;
        }
        if (this.field933 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field933;
            var13 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class416.method2416(var13, var8, var11, var10, 13427, var5.field6934, this.field940, var9, var12);
            this.method620(var11, arg2 + 11816, var6, var7, var10);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIII)V")
    private final void method620(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field939++;
        if (this.field942 == null || arg1 < 32) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg0 + arg3 - 1 - 1 >> 7;
        int var8 = arg2 - 1 >> 7;
        int var9 = arg2 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class567[] var11 = this.field942[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field7449 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(B)V")
    public static final void method621(byte arg0) {
        field928++;
        if (!class12.field194 && arg0 == 3) {
            class12.field194 = true;
            class528.field7009 += (24.0F - class528.field7009) / 2.0F;
            class616.field8238 = true;
        }
    }

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "(B)V")
    public final void method622(byte arg0) {
        field947++;
        this.field942 = new class567[this.field932][this.field946];
        for (int var2 = 0; var2 < this.field946; var2++) {
            for (int var3 = 0; var3 < this.field932; var3++) {
                this.field942[var3][var2] = new class567(this.field941, this, this.field934, var3, var2, this.field945, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field942[var3][var2].field7460 == 0) {
                    this.field942[var3][var2] = null;
                }
            }
        }
        if (arg0 <= 27) {
            field948 = null;
        }
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lrv;Lvia;)V")
    public class77(class111 arg0, class564 arg1) {
        this.field941 = arg0;
        this.field934 = arg1;
        this.field933 = (this.field934.field3992 * this.field934.field3989 >> this.field941.field1728) + 2;
        this.field931 = (this.field934.field3996 * this.field934.field3989 >> this.field941.field1728) + 2;
        this.field940 = new byte[this.field933 * this.field931];
        this.field945 = this.field941.field1728 + 7 - this.field934.field3990;
        this.field932 = this.field934.field3992 >> this.field945;
        this.field946 = this.field934.field3996 >> this.field945;
    }
}
