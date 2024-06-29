import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class737 implements Runnable {

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "Lga;")
    private class420 field10294 = new class420();

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field10286 = new Thread(this);

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "Ltga;")
    public static class64 field10289 = new class64(16);

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
    public static int field10287;

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
    public static int field10288;

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "I")
    public static int field10290;

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "I")
    public static int field10291;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "I")
    public static int field10292;

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
    public static int field10293;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lsf;III)V", line = 3)
    public static final void method4125(class547 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class151.field2074) {
            class379 var4 = class378.field5427[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field5446 != null && var4.field5446.method244(92)) {
                arg0.method242(0, var4.field5446, class711.field10005, (byte) 0, class13.field254, 0, true);
            }
        }
        if (arg3 < class151.field2074) {
            class379 var5 = class378.field5427[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field5446 != null && var5.field5446.method244(44)) {
                arg0.method242(class13.field254, var5.field5446, class711.field10005, (byte) 0, 0, 0, true);
            }
        }
        if (arg2 < class151.field2074 && arg3 < class12.field249) {
            class379 var6 = class378.field5427[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field5446 != null && var6.field5446.method244(-77)) {
                arg0.method242(class13.field254, var6.field5446, class711.field10005, (byte) 0, class13.field254, 0, true);
            }
        }
        if (arg2 < class151.field2074 && arg3 > 0) {
            class379 var7 = class378.field5427[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field5446 != null && var7.field5446.method244(-93)) {
                arg0.method242(-class13.field254, var7.field5446, class711.field10005, (byte) 0, class13.field254, 0, true);
            }
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)V", line = 50)
    public final void method4126(byte arg0) {
        field10293++;
        if (this.field10286 == null) {
            return;
        }
        this.method4127(new class540(), 1);
        try {
            this.field10286.join();
        } catch (InterruptedException var3) {
        }
        int var2 = 110 / ((-arg0 - 72) / 54);
        this.field10286 = null;
    }

    @OriginalMember(owner = "client!mga", name = "run", descriptor = "()V", line = 70)
    public final void run() {
        field10291++;
        while (true) {
            class420 var1 = this.field10294;
            class321 var3;
            synchronized (this.field10294) {
                class540 var2;
                for (var2 = this.field10294.method2507(-104); var2 == null; var2 = this.field10294.method2507(-116)) {
                    try {
                        this.field10294.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class321)) {
                    return;
                }
                var3 = (class321) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field4742).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field4738 = var5;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Ldn;I)V", line = 109)
    private final void method4127(class540 arg0, int arg1) {
        if (arg1 != 1) {
            this.method4128(null, -17);
        }
        class420 var3 = this.field10294;
        synchronized (this.field10294) {
            this.field10294.method2510(arg0, false);
            this.field10294.notify();
        }
        field10287++;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Ljava/lang/String;I)Lle;", line = 126)
    public final class321 method4128(String arg0, int arg1) {
        field10290++;
        if (this.field10286 == null) {
            throw new IllegalStateException("");
        }
        int var3 = 78 / ((arg1 + 17) / 39);
        if (arg0 == null) {
            throw new IllegalArgumentException("");
        }
        class321 var4 = new class321(arg0);
        this.method4127(var4, 1);
        return var4;
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(B)V", line = 151)
    public static void method4129(byte arg0) {
        int var1 = -109 % ((-arg0 - 68) / 46);
        field10289 = null;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V", line = 160)
    public static final void method4130(int arg0) {
        field10288++;
        class388.field5525 = arg0;
        class170.field2439 = arg0;
        class587.field8313 = arg0;
        class562.field7993 = arg0;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(ZIZ)V", line = 169)
    public static final void method4131(boolean arg0, int arg1, boolean arg2) {
        if (arg2) {
            method4125(null, 47, -49, 3);
        }
        if (arg0) {
            class731 var3 = class155.method1222(260, class587.field8312, class237.field3417);
            var3.field10211.method860(arg1, (byte) 117);
            class533.method3088(var3, 0);
        } else {
            class353.method2226(class783.field10775, arg1, -1);
        }
        field10292++;
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "()V", line = 195)
    public class737() {
        this.field10286.setDaemon(true);
        this.field10286.start();
    }
}
