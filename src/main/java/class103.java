import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class103 implements Runnable {

    @OriginalMember(owner = "client!bba", name = "h", descriptor = "Lws;")
    private class333 field1319 = new class333();

    @OriginalMember(owner = "client!bba", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field1318 = new Thread(this);

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
    public static int field1316 = -1;

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "I")
    public static int field1315 = -1;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "Lcga;")
    public static class449 field1314 = new class449(22, 4);

    @OriginalMember(owner = "client!bba", name = "k", descriptor = "Ldr;")
    public static class675 field1322 = new class675(5, -2);

    @OriginalMember(owner = "client!bba", name = "m", descriptor = "I")
    public static int field1324 = -1;

    @OriginalMember(owner = "client!bba", name = "l", descriptor = "[I")
    public static int[] field1323 = new int[4096];

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!bba", name = "i", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!bba", name = "j", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Z)V", line = 5)
    public final void method737(boolean arg0) {
        field1320++;
        if (this.field1318 == null || !arg0) {
            return;
        }
        this.method739(8262, new class263());
        try {
            this.field1318.join();
        } catch (InterruptedException var2) {
        }
        this.field1318 = null;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Ljava/lang/String;B)Lsk;", line = 30)
    public final class582 method738(String arg0, byte arg1) {
        field1321++;
        if (this.field1318 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class582 var3 = new class582(arg0);
            this.method739(8262, var3);
            return arg1 <= 9 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILkd;)V", line = 53)
    private final void method739(int arg0, class263 arg1) {
        if (arg0 != 8262) {
            return;
        }
        class333 var3 = this.field1319;
        synchronized (this.field1319) {
            this.field1319.method1904(arg1, arg0 - 8348);
            this.field1319.notify();
        }
        field1317++;
    }

    @OriginalMember(owner = "client!bba", name = "run", descriptor = "()V", line = 72)
    public final void run() {
        field1313++;
        while (true) {
            class333 var1 = this.field1319;
            class582 var3;
            synchronized (this.field1319) {
                class263 var2;
                for (var2 = this.field1319.method1906(65); var2 == null; var2 = this.field1319.method1906(57)) {
                    try {
                        this.field1319.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class582)) {
                    return;
                }
                var3 = (class582) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field7827).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field7829 = var5;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lqf;II)V", line = 111)
    public static final void method740(class638 arg0, int arg1, int arg2) {
        class262.field3314 = 0;
        if (arg2 != -530) {
            field1316 = 14;
        }
        field1312++;
        class307.field3882 = false;
        class69.method551(109, arg0);
        class86.method653(arg0, -1);
        if (class307.field3882) {
            System.out.println("---endgpp---");
        }
        if (arg0.field7313 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg0.field7313 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)V", line = 138)
    public static void method741(byte arg0) {
        field1322 = null;
        field1314 = null;
        if (arg0 != -9) {
            field1324 = -4;
        }
        field1323 = null;
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "()V", line = 155)
    public class103() {
        this.field1318.setDaemon(true);
        this.field1318.start();
    }
}
