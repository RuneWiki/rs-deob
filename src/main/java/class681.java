import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class681 implements Runnable {

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    private int field9685 = 0;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "I")
    private int field9701 = 0;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field9687;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    private int field9689;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "[B")
    private byte[] field9692;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field9688;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "Ljn;")
    public static class117 field9691 = new class117(4);

    @OriginalMember(owner = "client!it", name = "l", descriptor = "Z")
    public static boolean field9696 = false;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "I")
    public static int field9700 = 1;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field9686;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    public static int field9694;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field9695;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "I")
    public static int field9697;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "I")
    public static int field9698;

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    public static int field9699;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "Ljava/io/IOException;")
    private IOException field9690;

    @OriginalMember(owner = "client!it", name = "run", descriptor = "()V")
    public final void run() {
        field9695++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field9690 != null) {
                        return;
                    }
                    if (this.field9685 == 0) {
                        var2 = this.field9689 - this.field9701 - 1;
                    } else if (this.field9685 >= this.field9701) {
                        var2 = this.field9685 - this.field9701 - 1;
                    } else {
                        var2 = this.field9689 - this.field9701;
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
                var3 = this.field9687.read(this.field9692, this.field9701, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field9690 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field9701 = (this.field9701 + var3) % this.field9689;
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Ljava/lang/String;IB)I")
    public static final int method3850(String arg0, int arg1, byte arg2) {
        if (arg2 < 77) {
            method3850(null, 69, (byte) -64);
        }
        field9694++;
        return class79.method612(true, (byte) 112, arg0, arg1);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public static void method3851(int arg0) {
        field9691 = null;
        if (arg0 != 0) {
            method3850(null, 13, (byte) 104);
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
    public final void method3852(int arg0) {
        field9686++;
        synchronized (this) {
            if (this.field9690 == null) {
                this.field9690 = new IOException("");
            }
            if (arg0 >= -30) {
                this.method3853((byte) -18);
            }
            this.notifyAll();
        }
        try {
            this.field9688.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
    public final void method3853(byte arg0) {
        this.field9687 = new class597();
        field9697++;
        if (arg0 > -18) {
            this.field9689 = -35;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(III[B)I")
    public final int method3854(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != 1) {
            return 103;
        }
        field9699++;
        if (arg1 < 0 || arg2 < 0 || arg3.length < arg1 + arg2) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field9701 >= this.field9685) {
                var6 = this.field9701 - this.field9685;
            } else {
                var6 = this.field9689 + this.field9701 - this.field9685;
            }
            if (var6 < arg1) {
                arg1 = var6;
            }
            if (arg1 == 0 && this.field9690 != null) {
                throw new IOException(this.field9690.toString());
            }
            if ((this.field9685 + arg1) <= this.field9689) {
                class553.method3242(this.field9692, this.field9685, arg3, arg2, arg1);
            } else {
                int var7 = this.field9689 - this.field9685;
                class553.method3242(this.field9692, this.field9685, arg3, arg2, var7);
                class553.method3242(this.field9692, 0, arg3, arg2 + var7, arg1 - var7);
            }
            this.field9685 = (this.field9685 + arg1) % this.field9689;
            this.notifyAll();
            return arg1;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IZ)Z")
    public final boolean method3855(int arg0, boolean arg1) throws IOException {
        field9693++;
        if (arg0 <= 0 || this.field9689 <= arg0) {
            throw new IOException();
        }
        synchronized (this) {
            if (arg1) {
                return false;
            }
            int var5;
            if (this.field9685 <= this.field9701) {
                var5 = this.field9701 - this.field9685;
            } else {
                var5 = this.field9689 + this.field9701 - this.field9685;
            }
            if (var5 >= arg0) {
                return true;
            } else if (this.field9690 == null) {
                return false;
            } else {
                throw new IOException(this.field9690.toString());
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(III)Lvea;")
    public static final class306 method3856(int arg0, int arg1, int arg2) {
        class293 var3 = class541.field7946[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4093;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class681(InputStream arg0, int arg1) {
        this.field9687 = arg0;
        this.field9689 = arg1 + 1;
        this.field9692 = new byte[this.field9689];
        this.field9688 = new Thread(this);
        this.field9688.setDaemon(true);
        this.field9688.start();
    }
}
