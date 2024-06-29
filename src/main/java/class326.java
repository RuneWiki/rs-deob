import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class326 implements Runnable {

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Z")
    private boolean field4297 = false;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    private int field4292 = 0;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Z")
    private boolean field4291 = false;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    private int field4303 = 0;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "Ljava/net/Socket;")
    private Socket field4308;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "Ljs;")
    private class216 field4304;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Ljava/io/InputStream;")
    private InputStream field4293;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4306;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "F")
    public static float field4287;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "Ljk;")
    private class446 field4305;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Lpc;")
    public static class473 field4288;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "[B")
    private byte[] field4309;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)I")
    public final int method1879(int arg0) throws IOException {
        field4299++;
        if (arg0 != 0) {
            this.run();
        }
        return this.field4291 ? 0 : this.field4293.available();
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([BIII)V")
    public final void method1880(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field4294++;
        if (this.field4291) {
            return;
        }
        if (this.field4297) {
            this.field4297 = false;
            throw new IOException();
        }
        if (this.field4309 == null) {
            this.field4309 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field4309[this.field4292] = arg0[arg2 + var6];
                this.field4292 = (this.field4292 + 1) % 5000;
                if ((this.field4303 + 4900) % 5000 == this.field4292) {
                    throw new IOException();
                }
            }
            if (this.field4305 == null) {
                this.field4305 = this.field4304.method1353(3, -34, this);
            }
            if (arg1 <= 86) {
                this.field4303 = -107;
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public static void method1881(boolean arg0) {
        field4288 = null;
        if (arg0) {
            field4288 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public final void method1882(int arg0) throws IOException {
        field4301++;
        if (this.field4291) {
            return;
        }
        if (this.field4297) {
            this.field4297 = false;
            throw new IOException();
        } else if (arg0 != 5000) {
            this.method1886(-26);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public final void method1883(byte arg0) {
        field4295++;
        if (this.field4291) {
            return;
        }
        this.field4293 = new class196();
        this.field4306 = new class146();
        if (arg0 != -29) {
            method1889(true, null);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[BIB)V")
    public final void method1884(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        if (arg3 < 123) {
            this.field4297 = true;
        }
        field4298++;
        if (this.field4291) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field4293.read(arg1, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg2 += var5;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)Z")
    public static final boolean method1885(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method1881(true);
        }
        field4307++;
        return (arg0 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public final void method1886(int arg0) {
        if (arg0 != -1) {
            method1889(true, null);
        }
        field4302++;
        if (this.field4291) {
            return;
        }
        synchronized (this) {
            this.field4291 = true;
            this.notifyAll();
        }
        if (this.field4305 != null) {
            while (this.field4305.field6100 == 0) {
                class94.method674(1L, 1);
            }
            if (this.field4305.field6100 == 1) {
                try {
                    ((Thread) this.field4305.field6104).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field4305 = null;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)I")
    public final int method1887(byte arg0) throws IOException {
        field4296++;
        if (this.field4291) {
            return 0;
        } else {
            int var2 = 70 % ((-arg0 - 89) / 32);
            return this.field4293.read();
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lv;IFBFIIIFFF[BII)V")
    public static final void method1888(class407 arg0, int arg1, float arg2, byte arg3, float arg4, int arg5, int arg6, int arg7, float arg8, float arg9, float arg10, byte[] arg11, int arg12, int arg13) {
        field4290++;
        int var14 = arg6 * arg12;
        float[] var15 = new float[var14];
        int var16 = 0;
        if (arg3 != -50) {
            method1888(null, 61, -0.8773858F, (byte) 46, 0.776565F, 69, -62, -104, 0.5773527F, 0.099742405F, -0.26902762F, null, -97, -42);
        }
        while (arg13 > var16) {
            arg0.method2368(arg2 / (float) arg6, arg12, arg10 * 127.0F, var15, arg1, arg8 / (float) arg12, 0, arg7, 0, arg6, arg4 / (float) arg1);
            int var19 = arg5;
            arg8 *= 2.0F;
            arg4 *= 2.0F;
            arg2 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg11[var19] = (byte) ((int) ((float) arg11[var19] + var15[var20]));
                var19++;
            }
            arg10 = arg9 * arg10;
            var16++;
        }
        int var17 = arg5;
        for (int var18 = 0; var18 < var14; var18++) {
            arg11[var17] = (byte) (arg11[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!qe", name = "run", descriptor = "()V")
    public final void run() {
        field4310++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field4303 == this.field4292) {
                        if (this.field4291) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field4303;
                    if (this.field4292 < this.field4303) {
                        var3 = 5000 - this.field4303;
                    } else {
                        var3 = this.field4292 - this.field4303;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field4306.write(this.field4309, var2, var3);
                    } catch (IOException var9) {
                        this.field4297 = true;
                    }
                    this.field4303 = (this.field4303 + var3) % 5000;
                    try {
                        if (this.field4303 == this.field4292) {
                            this.field4306.flush();
                        }
                    } catch (IOException var8) {
                        this.field4297 = true;
                    }
                }
            }
            try {
                if (this.field4293 != null) {
                    this.field4293.close();
                }
                if (this.field4306 != null) {
                    this.field4306.close();
                }
                if (this.field4308 != null) {
                    this.field4308.close();
                }
            } catch (IOException var7) {
            }
            this.field4309 = null;
        } catch (Exception var12) {
            class504.method2879(var12, null, -19638);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLpc;)I")
    public static final int method1889(boolean arg0, class473 arg1) {
        if (arg0) {
            return -93;
        }
        field4300++;
        int var2 = 0;
        if (arg1.method2721(class402.field5392, (byte) 124)) {
            var2++;
        }
        if (arg1.method2721(class364.field4926, (byte) 88)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1886(-1);
        field4289++;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Ljava/net/Socket;Ljs;)V")
    public class326(Socket arg0, class216 arg1) throws IOException {
        this.field4308 = arg0;
        this.field4304 = arg1;
        this.field4308.setSoTimeout(30000);
        this.field4308.setTcpNoDelay(true);
        this.field4293 = this.field4308.getInputStream();
        this.field4306 = this.field4308.getOutputStream();
    }
}
