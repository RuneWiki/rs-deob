import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class347 implements Runnable {

    @OriginalMember(owner = "client!gha", name = "k", descriptor = "I")
    private int field4861 = 0;

    @OriginalMember(owner = "client!gha", name = "m", descriptor = "I")
    private int field4863 = 0;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "I")
    private int field4851;

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field4853;

    @OriginalMember(owner = "client!gha", name = "i", descriptor = "[B")
    private byte[] field4859;

    @OriginalMember(owner = "client!gha", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field4862;

    @OriginalMember(owner = "client!gha", name = "n", descriptor = "I")
    public static int field4864 = 0;

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!gha", name = "d", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!gha", name = "e", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!gha", name = "f", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!gha", name = "g", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!gha", name = "h", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!gha", name = "j", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!gha", name = "o", descriptor = "Ljava/io/IOException;")
    private IOException field4865;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)V")
    public final void method2182(int arg0) {
        synchronized (this) {
            if (arg0 != 15984) {
                this.run();
            }
            if (this.field4865 == null) {
                this.field4865 = new IOException("");
            }
            this.notifyAll();
        }
        field4857++;
        try {
            this.field4862.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "(I)V")
    public static final void method2183(int arg0) {
        field4854++;
        if (class117.field1990 != null) {
            class178[] var1 = class117.field1990;
            for (int var2 = 0; var2 < var1.length; var2++) {
                class178 var3 = var1[var2];
                var3.method562(108);
            }
        }
        if (arg0 != 12639) {
            field4864 = 72;
        }
    }

    @OriginalMember(owner = "client!gha", name = "run", descriptor = "()V")
    public final void run() {
        field4858++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4865 != null) {
                        return;
                    }
                    if (this.field4861 == 0) {
                        var2 = this.field4851 - this.field4863 - 1;
                    } else if (this.field4861 < this.field4863) {
                        var2 = this.field4851 - this.field4863;
                    } else {
                        var2 = this.field4861 - this.field4863 - 1;
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
                var3 = this.field4853.read(this.field4859, this.field4863, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field4865 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field4863 = (this.field4863 + var3) % this.field4851;
            }
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(III[B)I")
    public final int method2184(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field4860++;
        if (arg0 < 0 || arg1 < 0 || (arg0 + arg1) > arg3.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field4863 >= this.field4861) {
                var6 = this.field4863 - this.field4861;
            } else {
                var6 = this.field4863 + this.field4851 - this.field4861;
            }
            if (arg0 > var6) {
                arg0 = var6;
            }
            if (arg0 == arg2 && this.field4865 != null) {
                throw new IOException(this.field4865.toString());
            }
            if (this.field4851 < this.field4861 + arg0) {
                int var7 = this.field4851 - this.field4861;
                class363.method2319(this.field4859, this.field4861, arg3, arg1, var7);
                class363.method2319(this.field4859, 0, arg3, arg1 + var7, arg0 - var7);
            } else {
                class363.method2319(this.field4859, this.field4861, arg3, arg1, arg0);
            }
            this.field4861 = (this.field4861 + arg0) % this.field4851;
            this.notifyAll();
            return arg0;
        }
    }

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "(I)V")
    public final void method2185(int arg0) {
        field4855++;
        if (arg0 != 0) {
            this.field4851 = 110;
        }
        this.field4853 = new class508();
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IZ)Z")
    public final boolean method2186(int arg0, boolean arg1) throws IOException {
        field4856++;
        if (arg0 <= 0 || arg0 >= this.field4851) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field4863 < this.field4861) {
                var4 = this.field4851 + this.field4863 - this.field4861;
            } else {
                var4 = this.field4863 - this.field4861;
            }
            if (var4 >= arg0) {
                return !arg1;
            } else if (this.field4865 == null) {
                return false;
            } else {
                throw new IOException(this.field4865.toString());
            }
        }
    }

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class347(InputStream arg0, int arg1) {
        this.field4851 = arg1 + 1;
        this.field4853 = arg0;
        this.field4859 = new byte[this.field4851];
        this.field4862 = new Thread(this);
        this.field4862.setDaemon(true);
        this.field4862.start();
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Ljb;I)Loga;")
    public static final class474 method2187(class494 arg0, int arg1) {
        if (arg1 < 9) {
            field4864 = -27;
        }
        field4852++;
        class474 var2;
        if (class313.field4342 == null) {
            var2 = new class474();
        } else {
            var2 = class313.field4342;
            class313.field4342 = class313.field4342.field6621;
            var2.field6621 = null;
            class22.field544--;
        }
        var2.field6623 = arg0;
        return var2;
    }
}
