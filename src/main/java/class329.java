import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class329 extends class34 {

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    private int field4478 = -1;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public static int field4472 = 0;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public int field4475;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public int field4480;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "[I")
    public int[] field4470;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)I", line = 3)
    public final int method250(boolean arg0) {
        ++field4468;
        if (!arg0) {
            method1942(true, (String) null);
        }
        return this.field4478;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZZ)Z", line = 18)
    public static boolean method1940(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 25)
    public final void method249(int arg0) {
        ++field4469;
        int var2 = 7 / ((arg0 - -34) / 52);
        super.method249(32);
        this.field4470 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lat;Lat;I)V", line = 36)
    public static final void method1941(class444 arg0, class444 arg1, int arg2) {
        class274.method1602(14, class38.field570);
        ++field4473;
        ++class239.field3303;
        class17.field275.method1858(arg1.field6469, (byte) -56);
        class17.field275.method1866(arg0.field6481, true);
        class17.field275.method1858(arg0.field6469, (byte) -83);
        class17.field275.method1866(arg0.field6510, true);
        class17.field275.method1884(arg1.field6481, (byte) -122);
        class17.field275.method1857(561746448, arg1.field6510);
        if (arg2 <= 98) {
            method1942(false, (String) null);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZLjava/lang/String;)J", line = 62)
    public static final long method1942(boolean arg0, String arg1) {
        ++field4477;
        long var2 = 0L;
        int var4 = arg1.length();
        if (arg0) {
            return -47L;
        } else {
            for (int var5 = 0; var5 < var4; ++var5) {
                var2 *= 37L;
                char var6 = arg1.charAt(var5);
                if (var6 >= 'A' && ~var6 >= -91) {
                    var2 += (long) (var6 + -65 + 1);
                } else if (~var6 <= -98 && ~var6 >= -123) {
                    var2 += (long) (var6 + -97 + 1);
                } else if (~var6 <= -49 && var6 <= '9') {
                    var2 += (long) (var6 + 27 + -48);
                }
                if (var2 >= 177917621779460413L) {
                    break;
                }
            }
            while (var2 % 37L == 0L && ~var2 != -1L) {
                var2 /= 37L;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)Z", line = 107)
    public final boolean method1943(byte arg0) {
        ++field4481;
        if (this.field4470 != null) {
            return true;
        } else if (~this.field4478 <= -1) {
            class396 var2 = class12.field135 < 0 ? class396.method2350(class177.field2662, this.field4478) : class396.method2353(class177.field2662, class12.field135, this.field4478);
            var2.method2348();
            this.field4470 = var2.method2352();
            this.field4475 = var2.field5700;
            this.field4480 = var2.field5696;
            return true;
        } else {
            return arg0 != 75 ? false : false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)V", line = 134)
    public static final void method1944(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class76.field1075.field3651 != 0 && ~arg4 != -1 && ~class40.field602 > -51 && ~arg2 != 0) {
            class320.field4411[class40.field602++] = new class441((byte) 2, arg2, arg4, arg0, arg3, 0);
        }
        ++field4474;
        if (arg1 != 37) {
            method1944(59, 57, -29, -34, 2);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILws;)V", line = 152)
    public static final void method1945(int arg0, class440 arg1) {
        ++field4476;
        if (!class526.field7677) {
            arg1.method2791((byte) 112);
            if (arg0 == 0) {
                --class527.field7690;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lsv;II)V", line = 168)
    public final void method69(class319 arg0, int arg1, int arg2) {
        ++field4479;
        if (arg2 == 0) {
            this.field4478 = arg0.method1844(-115);
        }
        if (arg1 <= 16) {
            field4472 = -105;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)[[I", line = 181)
    public int[][] method66(byte arg0, int arg1) {
        ++field4471;
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (arg0 != -11) {
            this.field4475 = 17;
        }
        if (super.field536.field726 && this.method1943((byte) 75)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field4480 * (~class494.field7150 == ~this.field4475 ? arg1 : this.field4475 * arg1 / class494.field7150);
            if (~class383.field5502 != ~this.field4480) {
                for (int var8 = 0; ~class383.field5502 < ~var8; ++var8) {
                    int var9 = this.field4480 * var8 / class383.field5502;
                    int var10 = this.field4470[var7 + var9];
                    var6[var8] = class375.method2245(255, var10) << 4;
                    var5[var8] = class375.method2245(65280, var10) >> 4;
                    var4[var8] = class375.method2245(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class383.field5502; ++var11) {
                    int var12 = this.field4470[var7++];
                    var6[var11] = class375.method2245(255, var12) << 4;
                    var5[var11] = class375.method2245(var12, 65280) >> 4;
                    var4[var11] = class375.method2245(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V", line = 251)
    public class329() {
        super(0, false);
    }
}
