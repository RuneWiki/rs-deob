import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class77 implements Runnable {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lgd;")
    public static class44 field1820 = new class44(64);

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Lkc;")
    private static class67 field1827 = class19.method144("Connection lost", 123);

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "Lkc;")
    private static class67 field1834 = class19.method144("Loaded update list", 81);

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field1825 = 0;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Lkc;")
    public static class67 field1829 = field1834;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lkc;")
    public static class67 field1826 = class19.method144("Entfernen", 73);

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "Lkc;")
    public static class67 field1833 = field1827;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field1836 = 0;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field1832 = 0;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lkc;")
    public static class67 field1824 = class19.method144("scrollbar", 87);

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Lkc;")
    public static class67 field1837 = class19.method144("backbase1", 113);

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "Lkc;")
    public static class67 field1838 = class19.method144("scrollen:", 75);

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "Lkc;")
    private static class67 field1839 = class19.method144("flash1:", 85);

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Lkc;")
    private static class67 field1835 = class19.method144("To", 106);

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lkc;")
    public static class67 field1823 = field1839;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lkc;")
    public static class67 field1822 = field1835;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public static int field1840 = 1;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "[I")
    public static int[] field1830;

    @OriginalMember(owner = "client!ma", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        field1828++;
        try {
            while (true) {
                class10 var1 = class58.field1369;
                class38 var2;
                synchronized (class58.field1369) {
                    var2 = (class38) class58.field1369.method83(64);
                }
                if (var2 == null) {
                    class84.method653(100L, (byte) 124);
                    Object var6 = class76.field1814;
                    synchronized (class76.field1814) {
                        if (class60.field1412 <= 1) {
                            class60.field1412 = 0;
                            class76.field1814.notifyAll();
                            return;
                        }
                        class60.field1412--;
                    }
                } else {
                    if (var2.field872 == 0) {
                        var2.field869.method121((int) var2.field22, var2.field884.length, var2.field884, 118);
                        class10 var4 = class58.field1369;
                        synchronized (class58.field1369) {
                            var2.method13(116);
                        }
                    } else if (var2.field872 == 1) {
                        var2.field884 = var2.field869.method117(false, (int) var2.field22);
                        class10 var3 = class58.field1369;
                        synchronized (class58.field1369) {
                            class128.field2987.method95((byte) 120, var2);
                        }
                    }
                    Object var5 = class76.field1814;
                    synchronized (class76.field1814) {
                        if (class60.field1412 <= 1) {
                            class60.field1412 = 0;
                            class76.field1814.notifyAll();
                            return;
                        }
                        class60.field1412 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class109.method832(113, var17, null);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILib;)V", line = 82)
    public static final void method619(int arg0, class54 arg1) {
        int var2 = 0;
        field1821++;
        if (arg0 <= 81) {
            field1826 = null;
        }
        if (arg1.field1299 == 0) {
            var2 = class103.field2332.method879(arg1.field1309, arg1.field1287, arg1.field1294);
        }
        int var3 = -1;
        if (arg1.field1299 == 1) {
            var2 = class103.field2332.method906(arg1.field1309, arg1.field1287, arg1.field1294);
        }
        if (arg1.field1299 == 2) {
            var2 = class103.field2332.method871(arg1.field1309, arg1.field1287, arg1.field1294);
        }
        int var4 = 0;
        int var5 = 0;
        if (arg1.field1299 == 3) {
            var2 = class103.field2332.method882(arg1.field1309, arg1.field1287, arg1.field1294);
        }
        if (var2 != 0) {
            var3 = var2 >> 14 & 0x7FFF;
            int var6 = class103.field2332.method868(arg1.field1309, arg1.field1287, arg1.field1294, var2);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg1.field1296 = var4;
        arg1.field1303 = var5;
        arg1.field1308 = var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 136)
    public static void method620(int arg0) {
        field1837 = null;
        if (arg0 != 0) {
            method619(-38, null);
        }
        field1839 = null;
        field1822 = null;
        field1829 = null;
        field1835 = null;
        field1834 = null;
        field1823 = null;
        field1826 = null;
        field1838 = null;
        field1833 = null;
        field1824 = null;
        field1820 = null;
        field1830 = null;
        field1827 = null;
    }
}
