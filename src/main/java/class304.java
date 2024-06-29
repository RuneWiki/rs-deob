import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class304 extends class46 {

    @OriginalMember(owner = "client!jfa", name = "u", descriptor = "Ldga;")
    public class218 field4756;

    @OriginalMember(owner = "client!jfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4758 = new String[] { method2585(method2584("aJI\u001c\u000e#")), method2585(method2584("aJI\u001c\u000f#")), method2585(method2584("p\u0002\u0006\u001c5")), method2585(method2584("aJI\u001ctbBAFv#")), method2585(method2584("eYD^")), method2585(method2584("aJI\u001c\u0000#")) };

    @OriginalMember(owner = "client!jfa", name = "v", descriptor = "I")
    public static int field4752 = 0;

    @OriginalMember(owner = "client!jfa", name = "s", descriptor = "Lel;")
    public static class573 field4755 = new class573(126, 6);

    @OriginalMember(owner = "client!jfa", name = "t", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!jfa", name = "r", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!jfa", name = "w", descriptor = "Lla;")
    public static class476 field4754;

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(B)V")
    public static void method2581(byte arg0) {
        try {
            int var1 = 37 / ((arg0 - 23) / 52);
            field4754 = null;
            field4755 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4758[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BII)V")
    public static final void method2582(byte arg0, int arg1, int arg2) {
        try {
            field4753++;
            int var3 = class475.field6895.method4322(256, class309.field4871.method2616(false, class167.field2300));
            if (arg0 > -78) {
                method2582((byte) -63, 97, -26);
            }
            int var6;
            if (class514.field7425) {
                for (class655 var4 = (class655) class492.field7058.method4068(false); var4 != null; var4 = (class655) class492.field7058.method4072(-122)) {
                    int var5;
                    if (var4.field9459 == 1) {
                        var5 = class706.method5160((class417) var4.field9457.field7916.field529, (byte) -75);
                    } else {
                        var5 = class724.method5275(1, var4);
                    }
                    if (var3 < var5) {
                        var3 = var5;
                    }
                }
                var3 += 8;
                class387.field5849 = (class369.field5631 ? 26 : 22) + class184.field2547 * 16;
                var6 = class184.field2547 * 16 + 21;
            } else {
                for (class417 var7 = (class417) class728.field10549.method3863((byte) 64); var7 != null; var7 = (class417) class728.field10549.method3862(-353)) {
                    int var8 = class706.method5160(var7, (byte) -126);
                    if (var3 < var8) {
                        var3 = var8;
                    }
                }
                var6 = class593.field8707 * 16 + 21;
                class387.field5849 = class593.field8707 * 16 + (class369.field5631 ? 26 : 22);
                var3 += 8;
            }
            int var9 = arg1 - var3 / 2;
            if ((var3 + var9) > class179.field2489) {
                var9 = class179.field2489 - var3;
            }
            if (var9 < 0) {
                var9 = 0;
            }
            int var10 = arg2;
            if (class94.field1062 < (var6 + arg2)) {
                var10 = class94.field1062 - var6;
            }
            if (var10 < 0) {
                var10 = 0;
            }
            class476.field6905 = var9;
            class216.field3297 = true;
            class371.field5655 = var3;
            class668.field9704 = var10;
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field4758[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Ldga;)V")
    public class304(class218 arg0) {
        try {
            this.field4756 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4758[3] + (arg0 == null ? field4758[4] : field4758[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III)Z")
    public static final boolean method2583(int arg0, int arg1, int arg2) {
        try {
            field4757++;
            if (arg1 != -840) {
                field4755 = null;
            }
            return class431.method3304(arg2, -13984, arg0) & class373.method3008(0, arg2, arg0);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4758[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2584(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x48);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2585(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 44;
                    break;
                case 2:
                    var10005 = 40;
                    break;
                case 3:
                    var10005 = 50;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
