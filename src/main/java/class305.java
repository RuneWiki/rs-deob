import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class305 extends class244 {

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "Lus;")
    public static class1 field4339 = new class1(53, 7);

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "Lus;")
    public static class1 field4341 = new class1(94, 10);

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "Lwf;")
    public static class79 field4342 = new class79(47, 6);

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "Lsn;")
    public static class411 field4343 = new class411();

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "Lja;")
    public static class167 field4340;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
    public static final void method1888(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4337++;
        class157 var8 = new class157();
        var8.field2340 = arg3;
        var8.field2330 = arg0;
        var8.field2335 = arg2;
        if (arg6 != 7524) {
            field4341 = null;
        }
        var8.field2331 = arg5;
        var8.field2341 = arg4;
        var8.field2343 = class353.field5090 + arg7;
        var8.field2336 = arg1;
        class212.field3208.method1444(var8, (byte) 116);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public static void method1889(byte arg0) {
        if (arg0 != -38) {
            field4340 = null;
        }
        field4339 = null;
        field4340 = null;
        field4343 = null;
        field4342 = null;
        field4341 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lnp;)V")
    public static final void method1890(class313 arg0) {
        for (int var1 = class346.field5020; var1 < class314.field4441; var1++) {
            for (int var2 = 0; var2 < class287.field4186; var2++) {
                for (int var3 = 0; var3 < class360.field5188; var3++) {
                    class88 var4 = class330.field4786[var1][var2][var3];
                    if (var4 != null) {
                        class237 var5 = var4.field1078;
                        class237 var6 = var4.field1082;
                        if (var5 != null && var5.method249(-116)) {
                            class349.method2182(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method249(-109)) {
                                class349.method2182(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method247(0, var5, 0, arg0, (byte) -108, false, 0);
                                var6.method246(-1);
                            }
                            var5.method246(-1);
                        }
                        for (class93 var7 = var4.field1068; var7 != null; var7 = var7.field1178) {
                            class304 var9 = var7.field1177;
                            if (var9 != null && var9.method249(-119)) {
                                class349.method2182(arg0, var9, var1, var2, var3, var9.field4328 + 1 - var9.field4330, var9.field4334 - var9.field4324 + 1);
                                var9.method246(-1);
                            }
                        }
                        class405 var8 = var4.field1070;
                        if (var8 != null && var8.method249(-127)) {
                            class26.method190(arg0, var8, var1, var2, var3);
                            var8.method246(-1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)Lr;")
    public static final class110 method1891(int arg0) {
        field4338++;
        try {
            return arg0 == 1 ? (class110) Class.forName("sl").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return null;
        }
    }
}
