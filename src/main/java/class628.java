import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class628 implements Runnable {

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    private int field8502 = 0;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    private int field8499 = 0;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field8509;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    private int field8501;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "[B")
    private byte[] field8514;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field8510;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "[I")
    public static int[] field8503 = new int[1000];

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "Ljava/lang/String;")
    public static String field8500 = null;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "[I")
    public static int[] field8506 = new int[3];

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field8508 = 0;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    public static int field8507 = 0;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "J")
    public static long field8513 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field8504;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    public static int field8505;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    public static int field8511;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "Ljava/io/IOException;")
    private IOException field8515;

    @OriginalMember(owner = "client!qs", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        field8512++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field8515 != null) {
                        return;
                    }
                    if (this.field8499 > this.field8502) {
                        var2 = this.field8501 + this.field8502 - this.field8499;
                    } else {
                        var2 = this.field8502 - this.field8499;
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
                if (this.field8501 < (this.field8499 + var2)) {
                    int var3 = this.field8501 - this.field8499;
                    this.field8509.write(this.field8514, this.field8499, var3);
                    this.field8509.write(this.field8514, 0, var2 - var3);
                } else {
                    this.field8509.write(this.field8514, this.field8499, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field8515 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field8499 = (this.field8499 + var2) % this.field8501;
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 192)
    public class628(OutputStream arg0, int arg1) {
        this.field8509 = arg0;
        this.field8501 = arg1 + 1;
        this.field8514 = new byte[this.field8501];
        this.field8510 = new Thread(this);
        this.field8510.setDaemon(true);
        this.field8510.start();
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 71)
    public final void method3469(int arg0) {
        this.field8509 = new class365();
        field8511++;
        if (arg0 <= 57) {
            field8508 = -102;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V", line = 90)
    public final void method3470(int arg0) {
        field8504++;
        synchronized (this) {
            if (this.field8515 == null) {
                this.field8515 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field8510.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 != 1) {
            this.field8515 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V", line = 129)
    public static void method3471(byte arg0) {
        field8500 = null;
        if (arg0 == -62) {
            field8506 = null;
            field8503 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "([BIII)V", line = 149)
    public final void method3472(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field8505++;
        if (arg3 < 0 || arg2 < 0 || arg0.length < (arg2 + arg3)) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field8515 != null) {
                throw new IOException(this.field8515.toString());
            }
            int var6;
            if (this.field8499 <= this.field8502) {
                var6 = this.field8501 + this.field8499 - (this.field8502 - -1);
            } else {
                var6 = this.field8499 - this.field8502 - 1;
            }
            if (var6 < arg3) {
                throw new IOException("");
            }
            if ((this.field8502 + arg3) > this.field8501) {
                int var7 = this.field8501 - this.field8502;
                class421.method2534(arg0, arg2, this.field8514, this.field8502, var7);
                class421.method2534(arg0, arg2 + var7, this.field8514, 0, arg3 - var7);
            } else {
                class421.method2534(arg0, arg2, this.field8514, this.field8502, arg3);
            }
            this.field8502 = (this.field8502 + arg3) % this.field8501;
            this.notifyAll();
        }
        if (arg1 != -8990) {
            this.run();
        }
    }
}
