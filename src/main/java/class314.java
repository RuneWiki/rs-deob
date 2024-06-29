import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class314 extends class497 {

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4309 = new String[] { method2502(method2501("\u0015?][\u0000")), method2502(method2501("\u001d8\u001f\u007f")), method2502(method2501("\bc]=U")), method2502(method2501("\u0015?]V\u0000")), method2502(method2501("\u0015?]W\u0000")), method2502(method2501("\u0015?]R\u0000")), method2502(method2501("\u0015?]Z\u0000")), method2502(method2501("\u001a+B")), method2502(method2501("\u0015?]Q\u0000")), method2502(method2501("\u0015?]T\u0000")), method2502(method2501("\u0015?]P\u0000")), method2502(method2501("\u0015?]U\u0000")) };

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "Luu;")
    public static class240 field4301 = new class240(3, 2);

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "[I")
    public static int[] field4308 = new int[4];

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "Llga;")
    public static class47 field4307;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IB)Z", line = 3)
    public static final boolean method2496(int arg0, byte arg1) {
        try {
            ++field4305;
            if (class443.field6542[arg0]) {
                return true;
            } else if (!class169.field2159.method515(arg0, -1)) {
                return false;
            } else {
                int var2 = class169.field2159.method509(true, arg0);
                if (var2 == 0) {
                    class443.field6542[arg0] = true;
                    return true;
                } else {
                    if (class9.field117[arg0] == null) {
                        class9.field117[arg0] = new class782[var2];
                    }
                    for (int var3 = 0; ~var2 < ~var3; ++var3) {
                        if (class9.field117[arg0][var3] == null) {
                            byte[] var4 = class169.field2159.method512(var3, arg0, (byte) -102);
                            if (var4 != null) {
                                class782 var5 = class9.field117[arg0][var3] = new class782();
                                var5.field11158 = (arg0 << 16) + var3;
                                if (~var4[0] != 0) {
                                    throw new IllegalStateException(field4309[7]);
                                }
                                var5.method5635(0, new class711(var4));
                            }
                        }
                    }
                    if (arg1 != -31) {
                        method2496(-1, (byte) -45);
                    }
                    class443.field6542[arg0] = true;
                    return true;
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4309[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BI)I", line = 62)
    public final int method1029(byte arg0, int arg1) {
        try {
            if (arg0 != -73) {
                method2499(24, (class170) null);
            }
            ++field4300;
            return 1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4309[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLjka;)V", line = 74)
    public static final void method2497(byte arg0, class228 arg1) {
        try {
            ++field4303;
            if (!class86.field1217) {
                arg1.method4294(0);
                --class72.field1049;
                if (arg1.field3301) {
                    for (class801 var2 = (class801) class520.field7588.method3932((byte) -52); var2 != null; var2 = (class801) class520.field7588.method3939((byte) -75)) {
                        if (var2.field11650.equals(arg1.field3294)) {
                            boolean var3 = false;
                            for (class228 var4 = (class228) var2.field11651.method3932((byte) -35); var4 != null; var4 = (class228) var2.field11651.method3939((byte) -75)) {
                                if (arg1 == var4) {
                                    if (var2.method5777(4118, arg1)) {
                                        class132.method1150(var2, 0);
                                    }
                                    var3 = true;
                                    break;
                                }
                            }
                            if (var3) {
                                break;
                            }
                        }
                    }
                } else {
                    long var5 = arg1.field3303;
                    class801 var7;
                    for (var7 = (class801) class603.field8646.method3693(false, var5); var7 != null && !var7.field11650.equals(arg1.field3294); var7 = (class801) class603.field8646.method3699(-1)) {
                    }
                    if (var7 != null && var7.method5777(4118, arg1)) {
                        class132.method1150(var7, 0);
                    }
                }
                if (arg0 >= -61) {
                    field4308 = null;
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field4309[5] + arg0 + ',' + (arg1 != null ? field4309[2] : field4309[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V", line = 148)
    public final void method1031(byte arg0) {
        try {
            if (super.field7292 < 0 && ~super.field7292 < -128) {
                super.field7292 = this.method1032(-103);
            }
            ++field4298;
            if (arg0 > -70) {
                field4301 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4309[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lpp;)V", line = 164)
    public class314(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)I", line = 168)
    public final int method2498(int arg0) {
        try {
            if (arg0 != 3) {
                return 90;
            } else {
                ++field4306;
                return super.field7292;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4309[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(ILpp;)V", line = 179)
    public class314(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILqo;)V", line = 182)
    public static final void method2499(int arg0, class170 arg1) {
        try {
            ++field4302;
            if (arg1.field2192 != null || arg1.field2239 != null) {
                boolean var2 = true;
                for (int var3 = 0; ~arg1.field2192.length < ~var3; ++var3) {
                    int var4 = -1;
                    if (arg1.field2192 != null) {
                        var4 = arg1.field2192[var3];
                    }
                    if (var4 == -1) {
                        if (!arg1.method1442(116, -1, var3)) {
                            var2 = false;
                        }
                    } else {
                        var2 = false;
                        boolean var5 = false;
                        boolean var6 = false;
                        int var9;
                        int var10;
                        if (~(var4 & -1073741824) != 1073741823) {
                            if ((var4 & 32768) == 0) {
                                class527 var7 = (class527) class479.field7063.method3693(false, (long) var4);
                                if (var7 == null) {
                                    arg1.method1442(57, -1, var3);
                                    continue;
                                }
                                class717 var8 = var7.field7672;
                                var9 = -var8.field2969 + arg1.field2969;
                                var10 = arg1.field2984 - var8.field2984;
                            } else {
                                int var11 = 32767 & var4;
                                class339 var12 = class748.field10666[var11];
                                if (var12 == null) {
                                    arg1.method1442(66, -1, var3);
                                    continue;
                                }
                                var9 = -var12.field2969 + arg1.field2969;
                                var10 = arg1.field2984 - var12.field2984;
                            }
                        } else {
                            int var13 = var4 & 268435455;
                            int var14 = var13 >> 14;
                            int var15 = var13 & 16383;
                            var9 = -((-class537.field7895 + var14) * 512) - (256 - arg1.field2969);
                            var10 = -((-class655.field9286 + var15) * 512) + arg1.field2984 - 256;
                        }
                        if (~var9 != -1 || ~var10 != -1) {
                            arg1.method1442(92, 16383 & (int) (Math.atan2((double) var9, (double) var10) * 2607.5945876176133D), var3);
                        }
                    }
                }
                int var16 = 10 % (arg0 / 32);
                if (var2) {
                    arg1.field2239 = null;
                    arg1.field2192 = null;
                }
            }
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field4309[0] + arg0 + ',' + (arg1 != null ? field4309[2] : field4309[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)I", line = 288)
    public final int method1032(int arg0) {
        try {
            if (arg0 >= -101) {
                return -87;
            } else {
                ++field4304;
                return 127;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4309[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V", line = 301)
    public static void method2500(int arg0) {
        try {
            field4307 = null;
            field4308 = null;
            field4301 = null;
            if (arg0 != 0) {
                method2499(-64, (class170) null);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4309[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V", line = 313)
    public final void method1030(int arg0, int arg1) {
        try {
            super.field7292 = arg1;
            ++field4299;
            if (arg0 != 64) {
                this.method1030(-102, -15);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4309[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2501(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2502(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 115;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 19;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
