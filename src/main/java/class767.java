import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class767 implements Runnable {

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "I")
    private int field10575 = 0;

    @OriginalMember(owner = "client!sia", name = "h", descriptor = "I")
    private int field10581 = 0;

    @OriginalMember(owner = "client!sia", name = "l", descriptor = "I")
    private int field10585;

    @OriginalMember(owner = "client!sia", name = "k", descriptor = "Ljava/io/InputStream;")
    private InputStream field10584;

    @OriginalMember(owner = "client!sia", name = "f", descriptor = "[B")
    private byte[] field10579;

    @OriginalMember(owner = "client!sia", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field10578;

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field10576 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!sia", name = "i", descriptor = "[I")
    public static int[] field10582 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "I")
    public static int field10574;

    @OriginalMember(owner = "client!sia", name = "d", descriptor = "I")
    public static int field10577;

    @OriginalMember(owner = "client!sia", name = "g", descriptor = "I")
    public static int field10580;

    @OriginalMember(owner = "client!sia", name = "j", descriptor = "I")
    public static int field10583;

    @OriginalMember(owner = "client!sia", name = "m", descriptor = "I")
    public static int field10586;

    @OriginalMember(owner = "client!sia", name = "n", descriptor = "I")
    public static int field10587;

    @OriginalMember(owner = "client!sia", name = "o", descriptor = "Ljava/io/IOException;")
    private IOException field10588;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(II)Z")
    public final boolean method4221(int arg0, int arg1) throws IOException {
        field10583++;
        if (~arg0 >= arg1 || arg0 >= this.field10585) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field10575 >= this.field10581) {
                var4 = this.field10575 - this.field10581;
            } else {
                var4 = this.field10585 + this.field10575 - this.field10581;
            }
            if (arg0 <= var4) {
                return true;
            } else if (this.field10588 == null) {
                return false;
            } else {
                throw new IOException(this.field10588.toString());
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(B[BII)I")
    public final int method4222(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 != -85) {
            this.method4226(126);
        }
        field10586++;
        if (arg2 < 0 || arg3 < 0 || arg1.length < arg2 + arg3) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field10581 <= this.field10575) {
                var6 = this.field10575 - this.field10581;
            } else {
                var6 = this.field10585 + this.field10575 - this.field10581;
            }
            if (arg2 > var6) {
                arg2 = var6;
            }
            if (arg2 == 0 && this.field10588 != null) {
                throw new IOException(this.field10588.toString());
            }
            if ((this.field10581 + arg2) > this.field10585) {
                int var7 = this.field10585 - this.field10581;
                class275.method1771(this.field10579, this.field10581, arg1, arg3, var7);
                class275.method1771(this.field10579, 0, arg1, arg3 + var7, -var7 + arg2);
            } else {
                class275.method1771(this.field10579, this.field10581, arg1, arg3, arg2);
            }
            this.field10581 = (this.field10581 + arg2) % this.field10585;
            this.notifyAll();
            return arg2;
        }
    }

    @OriginalMember(owner = "client!sia", name = "run", descriptor = "()V")
    public final void run() {
        field10580++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field10588 != null) {
                        return;
                    }
                    if (this.field10581 == 0) {
                        var2 = this.field10585 - this.field10575 - 1;
                    } else if (this.field10575 <= this.field10581) {
                        var2 = this.field10581 - this.field10575 - 1;
                    } else {
                        var2 = this.field10585 - this.field10575;
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
                var3 = this.field10584.read(this.field10579, this.field10575, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field10588 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field10575 = (this.field10575 + var3) % this.field10585;
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)V")
    public static void method4223(int arg0) {
        int var1 = -67 % ((-arg0 - 20) / 47);
        field10582 = null;
        field10576 = null;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(B)V")
    public final void method4224(byte arg0) {
        synchronized (this) {
            if (this.field10588 == null) {
                this.field10588 = new IOException("");
            }
            this.notifyAll();
        }
        field10577++;
        try {
            if (arg0 < 97) {
                this.field10581 = -90;
            }
            this.field10578.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lfca;I)Lne;")
    public static final class338 method4225(class93 arg0, int arg1) {
        field10574++;
        int var2 = arg0.method763(122);
        class528 var3 = class405.method2421((byte) -111)[arg0.method793((byte) 10)];
        int var4 = -37 % ((arg1 + 14) / 48);
        class494 var5 = class74.method638(-90)[arg0.method793((byte) 91)];
        int var6 = arg0.method774(-4);
        int var7 = arg0.method774(-4);
        return new class338(var2, var3, var5, var6, var7);
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(I)V")
    public final void method4226(int arg0) {
        this.field10584 = new class2();
        field10587++;
        if (arg0 > -45) {
            this.field10584 = null;
        }
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class767(InputStream arg0, int arg1) {
        this.field10585 = arg1 + 1;
        this.field10584 = arg0;
        this.field10579 = new byte[this.field10585];
        this.field10578 = new Thread(this);
        this.field10578.setDaemon(true);
        this.field10578.start();
    }
}
