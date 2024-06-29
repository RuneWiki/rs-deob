import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class228 {

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lqk;")
    public static class207 field4183 = class24.method212(255, "Examiner");

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field4181 = 2;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[[B")
    public static byte[][] field4185 = new byte[250][];

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static volatile int field4187 = 0;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Z")
    public static boolean field4189 = false;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "[[B")
    public static byte[][] field4190;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static final void method1624(int arg0) {
        field4184++;
        int var1 = -1;
        if (arg0 != -9028) {
            method1625(114);
        }
        while (class31.field629 > var1) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class10.field149[var1];
            }
            class14 var3 = class169.field2953[var2];
            if (var3 != null) {
                class69.method500(var3, false, var3.method83(true));
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static void method1625(int arg0) {
        field4183 = null;
        if (arg0 != 20591) {
            field4185 = null;
        }
        field4190 = null;
        field4185 = null;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)Z")
    public static final boolean method1626(int arg0) {
        field4182++;
        try {
            if (class221.field4065 == 2) {
                if (class159.field2821 == null) {
                    class159.field2821 = class203.method1406(class88.field1597, class138.field2386, class92.field1636);
                    if (class159.field2821 == null) {
                        return false;
                    }
                }
                if (class286.field5110 == null) {
                    class286.field5110 = new class160(class43.field837, class234.field4309);
                }
                if (class195.field3437.method181(arg0 ^ 0x5641, class36.field690, class159.field2821, class286.field5110, 22050)) {
                    class195.field3437.method198((byte) 125);
                    class195.field3437.method188(class288.field5147, (byte) -31);
                    class195.field3437.method189((byte) -41, class78.field1417, class159.field2821);
                    class159.field2821 = null;
                    class88.field1597 = null;
                    class286.field5110 = null;
                    class221.field4065 = 0;
                    return true;
                }
            }
            if (arg0 != 22050) {
                method1627(-9);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class195.field3437.method209((byte) 121);
            class88.field1597 = null;
            class286.field5110 = null;
            class159.field2821 = null;
            class221.field4065 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)I")
    public static final int method1627(int arg0) {
        field4188++;
        if ((double) class108.field1913 == 3.0D) {
            return 37;
        } else if ((double) class108.field1913 == 4.0D) {
            return 50;
        } else if ((double) class108.field1913 == 6.0D) {
            return 75;
        } else if ((double) class108.field1913 == 8.0D) {
            return 100;
        } else {
            if (arg0 >= -102) {
                method1625(-15);
            }
            return 200;
        }
    }
}
