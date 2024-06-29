import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class223 implements Runnable {

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "I")
    private int field3186 = 0;

    @OriginalMember(owner = "client!rha", name = "j", descriptor = "I")
    private int field3194 = 0;

    @OriginalMember(owner = "client!rha", name = "i", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3193;

    @OriginalMember(owner = "client!rha", name = "l", descriptor = "I")
    private int field3196;

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "[B")
    private byte[] field3187;

    @OriginalMember(owner = "client!rha", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field3189;

    @OriginalMember(owner = "client!rha", name = "d", descriptor = "Luh;")
    public static class168 field3188 = new class168();

    @OriginalMember(owner = "client!rha", name = "f", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!rha", name = "g", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!rha", name = "h", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!rha", name = "k", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "Ljava/io/IOException;")
    private IOException field3185;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(B)V", line = 4)
    public static void method1577(byte arg0) {
        if (arg0 != 4) {
            field3188 = null;
        }
        field3188 = null;
    }

    @OriginalMember(owner = "client!rha", name = "run", descriptor = "()V", line = 15)
    public final void run() {
        field3191++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3185 != null) {
                        return;
                    }
                    if (this.field3194 < this.field3186) {
                        var2 = this.field3196 + this.field3194 - this.field3186;
                    } else {
                        var2 = this.field3194 - this.field3186;
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
                if (this.field3196 >= this.field3186 + var2) {
                    this.field3193.write(this.field3187, this.field3186, var2);
                } else {
                    int var3 = this.field3196 - this.field3186;
                    this.field3193.write(this.field3187, this.field3186, var3);
                    this.field3193.write(this.field3187, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field3185 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field3186 = (this.field3186 + var2) % this.field3196;
            }
        }
    }

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "(B)V", line = 76)
    public final void method1578(byte arg0) {
        synchronized (this) {
            if (this.field3185 == null) {
                this.field3185 = new IOException("");
            }
            this.notifyAll();
        }
        field3195++;
        if (arg0 != -99) {
            this.field3185 = null;
        }
        try {
            this.field3189.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)V", line = 107)
    public final void method1579(int arg0) {
        if (arg0 != -21179) {
            method1577((byte) 113);
        }
        field3192++;
        this.field3193 = new class349();
    }

    @OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 169)
    public class223(OutputStream arg0, int arg1) {
        this.field3193 = arg0;
        this.field3196 = arg1 + 1;
        this.field3187 = new byte[this.field3196];
        this.field3189 = new Thread(this);
        this.field3189.setDaemon(true);
        this.field3189.start();
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(BII[B)V", line = 121)
    public final void method1580(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3190++;
        if (arg1 < 0 || arg2 < 0 || arg3.length < (arg1 + arg2)) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3185 != null) {
                throw new IOException(this.field3185.toString());
            }
            int var6;
            if (this.field3186 <= this.field3194) {
                var6 = this.field3196 + this.field3186 - (this.field3194 - -1);
            } else {
                var6 = this.field3186 - this.field3194 - 1;
            }
            if (var6 < arg1) {
                throw new IOException("");
            }
            if (arg0 < 4) {
                this.method1579(65);
            }
            if (this.field3194 + arg1 > this.field3196) {
                int var7 = this.field3196 - this.field3194;
                class363.method2319(arg3, arg2, this.field3187, this.field3194, var7);
                class363.method2319(arg3, arg2 + var7, this.field3187, 0, arg1 - var7);
            } else {
                class363.method2319(arg3, arg2, this.field3187, this.field3194, arg1);
            }
            this.field3194 = (this.field3194 + arg1) % this.field3196;
            this.notifyAll();
        }
    }
}
