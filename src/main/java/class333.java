import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class333 {

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lml;")
    public static class325 field4457 = new class325(7, 7);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Lm;")
    public static class163 field4459;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static final void method2035(boolean arg0) {
        field4456++;
        class116 var1 = null;
        try {
            class382 var2 = class500.field6968.method1840("2", arg0, (byte) 102);
            while (var2.field5134 == 0) {
                class21.method220(0, 1L);
            }
            if (var2.field5134 == 1) {
                var1 = (class116) var2.field5132;
                class11 var3 = new class11(class462.field6478 * 6 + 3);
                var3.method108((byte) -128, 1);
                var3.method84(class462.field6478, (byte) -127);
                for (int var4 = 0; var4 < class77.field1259.length; var4++) {
                    if (class552.field7627[var4]) {
                        var3.method84(var4, (byte) -97);
                        var3.method117(96, class77.field1259[var4]);
                    }
                }
                var1.method818(var3.field165, (byte) -115, var3.field138, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method821(17981);
            }
        } catch (Exception var5) {
        }
        class621.field8932 = class488.method2835(30160);
        class173.field2495 = false;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method2036(int arg0) {
        field4457 = null;
        if (arg0 != 12156) {
            method2036(-11);
        }
        field4459 = null;
    }
}
