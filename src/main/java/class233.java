import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class233 implements Runnable {

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
    private int field3106 = 0;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
    private int field3108 = 0;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "Z")
    private boolean field3107 = false;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "Z")
    private boolean field3110 = false;

    @OriginalMember(owner = "client!uq", name = "y", descriptor = "Ljava/net/Socket;")
    private Socket field3119;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "Lwd;")
    private class36 field3103;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field3097;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3109;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "[I")
    public static int[] field3102 = new int[14];

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!uq", name = "x", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "Llm;")
    public static class347 field3100;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "Ltj;")
    private class429 field3098;

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "[B")
    private byte[] field3117;

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "[[[I")
    public static int[][][] field3116;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BI)V")
    public static final void method1393(byte arg0, int arg1) {
        if (arg0 >= -114) {
            field3099 = -62;
        }
        field3105++;
        class263 var2 = class47.method337(4, 0, arg1);
        var2.method1806(false);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)I")
    public final int method1394(boolean arg0) throws IOException {
        field3095++;
        if (this.field3107) {
            return 0;
        } else {
            if (!arg0) {
                this.field3097 = null;
            }
            return this.field3097.available();
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
    public static void method1395(int arg0) {
        field3116 = null;
        field3100 = null;
        if (arg0 == -1) {
            field3102 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field3096++;
        this.method1398((byte) 115);
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
    public final void method1396(int arg0) throws IOException {
        field3112++;
        if (arg0 != 5000) {
            method1395(-85);
        }
        if (!this.field3107 && this.field3110) {
            this.field3110 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZI[BI)V")
    public final void method1397(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0) {
            method1395(-106);
        }
        field3114++;
        if (this.field3107) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field3097.read(arg2, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg1 += var5;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
    public final void method1398(byte arg0) {
        field3120++;
        if (this.field3107) {
            return;
        }
        synchronized (this) {
            this.field3107 = true;
            this.notifyAll();
        }
        if (this.field3098 != null) {
            while (this.field3098.field6308 == 0) {
                class144.method918(1L, true);
            }
            if (this.field3098.field6308 == 1) {
                try {
                    ((Thread) this.field3098.field6309).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        int var3 = 103 % ((arg0 + 16) / 59);
        this.field3098 = null;
    }

    @OriginalMember(owner = "client!uq", name = "run", descriptor = "()V")
    public final void run() {
        field3111++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field3108 == this.field3106) {
                        if (this.field3107) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field3106;
                    if (this.field3106 > this.field3108) {
                        var3 = 5000 - this.field3106;
                    } else {
                        var3 = this.field3108 - this.field3106;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field3109.write(this.field3117, var2, var3);
                    } catch (IOException var9) {
                        this.field3110 = true;
                    }
                    this.field3106 = (this.field3106 + var3) % 5000;
                    try {
                        if (this.field3108 == this.field3106) {
                            this.field3109.flush();
                        }
                    } catch (IOException var8) {
                        this.field3110 = true;
                    }
                }
            }
            try {
                if (this.field3097 != null) {
                    this.field3097.close();
                }
                if (this.field3109 != null) {
                    this.field3109.close();
                }
                if (this.field3119 != null) {
                    this.field3119.close();
                }
            } catch (IOException var7) {
            }
            this.field3117 = null;
        } catch (Exception var12) {
            class248.method1494((String) null, 96, var12);
        }
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)I")
    public final int method1399(int arg0) throws IOException {
        field3104++;
        if (arg0 != -7573) {
            this.field3106 = -17;
        }
        return this.field3107 ? 0 : this.field3097.read();
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)V")
    public final void method1400(byte arg0) {
        field3118++;
        int var2 = 46 % ((20 - arg0) / 58);
        if (!this.field3107) {
            this.field3097 = new class272();
            this.field3109 = new class276();
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(III[B)V")
    public final void method1401(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != 3) {
            this.finalize();
        }
        field3115++;
        if (this.field3107) {
            return;
        }
        if (this.field3110) {
            this.field3110 = false;
            throw new IOException();
        }
        if (this.field3117 == null) {
            this.field3117 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field3117[this.field3108] = arg3[arg1 + var6];
                this.field3108 = (this.field3108 + 1) % 5000;
                if (((this.field3106 + 4900) % 5000) == this.field3108) {
                    throw new IOException();
                }
            }
            if (this.field3098 == null) {
                this.field3098 = this.field3103.method242(this, (byte) -102, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Ljava/net/Socket;Lwd;)V")
    public class233(Socket arg0, class36 arg1) throws IOException {
        this.field3119 = arg0;
        this.field3103 = arg1;
        this.field3119.setSoTimeout(30000);
        this.field3119.setTcpNoDelay(true);
        this.field3097 = this.field3119.getInputStream();
        this.field3109 = this.field3119.getOutputStream();
    }
}
