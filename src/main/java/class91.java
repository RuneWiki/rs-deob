import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class91 implements Runnable {

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    private int field1596 = 0;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Z")
    private boolean field1597 = false;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Z")
    private boolean field1590 = false;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    private int field1604 = 0;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Ljava/net/Socket;")
    private Socket field1602;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lih;")
    private class81 field1598;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Ljava/io/InputStream;")
    private InputStream field1601;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1589;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lai;")
    public static class10 field1591 = class44.method278("Bitte entfernen Sie ", -89);

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Lai;")
    public static class10 field1599 = class44.method278("null", 108);

    @OriginalMember(owner = "client!k", name = "o", descriptor = "Lai;")
    private static class10 field1603 = class44.method278("Login", -70);

    @OriginalMember(owner = "client!k", name = "s", descriptor = "Lai;")
    public static class10 field1607 = field1603;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Lca;")
    private class22 field1605;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "[B")
    private byte[] field1606;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)I")
    public final int method551(boolean arg0) throws IOException {
        field1600++;
        if (this.field1590) {
            return 0;
        } else {
            if (arg0) {
                field1607 = null;
            }
            return this.field1601.available();
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public final void method552(int arg0) {
        field1592++;
        if (arg0 != -5034) {
            this.method552(-41);
        }
        if (this.field1590) {
            return;
        }
        synchronized (this) {
            this.field1590 = true;
            this.notifyAll();
        }
        if (this.field1605 != null) {
            while (this.field1605.field352 == 0) {
                class172.method1130(1L, (byte) -79);
            }
            if (this.field1605.field352 == 1) {
                try {
                    ((Thread) this.field1605.field353).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1605 = null;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)V")
    public static void method553(boolean arg0) {
        field1607 = null;
        field1599 = null;
        field1603 = null;
        field1591 = null;
        if (!arg0) {
            method555(-60, 18);
        }
    }

    @OriginalMember(owner = "client!k", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field1604 == this.field1596) {
                            if (this.field1590) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field1596;
                        if (this.field1604 < this.field1596) {
                            var3 = 5000 - this.field1596;
                        } else {
                            var3 = this.field1604 - this.field1596;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field1589.write(this.field1606, var2, var3);
                    } catch (IOException var9) {
                        this.field1597 = true;
                    }
                    this.field1596 = (this.field1596 + var3) % 5000;
                    try {
                        if (this.field1604 == this.field1596) {
                            this.field1589.flush();
                        }
                    } catch (IOException var8) {
                        this.field1597 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1601 != null) {
                        this.field1601.close();
                    }
                    if (this.field1589 != null) {
                        this.field1589.close();
                    }
                    if (this.field1602 != null) {
                        this.field1602.close();
                    }
                } catch (IOException var7) {
                }
                this.field1606 = null;
                break;
            }
        } catch (Exception var12) {
            class109.method700(var12, null, (byte) -108);
        }
        field1608++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)I")
    public final int method554(byte arg0) throws IOException {
        field1593++;
        if (arg0 != 17) {
            this.run();
        }
        return this.field1590 ? 0 : this.field1601.read();
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Z")
    public static final boolean method555(int arg0, int arg1) {
        field1594++;
        if (arg1 <= 53) {
            method553(true);
        }
        return (arg0 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method552(-5034);
        field1595++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI[BI)V")
    public final void method556(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = -96 % ((arg0 - 48) / 51);
        field1609++;
        if (this.field1590) {
            return;
        }
        while (arg1 > 0) {
            int var6 = this.field1601.read(arg2, arg3, arg1);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg3 += var6;
            arg1 -= var6;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I[BII)V")
    public final void method557(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1610++;
        if (this.field1590) {
            return;
        }
        if (this.field1597) {
            this.field1597 = false;
            throw new IOException();
        }
        if (this.field1606 == null) {
            this.field1606 = new byte[5000];
        }
        if (arg3 < 113) {
            method553(true);
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field1606[this.field1604] = arg1[arg2 + var6];
                this.field1604 = (this.field1604 + 1) % 5000;
                if ((this.field1596 + 4900) % 5000 == this.field1604) {
                    throw new IOException();
                }
            }
            if (this.field1605 == null) {
                this.field1605 = this.field1598.method494(3, this, 122);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/net/Socket;Lih;)V")
    public class91(Socket arg0, class81 arg1) throws IOException {
        this.field1602 = arg0;
        this.field1598 = arg1;
        this.field1602.setSoTimeout(30000);
        this.field1602.setTcpNoDelay(true);
        this.field1601 = this.field1602.getInputStream();
        this.field1589 = this.field1602.getOutputStream();
    }
}
