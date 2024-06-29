import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class663 implements class243 {

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public int field9441;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "[I")
    public static int[] field9439 = new int[25];

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "[Z")
    public static boolean[] field9440 = new boolean[8];

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field9438;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field9442;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field9443;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field9444;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field9445;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V", line = 3)
    public static void method3768(int arg0) {
        field9440 = null;
        if (arg0 != 4454) {
            field9439 = null;
        }
        field9439 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)Lhs;", line = 15)
    public final class325 method777(int arg0) {
        field9443++;
        if (arg0 > -8) {
            this.method777(-120);
        }
        return class614.field8794;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIIIIILcu;Lkda;)V", line = 27)
    public static final void method3769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class219 arg10, class388 arg11) {
        class498.field7025 = arg9;
        class299.field3721 = arg0;
        class732.field10255 = arg3;
        class251.field3037 = arg11;
        class484.field6890 = arg1;
        field9438++;
        class707.field9976 = null;
        class160.field1779 = arg8;
        class512.field7303 = null;
        class114.field1199 = arg2;
        class304.field3797 = null;
        class167.field1858 = arg7;
        class366.field4688 = arg5;
        class620.field8868 = arg6;
        if (arg4 != 28670) {
            method3768(5);
        }
        class598.field8519 = arg10;
        class251.method1502(-84);
        class73.field769 = true;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB[Ltp;)V", line = 53)
    public static final void method3770(int arg0, byte arg1, class532[] arg2) {
        field9445++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class532 var5 = arg2[var3];
            if (var5 != null && var5.field7580 == arg0 && !client.method1788(var5)) {
                if (var5.field7543 == 0) {
                    method3770(var5.field7704, (byte) -118, arg2);
                    if (var5.field7632 != null) {
                        method3770(var5.field7704, (byte) 76, var5.field7632);
                    }
                    class424 var6 = (class424) class153.field1688.method1754(false, (long) var5.field7704);
                    if (var6 != null) {
                        class331.method1979(false, var6.field6159);
                    }
                }
                if (var5.field7543 == 6 && var5.field7705 != -1) {
                    class25 var7 = class637.field9158.method1905(84, var5.field7705);
                    if (var7 != null) {
                        var5.field7636 += class721.field10119;
                        int var8 = var5.field7547;
                        while (var5.field7636 > var7.field253[var5.field7547]) {
                            var5.field7636 -= var7.field253[var5.field7547];
                            var5.field7547++;
                            if (var7.field256.length <= var5.field7547) {
                                var5.field7547 -= var7.field263;
                                if (var5.field7547 < 0 || var5.field7547 >= var7.field256.length) {
                                    var5.field7547 = 0;
                                }
                            }
                            var5.field7695 = var5.field7547 + 1;
                            if (var7.field256.length <= var5.field7695) {
                                var5.field7695 -= var7.field263;
                                if (var5.field7695 < 0 || var7.field256.length <= var5.field7695) {
                                    var5.field7695 = -1;
                                }
                            }
                            class11.method50(var5, (byte) -107);
                        }
                        if (var5.field7547 != var8) {
                            class339.method2014(var7, 5271, var5.field7547);
                        }
                    }
                }
            }
        }
        int var4 = -109 % ((arg1 + 65) / 47);
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)I", line = 147)
    public static final int method3771(int arg0) {
        field9444++;
        if (class149.field1652) {
            return 6;
        } else if (class10.field74 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                field9440 = null;
            }
            int var1 = class10.field74.field9270;
            if (class228.method1318(var1, (byte) -81)) {
                return 1;
            } else if (class657.method3746((byte) 80, var1)) {
                return 2;
            } else if (class59.method455((byte) 79, var1)) {
                return 3;
            } else if (class411.method2523(105, var1)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V", line = 195)
    public class663(int arg0) {
        this.field9441 = arg0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lr;III[Z)Z", line = 204)
    public static final boolean method3772(class182 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class504.field7120 != class159.field1758) {
            int var6 = class11.field88[arg1].method1675(arg3, arg2, 65286);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class278 var8 = class11.field88[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1675(arg3, arg2, 65286);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1669(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1677(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }
}
