import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class117 implements Runnable {

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "Z")
    private boolean field1972 = false;

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "Z")
    private boolean field1970 = false;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    private int field1956 = 0;

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "I")
    private int field1976 = 0;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "Ljava/net/Socket;")
    private Socket field1959;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "Lna;")
    private class145 field1961;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "Ljava/io/InputStream;")
    private InputStream field1967;

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1977;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1953 = "Use";

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "I")
    public static int field1974 = 0;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public static int field1964 = 2;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "[B")
    public static byte[] field1958 = new byte[520];

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field1960 = 0;

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1981 = "Connecting to update server";

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ln", name = "B", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ln", name = "D", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "Len;")
    private class192 field1979;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "[B")
    private byte[] field1954;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V", line = 8)
    public final void method916(byte arg0) {
        field1968++;
        if (this.field1972) {
            return;
        }
        synchronized (this) {
            this.field1972 = true;
            this.notifyAll();
        }
        if (arg0 <= 62) {
            this.field1954 = (byte[]) null;
        }
        if (this.field1979 != null) {
            while (this.field1979.field3064 == 0) {
                class283.method2076((byte) -110, 1L);
            }
            if (this.field1979.field3064 == 1) {
                try {
                    ((Thread) this.field1979.field3066).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field1979 = null;
    }

    @OriginalMember(owner = "client!ln", name = "finalize", descriptor = "()V", line = 46)
    protected final void finalize() {
        this.method916((byte) 120);
        field1982++;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)V", line = 58)
    public final void method917(byte arg0) throws IOException {
        field1978++;
        if (this.field1972) {
            return;
        }
        if (this.field1970) {
            this.field1970 = false;
            throw new IOException();
        } else if (arg0 > -86) {
            method922(-100, -1, 0);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)I", line = 81)
    public final int method918(int arg0) throws IOException {
        if (arg0 == 0) {
            field1957++;
            return this.field1972 ? 0 : this.field1967.read();
        } else {
            return 11;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([BIIZ)V", line = 100)
    public final void method919(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        field1966++;
        if (!arg3) {
            field1969 = 78;
        }
        if (this.field1972) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field1967.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)V", line = 127)
    public final void method920(byte arg0) {
        field1965++;
        if (!this.field1972) {
            int var2 = -95 / ((arg0 + 8) / 49);
            this.field1967 = new class148();
            this.field1977 = new class149();
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V", line = 148)
    public static final void method921(boolean arg0) {
        class241.field3989++;
        if (!arg0) {
            field1962++;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)J", line = 160)
    public static final long method922(int arg0, int arg1, int arg2) {
        class36 var3 = class129.field2184[arg0][arg1][arg2];
        return var3 == null || var3.field537 == null ? 0L : var3.field537.field2972;
    }

    @OriginalMember(owner = "client!ln", name = "run", descriptor = "()V", line = 174)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                label88: {
                    synchronized (this) {
                        label89: {
                            if (this.field1976 == this.field1956) {
                                if (this.field1972) {
                                    break label89;
                                }
                                try {
                                    this.wait();
                                } catch (InterruptedException var13) {
                                }
                            }
                            var3 = this.field1956;
                            if (this.field1956 > this.field1976) {
                                var4 = 5000 - this.field1956;
                            } else {
                                var4 = this.field1976 - this.field1956;
                            }
                            break label88;
                        }
                    }
                    try {
                        if (this.field1967 != null) {
                            this.field1967.close();
                        }
                        if (this.field1977 != null) {
                            this.field1977.close();
                        }
                        if (this.field1959 != null) {
                            this.field1959.close();
                        }
                    } catch (IOException var10) {
                    }
                    this.field1954 = null;
                    break;
                }
                if (var4 > 0) {
                    try {
                        this.field1977.write(this.field1954, var3, var4);
                    } catch (IOException var12) {
                        this.field1970 = true;
                    }
                    this.field1956 = (this.field1956 + var4) % 5000;
                    try {
                        if (this.field1976 == this.field1956) {
                            this.field1977.flush();
                        }
                    } catch (IOException var11) {
                        this.field1970 = true;
                    }
                }
            }
        } catch (Exception var15) {
            class285.method2079(var15, (byte) -16, (String) null);
        }
        field1975++;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIII)V", line = 240)
    public static final void method923(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1963++;
        for (int var5 = arg2; var5 < class183.field2955; var5++) {
            if (arg0 < class54.field895[var5] + class222.field3637[var5] && class54.field895[var5] < (arg0 + arg1) && class78.field1349[var5] + class358.field5685[var5] > arg4 && class78.field1349[var5] < (arg4 + arg3)) {
                class12.field115[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[BII)V", line = 265)
    public final void method924(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1973++;
        if (this.field1972) {
            return;
        }
        if (this.field1970) {
            this.field1970 = false;
            throw new IOException();
        }
        if (this.field1954 == null) {
            this.field1954 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field1954[this.field1976] = arg1[arg0 + var6];
                this.field1976 = (this.field1976 + 1) % 5000;
                if ((this.field1956 + 4900) % 5000 == this.field1976) {
                    throw new IOException();
                }
            }
            if (this.field1979 == null) {
                this.field1979 = this.field1961.method1114((byte) 97, 3, this);
            }
            this.notifyAll();
        }
        if (arg3 <= 54) {
            this.field1977 = (OutputStream) null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Ljava/net/Socket;Lna;)V", line = 378)
    public class117(Socket arg0, class145 arg1) throws IOException {
        this.field1959 = arg0;
        this.field1961 = arg1;
        this.field1959.setSoTimeout(30000);
        this.field1959.setTcpNoDelay(true);
        this.field1967 = this.field1959.getInputStream();
        this.field1977 = this.field1959.getOutputStream();
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(III)V", line = 321)
    public static final void method925(int arg0, int arg1, int arg2) {
        field1955++;
        class321 var3 = class46.method370(arg1, (byte) -106, arg0);
        var3.method2265(false);
        var3.field5112 = arg2;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)I", line = 348)
    public final int method926(int arg0) throws IOException {
        if (arg0 != 0) {
            field1974 = 39;
        }
        field1971++;
        return this.field1972 ? 0 : this.field1967.available();
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V", line = 368)
    public static void method927(int arg0) {
        field1981 = null;
        field1953 = null;
        field1958 = null;
        if (arg0 != 0) {
            method925(-60, -69, 83);
        }
    }
}
