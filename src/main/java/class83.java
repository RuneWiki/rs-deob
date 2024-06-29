import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class83 implements Runnable {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lcd;")
    public static class19 field1769 = new class19();

    @OriginalMember(owner = "client!m", name = "e", descriptor = "[Z")
    public static boolean[] field1770 = new boolean[100];

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lpe;")
    public static class109 field1771 = class141.method1120("oder benutzen Sie eine andere Welt)3", 0);

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field1772 = 0;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field1774 = 0;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "[[[I")
    public static int[][][] field1775 = new int[4][105][105];

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILna;Lna;)V")
    public static final void method707(int arg0, class91 arg1, class91 arg2) {
        class38.field836 = arg2;
        class20.field511 = arg1;
        if (arg0 == 21401) {
            field1768++;
        }
    }

    @OriginalMember(owner = "client!m", name = "run", descriptor = "()V")
    public final void run() {
        field1767++;
        try {
            while (true) {
                class19 var1 = class11.field244;
                class134 var2;
                synchronized (class11.field244) {
                    var2 = (class134) class11.field244.method195((byte) 108);
                }
                if (var2 == null) {
                    class99.method797(100L, false);
                    Object var3 = class12.field270;
                    synchronized (class12.field270) {
                        if (class141.field3068 <= 1) {
                            class141.field3068 = 0;
                            class12.field270.notifyAll();
                            return;
                        }
                        class141.field3068--;
                    }
                } else {
                    if (var2.field2915 == 0) {
                        var2.field2925.method366(true, var2.field2923, var2.field2923.length, (int) var2.field267);
                        class19 var5 = class11.field244;
                        synchronized (class11.field244) {
                            var2.method101((byte) 126);
                        }
                    } else if (var2.field2915 == 1) {
                        var2.field2923 = var2.field2925.method367((int) var2.field267, -1119134904);
                        class19 var4 = class11.field244;
                        synchronized (class11.field244) {
                            class88.field1863.method188(-2, var2);
                        }
                    }
                    Object var6 = class12.field270;
                    synchronized (class12.field270) {
                        if (class141.field3068 <= 1) {
                            class141.field3068 = 0;
                            class12.field270.notifyAll();
                            return;
                        }
                        class141.field3068 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class112.method921(null, false, var17);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method708(int arg0) {
        field1770 = null;
        field1769 = null;
        if (arg0 != -14215) {
            method708(59);
        }
        field1771 = null;
        field1775 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZI)Lpe;")
    public static final class109 method709(int arg0, int arg1, boolean arg2, int arg3) {
        field1773++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var4 = 1;
        int var5 = arg1 / arg0;
        while (var5 != 0) {
            var5 /= arg0;
            var4++;
        }
        if (arg3 != 18303) {
            return null;
        }
        int var6 = var4;
        if (arg1 < 0 || arg2) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg1 % arg0;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
            arg1 /= arg0;
        }
        class109 var9 = new class109();
        var9.field2295 = var6;
        var9.field2279 = var7;
        return var9;
    }
}
