import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class230 implements Runnable {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    private int field2924 = 0;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    private int field2934 = 0;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    private int field2930;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "Ljava/io/InputStream;")
    private InputStream field2936;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "[B")
    private byte[] field2929;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field2928;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Lpr;")
    public static class407 field2933 = new class407(88, 6);

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "[C")
    public static char[] field2937 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Ljava/io/IOException;")
    private IOException field2932;

    @OriginalMember(owner = "client!kf", name = "run", descriptor = "()V")
    public final void run() {
        field2926++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2932 != null) {
                        return;
                    }
                    if (this.field2934 == 0) {
                        var2 = this.field2930 - this.field2924 - 1;
                    } else if (this.field2934 < this.field2924) {
                        var2 = this.field2930 - this.field2924;
                    } else {
                        var2 = this.field2934 - this.field2924 - 1;
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
                var3 = this.field2936.read(this.field2929, this.field2924, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field2932 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field2924 = (this.field2924 + var3) % this.field2930;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I")
    public static final int method1335(int arg0, int arg1) {
        int var2 = 109 / ((-arg0 - 63) / 49);
        field2931++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)Z")
    public final boolean method1336(int arg0, int arg1) throws IOException {
        field2925++;
        if (arg0 <= 0 || arg0 >= this.field2930) {
            throw new IOException();
        }
        synchronized (this) {
            if (arg1 != 251) {
                return false;
            }
            int var5;
            if (this.field2934 <= this.field2924) {
                var5 = this.field2924 - this.field2934;
            } else {
                var5 = this.field2930 + this.field2924 - this.field2934;
            }
            if (var5 >= arg0) {
                return true;
            } else if (this.field2932 == null) {
                return false;
            } else {
                throw new IOException(this.field2932.toString());
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public final void method1337(int arg0) {
        this.field2936 = new class275();
        field2927++;
        if (arg0 != 213) {
            method1338(false);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public static void method1338(boolean arg0) {
        if (!arg0) {
            field2937 = null;
        }
        field2933 = null;
        field2937 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBIII)V")
    public static final void method1339(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2935++;
        if (arg1 != -113) {
            method1338(true);
        }
        class530 var5 = class242.method1402(-44, 8, arg3);
        var5.method3025((byte) -69);
        var5.field7589 = arg2;
        var5.field7595 = arg0;
        var5.field7593 = arg4;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)V")
    public final void method1340(boolean arg0) {
        field2939++;
        synchronized (this) {
            if (this.field2932 == null) {
                this.field2932 = new IOException("");
            }
            this.notifyAll();
        }
        if (!arg0) {
            field2937 = null;
        }
        try {
            this.field2928.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([BIBI)I")
    public final int method1341(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field2938++;
        if (arg1 < 0 || arg3 < 0 || arg0.length < (arg1 + arg3)) {
            throw new IOException();
        }
        synchronized (this) {
            if (arg2 != 99) {
                this.method1340(true);
            }
            int var6;
            if (this.field2924 >= this.field2934) {
                var6 = this.field2924 - this.field2934;
            } else {
                var6 = this.field2930 + this.field2924 - this.field2934;
            }
            if (var6 < arg1) {
                arg1 = var6;
            }
            if (arg1 == 0 && this.field2932 != null) {
                throw new IOException(this.field2932.toString());
            }
            if (this.field2930 < (this.field2934 + arg1)) {
                int var7 = this.field2930 - this.field2934;
                class652.method3679(this.field2929, this.field2934, arg0, arg3, var7);
                class652.method3679(this.field2929, 0, arg0, arg3 + var7, arg1 - var7);
            } else {
                class652.method3679(this.field2929, this.field2934, arg0, arg3, arg1);
            }
            this.field2934 = (this.field2934 + arg1) % this.field2930;
            this.notifyAll();
            return arg1;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class230(InputStream arg0, int arg1) {
        this.field2930 = arg1 + 1;
        this.field2936 = arg0;
        this.field2929 = new byte[this.field2930];
        this.field2928 = new Thread(this);
        this.field2928.setDaemon(true);
        this.field2928.start();
    }
}
