import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class328 implements Runnable {

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    private int field4012 = 0;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    private int field4014 = 0;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    private int field4022;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field4013;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "[B")
    private byte[] field4015;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field4016;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "Loa;")
    public static class228 field4021;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "Ljava/io/IOException;")
    private IOException field4018;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZII[B)I", line = 7)
    public final int method1843(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field4020++;
        if (arg0) {
            return -7;
        } else if (arg2 >= 0 && arg1 >= 0 && arg1 + arg2 <= arg3.length) {
            synchronized (this) {
                int var6;
                if (this.field4012 > this.field4014) {
                    var6 = this.field4022 + this.field4014 - this.field4012;
                } else {
                    var6 = this.field4014 - this.field4012;
                }
                if (var6 < arg2) {
                    arg2 = var6;
                }
                if (arg2 == 0 && this.field4018 != null) {
                    throw new IOException(this.field4018.toString());
                }
                if ((this.field4012 + arg2) <= this.field4022) {
                    class567.method3213(this.field4015, this.field4012, arg3, arg1, arg2);
                } else {
                    int var7 = this.field4022 - this.field4012;
                    class567.method3213(this.field4015, this.field4012, arg3, arg1, var7);
                    class567.method3213(this.field4015, 0, arg3, arg1 + var7, -var7 + arg2);
                }
                this.field4012 = (this.field4012 + arg2) % this.field4022;
                this.notifyAll();
                return arg2;
            }
        } else {
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Z", line = 50)
    public final boolean method1844(int arg0, int arg1) throws IOException {
        field4010++;
        if (arg0 >= arg1 || arg1 >= this.field4022) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field4012 > this.field4014) {
                var4 = this.field4022 + this.field4014 - this.field4012;
            } else {
                var4 = this.field4014 - this.field4012;
            }
            if (var4 >= arg1) {
                return true;
            } else if (this.field4018 == null) {
                return false;
            } else {
                throw new IOException(this.field4018.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)Ltn;", line = 80)
    public static final class570 method1845(int arg0, int arg1, int arg2) {
        class499 var3 = class487.field7044[arg0][arg1][arg2];
        return var3 == null || var3.field7230 == null ? null : var3.field7230;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 90)
    public final void method1846(byte arg0) {
        field4019++;
        if (arg0 != -5) {
            field4021 = null;
        }
        synchronized (this) {
            if (this.field4018 == null) {
                this.field4018 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4016.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ti", name = "run", descriptor = "()V", line = 112)
    public final void run() {
        field4011++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4018 != null) {
                        return;
                    }
                    if (this.field4012 == 0) {
                        var2 = this.field4022 - this.field4014 - 1;
                    } else if (this.field4014 > this.field4012) {
                        var2 = this.field4022 - this.field4014;
                    } else {
                        var2 = this.field4012 - this.field4014 - 1;
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
                var3 = this.field4013.read(this.field4015, this.field4014, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field4018 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field4014 = (this.field4014 + var3) % this.field4022;
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 170)
    public static void method1847(int arg0) {
        if (arg0 <= 123) {
            method1845(-28, 123, -87);
        }
        field4021 = null;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V", line = 182)
    public final void method1848(int arg0) {
        if (arg0 != -1) {
            method1847(-90);
        }
        field4017++;
        this.field4013 = new class604();
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 201)
    public class328(InputStream arg0, int arg1) {
        this.field4022 = arg1 + 1;
        this.field4013 = arg0;
        this.field4015 = new byte[this.field4022];
        this.field4016 = new Thread(this);
        this.field4016.setDaemon(true);
        this.field4016.start();
    }
}
