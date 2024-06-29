import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class49 implements Runnable {

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    private int field695 = 0;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    private int field683 = 0;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Ljava/io/InputStream;")
    private InputStream field690;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    private int field688;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "[B")
    private byte[] field685;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field692;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "Lrga;")
    public static class280 field697 = new class280(48, 0);

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "Lwp;")
    public static class453 field698 = new class453(26, 6);

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "Lrga;")
    public static class280 field699 = new class280(23, 18);

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field700 = 52;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "J")
    public static long field702 = 0L;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Lvw;")
    public static class535 field691;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "Les;")
    public static class630 field701;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "Ljava/io/IOException;")
    private IOException field693;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "[Lf;")
    public static class536[] field687;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public final void method308(byte arg0) {
        field686++;
        if (arg0 <= 42) {
            field699 = null;
        }
        this.field690 = new class252();
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public static void method309(byte arg0) {
        field699 = null;
        field701 = null;
        if (arg0 == -127) {
            field698 = null;
            field691 = null;
            field687 = null;
            field697 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)Z")
    public final boolean method310(int arg0, byte arg1) throws IOException {
        field684++;
        if (arg1 >= -80) {
            return true;
        } else if (arg0 > 0 && arg0 < this.field688) {
            synchronized (this) {
                int var4;
                if (this.field683 <= this.field695) {
                    var4 = this.field695 - this.field683;
                } else {
                    var4 = this.field695 + this.field688 - this.field683;
                }
                if (arg0 <= var4) {
                    return true;
                } else if (this.field693 == null) {
                    return false;
                } else {
                    throw new IOException(this.field693.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public final void method311(int arg0) {
        field689++;
        synchronized (this) {
            if (arg0 != 17575) {
                return;
            }
            if (this.field693 == null) {
                this.field693 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field692.join();
        } catch (InterruptedException var5) {
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II[BI)I")
    public final int method312(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field694++;
        if (arg1 < 0 || arg3 < 0 || arg2.length < arg1 + arg3) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field695 >= this.field683) {
                var6 = this.field695 - this.field683;
            } else {
                var6 = this.field695 + this.field688 - this.field683;
            }
            if (arg1 > var6) {
                arg1 = var6;
            }
            if (arg1 == 0 && this.field693 != null) {
                throw new IOException(this.field693.toString());
            }
            if (this.field688 < this.field683 + arg1) {
                int var7 = this.field688 - this.field683;
                class293.method1645(this.field685, this.field683, arg2, arg3, var7);
                class293.method1645(this.field685, 0, arg2, arg3 + var7, arg1 - var7);
            } else {
                class293.method1645(this.field685, this.field683, arg2, arg3, arg1);
            }
            this.field683 = (this.field683 + arg1) % this.field688;
            int var8 = -3 % ((arg0 + 29) / 43);
            this.notifyAll();
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class49(InputStream arg0, int arg1) {
        this.field690 = arg0;
        this.field688 = arg1 + 1;
        this.field685 = new byte[this.field688];
        this.field692 = new Thread(this);
        this.field692.setDaemon(true);
        this.field692.start();
    }

    @OriginalMember(owner = "client!ak", name = "run", descriptor = "()V")
    public final void run() {
        field696++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field693 != null) {
                        return;
                    }
                    if (this.field683 == 0) {
                        var2 = this.field688 - this.field695 - 1;
                    } else if (this.field695 > this.field683) {
                        var2 = this.field688 - this.field695;
                    } else {
                        var2 = this.field683 - this.field695 - 1;
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
                var3 = this.field690.read(this.field685, this.field695, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field693 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field695 = (this.field695 + var3) % this.field688;
            }
        }
    }
}
