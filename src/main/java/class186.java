import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class186 implements Runnable {

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "Z")
    private boolean field2990 = false;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    private int field2998 = 0;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    private int field2979 = 0;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "Z")
    private boolean field3004 = false;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "Ljava/net/Socket;")
    private Socket field3001;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "Lcb;")
    private class255 field2995;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field2980;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3002;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "[Ltb;")
    public static class198[] field2987 = new class198[50];

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "[I")
    public static int[] field2989 = new int[100];

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "[I")
    public static int[] field3000 = new int[128];

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lge;")
    private class137 field2983;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2981;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "[B")
    private byte[] field3003;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)I")
    public final int method1270(int arg0) throws IOException {
        field2985++;
        if (this.field3004) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.method1279(99);
            }
            return this.field2980.read();
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
    public static final void method1271(int arg0, int arg1) {
        class283 var2 = class46.method360(arg1, -73, arg0);
        var2.method1900(true);
        field2991++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II[BI)V")
    public final void method1272(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2999++;
        if (this.field3004) {
            return;
        }
        if (this.field2990) {
            this.field2990 = false;
            throw new IOException();
        }
        if (this.field3003 == null) {
            this.field3003 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field3003[this.field2998] = arg2[arg1 + var6];
                this.field2998 = (this.field2998 + 1) % 5000;
                if (((this.field2979 + 4900) % 5000) == this.field2998) {
                    throw new IOException();
                }
            }
            if (arg3 > -53) {
                this.field3003 = null;
            }
            if (this.field2983 == null) {
                this.field2983 = this.field2995.method1679(this, -126, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
    public static void method1273(int arg0) {
        field2989 = null;
        field3000 = null;
        field2981 = null;
        if (arg0 == 9) {
            field2987 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)I")
    public final int method1274(int arg0) throws IOException {
        if (arg0 == 29491) {
            field2982++;
            return this.field3004 ? 0 : this.field2980.available();
        } else {
            return -82;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[BII)V")
    public final void method1275(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2993++;
        if (this.field3004) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field2980.read(arg1, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg3 += var5;
        }
        if (arg2 != 12267) {
            this.field2983 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "run", descriptor = "()V")
    public final void run() {
        field2997++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2998 == this.field2979) {
                        if (this.field3004) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field2979;
                    if (this.field2998 >= this.field2979) {
                        var3 = this.field2998 - this.field2979;
                    } else {
                        var3 = 5000 - this.field2979;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field3002.write(this.field3003, var2, var3);
                    } catch (IOException var9) {
                        this.field2990 = true;
                    }
                    this.field2979 = (this.field2979 + var3) % 5000;
                    try {
                        if (this.field2998 == this.field2979) {
                            this.field3002.flush();
                        }
                    } catch (IOException var8) {
                        this.field2990 = true;
                    }
                }
            }
            try {
                if (this.field2980 != null) {
                    this.field2980.close();
                }
                if (this.field3002 != null) {
                    this.field3002.close();
                }
                if (this.field3001 != null) {
                    this.field3001.close();
                }
            } catch (IOException var7) {
            }
            this.field3003 = null;
        } catch (Exception var12) {
            class272.method1837((String) null, 1, var12);
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
    public final void method1276(int arg0) {
        field2992++;
        if (this.field3004) {
            return;
        }
        synchronized (this) {
            if (arg0 != -1) {
                return;
            }
            this.field3004 = true;
            this.notifyAll();
        }
        if (this.field2983 != null) {
            while (this.field2983.field2271 == 0) {
                class208.method1408(67, 1L);
            }
            if (this.field2983.field2271 == 1) {
                try {
                    ((Thread) this.field2983.field2266).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field2983 = null;
    }

    @OriginalMember(owner = "client!tl", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1276(-1);
        field2996++;
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)V")
    public static final void method1277(int arg0) {
        class257.field4100.method1834(0);
        if (arg0 <= -106) {
            class198.field3191.method1834(0);
            class193.field3100.method1834(0);
            field2994++;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
    public final void method1278(byte arg0) throws IOException {
        field2984++;
        if (this.field3004) {
            return;
        }
        if (arg0 <= 36) {
            this.field2998 = 77;
        }
        if (this.field2990) {
            this.field2990 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)V")
    public final void method1279(int arg0) {
        field2988++;
        if (this.field3004) {
            return;
        }
        this.field2980 = new class130();
        this.field3002 = new class25();
        if (arg0 != 8397) {
            field3000 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Ljava/net/Socket;Lcb;)V")
    public class186(Socket arg0, class255 arg1) throws IOException {
        this.field3001 = arg0;
        this.field2995 = arg1;
        this.field3001.setSoTimeout(30000);
        this.field3001.setTcpNoDelay(true);
        this.field2980 = this.field3001.getInputStream();
        this.field3002 = this.field3001.getOutputStream();
    }
}
