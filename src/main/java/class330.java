import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class330 implements Runnable {

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    private int field4386 = 0;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    private int field4388 = 0;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    private int field4399;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field4394;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "[B")
    private byte[] field4392;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field4396;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "[I")
    public static int[] field4398 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Lwo;")
    public static class690 field4397 = new class690(94, 11);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Ljava/io/IOException;")
    private IOException field4390;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[BIB)I")
    public final int method1913(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field4395++;
        if (arg0 < 0 || arg2 < 0 || arg0 + arg2 > arg1.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field4388 <= this.field4386) {
                var6 = this.field4386 - this.field4388;
            } else {
                var6 = this.field4399 + this.field4386 - this.field4388;
            }
            if (arg3 != 69) {
                field4397 = null;
            }
            if (var6 < arg0) {
                arg0 = var6;
            }
            if (arg0 == 0 && this.field4390 != null) {
                throw new IOException(this.field4390.toString());
            }
            if (this.field4399 >= (this.field4388 + arg0)) {
                class252.method1545(this.field4392, this.field4388, arg1, arg2, arg0);
            } else {
                int var7 = this.field4399 - this.field4388;
                class252.method1545(this.field4392, this.field4388, arg1, arg2, var7);
                class252.method1545(this.field4392, 0, arg1, arg2 + var7, -var7 + arg0);
            }
            this.field4388 = (this.field4388 + arg0) % this.field4399;
            this.notifyAll();
            return arg0;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)Z")
    public final boolean method1914(boolean arg0, int arg1) throws IOException {
        field4385++;
        if (arg1 <= 0 || arg1 >= this.field4399) {
            throw new IOException();
        }
        synchronized (this) {
            if (!arg0) {
                return false;
            }
            int var5;
            if (this.field4386 < this.field4388) {
                var5 = this.field4386 + this.field4399 - this.field4388;
            } else {
                var5 = this.field4386 - this.field4388;
            }
            if (arg1 <= var5) {
                return true;
            } else if (this.field4390 == null) {
                return false;
            } else {
                throw new IOException(this.field4390.toString());
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method1915(int arg0) {
        if (arg0 != -1) {
            field4398 = null;
        }
        field4397 = null;
        field4398 = null;
    }

    @OriginalMember(owner = "client!vh", name = "run", descriptor = "()V")
    public final void run() {
        field4389++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4390 != null) {
                        return;
                    }
                    if (this.field4388 == 0) {
                        var2 = this.field4399 - this.field4386 - 1;
                    } else if (this.field4388 < this.field4386) {
                        var2 = this.field4399 - this.field4386;
                    } else {
                        var2 = this.field4388 - this.field4386 - 1;
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
                var3 = this.field4394.read(this.field4392, this.field4386, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field4390 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field4386 = (this.field4386 + var3) % this.field4399;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
    public final void method1916(boolean arg0) {
        synchronized (this) {
            if (this.field4390 == null) {
                this.field4390 = new IOException("");
            }
            if (!arg0) {
                return;
            }
            this.notifyAll();
        }
        field4391++;
        try {
            this.field4396.join();
        } catch (InterruptedException var5) {
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public final void method1917(int arg0) {
        field4387++;
        this.field4394 = new class288();
        if (arg0 != 5) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class330(InputStream arg0, int arg1) {
        this.field4399 = arg1 + 1;
        this.field4394 = arg0;
        this.field4392 = new byte[this.field4399];
        this.field4396 = new Thread(this);
        this.field4396.setDaemon(true);
        this.field4396.start();
    }
}
