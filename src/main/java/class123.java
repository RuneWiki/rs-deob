import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class123 implements Runnable {

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    private int field2349 = 0;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Z")
    private boolean field2353 = false;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Z")
    private boolean field2351 = false;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    private int field2365 = 0;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "Ld;")
    private class33 field2366;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Ljava/net/Socket;")
    private Socket field2352;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Ljava/io/InputStream;")
    private InputStream field2350;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2357;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Lvd;")
    private static class222 field2355 = class212.method1357("Unexpected loginserver response)3", 10731);

    @OriginalMember(owner = "client!le", name = "j", descriptor = "Lvd;")
    public static class222 field2354 = field2355;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Lvd;")
    private static class222 field2359 = class212.method1357("Sorry invited players only)3", 10731);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Lvd;")
    public static class222 field2345 = field2359;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "Lvd;")
    public static class222 field2364 = class212.method1357("::fps ", 10731);

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Lnc;")
    private class141 field2346;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "[B")
    private byte[] field2362;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I")
    public final int method780(int arg0) throws IOException {
        field2361++;
        if (this.field2351) {
            return 0;
        } else {
            if (arg0 != 0) {
                field2359 = null;
            }
            return this.field2350.read();
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)I")
    public static final int method781(int arg0, int arg1) {
        field2356++;
        return arg1 > -85 ? -125 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!le", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field2365 == this.field2349) {
                            if (this.field2351) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field2349 < this.field2365) {
                            var2 = 5000 - this.field2365;
                        } else {
                            var2 = this.field2349 - this.field2365;
                        }
                        var3 = this.field2365;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field2357.write(this.field2362, var3, var2);
                    } catch (IOException var9) {
                        this.field2353 = true;
                    }
                    this.field2365 = (this.field2365 + var2) % 5000;
                    try {
                        if (this.field2365 == this.field2349) {
                            this.field2357.flush();
                        }
                    } catch (IOException var8) {
                        this.field2353 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2350 != null) {
                        this.field2350.close();
                    }
                    if (this.field2357 != null) {
                        this.field2357.close();
                    }
                    if (this.field2352 != null) {
                        this.field2352.close();
                    }
                } catch (IOException var7) {
                }
                this.field2362 = null;
                break;
            }
        } catch (Exception var12) {
            class68.method464(var12, 128, null);
        }
        field2367++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public static void method782(boolean arg0) {
        field2354 = null;
        field2359 = null;
        field2345 = null;
        field2355 = null;
        field2364 = null;
        if (arg0) {
            field2355 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI[BI)V")
    public final void method783(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2348++;
        if (this.field2351) {
            return;
        }
        int var5 = 42 / ((50 - arg0) / 37);
        while (arg3 > 0) {
            int var6 = this.field2350.read(arg2, arg1, arg3);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg1 += var6;
            arg3 -= var6;
        }
    }

    @OriginalMember(owner = "client!le", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2347++;
        this.method784(5000);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public final void method784(int arg0) {
        field2363++;
        if (arg0 != 5000) {
            method782(false);
        }
        if (this.field2351) {
            return;
        }
        synchronized (this) {
            this.field2351 = true;
            this.notifyAll();
        }
        if (this.field2346 != null) {
            while (this.field2346.field2716 == 0) {
                class225.method1471(1L, -23364);
            }
            if (this.field2346.field2716 == 1) {
                try {
                    ((Thread) this.field2346.field2714).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2346 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II[BI)V")
    public final void method785(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2358++;
        if (this.field2351) {
            return;
        }
        if (this.field2353) {
            this.field2353 = false;
            throw new IOException();
        }
        if (this.field2362 == null) {
            this.field2362 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = arg1; var6 < arg3; var6++) {
                this.field2362[this.field2349] = arg2[arg0 + var6];
                this.field2349 = (this.field2349 + 1) % 5000;
                if ((this.field2365 + 4900) % 5000 == this.field2349) {
                    throw new IOException();
                }
            }
            if (this.field2346 == null) {
                this.field2346 = this.field2366.method283(this, 3, 0);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)I")
    public final int method786(int arg0) throws IOException {
        if (arg0 <= 0) {
            this.field2351 = false;
        }
        field2360++;
        return this.field2351 ? 0 : this.field2350.available();
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljava/net/Socket;Ld;)V")
    public class123(Socket arg0, class33 arg1) throws IOException {
        this.field2366 = arg1;
        this.field2352 = arg0;
        this.field2352.setSoTimeout(30000);
        this.field2352.setTcpNoDelay(true);
        this.field2350 = this.field2352.getInputStream();
        this.field2357 = this.field2352.getOutputStream();
    }
}
