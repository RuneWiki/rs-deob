import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class532 implements Runnable {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    private int field7802 = 0;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Z")
    private boolean field7805 = false;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    private int field7817 = 0;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Z")
    private boolean field7813 = false;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Lnt;")
    private class151 field7816;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field7806;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field7815;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field7819;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Z")
    public static boolean field7804 = false;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Z")
    public static boolean field7810 = false;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field7812;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field7814;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field7818;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Lum;")
    private class370 field7823;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "[B")
    private byte[] field7824;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIZILoi;)V")
    public static final void method3133(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class53 arg6) {
        class234.field3410 = arg6;
        class102.field1358 = arg5;
        class463.field6473 = arg1;
        class346.field5017 = arg4;
        field7809++;
        if (arg3 < 76) {
            field7804 = true;
        }
        class464.field6495 = arg2;
        class15.field189 = 1;
        class123.field1680 = arg0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[BIB)V")
    public final void method3134(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field7807++;
        int var5 = -60 / ((arg3 + 66) / 32);
        if (this.field7805) {
            return;
        }
        while (arg0 > 0) {
            int var6 = this.field7815.read(arg1, arg2, arg0);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg2 += var6;
            arg0 -= var6;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public final void method3135(int arg0) {
        field7814++;
        if (this.field7805) {
            return;
        }
        this.field7815 = new class522();
        if (arg0 != 5000) {
            field7804 = true;
        }
        this.field7819 = new class414();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public final void method3136(byte arg0) throws IOException {
        field7820++;
        if (this.field7805) {
            return;
        }
        if (this.field7813) {
            this.field7813 = false;
            throw new IOException();
        } else if (arg0 != -20) {
            this.field7806 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)I")
    public final int method3137(int arg0) throws IOException {
        field7818++;
        if (arg0 != 1) {
            this.field7816 = null;
        }
        return this.field7805 ? 0 : this.field7815.available();
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
    public final void method3138(byte arg0) {
        field7811++;
        if (this.field7805) {
            return;
        }
        synchronized (this) {
            this.field7805 = true;
            this.notifyAll();
        }
        if (this.field7823 != null) {
            while (this.field7823.field5277 == 0) {
                class52.method411(1L, (byte) 127);
            }
            if (this.field7823.field5277 == 1) {
                try {
                    ((Thread) this.field7823.field5274).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field7823 = null;
        int var3 = 20 % ((74 - arg0) / 40);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II[BI)V")
    public final void method3139(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field7825++;
        if (this.field7805) {
            return;
        }
        if (this.field7813) {
            this.field7813 = false;
            throw new IOException();
        }
        if (this.field7824 == null) {
            this.field7824 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = arg3; var6 < arg0; var6++) {
                this.field7824[this.field7802] = arg2[arg1 + var6];
                this.field7802 = (this.field7802 + 1) % 5000;
                if (((this.field7817 + 4900) % 5000) == this.field7802) {
                    throw new IOException();
                }
            }
            if (this.field7823 == null) {
                this.field7823 = this.field7816.method958((byte) 73, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!qc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method3138((byte) -12);
        field7803++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
    public static final void method3140(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7821++;
        if (arg0 != 5000) {
            field7808 = -58;
        }
        class45 var5 = class354.method2094(arg1, (byte) -121, 4);
        var5.method260(9188);
        var5.field510 = arg4;
        var5.field504 = arg3;
        var5.field516 = arg2;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)I")
    public final int method3141(int arg0) throws IOException {
        field7822++;
        if (arg0 != 0) {
            this.field7813 = false;
        }
        return this.field7805 ? 0 : this.field7815.read();
    }

    @OriginalMember(owner = "client!qc", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field7817 == this.field7802) {
                            if (this.field7805) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field7817;
                        if (this.field7817 <= this.field7802) {
                            var3 = this.field7802 - this.field7817;
                        } else {
                            var3 = 5000 - this.field7817;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field7819.write(this.field7824, var2, var3);
                    } catch (IOException var9) {
                        this.field7813 = true;
                    }
                    this.field7817 = (this.field7817 + var3) % 5000;
                    try {
                        if (this.field7817 == this.field7802) {
                            this.field7819.flush();
                        }
                    } catch (IOException var8) {
                        this.field7813 = true;
                    }
                    continue;
                }
                try {
                    if (this.field7815 != null) {
                        this.field7815.close();
                    }
                    if (this.field7819 != null) {
                        this.field7819.close();
                    }
                    if (this.field7806 != null) {
                        this.field7806.close();
                    }
                } catch (IOException var7) {
                }
                this.field7824 = null;
                break;
            }
        } catch (Exception var12) {
            class406.method2409(3896, var12, null);
        }
        field7812++;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljava/net/Socket;Lnt;)V")
    public class532(Socket arg0, class151 arg1) throws IOException {
        this.field7816 = arg1;
        this.field7806 = arg0;
        this.field7806.setSoTimeout(30000);
        this.field7806.setTcpNoDelay(true);
        this.field7815 = this.field7806.getInputStream();
        this.field7819 = this.field7806.getOutputStream();
    }
}
