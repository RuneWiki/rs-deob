import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class122 extends class220 {

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "I")
    private int field1634 = 4;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    private int field1622 = 4;

    @OriginalMember(owner = "client!b", name = "V", descriptor = "S")
    public static short field1627 = 1;

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "I")
    public static int field1631 = 0;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    public static int field1625 = 0;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
    public static int field1630 = 0;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "Z")
    public static boolean field1635 = false;

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "Z")
    public static boolean field1640 = false;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!b", name = "U", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!b", name = "W", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "Lqj;")
    public static class238 field1623;

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "[I")
    public static int[] field1641;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lro;ILfi;Ldr;Lsn;ILjava/lang/String;IIBII)V", line = 3)
    public static final void method839(class249 arg0, int arg1, class165 arg2, class213 arg3, class449 arg4, int arg5, String arg6, int arg7, int arg8, byte arg9, int arg10, int arg11) {
        ++field1638;
        int var12;
        if (class5.field48 == 4) {
            var12 = (int) class170.field2244 & 16383;
        } else {
            var12 = (int) class170.field2244 + class66.field942 & 16383;
        }
        int var13 = 10 + Math.max(arg0.field3578 / 2, arg0.field3604 / 2);
        int var14 = arg1 * arg1 + arg8 * arg8;
        if (~var14 >= ~(var13 * var13)) {
            int var15 = class190.field2644[var12];
            int var16 = class190.field2635[var12];
            if (class5.field48 != 4) {
                var16 = var16 * 256 / (class59.field858 + 256);
                var15 = var15 * 256 / (class59.field858 + 256);
            }
            int var17 = arg1 * var16 + arg8 * var15 >> 15;
            if (arg9 <= 31) {
                field1631 = -39;
            }
            int var18 = arg8 * var16 + -(arg1 * var15) >> 15;
            int var19 = arg2.method1025((byte) -68, 100, arg6, (class243[]) null);
            int var20 = var17 - var19 / 2;
            int var21 = arg2.method1026((class243[]) null, arg6, 100, 1, 0);
            if (~(-arg0.field3578) >= ~var20 && ~arg0.field3578 <= ~var20 && ~(-arg0.field3604) >= ~var18 && arg0.field3604 >= var18) {
                arg3.method1323((int[]) null, arg4, arg10, 0, arg0.field3604 / 2 + arg10 + -var18 - arg5 + -var21, 0, arg7, arg11, 50, 0, 23008, arg6, (class243[]) null, arg0.field3578 / 2 + arg7 + var20, var19, 1);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(II)[I", line = 56)
    public final int[] method43(int arg0, int arg1) {
        if (arg0 != -11543) {
            this.method2(-21, (byte) 114, (class265) null);
        }
        ++field1637;
        int[] var3 = super.field3125.method2005(arg1, (byte) 83);
        if (super.field3125.field4676) {
            int var4 = class344.field5043 / this.field1622;
            int var5 = class110.field1518 / this.field1634;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method1366(0, (byte) -40, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1366(0, (byte) -40, class110.field1518 * var7 / var5);
            }
            for (int var8 = 0; ~var8 > ~class344.field5043; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class344.field5043 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIILqc;Lnr;III)Lqc;", line = 112)
    public static final class95 method840(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class437 arg7, int arg8, int arg9, int arg10) {
        ++field1636;
        int var11 = 76 / ((arg0 - 56) / 42);
        long var12 = (long) arg9;
        class95 var14 = (class95) class367.field5457.method209(127, var12);
        short var15 = 1031;
        if (var14 == null) {
            class180 var16 = class357.method2343(arg9, 0, class7.field70, 1);
            if (var16 == null) {
                return null;
            }
            var14 = arg7.method2164(var16, var15, class127.field1690, 64, 768);
            class367.field5457.method202(true, var14, var12);
        }
        class95 var17 = var14.method628((byte) 2, var15, true);
        if (arg1 != 0) {
            var17.method605(arg1);
        }
        if (arg2 != 0) {
            var17.method629(arg2);
        }
        if (arg5 != 0) {
            var17.method592(arg5);
        }
        if (~arg8 != -1) {
            var17.method613(0, arg8, 0);
        }
        return var17;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(Lnr;I)V", line = 157)
    public static final void method841(class437 arg0, int arg1) {
        ++field1624;
        if (arg1 != 0) {
            field1635 = true;
        }
        if (class229.field3230) {
            class91.method564(-122, arg0);
        } else {
            class220.method1372(arg0, -25084);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 205)
    public class122() {
        super(1, false);
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "(B)V", line = 182)
    public static final void method842(byte arg0) {
        ++field1628;
        class187.field2545 = -1;
        if (arg0 == 50) {
            class419.field6227 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V", line = 194)
    public static void method843(int arg0) {
        field1623 = null;
        field1641 = null;
        if (arg0 != 1) {
            method843(101);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)[[I", line = 213)
    public final int[][] method1(int arg0, int arg1) {
        ++field1626;
        int[][] var3 = super.field3135.method1774(arg0, -2);
        if (super.field3135.field4087) {
            int var4 = class344.field5043 / this.field1622;
            int var5 = class110.field1518 / this.field1634;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method1369(0, (byte) 127, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1369(0, (byte) 115, class110.field1518 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class344.field5043; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class344.field5043 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return arg1 != 0 ? null : var3;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/lang/String;)J", line = 281)
    public static final long method844(int arg0, String arg1) {
        ++field1629;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var2 > var5; ++var5) {
            var3 = (var3 << 5) + -var3 - -((long) arg1.charAt(var5));
        }
        if (arg0 != -1) {
            method841((class437) null, 109);
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(II)V", line = 316)
    public static final void method845(int arg0, int arg1) {
        if (arg1 != 0) {
            field1623 = null;
        }
        ++field1639;
        if (~class24.field428 != -1) {
            class35.field576 = arg0;
        } else {
            class413.field6182.method2285(1570943944, arg0);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBLil;)V", line = 333)
    public final void method2(int arg0, byte arg1, class265 arg2) {
        ++field1621;
        if (arg1 == -49) {
            if (arg0 != 0) {
                if (arg0 == 1) {
                    this.field1634 = arg2.method1697(arg1 ^ 15);
                }
            } else {
                this.field1622 = arg2.method1697(101);
            }
        }
    }
}
