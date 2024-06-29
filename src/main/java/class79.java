import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class79 implements Runnable {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Loa;")
    private static class98 field1726 = class38.method349(255, "Type");

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Loa;")
    public static class98 field1727 = field1726;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Loa;")
    public static class98 field1729 = class38.method349(255, "huffman");

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Loa;")
    private static class98 field1732 = class38.method349(255, "Enter message to send to ");

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Loa;")
    public static class98 field1731 = class38.method349(255, "@gr3@");

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Loa;")
    public static class98 field1725 = field1732;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Li;")
    public static class56 field1728 = new class56();

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Loa;")
    public static class98 field1734 = class38.method349(255, "chatback");

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "[I")
    public static int[] field1733 = new int[5];

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Z")
    public static boolean field1736 = false;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "Loa;")
    private static class98 field1742 = class38.method349(255, "Unexpected server response");

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field1739 = 0;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Loa;")
    public static class98 field1737 = field1742;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Loa;")
    public static class98 field1740 = class38.method349(255, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lmd;")
    public static class87 field1735;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "Lb;")
    public static class8 field1741;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
    public static int[] field1730;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "[I")
    public static int[] field1738;

    @OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
    public final void run() {
        field1724++;
        try {
            while (true) {
                class63 var1 = class53.field1184;
                class117 var2;
                synchronized (class53.field1184) {
                    var2 = (class117) class53.field1184.method512(69);
                }
                if (var2 == null) {
                    class82.method691(100L, (byte) -123);
                    Object var3 = class140.field3420;
                    synchronized (class140.field3420) {
                        if (class8.field141 <= 1) {
                            class8.field141 = 0;
                            class140.field3420.notifyAll();
                            return;
                        }
                        class8.field141--;
                    }
                } else {
                    if (var2.field2609 == 0) {
                        var2.field2621.method1166(-108, var2.field2614.length, var2.field2614, (int) var2.field2729);
                        class63 var4 = class53.field1184;
                        synchronized (class53.field1184) {
                            var2.method975(-12);
                        }
                    } else if (var2.field2609 == 1) {
                        var2.field2614 = var2.field2621.method1164(1338129168, (int) var2.field2729);
                        class63 var5 = class53.field1184;
                        synchronized (class53.field1184) {
                            class19.field426.method508(55, var2);
                        }
                    }
                    Object var6 = class140.field3420;
                    synchronized (class140.field3420) {
                        if (class8.field141 <= 1) {
                            class8.field141 = 0;
                            class140.field3420.notifyAll();
                            return;
                        }
                        class8.field141 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class75.method617(58, null, var17);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method633(int arg0) {
        field1741 = null;
        field1731 = null;
        field1729 = null;
        field1725 = null;
        field1734 = null;
        field1733 = null;
        field1737 = null;
        field1740 = null;
        field1742 = null;
        field1727 = null;
        field1732 = null;
        field1726 = null;
        field1730 = null;
        field1738 = null;
        field1735 = null;
        field1728 = null;
        if (arg0 != 0) {
            field1725 = null;
        }
    }
}
