import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class737 implements Runnable {

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "Lbq;")
    private class289 field10306 = new class289();

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field10308 = new Thread(this);

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field10297;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field10298;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field10299;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field10300;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field10301;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field10302;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field10303;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field10307;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public static int field10309;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "Loca;")
    public static class263 field10304;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "Ljava/lang/String;")
    public static String field10305;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 4)
    public final void method4105(int arg0) {
        field10299++;
        if (this.field10308 == null) {
            return;
        }
        this.method4106(true, new class134());
        try {
            this.field10308.join();
        } catch (InterruptedException var2) {
        }
        this.field10308 = null;
        if (arg0 != -8063) {
            method4113(12, -57, true);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZLmc;)V", line = 26)
    private final void method4106(boolean arg0, class134 arg1) {
        field10309++;
        class289 var3 = this.field10306;
        synchronized (this.field10306) {
            this.field10306.method1721((byte) -38, arg1);
            if (arg0) {
                this.field10306.notify();
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILjava/lang/String;)Lva;", line = 41)
    public final class495 method4107(int arg0, String arg1) {
        field10300++;
        if (this.field10308 == null) {
            throw new IllegalStateException("");
        }
        if (arg0 != 2) {
            field10304 = null;
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("");
        }
        class495 var3 = new class495(arg1);
        this.method4106(true, var3);
        return var3;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V", line = 62)
    public static void method4108(int arg0) {
        field10305 = null;
        field10304 = null;
        if (arg0 >= -79) {
            method4112(-128, -53, 125, -71, 60, 63, -48, -21, -31, 87, (byte) -31, 123);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIII[II)Z", line = 74)
    public static final boolean method4109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        field10307++;
        if (class244.field2887 < arg5) {
            arg5 = class244.field2887;
        }
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg5 <= arg3) {
            return true;
        }
        int var8 = arg1 * arg3 + arg4;
        int var9 = arg3 + arg0 - 1;
        int var10 = arg5 - arg3 >> 2;
        if (arg7 != 3) {
            field10304 = null;
        }
        int var10000;
        if (class319.field4077 == 1) {
            class542.field7803 += var10;
            while (true) {
                var10--;
                if (var10 < 0) {
                    int var16 = arg5 - arg3 & 0x3;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            return true;
                        }
                        var10000 = ~var8;
                        var9++;
                        if (var10000 > ~arg6[var9]) {
                            arg6[var9] = var8;
                        }
                        var8 += arg1;
                    }
                }
                var9++;
                if (arg6[var9] > var8) {
                    arg6[var9] = var8;
                }
                int var17 = arg1 + var8;
                var9++;
                if (arg6[var9] > var17) {
                    arg6[var9] = var17;
                }
                int var18 = arg1 + var17;
                var9++;
                if (var18 < arg6[var9]) {
                    arg6[var9] = var18;
                }
                int var19 = arg1 + var18;
                var10000 = ~var19;
                var9++;
                if (var10000 > ~arg6[var9]) {
                    arg6[var9] = var19;
                }
                var8 = arg1 + var19;
            }
        } else {
            int var11 = var8 - 38400;
            while (true) {
                var10--;
                if (var10 < 0) {
                    int var12 = arg5 - arg3 & 0x3;
                    while (true) {
                        var12--;
                        if (var12 < 0) {
                            return true;
                        }
                        var9++;
                        if (arg6[var9] > var11) {
                            return false;
                        }
                        var11 += arg1;
                    }
                }
                var10000 = ~var11;
                var9++;
                if (var10000 > ~arg6[var9]) {
                    return false;
                }
                int var13 = arg1 + var11;
                var9++;
                if (var13 < arg6[var9]) {
                    return false;
                }
                int var14 = arg1 + var13;
                var9++;
                if (arg6[var9] > var14) {
                    return false;
                }
                int var15 = arg1 + var14;
                var10000 = ~var15;
                var9++;
                if (var10000 > ~arg6[var9]) {
                    return false;
                }
                var11 = arg1 + var15;
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I[B)V", line = 171)
    public static final void method4110(int arg0, byte[] arg1) {
        field10301++;
        class244 var2 = new class244(arg1);
        if (arg0 != 0) {
            method4111(true, null);
        }
        while (true) {
            int var3;
            label47: do {
                while (true) {
                    while (true) {
                        var3 = var2.method1423(arg0 ^ 0xFFFFFFF5);
                        if (var3 == 0) {
                            return;
                        }
                        if (var3 == 1) {
                            int[] var8 = class591.field8332 = new int[6];
                            var8[0] = var2.method1476(class555.method3251(arg0, -70));
                            var8[1] = var2.method1476(arg0 - 119);
                            var8[2] = var2.method1476(-2);
                            var8[3] = var2.method1476(3);
                            var8[4] = var2.method1476(45);
                            var8[5] = var2.method1476(class555.method3251(arg0, -124));
                        } else {
                            if (var3 != 4) {
                                continue label47;
                            }
                            int var6 = var2.method1423(arg0 - 85);
                            class510.field7250 = new int[var6];
                            for (int var7 = 0; var7 < var6; var7++) {
                                class510.field7250[var7] = var2.method1476(13);
                                if (class510.field7250[var7] == 65535) {
                                    class510.field7250[var7] = -1;
                                }
                            }
                        }
                    }
                }
            } while (var3 != 5);
            int var4 = var2.method1423(-39);
            class562.field8003 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                class562.field8003[var5] = var2.method1476(class555.method3251(arg0, -69));
                if (class562.field8003[var5] == 65535) {
                    class562.field8003[var5] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 249)
    public static final int method4111(boolean arg0, String arg1) {
        field10297++;
        for (int var2 = 0; var2 < class370.field4733.length; var2++) {
            if (class370.field4733[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        if (arg0) {
            method4113(-49, -22, true);
        }
        return -1;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIIIIIIBI)V", line = 269)
    public static final void method4112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, int arg11) {
        field10298++;
        if (!class650.method3697(arg10 + 36, arg0) || arg10 != -36) {
            return;
        }
        if (class286.field3496[arg0] == null) {
            client.method1785(class643.field9209[arg0], -1, arg4, arg3, arg7, arg1, arg5, arg2, arg9, arg8, arg6, arg11);
        } else {
            client.method1785(class286.field3496[arg0], -1, arg4, arg3, arg7, arg1, arg5, arg2, arg9, arg8, arg6, arg11);
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V", line = 306)
    public class737() {
        this.field10308.setDaemon(true);
        this.field10308.start();
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIZ)Z", line = 296)
    public static final boolean method4113(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method4108(35);
        }
        field10302++;
        return class542.method3188(arg0, (byte) -72, arg1) & class478.method2875(2048, arg0, arg1);
    }

    @OriginalMember(owner = "client!kn", name = "run", descriptor = "()V", line = 318)
    public final void run() {
        field10303++;
        while (true) {
            class289 var1 = this.field10306;
            class495 var3;
            synchronized (this.field10306) {
                class134 var2;
                for (var2 = this.field10306.method1729(662); var2 == null; var2 = this.field10306.method1729(662)) {
                    try {
                        this.field10306.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class495)) {
                    return;
                }
                var3 = (class495) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field7006).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field7005 = var5;
        }
    }
}
