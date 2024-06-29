import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class87 implements Runnable {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Z")
    private boolean field1687 = false;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    private int field1694 = 0;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    private int field1697 = 0;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Z")
    private boolean field1692 = false;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lrf;")
    private class160 field1696;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field1700;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Ljava/io/InputStream;")
    private InputStream field1704;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1701;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field1705 = -1;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Lpe;")
    private class141 field1689;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "[B")
    private byte[] field1703;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static final void method521(int arg0) {
        field1686++;
        if (!class193.field3763) {
            return;
        }
        class60.field1229 = null;
        class49.field1001 = null;
        class145.field2973 = null;
        class182.field3604 = null;
        class142.field2942 = null;
        class154.field3136 = null;
        class40.field755 = null;
        class29.field537 = null;
        class174.field3471 = null;
        class35.field645 = null;
        class174.field3465 = null;
        class76.field1522 = null;
        class191.field3725 = null;
        class64.field1307 = null;
        class7.field134 = null;
        class47.field953 = null;
        class17.field288 = null;
        class83.field1639 = null;
        class59.field1225 = null;
        class102.field1946 = null;
        class50.field1017 = null;
        class29.field540 = null;
        if (arg0 != 28148) {
            field1691 = 4;
        }
        class205.method1318((byte) -102, 2);
        class74.method460((byte) -98, true);
        class193.field3763 = false;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public final void method522(int arg0) {
        field1688++;
        if (this.field1687) {
            return;
        }
        synchronized (this) {
            this.field1687 = true;
            this.notifyAll();
            if (arg0 != -23002) {
                this.field1701 = null;
            }
        }
        if (this.field1689 != null) {
            while (this.field1689.field2927 == 0) {
                class38.method209(1L, -7296);
            }
            if (this.field1689.field2927 == 1) {
                try {
                    ((Thread) this.field1689.field2930).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1689 = null;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)I")
    public final int method523(int arg0) throws IOException {
        field1699++;
        int var2 = -107 / ((arg0 - 63) / 58);
        return this.field1687 ? 0 : this.field1704.available();
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([BIBI)V")
    public final void method524(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field1693++;
        if (this.field1687) {
            return;
        }
        if (this.field1692) {
            this.field1692 = false;
            throw new IOException();
        }
        if (this.field1703 == null) {
            this.field1703 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            while (true) {
                if (arg1 <= var6) {
                    if (this.field1689 == null) {
                        this.field1689 = this.field1696.method1011(-9054, this, 3);
                    }
                    this.notifyAll();
                    break;
                }
                this.field1703[this.field1697] = arg0[arg3 + var6];
                this.field1697 = (this.field1697 + 1) % 5000;
                if ((this.field1694 + 4900) % 5000 == this.field1697) {
                    throw new IOException();
                }
                var6++;
            }
        }
        int var7 = -100 % ((-arg2 - 2) / 45);
    }

    @OriginalMember(owner = "client!je", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field1697 == this.field1694) {
                            if (this.field1687) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field1697 >= this.field1694) {
                            var2 = this.field1697 - this.field1694;
                        } else {
                            var2 = 5000 - this.field1694;
                        }
                        var3 = this.field1694;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field1701.write(this.field1703, var3, var2);
                    } catch (IOException var9) {
                        this.field1692 = true;
                    }
                    this.field1694 = (this.field1694 + var2) % 5000;
                    try {
                        if (this.field1697 == this.field1694) {
                            this.field1701.flush();
                        }
                    } catch (IOException var8) {
                        this.field1692 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1704 != null) {
                        this.field1704.close();
                    }
                    if (this.field1701 != null) {
                        this.field1701.close();
                    }
                    if (this.field1700 != null) {
                        this.field1700.close();
                    }
                } catch (IOException var7) {
                }
                this.field1703 = null;
                break;
            }
        } catch (Exception var12) {
            class171.method1086(null, -2929, var12);
        }
        field1707++;
    }

    @OriginalMember(owner = "client!je", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method522(-23002);
        field1698++;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)I")
    public final int method525(int arg0) throws IOException {
        if (arg0 != -12000) {
            this.run();
        }
        field1695++;
        return this.field1687 ? 0 : this.field1704.read();
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IBI[B)V")
    public final void method526(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field1706++;
        if (arg1 != 103) {
            method521(2);
        }
        if (this.field1687) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field1704.read(arg3, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Ljava/net/Socket;Lrf;)V")
    public class87(Socket arg0, class160 arg1) throws IOException {
        this.field1696 = arg1;
        this.field1700 = arg0;
        this.field1700.setSoTimeout(30000);
        this.field1700.setTcpNoDelay(true);
        this.field1704 = this.field1700.getInputStream();
        this.field1701 = this.field1700.getOutputStream();
    }
}
