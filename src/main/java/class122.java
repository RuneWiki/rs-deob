import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class122 extends class115 {

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
    private int field2023 = 4096;

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "I")
    private int field2022 = 0;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "Lui;")
    public static class236 field2020 = new class236(4096);

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "[I")
    public static int[] field2024 = new int[] { 5, 0, 0, 6, 0, 0, 0, 2, 0, 0, 0, -1, 0, 0, 0, -2, -2, 7, 0, 5, 4, 7, 0, 0, 1, -2, 0, 0, 0, 1, -1, 6, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 15, 5, 2, -1, 0, 0, 0, 0, 0, 0, 5, 0, 0, 24, 0, 0, -1, 0, -1, 0, 14, 0, 0, 6, 0, 0, 0, 4, 0, 6, 0, -2, 0, 0, 3, -2, 0, 0, 0, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 10, 0, 1, 8, 0, 10, 0, 2, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 6, -1, 7, 0, 0, 0, 4, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 5, 0, -1, -2, 0, -1, 0, 0, -2, 12, 0, 4, 6, -2, 5, -2, 0, 0, 15, -2, 6, -2, 0, 3, 0, 0, 0, -1, 0, 8, 0, 0, 7, 6, 6, 6, 0, 8, 0, 6, 0, 0, 0, 20, 0, 4, 4, 0, 0, 6, 0, 3, 0, 2, 0, 0, 0, 0, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 8, 0, 2, 0, 0, 0, 2, 4, 0, 0, 6, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, -1, 8, -1, 0, -1, 1, -2, -2, 4, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "Lmj;")
    public static class129 field2021;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        ++field2016;
        if (arg1 <= 37) {
            field2020 = null;
        }
        int[] var3 = super.field1872.method182((byte) -114, arg0);
        if (super.field1872.field341) {
            int[] var4 = this.method792(0, 0, arg0);
            for (int var5 = 0; class130.field2297 > var5; ++var5) {
                int var6 = var4[var5];
                if (~var6 > ~this.field2022) {
                    var3[var5] = this.field2022;
                } else if (var6 > this.field2023) {
                    var3[var5] = this.field2023;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZBIIILc;)V")
    public static final void method830(boolean arg0, byte arg1, int arg2, int arg3, int arg4, class237 arg5) {
        ++field2019;
        if (class95.field1502 < 50) {
            if (arg5.field4054 != null && arg5.field4054.length > arg2 && arg5.field4054[arg2] != null) {
                int var6 = arg5.field4054[arg2][0];
                int var7 = var6 >> 8;
                if (arg5.field4054[arg2].length > 1) {
                    int var8 = (int) ((double) arg5.field4054[arg2].length * Math.random());
                    if (~var8 < -1) {
                        var7 = arg5.field4054[arg2][var8];
                    }
                }
                int var9 = 15 & var6;
                int var10 = var6 >> 4 & 7;
                if (var9 == 0) {
                    if (arg0) {
                        class114.method788(var10, 0, var7, 97);
                    }
                } else if (class166.field2828 != 0) {
                    class221.field3799[class95.field1502] = var7;
                    int var11 = (arg4 + -64) / 128;
                    int var12 = (arg3 + -64) / 128;
                    class64.field878[class95.field1502] = var10;
                    class101.field1596[class95.field1502] = 0;
                    if (arg1 < 105) {
                        field2024 = null;
                    }
                    class152.field2642[class95.field1502] = null;
                    class237.field4056[class95.field1502] = (var12 << 16) - -(var11 << 8) + var9;
                    ++class95.field1502;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "(I)V")
    public static void method831(int arg0) {
        if (arg0 != -3832) {
            method831(101);
        }
        field2021 = null;
        field2020 = null;
        field2024 = null;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class122() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (arg0 == 107) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        super.field1879 = arg1.method758(true) == 1;
                    }
                } else {
                    this.field2023 = arg1.method731(false);
                }
            } else {
                this.field2022 = arg1.method731(false);
            }
            ++field2017;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        int[][] var3 = super.field1882.method1242(arg0, -86);
        if (super.field1882.field3344) {
            int[][] var4 = this.method789(0, (byte) -124, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class130.field2297 < ~var11; ++var11) {
                int var12 = var7[var11];
                int var13 = var5[var11];
                int var14 = var6[var11];
                if (this.field2022 > var12) {
                    var8[var11] = this.field2022;
                } else if (~this.field2023 > ~var12) {
                    var8[var11] = this.field2023;
                } else {
                    var8[var11] = var12;
                }
                if (~var13 <= ~this.field2022) {
                    if (var13 > this.field2023) {
                        var10[var11] = this.field2023;
                    } else {
                        var10[var11] = var13;
                    }
                } else {
                    var10[var11] = this.field2022;
                }
                if (this.field2022 <= var14) {
                    if (var14 <= this.field2023) {
                        var9[var11] = var14;
                    } else {
                        var9[var11] = this.field2023;
                    }
                } else {
                    var9[var11] = this.field2022;
                }
            }
        }
        ++field2018;
        return arg1 <= 11 ? null : var3;
    }
}
