import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class727 implements Runnable {

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "I")
    private int field10220 = 0;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "I")
    private int field10218 = 0;

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "I")
    private int field10221;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field10219;

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "[B")
    private byte[] field10223;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field10213;

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
    public static int field10217 = -1;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
    public static int field10212 = 0;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public static int field10211;

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
    public static int field10214;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "I")
    public static int field10215;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "I")
    public static int field10216;

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
    public static int field10225;

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "Ltd;")
    public static class515 field10224;

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "Ljava/io/IOException;")
    private IOException field10222;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Z)V", line = 6)
    public static void method4059(boolean arg0) {
        field10224 = null;
        if (arg0) {
            field10217 = -80;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I[BIZ)V", line = 17)
    public final void method4060(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        field10225++;
        if (arg2 < 0 || arg0 < 0 || (arg0 + arg2) > arg1.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field10222 != null) {
                throw new IOException(this.field10222.toString());
            }
            int var6;
            if (this.field10220 >= this.field10218) {
                var6 = this.field10221 + this.field10218 - this.field10220 - 1;
            } else {
                var6 = this.field10218 - this.field10220 - 1;
            }
            if (!arg3) {
                method4061(106);
            }
            if (arg2 > var6) {
                throw new IOException("");
            }
            if ((this.field10220 + arg2) <= this.field10221) {
                class85.method683(arg1, arg0, this.field10223, this.field10220, arg2);
            } else {
                int var7 = this.field10221 - this.field10220;
                class85.method683(arg1, arg0, this.field10223, this.field10220, var7);
                class85.method683(arg1, arg0 + var7, this.field10223, 0, arg2 - var7);
            }
            this.field10220 = (this.field10220 + arg2) % this.field10221;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V", line = 68)
    public static final void method4061(int arg0) {
        if (arg0 != -1) {
            method4061(-98);
        }
        class600.field8524 = new class146[class316.field4267.method2623(-1)][];
        field10216++;
        class313.field4239 = new class146[class316.field4267.method2623(-1)][];
        class542.field7863 = new boolean[class316.field4267.method2623(-1)];
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V", line = 89)
    public final void method4062(byte arg0) {
        field10214++;
        synchronized (this) {
            if (this.field10222 == null) {
                this.field10222 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field10213.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 != 127) {
            field10224 = null;
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(Z)V", line = 109)
    public final void method4063(boolean arg0) {
        field10211++;
        if (arg0) {
            this.field10219 = new class271();
        }
    }

    @OriginalMember(owner = "client!wca", name = "run", descriptor = "()V", line = 121)
    public final void run() {
        field10215++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field10222 != null) {
                        return;
                    }
                    if (this.field10218 <= this.field10220) {
                        var2 = this.field10220 - this.field10218;
                    } else {
                        var2 = this.field10221 + this.field10220 - this.field10218;
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
                if (this.field10221 >= (this.field10218 + var2)) {
                    this.field10219.write(this.field10223, this.field10218, var2);
                } else {
                    int var3 = this.field10221 - this.field10218;
                    this.field10219.write(this.field10223, this.field10218, var3);
                    this.field10219.write(this.field10223, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field10222 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field10218 = (this.field10218 + var2) % this.field10221;
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 187)
    public class727(OutputStream arg0, int arg1) {
        this.field10221 = arg1 + 1;
        this.field10219 = arg0;
        this.field10223 = new byte[this.field10221];
        this.field10213 = new Thread(this);
        this.field10213.setDaemon(true);
        this.field10213.start();
    }
}
