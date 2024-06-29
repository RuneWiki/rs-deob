import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class144 implements Runnable {

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Z")
    private boolean field2367 = false;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    private int field2377 = 0;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    private int field2376 = 0;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "Z")
    private boolean field2378 = false;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Ljava/net/Socket;")
    private Socket field2364;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "Lci;")
    private class83 field2379;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field2372;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2369;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "Lnd;")
    private class191 field2373;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Lbj;")
    public static class92 field2371;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "[B")
    private byte[] field2374;

    @OriginalMember(owner = "client!ka", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field2377 == this.field2376) {
                            if (this.field2378) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field2376;
                        if (this.field2377 < this.field2376) {
                            var3 = 5000 - this.field2376;
                        } else {
                            var3 = this.field2377 - this.field2376;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field2369.write(this.field2374, var2, var3);
                    } catch (IOException var9) {
                        this.field2367 = true;
                    }
                    this.field2376 = (this.field2376 + var3) % 5000;
                    try {
                        if (this.field2377 == this.field2376) {
                            this.field2369.flush();
                        }
                    } catch (IOException var8) {
                        this.field2367 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2372 != null) {
                        this.field2372.close();
                    }
                    if (this.field2369 != null) {
                        this.field2369.close();
                    }
                    if (this.field2364 != null) {
                        this.field2364.close();
                    }
                } catch (IOException var7) {
                }
                this.field2374 = null;
                break;
            }
        } catch (Exception var12) {
            class84.method595(14117, (String) null, var12);
        }
        field2359++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)Lwe;")
    public static final class199 method1061(int arg0, byte arg1) {
        class199 var2 = (class199) class34.field537.method99((long) arg0, true);
        field2375++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 43) {
            method1061(-70, (byte) -113);
        }
        byte[] var3 = class218.field3688.method1149(1, (byte) 125, arg0);
        class199 var4 = new class199();
        if (var3 != null) {
            var4.method1410(new class249(var3), 3809, arg0);
        }
        class34.field537.method100((long) arg0, var4, 91);
        return var4;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public final void method1062(int arg0) throws IOException {
        field2360++;
        if (this.field2378) {
            return;
        }
        if (arg0 < 44) {
            this.run();
        }
        if (this.field2367) {
            this.field2367 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZBI)V")
    public static final void method1063(int arg0, boolean arg1, byte arg2, int arg3) {
        field2368++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        } else if (arg2 > 83) {
            class276.field4608 = arg0;
            class54.field970 = arg1;
            class142.field2343 = arg3;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)I")
    public final int method1064(boolean arg0) throws IOException {
        if (arg0) {
            return 93;
        } else {
            field2365++;
            return this.field2378 ? 0 : this.field2372.read();
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)I")
    public final int method1065(int arg0) throws IOException {
        field2380++;
        if (arg0 > -8) {
            this.field2373 = null;
        }
        return this.field2378 ? 0 : this.field2372.available();
    }

    @OriginalMember(owner = "client!ka", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1070(126);
        field2363++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([BIII)V")
    public final void method1066(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2370++;
        if (this.field2378) {
            return;
        }
        if (this.field2367) {
            this.field2367 = false;
            throw new IOException();
        }
        if (arg1 > -11) {
            this.field2376 = 17;
        }
        if (this.field2374 == null) {
            this.field2374 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field2374[this.field2377] = arg0[arg3 + var6];
                this.field2377 = (this.field2377 + 1) % 5000;
                if (((this.field2376 + 4900) % 5000) == this.field2377) {
                    throw new IOException();
                }
            }
            if (this.field2373 == null) {
                this.field2373 = this.field2379.method583((byte) -12, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public final void method1067(byte arg0) {
        field2361++;
        if (this.field2378) {
            return;
        }
        this.field2372 = new class6();
        if (arg0 != -121) {
            this.field2374 = null;
        }
        this.field2369 = new class261();
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
    public static void method1068(byte arg0) {
        field2371 = null;
        if (arg0 >= -102) {
            method1063(112, false, (byte) 76, 32);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[BII)V")
    public final void method1069(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg3 != 6056) {
            method1061(73, (byte) 80);
        }
        field2366++;
        if (this.field2378) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field2372.read(arg1, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V")
    public final void method1070(int arg0) {
        int var2 = 45 / ((arg0 + 59) / 53);
        field2381++;
        if (this.field2378) {
            return;
        }
        synchronized (this) {
            this.field2378 = true;
            this.notifyAll();
        }
        if (this.field2373 != null) {
            while (this.field2373.field3091 == 0) {
                class28.method182(1L, true);
            }
            if (this.field2373.field3091 == 1) {
                try {
                    ((Thread) this.field2373.field3089).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2373 = null;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Ljava/net/Socket;Lci;)V")
    public class144(Socket arg0, class83 arg1) throws IOException {
        this.field2364 = arg0;
        this.field2379 = arg1;
        this.field2364.setSoTimeout(30000);
        this.field2364.setTcpNoDelay(true);
        this.field2372 = this.field2364.getInputStream();
        this.field2369 = this.field2364.getOutputStream();
    }
}
