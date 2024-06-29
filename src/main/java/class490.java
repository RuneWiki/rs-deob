import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class490 implements Runnable {

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    private int field7140 = 0;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
    private int field7143 = 0;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    private int field7141;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field7136;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "[B")
    private byte[] field7142;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field7139;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "[[B")
    public static byte[][] field7145 = new byte[50][];

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "Lig;")
    public static class206 field7144 = new class206(45, 6);

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "Lig;")
    public static class206 field7150 = new class206(23, 6);

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "Ljava/io/IOException;")
    private IOException field7137;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "[Lwt;")
    public static class262[] field7147;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2943(boolean arg0) {
        field7147 = null;
        field7150 = null;
        field7145 = null;
        field7144 = null;
        if (arg0) {
            field7147 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I[BII)V", line = 18)
    public final void method2944(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field7135++;
        if (arg0 < 0 || arg3 < 0 || (arg0 + arg3) > arg1.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field7137 != null) {
                throw new IOException(this.field7137.toString());
            }
            if (arg2 != 6) {
                field7144 = null;
            }
            int var6;
            if (this.field7140 > this.field7143) {
                var6 = this.field7140 - this.field7143 - 1;
            } else {
                var6 = this.field7141 + this.field7140 - this.field7143 - 1;
            }
            if (var6 < arg0) {
                throw new IOException("");
            }
            if ((this.field7143 + arg0) <= this.field7141) {
                class210.method1330(arg1, arg3, this.field7142, this.field7143, arg0);
            } else {
                int var7 = this.field7141 - this.field7143;
                class210.method1330(arg1, arg3, this.field7142, this.field7143, var7);
                class210.method1330(arg1, arg3 + var7, this.field7142, 0, arg0 - var7);
            }
            this.field7143 = (this.field7143 + arg0) % this.field7141;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V", line = 60)
    public final void method2945(byte arg0) {
        synchronized (this) {
            if (arg0 != -52) {
                method2943(true);
            }
            if (this.field7137 == null) {
                this.field7137 = new IOException("");
            }
            this.notifyAll();
        }
        field7146++;
        try {
            this.field7139.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!pu", name = "run", descriptor = "()V", line = 84)
    public final void run() {
        field7149++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field7137 != null) {
                        return;
                    }
                    if (this.field7143 < this.field7140) {
                        var2 = this.field7141 + this.field7143 - this.field7140;
                    } else {
                        var2 = this.field7143 - this.field7140;
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
                if (this.field7141 >= this.field7140 + var2) {
                    this.field7136.write(this.field7142, this.field7140, var2);
                } else {
                    int var3 = this.field7141 - this.field7140;
                    this.field7136.write(this.field7142, this.field7140, var3);
                    this.field7136.write(this.field7142, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field7137 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field7140 = (this.field7140 + var2) % this.field7141;
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V", line = 143)
    public final void method2946(int arg0) {
        if (arg0 >= -8) {
            this.field7137 = null;
        }
        field7138++;
        this.field7136 = new class492();
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 184)
    public class490(OutputStream arg0, int arg1) {
        this.field7141 = arg1 + 1;
        this.field7136 = arg0;
        this.field7142 = new byte[this.field7141];
        this.field7139 = new Thread(this);
        this.field7139.setDaemon(true);
        this.field7139.start();
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIZ)Z", line = 167)
    public static final boolean method2947(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method2947(-108, 64, false);
        }
        field7148++;
        return (arg0 & 0x800) != 0;
    }
}
