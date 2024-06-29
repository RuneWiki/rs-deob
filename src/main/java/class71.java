import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class71 extends class54 {

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field782 = new String[] { method649(method648("\u001d+,\u001eE")), method649(method648("\u001d+,\u001dE")), method649(method648("\u001d+,\u001fE")), method649(method648("\u001d+,\u001aE")), method649(method648("\u001d+,\u0018E")), method649(method648("\u001d+,\u0019E")), method649(method648("\u001d+,\u001bE")), method649(method648("\u001d+,\u0015E")), method649(method648("\u0017k,r\u0010")), method649(method648("\u00020n0")), method649(method648("\u001d+,\u0014E")), method649(method648("\u001d+,\u0011E")) };

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public static int field777 = 50;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "[I")
    public static int[] field767 = new int[field777];

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "[I")
    public static int[] field766 = new int[field777];

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "[I")
    public static int[] field773 = new int[field777];

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "[I")
    public static int[] field780 = new int[field777];

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field779 = new String[field777];

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "[I")
    public static int[] field768 = new int[field777];

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "[I")
    public static int[] field778 = new int[field777];

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "Lwq;")
    public static class178 field775 = new class178(30);

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "[Lfs;")
    public static class581[] field781;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILla;)I", line = 6)
    public static final int method642(int arg0, class476 arg1) {
        try {
            ++field771;
            int var2 = 0;
            if (arg1.method3618(class766.field11074, 115)) {
                ++var2;
            }
            if (arg1.method3618(class412.field6085, 64)) {
                ++var2;
            }
            if (arg1.method3618(class90.field1033, 55)) {
                ++var2;
            }
            if (arg1.method3618(class194.field2604, arg0 ^ 113)) {
                ++var2;
            }
            if (arg1.method3618(class397.field5934, 120)) {
                ++var2;
            }
            if (arg1.method3618(class252.field3902, arg0 + 68)) {
                ++var2;
            }
            if (arg0 != 1) {
                return 11;
            } else {
                if (arg1.method3618(class399.field5953, 125)) {
                    ++var2;
                }
                if (arg1.method3618(class562.field8356, arg0 ^ 87)) {
                    ++var2;
                }
                if (arg1.method3618(class243.field3732, arg0 ^ 43)) {
                    ++var2;
                }
                if (arg1.method3618(class680.field9861, 42)) {
                    ++var2;
                }
                if (arg1.method3618(class433.field6366, 104)) {
                    ++var2;
                }
                if (arg1.method3618(class331.field5198, arg0 + 63)) {
                    ++var2;
                }
                if (arg1.method3618(class497.field7199, 90)) {
                    ++var2;
                }
                if (arg1.method3618(class433.field6360, 65)) {
                    ++var2;
                }
                if (arg1.method3618(class627.field9188, 45)) {
                    ++var2;
                }
                if (arg1.method3618(class280.field4196, 101)) {
                    ++var2;
                }
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field782[10] + arg0 + ',' + (arg1 != null ? field782[8] : field782[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)V", line = 74)
    public static final void method643(byte arg0) {
        try {
            class277.method2281((byte) -126);
            ++field765;
            class582.method4355(22050, 2, class289.field4305.field846.method4660(false) == 1, 1358790352);
            class646.field9353 = class219.method1915(22050, 0, class580.field8601, true, class502.field7252);
            class617.method4596(class40.method268(4096, (class616) null), true, (byte) -105);
            class417.field6140 = class219.method1915(2048, 1, class580.field8601, true, class502.field7252);
            class417.field6140.method4052((byte) 31, class594.field8714);
            if (arg0 > -93) {
                method642(49, (class476) null);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field782[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(IB)I", line = 91)
    public final int method109(int arg0, byte arg1) {
        try {
            ++field776;
            if (class316.method2659(86, arg0)) {
                if (super.field589.field812.method1612(false) && !class668.method4917((byte) 85, super.field589.field812.method1610(false))) {
                    return 3;
                }
                if (~super.field589.field820.method5551(false) == -2) {
                    return 3;
                }
            }
            if (arg0 == 3) {
                return 3;
            } else {
                if (arg1 > -106) {
                    field778 = null;
                }
                return class316.method2659(92, arg0) ? 2 : 1;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field782[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)Z", line = 120)
    public final boolean method644(byte arg0) {
        try {
            if (arg0 >= -47) {
                field767 = null;
            }
            ++field764;
            return class316.method2659(104, super.field593);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field782[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V", line = 131)
    public final void method113(int arg0, int arg1) {
        try {
            ++field763;
            super.field593 = arg1;
            if (arg0 != 0) {
                field775 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field782[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)I", line = 143)
    public final int method111(boolean arg0) {
        try {
            ++field769;
            if (arg0) {
                field775 = null;
            }
            return 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field782[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)Z", line = 156)
    public final boolean method645(int arg0) {
        try {
            ++field774;
            return arg0 == -10243;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field782[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V", line = 167)
    public final void method115(boolean arg0) {
        try {
            ++field772;
            if (this.method644((byte) -94)) {
                if (super.field589.field812.method1612(false) && !class668.method4917((byte) 85, super.field589.field812.method1610(false))) {
                    super.field593 = 1;
                }
                if (~super.field589.field820.method5551(false) == -2) {
                    super.field593 = 1;
                }
            }
            if (!arg0) {
                this.method111(false);
            }
            if (super.field593 == 3) {
                super.field593 = 2;
            }
            if (~super.field593 > -1 || super.field593 > 3) {
                super.field593 = this.method111(!arg0);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field782[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lhia;)V", line = 195)
    public class71(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(Z)I", line = 199)
    public final int method646(boolean arg0) {
        try {
            if (arg0) {
                field779 = null;
            }
            ++field770;
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field782[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(ILhia;)V", line = 210)
    public class71(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(Z)V", line = 219)
    public static void method647(boolean arg0) {
        try {
            field781 = null;
            if (arg0) {
                method642(-26, (class476) null);
            }
            field778 = null;
            field768 = null;
            field780 = null;
            field775 = null;
            field767 = null;
            field766 = null;
            field773 = null;
            field779 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field782[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method648(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 109);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method649(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 69;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 109;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
