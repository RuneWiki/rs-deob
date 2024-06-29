import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class114 implements Runnable {

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field2578 = 0;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "J")
    public static long field2579 = 0L;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lob;")
    public static class99 field2580 = new class99(64);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Lqb;")
    public static class113 field2586;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Laa;")
    public static class2 field2588;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "[I")
    public static int[] field2587;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)I")
    public static final int method924(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 >> 7;
        field2577++;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class82.field1809[1][var4][var5] & 0x2) == 2) {
            var6 = arg1 + 1;
        }
        int var7 = arg0 & 0x7F;
        if (arg3 >= -97) {
            field2587 = null;
        }
        int var8 = arg2 & 0x7F;
        int var9 = (128 - var7) * class142.field3253[var6][var4][var5] + class142.field3253[var6][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * class142.field3253[var6][var4][var5 + 1] + class142.field3253[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZI)Lje;")
    public static final class67 method925(int arg0, boolean arg1, int arg2) {
        field2585++;
        if (arg0 != -1) {
            method926(102, (byte) -83, null, 10);
        }
        return class37.method234(10, 135, arg2, arg1);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBLjava/awt/Component;I)Lbf;")
    public static final class14 method926(int arg0, byte arg1, Component arg2, int arg3) {
        field2584++;
        try {
            Class var4 = Class.forName("gf");
            int var5 = -35 / ((arg1 + 33) / 56);
            class14 var6 = (class14) var4.getDeclaredConstructor().newInstance();
            var6.method100(arg3, -1847869520, arg0, arg2);
            return var6;
        } catch (Throwable var8) {
            class154 var7 = new class154();
            var7.method100(arg3, -1847869520, arg0, arg2);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qc", name = "run", descriptor = "()V")
    public final void run() {
        field2583++;
        try {
            while (true) {
                class4 var1 = class6.field142;
                class98 var2;
                synchronized (class6.field142) {
                    var2 = (class98) class6.field142.method26((byte) -82);
                }
                if (var2 == null) {
                    class104.method822(100, 100L);
                    Object var6 = class85.field1879;
                    synchronized (class85.field1879) {
                        if (class69.field1404 <= 1) {
                            class69.field1404 = 0;
                            class85.field1879.notifyAll();
                            return;
                        }
                        class69.field1404--;
                    }
                } else {
                    if (var2.field2192 == 0) {
                        var2.field2182.method324((byte) -124, var2.field2191.length, var2.field2191, (int) var2.field300);
                        class4 var3 = class6.field142;
                        synchronized (class6.field142) {
                            var2.method115(26851);
                        }
                    } else if (var2.field2192 == 1) {
                        var2.field2191 = var2.field2182.method325((int) var2.field300, 5371);
                        class4 var4 = class6.field142;
                        synchronized (class6.field142) {
                            class133.field2999.method19((byte) -87, var2);
                        }
                    }
                    Object var5 = class85.field1879;
                    synchronized (class85.field1879) {
                        if (class69.field1404 <= 1) {
                            class69.field1404 = 0;
                            class85.field1879.notifyAll();
                            return;
                        }
                        class69.field1404 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class112.method887(-32453, var17, null);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method927(byte arg0) {
        field2586 = null;
        if (arg0 == 106) {
            field2587 = null;
            field2580 = null;
            field2588 = null;
        }
    }
}
