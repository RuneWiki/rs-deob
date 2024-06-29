import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class683 implements Runnable {

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
    private int field9489 = 0;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "Z")
    private boolean field9478 = false;

    @OriginalMember(owner = "client!ru", name = "t", descriptor = "Z")
    private boolean field9496 = false;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
    private int field9492 = 0;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "Lrp;")
    private class135 field9490;

    @OriginalMember(owner = "client!ru", name = "w", descriptor = "Ljava/net/Socket;")
    private Socket field9499;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "Ljava/io/InputStream;")
    private InputStream field9482;

    @OriginalMember(owner = "client!ru", name = "x", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field9500;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    private int field9480;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "Ljava/lang/String;")
    public static String field9483 = null;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    public static int field9479;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    public static int field9481;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    public static int field9484;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
    public static int field9485;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
    public static int field9486;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
    public static int field9487;

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
    public static int field9488;

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "I")
    public static int field9491;

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "I")
    public static int field9493;

    @OriginalMember(owner = "client!ru", name = "u", descriptor = "I")
    public static int field9497;

    @OriginalMember(owner = "client!ru", name = "v", descriptor = "I")
    public static int field9498;

    @OriginalMember(owner = "client!ru", name = "y", descriptor = "I")
    public static int field9501;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "Lcu;")
    public static class203 field9477;

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "Ljg;")
    private class246 field9494;

    @OriginalMember(owner = "client!ru", name = "s", descriptor = "[B")
    private byte[] field9495;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V", line = 16)
    public static void method3842(byte arg0) {
        field9477 = null;
        field9483 = null;
        if (arg0 < 1) {
            method3849((byte) -108);
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Ljava/net/Socket;Lrp;I)V", line = 352)
    public class683(Socket arg0, class135 arg1, int arg2) throws IOException {
        this.field9490 = arg1;
        this.field9499 = arg0;
        this.field9499.setSoTimeout(30000);
        this.field9499.setTcpNoDelay(true);
        this.field9482 = this.field9499.getInputStream();
        this.field9500 = this.field9499.getOutputStream();
        this.field9480 = arg2;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZII[B)V", line = 37)
    public final void method3843(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field9493++;
        if (arg0) {
            this.field9496 = true;
        }
        if (this.field9496) {
            return;
        }
        if (this.field9478) {
            this.field9478 = false;
            throw new IOException();
        }
        if (this.field9495 == null) {
            this.field9495 = new byte[this.field9480];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field9495[this.field9492] = arg3[arg2 + var6];
                this.field9492 = (this.field9492 + 1) % this.field9480;
                if (((this.field9489 + this.field9480 - 100) % this.field9480) == this.field9492) {
                    throw new IOException();
                }
            }
            if (this.field9494 == null) {
                this.field9494 = this.field9490.method872(3, (byte) -109, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ru", name = "run", descriptor = "()V", line = 89)
    public final void run() {
        field9479++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field9492 == this.field9489) {
                        if (this.field9496) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field9489 > this.field9492) {
                        var2 = this.field9480 - this.field9489;
                    } else {
                        var2 = this.field9492 - this.field9489;
                    }
                    var3 = this.field9489;
                }
                if (var2 > 0) {
                    try {
                        this.field9500.write(this.field9495, var3, var2);
                    } catch (IOException var9) {
                        this.field9478 = true;
                    }
                    this.field9489 = (this.field9489 + var2) % this.field9480;
                    try {
                        if (this.field9492 == this.field9489) {
                            this.field9500.flush();
                        }
                    } catch (IOException var8) {
                        this.field9478 = true;
                    }
                }
            }
            try {
                if (this.field9482 != null) {
                    this.field9482.close();
                }
                if (this.field9500 != null) {
                    this.field9500.close();
                }
                if (this.field9499 != null) {
                    this.field9499.close();
                }
            } catch (IOException var7) {
            }
            this.field9495 = null;
        } catch (Exception var12) {
            class31.method172(var12, null, 0);
        }
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)I", line = 157)
    public final int method3844(byte arg0) throws IOException {
        field9481++;
        if (arg0 != 98) {
            method3846(null, 23);
        }
        return this.field9496 ? 0 : this.field9482.available();
    }

    @OriginalMember(owner = "client!ru", name = "finalize", descriptor = "()V", line = 176)
    protected final void finalize() {
        this.method3850(105);
        field9491++;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "([BIIB)V", line = 184)
    public final void method3845(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field9485++;
        if (this.field9496) {
            return;
        }
        if (arg3 < 93) {
            field9483 = null;
        }
        while (arg1 > 0) {
            int var5 = this.field9482.read(arg0, arg2, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg2 += var5;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Ldc;I)V", line = 211)
    public static final void method3846(class63 arg0, int arg1) {
        field9487++;
        for (int var2 = 0; var2 < class451.field6255; var2++) {
            int var3 = arg0.method478(-120);
            int var4 = arg0.method482(-772591672);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class393.field5649[var3] != null) {
                class393.field5649[var3].field6040 = var4;
            }
        }
        if (arg1 != 65535) {
            method3842((byte) -98);
        }
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)V", line = 247)
    public final void method3847(byte arg0) throws IOException {
        int var2 = -25 / ((55 - arg0) / 54);
        field9501++;
        if (!this.field9496 && this.field9478) {
            this.field9478 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)I", line = 267)
    public final int method3848(int arg0) throws IOException {
        int var2 = -113 / ((66 - arg0) / 56);
        field9498++;
        return this.field9496 ? 0 : this.field9482.read();
    }

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "(B)Z", line = 287)
    public static final boolean method3849(byte arg0) {
        if (arg0 != -123) {
            field9477 = null;
        }
        field9488++;
        return class284.field4103 > 0;
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V", line = 298)
    public final void method3850(int arg0) {
        field9486++;
        if (this.field9496) {
            return;
        }
        synchronized (this) {
            this.field9496 = true;
            this.notifyAll();
            int var3 = 121 % ((40 - arg0) / 62);
        }
        if (this.field9494 != null) {
            while (this.field9494.field3633 == 0) {
                class688.method3874(1L, -7375);
            }
            if (this.field9494.field3633 == 1) {
                try {
                    ((Thread) this.field9494.field3638).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field9494 = null;
    }

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "(B)V", line = 335)
    public final void method3851(byte arg0) {
        field9484++;
        int var2 = -44 % ((-arg0 - 28) / 33);
        if (!this.field9496) {
            this.field9482 = new class148();
            this.field9500 = new class406();
        }
    }
}
