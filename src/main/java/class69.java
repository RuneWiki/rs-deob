import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class69 implements Runnable {

    @OriginalMember(owner = "client!og", name = "c", descriptor = "Lat;")
    private class412 field934 = new class412();

    @OriginalMember(owner = "client!og", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field936 = new Thread(this);

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Lct;")
    public static class285 field938 = new class285(11, 16);

    @OriginalMember(owner = "client!og", name = "k", descriptor = "[I")
    public static int[] field942 = new int[2048];

    @OriginalMember(owner = "client!og", name = "l", descriptor = "F")
    public static float field943;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;I)Ljq;")
    public final class340 method605(String arg0, int arg1) {
        if (arg1 != 16236) {
            this.field934 = null;
        }
        field932++;
        if (this.field936 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class340 var3 = new class340(arg0);
            this.method609(-8178, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method606(String arg0, int arg1) throws ClassNotFoundException {
        if (arg1 != 1781046507) {
            method608(-125, true);
        }
        field941++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static void method607(byte arg0) {
        field942 = null;
        field938 = null;
        if (arg0 != -100) {
            field938 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "run", descriptor = "()V")
    public final void run() {
        field933++;
        while (true) {
            class412 var1 = this.field934;
            class340 var3;
            synchronized (this.field934) {
                class35 var2;
                for (var2 = this.field934.method2457((byte) 75); var2 == null; var2 = this.field934.method2457((byte) 75)) {
                    try {
                        this.field934.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class340)) {
                    return;
                }
                var3 = (class340) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field5092).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field5096 = var5;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)I")
    public static final int method608(int arg0, boolean arg1) {
        if (!arg1) {
            field942 = null;
        }
        field939++;
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class69() {
        this.field936.setDaemon(true);
        this.field936.start();
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILfi;)V")
    private final void method609(int arg0, class35 arg1) {
        field940++;
        if (arg0 != -8178) {
            return;
        }
        class412 var3 = this.field934;
        synchronized (this.field934) {
            this.field934.method2453((byte) -87, arg1);
            this.field934.notify();
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
    public final void method610(byte arg0) {
        field935++;
        if (this.field936 == null) {
            return;
        }
        this.method609(-8178, new class35());
        try {
            if (arg0 > -46) {
                field943 = -1.893366F;
            }
            this.field936.join();
        } catch (InterruptedException var2) {
        }
        this.field936 = null;
    }
}
