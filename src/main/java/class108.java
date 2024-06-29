import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class108 implements Runnable {

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    private int field1981 = 0;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "Z")
    private boolean field1992 = false;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    private int field1995 = 0;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Z")
    private boolean field1980 = false;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field1973;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Lvi;")
    private class229 field1978;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "Ljava/io/InputStream;")
    private InputStream field1986;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1997;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field1975 = 0;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "Ldj;")
    private static class44 field1977 = class89.method650(255, "Create a free account");

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Ldj;")
    public static class44 field1982 = field1977;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "Ldj;")
    private static class44 field1989 = class89.method650(255, "To play on this world move to a free area first)3");

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "Ldj;")
    public static class44 field1988 = field1989;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "[S")
    public static short[] field1990 = new short[500];

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "Ldj;")
    private static class44 field1996 = class89.method650(255, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "Ldj;")
    public static class44 field1970 = field1996;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "Lnf;")
    public static class147 field1993;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "Lqe;")
    private class176 field1984;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Lgb;")
    public static class69 field1974;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "[B")
    private byte[] field1991;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "[[I")
    public static int[][] field1979;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public final void method778(byte arg0) {
        int var2 = -58 / ((-arg0 - 70) / 40);
        field1969++;
        if (this.field1992) {
            return;
        }
        synchronized (this) {
            this.field1992 = true;
            this.notifyAll();
        }
        if (this.field1984 != null) {
            while (this.field1984.field3043 == 0) {
                class82.method617((byte) 31, 1L);
            }
            if (this.field1984.field3043 == 1) {
                try {
                    ((Thread) this.field1984.field3040).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1984 = null;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V")
    public static void method779(byte arg0) {
        field1977 = null;
        field1988 = null;
        if (arg0 != -21) {
            field1970 = null;
        }
        field1974 = null;
        field1996 = null;
        field1989 = null;
        field1990 = null;
        field1993 = null;
        field1982 = null;
        field1970 = null;
        field1979 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
    public static final void method780(int arg0, int arg1) {
        class222 var2 = (class222) class163.field2814.method832(-105);
        if (arg1 != -29566) {
            return;
        }
        while (var2 != null) {
            if ((var2.field3186 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method1148(-13215);
            }
            var2 = (class222) class163.field2814.method829((byte) 70);
        }
        field1987++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)I")
    public final int method781(int arg0) throws IOException {
        field1985++;
        if (arg0 > -96) {
            this.run();
        }
        return this.field1992 ? 0 : this.field1986.read();
    }

    @OriginalMember(owner = "client!jj", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1968++;
        this.method778((byte) -113);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[BII)V")
    public final void method782(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1983++;
        if (arg0 <= 49) {
            this.finalize();
        }
        if (this.field1992) {
            return;
        }
        if (this.field1980) {
            this.field1980 = false;
            throw new IOException();
        }
        if (this.field1991 == null) {
            this.field1991 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field1991[this.field1995] = arg1[arg3 + var6];
                this.field1995 = (this.field1995 + 1) % 5000;
                if ((this.field1981 + 4900) % 5000 == this.field1995) {
                    throw new IOException();
                }
            }
            if (this.field1984 == null) {
                this.field1984 = this.field1978.method1501(3, this, false);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)I")
    public final int method783(boolean arg0) throws IOException {
        if (arg0) {
            field1994++;
            return this.field1992 ? 0 : this.field1986.available();
        } else {
            return -54;
        }
    }

    @OriginalMember(owner = "client!jj", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field1995 == this.field1981) {
                            if (this.field1992) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field1981 > this.field1995) {
                            var2 = 5000 - this.field1981;
                        } else {
                            var2 = this.field1995 - this.field1981;
                        }
                        var3 = this.field1981;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field1997.write(this.field1991, var3, var2);
                    } catch (IOException var9) {
                        this.field1980 = true;
                    }
                    this.field1981 = (this.field1981 + var2) % 5000;
                    try {
                        if (this.field1995 == this.field1981) {
                            this.field1997.flush();
                        }
                    } catch (IOException var8) {
                        this.field1980 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1986 != null) {
                        this.field1986.close();
                    }
                    if (this.field1997 != null) {
                        this.field1997.close();
                    }
                    if (this.field1973 != null) {
                        this.field1973.close();
                    }
                } catch (IOException var7) {
                }
                this.field1991 = null;
                break;
            }
        } catch (Exception var12) {
            class173.method1099(107, null, var12);
        }
        field1972++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([BIIB)V")
    public final void method784(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field1971++;
        if (this.field1992) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field1986.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg1 += var5;
        }
        if (arg3 > -125) {
            method779((byte) 85);
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Ljava/net/Socket;Lvi;)V")
    public class108(Socket arg0, class229 arg1) throws IOException {
        this.field1973 = arg0;
        this.field1978 = arg1;
        this.field1973.setSoTimeout(30000);
        this.field1973.setTcpNoDelay(true);
        this.field1986 = this.field1973.getInputStream();
        this.field1997 = this.field1973.getOutputStream();
    }
}
