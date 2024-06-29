import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class404 implements Runnable {

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    private int field5838 = 0;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    private int field5847 = 0;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5839;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    private int field5840;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "[B")
    private byte[] field5834;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field5841;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field5835 = -1;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "[I")
    public static int[] field5832 = new int[1];

    @OriginalMember(owner = "client!af", name = "l", descriptor = "[C")
    private static char[] field5843 = new char[64];

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Liu;")
    public static class537 field5837;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Ljava/io/IOException;")
    private IOException field5833;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([BIIZ)V")
    public final void method2464(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        field5836++;
        if (arg1 < 0 || arg2 < 0 || arg0.length < (arg2 + arg1)) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field5833 != null) {
                throw new IOException(this.field5833.toString());
            }
            int var6;
            if (this.field5847 > this.field5838) {
                var6 = this.field5847 - this.field5838 - 1;
            } else {
                var6 = this.field5840 - (-this.field5847 + this.field5838) - 1;
            }
            if (var6 < arg1) {
                throw new IOException("");
            }
            if (this.field5838 + arg1 <= this.field5840) {
                class692.method3873(arg0, arg2, this.field5834, this.field5838, arg1);
            } else {
                int var7 = this.field5840 - this.field5838;
                class692.method3873(arg0, arg2, this.field5834, this.field5838, var7);
                class692.method3873(arg0, arg2 + var7, this.field5834, 0, arg1 - var7);
            }
            if (arg3) {
                this.field5838 = (this.field5838 + arg1) % this.field5840;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public final void method2465(int arg0) {
        this.field5839 = new class508();
        if (arg0 == -1) {
            field5845++;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
    public final void method2466(boolean arg0) {
        synchronized (this) {
            if (this.field5833 == null) {
                this.field5833 = new IOException("");
            }
            this.notifyAll();
        }
        field5846++;
        if (arg0) {
            method2468(7, -13);
        }
        try {
            this.field5841.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!af", name = "run", descriptor = "()V")
    public final void run() {
        field5844++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field5833 != null) {
                        return;
                    }
                    if (this.field5838 >= this.field5847) {
                        var2 = this.field5838 - this.field5847;
                    } else {
                        var2 = this.field5840 + this.field5838 - this.field5847;
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
                if (this.field5847 + var2 > this.field5840) {
                    int var3 = this.field5840 - this.field5847;
                    this.field5839.write(this.field5834, this.field5847, var3);
                    this.field5839.write(this.field5834, 0, var2 - var3);
                } else {
                    this.field5839.write(this.field5834, this.field5847, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field5833 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field5847 = (this.field5847 + var2) % this.field5840;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public static void method2467(int arg0) {
        field5837 = null;
        field5832 = null;
        field5843 = null;
        if (arg0 != -1) {
            field5843 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Lmo;")
    public static final class695 method2468(int arg0, int arg1) {
        field5842++;
        class695[] var2 = class27.method490((byte) -75);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class695 var4 = var2[var3];
            if (var4.field9793 == arg1) {
                return var4;
            }
        }
        if (arg0 != -1) {
            method2467(-14);
        }
        return null;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class404(OutputStream arg0, int arg1) {
        this.field5839 = arg0;
        this.field5840 = arg1 + 1;
        this.field5834 = new byte[this.field5840];
        this.field5841 = new Thread(this);
        this.field5841.setDaemon(true);
        this.field5841.start();
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field5843[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field5843[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field5843[var2] = (char) (var2 + 48 - 52);
        }
        field5843[63] = '/';
        field5843[62] = '+';
    }
}
