import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class27 {

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "J")
    public static long field566 = 0L;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Loc;")
    private static class151 field572 = class137.method873(2, "K");

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Loc;")
    public static class151 field569 = field572;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Loc;")
    public static class151 field571 = class137.method873(2, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Loc;")
    private static class151 field570 = class137.method873(2, "Checking for updates )2 ");

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "[J")
    public static long[] field578 = new long[32];

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "Loc;")
    private static class151 field577 = class137.method873(2, "Error connecting to server)3");

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Loc;")
    public static class151 field579 = field577;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Loc;")
    public static class151 field575 = field570;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "Loc;")
    private static class151 field584 = class137.method873(2, "Loaded wordpack");

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Loc;")
    public static class151 field582 = field572;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Loc;")
    public static class151 field565 = field584;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Luc;")
    public static class211 field564 = new class211(64);

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLwd;)V")
    public static final void method208(boolean arg0, class232 arg1) {
        field583++;
        if (arg0 && class21.field458 == arg1.field4175) {
            class224.field3911[arg1.field4264] = true;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Loc;BLwd;)Loc;")
    public static final class151 method209(class151 arg0, byte arg1, class232 arg2) {
        if (arg0.method990(class78.field1509, (byte) 54) != -1) {
            label62: while (true) {
                int var3 = arg0.method990(class21.field471, (byte) 54);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method990(class36.field749, (byte) 89);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method990(class185.field3318, (byte) 42);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method990(class192.field3417, (byte) 92);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method990(class210.field3681, (byte) 122);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method990(class99.field1781, (byte) 101);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class151 var9 = class134.field2441;
                                                        if (class48.field994 != null) {
                                                            var9 = class63.method427(class48.field994.field1506, -4871);
                                                            try {
                                                                if (class48.field994.field1503 != null) {
                                                                    byte[] var10 = ((String) class48.field994.field1503).getBytes("ISO-8859-1");
                                                                    var9 = class210.method1307(0, var10.length, var10, (byte) -104);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg0 = class126.method761(new class151[] { arg0.method987((byte) 123, var8, 0), var9, arg0.method989(var8 + 4, (byte) -62) }, 10260);
                                                    }
                                                }
                                                arg0 = class126.method761(new class151[] { arg0.method987((byte) 122, var7, 0), class175.method1122(true, class212.method1327(999999999, 4, arg2)), arg0.method989(var7 + 2, (byte) -62) }, 10260);
                                            }
                                        }
                                        arg0 = class126.method761(new class151[] { arg0.method987((byte) 123, var6, 0), class175.method1122(true, class212.method1327(999999999, 3, arg2)), arg0.method989(var6 + 2, (byte) -62) }, 10260);
                                    }
                                }
                                arg0 = class126.method761(new class151[] { arg0.method987((byte) 125, var5, 0), class175.method1122(true, class212.method1327(999999999, 2, arg2)), arg0.method989(var5 + 2, (byte) -62) }, 10260);
                            }
                        }
                        arg0 = class126.method761(new class151[] { arg0.method987((byte) 118, var4, 0), class175.method1122(true, class212.method1327(999999999, 1, arg2)), arg0.method989(var4 + 2, (byte) -62) }, 10260);
                    }
                }
                arg0 = class126.method761(new class151[] { arg0.method987((byte) 120, var3, 0), class175.method1122(true, class212.method1327(999999999, 0, arg2)), arg0.method989(var3 + 2, (byte) -62) }, 10260);
            }
        }
        field567++;
        if (arg1 >= -119) {
            method209(null, (byte) 103, null);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method210(int arg0) {
        field570 = null;
        field578 = null;
        field579 = null;
        field571 = null;
        field572 = null;
        if (arg0 != 32) {
            return;
        }
        field565 = null;
        field582 = null;
        field584 = null;
        field564 = null;
        field575 = null;
        field569 = null;
        field577 = null;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class27() {
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lcd;)V")
    public class27(class27 arg0) {
        this.field576 = arg0.field576;
        this.field574 = arg0.field574;
        this.field580 = arg0.field580;
        this.field568 = arg0.field568;
    }
}
