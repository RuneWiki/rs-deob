import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class7 implements Runnable {

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Z")
    private boolean field46 = false;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    private int field49 = 0;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "Z")
    private boolean field55 = false;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    private int field64 = 0;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "Ljd;")
    private class87 field60;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "Ljava/net/Socket;")
    private Socket field61;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "Ljava/io/InputStream;")
    private InputStream field52;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field50;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Loa;")
    public static class99 field41 = class221.method1463(2844, ":");

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field56 = -1;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "Loa;")
    public static class99 field58 = class221.method1463(2844, "Moteur son pr-Bpar-B");

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "Loh;")
    private class275 field54;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "[B")
    private byte[] field48;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public final void method54(byte arg0) {
        int var2 = -84 % ((arg0 - 85) / 38);
        field51++;
        if (this.field46) {
            return;
        }
        synchronized (this) {
            this.field46 = true;
            this.notifyAll();
        }
        if (this.field54 != null) {
            while (this.field54.field4844 == 0) {
                class100.method711(0, 1L);
            }
            if (this.field54.field4844 == 1) {
                try {
                    ((Thread) this.field54.field4843).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field54 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([BBII)V")
    public final void method55(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        if (arg1 > -56) {
            return;
        }
        field59++;
        if (this.field46) {
            return;
        }
        if (this.field55) {
            this.field55 = false;
            throw new IOException();
        }
        if (this.field48 == null) {
            this.field48 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field48[this.field64] = arg0[arg2 + var6];
                this.field64 = (this.field64 + 1) % 5000;
                if ((this.field49 + 4900) % 5000 == this.field64) {
                    throw new IOException();
                }
            }
            if (this.field54 == null) {
                this.field54 = this.field60.method594(-30175, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public final void method56(int arg0) {
        if (arg0 != 63) {
            method59(5);
        }
        field44++;
        if (!this.field46) {
            this.field52 = new class165();
            this.field50 = new class158();
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)I")
    public final int method57(int arg0) throws IOException {
        field53++;
        int var2 = -104 / ((3 - arg0) / 50);
        return this.field46 ? 0 : this.field52.read();
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
    public final void method58(byte arg0) throws IOException {
        int var2 = 42 % ((arg0 - 18) / 33);
        field43++;
        if (!this.field46 && this.field55) {
            this.field55 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public static void method59(int arg0) {
        if (arg0 == -1) {
            field41 = null;
            field58 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "run", descriptor = "()V")
    public final void run() {
        field62++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field64 == this.field49) {
                        if (this.field46) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field64 < this.field49) {
                        var2 = 5000 - this.field49;
                    } else {
                        var2 = this.field64 - this.field49;
                    }
                    var3 = this.field49;
                }
                if (var2 > 0) {
                    try {
                        this.field50.write(this.field48, var3, var2);
                    } catch (IOException var9) {
                        this.field55 = true;
                    }
                    this.field49 = (this.field49 + var2) % 5000;
                    try {
                        if (this.field64 == this.field49) {
                            this.field50.flush();
                        }
                    } catch (IOException var8) {
                        this.field55 = true;
                    }
                }
            }
            try {
                if (this.field52 != null) {
                    this.field52.close();
                }
                if (this.field50 != null) {
                    this.field50.close();
                }
                if (this.field61 != null) {
                    this.field61.close();
                }
            } catch (IOException var7) {
            }
            this.field48 = null;
        } catch (Exception var12) {
            class196.method1315(false, var12, (String) null);
        }
    }

    @OriginalMember(owner = "client!bh", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field45++;
        this.method54((byte) 127);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method60(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg2 - arg8;
        int var12 = arg1 - arg3;
        field42++;
        if (arg9 != 5000) {
            return;
        }
        boolean var13;
        if (class97.field1628 > 0 && (class97.field1628 % 10) < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg0;
        int var15 = 983040 / arg10;
        for (int var16 = -var15; var16 < var11 + var15; var16++) {
            int var18 = (var16 + 1) * arg10 + arg5 >> 16;
            int var19 = arg10 * var16 + arg5 >> 16;
            int var20 = var18 - var19;
            if (var20 > 0) {
                int var10000 = arg4 + var18;
                int var22 = arg4 + var19;
                int var23 = arg8 + var16 >> 6;
                if (var23 >= 0 && (class129.field2261.length - 1) >= var23) {
                    int[][] var24 = class129.field2261[var23];
                    for (int var25 = -var14; var25 < (var12 + var14); var25++) {
                        int var26 = arg7 + ((var25 + 1) * arg0) >> 16;
                        int var27 = arg0 * var25 + arg7 >> 16;
                        int var28 = var26 - var27;
                        if (var28 > 0) {
                            int var29 = arg6 + var27;
                            var10000 = arg6 + var26;
                            int var31 = var25 + arg3 >> 6;
                            if (var31 >= 0 && var24.length - 1 >= var31 && var24[var31] != null) {
                                int var32 = (arg3 + var25 & 0x3F << 6) + (arg8 + var16 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class153 var34 = class247.method1601(26012, var33 - 1);
                                    if (!class218.field3796[var34.field2689]) {
                                        if (var13 && class240.field4146 == var34.field2689) {
                                            class214 var35 = new class214();
                                            var35.field3713 = var22;
                                            var35.field3714 = var34.field2689;
                                            var35.field3719 = var29;
                                            class63.field1065.method536(var35, (byte) -10);
                                        } else {
                                            class102.field1737[var34.field2689].method38(var22 - 7, var29 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class214 var17 = (class214) class63.field1065.method529(10); var17 != null; var17 = (class214) class63.field1065.method533(arg9 - 4914)) {
            class102.field1737[var17.field3714].method38(var17.field3713 - 7, var17.field3719 + -7);
            class68.method449(var17.field3713, var17.field3719, 15, 16776960, 128);
            class68.method449(var17.field3713, var17.field3719, 7, 16777215, 256);
        }
        class63.field1065.method534(arg9 - 4999);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[BII)V")
    public final void method61(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field57++;
        if (arg0 > -67 || this.field46) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field52.read(arg1, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg2 += var5;
        }
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)I")
    public final int method62(int arg0) throws IOException {
        if (arg0 == -1) {
            field47++;
            return this.field46 ? 0 : this.field52.available();
        } else {
            return -76;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Ljava/net/Socket;Ljd;)V")
    public class7(Socket arg0, class87 arg1) throws IOException {
        this.field60 = arg1;
        this.field61 = arg0;
        this.field61.setSoTimeout(30000);
        this.field61.setTcpNoDelay(true);
        this.field52 = this.field61.getInputStream();
        this.field50 = this.field61.getOutputStream();
    }
}
