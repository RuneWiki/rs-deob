import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class299 implements Runnable {

    @OriginalMember(owner = "client!wha", name = "i", descriptor = "I")
    private int field3574 = 0;

    @OriginalMember(owner = "client!wha", name = "j", descriptor = "I")
    private int field3575 = 0;

    @OriginalMember(owner = "client!wha", name = "k", descriptor = "I")
    private int field3576;

    @OriginalMember(owner = "client!wha", name = "l", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3577;

    @OriginalMember(owner = "client!wha", name = "g", descriptor = "[B")
    private byte[] field3572;

    @OriginalMember(owner = "client!wha", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field3569;

    @OriginalMember(owner = "client!wha", name = "m", descriptor = "I")
    public static int field3578 = 0;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!wha", name = "e", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!wha", name = "f", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!wha", name = "o", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!wha", name = "h", descriptor = "Ljava/io/IOException;")
    private IOException field3573;

    @OriginalMember(owner = "client!wha", name = "n", descriptor = "Z")
    public static boolean field3579;

    @OriginalMember(owner = "client!wha", name = "run", descriptor = "()V")
    public final void run() {
        field3566++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3573 != null) {
                        return;
                    }
                    if (this.field3575 > this.field3574) {
                        var2 = this.field3574 + this.field3576 - this.field3575;
                    } else {
                        var2 = this.field3574 - this.field3575;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field3577.flush();
                    } catch (IOException var16) {
                        this.field3573 = var16;
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var15) {
                    }
                }
            }
            try {
                if (this.field3575 + var2 > this.field3576) {
                    int var4 = this.field3576 - this.field3575;
                    this.field3577.write(this.field3572, this.field3575, var4);
                    this.field3577.write(this.field3572, 0, var2 - var4);
                } else {
                    this.field3577.write(this.field3572, this.field3575, var2);
                }
            } catch (IOException var18) {
                IOException var5 = var18;
                synchronized (this) {
                    this.field3573 = var5;
                    return;
                }
            }
            synchronized (this) {
                this.field3575 = (this.field3575 + var2) % this.field3576;
            }
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)I")
    public static final int method1745(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class46.field612 - 1; var2++) {
            if (arg0 < class688.field9379[var2] + class548.field7643[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class46.field612 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "([BIII)V")
    public final void method1746(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3567++;
        if (arg2 < 0 || arg3 < 0 || (arg3 + arg2) > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3573 != null) {
                throw new IOException(this.field3573.toString());
            }
            if (arg1 != 1) {
                method1745(39);
            }
            int var6;
            if (this.field3575 > this.field3574) {
                var6 = this.field3575 - this.field3574 - 1;
            } else {
                var6 = this.field3576 - this.field3574 - (-this.field3575 + 1);
            }
            if (var6 < arg2) {
                throw new IOException("");
            }
            if (this.field3576 < this.field3574 + arg2) {
                int var7 = this.field3576 - this.field3574;
                class211.method1330(arg0, arg3, this.field3572, this.field3574, var7);
                class211.method1330(arg0, arg3 + var7, this.field3572, 0, arg2 - var7);
            } else {
                class211.method1330(arg0, arg3, this.field3572, this.field3574, arg2);
            }
            this.field3574 = (this.field3574 + arg2) % this.field3576;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)V")
    public final void method1747(int arg0) {
        if (arg0 != 8747) {
            this.field3574 = 104;
        }
        field3568++;
        synchronized (this) {
            if (this.field3573 == null) {
                this.field3573 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field3569.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "(I)V")
    public final void method1748(int arg0) {
        field3580++;
        this.field3577 = new class275();
        if (arg0 <= 122) {
            this.field3576 = -112;
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)[Lfj;")
    public static final class684[] method1749(byte arg0) {
        if (arg0 != 60) {
            field3578 = -124;
        }
        field3570++;
        return new class684[] { class448.field6019, class788.field10862, class283.field3281, class108.field1361, class708.field9944, class85.field1141, class555.field7725, class164.field2009, class784.field10829, class96.field1251, class201.field2409, class683.field9352, class621.field8526, class656.field9047, class603.field8144 };
    }

    @OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class299(OutputStream arg0, int arg1) {
        this.field3576 = arg1 + 1;
        this.field3577 = arg0;
        this.field3572 = new byte[this.field3576];
        this.field3569 = new Thread(this);
        this.field3569.setDaemon(true);
        this.field3569.start();
    }
}
