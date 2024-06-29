import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class497 extends class721 implements class274 {

    @OriginalMember(owner = "client!m", name = "V", descriptor = "Z")
    private boolean field6351;

    @OriginalMember(owner = "client!m", name = "db", descriptor = "Z")
    private boolean field6359;

    @OriginalMember(owner = "client!m", name = "ib", descriptor = "B")
    private byte field6364;

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "B")
    private byte field6357;

    @OriginalMember(owner = "client!m", name = "nb", descriptor = "Z")
    private boolean field6369;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "S")
    private short field6354;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "Z")
    private boolean field6343;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "Lr;")
    private class736 field6348;

    @OriginalMember(owner = "client!m", name = "ob", descriptor = "Lka;")
    public class299 field6370;

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "[I")
    public static int[] field6360 = new int[4];

    @OriginalMember(owner = "client!m", name = "qb", descriptor = "Luw;")
    public static class208 field6372 = new class208(131, 10);

    @OriginalMember(owner = "client!m", name = "tb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field6375 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!m", name = "vb", descriptor = "I")
    public static int field6377 = 0;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!m", name = "jb", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!m", name = "kb", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!m", name = "mb", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!m", name = "pb", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!m", name = "rb", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!m", name = "sb", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!m", name = "ub", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!m", name = "lb", descriptor = "Lid;")
    private class486 field6367;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "(B)V", line = 5)
    public static void method2758(byte arg0) {
        if (arg0 != 126) {
            method2760(false, false, true);
        }
        field6360 = null;
        field6372 = null;
        field6375 = null;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(ILha;)Lid;", line = 19)
    public final class486 method170(int arg0, class570 arg1) {
        ++field6362;
        int var3 = 105 % ((-9 - arg0) / 63);
        if (this.field6367 == null) {
            this.field6367 = class77.method476(super.field2892, super.field2900, this.method2762(arg1, 0, (byte) 0), super.field2896, 5);
        }
        return this.field6367;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIJ)Lrha;", line = 32)
    public static final class614 method2759(int arg0, int arg1, long arg2) {
        ++field6363;
        class614 var4 = (class614) class34.field383.method2616(arg2 | (long) arg0 << 56, (byte) -107);
        if (arg1 != 5977) {
            return null;
        } else {
            if (var4 == null) {
                var4 = new class614(arg0, arg2);
                class34.field383.method2619(var4, var4.field4108, -1);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLha;)V", line = 52)
    public final void method1015(byte arg0, class570 arg1) {
        ++field6368;
        Object var3 = null;
        class736 var5;
        if (this.field6348 == null && this.field6343) {
            class216 var4 = this.method2763(262144, true, arg1, -20992);
            var5 = var4 == null ? null : var4.field2942;
        } else {
            var5 = this.field6348;
            this.field6348 = null;
        }
        if (arg0 <= -71) {
            if (var5 != null) {
                class407.method2371(var5, super.field2889, super.field2896, super.field2900, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)V", line = 80)
    public final void method1012(byte arg0) {
        if (this.field6370 != null) {
            this.field6370.method1259();
        }
        ++field6361;
        if (arg0 <= 115) {
            this.method1008((byte) -27);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZZZ)V", line = 98)
    public static final void method2760(boolean arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method2760(true, false, false);
        }
        ++field6365;
        if (arg0) {
            --class414.field5482;
            if (class414.field5482 == 0) {
                class594.field7542 = null;
            }
        }
        if (arg2) {
            --class7.field71;
            if (~class7.field71 == -1) {
                class558.field7098 = null;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lha;Lih;IIIIIZIIZ)V", line = 132)
    public class497(class570 arg0, class773 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class633.method3381(arg8, arg9, 35));
        this.field6351 = arg10;
        this.field6359 = arg1.field10488 != 0 && !arg7;
        this.field6364 = (byte) arg8;
        this.field6357 = (byte) arg9;
        this.field6369 = arg7;
        this.field6354 = (short) arg1.field10531;
        super.field2896 = arg4;
        super.field2900 = arg6;
        this.field6343 = arg0.method900() && arg1.field10500 && !this.field6369 && ~class485.field6252.field6952.method665(false) != -1;
        int var12 = 2048;
        if (this.field6351) {
            var12 |= 65536;
        }
        class216 var13 = this.method2763(var12, this.field6343, arg0, -20992);
        if (var13 != null) {
            this.field6348 = var13.field2942;
            this.field6370 = var13.field2944;
            if (this.field6351) {
                this.field6370 = this.field6370.method1284((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 167)
    public final void method185(int arg0) {
        this.field6351 = false;
        ++field6376;
        if (this.field6370 != null) {
            this.field6370.method1252(-65537 & this.field6370.method1239());
        }
        if (arg0 != 0) {
            this.method185(28);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ldaa;ILha;)I", line = 181)
    public static final int method2761(class363 arg0, int arg1, class570 arg2) {
        if (arg1 != 65535) {
            return 29;
        } else {
            ++field6352;
            if (~arg0.field4428 != 0) {
                return arg0.field4428;
            } else {
                if (arg0.field4413 != -1) {
                    class191 var3 = arg2.field7199.method1732((byte) 122, arg0.field4413);
                    if (!var3.field2679) {
                        return var3.field2681;
                    }
                }
                return arg0.field4424;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(Z)Z", line = 207)
    public final boolean method738(boolean arg0) {
        if (!arg0) {
            this.method185(-28);
        }
        ++field6349;
        return this.field6370 != null ? this.field6370.method1272() : false;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)Z", line = 222)
    public final boolean method1008(byte arg0) {
        if (arg0 >= -51) {
            this.method1015((byte) -38, (class570) null);
        }
        ++field6340;
        return this.field6343;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILha;)V", line = 235)
    public final void method1014(int arg0, class570 arg1) {
        ++field6344;
        if (arg0 != -7908) {
            this.method179(-69, -69, (class570) null, 30);
        }
        Object var3 = null;
        class736 var5;
        if (this.field6348 == null && this.field6343) {
            class216 var4 = this.method2763(262144, true, arg1, -20992);
            var5 = var4 != null ? var4.field2942 : null;
        } else {
            var5 = this.field6348;
            this.field6348 = null;
        }
        if (var5 != null) {
            class648.method3502(var5, super.field2889, super.field2896, super.field2900, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lha;IB)Lka;", line = 262)
    private final class299 method2762(class570 arg0, int arg1, byte arg2) {
        ++field6345;
        if (this.field6370 != null && arg0.method941(this.field6370.method1239(), arg1) == 0) {
            return this.field6370;
        } else {
            class216 var4 = this.method2763(arg1, false, arg0, -20992);
            if (arg2 != 0) {
                this.field6354 = -53;
            }
            return var4 == null ? null : var4.field2944;
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)I", line = 283)
    public final int method747(int arg0) {
        if (arg0 != 15258) {
            this.method743((byte) 31);
        }
        ++field6371;
        return this.field6370 != null ? this.field6370.method1260() : 0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILha;I)Z", line = 304)
    public final boolean method179(int arg0, int arg1, class570 arg2, int arg3) {
        int var5 = 51 % ((-23 - arg3) / 37);
        ++field6346;
        class299 var6 = this.method2762(arg2, 131072, (byte) 0);
        if (var6 != null) {
            class465 var7 = arg2.method948();
            var7.method449(super.field2896, super.field2892, super.field2900);
            return !class653.field8360 ? var6.method1264(arg0, arg1, var7, false, 0) : var6.method1233(arg0, arg1, var7, false, 0, class628.field7974);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZLha;I)Lsa;", line = 326)
    private final class216 method2763(int arg0, boolean arg1, class570 arg2, int arg3) {
        ++field6358;
        class773 var5 = class390.field4983.method4292(this.field6354 & 65535, (byte) -90);
        class358 var6;
        class358 var7;
        if (!this.field6369) {
            if (super.field2889 >= 3) {
                var6 = null;
            } else {
                var6 = class383.field4790[super.field2889 + 1];
            }
            var7 = class383.field4790[super.field2889];
        } else {
            var6 = class383.field4790[0];
            var7 = class735.field9973[super.field2889];
        }
        if (arg3 != -20992) {
            method2758((byte) -101);
        }
        return var5.method4210(arg0, this.field6357, var7, arg2, super.field2900, this.field6364, super.field2892, super.field2896, var6, (class702) null, false, arg1);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)I", line = 356)
    public final int method1010(int arg0) {
        ++field6374;
        if (arg0 != -6546) {
            this.method179(74, 29, (class570) null, -84);
        }
        return this.field6354 & 65535;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIBLlq;Lha;II)V", line = 367)
    public final void method174(boolean arg0, int arg1, byte arg2, class210 arg3, class570 arg4, int arg5, int arg6) {
        ++field6347;
        if (arg2 != -126) {
            field6372 = null;
        }
        if (!(arg3 instanceof class497)) {
            if (arg3 instanceof class552) {
                class552 var8 = (class552) arg3;
                if (this.field6370 != null && var8.field6989 != null) {
                    this.field6370.method1285(var8.field6989, arg1, arg5, arg6, arg0);
                    return;
                }
            }
        } else {
            class497 var9 = (class497) arg3;
            if (this.field6370 == null || var9.field6370 == null) {
                return;
            }
            this.field6370.method1285(var9.field6370, arg1, arg5, arg6, arg0);
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(ILha;)Lpi;", line = 404)
    public final class266 method187(int arg0, class570 arg1) {
        ++field6353;
        if (this.field6370 == null) {
            return null;
        } else {
            class465 var3 = arg1.method948();
            var3.method449(super.field2896, super.field2892, super.field2900);
            if (arg0 != -29562) {
                this.method738(true);
            }
            class266 var4 = class689.method3680((byte) -15, this.field6359, 1);
            if (!class653.field8360) {
                this.field6370.method1297(var3, var4.field3533[0], 0);
            } else {
                this.field6370.method1292(var3, var4.field3533[0], class628.field7974, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)I", line = 431)
    public final int method1007(boolean arg0) {
        if (!arg0) {
            method2758((byte) 52);
        }
        ++field6366;
        return this.field6364;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)Z", line = 444)
    public final boolean method743(byte arg0) {
        if (arg0 > -76) {
            this.field6343 = false;
        }
        ++field6356;
        if (this.field6370 == null) {
            return true;
        } else {
            return !this.field6370.method1235();
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lha;I)V", line = 461)
    public final void method182(class570 arg0, int arg1) {
        ++field6350;
        if (arg1 >= -87) {
            this.field6354 = -48;
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)Z", line = 471)
    public final boolean method171(int arg0) {
        ++field6342;
        if (arg0 >= -80) {
            this.method747(41);
        }
        return this.field6351;
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(B)I", line = 483)
    public final int method745(byte arg0) {
        if (arg0 >= -85) {
            this.method1013((byte) 77);
        }
        ++field6341;
        return this.field6370 == null ? 0 : this.field6370.method1296();
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)I", line = 502)
    public final int method1013(byte arg0) {
        ++field6355;
        int var2 = 28 / ((arg0 - 76) / 36);
        return this.field6357;
    }
}
