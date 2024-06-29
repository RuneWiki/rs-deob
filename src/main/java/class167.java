import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class167 implements Runnable {

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    private int field2312 = 0;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Z")
    private boolean field2309 = false;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    private int field2321 = 0;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "Z")
    private boolean field2323 = false;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "Ltk;")
    private class265 field2313;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "Ljava/net/Socket;")
    private Socket field2314;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field2315;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2318;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "Ldh;")
    public static class179 field2325 = new class179(64);

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "[Lah;")
    public static class219[] field2328 = new class219[8];

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "Loh;")
    private class18 field2308;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "Lbi;")
    public static class91 field2326;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "[B")
    private byte[] field2307;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "[[[I")
    public static int[][][] field2324;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)I", line = 5)
    public final int method1091(byte arg0) throws IOException {
        field2306++;
        if (arg0 != 18) {
            this.field2323 = false;
        }
        return this.field2309 ? 0 : this.field2315.available();
    }

    @OriginalMember(owner = "client!sm", name = "run", descriptor = "()V", line = 25)
    public final void run() {
        field2310++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field2321 == this.field2312) {
                        if (this.field2309) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    if (this.field2321 > this.field2312) {
                        var3 = 5000 - this.field2321;
                    } else {
                        var3 = this.field2312 - this.field2321;
                    }
                    var4 = this.field2321;
                }
                if (var3 > 0) {
                    try {
                        this.field2318.write(this.field2307, var4, var3);
                    } catch (IOException var12) {
                        this.field2323 = true;
                    }
                    this.field2321 = (this.field2321 + var3) % 5000;
                    try {
                        if (this.field2321 == this.field2312) {
                            this.field2318.flush();
                        }
                    } catch (IOException var11) {
                        this.field2323 = true;
                    }
                }
            }
            try {
                if (this.field2315 != null) {
                    this.field2315.close();
                }
                if (this.field2318 != null) {
                    this.field2318.close();
                }
                if (this.field2314 != null) {
                    this.field2314.close();
                }
            } catch (IOException var10) {
            }
            this.field2307 = null;
        } catch (Exception var15) {
            class42.method245((String) null, 1, var15);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III[B)V", line = 95)
    public final void method1092(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2322++;
        if (arg2 != -1) {
            method1093(-42);
        }
        if (this.field2309) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field2315.read(arg3, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 121)
    public static void method1093(int arg0) {
        field2324 = (int[][][]) null;
        field2328 = null;
        field2326 = null;
        if (arg0 < 79) {
            method1093(61);
        }
        field2325 = null;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)I", line = 135)
    public final int method1094(byte arg0) throws IOException {
        if (arg0 != 67) {
            this.field2312 = 121;
        }
        field2319++;
        return this.field2309 ? 0 : this.field2315.read();
    }

    @OriginalMember(owner = "client!sm", name = "finalize", descriptor = "()V", line = 152)
    protected final void finalize() {
        field2316++;
        this.method1096((byte) 116);
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V", line = 165)
    public final void method1095(int arg0) {
        field2327++;
        if (arg0 != 28782) {
            this.method1096((byte) 81);
        }
        if (!this.field2309) {
            this.field2315 = new class260();
            this.field2318 = new class10();
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljava/net/Socket;Ltk;)V", line = 310)
    public class167(Socket arg0, class265 arg1) throws IOException {
        this.field2313 = arg1;
        this.field2314 = arg0;
        this.field2314.setSoTimeout(30000);
        this.field2314.setTcpNoDelay(true);
        this.field2315 = this.field2314.getInputStream();
        this.field2318 = this.field2314.getOutputStream();
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(B)V", line = 184)
    public final void method1096(byte arg0) {
        field2317++;
        if (this.field2309) {
            return;
        }
        synchronized (this) {
            if (arg0 <= 52) {
                return;
            }
            this.field2309 = true;
            this.notifyAll();
        }
        if (this.field2308 != null) {
            while (this.field2308.field238 == 0) {
                class81.method485(1L, 1);
            }
            if (this.field2308.field238 == 1) {
                try {
                    ((Thread) this.field2308.field241).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field2308 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "([BIZI)V", line = 222)
    public final void method1097(byte[] arg0, int arg1, boolean arg2, int arg3) throws IOException {
        field2320++;
        if (this.field2309) {
            return;
        }
        if (this.field2323) {
            this.field2323 = false;
            throw new IOException();
        }
        if (this.field2307 == null) {
            this.field2307 = new byte[5000];
        }
        if (!arg2) {
            this.method1095(85);
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field2307[this.field2312] = arg0[arg1 + var6];
                this.field2312 = (this.field2312 + 1) % 5000;
                if (((this.field2321 + 4900) % 5000) == this.field2312) {
                    throw new IOException();
                }
            }
            if (this.field2308 == null) {
                this.field2308 = this.field2313.method1926(3, (byte) 49, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V", line = 282)
    public final void method1098(int arg0) throws IOException {
        field2311++;
        if (this.field2309) {
            return;
        }
        if (arg0 < 31) {
            this.field2323 = false;
        }
        if (this.field2323) {
            this.field2323 = false;
            throw new IOException();
        }
    }
}
