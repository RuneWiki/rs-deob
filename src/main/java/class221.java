import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class221 {

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[S")
    public static short[] field3394 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Llc;")
    public static class86 field3397 = new class86();

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3400 = "";

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "[C")
    public static char[] field3398 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field3401 = 0;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3403 = " has logged in.";

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "J")
    public static long field3402 = 0L;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Lgd;")
    public static class76 field3399;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static void method1491(byte arg0) {
        int var1 = 38 / ((-arg0 - 1) / 42);
        field3403 = null;
        field3399 = null;
        field3394 = null;
        field3398 = null;
        field3397 = null;
        field3400 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BII)Lok;")
    public static final class41 method1492(byte arg0, int arg1, int arg2) {
        field3395++;
        class41 var3 = (class41) class261.field4170.method285((long) arg1 | (long) arg2 << 32, 13821);
        if (arg0 != -42) {
            method1492((byte) -110, -57, -14);
        }
        if (var3 == null) {
            var3 = new class41(arg2, arg1);
            class261.field4170.method281(1, var3.field2603, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method1493(byte arg0, String arg1) {
        field3393++;
        int var2 = 10 / ((72 - arg0) / 48);
        int var3 = arg1.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) + class56.method428(arg1.charAt(var5), 125) - var4;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lph;I)V")
    public static final void method1494(class80 arg0, int arg1) {
        field3396++;
        if (arg1 == -14358) {
            class227.field3462 = arg0;
        }
    }
}
