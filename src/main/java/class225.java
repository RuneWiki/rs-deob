import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ska")
public class class225 extends class497 {

    @OriginalMember(owner = "client!ska", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3275 = new String[] { method1883(method1882("Q\u0014EhT\n")), method1883(method1882("Q\u0014Eh[\n")), method1883(method1882("Q\u0014Eh^\n")), method1883(method1882("Q\u0014EhX\n")), method1883(method1882("Q\u0014Eh\\\n")), method1883(method1882("Q\u0014EhU\n")), method1883(method1882("Q\u0014Eh_\n")), method1883(method1882("Q\u0014EhZ\n")), method1883(method1882("Q\u0014EhY\n")) };

    @OriginalMember(owner = "client!ska", name = "j", descriptor = "Lsb;")
    public static class261 field3272 = new class261(67, 6);

    @OriginalMember(owner = "client!ska", name = "l", descriptor = "I")
    public static int field3274 = 0;

    @OriginalMember(owner = "client!ska", name = "f", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!ska", name = "n", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ska", name = "k", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!ska", name = "o", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!ska", name = "m", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!ska", name = "g", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!ska", name = "i", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!ska", name = "h", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!ska", name = "a", descriptor = "(IB)V")
    public static final void method1877(int arg0, byte arg1) {
        try {
            ++field3270;
            class550.field8036.method2038(arg1 ^ 55, arg0);
            if (arg1 != 55) {
                method1878(-109);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3275[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ska", name = "a", descriptor = "(I)I")
    public final int method1032(int arg0) {
        try {
            ++field3268;
            return arg0 > -101 ? -42 : 1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3275[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ska", name = "<init>", descriptor = "(Lpp;)V")
    public class225(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ska", name = "<init>", descriptor = "(ILpp;)V")
    public class225(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ska", name = "b", descriptor = "(I)V")
    public static void method1878(int arg0) {
        try {
            field3272 = null;
            if (arg0 <= 20) {
                method1878(90);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3275[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ska", name = "c", descriptor = "(I)I")
    public final int method1879(int arg0) {
        try {
            if (arg0 != 3) {
                this.method1029((byte) -55, 71);
            }
            ++field3269;
            return super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3275[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ska", name = "a", descriptor = "(BI)I")
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field3265;
            return arg0 != -73 ? 115 : 1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3275[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ska", name = "a", descriptor = "(IIIB)I")
    public static final int method1880(int arg0, int arg1, int arg2, byte arg3) {
        try {
            if (arg0 <= 243) {
                if (arg0 <= 217) {
                    if (~arg0 < -193) {
                        arg1 >>= 2;
                    } else if (arg0 > 179) {
                        arg1 >>= 1;
                    }
                } else {
                    arg1 >>= 3;
                }
            } else {
                arg1 >>= 4;
            }
            if (arg3 <= 46) {
                field3274 = 24;
            }
            ++field3273;
            return (arg1 >> 5 << 7) + ((arg2 >> 2 & 63) << 10) + (arg0 >> 1);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3275[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ska", name = "a", descriptor = "(ZC)Z")
    public static final boolean method1881(boolean arg0, char arg1) {
        try {
            ++field3267;
            if (!arg0) {
                field3272 = null;
            }
            if (~arg1 <= -33 && arg1 <= '~') {
                return true;
            } else if (arg1 >= 160 && ~arg1 >= -256) {
                return true;
            } else {
                return arg1 == 8364 || arg1 == 338 || ~arg1 == -8213 || arg1 == 339 || arg1 == 376;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3275[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ska", name = "a", descriptor = "(B)V")
    public final void method1031(byte arg0) {
        try {
            if (arg0 <= -70) {
                ++field3266;
                if (super.field7293.method4684(8) == class316.field4323) {
                    super.field7292 = 2;
                }
                if (~super.field7292 > -1 || super.field7292 > 2) {
                    super.field7292 = this.method1032(-128);
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3275[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ska", name = "a", descriptor = "(II)V")
    public final void method1030(int arg0, int arg1) {
        try {
            if (arg0 != 64) {
                method1880(106, 99, 93, (byte) 51);
            }
            ++field3271;
            super.field7292 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3275[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ska", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1882(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 29);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ska", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1883(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 34;
                    break;
                case 1:
                    var10005 = 127;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 29;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
