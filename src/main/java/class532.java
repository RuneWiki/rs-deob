import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class532 implements Runnable {

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    private int field7846 = 0;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    private int field7850 = 0;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    private int field7856;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field7852;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "[B")
    private byte[] field7854;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field7848;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "J")
    public static long field7847 = 0L;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Lbd;")
    public static class44 field7845 = new class44("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "[I")
    public static int[] field7853 = new int[2048];

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "F")
    public static float field7851;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field7842;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Ljava/io/IOException;")
    private IOException field7849;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([BIII)V")
    public final void method3150(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field7844++;
        if (arg1 < ~arg3 || arg2 < 0 || arg0.length < (arg2 + arg3)) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            if (this.field7849 != null) {
                throw new IOException(this.field7849.toString());
            }
            int var6;
            if (this.field7850 < this.field7846) {
                var6 = this.field7846 - this.field7850 - 1;
            } else {
                var6 = this.field7856 + this.field7846 - this.field7850 - 1;
            }
            if (var6 < arg3) {
                throw new IOException("");
            }
            if (this.field7856 < (this.field7850 + arg3)) {
                int var7 = this.field7856 - this.field7850;
                class282.method1818(arg0, arg2, this.field7854, this.field7850, var7);
                class282.method1818(arg0, arg2 + var7, this.field7854, 0, arg3 - var7);
            } else {
                class282.method1818(arg0, arg2, this.field7854, this.field7850, arg3);
            }
            this.field7850 = (this.field7850 + arg3) % this.field7856;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!hd", name = "run", descriptor = "()V")
    public final void run() {
        field7843++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field7849 != null) {
                        return;
                    }
                    if (this.field7850 < this.field7846) {
                        var2 = this.field7856 + this.field7850 - this.field7846;
                    } else {
                        var2 = this.field7850 - this.field7846;
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
                if (this.field7856 >= (this.field7846 + var2)) {
                    this.field7852.write(this.field7854, this.field7846, var2);
                } else {
                    int var3 = this.field7856 - this.field7846;
                    this.field7852.write(this.field7854, this.field7846, var3);
                    this.field7852.write(this.field7854, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field7849 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field7846 = (this.field7846 + var2) % this.field7856;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public final void method3151(byte arg0) {
        field7855++;
        synchronized (this) {
            if (this.field7849 == null) {
                this.field7849 = new IOException("");
            }
            this.notifyAll();
            if (arg0 > -118) {
                this.method3151((byte) 51);
            }
        }
        try {
            this.field7848.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method3152(int arg0) {
        field7845 = null;
        if (arg0 != 0) {
            method3152(62);
        }
        field7853 = null;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public final void method3153(int arg0) {
        this.field7852 = new class206();
        if (arg0 <= -21) {
            field7842++;
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class532(OutputStream arg0, int arg1) {
        this.field7856 = arg1 + 1;
        this.field7852 = arg0;
        this.field7854 = new byte[this.field7856];
        this.field7848 = new Thread(this);
        this.field7848.setDaemon(true);
        this.field7848.start();
    }
}
