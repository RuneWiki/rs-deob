import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class94 implements Runnable {

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Lr;")
    public static class118 field2226 = class153.method1136(99, "(U");

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field2229 = 0;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Lr;")
    public static class118 field2231 = null;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lr;")
    private static class118 field2230 = class153.method1136(91, "white:");

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Lr;")
    public static class118 field2227 = field2230;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Lr;")
    public static class118 field2232 = class153.method1136(122, ":trade:");

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lr;")
    public static class118 field2224 = field2230;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field2235 = 0;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Lr;")
    public static class118 field2236 = class153.method1136(123, "Versteckt");

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Lna;")
    public static class91 field2223 = new class91(5000);

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field2238 = 0;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field2240 = -1;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Loa;")
    public static class98 field2239;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2237;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "[I")
    public static int[] field2225;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method743(int arg0) {
        field2227 = null;
        field2239 = null;
        int var1 = 122 / ((arg0 - 21) / 57);
        field2230 = null;
        field2224 = null;
        field2237 = null;
        field2232 = null;
        field2231 = null;
        field2225 = null;
        field2236 = null;
        field2226 = null;
        field2223 = null;
    }

    @OriginalMember(owner = "client!nd", name = "run", descriptor = "()V")
    public final void run() {
        field2228++;
        try {
            while (true) {
                class113 var1 = class62.field1432;
                class34 var2;
                synchronized (class62.field1432) {
                    var2 = (class34) class62.field1432.method889(124);
                }
                if (var2 == null) {
                    class139.method1042(-71, 100L);
                    Object var6 = class84.field2020;
                    synchronized (class84.field2020) {
                        if (class35.field874 <= 1) {
                            class35.field874 = 0;
                            class84.field2020.notifyAll();
                            return;
                        }
                        class35.field874--;
                    }
                } else {
                    if (var2.field862 == 0) {
                        var2.field865.method570(var2.field845.length, (int) var2.field2295, 0, var2.field845);
                        class113 var4 = class62.field1432;
                        synchronized (class62.field1432) {
                            var2.method768(-1);
                        }
                    } else if (var2.field862 == 1) {
                        var2.field845 = var2.field865.method564((int) var2.field2295, 6944);
                        class113 var3 = class62.field1432;
                        synchronized (class62.field1432) {
                            class158.field3643.method883(var2, -26866);
                        }
                    }
                    Object var5 = class84.field2020;
                    synchronized (class84.field2020) {
                        if (class35.field874 <= 1) {
                            class35.field874 = 0;
                            class84.field2020.notifyAll();
                            return;
                        }
                        class35.field874 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class23.method212(null, (byte) 96, var17);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)Lr;")
    public static final class118 method744(int arg0, byte arg1) {
        int var2 = 14 % ((arg1 - 6) / 44);
        field2234++;
        return class144.method1066(true, new class118[] { class43.method359(arg0 >> 24 & 0xFF, (byte) -122), class19.field477, class43.method359(arg0 >> 16 & 0xFF, (byte) -122), class19.field477, class43.method359(arg0 >> 8 & 0xFF, (byte) -122), class19.field477, class43.method359(arg0 & 0xFF, (byte) -122) });
    }
}
