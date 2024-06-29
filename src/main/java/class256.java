import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class256 extends class235 {

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "I")
    public static int field3751 = 0;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3755 = "Loaded fonts";

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
    public int field3746;

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
    public int field3748;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "I")
    public int field3756;

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!hn", name = "N", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "Ljava/lang/String;")
    public String field3753;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V", line = 7)
    public final void method1611(int arg0) {
        if (arg0 < -57) {
            super.field3305 = super.field3305 & Long.MIN_VALUE | class55.method375(-3913) + 500L;
            ++field3754;
            class376.field5677.method1244(this, -26);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIBII)V", line = 20)
    public static final void method1612(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 != 63) {
            field3751 = -59;
        }
        class130[] var7 = class314.field4503;
        for (int var8 = 0; ~var7.length < ~var8; ++var8) {
            class130 var9 = var7[var8];
            if (var9 != null && ~var9.field1740 == -3) {
                class224.method1397((var9.field1732 - class184.field2482 << 7) + var9.field1736, arg0 >> 1, arg3 >> 1, var9.field1737 * 2, 0, arg6, (var9.field1742 - class38.field620 << 7) + var9.field1741, arg1);
                if (class82.field1161[0] > -1 && class50.field698 % 20 < 10) {
                    class188.field2553[var9.field1748].method1499(class82.field1161[0] + arg5 + -12, class82.field1161[1] + arg2 + -28);
                }
            }
        }
        ++field3757;
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)J", line = 51)
    public final long method1613(int arg0) {
        ++field3750;
        if (arg0 != 2) {
            this.field3748 = 6;
        }
        return Long.MAX_VALUE & super.field3305;
    }

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)V", line = 64)
    public final void method1614(int arg0) {
        super.field3305 |= Long.MIN_VALUE;
        ++field3749;
        if (~this.method1613(2) == -1L) {
            class166.field2166.method1244(this, -26);
        }
        if (arg0 != 0) {
            this.method1613(-46);
        }
    }

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "(I)I", line = 79)
    public final int method1615(int arg0) {
        ++field3759;
        if (arg0 != -1255099360) {
            this.field3753 = null;
        }
        return (int) (255L & super.field5903 >>> 32);
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(Z)V", line = 99)
    public static void method1616(boolean arg0) {
        field3755 = null;
        if (arg0) {
            field3755 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(B)I", line = 109)
    public final int method1617(byte arg0) {
        if (arg0 >= -51) {
            field3751 = 81;
        }
        ++field3752;
        return (int) super.field5903;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIIZZF)[I", line = 120)
    public static final int[] method1618(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6, float arg7) {
        ++field3747;
        int[] var8 = new int[arg2];
        class360 var9 = new class360();
        var9.field5278 = arg3;
        var9.field5274 = arg1;
        var9.field5262 = arg5;
        if (!arg6) {
            method1618(76, -82, -84, 74, 10, false, true, 0.95689183F);
        }
        var9.field5275 = (int) (arg7 * 4096.0F);
        var9.field5263 = arg0;
        var9.field5271 = arg4;
        var9.method440(0);
        class361.method2372(1, arg2, 108);
        var9.method2365(6967, var8, 0);
        return var8;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(II)V", line = 148)
    public class256(int arg0, int arg1) {
        super.field5903 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILfg;)V", line = 156)
    public static final void method1619(int arg0, int arg1, class18 arg2) {
        ++field3758;
        int var3 = -1;
        if (arg1 >= -100) {
            method1619(-94, -74, (class18) null);
        }
        int var4 = 0;
        if (~class50.field698 > ~arg2.field281) {
            class219.method1358(arg2, -103);
        } else if (~arg2.field220 <= ~class50.field698) {
            class311.method1938((byte) 80, arg2);
        } else {
            class161.method1011(false, arg2, false);
            var4 = class369.field5487;
            var3 = class73.field991;
        }
        if (arg2.field5284 < 128 || ~arg2.field5298 > -129 || arg2.field5284 >= (class324.field4652 + -1) * 128 || ~arg2.field5298 <= ~(class336.field4964 * 128 - 128)) {
            arg2.field220 = 0;
            arg2.field222 = -1;
            arg2.field281 = 0;
            arg2.field228 = -1;
            arg2.field5284 = arg2.field303[0] * 128 - -(arg2.method130((byte) -118) * 64);
            arg2.field5298 = arg2.field306[0] * 128 + 64 * arg2.method130((byte) -52);
            arg2.method139(true);
        }
        if (class100.field1350 == arg2 && (~arg2.field5284 > -1537 || ~arg2.field5298 > -1537 || class324.field4652 * 128 + -1536 <= arg2.field5284 || ~arg2.field5298 <= ~((class336.field4964 + -12) * 128))) {
            arg2.field228 = -1;
            arg2.field222 = -1;
            arg2.field220 = 0;
            arg2.field281 = 0;
            arg2.field5284 = arg2.field303[0] * 128 - -(arg2.method130((byte) -84) * 64);
            arg2.field5298 = arg2.field306[0] * 128 - -(64 * arg2.method130((byte) -54));
            arg2.method139(true);
        }
        int var5 = class6.method52(arg2, 16383);
        class138.method930(arg2, var5, var4, (byte) -17, var3);
        class88.method543(arg2, (byte) -67);
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)V", line = 220)
    public static final void method1620(int arg0, int arg1) {
        class93 var2 = null;
        for (int var3 = arg0; var3 < arg1; ++var3) {
            class337 var4 = class198.field2829[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class413.field6175; ++var5) {
                    for (int var6 = 0; var6 < class308.field4403; ++var6) {
                        var2 = var4.method784(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << 7;
                            int var8 = var5 << 7;
                            for (int var9 = var3 - 1; var9 >= 0; --var9) {
                                class337 var10 = class198.field2829[var9];
                                if (var10 != null) {
                                    int var11 = var4.method781(var6, var5) - var10.method781(var6, var5);
                                    int var12 = var4.method781(var6 + 1, var5) - var10.method781(var6 + 1, var5);
                                    int var13 = var4.method781(var6 + 1, var5 + 1) - var10.method781(var6 + 1, var5 + 1);
                                    int var14 = var4.method781(var6, var5 + 1) - var10.method781(var6, var5 + 1);
                                    var10.method783(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
