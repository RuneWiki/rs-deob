import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class402 extends class54 {

    @OriginalMember(owner = "client!es", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5998 = new String[] { method3159(method3158(";@6\"")), method3159(method3158("0Ft\r~")), method3159(method3158(".\u001bt`+")), method3159(method3158("0Ft\f~")), method3159(method3158("0Ft\u000f~")), method3159(method3158("0Ftr?;\\.p~")), method3159(method3158("0Ft\t~")), method3159(method3158("0Ft\n~")), method3159(method3158("0Ft\u000b~")), method3159(method3158("0Ft\u0003~")), method3159(method3158("0Ft\b~")) };

    @OriginalMember(owner = "client!es", name = "s", descriptor = "Lcn;")
    public static class541 field5990 = null;

    @OriginalMember(owner = "client!es", name = "u", descriptor = "F")
    public static float field5996 = 0.0F;

    @OriginalMember(owner = "client!es", name = "p", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!es", name = "t", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lhia;)V", line = 5)
    public class402(class73 arg0) {
        super(arg0);
        try {
            class149.method1261((byte) 9, super.field593);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5998[5] + (arg0 != null ? field5998[2] : field5998[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIILdr;)V", line = 16)
    public static final void method3153(int arg0, int arg1, int arg2, class749 arg3) {
        class96 var4 = class483.method3683(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field1081 = arg3;
            int var5 = class555.field8261 == class195.field2617 ? 1 : 0;
            if (arg3.method1082((byte) 27)) {
                if (arg3.method1098(false)) {
                    arg3.field6207 = class273.field4136[var5];
                    class273.field4136[var5] = arg3;
                    return;
                }
                arg3.field6207 = class106.field1228[var5];
                class106.field1228[var5] = arg3;
                class222.field3412 = true;
                return;
            }
            arg3.field6207 = class74.field862[var5];
            class74.field862[var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(IB)I", line = 47)
    public final int method109(int arg0, byte arg1) {
        try {
            ++field5991;
            if (arg1 >= -106) {
                field5996 = -2.2470386F;
            }
            return super.field589.method662(89).method2132(94) < 96 ? 3 : 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5998[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(ILhia;)V", line = 64)
    public class402(int arg0, class73 arg1) {
        super(arg0, arg1);
        try {
            class149.method1261((byte) -119, super.field593);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5998[5] + arg0 + ',' + (arg1 != null ? field5998[2] : field5998[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!es", name = "e", descriptor = "(I)Z", line = 72)
    public final boolean method3154(int arg0) {
        try {
            ++field5993;
            if (arg0 != -10243) {
                field5996 = -0.076980956F;
            }
            return super.field589.method662(94).method2132(101) >= 96;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5998[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(Z)I", line = 87)
    public final int method3155(boolean arg0) {
        try {
            ++field5992;
            if (arg0) {
                field5990 = null;
            }
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5998[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(Z)I", line = 101)
    public final int method111(boolean arg0) {
        try {
            if (arg0) {
                field5996 = -1.2401234F;
            }
            ++field5995;
            return super.field589.method662(87).method2132(113) < 96 ? 0 : 2;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5998[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V", line = 117)
    public final void method115(boolean arg0) {
        try {
            if (~super.field589.method662(-91).method2132(103) > -97) {
                super.field593 = 0;
            }
            ++field5997;
            if (!arg0) {
                field5996 = 0.07371172F;
            }
            if (~super.field593 > -1 || ~super.field593 < -3) {
                super.field593 = this.method111(!arg0);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5998[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(I)V", line = 137)
    public static void method3156(int arg0) {
        try {
            if (arg0 != 2) {
                method3157(-21, -101, -95, (byte[]) null);
            }
            field5990 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5998[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(III[B)I", line = 147)
    public static final int method3157(int arg0, int arg1, int arg2, byte[] arg3) {
        try {
            ++field5989;
            int var4 = -1;
            if (arg0 != 1) {
                method3156(-6);
            }
            for (int var5 = arg2; arg1 > var5; ++var5) {
                var4 = class518.field7489[255 & (var4 ^ arg3[var5])] ^ var4 >>> 8;
            }
            return ~var4;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field5998[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5998[2] : field5998[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V", line = 171)
    public final void method113(int arg0, int arg1) {
        try {
            super.field593 = arg1;
            if (arg0 == 0) {
                ++field5994;
                class149.method1261((byte) 114, super.field593);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5998[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!es", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3158(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 86);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!es", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3159(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 85;
                    break;
                case 1:
                    var10005 = 53;
                    break;
                case 2:
                    var10005 = 90;
                    break;
                case 3:
                    var10005 = 78;
                    break;
                default:
                    var10005 = 86;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
