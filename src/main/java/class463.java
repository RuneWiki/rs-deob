import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class463 implements Runnable {

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
    private int field6376 = 0;

    @OriginalMember(owner = "client!eaa", name = "p", descriptor = "I")
    private int field6385 = 0;

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "I")
    private int field6377;

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field6383;

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "[B")
    private byte[] field6381;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field6372;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "Lem;")
    public static class206 field6374 = new class206(56, -1);

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "I")
    public static int field6380 = 1;

    @OriginalMember(owner = "client!eaa", name = "o", descriptor = "Z")
    public static boolean field6384 = false;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "Lsea;")
    public static class648 field6382;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "Ljava/io/IOException;")
    private IOException field6371;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)Z", line = 8)
    public final boolean method2618(int arg0, int arg1) throws IOException {
        field6378++;
        if (arg0 <= arg1 || this.field6377 <= arg0) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field6385 < this.field6376) {
                var4 = this.field6377 + this.field6385 - this.field6376;
            } else {
                var4 = this.field6385 - this.field6376;
            }
            if (arg0 <= var4) {
                return true;
            } else if (this.field6371 == null) {
                return false;
            } else {
                throw new IOException(this.field6371.toString());
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "run", descriptor = "()V", line = 44)
    public final void run() {
        field6373++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field6371 != null) {
                        return;
                    }
                    if (this.field6376 == 0) {
                        var2 = this.field6377 - (this.field6385 + 1);
                    } else if (this.field6376 < this.field6385) {
                        var2 = this.field6377 - this.field6385;
                    } else {
                        var2 = this.field6376 - (this.field6385 + 1);
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
                var3 = this.field6383.read(this.field6381, this.field6385, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field6371 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field6385 = (this.field6385 + var3) % this.field6377;
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V", line = 104)
    public final void method2619(int arg0) {
        field6375++;
        synchronized (this) {
            if (this.field6371 == null) {
                this.field6371 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field6372.join();
            if (arg0 != 0) {
                this.field6371 = null;
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V", line = 127)
    public final void method2620(byte arg0) {
        field6379++;
        if (arg0 < 27) {
            this.field6383 = null;
        }
        this.field6383 = new class409();
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 209)
    public class463(InputStream arg0, int arg1) {
        this.field6377 = arg1 + 1;
        this.field6383 = arg0;
        this.field6381 = new byte[this.field6377];
        this.field6372 = new Thread(this);
        this.field6372.setDaemon(true);
        this.field6372.start();
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V", line = 144)
    public static void method2621(int arg0) {
        field6382 = null;
        field6374 = null;
        int var1 = -101 % ((arg0 + 6) / 55);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IBI[B)I", line = 160)
    public final int method2622(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field6370++;
        if (arg0 < 0 || arg2 < 0 || arg3.length < (arg0 + arg2)) {
            throw new IOException();
        }
        synchronized (this) {
            if (arg1 < 47) {
                field6380 = 92;
            }
            int var6;
            if (this.field6385 < this.field6376) {
                var6 = this.field6385 + this.field6377 - this.field6376;
            } else {
                var6 = this.field6385 - this.field6376;
            }
            if (var6 < arg0) {
                arg0 = var6;
            }
            if (arg0 == 0 && this.field6371 != null) {
                throw new IOException(this.field6371.toString());
            }
            if (this.field6377 >= this.field6376 + arg0) {
                class359.method2053(this.field6381, this.field6376, arg3, arg2, arg0);
            } else {
                int var7 = this.field6377 - this.field6376;
                class359.method2053(this.field6381, this.field6376, arg3, arg2, var7);
                class359.method2053(this.field6381, 0, arg3, arg2 + var7, -var7 + arg0);
            }
            this.field6376 = (this.field6376 + arg0) % this.field6377;
            this.notifyAll();
            return arg0;
        }
    }
}
