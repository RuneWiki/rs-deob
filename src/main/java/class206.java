import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class206 implements Runnable {

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "Laq;")
    private class90 field2827 = new class90();

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field2837 = new Thread(this);

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field2833 = 0;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "Lbj;")
    public static class131 field2830 = new class131(260);

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V", line = 3)
    public final void method1335(byte arg0) {
        field2838++;
        if (this.field2837 == null) {
            return;
        }
        this.method1339(-16711936, new class390());
        int var2 = -70 % ((-arg0 - 12) / 49);
        try {
            this.field2837.join();
        } catch (InterruptedException var3) {
        }
        this.field2837 = null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILjava/lang/String;)Lrn;", line = 24)
    public final class146 method1336(int arg0, String arg1) {
        field2834++;
        if (this.field2837 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class146 var3 = new class146(arg1);
            this.method1339(-16711936, var3);
            if (arg0 <= 21) {
                this.field2837 = null;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBIIIZI)V", line = 45)
    public static final void method1337(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class275.field3829 = arg6;
        class100.field1382 = arg4;
        if (arg1 < 86) {
            method1342(true);
        }
        class42.field615 = arg0;
        field2836++;
        class89.field1239 = arg2;
        class389.field5585 = arg3;
        if (arg5 && class275.field3829 >= 100) {
            class106.field1447 = class389.field5585 * 128 + 64;
            class20.field376 = class89.field1239 * 128 + 64;
            class7.field107 = class285.method1858(class106.field1447, class142.field2034, class20.field376, -87) - class100.field1382;
        }
        class128.field1807 = 2;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 71)
    public static final void method1338(int arg0) {
        class278.field3899++;
        field2832++;
        class46.field648.method1178(63, arg0);
        class46.field648.method173(0, arg0 ^ 0x37);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILpl;)V", line = 81)
    private final void method1339(int arg0, class390 arg1) {
        if (arg0 != -16711936) {
            this.field2837 = null;
        }
        class90 var3 = this.field2827;
        synchronized (this.field2827) {
            this.field2827.method643(arg1, -64);
            this.field2827.notify();
        }
        field2829++;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V", line = 99)
    public static void method1340(byte arg0) {
        if (arg0 >= -115) {
            field2830 = null;
        }
        field2830 = null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;", line = 114)
    public static final String method1341(int arg0, String[] arg1, int arg2, int arg3) {
        field2828++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg1[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            if (arg2 != -12229) {
                field2830 = null;
            }
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!mn", name = "run", descriptor = "()V", line = 179)
    public final void run() {
        field2831++;
        while (true) {
            class90 var1 = this.field2827;
            class146 var3;
            synchronized (this.field2827) {
                class390 var2;
                for (var2 = this.field2827.method633(-119); var2 == null; var2 = this.field2827.method633(-122)) {
                    try {
                        this.field2827.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class146)) {
                    return;
                }
                var3 = (class146) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field2079).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field2078 = var5;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V", line = 218)
    public static final void method1342(boolean arg0) {
        if (class11.field241 >= 0) {
            long var1 = class385.method2442(-6631);
            class11.field241 = (int) ((long) class11.field241 - (var1 - class222.field3102));
            if (class11.field241 <= 0) {
                class99.field1370 = class286.field4036.field1096;
                class7.field112 = class286.field4036.field1086;
                class75.field1075 = class286.field4036.field1091;
                class279.field3917 = class286.field4036.field1082;
                class11.field241 = -1;
                class30.field493 = class286.field4036.field1080;
                class214.field2992 = class286.field4036.field1081;
                class382.field5450 = class286.field4036.field1089;
                class380.field5430 = class286.field4036.field1088;
                class170.field2325 = class286.field4036.field1097;
                class163.field2264 = class286.field4036.field1084;
            } else {
                int var3 = (class11.field241 << 8) / class39.field568;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class99.field1370 = ((class426.field6001 & 0xFF00) * var3 + ((class286.field4036.field1096 & 0xFF00) * var4) & 0xFF0000) + ((class426.field6001 & 0xFF00FF) * var3 + (class286.field4036.field1096 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class30.field493 = (class286.field4036.field1080 - class254.field3584) * var6 + class254.field3584;
                class7.field112 = (class286.field4036.field1086 - class304.field4196) * var6 + class304.field4196;
                class163.field2264 = (class286.field4036.field1084 - class312.field4267) * var6 + class312.field4267;
                class75.field1075 = (class286.field4036.field1091 - class128.field1799) * var6 + class128.field1799;
                class170.field2325 = (class286.field4036.field1097 - class196.field2698) * var6 + class196.field2698;
                class380.field5430 = (class286.field4036.field1088 - class204.field2793) * var6 + class204.field2793;
                class279.field3917 = ((class411.field5831 & 0xFF00FF) * var3 + ((class286.field4036.field1082 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class411.field5831 & 0xFF00) * var3 + ((class286.field4036.field1082 & 0xFF00) * var4) & 0xFF0000) >>> 8;
                class214.field2992 = class395.field5661 * var3 + class286.field4036.field1081 * var4 >> 8;
                if (class255.field3585 != class286.field4036.field1089) {
                    class382.field5450 = class341.field4664.method82(class255.field3585, class286.field4036.field1089, var6, class382.field5450);
                }
            }
            class222.field3102 = var1;
        }
        field2835++;
        if (arg0) {
            field2833 = 34;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V", line = 286)
    public class206() {
        this.field2837.setDaemon(true);
        this.field2837.start();
    }
}
