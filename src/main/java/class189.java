import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class189 implements Runnable {

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "Z")
    private boolean field2910 = false;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "Z")
    private boolean field2906 = false;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    private int field2917 = 0;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    private int field2919 = 0;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "Ljava/net/Socket;")
    private Socket field2922;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "Lgj;")
    private class255 field2929;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field2914;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2925;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field2901 = 1;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public static int field2916 = 0;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static volatile int field2903 = 0;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "[I")
    public static int[] field2911 = new int[25];

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static volatile int field2904 = -1;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "J")
    public static long field2915;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "Lel;")
    public static class218 field2921;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "Lkb;")
    private class54 field2905;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "[B")
    private byte[] field2907;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public final void method1274(int arg0) {
        field2902++;
        if (this.field2910) {
            return;
        }
        this.field2914 = new class227();
        this.field2925 = new class12();
        if (arg0 != -1) {
            this.field2917 = -37;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZI[B)V")
    public final void method1275(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        field2913++;
        if (this.field2910) {
            return;
        }
        if (!arg1) {
            this.method1274(88);
        }
        if (this.field2906) {
            this.field2906 = false;
            throw new IOException();
        }
        if (this.field2907 == null) {
            this.field2907 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field2907[this.field2917] = arg3[arg0 + var6];
                this.field2917 = (this.field2917 + 1) % 5000;
                if ((this.field2919 + 4900) % 5000 == this.field2917) {
                    throw new IOException();
                }
            }
            if (this.field2905 == null) {
                this.field2905 = this.field2929.method1777(3, this, 2);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)I")
    public final int method1276(int arg0) throws IOException {
        if (arg0 < 32) {
            return -114;
        } else {
            field2912++;
            return this.field2910 ? 0 : this.field2914.read();
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V")
    public final void method1277(boolean arg0) {
        field2924++;
        if (this.field2910) {
            return;
        }
        synchronized (this) {
            this.field2910 = true;
            this.notifyAll();
        }
        if (this.field2905 != null) {
            while (this.field2905.field725 == 0) {
                class96.method614(0, 1L);
            }
            if (this.field2905.field725 == 1) {
                try {
                    ((Thread) this.field2905.field723).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        if (arg0) {
            this.field2907 = null;
        }
        this.field2905 = null;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)V")
    public final void method1278(boolean arg0) throws IOException {
        if (!arg0) {
            method1279(-83, (byte) 74);
        }
        field2926++;
        if (!this.field2910 && this.field2906) {
            this.field2906 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)Lqb;")
    public static final class59 method1279(int arg0, byte arg1) {
        if (arg1 <= 84) {
            method1281((byte) 80);
        }
        field2909++;
        class59 var2 = (class59) class16.field227.method149((byte) -63, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class51.field698.method1877(arg0, 30, (byte) 79);
        class59 var4 = new class59();
        if (var3 != null) {
            var4.method366(new class202(var3), -3, arg0);
        }
        class16.field227.method152(var4, (long) arg0, true);
        return var4;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZII[B)V")
    public final void method1280(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2918++;
        if (this.field2910) {
            return;
        }
        if (!arg0) {
            field2911 = null;
        }
        while (arg1 > 0) {
            int var5 = this.field2914.read(arg3, arg2, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg2 += var5;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
    public static void method1281(byte arg0) {
        field2921 = null;
        field2911 = null;
        if (arg0 <= 117) {
            field2915 = -86L;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BII)V")
    public static final void method1282(byte arg0, int arg1, int arg2) {
        int var3 = -28 / ((-arg0 - 36) / 60);
        field2928++;
        class209.field3356[arg2] = arg1;
        class313 var4 = (class313) class36.field450.method872((byte) -108, (long) arg2);
        if (var4 == null) {
            class313 var5 = new class313(class267.method1841((byte) 105) + 500L);
            class36.field450.method857(false, var5, (long) arg2);
        } else {
            var4.field5041 = class267.method1841((byte) 127) + 500L;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)I")
    public final int method1283(byte arg0) throws IOException {
        field2927++;
        if (this.field2910) {
            return 0;
        } else {
            if (arg0 > -34) {
                method1282((byte) -94, -128, 22);
            }
            return this.field2914.available();
        }
    }

    @OriginalMember(owner = "client!qm", name = "run", descriptor = "()V")
    public final void run() {
        field2908++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2919 == this.field2917) {
                        if (this.field2910) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field2919;
                    if (this.field2917 < this.field2919) {
                        var3 = 5000 - this.field2919;
                    } else {
                        var3 = this.field2917 - this.field2919;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field2925.write(this.field2907, var2, var3);
                    } catch (IOException var9) {
                        this.field2906 = true;
                    }
                    this.field2919 = (this.field2919 + var3) % 5000;
                    try {
                        if (this.field2919 == this.field2917) {
                            this.field2925.flush();
                        }
                    } catch (IOException var8) {
                        this.field2906 = true;
                    }
                }
            }
            try {
                if (this.field2914 != null) {
                    this.field2914.close();
                }
                if (this.field2925 != null) {
                    this.field2925.close();
                }
                if (this.field2922 != null) {
                    this.field2922.close();
                }
            } catch (IOException var7) {
            }
            this.field2907 = null;
        } catch (Exception var12) {
            class159.method1055((String) null, -17731, var12);
        }
    }

    @OriginalMember(owner = "client!qm", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2923++;
        this.method1277(false);
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljava/net/Socket;Lgj;)V")
    public class189(Socket arg0, class255 arg1) throws IOException {
        this.field2922 = arg0;
        this.field2929 = arg1;
        this.field2922.setSoTimeout(30000);
        this.field2922.setTcpNoDelay(true);
        this.field2914 = this.field2922.getInputStream();
        this.field2925 = this.field2922.getOutputStream();
    }
}
