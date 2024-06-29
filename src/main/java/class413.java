import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class413 {

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Lwga;")
    private class745 field5988;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lqm;")
    private class146 field5993;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public int field5990;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    private int field6000;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "[B")
    public byte[] field5989;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    private int field6001;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    private int field5998;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    private int field5995;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Z")
    public static boolean field5994 = false;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "Lmu;")
    public static class303 field6003 = new class303(5, 6);

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "Z")
    public static boolean field6004 = false;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "[[Lmc;")
    private class136[][] field5999;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBLr;I)Z")
    public final boolean method2553(int arg0, byte arg1, class184 arg2, int arg3) {
        field5996++;
        class261 var5 = (class261) arg2;
        int var6 = 13 % ((arg1 + 21) / 45);
        int var7 = var5.field3741 + arg3 + 1;
        int var8 = var5.field3735 + arg0 + 1;
        int var9 = this.field5990 * var7 + var8;
        int var10 = var5.field3734;
        int var11 = var5.field3733;
        int var12 = this.field5990 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var9 += this.field5990 * var13;
            var7 = 1;
        }
        if ((var7 + var10) >= this.field6000) {
            int var14 = var7 + var10 + 1 - this.field6000;
            var10 -= var14;
        }
        if (var8 <= 0) {
            int var15 = 1 - var8;
            var8 = 1;
            var12 += var15;
            var11 -= var15;
            var9 += var15;
        }
        if (var8 + var11 >= this.field5990) {
            int var16 = var11 + var8 + 1 - this.field5990;
            var11 -= var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field5990 + var12;
            return class228.method1602(var18, var9, var17, this.field5989, var11, -16259, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILr;II)V")
    public final void method2554(int arg0, class184 arg1, int arg2, int arg3) {
        field5991++;
        class261 var5 = (class261) arg1;
        int var6 = var5.field3735 + arg3 + 1;
        int var7 = var5.field3741 + arg2 + arg0;
        int var8 = this.field5990 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field3734;
        int var11 = var5.field3733;
        int var12 = this.field5990 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var8 += this.field5990 * var13;
            var10 -= var13;
            var7 = 1;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field6000) {
            int var15 = var7 + var10 + 1 - this.field6000;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var14 += var16;
            var12 += var16;
            var6 = 1;
            var8 += var16;
            var9 += var16;
            var11 -= var16;
        }
        if (this.field5990 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field5990;
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class527.method3051(var12, var11, (byte) -116, var14, var10, var8, this.field5989, var5.field3738, var9);
            this.method2559(var7, -1, var6, var10, var11);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIZ[[ZI)V")
    public final void method2555(int arg0, int arg1, int arg2, boolean arg3, boolean[][] arg4, int arg5) {
        field5992++;
        this.field5988.method4107(false, true);
        this.field5988.method4156(-32, false);
        this.field5988.method4076(79, 1);
        this.field5988.method4144(true, 1);
        this.field5988.method4073(false, false, -2, (byte) 82);
        float var7 = 1.0F / (float) (this.field5988.field10239 * arg0);
        if (arg3) {
            for (int var8 = 0; var8 < this.field5995; var8++) {
                int var9 = var8 << this.field6001;
                int var10 = var8 + 1 << this.field6001;
                label142: for (int var11 = 0; var11 < this.field5998; var11++) {
                    if (this.field5999[var11][var8] != null) {
                        int var12 = var11 << this.field6001;
                        int var13 = var11 + 1 << this.field6001;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if ((-arg1) <= (var14 - arg2) && arg1 >= var14 - arg2) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if (-arg1 <= var15 - arg5 && arg1 >= var15 - arg5 && arg4[var14 + arg1 - arg2][var15 + arg1 - arg5]) {
                                        class81 var16 = this.field5988.method4077(false);
                                        var16.method775(1.0F, var7, var7, (byte) -65);
                                        var16.method752(-var11, -var8, 0);
                                        this.field5988.method4099(arg0 ^ 0xFFFFFF60, class620.field8440);
                                        this.field5999[var11][var8].method1108((byte) 116);
                                        continue label142;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field5995; var17++) {
                int var18 = var17 << this.field6001;
                int var19 = var17 + 1 << this.field6001;
                for (int var20 = 0; var20 < this.field5998; var20++) {
                    class136 var21 = this.field5999[var20][var17];
                    if (var21 != null) {
                        class163 var22 = this.field5988.method4079(118, var21.field2294 * 3);
                        Buffer var23 = var22.method1241(true, false);
                        if (var23 != null) {
                            Stream var24 = this.field5988.method4122(var23, 9179);
                            int var25 = 0;
                            int var26 = var20 << this.field6001;
                            int var27 = var20 + 1 << this.field6001;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if (var28 - arg5 >= -arg1 && arg1 >= (var28 - arg5)) {
                                    int var30 = this.field5993.field3937 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if ((-arg1) <= (var31 - arg2) && arg1 >= var31 - arg2 && arg4[var31 + arg1 - arg2][arg1 + var28 - arg5]) {
                                            short[] var32 = this.field5993.field2422[var30];
                                            if (var32 != null) {
                                                if (Stream.method3789()) {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var24.method3790(var32[var34] & 0xFFFF);
                                                        var25++;
                                                    }
                                                } else {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var25++;
                                                        var24.method3779(var32[var33] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method3784();
                            if (var22.method1239(-23) && var25 > 0) {
                                class81 var29 = this.field5988.method4077(false);
                                var29.method775(1.0F, var7, var7, (byte) -62);
                                var29.method752(-var20, -var17, 0);
                                this.field5988.method4099(arg0 ^ 0xFFFFFF60, class620.field8440);
                                var21.method1112(-82, var22, var25 / 3);
                            }
                        }
                    }
                }
            }
        }
        this.field5988.method4116(-8629);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method2556(int arg0) {
        int var1 = -46 / ((65 - arg0) / 61);
        field6003 = null;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public final void method2557(int arg0) {
        this.field5999 = new class136[this.field5998][this.field5995];
        field6002++;
        if (arg0 != 128) {
            this.method2555(-93, -74, 10, false, null, 48);
        }
        for (int var2 = 0; var2 < this.field5995; var2++) {
            for (int var3 = 0; var3 < this.field5998; var3++) {
                this.field5999[var3][var2] = new class136(this.field5988, this, this.field5993, var3, var2, this.field6001, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field5999[var3][var2].field2294 == 0) {
                    this.field5999[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILr;I)V")
    public final void method2558(int arg0, int arg1, class184 arg2, int arg3) {
        field5997++;
        class261 var5 = (class261) arg2;
        int var6 = var5.field3741 + arg3 + 1;
        int var7 = var5.field3735 + arg1 + 1;
        if (arg0 != 287) {
            this.method2559(-49, -3, 16, -9, -115);
        }
        int var8 = this.field5990 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field3734;
        int var11 = var5.field3733;
        int var12 = this.field5990 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var8 += this.field5990 * var13;
            var10 -= var13;
            var9 += var11 * var13;
            var6 = 1;
        }
        int var14 = 0;
        if (this.field6000 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field6000;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var12 += var16;
            var14 += var16;
            var8 += var16;
            var7 = 1;
            var11 -= var16;
        }
        if (this.field5990 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field5990;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class196.method1399(var11, this.field5989, var5.field3738, var9, arg0 + 13593, var10, var8, var12, var14);
            this.method2559(var6, -1, var7, var10, var11);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V")
    private final void method2559(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5987++;
        if (this.field5999 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg4 - 1 - 1 >> 7;
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 + arg3 + arg1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class136[] var11 = this.field5999[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field2293 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lwga;Lqm;)V")
    public class413(class745 arg0, class146 arg1) {
        this.field5988 = arg0;
        this.field5993 = arg1;
        this.field5990 = (this.field5993.field3942 * this.field5993.field3937 >> this.field5988.field10221) + 2;
        this.field6000 = (this.field5993.field3942 * this.field5993.field3940 >> this.field5988.field10221) + 2;
        this.field5989 = new byte[this.field6000 * this.field5990];
        this.field6001 = this.field5988.field10221 + 7 - this.field5993.field3938;
        this.field5998 = this.field5993.field3937 >> this.field6001;
        this.field5995 = this.field5993.field3940 >> this.field6001;
    }
}
