import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class24 implements Runnable {

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Z")
    private boolean field390 = false;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    private int field395 = 0;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Z")
    private boolean field405 = false;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    private int field404 = 0;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "Ljava/net/Socket;")
    private Socket field407;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Lte;")
    private class282 field393;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "Ljava/io/InputStream;")
    private InputStream field402;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field394;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Lcd;")
    public static class64 field399 = class44.method335((byte) 71, "Loaded world list data");

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Llh;")
    private class22 field387;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "[B")
    private byte[] field396;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)I", line = 6)
    public final int method219(int arg0) throws IOException {
        field406++;
        if (arg0 == 0) {
            return this.field390 ? 0 : this.field402.available();
        } else {
            return -15;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)Ltg;", line = 23)
    public static final class301 method220(int arg0, byte arg1) {
        field386++;
        class301 var2 = (class301) class135.field2392.method1194((long) arg0, (byte) -79);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class1.field4.method1580(0, arg0, 16);
        class301 var4 = new class301();
        if (var3 != null) {
            var4.method2099(new class13(var3), -1);
        }
        if (arg1 < 17) {
            field399 = (class64) null;
        }
        class135.field2392.method1190(12669, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!od", name = "finalize", descriptor = "()V", line = 47)
    protected final void finalize() {
        this.method225(1);
        field391++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([BIII)V", line = 55)
    public final void method221(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field392++;
        int var5 = 8 / ((-arg2 - 69) / 57);
        if (this.field390) {
            return;
        }
        while (arg3 > 0) {
            int var6 = this.field402.read(arg0, arg1, arg3);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg3 -= var6;
            arg1 += var6;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 83)
    public static void method222(byte arg0) {
        field399 = null;
        int var1 = 15 % ((-arg0 - 25) / 56);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)I", line = 96)
    public final int method223(byte arg0) throws IOException {
        field397++;
        if (arg0 <= 105) {
            method220(116, (byte) 21);
        }
        return this.field390 ? 0 : this.field402.read();
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(IB)V", line = 114)
    public static final void method224(int arg0, byte arg1) {
        int var2 = 86 % ((arg1 - 17) / 42);
        field401++;
        class76.field1432.method1197((byte) 106, arg0);
        class55.field924.method1197((byte) 114, arg0);
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Ljava/net/Socket;Lte;)V", line = 330)
    public class24(Socket arg0, class282 arg1) throws IOException {
        this.field407 = arg0;
        this.field393 = arg1;
        this.field407.setSoTimeout(30000);
        this.field407.setTcpNoDelay(true);
        this.field402 = this.field407.getInputStream();
        this.field394 = this.field407.getOutputStream();
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V", line = 139)
    public final void method225(int arg0) {
        field398++;
        if (this.field390) {
            return;
        }
        synchronized (this) {
            if (arg0 != 1) {
                this.method225(106);
            }
            this.field390 = true;
            this.notifyAll();
        }
        if (this.field387 != null) {
            while (this.field387.field375 == 0) {
                class267.method1871(10, 1L);
            }
            if (this.field387.field375 == 1) {
                try {
                    ((Thread) this.field387.field377).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field387 = null;
    }

    @OriginalMember(owner = "client!od", name = "run", descriptor = "()V", line = 190)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                label86: {
                    synchronized (this) {
                        label87: {
                            if (this.field404 == this.field395) {
                                if (this.field390) {
                                    break label87;
                                }
                                try {
                                    this.wait();
                                } catch (InterruptedException var13) {
                                }
                            }
                            var3 = this.field404;
                            if (this.field404 > this.field395) {
                                var4 = 5000 - this.field404;
                            } else {
                                var4 = this.field395 - this.field404;
                            }
                            break label86;
                        }
                    }
                    try {
                        if (this.field402 != null) {
                            this.field402.close();
                        }
                        if (this.field394 != null) {
                            this.field394.close();
                        }
                        if (this.field407 != null) {
                            this.field407.close();
                        }
                    } catch (IOException var10) {
                    }
                    this.field396 = null;
                    break;
                }
                if (var4 > 0) {
                    try {
                        this.field394.write(this.field396, var3, var4);
                    } catch (IOException var12) {
                        this.field405 = true;
                    }
                    this.field404 = (this.field404 + var4) % 5000;
                    try {
                        if (this.field404 == this.field395) {
                            this.field394.flush();
                        }
                    } catch (IOException var11) {
                        this.field405 = true;
                    }
                }
            }
        } catch (Exception var15) {
            class309.method2146((byte) -71, (String) null, var15);
        }
        field389++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIBII)V", line = 254)
    public static final void method226(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field388++;
        if (arg4 < arg3) {
            class31.method268(arg3, 120, arg4, class124.field2241[arg0], arg1);
        } else {
            class31.method268(arg4, 125, arg3, class124.field2241[arg0], arg1);
        }
        if (arg2 < 69) {
            field399 = (class64) null;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "([BIII)V", line = 273)
    public final void method227(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field403++;
        if (this.field390) {
            return;
        }
        if (this.field405) {
            this.field405 = false;
            throw new IOException();
        }
        if (this.field396 == null) {
            this.field396 = new byte[5000];
        }
        synchronized (this) {
            if (arg2 == 3) {
                for (int var6 = 0; var6 < arg3; var6++) {
                    this.field396[this.field395] = arg0[arg1 + var6];
                    this.field395 = (this.field395 + 1) % 5000;
                    if ((this.field404 + 4900) % 5000 == this.field395) {
                        throw new IOException();
                    }
                }
                if (this.field387 == null) {
                    this.field387 = this.field393.method1958(3, this, 16711);
                }
                this.notifyAll();
            }
        }
    }
}
