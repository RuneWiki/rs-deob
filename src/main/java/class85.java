import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class85 implements Runnable {

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1610 = 0;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Lkh;")
    public static class117 field1612 = class224.method1450((byte) -33, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1613 = 0;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1608;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)I")
    public static final int method593(boolean arg0, int arg1) {
        if (!arg0) {
            method594((byte) 31);
        }
        field1607++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!hh", name = "run", descriptor = "()V")
    public final void run() {
        field1611++;
        try {
            while (true) {
                class36 var1 = class55.field1118;
                class185 var2;
                synchronized (class55.field1118) {
                    var2 = (class185) class55.field1118.method314((byte) -26);
                }
                if (var2 == null) {
                    class165.method1167(-22942, 100L);
                    Object var6 = class146.field2680;
                    synchronized (class146.field2680) {
                        if (class244.field4506 <= 1) {
                            class244.field4506 = 0;
                            class146.field2680.notifyAll();
                            return;
                        }
                        class244.field4506--;
                    }
                } else {
                    if (var2.field3327 == 0) {
                        var2.field3322.method1348(var2.field3321, (int) var2.field389, 16711680, var2.field3321.length);
                        class36 var4 = class55.field1118;
                        synchronized (class55.field1118) {
                            var2.method123((byte) -126);
                        }
                    } else if (var2.field3327 == 1) {
                        var2.field3321 = var2.field3322.method1352(6, (int) var2.field389);
                        class36 var3 = class55.field1118;
                        synchronized (class55.field1118) {
                            class111.field2077.method325(126, var2);
                        }
                    }
                    Object var5 = class146.field2680;
                    synchronized (class146.field2680) {
                        if (class244.field4506 <= 1) {
                            class244.field4506 = 0;
                            class146.field2680.notifyAll();
                            return;
                        }
                        class244.field4506 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class147.method1055(6678, null, var17);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method594(byte arg0) {
        field1608 = null;
        int var1 = 78 % ((arg0 - 35) / 40);
        field1612 = null;
    }
}
