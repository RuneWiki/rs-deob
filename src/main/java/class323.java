import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class323 {

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4410 = new String[] { method2561(method2560("W\u000f|s^")), method2561(method2560("\\P|\u001e\u000b")), method2561(method2560("I\u000b>\\")), method2561(method2560("W\u000f|r^")), method2561(method2560("W\u000f|t^")), method2561(method2560("W\u000f|q^")) };

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "Z")
    public static boolean field4402 = false;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field4403 = 2;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "Z")
    public static boolean field4409 = false;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "[I")
    public static int[] field4405 = new int[3];

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLjc;)Las;", line = 12)
    public static final class793 method2556(boolean arg0, class711 arg1) {
        try {
            field4406++;
            if (!arg0) {
                method2556(true, null);
            }
            int var2 = arg1.method5128(0);
            class252 var3 = class750.method5433((byte) -81)[arg1.method5128(0)];
            class657 var4 = class240.method1988(61)[arg1.method5128(0)];
            int var5 = arg1.method5087((byte) -26);
            int var6 = arg1.method5087((byte) -26);
            int var7 = arg1.method5116((byte) -124);
            int var8 = arg1.method5116((byte) -111);
            int var9 = arg1.method5113(18443);
            int var10 = arg1.method5113(18443);
            int var11 = arg1.method5113(18443);
            boolean var12 = arg1.method5128(0) == 1;
            return new class793(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field4410[0] + arg0 + ',' + (arg1 == null ? field4410[2] : field4410[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V", line = 47)
    public static final void method2557(int arg0) {
        try {
            field4407++;
            for (int var1 = 0; var1 < 5; var1++) {
                class318.field4350[var1] = false;
            }
            class647.field9204 = class694.field9700;
            class2.field28 = 0;
            class369.field5338 = arg0;
            class301.field4188 = -1;
            class171.field2267 = -1;
            class712.field10005 = class670.field9442;
            class596.field8579 = 5;
            class667.field9420 = class525.field7650;
            class84.field1195 = class355.field5151;
            class444.field6552 = -1;
            class326.field4462 = -1;
            class710.field9928 = class688.field9635;
            class375.field5482 = class57.field802;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4410[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Lkka;", line = 75)
    public static final class776 method2558(int arg0) {
        try {
            if (arg0 == 1) {
                field4408++;
                return class623.method4578((byte) 47, 1);
            } else {
                return null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4410[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V", line = 94)
    public static void method2559(byte arg0) {
        try {
            field4405 = null;
            if (arg0 >= -116) {
                method2557(23);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4410[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2560(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x76);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2561(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 126;
                    break;
                case 2:
                    var10005 = 82;
                    break;
                case 3:
                    var10005 = 48;
                    break;
                default:
                    var10005 = 118;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
