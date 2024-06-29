import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class426 implements Runnable {

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "Ltu;")
    private class7 field5844 = new class7();

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field5842 = new Thread(this);

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Lhb;")
    public static class250 field5846 = new class250(34, -1);

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "[I")
    public static int[] field5852 = new int[32];

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "Lhb;")
    public static class250 field5851 = new class250(48, 6);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/String;I)Luq;")
    public final class246 method2518(String arg0, int arg1) {
        field5843++;
        if (this.field5842 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else if (arg1 < 109) {
            return null;
        } else {
            class246 var3 = new class246(arg0);
            this.method2522((byte) 110, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ek", name = "run", descriptor = "()V")
    public final void run() {
        field5849++;
        while (true) {
            class7 var1 = this.field5844;
            class246 var3;
            synchronized (this.field5844) {
                class508 var2;
                for (var2 = this.field5844.method52((byte) -108); var2 == null; var2 = this.field5844.method52((byte) -99)) {
                    try {
                        this.field5844.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class246)) {
                    return;
                }
                var3 = (class246) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field3148).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field3152 = var5;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
    public static void method2519(boolean arg0) {
        field5852 = null;
        field5846 = null;
        if (!arg0) {
            method2520((byte) -42, null);
        }
        field5851 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLeo;)Leo;")
    public static final class423 method2520(byte arg0, class423 arg1) {
        field5841++;
        if (arg1.field5823 != -1) {
            return class497.method2965(0, arg1.field5823);
        }
        int var2 = arg1.field5734 >>> 16;
        class376 var3 = new class376(class381.field4963);
        for (class367 var4 = (class367) var3.method2198(false); var4 != null; var4 = (class367) var3.method2196(true)) {
            if (var4.field4719 == var2) {
                return class497.method2965(0, (int) var4.field7456);
            }
        }
        return arg0 >= -3 ? null : null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public final void method2521(byte arg0) {
        field5845++;
        if (this.field5842 == null) {
            return;
        }
        this.method2522((byte) 122, new class508());
        if (arg0 != 9) {
            field5848 = -72;
        }
        try {
            this.field5842.join();
        } catch (InterruptedException var2) {
        }
        this.field5842 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLlf;)V")
    private final void method2522(byte arg0, class508 arg1) {
        field5840++;
        class7 var3 = this.field5844;
        synchronized (this.field5844) {
            this.field5844.method42(arg1, 0);
            if (arg0 < 66) {
                field5852 = null;
            }
            this.field5844.notify();
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    public class426() {
        this.field5842.setDaemon(true);
        this.field5842.start();
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static final void method2523(int arg0) {
        field5850++;
        if (class282.field3610 == -1) {
            return;
        }
        int var1 = class268.field3397.method717((byte) 82);
        int var2 = class268.field3397.method721((byte) 74);
        class228 var3 = (class228) class61.field792.method49(-118);
        if (var3 != null) {
            var1 = var3.method1444(arg0 + 1224);
            var2 = var3.method1442((byte) 71);
        }
        class96.method662(0, 0, 0, var1, class282.field3610, arg0 ^ 0x53F, var2, class23.field419, class92.field1281, 0);
        if (arg0 == -1344 && class14.field240 != null) {
            class205.method1341(var2, var1, (byte) 11);
        }
    }
}
