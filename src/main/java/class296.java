import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class296 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "Le;")
    public static class312 field4710;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1997(int arg0) {
        if (arg0 != -3660) {
            method1997(30);
        }
        if (class284.field4547 != null) {
            class449.field6542.method2439(-120);
            class190.method1334();
            class257.method1780(true);
            class56.method370((byte) -124);
            class417.method2602(arg0 + 3662);
            class380.method2420(arg0 + 3634);
            if (class221.field3677 != null) {
                class221.field3677.method1820(-110);
            }
            class131.method961((byte) -67);
            class346.method2261(15);
            class134.method986(true);
            class375.method2396(9712, false);
            class326.method2164(1009);
            for (int var1 = 0; var1 < 2048; var1++) {
                class219 var5 = class216.field3517[var1];
                if (var5 != null) {
                    var5.field1904 = null;
                    for (int var6 = 0; var6 < var5.field1918.length; var6++) {
                        var5.field1918[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class39.field499.length; var2++) {
                class50 var3 = class39.field499[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1918.length; var4++) {
                        var3.field1918[var4] = null;
                    }
                }
            }
            class284.field4547.method2091(arg0 - 11341);
            class284.field4547 = null;
        }
        field4713++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Ltg;", line = 81)
    public static final class125 method1998(int arg0, int arg1) {
        field4711++;
        class125 var2 = (class125) class224.field3736.method331((byte) 69, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class402.field5990.method2771(31, arg1, 3);
        class125 var4 = new class125();
        if (arg0 > -76) {
            return null;
        }
        if (var3 != null) {
            var4.method921((byte) -118, new class186(var3), arg1);
        }
        class224.field3736.method341(119, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 106)
    public static void method1999(byte arg0) {
        field4710 = null;
        if (arg0 != -47) {
            field4710 = null;
        }
    }
}
