import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class153 implements Runnable {

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "Z")
    private boolean field2257 = false;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    private int field2262 = 0;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    private int field2260 = 0;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "Z")
    private boolean field2258 = false;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "Lkj;")
    private class590 field2265;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "Ljava/net/Socket;")
    private Socket field2276;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field2267;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2270;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    private int field2264;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "Lks;")
    public static class460 field2266 = new class460("", 12);

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "[B")
    public static byte[] field2275 = new byte[32896];

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "Lrb;")
    private class370 field2271;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "[B")
    private byte[] field2273;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2275[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 + 65535)) / 65535.0F))));
            }
        }
        field2277 = 0;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)I", line = 3)
    public final int method1172(int arg0) throws IOException {
        int var2 = 97 / ((-arg0 - 2) / 38);
        field2255++;
        return this.field2258 ? 0 : this.field2267.read();
    }

    @OriginalMember(owner = "client!qm", name = "finalize", descriptor = "()V", line = 17)
    protected final void finalize() {
        this.method1178(-33);
        field2272++;
    }

    @OriginalMember(owner = "client!qm", name = "run", descriptor = "()V", line = 25)
    public final void run() {
        field2261++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2262 == this.field2260) {
                        if (this.field2258) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field2262;
                    if (this.field2260 >= this.field2262) {
                        var3 = this.field2260 - this.field2262;
                    } else {
                        var3 = this.field2264 - this.field2262;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field2270.write(this.field2273, var2, var3);
                    } catch (IOException var9) {
                        this.field2257 = true;
                    }
                    this.field2262 = (this.field2262 + var3) % this.field2264;
                    try {
                        if (this.field2262 == this.field2260) {
                            this.field2270.flush();
                        }
                    } catch (IOException var8) {
                        this.field2257 = true;
                    }
                }
            }
            try {
                if (this.field2267 != null) {
                    this.field2267.close();
                }
                if (this.field2270 != null) {
                    this.field2270.close();
                }
                if (this.field2276 != null) {
                    this.field2276.close();
                }
            } catch (IOException var7) {
            }
            this.field2273 = null;
        } catch (Exception var12) {
            class329.method2129(null, false, var12);
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)I", line = 100)
    public final int method1173(int arg0) throws IOException {
        if (arg0 != 8122) {
            this.field2257 = false;
        }
        field2268++;
        return this.field2258 ? 0 : this.field2267.available();
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([BIII)V", line = 115)
    public final void method1174(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2254++;
        if (this.field2258) {
            return;
        }
        if (this.field2257) {
            this.field2257 = false;
            throw new IOException();
        }
        if (this.field2273 == null) {
            this.field2273 = new byte[this.field2264];
        }
        synchronized (this) {
            int var6 = 0;
            if (arg3 == 3) {
                while (arg2 > var6) {
                    this.field2273[this.field2260] = arg0[arg1 + var6];
                    this.field2260 = (this.field2260 + 1) % this.field2264;
                    if ((this.field2262 + this.field2264 - 100) % this.field2264 == this.field2260) {
                        throw new IOException();
                    }
                    var6++;
                }
                if (this.field2271 == null) {
                    this.field2271 = this.field2265.method3426(99, this, 3);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V", line = 165)
    public final void method1175(int arg0) {
        field2256++;
        if (this.field2258) {
            return;
        }
        this.field2267 = new class376();
        if (arg0 != 0) {
            field2266 = null;
        }
        this.field2270 = new class272();
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljava/net/Socket;Lkj;I)V", line = 347)
    public class153(Socket arg0, class590 arg1, int arg2) throws IOException {
        this.field2265 = arg1;
        this.field2276 = arg0;
        this.field2276.setSoTimeout(30000);
        this.field2276.setTcpNoDelay(true);
        this.field2267 = this.field2276.getInputStream();
        this.field2270 = this.field2276.getOutputStream();
        this.field2264 = arg2;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V", line = 186)
    public static void method1176(byte arg0) {
        if (arg0 < 112) {
            field2266 = null;
        }
        field2266 = null;
        field2275 = null;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V", line = 203)
    public final void method1177(byte arg0) throws IOException {
        if (arg0 != -35) {
            return;
        }
        field2259++;
        if (!this.field2258 && this.field2257) {
            this.field2257 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)V", line = 234)
    public final void method1178(int arg0) {
        if (arg0 > -13) {
            this.finalize();
        }
        field2263++;
        if (this.field2258) {
            return;
        }
        synchronized (this) {
            this.field2258 = true;
            this.notifyAll();
        }
        if (this.field2271 != null) {
            while (this.field2271.field5314 == 0) {
                class117.method820(false, 1L);
            }
            if (this.field2271.field5314 == 1) {
                try {
                    ((Thread) this.field2271.field5317).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2271 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III[B)V", line = 286)
    public final void method1179(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2269++;
        if (arg1 != 0) {
            this.field2265 = null;
        }
        if (this.field2258) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field2267.read(arg3, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)V", line = 312)
    public static final void method1180(int arg0, int arg1, int arg2) {
        field2274++;
        class678 var3 = class630.method3597(29636, arg0, (long) arg1);
        var3.method3834((byte) 24);
        var3.field9649 = arg2;
    }
}
