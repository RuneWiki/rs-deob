import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class131 implements Runnable {

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "I")
    private int field1757 = 0;

    @OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
    private int field1764 = 0;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
    private int field1756;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1753;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "[B")
    private byte[] field1755;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field1751;

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "Loi;")
    public static class73 field1761 = new class73("", 13);

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "Ljava/io/IOException;")
    private IOException field1758;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II[BB)V")
    public final void method927(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field1754++;
        if (arg1 < 0 || arg0 < 0 || arg2.length < (arg0 + arg1)) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field1758 != null) {
                throw new IOException(this.field1758.toString());
            }
            int var6;
            if (this.field1764 >= this.field1757) {
                var6 = this.field1756 - this.field1764 - (-this.field1757 + 1);
            } else {
                var6 = this.field1757 - this.field1764 - 1;
            }
            if (arg1 > var6) {
                throw new IOException("");
            }
            if ((this.field1764 + arg1) > this.field1756) {
                int var7 = this.field1756 - this.field1764;
                class319.method2022(arg2, arg0, this.field1755, this.field1764, var7);
                class319.method2022(arg2, arg0 + var7, this.field1755, 0, arg1 - var7);
            } else {
                class319.method2022(arg2, arg0, this.field1755, this.field1764, arg1);
            }
            this.field1764 = (this.field1764 + arg1) % this.field1756;
            this.notifyAll();
        }
        if (arg3 != -89) {
            method930(null, (byte) 25);
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
    public final void method928(int arg0) {
        if (arg0 != 5) {
            this.field1757 = -108;
        }
        field1752++;
        this.field1753 = new class244();
    }

    @OriginalMember(owner = "client!hw", name = "run", descriptor = "()V")
    public final void run() {
        field1760++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1758 != null) {
                        return;
                    }
                    if (this.field1757 > this.field1764) {
                        var2 = this.field1764 + this.field1756 - this.field1757;
                    } else {
                        var2 = this.field1764 - this.field1757;
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
                if (this.field1756 >= this.field1757 + var2) {
                    this.field1753.write(this.field1755, this.field1757, var2);
                } else {
                    int var3 = this.field1756 - this.field1757;
                    this.field1753.write(this.field1755, this.field1757, var3);
                    this.field1753.write(this.field1755, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field1758 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field1757 = (this.field1757 + var2) % this.field1756;
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V")
    public static void method929(int arg0) {
        if (arg0 != 25191) {
            method929(-33);
        }
        field1761 = null;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Loda;B)Llr;")
    public static final class754 method930(class119 arg0, byte arg1) {
        field1759++;
        if (arg1 != 114) {
            method931(null);
        }
        class754 var2;
        if (class726.field10141 == null) {
            var2 = new class754();
        } else {
            var2 = class726.field10141;
            class726.field10141 = class726.field10141.field10537;
            var2.field10537 = null;
            class359.field5216--;
        }
        var2.field10542 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lda;)V")
    public static final void method931(class61 arg0) {
        class654.field9181 = arg0;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method932(byte arg0, String[] arg1) {
        field1763++;
        String[] var2 = new String[5];
        if (arg0 != -115) {
            field1761 = null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)V")
    public final void method933(boolean arg0) {
        synchronized (this) {
            if (this.field1758 == null) {
                this.field1758 = new IOException("");
            }
            this.notifyAll();
        }
        field1762++;
        try {
            this.field1751.join();
        } catch (InterruptedException var3) {
        }
        if (arg0) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class131(OutputStream arg0, int arg1) {
        this.field1756 = arg1 + 1;
        this.field1753 = arg0;
        this.field1755 = new byte[this.field1756];
        this.field1751 = new Thread(this);
        this.field1751.setDaemon(true);
        this.field1751.start();
    }
}
