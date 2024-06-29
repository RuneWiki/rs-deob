import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class92 implements Runnable {

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "Lwl;")
    private class280 field1389 = new class280();

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field1397 = new Thread(this);

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "Lff;")
    public static class9 field1393 = new class9(53, -1);

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "Lok;")
    public static class166 field1398 = new class166(13, 7);

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "F")
    public static float field1392;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLjava/lang/String;)Lnc;")
    public final class21 method664(byte arg0, String arg1) {
        field1396++;
        if (this.field1397 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else if (arg0 == -53) {
            class21 var3 = new class21(arg1);
            this.method669(var3, 127);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
    public final void method665(int arg0) {
        field1391++;
        if (this.field1397 == null) {
            return;
        }
        this.method669(new class42(), 101);
        if (arg0 != 1) {
            this.field1389 = null;
        }
        try {
            this.field1397.join();
        } catch (InterruptedException var2) {
        }
        this.field1397 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lpc;Lpc;Z)I")
    public static final int method666(class473 arg0, class473 arg1, boolean arg2) {
        if (!arg2) {
            method668((byte) 125);
        }
        field1395++;
        int var3 = 0;
        if (arg0.method2721(class484.field6734, (byte) 108)) {
            var3++;
        }
        if (arg0.method2721(class165.field2406, (byte) 113)) {
            var3++;
        }
        if (arg0.method2721(class37.field585, (byte) 118)) {
            var3++;
        }
        if (arg1.method2721(class484.field6734, (byte) 84)) {
            var3++;
        }
        if (arg1.method2721(class165.field2406, (byte) 94)) {
            var3++;
        }
        if (arg1.method2721(class37.field585, (byte) 123)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)Z")
    public static final boolean method667(int arg0, int arg1, int arg2) {
        int var3 = class85.field1296[arg0][arg1][arg2];
        if (-class39.field603 == var3) {
            return false;
        } else if (class39.field603 == var3) {
            return true;
        } else {
            int var4 = arg1 << class530.field7813;
            int var5 = arg2 << class530.field7813;
            if (class421.method2426(var4 + 1, class141.field2049[arg0].method272(arg1, arg2), var5 + 1) && class421.method2426(class220.field2979 + var4 - 1, class141.field2049[arg0].method272(arg1 + 1, arg2), var5 + 1) && class421.method2426(class220.field2979 + var4 - 1, class141.field2049[arg0].method272(arg1 + 1, arg2 + 1), class220.field2979 + var5 - 1) && class421.method2426(var4 + 1, class141.field2049[arg0].method272(arg1, arg2 + 1), class220.field2979 + var5 - 1) && class421.method2426(class497.field6892 + var4, class141.field2049[arg0].method272(arg1, arg2), var5 + 1) && class421.method2426(class220.field2979 + var4 - 1, class141.field2049[arg0].method272(arg1 + 1, arg2), class497.field6892 + var5) && class421.method2426(class497.field6892 + var4, class141.field2049[arg0].method272(arg1, arg2 + 1), class220.field2979 + var5 - 1) && class421.method2426(class220.field2979 + var4 - 1, class141.field2049[arg0].method272(arg1, arg2), class497.field6892 + var5) && class421.method2426(class497.field6892 + var4, class141.field2049[arg0].method272(arg1, arg2), class497.field6892 + var5)) {
                class85.field1296[arg0][arg1][arg2] = class39.field603;
                return true;
            } else {
                class85.field1296[arg0][arg1][arg2] = -class39.field603;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
    public static void method668(byte arg0) {
        if (arg0 >= -9) {
            field1398 = null;
        }
        field1398 = null;
        field1393 = null;
    }

    @OriginalMember(owner = "client!ls", name = "run", descriptor = "()V")
    public final void run() {
        field1394++;
        while (true) {
            class280 var1 = this.field1389;
            class21 var3;
            synchronized (this.field1389) {
                class42 var2;
                for (var2 = this.field1389.method1662((byte) 101); var2 == null; var2 = this.field1389.method1662((byte) 104)) {
                    try {
                        this.field1389.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class21)) {
                    return;
                }
                var3 = (class21) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field378).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field379 = var5;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lda;I)V")
    private final void method669(class42 arg0, int arg1) {
        if (arg1 < 86) {
            return;
        }
        field1390++;
        class280 var3 = this.field1389;
        synchronized (this.field1389) {
            this.field1389.method1666((byte) -111, arg0);
            this.field1389.notify();
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V")
    public class92() {
        this.field1397.setDaemon(true);
        this.field1397.start();
    }
}
