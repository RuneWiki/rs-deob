import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class77 implements Runnable {

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "[Lfb;")
    public static class53[] field1597 = new class53[50];

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field1596 = 0;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "[I")
    public static int[] field1601 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "Ljd;")
    public static class92 field1604 = class202.method1325((byte) 90, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "[I")
    public static int[] field1599 = new int[] { 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, -2, -2, 0, 0, 0, 0, 6, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 6, 0, 0, 5, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 3, -2, 0, 12, 6, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, -2, 0, 6, 0, 0, 0, 0, 6, 0, 0, 5, 20, 0, 0, 0, 0, 0, 0, 0, 4, -2, -2, 7, 10, -2, -2, 6, 0, 0, 0, 0, 0, -2, 0, 0, -1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 6, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 10, 6, 0, 1, 0, 0, 1, 4, 4, 0, 2, 0, 14, 4, 0, 3, 0, -1, 0, 0, 0, 0, 0, 0, 4, -2, 7, 1, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 2, -1, 2, -1, 0, 0, 0, 0, -1, 0, 0, 0, 24, 0, 2, 0, 6, 0, 0, -2, 7, 0, 0, 0, -1, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -1, 3, 0, 0, 0, 0, -2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public static int field1606 = 1;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "Ljd;")
    public static class92 field1603 = class202.method1325((byte) 90, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Ljd;")
    private static class92 field1600 = class202.method1325((byte) 90, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "Z")
    public static boolean field1607 = false;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Ljd;")
    public static class92 field1594 = field1600;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "Ljd;")
    public static class92 field1608 = class202.method1325((byte) 90, "Welt");

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "Lid;")
    public static class84 field1605;

    @OriginalMember(owner = "client!hg", name = "run", descriptor = "()V")
    public final void run() {
        field1595++;
        try {
            while (true) {
                class18 var1 = class189.field3595;
                class150 var2;
                synchronized (class189.field3595) {
                    var2 = (class150) class189.field3595.method103(57);
                }
                if (var2 == null) {
                    class58.method357(-24534, 100L);
                    Object var6 = class138.field2762;
                    synchronized (class138.field2762) {
                        if (class31.field701 <= 1) {
                            class31.field701 = 0;
                            class138.field2762.notifyAll();
                            return;
                        }
                        class31.field701--;
                    }
                } else {
                    if (var2.field2970 == 0) {
                        var2.field2975.method746(true, var2.field2974, var2.field2974.length, (int) var2.field4079);
                        class18 var3 = class189.field3595;
                        synchronized (class189.field3595) {
                            var2.method1370(122);
                        }
                    } else if (var2.field2970 == 1) {
                        var2.field2974 = var2.field2975.method742(true, (int) var2.field4079);
                        class18 var4 = class189.field3595;
                        synchronized (class189.field3595) {
                            class209.field4006.method101(var2, (byte) 34);
                        }
                    }
                    Object var5 = class138.field2762;
                    synchronized (class138.field2762) {
                        if (class31.field701 <= 1) {
                            class31.field701 = 0;
                            class138.field2762.notifyAll();
                            return;
                        }
                        class31.field701 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class164.method1059(null, var17, 92);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static void method526(int arg0) {
        field1594 = null;
        field1601 = null;
        field1608 = null;
        field1597 = null;
        field1604 = null;
        if (arg0 < 2) {
            method528(false);
        }
        field1600 = null;
        field1599 = null;
        field1605 = null;
        field1603 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Z")
    public static final boolean method527(int arg0, int arg1) {
        field1602++;
        int var2 = -67 / ((arg0 - 19) / 61);
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
    public static final void method528(boolean arg0) {
        for (int var1 = -1; var1 < class140.field2811; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class190.field3678[var1];
            }
            class91 var3 = class172.field3347[var2];
            if (var3 != null) {
                class49.method301(var3, (byte) -113, 1);
            }
        }
        field1598++;
        if (!arg0) {
            method528(false);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[Ljd;)Ljd;")
    public static final class92 method529(int arg0, class92[] arg1) {
        field1593++;
        if (arg0 < ~arg1.length) {
            throw new IllegalArgumentException();
        }
        return class129.method854(54, arg1.length, arg1, 0);
    }
}
