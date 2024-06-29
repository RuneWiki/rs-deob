import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class178 implements Runnable {

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    private int field2545 = 0;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    private int field2544 = 0;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "Ljava/io/InputStream;")
    private InputStream field2552;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    private int field2542;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "[B")
    private byte[] field2557;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field2547;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "[I")
    public static int[] field2555 = new int[256];

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "Lsq;")
    public static class153 field2558;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "Lci;")
    public static class382 field2554;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "Ljava/io/IOException;")
    private IOException field2550;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
    public final void method1127(byte arg0) {
        this.field2552 = new class239();
        field2556++;
        if (arg0 != 102) {
            method1131((byte) 127);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I[BIZ)I")
    public final int method1128(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        field2549++;
        if (arg2 < 0 || arg0 < 0 || (arg0 + arg2) > arg1.length) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            if (arg3) {
                this.field2547 = null;
            }
            int var6;
            if (this.field2545 < this.field2544) {
                var6 = this.field2545 + this.field2542 - this.field2544;
            } else {
                var6 = this.field2545 - this.field2544;
            }
            if (var6 < arg2) {
                arg2 = var6;
            }
            if (arg2 == 0 && this.field2550 != null) {
                throw new IOException(this.field2550.toString());
            }
            if (this.field2544 + arg2 > this.field2542) {
                int var7 = this.field2542 - this.field2544;
                class416.method2498(this.field2557, this.field2544, arg1, arg0, var7);
                class416.method2498(this.field2557, 0, arg1, arg0 + var7, -var7 + arg2);
            } else {
                class416.method2498(this.field2557, this.field2544, arg1, arg0, arg2);
            }
            this.field2544 = (this.field2544 + arg2) % this.field2542;
            this.notifyAll();
            return arg2;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)Z")
    public final boolean method1129(int arg0, int arg1) throws IOException {
        field2553++;
        if (arg0 >= arg1 || arg1 >= this.field2542) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            int var4;
            if (this.field2545 < this.field2544) {
                var4 = this.field2542 + this.field2545 - this.field2544;
            } else {
                var4 = this.field2545 - this.field2544;
            }
            if (arg1 <= var4) {
                return true;
            } else if (this.field2550 == null) {
                return false;
            } else {
                throw new IOException(this.field2550.toString());
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public final void method1130(int arg0) {
        synchronized (this) {
            if (arg0 != -31384) {
                return;
            }
            if (this.field2550 == null) {
                this.field2550 = new IOException("");
            }
            this.notifyAll();
        }
        field2548++;
        try {
            this.field2547.join();
        } catch (InterruptedException var5) {
        }
    }

    @OriginalMember(owner = "client!eq", name = "run", descriptor = "()V")
    public final void run() {
        field2546++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2550 != null) {
                        return;
                    }
                    if (this.field2544 == 0) {
                        var2 = this.field2542 - this.field2545 - 1;
                    } else if (this.field2544 < this.field2545) {
                        var2 = this.field2542 - this.field2545;
                    } else {
                        var2 = this.field2544 - this.field2545 - 1;
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
                var3 = this.field2552.read(this.field2557, this.field2545, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field2550 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field2545 = (this.field2545 + var3) % this.field2542;
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)V")
    public static void method1131(byte arg0) {
        field2558 = null;
        field2555 = null;
        if (arg0 == 109) {
            field2554 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class178(InputStream arg0, int arg1) {
        this.field2552 = arg0;
        this.field2542 = arg1 + 1;
        this.field2557 = new byte[this.field2542];
        this.field2547 = new Thread(this);
        this.field2547.setDaemon(true);
        this.field2547.start();
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2555[var0] = var1;
        }
    }
}
