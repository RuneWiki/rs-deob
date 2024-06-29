import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 implements Runnable {

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Lkc;")
    public static class63 field85 = new class63(64);

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lmc;")
    public static class75 field88 = class30.method234(true, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field89 = 0;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field93 = 0;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Lmc;")
    public static class75 field92 = class30.method234(true, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Lmc;")
    private static class75 field94 = class30.method234(true, "Unable to connect)3");

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Lmc;")
    public static class75 field91 = field94;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Lmc;")
    public static class75 field90 = field94;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 27)
    public static void method28(int arg0) {
        field90 = null;
        field92 = null;
        field94 = null;
        if (arg0 == 0) {
            field85 = null;
            field91 = null;
            field88 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "run", descriptor = "()V", line = 42)
    public final void run() {
        field84++;
        try {
            while (true) {
                class32 var1 = class88.field2169;
                class65 var2;
                synchronized (class88.field2169) {
                    var2 = (class65) class88.field2169.method248(32);
                }
                if (var2 == null) {
                    class13.method86(100L, 1);
                    Object var6 = class74.field1831;
                    synchronized (class74.field1831) {
                        if (class76.field1942 <= 1) {
                            class76.field1942 = 0;
                            class74.field1831.notifyAll();
                            return;
                        }
                        class76.field1942--;
                    }
                } else {
                    if (var2.field1711 == 0) {
                        var2.field1706.method81((int) var2.field1765, var2.field1709, (byte) 106, var2.field1709.length);
                        class32 var3 = class88.field2169;
                        synchronized (class88.field2169) {
                            var2.method589(true);
                        }
                    } else if (var2.field1711 == 1) {
                        var2.field1709 = var2.field1706.method83(0, (int) var2.field1765);
                        class32 var4 = class88.field2169;
                        synchronized (class88.field2169) {
                            class23.field442.method245(var2, 0);
                        }
                    }
                    Object var5 = class74.field1831;
                    synchronized (class74.field1831) {
                        if (class76.field1942 <= 1) {
                            class76.field1942 = 0;
                            class74.field1831.notifyAll();
                            return;
                        }
                        class76.field1942 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class114.method918(12541, null, var17);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Lmc;", line = 129)
    public static final class75 method29(int arg0, int arg1) {
        class75 var2 = new class75();
        field86++;
        int var3 = -110 % ((arg1 - 44) / 54);
        var2.field1912 = new byte[arg0];
        var2.field1869 = 0;
        return var2;
    }
}
