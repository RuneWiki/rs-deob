import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class313 implements Runnable {

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "Z")
    private boolean field4485 = false;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "Z")
    private boolean field4482 = false;

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "I")
    private int field4497 = 0;

    @OriginalMember(owner = "client!qu", name = "u", descriptor = "I")
    private int field4501 = 0;

    @OriginalMember(owner = "client!qu", name = "z", descriptor = "Lvt;")
    private class768 field4506;

    @OriginalMember(owner = "client!qu", name = "r", descriptor = "Ljava/net/Socket;")
    private Socket field4498;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field4483;

    @OriginalMember(owner = "client!qu", name = "A", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4507;

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
    private int field4494;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "Ljn;")
    public static class134 field4495 = new class134(61, -2);

    @OriginalMember(owner = "client!qu", name = "t", descriptor = "Ljava/lang/Object;")
    public static volatile Object field4500 = null;

    @OriginalMember(owner = "client!qu", name = "x", descriptor = "I")
    public static int field4504 = 0;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!qu", name = "v", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!qu", name = "w", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!qu", name = "s", descriptor = "Lfe;")
    private class344 field4499;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "[B")
    private byte[] field4490;

    @OriginalMember(owner = "client!qu", name = "y", descriptor = "[I")
    public static int[] field4505;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "[Laaa;")
    public static class253[] field4484;

    @OriginalMember(owner = "client!qu", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        field4489++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field4501 == this.field4497) {
                        if (this.field4482) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field4501;
                    if (this.field4497 >= this.field4501) {
                        var3 = this.field4497 - this.field4501;
                    } else {
                        var3 = this.field4494 - this.field4501;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field4507.write(this.field4490, var2, var3);
                    } catch (IOException var9) {
                        this.field4485 = true;
                    }
                    this.field4501 = (this.field4501 + var3) % this.field4494;
                    try {
                        if (this.field4501 == this.field4497) {
                            this.field4507.flush();
                        }
                    } catch (IOException var8) {
                        this.field4485 = true;
                    }
                }
            }
            try {
                if (this.field4483 != null) {
                    this.field4483.close();
                }
                if (this.field4507 != null) {
                    this.field4507.close();
                }
                if (this.field4498 != null) {
                    this.field4498.close();
                }
            } catch (IOException var7) {
            }
            this.field4490 = null;
        } catch (Exception var12) {
            class502.method2937(var12, (byte) -124, null);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V", line = 74)
    public final void method2008(int arg0) throws IOException {
        if (arg0 != 5000) {
            return;
        }
        field4486++;
        if (!this.field4482 && this.field4485) {
            this.field4485 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V", line = 95)
    public static void method2009(byte arg0) {
        if (arg0 <= -25) {
            field4495 = null;
            field4500 = null;
            field4484 = null;
            field4505 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "finalize", descriptor = "()V", line = 109)
    protected final void finalize() {
        this.method2011((byte) 56);
        field4488++;
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)I", line = 117)
    public final int method2010(int arg0) throws IOException {
        field4496++;
        if (this.field4482) {
            return 0;
        } else if (arg0 == 0) {
            return this.field4483.read();
        } else {
            return -12;
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)V", line = 140)
    public final void method2011(byte arg0) {
        field4503++;
        if (arg0 != 56) {
            field4484 = null;
        }
        if (this.field4482) {
            return;
        }
        synchronized (this) {
            this.field4482 = true;
            this.notifyAll();
        }
        if (this.field4499 != null) {
            while (this.field4499.field4970 == 0) {
                class730.method4066((byte) -45, 1L);
            }
            if (this.field4499.field4970 == 1) {
                try {
                    ((Thread) this.field4499.field4975).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field4499 = null;
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V", line = 180)
    public final void method2012(int arg0) {
        if (arg0 != 0) {
            this.method2012(-30);
        }
        field4481++;
        if (!this.field4482) {
            this.field4483 = new class137();
            this.field4507 = new class9();
        }
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Ljava/net/Socket;Lvt;I)V", line = 350)
    public class313(Socket arg0, class768 arg1, int arg2) throws IOException {
        this.field4506 = arg1;
        this.field4498 = arg0;
        this.field4498.setSoTimeout(30000);
        this.field4498.setTcpNoDelay(true);
        this.field4483 = this.field4498.getInputStream();
        this.field4507 = this.field4498.getOutputStream();
        this.field4494 = arg2;
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(B)I", line = 201)
    public final int method2013(byte arg0) throws IOException {
        if (arg0 < 44) {
            this.field4482 = true;
        }
        field4502++;
        return this.field4482 ? 0 : this.field4483.available();
    }

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "(I)V", line = 238)
    public static final void method2014(int arg0) {
        field4493++;
        class17 var1 = class245.method1634(1, 0L, 15);
        var1.method69(13);
        if (arg0 > -127) {
            method2016(-84, null);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II[BI)V", line = 259)
    public final void method2015(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4491++;
        if (this.field4482) {
            return;
        }
        if (this.field4485) {
            this.field4485 = false;
            throw new IOException();
        }
        if (this.field4490 == null) {
            this.field4490 = new byte[this.field4494];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field4490[this.field4497] = arg2[arg0 + var6];
                this.field4497 = (this.field4497 + 1) % this.field4494;
                if (((this.field4501 + this.field4494 - 100) % this.field4494) == this.field4497) {
                    throw new IOException();
                }
            }
            if (arg3 != 1) {
                method2009((byte) -40);
            }
            if (this.field4499 == null) {
                this.field4499 = this.field4506.method4236(this, 3, 0);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILjava/io/File;)[B", line = 314)
    public static final byte[] method2016(int arg0, File arg1) {
        field4492++;
        if (arg0 != 0) {
            method2009((byte) -90);
        }
        return class635.method3642(arg1, arg0, (int) arg1.length());
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(II[BI)V", line = 325)
    public final void method2017(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4487++;
        if (this.field4482) {
            return;
        }
        int var5 = 9 % ((-arg0 - 50) / 39);
        while (arg1 > 0) {
            int var6 = this.field4483.read(arg2, arg3, arg1);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg1 -= var6;
            arg3 += var6;
        }
    }
}
