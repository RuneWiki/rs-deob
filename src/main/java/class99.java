import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class99 extends class74 {

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
    private int field1577 = 1;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    private int field1581 = 1;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "[I")
    public static int[] field1573 = new int[4096];

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "Lsc;")
    public static class256 field1580;

    @OriginalMember(owner = "client!uk", name = "Z", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "Luf;")
    public static class176 field1584;

    @OriginalMember(owner = "client!uk", name = "Y", descriptor = "Luf;")
    public static class176 field1585;

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
    public class99() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (arg0 == -79) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        super.field1245 = ~arg1.method333((byte) -59) == -2;
                    }
                } else {
                    this.field1581 = arg1.method333((byte) -59);
                }
            } else {
                this.field1577 = arg1.method333((byte) -59);
            }
            ++field1578;
        }
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)V")
    public static final void method769(int arg0) {
        int var1 = 36 % ((arg0 - 53) / 55);
        ++field1583;
        class249.field3839.method1783(0);
        class25.field390.method1783(0);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        ++field1575;
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (super.field1254.field3118) {
            int var4 = this.field1581 + 1 - -this.field1581;
            int var5 = this.field1577 + this.field1577 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field1581 + arg1; var9 <= this.field1581 + arg1; ++var9) {
                int[] var13 = this.method590(0, 0, class218.field3419 & var9);
                int[] var14 = new int[class178.field2662];
                int var15 = 0;
                for (int var16 = -this.field1577; ~this.field1577 <= ~var16; ++var16) {
                    var15 += var13[var16 & class129.field2012];
                }
                int var17 = 0;
                while (~var17 > ~class178.field2662) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class129.field2012 & -this.field1577 + var17];
                    ++var17;
                    var15 = var13[this.field1577 + var17 & class129.field2012] + var18;
                }
                var8[-arg1 + var9 + this.field1581] = var14;
            }
            for (int var10 = 0; ~var10 > ~class178.field2662; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var6 * var11 >> 16;
            }
        }
        if (arg0 != 4) {
            method770((byte) -55);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        ++field1574;
        if (arg1 >= -112) {
            return null;
        } else {
            int[][] var3 = super.field1248.method269(false, arg0);
            if (super.field1248.field550) {
                int var4 = this.field1581 + this.field1581 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field1577 + 1 + this.field1577;
                int[][][] var7 = new int[var4][][];
                int var8 = 65536 / var6;
                for (int var9 = -this.field1581 + arg0; ~var9 >= ~(this.field1581 + arg0); ++var9) {
                    int[][] var19 = this.method592(var9 & class218.field3419, 0, 83);
                    int[][] var20 = new int[3][class178.field2662];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[2];
                    int[] var26 = var19[1];
                    for (int var27 = -this.field1577; ~this.field1577 <= ~var27; ++var27) {
                        int var37 = var27 & class129.field2012;
                        var21 += var24[var37];
                        var23 += var25[var37];
                        var22 += var26[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (var31 < class178.field2662) {
                        var28[var31] = var8 * var21 >> 16;
                        var29[var31] = var8 * var22 >> 16;
                        var30[var31] = var8 * var23 >> 16;
                        int var32 = class129.field2012 & -this.field1577 + var31;
                        int var33 = var21 - var24[var32];
                        ++var31;
                        int var34 = var23 - var25[var32];
                        int var35 = var22 - var26[var32];
                        int var36 = class129.field2012 & var31 - -this.field1577;
                        var21 = var24[var36] + var33;
                        var23 = var25[var36] + var34;
                        var22 = var26[var36] + var35;
                    }
                    var7[this.field1581 + var9 + -arg0] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[2];
                int[] var12 = var3[1];
                for (int var13 = 0; class178.field2662 > var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; ~var4 < ~var17; ++var17) {
                        int[][] var18 = var7[var17];
                        var15 += var18[0][var13];
                        var16 += var18[2][var13];
                        var14 += var18[1][var13];
                    }
                    var10[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)[Lqd;")
    public static final class3[] method770(byte arg0) {
        ++field1582;
        class3[] var1 = new class3[class163.field2489];
        for (int var2 = 0; ~class163.field2489 < ~var2; ++var2) {
            byte[] var3 = class289.field4554[var2];
            int var4 = class270.field4281[var2] * class107.field1717[var2];
            if (!class186.field2809[var2]) {
                int[] var5 = new int[var4];
                for (int var6 = 0; var6 < var4; ++var6) {
                    var5[var6] = class35.field560[class3.method48(var3[var6], 255)];
                }
                var1[var2] = new class49(class205.field3187, class174.field2581, class184.field2764[var2], class239.field3698[var2], class270.field4281[var2], class107.field1717[var2], var5);
            } else {
                byte[] var7 = class256.field3933[var2];
                int[] var8 = new int[var4];
                for (int var9 = 0; ~var9 > ~var4; ++var9) {
                    var8[var9] = class115.method840(class3.method48(-16777216, var7[var9] << 24), class35.field560[class3.method48(255, var3[var9])]);
                }
                var1[var2] = new class213(class205.field3187, class174.field2581, class184.field2764[var2], class239.field3698[var2], class270.field4281[var2], class107.field1717[var2], var8);
            }
        }
        if (arg0 > -127) {
            method769(-6);
        }
        class239.method1619(65306);
        return var1;
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(Z)V")
    public static void method771(boolean arg0) {
        field1573 = null;
        field1584 = null;
        field1580 = null;
        field1585 = null;
        if (arg0) {
            method769(-119);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method772(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg6 == ~arg9 && ~arg0 == ~arg8 && arg3 == arg4 && ~arg5 == ~arg7) {
            class295.method1978(arg4, arg7, arg0, 0, arg6, arg2);
        } else {
            int var10 = arg0;
            int var11 = arg6 * 3;
            int var12 = arg9 * 3;
            int var13 = arg0 * 3;
            int var14 = arg6;
            int var15 = arg8 * 3;
            int var16 = arg3 * 3;
            int var17 = arg5 * 3;
            int var18 = -var17 + arg7 - (-var15 - -arg0);
            int var19 = -var16 + arg4 - -var12 + -arg6;
            int var20 = -var12 + var16 - (-var11 + var12);
            int var21 = -var15 + var17 - var15 + var13;
            int var22 = var12 - var11;
            int var23 = -var13 + var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var18 * var26;
                int var29 = var21 * var25;
                int var30 = var20 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var30 >> 12) + arg6;
                int var34 = (var28 - -var29 - -var32 >> 12) + arg0;
                class295.method1978(var33, var34, var10, 0, var14, arg2);
                var14 = var33;
                var10 = var34;
            }
        }
        if (arg1 > 61) {
            ++field1579;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method773(String arg0, boolean arg1) {
        ++field1576;
        if (class46.field732 != null) {
            int var2 = 0;
            long var3 = class247.method1668(arg0, true);
            if (var3 != 0L) {
                while (var2 < class46.field732.length && ~class46.field732[var2].field1408 != ~var3) {
                    ++var2;
                }
                if (~class46.field732.length < ~var2 && class46.field732[var2] != null) {
                    if (arg1) {
                        method771(false);
                    }
                    class292.field4607.method1251(101, (byte) -48);
                    ++class7.field130;
                    class292.field4607.method337(2103219728, class46.field732[var2].field1408);
                }
            }
        }
    }

    static {
        for (int var0 = 0; ~var0 > -4097; ++var0) {
            field1573[var0] = class209.method1397(var0, (byte) 124);
        }
        field1580 = new class256(64);
        field1586 = 0;
    }
}
