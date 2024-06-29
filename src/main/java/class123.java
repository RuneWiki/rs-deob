import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class123 extends class748 {

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    private int field1676 = -1;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "Lqs;")
    public static class605 field1675 = new class605();

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "F")
    public static float field1686 = 1.0F;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "F")
    public static float field1688;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    private int field1674;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    private int field1680;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "Luha;")
    public static class723 field1685;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "[I")
    private int[] field1679;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V")
    public static void method790(boolean arg0) {
        if (!arg0) {
            method790(false);
        }
        field1675 = null;
        field1685 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)V")
    public static final void method791(int arg0, int arg1, int arg2, int arg3) {
        ++field1682;
        int var4 = class179.field2535 + arg2;
        int var5 = arg0 - -class510.field7109;
        if (class352.field4549 != null && arg2 >= 0 && arg0 >= 0 && ~arg2 > ~class514.field7179 && ~class456.field6281 < ~arg0) {
            if (class674.field9500.field5113.method3798(arg1 + 27930) != 0 || class473.field6483.field9501 == arg3) {
                long var6 = (long) (var5 << 14 | arg3 << 28 | var4);
                class731 var8 = (class731) class118.field1631.method1381(true, var6);
                if (var8 == null) {
                    class15.method78(arg3, arg2, arg0);
                } else {
                    class175 var9 = (class175) var8.field10232.method3118((byte) 73);
                    if (var9 == null) {
                        class15.method78(arg3, arg2, arg0);
                    } else {
                        class447 var10 = (class447) class15.method78(arg3, arg2, arg0);
                        if (var10 != null) {
                            var10.field6119 = var10.field6109 = -1;
                        } else {
                            var10 = new class447(arg2 << 9, class52.field741[arg3].method1959(127, arg0, arg2), arg0 << 9, arg3, arg3);
                        }
                        var10.field6118 = var9.field2379;
                        var10.field6110 = var9.field2383;
                        label61: while (true) {
                            class175 var11 = (class175) var8.field10232.method3111(117);
                            if (var11 == null) {
                                break;
                            }
                            if (var10.field6118 != var11.field2379) {
                                var10.field6119 = var11.field2379;
                                var10.field6106 = var11.field2383;
                                while (true) {
                                    class175 var12 = (class175) var8.field10232.method3111(122);
                                    if (var12 == null) {
                                        break label61;
                                    }
                                    if (~var10.field6118 != ~var12.field2379 && ~var10.field6119 != ~var12.field2379) {
                                        var10.field6117 = var12.field2383;
                                        var10.field6109 = var12.field2379;
                                    }
                                }
                            }
                        }
                        if (arg1 != -27930) {
                            method791(110, 10, -121, -16);
                        }
                        int var13 = class438.method2628((arg2 << 9) + 256, arg3, (arg0 << 9) + 256, (byte) -104);
                        var10.field9501 = (byte) arg3;
                        var10.field6116 = 0;
                        var10.field9495 = (byte) arg3;
                        var10.field9489 = arg0 << 9;
                        var10.field9490 = arg2 << 9;
                        var10.field9502 = var13;
                        if (class753.method4175(-12388, arg0, arg2)) {
                            ++var10.field9495;
                        }
                        class148.method955(arg3, arg2, arg0, var13, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)[[I")
    public final int[][] method445(int arg0, int arg1) {
        ++field1677;
        int[][] var3 = super.field10420.method930(29784, arg0);
        if (arg1 != 0) {
            this.field1676 = -78;
        }
        if (super.field10420.field1979) {
            int var4 = this.field1674 * (~class245.field3400 == ~this.field1680 ? arg0 : this.field1680 * arg0 / class245.field3400);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class424.field5889 == ~this.field1674) {
                for (int var8 = 0; var8 < class424.field5889; ++var8) {
                    int var9 = this.field1679[var4++];
                    var7[var8] = class136.method878(255, var9) << 4;
                    var6[var8] = class136.method878(65280, var9) >> 4;
                    var5[var8] = class136.method878(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; class424.field5889 > var10; ++var10) {
                    int var11 = this.field1674 * var10 / class424.field5889;
                    int var12 = this.field1679[var4 + var11];
                    var7[var10] = class136.method878(var12 << 4, 4080);
                    var6[var10] = class136.method878(var12, 65280) >> 4;
                    var5[var10] = class136.method878(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class123() {
        super(0, false);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
    public final void method792(boolean arg0) {
        ++field1678;
        super.method792(arg0);
        this.field1679 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
    public final void method793(int arg0, int arg1, int arg2) {
        super.method793(arg0, arg1, arg2);
        ++field1683;
        if (~this.field1676 <= -1 && class594.field8567 != null) {
            int var4 = class594.field8567.method91(this.field1676, arg2 ^ 23019).field6391 ? 64 : 128;
            this.field1679 = class594.field8567.method87(false, var4, 1.0F, var4, true, this.field1676);
            this.field1680 = var4;
            this.field1674 = var4;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZIIBIIII)V")
    public static final void method794(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (~(!arg0 ? class674.field9500.field5142.method3216(0) : class674.field9500.field5141.method3216(0)) != -1 && ~arg5 != -1 && class596.field8577 < 50 && arg6 != -1) {
            class293.field3830[class596.field8577++] = new class362((byte) (!arg0 ? 2 : 3), arg6, arg5, arg2, arg4, arg1, arg7, (class674) null);
        }
        int var8 = 77 % ((-10 - arg3) / 54);
        ++field1681;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (!arg1) {
            ++field1684;
            if (arg0 == 0) {
                this.field1676 = arg2.method193(2);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)I")
    public final int method795(int arg0) {
        ++field1687;
        int var2 = 28 % ((-73 - arg0) / 38);
        return this.field1676;
    }
}
