import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class352 extends class338 implements class226 {

    @OriginalMember(owner = "client!vl", name = "U", descriptor = "Z")
    private boolean field4982;

    @OriginalMember(owner = "client!vl", name = "R", descriptor = "B")
    private byte field4979;

    @OriginalMember(owner = "client!vl", name = "Z", descriptor = "Z")
    private boolean field4987;

    @OriginalMember(owner = "client!vl", name = "kb", descriptor = "B")
    private byte field4998;

    @OriginalMember(owner = "client!vl", name = "jb", descriptor = "Z")
    private boolean field4997;

    @OriginalMember(owner = "client!vl", name = "ab", descriptor = "S")
    private short field4988;

    @OriginalMember(owner = "client!vl", name = "rb", descriptor = "Z")
    private boolean field5005;

    @OriginalMember(owner = "client!vl", name = "T", descriptor = "Lka;")
    public class233 field4981;

    @OriginalMember(owner = "client!vl", name = "xb", descriptor = "Lr;")
    private class115 field5011;

    @OriginalMember(owner = "client!vl", name = "ib", descriptor = "Lss;")
    public static class307 field4996 = new class307("", 13);

    @OriginalMember(owner = "client!vl", name = "Q", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!vl", name = "S", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!vl", name = "V", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!vl", name = "W", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!vl", name = "X", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!vl", name = "Y", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!vl", name = "bb", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!vl", name = "cb", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!vl", name = "db", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!vl", name = "fb", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!vl", name = "gb", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!vl", name = "hb", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!vl", name = "mb", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!vl", name = "nb", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!vl", name = "ob", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!vl", name = "pb", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!vl", name = "qb", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!vl", name = "sb", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!vl", name = "tb", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!vl", name = "ub", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!vl", name = "vb", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!vl", name = "wb", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!vl", name = "yb", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!vl", name = "eb", descriptor = "Lmg;")
    private class248 field4992;

    @OriginalMember(owner = "client!vl", name = "zb", descriptor = "Lda;")
    public static class443 field5013;

    @OriginalMember(owner = "client!vl", name = "lb", descriptor = "[Lmq;")
    public static class85[] field4999;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(Z)Z", line = 3)
    public final boolean method197(boolean arg0) {
        ++field4980;
        if (!arg0) {
            this.field4997 = true;
        }
        return this.field4987;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lha;Lsea;IIIIIZIIZ)V", line = 15)
    public class352(class475 arg0, class416 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class781.method4292((byte) 125, arg9, arg8));
        this.field4982 = arg1.field5754 != 0 && !arg7;
        this.field4979 = (byte) arg9;
        this.field4987 = arg10;
        this.field4998 = (byte) arg8;
        super.field10350 = arg6;
        super.field10347 = arg4;
        this.field4997 = arg7;
        this.field4988 = (short) arg1.field5746;
        this.field5005 = arg0.method500() && arg1.field5770 && !this.field4997 && ~class420.field5820.field9457.method3741(17539) != -1;
        int var12 = 2048;
        if (this.field4987) {
            var12 |= 65536;
        }
        class529 var13 = this.method2133(arg0, false, this.field5005, var12);
        if (var13 != null) {
            this.field4981 = var13.field7375;
            this.field5011 = var13.field7377;
            if (this.field4987) {
                this.field4981 = this.field4981.method585((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)I", line = 51)
    public final int method1165(byte arg0) {
        if (arg0 <= 89) {
            return -64;
        } else {
            ++field4978;
            return 65535 & this.field4988;
        }
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(B)I", line = 63)
    public final int method1174(byte arg0) {
        int var2 = 15 % ((arg0 - -63) / 47);
        ++field4994;
        return this.field4979;
    }

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "(I)I", line = 76)
    public final int method1167(int arg0) {
        if (arg0 < 75) {
            this.field4992 = null;
        }
        ++field4985;
        return this.field4981 != null ? this.field4981.method534() : 0;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(BLha;)Lmg;", line = 88)
    public final class248 method205(byte arg0, class475 arg1) {
        if (arg0 != 45) {
            this.field4998 = -31;
        }
        ++field5007;
        if (this.field4992 == null) {
            this.field4992 = class229.method1563(super.field10350, super.field10358, (byte) -119, this.method2134((byte) -89, 0, arg1), super.field10347);
        }
        return this.field4992;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lha;ZZI)Liu;", line = 102)
    private final class529 method2133(class475 arg0, boolean arg1, boolean arg2, int arg3) {
        ++field4984;
        if (arg1) {
            field4996 = null;
        }
        class416 var5 = class312.field4418.method369((byte) 125, this.field4988 & 65535);
        class419 var6;
        class419 var7;
        if (!this.field4997) {
            var6 = class495.field6799[super.field10349];
            if (super.field10349 < 3) {
                var7 = class495.field6799[super.field10349 + 1];
            } else {
                var7 = null;
            }
        } else {
            var7 = class495.field6799[0];
            var6 = class454.field6207[super.field10349];
        }
        return var5.method2447(-106, this.field4979, this.field4998, super.field10350, arg3, arg2, super.field10358, var7, (class685) null, super.field10347, arg0, var6);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Z", line = 135)
    public final boolean method1164(byte arg0) {
        ++field5006;
        if (arg0 != 4) {
            this.method1175((byte) 75);
        }
        return this.field5005;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BILha;)Lka;", line = 146)
    private final class233 method2134(byte arg0, int arg1, class475 arg2) {
        ++field4993;
        if (this.field4981 != null && ~arg2.method497(this.field4981.method591(), arg1) == -1) {
            return this.field4981;
        } else {
            int var4 = -24 / ((35 - arg0) / 47);
            class529 var5 = this.method2133(arg2, false, false, arg1);
            return var5 == null ? null : var5.field7375;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIII)V", line = 168)
    public static final void method2135(int arg0, int arg1, int arg2, int arg3) {
        ++field4990;
        int var4 = class222.field3266 + arg2;
        if (arg3 != 315555113) {
            field4999 = null;
        }
        int var5 = class697.field9798 + arg0;
        if (class514.field7096 != null && ~arg2 <= -1 && ~arg0 <= -1 && ~arg2 > ~class192.field2891 && ~class456.field6225 < ~arg0) {
            if (~class420.field5820.field9495.method1677(arg3 + -315537574) != -1 || class719.field10041.field10361 == arg1) {
                long var6 = (long) (var4 | arg1 << 28 | var5 << 14);
                class482 var8 = (class482) class400.field5509.method4253(var6, arg3 + -315555114);
                if (var8 == null) {
                    class439.method2610(arg1, arg2, arg0);
                } else {
                    class636 var9 = (class636) var8.field6618.method3731((byte) -80);
                    if (var9 == null) {
                        class439.method2610(arg1, arg2, arg0);
                    } else {
                        class753 var10 = (class753) class439.method2610(arg1, arg2, arg0);
                        if (var10 == null) {
                            var10 = new class753(arg2 << 9, class678.field9594[arg1].method2476(arg0, arg2, -1), arg0 << 9, arg1, arg1);
                        } else {
                            var10.field10465 = var10.field10480 = -1;
                        }
                        var10.field10475 = var9.field8989;
                        var10.field10481 = var9.field8991;
                        label60: while (true) {
                            class636 var11 = (class636) var8.field6618.method3729((byte) 34);
                            if (var11 == null) {
                                break;
                            }
                            if (var10.field10475 != var11.field8989) {
                                var10.field10465 = var11.field8989;
                                var10.field10477 = var11.field8991;
                                while (true) {
                                    class636 var12 = (class636) var8.field6618.method3729((byte) 30);
                                    if (var12 == null) {
                                        break label60;
                                    }
                                    if (~var10.field10475 != ~var12.field8989 && var10.field10465 != var12.field8989) {
                                        var10.field10468 = var12.field8991;
                                        var10.field10480 = var12.field8989;
                                    }
                                }
                            }
                        }
                        int var13 = class577.method3399((arg0 << 9) + 256, (arg2 << 9) + 256, -8724, arg1);
                        var10.field10350 = arg0 << 9;
                        var10.field10349 = (byte) arg1;
                        var10.field10358 = var13;
                        var10.field10347 = arg2 << 9;
                        var10.field10361 = (byte) arg1;
                        var10.field10482 = 0;
                        if (class717.method3994(32281, arg2, arg0)) {
                            ++var10.field10349;
                        }
                        class683.method3870(arg1, arg2, arg0, var13, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(ILha;)V", line = 264)
    public final void method1169(int arg0, class475 arg1) {
        ++field4995;
        Object var3 = null;
        if (arg0 != -10526) {
            this.method1170(122);
        }
        class115 var5;
        if (this.field5011 == null && this.field5005) {
            class529 var4 = this.method2133(arg1, false, true, 262144);
            var5 = var4 != null ? var4.field7377 : null;
        } else {
            var5 = this.field5011;
            this.field5011 = null;
        }
        if (var5 != null) {
            class632.method3610(var5, super.field10349, super.field10347, super.field10350, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BIILha;)Z", line = 292)
    public final boolean method198(byte arg0, int arg1, int arg2, class475 arg3) {
        ++field5001;
        class233 var5 = this.method2134((byte) -126, 131072, arg3);
        int var6 = -13 / ((arg0 - 51) / 51);
        if (var5 != null) {
            class765 var7 = arg3.method457();
            var7.method1568(super.field10347, super.field10358, super.field10350);
            return class765.field10581 ? var5.method584(arg1, arg2, var7, false, 0, class349.field4956) : var5.method589(arg1, arg2, var7, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lha;I)Luh;", line = 313)
    public final class162 method204(class475 arg0, int arg1) {
        ++field5009;
        if (this.field4981 == null) {
            return null;
        } else {
            if (arg1 != -1) {
                this.field4987 = true;
            }
            class765 var3 = arg0.method457();
            var3.method1568(super.field10347, super.field10358, super.field10350);
            class162 var4 = class527.method3085(1, this.field4982, 0);
            if (!class765.field10581) {
                this.field4981.method575(var3, var4.field2500[0], 0);
            } else {
                this.field4981.method546(var3, var4.field2500[0], class349.field4956, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZLol;)V", line = 341)
    public static final void method2136(boolean arg0, class431 arg1) {
        ++field5010;
        int var2 = arg1.method2527((byte) -24);
        class583.field8379 = new class74[var2];
        for (int var3 = 0; var3 < var2; ++var3) {
            class583.field8379[var3] = new class74();
            class583.field8379[var3].field1140 = arg1.method2527((byte) -24);
            class583.field8379[var3].field1139 = arg1.method2537((byte) 27);
        }
        class527.field7353 = arg1.method2527((byte) -24);
        class42.field516 = arg1.method2527((byte) -24);
        class720.field10051 = arg1.method2527((byte) -24);
        class142.field2319 = new class422[class42.field516 - -1 + -class527.field7353];
        for (int var4 = 0; var4 < class720.field10051; ++var4) {
            int var5 = arg1.method2527((byte) -24);
            class422 var6 = class142.field2319[var5] = new class422();
            var6.field2305 = arg1.method2557(14929);
            var6.field2300 = arg1.method2526(17);
            var6.field5877 = var5 - -class527.field7353;
            var6.field5871 = arg1.method2537((byte) 27);
            var6.field5868 = arg1.method2537((byte) 27);
        }
        if (!arg0) {
            class74.field1145 = arg1.method2526(17);
            class497.field6832 = true;
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)V", line = 389)
    public final void method1172(byte arg0) {
        if (this.field4981 != null) {
            this.field4981.method583();
        }
        ++field5008;
        if (arg0 <= 72) {
            this.method198((byte) -36, -13, 80, (class475) null);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILha;)V", line = 410)
    public final void method1163(int arg0, class475 arg1) {
        ++field4986;
        Object var3 = null;
        class115 var5;
        if (this.field5011 == null && this.field5005) {
            class529 var4 = this.method2133(arg1, false, true, 262144);
            var5 = var4 == null ? null : var4.field7377;
        } else {
            var5 = this.field5011;
            this.field5011 = null;
        }
        if (var5 != null) {
            class460.method2686(var5, super.field10349, super.field10347, super.field10350, (boolean[]) null);
        }
        if (arg0 != 18030) {
            this.field4987 = true;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBI)I", line = 437)
    public static final int method2137(int arg0, byte arg1, int arg2) {
        ++field5003;
        if (arg1 >= -31) {
            field4996 = null;
        }
        return ~arg0 != -2 && arg0 != 3 ? class575.field8296[arg2 & 3] : class563.field7862[3 & arg2];
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)Z", line = 455)
    public final boolean method1170(int arg0) {
        ++field5000;
        if (arg0 != 16383) {
            return true;
        } else if (this.field4981 != null) {
            return !this.field4981.method587();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(ILha;)V", line = 471)
    public final void method192(int arg0, class475 arg1) {
        ++field5002;
        if (arg0 < 2) {
            this.field4979 = 27;
        }
    }

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "(B)Z", line = 485)
    public final boolean method1175(byte arg0) {
        ++field4989;
        if (arg0 < 38) {
            this.field5011 = null;
        }
        return this.field4981 != null ? this.field4981.method558() : false;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)I", line = 500)
    public final int method1173(boolean arg0) {
        ++field4991;
        if (!arg0) {
            this.field4997 = false;
        }
        return this.field4981 != null ? this.field4981.method544() : 0;
    }

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)V", line = 513)
    public final void method196(int arg0) {
        ++field5012;
        if (arg0 != -10382) {
            this.method1169(76, (class475) null);
        }
        this.field4987 = false;
        if (this.field4981 != null) {
            this.field4981.method523(this.field4981.method591() & -65537);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)I", line = 532)
    public final int method1166(int arg0) {
        ++field5004;
        int var2 = -70 / ((arg0 - 14) / 62);
        return this.field4998;
    }

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "(I)V", line = 542)
    public static void method2138(int arg0) {
        field5013 = null;
        field4996 = null;
        if (arg0 != 0) {
            field5013 = null;
        }
        field4999 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIILha;Lnfa;ZI)V", line = 554)
    public final void method194(int arg0, int arg1, int arg2, class475 arg3, class745 arg4, boolean arg5, int arg6) {
        if (arg0 != -24659) {
            this.field4987 = true;
        }
        ++field4983;
        if (arg4 instanceof class352) {
            class352 var8 = (class352) arg4;
            if (this.field4981 != null && var8.field4981 != null) {
                this.field4981.method559(var8.field4981, arg1, arg6, arg2, arg5);
            }
        } else {
            if (arg4 instanceof class497) {
                class497 var9 = (class497) arg4;
                if (this.field4981 != null && var9.field6817 != null) {
                    this.field4981.method559(var9.field6817, arg1, arg6, arg2, arg5);
                    return;
                }
            }
        }
    }
}
