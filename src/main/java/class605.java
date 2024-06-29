import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class605 extends class497 {

    @OriginalMember(owner = "client!paa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8682 = new String[] { method4473(method4472("Oq\u0014g\u001f\u0017")), method4473(method4472("Oq\u0014g\u0012\u0017")), method4473(method4472("Oq\u0014g\u0015\u0017")), method4473(method4472("Oq\u0014g\u0010\u0017")), method4473(method4472("Oq\u0014g\u0016\u0017")), method4473(method4472("Oq\u0014g\u0013\u0017")), method4473(method4472("D>[g*")), method4473(method4472("Oq\u0014g\u0011\u0017")), method4473(method4472("Qe\u0019%")), method4473(method4472("Oq\u0014g\u0014\u0017")) };

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "Lsb;")
    public static class261 field8678 = new class261(130, 2);

    @OriginalMember(owner = "client!paa", name = "i", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!paa", name = "k", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!paa", name = "g", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!paa", name = "n", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!paa", name = "l", descriptor = "I")
    public static int field8677;

    @OriginalMember(owner = "client!paa", name = "j", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!paa", name = "h", descriptor = "I")
    public static int field8680;

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)V", line = 3)
    public final void method1031(byte arg0) {
        try {
            if (super.field7292 != 1 && ~super.field7292 != -1) {
                super.field7292 = this.method1032(-108);
            }
            ++field8681;
            if (arg0 > -70) {
                this.method1032(-9);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8682[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(BI)I", line = 16)
    public final int method1029(byte arg0, int arg1) {
        try {
            if (arg0 != -73) {
                method4469(false);
            }
            ++field8676;
            return 1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8682[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)I", line = 28)
    public final int method4468(int arg0) {
        try {
            if (arg0 != 3) {
                field8678 = null;
            }
            ++field8679;
            return super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8682[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)I", line = 40)
    public final int method1032(int arg0) {
        try {
            if (arg0 > -101) {
                return 39;
            } else {
                ++field8680;
                return 0;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8682[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(Z)V", line = 54)
    public static void method4469(boolean arg0) {
        try {
            field8678 = null;
            if (arg0) {
                field8678 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8682[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(BLjava/lang/String;)V", line = 65)
    public static final void method4470(byte arg0, String arg1) {
        try {
            ++field8674;
            if (class351.field5091 && ~(class140.field1826 & 24) != -1) {
                boolean var2 = false;
                int var3 = class689.field9642;
                if (arg0 == -104) {
                    int[] var4 = class599.field8595;
                    for (int var5 = 0; ~var5 > ~var3; ++var5) {
                        class339 var6 = class748.field10666[var4[var5]];
                        if (var6.field4905 != null && var6.field4905.equalsIgnoreCase(arg1) && (class203.field2988 == var6 && (class140.field1826 & 16) != 0 || (class140.field1826 & 8) != 0)) {
                            ++class619.field8821;
                            class274 var7 = class375.method2969((byte) 1, class317.field4347, class60.field916.field11100);
                            var7.field3885.method5138((byte) -126, class108.field1420);
                            var7.field3885.method5127(class671.field9452, 26108);
                            var7.field3885.method5138((byte) -114, var4[var5]);
                            var7.field3885.method5082(-128, class121.field1535);
                            var7.field3885.method5108(0, (byte) 100);
                            class60.field916.method5608(var7, 29867);
                            class50.method548(0, -2, true, var6.method1437((byte) -28), var6.field2252[0], var6.field2256[0], 0, arg0 + -30913, var6.method1437((byte) -28));
                            var2 = true;
                            break;
                        }
                    }
                    if (!var2) {
                        class756.method5485(4, (byte) 8, class537.field7851.method4068((byte) -115, class405.field5883) + arg1);
                    }
                    if (class351.field5091) {
                        class598.method4410((byte) 55);
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field8682[7] + arg0 + ',' + (arg1 != null ? field8682[6] : field8682[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(ILpp;)V", line = 117)
    public class605(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIB)Z", line = 120)
    public static final boolean method4471(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 != -93) {
                method4470((byte) -53, (String) null);
            }
            ++field8675;
            return ~(arg0 & 52) != -1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8682[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lpp;)V", line = 135)
    public class605(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(II)V", line = 140)
    public final void method1030(int arg0, int arg1) {
        try {
            ++field8677;
            if (arg0 != 64) {
                field8678 = null;
            }
            super.field7292 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8682[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!paa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4472(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 87);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!paa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4473(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 63;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 73;
                    break;
                default:
                    var10005 = 87;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
