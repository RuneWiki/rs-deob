import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class130 implements Runnable {

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    private int field2041 = 0;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    private int field2042 = 0;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "Z")
    private boolean field2037 = false;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "Z")
    private boolean field2054 = false;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "Ljava/net/Socket;")
    private Socket field2052;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Lna;")
    private class32 field2032;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field2034;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2048;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2031 = "K";

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2045 = "wave:";

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "I")
    public static int field2057 = 0;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "[I")
    public static int[] field2050 = new int[4096];

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "Lhc;")
    public static class235 field2055;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "Lgd;")
    private class76 field2040;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "[B")
    private byte[] field2058;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[BII)V")
    public final void method897(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2053++;
        if (this.field2037) {
            return;
        }
        if (this.field2054) {
            this.field2054 = false;
            throw new IOException();
        }
        if (this.field2058 == null) {
            this.field2058 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field2058[this.field2041] = arg1[arg2 + var6];
                this.field2041 = (this.field2041 + 1) % 5000;
                if ((this.field2042 + 4900) % 5000 == this.field2041) {
                    throw new IOException();
                }
            }
            if (arg3 != 5000) {
                this.field2052 = null;
            }
            if (this.field2040 == null) {
                this.field2040 = this.field2032.method257(3, this, (byte) -13);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)I")
    public final int method898(int arg0) throws IOException {
        field2038++;
        if (arg0 != 37) {
            this.field2058 = null;
        }
        return this.field2037 ? 0 : this.field2034.available();
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public final void method899(byte arg0) {
        field2043++;
        int var2 = -24 % ((79 - arg0) / 34);
        if (this.field2037) {
            return;
        }
        synchronized (this) {
            this.field2037 = true;
            this.notifyAll();
        }
        if (this.field2040 != null) {
            while (this.field2040.field1255 == 0) {
                class150.method1011((byte) 41, 1L);
            }
            if (this.field2040.field1255 == 1) {
                try {
                    ((Thread) this.field2040.field1258).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2040 = null;
    }

    @OriginalMember(owner = "client!nk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2046++;
        this.method899((byte) 33);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)V")
    public static final void method900(int arg0, int arg1, int arg2) {
        class217 var3 = class164.method1110(-71, arg0);
        field2033++;
        int var4 = var3.field3361;
        int var5 = var3.field3357;
        int var6 = var3.field3359;
        int var7 = class62.field1065[var6 - var5];
        if (arg2 > arg1 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class257.method1742((byte) 68, var4, var8 & arg1 << var5 | class240.field3910[var4] & ~var8);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V")
    public final void method901(byte arg0) throws IOException {
        field2047++;
        if (this.field2037) {
            return;
        }
        if (this.field2054) {
            this.field2054 = false;
            throw new IOException();
        } else if (arg0 < 55) {
            this.field2042 = -5;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(III)I")
    public static final int method902(int arg0, int arg1, int arg2) {
        field2051++;
        if (arg2 == -2) {
            return 12345678;
        }
        if (arg0 < 85) {
            method900(-48, 21, 79);
        }
        if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method903(int arg0, long arg1) {
        if (arg0 != -26704) {
            method905(-84);
        }
        field2049++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class221.field3398[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
    public final void method904(int arg0) {
        field2039++;
        if (this.field2037) {
            return;
        }
        this.field2034 = new class230();
        if (arg0 != -127) {
            this.run();
        }
        this.field2048 = new class8();
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V")
    public static void method905(int arg0) {
        field2050 = null;
        field2045 = null;
        field2055 = null;
        field2031 = null;
        if (arg0 <= 112) {
            field2057 = -73;
        }
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)I")
    public final int method906(int arg0) throws IOException {
        if (arg0 > -50) {
            field2055 = null;
        }
        field2044++;
        return this.field2037 ? 0 : this.field2034.read();
    }

    @OriginalMember(owner = "client!nk", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field2042 == this.field2041) {
                            if (this.field2037) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field2042;
                        if (this.field2042 > this.field2041) {
                            var3 = 5000 - this.field2042;
                        } else {
                            var3 = this.field2041 - this.field2042;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field2048.write(this.field2058, var2, var3);
                    } catch (IOException var9) {
                        this.field2054 = true;
                    }
                    this.field2042 = (this.field2042 + var3) % 5000;
                    try {
                        if (this.field2042 == this.field2041) {
                            this.field2048.flush();
                        }
                    } catch (IOException var8) {
                        this.field2054 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2034 != null) {
                        this.field2034.close();
                    }
                    if (this.field2048 != null) {
                        this.field2048.close();
                    }
                    if (this.field2052 != null) {
                        this.field2052.close();
                    }
                } catch (IOException var7) {
                }
                this.field2058 = null;
                break;
            }
        } catch (Exception var12) {
            class168.method1130((String) null, var12, 86);
        }
        field2036++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI[BI)V")
    public final void method907(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 < 93) {
            return;
        }
        field2035++;
        if (this.field2037) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field2034.read(arg2, arg3, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Ljava/net/Socket;Lna;)V")
    public class130(Socket arg0, class32 arg1) throws IOException {
        this.field2052 = arg0;
        this.field2032 = arg1;
        this.field2052.setSoTimeout(30000);
        this.field2052.setTcpNoDelay(true);
        this.field2034 = this.field2052.getInputStream();
        this.field2048 = this.field2052.getOutputStream();
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2050[var0] = class150.method1015(-342945940, var0);
        }
    }
}
