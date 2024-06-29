import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class202 implements Runnable {

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "Z")
    private boolean field2899 = false;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    private int field2900 = 0;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    private int field2891 = 0;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "Z")
    private boolean field2901 = false;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "Lrd;")
    private class185 field2892;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "Ljava/net/Socket;")
    private Socket field2895;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "Ljava/io/InputStream;")
    private InputStream field2905;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2887;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "Liq;")
    public static class362 field2890 = new class362("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "Lts;")
    private class315 field2889;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "[B")
    private byte[] field2884;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "[I")
    public static int[] field2908;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "[[S")
    public static short[][] field2904;

    @OriginalMember(owner = "client!rr", name = "run", descriptor = "()V", line = 7)
    public final void run() {
        field2888++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2900 == this.field2891) {
                        if (this.field2899) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field2900;
                    if (this.field2891 < this.field2900) {
                        var3 = 5000 - this.field2900;
                    } else {
                        var3 = this.field2891 - this.field2900;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field2887.write(this.field2884, var2, var3);
                    } catch (IOException var9) {
                        this.field2901 = true;
                    }
                    this.field2900 = (this.field2900 + var3) % 5000;
                    try {
                        if (this.field2900 == this.field2891) {
                            this.field2887.flush();
                        }
                    } catch (IOException var8) {
                        this.field2901 = true;
                    }
                }
            }
            try {
                if (this.field2905 != null) {
                    this.field2905.close();
                }
                if (this.field2887 != null) {
                    this.field2887.close();
                }
                if (this.field2895 != null) {
                    this.field2895.close();
                }
            } catch (IOException var7) {
            }
            this.field2884 = null;
        } catch (Exception var12) {
            class422.method2663((String) null, var12, -107);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B[BII)V", line = 77)
    public final void method1336(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 != 125) {
            method1339(false);
        }
        field2906++;
        if (this.field2899) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field2905.read(arg1, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg2 += var5;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IBI[B)V", line = 102)
    public final void method1337(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = -4 / ((61 - arg1) / 59);
        field2893++;
        if (this.field2899) {
            return;
        }
        if (this.field2901) {
            this.field2901 = false;
            throw new IOException();
        }
        if (this.field2884 == null) {
            this.field2884 = new byte[5000];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg0; var7++) {
                this.field2884[this.field2891] = arg3[arg2 + var7];
                this.field2891 = (this.field2891 + 1) % 5000;
                if ((this.field2900 + 4900) % 5000 == this.field2891) {
                    throw new IOException();
                }
            }
            if (this.field2889 == null) {
                this.field2889 = this.field2892.method1276(this, 3, (byte) 56);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V", line = 156)
    public final void method1338(int arg0) throws IOException {
        field2894++;
        if (this.field2899) {
            return;
        }
        if (this.field2901) {
            this.field2901 = false;
            throw new IOException();
        } else if (arg0 != 0) {
            this.method1341(-69);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V", line = 178)
    public static final void method1339(boolean arg0) {
        field2898++;
        class237 var1 = class141.field1742;
        synchronized (class141.field1742) {
            if (!arg0) {
                field2904 = null;
            }
            class141.field1742.method1626((byte) 106);
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)I", line = 194)
    public final int method1340(int arg0) throws IOException {
        field2896++;
        if (this.field2899) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.run();
            }
            return this.field2905.available();
        }
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V", line = 208)
    public final void method1341(int arg0) {
        field2885++;
        if (this.field2899) {
            return;
        }
        if (arg0 != 16639) {
            this.method1343((byte) 43);
        }
        this.field2905 = new class181();
        this.field2887 = new class94();
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V", line = 227)
    public static void method1342(byte arg0) {
        if (arg0 != 28) {
            method1342((byte) -14);
        }
        field2908 = null;
        field2890 = null;
        field2904 = null;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V", line = 242)
    public final void method1343(byte arg0) {
        field2903++;
        int var2 = 71 % ((arg0 - 8) / 35);
        if (this.field2899) {
            return;
        }
        synchronized (this) {
            this.field2899 = true;
            this.notifyAll();
        }
        if (this.field2889 != null) {
            while (this.field2889.field4498 == 0) {
                class150.method907(1L, (byte) -32);
            }
            if (this.field2889.field4498 == 1) {
                try {
                    ((Thread) this.field2889.field4497).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2889 = null;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Ljava/net/Socket;Lrd;)V", line = 352)
    public class202(Socket arg0, class185 arg1) throws IOException {
        this.field2892 = arg1;
        this.field2895 = arg0;
        this.field2895.setSoTimeout(30000);
        this.field2895.setTcpNoDelay(true);
        this.field2905 = this.field2895.getInputStream();
        this.field2887 = this.field2895.getOutputStream();
    }

    @OriginalMember(owner = "client!rr", name = "finalize", descriptor = "()V", line = 286)
    protected final void finalize() {
        this.method1343((byte) 113);
        field2907++;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)I", line = 297)
    public final int method1344(byte arg0) throws IOException {
        if (arg0 != -103) {
            method1342((byte) -48);
        }
        field2886++;
        return this.field2899 ? 0 : this.field2905.read();
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZIIIII)V", line = 326)
    public static final void method1345(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2902++;
        int var6 = class130.method805(arg0, class219.field3080, arg1, class388.field5464);
        int var7 = class130.method805(arg0, class219.field3080, arg2, class388.field5464);
        int var8 = class130.method805(true, class235.field3295, arg3, class81.field946);
        int var9 = class130.method805(true, class235.field3295, arg4, class81.field946);
        for (int var10 = var6; var10 <= var7; var10++) {
            class296.method1954(arg5, var9, class291.field4067[var10], var8, -1);
        }
    }
}
