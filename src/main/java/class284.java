import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class284 implements Runnable {

    @OriginalMember(owner = "client!th", name = "o", descriptor = "Z")
    private boolean field3746 = false;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "Z")
    private boolean field3752 = false;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    private int field3754 = 0;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    private int field3741 = 0;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "Lgba;")
    private class388 field3747;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Ljava/net/Socket;")
    private Socket field3734;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "Ljava/io/InputStream;")
    private InputStream field3757;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3733;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field3732 = 0;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "[I")
    public static int[] field3738 = new int[250];

    @OriginalMember(owner = "client!th", name = "y", descriptor = "Lbr;")
    public static class192 field3756 = new class192("", 15);

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field3759 = 0;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "Lba;")
    private class661 field3758;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "[B")
    private byte[] field3755;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "[I")
    public static int[] field3740;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "[Luh;")
    public static class526[] field3760;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IJZIILga;I)V")
    public static final void method1678(int arg0, long arg1, boolean arg2, int arg3, int arg4, class332 arg5, int arg6) {
        if (arg0 != -6657) {
            method1680(76);
        }
        field3735++;
        class363.method2119(arg6, arg2, 10000, arg1, 115, arg3, arg5, arg4);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public final void method1679(int arg0) {
        field3744++;
        if (this.field3746) {
            return;
        }
        synchronized (this) {
            this.field3746 = true;
            this.notifyAll();
        }
        if (this.field3758 != null) {
            while (this.field3758.field9420 == 0) {
                class588.method3253(0, 1L);
            }
            if (this.field3758.field9420 == 1) {
                try {
                    ((Thread) this.field3758.field9421).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        if (arg0 == 1) {
            this.field3758 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public static void method1680(int arg0) {
        field3740 = null;
        field3760 = null;
        field3756 = null;
        field3738 = null;
        if (arg0 != -22575) {
            method1680(-64);
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
    public static final void method1681(int arg0) {
        field3750++;
        if (arg0 != -23711) {
            field3759 = 98;
        }
        class113.field1441 = 0;
        class366.field4831 = 0;
        class366.field4830 = 0;
        class227.field2945 = 0;
    }

    @OriginalMember(owner = "client!th", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field3743++;
        this.method1679(1);
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
    public final void method1682(int arg0) {
        if (arg0 != -6137) {
            method1685(7);
        }
        field3749++;
        if (!this.field3746) {
            this.field3757 = new class594();
            this.field3733 = new class608();
        }
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)I")
    public final int method1683(int arg0) throws IOException {
        if (arg0 != -31136) {
            this.field3733 = null;
        }
        field3748++;
        return this.field3746 ? 0 : this.field3757.available();
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
    public final void method1684(int arg0) throws IOException {
        field3745++;
        if (arg0 > -62) {
            this.method1679(50);
        }
        if (!this.field3746 && this.field3752) {
            this.field3752 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V")
    public static final void method1685(int arg0) {
        field3739++;
        if (arg0 != 0) {
            field3756 = null;
        }
        if (class576.field7861 == 7) {
            class669.method3801((byte) 108, false);
        } else {
            class602.field8413 = class163.field2346;
            class163.field2346 = null;
            class28.method182(13, arg0 ^ 0x7401);
        }
    }

    @OriginalMember(owner = "client!th", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field3754 == this.field3741) {
                            if (this.field3746) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field3754;
                        if (this.field3754 <= this.field3741) {
                            var3 = this.field3741 - this.field3754;
                        } else {
                            var3 = 5000 - this.field3754;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field3733.write(this.field3755, var2, var3);
                    } catch (IOException var9) {
                        this.field3752 = true;
                    }
                    this.field3754 = (this.field3754 + var3) % 5000;
                    try {
                        if (this.field3754 == this.field3741) {
                            this.field3733.flush();
                        }
                    } catch (IOException var8) {
                        this.field3752 = true;
                    }
                    continue;
                }
                try {
                    if (this.field3757 != null) {
                        this.field3757.close();
                    }
                    if (this.field3733 != null) {
                        this.field3733.close();
                    }
                    if (this.field3734 != null) {
                        this.field3734.close();
                    }
                } catch (IOException var7) {
                }
                this.field3755 = null;
                break;
            }
        } catch (Exception var12) {
            class91.method499(null, var12, (byte) -28);
        }
        field3753++;
    }

    @OriginalMember(owner = "client!th", name = "h", descriptor = "(I)I")
    public final int method1686(int arg0) throws IOException {
        field3737++;
        if (this.field3746) {
            return 0;
        } else if (arg0 == -1912) {
            return this.field3757.read();
        } else {
            return -65;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II[BI)V")
    public final void method1687(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3736++;
        if (arg1 <= 123 || this.field3746) {
            return;
        }
        if (this.field3752) {
            this.field3752 = false;
            throw new IOException();
        }
        if (this.field3755 == null) {
            this.field3755 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field3755[this.field3741] = arg2[arg3 + var6];
                this.field3741 = (this.field3741 + 1) % 5000;
                if ((this.field3754 + 4900) % 5000 == this.field3741) {
                    throw new IOException();
                }
            }
            if (this.field3758 == null) {
                this.field3758 = this.field3747.method2220(this, 3, (byte) 96);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II[BI)V")
    public final void method1688(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3751++;
        if (arg0 != 0) {
            this.method1679(-82);
        }
        if (this.field3746) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field3757.read(arg2, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Ljava/net/Socket;Lgba;)V")
    public class284(Socket arg0, class388 arg1) throws IOException {
        this.field3747 = arg1;
        this.field3734 = arg0;
        this.field3734.setSoTimeout(30000);
        this.field3734.setTcpNoDelay(true);
        this.field3757 = this.field3734.getInputStream();
        this.field3733 = this.field3734.getOutputStream();
    }
}
