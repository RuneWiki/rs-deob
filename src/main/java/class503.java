import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class503 implements Runnable {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    private int field6805 = 0;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    private int field6819 = 0;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field6809;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    private int field6817;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "[B")
    private byte[] field6807;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field6812;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "[I")
    public static int[] field6815 = new int[5];

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Ljava/io/IOException;")
    private IOException field6814;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public final void method2844(int arg0) {
        field6813++;
        synchronized (this) {
            if (arg0 != -1) {
                this.method2844(122);
            }
            if (this.field6814 == null) {
                this.field6814 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field6812.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    public static void method2845(int arg0) {
        field6815 = null;
        int var1 = 25 / ((-arg0 - 3) / 37);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public final void method2846(byte arg0) {
        this.field6809 = new class611();
        int var2 = -117 / ((74 - arg0) / 45);
        field6810++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I")
    public static final int method2847(int arg0, int arg1) {
        int var2 = 57 / ((75 - arg0) / 50);
        field6818++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
    public static final void method2848(byte arg0) {
        field6808++;
        for (int var1 = 0; var1 < 100; var1++) {
            class286.field3868[var1] = null;
        }
        int var2 = 72 / ((-arg0 - 38) / 39);
        class205.field2685 = 0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)V")
    public static final void method2849(int arg0, int arg1, int arg2, int arg3) {
        field6806++;
        int var4 = class72.field935.field6528 * arg3 >> 8;
        if (~arg1 == arg0 && !class677.field9606) {
            class201.method1270(-128);
        } else if (arg1 != -1 && (class133.field1688 != arg1 || !class242.method1488(-1799947892)) && var4 != 0 && !class677.field9606) {
            class641.method3534(false, arg1, var4, 0, arg2, false, class328.field4812);
        }
        class133.field1688 = arg1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([BIBI)V")
    public final void method2850(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field6816++;
        if (arg1 < 0 || arg3 < 0 || arg0.length < arg1 + arg3) {
            throw new IOException();
        }
        synchronized (this) {
            int var6 = -104 / ((-arg2 - 73) / 38);
            if (this.field6814 != null) {
                throw new IOException(this.field6814.toString());
            }
            int var7;
            if (this.field6819 > this.field6805) {
                var7 = this.field6819 - this.field6805 - 1;
            } else {
                var7 = this.field6817 - this.field6805 - (-this.field6819 - -1);
            }
            if (var7 < arg1) {
                throw new IOException("");
            }
            if (this.field6817 >= this.field6805 + arg1) {
                class657.method3639(arg0, arg3, this.field6807, this.field6805, arg1);
            } else {
                int var8 = this.field6817 - this.field6805;
                class657.method3639(arg0, arg3, this.field6807, this.field6805, var8);
                class657.method3639(arg0, arg3 + var8, this.field6807, 0, arg1 - var8);
            }
            this.field6805 = (this.field6805 + arg1) % this.field6817;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ae", name = "run", descriptor = "()V")
    public final void run() {
        field6811++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field6814 != null) {
                        return;
                    }
                    if (this.field6819 <= this.field6805) {
                        var2 = this.field6805 - this.field6819;
                    } else {
                        var2 = this.field6817 + this.field6805 - this.field6819;
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
                if (this.field6817 >= this.field6819 + var2) {
                    this.field6809.write(this.field6807, this.field6819, var2);
                } else {
                    int var3 = this.field6817 - this.field6819;
                    this.field6809.write(this.field6807, this.field6819, var3);
                    this.field6809.write(this.field6807, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field6814 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field6819 = (this.field6819 + var2) % this.field6817;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class503(OutputStream arg0, int arg1) {
        this.field6809 = arg0;
        this.field6817 = arg1 + 1;
        this.field6807 = new byte[this.field6817];
        this.field6812 = new Thread(this);
        this.field6812.setDaemon(true);
        this.field6812.start();
    }
}
