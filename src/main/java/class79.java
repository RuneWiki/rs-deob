import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class79 implements Runnable {

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Z")
    private boolean field1779 = false;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Z")
    private boolean field1783 = false;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    private int field1795 = 0;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    private int field1799 = 0;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Lqd;")
    private class99 field1788;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "Ljava/net/Socket;")
    private Socket field1801;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Ljava/io/InputStream;")
    private InputStream field1780;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1787;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Llc;")
    public static class69 field1785 = class69.method470((byte) -123, "Icons redrawn");

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field1782 = 0;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field1792 = 0;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "J")
    public static long field1793 = 0L;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "Z")
    public static boolean field1798 = false;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field1796 = 0;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "Llc;")
    public static class69 field1797 = class69.method470((byte) -102, " x");

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Lua;")
    private class116 field1789;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "[B")
    private byte[] field1778;

    @OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1776++;
        this.method564(1);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II[BI)V")
    public final void method562(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1791++;
        if (this.field1783) {
            return;
        }
        if (arg1 != 5000) {
            field1796 = -108;
        }
        if (this.field1779) {
            this.field1779 = false;
            throw new IOException();
        }
        if (this.field1778 == null) {
            this.field1778 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field1778[this.field1795] = arg2[arg3 + var6];
                this.field1795 = (this.field1795 + 1) % 5000;
                if ((this.field1799 + 4900) % 5000 == this.field1795) {
                    throw new IOException();
                }
            }
            if (this.field1789 == null) {
                this.field1789 = this.field1788.method751(3, this, 91);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILda;I)V")
    public static final void method563(int arg0, int arg1, class20 arg2, int arg3) {
        field1777++;
        if (arg2 == null) {
            return;
        }
        int var4 = class17.field342 + class128.field2757 & 0x7FF;
        int var5 = arg1 * arg1 + arg3 * arg3;
        if (var5 > 6400) {
            return;
        }
        int var6 = class44.field920[var4];
        int var7 = class44.field915[var4];
        int var8 = var7 * 256 / (class70.field1558 + 256);
        int var9 = var6 * 256 / (class70.field1558 + 256);
        int var10 = arg1 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg1 * var8 >> 16;
        if (arg0 != 10191) {
            return;
        }
        if (var5 > 2500) {
            arg2.method136(class81.field1844, var10 + 94 + 4 - arg2.field434 / 2, -var11 + 79 - arg2.field436 / 2);
        } else {
            arg2.method139(var10 + 94 + 4 - arg2.field434 / 2, -(arg2.field436 / 2) + -var11 + -4 + 83);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public final void method564(int arg0) {
        field1794++;
        if (arg0 != 1 || this.field1783) {
            return;
        }
        synchronized (this) {
            this.field1783 = true;
            this.notifyAll();
        }
        if (this.field1789 != null) {
            while (this.field1789.field2504 == 0) {
                class108.method814((byte) 15, 1L);
            }
            if (this.field1789.field2504 == 1) {
                try {
                    ((Thread) this.field1789.field2505).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1789 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)I")
    public final int method565(boolean arg0) throws IOException {
        if (arg0) {
            return 66;
        } else {
            field1781++;
            return this.field1783 ? 0 : this.field1780.available();
        }
    }

    @OriginalMember(owner = "client!na", name = "run", descriptor = "()V")
    public final void run() {
        field1786++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1799 == this.field1795) {
                        if (this.field1783) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field1799 > this.field1795) {
                        var2 = 5000 - this.field1799;
                    } else {
                        var2 = this.field1795 - this.field1799;
                    }
                    var3 = this.field1799;
                }
                if (var2 > 0) {
                    try {
                        this.field1787.write(this.field1778, var3, var2);
                    } catch (IOException var9) {
                        this.field1779 = true;
                    }
                    this.field1799 = (this.field1799 + var2) % 5000;
                    try {
                        if (this.field1799 == this.field1795) {
                            this.field1787.flush();
                        }
                    } catch (IOException var8) {
                        this.field1779 = true;
                    }
                }
            }
            try {
                if (this.field1780 != null) {
                    this.field1780.close();
                }
                if (this.field1787 != null) {
                    this.field1787.close();
                }
                if (this.field1801 != null) {
                    this.field1801.close();
                }
            } catch (IOException var7) {
            }
            this.field1778 = null;
        } catch (Exception var12) {
            class70.method499(null, var12, 40);
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)I")
    public final int method566(int arg0) throws IOException {
        field1800++;
        if (this.field1783) {
            return 0;
        } else {
            if (arg0 >= -42) {
                this.field1788 = null;
            }
            return this.field1780.read();
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIB[B)V")
    public final void method567(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        if (arg2 != -108) {
            this.method564(-91);
        }
        field1790++;
        if (this.field1783) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field1780.read(arg3, arg1, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
    public static void method568(int arg0) {
        field1797 = null;
        if (arg0 != 0) {
            method563(-117, -75, null, 51);
        }
        field1785 = null;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Ljava/net/Socket;Lqd;)V")
    public class79(Socket arg0, class99 arg1) throws IOException {
        this.field1788 = arg1;
        this.field1801 = arg0;
        this.field1801.setSoTimeout(30000);
        this.field1801.setTcpNoDelay(true);
        this.field1780 = this.field1801.getInputStream();
        this.field1787 = this.field1801.getOutputStream();
    }
}
