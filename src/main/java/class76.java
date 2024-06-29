import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class76 implements Runnable {

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    private int field1126 = 0;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    private int field1139 = 0;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    private int field1136;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1127;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "[B")
    private byte[] field1137;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field1125;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Lqu;")
    public static class219 field1124 = new class219(82, 3);

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field1138 = 0;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "[[S")
    public static short[][] field1134 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field1141 = 0;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Lmu;")
    public static class218 field1130;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "Lpb;")
    public static class2 field1140;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Ljava/io/IOException;")
    private IOException field1128;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public final void method545(int arg0) {
        this.field1127 = new class197();
        if (arg0 > 83) {
            field1132++;
        }
    }

    @OriginalMember(owner = "client!fl", name = "run", descriptor = "()V")
    public final void run() {
        field1133++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1128 != null) {
                        return;
                    }
                    if (this.field1139 > this.field1126) {
                        var2 = this.field1136 + this.field1126 - this.field1139;
                    } else {
                        var2 = this.field1126 - this.field1139;
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
                if (this.field1136 >= this.field1139 + var2) {
                    this.field1127.write(this.field1137, this.field1139, var2);
                } else {
                    int var3 = this.field1136 - this.field1139;
                    this.field1127.write(this.field1137, this.field1139, var3);
                    this.field1127.write(this.field1137, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field1128 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field1139 = (this.field1139 + var2) % this.field1136;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lwq;I)V")
    public static final void method546(class378 arg0, int arg1) {
        field1129++;
        if (arg1 != 472) {
            field1124 = null;
        }
        for (class407 var2 = (class407) class354.field5492.method2123(106); var2 != null; var2 = (class407) class354.field5492.method2126((byte) 61)) {
            if (var2.field6149 == arg0) {
                if (var2.field6148 != null) {
                    class411.field6231.method482(var2.field6148);
                    var2.field6148 = null;
                }
                var2.method3149(104);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public static void method547(byte arg0) {
        field1130 = null;
        field1134 = null;
        field1140 = null;
        if (arg0 < 30) {
            field1124 = null;
        }
        field1124 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)Lds;")
    public static final class12 method548(int arg0, int arg1, int arg2) {
        class409 var3 = class217.field3699[arg0][arg1][arg2];
        return var3 == null || var3.field6176 == null ? null : var3.field6176;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[BII)V")
    public final void method549(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1131++;
        if (~arg3 > arg2 || arg0 < 0 || arg0 + arg3 > arg1.length) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            if (this.field1128 != null) {
                throw new IOException(this.field1128.toString());
            }
            int var6;
            if (this.field1126 >= this.field1139) {
                var6 = this.field1136 + this.field1139 - this.field1126 - 1;
            } else {
                var6 = this.field1139 - this.field1126 - 1;
            }
            if (arg3 > var6) {
                throw new IOException("");
            }
            if (this.field1136 >= (this.field1126 + arg3)) {
                class324.method2166(arg1, arg0, this.field1137, this.field1126, arg3);
            } else {
                int var7 = this.field1136 - this.field1126;
                class324.method2166(arg1, arg0, this.field1137, this.field1126, var7);
                class324.method2166(arg1, arg0 + var7, this.field1137, 0, arg3 - var7);
            }
            this.field1126 = (this.field1126 + arg3) % this.field1136;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
    public final void method550(byte arg0) {
        field1135++;
        synchronized (this) {
            if (this.field1128 == null) {
                this.field1128 = new IOException("");
            }
            this.notifyAll();
            if (arg0 != -112) {
                this.method545(-56);
            }
        }
        try {
            this.field1125.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class76(OutputStream arg0, int arg1) {
        this.field1136 = arg1 + 1;
        this.field1127 = arg0;
        this.field1137 = new byte[this.field1136];
        this.field1125 = new Thread(this);
        this.field1125.setDaemon(true);
        this.field1125.start();
    }
}
