import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class290 implements Runnable {

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    private int field4090 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    private int field4083 = 0;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field4092;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    private int field4098;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "[B")
    private byte[] field4094;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field4096;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "J")
    public static long field4097 = 0L;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Ljava/io/IOException;")
    private IOException field4088;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "[Lnj;")
    public static class244[] field4085;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static final void method1892(boolean arg0) {
        if (arg0) {
            method1897(-98, (byte) 121, -38);
        }
        field4093++;
        if (class689.field9409 != null) {
            try {
                class689.field9409.close();
            } catch (IOException var1) {
            }
        }
        class689.field9409 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)V")
    public final void method1893(boolean arg0) {
        if (!arg0) {
            method1892(true);
        }
        synchronized (this) {
            if (this.field4088 == null) {
                this.field4088 = new IOException("");
            }
            this.notifyAll();
        }
        field4095++;
        try {
            this.field4096.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!sb", name = "run", descriptor = "()V")
    public final void run() {
        field4084++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4088 != null) {
                        return;
                    }
                    if (this.field4083 == 0) {
                        var2 = this.field4098 - this.field4090 - 1;
                    } else if (this.field4083 >= this.field4090) {
                        var2 = this.field4083 - this.field4090 - 1;
                    } else {
                        var2 = this.field4098 - this.field4090;
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
                var3 = this.field4092.read(this.field4094, this.field4090, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field4088 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field4090 = (this.field4090 + var3) % this.field4098;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)Z")
    public final boolean method1894(int arg0, byte arg1) throws IOException {
        field4086++;
        if (arg1 != 64) {
            method1898(121);
        }
        if (arg0 <= 0 || this.field4098 <= arg0) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field4090 < this.field4083) {
                var4 = this.field4090 + this.field4098 - this.field4083;
            } else {
                var4 = this.field4090 - this.field4083;
            }
            if (var4 >= arg0) {
                return true;
            } else if (this.field4088 == null) {
                return false;
            } else {
                throw new IOException(this.field4088.toString());
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[BII)I")
    public final int method1895(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4087++;
        if (arg0 < 0 || arg3 < 0 || arg0 + arg3 > arg1.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field4083 <= this.field4090) {
                var6 = this.field4090 - this.field4083;
            } else {
                var6 = this.field4098 + this.field4090 - this.field4083;
            }
            if (var6 < arg0) {
                arg0 = var6;
            }
            if (arg0 == 0 && this.field4088 != null) {
                throw new IOException(this.field4088.toString());
            } else if (arg2 == -19518) {
                if ((this.field4083 + arg0) > this.field4098) {
                    int var8 = this.field4098 - this.field4083;
                    class255.method1690(this.field4094, this.field4083, arg1, arg3, var8);
                    class255.method1690(this.field4094, 0, arg1, arg3 + var8, -var8 + arg0);
                } else {
                    class255.method1690(this.field4094, this.field4083, arg1, arg3, arg0);
                }
                this.field4083 = (this.field4083 + arg0) % this.field4098;
                this.notifyAll();
                return arg0;
            } else {
                return 9;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public final void method1896(byte arg0) {
        if (arg0 != 48) {
            this.method1893(true);
        }
        field4089++;
        this.field4092 = new class415();
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1897(int arg0, byte arg1, int arg2) {
        field4091++;
        if (arg1 > -120) {
            return false;
        } else {
            return class458.method2722(true, arg0, arg2) | (arg2 & 0x60000) != 0 || class60.method511(24121, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method1898(int arg0) {
        if (arg0 != 0) {
            field4085 = null;
        }
        field4085 = null;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class290(InputStream arg0, int arg1) {
        this.field4092 = arg0;
        this.field4098 = arg1 + 1;
        this.field4094 = new byte[this.field4098];
        this.field4096 = new Thread(this);
        this.field4096.setDaemon(true);
        this.field4096.start();
    }
}
