import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class756 {

    @OriginalMember(owner = "client!jw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10816 = new String[] { method5488(method5487("\u0004,\u0007U~")), method5488(method5487("\u0000.E|")), method5488(method5487("\u0015u\u0007>+")), method5488(method5487("\u0004,\u0007W~")), method5488(method5487("\u0004,\u0007Q~")), method5488(method5487("\u0004,\u0007V~")), method5488(method5487("\u0004,\u0007T~")), method5488(method5487("\u0004,\u0007S~")) };

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "B")
    public byte field10814;

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "F")
    public static float field10811;

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "I")
    public static int field10806;

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
    public static int field10807;

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "I")
    public static int field10809;

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "I")
    public static int field10810;

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "I")
    public static int field10812;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "I")
    public static int field10813;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public int field10815;

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "Ljava/lang/String;")
    public String field10808;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIIIIIBIIII)V")
    public static final void method5480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            field10813++;
            if (arg7 != 42) {
                field10811 = -1.5698453F;
            }
            if (class314.method2496(arg0, (byte) -31)) {
                if (class646.field9185[arg0] == null) {
                    client.method4963(class9.field117[arg0], -1, arg9, arg11, arg4, arg6, arg2, arg1, arg8, arg3, arg10, arg5);
                } else {
                    client.method4963(class646.field9185[arg0], -1, arg9, arg11, arg4, arg6, arg2, arg1, arg8, arg3, arg10, arg5);
                }
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field10816[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(II[Lvo;)V")
    public static final void method5481(int arg0, int arg1, class782[] arg2) {
        try {
            field10809++;
            if (arg0 != -1) {
                field10811 = -1.1793356F;
            }
            for (int var3 = 0; var3 < arg2.length; var3++) {
                class782 var4 = arg2[var3];
                if (var4 != null && var4.field11136 == arg1 && !client.method4977(var4)) {
                    if (var4.field11291 == 0) {
                        method5481(-1, var4.field11158, arg2);
                        if (var4.field11290 != null) {
                            method5481(-1, var4.field11158, var4.field11290);
                        }
                        class509 var5 = (class509) class104.field1375.method3693(false, (long) var4.field11158);
                        if (var5 != null) {
                            class632.method4620(var5.field7472, -124);
                        }
                    }
                    if (var4.field11291 == 6 && var4.field11294 != -1) {
                        if (var4.field11183 == null) {
                            var4.field11183 = new class238();
                            var4.field11183.method840(var4.field11294, false);
                        }
                        if (var4.field11183.method844(class393.field5721, -122) && var4.field11183.method843((byte) -90)) {
                            var4.field11183.method827(arg0 - 40);
                        }
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field10816[0] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10816[1] : field10816[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lrfa;ZZ)V")
    public static final void method5482(class202 arg0, boolean arg1, boolean arg2) {
        arg0.field2973 = arg2;
        if (!class335.field4851) {
            class590.method4357(arg0, class482.field7093);
        } else if (arg1) {
            class658.field9320[class658.field9320.length - 1].method2980(-37, arg0);
        } else {
            int var3 = class316.method2516(arg0.field2974);
            int var4 = class744.field10566[2] * arg0.method578((byte) 114) / arg0.field2970;
            int var5 = class316.method2516(arg0.field2974 - var4);
            int var6 = class316.method2516(arg0.field2974 + var4);
            if (var5 == var6) {
                class658.field9320[var3].method2980(-77, arg0);
            } else if (var6 - var5 == 1) {
                class658.field9320[class433.field6280 + var5].method2980(48, arg0);
            } else {
                class658.field9320[class658.field9320.length - 1].method2980(-34, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method5483(int arg0, int arg1, boolean arg2) {
        try {
            field10806++;
            if (arg2) {
                return class324.method2562(arg0, 1048832, arg1) | (arg0 & 0x40000) != 0 || class754.method5469(arg0, arg1, 12529);
            } else {
                return true;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10816[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIZI)V")
    public static final void method5484(int arg0, int arg1, boolean arg2, int arg3) {
        try {
            if (arg1 != -1) {
                field10811 = 0.26905695F;
            }
            if (class687.field9624.method3693(false, (long) arg0) == null) {
                if (class76.field1088) {
                    class500 var4 = new class500(arg0, new class199(4096, class135.field1751, arg0), arg3, arg2);
                    var4.field7313.method3112((byte) -69, class200.field2957[class405.field5883]);
                    class687.field9624.method3691(var4, (long) arg0, -1);
                } else {
                    class63.method682(111, arg0, arg2);
                }
            }
            field10807++;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10816[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method5485(int arg0, byte arg1, String arg2) {
        try {
            class459.method3533("", (byte) 55, "", "", 0, arg2, arg0);
            if (arg1 != 8) {
                method5482(null, false, false);
            }
            field10812++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10816[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10816[1] : field10816[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method5486(int arg0, String arg1) {
        try {
            if (arg0 != 0) {
                method5482(null, true, false);
            }
            field10810++;
            return class544.method4104(true, arg1, 114, 10);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10816[4] + arg0 + ',' + (arg1 == null ? field10816[1] : field10816[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!jw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5487(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x56);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5488(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 110;
                    break;
                case 1:
                    var10005 = 91;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 16;
                    break;
                default:
                    var10005 = 86;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
