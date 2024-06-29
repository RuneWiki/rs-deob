import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class297 implements Runnable {

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "Lhga;")
    private class158 field4449 = new class158();

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field4452 = new Thread(this);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "[I")
    public static int[] field4442 = new int[14];

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "Lfu;")
    public static class360 field4450;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Liga;B)V")
    private final void method1972(class425 arg0, byte arg1) {
        if (arg1 != -77) {
            field4450 = null;
        }
        field4446++;
        class158 var3 = this.field4449;
        synchronized (this.field4449) {
            this.field4449.method1229(arg0, (byte) 120);
            this.field4449.notify();
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
    public static final String method1973(int arg0, int arg1, byte[] arg2, int arg3) {
        field4445++;
        char[] var4 = new char[arg3];
        int var5 = arg0;
        int var6 = arg1 + arg3;
        for (int var7 = arg1; var7 < var6; var7++) {
            int var8 = arg2[var7] & 0xFF;
            if (var8 < 128) {
                var4[var5++] = (char) var8;
            } else if (var8 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
            } else if (var8 >= 224) {
                if (var8 >= 240) {
                    if (var8 < 244) {
                        throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                }
                if (var6 <= var7 + 2) {
                    throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                }
                var7++;
                int var9 = arg2[var7] & 0xFF;
                if (var9 < 128 || var9 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                }
                var7++;
                int var10 = arg2[var7] & 0xFF;
                if (var10 < 128 || var10 > 191) {
                    throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class2.method189(class481.method2919(var10, -129), class2.method189(class481.method2919(-921600, var8 << 12), class481.method2919(var9 << 6, -8256)));
            } else if (var6 > var7 + 1) {
                var7++;
                int var11 = arg2[var7] & 0xFF;
                if (var11 < 128 || var11 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class2.method189(class481.method2919(-12352, var8 << 6), class481.method2919(-129, var11));
            } else {
                throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;Z)Laea;")
    public final class47 method1974(String arg0, boolean arg1) {
        if (!arg1) {
            method1975((byte) -107);
        }
        field4444++;
        if (this.field4452 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class47 var3 = new class47(arg0);
            this.method1972(var3, (byte) -77);
            return var3;
        }
    }

    @OriginalMember(owner = "client!fp", name = "run", descriptor = "()V")
    public final void run() {
        field4451++;
        while (true) {
            class158 var1 = this.field4449;
            class47 var3;
            synchronized (this.field4449) {
                class425 var2;
                for (var2 = this.field4449.method1226(0); var2 == null; var2 = this.field4449.method1226(0)) {
                    try {
                        this.field4449.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class47)) {
                    return;
                }
                var3 = (class47) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field1137).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field1143 = var5;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
    public static void method1975(byte arg0) {
        field4450 = null;
        field4442 = null;
        if (arg0 > -115) {
            method1973(42, -32, null, -25);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)Z")
    public static final boolean method1976(int arg0, int arg1, int arg2) {
        if (arg2 >= -85) {
            return true;
        } else {
            field4447++;
            return class581.method3335((byte) 119, arg0, arg1) | (arg1 & 0x70000) != 0 || class102.method954(arg0, 7325, arg1);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    public final void method1977(int arg0) {
        field4443++;
        if (this.field4452 == null) {
            return;
        }
        this.method1972(new class425(), (byte) -77);
        try {
            this.field4452.join();
        } catch (InterruptedException var2) {
        }
        if (arg0 != -921600) {
            field4442 = null;
        }
        this.field4452 = null;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
    public class297() {
        this.field4452.setDaemon(true);
        this.field4452.start();
    }
}
