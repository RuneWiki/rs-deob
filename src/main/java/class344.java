import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class344 implements Runnable {

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    private int field5456 = 0;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "Z")
    private boolean field5461 = false;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "Z")
    private boolean field5467 = false;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    private int field5473 = 0;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Lua;")
    private class323 field5458;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field5460;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "Ljava/io/InputStream;")
    private InputStream field5469;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5476;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "Ljava/lang/String;")
    public static String field5477 = "Loaded interfaces";

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "Luh;")
    private class95 field5470;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "[B")
    private byte[] field5464;

    @OriginalMember(owner = "client!pl", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        field5466++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field5473 == this.field5456) {
                        if (this.field5461) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    var3 = this.field5456;
                    if (this.field5473 >= this.field5456) {
                        var4 = this.field5473 - this.field5456;
                    } else {
                        var4 = 5000 - this.field5456;
                    }
                }
                if (var4 > 0) {
                    try {
                        this.field5476.write(this.field5464, var3, var4);
                    } catch (IOException var12) {
                        this.field5467 = true;
                    }
                    this.field5456 = (this.field5456 + var4) % 5000;
                    try {
                        if (this.field5473 == this.field5456) {
                            this.field5476.flush();
                        }
                    } catch (IOException var11) {
                        this.field5467 = true;
                    }
                }
            }
            try {
                if (this.field5469 != null) {
                    this.field5469.close();
                }
                if (this.field5476 != null) {
                    this.field5476.close();
                }
                if (this.field5460 != null) {
                    this.field5460.close();
                }
            } catch (IOException var10) {
            }
            this.field5464 = null;
        } catch (Exception var15) {
            client.method1023((byte) -99, (String) null, var15);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V", line = 74)
    public final void method2419(byte arg0) throws IOException {
        if (arg0 <= 61) {
            field5477 = (String) null;
        }
        field5468++;
        if (!this.field5461 && this.field5467) {
            this.field5467 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 97)
    public final void method2420(int arg0) {
        field5475++;
        if (arg0 == 0 && !this.field5461) {
            this.field5469 = new class50();
            this.field5476 = new class305();
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZLrn;I)Lqn;", line = 113)
    public static final class361 method2421(int arg0, boolean arg1, class18 arg2, int arg3) {
        field5463++;
        if (!arg1) {
            field5465 = 93;
        }
        return class282.method2056(arg3, 0, arg2, arg0) ? class79.method724(-116) : null;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V", line = 128)
    public static void method2422(byte arg0) {
        int var1 = 112 % ((-arg0 - 25) / 43);
        field5477 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)I", line = 136)
    public final int method2423(boolean arg0) throws IOException {
        field5471++;
        if (this.field5461) {
            return 0;
        } else {
            if (arg0) {
                this.finalize();
            }
            return this.field5469.read();
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)I", line = 150)
    public final int method2424(byte arg0) throws IOException {
        if (arg0 != 21) {
            method2422((byte) 106);
        }
        field5474++;
        return this.field5461 ? 0 : this.field5469.available();
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljava/net/Socket;Lua;)V", line = 376)
    public class344(Socket arg0, class323 arg1) throws IOException {
        this.field5458 = arg1;
        this.field5460 = arg0;
        this.field5460.setSoTimeout(30000);
        this.field5460.setTcpNoDelay(true);
        this.field5469 = this.field5460.getInputStream();
        this.field5476 = this.field5460.getOutputStream();
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)Lgi;", line = 172)
    public static final class116 method2425(int arg0, boolean arg1) {
        field5459++;
        class116 var2 = (class116) class23.field357.method1386(-1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class64.field978.method187(0, arg0, -1);
        } else {
            var3 = class151.field2471.method187(0, arg0 & 0x7FFF, -1);
        }
        class116 var4 = new class116();
        if (var3 != null) {
            var4.method997((byte) 4, new class25(var3));
        }
        if (arg0 >= 32768) {
            var4.method994(-109);
        }
        if (arg1) {
            method2427(-46);
        }
        class23.field357.method1385(var4, (byte) -30, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II[BI)V", line = 223)
    public final void method2426(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field5462++;
        if (this.field5461) {
            return;
        }
        if (this.field5467) {
            this.field5467 = false;
            throw new IOException();
        }
        if (this.field5464 == null) {
            this.field5464 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field5464[this.field5473] = arg2[arg0 + var6];
                this.field5473 = (this.field5473 + 1) % 5000;
                if (((this.field5456 + 4900) % 5000) == this.field5473) {
                    throw new IOException();
                }
            }
            if (arg1 != -28332) {
                this.run();
            }
            if (this.field5470 == null) {
                this.field5470 = this.field5458.method2290((byte) -103, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V", line = 275)
    public static final void method2427(int arg0) {
        field5455++;
        if (!class311.field4839) {
            return;
        }
        class311.field4839 = false;
        class298.field4625 = null;
        if (arg0 == -9848) {
            class191.field3009 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[BBI)V", line = 295)
    public final void method2428(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field5478++;
        if (this.field5461) {
            return;
        }
        if (arg2 < 44) {
            this.field5456 = -2;
        }
        while (arg0 > 0) {
            int var5 = this.field5469.read(arg1, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)V", line = 325)
    public final void method2429(boolean arg0) {
        field5457++;
        if (this.field5461) {
            return;
        }
        synchronized (this) {
            this.field5461 = true;
            this.notifyAll();
        }
        if (this.field5470 != null) {
            while (this.field5470.field1447 == 0) {
                class188.method1443(10, 1L);
            }
            if (this.field5470.field1447 == 1) {
                try {
                    ((Thread) this.field5470.field1446).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        if (arg0) {
            field5465 = 41;
        }
        this.field5470 = null;
    }

    @OriginalMember(owner = "client!pl", name = "finalize", descriptor = "()V", line = 362)
    protected final void finalize() {
        field5472++;
        this.method2429(false);
    }
}
