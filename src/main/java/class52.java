import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class52 implements Runnable {

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "Lfr;")
    private class497 field665 = new class497();

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field662 = new Thread(this);

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "Laa;")
    public static class76 field668 = new class76(1, 3);

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "[I")
    public static int[] field671 = new int[2];

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "Luv;")
    public static class2 field670 = new class2(84, 7);

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
    public static int field675 = -1;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "Lkq;")
    public static class78 field674;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "[Ll;")
    public static class127[] field672;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)Lgo;", line = 3)
    public static final class310 method386(int arg0, int arg1) {
        field663++;
        if (arg0 != 0) {
            return null;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class174.field2549[var2] == null || class174.field2549[var2][var3] == null) {
            boolean var4 = class250.method1495(true, var2);
            if (!var4) {
                return null;
            }
        }
        return class174.field2549[var2][var3];
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;B)Lkk;", line = 29)
    public final class116 method387(String arg0, byte arg1) {
        field669++;
        if (arg1 < 8) {
            return null;
        } else if (this.field662 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class116 var3 = new class116(arg0);
            this.method389(var3, 11215);
            return var3;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V", line = 52)
    public final void method388(byte arg0) {
        field666++;
        if (this.field662 == null) {
            return;
        }
        this.method389(new class115(), 11215);
        try {
            this.field662.join();
        } catch (InterruptedException var2) {
        }
        if (arg0 >= -7) {
            field675 = 123;
        }
        this.field662 = null;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V", line = 108)
    public class52() {
        this.field662.setDaemon(true);
        this.field662.start();
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lea;I)V", line = 78)
    private final void method389(class115 arg0, int arg1) {
        class497 var3 = this.field665;
        synchronized (this.field665) {
            if (arg1 != 11215) {
                field668 = null;
            }
            this.field665.method2958(arg0, (byte) 76);
            this.field665.notify();
        }
        field667++;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V", line = 92)
    public static void method390(boolean arg0) {
        field674 = null;
        field668 = null;
        field671 = null;
        field672 = null;
        if (arg0) {
            field670 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIJ)V", line = 120)
    public static final void method391(int arg0, int arg1, int arg2, long arg3) {
        field664++;
        int var5 = ((int) arg3 & 0x7E84D) >> 14;
        if (arg1 < 98) {
            method390(false);
        }
        int var6 = (int) arg3 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class27.method262(var6, (byte) -123, true, arg0, 0, 0, var5, arg2, 0);
            return;
        }
        class486 var8 = class119.field1824.method248(var7, 30);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field7235;
            var10 = var8.field7182;
        } else {
            var9 = var8.field7182;
            var10 = var8.field7235;
        }
        int var11 = var8.field7201;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class27.method262(0, (byte) -128, true, arg0, var11, var9, 0, arg2, var10);
    }

    @OriginalMember(owner = "client!pq", name = "run", descriptor = "()V", line = 164)
    public final void run() {
        field661++;
        while (true) {
            class497 var1 = this.field665;
            class116 var3;
            synchronized (this.field665) {
                class115 var2;
                for (var2 = this.field665.method2951((byte) -42); var2 == null; var2 = this.field665.method2951((byte) 67)) {
                    try {
                        this.field665.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class116)) {
                    return;
                }
                var3 = (class116) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field1744).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field1747 = var5;
        }
    }
}
