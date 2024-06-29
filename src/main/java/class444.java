import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class444 implements Runnable {

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    private int field5886 = 0;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Z")
    private boolean field5891 = false;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "Z")
    private boolean field5902 = false;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    private int field5901 = 0;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "Lqg;")
    private class465 field5903;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "Ljava/net/Socket;")
    private Socket field5894;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Ljava/io/InputStream;")
    private InputStream field5890;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5899;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    private int field5897;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field5889 = -1;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Lsq;")
    private class181 field5885;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "[B")
    private byte[] field5906;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "[Lwf;")
    public static class138[] field5900;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[BI)V", line = 3)
    public final void method2512(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field5907++;
        if (this.field5902) {
            return;
        }
        if (this.field5891) {
            this.field5891 = false;
            throw new IOException();
        }
        if (this.field5906 == null) {
            this.field5906 = new byte[this.field5897];
        }
        synchronized (this) {
            for (int var6 = arg3; var6 < arg1; var6++) {
                this.field5906[this.field5886] = arg2[arg0 + var6];
                this.field5886 = (this.field5886 + 1) % this.field5897;
                if ((this.field5901 + this.field5897 - 100) % this.field5897 == this.field5886) {
                    throw new IOException();
                }
            }
            if (this.field5885 == null) {
                this.field5885 = this.field5903.method2643(3, this, (byte) 82);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[BZI)V", line = 58)
    public final void method2513(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        if (!arg2) {
            this.field5897 = -65;
        }
        field5888++;
        if (this.field5902) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field5890.read(arg1, arg0, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 84)
    public final void method2514(int arg0) {
        field5904++;
        if (this.field5902) {
            return;
        }
        if (arg0 != -31405) {
            method2516(-83);
        }
        synchronized (this) {
            this.field5902 = true;
            this.notifyAll();
        }
        if (this.field5885 != null) {
            while (this.field5885.field2538 == 0) {
                class149.method1052(1L, true);
            }
            if (this.field5885.field2538 == 1) {
                try {
                    ((Thread) this.field5885.field2540).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field5885 = null;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)I", line = 120)
    public final int method2515(int arg0) throws IOException {
        if (arg0 == 0) {
            field5895++;
            return this.field5902 ? 0 : this.field5890.available();
        } else {
            return 37;
        }
    }

    @OriginalMember(owner = "client!vj", name = "finalize", descriptor = "()V", line = 134)
    protected final void finalize() {
        field5892++;
        this.method2514(-31405);
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V", line = 145)
    public static final void method2516(int arg0) {
        field5905++;
        if (arg0 != 1) {
            method2518((byte) -109);
        }
        for (int var1 = 0; var1 < class405.field5126; var1++) {
            int var2 = class759.method4223(class124.field1784 + var1, class405.field5126, arg0 - 18846) * class15.field303;
            for (int var3 = 0; var3 < class15.field303; var3++) {
                int var4 = var2 + class759.method4223(class405.field5127 + var3, class15.field303, arg0 ^ 0xFFFFB662);
                if (class353.field4537[var4] == class224.field2988) {
                    class313.field4093[var4].method2343(0, 0, class409.field5194, class543.field7592, class409.field5194 * var3, class543.field7592 * var1, true, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "run", descriptor = "()V", line = 179)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field5901 == this.field5886) {
                            if (this.field5902) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field5901;
                        if (this.field5901 <= this.field5886) {
                            var3 = this.field5886 - this.field5901;
                        } else {
                            var3 = this.field5897 - this.field5901;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field5899.write(this.field5906, var2, var3);
                    } catch (IOException var9) {
                        this.field5891 = true;
                    }
                    this.field5901 = (this.field5901 + var3) % this.field5897;
                    try {
                        if (this.field5901 == this.field5886) {
                            this.field5899.flush();
                        }
                    } catch (IOException var8) {
                        this.field5891 = true;
                    }
                    continue;
                }
                try {
                    if (this.field5890 != null) {
                        this.field5890.close();
                    }
                    if (this.field5899 != null) {
                        this.field5899.close();
                    }
                    if (this.field5894 != null) {
                        this.field5894.close();
                    }
                } catch (IOException var7) {
                }
                this.field5906 = null;
                break;
            }
        } catch (Exception var12) {
            class684.method3842(1, var12, null);
        }
        field5887++;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Ljava/net/Socket;Lqg;I)V", line = 338)
    public class444(Socket arg0, class465 arg1, int arg2) throws IOException {
        this.field5903 = arg1;
        this.field5894 = arg0;
        this.field5894.setSoTimeout(30000);
        this.field5894.setTcpNoDelay(true);
        this.field5890 = this.field5894.getInputStream();
        this.field5899 = this.field5894.getOutputStream();
        this.field5897 = arg2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 261)
    public final void method2517(byte arg0) {
        field5896++;
        if (arg0 <= -93 && !this.field5902) {
            this.field5890 = new class464();
            this.field5899 = new class10();
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V", line = 278)
    public static void method2518(byte arg0) {
        field5900 = null;
        int var1 = -21 % ((23 - arg0) / 50);
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)I", line = 288)
    public final int method2519(int arg0) throws IOException {
        field5898++;
        if (arg0 != 3) {
            field5889 = -69;
        }
        return this.field5902 ? 0 : this.field5890.read();
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V", line = 311)
    public final void method2520(byte arg0) throws IOException {
        field5893++;
        if (!this.field5902 && arg0 <= -61 && this.field5891) {
            this.field5891 = false;
            throw new IOException();
        }
    }
}
