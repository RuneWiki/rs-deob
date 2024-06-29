import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class34 extends class23 {

    @OriginalMember(owner = "client!d", name = "T", descriptor = "S")
    public static short field580 = 256;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "Li;")
    public static class88 field581 = class208.method1425(105, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!d", name = "W", descriptor = "Li;")
    public static class88 field583 = class208.method1425(105, "::fpsoff");

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    public static int field582 = 0;

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "Li;")
    public static class88 field591 = class208.method1425(105, "(R");

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "Li;")
    private static class88 field593 = class208.method1425(105, "Discard");

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "Li;")
    public static class88 field592 = field593;

    @OriginalMember(owner = "client!d", name = "hb", descriptor = "I")
    public static int field594 = -1;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!d", name = "db", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "Lnb;")
    public static class144 field584;

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "Lpf;")
    public static class169 field589;

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "[Llj;")
    public static class130[] field587;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        ++field588;
        int[] var3 = super.field379.method1080(false, arg0);
        if (super.field379.field3100) {
            int[] var4 = this.method120(arg0, false, 0);
            int[] var5 = this.method120(arg0, false, 1);
            int[] var6 = this.method120(arg0, false, 2);
            for (int var7 = 0; ~class70.field1276 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 != 0) {
                    var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        if (arg1 < 19) {
            method227((byte) 106, (class88) null, (class88) null, (class88) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            super.field369 = arg0.method347(26119) == 1;
        }
        ++field586;
        if (arg1 != -3) {
            method230(-50, (class144) null, -28, -72);
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        ++field585;
        if (arg1 != 13) {
            return null;
        } else {
            int[][] var3 = super.field364.method1541(true, arg0);
            if (super.field364.field4312) {
                int[] var4 = this.method120(arg0, false, 2);
                int[][] var5 = this.method121(0, (byte) 121, arg0);
                int[][] var6 = this.method121(1, (byte) 87, arg0);
                int[] var7 = var5[2];
                int[] var8 = var6[0];
                int[] var9 = var3[0];
                int[] var10 = var3[2];
                int[] var11 = var5[1];
                int[] var12 = var6[1];
                int[] var13 = var5[0];
                int[] var14 = var3[1];
                int[] var15 = var6[2];
                for (int var16 = 0; class70.field1276 > var16; ++var16) {
                    int var17 = var4[var16];
                    if (var17 != 4096) {
                        if (~var17 == -1) {
                            var9[var16] = var8[var16];
                            var14[var16] = var12[var16];
                            var10[var16] = var15[var16];
                        } else {
                            int var18 = -var17 + 4096;
                            var9[var16] = var8[var16] * var18 + var13[var16] * var17 >> 12;
                            var14[var16] = var11[var16] * var17 - -(var12[var16] * var18) >> 12;
                            var10[var16] = var7[var16] * var17 + var15[var16] * var18 >> 12;
                        }
                    } else {
                        var9[var16] = var13[var16];
                        var14[var16] = var11[var16];
                        var10[var16] = var7[var16];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLi;Li;Li;)V")
    public static final void method227(byte arg0, class88 arg1, class88 arg2, class88 arg3) {
        class209.field3983 = arg2;
        class209.field3982 = arg1;
        class209.field3981 = arg3;
        int var4 = 83 / ((69 - arg0) / 47);
        ++field577;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V")
    public static void method228(byte arg0) {
        field583 = null;
        field587 = null;
        field589 = null;
        field592 = null;
        field591 = null;
        field581 = null;
        field593 = null;
        int var1 = -6 % ((32 - arg0) / 37);
        field584 = null;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)[Lpf;")
    public static final class169[] method229(byte arg0) {
        ++field590;
        if (arg0 != -69) {
            field587 = null;
        }
        class169[] var1 = new class169[class172.field3347];
        for (int var2 = 0; class172.field3347 > var2; ++var2) {
            int var3 = class67.field1218[var2] * class102.field1853[var2];
            byte[] var4 = class116.field2106[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; ~var6 > ~var3; ++var6) {
                var5[var6] = class27.field456[class70.method470(var4[var6], 255)];
            }
            var1[var2] = new class169(class15.field229, class129.field2426, class247.field4530[var2], class135.field2512[var2], class102.field1853[var2], class67.field1218[var2], var5);
        }
        class239.method1580(104);
        return var1;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class34() {
        super(3, false);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILnb;II)[Lrc;")
    public static final class188[] method230(int arg0, class144 arg1, int arg2, int arg3) {
        ++field578;
        if (!class47.method358(854010832, arg1, arg3, arg0)) {
            return null;
        } else {
            if (arg2 != -7722) {
                method230(-15, (class144) null, -96, -12);
            }
            return class21.method100((byte) -85);
        }
    }
}
