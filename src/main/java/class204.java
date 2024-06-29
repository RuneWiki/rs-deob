import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class204 {

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "Ldfa;")
    private class477 field3005 = new class477(256);

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "Ldfa;")
    private class477 field3006 = new class477(256);

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "Llga;")
    private class47 field2994;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "Llga;")
    private class47 field2996;

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3007 = new String[] { method1752(method1751("#*-\u007fr$5w}3")), method1752(method1751("$)o/")), method1752(method1751("1r-mf")), method1752(method1751("#*-\u00003")), method1752(method1751("#*-\u00023")), method1752(method1751("#*-\u00053")), method1752(method1751("#*-\u00013")), method1752(method1751("#*-\u00063")), method1752(method1751("#*-\u00073")), method1752(method1751("#*-\u00043")) };

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "Z")
    public static boolean field2995 = false;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
    public static int field2993 = -1;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "F")
    public static float field3003;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(III[I)Lvfa;", line = 10)
    private final class313 method1744(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            field2999++;
            int var5 = arg1 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFF2);
            int var6 = var5 | arg0 << 16;
            long var7 = (long) var6;
            class313 var9 = (class313) this.field3006.method3693(false, var7);
            if (var9 != null) {
                return var9;
            } else if (arg3 == null || arg3[0] > 0) {
                class373 var10 = class373.method2957(this.field2996, arg0, arg1);
                if (var10 == null) {
                    return null;
                }
                class313 var11 = var10.method2959();
                if (arg2 != 0) {
                    return null;
                }
                this.field3006.method3691(var11, var7, -1);
                if (arg3 != null) {
                    arg3[0] -= var11.field4295.length;
                }
                return var11;
            } else {
                return null;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field3007[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field3007[1] : field3007[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(II[IB)Lvfa;", line = 57)
    private final class313 method1745(int arg0, int arg1, int[] arg2, byte arg3) {
        try {
            field3002++;
            int var5 = (arg1 >>> 12 | arg1 << 4 & 0xFFFA) ^ arg0;
            int var6 = var5 | arg1 << 16;
            long var7 = (long) var6 ^ 0x100000000L;
            class313 var9 = (class313) this.field3006.method3693(false, var7);
            if (var9 != null) {
                return var9;
            }
            int var10 = -80 / (-arg3 / 49);
            if (arg2 != null && arg2[0] <= 0) {
                return null;
            }
            class186 var11 = (class186) this.field3005.method3693(false, var7);
            if (var11 == null) {
                var11 = class186.method1538(this.field2994, arg1, arg0);
                if (var11 == null) {
                    return null;
                }
                this.field3005.method3691(var11, var7, -1);
            }
            class313 var12 = var11.method1537(arg2);
            if (var12 == null) {
                return null;
            } else {
                var11.method4294(0);
                this.field3006.method3691(var12, var7, -1);
                return var12;
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field3007[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3007[1] : field3007[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I[II)Lvfa;", line = 102)
    public final class313 method1746(int arg0, int[] arg1, int arg2) {
        try {
            field2998++;
            if (arg2 != 0) {
                this.method1749(null, (byte) -63, -19);
            }
            if (this.field2994.method535((byte) -110) == 1) {
                return this.method1745(arg0, 0, arg1, (byte) -103);
            } else if (this.field2994.method509(true, arg0) == 1) {
                return this.method1745(0, arg0, arg1, (byte) 103);
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3007[8] + arg0 + ',' + (arg1 == null ? field3007[1] : field3007[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "([Ltb;B)V", line = 128)
    public static final void method1747(class392[] arg0, byte arg1) {
        try {
            class501.field7319 = arg0.length;
            field3001++;
            class776.field11071 = new int[class501.field7319 + 10];
            class342.field4978 = new class392[class501.field7319 + 10];
            class569.method4246(arg0, 0, class342.field4978, 0, class501.field7319);
            for (int var2 = 0; var2 < class501.field7319; var2++) {
                class776.field11071[var2] = class342.field4978[var2].method1380();
            }
            int var3 = class501.field7319;
            if (arg1 != -24) {
                method1748(10);
            }
            while (class342.field4978.length > var3) {
                class776.field11071[var3] = 12;
                var3++;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3007[3] + (arg0 == null ? field3007[1] : field3007[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V", line = 161)
    public static final void method1748(int arg0) {
        try {
            if (arg0 > -20) {
                field2995 = false;
            }
            field3000++;
            class203.method1741(2, class451.field6612.field9111.method4346(3) == 1, 22050, 48000);
            class499.field7298 = class292.method2363(class651.field9249, class560.field8153, (byte) 82, 22050, 0);
            class474.method3663(7728, true, class403.method3164(124, null));
            class591.field8505 = class292.method2363(class651.field9249, class560.field8153, (byte) 79, 2048, 1);
            class261.field3699 = new class566();
            class591.field8505.method3425(class261.field3699, -87);
            class631.field8967 = new class389(22050, class215.field3148);
            class486.method3746((byte) -116);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3007[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "([IBI)Lvfa;", line = 182)
    public final class313 method1749(int[] arg0, byte arg1, int arg2) {
        try {
            if (arg1 >= -96) {
                this.method1746(113, null, 116);
            }
            field2997++;
            if (this.field2996.method535((byte) -110) == 1) {
                return this.method1744(0, arg2, 0, arg0);
            } else if (this.field2996.method509(true, arg2) == 1) {
                return this.method1744(arg2, 0, 0, arg0);
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3007[9] + (arg0 == null ? field3007[1] : field3007[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(II[BI)[B", line = 202)
    public static final byte[] method1750(int arg0, int arg1, byte[] arg2, int arg3) {
        try {
            field3004++;
            byte[] var4;
            if (arg1 <= 0) {
                var4 = arg2;
            } else {
                var4 = new byte[arg0];
                for (int var5 = 0; var5 < arg0; var5++) {
                    var4[var5] = arg2[arg1 + var5];
                }
            }
            class156 var6 = new class156();
            var6.method1313((byte) -32);
            var6.method1311((long) (arg0 * 8), 256, var4);
            if (arg3 != 17887) {
                field2995 = false;
            }
            byte[] var7 = new byte[64];
            var6.method1309(var7, 0, (byte) -54);
            return var7;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field3007[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3007[1] : field3007[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Llga;Llga;)V", line = 244)
    public class204(class47 arg0, class47 arg1) {
        try {
            this.field2994 = arg1;
            this.field2996 = arg0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3007[0] + (arg0 == null ? field3007[1] : field3007[2]) + ',' + (arg1 == null ? field3007[1] : field3007[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1751(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1752(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 92;
                    break;
                case 2:
                    var10005 = 3;
                    break;
                case 3:
                    var10005 = 67;
                    break;
                default:
                    var10005 = 27;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
