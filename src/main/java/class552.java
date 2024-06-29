import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class552 extends class620 implements class274 {

    @OriginalMember(owner = "client!wp", name = "ub", descriptor = "Z")
    private boolean field6993;

    @OriginalMember(owner = "client!wp", name = "hb", descriptor = "B")
    private byte field6980;

    @OriginalMember(owner = "client!wp", name = "Q", descriptor = "Z")
    private boolean field6963;

    @OriginalMember(owner = "client!wp", name = "db", descriptor = "Z")
    private boolean field6976;

    @OriginalMember(owner = "client!wp", name = "M", descriptor = "S")
    private short field6959;

    @OriginalMember(owner = "client!wp", name = "lb", descriptor = "B")
    private byte field6984;

    @OriginalMember(owner = "client!wp", name = "eb", descriptor = "Z")
    private boolean field6977;

    @OriginalMember(owner = "client!wp", name = "qb", descriptor = "Lka;")
    public class299 field6989;

    @OriginalMember(owner = "client!wp", name = "wb", descriptor = "Lr;")
    private class736 field6995;

    @OriginalMember(owner = "client!wp", name = "P", descriptor = "[S")
    public static short[] field6962 = new short[256];

    @OriginalMember(owner = "client!wp", name = "L", descriptor = "F")
    public static float field6958;

    @OriginalMember(owner = "client!wp", name = "N", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!wp", name = "S", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!wp", name = "T", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!wp", name = "U", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!wp", name = "V", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!wp", name = "W", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!wp", name = "X", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!wp", name = "Y", descriptor = "I")
    public static int field6971;

    @OriginalMember(owner = "client!wp", name = "Z", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!wp", name = "ab", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!wp", name = "bb", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!wp", name = "cb", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!wp", name = "fb", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!wp", name = "gb", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!wp", name = "ib", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!wp", name = "jb", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!wp", name = "kb", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!wp", name = "mb", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!wp", name = "ob", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!wp", name = "pb", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!wp", name = "rb", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!wp", name = "sb", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!wp", name = "tb", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!wp", name = "vb", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!wp", name = "R", descriptor = "Lid;")
    private class486 field6964;

    @OriginalMember(owner = "client!wp", name = "O", descriptor = "Loq;")
    public static class775 field6961;

    @OriginalMember(owner = "client!wp", name = "nb", descriptor = "[Lob;")
    public static class4[] field6986;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZIBLlq;Lha;II)V", line = 5)
    public final void method174(boolean arg0, int arg1, byte arg2, class210 arg3, class570 arg4, int arg5, int arg6) {
        if (arg3 instanceof class497) {
            class497 var8 = (class497) arg3;
            if (this.field6989 != null && var8.field6370 != null) {
                this.field6989.method1285(var8.field6370, arg1, arg5, arg6, arg0);
            }
        } else if (arg3 instanceof class552) {
            class552 var9 = (class552) arg3;
            if (this.field6989 != null && var9.field6989 != null) {
                this.field6989.method1285(var9.field6989, arg1, arg5, arg6, arg0);
            }
        }
        ++field6990;
        if (arg2 != -126) {
            this.method1012((byte) -128);
        }
    }

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "(I)I", line = 36)
    public final int method747(int arg0) {
        if (arg0 != 15258) {
            this.method1010(-90);
        }
        ++field6991;
        return this.field6989 != null ? this.field6989.method1260() : 0;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)Z", line = 47)
    public final boolean method1008(byte arg0) {
        ++field6981;
        if (arg0 >= -51) {
            this.method1014(-114, (class570) null);
        }
        return this.field6977;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILha;)V", line = 60)
    public final void method1014(int arg0, class570 arg1) {
        ++field6966;
        if (arg0 != -7908) {
            this.method2996((class570) null, 49, false, (byte) 79);
        }
        Object var3 = null;
        class736 var5;
        if (this.field6995 == null && this.field6977) {
            class216 var4 = this.method2996(arg1, 262144, true, (byte) -116);
            var5 = var4 == null ? null : var4.field2942;
        } else {
            var5 = this.field6995;
            this.field6995 = null;
        }
        if (var5 != null) {
            class648.method3502(var5, super.field2889, super.field2896, super.field2900, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(B)V", line = 88)
    public final void method1012(byte arg0) {
        if (this.field6989 != null) {
            this.field6989.method1259();
        }
        if (arg0 > 115) {
            ++field6987;
        }
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(ILha;)Lid;", line = 106)
    public final class486 method170(int arg0, class570 arg1) {
        ++field6970;
        int var3 = -49 / ((-9 - arg0) / 63);
        if (this.field6964 == null) {
            this.field6964 = class77.method476(super.field2892, super.field2900, this.method2993(arg1, (byte) 36, 0), super.field2896, 5);
        }
        return this.field6964;
    }

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "(I)V", line = 124)
    public static void method2992(int arg0) {
        field6962 = null;
        if (arg0 > -10) {
            method2995(true, -24, 54, -6, 73);
        }
        field6986 = null;
        field6961 = null;
    }

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "(B)Z", line = 136)
    public final boolean method743(byte arg0) {
        ++field6988;
        if (this.field6989 != null) {
            return !this.field6989.method1235();
        } else {
            if (arg0 >= -76) {
                this.method187(-127, (class570) null);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILha;I)Z", line = 152)
    public final boolean method179(int arg0, int arg1, class570 arg2, int arg3) {
        ++field6982;
        class299 var5 = this.method2993(arg2, (byte) 36, 131072);
        int var6 = 36 / ((arg3 - -23) / 37);
        if (var5 != null) {
            class465 var7 = arg2.method948();
            var7.method449(super.field2896, super.field2892, super.field2900);
            return !class653.field8360 ? var5.method1264(arg0, arg1, var7, false, 0) : var5.method1233(arg0, arg1, var7, false, 0, class628.field7974);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V", line = 174)
    public final void method185(int arg0) {
        ++field6983;
        this.field6963 = false;
        if (arg0 != 0) {
            this.field6977 = false;
        }
        if (this.field6989 != null) {
            this.field6989.method1252(-65537 & this.field6989.method1239());
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lha;BI)Lka;", line = 189)
    private final class299 method2993(class570 arg0, byte arg1, int arg2) {
        ++field6992;
        if (this.field6989 != null && ~arg0.method941(this.field6989.method1239(), arg2) == -1) {
            return this.field6989;
        } else {
            if (arg1 != 36) {
                this.method187(-49, (class570) null);
            }
            class216 var4 = this.method2996(arg0, arg2, false, (byte) 109);
            return var4 == null ? null : var4.field2944;
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lha;Lih;IIIIIZIIIIIIZ)V", line = 209)
    public class552(class570 arg0, class773 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field10520 == 1, class9.method26(arg13, arg12, 100));
        this.field6993 = ~arg1.field10488 != -1 && !arg7;
        this.field6980 = (byte) arg12;
        this.field6963 = arg14;
        super.field2889 = (byte) arg3;
        this.field6976 = arg7;
        this.field6959 = (short) arg1.field10531;
        this.field6984 = (byte) arg13;
        this.field6977 = arg0.method900() && arg1.field10500 && !this.field6976 && class485.field6252.field6952.method665(false) != 0;
        int var16 = 2048;
        if (this.field6963) {
            var16 |= 65536;
        }
        class216 var17 = this.method2996(arg0, var16, this.field6977, (byte) 114);
        if (var17 != null) {
            this.field6989 = var17.field2944;
            this.field6995 = var17.field2942;
            if (this.field6963) {
                this.field6989 = this.field6989.method1284((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "(B)I", line = 245)
    public final int method2994(byte arg0) {
        ++field6969;
        if (arg0 != 74) {
            this.method1013((byte) 31);
        }
        return this.field6989 == null ? 15 : this.field6989.method1245() / 4;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLha;)V", line = 261)
    public final void method1015(byte arg0, class570 arg1) {
        ++field6965;
        if (arg0 > -71) {
            this.field6977 = true;
        }
        Object var3 = null;
        class736 var5;
        if (this.field6995 == null && this.field6977) {
            class216 var4 = this.method2996(arg1, 262144, true, (byte) 126);
            var5 = var4 != null ? var4.field2942 : null;
        } else {
            var5 = this.field6995;
            this.field6995 = null;
        }
        if (var5 != null) {
            class407.method2371(var5, super.field2889, super.field2896, super.field2900, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(Z)Z", line = 292)
    public final boolean method738(boolean arg0) {
        ++field6994;
        if (!arg0) {
            this.method182((class570) null, -72);
        }
        return this.field6989 != null ? this.field6989.method1272() : false;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZIIII)V", line = 306)
    public static final void method2995(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6978;
        if (class683.method3667(arg4, arg3 ^ 115)) {
            class783.method4297(arg3, arg0, arg1, 0, class647.field8259[arg4], arg2);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lha;IZB)Lsa;", line = 318)
    private final class216 method2996(class570 arg0, int arg1, boolean arg2, byte arg3) {
        ++field6971;
        class773 var5 = class390.field4983.method4292(65535 & this.field6959, (byte) -89);
        int var6 = -4 % ((58 - arg3) / 45);
        class358 var7;
        class358 var8;
        if (!this.field6976) {
            var7 = class383.field4790[super.field2889];
            if (super.field2889 >= 3) {
                var8 = null;
            } else {
                var8 = class383.field4790[super.field2889 + 1];
            }
        } else {
            var7 = class735.field9973[super.field2889];
            var8 = class383.field4790[0];
        }
        return var5.method4210(arg1, ~this.field6980 != -12 ? this.field6984 : 4 - -this.field6984, var7, arg0, super.field2900, this.field6980 != 11 ? this.field6980 : 10, super.field2892, super.field2896, var8, (class702) null, false, arg2);
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(ILha;)Lpi;", line = 348)
    public final class266 method187(int arg0, class570 arg1) {
        ++field6967;
        if (this.field6989 == null) {
            return null;
        } else {
            if (arg0 != -29562) {
                this.method1014(-83, (class570) null);
            }
            class465 var3 = arg1.method948();
            var3.method449(super.field2896, super.field2892, super.field2900);
            class266 var4 = class689.method3680((byte) -15, this.field6993, 1);
            if (class653.field8360) {
                this.field6989.method1292(var3, var4.field3533[0], class628.field7974, 0);
            } else {
                this.field6989.method1297(var3, var4.field3533[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lha;I)V", line = 374)
    public final void method182(class570 arg0, int arg1) {
        if (arg1 < -87) {
            ++field6985;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)I", line = 387)
    public final int method1007(boolean arg0) {
        if (!arg0) {
            this.field6989 = null;
        }
        ++field6979;
        return this.field6980;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)I", line = 400)
    public final int method1010(int arg0) {
        ++field6973;
        if (arg0 != -6546) {
            this.method745((byte) 12);
        }
        return 65535 & this.field6959;
    }

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "(I)Z", line = 414)
    public final boolean method171(int arg0) {
        if (arg0 > -80) {
            field6961 = null;
        }
        ++field6968;
        return this.field6963;
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)I", line = 430)
    public final int method1013(byte arg0) {
        ++field6960;
        int var2 = -21 / ((76 - arg0) / 36);
        return this.field6984;
    }

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "(B)I", line = 440)
    public final int method745(byte arg0) {
        ++field6975;
        if (arg0 >= -85) {
            this.method1013((byte) -128);
        }
        return this.field6989 != null ? this.field6989.method1296() : 0;
    }
}
