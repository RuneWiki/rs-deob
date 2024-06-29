import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class197 implements Runnable {

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "Lvp;")
    private class123 field2871 = new class123();

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field2876 = new Thread(this);

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2873 = null;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "[[I")
    public static int[][] field2877 = new int[6][];

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "Lic;")
    public static class491 field2869;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
    public static final void method1343(byte arg0) {
        if (arg0 != 9) {
            method1343((byte) -60);
        }
        class306.field4403 = null;
        field2866++;
        class229.method1569(0, 0, class116.field1743, -1, 0, -1, class6.field79, 0, class4.field57);
        if (class306.field4403 != null) {
            class245.method1648(field2872, class476.field7004, class306.field4403, 0, class4.field57, (byte) -57, -1412584499, class163.field2399.field410, class116.field1743, 0);
            class306.field4403 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "run", descriptor = "()V")
    public final void run() {
        field2875++;
        while (true) {
            class123 var1 = this.field2871;
            class119 var3;
            synchronized (this.field2871) {
                class337 var2;
                for (var2 = this.field2871.method815(-127); var2 == null; var2 = this.field2871.method815(-123)) {
                    try {
                        this.field2871.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class119)) {
                    return;
                }
                var3 = (class119) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field1796).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field1794 = var5;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public static void method1344(int arg0) {
        field2873 = null;
        field2869 = null;
        field2877 = null;
        if (arg0 != 2) {
            field2877 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)V")
    public final void method1345(byte arg0) {
        if (arg0 < 49) {
            return;
        }
        field2868++;
        if (this.field2876 == null) {
            return;
        }
        this.method1348(new class337(), (byte) 77);
        try {
            this.field2876.join();
        } catch (InterruptedException var2) {
        }
        this.field2876 = null;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/String;B)Lcw;")
    public final class119 method1346(String arg0, byte arg1) {
        field2874++;
        if (this.field2876 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            if (arg1 < 114) {
                this.field2871 = null;
            }
            class119 var3 = new class119(arg0);
            this.method1348(var3, (byte) 64);
            return var3;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(FIFF)I")
    public static final int method1347(float arg0, int arg1, float arg2, float arg3) {
        field2870++;
        float var4 = (arg0 < 0.0F) ? -arg0 : arg0;
        float var5 = (arg2 < 0.0F) ? -arg2 : arg2;
        float var6 = arg3 < (float) arg1 ? -arg3 : arg3;
        if (var5 > var4 && var5 > var6) {
            return (arg2 > 0.0F) ? 0 : 1;
        } else if (var4 < var6 && var6 > var5) {
            return (arg3 > 0.0F) ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lkp;B)V")
    private final void method1348(class337 arg0, byte arg1) {
        if (arg1 < 56) {
            this.method1348(null, (byte) 15);
        }
        field2867++;
        class123 var3 = this.field2871;
        synchronized (this.field2871) {
            this.field2871.method809(arg0, false);
            this.field2871.notify();
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V")
    public class197() {
        this.field2876.setDaemon(true);
        this.field2876.start();
    }
}
