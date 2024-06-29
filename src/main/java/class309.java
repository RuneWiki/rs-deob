import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class309 implements Runnable {

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    private int field4494 = 0;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    private int field4498 = 0;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4496;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    private int field4497;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "[B")
    private byte[] field4506;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field4500;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "Z")
    public static boolean field4504 = false;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "Ljava/io/IOException;")
    private IOException field4499;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Liq;")
    public static final class190 method1896(int arg0, int arg1, int arg2) {
        class415 var3 = class526.field7777[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class190 var4 = var3.field5973;
            var3.field5973 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public final void method1897(byte arg0) {
        if (arg0 != -20) {
            this.field4498 = -20;
        }
        field4503++;
        this.field4496 = new class15();
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I[BII)V")
    public final void method1898(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4495++;
        if (arg0 < 0 || arg2 < 0 || arg1.length < (arg0 + arg2)) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            if (this.field4499 != null) {
                throw new IOException(this.field4499.toString());
            } else if (arg3 >= 109) {
                int var6;
                if (this.field4494 > this.field4498) {
                    var6 = this.field4494 - this.field4498 - 1;
                } else {
                    var6 = this.field4494 + this.field4497 - this.field4498 - 1;
                }
                if (arg0 > var6) {
                    throw new IOException("");
                }
                if (this.field4497 >= (this.field4498 + arg0)) {
                    class473.method2883(arg1, arg2, this.field4506, this.field4498, arg0);
                } else {
                    int var7 = this.field4497 - this.field4498;
                    class473.method2883(arg1, arg2, this.field4506, this.field4498, var7);
                    class473.method2883(arg1, arg2 + var7, this.field4506, 0, arg0 - var7);
                }
                this.field4498 = (this.field4498 + arg0) % this.field4497;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "run", descriptor = "()V")
    public final void run() {
        field4505++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4499 != null) {
                        return;
                    }
                    if (this.field4498 < this.field4494) {
                        var2 = this.field4497 - (this.field4494 - this.field4498);
                    } else {
                        var2 = this.field4498 - this.field4494;
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
                if (this.field4494 + var2 > this.field4497) {
                    int var3 = this.field4497 - this.field4494;
                    this.field4496.write(this.field4506, this.field4494, var3);
                    this.field4496.write(this.field4506, 0, var2 - var3);
                } else {
                    this.field4496.write(this.field4506, this.field4494, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field4499 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field4494 = (this.field4494 + var2) % this.field4497;
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1899(int arg0, byte arg1, int arg2) {
        field4502++;
        if (arg1 != -93) {
            method1901((byte) -4, null);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public final void method1900(int arg0) {
        if (arg0 != 1) {
            method1901((byte) 68, null);
        }
        synchronized (this) {
            if (this.field4499 == null) {
                this.field4499 = new IOException("");
            }
            this.notifyAll();
        }
        field4501++;
        try {
            this.field4500.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B[[I)V")
    public static final void method1901(byte arg0, int[][] arg1) {
        int var2 = 56 / ((arg0 + 36) / 52);
        field4507++;
        class47.field558 = arg1;
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class309(OutputStream arg0, int arg1) {
        this.field4496 = arg0;
        this.field4497 = arg1 + 1;
        this.field4506 = new byte[this.field4497];
        this.field4500 = new Thread(this);
        this.field4500.setDaemon(true);
        this.field4500.start();
    }

    static {
        new class487("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field4508 = 1;
    }
}
