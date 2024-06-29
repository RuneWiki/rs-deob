import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class5 implements Runnable {

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "I")
    private int field32 = 0;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    private int field40 = 0;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field31;

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
    private int field35;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "[B")
    private byte[] field29;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field30;

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "Lnj;")
    public static class415 field33 = new class415(79, -1);

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "I")
    public static int field36 = 0;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "F")
    public static float field37;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "Ljava/io/IOException;")
    private IOException field27;

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "[I")
    public static int[] field34;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
    public final void method16(byte arg0) {
        synchronized (this) {
            if (this.field27 == null) {
                this.field27 = new IOException("");
            }
            this.notifyAll();
        }
        field28++;
        try {
            this.field30.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 < 76) {
            this.method16((byte) 26);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
    public final void method17(int arg0) {
        this.field31 = new class697();
        if (arg0 == -1) {
            field26++;
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)V")
    public static void method18(byte arg0) {
        field34 = null;
        if (arg0 != 67) {
            field37 = 0.41050506F;
        }
        field33 = null;
    }

    @OriginalMember(owner = "client!ps", name = "run", descriptor = "()V")
    public final void run() {
        field38++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field27 != null) {
                        return;
                    }
                    if (this.field32 >= this.field40) {
                        var2 = this.field32 - this.field40;
                    } else {
                        var2 = this.field35 + this.field32 - this.field40;
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
                if ((this.field40 + var2) > this.field35) {
                    int var3 = this.field35 - this.field40;
                    this.field31.write(this.field29, this.field40, var3);
                    this.field31.write(this.field29, 0, var2 - var3);
                } else {
                    this.field31.write(this.field29, this.field40, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field27 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field40 = (this.field40 + var2) % this.field35;
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([BIIZ)V")
    public final void method19(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        field39++;
        if (!arg3) {
            return;
        }
        if (arg2 < 0 || arg1 < 0 || (arg1 + arg2) > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field27 != null) {
                throw new IOException(this.field27.toString());
            }
            int var6;
            if (this.field40 <= this.field32) {
                var6 = this.field35 + this.field40 - this.field32 - 1;
            } else {
                var6 = this.field40 - this.field32 - 1;
            }
            if (arg2 > var6) {
                throw new IOException("");
            }
            if ((this.field32 + arg2) > this.field35) {
                int var7 = this.field35 - this.field32;
                class443.method2514(arg0, arg1, this.field29, this.field32, var7);
                class443.method2514(arg0, arg1 + var7, this.field29, 0, arg2 - var7);
            } else {
                class443.method2514(arg0, arg1, this.field29, this.field32, arg2);
            }
            this.field32 = (this.field32 + arg2) % this.field35;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class5(OutputStream arg0, int arg1) {
        this.field31 = arg0;
        this.field35 = arg1 + 1;
        this.field29 = new byte[this.field35];
        this.field30 = new Thread(this);
        this.field30.setDaemon(true);
        this.field30.start();
    }
}
