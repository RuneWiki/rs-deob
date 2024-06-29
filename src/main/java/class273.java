import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class273 implements Runnable {

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Z")
    private boolean field4344 = false;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    private int field4339 = 0;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    private int field4348 = 0;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "Z")
    private boolean field4356 = false;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Ljava/net/Socket;")
    private Socket field4337;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "Lbk;")
    private class20 field4346;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Ljava/io/InputStream;")
    private InputStream field4342;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4341;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "S")
    public static short field4350 = 320;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "Lol;")
    private class208 field4343;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "[B")
    private byte[] field4358;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "[Lhc;")
    public static class229[] field4349;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static final void method1838(byte arg0) {
        field4353++;
        int var1 = -112 % ((-arg0 - 62) / 63);
        for (class83 var2 = (class83) class272.field4323.method350(8240); var2 != null; var2 = (class83) class272.field4323.method353((byte) -123)) {
            if (var2.field1296 == -1) {
                var2.field1308 = 0;
                class62.method433(true, var2);
            } else {
                var2.method784(false);
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)I")
    public final int method1839(byte arg0) throws IOException {
        if (arg0 > -42) {
            this.field4337 = null;
        }
        field4338++;
        return this.field4344 ? 0 : this.field4342.read();
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)I")
    public final int method1840(byte arg0) throws IOException {
        if (arg0 < 115) {
            return 43;
        } else {
            field4357++;
            return this.field4344 ? 0 : this.field4342.available();
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I[BII)V")
    public final void method1841(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4345++;
        if (arg0 != -1) {
            this.field4342 = null;
        }
        if (this.field4344) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field4342.read(arg1, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
    public final void method1842(boolean arg0) {
        field4340++;
        if (this.field4344) {
            return;
        }
        synchronized (this) {
            this.field4344 = true;
            this.notifyAll();
        }
        if (this.field4343 != null) {
            while (this.field4343.field3247 == 0) {
                class170.method1183(1L, (byte) 92);
            }
            if (this.field4343.field3247 == 1) {
                try {
                    ((Thread) this.field4343.field3249).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field4343 = null;
        if (arg0) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I[BII)V")
    public final void method1843(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4354++;
        if (this.field4344) {
            return;
        }
        if (this.field4356) {
            this.field4356 = false;
            throw new IOException();
        }
        if (this.field4358 == null) {
            this.field4358 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field4358[this.field4339] = arg1[arg3 + var6];
                this.field4339 = (this.field4339 + 1) % 5000;
                if (((this.field4348 + 4900) % 5000) == this.field4339) {
                    throw new IOException();
                }
            }
            if (this.field4343 == null) {
                this.field4343 = this.field4346.method134((byte) 125, 3, this);
            }
            this.notifyAll();
        }
        if (arg0 > -99) {
            this.field4339 = -27;
        }
    }

    @OriginalMember(owner = "client!tj", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field4348 == this.field4339) {
                            if (this.field4344) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field4348;
                        if (this.field4339 < this.field4348) {
                            var3 = 5000 - this.field4348;
                        } else {
                            var3 = this.field4339 - this.field4348;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field4341.write(this.field4358, var2, var3);
                    } catch (IOException var9) {
                        this.field4356 = true;
                    }
                    this.field4348 = (this.field4348 + var3) % 5000;
                    try {
                        if (this.field4348 == this.field4339) {
                            this.field4341.flush();
                        }
                    } catch (IOException var8) {
                        this.field4356 = true;
                    }
                    continue;
                }
                try {
                    if (this.field4342 != null) {
                        this.field4342.close();
                    }
                    if (this.field4341 != null) {
                        this.field4341.close();
                    }
                    if (this.field4337 != null) {
                        this.field4337.close();
                    }
                } catch (IOException var7) {
                }
                this.field4358 = null;
                break;
            }
        } catch (Exception var12) {
            class48.method359(1, var12, (String) null);
        }
        field4351++;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)V")
    public final void method1844(byte arg0) {
        field4352++;
        if (!this.field4344) {
            this.field4342 = new class174();
            this.field4341 = new class30();
            int var2 = 69 % ((arg0 + 39) / 51);
        }
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(B)V")
    public static void method1845(byte arg0) {
        field4349 = null;
        if (arg0 != -39) {
            method1845((byte) -30);
        }
    }

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "(B)V")
    public final void method1846(byte arg0) throws IOException {
        field4347++;
        if (this.field4344) {
            return;
        }
        if (arg0 <= 18) {
            this.finalize();
        }
        if (this.field4356) {
            this.field4356 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!tj", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4355++;
        this.method1842(false);
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Ljava/net/Socket;Lbk;)V")
    public class273(Socket arg0, class20 arg1) throws IOException {
        this.field4337 = arg0;
        this.field4346 = arg1;
        this.field4337.setSoTimeout(30000);
        this.field4337.setTcpNoDelay(true);
        this.field4342 = this.field4337.getInputStream();
        this.field4341 = this.field4337.getOutputStream();
    }
}
