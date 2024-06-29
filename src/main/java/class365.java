import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class365 implements Runnable {

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "I")
    private int field5026 = 0;

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "I")
    private int field5038 = 0;

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5027;

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "I")
    private int field5037;

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "[B")
    private byte[] field5028;

    @OriginalMember(owner = "client!uba", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field5032;

    @OriginalMember(owner = "client!uba", name = "g", descriptor = "[I")
    public static int[] field5031 = new int[5];

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!uba", name = "f", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!uba", name = "i", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!uba", name = "j", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!uba", name = "k", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "Ljava/io/IOException;")
    private IOException field5029;

    @OriginalMember(owner = "client!uba", name = "l", descriptor = "[I")
    public static int[] field5036;

    static {
        new class572("Select", "Auswählen", "Sélectionner", "Selecionar");
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V", line = 8)
    public final void method2196(byte arg0) {
        field5039++;
        if (arg0 <= -95) {
            this.field5027 = new class529();
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V", line = 20)
    public final void method2197(int arg0) {
        field5030++;
        synchronized (this) {
            if (this.field5029 == null) {
                this.field5029 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field5032.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 != -1) {
            this.field5027 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 177)
    public class365(OutputStream arg0, int arg1) {
        this.field5027 = arg0;
        this.field5037 = arg1 + 1;
        this.field5028 = new byte[this.field5037];
        this.field5032 = new Thread(this);
        this.field5032.setDaemon(true);
        this.field5032.start();
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I[BIB)V", line = 44)
    public final void method2198(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field5034++;
        if (arg2 < 0 || arg0 < 0 || (arg0 + arg2) > arg1.length) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            if (arg3 >= -63) {
                this.field5026 = 93;
            }
            if (this.field5029 != null) {
                throw new IOException(this.field5029.toString());
            }
            int var6;
            if (this.field5026 <= this.field5038) {
                var6 = this.field5037 + this.field5026 - this.field5038 - 1;
            } else {
                var6 = this.field5026 - this.field5038 - 1;
            }
            if (arg2 > var6) {
                throw new IOException("");
            }
            if (this.field5038 + arg2 > this.field5037) {
                int var7 = this.field5037 - this.field5038;
                class648.method3737(arg1, arg0, this.field5028, this.field5038, var7);
                class648.method3737(arg1, arg0 + var7, this.field5028, 0, arg2 - var7);
            } else {
                class648.method3737(arg1, arg0, this.field5028, this.field5038, arg2);
            }
            this.field5038 = (this.field5038 + arg2) % this.field5037;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(I)V", line = 90)
    public static void method2199(int arg0) {
        field5031 = null;
        field5036 = null;
        if (arg0 != 5) {
            method2199(-83);
        }
    }

    @OriginalMember(owner = "client!uba", name = "run", descriptor = "()V", line = 116)
    public final void run() {
        field5033++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field5029 != null) {
                        return;
                    }
                    if (this.field5038 >= this.field5026) {
                        var2 = this.field5038 - this.field5026;
                    } else {
                        var2 = this.field5038 + this.field5037 - this.field5026;
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
                if (this.field5037 >= (this.field5026 + var2)) {
                    this.field5027.write(this.field5028, this.field5026, var2);
                } else {
                    int var3 = this.field5037 - this.field5026;
                    this.field5027.write(this.field5028, this.field5026, var3);
                    this.field5027.write(this.field5028, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field5029 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field5026 = (this.field5026 + var2) % this.field5037;
            }
        }
    }
}
