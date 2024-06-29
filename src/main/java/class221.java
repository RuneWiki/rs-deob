import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class221 extends class501 {

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Lada;")
    public static class144 field3207 = new class144(19, 0);

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "Llu;")
    public static class610 field3217 = new class610(25, 7);

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public int field3208;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public int field3214;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public int field3220;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "Ljava/lang/String;")
    public String field3218;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 3)
    public final void method1426(byte arg0) {
        int var2 = 111 % ((arg0 - -66) / 51);
        super.field7109 |= Long.MIN_VALUE;
        ++field3216;
        if (~this.method1430(26544) == -1L) {
            class540.field8065.method3500(this, false);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIZ)V", line = 18)
    public static final void method1427(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3219;
        if (arg4 || ~class188.field2802 != ~arg3 || ~class291.field4029 != ~arg0 || ~class89.field1339 != ~class447.field6263 && !class56.field668.method1472(class526.field7533, (byte) 126)) {
            class447.field6263 = class89.field1339;
            class291.field4029 = arg0;
            class188.field2802 = arg3;
            if (class56.field668.method1472(class526.field7533, (byte) 125)) {
                class447.field6263 = 0;
            }
            class18.method117((byte) -85, arg2);
            class438.method2554(class459.field6493.method3408(127, class63.field795), true, (byte) -26, class465.field6539);
            int var5 = class473.field6687;
            class473.field6687 = (class188.field2802 - (class146.field2125 >> 4)) * 8;
            int var6 = class38.field463;
            class38.field463 = (-(class410.field5609 >> 4) + class291.field4029) * 8;
            class395.field5438 = class339.method2062(class188.field2802 * 8, class291.field4029 * arg1);
            class406.field5552 = null;
            int var7 = -var5 + class473.field6687;
            int var8 = class38.field463 - var6;
            if (arg2 == 10) {
                for (int var9 = 0; ~var9 > ~class599.field8840; ++var9) {
                    class505 var10 = class57.field718[var9];
                    if (var10 != null) {
                        class571 var11 = var10.field7148;
                        for (int var12 = 0; ~var12 > -11; ++var12) {
                            var11.field1957[var12] -= var7;
                            var11.field1955[var12] -= var8;
                        }
                        var11.field8496 -= var7 * 128;
                        var11.field8500 -= var8 * 128;
                    }
                }
            } else {
                boolean var13 = false;
                class527.field7717 = 0;
                int var14 = class146.field2125 * 128 + -128;
                int var15 = (class410.field5609 + -1) * 128;
                for (int var16 = 0; ~var16 > ~class599.field8840; ++var16) {
                    class505 var29 = class57.field718[var16];
                    if (var29 != null) {
                        class571 var30 = var29.field7148;
                        var30.field8496 -= var7 * 128;
                        var30.field8500 -= var8 * 128;
                        if (~var30.field8496 <= -1 && var14 >= var30.field8496 && ~var30.field8500 <= -1 && ~var15 <= ~var30.field8500) {
                            boolean var31 = true;
                            for (int var32 = 0; var32 < 10; ++var32) {
                                var30.field1957[var32] -= var7;
                                var30.field1955[var32] -= var8;
                                if (var30.field1957[var32] < 0 || ~class146.field2125 >= ~var30.field1957[var32] || var30.field1955[var32] < 0 || class410.field5609 <= var30.field1955[var32]) {
                                    var31 = false;
                                }
                            }
                            if (!var31) {
                                var30.method3405((class87) null, 44);
                                var13 = true;
                                var29.method2457(-8422);
                            } else {
                                class634.field9290[class527.field7717++] = var30.field1904;
                            }
                        } else {
                            var30.method3405((class87) null, 44);
                            var13 = true;
                            var29.method2457(arg1 ^ -8430);
                        }
                    }
                }
                if (var13) {
                    class599.field8840 = class510.field7260.method2803(0);
                    class510.field7260.method2804(false, class57.field718);
                }
            }
            for (int var17 = 0; var17 < 2048; ++var17) {
                class373 var27 = class293.field4036[var17];
                if (var27 != null) {
                    for (int var28 = 0; var28 < 10; ++var28) {
                        var27.field1957[var28] -= var7;
                        var27.field1955[var28] -= var8;
                    }
                    var27.field8496 -= var7 * 128;
                    var27.field8500 -= var8 * 128;
                }
            }
            class190[] var18 = class385.field5293;
            for (int var19 = 0; ~var18.length < ~var19; ++var19) {
                class190 var26 = var18[var19];
                if (var26 != null) {
                    var26.field2822 -= var8 * 128;
                    var26.field2819 -= var7 * 128;
                }
            }
            for (class332 var20 = (class332) class306.field4198.method124((byte) 42); var20 != null; var20 = (class332) class306.field4198.method120(43)) {
                var20.field4593 -= var7;
                var20.field4584 -= var8;
                if (~class599.field8841 != -5 && (var20.field4593 < 0 || var20.field4584 < 0 || ~var20.field4593 <= ~class146.field2125 || ~class410.field5609 >= ~var20.field4584)) {
                    var20.method2457(-8422);
                }
            }
            if (class599.field8841 != 4) {
                for (class85 var21 = (class85) class45.field544.method2798((byte) -21); var21 != null; var21 = (class85) class45.field544.method2806(true)) {
                    int var22 = (int) (var21.field5651 & 16383L);
                    int var23 = -class473.field6687 + var22;
                    int var24 = (int) (var21.field5651 >> 14 & 16383L);
                    int var25 = var24 - class38.field463;
                    if (~var23 > -1 || var25 < 0 || ~class146.field2125 >= ~var23 || ~var25 <= ~class410.field5609) {
                        var21.method2457(-8422);
                    }
                }
            }
            if (~class618.field9137 != -1) {
                class349.field4776 -= var8;
                class618.field9137 -= var7;
            }
            class389.method2315(arg1 + 98);
            if (arg2 != 10) {
                class125.field1760 -= var7 * 128;
                class92.field1368 -= var7;
                class469.field6617 -= var7;
                class214.field3161 -= var8 * 128;
                class606.field9003 -= var8;
                class224.field3243 -= var8;
                if (Math.abs(var7) > class146.field2125 || ~Math.abs(var8) < ~class410.field5609) {
                    class232.method1489(8);
                }
            } else if (~class531.field7929 != -5) {
                class531.field7929 = 1;
            } else {
                class214.field3160 -= var7 * 128;
                class399.field5489 -= var8 * 128;
                class24.field224 -= var7 * 128;
                class111.field1579 -= var8 * 128;
            }
            class485.method2911((byte) -31);
            class618.method3620(arg1 + -135);
            class33.field397.method122((byte) 14);
            class525.field7519.method122((byte) 14);
            class626.field9219.method2234((byte) -24);
            class146.method1001(true);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 280)
    public static final String[] method1428(int arg0, String[] arg1) {
        ++field3210;
        String[] var2 = new String[arg0];
        for (int var3 = 0; var3 < 5; ++var3) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)I", line = 309)
    public final int method1429(byte arg0) {
        int var2 = -44 / ((arg0 - 76) / 41);
        ++field3209;
        return (int) super.field5651;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)J", line = 319)
    public final long method1430(int arg0) {
        if (arg0 != 26544) {
            return -44L;
        } else {
            ++field3215;
            return Long.MAX_VALUE & super.field7109;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)I", line = 335)
    public final int method1431(byte arg0) {
        ++field3211;
        int var2 = 106 / ((arg0 - 63) / 56);
        return (int) (255L & super.field5651 >>> 32);
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V", line = 347)
    public final void method1432(int arg0) {
        ++field3213;
        super.field7109 = class598.method3538(true) + 500L | Long.MIN_VALUE & super.field7109;
        if (arg0 == 0) {
            class56.field658.method3500(this, false);
        }
    }

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V", line = 359)
    public static void method1433(int arg0) {
        if (arg0 != 37) {
            field3217 = null;
        }
        field3207 = null;
        field3217 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 374)
    public static final String method1434(byte arg0, long arg1) {
        ++field3212;
        if (~arg1 < -1L && ~arg1 > -6582952005840035282L) {
            if (~(arg1 % 37L) == -1L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg1;
                while (~var4 != -1L) {
                    var4 /= 37L;
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (~arg1 != -1L) {
                    long var7 = arg1;
                    arg1 /= 37L;
                    char var9 = class64.field799[(int) (-(arg1 * 37L) + var7)];
                    if (~var9 == -96) {
                        int var10 = var6.length() - 1;
                        var9 = 160;
                        var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    }
                    var6.append(var9);
                }
                var6.reverse();
                if (arg0 >= -72) {
                    field3207 = null;
                }
                var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                return var6.toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(II)V", line = 428)
    public class221(int arg0, int arg1) {
        super.field5651 = (long) arg1 | (long) arg0 << 32;
    }
}
