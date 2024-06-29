import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class749 implements Runnable {

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    private int field10368 = 0;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
    private int field10377 = 0;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "Ljava/io/InputStream;")
    private InputStream field10372;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
    private int field10380;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "[B")
    private byte[] field10378;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field10364;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "[I")
    public static int[] field10367 = new int[32];

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field10366 = 0;

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "[I")
    public static int[] field10381 = new int[128];

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "Lbu;")
    public static class21 field10382;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "Z")
    public static boolean field10383;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field10365;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field10370;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field10371;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public static int field10373;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public static int field10374;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
    public static int field10375;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
    public static int field10376;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    public static int field10379;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "Ljava/io/IOException;")
    private IOException field10369;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public final void method4169(int arg0) {
        if (arg0 == -1) {
            this.field10372 = new class763();
            field10373++;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
    public static final void method4170(int arg0) {
        field10379++;
        class92.method681((byte) -101, false);
        if (class703.field9810 >= 0 && class703.field9810 != 0) {
            class9.method61(class703.field9810, false, (byte) -40);
            class703.field9810 = -1;
        }
        int var1 = 100 / ((-arg0 - 62) / 61);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)Z")
    public final boolean method4171(int arg0, int arg1) throws IOException {
        field10376++;
        if (arg1 != 17896) {
            return false;
        } else if (arg0 > 0 && arg0 < this.field10380) {
            synchronized (this) {
                int var4;
                if (this.field10377 <= this.field10368) {
                    var4 = this.field10368 - this.field10377;
                } else {
                    var4 = this.field10380 + this.field10368 - this.field10377;
                }
                if (arg0 <= var4) {
                    return true;
                } else if (this.field10369 == null) {
                    this.notifyAll();
                    return false;
                } else {
                    throw new IOException(this.field10369.toString());
                }
            }
        } else {
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)V")
    public final void method4172(int arg0) {
        int var2 = 12 / ((86 - arg0) / 35);
        field10374++;
        synchronized (this) {
            if (this.field10369 == null) {
                this.field10369 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field10364.join();
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([IILfb;I)V")
    public static final void method4173(int[] arg0, int arg1, class702 arg2, int arg3) {
        field10370++;
        if (arg1 != 19523) {
            method4174(-32, null, null);
        }
        if (arg2.field4609 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg2.field4609.length; var5++) {
                if (arg2.field4609[var5] != arg0[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg2.field4604 != -1) {
                class607 var6 = class563.field7993.method651(arg2.field4604, (byte) 108);
                int var7 = var6.field8501;
                if (var7 == 1) {
                    arg2.field4580 = arg3;
                    arg2.field4657 = 1;
                    arg2.field4603 = 0;
                    arg2.field4583 = 0;
                    arg2.field4575 = 0;
                    if (!arg2.field4577) {
                        class760.method4227(arg1 - 19268, arg2, var6, arg2.field4583);
                    }
                }
                if (var7 == 2) {
                    arg2.field4603 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg0.length; var9++) {
            if (arg0[var9] != -1) {
                var8 = false;
            }
            if (arg2.field4609 == null || arg2.field4609[var9] == -1 || class563.field7993.method651(arg0[var9], (byte) 105).field8514 >= class563.field7993.method651(arg2.field4609[var9], (byte) 107).field8514) {
                arg2.field4609 = arg0;
                arg2.field4580 = arg3;
                break;
            }
        }
        if (var8) {
            arg2.field4580 = arg3;
            arg2.field4609 = arg0;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILal;Lal;)V")
    public static final void method4174(int arg0, class107 arg1, class107 arg2) {
        field10371++;
        if (arg2.field1598 != null) {
            arg2.method827(arg0 + 3);
        }
        if (arg0 != 0) {
            field10383 = false;
        }
        arg2.field1600 = arg1;
        arg2.field1598 = arg1.field1598;
        arg2.field1598.field1600 = arg2;
        arg2.field1600.field1598 = arg2;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([BZII)I")
    public final int method4175(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        field10375++;
        if (arg3 < 0 || arg2 < 0 || (arg2 + arg3) > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field10377 <= this.field10368) {
                var6 = this.field10368 - this.field10377;
            } else {
                var6 = this.field10380 + this.field10368 - this.field10377;
            }
            if (arg1) {
                method4176(72);
            }
            if (var6 < arg3) {
                arg3 = var6;
            }
            if (arg3 == 0 && this.field10369 != null) {
                throw new IOException(this.field10369.toString());
            }
            if (this.field10377 + arg3 > this.field10380) {
                int var7 = this.field10380 - this.field10377;
                class595.method3467(this.field10378, this.field10377, arg0, arg2, var7);
                class595.method3467(this.field10378, 0, arg0, arg2 + var7, arg3 - var7);
            } else {
                class595.method3467(this.field10378, this.field10377, arg0, arg2, arg3);
            }
            this.field10377 = (this.field10377 + arg3) % this.field10380;
            this.notifyAll();
            return arg3;
        }
    }

    @OriginalMember(owner = "client!jn", name = "run", descriptor = "()V")
    public final void run() {
        field10365++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field10369 != null) {
                        return;
                    }
                    if (this.field10377 == 0) {
                        var2 = this.field10380 - this.field10368 - 1;
                    } else if (this.field10377 > this.field10368) {
                        var2 = this.field10377 - this.field10368 - 1;
                    } else {
                        var2 = this.field10380 - this.field10368;
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
                var3 = this.field10372.read(this.field10378, this.field10368, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field10369 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field10368 = (this.field10368 + var3) % this.field10380;
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(I)V")
    public static void method4176(int arg0) {
        int var1 = 57 % ((arg0 + 46) / 35);
        field10367 = null;
        field10382 = null;
        field10381 = null;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class749(InputStream arg0, int arg1) {
        this.field10372 = arg0;
        this.field10380 = arg1 + 1;
        this.field10378 = new byte[this.field10380];
        this.field10364 = new Thread(this);
        this.field10364.setDaemon(true);
        this.field10364.start();
    }

    static {
        for (int var0 = 0; var0 < field10381.length; var0++) {
            field10381[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field10381[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field10381[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field10381[var3] = var3 + 52 - 48;
        }
        field10381[45] = field10381[47] = 63;
        field10381[42] = field10381[43] = 62;
        field10382 = new class21(110, 7);
        field10383 = false;
    }
}
