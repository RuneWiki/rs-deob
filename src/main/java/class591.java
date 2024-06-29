import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class591 implements Runnable {

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "Z")
    private boolean field8499 = false;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
    private int field8501 = 0;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "Z")
    private boolean field8498 = false;

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
    private int field8506 = 0;

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "Ln;")
    private class17 field8508;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "Ljava/net/Socket;")
    private Socket field8491;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "Ljava/io/InputStream;")
    private InputStream field8493;

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field8504;

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "F")
    public static float field8509 = 0.0F;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field8490;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
    public static int field8497;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field8502;

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "I")
    public static int field8503;

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "I")
    public static int field8505;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!qt", name = "v", descriptor = "Lkp;")
    private class456 field8510;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "[B")
    private byte[] field8494;

    @OriginalMember(owner = "client!qt", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method3375(-1);
        field8490++;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)I")
    public final int method3369(int arg0) throws IOException {
        field8507++;
        if (arg0 == 5000) {
            return this.field8499 ? 0 : this.field8493.read();
        } else {
            return 26;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "([BIII)V")
    public final void method3370(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg1 < 125) {
            return;
        }
        field8496++;
        if (this.field8499) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field8493.read(arg0, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)I")
    public final int method3371(int arg0) throws IOException {
        field8497++;
        if (arg0 == -2) {
            return this.field8499 ? 0 : this.field8493.available();
        } else {
            return -9;
        }
    }

    @OriginalMember(owner = "client!qt", name = "run", descriptor = "()V")
    public final void run() {
        field8500++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field8506 == this.field8501) {
                        if (this.field8499) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field8506 > this.field8501) {
                        var2 = 5000 - this.field8506;
                    } else {
                        var2 = this.field8501 - this.field8506;
                    }
                    var3 = this.field8506;
                }
                if (var2 > 0) {
                    try {
                        this.field8504.write(this.field8494, var3, var2);
                    } catch (IOException var9) {
                        this.field8498 = true;
                    }
                    this.field8506 = (this.field8506 + var2) % 5000;
                    try {
                        if (this.field8506 == this.field8501) {
                            this.field8504.flush();
                        }
                    } catch (IOException var8) {
                        this.field8498 = true;
                    }
                }
            }
            try {
                if (this.field8493 != null) {
                    this.field8493.close();
                }
                if (this.field8504 != null) {
                    this.field8504.close();
                }
                if (this.field8491 != null) {
                    this.field8491.close();
                }
            } catch (IOException var7) {
            }
            this.field8494 = null;
        } catch (Exception var12) {
            class374.method2357(null, 119, var12);
        }
    }

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(I)V")
    public final void method3372(int arg0) throws IOException {
        field8505++;
        if (this.field8499) {
            return;
        }
        if (arg0 <= 98) {
            this.field8510 = null;
        }
        if (this.field8498) {
            this.field8498 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I[BIB)V")
    public final void method3373(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field8503++;
        if (this.field8499) {
            return;
        }
        if (this.field8498) {
            this.field8498 = false;
            throw new IOException();
        }
        if (this.field8494 == null) {
            this.field8494 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            if (arg3 != -71) {
                this.field8508 = null;
            }
            while (var6 < arg0) {
                this.field8494[this.field8501] = arg1[arg2 + var6];
                this.field8501 = (this.field8501 + 1) % 5000;
                if (((this.field8506 + 4900) % 5000) == this.field8501) {
                    throw new IOException();
                }
                var6++;
            }
            if (this.field8510 == null) {
                this.field8510 = this.field8508.method400(3, this, false);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Z)V")
    public final void method3374(boolean arg0) {
        field8489++;
        if (this.field8499) {
            return;
        }
        this.field8493 = new class233();
        this.field8504 = new class147();
        if (arg0) {
            this.field8493 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "(I)V")
    public final void method3375(int arg0) {
        if (arg0 != -1) {
            this.finalize();
        }
        field8495++;
        if (this.field8499) {
            return;
        }
        synchronized (this) {
            this.field8499 = true;
            this.notifyAll();
        }
        if (this.field8510 != null) {
            while (this.field8510.field6502 == 0) {
                class185.method1354(1L, 10);
            }
            if (this.field8510.field6502 == 1) {
                try {
                    ((Thread) this.field8510.field6499).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field8510 = null;
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Ljava/net/Socket;Ln;)V")
    public class591(Socket arg0, class17 arg1) throws IOException {
        this.field8508 = arg1;
        this.field8491 = arg0;
        this.field8491.setSoTimeout(30000);
        this.field8491.setTcpNoDelay(true);
        this.field8493 = this.field8491.getInputStream();
        this.field8504 = this.field8491.getOutputStream();
    }
}
