import java.awt.Rectangle;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class210 implements Runnable {

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    private int field2943 = 0;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    private int field2942 = 0;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "Ljava/io/InputStream;")
    private InputStream field2946;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    private int field2930;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "[B")
    private byte[] field2947;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field2941;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field2933 = new Rectangle[100];

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Z")
    public static boolean field2934 = false;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Ljava/io/IOException;")
    private IOException field2945;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "[Lf;")
    public static class702[] field2948;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public final void method1387(boolean arg0) {
        field2931++;
        this.field2946 = new class529();
        if (!arg0) {
            this.method1387(true);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lpu;Lft;I)V")
    public static final void method1388(class522 arg0, class4 arg1, int arg2) {
        class363.field5182 = arg1;
        if (arg2 != 2574) {
            field2948 = null;
        }
        class374.field5333 = "";
        class451.field6502 = arg0;
        field2940++;
        if (class174.field2478.startsWith("win")) {
            class374.field5333 = class374.field5333 + "windows/";
        } else if (class174.field2478.startsWith("linux")) {
            class374.field5333 = class374.field5333 + "linux/";
        } else if (class174.field2478.startsWith("mac")) {
            class374.field5333 = class374.field5333 + "macos/";
        }
        if (class363.field5182.field47) {
            class374.field5333 = class374.field5333 + "msjava/";
        } else if (class174.field2475.startsWith("amd64") || class174.field2475.startsWith("x86_64")) {
            class374.field5333 = class374.field5333 + "x86_64/";
        } else if (class174.field2475.startsWith("i386") || class174.field2475.startsWith("i486") || class174.field2475.startsWith("i586") || class174.field2475.startsWith("x86")) {
            class374.field5333 = class374.field5333 + "x86/";
        } else if (class174.field2475.startsWith("ppc")) {
            class374.field5333 = class374.field5333 + "ppc/";
        } else {
            class374.field5333 = class374.field5333 + "universal/";
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)Z")
    public final boolean method1389(byte arg0, int arg1) throws IOException {
        field2937++;
        if (arg1 <= 0 || this.field2930 <= arg1) {
            throw new IOException();
        }
        synchronized (this) {
            int var4 = -121 / ((arg0 + 59) / 40);
            int var5;
            if (this.field2942 >= this.field2943) {
                var5 = this.field2942 - this.field2943;
            } else {
                var5 = this.field2942 + this.field2930 - this.field2943;
            }
            if (var5 >= arg1) {
                return true;
            } else if (this.field2945 == null) {
                return false;
            } else {
                throw new IOException(this.field2945.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Z")
    public static final boolean method1390(int arg0, int arg1, int arg2) {
        if (arg2 > -49) {
            field2948 = null;
        }
        field2939++;
        return class633.method3530(arg1, (byte) 91, arg0) | (arg1 & 0x70000) != 0 || class309.method1966(arg1, -8614, arg0);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILpu;I)Los;")
    public static final class406 method1391(int arg0, class522 arg1, int arg2) {
        field2935++;
        if (arg0 == -1) {
            byte[] var3 = arg1.method2994(arg2, (byte) 93);
            return var3 == null ? null : new class406(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI[B)I")
    public final int method1392(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field2932++;
        if (arg2 < 0 || arg0 < 0 || arg3.length < (arg0 + arg2)) {
            throw new IOException();
        }
        synchronized (this) {
            if (arg1 != -46) {
                return -43;
            }
            int var7;
            if (this.field2942 < this.field2943) {
                var7 = this.field2930 + this.field2942 - this.field2943;
            } else {
                var7 = this.field2942 - this.field2943;
            }
            if (var7 < arg2) {
                arg2 = var7;
            }
            if (arg2 == 0 && this.field2945 != null) {
                throw new IOException(this.field2945.toString());
            }
            if (this.field2943 + arg2 <= this.field2930) {
                class476.method2792(this.field2947, this.field2943, arg3, arg0, arg2);
            } else {
                int var8 = this.field2930 - this.field2943;
                class476.method2792(this.field2947, this.field2943, arg3, arg0, var8);
                class476.method2792(this.field2947, 0, arg3, arg0 + var8, -var8 + arg2);
            }
            this.field2943 = (this.field2943 + arg2) % this.field2930;
            this.notifyAll();
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ec", name = "run", descriptor = "()V")
    public final void run() {
        field2938++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2945 != null) {
                        return;
                    }
                    if (this.field2943 == 0) {
                        var2 = this.field2930 - (this.field2942 + 1);
                    } else if (this.field2942 <= this.field2943) {
                        var2 = this.field2943 - this.field2942 - 1;
                    } else {
                        var2 = this.field2930 - this.field2942;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            int var3;
            try {
                var3 = this.field2946.read(this.field2947, this.field2942, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field2945 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field2942 = (this.field2942 + var3) % this.field2930;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public final void method1393(int arg0) {
        synchronized (this) {
            if (this.field2945 == null) {
                this.field2945 = new IOException("");
            }
            this.notifyAll();
        }
        field2944++;
        if (arg0 < 51) {
            this.field2946 = null;
        }
        try {
            this.field2941.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class210(InputStream arg0, int arg1) {
        this.field2946 = arg0;
        this.field2930 = arg1 + 1;
        this.field2947 = new byte[this.field2930];
        this.field2941 = new Thread(this);
        this.field2941.setDaemon(true);
        this.field2941.start();
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
    public static void method1394(boolean arg0) {
        if (!arg0) {
            field2933 = null;
        }
        field2948 = null;
        field2933 = null;
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field2933[var0] = new Rectangle();
        }
    }
}
