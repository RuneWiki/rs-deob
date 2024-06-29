import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class785 extends class417 implements class274 {

    @OriginalMember(owner = "client!uv", name = "P", descriptor = "Z")
    private boolean field10752;

    @OriginalMember(owner = "client!uv", name = "N", descriptor = "S")
    private short field10750;

    @OriginalMember(owner = "client!uv", name = "db", descriptor = "Z")
    private boolean field10766;

    @OriginalMember(owner = "client!uv", name = "U", descriptor = "Z")
    private boolean field10757;

    @OriginalMember(owner = "client!uv", name = "kb", descriptor = "B")
    private byte field10773;

    @OriginalMember(owner = "client!uv", name = "R", descriptor = "Z")
    private boolean field10754;

    @OriginalMember(owner = "client!uv", name = "bb", descriptor = "Lr;")
    private class736 field10764;

    @OriginalMember(owner = "client!uv", name = "V", descriptor = "Lka;")
    private class299 field10758;

    @OriginalMember(owner = "client!uv", name = "H", descriptor = "I")
    public static int field10744;

    @OriginalMember(owner = "client!uv", name = "I", descriptor = "I")
    public static int field10745;

    @OriginalMember(owner = "client!uv", name = "J", descriptor = "I")
    public static int field10746;

    @OriginalMember(owner = "client!uv", name = "K", descriptor = "I")
    public static int field10747;

    @OriginalMember(owner = "client!uv", name = "L", descriptor = "I")
    public static int field10748;

    @OriginalMember(owner = "client!uv", name = "M", descriptor = "I")
    public static int field10749;

    @OriginalMember(owner = "client!uv", name = "O", descriptor = "I")
    public static int field10751;

    @OriginalMember(owner = "client!uv", name = "Q", descriptor = "I")
    public static int field10753;

    @OriginalMember(owner = "client!uv", name = "S", descriptor = "I")
    public static int field10755;

    @OriginalMember(owner = "client!uv", name = "T", descriptor = "I")
    public static int field10756;

    @OriginalMember(owner = "client!uv", name = "X", descriptor = "I")
    public static int field10760;

    @OriginalMember(owner = "client!uv", name = "Y", descriptor = "I")
    public static int field10761;

    @OriginalMember(owner = "client!uv", name = "Z", descriptor = "I")
    public static int field10762;

    @OriginalMember(owner = "client!uv", name = "ab", descriptor = "I")
    public static int field10763;

    @OriginalMember(owner = "client!uv", name = "cb", descriptor = "I")
    public static int field10765;

    @OriginalMember(owner = "client!uv", name = "eb", descriptor = "I")
    public static int field10767;

    @OriginalMember(owner = "client!uv", name = "fb", descriptor = "I")
    public static int field10768;

    @OriginalMember(owner = "client!uv", name = "gb", descriptor = "I")
    public static int field10769;

    @OriginalMember(owner = "client!uv", name = "hb", descriptor = "I")
    public static int field10770;

    @OriginalMember(owner = "client!uv", name = "ib", descriptor = "I")
    public static int field10771;

    @OriginalMember(owner = "client!uv", name = "jb", descriptor = "I")
    public static int field10772;

    @OriginalMember(owner = "client!uv", name = "W", descriptor = "Lid;")
    private class486 field10759;

    @OriginalMember(owner = "client!uv", name = "lb", descriptor = "Lpf;")
    public static class759 field10774;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)I", line = 10)
    public final int method1010(int arg0) {
        ++field10769;
        if (arg0 != -6546) {
            this.method1007(false);
        }
        return 65535 & this.field10750;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILha;I)Z", line = 21)
    public final boolean method179(int arg0, int arg1, class570 arg2, int arg3) {
        ++field10751;
        int var5 = 29 / ((arg3 - -23) / 37);
        class299 var6 = this.method4304(131072, arg2, 0);
        if (var6 != null) {
            class465 var7 = arg2.method948();
            var7.method449(super.field2896, super.field2892, super.field2900);
            return class653.field8360 ? var6.method1233(arg0, arg1, var7, false, 0, class628.field7974) : var6.method1264(arg0, arg1, var7, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "(B)Z", line = 43)
    public final boolean method743(byte arg0) {
        ++field10756;
        if (arg0 > -76) {
            this.method171(-119);
        }
        if (this.field10758 != null) {
            return !this.field10758.method1235();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lha;I)V", line = 60)
    public final void method182(class570 arg0, int arg1) {
        ++field10744;
        if (arg1 >= -87) {
            this.field10754 = true;
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)I", line = 70)
    public final int method1013(byte arg0) {
        int var2 = -126 / ((arg0 - 76) / 36);
        ++field10770;
        return this.field10773;
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(Z)Z", line = 80)
    public final boolean method738(boolean arg0) {
        ++field10760;
        if (!arg0) {
            this.field10750 = -99;
        }
        return this.field10758 != null ? this.field10758.method1272() : false;
    }

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)I", line = 102)
    public final int method747(int arg0) {
        ++field10765;
        if (arg0 != 15258) {
            return -10;
        } else {
            return this.field10758 != null ? this.field10758.method1260() : 0;
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lha;Lih;IIIIIZIZ)V", line = 115)
    public class785(class570 arg0, class773 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field10449);
        this.field10752 = arg1.field10488 != 0 && !arg7;
        this.field10750 = (short) arg1.field10531;
        this.field10766 = arg7;
        super.field2900 = arg6;
        super.field2896 = arg4;
        this.field10757 = arg9;
        this.field10773 = (byte) arg8;
        this.field10754 = arg0.method900() && arg1.field10500 && !this.field10766 && ~class485.field6252.field6952.method665(false) != -1;
        int var11 = 2048;
        if (this.field10757) {
            var11 |= 65536;
        }
        class216 var12 = this.method4303(arg0, 1521, var11, this.field10754);
        if (var12 != null) {
            this.field10764 = var12.field2942;
            this.field10758 = var12.field2944;
            if (this.field10757) {
                this.field10758 = this.field10758.method1284((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BLha;)V", line = 149)
    public final void method1015(byte arg0, class570 arg1) {
        ++field10748;
        if (arg0 > -71) {
            this.method185(-61);
        }
        Object var3 = null;
        class736 var5;
        if (this.field10764 == null && this.field10754) {
            class216 var4 = this.method4303(arg1, 1521, 262144, true);
            var5 = var4 == null ? null : var4.field2942;
        } else {
            var5 = this.field10764;
            this.field10764 = null;
        }
        if (var5 != null) {
            class407.method2371(var5, super.field2889, super.field2896, super.field2900, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZIBLlq;Lha;II)V", line = 176)
    public final void method174(boolean arg0, int arg1, byte arg2, class210 arg3, class570 arg4, int arg5, int arg6) {
        if (arg3 instanceof class785) {
            class785 var8 = (class785) arg3;
            if (this.field10758 != null && var8.field10758 != null) {
                this.field10758.method1285(var8.field10758, arg1, arg5, arg6, arg0);
            }
        }
        if (arg2 != -126) {
            this.field10758 = null;
        }
        ++field10763;
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V", line = 197)
    public final void method185(int arg0) {
        this.field10757 = false;
        if (arg0 == 0) {
            ++field10767;
            if (this.field10758 != null) {
                this.field10758.method1252(-65537 & this.field10758.method1239());
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(ILha;)Lid;", line = 212)
    public final class486 method170(int arg0, class570 arg1) {
        ++field10747;
        int var3 = -84 % ((arg0 - -9) / 63);
        if (this.field10759 == null) {
            this.field10759 = class77.method476(super.field2892, super.field2900, this.method4304(0, arg1, 0), super.field2896, 5);
        }
        return this.field10759;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILha;)V", line = 226)
    public final void method1014(int arg0, class570 arg1) {
        ++field10745;
        if (arg0 != -7908) {
            this.method1012((byte) -16);
        }
        Object var3 = null;
        class736 var5;
        if (this.field10764 == null && this.field10754) {
            class216 var4 = this.method4303(arg1, arg0 + 9429, 262144, true);
            var5 = var4 != null ? var4.field2942 : null;
        } else {
            var5 = this.field10764;
            this.field10764 = null;
        }
        if (var5 != null) {
            class648.method3502(var5, super.field2889, super.field2896, super.field2900, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "(B)I", line = 256)
    public final int method745(byte arg0) {
        ++field10761;
        if (arg0 >= -85) {
            this.field10773 = 11;
        }
        return this.field10758 == null ? 0 : this.field10758.method1296();
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lha;IIZ)Lsa;", line = 267)
    private final class216 method4303(class570 arg0, int arg1, int arg2, boolean arg3) {
        ++field10768;
        if (arg1 != 1521) {
            this.field10773 = -49;
        }
        class773 var5 = class390.field4983.method4292(65535 & this.field10750, (byte) -117);
        class358 var6;
        class358 var7;
        if (!this.field10766) {
            var6 = class383.field4790[super.field2889];
            if (~super.field2889 > -4) {
                var7 = class383.field4790[super.field2889 + 1];
            } else {
                var7 = null;
            }
        } else {
            var7 = class383.field4790[0];
            var6 = class735.field9973[super.field2889];
        }
        return var5.method4210(arg2, this.field10773, var6, arg0, super.field2900, 22, super.field2892, super.field2896, var7, (class702) null, false, arg3);
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(ILha;)Lpi;", line = 297)
    public final class266 method187(int arg0, class570 arg1) {
        ++field10771;
        if (this.field10758 == null) {
            return null;
        } else {
            class465 var3 = arg1.method948();
            var3.method449(super.field2896, super.field2892, super.field2900);
            class266 var4 = class689.method3680((byte) -15, this.field10752, 1);
            if (arg0 != -29562) {
                this.method182((class570) null, 30);
            }
            if (class653.field8360) {
                this.field10758.method1292(var3, var4.field3533[0], class628.field7974, 0);
            } else {
                this.field10758.method1297(var3, var4.field3533[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILha;I)Lka;", line = 325)
    private final class299 method4304(int arg0, class570 arg1, int arg2) {
        ++field10749;
        if (this.field10758 != null && arg1.method941(this.field10758.method1239(), arg0) == 0) {
            return this.field10758;
        } else {
            if (arg2 != 0) {
                this.field10752 = true;
            }
            class216 var4 = this.method4303(arg1, arg2 + 1521, arg0, false);
            return var4 != null ? var4.field2944 : null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)Z", line = 347)
    public final boolean method1008(byte arg0) {
        ++field10762;
        if (arg0 > -51) {
            this.field10758 = null;
        }
        return this.field10754;
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(B)V", line = 358)
    public final void method1012(byte arg0) {
        ++field10753;
        if (this.field10758 != null) {
            this.field10758.method1259();
        }
        if (arg0 < 115) {
            this.method745((byte) -115);
        }
    }

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "(I)Z", line = 372)
    public final boolean method171(int arg0) {
        ++field10755;
        return arg0 > -80 ? true : this.field10757;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)I", line = 384)
    public final int method1007(boolean arg0) {
        ++field10772;
        if (!arg0) {
            this.field10759 = null;
        }
        return 22;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILuaa;B)V", line = 397)
    public static final void method4305(int arg0, int arg1, class391 arg2, byte arg3) {
        if (arg3 != -75) {
            method4306((byte) -56);
        }
        ++field10746;
        class596 var4 = arg2.method2251(true, class576.field7320);
        if (var4 != null) {
            class576.field7320.method915(arg0, arg1, arg2.field5117 + arg0, arg2.field5031 + arg1);
            if (~class380.field4658 > -4) {
                class226.field3060.method4204((float) arg2.field5117 / 2.0F + (float) arg0, (float) arg2.field5031 / 2.0F + (float) arg1, 4096, (int) (-class698.field9250) << 2 & 65532, var4, arg0, arg1);
            } else {
                class576.field7320.method940(-16777216, var4, arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "(B)V", line = 422)
    public static void method4306(byte arg0) {
        if (arg0 < -74) {
            field10774 = null;
        }
    }
}
