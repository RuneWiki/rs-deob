import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class459 extends class83 {

    @OriginalMember(owner = "client!vn", name = "G", descriptor = "I")
    private int field6459 = -1;

    @OriginalMember(owner = "client!vn", name = "E", descriptor = "I")
    private int field6457 = 0;

    @OriginalMember(owner = "client!vn", name = "K", descriptor = "Z")
    public boolean field6463 = false;

    @OriginalMember(owner = "client!vn", name = "bb", descriptor = "I")
    private int field6480 = 0;

    @OriginalMember(owner = "client!vn", name = "L", descriptor = "I")
    private int field6464 = -32768;

    @OriginalMember(owner = "client!vn", name = "J", descriptor = "I")
    public int field6462;

    @OriginalMember(owner = "client!vn", name = "P", descriptor = "I")
    private int field6468;

    @OriginalMember(owner = "client!vn", name = "O", descriptor = "Lhu;")
    private class207 field6467;

    @OriginalMember(owner = "client!vn", name = "X", descriptor = "Lpn;")
    public static class72 field6476 = new class72(6, 0);

    @OriginalMember(owner = "client!vn", name = "eb", descriptor = "Lsd;")
    public static class74 field6483 = new class74(99, 8);

    @OriginalMember(owner = "client!vn", name = "F", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!vn", name = "H", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!vn", name = "M", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!vn", name = "N", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!vn", name = "Q", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!vn", name = "R", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!vn", name = "S", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!vn", name = "T", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!vn", name = "U", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!vn", name = "V", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!vn", name = "W", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!vn", name = "Y", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!vn", name = "Z", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!vn", name = "ab", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!vn", name = "cb", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!vn", name = "fb", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!vn", name = "gb", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!vn", name = "hb", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!vn", name = "db", descriptor = "Lnk;")
    public static class224 field6482;

    @OriginalMember(owner = "client!vn", name = "I", descriptor = "Lbt;")
    private class380 field6461;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(ILoj;)Lmg;", line = 3)
    public final class451 method19(int arg0, class280 arg1) {
        ++field6458;
        class352 var3 = this.method2704(1024, -1, arg1);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 < 95) {
                field6483 = null;
            }
            class327 var4 = arg1.method1456();
            var4.method553(super.field1008, super.field1001, super.field1005);
            if (this.field6461 != null) {
                class46 var5 = this.field6461.method2272();
                arg1.method1463(var3, var5, var4, (class465) null, 0);
            } else {
                var3.method1716(var4, (class465) null, 0);
            }
            this.field6464 = var3.method1733();
            this.method2701((byte) 83, arg1, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V", line = 36)
    public final void method32(int arg0) {
        if (arg0 != -2) {
            method2708(59);
        }
        ++field6474;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vn", name = "finalize", descriptor = "()V", line = 47)
    protected final void finalize() {
        if (this.field6461 != null) {
            this.field6461.method2281();
        }
        ++field6486;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZI)V", line = 57)
    public final void method2699(boolean arg0, int arg1) {
        ++field6465;
        if (!this.field6463) {
            this.field6480 += arg1;
            if (arg0) {
                while (~this.field6480 < ~this.field6467.field2843[this.field6457]) {
                    this.field6480 -= this.field6467.field2843[this.field6457];
                    ++this.field6457;
                    if (~this.field6457 <= ~this.field6467.field2853.length) {
                        this.field6463 = true;
                        break;
                    }
                }
                if (!this.field6463) {
                    class126.method602(this.field6467, false, super.field1008, this.field6457, super.field1005, !arg0, super.field994);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(ILoj;)V", line = 91)
    public final void method27(int arg0, class280 arg1) {
        ++field6466;
        class352 var3 = this.method2704(arg0, -1, arg1);
        if (var3 != null) {
            this.method2701((byte) 86, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)I", line = 109)
    public static final int method2700(byte arg0, int arg1) {
        int var2 = 118 % ((-6 - arg0) / 32);
        ++field6473;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)Z", line = 119)
    public final boolean method33(int arg0) {
        ++field6478;
        if (arg0 != 1957) {
            this.field6461 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 393)
    public class459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field6462 = arg1 + arg2;
        this.field6468 = arg0;
        int var12 = class234.field3258.method2456(this.field6468, 600).field178;
        if (~var12 != 0) {
            this.field6463 = false;
            this.field6467 = class175.field2103.method1267(-35, var12);
        } else {
            this.field6463 = true;
        }
        if (this.field6462 == arg2) {
            class126.method602(this.field6467, false, super.field1008, this.field6457, super.field1005, false, super.field994);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BLoj;Lqh;)V", line = 146)
    private final void method2701(byte arg0, class280 arg1, class352 arg2) {
        ++field6470;
        if (arg0 >= 79) {
            class118[] var4 = arg2.method1721();
            class282[] var5 = arg2.method1707();
            if ((this.field6461 == null || this.field6461.field5380) && (var4 != null || var5 != null)) {
                this.field6461 = new class380(class204.field2796);
            }
            if (this.field6461 != null) {
                this.field6461.method2271(arg1, (long) class204.field2796, var4, var5, false);
                this.field6461.method2274(super.field994, super.field999, super.field1011, super.field1004, super.field997);
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 170)
    public static void method2702(int arg0) {
        field6476 = null;
        field6482 = null;
        if (arg0 == 5890) {
            field6483 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V", line = 182)
    public final void method2703(byte arg0) {
        if (this.field6461 != null) {
            this.field6461.method2281();
        }
        ++field6481;
        if (arg0 < 7) {
            this.method19(-116, (class280) null);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IILoj;)Lqh;", line = 198)
    private final class352 method2704(int arg0, int arg1, class280 arg2) {
        ++field6472;
        class12 var4 = class234.field3258.method2456(this.field6468, arg1 + 601);
        if (arg1 != -1) {
            return null;
        } else {
            return !this.field6463 ? var4.method92(arg1 ^ -4371, this.field6480, this.field6457, class175.field2103, this.field6459, arg0, arg2) : var4.method92(arg1 ^ -4371, 0, -1, class175.field2103, -1, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)I", line = 212)
    public static final int method2705(int arg0, int arg1) {
        if (arg1 != 30753) {
            return 121;
        } else {
            ++field6477;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 230)
    public static final int method2706(int arg0, Random arg1, int arg2) {
        ++field6469;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class234.method1292(20998, arg0)) {
            return (int) ((long) arg0 * ((long) arg1.nextInt() & 4294967295L) >> 32);
        } else {
            int var3 = 63 / ((25 - arg2) / 37);
            int var4 = -((int) (4294967296L % (long) arg0)) + Integer.MIN_VALUE;
            int var5;
            do {
                var5 = arg1.nextInt();
            } while (~var4 >= ~var5);
            return class162.method795(var5, arg0, (byte) -35);
        }
    }

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "(I)I", line = 259)
    public final int method17(int arg0) {
        if (arg0 != -8960) {
            this.field6457 = -7;
        }
        ++field6471;
        return this.field6464;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIZLa;IBLoj;)V", line = 270)
    public final void method23(int arg0, int arg1, boolean arg2, class78 arg3, int arg4, byte arg5, class280 arg6) {
        ++field6460;
        if (arg5 == -65) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IZII)V", line = 284)
    public static final void method2707(int arg0, boolean arg1, int arg2, int arg3) {
        ++field6475;
        if (!arg1) {
            method2705(-96, 78);
        }
        class160 var4 = class200.field2784[arg3][arg0];
        class367.method2220(arg2, var4 == null ? class288.field4314 : var4, false);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILoj;II)Z", line = 297)
    public final boolean method28(int arg0, class280 arg1, int arg2, int arg3) {
        ++field6479;
        return arg3 != -6085;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)Lpi;", line = 308)
    public static final class239 method2708(int arg0) {
        ++field6484;
        class118.field1463 = arg0;
        return class438.method2601(1);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILkd;BIII)Ljava/awt/Frame;", line = 321)
    public static final Frame method2709(int arg0, class355 arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field6485;
        if (!arg1.method2159((byte) 76)) {
            return null;
        } else {
            if (arg3 == 0) {
                class159[] var6 = class368.method2225(70, arg1);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; var6.length > var8; ++var8) {
                    if (~var6[var8].field1902 == ~arg5 && var6[var8].field1905 == arg0 && (~arg4 == -1 || var6[var8].field1894 == arg4) && (!var7 || var6[var8].field1900 > arg3)) {
                        var7 = true;
                        arg3 = var6[var8].field1900;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            if (arg2 != 88) {
                method2700((byte) 105, 81);
            }
            class405 var9 = arg1.method2155(arg0, arg4, 439, arg5, arg3);
            while (var9.field5759 == 0) {
                class85.method433(10L, 76);
            }
            Frame var10 = (Frame) var9.field5755;
            if (var10 == null) {
                return null;
            } else if (~var9.field5759 == -3) {
                class470.method2766((byte) -102, arg1, var10);
                return null;
            } else {
                return var10;
            }
        }
    }
}
