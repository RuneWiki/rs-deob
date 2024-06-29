import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class426 implements Runnable {

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    private int field6197 = 0;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Z")
    private boolean field6181 = false;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Z")
    private boolean field6199 = false;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    private int field6196 = 0;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Ljava/net/Socket;")
    private Socket field6189;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "Lfq;")
    private class137 field6201;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field6190;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field6191;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field6200 = 104;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Ltc;")
    private class236 field6183;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Lfo;")
    public static class361 field6186;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "[B")
    private byte[] field6195;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method2619(int arg0) {
        if (arg0 < 90) {
            method2619(13);
        }
        field6186 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z[BII)V")
    public final void method2620(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field6192++;
        if (this.field6199) {
            return;
        }
        if (this.field6181) {
            this.field6181 = false;
            throw new IOException();
        }
        if (this.field6195 == null) {
            this.field6195 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field6195[this.field6197] = arg1[arg2 + var6];
                this.field6197 = (this.field6197 + 1) % 5000;
                if ((this.field6196 + 4900) % 5000 == this.field6197) {
                    throw new IOException();
                }
            }
            if (arg0) {
                if (this.field6183 == null) {
                    this.field6183 = this.field6201.method838(this, 3, (byte) -117);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZII[B)V")
    public final void method2621(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field6185++;
        if (arg0) {
            this.finalize();
        }
        if (this.field6199) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field6190.read(arg3, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
    public final void method2622(int arg0) throws IOException {
        field6193++;
        if (!this.field6199 && arg0 == 3 && this.field6181) {
            this.field6181 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ke", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field6184++;
        this.method2625(true);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public final void method2623(byte arg0) {
        field6194++;
        if (!this.field6199) {
            this.field6190 = new class220();
            int var2 = -17 % ((arg0 - 53) / 62);
            this.field6191 = new class274();
        }
    }

    @OriginalMember(owner = "client!ke", name = "run", descriptor = "()V")
    public final void run() {
        field6198++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field6197 == this.field6196) {
                        if (this.field6199) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field6197 >= this.field6196) {
                        var2 = this.field6197 - this.field6196;
                    } else {
                        var2 = 5000 - this.field6196;
                    }
                    var3 = this.field6196;
                }
                if (var2 > 0) {
                    try {
                        this.field6191.write(this.field6195, var3, var2);
                    } catch (IOException var9) {
                        this.field6181 = true;
                    }
                    this.field6196 = (this.field6196 + var2) % 5000;
                    try {
                        if (this.field6197 == this.field6196) {
                            this.field6191.flush();
                        }
                    } catch (IOException var8) {
                        this.field6181 = true;
                    }
                }
            }
            try {
                if (this.field6190 != null) {
                    this.field6190.close();
                }
                if (this.field6191 != null) {
                    this.field6191.close();
                }
                if (this.field6189 != null) {
                    this.field6189.close();
                }
            } catch (IOException var7) {
            }
            this.field6195 = null;
        } catch (Exception var12) {
            client.method1256(var12, -2020, null);
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)I")
    public final int method2624(int arg0) throws IOException {
        field6188++;
        if (this.field6199) {
            return 0;
        } else if (arg0 < 106) {
            return 77;
        } else {
            return this.field6190.available();
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public final void method2625(boolean arg0) {
        field6187++;
        if (this.field6199) {
            return;
        }
        synchronized (this) {
            this.field6199 = arg0;
            this.notifyAll();
        }
        if (this.field6183 != null) {
            while (this.field6183.field3149 == 0) {
                class316.method1873(1L, false);
            }
            if (this.field6183.field3149 == 1) {
                try {
                    ((Thread) this.field6183.field3151).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field6183 = null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)I")
    public final int method2626(byte arg0) throws IOException {
        field6182++;
        if (this.field6199) {
            return 0;
        } else {
            int var2 = 127 / ((arg0 - 77) / 39);
            return this.field6190.read();
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Ljava/net/Socket;Lfq;)V")
    public class426(Socket arg0, class137 arg1) throws IOException {
        this.field6189 = arg0;
        this.field6201 = arg1;
        this.field6189.setSoTimeout(30000);
        this.field6189.setTcpNoDelay(true);
        this.field6190 = this.field6189.getInputStream();
        this.field6191 = this.field6189.getOutputStream();
    }
}
