import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class29 extends class331 {

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "Lmq;")
    public static class78 field470 = new class78(39, 11);

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "[I")
    public static int[] field474 = new int[13];

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)I", line = 5)
    public final int method292(byte arg0) {
        if (arg0 >= -119) {
            this.method226((byte) -48);
        }
        ++field477;
        return super.field4202;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(ILts;)V", line = 16)
    public class29(int arg0, class41 arg1) {
        super(arg0, arg1);
        class542.method3083((byte) 110, super.field4202);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)I", line = 24)
    public final int method226(byte arg0) {
        if (arg0 != 13) {
            field474 = null;
        }
        ++field468;
        return ~super.field4203.method343((byte) 125).method357(arg0 ^ -14) > -97 ? 0 : 2;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V", line = 39)
    public static void method293(int arg0) {
        if (arg0 != 65408) {
            field470 = null;
        }
        field474 = null;
        field470 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(DB)V", line = 50)
    public static final void method294(double arg0, byte arg1) {
        int var3 = -126 / ((-65 - arg1) / 59);
        if (class192.field2504 != arg0) {
            for (int var4 = 0; ~var4 > -257; ++var4) {
                int var5 = (int) (Math.pow((double) var4 / 255.0D, arg0) * 255.0D);
                class471.field6766[var4] = ~var5 >= -256 ? var5 : 255;
            }
            class192.field2504 = arg0;
        }
        ++field472;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)V", line = 78)
    public final void method227(int arg0, int arg1) {
        super.field4202 = arg1;
        ++field469;
        if (arg0 >= 113) {
            class542.method3083((byte) 89, super.field4202);
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)Z", line = 90)
    public final boolean method295(byte arg0) {
        ++field467;
        if (arg0 < 103) {
            field474 = null;
        }
        return super.field4203.method343((byte) 124).method357(-1) >= 96;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lts;)V", line = 105)
    public class29(class41 arg0) {
        super(arg0);
        class542.method3083((byte) -97, super.field4202);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)I", line = 116)
    public final int method222(int arg0, int arg1) {
        ++field473;
        if (super.field4203.method343((byte) 126).method357(-1) < 96) {
            return 3;
        } else {
            if (arg1 != 1) {
                field470 = null;
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIB)I", line = 134)
    public static final int method296(int arg0, int arg1, byte arg2) {
        ++field471;
        if (~arg0 == 1) {
            return 12345678;
        } else if (~arg0 == 0) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (~arg1 < -127) {
                arg1 = 126;
            }
            return arg1;
        } else if (arg2 != 107) {
            return -76;
        } else {
            int var3 = (127 & arg0) * arg1 >> 7;
            if (var3 >= 2) {
                if (var3 > 126) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            return (65408 & arg0) + var3;
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V", line = 173)
    public static final void method297(int arg0) {
        ++field475;
        int var1 = class627.field8745;
        int[] var2 = class274.field3465;
        int var3 = 0;
        if (arg0 != 255) {
            method294(-1.750532405273172D, (byte) -54);
        }
        while (~var1 < ~var3) {
            class546 var4 = class447.field6287[var2[var3]];
            if (var4 != null) {
                class607.method3331(var4, (byte) -7, var4.method253((byte) -27));
            }
            ++var3;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 205)
    public final void method224(int arg0) {
        if (super.field4203.method343((byte) 126).method357(-1) < 96) {
            super.field4202 = 0;
        }
        ++field476;
        if (super.field4202 < 0 || ~super.field4202 < -3) {
            super.field4202 = this.method226((byte) 13);
        }
        if (arg0 != -1959) {
            field474 = null;
        }
    }
}
