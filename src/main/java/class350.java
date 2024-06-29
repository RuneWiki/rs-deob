import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class350 implements Runnable {

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    private int field5081 = 0;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Z")
    private boolean field5074 = false;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Z")
    private boolean field5066 = false;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    private int field5083 = 0;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "Ljava/net/Socket;")
    private Socket field5079;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lqn;")
    private class44 field5067;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Ljava/io/InputStream;")
    private InputStream field5077;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5065;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "Lfd;")
    public static class350 field5084;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Lit;")
    private class439 field5063;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "[B")
    private byte[] field5075;

    static {
        new class194("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)I", line = 7)
    public final int method2120(int arg0) throws IOException {
        field5069++;
        if (this.field5074) {
            return 0;
        } else if (arg0 < 84) {
            return -31;
        } else {
            return this.field5077.available();
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[BZI)V", line = 25)
    public final void method2121(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        field5071++;
        if (this.field5074) {
            return;
        }
        if (this.field5066) {
            this.field5066 = false;
            throw new IOException();
        }
        if (this.field5075 == null) {
            this.field5075 = new byte[5000];
        }
        if (arg2) {
            this.field5063 = null;
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field5075[this.field5083] = arg1[arg3 + var6];
                this.field5083 = (this.field5083 + 1) % 5000;
                if (((this.field5081 + 4900) % 5000) == this.field5083) {
                    throw new IOException();
                }
            }
            if (this.field5063 == null) {
                this.field5063 = this.field5067.method332(this, 2, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I", line = 77)
    public final int method2122(byte arg0) throws IOException {
        if (arg0 == -37) {
            field5073++;
            return this.field5074 ? 0 : this.field5077.read();
        } else {
            return -31;
        }
    }

    @OriginalMember(owner = "client!fd", name = "run", descriptor = "()V", line = 92)
    public final void run() {
        field5064++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field5083 == this.field5081) {
                        if (this.field5074) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field5081;
                    if (this.field5081 <= this.field5083) {
                        var3 = this.field5083 - this.field5081;
                    } else {
                        var3 = 5000 - this.field5081;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field5065.write(this.field5075, var2, var3);
                    } catch (IOException var9) {
                        this.field5066 = true;
                    }
                    this.field5081 = (this.field5081 + var3) % 5000;
                    try {
                        if (this.field5083 == this.field5081) {
                            this.field5065.flush();
                        }
                    } catch (IOException var8) {
                        this.field5066 = true;
                    }
                }
            }
            try {
                if (this.field5077 != null) {
                    this.field5077.close();
                }
                if (this.field5065 != null) {
                    this.field5065.close();
                }
                if (this.field5079 != null) {
                    this.field5079.close();
                }
            } catch (IOException var7) {
            }
            this.field5075 = null;
        } catch (Exception var12) {
            class356.method2169(var12, null, (byte) 34);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V", line = 162)
    public final void method2123(int arg0) {
        field5080++;
        if (this.field5074) {
            return;
        }
        synchronized (this) {
            int var3 = -25 / ((70 - arg0) / 41);
            this.field5074 = true;
            this.notifyAll();
        }
        if (this.field5063 != null) {
            while (this.field5063.field6417 == 0) {
                class322.method1935(true, 1L);
            }
            if (this.field5063.field6417 == 1) {
                try {
                    ((Thread) this.field5063.field6416).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field5063 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIZ)V", line = 198)
    public static final void method2124(int arg0, int arg1, int arg2, boolean arg3) {
        field5070++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class281.field4017 = arg3;
        int var4 = 86 / ((arg2 - 77) / 35);
        class63.field931 = arg0;
        class266.field3763 = arg1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB[BI)V", line = 217)
    public final void method2125(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field5076++;
        if (this.field5074) {
            return;
        }
        if (arg1 != -55) {
            field5085 = -50;
        }
        while (arg0 > 0) {
            int var5 = this.field5077.read(arg2, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!fd", name = "finalize", descriptor = "()V", line = 244)
    protected final void finalize() {
        field5082++;
        this.method2123(125);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V", line = 252)
    public static void method2126(boolean arg0) {
        if (!arg0) {
            field5084 = null;
        }
        field5084 = null;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V", line = 265)
    public final void method2127(int arg0) {
        field5072++;
        if (this.field5074) {
            return;
        }
        this.field5077 = new class13();
        if (arg0 <= 120) {
            this.run();
        }
        this.field5065 = new class423();
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/net/Socket;Lqn;)V", line = 321)
    public class350(Socket arg0, class44 arg1) throws IOException {
        this.field5079 = arg0;
        this.field5067 = arg1;
        this.field5079.setSoTimeout(30000);
        this.field5079.setTcpNoDelay(true);
        this.field5077 = this.field5079.getInputStream();
        this.field5065 = this.field5079.getOutputStream();
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V", line = 300)
    public final void method2128(int arg0) throws IOException {
        field5068++;
        if (arg0 == -22468 && !this.field5074 && this.field5066) {
            this.field5066 = false;
            throw new IOException();
        }
    }
}
