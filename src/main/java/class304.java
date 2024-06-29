import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class304 extends class730 implements class94 {

    @OriginalMember(owner = "client!ria", name = "i", descriptor = "I")
    private int field4236;

    @OriginalMember(owner = "client!ria", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4241 = new String[] { method2446(method2445(")7l<ms")), method2446(method2445(")7l<fs")), method2446(method2445(")7l<as")), method2446(method2445("5+a~")), method2446(method2445(")7l<\u001920df\u001bs")), method2446(method2445(" p#<X")), method2446(method2445(")7l<`s")), method2446(method2445(")7l<bs")), method2446(method2445(")7l<gs")), method2446(method2445(")7l<ds")), method2446(method2445(")7l<cs")) };

    @OriginalMember(owner = "client!ria", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4234 = "";

    @OriginalMember(owner = "client!ria", name = "k", descriptor = "[I")
    public static int[] field4239 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ria", name = "l", descriptor = "I")
    public static int field4232 = -1;

    @OriginalMember(owner = "client!ria", name = "j", descriptor = "Lvs;")
    public static class470 field4230 = new class470();

    @OriginalMember(owner = "client!ria", name = "h", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!ria", name = "d", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!ria", name = "o", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!ria", name = "e", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!ria", name = "g", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!ria", name = "f", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!ria", name = "n", descriptor = "Ltf;")
    public static class524 field4238;

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "(B)J")
    public final long method942(byte arg0) {
        try {
            int var2 = -32 % ((arg0 - 73) / 50);
            ++field4231;
            return super.field10440.getAddress();
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4241[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIII)V")
    public static final void method2441(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field4237;
            for (class576 var5 = (class576) class614.field8777.method3977((byte) -57); var5 != null; var5 = (class576) class614.field8777.method3987(0)) {
                class169.method1423((byte) -5, arg0, arg3, arg2, var5, arg4);
            }
            if (arg1 != 3) {
                method2442(-119);
            }
            for (class576 var6 = (class576) class364.field5278.method3977((byte) -116); var6 != null; var6 = (class576) class364.field5278.method3987(0)) {
                byte var7 = 1;
                class765 var8 = var6.field8329.method1430(27750);
                int var9 = var6.field8329.field2182.method837(113);
                if (var9 != -1 && !var6.field8329.field2204) {
                    if (var8.field10902 != var9 && var8.field10905 != var9 && ~var8.field10920 != ~var9 && ~var8.field10932 != ~var9) {
                        if (~var8.field10923 == ~var9 || ~var8.field10922 == ~var9 || ~var8.field10879 == ~var9 || var8.field10892 == var9) {
                            var7 = 3;
                        }
                    } else {
                        var7 = 2;
                    }
                } else {
                    var7 = 0;
                }
                if (~var6.field8323 != ~var7) {
                    int var10 = class453.method3507(var6.field8329, -1);
                    class134 var11 = var6.field8329.field10229;
                    if (var11.field1659 != null) {
                        var11 = var11.method1178(class734.field10459, (byte) -104);
                    }
                    if (var11 != null && var10 != -1) {
                        if (~var6.field8321 == ~var10 && !var6.field8330 == !var11.field1709) {
                            var6.field8331 = var11.field1706;
                            var6.field8323 = var7;
                        } else {
                            boolean var12 = false;
                            if (var6.field8324 == null) {
                                var12 = true;
                            } else {
                                var6.field8331 -= 512;
                                if (var6.field8331 <= 0) {
                                    class261.field3699.method4232(var6.field8324);
                                    var6.field8324 = null;
                                    var12 = true;
                                }
                            }
                            if (var12) {
                                var6.field8331 = var11.field1706;
                                var6.field8323 = var7;
                                var6.field8345 = null;
                                var6.field8354 = null;
                                var6.field8321 = var10;
                                var6.field8330 = var11.field1709;
                            }
                        }
                    } else {
                        var6.field8323 = var7;
                        var6.field8330 = false;
                        var6.field8321 = -1;
                    }
                }
                var6.field8337 = var6.field8329.field2969;
                var6.field8335 = var6.field8329.field2969 - -(var6.field8329.method1437((byte) -28) << 8);
                var6.field8338 = var6.field8329.field2984;
                var6.field8320 = var6.field8329.field2984 + (var6.field8329.method1437((byte) -28) << 8);
                class169.method1423((byte) -5, arg0, arg3, arg2, var6, arg4);
            }
            for (class576 var13 = (class576) class572.field8289.method3696(0); var13 != null; var13 = (class576) class572.field8289.method3697(-87)) {
                byte var14 = 1;
                class765 var15 = var13.field8353.method1430(27750);
                int var16 = var13.field8353.field2182.method837(-112);
                if (~var16 != 0 && !var13.field8353.field2204) {
                    if (~var15.field10902 != ~var16 && var15.field10905 != var16 && ~var15.field10920 != ~var16 && var15.field10932 != var16) {
                        if (var15.field10923 == var16 || var15.field10922 == var16 || ~var15.field10879 == ~var16 || ~var15.field10892 == ~var16) {
                            var14 = 3;
                        }
                    } else {
                        var14 = 2;
                    }
                } else {
                    var14 = 0;
                }
                if (~var13.field8323 != ~var14) {
                    int var17 = class608.method4491(var13.field8353, arg1 ^ 3);
                    if (~var13.field8321 == ~var17 && !var13.field8353.field4947 != var13.field8330) {
                        var13.field8331 = var13.field8353.field4907;
                        var13.field8323 = var14;
                    } else {
                        boolean var18 = false;
                        if (var13.field8324 == null) {
                            var18 = true;
                        } else {
                            var13.field8331 -= 512;
                            if (var13.field8331 <= 0) {
                                class261.field3699.method4232(var13.field8324);
                                var18 = true;
                                var13.field8324 = null;
                            }
                        }
                        if (var18) {
                            var13.field8331 = var13.field8353.field4907;
                            var13.field8321 = var17;
                            var13.field8345 = null;
                            var13.field8330 = var13.field8353.field4947;
                            var13.field8323 = var14;
                            var13.field8354 = null;
                        }
                    }
                }
                var13.field8337 = var13.field8353.field2969;
                var13.field8335 = var13.field8353.field2969 - -(var13.field8353.method1437((byte) -28) << 8);
                var13.field8338 = var13.field8353.field2984;
                var13.field8320 = var13.field8353.field2984 - -(var13.field8353.method1437((byte) -28) << 8);
                class169.method1423((byte) -5, arg0, arg3, arg2, var13, arg4);
            }
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field4241[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)I")
    public final int method945(boolean arg0) {
        try {
            ++field4229;
            if (!arg0) {
                this.method943(17, -87, (byte[]) null, (byte) 18);
            }
            return this.field4236;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4241[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)V")
    public static void method2442(int arg0) {
        try {
            int var1 = 66 / ((41 - arg0) / 39);
            field4239 = null;
            field4238 = null;
            field4230 = null;
            field4234 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4241[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(II[BB)V")
    public final void method943(int arg0, int arg1, byte[] arg2, byte arg3) {
        try {
            this.method5321(arg2, arg0);
            ++field4233;
            this.field4236 = arg1;
            if (arg3 <= 116) {
                this.field4236 = 32;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4241[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4241[5] : field4241[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Lml;I[BI)V")
    public class304(class194 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        try {
            this.field4236 = arg1;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4241[4] + (arg0 != null ? field4241[5] : field4241[3]) + ',' + arg1 + ',' + (arg2 != null ? field4241[5] : field4241[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Lml;ILjaclib/memory/Buffer;)V")
    public class304(class194 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        try {
            this.field4236 = arg1;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4241[4] + (arg0 != null ? field4241[5] : field4241[3]) + ',' + arg1 + ',' + (arg2 != null ? field4241[5] : field4241[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)I")
    public final int method944(byte arg0) {
        try {
            int var2 = -8 % ((arg0 - -40) / 50);
            ++field4235;
            return 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4241[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(ZLlga;I)Ltb;")
    public static final class392 method2443(boolean arg0, class47 arg1, int arg2) {
        try {
            ++field4240;
            if (!arg0) {
                method2442(31);
            }
            class392 var3 = (class392) class737.field10497.method2053(0, (long) arg2);
            if (var3 == null) {
                if (class767.field10949) {
                    var3 = class236.field3418.method231(class66.method701(arg1, arg2), true);
                } else {
                    var3 = class483.method3727(arg1.method520((byte) 108, arg2), -120);
                }
                class737.field10497.method2051((long) arg2, var3, 93);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4241[10] + arg0 + ',' + (arg1 != null ? field4241[5] : field4241[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method2444(boolean arg0, String arg1) {
        try {
            ++field4228;
            int var2 = arg1.length();
            int var3 = 0;
            int var4 = 0;
            if (arg0) {
                method2443(false, (class47) null, 36);
            }
            while (~var2 < ~var4) {
                var3 = class152.method1291(arg1.charAt(var4), (byte) -9) + (var3 << 5) + -var3;
                ++var4;
            }
            return var3;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4241[6] + arg0 + ',' + (arg1 != null ? field4241[5] : field4241[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2445(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 37);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ria", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2446(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 91;
                    break;
                case 1:
                    var10005 = 94;
                    break;
                case 2:
                    var10005 = 13;
                    break;
                case 3:
                    var10005 = 18;
                    break;
                default:
                    var10005 = 37;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
