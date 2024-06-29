import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class157 implements Runnable {

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    private int field2348 = 0;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Z")
    private boolean field2341 = false;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "Z")
    private boolean field2360 = false;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    private int field2345 = 0;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field2349;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "Lfg;")
    private class12 field2355;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "Ljava/io/InputStream;")
    private InputStream field2361;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2347;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "J")
    public static long field2364 = 0L;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    public static int field2367 = 0;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "Lpf;")
    public static class294 field2351;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lng;")
    private class78 field2342;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "[B")
    private byte[] field2358;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "[I")
    public static int[] field2359;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Lfj;")
    public static final class258 method945(int arg0) {
        field2354++;
        if (arg0 != 48) {
            field2359 = null;
        }
        try {
            return (class258) Class.forName("ig").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([BZII)V")
    public final void method946(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        field2352++;
        if (this.field2360) {
            return;
        }
        if (!arg1) {
            this.field2358 = null;
        }
        while (arg2 > 0) {
            int var5 = this.field2361.read(arg0, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIILee;III)Z")
    public static final boolean method947(int arg0, int arg1, int arg2, class288 arg3, int arg4, int arg5, int arg6) {
        field2339++;
        class140 var7 = class285.method1876(-10076, arg3.field4316);
        if (var7.field2046 == -1) {
            return true;
        }
        int var9;
        if (arg3.field4367) {
            int var8 = arg3.field4382 + arg1;
            var9 = var8 & 0x3;
        } else {
            var9 = 0;
        }
        class179 var10 = var7.method861(arg3.field4371, var9, (byte) -42);
        if (var10 == null) {
            return false;
        }
        int var11 = var10.field3881;
        if (arg4 > -36) {
            return true;
        }
        int var12 = arg3.field4307;
        int var13 = arg3.field4383;
        if ((var9 & 0x1) == 1) {
            var13 = arg3.field4307;
            var12 = arg3.field4383;
        }
        int var14 = var10.field3872;
        if (var7.field2052) {
            var14 = var12 * 4;
            var11 = var13 * 4;
        }
        if (var7.field2049 == 0) {
            var10.method1122(arg5 * 4 + 48, (-arg6 + 104 + -var12) * 4 + 48, var11, var14);
        } else {
            var10.method1114((arg5 * 4) + 48, (-arg6 - var12 + 104) * 4 + 48, var11, var14, var7.field2049);
        }
        return true;
    }

    @OriginalMember(owner = "client!bj", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2340++;
        this.method955((byte) 123);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public static void method948(byte arg0) {
        if (arg0 > 2) {
            field2359 = null;
            field2351 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILfl;I)Ljava/lang/String;")
    public static final String method949(int arg0, class248 arg1, int arg2) {
        field2344++;
        try {
            if (arg0 > -24) {
                return null;
            }
            int var3 = arg1.method1563((byte) 3);
            if (arg2 < var3) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg1.field3748 += class246.field3684.method789(var3, arg1.field3748, -1, var4, 0, arg1.field3723);
            return class115.method743(var4, var3, 255, 0);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)I")
    public final int method950(boolean arg0) throws IOException {
        field2365++;
        if (this.field2360) {
            return 0;
        } else {
            if (!arg0) {
                this.field2348 = -128;
            }
            return this.field2361.read();
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III[B)V")
    public final void method951(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2350++;
        if (this.field2360) {
            return;
        }
        if (this.field2341) {
            this.field2341 = false;
            throw new IOException();
        }
        if (this.field2358 == null) {
            this.field2358 = new byte[5000];
        }
        if (arg1 <= 33) {
            this.method952((byte) 125);
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field2358[this.field2345] = arg3[arg2 + var6];
                this.field2345 = (this.field2345 + 1) % 5000;
                if (((this.field2348 + 4900) % 5000) == this.field2345) {
                    throw new IOException();
                }
            }
            if (this.field2342 == null) {
                this.field2342 = this.field2355.method71(2, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V")
    public final void method952(byte arg0) {
        int var2 = -31 / ((-arg0 - 31) / 62);
        field2363++;
        if (!this.field2360) {
            this.field2361 = new class190();
            this.field2347 = new class96();
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)I")
    public final int method953(int arg0) throws IOException {
        if (arg0 != 0) {
            method947(35, 18, -62, (class288) null, -43, -108, 32);
        }
        field2343++;
        return this.field2360 ? 0 : this.field2361.available();
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Ljava/net/Socket;Lfg;)V")
    public class157(Socket arg0, class12 arg1) throws IOException {
        this.field2349 = arg0;
        this.field2355 = arg1;
        this.field2349.setSoTimeout(30000);
        this.field2349.setTcpNoDelay(true);
        this.field2361 = this.field2349.getInputStream();
        this.field2347 = this.field2349.getOutputStream();
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(Z)V")
    public final void method954(boolean arg0) throws IOException {
        field2346++;
        if (!this.field2360 && arg0 && this.field2341) {
            this.field2341 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(B)V")
    public final void method955(byte arg0) {
        field2368++;
        if (this.field2360) {
            return;
        }
        synchronized (this) {
            int var3 = -98 / ((-arg0 - 6) / 62);
            this.field2360 = true;
            this.notifyAll();
        }
        if (this.field2342 != null) {
            while (this.field2342.field1249 == 0) {
                class250.method1643(1, 1L);
            }
            if (this.field2342.field1249 == 1) {
                try {
                    ((Thread) this.field2342.field1250).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2342 = null;
    }

    @OriginalMember(owner = "client!bj", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field2348 == this.field2345) {
                            if (this.field2360) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field2348 > this.field2345) {
                            var2 = 5000 - this.field2348;
                        } else {
                            var2 = this.field2345 - this.field2348;
                        }
                        var3 = this.field2348;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field2347.write(this.field2358, var3, var2);
                    } catch (IOException var9) {
                        this.field2341 = true;
                    }
                    this.field2348 = (this.field2348 + var2) % 5000;
                    try {
                        if (this.field2348 == this.field2345) {
                            this.field2347.flush();
                        }
                    } catch (IOException var8) {
                        this.field2341 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2361 != null) {
                        this.field2361.close();
                    }
                    if (this.field2347 != null) {
                        this.field2347.close();
                    }
                    if (this.field2349 != null) {
                        this.field2349.close();
                    }
                } catch (IOException var7) {
                }
                this.field2358 = null;
                break;
            }
        } catch (Exception var12) {
            class275.method1822((String) null, (byte) -84, var12);
        }
        field2356++;
    }
}
