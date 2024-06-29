import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class482 extends class264 {

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    private int field6812 = 0;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    private int field6814 = 4096;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "[[I")
    public static int[][] field6818 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "Lrc;")
    public static class108 field6819 = new class108(54, 20);

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "Leh;")
    public static class137 field6821;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)V")
    public static final void method2839(int arg0) {
        ++field6811;
        for (int var1 = 0; var1 < 5; ++var1) {
            class394.field5441[var1] = false;
        }
        class412.field5653 = class135.field1884;
        class133.field1867 = class184.field2784;
        class345.field4774 = class364.field5010;
        class111.field1569 = -1;
        class227.field3279 = 0;
        class442.field6271 = class103.field1455;
        class149.field2056 = class366.field5028;
        class390.field5393 = 5;
        if (arg0 >= 123) {
            class314.field4446 = class303.field4302;
            class374.field5179 = 0;
            class15.field149 = -1;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
    public static final int method2840(int arg0, int arg1, int arg2) {
        if (arg0 < 83) {
            method2840(-128, 32, 70);
        }
        ++field6820;
        int var3 = 0;
        while (~arg2 < -1) {
            var3 = arg1 & 1 | var3 << 1;
            arg1 >>>= 1;
            --arg2;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BZ)V")
    public static final void method2841(byte arg0, boolean arg1) {
        class141.field1972 = 0;
        ++field6817;
        class53.field789 = 0;
        class257.method1738(arg0 + -38);
        class467.method2781(arg0 + -31, arg1);
        class20.method144(20);
        for (int var2 = 0; class141.field1972 > var2; ++var2) {
            int var4 = class105.field1473[var2];
            if (class364.field5010 != class163.field2377[var4].field5762) {
                if (class163.field2377[var4].field4952.method223((byte) -118)) {
                    class31.method199(39, class163.field2377[var4]);
                }
                class163.field2377[var4].method2224((byte) 17, (class37) null);
                class163.field2377[var4] = null;
            }
        }
        if (~class126.field1718 != ~class46.field710.field2298) {
            throw new RuntimeException("gnp1 pos:" + class46.field710.field2298 + " psize:" + class126.field1718);
        } else {
            for (int var3 = 0; ~var3 > ~class24.field257; ++var3) {
                if (class163.field2377[class193.field2873[var3]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class24.field257);
                }
            }
            if (arg0 != 39) {
                field6821 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lpg;[[BB)V")
    public static final void method2842(class454 arg0, byte[][] arg1, byte arg2) {
        ++field6813;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class161 var11 = new class161(var10);
                int var12 = class486.field6887[var5] >> 8;
                int var13 = 255 & class486.field6887[var5];
                int var14 = var12 * 64 + -class279.field4012;
                int var15 = var13 * 64 - class189.field2810;
                class208.method1423((byte) -64);
                arg0.method2008(var11, class279.field4012, var14, 4807, var15, class189.field2810, class300.field4249);
                arg0.method2735(var15, (byte) 79, var3, var14, class374.field5152, var11);
                if (!arg0.field4478 && class427.field5961 / 8 == var12 && ~(class309.field4391 / 8) == ~var13) {
                    if (var3[0] == -1) {
                        class323.field4519 = null;
                    } else {
                        class323.field4519 = class97.field1377.method702(var3[3], var3[1], var3[0], var3[2], 0, class39.field534);
                        class96.field1355 = var3[4];
                    }
                }
            }
        }
        for (int var6 = 0; var6 < var4; ++var6) {
            int var7 = (class486.field6887[var6] >> 8) * 64 + -class279.field4012;
            int var8 = (class486.field6887[var6] & 255) * 64 + -class189.field2810;
            byte[] var9 = arg1[var6];
            if (var9 == null && class309.field4391 < 800) {
                class208.method1423((byte) -95);
                arg0.method2021(69, var7, 64, var8, 64);
            }
        }
        if (arg2 <= 109) {
            field6821 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class482() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLkk;I)V")
    public final void method7(byte arg0, class161 arg1, int arg2) {
        ++field6815;
        if (arg0 > 31) {
            if (~arg2 != -1) {
                if (arg2 == 1) {
                    this.field6814 = arg1.method1134(-16848);
                }
            } else {
                this.field6812 = arg1.method1134(-16848);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "(I)V")
    public static void method2843(int arg0) {
        field6821 = null;
        int var1 = -71 % ((arg0 - 40) / 63);
        field6818 = null;
        field6819 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field6816;
        int[] var3 = super.field3808.method958((byte) 123, arg0);
        if (super.field3808.field1732) {
            int[] var4 = this.method1788(arg0, (byte) -35, 0);
            for (int var5 = 0; class478.field6792 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field6812 <= var6 && var6 <= this.field6814 ? 4096 : 0;
            }
        }
        return arg1 != 21034 ? null : var3;
    }
}
