import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class class343 extends class593 {

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "S")
    public short field4980;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "Lmia;")
    public static class63 field4975 = new class63(24, 7);

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)V", line = 3)
    public static final void method2176(int arg0) {
        ++field4976;
        int var1 = class396.field5946 * 512 + 256;
        int var2 = class601.field8509 * 512 + 256;
        int var3 = class384.method2468(true, var1, class341.field4946, var2) - class240.field3489;
        if (class345.field4991 < 100) {
            if (~class364.field5254 > ~var1) {
                class364.field5254 += class71.field1008 - -((-class364.field5254 + var1) * class345.field4991 / 1000);
                if (class364.field5254 > var1) {
                    class364.field5254 = var1;
                }
            }
            if (class364.field5254 > var1) {
                class364.field5254 -= (-var1 + class364.field5254) * class345.field4991 / 1000 + class71.field1008;
                if (class364.field5254 < var1) {
                    class364.field5254 = var1;
                }
            }
            if (var3 > class259.field3700) {
                class259.field3700 += (-class259.field3700 + var3) * class345.field4991 / 1000 + class71.field1008;
                if (class259.field3700 > var3) {
                    class259.field3700 = var3;
                }
            }
            if (var3 < class259.field3700) {
                class259.field3700 -= (class259.field3700 - var3) * class345.field4991 / 1000 + class71.field1008;
                if (class259.field3700 < var3) {
                    class259.field3700 = var3;
                }
            }
            if (~class460.field6783 > ~var2) {
                class460.field6783 += (-class460.field6783 + var2) * class345.field4991 / 1000 + class71.field1008;
                if (~var2 > ~class460.field6783) {
                    class460.field6783 = var2;
                }
            }
            if (~var2 > ~class460.field6783) {
                class460.field6783 -= (class460.field6783 - var2) * class345.field4991 / 1000 + class71.field1008;
                if (~class460.field6783 > ~var2) {
                    class460.field6783 = var2;
                }
            }
        } else {
            class364.field5254 = class396.field5946 * 512 + 256;
            class460.field6783 = class601.field8509 * 512 - -256;
            class259.field3700 = class384.method2468(true, class364.field5254, class341.field4946, class460.field6783) + -class240.field3489;
        }
        int var4 = class726.field10139 * 512 + 256;
        int var5 = class517.field7387 * 512 - -256;
        int var6 = class384.method2468(true, var5, class341.field4946, var4) - class153.field2476;
        int var7 = -class364.field5254 + var5;
        int var8 = -class259.field3700 + var6;
        int var9 = -class460.field6783 + var4;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = 16383 & (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D);
        if (arg0 <= 75) {
            method2176(-118);
        }
        if (~var11 > -1025) {
            var11 = 1024;
        }
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 16383;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class120.field1650 < var11) {
            class120.field1650 += (var11 - class120.field1650 >> 3) * class583.field8297 / 1000 + class762.field10618 << 3;
            if (var11 < class120.field1650) {
                class120.field1650 = var11;
            }
        }
        if (class120.field1650 > var11) {
            class120.field1650 -= (-var11 + class120.field1650 >> 3) * class583.field8297 / 1000 + class762.field10618 << 3;
            if (~class120.field1650 > ~var11) {
                class120.field1650 = var11;
            }
        }
        int var13 = -class660.field9234 + var12;
        if (~var13 < -8193) {
            var13 -= 16384;
        }
        if (~var13 > 8191) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class660.field9234 += class583.field8297 * var14 / 1000 + class762.field10618 << 3;
            class660.field9234 &= 16383;
        }
        if (~var14 > -1) {
            class660.field9234 -= -var14 * class583.field8297 / 1000 + class762.field10618 << 3;
            class660.field9234 &= 16383;
        }
        int var15 = var12 - class660.field9234;
        if (~var15 < -8193) {
            var15 -= 16384;
        }
        if (~var15 > 8191) {
            var15 += 16384;
        }
        class253.field3649 = 0;
        if (var15 < 0 && ~var14 < -1 || var15 > 0 && var14 < 0) {
            class660.field9234 = var12;
        }
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)Z", line = 163)
    public final boolean method85(int arg0) {
        ++field4973;
        int var2 = 86 / ((arg0 - 16) / 58);
        return class464.field6819[(super.field8423 >> class459.field6769) + -class736.field10315 + class60.field843][(super.field8428 >> class459.field6769) + -class116.field1600 + class60.field843];
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[Lraa;)I", line = 174)
    public final int method84(int arg0, class609[] arg1) {
        ++field4977;
        return arg0 < 24 ? -101 : this.method3463(super.field8428 >> class459.field6769, arg1, false, super.field8423 >> class459.field6769);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Lha;I)Z", line = 185)
    public final boolean method79(class60 arg0, int arg1) {
        ++field4979;
        return arg1 != 9721 ? false : class361.method2249(super.field8428 >> class459.field6769, arg1 ^ 9635, super.field8423 >> class459.field6769, super.field8417);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZI)Ljava/lang/String;", line = 203)
    public static final String method2177(int arg0, boolean arg1, int arg2) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field4974;
            return arg1 && arg2 >= 0 ? class744.method4165(arg1, (byte) 114, arg2, 10) : Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIZ)V", line = 219)
    public static final void method2178(int arg0, int arg1, int arg2, boolean arg3) {
        ++field4978;
        String var4 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (63 & arg2) + "," + (arg1 & 63);
        System.out.println(var4);
        class284.method1822(arg3, true, 29061, var4);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V", line = 232)
    public static void method2179(boolean arg0) {
        if (arg0) {
            method2180((class593) null, false, true);
        }
        field4975 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lvs;ZZ)V", line = 248)
    public static final void method2180(class593 arg0, boolean arg1, boolean arg2) {
        arg0.field8422 = arg2;
        if (class413.field6206) {
            if (arg1) {
                class379.field5736[class379.field5736.length - 1].method288(arg0, (byte) 23);
            } else {
                int var3 = class409.method2600(arg0.field8424);
                int var4 = class307.field4348[2] * arg0.method313((byte) 3) / arg0.field8425;
                int var5 = class409.method2600(arg0.field8424 - var4);
                int var6 = class409.method2600(arg0.field8424 + var4);
                if (var5 == var6) {
                    class379.field5736[var3].method288(arg0, (byte) 23);
                } else if (var6 - var5 == 1) {
                    class379.field5736[class412.field6191 + var5].method288(arg0, (byte) 23);
                } else {
                    class379.field5736[class379.field5736.length - 1].method288(arg0, (byte) 23);
                }
            }
        } else {
            class91.method724(arg0, class658.field9213);
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IIIIII)V", line = 281)
    public class343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4980 = (short) arg5;
        super.field8421 = arg1;
        super.field8428 = arg2;
        super.field8417 = (byte) arg4;
        super.field8429 = (byte) arg3;
        super.field8423 = arg0;
    }
}
