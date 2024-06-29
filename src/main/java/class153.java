import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class153 implements Runnable {

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    private int field1684 = 0;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    private int field1685 = 0;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1681;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    private int field1675;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "[B")
    private byte[] field1674;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field1686;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1677 = 104;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1678 = 0;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "Lpfa;")
    public static class295 field1688 = new class295(8);

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Ljava/io/IOException;")
    private IOException field1683;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "[Lhu;")
    public static class131[] field1689;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[BIB)V", line = 6)
    public final void method937(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field1682++;
        if (arg0 < 0 || arg2 < 0 || arg2 + arg0 > arg1.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field1683 != null) {
                throw new IOException(this.field1683.toString());
            }
            if (arg3 != 127) {
                this.field1683 = null;
            }
            int var6;
            if (this.field1684 >= this.field1685) {
                var6 = this.field1675 + this.field1685 - this.field1684 - 1;
            } else {
                var6 = this.field1685 - this.field1684 - 1;
            }
            if (var6 < arg0) {
                throw new IOException("");
            }
            if (this.field1684 + arg0 <= this.field1675) {
                class143.method894(arg1, arg2, this.field1674, this.field1684, arg0);
            } else {
                int var7 = this.field1675 - this.field1684;
                class143.method894(arg1, arg2, this.field1674, this.field1684, var7);
                class143.method894(arg1, arg2 + var7, this.field1674, 0, arg0 - var7);
            }
            this.field1684 = (this.field1684 + arg0) % this.field1675;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILpk;)V", line = 48)
    public static final void method938(int arg0, class197 arg1) {
        field1680++;
        if (arg0 != 8) {
            method938(-10, null);
        }
        for (class376 var2 = (class376) class375.field4815.method1719(65280); var2 != null; var2 = (class376) class375.field4815.method1723(-20665)) {
            if (var2.field4850 == arg1) {
                if (var2.field4859 != null) {
                    class597.field8470.method1690(var2.field4859);
                    var2.field4859 = null;
                }
                var2.method864(12983);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 82)
    public final void method939(byte arg0) {
        this.field1681 = new class248();
        field1676++;
        if (arg0 != 105) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!ib", name = "run", descriptor = "()V", line = 98)
    public final void run() {
        field1679++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1683 != null) {
                        return;
                    }
                    if (this.field1684 >= this.field1685) {
                        var2 = this.field1684 - this.field1685;
                    } else {
                        var2 = this.field1684 + this.field1675 - this.field1685;
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
                if (this.field1675 >= this.field1685 + var2) {
                    this.field1681.write(this.field1674, this.field1685, var2);
                } else {
                    int var3 = this.field1675 - this.field1685;
                    this.field1681.write(this.field1674, this.field1685, var3);
                    this.field1681.write(this.field1674, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field1683 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field1685 = (this.field1685 + var2) % this.field1675;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V", line = 165)
    public final void method940(byte arg0) {
        synchronized (this) {
            if (this.field1683 == null) {
                this.field1683 = new IOException("");
            }
            this.notifyAll();
        }
        field1687++;
        try {
            this.field1686.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 != -23) {
            method938(118, null);
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 209)
    public class153(OutputStream arg0, int arg1) {
        this.field1681 = arg0;
        this.field1675 = arg1 + 1;
        this.field1674 = new byte[this.field1675];
        this.field1686 = new Thread(this);
        this.field1686.setDaemon(true);
        this.field1686.start();
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 196)
    public static void method941(int arg0) {
        if (arg0 == 8) {
            field1688 = null;
            field1689 = null;
        }
    }
}
