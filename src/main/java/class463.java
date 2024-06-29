import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class463 implements Runnable {

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "Lug;")
    private class392 field6933 = new class392();

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field6930 = new Thread(this);

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Lef;")
    public static class335 field6936 = new class335(0, 2, 2, 1);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
    public static void method2753(boolean arg0) {
        if (arg0) {
            field6932 = 127;
        }
        field6936 = null;
    }

    @OriginalMember(owner = "client!mj", name = "run", descriptor = "()V")
    public final void run() {
        field6929++;
        while (true) {
            class392 var1 = this.field6933;
            class472 var3;
            synchronized (this.field6933) {
                class320 var2;
                for (var2 = this.field6933.method2423(0); var2 == null; var2 = this.field6933.method2423(0)) {
                    try {
                        this.field6933.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class472)) {
                    return;
                }
                var3 = (class472) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field7076).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field7074 = var5;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Z)V")
    public final void method2754(boolean arg0) {
        field6928++;
        if (!arg0 || this.field6930 == null) {
            return;
        }
        this.method2757((byte) -14, new class320());
        try {
            this.field6930.join();
        } catch (InterruptedException var2) {
        }
        this.field6930 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;B)Lab;")
    public final class472 method2755(String arg0, byte arg1) {
        field6938++;
        if (this.field6930 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class472 var3 = new class472(arg0);
            this.method2757((byte) -108, var3);
            if (arg1 != -63) {
                this.method2755(null, (byte) 96);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)V")
    public static final void method2756(boolean arg0, int arg1) {
        field6937++;
        int var2 = class531.field7821 - class524.field7772;
        if (var2 >= 100) {
            class85.field1473 = 1;
            return;
        }
        int var3 = (int) class455.field6790;
        if (var3 < (class42.field771 >> 8)) {
            var3 = class42.field771 >> 8;
        }
        if (class153.field2429[4] && var3 < class167.field2588[4] + 128) {
            var3 = class167.field2588[4] + 128;
        }
        int var4 = (int) class526.field7779 + class345.field5179 & 0x3FFF;
        if (!arg0) {
            method2756(true, 14);
        }
        class108.method807(var3, var4, ((var3 >> 3) * 3) + 600 << 0, class524.field7771, arg1, class305.field4654, (byte) 101, class343.method2188(class163.field2525, class139.field2224.field6228, (byte) -102, class139.field2224.field6233) - 50);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class405.field6075 = (int) ((float) (class405.field6075 - class217.field3127) * var5 + (float) class217.field3127);
        class122.field1982 = (int) ((float) (class122.field1982 - class134.field2159) * var5 + (float) class134.field2159);
        class222.field3184 = (int) ((float) (class222.field3184 - class234.field3411) * var5 + (float) class234.field3411);
        class40.field732 = (int) ((float) (class40.field732 - class162.field2499) * var5 + (float) class162.field2499);
        int var6 = class291.field4148 - class62.field1082;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class291.field4148 = (int) ((float) var6 * var5 + (float) class62.field1082);
        class291.field4148 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLqg;)V")
    private final void method2757(byte arg0, class320 arg1) {
        class392 var3 = this.field6933;
        synchronized (this.field6933) {
            this.field6933.method2417(-126, arg1);
            this.field6933.notify();
        }
        int var4 = -122 % ((arg0 - 39) / 35);
        field6935++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2758(int arg0, String arg1) {
        if (arg0 > -67) {
            field6932 = 108;
        }
        field6931++;
        return class298.method1888(arg1, true, 10, 100);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILbu;)V")
    public static final void method2759(int arg0, class17 arg1) {
        class104.field1727 = arg1;
        if (arg0 != 128) {
            field6932 = 20;
        }
        field6934++;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class463() {
        this.field6930.setDaemon(true);
        this.field6930.start();
    }
}
