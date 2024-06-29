import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class165 implements Runnable {

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    private int field2679 = 0;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Z")
    private boolean field2680 = false;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    private int field2691 = 0;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "Z")
    private boolean field2695 = false;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "Lgi;")
    private class285 field2688;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "Ljava/net/Socket;")
    private Socket field2699;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "Ljava/io/InputStream;")
    private InputStream field2698;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2696;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Lsk;")
    public static class199 field2677 = new class199(50);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Lga;")
    private class147 field2678;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "Lhi;")
    public static class26 field2692;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "[B")
    private byte[] field2681;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)I", line = 5)
    public final int method1185(byte arg0) throws IOException {
        if (arg0 <= 31) {
            this.field2691 = 34;
        }
        field2676++;
        return this.field2680 ? 0 : this.field2698.available();
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BIII)I", line = 22)
    public static final int method1186(byte arg0, int arg1, int arg2, int arg3) {
        field2682++;
        int var4 = arg2 >> 7;
        if (arg0 != -58) {
            field2689 = 45;
        }
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class42.field641[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg2 & 0x7F;
        int var9 = (128 - var8) * class37.field569[var6][var4][var5 + 1] + (class37.field569[var6][var4 + 1][var5 + 1] * var8) >> 7;
        int var10 = (128 - var8) * class37.field569[var6][var4][var5] + class37.field569[var6][var4 + 1][var5] * var8 >> 7;
        return (128 - var7) * var10 + var7 * var9 >> 7;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III[B)V", line = 55)
    public final void method1187(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2684++;
        if (this.field2680) {
            return;
        }
        if (this.field2695) {
            this.field2695 = false;
            throw new IOException();
        }
        if (this.field2681 == null) {
            this.field2681 = new byte[5000];
        }
        synchronized (this) {
            if (arg2 >= -80) {
                method1194((byte) 59, 80, 107);
            }
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field2681[this.field2679] = arg3[arg0 + var6];
                this.field2679 = (this.field2679 + 1) % 5000;
                if (((this.field2691 + 4900) % 5000) == this.field2679) {
                    throw new IOException();
                }
            }
            if (this.field2678 == null) {
                this.field2678 = this.field2688.method1954(3, 0, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lhi;BLhi;)V", line = 111)
    public static final void method1188(class26 arg0, byte arg1, class26 arg2) {
        class103.field1691 = arg0;
        if (arg1 == 46) {
            class232.field4011 = arg2;
            field2700++;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B[BZ)Ljava/lang/Object;", line = 123)
    public static final Object method1189(byte arg0, byte[] arg1, boolean arg2) {
        if (arg0 != 47) {
            field2687 = 125;
        }
        field2675++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class192.field3236) {
            try {
                class115 var3 = (class115) Class.forName("dg").getDeclaredConstructor().newInstance();
                var3.method27(arg0 ^ 0x2F, arg1);
                return var3;
            } catch (Throwable var5) {
                class192.field3236 = true;
            }
        }
        return arg2 ? class81.method626(arg1, (byte) 69) : arg1;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Ljava/net/Socket;Lgi;)V", line = 377)
    public class165(Socket arg0, class285 arg1) throws IOException {
        this.field2688 = arg1;
        this.field2699 = arg0;
        this.field2699.setSoTimeout(30000);
        this.field2699.setTcpNoDelay(true);
        this.field2698 = this.field2699.getInputStream();
        this.field2696 = this.field2699.getOutputStream();
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V", line = 178)
    public static void method1190(boolean arg0) {
        if (!arg0) {
            field2687 = -63;
        }
        field2692 = null;
        field2677 = null;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)I", line = 189)
    public final int method1191(byte arg0) throws IOException {
        field2686++;
        if (arg0 <= 104) {
            method1189((byte) 75, (byte[]) null, true);
        }
        return this.field2680 ? 0 : this.field2698.read();
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BII[B)V", line = 213)
    public final void method1192(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2697++;
        if (this.field2680 || arg0 < 121) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field2698.read(arg3, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!jg", name = "finalize", descriptor = "()V", line = 239)
    protected final void finalize() {
        this.method1193(-1);
        field2685++;
    }

    @OriginalMember(owner = "client!jg", name = "run", descriptor = "()V", line = 247)
    public final void run() {
        field2694++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field2691 == this.field2679) {
                        if (this.field2680) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    if (this.field2679 < this.field2691) {
                        var3 = 5000 - this.field2691;
                    } else {
                        var3 = this.field2679 - this.field2691;
                    }
                    var4 = this.field2691;
                }
                if (var3 > 0) {
                    try {
                        this.field2696.write(this.field2681, var4, var3);
                    } catch (IOException var12) {
                        this.field2695 = true;
                    }
                    this.field2691 = (this.field2691 + var3) % 5000;
                    try {
                        if (this.field2691 == this.field2679) {
                            this.field2696.flush();
                        }
                    } catch (IOException var11) {
                        this.field2695 = true;
                    }
                }
            }
            try {
                if (this.field2698 != null) {
                    this.field2698.close();
                }
                if (this.field2696 != null) {
                    this.field2696.close();
                }
                if (this.field2699 != null) {
                    this.field2699.close();
                }
            } catch (IOException var10) {
            }
            this.field2681 = null;
        } catch (Exception var15) {
            class235.method1659(var15, (String) null, -28677);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 316)
    public final void method1193(int arg0) {
        field2693++;
        if (arg0 != -1 || this.field2680) {
            return;
        }
        synchronized (this) {
            this.field2680 = true;
            this.notifyAll();
        }
        if (this.field2678 != null) {
            while (this.field2678.field2322 == 0) {
                class99.method792(-1, 1L);
            }
            if (this.field2678.field2322 == 1) {
                try {
                    ((Thread) this.field2678.field2323).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field2678 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BII)Lji;", line = 357)
    public static final class151 method1194(byte arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            method1194((byte) -73, -93, 26);
        }
        field2690++;
        class151 var3 = (class151) class70.field1070.method311((byte) 114, (long) arg2 | (long) arg1 << 32);
        if (var3 == null) {
            var3 = new class151(arg1, arg2);
            class70.field1070.method309(var3, var3.field3499, 1);
        }
        return var3;
    }
}
