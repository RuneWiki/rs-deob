import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class269 implements Runnable {

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Lpu;")
    private class411 field4480 = new class411();

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field4479 = new Thread(this);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Lbq;")
    public static class487 field4484;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;I)Leo;", line = 3)
    public final class484 method1793(String arg0, int arg1) {
        field4482++;
        if (this.field4479 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class484 var3 = new class484(arg0);
            if (arg1 != 15) {
                this.method1793(null, 55);
            }
            this.method1795(0, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 24)
    public static final void method1794(int arg0) {
        if (arg0 > -124) {
            method1797((byte) 42);
        }
        field4477++;
        class266 var1 = class308.method1961(true, 0, 15);
        var1.method1778(17991);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjp;)V", line = 42)
    private final void method1795(int arg0, class276 arg1) {
        field4485++;
        class411 var3 = this.field4480;
        synchronized (this.field4480) {
            this.field4480.method2541(arg0, arg1);
            this.field4480.notify();
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 183)
    public class269() {
        this.field4479.setDaemon(true);
        this.field4479.start();
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V", line = 61)
    public static final void method1796(int arg0) {
        class261.field4357.field301 = 0;
        field4481++;
        class195.field3050 = 0;
        class212.field3373 = null;
        class165.field2609 = 0;
        class339.field5325 = null;
        class534.field7847 = null;
        class345.field5408 = 0;
        class157.field2544 = null;
        class506.field7365.field301 = 0;
        class318.method2020((byte) 65);
        class48.method344(0);
        for (int var1 = 0; var1 < 2048; var1++) {
            class435.field6489[var1] = null;
        }
        class302.field4850 = null;
        for (int var2 = 0; var2 < class353.field5506; var2++) {
            class265 var4 = class393.field6008[var2].field7355;
            if (var4 != null) {
                var4.field3065 = -1;
            }
        }
        class394.method2461((byte) -34);
        class190.field2963 = arg0;
        class75.method540(-7, 9);
        for (int var3 = 0; var3 < 100; var3++) {
            class445.field6633[var3] = true;
        }
        class5.method23(2);
        class57.field897 = null;
        class249.field4246 = 0L;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 114)
    public static void method1797(byte arg0) {
        field4484 = null;
        if (arg0 > -56) {
            field4484 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "run", descriptor = "()V", line = 124)
    public final void run() {
        field4483++;
        while (true) {
            class411 var1 = this.field4480;
            class484 var3;
            synchronized (this.field4480) {
                class276 var2;
                for (var2 = this.field4480.method2539(0); var2 == null; var2 = this.field4480.method2539(0)) {
                    try {
                        this.field4480.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class484)) {
                    return;
                }
                var3 = (class484) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field7111).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field7108 = var5;
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V", line = 163)
    public final void method1798(int arg0) {
        field4476++;
        if (this.field4479 == null || arg0 != 100) {
            return;
        }
        this.method1795(0, new class276());
        try {
            this.field4479.join();
        } catch (InterruptedException var2) {
        }
        this.field4479 = null;
    }
}
