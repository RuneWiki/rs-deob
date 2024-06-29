import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 implements Runnable {

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Z")
    private boolean field14 = false;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    private int field16 = 0;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
    private int field27 = 0;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "Z")
    private boolean field25 = false;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field5;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "Lih;")
    private class80 field17;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "Ljava/io/InputStream;")
    private InputStream field19;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field10;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Lsd;")
    private static class166 field12 = class135.method935("Loaded input handler", 0);

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field18 = 0;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "[I")
    public static int[] field11 = new int[2048];

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "Lsd;")
    public static class166 field15 = class135.method935(":chalreq:", 0);

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "Lsd;")
    public static class166 field20 = field12;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "Lsd;")
    public static class166 field24 = class135.method935(")1p", 0);

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "I")
    public static int field29 = 0;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
    public static int field28 = 0;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lff;")
    public static class53 field2;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lha;")
    private class65 field3;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "[B")
    private byte[] field13;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "[I")
    public static int[] field23;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)I")
    public final int method10(byte arg0) throws IOException {
        if (arg0 != 119) {
            field20 = null;
        }
        field22++;
        return this.field14 ? 0 : this.field19.read();
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIILqa;I)V")
    public static final void method11(int arg0, int arg1, int arg2, int arg3, class145 arg4, int arg5) {
        field8++;
        class8 var6 = new class8();
        var6.field164 = arg4.field2814 * 128;
        int var7 = arg4.field2832;
        var6.field158 = arg0;
        var6.field149 = arg3 * 128;
        var6.field160 = arg4.field2867;
        int var8 = arg4.field2825;
        var6.field144 = arg4.field2821;
        var6.field162 = arg4.field2852;
        var6.field166 = arg1 * 128;
        var6.field148 = arg4.field2865;
        if (arg5 == 1 || arg5 == 3) {
            var8 = arg4.field2832;
            var7 = arg4.field2825;
        }
        var6.field151 = (arg1 + var8) * 128;
        var6.field146 = (arg3 + var7) * 128;
        if (arg4.field2813 != null) {
            var6.field142 = arg4;
            var6.method53(false);
        }
        class178.field3372.method1112(-1250931468, var6);
        if (arg2 != 0) {
            method11(64, 68, 51, 78, null, 90);
        }
        if (var6.field144 != null) {
            var6.field167 = (int) (Math.random() * (double) (var6.field162 - var6.field148)) + var6.field148;
        }
    }

    @OriginalMember(owner = "client!aa", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field27 == this.field16) {
                            if (this.field14) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field16;
                        if (this.field27 < this.field16) {
                            var3 = 5000 - this.field16;
                        } else {
                            var3 = this.field27 - this.field16;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field10.write(this.field13, var2, var3);
                    } catch (IOException var9) {
                        this.field25 = true;
                    }
                    this.field16 = (this.field16 + var3) % 5000;
                    try {
                        if (this.field27 == this.field16) {
                            this.field10.flush();
                        }
                    } catch (IOException var8) {
                        this.field25 = true;
                    }
                    continue;
                }
                try {
                    if (this.field19 != null) {
                        this.field19.close();
                    }
                    if (this.field10 != null) {
                        this.field10.close();
                    }
                    if (this.field5 != null) {
                        this.field5.close();
                    }
                } catch (IOException var7) {
                }
                this.field13 = null;
                break;
            }
        } catch (Exception var12) {
            class32.method238((byte) -65, var12, null);
        }
        field21++;
    }

    @OriginalMember(owner = "client!aa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field26++;
        this.method12((byte) -90);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
    public final void method12(byte arg0) {
        int var2 = -95 / ((arg0 + 45) / 35);
        field6++;
        if (this.field14) {
            return;
        }
        synchronized (this) {
            this.field14 = true;
            this.notifyAll();
        }
        if (this.field3 != null) {
            while (this.field3.field1351 == 0) {
                class189.method1260(1L, 1);
            }
            if (this.field3.field1351 == 1) {
                try {
                    ((Thread) this.field3.field1352).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field3 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([BZII)V")
    public final void method13(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        field7++;
        if (!arg1) {
            field23 = null;
        }
        if (this.field14) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field19.read(arg0, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
    public static void method14(byte arg0) {
        field24 = null;
        field2 = null;
        field11 = null;
        if (arg0 >= 8) {
            field23 = null;
            field12 = null;
            field15 = null;
            field20 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIB[B)V")
    public final void method15(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field9++;
        if (this.field14 || arg2 > -61) {
            return;
        }
        if (this.field25) {
            this.field25 = false;
            throw new IOException();
        }
        if (this.field13 == null) {
            this.field13 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field13[this.field27] = arg3[arg1 + var6];
                this.field27 = (this.field27 + 1) % 5000;
                if ((this.field16 + 4900) % 5000 == this.field27) {
                    throw new IOException();
                }
            }
            if (this.field3 == null) {
                this.field3 = this.field17.method655(this, 3, 1048576);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)I")
    public final int method16(byte arg0) throws IOException {
        int var2 = -25 / ((-arg0 - 73) / 41);
        field4++;
        return this.field14 ? 0 : this.field19.available();
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Ljava/net/Socket;Lih;)V")
    public class2(Socket arg0, class80 arg1) throws IOException {
        this.field5 = arg0;
        this.field17 = arg1;
        this.field5.setSoTimeout(30000);
        this.field5.setTcpNoDelay(true);
        this.field19 = this.field5.getInputStream();
        this.field10 = this.field5.getOutputStream();
    }
}
