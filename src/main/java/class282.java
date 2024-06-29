import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class282 extends class185 {

    @OriginalMember(owner = "client!vh", name = "S", descriptor = "I")
    private int field4220 = 32768;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    public static int field4211 = 0;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4214 = Calendar.getInstance();

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!vh", name = "U", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!vh", name = "V", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!vh", name = "W", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "Lmk;")
    public static class105 field4212;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BZ)V")
    public static final void method1859(byte arg0, boolean arg1) {
        class204.method1294(arg1, class180.field2748, class77.field1245, class136.field1987, 64);
        if (arg0 <= -14) {
            ++field4222;
        }
    }

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "(I)V")
    public static final void method1860(int arg0) {
        if (arg0 != 1) {
            method1859((byte) 19, false);
        }
        if (class3.field51 < 0) {
            class146.field2137 = -1;
            class3.field51 = 0;
            class61.field973 = -1;
        }
        if (class106.field1616 < class3.field51) {
            class146.field2137 = -1;
            class61.field973 = -1;
            class3.field51 = class106.field1616;
        }
        if (class268.field4042 < 0) {
            class146.field2137 = -1;
            class268.field4042 = 0;
            class61.field973 = -1;
        }
        if (~class268.field4042 < ~class99.field1564) {
            class61.field973 = -1;
            class268.field4042 = class99.field1564;
            class146.field2137 = -1;
        }
        ++field4223;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        int[][] var3 = super.field2802.method753(1, arg1);
        if (!arg0) {
            this.method27(-100, (class248) null, 103);
        }
        ++field4219;
        if (super.field2802.field1807) {
            int[] var4 = this.method1146((byte) 125, arg1, 1);
            int[] var5 = this.method1146((byte) 122, arg1, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class174.field2648; ++var9) {
                int var10 = (1044515 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field4220 >> 12;
                int var12 = class175.field2661[var10] * var11 >> 12;
                int var13 = (var12 >> 12) + var9 & class53.field873;
                int var14 = class97.field1523[var10] * var11 >> 12;
                int var15 = class10.field133 & (var14 >> 12) + arg1;
                int[][] var16 = this.method1152(false, 0, var15);
                var6[var9] = var16[0][var13];
                var7[var9] = var16[1][var13];
                var8[var9] = var16[2][var13];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        if (arg1 < 70) {
            return null;
        } else {
            int[] var3 = super.field2804.method561(arg0, -2);
            ++field4218;
            if (super.field2804.field1384) {
                int[] var4 = this.method1146((byte) 121, arg0, 1);
                int[] var5 = this.method1146((byte) 119, arg0, 2);
                for (int var6 = 0; ~var6 > ~class174.field2648; ++var6) {
                    int var7 = var5[var6] * this.field4220 >> 12;
                    int var8 = (var4[var6] & 4085) >> 4;
                    int var9 = class175.field2661[var8] * var7 >> 12;
                    int var10 = class97.field1523[var8] * var7 >> 12;
                    int var11 = (var9 >> 12) + var6 & class53.field873;
                    int var12 = class10.field133 & (var10 >> 12) + arg0;
                    int[] var13 = this.method1146((byte) 118, var12, 0);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field4224;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field2814 = ~arg1.method1593((byte) 27) == -2;
            }
        } else {
            this.field4220 = arg1.method1575(false) << 4;
        }
        if (arg2 != -6357) {
            field4212 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "(I)V")
    public static void method1861(int arg0) {
        field4212 = null;
        if (arg0 >= 50) {
            field4214 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)V")
    public final void method30(int arg0) {
        class82.method546(-13376);
        ++field4221;
        if (arg0 != -9) {
            field4214 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class282() {
        super(3, false);
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(B)J")
    public static final long method1862(byte arg0) {
        if (arg0 != -117) {
            return -90L;
        } else {
            ++field4217;
            return field4212.method499(-22091);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZZ)V")
    public static final void method1863(boolean arg0, boolean arg1) {
        class127.field1913 = null;
        class171.field2593 = null;
        class100.field1584 = null;
        class239.field3600 = null;
        if (arg0 && class39.field524 != null) {
            class107.field1656 = class39.field524.field2667;
        } else {
            class107.field1656 = -1;
        }
        class39.field524 = null;
        class290.field4579 = null;
        class97.field1532 = null;
        class219.field3303 = null;
        class187.field2838 = null;
        class188.field2889 = 0;
        class76.field1223 = null;
        ++field4216;
        class296.field4687 = null;
        class226.field3394.method986(-29720);
        class180.field2743 = null;
        class93.field1478 = null;
        class150.field2165 = null;
        class132.field1936 = null;
        if (arg1) {
            class166.field2556 = null;
            class293.field4610 = null;
            class173.field2638 = null;
            class61.field973 = -1;
            class10.field138 = null;
            class230.field3471 = null;
            class30.field437 = null;
            class146.field2137 = -1;
        }
    }
}
