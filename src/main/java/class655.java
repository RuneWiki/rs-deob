import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class655 implements Runnable {

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    private int field9064 = 0;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "Z")
    private boolean field9071 = false;

    @OriginalMember(owner = "client!go", name = "r", descriptor = "I")
    private int field9079 = 0;

    @OriginalMember(owner = "client!go", name = "s", descriptor = "Z")
    private boolean field9080 = false;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "Ljava/net/Socket;")
    private Socket field9062;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "Llu;")
    private class742 field9065;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "Ljava/io/InputStream;")
    private InputStream field9072;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field9075;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "I")
    private int field9076;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public static int field9070 = 0;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public static int field9066;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!go", name = "t", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!go", name = "u", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "Lfo;")
    private class545 field9078;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "[B")
    private byte[] field9074;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILva;Lva;)V", line = 11)
    public static final void method3680(int arg0, int arg1, int arg2, class524 arg3, class524 arg4) {
        class549 var5 = class663.method3754(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field7464 = arg3;
        var5.field7467 = arg4;
        int var6 = class745.field10286 == class178.field2805 ? 1 : 0;
        if (!arg3.method902(0)) {
            arg3.field7407 = class265.field3738[var6];
            class265.field3738[var6] = arg3;
        } else if (arg3.method910(false)) {
            arg3.field7407 = class684.field9523[var6];
            class684.field9523[var6] = arg3;
        } else {
            arg3.field7407 = class451.field6179[var6];
            class451.field6179[var6] = arg3;
            class180.field2828 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method902(0)) {
            if (arg4.method910(false)) {
                arg4.field7407 = class684.field9523[var6];
                class684.field9523[var6] = arg4;
                return;
            }
            arg4.field7407 = class451.field6179[var6];
            class451.field6179[var6] = arg4;
            class180.field2828 = true;
            return;
        }
        arg4.field7407 = class265.field3738[var6];
        class265.field3738[var6] = arg4;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V", line = 68)
    public final void method3681(boolean arg0) {
        field9069++;
        if (!arg0 && !this.field9080) {
            this.field9072 = new class399();
            this.field9075 = new class328();
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V", line = 83)
    public final void method3682(byte arg0) throws IOException {
        field9073++;
        if (!this.field9080 && arg0 > 99 && this.field9071) {
            this.field9071 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I[BIB)V", line = 105)
    public final void method3683(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field9068++;
        if (this.field9080) {
            return;
        }
        if (this.field9071) {
            this.field9071 = false;
            throw new IOException();
        }
        if (this.field9074 == null) {
            this.field9074 = new byte[this.field9076];
        }
        if (arg3 >= -1) {
            this.field9064 = -100;
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field9074[this.field9064] = arg1[arg0 + var6];
                this.field9064 = (this.field9064 + 1) % this.field9076;
                if ((this.field9076 + this.field9079 - 100) % this.field9076 == this.field9064) {
                    throw new IOException();
                }
            }
            if (this.field9078 == null) {
                this.field9078 = this.field9065.method4116(3, this, (byte) 124);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(B)I", line = 159)
    public final int method3684(byte arg0) throws IOException {
        if (arg0 >= -61) {
            return 113;
        } else {
            field9067++;
            return this.field9080 ? 0 : this.field9072.available();
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Ljava/net/Socket;Llu;I)V", line = 357)
    public class655(Socket arg0, class742 arg1, int arg2) throws IOException {
        this.field9062 = arg0;
        this.field9065 = arg1;
        this.field9062.setSoTimeout(30000);
        this.field9062.setTcpNoDelay(true);
        this.field9072 = this.field9062.getInputStream();
        this.field9075 = this.field9062.getOutputStream();
        this.field9076 = arg2;
    }

    @OriginalMember(owner = "client!go", name = "run", descriptor = "()V", line = 180)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field9079 == this.field9064) {
                            if (this.field9080) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field9079;
                        if (this.field9079 <= this.field9064) {
                            var3 = this.field9064 - this.field9079;
                        } else {
                            var3 = this.field9076 - this.field9079;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field9075.write(this.field9074, var2, var3);
                    } catch (IOException var9) {
                        this.field9071 = true;
                    }
                    this.field9079 = (this.field9079 + var3) % this.field9076;
                    try {
                        if (this.field9079 == this.field9064) {
                            this.field9075.flush();
                        }
                    } catch (IOException var8) {
                        this.field9071 = true;
                    }
                    continue;
                }
                try {
                    if (this.field9072 != null) {
                        this.field9072.close();
                    }
                    if (this.field9075 != null) {
                        this.field9075.close();
                    }
                    if (this.field9062 != null) {
                        this.field9062.close();
                    }
                } catch (IOException var7) {
                }
                this.field9074 = null;
                break;
            }
        } catch (Exception var12) {
            class281.method1820(null, 28395, var12);
        }
        field9081++;
    }

    @OriginalMember(owner = "client!go", name = "finalize", descriptor = "()V", line = 253)
    protected final void finalize() {
        this.method3687((byte) -126);
        field9077++;
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(B)I", line = 261)
    public final int method3685(byte arg0) throws IOException {
        field9063++;
        if (this.field9080) {
            return 0;
        } else {
            if (arg0 != 23) {
                this.run();
            }
            return this.field9072.read();
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I[BII)V", line = 288)
    public final void method3686(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg3 != -1) {
            this.method3681(true);
        }
        field9066++;
        if (this.field9080) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field9072.read(arg1, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg2 += var5;
        }
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(B)V", line = 313)
    public final void method3687(byte arg0) {
        int var2 = -15 / ((arg0 + 72) / 51);
        field9082++;
        if (this.field9080) {
            return;
        }
        synchronized (this) {
            this.field9080 = true;
            this.notifyAll();
        }
        if (this.field9078 != null) {
            while (this.field9078.field7412 == 0) {
                class643.method3577(1L, 0);
            }
            if (this.field9078.field7412 == 1) {
                try {
                    ((Thread) this.field9078.field7416).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field9078 = null;
    }
}
