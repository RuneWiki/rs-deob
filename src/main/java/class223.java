import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class223 implements Runnable {

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "Z")
    private boolean field3210 = false;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "Z")
    private boolean field3213 = false;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    private int field3219 = 0;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    private int field3215 = 0;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Lwa;")
    private class80 field3200;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "Ljava/net/Socket;")
    private Socket field3217;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "Ljava/io/InputStream;")
    private InputStream field3207;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3204;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "Ljava/lang/String;")
    public static String field3218 = "flash1:";

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Lik;")
    public static class17 field3199 = new class17(16);

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "[I")
    public static int[] field3222 = new int[32];

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "Z")
    public static boolean field3220 = false;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    public static int field3223 = 0;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "[I")
    public static int[] field3221 = new int[25];

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "Lo;")
    private class285 field3212;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "[B")
    private byte[] field3201;

    @OriginalMember(owner = "client!nj", name = "run", descriptor = "()V", line = 10)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                label89: {
                    synchronized (this) {
                        label90: {
                            if (this.field3219 == this.field3215) {
                                if (this.field3210) {
                                    break label90;
                                }
                                try {
                                    this.wait();
                                } catch (InterruptedException var13) {
                                }
                            }
                            if (this.field3215 < this.field3219) {
                                var3 = 5000 - this.field3219;
                            } else {
                                var3 = this.field3215 - this.field3219;
                            }
                            var4 = this.field3219;
                            break label89;
                        }
                    }
                    try {
                        if (this.field3207 != null) {
                            this.field3207.close();
                        }
                        if (this.field3204 != null) {
                            this.field3204.close();
                        }
                        if (this.field3217 != null) {
                            this.field3217.close();
                        }
                    } catch (IOException var10) {
                    }
                    this.field3201 = null;
                    break;
                }
                if (var3 > 0) {
                    try {
                        this.field3204.write(this.field3201, var4, var3);
                    } catch (IOException var12) {
                        this.field3213 = true;
                    }
                    this.field3219 = (this.field3219 + var3) % 5000;
                    try {
                        if (this.field3219 == this.field3215) {
                            this.field3204.flush();
                        }
                    } catch (IOException var11) {
                        this.field3213 = true;
                    }
                }
            }
        } catch (Exception var15) {
            class187.method1307((String) null, var15, -124);
        }
        field3209++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)I", line = 76)
    public final int method1570(byte arg0) throws IOException {
        if (arg0 <= 18) {
            field3222 = (int[]) null;
        }
        field3216++;
        return this.field3210 ? 0 : this.field3207.read();
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 95)
    public static void method1571(int arg0) {
        field3222 = null;
        field3221 = null;
        field3218 = null;
        if (arg0 <= 117) {
            field3221 = (int[]) null;
        }
        field3199 = null;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)I", line = 113)
    public final int method1572(int arg0) throws IOException {
        field3198++;
        if (arg0 == 0) {
            return this.field3210 ? 0 : this.field3207.available();
        } else {
            return 20;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([BIII)V", line = 127)
    public final void method1573(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3214++;
        if (arg2 != -19451) {
            this.method1577((byte) 85);
        }
        if (this.field3210) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field3207.read(arg0, arg3, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lkm;Lkm;Lkm;B)V", line = 162)
    public static final void method1574(class133 arg0, class133 arg1, class133 arg2, byte arg3) {
        field3208++;
        int var4 = -36 % ((-arg3 - 70) / 41);
        class210.field3041 = arg0;
        class340.field5107 = arg2;
        class240.field3405 = arg1;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III[B)V", line = 176)
    public final void method1575(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3196++;
        if (this.field3210) {
            return;
        }
        if (this.field3213) {
            this.field3213 = false;
            throw new IOException();
        }
        if (this.field3201 == null) {
            this.field3201 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            if (arg2 != 5000) {
                this.method1578((byte) 40);
            }
            while (arg0 > var6) {
                this.field3201[this.field3215] = arg3[arg1 + var6];
                this.field3215 = (this.field3215 + 1) % 5000;
                if ((this.field3219 + 4900) % 5000 == this.field3215) {
                    throw new IOException();
                }
                var6++;
            }
            if (this.field3212 == null) {
                this.field3212 = this.field3200.method612(this, arg2 - 4921, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V", line = 231)
    public final void method1576(int arg0) throws IOException {
        int var2 = -18 % ((-arg0 - 68) / 48);
        field3197++;
        if (!this.field3210 && this.field3213) {
            this.field3213 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V", line = 251)
    public final void method1577(byte arg0) {
        field3202++;
        if (this.field3210) {
            return;
        }
        int var2 = 58 / ((arg0 + 62) / 34);
        synchronized (this) {
            this.field3210 = true;
            this.notifyAll();
        }
        if (this.field3212 != null) {
            while (this.field3212.field4241 == 0) {
                class186.method1304(10, 1L);
            }
            if (this.field3212.field4241 == 1) {
                try {
                    ((Thread) this.field3212.field4244).join();
                } catch (InterruptedException var6) {
                }
            }
        }
        this.field3212 = null;
    }

    @OriginalMember(owner = "client!nj", name = "finalize", descriptor = "()V", line = 290)
    protected final void finalize() {
        field3205++;
        this.method1577((byte) -20);
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ljava/net/Socket;Lwa;)V", line = 335)
    public class223(Socket arg0, class80 arg1) throws IOException {
        this.field3200 = arg1;
        this.field3217 = arg0;
        this.field3217.setSoTimeout(30000);
        this.field3217.setTcpNoDelay(true);
        this.field3207 = this.field3217.getInputStream();
        this.field3204 = this.field3217.getOutputStream();
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)V", line = 308)
    public final void method1578(byte arg0) {
        field3206++;
        if (this.field3210) {
            return;
        }
        this.field3207 = new class82();
        if (arg0 != -75) {
            this.field3207 = (InputStream) null;
        }
        this.field3204 = new class162();
    }
}
