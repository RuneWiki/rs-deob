import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class111 implements Runnable {

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    private int field2086 = 0;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Z")
    private boolean field2085 = false;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    private int field2087 = 0;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Z")
    private boolean field2083 = false;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Ljava/net/Socket;")
    private Socket field2091;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lmc;")
    private class134 field2076;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field2078;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2098;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Ldb;")
    public static class36 field2077 = new class36();

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field2094 = 1;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Lkh;")
    public static class117 field2095 = class224.method1450((byte) 114, "(Y");

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field2096 = -1;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "Lfi;")
    private class65 field2097;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "[B")
    private byte[] field2075;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "[I")
    public static int[] field2088;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)I")
    public final int method747(int arg0) throws IOException {
        field2089++;
        if (arg0 == 1715) {
            return this.field2085 ? 0 : this.field2078.read();
        } else {
            return 114;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public final void method748(byte arg0) {
        field2090++;
        if (this.field2085) {
            return;
        }
        synchronized (this) {
            this.field2085 = true;
            this.notifyAll();
        }
        if (arg0 != -84) {
            method749(58, 76, -79, null);
        }
        if (this.field2097 != null) {
            while (this.field2097.field1262 == 0) {
                class165.method1167(-22942, 1L);
            }
            if (this.field2097.field1262 == 1) {
                try {
                    ((Thread) this.field2097.field1259).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2097 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[B)Lkh;")
    public static final class117 method749(int arg0, int arg1, int arg2, byte[] arg3) {
        class117 var4 = new class117();
        var4.field2196 = new byte[arg0];
        field2082++;
        var4.field2213 = 0;
        if (arg1 != 30000) {
            method752(-41);
        }
        for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
            if (arg3[var5] != 0) {
                var4.field2196[var4.field2213++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BII)V")
    public final void method750(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2080++;
        if (this.field2085) {
            return;
        }
        if (this.field2083) {
            this.field2083 = false;
            throw new IOException();
        } else if (arg2 == -7115) {
            if (this.field2075 == null) {
                this.field2075 = new byte[5000];
            }
            synchronized (this) {
                for (int var6 = 0; var6 < arg3; var6++) {
                    this.field2075[this.field2086] = arg1[arg0 + var6];
                    this.field2086 = (this.field2086 + 1) % 5000;
                    if ((this.field2087 + 4900) % 5000 == this.field2086) {
                        throw new IOException();
                    }
                }
                if (this.field2097 == null) {
                    this.field2097 = this.field2076.method890((byte) 121, 3, this);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2081++;
        this.method748((byte) -84);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)I")
    public final int method751(int arg0) throws IOException {
        if (arg0 != 10364) {
            method752(104);
        }
        field2093++;
        return this.field2085 ? 0 : this.field2078.available();
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    public static void method752(int arg0) {
        field2088 = null;
        field2095 = null;
        field2077 = null;
        if (arg0 <= 9) {
            method749(-113, -97, -126, null);
        }
    }

    @OriginalMember(owner = "client!kb", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field2087 == this.field2086) {
                            if (this.field2085) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field2087;
                        if (this.field2087 <= this.field2086) {
                            var3 = this.field2086 - this.field2087;
                        } else {
                            var3 = 5000 - this.field2087;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field2098.write(this.field2075, var2, var3);
                    } catch (IOException var9) {
                        this.field2083 = true;
                    }
                    this.field2087 = (this.field2087 + var3) % 5000;
                    try {
                        if (this.field2087 == this.field2086) {
                            this.field2098.flush();
                        }
                    } catch (IOException var8) {
                        this.field2083 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2078 != null) {
                        this.field2078.close();
                    }
                    if (this.field2098 != null) {
                        this.field2098.close();
                    }
                    if (this.field2091 != null) {
                        this.field2091.close();
                    }
                } catch (IOException var7) {
                }
                this.field2075 = null;
                break;
            }
        } catch (Exception var12) {
            class147.method1055(6678, null, var12);
        }
        field2079++;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(III[B)V")
    public final void method753(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg2 != -1) {
            return;
        }
        field2084++;
        if (this.field2085) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field2078.read(arg3, arg1, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Ljava/net/Socket;Lmc;)V")
    public class111(Socket arg0, class134 arg1) throws IOException {
        this.field2091 = arg0;
        this.field2076 = arg1;
        this.field2091.setSoTimeout(30000);
        this.field2091.setTcpNoDelay(true);
        this.field2078 = this.field2091.getInputStream();
        this.field2098 = this.field2091.getOutputStream();
    }
}
