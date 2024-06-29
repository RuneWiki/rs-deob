import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class198 implements Runnable {

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Lbb;")
    private class270 field2342 = new class270();

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field2341 = new Thread(this);

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Z")
    public static volatile boolean field2337 = false;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "[I")
    public static int[] field2338;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 5)
    public final void method1220(byte arg0) {
        field2344++;
        if (this.field2341 == null) {
            return;
        }
        this.method1222(new class43(), false);
        try {
            this.field2341.join();
        } catch (InterruptedException var2) {
        }
        this.field2341 = null;
        if (arg0 != 9) {
            field2338 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 25)
    public static void method1221(int arg0) {
        if (arg0 == 59) {
            field2338 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lpn;Z)V", line = 35)
    private final void method1222(class43 arg0, boolean arg1) {
        class270 var3 = this.field2342;
        synchronized (this.field2342) {
            if (arg1) {
                return;
            }
            this.field2342.method1696(arg1, arg0);
            this.field2342.notify();
        }
        field2336++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLjava/lang/String;)Lvh;", line = 53)
    public final class168 method1223(boolean arg0, String arg1) {
        field2340++;
        if (this.field2341 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class168 var3 = new class168(arg1);
            this.method1222(var3, arg0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "run", descriptor = "()V", line = 72)
    public final void run() {
        field2343++;
        while (true) {
            class270 var1 = this.field2342;
            class168 var3;
            synchronized (this.field2342) {
                class43 var2;
                for (var2 = this.field2342.method1688(105); var2 == null; var2 = this.field2342.method1688(109)) {
                    try {
                        this.field2342.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class168)) {
                    return;
                }
                var3 = (class168) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field1966).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field1962 = var5;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 231)
    public class198() {
        this.field2341.setDaemon(true);
        this.field2341.start();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V", line = 121)
    public static final void method1224(byte arg0, int arg1) {
        field2345++;
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        class244.field3244 = arg1;
        if (arg0 > -106) {
            method1224((byte) -119, 126);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLjava/lang/String;)V", line = 135)
    public static final void method1225(byte arg0, String arg1) {
        field2339++;
        if (arg1 == null) {
            return;
        }
        if (!(class332.field4536 < 100 || class316.field4246) || class332.field4536 >= 200) {
            class134.method876((byte) -111, class278.field3609.method434(class373.field5057, -8192));
            return;
        }
        String var2 = class405.method2524((byte) 93, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class332.field4536; var3++) {
            String var7 = class405.method2524((byte) -92, class107.field1275[var3]);
            if (var7 != null && var7.equals(var2)) {
                class134.method876((byte) -111, arg1 + class266.field3425.method434(class373.field5057, -8192));
                return;
            }
            if (class300.field4007[var3] != null) {
                String var8 = class405.method2524((byte) 68, class300.field4007[var3]);
                if (var8 != null && var8.equals(var2)) {
                    class134.method876((byte) -111, arg1 + class266.field3425.method434(class373.field5057, -8192));
                    return;
                }
            }
        }
        if (arg0 <= 44) {
            field2337 = true;
        }
        for (int var4 = 0; var4 < class368.field5019; var4++) {
            String var5 = class405.method2524((byte) 110, class319.field4290[var4]);
            if (var5 != null && var5.equals(var2)) {
                class134.method876((byte) -111, class223.field2797.method434(class373.field5057, -8192) + arg1 + class115.field1327.method434(class373.field5057, -8192));
                return;
            }
            if (class89.field1026[var4] != null) {
                String var6 = class405.method2524((byte) 92, class89.field1026[var4]);
                if (var6 != null && var6.equals(var2)) {
                    class134.method876((byte) -111, class223.field2797.method434(class373.field5057, -8192) + arg1 + class115.field1327.method434(class373.field5057, -8192));
                    return;
                }
            }
        }
        if (class405.method2524((byte) 89, class143.field1684.field1480).equals(var2)) {
            class134.method876((byte) -111, class252.field3299.method434(class373.field5057, -8192));
        } else {
            class427.field5837.method2162(false, 59);
            class358.field4858++;
            class427.field5837.method1593(class350.method2229(2, arg1), -102);
            class427.field5837.method1562(-103, arg1);
        }
    }
}
