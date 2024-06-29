import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class79 implements Runnable {

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "[Lod;")
    public static class101[] field1653 = new class101[100];

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1652 = 0;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Lod;")
    private static class101 field1650 = class46.method335(-121, "Could not complete login)3");

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field1654 = -1;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lod;")
    public static class101 field1651 = class46.method335(-79, "Bitte geben Sie Ihren Benutzenamen ein)3");

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Lod;")
    public static class101 field1657 = field1650;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lod;")
    private static class101 field1658 = class46.method335(127, "shake:");

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lod;")
    private static class101 field1656 = class46.method335(-128, "New User");

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Lod;")
    public static class101 field1663 = field1658;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1660 = 0;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Lod;")
    public static class101 field1662 = field1656;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
    public static boolean field1659 = false;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Lod;")
    public static class101 field1665 = field1658;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Lod;")
    public static class101 field1666 = class46.method335(72, "<)4col>");

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Loe;")
    public static class102 field1664;

    @OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
    public final void run() {
        field1661++;
        try {
            while (true) {
                class78 var1 = class41.field983;
                class83 var2;
                synchronized (class41.field983) {
                    var2 = (class83) class41.field983.method523(false);
                }
                if (var2 == null) {
                    class127.method981((byte) -86, 100L);
                    Object var6 = class90.field1955;
                    synchronized (class90.field1955) {
                        if (class35.field898 <= 1) {
                            class35.field898 = 0;
                            class90.field1955.notifyAll();
                            return;
                        }
                        class35.field898--;
                    }
                } else {
                    if (var2.field1818 == 0) {
                        var2.field1813.method672((int) var2.field2723, -26096, var2.field1810.length, var2.field1810);
                        class78 var4 = class41.field983;
                        synchronized (class41.field983) {
                            var2.method959(11835);
                        }
                    } else if (var2.field1818 == 1) {
                        var2.field1810 = var2.field1813.method669((int) var2.field2723, false);
                        class78 var3 = class41.field983;
                        synchronized (class41.field983) {
                            class27.field712.method529(var2, 19002);
                        }
                    }
                    Object var5 = class90.field1955;
                    synchronized (class90.field1955) {
                        if (class35.field898 <= 1) {
                            class35.field898 = 0;
                            class90.field1955.notifyAll();
                            return;
                        }
                        class35.field898 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class142.method1130(null, var17, 7565);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method537(int arg0) {
        field1663 = null;
        field1650 = null;
        field1656 = null;
        field1651 = null;
        field1653 = null;
        field1664 = null;
        if (arg0 > -67) {
            field1663 = null;
        }
        field1662 = null;
        field1666 = null;
        field1657 = null;
        field1658 = null;
        field1665 = null;
    }
}
