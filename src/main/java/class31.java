import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class31 {

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lqd;")
    public static class40 field642 = class147.method1106("Fertigkeit: ", (byte) -97);

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lqd;")
    public static class40 field646 = class147.method1106("Benutzeroberfl-=che geladen)3", (byte) -45);

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lqd;")
    public static class40 field649 = class147.method1106("Musik)2Engine vorbereitet)3", (byte) -127);

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lqd;")
    public static class40 field648 = null;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "[I")
    public static int[] field647 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lol;")
    public static class223 field644;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 10)
    public static void method280(int arg0) {
        field649 = null;
        field642 = null;
        field647 = null;
        if (arg0 < -13) {
            field644 = null;
            field646 = null;
            field648 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILfm;IIILve;Ljb;)V", line = 26)
    public static final void method281(int arg0, int arg1, class42 arg2, int arg3, int arg4, int arg5, class258 arg6, class27 arg7) {
        class255 var8 = new class255();
        var8.field4239 = arg4 * 128;
        var8.field4254 = arg1 * arg3;
        field645++;
        var8.field4237 = arg0;
        if (arg7 != null) {
            var8.field4248 = arg7;
            var8.field4238 = arg7.field527;
            var8.field4255 = arg7.field531;
            var8.field4253 = arg7.field575;
            var8.field4235 = arg7.field574;
            var8.field4245 = arg7.field587 * 128;
            int var10 = arg7.field519;
            int var11 = arg7.field568;
            if (arg5 == 1 || arg5 == 3) {
                var11 = arg7.field519;
                var10 = arg7.field568;
            }
            var8.field4259 = (arg1 + var11) * 128;
            var8.field4261 = (arg4 + var10) * 128;
            if (arg7.field546 != null) {
                var8.field4232 = true;
                var8.method1794(false);
            }
            if (var8.field4253 != null) {
                var8.field4249 = (int) ((double) (var8.field4238 - var8.field4235) * Math.random()) + var8.field4235;
            }
            class101.field1774.method1972(var8, -103);
        } else if (arg2 != null) {
            var8.field4244 = arg2;
            class121 var9 = arg2.field796;
            if (var9.field2098 != null) {
                var8.field4232 = true;
                var9 = var9.method918(-1);
            }
            if (var9 != null) {
                var8.field4259 = (var9.field2089 + arg1) * 128;
                var8.field4261 = (arg4 + var9.field2089) * 128;
                var8.field4255 = class76.method560(arg2, -1);
                var8.field4245 = var9.field2096 * 128;
            }
            class253.field4194.method1972(var8, 101);
        } else if (arg6 != null) {
            var8.field4262 = arg6;
            var8.field4261 = (arg6.method666(24207) + arg4) * 128;
            var8.field4259 = (arg6.method666(arg3 ^ 0x5E0F) + arg1) * 128;
            var8.field4255 = class228.method1600(arg6, arg3 ^ 0x81);
            var8.field4245 = arg6.field4314 * 128;
            class60.field1143.method1396(-19928, arg6.field4319.method362(arg3 - 25322), var8);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BZ)I", line = 108)
    public static final int method282(int arg0, byte[] arg1, boolean arg2) {
        field651++;
        return arg2 ? class139.method1031(arg0, 0, -1, arg1) : 114;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(JI)V", line = 125)
    public static final void method283(long arg0, int arg1) {
        field653++;
        int var3 = -20 / ((-arg1 - 43) / 63);
        if (arg0 != 0L) {
            class19.field295.method1464(3, 0);
            class293.field4906++;
            class19.field295.method241(arg0, 127);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)I", line = 146)
    public static final int method284(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 78) {
            field644 = (class223) null;
        }
        field650++;
        int var4 = class203.field3212[class175.method1277(arg3, arg2)];
        if (arg1 > 0) {
            int var5 = class203.field3217.method574(arg1 & 0xFFFF, 108);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) + ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class203.field3217.method569(-71, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = (var4 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = ((var4 & 0xFF00) >> 8) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var10 << 8 & 0xFF0052) - (-(var11 >> 8) - (var12 & 0xFF00));
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lcj;Lcj;B)V", line = 239)
    public static final void method285(class307 arg0, class307 arg1, byte arg2) {
        field643++;
        if (arg0.field5154 != null) {
            arg0.method2095(0);
        }
        arg0.field5143 = arg1;
        if (arg2 > -2) {
            method281(24, 94, (class42) null, 80, 46, -77, (class258) null, (class27) null);
        }
        arg0.field5154 = arg1.field5154;
        arg0.field5154.field5143 = arg0;
        arg0.field5143.field5154 = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lcg;B)V", line = 265)
    public static final void method286(class38 arg0, byte arg1) {
        if (arg1 >= -100) {
            return;
        }
        field652++;
        if (arg0.field701 != null) {
            arg0.field701.field2965 = 0;
        }
        arg0.field702 = false;
        for (class38 var2 = arg0.method317(); var2 != null; var2 = arg0.method320()) {
            method286(var2, (byte) -116);
        }
    }
}
