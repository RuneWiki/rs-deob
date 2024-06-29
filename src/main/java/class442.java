import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class442 {

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field6058 = 100;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "F")
    public static float field6061;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "Z")
    public static boolean field6057;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method2499(int arg0, int arg1, String arg2) {
        field6059++;
        if (arg0 == 0) {
            class10.field197 = class651.method3571(class344.field4718.field5449 * 2, class443.field6072, 125, 0, class230.field3220, class94.field1447);
            if (arg2 != null) {
                class10.field197.method87(0);
                class511 var10 = class384.method2238(0, class389.field5148, (byte) -104, class68.field1035);
                class200 var11 = class10.field197.method389(var10, class500.method2777(class658.field9155, class389.field5148, 0), true);
                class428.method2445(120);
                class172.method1166((byte) -24, arg2, true, class10.field197, var11, var10);
            }
        } else {
            class651 var3 = null;
            if (arg2 != null) {
                var3 = class651.method3571(0, class443.field6072, 127, 0, class230.field3220, class94.field1447);
                var3.method87(0);
                class511 var4 = class384.method2238(0, class389.field5148, (byte) -114, class68.field1035);
                class200 var5 = var3.method389(var4, class500.method2777(class658.field9155, class389.field5148, 0), true);
                class428.method2445(105);
                class172.method1166((byte) -80, arg2, true, var3, var5, var4);
            }
            try {
                class10.field197 = class651.method3571(class344.field4718.field5449 * 2, class443.field6072, 126, arg0, class230.field3220, class94.field1447);
                if (arg2 != null) {
                    var3.method87(0);
                    class511 var6 = class384.method2238(0, class389.field5148, (byte) -127, class68.field1035);
                    class200 var7 = var3.method389(var6, class500.method2777(class658.field9155, class389.field5148, 0), true);
                    class428.method2445(93);
                    class172.method1166((byte) -101, arg2, true, var3, var7, var6);
                }
                if (class10.field197.method458()) {
                    boolean var8 = true;
                    try {
                        var8 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var13) {
                    }
                    class37 var9;
                    if (var8) {
                        var9 = class10.field197.method406(146800640);
                    } else {
                        var9 = class10.field197.method406(104857600);
                    }
                    class10.field197.method439(var9);
                }
            } catch (Throwable var14) {
                class10.field197 = class651.method3571(0, class443.field6072, 126, 0, class230.field3220, class94.field1447);
                arg0 = 0;
            }
            if (var3 != null) {
                try {
                    var3.method3574(32);
                } catch (Throwable var12) {
                }
            }
        }
        class571.field7587 = arg0;
        class313.method1868(15);
        if (!class10.field197.method424()) {
            class80.field1258 = 1;
        }
        class10.field197.method409(class80.field1258);
        class10.field197.method425(0);
        class10.field197.method377(32);
        class166.field2583 = class10.field197.method466();
        class129.field2152 = class10.field197.method466();
        class515.method2879(-122);
        if (arg1 > -117) {
            return;
        }
        class10.field197.method382(!class344.field4718.field5420);
        if (class10.field197.method431()) {
            class138.method1017((byte) 7, class344.field4718.field5416);
        }
        class124.method965(class34.field530 >> 3, class34.field531 >> 3, class10.field197, -113);
        class661.method3704(true);
        class543.field7145 = true;
        class268.field3740 = false;
        class370.field4997 = null;
    }
}
