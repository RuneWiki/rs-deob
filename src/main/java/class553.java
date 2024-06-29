import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class553 implements Runnable {

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    private int field7495 = 0;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    private int field7499 = 0;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    private int field7498;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field7493;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "[B")
    private byte[] field7497;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field7491;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Lrg;")
    public static class588 field7492 = new class588(0);

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Lfc;")
    public static class235 field7503 = new class235(78, -2);

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Ljava/io/IOException;")
    private IOException field7496;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method3038(int arg0) {
        field7503 = null;
        field7492 = null;
        if (arg0 != 1) {
            field7503 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III[B)V")
    public final void method3039(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field7500++;
        if (arg0 < 0 || arg2 < 0 || arg0 + arg2 > arg3.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field7496 != null) {
                throw new IOException(this.field7496.toString());
            }
            int var6;
            if (this.field7495 >= this.field7499) {
                var6 = this.field7498 + this.field7499 - this.field7495 - 1;
            } else {
                var6 = this.field7499 - (this.field7495 + 1);
            }
            if (arg1 != -2) {
                this.method3040((byte) -62);
            }
            if (var6 < arg0) {
                throw new IOException("");
            }
            if (this.field7495 + arg0 <= this.field7498) {
                class282.method1706(arg3, arg2, this.field7497, this.field7495, arg0);
            } else {
                int var7 = this.field7498 - this.field7495;
                class282.method1706(arg3, arg2, this.field7497, this.field7495, var7);
                class282.method1706(arg3, arg2 + var7, this.field7497, 0, arg0 - var7);
            }
            this.field7495 = (this.field7495 + arg0) % this.field7498;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public final void method3040(byte arg0) {
        field7494++;
        synchronized (this) {
            if (this.field7496 == null) {
                this.field7496 = new IOException("");
            }
            if (arg0 != -82) {
                this.field7493 = null;
            }
            this.notifyAll();
        }
        try {
            this.field7491.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
    public final void method3041(byte arg0) {
        if (arg0 == -67) {
            field7501++;
            this.field7493 = new class240();
        }
    }

    @OriginalMember(owner = "client!cf", name = "run", descriptor = "()V")
    public final void run() {
        field7502++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field7496 != null) {
                        return;
                    }
                    if (this.field7499 <= this.field7495) {
                        var2 = this.field7495 - this.field7499;
                    } else {
                        var2 = this.field7498 + this.field7495 - this.field7499;
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
            try {
                if (this.field7498 < (this.field7499 + var2)) {
                    int var3 = this.field7498 - this.field7499;
                    this.field7493.write(this.field7497, this.field7499, var3);
                    this.field7493.write(this.field7497, 0, var2 - var3);
                } else {
                    this.field7493.write(this.field7497, this.field7499, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field7496 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field7499 = (this.field7499 + var2) % this.field7498;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class553(OutputStream arg0, int arg1) {
        this.field7498 = arg1 + 1;
        this.field7493 = arg0;
        this.field7497 = new byte[this.field7498];
        this.field7491 = new Thread(this);
        this.field7491.setDaemon(true);
        this.field7491.start();
    }
}
