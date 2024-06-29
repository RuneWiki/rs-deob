import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class394 implements Runnable {

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    private int field5880 = 0;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    private int field5874 = 0;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    private int field5878;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5883;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "[B")
    private byte[] field5885;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field5884;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field5875 = 0;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field5882 = -1;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "Ljava/io/IOException;")
    private IOException field5887;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(CI)Z", line = 14)
    public static final boolean method2449(char arg0, int arg1) {
        if (arg1 == 25834) {
            field5886++;
            return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 172)
    public class394(OutputStream arg0, int arg1) {
        this.field5878 = arg1 + 1;
        this.field5883 = arg0;
        this.field5885 = new byte[this.field5878];
        this.field5884 = new Thread(this);
        this.field5884.setDaemon(true);
        this.field5884.start();
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 29)
    public final void method2450(byte arg0) {
        this.field5883 = new class213();
        field5876++;
        if (arg0 < 92) {
            this.field5885 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "run", descriptor = "()V", line = 41)
    public final void run() {
        field5881++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field5887 != null) {
                        return;
                    }
                    if (this.field5874 <= this.field5880) {
                        var2 = this.field5880 - this.field5874;
                    } else {
                        var2 = this.field5878 + this.field5880 - this.field5874;
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
                if ((this.field5874 + var2) > this.field5878) {
                    int var3 = this.field5878 - this.field5874;
                    this.field5883.write(this.field5885, this.field5874, var3);
                    this.field5883.write(this.field5885, 0, var2 - var3);
                } else {
                    this.field5883.write(this.field5885, this.field5874, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field5887 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field5874 = (this.field5874 + var2) % this.field5878;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI[BI)V", line = 103)
    public final void method2451(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field5879++;
        if (arg1 < 0 || arg3 < 0 || arg3 + arg1 > arg2.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field5887 != null) {
                throw new IOException(this.field5887.toString());
            } else if (arg0 == 43) {
                int var6;
                if (this.field5874 > this.field5880) {
                    var6 = this.field5874 - this.field5880 - 1;
                } else {
                    var6 = this.field5878 - (this.field5880 + 1 - this.field5874);
                }
                if (var6 < arg1) {
                    throw new IOException("");
                }
                if ((this.field5880 + arg1) > this.field5878) {
                    int var7 = this.field5878 - this.field5880;
                    class571.method3313(arg2, arg3, this.field5885, this.field5880, var7);
                    class571.method3313(arg2, arg3 + var7, this.field5885, 0, arg1 - var7);
                } else {
                    class571.method3313(arg2, arg3, this.field5885, this.field5880, arg1);
                }
                this.field5880 = (this.field5880 + arg1) % this.field5878;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 150)
    public final void method2452(int arg0) {
        field5888++;
        synchronized (this) {
            if (this.field5887 == null) {
                this.field5887 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field5884.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 != 1349) {
            this.field5878 = 122;
        }
    }
}
