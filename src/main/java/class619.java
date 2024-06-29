import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class619 implements Runnable {

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    private int field8697 = 0;

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
    private int field8703 = 0;

    @OriginalMember(owner = "client!aaa", name = "k", descriptor = "Ljava/io/InputStream;")
    private InputStream field8706;

    @OriginalMember(owner = "client!aaa", name = "l", descriptor = "I")
    private int field8707;

    @OriginalMember(owner = "client!aaa", name = "o", descriptor = "[B")
    private byte[] field8710;

    @OriginalMember(owner = "client!aaa", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field8705;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
    public static int field8698;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
    public static int field8699;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
    public static int field8700;

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
    public static int field8704;

    @OriginalMember(owner = "client!aaa", name = "m", descriptor = "I")
    public static int field8708;

    @OriginalMember(owner = "client!aaa", name = "n", descriptor = "I")
    public static int field8709;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "Ljava/io/IOException;")
    private IOException field8702;

    @OriginalMember(owner = "client!aaa", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        field8701++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field8702 != null) {
                        return;
                    }
                    if (this.field8697 == 0) {
                        var2 = this.field8707 - this.field8703 - 1;
                    } else if (this.field8697 >= this.field8703) {
                        var2 = this.field8697 - this.field8703 - 1;
                    } else {
                        var2 = this.field8707 - this.field8703;
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
                var3 = this.field8706.read(this.field8710, this.field8703, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field8702 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field8703 = (this.field8703 + var3) % this.field8707;
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V", line = 61)
    public final void method3563(byte arg0) {
        field8696++;
        synchronized (this) {
            if (this.field8702 == null) {
                this.field8702 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field8705.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 != -37) {
            this.field8710 = null;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)V", line = 84)
    public final void method3564(byte arg0) {
        field8698++;
        int var2 = 117 / ((arg0 + 5) / 61);
        this.field8706 = new class562();
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 188)
    public class619(InputStream arg0, int arg1) {
        this.field8706 = arg0;
        this.field8707 = arg1 + 1;
        this.field8710 = new byte[this.field8707];
        this.field8705 = new Thread(this);
        this.field8705.setDaemon(true);
        this.field8705.start();
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II[BB)I", line = 107)
    public final int method3565(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field8709++;
        if (arg1 < 0 || arg0 < 0 || arg2.length < (arg0 + arg1)) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field8703 >= this.field8697) {
                var6 = this.field8703 - this.field8697;
            } else {
                var6 = this.field8707 - (this.field8697 - this.field8703);
            }
            if (arg3 > -87) {
                this.run();
            }
            if (arg1 > var6) {
                arg1 = var6;
            }
            if (arg1 == 0 && this.field8702 != null) {
                throw new IOException(this.field8702.toString());
            }
            if (this.field8707 >= (this.field8697 + arg1)) {
                class319.method2022(this.field8710, this.field8697, arg2, arg0, arg1);
            } else {
                int var7 = this.field8707 - this.field8697;
                class319.method2022(this.field8710, this.field8697, arg2, arg0, var7);
                class319.method2022(this.field8710, 0, arg2, arg0 + var7, arg1 - var7);
            }
            this.field8697 = (this.field8697 + arg1) % this.field8707;
            this.notifyAll();
            return arg1;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)Z", line = 149)
    public final boolean method3566(int arg0, int arg1) throws IOException {
        field8700++;
        if (arg1 <= 0 || this.field8707 <= arg1) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field8703 >= this.field8697) {
                var4 = this.field8703 - this.field8697;
            } else {
                var4 = this.field8707 + this.field8703 - this.field8697;
            }
            if (var4 >= arg1) {
                int var6 = 111 % ((arg0 + 34) / 62);
                return true;
            } else if (this.field8702 == null) {
                return false;
            } else {
                throw new IOException(this.field8702.toString());
            }
        }
    }
}
