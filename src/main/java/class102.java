import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class102 implements Runnable {

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Z")
    private boolean field1804 = false;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "Z")
    private boolean field1820 = false;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    private int field1799 = 0;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    private int field1818 = 0;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "Ljava/net/Socket;")
    private Socket field1819;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "Lkh;")
    private class5 field1813;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Ljava/io/InputStream;")
    private InputStream field1801;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1812;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Lsb;")
    private static class98 field1798 = class47.method368("Examine", 0);

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Lsb;")
    public static class98 field1817 = field1798;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Z")
    public static boolean field1814 = false;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "[I")
    public static int[] field1821 = new int[32];

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field1822 = -1;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lbd;")
    private class22 field1802;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "[B")
    private byte[] field1797;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "[[[B")
    public static byte[][][] field1805;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIII)V")
    public static final void method784(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -1) {
            return;
        }
        field1816++;
        if (class116.field2077 <= arg3 && class215.field3666 >= arg3) {
            int var5 = class47.method369(arg1 ^ 0xFFFFFFFD, arg0, class229.field3933, class106.field1899);
            int var6 = class47.method369(arg1 + 3, arg2, class229.field3933, class106.field1899);
            class253.method1749(var5, var6, arg4, arg1 - 110, arg3);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)I")
    public final int method785(int arg0) throws IOException {
        field1808++;
        if (this.field1804) {
            return 0;
        } else {
            if (arg0 != -1795) {
                this.finalize();
            }
            return this.field1801.read();
        }
    }

    @OriginalMember(owner = "client!ca", name = "run", descriptor = "()V")
    public final void run() {
        field1806++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1818 == this.field1799) {
                        if (this.field1804) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field1799;
                    if (this.field1818 >= this.field1799) {
                        var3 = this.field1818 - this.field1799;
                    } else {
                        var3 = 5000 - this.field1799;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field1812.write(this.field1797, var2, var3);
                    } catch (IOException var9) {
                        this.field1820 = true;
                    }
                    this.field1799 = (this.field1799 + var3) % 5000;
                    try {
                        if (this.field1818 == this.field1799) {
                            this.field1812.flush();
                        }
                    } catch (IOException var8) {
                        this.field1820 = true;
                    }
                }
            }
            try {
                if (this.field1801 != null) {
                    this.field1801.close();
                }
                if (this.field1812 != null) {
                    this.field1812.close();
                }
                if (this.field1819 != null) {
                    this.field1819.close();
                }
            } catch (IOException var7) {
            }
            this.field1797 = null;
        } catch (Exception var12) {
            class243.method1678((String) null, var12, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)I")
    public final int method786(int arg0) throws IOException {
        field1815++;
        if (this.field1804) {
            return 0;
        } else {
            if (arg0 != 4316) {
                this.field1812 = null;
            }
            return this.field1801.available();
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([BIII)V")
    public final void method787(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg2 != 0) {
            this.method790(true);
        }
        field1810++;
        if (this.field1804) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field1801.read(arg0, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1807++;
        this.method790(false);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZII[B)V")
    public final void method788(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1803++;
        if (this.field1804) {
            return;
        }
        if (this.field1820) {
            this.field1820 = false;
            throw new IOException();
        }
        if (this.field1797 == null) {
            this.field1797 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field1797[this.field1818] = arg3[arg1 + var6];
                this.field1818 = (this.field1818 + 1) % 5000;
                if ((this.field1799 + 4900) % 5000 == this.field1818) {
                    throw new IOException();
                }
            }
            if (this.field1802 == null) {
                this.field1802 = this.field1813.method32(this, 3, (byte) -121);
            }
            this.notifyAll();
            if (!arg0) {
                method789(false);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public static void method789(boolean arg0) {
        field1798 = null;
        field1821 = null;
        field1805 = null;
        if (!arg0) {
            field1817 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(Z)V")
    public final void method790(boolean arg0) {
        field1800++;
        if (arg0 || this.field1804) {
            return;
        }
        synchronized (this) {
            this.field1804 = true;
            this.notifyAll();
        }
        if (this.field1802 != null) {
            while (this.field1802.field445 == 0) {
                class234.method1603(1L, 30);
            }
            if (this.field1802.field445 == 1) {
                try {
                    ((Thread) this.field1802.field447).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1802 = null;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ljava/net/Socket;Lkh;)V")
    public class102(Socket arg0, class5 arg1) throws IOException {
        this.field1819 = arg0;
        this.field1813 = arg1;
        this.field1819.setSoTimeout(30000);
        this.field1819.setTcpNoDelay(true);
        this.field1801 = this.field1819.getInputStream();
        this.field1812 = this.field1819.getOutputStream();
    }
}
