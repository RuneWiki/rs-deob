import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class377 {

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    private static int field6106 = 0;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "Z")
    private static boolean field6105 = false;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "Lat;")
    private static class398 field6107 = new class398();

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V")
    public static final synchronized void method3100(byte arg0) {
        while (true) {
            class773 var1 = (class773) field6107.method3219(-21);
            if (var1 == null) {
                if (arg0 != 100) {
                    method3101(3, true);
                    return;
                }
                return;
            }
            var1.field11317.method121(true);
            var1.method4173(arg0 ^ 0xFFFFFF9B);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IZ)V")
    public static final synchronized void method3101(int arg0, boolean arg1) {
        if (arg0 == 0) {
            field6105 = arg1;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V")
    public static final synchronized void method3102(byte arg0) {
        field6106--;
        int var1 = 32 % ((4 - arg0) / 52);
        if (field6106 == 0) {
            method3100((byte) 100);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Le;Z)V")
    public static final synchronized void method3103(class560 arg0, boolean arg1) {
        if (arg1) {
            field6106 = -68;
        }
        if (field6105) {
            return;
        }
        if (field6106 > 0) {
            class773 var2 = new class773();
            var2.field11317 = arg0;
            field6107.method3220(var2, 0);
        } else {
            arg0.method121(false);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
    public static final synchronized void method3104(int arg0) {
        if (arg0 <= -40) {
            field6106++;
        }
    }
}
