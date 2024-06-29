import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class248 implements Runnable {

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "Lql;")
    private class346 field3349 = new class346();

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public int field3351 = 0;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "Z")
    private boolean field3353 = false;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field3352;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "[S")
    public static short[] field3337 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public static int field3343 = 999999;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "Lh;")
    public static class427 field3336;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "[[[B")
    public static byte[][][] field3341;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lv;II[B)Lmn;")
    public final class78 method1492(class241 arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 <= 60) {
            return null;
        }
        field3339++;
        class78 var5 = new class78();
        var5.field2962 = (long) arg2;
        var5.field1100 = arg3;
        var5.field49 = false;
        var5.field1097 = 2;
        var5.field1095 = arg0;
        this.method1497(75, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public static final void method1493(int arg0) {
        if (arg0 != 1) {
            method1498((byte) 29);
        }
        for (class365 var1 = (class365) class185.field2509.method332(arg0 - 2130841185); var1 != null; var1 = (class365) class185.field2509.method343((byte) -111)) {
            if (var1.field5282) {
                var1.method2382((byte) 122);
            }
        }
        field3348++;
        for (class365 var2 = (class365) class22.field291.method332(-2130841184); var2 != null; var2 = (class365) class22.field291.method343((byte) -125)) {
            if (var2.field5282) {
                var2.method2382((byte) 3);
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
    public static final void method1494(String arg0, int arg1, Throwable arg2) {
        field3350++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class98.method668(arg2, (byte) 95);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class403.method2599(31991, var3);
            String var4 = class135.method850((byte) -104, ":", "%3a", var3);
            String var5 = class135.method850((byte) -109, "@", "%40", var4);
            String var6 = class135.method850((byte) -127, "&", "%26", var5);
            String var7 = class135.method850((byte) 35, "#", "%23", var6);
            if (class420.field6210.field519 != null) {
                int var8 = 113 % ((arg1 - 27) / 42);
                class429 var9 = class420.field6210.method249(new URL(class420.field6210.field519.getCodeBase(), "clienterror.ws?c=" + class359.field5185 + "&u=" + class59.field795 + "&v1=" + class36.field507 + "&v2=" + class36.field518 + "&e=" + var7), -84);
                while (var9.field6308 == 0) {
                    class144.method918(1L, true);
                }
                if (var9.field6308 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field6309;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ro", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field3353) {
            class346 var1 = this.field3349;
            class78 var2;
            synchronized (this.field3349) {
                var2 = (class78) this.field3349.method2246((byte) -118);
                if (var2 == null) {
                    try {
                        this.field3349.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3351--;
            }
            try {
                if (var2.field1097 == 2) {
                    var2.field1095.method1451(var2.field1100, (int) var2.field2962, 8926, var2.field1100.length);
                } else if (var2.field1097 == 3) {
                    var2.field1100 = var2.field1095.method1447(-376026200, (int) var2.field2962);
                }
            } catch (Exception var6) {
                method1494((String) null, -19, var6);
            }
            var2.field50 = false;
        }
        field3345++;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZILv;)Lmn;")
    public final class78 method1495(boolean arg0, int arg1, class241 arg2) {
        field3347++;
        class78 var4 = new class78();
        var4.field49 = arg0;
        var4.field1095 = arg2;
        var4.field2962 = (long) arg1;
        var4.field1097 = 3;
        this.method1497(121, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
    public static void method1496(int arg0) {
        field3341 = null;
        field3337 = null;
        if (arg0 <= 86) {
            method1494((String) null, 58, (Throwable) null);
        }
        field3336 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILmn;)V")
    private final void method1497(int arg0, class78 arg1) {
        class346 var3 = this.field3349;
        synchronized (this.field3349) {
            this.field3349.method2245(arg1, (byte) -123);
            this.field3351++;
            this.field3349.notifyAll();
        }
        field3346++;
        if (arg0 < 10) {
            field3341 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)I")
    public static final int method1498(byte arg0) {
        field3342++;
        int var1 = 28 % ((84 - arg0) / 36);
        return class363.field5247;
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V")
    public final void method1499(int arg0) {
        field3340++;
        this.field3353 = true;
        class346 var2 = this.field3349;
        synchronized (this.field3349) {
            this.field3349.notifyAll();
        }
        if (arg0 != -22304) {
            this.field3352 = null;
        }
        try {
            this.field3352.join();
        } catch (InterruptedException var3) {
        }
        this.field3352 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BILv;)Lmn;")
    public final class78 method1500(byte arg0, int arg1, class241 arg2) {
        field3344++;
        class78 var4 = new class78();
        var4.field1097 = 1;
        class346 var5 = this.field3349;
        synchronized (this.field3349) {
            class78 var6 = (class78) this.field3349.method2250(arg0 ^ 0xFFFFF9F1);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field2962 && var6.field1095 == arg2 && var6.field1097 == 2) {
                    var4.field50 = false;
                    var4.field1100 = var6.field1100;
                    return var4;
                }
                var6 = (class78) this.field3349.method2244(0);
            }
        }
        var4.field1100 = arg2.method1447(-376026200, arg1);
        if (arg0 == -35) {
            var4.field49 = true;
            var4.field50 = false;
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lwd;)V")
    public class248(class36 arg0) {
        class429 var2 = arg0.method242(this, (byte) -102, 5);
        while (var2.field6308 == 0) {
            class144.method918(10L, true);
        }
        if (var2.field6308 == 2) {
            throw new RuntimeException();
        }
        this.field3352 = (Thread) var2.field6309;
    }
}
