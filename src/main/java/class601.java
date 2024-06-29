import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class601 implements Runnable {

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    private int field8237 = 0;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Z")
    private boolean field8243 = false;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    private int field8245 = 0;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "Z")
    private boolean field8248 = false;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "Ljava/net/Socket;")
    private Socket field8257;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Lwea;")
    private class158 field8238;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Ljava/io/InputStream;")
    private InputStream field8241;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field8246;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    private int field8258;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Lej;")
    public static class124 field8250 = new class124(24, 7);

    @OriginalMember(owner = "client!re", name = "t", descriptor = "Lmu;")
    public static class303 field8254 = new class303(12, 0);

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field8259 = 0;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "Ljr;")
    public static class112 field8260 = new class112(10);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field8235;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field8240;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field8251;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Lof;")
    private class622 field8247;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "[B")
    private byte[] field8252;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)I")
    public final int method3416(byte arg0) throws IOException {
        field8240++;
        if (arg0 != 83) {
            field8254 = null;
        }
        return this.field8243 ? 0 : this.field8241.available();
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public final void method3417(int arg0) {
        field8256++;
        if (this.field8243) {
            return;
        }
        if (arg0 < 63) {
            this.field8246 = null;
        }
        this.field8241 = new class696();
        this.field8246 = new class345();
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static final void method3418(int arg0) {
        field8251++;
        class369.field5253 = 0;
        class94.field1656 = 0;
        int var1 = 29 % ((-arg0 - 42) / 63);
        for (int var2 = 0; var2 < class391.field5761; var2++) {
            int var3 = class589.field8025 * var2;
            for (int var4 = 0; var4 < class589.field8025; var4++) {
                int var5 = var3 + var4;
                class478.field6662[var5].method2959(class273.field3847 * var4, class386.field5603 * var2, class273.field3847, class386.field5603, 0, 0, true, true);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([BIII)V")
    public final void method3419(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field8244++;
        if (this.field8243) {
            return;
        }
        if (this.field8248) {
            this.field8248 = false;
            throw new IOException();
        }
        if (this.field8252 == null) {
            this.field8252 = new byte[this.field8258];
        }
        synchronized (this) {
            if (arg3 == -1) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    this.field8252[this.field8237] = arg0[arg2 + var6];
                    this.field8237 = (this.field8237 + 1) % this.field8258;
                    if (((this.field8245 - (100 - this.field8258)) % this.field8258) == this.field8237) {
                        throw new IOException();
                    }
                }
                if (this.field8247 == null) {
                    this.field8247 = this.field8238.method1210(this, -10240, 3);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
    public static void method3420(byte arg0) {
        if (arg0 >= 80) {
            field8260 = null;
            field8254 = null;
            field8250 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
    public final void method3421(boolean arg0) throws IOException {
        field8239++;
        if (arg0 && !this.field8243 && this.field8248) {
            this.field8248 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)I")
    public final int method3422(int arg0) throws IOException {
        field8236++;
        if (this.field8243) {
            return 0;
        } else if (arg0 == 0) {
            return this.field8241.read();
        } else {
            return 38;
        }
    }

    @OriginalMember(owner = "client!re", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field8245 == this.field8237) {
                            if (this.field8243) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field8245;
                        if (this.field8245 > this.field8237) {
                            var3 = this.field8258 - this.field8245;
                        } else {
                            var3 = this.field8237 - this.field8245;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field8246.write(this.field8252, var2, var3);
                    } catch (IOException var9) {
                        this.field8248 = true;
                    }
                    this.field8245 = (this.field8245 + var3) % this.field8258;
                    try {
                        if (this.field8245 == this.field8237) {
                            this.field8246.flush();
                        }
                    } catch (IOException var8) {
                        this.field8248 = true;
                    }
                    continue;
                }
                try {
                    if (this.field8241 != null) {
                        this.field8241.close();
                    }
                    if (this.field8246 != null) {
                        this.field8246.close();
                    }
                    if (this.field8257 != null) {
                        this.field8257.close();
                    }
                } catch (IOException var7) {
                }
                this.field8252 = null;
                break;
            }
        } catch (Exception var12) {
            class444.method2672(null, var12, 15004);
        }
        field8253++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([BIBI)V")
    public final void method3423(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field8255++;
        if (this.field8243) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field8241.read(arg0, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg1 += var5;
        }
        if (arg2 != -72) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BII)Z")
    public static final boolean method3424(byte arg0, int arg1, int arg2) {
        field8242++;
        if (arg0 > -95) {
            method3418(-48);
        }
        return class144.method1133((byte) -115, arg2, arg1) & class586.method3349(arg1, (byte) -72, arg2);
    }

    @OriginalMember(owner = "client!re", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field8235++;
        this.method3425((byte) -126);
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V")
    public final void method3425(byte arg0) {
        field8249++;
        if (this.field8243) {
            return;
        }
        synchronized (this) {
            this.field8243 = true;
            if (arg0 > -120) {
                this.method3425((byte) -105);
            }
            this.notifyAll();
        }
        if (this.field8247 != null) {
            while (this.field8247.field8462 == 0) {
                class700.method3916((byte) 105, 1L);
            }
            if (this.field8247.field8462 == 1) {
                try {
                    ((Thread) this.field8247.field8463).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field8247 = null;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Ljava/net/Socket;Lwea;I)V")
    public class601(Socket arg0, class158 arg1, int arg2) throws IOException {
        this.field8257 = arg0;
        this.field8238 = arg1;
        this.field8257.setSoTimeout(30000);
        this.field8257.setTcpNoDelay(true);
        this.field8241 = this.field8257.getInputStream();
        this.field8246 = this.field8257.getOutputStream();
        this.field8258 = arg2;
    }
}
