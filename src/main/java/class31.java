import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class31 implements Runnable {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "Lob;")
    public static class154 field495 = new class154(512);

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "Li;")
    public static class88 field502 = class208.method1425(105, "<col=ffb000>");

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "Li;")
    private static class88 field504 = class208.method1425(105, "Prepared sound engine");

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Li;")
    public static class88 field507 = field504;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Lae;")
    public static class6 field501 = new class6(5000);

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "Li;")
    public static class88 field508 = class208.method1425(105, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "Li;")
    public static class88 field509 = class208.method1425(105, "<br>(X");

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "Lnb;")
    public static class144 field506;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "Lpg;")
    public static class170 field503;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "[Lpf;")
    public static class169[] field505;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method200(int arg0) {
        field505 = null;
        field502 = null;
        field495 = null;
        field504 = null;
        field506 = null;
        field507 = null;
        field501 = null;
        field508 = null;
        field503 = null;
        if (arg0 != -7524) {
            field495 = null;
        }
        field509 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Z")
    public static final boolean method201(int arg0, int arg1) {
        field499++;
        if (arg1 != 29186) {
            field509 = null;
        }
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)I")
    public static final int method202(int arg0, int arg1, int arg2) {
        if (arg0 != 12345678) {
            method200(118);
        }
        field496++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ch", name = "run", descriptor = "()V")
    public final void run() {
        field497++;
        try {
            while (true) {
                class248 var1 = class227.field4254;
                class90 var2;
                synchronized (class227.field4254) {
                    var2 = (class90) class227.field4254.method1612(false);
                }
                if (var2 == null) {
                    class21.method98(100L, (byte) 38);
                    Object var6 = class33.field533;
                    synchronized (class33.field533) {
                        if (class225.field4233 <= 1) {
                            class225.field4233 = 0;
                            class33.field533.notifyAll();
                            return;
                        }
                        class225.field4233--;
                    }
                } else {
                    if (var2.field1702 == 0) {
                        var2.field1714.method1500(var2.field1706, 4, (int) var2.field1219, var2.field1706.length);
                        class248 var3 = class227.field4254;
                        synchronized (class227.field4254) {
                            var2.method460(true);
                        }
                    } else if (var2.field1702 == 1) {
                        var2.field1706 = var2.field1714.method1499((int) var2.field1219, (byte) -116);
                        class248 var4 = class227.field4254;
                        synchronized (class227.field4254) {
                            class131.field2463.method1624(var2, 110);
                        }
                    }
                    Object var5 = class33.field533;
                    synchronized (class33.field533) {
                        if (class225.field4233 <= 1) {
                            class225.field4233 = 0;
                            class33.field533.notifyAll();
                            return;
                        }
                        class225.field4233 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class221.method1490((byte) 0, null, var17);
        }
    }
}
