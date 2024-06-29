import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class607 implements Runnable {

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "Lki;")
    private class364 field8211 = new class364();

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field8209 = new Thread(this);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field8205;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field8206;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field8207;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field8208;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field8210;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)Z")
    public static final boolean method3300(int arg0, int arg1, int arg2) {
        field8208++;
        if (arg2 == 52) {
            return (arg0 & 0x34) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public final void method3301(int arg0) {
        field8212++;
        if (this.field8209 == null) {
            return;
        }
        if (arg0 > -87) {
            this.field8211 = null;
        }
        this.method3304(new class424(), -113);
        try {
            this.field8209.join();
        } catch (InterruptedException var2) {
        }
        this.field8209 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILoa;IILe;I)V")
    public static final void method3302(int arg0, int arg1, class43 arg2, int arg3, int arg4, class702 arg5, int arg6) {
        field8206++;
        if (class484.field6455 < 100) {
            class174.method1180(86, arg5, arg2);
        }
        arg2.method376(arg6, arg1, arg4 + arg6, arg1 - -arg0);
        if (class484.field6455 < 100) {
            byte var7 = 20;
            int var8 = arg4 / 2 + arg6;
            arg2.method353(arg6, arg1, arg4, arg0, -16777216, 0);
            int var9 = arg0 / 2 + arg1 - var7 - 18;
            arg2.method388(var8 - 152, var9, 304, 34, class581.field7911[class673.field9324].getRGB(), 0);
            arg2.method353(var8 - 150, var9 + 2, class484.field6455 * 3, 30, class536.field6981[class673.field9324].getRGB(), 0);
            class456.field5983.method3249((byte) 46, class17.field194[class673.field9324].getRGB(), var7 + var9, class604.field8142.method3280((byte) 111, class144.field1890), var8, -1);
            return;
        }
        int var10 = class556.field7274 - (int) ((float) arg4 / class706.field9835);
        int var11 = (int) ((float) arg0 / class706.field9835) + class527.field6862;
        int var12 = (int) ((float) arg4 / class706.field9835) + class556.field7274;
        int var13 = class527.field6862 - (int) ((float) arg0 / class706.field9835);
        class580.field7899 = class527.field6862 - ((int) ((float) arg0 / class706.field9835));
        class468.field6108 = (int) ((float) (arg0 * 2) / class706.field9835);
        class377.field4832 = class556.field7274 - (int) ((float) arg4 / class706.field9835);
        class253.field3451 = (int) ((float) (arg4 * 2) / class706.field9835);
        class706.method3872(class706.field9866 + var10, class706.field9860 + var11, class706.field9866 + var12, var13 - -class706.field9860, arg6, arg1, arg4 + arg6, arg1 + 1 + arg0);
        class706.method3871(arg2);
        class364 var14 = class706.method3869(arg2);
        class562.method3003(var14, arg2, 0, 0, 8);
        if (class414.field5328 > 0) {
            class273.field3599--;
            if (class273.field3599 == 0) {
                class273.field3599 = 20;
                class414.field5328--;
            }
        }
        if (class144.field1889) {
            int var15 = arg4 + arg6 - 5;
            int var16 = arg1 + arg0 - 8;
            class562.field7337.method3235((byte) -114, "Fps:" + class486.field6471, var16, -1, 16776960, var15);
            int var20 = var16 - 15;
            Runtime var17 = Runtime.getRuntime();
            int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
            int var19 = 16776960;
            if (var18 > 65536) {
                var19 = 16711680;
            }
            class562.field7337.method3235((byte) -113, "Mem:" + var18 + "k", var20, -1, var19, var15);
            var16 = var20 - 15;
        }
        if (arg3 <= -105) {
            ;
        }
    }

    @OriginalMember(owner = "client!rn", name = "run", descriptor = "()V")
    public final void run() {
        field8207++;
        while (true) {
            class364 var1 = this.field8211;
            class207 var3;
            synchronized (this.field8211) {
                class424 var2;
                for (var2 = this.field8211.method2092((byte) 92); var2 == null; var2 = this.field8211.method2092((byte) 92)) {
                    try {
                        this.field8211.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class207)) {
                    return;
                }
                var3 = (class207) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field2668).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field2672 = var5;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;B)Liw;")
    public final class207 method3303(String arg0, byte arg1) {
        field8205++;
        if (this.field8209 == null) {
            throw new IllegalStateException("");
        }
        if (arg1 != 28) {
            this.run();
        }
        if (arg0 == null) {
            throw new IllegalArgumentException("");
        }
        class207 var3 = new class207(arg0);
        this.method3304(var3, -123);
        return var3;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lfaa;I)V")
    private final void method3304(class424 arg0, int arg1) {
        field8210++;
        class364 var3 = this.field8211;
        synchronized (this.field8211) {
            if (arg1 >= -87) {
                this.field8209 = null;
            }
            this.field8211.method2087(arg0, -127);
            this.field8211.notify();
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
    public class607() {
        this.field8209.setDaemon(true);
        this.field8209.start();
    }
}
