import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class600 implements Runnable {

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    private int field8120 = 0;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
    private int field8128 = 0;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    private int field8119;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field8125;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "[B")
    private byte[] field8122;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field8116;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "Lmaa;")
    public static class508 field8126 = new class508(2, 7);

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field8118;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "Lkr;")
    public static class602 field8121;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "Lpb;")
    public static class79 field8129;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "Ljava/io/IOException;")
    private IOException field8117;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(III[B)V")
    public final void method3425(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 <= 36) {
            this.field8116 = null;
        }
        field8130++;
        if (arg0 < 0 || arg2 < 0 || arg3.length < arg0 + arg2) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field8117 != null) {
                throw new IOException(this.field8117.toString());
            }
            int var6;
            if (this.field8120 <= this.field8128) {
                var6 = this.field8120 + this.field8119 - (this.field8128 - -1);
            } else {
                var6 = this.field8120 - this.field8128 - 1;
            }
            if (var6 < arg0) {
                throw new IOException("");
            }
            if (this.field8128 + arg0 <= this.field8119) {
                class245.method1646(arg3, arg2, this.field8122, this.field8128, arg0);
            } else {
                int var7 = this.field8119 - this.field8128;
                class245.method1646(arg3, arg2, this.field8122, this.field8128, var7);
                class245.method1646(arg3, arg2 + var7, this.field8122, 0, arg0 - var7);
            }
            this.field8128 = (this.field8128 + arg0) % this.field8119;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public final void method3426(int arg0) {
        field8118++;
        synchronized (this) {
            if (this.field8117 == null) {
                this.field8117 = new IOException("");
            }
            if (arg0 != 2) {
                this.field8119 = 89;
            }
            this.notifyAll();
        }
        try {
            this.field8116.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!jq", name = "run", descriptor = "()V")
    public final void run() {
        field8124++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field8117 != null) {
                        return;
                    }
                    if (this.field8128 >= this.field8120) {
                        var2 = this.field8128 - this.field8120;
                    } else {
                        var2 = this.field8119 + this.field8128 - this.field8120;
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
                if (this.field8119 >= (this.field8120 + var2)) {
                    this.field8125.write(this.field8122, this.field8120, var2);
                } else {
                    int var3 = this.field8119 - this.field8120;
                    this.field8125.write(this.field8122, this.field8120, var3);
                    this.field8125.write(this.field8122, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field8117 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field8120 = (this.field8120 + var2) % this.field8119;
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
    public final void method3427(int arg0) {
        if (arg0 == 2) {
            this.field8125 = new class255();
            field8123++;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
    public static void method3428(byte arg0) {
        if (arg0 <= -95) {
            field8121 = null;
            field8126 = null;
            field8129 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class600(OutputStream arg0, int arg1) {
        this.field8119 = arg1 + 1;
        this.field8125 = arg0;
        this.field8122 = new byte[this.field8119];
        this.field8116 = new Thread(this);
        this.field8116.setDaemon(true);
        this.field8116.start();
    }
}
