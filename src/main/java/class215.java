import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class215 implements Runnable {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    private int field3543 = 0;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    private int field3548 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field3540;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    private int field3553;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "[B")
    private byte[] field3546;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field3552;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
    public static int[] field3544 = new int[1000];

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Ljava/io/IOException;")
    private IOException field3541;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
    public final boolean method1613(int arg0, int arg1) throws IOException {
        field3549++;
        if (arg1 >= -63) {
            method1618(34, -73, -45);
        }
        if (arg0 <= 0 || arg0 >= this.field3553) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field3548 <= this.field3543) {
                var4 = this.field3543 - this.field3548;
            } else {
                var4 = this.field3553 + this.field3543 - this.field3548;
            }
            if (arg0 <= var4) {
                return true;
            } else if (this.field3541 == null) {
                return false;
            } else {
                throw new IOException(this.field3541.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method1614(byte arg0) {
        field3544 = null;
        if (arg0 < 26) {
            field3544 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public final void method1615(int arg0) {
        if (arg0 == -1) {
            field3550++;
            this.field3540 = new class456();
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([BIII)I")
    public final int method1616(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3547++;
        if (arg1 < 0 || arg3 < 0 || arg0.length < arg3 + arg1) {
            throw new IOException();
        }
        synchronized (this) {
            if (arg2 != 20) {
                this.run();
            }
            int var6;
            if (this.field3548 > this.field3543) {
                var6 = this.field3553 + this.field3543 - this.field3548;
            } else {
                var6 = this.field3543 - this.field3548;
            }
            if (var6 < arg1) {
                arg1 = var6;
            }
            if (arg1 == 0 && this.field3541 != null) {
                throw new IOException(this.field3541.toString());
            }
            if (this.field3553 >= this.field3548 + arg1) {
                class398.method2566(this.field3546, this.field3548, arg0, arg3, arg1);
            } else {
                int var7 = this.field3553 - this.field3548;
                class398.method2566(this.field3546, this.field3548, arg0, arg3, var7);
                class398.method2566(this.field3546, 0, arg0, arg3 + var7, -var7 + arg1);
            }
            this.field3548 = (this.field3548 + arg1) % this.field3553;
            this.notifyAll();
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ec", name = "run", descriptor = "()V")
    public final void run() {
        field3542++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3541 != null) {
                        return;
                    }
                    if (this.field3548 == 0) {
                        var2 = this.field3553 - this.field3543 - 1;
                    } else if (this.field3548 < this.field3543) {
                        var2 = this.field3553 - this.field3543;
                    } else {
                        var2 = this.field3548 - (this.field3543 + 1);
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
                var3 = this.field3540.read(this.field3546, this.field3543, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field3541 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field3543 = (this.field3543 + var3) % this.field3553;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    public final void method1617(int arg0) {
        field3551++;
        synchronized (this) {
            if (this.field3541 == null) {
                this.field3541 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            if (arg0 != 1) {
                this.field3548 = -107;
            }
            this.field3552.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Z")
    public static final boolean method1618(int arg0, int arg1, int arg2) {
        field3545++;
        if (arg2 != 0) {
            field3544 = null;
        }
        return class98.method955(arg0, arg1, arg2 - 9646) & class407.method2606(arg1, arg0, -1);
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class215(InputStream arg0, int arg1) {
        this.field3540 = arg0;
        this.field3553 = arg1 + 1;
        this.field3546 = new byte[this.field3553];
        this.field3552 = new Thread(this);
        this.field3552.setDaemon(true);
        this.field3552.start();
    }
}
