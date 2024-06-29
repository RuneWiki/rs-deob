import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class92 extends class644 implements class324 {

    @OriginalMember(owner = "client!rm", name = "G", descriptor = "Z")
    private boolean field1305 = false;

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "Llm;")
    public class205 field1303;

    @OriginalMember(owner = "client!rm", name = "J", descriptor = "Z")
    private boolean field1308;

    @OriginalMember(owner = "client!rm", name = "K", descriptor = "Llc;")
    public static class435 field1309 = new class435(110, -2);

    @OriginalMember(owner = "client!rm", name = "Z", descriptor = "Lgr;")
    public static class530 field1324 = new class530(9, -1);

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!rm", name = "F", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!rm", name = "H", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!rm", name = "I", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!rm", name = "L", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!rm", name = "M", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!rm", name = "N", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!rm", name = "O", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!rm", name = "Q", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!rm", name = "R", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!rm", name = "S", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!rm", name = "T", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!rm", name = "U", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!rm", name = "V", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!rm", name = "W", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!rm", name = "X", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!rm", name = "Y", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!rm", name = "ab", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!rm", name = "P", descriptor = "Lro;")
    private class522 field1314;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILjw;Lha;BIZI)V")
    public final void method711(int arg0, class280 arg1, class543 arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        ++field1316;
        if (arg3 <= 28) {
            this.method715(-39);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lha;I)V")
    public final void method608(class543 arg0, int arg1) {
        int var3 = -87 / ((arg1 - 68) / 32);
        this.field1303.method1468(arg0, -116);
        ++field1307;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLha;)Lqs;")
    public final class603 method613(byte arg0, class543 arg1) {
        ++field1306;
        class282 var3 = this.field1303.method1471(-2615, 2048, true, false, arg1);
        if (var3 == null) {
            return null;
        } else {
            class121 var4 = arg1.method342();
            var4.method845(super.field3923, super.field3922, super.field3916);
            class603 var5 = class6.method26(this.field1308, 109, 1);
            int var6 = super.field3923 >> 9;
            int var7 = super.field3916 >> 9;
            this.field1303.method1466(var7, var6, var3, true, arg1, -1, var7, var6, var4);
            if (class100.field1447) {
                var3.method503(var4, var5.field8543[0], class680.field9660, 0);
            } else {
                var3.method533(var4, var5.field8543[0], 0);
            }
            if (this.field1303.field3096 != null) {
                class458 var8 = this.field1303.field3096.method127();
                if (!class100.field1447) {
                    arg1.method214(var8);
                } else {
                    arg1.method216(var8, class680.field9660);
                }
            }
            if (arg0 < 76) {
                this.field1308 = true;
            }
            this.field1305 = var3.method497() || this.field1303.field3096 != null;
            if (this.field1314 != null) {
                class745.method4158(super.field3922, super.field3916, var3, super.field3923, -87, this.field1314);
            } else {
                this.field1314 = class222.method1551(var3, super.field3923, super.field3922, super.field3916, 34);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(BLha;)Lro;")
    public final class522 method602(byte arg0, class543 arg1) {
        ++field1312;
        if (arg0 >= -114) {
            this.field1303 = null;
        }
        return this.field1314;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)I")
    public final int method606(int arg0) {
        ++field1315;
        if (arg0 >= -32) {
            this.field1314 = null;
        }
        return this.field1303.field3091;
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(B)V")
    public final void method598(byte arg0) {
        if (arg0 <= -9) {
            ++field1319;
        }
    }

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "(I)I")
    public final int method595(int arg0) {
        if (arg0 != 32767) {
            this.field1314 = null;
        }
        ++field1320;
        return this.field1303.method1467(arg0 ^ -32768);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lqk;BLha;)V")
    public static final void method712(class146 arg0, byte arg1, class543 arg2) {
        if (arg1 < -47) {
            ++field1317;
            boolean var3 = class425.field6147.method4146(-20951, arg0.field2053 | -16777216, arg0.field2020, arg0.field2027 ? class108.field1536.field9081 : null, arg0.field2098, arg0.field2023, arg2, arg0.field2131) == null;
            if (var3) {
                class299.field4080.method3559(new class692(arg0.field2131, arg0.field2020, arg0.field2023, -16777216 | arg0.field2053, arg0.field2098, arg0.field2027), (byte) 12);
                class401.method2439(1723, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(BLha;)V")
    public final void method610(byte arg0, class543 arg1) {
        ++field1325;
        class282 var3 = this.field1303.method1471(-2615, 262144, true, true, arg1);
        if (arg0 >= 51) {
            if (var3 != null) {
                int var4 = super.field3923 >> 9;
                int var5 = super.field3916 >> 9;
                class121 var6 = arg1.method342();
                var6.method845(super.field3923, super.field3922, super.field3916);
                this.field1303.method1466(var5, var4, var3, false, arg1, -1, var5, var4, var6);
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)Z")
    public final boolean method611(int arg0) {
        if (arg0 != 15795) {
            return true;
        } else {
            ++field1322;
            return this.field1303.method1470(-12);
        }
    }

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "(B)Z")
    public final boolean method614(byte arg0) {
        ++field1302;
        int var2 = -109 / ((-38 - arg0) / 63);
        return this.field1305;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lha;Z)V")
    public final void method597(class543 arg0, boolean arg1) {
        if (arg1) {
            this.method614((byte) 31);
        }
        ++field1304;
        this.field1303.method1461(64, arg0);
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(B)I")
    public final int method599(byte arg0) {
        ++field1310;
        if (arg0 > -4) {
            this.method599((byte) 93);
        }
        return this.field1303.method1464(0);
    }

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "(B)Z")
    public final boolean method607(byte arg0) {
        ++field1323;
        int var2 = 15 / ((arg0 - 27) / 62);
        return false;
    }

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "(I)V")
    public final void method713(int arg0) {
        ++field1311;
        if (arg0 != -16221) {
            field1309 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "(B)V")
    public static void method714(byte arg0) {
        if (arg0 > -97) {
            method712((class146) null, (byte) 108, (class543) null);
        }
        field1309 = null;
        field1324 = null;
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(I)Z")
    public final boolean method715(int arg0) {
        ++field1318;
        return arg0 != -12888;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)I")
    public final int method604(byte arg0) {
        if (arg0 != 94) {
            return -8;
        } else {
            ++field1313;
            return this.field1303.field3068;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method594(int arg0, int arg1, int arg2, class543 arg3) {
        ++field1321;
        class282 var5 = this.field1303.method1471(-2615, 131072, false, false, arg3);
        if (var5 == null) {
            return false;
        } else {
            if (arg2 != 1) {
                this.method606(47);
            }
            class121 var6 = arg3.method342();
            var6.method845(super.field3923, super.field3922, super.field3916);
            return class100.field1447 ? var5.method538(arg1, arg0, var6, false, 0, class680.field9660) : var5.method496(arg1, arg0, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)I")
    public final int method601(byte arg0) {
        ++field1301;
        return arg0 < 86 ? 91 : this.field1303.field3063;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lha;Lrq;IIIIIZII)V")
    public class92(class543 arg0, class482 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field6957);
        this.field1303 = new class205(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field1308 = ~arg1.field6903 != -1 && !arg7;
    }
}
