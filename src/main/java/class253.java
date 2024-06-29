import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class253 implements Runnable {

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "I")
    private int field3482 = 0;

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
    private int field3485 = 0;

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "I")
    private int field3476;

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "Ljava/io/InputStream;")
    private InputStream field3487;

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "[B")
    private byte[] field3480;

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field3483;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "Ljava/io/IOException;")
    private IOException field3479;

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "[I")
    public static int[] field3481;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1543(int arg0, int arg1, String arg2) {
        field3488++;
        class447.field6127++;
        class583 var3 = class381.method2246(arg1, class128.field2105, class204.field3057);
        var3.field7637.method3823(-55, arg1 + class419.method2429(true, arg2));
        var3.field7637.method3795(arg2, (byte) -85);
        var3.field7637.method3823(-66, arg0);
        class42.method309(var3, 0);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
    public static void method1544(int arg0) {
        if (arg0 > -57) {
            method1543(63, 71, null);
        }
        field3481 = null;
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V")
    public final void method1545(int arg0) {
        if (arg0 > -82) {
            this.field3487 = null;
        }
        field3484++;
        this.field3487 = new class136();
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "(I)V")
    public final void method1546(int arg0) {
        field3486++;
        if (arg0 > -96) {
            return;
        }
        synchronized (this) {
            if (this.field3479 == null) {
                this.field3479 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3483.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!gca", name = "run", descriptor = "()V")
    public final void run() {
        field3475++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3479 != null) {
                        return;
                    }
                    if (this.field3482 == 0) {
                        var2 = this.field3476 - this.field3485 - 1;
                    } else if (this.field3482 < this.field3485) {
                        var2 = this.field3476 - this.field3485;
                    } else {
                        var2 = this.field3482 - this.field3485 - 1;
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
                var3 = this.field3487.read(this.field3480, this.field3485, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field3479 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field3485 = (this.field3485 + var3) % this.field3476;
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "([BZII)I")
    public final int method1547(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        if (!arg1) {
            method1544(79);
        }
        field3478++;
        if (arg2 < 0 || arg3 < 0 || (arg3 + arg2) > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field3485 >= this.field3482) {
                var6 = this.field3485 - this.field3482;
            } else {
                var6 = this.field3476 - (this.field3482 - this.field3485);
            }
            if (arg2 > var6) {
                arg2 = var6;
            }
            if (arg2 == 0 && this.field3479 != null) {
                throw new IOException(this.field3479.toString());
            }
            if (this.field3476 >= this.field3482 + arg2) {
                class335.method2020(this.field3480, this.field3482, arg0, arg3, arg2);
            } else {
                int var7 = this.field3476 - this.field3482;
                class335.method2020(this.field3480, this.field3482, arg0, arg3, var7);
                class335.method2020(this.field3480, 0, arg0, arg3 + var7, arg2 - var7);
            }
            this.field3482 = (this.field3482 + arg2) % this.field3476;
            this.notifyAll();
            return arg2;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)Z")
    public final boolean method1548(int arg0, int arg1) throws IOException {
        field3477++;
        if (arg0 <= ~arg1 || arg1 >= this.field3476) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field3485 < this.field3482) {
                var4 = this.field3476 + this.field3485 - this.field3482;
            } else {
                var4 = this.field3485 - this.field3482;
            }
            if (var4 >= arg1) {
                return true;
            } else if (this.field3479 == null) {
                return false;
            } else {
                throw new IOException(this.field3479.toString());
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class253(InputStream arg0, int arg1) {
        this.field3476 = arg1 + 1;
        this.field3487 = arg0;
        this.field3480 = new byte[this.field3476];
        this.field3483 = new Thread(this);
        this.field3483.setDaemon(true);
        this.field3483.start();
    }
}
