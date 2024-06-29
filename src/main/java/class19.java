import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class19 extends class64 {

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    private int field404 = 1;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "I")
    private int field406 = 1;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "Lcd;")
    public static class23 field400 = class54.method414("::fpsoff", -1);

    @OriginalMember(owner = "client!c", name = "S", descriptor = "Lcd;")
    public static class23 field401 = class54.method414("<img=1>", -1);

    @OriginalMember(owner = "client!c", name = "T", descriptor = "Lsa;")
    public static class162 field402 = new class162(100);

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "Lfc;")
    public static class49 field399;

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "[[I")
    public static int[][] field407;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
    public static final void method124(int arg0) {
        class193 var1 = class176.field3499;
        synchronized (class176.field3499) {
            class63.field1451 = class69.field1623;
            if (~class66.field1560 <= -1) {
                while (class66.field1560 != class111.field2356) {
                    int var2 = class129.field2677[class111.field2356];
                    class111.field2356 = class111.field2356 + 1 & 127;
                    if (var2 < 0) {
                        class110.field2340[~var2] = false;
                    } else {
                        class110.field2340[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; ++var3) {
                    class110.field2340[var3] = false;
                }
                class66.field1560 = class111.field2356;
            }
            if (arg0 != 2) {
                return;
            }
            class69.field1623 = class101.field2154;
        }
        ++field408;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field1510 = arg2.method1202(-80) == 1;
                }
            } else {
                this.field406 = arg2.method1202(-65);
            }
        } else {
            this.field404 = arg2.method1202(-124);
        }
        int var5 = 109 % ((7 - arg0) / 43);
        ++field405;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILkh;I)Lbd;")
    public static final class14 method125(int arg0, class97 arg1, int arg2) {
        if (arg0 != 12989) {
            field400 = null;
        }
        ++field398;
        byte[] var3 = arg1.method653((byte) 122, arg2);
        return var3 == null ? null : new class14(var3);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != -9421) {
            this.method35(-99, -118);
        }
        int[] var3 = super.field1513.method1033(-101, arg0);
        ++field403;
        if (super.field1513.field3368) {
            int var4 = this.field406 + 1 + this.field406;
            int var5 = this.field404 - -1 + this.field404;
            int[][] var6 = new int[var4][];
            for (int var7 = -this.field406 + arg0; ~(this.field406 + arg0) <= ~var7; ++var7) {
                int[] var11 = this.method479(arg1 + 9420, var7 & class81.field1760, 0);
                int[] var12 = new int[class168.field3367];
                int var13 = 0;
                for (int var14 = -this.field404; var14 <= this.field404; ++var14) {
                    var13 += var11[class163.field3266 & var14];
                }
                int var15 = 0;
                while (var15 < class168.field3367) {
                    var12[var15] = var13 / var5;
                    int var16 = var13 - var11[class163.field3266 & -this.field404 + var15];
                    ++var15;
                    var13 = var11[class163.field3266 & this.field404 + var15] + var16;
                }
                var6[this.field406 - arg0 + var7] = var12;
            }
            for (int var8 = 0; ~class168.field3367 < ~var8; ++var8) {
                int var9 = 0;
                for (int var10 = 0; ~var10 > ~var4; ++var10) {
                    var9 += var6[var10][var8];
                }
                var3[var8] = var9 / var4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
    public static void method126(int arg0) {
        field401 = null;
        field402 = null;
        field400 = null;
        field407 = null;
        field399 = null;
        if (arg0 != 32404) {
            field401 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        int[][] var3 = super.field1508.method846(7287, arg0);
        if (!arg1) {
            field400 = null;
        }
        ++field410;
        if (super.field1508.field2757) {
            int var4 = this.field406 + this.field406 + 1;
            int var5 = this.field404 + this.field404 + 1;
            int[][][] var6 = new int[var4][][];
            for (int var7 = -this.field406 + arg0; ~var7 >= ~(this.field406 + arg0); ++var7) {
                int[][] var17 = this.method482(0, class81.field1760 & var7, (byte) -125);
                int var18 = 0;
                int var19 = 0;
                int[][] var20 = new int[3][class168.field3367];
                int var21 = 0;
                int[] var22 = var17[0];
                int[] var23 = var17[1];
                int[] var24 = var17[2];
                for (int var25 = -this.field404; this.field404 >= var25; ++var25) {
                    int var35 = var25 & class163.field3266;
                    var19 += var23[var35];
                    var18 += var22[var35];
                    var21 += var24[var35];
                }
                int[] var26 = var20[0];
                int[] var27 = var20[2];
                int[] var28 = var20[1];
                int var29 = 0;
                while (var29 < class168.field3367) {
                    var26[var29] = var18 / var5;
                    var28[var29] = var19 / var5;
                    var27[var29] = var21 / var5;
                    int var30 = var29 - this.field404 & class163.field3266;
                    int var31 = var21 - var24[var30];
                    int var32 = var18 - var22[var30];
                    ++var29;
                    int var33 = var19 - var23[var30];
                    int var34 = class163.field3266 & var29 - -this.field404;
                    var18 = var22[var34] + var32;
                    var21 = var24[var34] + var31;
                    var19 = var23[var34] + var33;
                }
                var6[-arg0 + this.field406 + var7] = var20;
            }
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class168.field3367; ++var11) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                for (int var15 = 0; ~var15 > ~var4; ++var15) {
                    int[][] var16 = var6[var15];
                    var13 += var16[1][var11];
                    var12 += var16[0][var11];
                    var14 += var16[2][var11];
                }
                var10[var11] = var12 / var4;
                var9[var11] = var13 / var4;
                var8[var11] = var14 / var4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class19() {
        super(1, false);
    }
}
