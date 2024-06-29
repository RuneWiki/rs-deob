import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class114 implements Runnable {

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    private int field1929 = 0;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Z")
    private boolean field1937 = false;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Z")
    private boolean field1925 = false;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    private int field1932 = 0;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Lsc;")
    private class229 field1938;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Ljava/net/Socket;")
    private Socket field1931;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field1922;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1926;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "D")
    public static double field1921 = -1.0D;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Lvh;")
    public static class252 field1920 = new class252();

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "[I")
    public static int[] field1946 = new int[128];

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Ldf;")
    public static class51 field1939 = class46.method233("scrollbar", 100);

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "Ldf;")
    private static class51 field1947 = class46.method233("Members only world", 100);

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "Ldf;")
    public static class51 field1943 = field1947;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "Ldf;")
    public static class51 field1942 = class46.method233("document)3cookie=(R", 100);

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Loj;")
    private class150 field1924;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "Z")
    public static boolean field1941;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "[B")
    private byte[] field1927;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lu;II)Lg;")
    public static final class254 method835(class111 arg0, int arg1, int arg2) {
        field1933++;
        return class241.method1656(arg1, arg2 + arg2, arg0) ? class11.method56(arg2) : null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    public static void method836(boolean arg0) {
        field1939 = null;
        if (!arg0) {
            return;
        }
        field1943 = null;
        field1946 = null;
        field1942 = null;
        field1947 = null;
        field1920 = null;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)I")
    public final int method837(boolean arg0) throws IOException {
        field1935++;
        if (this.field1925) {
            return 0;
        } else {
            if (arg0) {
                this.field1938 = null;
            }
            return this.field1922.available();
        }
    }

    @OriginalMember(owner = "client!fd", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field1932 == this.field1929) {
                            if (this.field1925) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field1929 > this.field1932) {
                            var2 = 5000 - this.field1929;
                        } else {
                            var2 = this.field1932 - this.field1929;
                        }
                        var3 = this.field1929;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field1926.write(this.field1927, var3, var2);
                    } catch (IOException var9) {
                        this.field1937 = true;
                    }
                    this.field1929 = (this.field1929 + var2) % 5000;
                    try {
                        if (this.field1932 == this.field1929) {
                            this.field1926.flush();
                        }
                    } catch (IOException var8) {
                        this.field1937 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1922 != null) {
                        this.field1922.close();
                    }
                    if (this.field1926 != null) {
                        this.field1926.close();
                    }
                    if (this.field1931 != null) {
                        this.field1931.close();
                    }
                } catch (IOException var7) {
                }
                this.field1927 = null;
                break;
            }
        } catch (Exception var12) {
            class89.method674(var12, (String) null, 95);
        }
        field1940++;
    }

    @OriginalMember(owner = "client!fd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1936++;
        this.method838(-128);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public final void method838(int arg0) {
        field1930++;
        if (this.field1925) {
            return;
        }
        synchronized (this) {
            if (arg0 >= -120) {
                return;
            }
            this.field1925 = true;
            this.notifyAll();
        }
        if (this.field1924 != null) {
            while (this.field1924.field2504 == 0) {
                class147.method1066(1L, 0);
            }
            if (this.field1924.field2504 == 1) {
                try {
                    ((Thread) this.field1924.field2505).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field1924 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I")
    public final int method839(byte arg0) throws IOException {
        field1928++;
        if (arg0 != 101) {
            this.field1929 = 106;
        }
        return this.field1925 ? 0 : this.field1922.read();
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[BI)V")
    public final void method840(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1945++;
        if (arg1 != -782) {
            this.run();
        }
        if (this.field1925) {
            return;
        }
        if (this.field1937) {
            this.field1937 = false;
            throw new IOException();
        }
        if (this.field1927 == null) {
            this.field1927 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field1927[this.field1932] = arg2[arg0 + var6];
                this.field1932 = (this.field1932 + 1) % 5000;
                if ((this.field1929 + 4900) % 5000 == this.field1932) {
                    throw new IOException();
                }
            }
            if (this.field1924 == null) {
                this.field1924 = this.field1938.method1570(this, -28437, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[BIB)V")
    public final void method841(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field1934++;
        if (this.field1925 || arg3 > -23) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field1922.read(arg1, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Llb;I)Lbj;")
    public static final class146 method842(class121 arg0, int arg1) {
        if (arg1 == 7899) {
            field1923++;
            return new class146(arg0.method884(14513), arg0.method884(arg1 ^ 0x266A), arg0.method884(14513), arg0.method884(14513), arg0.method891((byte) -119), arg0.method897(124));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/net/Socket;Lsc;)V")
    public class114(Socket arg0, class229 arg1) throws IOException {
        this.field1938 = arg1;
        this.field1931 = arg0;
        this.field1931.setSoTimeout(30000);
        this.field1931.setTcpNoDelay(true);
        this.field1922 = this.field1931.getInputStream();
        this.field1926 = this.field1931.getOutputStream();
    }
}
