import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class192 implements Runnable {

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "[I")
    public static int[] field3582 = new int[2000];

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "[I")
    public static int[] field3580 = new int[4096];

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "[I")
    public static int[] field3584;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Z")
    public static boolean field3589;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "Lkg;")
    public static class115 field3588;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "Lmb;")
    public static class132 field3591;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3590;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "Lmb;")
    private static class132 field3593;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "Lmb;")
    public static class132 field3594;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "Lne;")
    public static class146 field3592;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "Loc;")
    public static class155 field3581;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lpb;IIZZII)V")
    public static final void method1226(class165 arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        class52.field881 = arg1;
        class55.field940 = arg2;
        class88.field1545 = arg5;
        class45.field785 = arg3;
        class65.field1065 = arg6;
        field3577++;
        class25.field405 = arg0;
        if (arg4) {
            class39.field633 = 1;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static final void method1227(int arg0) {
        if (arg0 >= 68) {
            class130.field2409.method778((byte) 122);
            field3579++;
        }
    }

    @OriginalMember(owner = "client!rh", name = "run", descriptor = "()V")
    public final void run() {
        field3578++;
        try {
            while (true) {
                class19 var1 = class128.field2370;
                class231 var2;
                synchronized (class128.field2370) {
                    var2 = (class231) class128.field2370.method119(true);
                }
                if (var2 == null) {
                    class130.method856(1, 100L);
                    Object var3 = class131.field2416;
                    synchronized (class131.field2416) {
                        if (class241.field4327 <= 1) {
                            class241.field4327 = 0;
                            class131.field2416.notifyAll();
                            return;
                        }
                        class241.field4327--;
                    }
                } else {
                    if (var2.field4161 == 0) {
                        var2.field4160.method1337((int) var2.field2760, var2.field4157.length, var2.field4157, -39);
                        class19 var5 = class128.field2370;
                        synchronized (class128.field2370) {
                            var2.method995((byte) -43);
                        }
                    } else if (var2.field4161 == 1) {
                        var2.field4157 = var2.field4160.method1332((byte) -90, (int) var2.field2760);
                        class19 var4 = class128.field2370;
                        synchronized (class128.field2370) {
                            class163.field2946.method120(0, var2);
                        }
                    }
                    Object var6 = class131.field2416;
                    synchronized (class131.field2416) {
                        if (class241.field4327 <= 1) {
                            class241.field4327 = 0;
                            class131.field2416.notifyAll();
                            return;
                        }
                        class241.field4327 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class92.method571(null, var17, 78);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public static void method1228(int arg0) {
        field3581 = null;
        field3594 = null;
        field3584 = null;
        field3591 = null;
        if (arg0 >= -18) {
            field3581 = null;
        }
        field3580 = null;
        field3588 = null;
        field3592 = null;
        field3590 = null;
        field3593 = null;
        field3582 = null;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3580[var0] = class9.method46(var0, -14189);
        }
        field3584 = new int[5];
        field3589 = true;
        field3587 = 0;
        field3588 = new class115(64);
        field3591 = class166.method1092("Neuer Benutzer", 119);
        field3590 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field3593 = class166.method1092("Discard", 119);
        field3594 = field3593;
    }
}
