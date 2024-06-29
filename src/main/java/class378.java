import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class378 implements Runnable {

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "Z")
    private boolean field5517 = false;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    private int field5527 = 0;

    @OriginalMember(owner = "client!ur", name = "u", descriptor = "Z")
    private boolean field5536 = false;

    @OriginalMember(owner = "client!ur", name = "w", descriptor = "I")
    private int field5538 = 0;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "Llt;")
    private class480 field5518;

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field5530;

    @OriginalMember(owner = "client!ur", name = "t", descriptor = "Ljava/io/InputStream;")
    private InputStream field5535;

    @OriginalMember(owner = "client!ur", name = "s", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5534;

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "Lmf;")
    public static class291 field5531 = new class291();

    @OriginalMember(owner = "client!ur", name = "x", descriptor = "Ls;")
    public static class186 field5539 = new class186(48, -2);

    @OriginalMember(owner = "client!ur", name = "z", descriptor = "Lmf;")
    public static class291 field5541 = new class291();

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!ur", name = "r", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!ur", name = "v", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "Lwp;")
    private class121 field5523;

    @OriginalMember(owner = "client!ur", name = "y", descriptor = "Llt;")
    public static class480 field5540;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "[B")
    private byte[] field5522;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V", line = 4)
    public final void method2319(byte arg0) {
        field5520++;
        if (this.field5536) {
            return;
        }
        synchronized (this) {
            if (arg0 < 98) {
                this.run();
            }
            this.field5536 = true;
            this.notifyAll();
        }
        if (this.field5523 != null) {
            while (this.field5523.field2119 == 0) {
                class50.method470(1L, -5);
            }
            if (this.field5523.field2119 == 1) {
                try {
                    ((Thread) this.field5523.field2115).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field5523 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)Z", line = 40)
    public static final boolean method2320(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field5531 = null;
        }
        field5516++;
        return (arg1 & 0x70000) != 0 | class5.method39(1447, arg0, arg1) || class128.method1006(arg1, arg0, true);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)I", line = 53)
    public final int method2321(int arg0) throws IOException {
        field5519++;
        if (this.field5536) {
            return 0;
        } else if (arg0 == 0) {
            return this.field5535.available();
        } else {
            return 125;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIB[B)V", line = 71)
    public final void method2322(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        if (arg2 != 114) {
            return;
        }
        field5524++;
        if (this.field5536) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field5535.read(arg3, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)V", line = 96)
    public final void method2323(byte arg0) {
        field5537++;
        if (this.field5536) {
            return;
        }
        this.field5535 = new class335();
        if (arg0 != 6) {
            method2324(-29);
        }
        this.field5534 = new class373();
    }

    @OriginalMember(owner = "client!ur", name = "finalize", descriptor = "()V", line = 114)
    protected final void finalize() {
        field5525++;
        this.method2319((byte) 105);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V", line = 123)
    public static void method2324(int arg0) {
        int var1 = 123 / ((40 - arg0) / 60);
        field5539 = null;
        field5541 = null;
        field5540 = null;
        field5531 = null;
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Ljava/net/Socket;Llt;)V", line = 325)
    public class378(Socket arg0, class480 arg1) throws IOException {
        this.field5518 = arg1;
        this.field5530 = arg0;
        this.field5530.setSoTimeout(30000);
        this.field5530.setTcpNoDelay(true);
        this.field5535 = this.field5530.getInputStream();
        this.field5534 = this.field5530.getOutputStream();
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILjava/lang/String;C)I", line = 142)
    public static final int method2325(int arg0, String arg1, char arg2) {
        if (arg0 >= -21) {
            field5531 = null;
        }
        field5526++;
        int var3 = 0;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg1.charAt(var5) == arg2) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)V", line = 168)
    public static final void method2326(int arg0) {
        field5521++;
        if (class207.field3321) {
            return;
        }
        if (arg0 != 5000) {
            method2320(88, -23, 12);
        }
        if (class186.field2990.field2527) {
            class525.field7631 = ((int) class525.field7631 - 65 & 0xFFFFFF80);
        } else {
            class435.field6475 += (-class435.field6475 - 24.0F) / 2.0F;
        }
        class23.field339 = true;
        class207.field3321 = true;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V", line = 196)
    public final void method2327(boolean arg0) throws IOException {
        field5529++;
        if (this.field5536) {
            return;
        }
        if (!arg0) {
            field5540 = null;
        }
        if (this.field5517) {
            this.field5517 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ur", name = "run", descriptor = "()V", line = 229)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field5538 == this.field5527) {
                            if (this.field5536) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field5527 > this.field5538) {
                            var2 = 5000 - this.field5527;
                        } else {
                            var2 = this.field5538 - this.field5527;
                        }
                        var3 = this.field5527;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field5534.write(this.field5522, var3, var2);
                    } catch (IOException var9) {
                        this.field5517 = true;
                    }
                    this.field5527 = (this.field5527 + var2) % 5000;
                    try {
                        if (this.field5538 == this.field5527) {
                            this.field5534.flush();
                        }
                    } catch (IOException var8) {
                        this.field5517 = true;
                    }
                    continue;
                }
                try {
                    if (this.field5535 != null) {
                        this.field5535.close();
                    }
                    if (this.field5534 != null) {
                        this.field5534.close();
                    }
                    if (this.field5530 != null) {
                        this.field5530.close();
                    }
                } catch (IOException var7) {
                }
                this.field5522 = null;
                break;
            }
        } catch (Exception var12) {
            class486.method2913(null, var12, (byte) -114);
        }
        field5533++;
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)I", line = 300)
    public final int method2328(int arg0) throws IOException {
        field5532++;
        if (arg0 != 0) {
            this.field5534 = null;
        }
        return this.field5536 ? 0 : this.field5535.read();
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(III[B)V", line = 341)
    public final void method2329(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field5528++;
        if (this.field5536) {
            return;
        }
        if (this.field5517) {
            this.field5517 = false;
            throw new IOException();
        }
        if (arg2 != 3) {
            this.field5523 = null;
        }
        if (this.field5522 == null) {
            this.field5522 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field5522[this.field5538] = arg3[arg0 + var6];
                this.field5538 = (this.field5538 + 1) % 5000;
                if (((this.field5527 + 4900) % 5000) == this.field5538) {
                    throw new IOException();
                }
            }
            if (this.field5523 == null) {
                this.field5523 = this.field5518.method2860(-117, 3, this);
            }
            this.notifyAll();
        }
    }
}
