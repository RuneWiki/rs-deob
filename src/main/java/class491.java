import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class491 implements Runnable {

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
    private int field6922 = 0;

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
    private int field6927 = 0;

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field6934;

    @OriginalMember(owner = "client!mw", name = "o", descriptor = "I")
    private int field6935;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "[B")
    private byte[] field6924;

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field6926;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "[I")
    public static int[] field6925 = new int[13];

    @OriginalMember(owner = "client!mw", name = "l", descriptor = "Z")
    public static boolean field6932 = false;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!mw", name = "i", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!mw", name = "k", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!mw", name = "p", descriptor = "Ljava/io/IOException;")
    private IOException field6936;

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "[I")
    public static int[] field6933;

    @OriginalMember(owner = "client!mw", name = "j", descriptor = "[Ljt;")
    public static class104[] field6930;

    @OriginalMember(owner = "client!mw", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        field6923++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field6936 != null) {
                        return;
                    }
                    if (this.field6927 < this.field6922) {
                        var2 = this.field6935 + this.field6927 - this.field6922;
                    } else {
                        var2 = this.field6927 - this.field6922;
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
                if (this.field6935 < this.field6922 + var2) {
                    int var3 = this.field6935 - this.field6922;
                    this.field6934.write(this.field6924, this.field6922, var3);
                    this.field6934.write(this.field6924, 0, var2 - var3);
                } else {
                    this.field6934.write(this.field6924, this.field6922, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field6936 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field6922 = (this.field6922 + var2) % this.field6935;
            }
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V", line = 63)
    public static void method2924(byte arg0) {
        if (arg0 < 75) {
            field6932 = false;
        }
        field6930 = null;
        field6925 = null;
        field6933 = null;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V", line = 75)
    public final void method2925(int arg0) {
        if (arg0 != 19602) {
            this.method2925(-122);
        }
        synchronized (this) {
            if (this.field6936 == null) {
                this.field6936 = new IOException("");
            }
            this.notifyAll();
        }
        field6921++;
        try {
            this.field6926.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 181)
    public class491(OutputStream arg0, int arg1) {
        this.field6934 = arg0;
        this.field6935 = arg1 + 1;
        this.field6924 = new byte[this.field6935];
        this.field6926 = new Thread(this);
        this.field6926.setDaemon(true);
        this.field6926.start();
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V", line = 102)
    public final void method2926(int arg0) {
        if (arg0 != -1) {
            this.field6934 = null;
        }
        this.field6934 = new class221();
        field6931++;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)Z", line = 114)
    public static final boolean method2927(int arg0, int arg1, int arg2) {
        field6929++;
        if (arg0 == -1) {
            return class35.method198(arg2, arg1, false) | (arg1 & 0x800) != 0 || class748.method4157(arg2, arg1, arg0 ^ 0xFFFFFFC8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(II[BI)V", line = 135)
    public final void method2928(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field6928++;
        if (~arg3 > arg1 || arg0 < 0 || arg2.length < arg0 + arg3) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field6936 != null) {
                throw new IOException(this.field6936.toString());
            }
            int var6;
            if (this.field6922 > this.field6927) {
                var6 = this.field6922 - this.field6927 - 1;
            } else {
                var6 = this.field6935 + this.field6922 - this.field6927 - 1;
            }
            if (arg3 > var6) {
                throw new IOException("");
            }
            if (this.field6935 < this.field6927 + arg3) {
                int var7 = this.field6935 - this.field6927;
                class255.method1690(arg2, arg0, this.field6924, this.field6927, var7);
                class255.method1690(arg2, arg0 + var7, this.field6924, 0, arg3 - var7);
            } else {
                class255.method1690(arg2, arg0, this.field6924, this.field6927, arg3);
            }
            this.field6927 = (this.field6927 + arg3) % this.field6935;
            this.notifyAll();
        }
    }
}
