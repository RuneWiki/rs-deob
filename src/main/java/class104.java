import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class104 implements Runnable {

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field2190 = 0;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lo;")
    public static class84 field2189 = class15.method124("Importing maps )2 ", 255);

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Lo;")
    public static class84 field2199 = class15.method124("Error connecting to server)3", 255);

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Lo;")
    public static class84 field2196 = class15.method124(" @lre@", 255);

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field2193 = 0;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "Lo;")
    public static class84 field2201 = class15.method124("Cabbage", 255);

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field2202 = -1;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "Lo;")
    public static class84 field2204 = class15.method124("Login attempts exceeded)3", 255);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "Lud;")
    public static class118 field2203;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "Lad;")
    public static class5 field2197;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
    public static int[] field2185;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 4)
    public static void method775(byte arg0) {
        field2199 = null;
        field2203 = null;
        field2204 = null;
        field2185 = null;
        field2196 = null;
        field2201 = null;
        if (arg0 != -31) {
            field2201 = null;
        }
        field2189 = null;
        field2197 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 49)
    public static final void method776(int arg0) {
        if (arg0 == 100) {
            class27.field495.method742(4);
            field2191++;
        }
    }

    @OriginalMember(owner = "client!s", name = "run", descriptor = "()V", line = 60)
    public final void run() {
        field2186++;
        try {
            while (true) {
                class88 var1 = class25.field421;
                class62 var2;
                synchronized (class25.field421) {
                    var2 = (class62) class25.field421.method695((byte) -116);
                }
                if (var2 == null) {
                    class113.method873(true, 100L);
                    Object var3 = class118.field2597;
                    synchronized (class118.field2597) {
                        if (class85.field1935 <= 1) {
                            class85.field1935 = 0;
                            class118.field2597.notifyAll();
                            return;
                        }
                        class85.field1935--;
                    }
                } else {
                    if (var2.field1289 == 0) {
                        var2.field1292.method126(var2.field1285.length, (int) var2.field731, var2.field1285, false);
                        class88 var4 = class25.field421;
                        synchronized (class25.field421) {
                            var2.method333(0);
                        }
                    } else if (var2.field1289 == 1) {
                        var2.field1285 = var2.field1292.method128((int) var2.field731, 86);
                        class88 var5 = class25.field421;
                        synchronized (class25.field421) {
                            class6.field100.method692((byte) -98, var2);
                        }
                    }
                    Object var6 = class118.field2597;
                    synchronized (class118.field2597) {
                        if (class85.field1935 <= 1) {
                            class85.field1935 = 0;
                            class118.field2597.notifyAll();
                            return;
                        }
                        class85.field1935 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class45.method392((byte) 44, null, var17);
        }
    }
}
