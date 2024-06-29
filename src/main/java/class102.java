import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class102 implements Runnable {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Lah;")
    public static class22 field1473 = new class22(500);

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Z")
    public static boolean field1476 = false;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "S")
    public static short field1479 = 320;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Lqj;")
    public static class196 field1475 = class80.method502("<)4col>", -48);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lic;")
    public static class134 field1477;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method630(int arg0) {
        field1477 = null;
        field1473 = null;
        field1475 = null;
        if (arg0 != -2608) {
            method630(-98);
        }
    }

    @OriginalMember(owner = "client!qf", name = "run", descriptor = "()V")
    public final void run() {
        field1472++;
        try {
            while (true) {
                class243 var1 = class243.field4323;
                class57 var2;
                synchronized (class243.field4323) {
                    var2 = (class57) class243.field4323.method1651((byte) -110);
                }
                if (var2 == null) {
                    class73.method464((byte) 99, 100L);
                    Object var6 = class20.field230;
                    synchronized (class20.field230) {
                        if (class127.field1800 <= 1) {
                            class127.field1800 = 0;
                            class20.field230.notifyAll();
                            return;
                        }
                        class127.field1800--;
                    }
                } else {
                    if (var2.field761 == 0) {
                        var2.field774.method447((int) var2.field1850, 255, var2.field759.length, var2.field759);
                        class243 var4 = class243.field4323;
                        synchronized (class243.field4323) {
                            var2.method797((byte) 124);
                        }
                    } else if (var2.field761 == 1) {
                        var2.field759 = var2.field774.method444(45, (int) var2.field1850);
                        class243 var3 = class243.field4323;
                        synchronized (class243.field4323) {
                            class1.field4.method1652(26532, var2);
                        }
                    }
                    Object var5 = class20.field230;
                    synchronized (class20.field230) {
                        if (class127.field1800 <= 1) {
                            class127.field1800 = 0;
                            class20.field230.notifyAll();
                            return;
                        }
                        class127.field1800 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class165.method1054(35, null, var17);
        }
    }
}
