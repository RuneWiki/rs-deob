import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class209 implements Runnable {

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lqe;")
    private static class179 field3920 = class206.method1380("Invalid loginserver requested)3", (byte) -128);

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lqe;")
    public static class179 field3923 = field3920;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Ldc;")
    public static class36 field3921 = new class36();

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Lqe;")
    private static class179 field3926 = class206.method1380("Too many incorrect logins from your address)3", (byte) -126);

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Lqe;")
    private static class179 field3928 = class206.method1380("Attack", (byte) -20);

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Lqe;")
    public static class179 field3927 = field3928;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Lqe;")
    public static class179 field3929 = field3926;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Lfc;")
    public static class58 field3925;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILeh;)V")
    public static final void method1398(int arg0, class52 arg1) {
        field3922++;
        if (arg0 > -101) {
            method1398(106, null);
        }
        class111.field2089 = arg1;
    }

    @OriginalMember(owner = "client!te", name = "run", descriptor = "()V")
    public final void run() {
        field3924++;
        try {
            while (true) {
                class36 var1 = class111.field2090;
                class127 var2;
                synchronized (class111.field2090) {
                    var2 = (class127) class111.field2090.method242(16711680);
                }
                if (var2 == null) {
                    class137.method873(100L, -967787128);
                    Object var6 = class191.field3565;
                    synchronized (class191.field3565) {
                        if (class120.field2242 <= 1) {
                            class120.field2242 = 0;
                            class191.field3565.notifyAll();
                            return;
                        }
                        class120.field2242--;
                    }
                } else {
                    if (var2.field2316 == 0) {
                        var2.field2325.method81((int) var2.field1694, (byte) -41, var2.field2317, var2.field2317.length);
                        class36 var3 = class111.field2090;
                        synchronized (class111.field2090) {
                            var2.method592((byte) -128);
                        }
                    } else if (var2.field2316 == 1) {
                        var2.field2317 = var2.field2325.method85((int) var2.field1694, -1127279480);
                        class36 var4 = class111.field2090;
                        synchronized (class111.field2090) {
                            class77.field1495.method235(-88, var2);
                        }
                    }
                    Object var5 = class191.field3565;
                    synchronized (class191.field3565) {
                        if (class120.field2242 <= 1) {
                            class120.field2242 = 0;
                            class191.field3565.notifyAll();
                            return;
                        }
                        class120.field2242 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class214.method1406(null, true, var17);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static void method1399(byte arg0) {
        field3920 = null;
        field3921 = null;
        field3926 = null;
        field3929 = null;
        if (arg0 > 93) {
            field3927 = null;
            field3928 = null;
            field3923 = null;
            field3925 = null;
        }
    }
}
