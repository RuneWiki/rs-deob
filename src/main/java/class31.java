import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class31 implements Runnable {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    private int field648 = 0;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    private int field662 = 0;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "Z")
    private boolean field672 = false;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Z")
    private boolean field657 = false;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Lof;")
    private class254 field658;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "Ljava/net/Socket;")
    private Socket field666;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Ljava/io/InputStream;")
    private InputStream field664;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field669;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Z")
    public static boolean field647 = true;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Z")
    public static boolean field651 = false;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "Ljd;")
    public static class86 field668 = class122.method868("::clientdrop", true);

    @OriginalMember(owner = "client!na", name = "s", descriptor = "[I")
    public static int[] field665 = new int[100];

    @OriginalMember(owner = "client!na", name = "y", descriptor = "Ljd;")
    public static class86 field671 = class122.method868("blinken2:", true);

    @OriginalMember(owner = "client!na", name = "q", descriptor = "Ljd;")
    public static class86 field663 = class122.method868("Lade Schrifts-=tze )2 ", true);

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lwb;")
    private class26 field650;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "[B")
    private byte[] field652;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static void method203(byte arg0) {
        if (arg0 < 55) {
            field663 = null;
        }
        field663 = null;
        field671 = null;
        field665 = null;
        field668 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)I")
    public final int method204(int arg0) throws IOException {
        if (arg0 != -30290) {
            this.run();
        }
        field655++;
        return this.field657 ? 0 : this.field664.read();
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BILbj;I)[Lod;")
    public static final class90[] method205(byte arg0, int arg1, class151 arg2, int arg3) {
        field659++;
        if (arg0 < 55) {
            field651 = false;
        }
        return class163.method1181(arg2, arg1, 10475, arg3) ? class165.method1192(255) : null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)V")
    public static final void method206(int arg0, boolean arg1) {
        field656++;
        if (class129.field2470 != arg1 && arg0 < -49) {
            class129.field2470 = arg1;
            class67.method474(false);
        }
    }

    @OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method207((byte) 122);
        field653++;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public final void method207(byte arg0) {
        field667++;
        if (this.field657) {
            return;
        }
        synchronized (this) {
            if (arg0 <= 98) {
                this.field664 = null;
            }
            this.field657 = true;
            this.notifyAll();
        }
        if (this.field650 != null) {
            while (this.field650.field613 == 0) {
                class91.method677(0, 1L);
            }
            if (this.field650.field613 == 1) {
                try {
                    ((Thread) this.field650.field611).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field650 = null;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)I")
    public final int method208(int arg0) throws IOException {
        field649++;
        if (this.field657) {
            return 0;
        } else {
            if (arg0 != -11084) {
                this.field650 = null;
            }
            return this.field664.available();
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([BIII)V")
    public final void method209(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field661++;
        if (this.field657) {
            return;
        }
        if (this.field672) {
            this.field672 = false;
            throw new IOException();
        }
        if (this.field652 == null) {
            this.field652 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field652[this.field648] = arg0[arg3 + var6];
                this.field648 = (this.field648 + 1) % 5000;
                if (((this.field662 + 4900) % 5000) == this.field648) {
                    throw new IOException();
                }
            }
            if (arg1 != 4900) {
                method203((byte) 76);
            }
            if (this.field650 == null) {
                this.field650 = this.field658.method1724(true, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!na", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field662 == this.field648) {
                            if (this.field657) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field662;
                        if (this.field662 > this.field648) {
                            var3 = 5000 - this.field662;
                        } else {
                            var3 = this.field648 - this.field662;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field669.write(this.field652, var2, var3);
                    } catch (IOException var9) {
                        this.field672 = true;
                    }
                    this.field662 = (this.field662 + var3) % 5000;
                    try {
                        if (this.field662 == this.field648) {
                            this.field669.flush();
                        }
                    } catch (IOException var8) {
                        this.field672 = true;
                    }
                    continue;
                }
                try {
                    if (this.field664 != null) {
                        this.field664.close();
                    }
                    if (this.field669 != null) {
                        this.field669.close();
                    }
                    if (this.field666 != null) {
                        this.field666.close();
                    }
                } catch (IOException var7) {
                }
                this.field652 = null;
                break;
            }
        } catch (Exception var12) {
            class143.method1018(var12, (String) null, 73);
        }
        field654++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([BBII)V")
    public final void method210(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field670++;
        if (this.field657) {
            return;
        }
        int var5 = -68 / ((-arg1 - 35) / 35);
        while (arg3 > 0) {
            int var6 = this.field664.read(arg0, arg2, arg3);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg3 -= var6;
            arg2 += var6;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Ljava/net/Socket;Lof;)V")
    public class31(Socket arg0, class254 arg1) throws IOException {
        this.field658 = arg1;
        this.field666 = arg0;
        this.field666.setSoTimeout(30000);
        this.field666.setTcpNoDelay(true);
        this.field664 = this.field666.getInputStream();
        this.field669 = this.field666.getOutputStream();
    }
}
