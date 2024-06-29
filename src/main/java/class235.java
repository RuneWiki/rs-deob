import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class235 implements Runnable {

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "I")
    private int field3030 = 0;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "I")
    private int field3032 = 0;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3028;

    @OriginalMember(owner = "client!pfa", name = "n", descriptor = "I")
    private int field3040;

    @OriginalMember(owner = "client!pfa", name = "l", descriptor = "[B")
    private byte[] field3038;

    @OriginalMember(owner = "client!pfa", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field3036;

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "Lvv;")
    public static class442 field3034 = new class442();

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!pfa", name = "k", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!pfa", name = "m", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "Ljava/io/IOException;")
    private IOException field3027;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIB[B)V")
    public final void method1473(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field3033++;
        if (arg1 < 0 || arg0 < 0 || (arg0 + arg1) > arg3.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3027 != null) {
                throw new IOException(this.field3027.toString());
            }
            int var6;
            if (this.field3030 > this.field3032) {
                var6 = this.field3030 - this.field3032 - 1;
            } else {
                var6 = this.field3030 + this.field3040 - this.field3032 - 1;
            }
            if (arg2 < 62) {
                this.field3027 = null;
            }
            if (arg1 > var6) {
                throw new IOException("");
            }
            if (this.field3040 >= (this.field3032 + arg1)) {
                class617.method3389(arg3, arg0, this.field3038, this.field3032, arg1);
            } else {
                int var7 = this.field3040 - this.field3032;
                class617.method3389(arg3, arg0, this.field3038, this.field3032, var7);
                class617.method3389(arg3, arg0 + var7, this.field3038, 0, arg1 - var7);
            }
            this.field3032 = (this.field3032 + arg1) % this.field3040;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Z)V")
    public final void method1474(boolean arg0) {
        field3029++;
        this.field3028 = new class606();
        if (arg0) {
            this.field3032 = 10;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V")
    public static void method1475(byte arg0) {
        field3034 = null;
        int var1 = -77 % ((57 - arg0) / 46);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZIIIILkha;I)V")
    public static final void method1476(boolean arg0, int arg1, int arg2, int arg3, int arg4, class687 arg5, int arg6) {
        if (arg6 < arg3) {
            class379.field5303 = arg5;
            class244.field3142 = 1;
            class130.field1562 = arg1;
            class55.field799 = null;
            class74.field991 = arg2;
            class98.field1225 = arg4;
            class646.field8905 = arg0;
            class714.field10062 = class106.field1297.method3685((byte) -12) / arg3;
            if (class714.field10062 < 1) {
                class714.field10062 = 1;
            }
        } else {
            class454.method2665(arg5, false, arg2, arg0, arg1, arg4);
        }
        field3037++;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V")
    public final void method1477(int arg0) {
        synchronized (this) {
            if (this.field3027 == null) {
                this.field3027 = new IOException("");
            }
            this.notifyAll();
        }
        field3031++;
        try {
            this.field3036.join();
            if (arg0 != 1) {
                method1476(false, 4, 21, 118, 52, null, -53);
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!pfa", name = "run", descriptor = "()V")
    public final void run() {
        field3039++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3027 != null) {
                        return;
                    }
                    if (this.field3032 < this.field3030) {
                        var2 = this.field3040 + this.field3032 - this.field3030;
                    } else {
                        var2 = this.field3032 - this.field3030;
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
                if (this.field3030 + var2 > this.field3040) {
                    int var3 = this.field3040 - this.field3030;
                    this.field3028.write(this.field3038, this.field3030, var3);
                    this.field3028.write(this.field3038, 0, var2 - var3);
                } else {
                    this.field3028.write(this.field3038, this.field3030, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field3027 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field3030 = (this.field3030 + var2) % this.field3040;
            }
        }
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class235(OutputStream arg0, int arg1) {
        this.field3028 = arg0;
        this.field3040 = arg1 + 1;
        this.field3038 = new byte[this.field3040];
        this.field3036 = new Thread(this);
        this.field3036.setDaemon(true);
        this.field3036.start();
    }
}
