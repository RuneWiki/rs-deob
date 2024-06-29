import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class160 implements Runnable {

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    private int field1786 = 0;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    private int field1790 = 0;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1791;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    private int field1795;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "[B")
    private byte[] field1793;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field1792;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lvfa;")
    public static class266 field1788;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Ljava/io/IOException;")
    private IOException field1794;

    @OriginalMember(owner = "client!db", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        field1787++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1794 != null) {
                        return;
                    }
                    if (this.field1786 >= this.field1790) {
                        var2 = this.field1786 - this.field1790;
                    } else {
                        var2 = this.field1795 + this.field1786 - this.field1790;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                if (this.field1795 >= this.field1790 + var2) {
                    this.field1791.write(this.field1793, this.field1790, var2);
                } else {
                    int var3 = this.field1795 - this.field1790;
                    this.field1791.write(this.field1793, this.field1790, var3);
                    this.field1791.write(this.field1793, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field1794 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field1790 = (this.field1790 + var2) % this.field1795;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 65)
    public static final void method869(byte arg0) throws IOException {
        if (arg0 > -78) {
            method871(83);
        }
        if (class99.field1061 != null && class530.field7470 > 0) {
            int var1 = 0;
            while (true) {
                class653 var2 = (class653) class359.field4830.method3434((byte) 2);
                if (var2 == null) {
                    class79.field808 = 0;
                    class240.field2974 += var1;
                    break;
                }
                class99.field1061.method1507(-6768, 0, var2.field9157, var2.field9158.field1269);
                var1 += var2.field9157;
                class530.field7470 -= var2.field9157;
                var2.method1922(99);
                var2.field9158.method625((byte) 83);
                var2.method3636((byte) -87);
            }
        }
        field1789++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II[BI)V", line = 100)
    public final void method870(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1785++;
        if (arg3 < 0 || arg1 < 0 || (arg1 + arg3) > arg2.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field1794 != null) {
                throw new IOException(this.field1794.toString());
            }
            int var6;
            if (this.field1790 <= this.field1786) {
                var6 = this.field1795 + this.field1790 - this.field1786 - 1;
            } else {
                var6 = this.field1790 - this.field1786 - 1;
            }
            if (arg3 > var6) {
                throw new IOException("");
            }
            if (this.field1786 + arg3 > this.field1795) {
                int var7 = this.field1795 - this.field1786;
                class567.method3213(arg2, arg1, this.field1793, this.field1786, var7);
                class567.method3213(arg2, arg1 + var7, this.field1793, 0, arg3 - var7);
            } else {
                class567.method3213(arg2, arg1, this.field1793, this.field1786, arg3);
            }
            this.field1786 = (this.field1786 + arg3) % this.field1795;
            if (arg0 <= -108) {
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 146)
    public static final void method871(int arg0) {
        field1796++;
        class310.field3831.method88(119);
        int var1 = 45 % ((75 - arg0) / 50);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 162)
    public final void method872(int arg0) {
        if (arg0 <= 3) {
            return;
        }
        field1784++;
        synchronized (this) {
            if (this.field1794 == null) {
                this.field1794 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field1792.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 199)
    public class160(OutputStream arg0, int arg1) {
        this.field1791 = arg0;
        this.field1795 = arg1 + 1;
        this.field1793 = new byte[this.field1795];
        this.field1792 = new Thread(this);
        this.field1792.setDaemon(true);
        this.field1792.start();
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V", line = 189)
    public final void method873(boolean arg0) {
        this.field1791 = new class516();
        field1797++;
        if (arg0) {
            method871(52);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V", line = 214)
    public static void method874(boolean arg0) {
        if (!arg0) {
            method871(-73);
        }
        field1788 = null;
    }
}
