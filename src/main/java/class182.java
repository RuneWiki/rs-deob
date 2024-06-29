import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class182 {

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "[I")
    public int[] field2353;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "B")
    public byte field2347;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "B")
    public byte field2356;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "[I")
    public int[] field2352;

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "[I")
    public int[] field2351;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "S")
    public short field2354;

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "S")
    public short field2348;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "S")
    public short field2357;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "S")
    public short field2358;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "[S")
    public short[] field2346;

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "[S")
    public short[] field2350;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "[S")
    public short[] field2355;

    @OriginalMember(owner = "client!lt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2363 = new String[] { method1514(method1513("@d\u001e7\tByD5H")), method1514(method1513("Bu")), method1514(method1513("@d\u001eJH")), method1514(method1513("FqFjNMgD%#C}@d\u000eI~D")), method1514(method1513("Be\\g")), method1514(method1513("W>\u001e%\u001d")), method1514(method1513("@d\u001eHH")), method1514(method1513("@d\u001eIH")) };

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "Lsb;")
    public static class261 field2359 = new class261(17, 3);

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "Lsb;")
    public static class261 field2360 = new class261(24, -1);

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field2361;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lt", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field2362;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
    public static final void method1509(int arg0) {
        try {
            if (arg0 != -16711936) {
                method1510(null, -128, true);
            }
            if (class433.field6278 >= 0) {
                long var1 = class614.method4531(-55);
                class433.field6278 = (int) ((long) class433.field6278 - (var1 - class761.field10863));
                if (class433.field6278 <= 0) {
                    class119.field1511 = class213.field3127.field3921;
                    class337.field4885 = class213.field3127.field3911;
                    class189.field2518 = class213.field3127.field3902;
                    class603.field8654 = class213.field3127.field3919;
                    class783.field11304 = class213.field3127.field3917;
                    class667.field9414 = class213.field3127.field3907;
                    class449.field6583 = class213.field3127.field3920;
                    class376.field5494 = class213.field3127.field3906;
                    class203.field2991 = class213.field3127.field3908;
                    class50.field718 = class213.field3127.field3904;
                    if (class320.field4367 != null) {
                        class320.field4367.method5571(arg0 ^ 0xFF00FF75);
                    }
                    class320.field4367 = class213.field3127.field3910;
                    class433.field6278 = -1;
                } else {
                    int var3 = (class433.field6278 << 8) / class228.field3312;
                    int var4 = 255 - var3;
                    float var5 = (float) var3 / 255.0F;
                    float var6 = 1.0F - var5;
                    class50.field718 = ((class322.field4386 & 0xFF00FF) * var3 + (class213.field3127.field3904 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class322.field4386 & 0xFF00) * var3 + (class213.field3127.field3904 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                    class449.field6583 = (class213.field3127.field3920 - class118.field1495) * var6 + class118.field1495;
                    class603.field8654 = (class213.field3127.field3919 - class35.field427) * var6 + class35.field427;
                    class337.field4885 = (class213.field3127.field3911 - class471.field6903) * var6 + class471.field6903;
                    class203.field2991 = (class213.field3127.field3908 - class736.field10490) * var6 + class736.field10490;
                    class376.field5494 = ((class127.field1596 & 0xFF00) * var3 + ((class213.field3127.field3906 & 0xFF00) * var4) & 0xFF0000) + ((class127.field1596 & 0xFF00FF) * var3 + ((class213.field3127.field3906 & 0xFF00FF) * var4) & 0xFF00FF00) >>> 8;
                    class119.field1511 = (class213.field3127.field3921 - class743.field10560) * var6 + class743.field10560;
                    class783.field11304 = (class213.field3127.field3917 - class475.field6981) * var6 + class475.field6981;
                    class189.field2518 = class376.field5500 * var3 + class213.field3127.field3902 * var4 >> 8;
                    if (class146.field1888 != class213.field3127.field3907) {
                        class667.field9414 = class727.field10423.method155(class146.field1888, class213.field3127.field3907, var6, class667.field9414);
                    }
                    if (class715.field10176 != class213.field3127.field3910) {
                        if (class715.field10176 == null) {
                            class320.field4367 = class213.field3127.field3910;
                            if (class320.field4367 != null) {
                                class320.field4367.method5567(1, 0, var4);
                            }
                        } else {
                            class320.field4367 = class715.field10176;
                            if (class320.field4367 != null) {
                                class320.field4367.method5567(1, 255, var4);
                            }
                        }
                    }
                }
                class761.field10863 = var1;
            }
            field2361++;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2363[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lbka;")
    public static final class791 method1510(Component arg0, int arg1, boolean arg2) {
        try {
            field2349++;
            try {
                Constructor var3 = Class.forName(field2363[1]).getDeclaredConstructor(field2362 == null ? (field2362 = method1512(field2363[3])) : field2362, Boolean.TYPE);
                if (arg1 != 0) {
                    method1511(-28);
                }
                return (class791) var3.newInstance(arg0, Boolean.valueOf(arg2));
            } catch (Throwable var5) {
                return new class360(arg0, arg2);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2363[2] + (arg0 == null ? field2363[4] : field2363[5]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
    public static void method1511(int arg0) {
        try {
            if (arg0 <= -23) {
                field2360 = null;
                field2359 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2363[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
    public class182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        try {
            this.field2353 = new int[4];
            this.field2347 = (byte) arg0;
            this.field2356 = (byte) arg1;
            this.field2352 = new int[4];
            this.field2351 = new int[4];
            this.field2353[2] = arg4;
            this.field2353[3] = arg5;
            this.field2353[0] = arg2;
            this.field2353[1] = arg3;
            this.field2351[1] = arg7;
            this.field2351[2] = arg8;
            this.field2351[0] = arg6;
            this.field2351[3] = arg9;
            this.field2352[1] = arg11;
            this.field2352[3] = arg13;
            this.field2354 = (short) (arg2 >> class179.field2328);
            this.field2352[0] = arg10;
            this.field2352[2] = arg12;
            this.field2348 = (short) (arg4 >> class179.field2328);
            this.field2357 = (short) (arg10 >> class179.field2328);
            this.field2358 = (short) (arg12 >> class179.field2328);
            this.field2346 = new short[4];
            this.field2350 = new short[4];
            this.field2355 = new short[4];
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field2363[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1512(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1513(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x60);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1514(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 44;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 48;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 96;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
