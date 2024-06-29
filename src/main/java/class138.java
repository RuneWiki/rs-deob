import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class138 {

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    private static int field2161 = 0;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Z")
    private static boolean field2162 = false;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Ldm;")
    private static class46 field2163 = new class46();

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V")
    public static final synchronized void method922(boolean arg0, int arg1) {
        int var2 = 103 % ((arg1 - 16) / 58);
        field2162 = arg0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static final synchronized void method923(int arg0) {
        field2161--;
        if (arg0 != 17797) {
            method926(null, 45);
        }
        if (field2161 == 0) {
            method924((byte) 125);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static final synchronized void method924(byte arg0) {
        while (true) {
            class89 var1 = (class89) field2163.method459(3553);
            if (var1 == null) {
                int var2 = -1 / ((arg0 + 18) / 51);
                return;
            }
            var1.field1395.method134(true);
            var1.method1117(0);
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
    public static final synchronized void method925(int arg0) {
        if (arg0 != 0) {
            field2162 = true;
        }
        field2161++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lo;I)V")
    public static final synchronized void method926(class27 arg0, int arg1) {
        if (field2162) {
            return;
        }
        if (field2161 > 0) {
            class89 var2 = new class89();
            var2.field1395 = arg0;
            field2163.method463(var2, -97);
        } else {
            arg0.method134(false);
        }
        if (arg1 != -1) {
            method925(-4);
        }
    }
}
