import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class21 implements Runnable {

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Lea;")
    public static class38 field455 = class9.method46((byte) 125, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lea;")
    private static class38 field457 = class9.method46((byte) 117, "Loading)3)3)3");

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lea;")
    private static class38 field456 = class9.method46((byte) 111, "button near the top of that page)3");

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field460 = 0;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Lea;")
    public static class38 field453 = class9.method46((byte) 102, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Lea;")
    public static class38 field461 = field456;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field463 = 0;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lea;")
    public static class38 field464 = field457;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "J")
    public static long field452;

    @OriginalMember(owner = "client!cb", name = "run", descriptor = "()V")
    public final void run() {
        field462++;
        try {
            while (true) {
                class141 var1 = class188.field3756;
                class36 var2;
                synchronized (class188.field3756) {
                    var2 = (class36) class188.field3756.method1020(0);
                }
                if (var2 == null) {
                    class132.method969(100L, (byte) 58);
                    Object var3 = class83.field1970;
                    synchronized (class83.field1970) {
                        if (class139.field2892 <= 1) {
                            class139.field2892 = 0;
                            class83.field1970.notifyAll();
                            return;
                        }
                        class139.field2892--;
                    }
                } else {
                    if (var2.field754 == 0) {
                        var2.field753.method1161(520, (int) var2.field2172, var2.field750, var2.field750.length);
                        class141 var5 = class188.field3756;
                        synchronized (class188.field3756) {
                            var2.method805(false);
                        }
                    } else if (var2.field754 == 1) {
                        var2.field750 = var2.field753.method1160((int) var2.field2172, -128);
                        class141 var4 = class188.field3756;
                        synchronized (class188.field3756) {
                            class63.field1537.method1014((byte) -106, var2);
                        }
                    }
                    Object var6 = class83.field1970;
                    synchronized (class83.field1970) {
                        if (class139.field2892 <= 1) {
                            class139.field2892 = 0;
                            class83.field1970.notifyAll();
                            return;
                        }
                        class139.field2892 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class17.method95(-105, null, var17);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([IZII)I")
    public static final int method129(int[] arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            field453 = null;
        }
        field459++;
        return arg0[1] * arg2 + arg0[0] * arg3;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lbc;Z)V")
    public static final void method130(class13 arg0, boolean arg1) {
        if (arg0.field280 != null) {
            arg0.field280.field3759 = 0;
        }
        field458++;
        arg0.field279 = arg1;
        for (class13 var2 = arg0.method77(); var2 != null; var2 = arg0.method73()) {
            method130(var2, arg1);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method131(int arg0) {
        field453 = null;
        field457 = null;
        field456 = null;
        field455 = null;
        field464 = null;
        int var1 = -109 / ((arg0 - 1) / 43);
        field461 = null;
    }
}
