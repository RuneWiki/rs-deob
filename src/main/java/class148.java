import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class148 implements Runnable {

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    private int field2216 = 0;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "Z")
    private boolean field2222 = false;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "Z")
    private boolean field2220 = false;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    private int field2226 = 0;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Ljava/net/Socket;")
    private Socket field2214;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "Lml;")
    private class219 field2209;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field2203;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2218;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "Z")
    public static boolean field2211 = false;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "Lsm;")
    private class156 field2205;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "[B")
    private byte[] field2212;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "[[Lec;")
    public static class129[][] field2215;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)I", line = 5)
    public final int method1089(byte arg0) throws IOException {
        field2204++;
        int var2 = 44 % ((10 - arg0) / 35);
        return this.field2220 ? 0 : this.field2203.available();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V", line = 20)
    public static void method1090(boolean arg0) {
        field2215 = null;
        if (arg0) {
            field2211 = true;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z[BII)V", line = 30)
    public final void method1091(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2206++;
        if (this.field2220) {
            return;
        }
        if (this.field2222) {
            this.field2222 = false;
            throw new IOException();
        }
        if (this.field2212 == null) {
            this.field2212 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            if (arg0) {
                method1095(-33, (byte) -18);
            }
            while (var6 < arg2) {
                this.field2212[this.field2226] = arg1[arg3 + var6];
                this.field2226 = (this.field2226 + 1) % 5000;
                if (((this.field2216 + 4900) % 5000) == this.field2226) {
                    throw new IOException();
                }
                var6++;
            }
            if (this.field2205 == null) {
                this.field2205 = this.field2209.method1538(3, 41, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 80)
    public final void method1092(int arg0) throws IOException {
        field2219++;
        if (arg0 < -67 && !this.field2220 && this.field2222) {
            this.field2222 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!kg", name = "finalize", descriptor = "()V", line = 102)
    protected final void finalize() {
        field2217++;
        this.method1093(false);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)V", line = 111)
    public final void method1093(boolean arg0) {
        field2210++;
        if (this.field2220) {
            return;
        }
        synchronized (this) {
            this.field2220 = true;
            this.notifyAll();
        }
        if (this.field2205 != null) {
            while (this.field2205.field2298 == 0) {
                class259.method1790((byte) -111, 1L);
            }
            if (this.field2205.field2298 == 1) {
                try {
                    ((Thread) this.field2205.field2295).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        if (arg0) {
            this.method1099(-13);
        }
        this.field2205 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZIB)I", line = 147)
    public static final int method1094(boolean arg0, int arg1, byte arg2) {
        field2207++;
        if (arg0) {
            return 0;
        }
        class101 var3 = class438.method2729(arg0, arg1, true);
        if (var3 == null) {
            return class249.method1731(arg1, 5).field5390;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -82 % ((arg2 + 53) / 40);
        while (var5 < var3.field1277.length) {
            if (var3.field1277[var5] == -1) {
                var4++;
            }
            var5++;
        }
        return var4 + (class249.method1731(arg1, 5).field5390 - var3.field1277.length);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)S", line = 184)
    public static final short method1095(int arg0, byte arg1) {
        field2223++;
        int var2 = (arg0 & 0xFE36) >> 10;
        int var3 = (arg0 & 0x382) >> 3;
        if (arg1 > -109) {
            method1097((class108) null, true);
        }
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }

    @OriginalMember(owner = "client!kg", name = "run", descriptor = "()V", line = 214)
    public final void run() {
        field2225++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2226 == this.field2216) {
                        if (this.field2220) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field2216 <= this.field2226) {
                        var2 = this.field2226 - this.field2216;
                    } else {
                        var2 = 5000 - this.field2216;
                    }
                    var3 = this.field2216;
                }
                if (var2 > 0) {
                    try {
                        this.field2218.write(this.field2212, var3, var2);
                    } catch (IOException var9) {
                        this.field2222 = true;
                    }
                    this.field2216 = (this.field2216 + var2) % 5000;
                    try {
                        if (this.field2226 == this.field2216) {
                            this.field2218.flush();
                        }
                    } catch (IOException var8) {
                        this.field2222 = true;
                    }
                }
            }
            try {
                if (this.field2203 != null) {
                    this.field2203.close();
                }
                if (this.field2218 != null) {
                    this.field2218.close();
                }
                if (this.field2214 != null) {
                    this.field2214.close();
                }
            } catch (IOException var7) {
            }
            this.field2212 = null;
        } catch (Exception var12) {
            class334.method2191(true, (String) null, var12);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[BII)V", line = 284)
    public final void method1096(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2224++;
        if (this.field2220) {
            return;
        }
        if (arg2 != -1) {
            this.field2212 = null;
        }
        while (arg0 > 0) {
            int var5 = this.field2203.read(arg1, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ltj;Z)V", line = 316)
    public static final void method1097(class108 arg0, boolean arg1) {
        if (!arg1) {
            field2211 = false;
        }
        field2208++;
        class409.field5872 = arg0;
        class117.field1585 = class409.field5872.method651(0, 4);
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljava/net/Socket;Lml;)V", line = 379)
    public class148(Socket arg0, class219 arg1) throws IOException {
        this.field2214 = arg0;
        this.field2209 = arg1;
        this.field2214.setSoTimeout(30000);
        this.field2214.setTcpNoDelay(true);
        this.field2203 = this.field2214.getInputStream();
        this.field2218 = this.field2214.getOutputStream();
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)I", line = 336)
    public final int method1098(byte arg0) throws IOException {
        field2221++;
        if (arg0 == 22) {
            return this.field2220 ? 0 : this.field2203.read();
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V", line = 357)
    public final void method1099(int arg0) {
        field2213++;
        if (this.field2220) {
            return;
        }
        if (arg0 != 4) {
            this.field2216 = -72;
        }
        this.field2203 = new class170();
        this.field2218 = new class327();
    }
}
