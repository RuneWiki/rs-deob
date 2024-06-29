import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class399 implements Runnable {

    @OriginalMember(owner = "client!od", name = "q", descriptor = "Z")
    private boolean field5419 = false;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    private int field5407 = 0;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    private int field5421 = 0;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Z")
    private boolean field5422 = false;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Ljava/net/Socket;")
    private Socket field5411;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Lnh;")
    private class441 field5405;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Ljava/io/InputStream;")
    private InputStream field5420;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field5412;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Lph;")
    private class315 field5403;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lpp;")
    public static class334 field5404;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "[B")
    private byte[] field5416;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V", line = 3)
    public final void method2461(boolean arg0) {
        field5408++;
        if (this.field5419) {
            return;
        }
        if (arg0) {
            this.run();
        }
        this.field5420 = new class379();
        this.field5412 = new class240();
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 19)
    public final void method2462(int arg0) throws IOException {
        field5424++;
        if (arg0 != 1) {
            this.method2465((byte) -71);
        }
        if (!this.field5419 && this.field5422) {
            this.field5422 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)V", line = 40)
    public static void method2463(boolean arg0) {
        field5404 = null;
        if (arg0) {
            method2463(false);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BII[B)V", line = 52)
    public final void method2464(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field5414++;
        if (this.field5419) {
            return;
        }
        if (this.field5422) {
            this.field5422 = false;
            throw new IOException();
        }
        if (this.field5416 == null) {
            this.field5416 = new byte[5000];
        }
        if (arg0 <= 36) {
            method2468(-72, -116);
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field5416[this.field5421] = arg3[arg1 + var6];
                this.field5421 = (this.field5421 + 1) % 5000;
                if ((this.field5407 + 4900) % 5000 == this.field5421) {
                    throw new IOException();
                }
            }
            if (this.field5403 == null) {
                this.field5403 = this.field5405.method2733(0, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!od", name = "finalize", descriptor = "()V", line = 102)
    protected final void finalize() {
        this.method2465((byte) -85);
        field5410++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 115)
    public final void method2465(byte arg0) {
        field5417++;
        if (this.field5419) {
            return;
        }
        synchronized (this) {
            if (arg0 != -85) {
                field5404 = null;
            }
            this.field5419 = true;
            this.notifyAll();
        }
        if (this.field5403 != null) {
            while (this.field5403.field4244 == 0) {
                class219.method1330(1L, true);
            }
            if (this.field5403.field4244 == 1) {
                try {
                    ((Thread) this.field5403.field4243).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field5403 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III[B)V", line = 152)
    public final void method2466(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg2 != 16752) {
            this.field5403 = null;
        }
        field5418++;
        if (this.field5419) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field5420.read(arg3, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)I", line = 184)
    public final int method2467(byte arg0) throws IOException {
        field5406++;
        int var2 = 69 % ((arg0 + 8) / 38);
        return this.field5419 ? 0 : this.field5420.available();
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V", line = 202)
    public static final void method2468(int arg0, int arg1) {
        int var2 = 11 / ((arg0 + 32) / 38);
        class392.field5344.method2286(arg1, (byte) 36);
        field5415++;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)I", line = 214)
    public final int method2469(int arg0) throws IOException {
        if (arg0 != -19969) {
            field5404 = null;
        }
        field5425++;
        return this.field5419 ? 0 : this.field5420.read();
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V", line = 232)
    public static final void method2470(byte arg0) {
        field5426++;
        if (class366.field4983 == -1) {
            return;
        }
        if (arg0 != -24) {
            method2470((byte) 91);
        }
        int var1 = class358.field4866.method1860(arg0 + 40);
        int var2 = class358.field4866.method1858(-18493);
        if (class208.field2516 != null) {
            var1 = class208.field2516.method5(27878);
            var2 = class208.field2516.method2(false);
        }
        class258.method1633(0, class39.field457, 0, (byte) -109, var2, 0, class366.field4983, var1, class28.field315, 0);
        if (class310.field4200 != null) {
            class346.method2198(var2, var1, arg0 + 72);
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Ljava/net/Socket;Lnh;)V", line = 350)
    public class399(Socket arg0, class441 arg1) throws IOException {
        this.field5411 = arg0;
        this.field5405 = arg1;
        this.field5411.setSoTimeout(30000);
        this.field5411.setTcpNoDelay(true);
        this.field5420 = this.field5411.getInputStream();
        this.field5412 = this.field5411.getOutputStream();
    }

    @OriginalMember(owner = "client!od", name = "run", descriptor = "()V", line = 274)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field5421 == this.field5407) {
                            if (this.field5419) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field5407;
                        if (this.field5407 > this.field5421) {
                            var3 = 5000 - this.field5407;
                        } else {
                            var3 = this.field5421 - this.field5407;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field5412.write(this.field5416, var2, var3);
                    } catch (IOException var9) {
                        this.field5422 = true;
                    }
                    this.field5407 = (this.field5407 + var3) % 5000;
                    try {
                        if (this.field5421 == this.field5407) {
                            this.field5412.flush();
                        }
                    } catch (IOException var8) {
                        this.field5422 = true;
                    }
                    continue;
                }
                try {
                    if (this.field5420 != null) {
                        this.field5420.close();
                    }
                    if (this.field5412 != null) {
                        this.field5412.close();
                    }
                    if (this.field5411 != null) {
                        this.field5411.close();
                    }
                } catch (IOException var7) {
                }
                this.field5416 = null;
                break;
            }
        } catch (Exception var12) {
            class402.method2510((String) null, var12, -29832);
        }
        field5413++;
    }
}
