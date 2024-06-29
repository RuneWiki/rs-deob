import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class298 implements Runnable {

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Lfh;")
    private class653 field3922 = new class653();

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field3920 = new Thread(this);

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field3919 = 0;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field3916 = 0;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field3915 = 0;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;Z)Lvr;", line = 5)
    public final class139 method1782(String arg0, boolean arg1) {
        field3921++;
        if (this.field3920 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class139 var3 = new class139(arg0);
            this.method1785(var3, arg1);
            return var3;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 26)
    public static final void method1783(String arg0, int arg1, boolean arg2) {
        field3917++;
        int var3 = class416.field5303;
        int[] var4 = class657.field9155;
        if (!arg2) {
            return;
        }
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class724 var7 = class5.field49[var4[var6]];
            if (var7 != null && class380.field4847 != var7 && var7.field10062 != null && var7.field10062.equalsIgnoreCase(arg0)) {
                var5 = true;
                if (arg1 == 1) {
                    class182.field2542++;
                    class589 var8 = class514.method2994(-29488, class760.field10605, class751.field10491);
                    var8.field8251.method2624(-124, var4[var6]);
                    var8.field8251.method2590(0, (byte) -113);
                    class737.method4107(var8, 7);
                } else if (arg1 == 4) {
                    class552.field7708++;
                    class589 var9 = class514.method2994(-29488, class760.field10605, class346.field4365);
                    var9.field8251.method2620(var4[var6], false);
                    var9.field8251.method2565(true, 0);
                    class737.method4107(var9, 7);
                } else if (arg1 == 5) {
                    class104.field1427++;
                    class589 var12 = class514.method2994(-29488, class760.field10605, class267.field3364);
                    var12.field8251.method2624(-128, var4[var6]);
                    var12.field8251.method2572(0, (byte) 118);
                    class737.method4107(var12, 7);
                } else if (arg1 == 6) {
                    class112.field1617++;
                    class589 var11 = class514.method2994(-29488, class760.field10605, class416.field5302);
                    var11.field8251.method2630(-54, var4[var6]);
                    var11.field8251.method2590(0, (byte) -106);
                    class737.method4107(var11, 7);
                } else if (arg1 == 7) {
                    class614.field8481++;
                    class589 var10 = class514.method2994(-29488, class760.field10605, class753.field10503);
                    var10.field8251.method2590(0, (byte) -109);
                    var10.field8251.method2620(var4[var6], !arg2);
                    class737.method4107(var10, 7);
                }
                break;
            }
        }
        if (!var5) {
            class283.method1695(-96, 4, class454.field6024.method2547(-73, class243.field3143) + arg0);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 121)
    public final void method1784(byte arg0) {
        if (arg0 != -127) {
            return;
        }
        field3918++;
        if (this.field3920 == null) {
            return;
        }
        this.method1785(new class168(), false);
        try {
            this.field3920.join();
        } catch (InterruptedException var2) {
        }
        this.field3920 = null;
    }

    @OriginalMember(owner = "client!tf", name = "run", descriptor = "()V", line = 146)
    public final void run() {
        field3914++;
        while (true) {
            class653 var1 = this.field3922;
            class139 var3;
            synchronized (this.field3922) {
                class168 var2;
                for (var2 = this.field3922.method3665(23290); var2 == null; var2 = this.field3922.method3665(23290)) {
                    try {
                        this.field3922.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class139)) {
                    return;
                }
                var3 = (class139) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field1989).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field1987 = var5;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ldfa;Z)V", line = 188)
    private final void method1785(class168 arg0, boolean arg1) {
        class653 var3 = this.field3922;
        synchronized (this.field3922) {
            this.field3922.method3671(arg0, arg1);
            this.field3922.notify();
        }
        field3912++;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V", line = 207)
    public class298() {
        this.field3920.setDaemon(true);
        this.field3920.start();
    }
}
