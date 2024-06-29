import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class698 implements Runnable {

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    private int field9248 = 0;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    private int field9252 = 0;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field9256;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    private int field9253;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "[B")
    private byte[] field9259;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field9246;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Z")
    public static boolean field9249 = false;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "F")
    public static float field9250 = 0.0F;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "S")
    public static short field9257 = 256;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "[[B")
    public static byte[][] field9260 = new byte[50][];

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field9247;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field9254;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field9255;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field9258;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Ljava/io/IOException;")
    private IOException field9261;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 3)
    public final void method3792(byte arg0) {
        this.field9256 = new class490();
        if (arg0 < 13) {
            field9249 = true;
        }
        field9247++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIZII)V", line = 14)
    public static final void method3793(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field9254++;
        class136 var8 = null;
        for (class136 var9 = (class136) class332.field4061.method3591(0); var9 != null; var9 = (class136) class332.field4061.method3600((byte) 32)) {
            if (var9.field1806 == arg0 && var9.field1800 == arg6 && var9.field1799 == arg4 && var9.field1809 == arg2) {
                var8 = var9;
                break;
            }
        }
        if (var8 == null) {
            var8 = new class136();
            var8.field1809 = arg2;
            var8.field1806 = arg0;
            var8.field1799 = arg4;
            var8.field1800 = arg6;
            if (arg6 >= 0 && arg4 >= 0 && arg6 < class240.field3280 && arg4 < class276.field3602) {
                class278.method1709(var8, (byte) -42);
            }
            class332.field4061.method3593(var8, 15);
        }
        var8.field1796 = arg3;
        var8.field1805 = true;
        var8.field1803 = arg5;
        var8.field1808 = arg7;
        var8.field1804 = arg1;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V", line = 59)
    public static void method3794(byte arg0) {
        field9260 = null;
        if (arg0 != 122) {
            method3793(-106, 8, -7, -26, -3, true, 44, 92);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBI[B)V", line = 71)
    public final void method3795(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field9251++;
        if (arg2 < 0 || arg0 < 0 || (arg0 + arg2) > arg3.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field9261 != null) {
                throw new IOException(this.field9261.toString());
            }
            int var6;
            if (this.field9252 >= this.field9248) {
                var6 = this.field9253 + this.field9248 - this.field9252 - 1;
            } else {
                var6 = this.field9248 - this.field9252 - 1;
            }
            if (arg1 <= 101) {
                field9250 = 1.3638725F;
            }
            if (arg2 > var6) {
                throw new IOException("");
            }
            if (this.field9253 >= (this.field9252 + arg2)) {
                class642.method3480(arg3, arg0, this.field9259, this.field9252, arg2);
            } else {
                int var7 = this.field9253 - this.field9252;
                class642.method3480(arg3, arg0, this.field9259, this.field9252, var7);
                class642.method3480(arg3, arg0 + var7, this.field9259, 0, arg2 - var7);
            }
            this.field9252 = (this.field9252 + arg2) % this.field9253;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V", line = 112)
    public final void method3796(byte arg0) {
        synchronized (this) {
            if (this.field9261 == null) {
                this.field9261 = new IOException("");
            }
            this.notifyAll();
        }
        field9258++;
        try {
            this.field9246.join();
            int var3 = -11 % ((arg0 + 71) / 34);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 218)
    public class698(OutputStream arg0, int arg1) {
        this.field9256 = arg0;
        this.field9253 = arg1 + 1;
        this.field9259 = new byte[this.field9253];
        this.field9246 = new Thread(this);
        this.field9246.setDaemon(true);
        this.field9246.start();
    }

    @OriginalMember(owner = "client!fb", name = "run", descriptor = "()V", line = 159)
    public final void run() {
        field9255++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field9261 != null) {
                        return;
                    }
                    if (this.field9248 <= this.field9252) {
                        var2 = this.field9252 - this.field9248;
                    } else {
                        var2 = this.field9253 + this.field9252 - this.field9248;
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
                if ((this.field9248 + var2) <= this.field9253) {
                    this.field9256.write(this.field9259, this.field9248, var2);
                } else {
                    int var3 = this.field9253 - this.field9248;
                    this.field9256.write(this.field9259, this.field9248, var3);
                    this.field9256.write(this.field9259, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field9261 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field9248 = (this.field9248 + var2) % this.field9253;
            }
        }
    }
}
