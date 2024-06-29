import jagex3.jagmisc.jagmisc;
import java.awt.Rectangle;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class431 implements Runnable {

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Lps;")
    private class63 field6560 = new class63();

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field6561 = new Thread(this);

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lof;")
    public static class446 field6564 = new class446("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Lnc;")
    public static class20 field6567;

    @OriginalMember(owner = "client!ke", name = "run", descriptor = "()V")
    public final void run() {
        field6558++;
        while (true) {
            class63 var1 = this.field6560;
            class365 var3;
            synchronized (this.field6560) {
                class5 var2;
                for (var2 = this.field6560.method447(8); var2 == null; var2 = this.field6560.method447(8)) {
                    try {
                        this.field6560.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class365)) {
                    return;
                }
                var3 = (class365) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field5597).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field5598 = var5;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static final void method2629(int arg0) {
        for (class318 var1 = (class318) class347.field5356.method3038(51); var1 != null; var1 = (class318) class347.field5356.method3038(-116)) {
            class329.method2121((byte) 126, var1);
        }
        field6566++;
        int var2;
        int var3;
        if (class203.field2716.method15(class378.field5771, 0)) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class253.field3515;
            var2 = class253.field3515;
        }
        client.method1331();
        if (arg0 != 3) {
            field6564 = null;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            client.method1352();
            client.method1345(var4);
            client.method1344(var4);
        }
        client.method1337();
        client.method1329();
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lie;I)V")
    private final void method2630(class5 arg0, int arg1) {
        class63 var3 = this.field6560;
        synchronized (this.field6560) {
            this.field6560.method453((byte) 103, arg0);
            this.field6560.notify();
            if (arg1 >= -2) {
                method2635(-11, (byte) -24, -47, -79, -65);
            }
        }
        field6562++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public final void method2631(boolean arg0) {
        field6555++;
        if (this.field6561 == null) {
            return;
        }
        if (arg0) {
            method2636((byte) -55);
        }
        this.method2630(new class5(), -41);
        try {
            this.field6561.join();
        } catch (InterruptedException var2) {
        }
        this.field6561 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLjava/lang/String;)Lhv;")
    public final class365 method2632(byte arg0, String arg1) {
        field6559++;
        if (arg0 != -38) {
            this.field6560 = null;
        }
        if (this.field6561 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class365 var3 = new class365(arg1);
            this.method2630(var3, -10);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)I")
    public static final int method2633(byte arg0, int arg1) {
        field6565++;
        if (arg0 != 1) {
            field6567 = null;
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLnj;)Lpu;")
    public static final class401 method2634(byte arg0, class164 arg1) {
        field6557++;
        if (arg0 != -6) {
            method2634((byte) -55, null);
        }
        return new class401(arg1.method1056(1024), arg1.method1056(1024), arg1.method1056(1024), arg1.method1056(arg0 ^ 0xFFFFFBFA), arg1.method1056(1024), arg1.method1056(1024), arg1.method1056(1024), arg1.method1056(arg0 + 1030), arg1.method1090(-1), arg1.method1087(false));
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBIII)V")
    public static final void method2635(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field6563++;
        for (int var5 = 0; var5 < class428.field6506; var5++) {
            Rectangle var7 = class375.field5701[var5];
            if (arg2 < (var7.x + var7.width) && (arg0 + arg2) > var7.x && arg4 < var7.y + var7.height && (arg3 + arg4) > var7.y) {
                class430.field6553[var5] = true;
            }
        }
        int var6 = -6 % ((-arg1 - 9) / 36);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method2636(byte arg0) {
        if (arg0 >= 69) {
            field6567 = null;
            field6564 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class431() {
        this.field6561.setDaemon(true);
        this.field6561.start();
    }
}
