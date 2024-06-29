import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class677 implements Runnable {

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
    private int field9459 = 0;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    private int field9464 = 0;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field9458;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    private int field9454;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "[B")
    private byte[] field9466;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field9457;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "[[I")
    public static int[][] field9456 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field9453;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public static int field9455;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
    public static int field9461;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
    public static int field9462;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
    public static int field9463;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
    public static int field9465;

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "I")
    public static int field9467;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "Ljava/io/IOException;")
    private IOException field9460;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
    public static void method3817(int arg0) {
        if (arg0 == 5) {
            field9456 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)I")
    public static final int method3818(int arg0, int arg1, int arg2) {
        field9453++;
        if (arg2 != -19248) {
            field9467 = 74;
        }
        return arg0 == 1 || arg0 == 3 ? class511.field7194[arg1 & 0x3] : class299.field3931[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
    public final void method3819(int arg0) {
        this.field9458 = new class305();
        if (arg0 != 2) {
            this.method3822(-14);
        }
        field9465++;
    }

    @OriginalMember(owner = "client!lt", name = "run", descriptor = "()V")
    public final void run() {
        field9461++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field9460 != null) {
                        return;
                    }
                    if (this.field9459 <= this.field9464) {
                        var2 = this.field9464 - this.field9459;
                    } else {
                        var2 = this.field9454 + this.field9464 - this.field9459;
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
                if (this.field9454 >= this.field9459 + var2) {
                    this.field9458.write(this.field9466, this.field9459, var2);
                } else {
                    int var3 = this.field9454 - this.field9459;
                    this.field9458.write(this.field9466, this.field9459, var3);
                    this.field9458.write(this.field9466, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field9460 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field9459 = (this.field9459 + var2) % this.field9454;
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II[BZ)V")
    public final void method3820(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field9463++;
        if (!arg3) {
            return;
        }
        if (arg0 < 0 || arg1 < 0 || (arg0 + arg1) > arg2.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field9460 != null) {
                throw new IOException(this.field9460.toString());
            }
            int var6;
            if (this.field9464 >= this.field9459) {
                var6 = this.field9454 + this.field9459 - this.field9464 - 1;
            } else {
                var6 = this.field9459 - this.field9464 - 1;
            }
            if (arg0 > var6) {
                throw new IOException("");
            }
            if (this.field9454 < this.field9464 + arg0) {
                int var7 = this.field9454 - this.field9464;
                class135.method999(arg2, arg1, this.field9466, this.field9464, var7);
                class135.method999(arg2, arg1 + var7, this.field9466, 0, arg0 - var7);
            } else {
                class135.method999(arg2, arg1, this.field9466, this.field9464, arg0);
            }
            this.field9464 = (this.field9464 + arg0) % this.field9454;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "([I[IILbi;ZI)Lkia;")
    public static final class622 method3821(int[] arg0, int[] arg1, int arg2, class483 arg3, boolean arg4, int arg5) {
        field9462++;
        if (!arg4) {
            return null;
        }
        byte[] var6 = new byte[arg2 * arg5];
        for (int var7 = 0; var7 < arg2; var7++) {
            int var8 = arg5 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg0[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class622(arg3, arg5, arg2, var6);
    }

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)V")
    public final void method3822(int arg0) {
        field9455++;
        synchronized (this) {
            if (this.field9460 == null) {
                this.field9460 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field9457.join();
        } catch (InterruptedException var4) {
        }
        int var3 = 55 / ((arg0 - 78) / 37);
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class677(OutputStream arg0, int arg1) {
        this.field9458 = arg0;
        this.field9454 = arg1 + 1;
        this.field9466 = new byte[this.field9454];
        this.field9457 = new Thread(this);
        this.field9457.setDaemon(true);
        this.field9457.start();
    }
}
