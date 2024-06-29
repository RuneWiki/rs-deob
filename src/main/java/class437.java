import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class437 implements Runnable {

    @OriginalMember(owner = "client!km", name = "f", descriptor = "Lfi;")
    private class166 field6246 = new class166();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field6241 = new Thread(this);

    @OriginalMember(owner = "client!km", name = "h", descriptor = "F")
    public static float field6248;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public static final void method2710(byte arg0) {
        if (arg0 == -123) {
            field6247++;
            class411.field5748.method607(0);
            class5.field34.method2238(5);
            class180.field2637.method2238(5);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public final void method2711(int arg0) {
        field6244++;
        if (this.field6241 == null) {
            return;
        }
        this.method2714(arg0 ^ 0x3, new class381());
        if (arg0 != 0) {
            return;
        }
        try {
            this.field6241.join();
        } catch (InterruptedException var2) {
        }
        this.field6241 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)V")
    public static final void method2712(byte arg0, int arg1) {
        class447.field6475 = arg1;
        field6249++;
        if (arg0 == -83) {
            class39.field605 = -1;
            class44.field709 = -1;
            class156.method1196(true);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILjava/lang/String;)Luq;")
    public final class235 method2713(int arg0, String arg1) {
        field6243++;
        if (this.field6241 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            if (arg0 > 0) {
                method2712((byte) 31, -53);
            }
            class235 var3 = new class235(arg1);
            this.method2714(3, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!km", name = "run", descriptor = "()V")
    public final void run() {
        field6242++;
        while (true) {
            class166 var1 = this.field6246;
            class235 var3;
            synchronized (this.field6246) {
                class381 var2;
                for (var2 = this.field6246.method1239(true); var2 == null; var2 = this.field6246.method1239(true)) {
                    try {
                        this.field6246.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class235)) {
                    return;
                }
                var3 = (class235) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field3250).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field3251 = var5;
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
    public class437() {
        this.field6241.setDaemon(true);
        this.field6241.start();
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILs;)V")
    private final void method2714(int arg0, class381 arg1) {
        class166 var3 = this.field6246;
        synchronized (this.field6246) {
            this.field6246.method1249(arg1, (byte) -124);
            if (arg0 != 3) {
                method2712((byte) 71, 78);
            }
            this.field6246.notify();
        }
        field6245++;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V")
    public static final void method2715(int arg0, int arg1) {
        field6250++;
        if (!class15.method76(6, arg1)) {
            return;
        }
        class139[] var2 = class291.field3949[arg1];
        if (arg0 < 8) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class139 var4 = var2[var3];
            if (var4 != null) {
                var4.field2104 = 1;
                var4.field2066 = 0;
                var4.field2124 = 0;
            }
        }
    }
}
