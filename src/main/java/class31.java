import jagex3.jagmisc.jagmisc;
import java.awt.Point;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class31 implements Runnable {

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "Ljm;")
    private class162 field420 = new class162();

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field423 = new Thread(this);

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "Z")
    public static boolean field421 = false;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "Lhc;")
    public static class368 field430 = new class368("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "Lvg;")
    public static class108 field431 = null;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "Lok;")
    public static class61 field432;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)I", line = 3)
    public static final int method283(boolean arg0) {
        field429++;
        if (!arg0) {
            field421 = false;
        }
        return 2;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V", line = 15)
    public final void method284(byte arg0) {
        field428++;
        if (this.field423 == null) {
            return;
        }
        this.method289(new class311(), (byte) -115);
        try {
            if (arg0 <= 8) {
                return;
            }
            this.field423.join();
        } catch (InterruptedException var2) {
        }
        this.field423 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V", line = 36)
    public static final void method285(int arg0, int arg1) {
        if (!class314.field4262) {
            arg0 = -1;
        }
        field427++;
        if (class345.field4668 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class439 var2 = class115.method861(arg0, (byte) -95);
            class96 var3 = var2.method2703(true);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class122.field1839.method603(class104.field1447, var3.method749(), var3.method738(), new Point(var2.field6186, var2.field6192), var3.method751(), 85);
                class345.field4668 = arg0;
            }
        }
        if (arg0 == arg1 && class345.field4668 != -1) {
            class122.field1839.method603(class104.field1447, -1, -1, new Point(), (int[]) null, 46);
            class345.field4668 = -1;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILjava/lang/String;)Ltg;", line = 73)
    public final class296 method286(int arg0, String arg1) {
        field424++;
        if (this.field423 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            if (arg0 != -10499) {
                this.field423 = null;
            }
            class296 var3 = new class296(arg1);
            this.method289(var3, (byte) -111);
            return var3;
        }
    }

    @OriginalMember(owner = "client!mq", name = "run", descriptor = "()V", line = 95)
    public final void run() {
        field425++;
        while (true) {
            class162 var1 = this.field420;
            class296 var3;
            synchronized (this.field420) {
                class311 var2;
                for (var2 = this.field420.method1160((byte) 109); var2 == null; var2 = this.field420.method1160((byte) 80)) {
                    try {
                        this.field420.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class296)) {
                    return;
                }
                var3 = (class296) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field4073).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field4070 = var5;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZD)V", line = 135)
    public static final void method287(boolean arg0, double arg1) {
        if (!arg0) {
            return;
        }
        if (class261.field3600 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class183.field2569[var3] = var4 > 255 ? 255 : var4;
            }
            class261.field3600 = arg1;
        }
        field422++;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V", line = 161)
    public static void method288(byte arg0) {
        if (arg0 != 31) {
            method288((byte) 0);
        }
        field432 = null;
        field431 = null;
        field430 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lvi;B)V", line = 176)
    private final void method289(class311 arg0, byte arg1) {
        field426++;
        class162 var3 = this.field420;
        synchronized (this.field420) {
            this.field420.method1162(115, arg0);
            this.field420.notify();
            if (arg1 > -88) {
                this.run();
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V", line = 196)
    public class31() {
        this.field423.setDaemon(true);
        this.field423.start();
    }
}
