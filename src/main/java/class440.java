import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class440 implements Runnable {

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    private int field6402 = 0;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Z")
    private boolean field6403 = false;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "Z")
    private boolean field6404 = false;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    private int field6407 = 0;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Ljava/net/Socket;")
    private Socket field6384;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Lgt;")
    private class341 field6397;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Ljava/io/InputStream;")
    private InputStream field6390;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field6388;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Lvq;")
    public static class24 field6406 = new class24(65, 1);

    @OriginalMember(owner = "client!h", name = "z", descriptor = "Lbt;")
    public static class363 field6409 = new class363(64);

    @OriginalMember(owner = "client!h", name = "A", descriptor = "Ljn;")
    public static class409 field6410 = new class409("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!h", name = "B", descriptor = "I")
    public static int field6411 = 0;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "Z")
    public static boolean field6413 = false;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "Lvq;")
    public static class24 field6412 = new class24(93, -2);

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "Llf;")
    private class350 field6392;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "[B")
    private byte[] field6405;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "[I")
    public static int[] field6387;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[BI)V", line = 5)
    public final void method2694(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field6401++;
        if (this.field6403) {
            return;
        }
        if (this.field6404) {
            this.field6404 = false;
            throw new IOException();
        }
        if (this.field6405 == null) {
            this.field6405 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field6405[this.field6402] = arg2[arg3 + var6];
                this.field6402 = (this.field6402 + 1) % 5000;
                if ((this.field6407 + 4900) % 5000 == this.field6402) {
                    throw new IOException();
                }
            }
            if (this.field6392 == null) {
                this.field6392 = this.field6397.method2213(3, this, 26744);
            }
            this.notifyAll();
        }
        if (arg1 != 1) {
            field6410 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 58)
    public final void method2695(int arg0) {
        field6400++;
        if (arg0 != 0 || this.field6403) {
            return;
        }
        synchronized (this) {
            this.field6403 = true;
            this.notifyAll();
        }
        if (this.field6392 != null) {
            while (this.field6392.field5134 == 0) {
                class418.method2587(false, 1L);
            }
            if (this.field6392.field5134 == 1) {
                try {
                    ((Thread) this.field6392.field5129).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field6392 = null;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V", line = 96)
    public final void method2696(int arg0) {
        field6385++;
        if (this.field6403) {
            return;
        }
        if (arg0 <= 73) {
            this.finalize();
        }
        this.field6390 = new class72();
        this.field6388 = new class146();
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)I", line = 113)
    public final int method2697(int arg0) throws IOException {
        field6396++;
        if (arg0 >= -97) {
            this.field6392 = null;
        }
        return this.field6403 ? 0 : this.field6390.read();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 128)
    public static void method2698(boolean arg0) {
        if (!arg0) {
            method2698(true);
        }
        field6387 = null;
        field6412 = null;
        field6406 = null;
        field6410 = null;
        field6409 = null;
    }

    @OriginalMember(owner = "client!h", name = "run", descriptor = "()V", line = 144)
    public final void run() {
        field6398++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field6407 == this.field6402) {
                        if (this.field6403) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field6407;
                    if (this.field6402 < this.field6407) {
                        var3 = 5000 - this.field6407;
                    } else {
                        var3 = this.field6402 - this.field6407;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field6388.write(this.field6405, var2, var3);
                    } catch (IOException var9) {
                        this.field6404 = true;
                    }
                    this.field6407 = (this.field6407 + var3) % 5000;
                    try {
                        if (this.field6407 == this.field6402) {
                            this.field6388.flush();
                        }
                    } catch (IOException var8) {
                        this.field6404 = true;
                    }
                }
            }
            try {
                if (this.field6390 != null) {
                    this.field6390.close();
                }
                if (this.field6388 != null) {
                    this.field6388.close();
                }
                if (this.field6384 != null) {
                    this.field6384.close();
                }
            } catch (IOException var7) {
            }
            this.field6405 = null;
        } catch (Exception var12) {
            class365.method2331((String) null, var12, 28692);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZII)I", line = 219)
    public static final int method2699(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field6394++;
        int var5 = 65536 - class327.field4862[arg0 * 8192 / arg1] >> 1;
        return arg2 ? -57 : ((65536 - var5) * arg3 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V", line = 233)
    public static final void method2700(boolean arg0) {
        class264.field3902.method2313(121);
        if (arg0) {
            method2701(7);
        }
        field6389++;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V", line = 245)
    public static final void method2701(int arg0) {
        class167.field2197 = arg0;
        class264.field3912 = arg0;
        class294.field4274 = arg0;
        class131.field1785 = arg0;
        field6386++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[BB)V", line = 253)
    public final void method2702(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field6395++;
        if (this.field6403) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field6390.read(arg2, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg1 -= var5;
        }
        if (arg3 <= 88) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILct;)V", line = 284)
    public static final void method2703(int arg0, class104 arg1) {
        field6393++;
        class74.field946 = arg1;
        class74.field946.method734(111, 35);
        if (arg0 > -24) {
            field6412 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ljava/net/Socket;Lgt;)V", line = 357)
    public class440(Socket arg0, class341 arg1) throws IOException {
        this.field6384 = arg0;
        this.field6397 = arg1;
        this.field6384.setSoTimeout(30000);
        this.field6384.setTcpNoDelay(true);
        this.field6390 = this.field6384.getInputStream();
        this.field6388 = this.field6384.getOutputStream();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 304)
    public final void method2704(byte arg0) throws IOException {
        field6399++;
        if (arg0 < 0) {
            this.field6390 = null;
        }
        if (!this.field6403 && this.field6404) {
            this.field6404 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)I", line = 332)
    public final int method2705(int arg0) throws IOException {
        field6391++;
        if (arg0 > -52) {
            method2698(false);
        }
        return this.field6403 ? 0 : this.field6390.available();
    }

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 378)
    protected final void finalize() {
        this.method2695(0);
        field6408++;
    }
}
