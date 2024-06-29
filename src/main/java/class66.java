import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class66 implements Runnable {

    @OriginalMember(owner = "client!al", name = "s", descriptor = "Z")
    private boolean field854 = false;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "Z")
    private boolean field859 = false;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    private int field838 = 0;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    private int field855 = 0;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "Ljava/net/Socket;")
    private Socket field858;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Let;")
    private class419 field841;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "Ljava/io/InputStream;")
    private InputStream field856;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field836;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "Lqt;")
    private class449 field849;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "Ljava/lang/String;")
    public static String field839;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "[B")
    private byte[] field837;

    @OriginalMember(owner = "client!al", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        this.method646(false);
        field857++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IBI[B)V", line = 13)
    public final void method639(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field860++;
        if (this.field854) {
            return;
        }
        if (arg1 != 113) {
            this.run();
        }
        while (arg2 > 0) {
            int var5 = this.field856.read(arg3, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 39)
    public final void method640(int arg0) {
        field842++;
        if (this.field854) {
            return;
        }
        this.field856 = new class183();
        if (arg0 != 0) {
            field848 = -117;
        }
        this.field836 = new class447();
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)I", line = 56)
    public final int method641(int arg0) throws IOException {
        field861++;
        if (arg0 == 3) {
            return this.field854 ? 0 : this.field856.available();
        } else {
            return 45;
        }
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V", line = 70)
    public static void method642(int arg0) {
        field839 = null;
        if (arg0 != -1) {
            method645(85, 90, -68);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)I", line = 85)
    public static final int method643(int arg0, int arg1, int arg2, int arg3) {
        field845++;
        if (class131.field1899 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || class397.field5828 - 1 < var4 || (class457.field6713 - 1) < var5) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class238.field3497[1][var4][var5] & 0x2) != 0) {
            var6 = arg2 + 1;
        }
        int var7 = -16 / ((2 - arg1) / 38);
        return class131.field1899[var6].method426(arg0, arg3);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)V", line = 114)
    public static final void method644(int arg0, byte arg1) {
        class101.field1423 = 1000 / arg0;
        if (arg1 >= -31) {
            method648(false, null);
        }
        field843++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)Z", line = 126)
    public static final boolean method645(int arg0, int arg1, int arg2) {
        field852++;
        if (class199.method1400(arg1, arg2, -58)) {
            if (arg0 != -20147) {
                field839 = null;
            }
            return (arg2 & 0xB000) != 0 | class209.method1449(arg1, arg2, (byte) 107) | class355.method2145(arg2, arg1, (byte) -60) ? true : (class37.method283(arg1, arg0 ^ 0x4ECE, arg2) | class276.method1774(arg1, (byte) 107, arg2)) & (arg1 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V", line = 145)
    public final void method646(boolean arg0) {
        field851++;
        if (this.field854) {
            return;
        }
        synchronized (this) {
            if (arg0) {
                return;
            }
            this.field854 = true;
            this.notifyAll();
        }
        if (this.field849 != null) {
            while (this.field849.field6617 == 0) {
                class213.method1462(1L, -5184);
            }
            if (this.field849.field6617 == 1) {
                try {
                    ((Thread) this.field849.field6613).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field849 = null;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)I", line = 181)
    public final int method647(int arg0) throws IOException {
        field850++;
        if (arg0 <= 1) {
            this.method640(59);
        }
        return this.field854 ? 0 : this.field856.read();
    }

    @OriginalMember(owner = "client!al", name = "run", descriptor = "()V", line = 200)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field855 == this.field838) {
                            if (this.field854) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field838;
                        if (this.field838 <= this.field855) {
                            var3 = this.field855 - this.field838;
                        } else {
                            var3 = 5000 - this.field838;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field836.write(this.field837, var2, var3);
                    } catch (IOException var9) {
                        this.field859 = true;
                    }
                    this.field838 = (this.field838 + var3) % 5000;
                    try {
                        if (this.field855 == this.field838) {
                            this.field836.flush();
                        }
                    } catch (IOException var8) {
                        this.field859 = true;
                    }
                    continue;
                }
                try {
                    if (this.field856 != null) {
                        this.field856.close();
                    }
                    if (this.field836 != null) {
                        this.field836.close();
                    }
                    if (this.field858 != null) {
                        this.field858.close();
                    }
                } catch (IOException var7) {
                }
                this.field837 = null;
                break;
            }
        } catch (Exception var12) {
            class194.method1362(var12, null, -128);
        }
        field844++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 272)
    public static final void method648(boolean arg0, String arg1) {
        if (!arg0) {
            field847++;
            System.out.println("Error: " + class433.method2630("\n", -9, "%0a", arg1));
        }
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V", line = 283)
    public final void method649(int arg0) throws IOException {
        if (arg0 != -2) {
            this.field859 = false;
        }
        field840++;
        if (!this.field854 && this.field859) {
            this.field859 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Ljava/net/Socket;Let;)V", line = 376)
    public class66(Socket arg0, class419 arg1) throws IOException {
        this.field858 = arg0;
        this.field841 = arg1;
        this.field858.setSoTimeout(30000);
        this.field858.setTcpNoDelay(true);
        this.field856 = this.field858.getInputStream();
        this.field836 = this.field858.getOutputStream();
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II[BI)V", line = 314)
    public final void method650(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field846++;
        if (this.field854) {
            return;
        }
        if (this.field859) {
            this.field859 = false;
            throw new IOException();
        }
        if (this.field837 == null) {
            this.field837 = new byte[5000];
        }
        synchronized (this) {
            if (arg3 <= 125) {
                this.field837 = null;
            }
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field837[this.field855] = arg2[arg1 + var6];
                this.field855 = (this.field855 + 1) % 5000;
                if ((this.field838 + 4900) % 5000 == this.field855) {
                    throw new IOException();
                }
            }
            if (this.field849 == null) {
                this.field849 = this.field841.method2564(-125, 3, this);
            }
            this.notifyAll();
        }
    }
}
