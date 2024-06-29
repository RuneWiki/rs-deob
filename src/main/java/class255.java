import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class255 implements Runnable {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Z")
    private boolean field4451 = false;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    private int field4452 = 0;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Z")
    private boolean field4457 = false;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    private int field4460 = 0;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lpc;")
    private class166 field4450;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Ljava/net/Socket;")
    private Socket field4464;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Ljava/io/InputStream;")
    private InputStream field4455;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4462;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "[I")
    public static int[] field4465 = new int[128];

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Lud;")
    private class198 field4453;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "[B")
    private byte[] field4456;

    @OriginalMember(owner = "client!ed", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4466++;
        this.method1724(true);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public final void method1724(boolean arg0) {
        field4459++;
        if (this.field4457) {
            return;
        }
        synchronized (this) {
            this.field4457 = arg0;
            this.notifyAll();
        }
        if (this.field4453 != null) {
            while (this.field4453.field3566 == 0) {
                class107.method866(0, 1L);
            }
            if (this.field4453.field3566 == 1) {
                try {
                    ((Thread) this.field4453.field3563).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field4453 = null;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)I")
    public final int method1725(boolean arg0) throws IOException {
        if (arg0) {
            this.method1724(true);
        }
        field4468++;
        return this.field4457 ? 0 : this.field4455.available();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method1726(int arg0) {
        if (arg0 == 4719) {
            field4465 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([BBII)V")
    public final void method1727(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field4463++;
        if (this.field4457) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field4455.read(arg0, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg2 -= var5;
        }
        if (arg1 >= -55) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BJ)V")
    public static final void method1728(byte arg0, long arg1) {
        field4449++;
        try {
            if (arg0 > -26) {
                method1731(39, -125, -57);
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([BIII)V")
    public final void method1729(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field4461++;
        if (this.field4457) {
            return;
        }
        if (this.field4451) {
            this.field4451 = false;
            throw new IOException();
        }
        if (this.field4456 == null) {
            this.field4456 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            if (arg3 != 5000) {
                method1726(11);
            }
            while (arg1 > var6) {
                this.field4456[this.field4460] = arg0[arg2 + var6];
                this.field4460 = (this.field4460 + 1) % 5000;
                if (((this.field4452 + 4900) % 5000) == this.field4460) {
                    throw new IOException();
                }
                var6++;
            }
            if (this.field4453 == null) {
                this.field4453 = this.field4450.method1253(this, 3, 2244);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(Z)I")
    public final int method1730(boolean arg0) throws IOException {
        field4467++;
        if (this.field4457) {
            return 0;
        } else {
            if (arg0) {
                this.finalize();
            }
            return this.field4455.read();
        }
    }

    @OriginalMember(owner = "client!ed", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field4460 == this.field4452) {
                            if (this.field4457) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field4452 <= this.field4460) {
                            var2 = this.field4460 - this.field4452;
                        } else {
                            var2 = 5000 - this.field4452;
                        }
                        var3 = this.field4452;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field4462.write(this.field4456, var3, var2);
                    } catch (IOException var9) {
                        this.field4451 = true;
                    }
                    this.field4452 = (this.field4452 + var2) % 5000;
                    try {
                        if (this.field4460 == this.field4452) {
                            this.field4462.flush();
                        }
                    } catch (IOException var8) {
                        this.field4451 = true;
                    }
                    continue;
                }
                try {
                    if (this.field4455 != null) {
                        this.field4455.close();
                    }
                    if (this.field4462 != null) {
                        this.field4462.close();
                    }
                    if (this.field4464 != null) {
                        this.field4464.close();
                    }
                } catch (IOException var7) {
                }
                this.field4456 = null;
                break;
            }
        } catch (Exception var12) {
            class107.method865(-119, var12, (String) null);
        }
        field4458++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)J")
    public static final long method1731(int arg0, int arg1, int arg2) {
        class144 var3 = class259.field4542[arg0][arg1][arg2];
        return var3 == null || var3.field2742 == null ? 0L : var3.field2742.field1755;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ljava/net/Socket;Lpc;)V")
    public class255(Socket arg0, class166 arg1) throws IOException {
        this.field4450 = arg1;
        this.field4464 = arg0;
        this.field4464.setSoTimeout(30000);
        this.field4464.setTcpNoDelay(true);
        this.field4455 = this.field4464.getInputStream();
        this.field4462 = this.field4464.getOutputStream();
    }
}
