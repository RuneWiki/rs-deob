import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class87 implements Runnable {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    private int field1627 = 0;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    private int field1637 = 0;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "Z")
    private boolean field1638 = false;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "Z")
    private boolean field1648 = false;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "Ljava/net/Socket;")
    private Socket field1642;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "Lte;")
    private class124 field1629;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "Ljava/io/InputStream;")
    private InputStream field1649;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1644;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "[I")
    public static int[] field1639 = new int[4096];

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "Z")
    public static boolean field1651;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "[I")
    public static int[] field1652;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "C")
    public static char field1654;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "Lh;")
    private class107 field1634;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "[B")
    private byte[] field1633;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI[BI)V", line = 5)
    public final void method605(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1632++;
        if (this.field1648) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field1649.read(arg2, arg1, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg3 -= var5;
        }
        if (arg0 >= -17) {
            method614(14, -45, 26, (byte) 28, 77);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 31)
    public static void method606(byte arg0) {
        field1652 = null;
        field1639 = null;
        int var1 = 127 % ((arg0 + 44) / 47);
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/net/Socket;Lte;)V", line = 425)
    public class87(Socket arg0, class124 arg1) throws IOException {
        this.field1642 = arg0;
        this.field1629 = arg1;
        this.field1642.setSoTimeout(30000);
        this.field1642.setTcpNoDelay(true);
        this.field1649 = this.field1642.getInputStream();
        this.field1644 = this.field1642.getOutputStream();
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V", line = 46)
    public final void method607(byte arg0) {
        field1643++;
        if (this.field1648) {
            return;
        }
        if (arg0 != -76) {
            field1652 = (int[]) null;
        }
        synchronized (this) {
            this.field1648 = true;
            this.notifyAll();
        }
        if (this.field1634 != null) {
            while (this.field1634.field1852 == 0) {
                class127.method843(-59, 1L);
            }
            if (this.field1634.field1852 == 1) {
                try {
                    ((Thread) this.field1634.field1853).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field1634 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)I", line = 90)
    public final int method608(int arg0) throws IOException {
        if (arg0 >= -47) {
            return 119;
        } else {
            field1631++;
            return this.field1648 ? 0 : this.field1649.available();
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)Lcg;", line = 108)
    public static final class8 method609(int arg0, byte arg1) {
        class8 var2 = (class8) class157.field2550.method1881(true, (long) arg0);
        if (arg1 <= 27) {
            method609(42, (byte) 39);
        }
        field1645++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class166.field2679.method2036(class266.method1768(arg0, -39), class169.method1070(true, arg0), (byte) 35);
        class8 var4 = new class8();
        var4.field175 = arg0;
        if (var3 != null) {
            var4.method66(-121, new class202(var3));
        }
        class157.field2550.method1880(var4, (long) arg0, 88);
        return var4;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 139)
    public static final boolean method610(int arg0, String arg1) {
        field1635++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class274.field4197; var2++) {
            if (arg1.equalsIgnoreCase(class296.field4509[var2])) {
                return true;
            }
        }
        if (arg1.equalsIgnoreCase(class66.field1265.field4269)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ql", name = "run", descriptor = "()V", line = 170)
    public final void run() {
        field1630++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field1637 == this.field1627) {
                        if (this.field1648) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    if (this.field1627 <= this.field1637) {
                        var3 = this.field1637 - this.field1627;
                    } else {
                        var3 = 5000 - this.field1627;
                    }
                    var4 = this.field1627;
                }
                if (var3 > 0) {
                    try {
                        this.field1644.write(this.field1633, var4, var3);
                    } catch (IOException var12) {
                        this.field1638 = true;
                    }
                    this.field1627 = (this.field1627 + var3) % 5000;
                    try {
                        if (this.field1637 == this.field1627) {
                            this.field1644.flush();
                        }
                    } catch (IOException var11) {
                        this.field1638 = true;
                    }
                }
            }
            try {
                if (this.field1649 != null) {
                    this.field1649.close();
                }
                if (this.field1644 != null) {
                    this.field1644.close();
                }
                if (this.field1642 != null) {
                    this.field1642.close();
                }
            } catch (IOException var10) {
            }
            this.field1633 = null;
        } catch (Exception var15) {
            class106.method694(var15, (String) null, (byte) -84);
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(BI[BI)V", line = 241)
    public final void method611(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1641++;
        if (this.field1648) {
            return;
        }
        if (this.field1638) {
            this.field1638 = false;
            throw new IOException();
        }
        if (this.field1633 == null) {
            this.field1633 = new byte[5000];
        }
        if (arg0 != 60) {
            return;
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field1633[this.field1637] = arg2[arg1 + var6];
                this.field1637 = (this.field1637 + 1) % 5000;
                if ((this.field1627 + 4900) % 5000 == this.field1637) {
                    throw new IOException();
                }
            }
            if (this.field1634 == null) {
                this.field1634 = this.field1629.method802(3, 100, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V", line = 290)
    public final void method612(int arg0) {
        if (arg0 != 5000) {
            method609(15, (byte) -107);
        }
        field1640++;
        if (!this.field1648) {
            this.field1649 = new class104();
            this.field1644 = new class30();
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V", line = 309)
    public final void method613(int arg0) throws IOException {
        field1650++;
        if (this.field1648) {
            return;
        }
        if (this.field1638) {
            this.field1638 = false;
            throw new IOException();
        } else if (arg0 != -2) {
            this.field1642 = (Socket) null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIBI)V", line = 331)
    public static final void method614(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class59.field1162 = arg0;
        field1647++;
        class186.field3028 = arg2;
        if (arg3 != -127) {
            method615(-96, 96);
        }
        class147.field2416 = arg4;
        class259.field4024 = arg1;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Lrn;", line = 346)
    public static final class294 method615(int arg0, int arg1) {
        field1653++;
        if (arg0 != 0) {
            method609(112, (byte) -81);
        }
        class294 var2 = (class294) class200.field3198.method1881(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class294 var3 = class26.method218(class94.field1687, false, 1430232264, class15.field276, arg1);
        if (var3 != null) {
            class200.field3198.method1880(var3, (long) arg1, 66);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)I", line = 369)
    public final int method616(byte arg0) throws IOException {
        if (arg0 >= -23) {
            field1639 = (int[]) null;
        }
        field1636++;
        return this.field1648 ? 0 : this.field1649.read();
    }

    @OriginalMember(owner = "client!ql", name = "finalize", descriptor = "()V", line = 388)
    protected final void finalize() {
        this.method607((byte) -76);
        field1628++;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1639[var0] = class112.method721((byte) 112, var0);
        }
        field1651 = true;
        field1652 = new int[4096];
    }
}
