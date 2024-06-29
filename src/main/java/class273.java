import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class273 implements Runnable {

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "Lsf;")
    private class398 field4185 = new class398();

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field4186 = new Thread(this);

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "Lpf;")
    public static class425 field4183 = new class425(51, 7);

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "Ljk;")
    public static class119 field4193 = new class119(5000);

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILnr;)V")
    private final void method1702(int arg0, class97 arg1) {
        field4188++;
        class398 var3 = this.field4185;
        synchronized (this.field4185) {
            this.field4185.method2504(arg0 - 26604, arg1);
            if (arg0 != 26646) {
                this.run();
            }
            this.field4185.notify();
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIII)V")
    public static final void method1703(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 73) {
            field4193 = null;
        }
        field4189++;
        class32 var5 = class136.method854(4, (byte) 102, arg2);
        var5.method194(false);
        var5.field400 = arg3;
        var5.field404 = arg0;
        var5.field412 = arg1;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
    public final void method1704(int arg0) {
        field4191++;
        if (this.field4186 == null) {
            return;
        }
        if (arg0 != 0) {
            field4193 = null;
        }
        this.method1702(26646, new class97());
        try {
            this.field4186.join();
        } catch (InterruptedException var2) {
        }
        this.field4186 = null;
    }

    @OriginalMember(owner = "client!ep", name = "run", descriptor = "()V")
    public final void run() {
        field4184++;
        while (true) {
            class398 var1 = this.field4185;
            class26 var3;
            synchronized (this.field4185) {
                class97 var2;
                for (var2 = this.field4185.method2509(false); var2 == null; var2 = this.field4185.method2509(false)) {
                    try {
                        this.field4185.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class26)) {
                    return;
                }
                var3 = (class26) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field328).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field341 = var5;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
    public static void method1705(byte arg0) {
        field4183 = null;
        field4193 = null;
        if (arg0 != -91) {
            field4187 = 0;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILjava/lang/String;)Lae;")
    public final class26 method1706(int arg0, String arg1) {
        field4190++;
        if (this.field4186 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else if (arg0 == 28982) {
            class26 var3 = new class26(arg1);
            this.method1702(26646, var3);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V")
    public class273() {
        this.field4186.setDaemon(true);
        this.field4186.start();
    }
}
