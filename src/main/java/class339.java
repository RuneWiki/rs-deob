import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class339 extends class87 {

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "Liq;")
    public class227 field4913;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field4911 = new String[100];

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field4915 = 0;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "F")
    public static float field4916;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V", line = 3)
    public static void method2147(byte arg0) {
        field4911 = null;
        if (arg0 <= 104) {
            field4914 = 16;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "()V", line = 18)
    public static final void method2148() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class449.field6282.length; var1++) {
                if (class449.field6282[var1].method2625()) {
                    class190.field2377[var1] = class449.field6282[var1].method2626();
                } else {
                    synchronized (class449.field6282[var1]) {
                        class449.field6282[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class449.field6282[class449.field6282.length - 1].method2624();
                class593.method3464(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class449.field6282.length - 1; var4++) {
                        if (!class449.field6282[var4].method2625()) {
                            synchronized (class449.field6282[var4]) {
                                class449.field6282[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class449.field6282.length - 2; var6++) {
                            class449.field6282[var6].method2624();
                        }
                        class593.method3464(2);
                        while (!class449.field6282[0].method2625()) {
                            synchronized (class449.field6282[0]) {
                                class449.field6282[0].notify();
                            }
                            try {
                                class730.method4066((byte) -45, 1L);
                            } catch (Exception var9) {
                            }
                        }
                        class449.field6282[0].method2624();
                        return;
                    }
                    try {
                        class730.method4066((byte) -45, 1L);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class730.method4066((byte) -45, 1L);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)I", line = 119)
    public static final int method2149(byte arg0) {
        field4912++;
        if (class166.field2118 == 1) {
            return class783.field10753;
        } else {
            int var1 = -21 / ((arg0 + 34) / 59);
            return 0;
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lpq;II[B)V", line = 137)
    public class339(class194 arg0, int arg1, int arg2, byte[] arg3) {
        this.field4913 = class179.method1136(6406, 6406, arg1, false, arg3, arg0, arg2, -25900);
        this.field4913.method2804(false, 10243, false);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 148)
    public static final void method2150(int arg0) {
        if (arg0 != 27536) {
            field4915 = -17;
        }
        field4917++;
        if (class664.field9331 == 9) {
            class285.method1884(true, 5);
        } else if (class664.field9331 == 5 || class664.field9331 == 6) {
            class285.method1884(true, 3);
        } else if (class664.field9331 == 12) {
            class285.method1884(true, 3);
            return;
        }
    }
}
