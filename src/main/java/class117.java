import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class117 implements Runnable {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field2110 = 0;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Ltg;")
    private static class184 field2111 = class135.method812("K", 3);

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Ltg;")
    public static class184 field2114 = field2111;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Ltg;")
    public static class184 field2115 = field2111;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Lh;")
    public static class69 field2113 = new class69();

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Ltg;")
    private static class184 field2116 = class135.method812("Password: ", 3);

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Z")
    public static boolean field2121 = false;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field2120 = 0;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "[J")
    public static long[] field2117 = new long[32];

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Ltg;")
    public static class184 field2123 = field2116;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Lbg;")
    public static class17 field2122 = new class17(5000);

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Ltg;")
    public static class184 field2125 = class135.method812("swe", 3);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Lud;")
    public static class190 field2124;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Lk;")
    public static class96 field2119;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)J")
    public static final long method713(int arg0, int arg1, int arg2) {
        class90 var3 = class190.field3704[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1680; var4++) {
            class164 var5 = var3.field1686[var4];
            if ((var5.field2934 >> 29 & 0x3L) == 2L && var5.field2954 == arg1 && var5.field2945 == arg2) {
                return var5.field2934;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method714(int arg0) {
        if (arg0 != 5422) {
            return;
        }
        field2115 = null;
        field2117 = null;
        field2119 = null;
        field2114 = null;
        field2122 = null;
        field2116 = null;
        field2111 = null;
        field2113 = null;
        field2123 = null;
        field2124 = null;
        field2125 = null;
    }

    @OriginalMember(owner = "client!mc", name = "run", descriptor = "()V")
    public final void run() {
        field2112++;
        try {
            while (true) {
                class69 var1 = class157.field2806;
                class15 var2;
                synchronized (class157.field2806) {
                    var2 = (class15) class157.field2806.method404(false);
                }
                if (var2 == null) {
                    class151.method926((byte) 101, 100L);
                    Object var3 = class186.field3590;
                    synchronized (class186.field3590) {
                        if (class13.field242 <= 1) {
                            class13.field242 = 0;
                            class186.field3590.notifyAll();
                            return;
                        }
                        class13.field242--;
                    }
                } else {
                    if (var2.field292 == 0) {
                        var2.field281.method879((int) var2.field2393, var2.field289, var2.field289.length, -1);
                        class69 var4 = class157.field2806;
                        synchronized (class157.field2806) {
                            var2.method797((byte) -128);
                        }
                    } else if (var2.field292 == 1) {
                        var2.field289 = var2.field281.method876(-119, (int) var2.field2393);
                        class69 var5 = class157.field2806;
                        synchronized (class157.field2806) {
                            field2113.method402(16777215, var2);
                        }
                    }
                    Object var6 = class186.field3590;
                    synchronized (class186.field3590) {
                        if (class13.field242 <= 1) {
                            class13.field242 = 0;
                            class186.field3590.notifyAll();
                            return;
                        }
                        class13.field242 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class5.method38((byte) -31, null, var17);
        }
    }
}
