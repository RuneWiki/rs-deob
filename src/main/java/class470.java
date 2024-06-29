import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class470 implements Runnable {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    private int field6754 = 0;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    private int field6759 = 0;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    private int field6766;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Ljava/io/InputStream;")
    private InputStream field6757;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "[B")
    private byte[] field6762;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field6751;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "[I")
    public static int[] field6760 = new int[32];

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Lew;")
    public static class226 field6765;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Lmv;")
    public static class295 field6758;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Ljava/io/IOException;")
    private IOException field6752;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field6760[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 3)
    public final void method2707(int arg0) {
        if (arg0 != 31355) {
            method2709(45);
        }
        field6763++;
        this.field6757 = new class694();
    }

    @OriginalMember(owner = "client!le", name = "run", descriptor = "()V", line = 14)
    public final void run() {
        field6764++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field6752 != null) {
                        return;
                    }
                    if (this.field6759 == 0) {
                        var2 = this.field6766 - this.field6754 - 1;
                    } else if (this.field6754 <= this.field6759) {
                        var2 = this.field6759 - this.field6754 - 1;
                    } else {
                        var2 = this.field6766 - this.field6754;
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
            int var3;
            try {
                var3 = this.field6757.read(this.field6762, this.field6754, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field6752 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field6754 = (this.field6754 + var3) % this.field6766;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 71)
    public final void method2708(byte arg0) {
        synchronized (this) {
            if (this.field6752 == null) {
                this.field6752 = new IOException("");
            }
            this.notifyAll();
        }
        field6755++;
        try {
            if (arg0 > -103) {
                method2709(-28);
            }
            this.field6751.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 93)
    public static final void method2709(int arg0) {
        field6753++;
        if (arg0 >= -49) {
            return;
        }
        try {
            if (class177.field2475 == 1) {
                int var1 = class416.field6148.method3552(51);
                if (var1 > 0 && class416.field6148.method3536((byte) -112)) {
                    int var2 = var1 - class71.field1103;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class416.field6148.method3545(var2, (byte) 122);
                    return;
                }
                class416.field6148.method3543((byte) -63);
                class416.field6148.method3554(10);
                if (class634.field9148 == null) {
                    class177.field2475 = 0;
                } else {
                    class177.field2475 = 2;
                }
                class48.field766 = null;
                class39.field584 = null;
            }
            if (class177.field2475 == 3) {
                int var3 = class416.field6148.method3552(117);
                if (class20.field381 > var3 && class416.field6148.method3536((byte) -112)) {
                    int var4 = class658.field9403 + var3;
                    if (class20.field381 < var4) {
                        var4 = class20.field381;
                    }
                    class416.field6148.method3545(var4, (byte) 116);
                } else {
                    class177.field2475 = 0;
                    class658.field9403 = 0;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class416.field6148.method3543((byte) 121);
            class258.field3346 = null;
            class177.field2475 = 0;
            class634.field9148 = null;
            class48.field766 = null;
            class39.field584 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Z", line = 159)
    public final boolean method2710(int arg0, int arg1) throws IOException {
        field6756++;
        if (arg0 <= 0 || arg0 >= this.field6766) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field6754 < this.field6759) {
                var4 = this.field6766 + this.field6754 - this.field6759;
            } else {
                var4 = this.field6754 - this.field6759;
            }
            if (arg0 <= var4) {
                int var6 = 93 % ((arg1 - 4) / 39);
                return true;
            } else if (this.field6752 == null) {
                return false;
            } else {
                throw new IOException(this.field6752.toString());
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 276)
    public class470(InputStream arg0, int arg1) {
        this.field6766 = arg1 + 1;
        this.field6757 = arg0;
        this.field6762 = new byte[this.field6766];
        this.field6751 = new Thread(this);
        this.field6751.setDaemon(true);
        this.field6751.start();
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 195)
    public static void method2711(int arg0) {
        field6758 = null;
        field6760 = null;
        field6765 = null;
        int var1 = -24 / ((-arg0 - 76) / 39);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I[BII)I", line = 206)
    public final int method2712(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field6761++;
        if (arg2 < 0 || arg3 < 0 || arg2 + arg3 > arg1.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field6759 <= this.field6754) {
                var6 = this.field6754 - this.field6759;
            } else {
                var6 = this.field6766 - (this.field6759 - this.field6754);
            }
            if (var6 < arg2) {
                arg2 = var6;
            }
            if (arg0 == arg2 && this.field6752 != null) {
                throw new IOException(this.field6752.toString());
            }
            if (this.field6759 + arg2 <= this.field6766) {
                class667.method3739(this.field6762, this.field6759, arg1, arg3, arg2);
            } else {
                int var7 = this.field6766 - this.field6759;
                class667.method3739(this.field6762, this.field6759, arg1, arg3, var7);
                class667.method3739(this.field6762, 0, arg1, arg3 + var7, -var7 + arg2);
            }
            this.field6759 = (this.field6759 + arg2) % this.field6766;
            this.notifyAll();
            return arg2;
        }
    }
}
