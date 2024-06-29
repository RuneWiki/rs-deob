import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class301 {

    @OriginalMember(owner = "client!aia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4195 = new String[] { method2414(method2413("~S\u001aBq7")), method2414(method2413("~S\u001aBw7")), method2414(method2413("~S\u001aBv7")), method2414(method2413("u[\r\r\u001cs[\u0015\u000b\u001cMO\u0015\u0018[r_")), method2414(method2413("~L\u001a\u0005^~X\u0017\tbmU\u0018\tAlU\t\u001f")), method2414(method2413("~S\u001aBp7")), method2414(method2413("qO\u0017\u0000")), method2414(method2413("d\u0014UBO")), method2414(method2413("xT\u000b_\u0012rS\bV")), method2414(method2413("xT\u000b^\u0012oU\bV")), method2414(method2413("xT\u000b]\u0012oU\bV")), method2414(method2413("?I\u0012\u0016W%")), method2414(method2413("~S\u001aBt7")), method2414(method2413("?J\b\u0005Hz\u0000")), method2414(method2413("xT\u000bX\u0012jQA")) };

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "I")
    public static int field4184 = 0;

    @OriginalMember(owner = "client!aia", name = "g", descriptor = "Lmv;")
    public static class125 field4186 = new class125(15, -1);

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "[Ljba;")
    public static class492[] field4192 = new class492[37];

    @OriginalMember(owner = "client!aia", name = "e", descriptor = "Lsb;")
    public static class261 field4191 = new class261(118, -2);

    @OriginalMember(owner = "client!aia", name = "h", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4193 = new Rectangle[100];

    @OriginalMember(owner = "client!aia", name = "i", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!aia", name = "j", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!aia", name = "k", descriptor = "I")
    public static int field4190;

    // $FF: synthetic field
    @OriginalMember(owner = "client!aia", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field4194;

    // $FF: synthetic method
    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2412(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "([Lrfa;II)V", line = 3)
    public static final void method2406(class202[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class202 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field2970;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field2970 > (var7 & 0x1) + var6) {
                class202 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method2406(arg0, arg1, var4 - 1);
        method2406(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)Lsaa;", line = 45)
    public static final class425 method2407(int arg0, int arg1) {
        try {
            field4189++;
            return arg1 >= ~arg0 && arg0 < 100 ? class783.field11301[arg0] : null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4195[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(B)V", line = 56)
    public static final void method2408(byte arg0) {
        try {
            field4185++;
            if (arg0 != 113) {
                field4193 = null;
            }
            try {
                Method var1 = (field4194 == null ? (field4194 = method2412(field4195[3])) : field4194).getMethod(field4195[4]);
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                        class648.field9208 = var3;
                    } catch (Throwable var5) {
                    }
                }
            } catch (Exception var6) {
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4195[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)V", line = 89)
    public static final void method2409(byte arg0) {
        try {
            class723.field10293 = 0;
            field4187++;
            class118.field1504++;
            if (arg0 == -1) {
                class225.field3274 = 0;
                class514.method3931(17364);
                class291.method2357(arg0 - 78);
                class610.method4498(arg0 ^ 0x4F);
                boolean var1 = false;
                for (int var2 = 0; var2 < class723.field10293; var2++) {
                    int var3 = class438.field6457[var2];
                    class527 var4 = (class527) class479.field7063.method3693(false, (long) var3);
                    class717 var5 = var4.field7672;
                    if (class118.field1504 != var5.field2232) {
                        if (class86.field1217 && class41.method468(118, var3)) {
                            class215.method1806(4);
                        }
                        if (var5.field10229.method1169((byte) -65)) {
                            class249.method2028(var5, -2997);
                        }
                        var5.method5200(null, arg0);
                        var1 = true;
                        var4.method4294(0);
                    }
                }
                if (var1) {
                    class715.field10182 = class479.field7063.method3692(21538);
                    class479.field7063.method3694((byte) -98, class677.field9494);
                }
                if (class60.field916.field11105 != class60.field916.field11099.field9945) {
                    throw new RuntimeException(field4195[10] + class60.field916.field11099.field9945 + field4195[13] + class60.field916.field11105);
                }
                for (int var6 = 0; var6 < class438.field6458; var6++) {
                    if (class479.field7063.method3693(false, (long) class343.field4987[var6]) == null) {
                        throw new RuntimeException(field4195[9] + var6 + field4195[11] + class438.field6458);
                    }
                }
                if ((class715.field10182 - class438.field6458) != 0) {
                    throw new RuntimeException(field4195[8] + (class715.field10182 - class438.field6458));
                }
                for (int var7 = 0; var7 < class715.field10182; var7++) {
                    if (class118.field1504 != class677.field9494[var7].field7672.field2232) {
                        throw new RuntimeException(field4195[14] + class677.field9494[var7].field7672.field2200);
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field4195[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V", line = 175)
    public static void method2410(int arg0) {
        try {
            field4191 = null;
            field4186 = null;
            field4193 = null;
            field4192 = null;
            if (arg0 != 21530) {
                field4192 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4195[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lu;Z)Z", line = 194)
    public static final boolean method2411(class741 arg0, boolean arg1) {
        try {
            field4190++;
            if (!arg1) {
                field4193 = null;
            }
            return class226.field3284 == arg0 || class447.field6570 == arg0 || class46.field648 == arg0 || class491.field7197 == arg0 || class260.field3692 == arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4195[5] + (arg0 == null ? field4195[6] : field4195[7]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2413(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x32);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2414(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 31;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 123;
                    break;
                case 3:
                    var10005 = 108;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
