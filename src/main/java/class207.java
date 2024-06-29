import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class207 implements Runnable {

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    private int field3166 = 0;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    private int field3171 = 0;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "Ljava/io/InputStream;")
    private InputStream field3168;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    private int field3167;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "[B")
    private byte[] field3165;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field3174;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "Lsc;")
    public static class320 field3170 = new class320();

    @OriginalMember(owner = "client!em", name = "k", descriptor = "Lsk;")
    public static class578 field3172 = new class578();

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public static int field3176 = 2;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Ljava/io/IOException;")
    private IOException field3164;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
    public final void method1453(int arg0) {
        if (arg0 <= 49) {
            this.method1453(25);
        }
        field3169++;
        this.field3168 = new class78();
    }

    @OriginalMember(owner = "client!em", name = "run", descriptor = "()V")
    public final void run() {
        field3163++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3164 != null) {
                        return;
                    }
                    if (this.field3166 == 0) {
                        var2 = this.field3167 - this.field3171 - 1;
                    } else if (this.field3166 < this.field3171) {
                        var2 = this.field3167 - this.field3171;
                    } else {
                        var2 = this.field3166 - this.field3171 - 1;
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
                var3 = this.field3168.read(this.field3165, this.field3171, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field3164 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field3171 = (this.field3171 + var3) % this.field3167;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Z")
    public final boolean method1454(int arg0, int arg1) throws IOException {
        if (arg0 != -7053) {
            method1457(101);
        }
        field3162++;
        if (arg1 <= 0 || arg1 >= this.field3167) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field3171 >= this.field3166) {
                var4 = this.field3171 - this.field3166;
            } else {
                var4 = this.field3167 + this.field3171 - this.field3166;
            }
            if (arg1 <= var4) {
                return true;
            } else if (this.field3164 == null) {
                return false;
            } else {
                throw new IOException(this.field3164.toString());
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I[BII)I")
    public final int method1455(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3173++;
        if (arg2 < arg3 || arg0 < 0 || arg0 + arg2 > arg1.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field3166 > this.field3171) {
                var6 = this.field3171 + this.field3167 - this.field3166;
            } else {
                var6 = this.field3171 - this.field3166;
            }
            if (var6 < arg2) {
                arg2 = var6;
            }
            if (arg2 == 0 && this.field3164 != null) {
                throw new IOException(this.field3164.toString());
            }
            if ((this.field3166 + arg2) <= this.field3167) {
                class692.method3873(this.field3165, this.field3166, arg1, arg0, arg2);
            } else {
                int var7 = this.field3167 - this.field3166;
                class692.method3873(this.field3165, this.field3166, arg1, arg0, var7);
                class692.method3873(this.field3165, 0, arg1, arg0 + var7, -var7 + arg2);
            }
            this.field3166 = (this.field3166 + arg2) % this.field3167;
            this.notifyAll();
            return arg2;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
    public final void method1456(int arg0) {
        field3175++;
        synchronized (this) {
            if (this.field3164 == null) {
                this.field3164 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3174.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 > -9) {
            field3176 = -24;
        }
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(I)V")
    public static void method1457(int arg0) {
        field3170 = null;
        field3172 = null;
        if (arg0 != -1) {
            field3176 = -55;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class207(InputStream arg0, int arg1) {
        this.field3168 = arg0;
        this.field3167 = arg1 + 1;
        this.field3165 = new byte[this.field3167];
        this.field3174 = new Thread(this);
        this.field3174.setDaemon(true);
        this.field3174.start();
    }
}
