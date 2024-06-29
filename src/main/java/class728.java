import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class728 extends class341 {

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
    public int field10432 = -1;

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10438 = new String[] { method5303(method5302("$U}mx")), method5303(method5302("&Q?@")), method5303(method5302("3\n}\u0002-")), method5303(method5302("$U}nx")), method5303(method5302("$U}ox")) };

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "Z")
    public static boolean field10428 = false;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "Z")
    public static boolean field10434 = false;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "Z")
    public static boolean field10430 = false;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
    public static int field10429;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    public int field10431;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
    public static int field10433;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "I")
    public static int field10436;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "Ljava/lang/String;")
    public String field10435;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "Ljava/lang/String;")
    public String field10437;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)Liw;")
    public final class108 method5299(int arg0) {
        try {
            if (arg0 != 31419) {
                this.field10431 = -53;
            }
            ++field10429;
            return class293.field4124[super.field4974];
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10438[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILqp;)V")
    public static final void method5300(int arg0, int arg1, class277 arg2) {
        try {
            ++field10433;
            if (class646.field9186) {
                arg0 = 0;
                class646.field9186 = false;
            }
            if (arg1 == -9970) {
                if (class213.field3127 == null || !class213.field3127.method2258(arg2, (byte) -54)) {
                    class213.field3127 = arg2;
                    class761.field10863 = class614.method4531(-91);
                    class433.field6278 = arg0;
                    class228.field3312 = arg0;
                    if (~class228.field3312 != -1) {
                        class35.field427 = class603.field8654;
                        class715.field10176 = class320.field4367;
                        class127.field1596 = class376.field5494;
                        class743.field10560 = class119.field1511;
                        class322.field4386 = class50.field718;
                        class475.field6981 = class783.field11304;
                        class376.field5500 = class189.field2518;
                        class146.field1888 = class667.field9414;
                        class118.field1495 = class449.field6583;
                        class736.field10490 = class203.field2991;
                        class471.field6903 = class337.field4885;
                        if (class320.field4367 != null) {
                            if (class320.field4367.method5569((byte) 31)) {
                                class715.field10176 = class320.field4367.method5566(0);
                                class320.field4367 = class715.field10176;
                            }
                            if (class320.field4367 != null && class320.field4367 != class213.field3127.field3910) {
                                class320.field4367.method5572(true, class213.field3127.field3910);
                                return;
                            }
                        }
                    } else {
                        class182.method1509(-16711936);
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10438[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10438[2] : field10438[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIILlga;IZ)V")
    public static final void method5301(int arg0, int arg1, int arg2, int arg3, class47 arg4, int arg5, boolean arg6) {
        try {
            class760.field10848 = arg5;
            class443.field6543 = arg1;
            ++field10436;
            class189.field2517 = arg6;
            if (arg3 < -99) {
                class238.field3445 = null;
                class11.field150 = arg2;
                class385.field5631 = 1;
                class430.field6242 = arg4;
                class713.field10110 = arg0;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field10438[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10438[2] : field10438[1]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5302(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 80);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5303(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 36;
                    break;
                case 2:
                    var10005 = 83;
                    break;
                case 3:
                    var10005 = 44;
                    break;
                default:
                    var10005 = 80;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
