import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class170 implements Runnable {

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    private int field3285 = 0;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    private int field3291 = 0;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Z")
    private boolean field3287 = false;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Z")
    private boolean field3295 = false;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "Ljava/net/Socket;")
    private Socket field3300;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Lna;")
    private class130 field3296;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Ljava/io/InputStream;")
    private InputStream field3297;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3288;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field3282 = -1;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lof;")
    public static class145 field3281 = new class145();

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "[I")
    public static int[] field3301 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Lwg;")
    private class222 field3293;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "[B")
    private byte[] field3302;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "[I")
    public static int[] field3303;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "[[B")
    public static byte[][] field3299;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIB[B)V")
    public final void method1093(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field3284++;
        if (arg2 != -5) {
            field3281 = null;
        }
        if (this.field3295) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field3297.read(arg3, arg1, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I")
    public final int method1094(int arg0) throws IOException {
        field3283++;
        if (this.field3295) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.run();
            }
            return this.field3297.available();
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public final void method1095(byte arg0) {
        field3289++;
        if (this.field3295) {
            return;
        }
        synchronized (this) {
            this.field3295 = true;
            this.notifyAll();
        }
        if (arg0 < 122) {
            this.run();
        }
        if (this.field3293 != null) {
            while (this.field3293.field4254 == 0) {
                class151.method996(12121, 1L);
            }
            if (this.field3293.field4254 == 1) {
                try {
                    ((Thread) this.field3293.field4256).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3293 = null;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)I")
    public final int method1096(int arg0) throws IOException {
        if (arg0 != -31883) {
            this.field3296 = null;
        }
        field3294++;
        return this.field3295 ? 0 : this.field3297.read();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[BIB)V")
    public final void method1097(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        if (arg3 != -84) {
            return;
        }
        field3286++;
        if (this.field3295) {
            return;
        }
        if (this.field3287) {
            this.field3287 = false;
            throw new IOException();
        }
        if (this.field3302 == null) {
            this.field3302 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field3302[this.field3285] = arg1[arg0 + var6];
                this.field3285 = (this.field3285 + 1) % 5000;
                if ((this.field3291 + 4900) % 5000 == this.field3285) {
                    throw new IOException();
                }
            }
            if (this.field3293 == null) {
                this.field3293 = this.field3296.method835(3, -24542, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1095((byte) 125);
        field3298++;
    }

    @OriginalMember(owner = "client!ra", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field3291 == this.field3285) {
                            if (this.field3295) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field3291;
                        if (this.field3291 > this.field3285) {
                            var3 = 5000 - this.field3291;
                        } else {
                            var3 = this.field3285 - this.field3291;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field3288.write(this.field3302, var2, var3);
                    } catch (IOException var9) {
                        this.field3287 = true;
                    }
                    this.field3291 = (this.field3291 + var3) % 5000;
                    try {
                        if (this.field3291 == this.field3285) {
                            this.field3288.flush();
                        }
                    } catch (IOException var8) {
                        this.field3287 = true;
                    }
                    continue;
                }
                try {
                    if (this.field3297 != null) {
                        this.field3297.close();
                    }
                    if (this.field3288 != null) {
                        this.field3288.close();
                    }
                    if (this.field3300 != null) {
                        this.field3300.close();
                    }
                } catch (IOException var7) {
                }
                this.field3302 = null;
                break;
            }
        } catch (Exception var12) {
            class74.method461((byte) -126, var12, null);
        }
        field3290++;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
    public static void method1098(int arg0) {
        field3301 = null;
        field3281 = null;
        field3303 = null;
        field3299 = null;
        int var1 = 121 / ((-arg0 - 61) / 63);
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
    public static final void method1099(int arg0) {
        class198.field3859.method53(-51);
        int var1 = -91 / ((-arg0 - 46) / 58);
        field3292++;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Ljava/net/Socket;Lna;)V")
    public class170(Socket arg0, class130 arg1) throws IOException {
        this.field3300 = arg0;
        this.field3296 = arg1;
        this.field3300.setSoTimeout(30000);
        this.field3300.setTcpNoDelay(true);
        this.field3297 = this.field3300.getInputStream();
        this.field3288 = this.field3300.getOutputStream();
    }
}
