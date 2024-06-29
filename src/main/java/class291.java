import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class291 implements Runnable {

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    private int field3680 = 0;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    private int field3684 = 0;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3681;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    private int field3678;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "[B")
    private byte[] field3675;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field3683;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "Lns;")
    public static class375 field3672 = new class375();

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "Ljava/io/IOException;")
    private IOException field3677;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V", line = 10)
    public final void method1745(byte arg0) {
        field3674++;
        if (arg0 != 90) {
            this.method1748((byte) 115);
        }
        this.field3681 = new class430();
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;B)J", line = 22)
    public static final long method1746(String arg0, byte arg1) {
        field3679++;
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        if (arg1 == -124) {
            while ((var2 % 37L) == 0L && var2 != 0L) {
                var2 /= 37L;
            }
            return var2;
        } else {
            return -4L;
        }
    }

    @OriginalMember(owner = "client!vn", name = "run", descriptor = "()V", line = 70)
    public final void run() {
        field3673++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3677 != null) {
                        return;
                    }
                    if (this.field3684 > this.field3680) {
                        var2 = this.field3680 + this.field3678 - this.field3684;
                    } else {
                        var2 = this.field3680 - this.field3684;
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
                if (this.field3684 + var2 > this.field3678) {
                    int var3 = this.field3678 - this.field3684;
                    this.field3681.write(this.field3675, this.field3684, var3);
                    this.field3681.write(this.field3675, 0, var2 - var3);
                } else {
                    this.field3681.write(this.field3675, this.field3684, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field3677 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field3684 = (this.field3684 + var2) % this.field3678;
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 227)
    public class291(OutputStream arg0, int arg1) {
        this.field3681 = arg0;
        this.field3678 = arg1 + 1;
        this.field3675 = new byte[this.field3678];
        this.field3683 = new Thread(this);
        this.field3683.setDaemon(true);
        this.field3683.start();
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIB[B)V", line = 135)
    public final void method1747(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field3676++;
        if (arg1 < 0 || arg0 < 0 || arg3.length < (arg0 + arg1)) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3677 != null) {
                throw new IOException(this.field3677.toString());
            }
            int var6;
            if (this.field3684 > this.field3680) {
                var6 = this.field3684 - this.field3680 - 1;
            } else {
                var6 = this.field3684 + this.field3678 - this.field3680 - 1;
            }
            if (var6 < arg1) {
                throw new IOException("");
            }
            if ((this.field3680 + arg1) <= this.field3678) {
                class70.method557(arg3, arg0, this.field3675, this.field3680, arg1);
            } else {
                int var7 = this.field3678 - this.field3680;
                class70.method557(arg3, arg0, this.field3675, this.field3680, var7);
                class70.method557(arg3, arg0 + var7, this.field3675, 0, arg1 - var7);
            }
            int var8 = 74 % ((arg2 - 11) / 63);
            this.field3680 = (this.field3680 + arg1) % this.field3678;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)V", line = 181)
    public final void method1748(byte arg0) {
        synchronized (this) {
            if (this.field3677 == null) {
                this.field3677 = new IOException("");
            }
            this.notifyAll();
        }
        field3682++;
        int var3 = 42 / ((72 - arg0) / 41);
        try {
            this.field3683.join();
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB)Z", line = 202)
    public static final boolean method1749(int arg0, byte arg1) {
        field3685++;
        int var2 = -125 % ((-arg1 - 43) / 37);
        return arg0 == 4 || arg0 == 8 || arg0 == 11;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 216)
    public static void method1750(int arg0) {
        int var1 = -77 / ((arg0 + 7) / 52);
        field3672 = null;
    }
}
