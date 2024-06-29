import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class144 implements Runnable {

    @OriginalMember(owner = "client!br", name = "f", descriptor = "Z")
    private boolean field1898 = false;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    private int field1901 = 0;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    private int field1896 = 0;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "Z")
    private boolean field1909 = false;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "Ljava/net/Socket;")
    private Socket field1910;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "Lhs;")
    private class441 field1893;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "Ljava/io/InputStream;")
    private InputStream field1904;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1899;

    @OriginalMember(owner = "client!br", name = "u", descriptor = "Lpi;")
    public static class340 field1913;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "Lqd;")
    private class277 field1902;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "[B")
    private byte[] field1906;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)I")
    public final int method1000(byte arg0) throws IOException {
        if (arg0 != 29) {
            this.method1007((byte) -115);
        }
        field1907++;
        return this.field1898 ? 0 : this.field1904.read();
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IB[BI)V")
    public final void method1001(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = 36 / ((arg1 + 57) / 47);
        field1912++;
        if (this.field1898) {
            return;
        }
        if (this.field1909) {
            this.field1909 = false;
            throw new IOException();
        }
        if (this.field1906 == null) {
            this.field1906 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg3; var7++) {
                this.field1906[this.field1896] = arg2[arg0 + var7];
                this.field1896 = (this.field1896 + 1) % 5000;
                if ((this.field1901 + 4900) % 5000 == this.field1896) {
                    throw new IOException();
                }
            }
            if (this.field1902 == null) {
                this.field1902 = this.field1893.method2620(this, 3, 74);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
    public final void method1002(int arg0) throws IOException {
        field1911++;
        if (arg0 != 6260) {
            this.field1901 = 10;
        }
        if (!this.field1898 && this.field1909) {
            this.field1909 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!br", name = "run", descriptor = "()V")
    public final void run() {
        field1905++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1901 == this.field1896) {
                        if (this.field1898) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field1896 < this.field1901) {
                        var2 = 5000 - this.field1901;
                    } else {
                        var2 = this.field1896 - this.field1901;
                    }
                    var3 = this.field1901;
                }
                if (var2 > 0) {
                    try {
                        this.field1899.write(this.field1906, var3, var2);
                    } catch (IOException var9) {
                        this.field1909 = true;
                    }
                    this.field1901 = (this.field1901 + var2) % 5000;
                    try {
                        if (this.field1901 == this.field1896) {
                            this.field1899.flush();
                        }
                    } catch (IOException var8) {
                        this.field1909 = true;
                    }
                }
            }
            try {
                if (this.field1904 != null) {
                    this.field1904.close();
                }
                if (this.field1899 != null) {
                    this.field1899.close();
                }
                if (this.field1910 != null) {
                    this.field1910.close();
                }
            } catch (IOException var7) {
            }
            this.field1906 = null;
        } catch (Exception var12) {
            class375.method2192((byte) 17, var12, null);
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
    public final void method1003(int arg0) {
        field1897++;
        if (this.field1898) {
            return;
        }
        synchronized (this) {
            if (arg0 != 1) {
                this.method1003(56);
            }
            this.field1898 = true;
            this.notifyAll();
        }
        if (this.field1902 != null) {
            while (this.field1902.field3542 == 0) {
                class463.method2773(1L, arg0 + 101);
            }
            if (this.field1902.field3542 == 1) {
                try {
                    ((Thread) this.field1902.field3541).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1902 = null;
    }

    @OriginalMember(owner = "client!br", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1903++;
        this.method1003(1);
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)I")
    public final int method1004(int arg0) throws IOException {
        field1894++;
        if (arg0 == 3) {
            return this.field1898 ? 0 : this.field1904.available();
        } else {
            return 49;
        }
    }

    @OriginalMember(owner = "client!br", name = "d", descriptor = "(I)V")
    public static void method1005(int arg0) {
        field1913 = null;
        if (arg0 != 2) {
            field1913 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "([BIII)V")
    public final void method1006(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field1900++;
        if (this.field1898) {
            return;
        }
        while (arg1 > 0) {
            int var6 = this.field1904.read(arg0, arg3, arg1);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg3 += var6;
            arg1 -= var6;
        }
        int var5 = 89 % ((arg2 - 58) / 52);
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(B)V")
    public final void method1007(byte arg0) {
        field1908++;
        if (arg0 < 21) {
            method1008((byte) 10);
        }
        if (!this.field1898) {
            this.field1904 = new class27();
            this.field1899 = new class94();
        }
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(B)I")
    public static final int method1008(byte arg0) {
        field1895++;
        if (arg0 != 109) {
            return 47;
        } else if (class460.field6432 == null) {
            return class159.field2092 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Ljava/net/Socket;Lhs;)V")
    public class144(Socket arg0, class441 arg1) throws IOException {
        this.field1910 = arg0;
        this.field1893 = arg1;
        this.field1910.setSoTimeout(30000);
        this.field1910.setTcpNoDelay(true);
        this.field1904 = this.field1910.getInputStream();
        this.field1899 = this.field1910.getOutputStream();
    }

    static {
        new class169("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        new class169("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field1913 = new class340(76, -2);
    }
}
