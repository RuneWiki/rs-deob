import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class288 extends class391 implements class517 {

    @OriginalMember(owner = "client!gr", name = "K", descriptor = "Lon;")
    private class496 field4075;

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field4082 = new String[] { method2348(method2347("&\u001f@\u0015\t")), method2348(method2347("&\u001f@\u0019\t")), method2348(method2347("&\u001f@\u0016\t")), method2348(method2347("/\u0018\u0002=")), method2348(method2347("&\u001f@mH/\u0004\u001ao\t")), method2348(method2347(":C@\u007f\\")), method2348(method2347("&\u001f@\u001a\t")), method2348(method2347("&\u001f@\u0012\t")), method2348(method2347("&\u001f@\u0013\t")), method2348(method2347("&\u001f@\u001b\t")), method2348(method2347("&\u001f@\u0018\t")), method2348(method2347("&\u001f@\u0010\t")), method2348(method2347("&\u001f@\u001d\t")) };

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "Llf;")
    public static class260 field4073 = new class260(8, -1);

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!gr", name = "I", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!gr", name = "J", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!gr", name = "L", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lvo;I)Lvo;")
    public static final class782 method2337(class782 arg0, int arg1) {
        try {
            ++field4071;
            class782 var2 = client.method4969(arg0);
            if (var2 == null) {
                var2 = arg0.field11196;
            }
            if (arg1 != 1) {
                field4073 = null;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4082[7] + (arg0 != null ? field4082[5] : field4082[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILlga;IZII)V")
    public static final void method2338(int arg0, int arg1, class47 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        try {
            ++field4080;
            if (arg6 != 12) {
                field4073 = null;
            }
            if (arg3 > 0) {
                class11.field150 = arg5;
                class238.field3445 = null;
                class760.field10848 = arg0;
                class443.field6543 = arg1;
                class430.field6242 = arg2;
                class189.field2517 = arg4;
                class385.field5631 = 1;
                class713.field10110 = class786.field11354.method3321(-1801413873) / arg3;
                if (class713.field10110 < 1) {
                    class713.field10110 = 1;
                    return;
                }
            } else {
                class772.method5562(arg5, arg1, arg2, arg0, (byte) 55, arg4);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4082[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4082[5] : field4082[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(Z)Z")
    public final boolean method2339(boolean arg0) {
        try {
            if (!arg0) {
                field4073 = null;
            }
            ++field4079;
            return super.method3062(super.field5711.field10124, -4014);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4082[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "(I)V")
    public static void method2340(int arg0) {
        try {
            if (arg0 <= 82) {
                method2338(-29, 124, (class47) null, -12, true, 24, -112);
            }
            field4073 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4082[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)Z")
    public static final boolean method2341(int arg0, byte arg1) {
        try {
            if (arg1 >= -37) {
                field4073 = null;
            }
            ++field4072;
            return arg0 == 4 || ~arg0 == -9 || arg0 == 12 || ~arg0 == -11;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4082[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)V")
    public final void method2342(boolean arg0) {
        try {
            ++field4076;
            super.method2342(arg0);
            if (!arg0) {
                this.method2343((byte) -66, true);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4082[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method2343(byte arg0, boolean arg1) {
        try {
            if (arg0 != 54) {
                field4073 = null;
            }
            ++field4077;
            return super.method3063(super.field5711.field10124, (byte) -39, arg1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4082[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)V")
    public final void method2344(int arg0, int arg1) {
        try {
            if (arg1 < 23) {
                method2341(-21, (byte) -127);
            }
            ++field4081;
            super.method2344(this.field4075.field7279 * arg0, 46);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4082[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Ldga;Lon;Z)V")
    public class288(class713 arg0, class496 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        try {
            this.field4075 = arg1;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4082[4] + (arg0 != null ? field4082[5] : field4082[3]) + ',' + (arg1 != null ? field4082[5] : field4082[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)Lon;")
    public final class496 method2345(int arg0) {
        try {
            int var2 = 111 % ((arg0 - 58) / 47);
            ++field4078;
            return this.field4075;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4082[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)I")
    public final int method2346(int arg0) {
        try {
            if (arg0 != 34962) {
                this.method2344(-72, -83);
            }
            ++field4074;
            return super.method2346(34962);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4082[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2347(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 33);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2348(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 65;
                    break;
                case 1:
                    var10005 = 109;
                    break;
                case 2:
                    var10005 = 110;
                    break;
                case 3:
                    var10005 = 81;
                    break;
                default:
                    var10005 = 33;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
