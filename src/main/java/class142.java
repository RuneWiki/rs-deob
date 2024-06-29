import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class142 implements Runnable {

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Z")
    private boolean field1710 = false;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    private int field1706 = 0;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    private int field1714 = 0;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "Z")
    private boolean field1718 = false;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Lkd;")
    private class355 field1704;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "Ljava/net/Socket;")
    private Socket field1726;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field1703;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1713;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field1712 = 0;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "Llc;")
    public static class135 field1723;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "Ldb;")
    public static class29 field1725;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "Lgj;")
    private class405 field1720;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "[B")
    private byte[] field1719;

    static {
        new class40("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field1723 = new class135("", 17);
        field1725 = new class29("LOCAL", 4);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([JII[II)V", line = 4)
    public static final void method667(long[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 < arg2) {
            int var5 = (arg4 + arg2) / 2;
            int var6 = arg4;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            int var9 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var9;
            for (int var10 = arg4; var10 < arg2; var10++) {
                if (((long) (var10 & 0x1) + var7) > arg0[var10]) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    int var13 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var13;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var9;
            method667(arg0, 1, var6 - 1, arg3, arg4);
            method667(arg0, 1, arg2, arg3, var6 + 1);
        }
        if (arg1 == 1) {
            field1715++;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 59)
    public final void method668(int arg0) throws IOException {
        field1722++;
        if (this.field1710) {
            return;
        }
        if (this.field1718) {
            this.field1718 = false;
            throw new IOException();
        } else if (arg0 != 0) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V", line = 84)
    public final void method669(int arg0) {
        field1705++;
        if (this.field1710) {
            return;
        }
        synchronized (this) {
            if (arg0 != 5000) {
                this.field1726 = null;
            }
            this.field1710 = true;
            this.notifyAll();
        }
        if (this.field1720 != null) {
            while (this.field1720.field5759 == 0) {
                class85.method433(1L, -75);
            }
            if (this.field1720.field5759 == 1) {
                try {
                    ((Thread) this.field1720.field5755).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1720 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 125)
    public final void method670(byte arg0) {
        if (arg0 <= 78) {
            this.field1726 = null;
        }
        field1717++;
        if (!this.field1710) {
            this.field1703 = new class269();
            this.field1713 = new class463();
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V", line = 141)
    public static final void method671(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1711++;
        if (arg1 == 14412) {
            class481.field6799 = arg4;
            class406.field5779 = arg2;
            class178.field2152 = arg3;
            class350.field5032 = arg0;
        }
    }

    @OriginalMember(owner = "client!ue", name = "finalize", descriptor = "()V", line = 156)
    protected final void finalize() {
        field1707++;
        this.method669(5000);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([BIBI)V", line = 165)
    public final void method672(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field1716++;
        if (this.field1710) {
            return;
        }
        if (arg2 > -14) {
            method667((long[]) null, 40, -125, (int[]) null, -24);
        }
        while (arg3 > 0) {
            int var5 = this.field1703.read(arg0, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!ue", name = "run", descriptor = "()V", line = 191)
    public final void run() {
        field1702++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1714 == this.field1706) {
                        if (this.field1710) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field1714;
                    if (this.field1714 <= this.field1706) {
                        var3 = this.field1706 - this.field1714;
                    } else {
                        var3 = 5000 - this.field1714;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field1713.write(this.field1719, var2, var3);
                    } catch (IOException var9) {
                        this.field1718 = true;
                    }
                    this.field1714 = (this.field1714 + var3) % 5000;
                    try {
                        if (this.field1714 == this.field1706) {
                            this.field1713.flush();
                        }
                    } catch (IOException var8) {
                        this.field1718 = true;
                    }
                }
            }
            try {
                if (this.field1703 != null) {
                    this.field1703.close();
                }
                if (this.field1713 != null) {
                    this.field1713.close();
                }
                if (this.field1726 != null) {
                    this.field1726.close();
                }
            } catch (IOException var7) {
            }
            this.field1719 = null;
        } catch (Exception var12) {
            class144.method678(var12, true, (String) null);
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)I", line = 273)
    public final int method673(int arg0) throws IOException {
        if (arg0 != -2101) {
            method671(-68, -3, -36, 46, 93);
        }
        field1708++;
        return this.field1710 ? 0 : this.field1703.read();
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljava/net/Socket;Lkd;)V", line = 412)
    public class142(Socket arg0, class355 arg1) throws IOException {
        this.field1704 = arg1;
        this.field1726 = arg0;
        this.field1726.setSoTimeout(30000);
        this.field1726.setTcpNoDelay(true);
        this.field1703 = this.field1726.getInputStream();
        this.field1713 = this.field1726.getOutputStream();
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZII)Lpe;", line = 292)
    public static final class424 method674(boolean arg0, int arg1, int arg2) {
        field1721++;
        class424 var3 = new class424();
        if (!arg0) {
            field1712 = 57;
        }
        var3.field6103 = arg1 + 5 + 1;
        var3.field6119 = arg2 + 6;
        var3.field6121 = -1;
        var3.field6116 = -1;
        var3.field6118 = new int[var3.field6103][var3.field6119];
        var3.method2534(-2);
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIB[B)V", line = 318)
    public final void method675(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field1709++;
        if (this.field1710) {
            return;
        }
        if (this.field1718) {
            this.field1718 = false;
            throw new IOException();
        }
        if (this.field1719 == null) {
            this.field1719 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field1719[this.field1706] = arg3[arg1 + var6];
                this.field1706 = (this.field1706 + 1) % 5000;
                if (((this.field1714 + 4900) % 5000) == this.field1706) {
                    throw new IOException();
                }
            }
            if (this.field1720 == null) {
                this.field1720 = this.field1704.method2157(3, true, this);
            }
            this.notifyAll();
            int var7 = -72 % ((-arg2 - 28) / 57);
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)I", line = 370)
    public final int method676(byte arg0) throws IOException {
        int var2 = 30 % ((45 - arg0) / 42);
        field1724++;
        return this.field1710 ? 0 : this.field1703.available();
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V", line = 392)
    public static void method677(int arg0) {
        field1723 = null;
        if (arg0 != -6109) {
            field1723 = null;
        }
        field1725 = null;
    }
}
