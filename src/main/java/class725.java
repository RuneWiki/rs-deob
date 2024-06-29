import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class725 implements Runnable {

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Lbg;")
    private class464 field10114 = new class464();

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field10115 = new Thread(this);

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Lgda;")
    public static class53 field10117 = new class53(37, 7);

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "[C")
    private static char[] field10120 = new char[64];

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field10122;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "F")
    public static float field10121;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field10110;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field10111;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field10112;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field10113;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field10116;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field10118;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field10119;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLm;)V")
    private final void method4074(byte arg0, class189 arg1) {
        class464 var3 = this.field10114;
        synchronized (this.field10114) {
            this.field10114.method2770((byte) -13, arg1);
            this.field10114.notify();
        }
        field10118++;
        if (arg0 > -38) {
            this.field10114 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public final void method4075(byte arg0) {
        field10116++;
        if (this.field10115 == null) {
            return;
        }
        this.method4074((byte) -116, new class189());
        if (arg0 <= 28) {
            return;
        }
        try {
            this.field10115.join();
        } catch (InterruptedException var2) {
        }
        this.field10115 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII)V")
    public static final void method4076(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10119++;
        if (arg3 != 63) {
            return;
        }
        int var6 = class24.method150(arg4, class143.field2050, false, class461.field6495);
        int var7 = class24.method150(arg5, class143.field2050, false, class461.field6495);
        int var8 = class24.method150(arg2, class71.field960, false, class549.field7665);
        int var9 = class24.method150(arg1, class71.field960, false, class549.field7665);
        for (int var10 = var6; var10 <= var7; var10++) {
            class643.method3557(var8, class445.field6320[var10], (byte) 49, arg0, var9);
        }
    }

    @OriginalMember(owner = "client!hb", name = "run", descriptor = "()V")
    public final void run() {
        field10111++;
        while (true) {
            class464 var1 = this.field10114;
            class452 var3;
            synchronized (this.field10114) {
                class189 var2;
                for (var2 = this.field10114.method2762((byte) -16); var2 == null; var2 = this.field10114.method2762((byte) -16)) {
                    try {
                        this.field10114.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class452)) {
                    return;
                }
                var3 = (class452) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field6393).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field6392 = var5;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static final void method4077(int arg0) {
        if (arg0 != 52) {
            return;
        }
        for (int var1 = 0; var1 < class344.field4849; var1++) {
            int var2 = class100.field1196[var1];
            class740 var3 = (class740) class373.field5230.method1180((byte) 26, (long) var2);
            if (var3 != null) {
                class468 var4 = var3.field10289;
                class68.method563(-18081, var4, var4.field6632.field5051);
            }
        }
        field10113++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lbe;I)Ljava/lang/String;")
    public static final String method4078(class37 arg0, int arg1) {
        if (arg1 > -117) {
            return null;
        }
        field10112++;
        if (arg0.field467 == null || arg0.field467.length() == 0) {
            return arg0.field470 == null || arg0.field470.length() <= 0 ? arg0.field459 : arg0.field459 + class71.field928.method588((byte) 86, class549.field7669) + arg0.field470;
        } else if (arg0.field470 == null || arg0.field470.length() <= 0) {
            return arg0.field459 + class71.field928.method588((byte) 88, class549.field7669) + arg0.field467;
        } else {
            return arg0.field459 + class71.field928.method588((byte) 123, class549.field7669) + arg0.field470 + class71.field928.method588((byte) 95, class549.field7669) + arg0.field467;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public static void method4079(int arg0) {
        field10120 = null;
        if (arg0 <= -119) {
            field10117 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;B)Lla;")
    public final class452 method4080(String arg0, byte arg1) {
        field10110++;
        if (this.field10115 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class452 var3 = new class452(arg0);
            if (arg1 != 54) {
                this.run();
            }
            this.method4074((byte) -70, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class725() {
        this.field10115.setDaemon(true);
        this.field10115.start();
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field10120[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field10120[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field10120[var2] = (char) (var2 + 48 - 52);
        }
        field10120[62] = '+';
        field10120[63] = '/';
        field10122 = 0;
    }
}
