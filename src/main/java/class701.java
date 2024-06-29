import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class701 extends class204 {

    @OriginalMember(owner = "client!dia", name = "k", descriptor = "I")
    public static int field9773 = 0;

    @OriginalMember(owner = "client!dia", name = "i", descriptor = "[J")
    public static long[] field9771 = new long[256];

    @OriginalMember(owner = "client!dia", name = "h", descriptor = "I")
    public static int field9770;

    @OriginalMember(owner = "client!dia", name = "j", descriptor = "I")
    public static int field9772;

    @OriginalMember(owner = "client!dia", name = "l", descriptor = "I")
    public static int field9774;

    @OriginalMember(owner = "client!dia", name = "m", descriptor = "I")
    public static int field9775;

    @OriginalMember(owner = "client!dia", name = "n", descriptor = "I")
    public static int field9776;

    @OriginalMember(owner = "client!dia", name = "o", descriptor = "I")
    public static int field9777;

    @OriginalMember(owner = "client!dia", name = "p", descriptor = "I")
    public static int field9778;

    @OriginalMember(owner = "client!dia", name = "q", descriptor = "I")
    public static int field9779;

    @OriginalMember(owner = "client!dia", name = "r", descriptor = "Lld;")
    public static class127 field9780;

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if ((1L & var1) != 1L) {
                    var1 >>>= 1;
                } else {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                }
            }
            field9771[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V", line = 3)
    public final void method486(int arg0) {
        ++field9774;
        super.field2852 = this.method490((byte) 125);
        if (arg0 != -4591) {
            method3966(-28);
        }
    }

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "(I)V", line = 14)
    public static void method3966(int arg0) {
        if (arg0 != 10082) {
            method3966(73);
        }
        field9780 = null;
        field9771 = null;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(B)I", line = 31)
    public final int method490(byte arg0) {
        ++field9772;
        if (arg0 <= 83) {
            this.method486(11);
        }
        return !super.field2853.method3505(125) ? 0 : 1;
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(B)V", line = 48)
    public static final void method3967(byte arg0) {
        ++field9778;
        int var1 = 111 % ((arg0 - -76) / 37);
        if (class425.field5937 != class107.field1249) {
            try {
                class552.method3253(class274.field3958, 124, "tbrefresh");
            } catch (Throwable var2) {
            }
        }
    }

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "(II)V", line = 71)
    public final void method488(int arg0, int arg1) {
        super.field2852 = arg0;
        ++field9779;
        if (arg1 >= -105) {
            this.method488(83, 89);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLha;)V", line = 82)
    public static final void method3968(byte arg0, class473 arg1) {
        ++field9776;
        int var2 = 0;
        if (arg0 != -83) {
            field9771 = null;
        }
        int var3 = 0;
        if (class55.field651) {
            var2 = class236.method1611(-5110);
            var3 = class339.method2149((byte) -100);
        }
        int var4 = class689.field9609 + var2;
        int var5 = class221.field3026 + var3;
        int var6 = class788.field10819;
        int var7 = class625.field8753 + -3;
        byte var8 = 20;
        class14.method57(class712.field9877.method3999(class553.field7667, (byte) -23), 18837, class689.field9609 + var2, var8, class788.field10819, class221.field3026 + var3, arg1, class625.field8753);
        int var9 = class205.field2881.method354((byte) -20) - -var2;
        int var10 = var3 + class205.field2881.method351(-25269);
        if (class48.field577) {
            int var11 = 0;
            for (class498 var12 = (class498) class362.field5218.method1140(-119); var12 != null; var12 = (class498) class362.field5218.method1138(arg0 + 210)) {
                int var16 = var5 + 13 - (-var8 - var11 * 16);
                if (class689.field9609 + var2 < var9 && ~(class689.field9609 + var2 - -class788.field10819) < ~var9 && var16 + -13 < var10 && var16 + 4 > var10 && (~var12.field6833 < -2 || ((class171) var12.field6826.field2266.field591).field2178)) {
                    arg1.method233(class689.field9609 + var2, var16 - 12, class788.field10819, 16, class79.field889 | 255 - class373.field5357 << 24, 1);
                }
                ++var11;
            }
            if (class694.field9684 != null) {
                int var13 = 0;
                class14.method57(class694.field9684.field6827, 18837, class49.field587, var8, class339.field4914, class79.field894, arg1, class78.field874);
                for (class171 var14 = (class171) class694.field9684.field6826.method1140(-83); var14 != null; var14 = (class171) class694.field9684.field6826.method1138(123)) {
                    int var15 = class79.field894 - -(var13 * 16) + var8 + 13;
                    if (class49.field587 < var9 && ~var9 > ~(class49.field587 - -class339.field4914) && ~(var15 + -13) > ~var10 && ~var10 > ~(var15 + 4) && var14.field2178) {
                        arg1.method233(class49.field587, var15 + -12, class339.field4914, 16, 255 - class373.field5357 << 24 | class79.field889, 1);
                    }
                    ++var13;
                }
                class221.method1360(class79.field894, class339.field4914, class78.field874, var8, class49.field587, 0, arg1);
            }
        } else {
            int var17 = 0;
            for (class171 var18 = (class171) class646.field9038.method1041(1048832); var18 != null; var18 = (class171) class646.field9038.method1033(-1)) {
                int var28 = var8 - -13 + var5 - -((-var17 + class640.field8992 - 1) * 16);
                if (var9 > class689.field9609 + var2 && ~(class788.field10819 + class689.field9609 - -var2) < ~var9 && var28 + -13 < var10 && ~(var28 - -4) < ~var10 && var18.field2178) {
                    arg1.method233(class689.field9609 + var2, var28 + -12, class788.field10819, 16, class79.field889 | 255 - class373.field5357 << 24, 1);
                }
                ++var17;
            }
        }
        class221.method1360(class221.field3026 + var3, class788.field10819, class625.field8753, var8, class689.field9609 + var2, arg0 ^ -83, arg1);
        if (!class48.field577) {
            int var19 = 0;
            for (class171 var20 = (class171) class646.field9038.method1041(1048832); var20 != null; var20 = (class171) class646.field9038.method1033(-1)) {
                int var21 = (-var19 + class640.field8992 + -1) * 16 + var5 + var8 + 13;
                class550.method3248(var4, var10, var20, var21, class773.field10643 | -16777216, class378.field5425 | -16777216, var7, (byte) -112, var9, var6, arg1, var5);
                ++var19;
            }
        } else {
            int var22 = 0;
            for (class498 var23 = (class498) class362.field5218.method1140(-121); var23 != null; var23 = (class498) class362.field5218.method1138(110)) {
                int var27 = var22 * 16 + 13 + var8 + class221.field3026 + var3;
                ++var22;
                if (~var23.field6833 != -2) {
                    class226.method1520(var10, class221.field3026 + var3, class689.field9609 + var2, arg1, var27, var9, -16777216 | class378.field5425, class788.field10819, -16777216 | class773.field10643, class625.field8753, 20279, var23);
                } else {
                    class550.method3248(class689.field9609 + var2, var10, (class171) var23.field6826.field2266.field591, var27, -16777216 | class773.field10643, class378.field5425 | -16777216, class625.field8753, (byte) -7, var9, class788.field10819, arg1, class221.field3026 + var3);
                }
            }
            if (class694.field9684 != null) {
                int var24 = 0;
                for (class171 var25 = (class171) class694.field9684.field6826.method1140(-120); var25 != null; var25 = (class171) class694.field9684.field6826.method1138(112)) {
                    int var26 = var24 * 16 + 13 + var8 + class79.field894;
                    class550.method3248(class49.field587, var10, var25, var26, -16777216 | class773.field10643, class378.field5425 | -16777216, class78.field874, (byte) -107, var9, class339.field4914, arg1, class79.field894);
                    ++var24;
                }
                class298.method1946(class339.field4914, arg0 ^ -12672, class78.field874, class79.field894, class49.field587);
            }
        }
        class298.method1946(class788.field10819, 12589, class625.field8753, class221.field3026 + var3, class689.field9609 - -var2);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(II)I", line = 255)
    public final int method487(int arg0, int arg1) {
        ++field9775;
        int var3 = -4 % ((-57 - arg1) / 60);
        return 3;
    }

    @OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Lfs;)V", line = 268)
    public class701(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(ILfs;)V", line = 274)
    public class701(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "(B)I", line = 277)
    public final int method3969(byte arg0) {
        ++field9777;
        if (arg0 != -98) {
            this.method3969((byte) -10);
        }
        return super.field2852;
    }
}
