import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class585 implements Runnable {

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    private int field7853 = 0;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    private int field7855 = 0;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "Ljava/io/InputStream;")
    private InputStream field7858;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    private int field7851;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "[B")
    private byte[] field7856;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field7862;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "Ldr;")
    public static class675 field7861 = new class675(105, -2);

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    public static int field7863 = -1;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field7854;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "Ljava/io/IOException;")
    private IOException field7850;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "([BIII)I", line = 5)
    public final int method3243(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field7857++;
        if (arg1 < ~arg2 || arg3 < 0 || arg0.length < arg2 + arg3) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field7853 >= this.field7855) {
                var6 = this.field7853 - this.field7855;
            } else {
                var6 = this.field7851 + this.field7853 - this.field7855;
            }
            if (var6 < arg2) {
                arg2 = var6;
            }
            if (arg2 == 0 && this.field7850 != null) {
                throw new IOException(this.field7850.toString());
            }
            if (this.field7851 < this.field7855 + arg2) {
                int var7 = this.field7851 - this.field7855;
                class70.method557(this.field7856, this.field7855, arg0, arg3, var7);
                class70.method557(this.field7856, 0, arg0, arg3 + var7, arg2 - var7);
            } else {
                class70.method557(this.field7856, this.field7855, arg0, arg3, arg2);
            }
            this.field7855 = (this.field7855 + arg2) % this.field7851;
            this.notifyAll();
            return arg2;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 51)
    public static void method3244(int arg0) {
        field7861 = null;
        if (arg0 >= -6) {
            method3244(59);
        }
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V", line = 63)
    public final void method3245(int arg0) {
        if (arg0 <= 110) {
            this.method3245(109);
        }
        this.field7858 = new class615();
        field7859++;
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V", line = 74)
    public final void method3246(int arg0) {
        synchronized (this) {
            if (this.field7850 == null) {
                this.field7850 = new IOException("");
            }
            this.notifyAll();
        }
        field7854++;
        try {
            this.field7862.join();
            if (arg0 > -49) {
                this.field7851 = 82;
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 164)
    public class585(InputStream arg0, int arg1) {
        this.field7858 = arg0;
        this.field7851 = arg1 + 1;
        this.field7856 = new byte[this.field7851];
        this.field7862 = new Thread(this);
        this.field7862.setDaemon(true);
        this.field7862.start();
    }

    @OriginalMember(owner = "client!oo", name = "run", descriptor = "()V", line = 104)
    public final void run() {
        field7860++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field7850 != null) {
                        return;
                    }
                    if (this.field7855 == 0) {
                        var2 = this.field7851 - this.field7853 - 1;
                    } else if (this.field7855 < this.field7853) {
                        var2 = this.field7851 - this.field7853;
                    } else {
                        var2 = this.field7855 - this.field7853 - 1;
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
                var3 = this.field7858.read(this.field7856, this.field7853, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field7850 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field7853 = (this.field7853 + var3) % this.field7851;
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Z", line = 180)
    public final boolean method3247(int arg0, int arg1) throws IOException {
        field7852++;
        if (arg0 <= 0 || this.field7851 <= arg0) {
            throw new IOException();
        }
        if (arg1 != -14934) {
            this.method3246(30);
        }
        synchronized (this) {
            int var4;
            if (this.field7855 > this.field7853) {
                var4 = this.field7851 + this.field7853 - this.field7855;
            } else {
                var4 = this.field7853 - this.field7855;
            }
            if (arg0 <= var4) {
                return true;
            } else if (this.field7850 == null) {
                return false;
            } else {
                throw new IOException(this.field7850.toString());
            }
        }
    }
}
