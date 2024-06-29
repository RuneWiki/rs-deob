import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class103 extends class116 {

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Z")
    public static boolean field2499 = false;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "Lic;")
    private static class59 field2502 = class59.method433(0, "Continue");

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Lic;")
    public static class59 field2498 = class59.method433(0, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!of", name = "z", descriptor = "Lic;")
    public static class59 field2505 = class59.method433(0, "Sprites geladen)3");

    @OriginalMember(owner = "client!of", name = "B", descriptor = "I")
    public static int field2507 = 0;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "Lic;")
    public static class59 field2509 = class59.method433(0, "hitmarks");

    @OriginalMember(owner = "client!of", name = "I", descriptor = "Lic;")
    public static class59 field2513 = class59.method433(0, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!of", name = "F", descriptor = "I")
    public static int field2510 = 0;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "Lic;")
    public static class59 field2501 = field2502;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "Lic;")
    public static class59 field2503 = class59.method433(0, "Art");

    @OriginalMember(owner = "client!of", name = "K", descriptor = "Lic;")
    public static class59 field2515 = class59.method433(0, "<col=40ff00>");

    @OriginalMember(owner = "client!of", name = "G", descriptor = "B")
    public byte field2511;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!of", name = "H", descriptor = "I")
    public int field2512;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "J")
    public static long field2504;

    @OriginalMember(owner = "client!of", name = "D", descriptor = "Lic;")
    public class59 field2508;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "Lmd;")
    public static class87 field2514;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
    public static final void method814(byte arg0) {
        if (arg0 != -123) {
            return;
        }
        field2500++;
        while (true) {
            class83 var1 = class152.field3301;
            class52 var2;
            synchronized (class152.field3301) {
                var2 = (class52) class134.field2972.method691(0);
            }
            if (var2 == null) {
                return;
            }
            var2.field1292.method724(var2.field1293, false, (byte) -11, var2.field1295, (int) var2.field2736);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public static void method815(boolean arg0) {
        field2514 = null;
        field2498 = null;
        field2502 = null;
        if (!arg0) {
            method815(true);
        }
        field2503 = null;
        field2513 = null;
        field2501 = null;
        field2515 = null;
        field2505 = null;
        field2509 = null;
    }
}
