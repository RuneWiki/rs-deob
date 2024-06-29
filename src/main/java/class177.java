import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class177 extends class377 {

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "I")
    private int field2072 = 4096;

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!vp", name = "A", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!vp", name = "C", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "Lpfa;")
    public static class275 field2074;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V")
    public static void method1053(boolean arg0) {
        if (!arg0) {
            method1053(false);
        }
        field2074 = null;
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
    public class177() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)[I")
    public final int[] method88(int arg0, int arg1) {
        int var3 = -94 % ((arg1 - 5) / 53);
        ++field2071;
        int[] var4 = super.field4842.method2772(arg0, (byte) -128);
        if (super.field4842.field6354) {
            int[] var5 = this.method2174(0, class251.field3236 & arg0 + -1, (byte) -121);
            int[] var6 = this.method2174(0, arg0, (byte) 93);
            int[] var7 = this.method2174(0, class251.field3236 & arg0 + 1, (byte) -126);
            for (int var8 = 0; var8 < class528.field6661; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * this.field2072;
                int var10 = (var6[class376.field4836 & var8 + 1] + -var6[var8 + -1 & class376.field4836]) * this.field2072;
                int var11 = var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = var12 * var12 >> 12;
                int var15 = (int) (4096.0D * Math.sqrt((double) ((float) (var13 + 4096 - -var14) / 4096.0F)));
                int var16 = ~var15 != -1 ? 16777216 / var15 : 0;
                var4[var8] = -var16 + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Loa;Z)V")
    public static final void method1054(class650 arg0, boolean arg1) {
        ++field2073;
        int var2 = class284.field3593;
        int var3 = class465.field5774;
        int var4 = class559.field6988;
        int var5 = class484.field6012;
        int var6 = -10660793;
        arg0.method3630((byte) 35, var4, var3, var2, var6, var5);
        arg0.method3630((byte) 27, var4 - 2, var3 - -1, var2 - -1, -16777216, 16);
        arg0.method3636(var5 + -19, -16777216, var2 + 1, var3 + 18, var4 + -2, (byte) -121);
        class336.field4143.method1165((byte) -32, var3 + 14, var6, var2 + 3, -1, class671.field9138.method3726((byte) 127, class71.field912));
        int var7 = class113.field1423.method1074((byte) -36);
        int var8 = class113.field1423.method1078((byte) 123);
        int var9 = 0;
        for (class501 var10 = (class501) class345.field4438.method1909(arg1); var10 != null; var10 = (class501) class345.field4438.method1916((byte) 95)) {
            int var11 = (class638.field8648 + -1 + -var9) * 16 + var3 + 31;
            short var12 = -1;
            if (~var7 < ~var2 && ~var7 > ~(var2 - -var4) && ~var8 < ~(var11 - 13) && var11 + 3 > var8 && var10.field6244) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class534.method2880(-8897, var10.field6242)) {
                var13 = class504.field6287.method1628((int) var10.field6247, (byte) -82).field828;
            } else if (var10.field6250 != -1) {
                var13 = class504.field6287.method1628(var10.field6250, (byte) -91).field828;
            } else if (class453.method2489((byte) 104, var10.field6242)) {
                class704 var14 = (class704) class168.field1973.method3828((long) ((int) var10.field6247), (byte) -91);
                if (var14 != null) {
                    class506 var15 = var14.field9854;
                    class689 var16 = var15.field6326;
                    if (var16.field9546 != null) {
                        var16 = var16.method3812(class327.field4084, -117);
                    }
                    if (var16 != null) {
                        var13 = var16.field9516;
                    }
                }
            } else if (class245.method1473(var10.field6242, -109)) {
                Object var17 = null;
                class687 var18;
                if (~var10.field6242 != -1012) {
                    var18 = class232.field3017.method2358(0, (int) (var10.field6247 >>> 32 & 2147483647L));
                } else {
                    var18 = class232.field3017.method2358(0, (int) var10.field6247);
                }
                if (var18.field9421 != null) {
                    var18 = var18.method3800(class327.field4084, (byte) -102);
                }
                if (var18 != null) {
                    var13 = var18.field9447;
                }
            }
            String var19 = class293.method1769(var10, -21589);
            if (var13 != null) {
                var19 = var19 + class617.method3443(!arg1, var13);
            }
            class336.field4143.method1176(var12, var19, -106, 0, var11, class541.field6825, class306.field3871, var2 + 3);
            ++var9;
            if (var10.field6241) {
                class590.field7923.method2556(class36.field540.method127(var19, (byte) -36) + var2 + 5, var11 + -12);
            }
        }
        class640.method3589(class484.field6012, 20, class284.field3593, class465.field5774, class559.field6988);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        ++field2075;
        if (~arg0 == -1) {
            this.field2072 = arg2.method3031(-1);
        }
        int var4 = 67 % ((13 - arg1) / 55);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lqj;B)[Ldm;")
    public static final class48[] method1055(class476 arg0, byte arg1) {
        ++field2069;
        if (!arg0.method2589((byte) -63)) {
            return new class48[0];
        } else {
            class218 var2 = arg0.method2604((byte) -108);
            while (var2.field2546 == 0) {
                class700.method3867(arg1 + 29317, 10L);
            }
            if (var2.field2546 == 2) {
                return new class48[0];
            } else if (arg1 != -38) {
                return null;
            } else {
                int[] var3 = (int[]) var2.field2547;
                class48[] var4 = new class48[var3.length >> 2];
                for (int var5 = 0; var4.length > var5; ++var5) {
                    class48 var6 = new class48();
                    var4[var5] = var6;
                    var6.field637 = var3[var5 << 2];
                    var6.field636 = var3[(var5 << 2) - -1];
                    var6.field640 = var3[(var5 << 2) + 2];
                    var6.field639 = var3[(var5 << 2) + 3];
                }
                return var4;
            }
        }
    }
}
