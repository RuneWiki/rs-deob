import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class336 implements Runnable {

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Z")
    private boolean field4331 = false;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "Z")
    private boolean field4336 = false;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    private int field4345 = 0;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    private int field4349 = 0;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "Lufa;")
    private class140 field4346;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field4334;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field4330;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4338;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "Lnj;")
    public static class415 field4342 = new class415(82, 18);

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field4351 = 0;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "Ldn;")
    private class548 field4344;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "[B")
    private byte[] field4337;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "[Lan;")
    public static class169[] field4352;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public final void method1923(byte arg0) {
        field4348++;
        if (this.field4336) {
            return;
        }
        synchronized (this) {
            int var3 = -75 % ((62 - arg0) / 50);
            this.field4336 = true;
            this.notifyAll();
        }
        if (this.field4344 != null) {
            while (this.field4344.field7108 == 0) {
                class122.method905(1L, -6145);
            }
            if (this.field4344.field7108 == 1) {
                try {
                    ((Thread) this.field4344.field7113).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field4344 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method1924(byte arg0, String arg1) {
        field4335++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class703.field9804; var2++) {
            if (arg1.equalsIgnoreCase(class379.field4851[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class329.field4285[var2])) {
                return true;
            }
        }
        if (arg0 <= 125) {
            field4342 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)I")
    public final int method1925(byte arg0) throws IOException {
        field4332++;
        if (arg0 != 96) {
            this.field4330 = null;
        }
        return this.field4336 ? 0 : this.field4330.available();
    }

    @OriginalMember(owner = "client!tg", name = "run", descriptor = "()V")
    public final void run() {
        field4341++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field4349 == this.field4345) {
                        if (this.field4336) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field4345;
                    if (this.field4345 > this.field4349) {
                        var3 = 5000 - this.field4345;
                    } else {
                        var3 = this.field4349 - this.field4345;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field4338.write(this.field4337, var2, var3);
                    } catch (IOException var9) {
                        this.field4331 = true;
                    }
                    this.field4345 = (this.field4345 + var3) % 5000;
                    try {
                        if (this.field4349 == this.field4345) {
                            this.field4338.flush();
                        }
                    } catch (IOException var8) {
                        this.field4331 = true;
                    }
                }
            }
            try {
                if (this.field4330 != null) {
                    this.field4330.close();
                }
                if (this.field4338 != null) {
                    this.field4338.close();
                }
                if (this.field4334 != null) {
                    this.field4334.close();
                }
            } catch (IOException var7) {
            }
            this.field4337 = null;
        } catch (Exception var12) {
            class698.method3809(null, (byte) 118, var12);
        }
    }

    @OriginalMember(owner = "client!tg", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1923((byte) 8);
        field4333++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public final void method1926(int arg0) {
        if (arg0 != -6983) {
            method1927((byte) -45);
        }
        field4340++;
        if (!this.field4336) {
            this.field4330 = new class594();
            this.field4338 = new class136();
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
    public static void method1927(byte arg0) {
        if (arg0 != -15) {
            field4352 = null;
        }
        field4352 = null;
        field4342 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[BI)V")
    public final void method1928(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4343++;
        if (this.field4336) {
            return;
        }
        if (this.field4331) {
            this.field4331 = false;
            throw new IOException();
        } else if (arg3 == 3) {
            if (this.field4337 == null) {
                this.field4337 = new byte[5000];
            }
            synchronized (this) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    this.field4337[this.field4349] = arg2[arg0 + var6];
                    this.field4349 = (this.field4349 + 1) % 5000;
                    if ((this.field4345 + 4900) % 5000 == this.field4349) {
                        throw new IOException();
                    }
                }
                if (this.field4344 == null) {
                    this.field4344 = this.field4346.method1057(this, 3, (byte) 111);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[BIB)V")
    public final void method1929(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        int var5 = -126 / ((-arg3 - 66) / 43);
        field4339++;
        if (this.field4336) {
            return;
        }
        while (arg0 > 0) {
            int var6 = this.field4330.read(arg1, arg2, arg0);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg2 += var6;
            arg0 -= var6;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)I")
    public final int method1930(int arg0) throws IOException {
        if (arg0 == 0) {
            field4350++;
            return this.field4336 ? 0 : this.field4330.read();
        } else {
            return 16;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public final void method1931(boolean arg0) throws IOException {
        field4347++;
        if (this.field4336) {
            return;
        }
        if (this.field4331) {
            this.field4331 = false;
            throw new IOException();
        } else if (arg0) {
            this.method1926(-76);
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Ljava/net/Socket;Lufa;)V")
    public class336(Socket arg0, class140 arg1) throws IOException {
        this.field4346 = arg1;
        this.field4334 = arg0;
        this.field4334.setSoTimeout(30000);
        this.field4334.setTcpNoDelay(true);
        this.field4330 = this.field4334.getInputStream();
        this.field4338 = this.field4334.getOutputStream();
    }
}
