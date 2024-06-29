import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class18 implements Runnable {

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    private int field156 = 0;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    private int field163 = 0;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field162;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "[B")
    private byte[] field150;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field155;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field149 = 0;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "[I")
    public static int[] field161 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Lpr;")
    public static class407 field157 = new class407(27, 12);

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Lpr;")
    public static class407 field164 = new class407(3, 8);

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Lvd;")
    public static class36 field166 = new class36();

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Ljava/io/IOException;")
    private IOException field152;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Z")
    public static boolean field165;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "[Lxa;")
    public static class458[] field160;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public final void method72(byte arg0) {
        synchronized (this) {
            if (arg0 < 4) {
                return;
            }
            if (this.field152 == null) {
                this.field152 = new IOException("");
            }
            this.notifyAll();
        }
        field151++;
        try {
            this.field155.join();
        } catch (InterruptedException var5) {
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
    public static void method73(byte arg0) {
        field157 = null;
        if (arg0 < 41) {
            field149 = 34;
        }
        field166 = null;
        field160 = null;
        field161 = null;
        field164 = null;
    }

    @OriginalMember(owner = "client!l", name = "run", descriptor = "()V")
    public final void run() {
        field154++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field152 != null) {
                        return;
                    }
                    if (this.field163 >= this.field156) {
                        var2 = this.field163 - this.field156;
                    } else {
                        var2 = this.field159 + this.field163 - this.field156;
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
                if (this.field156 + var2 <= this.field159) {
                    this.field162.write(this.field150, this.field156, var2);
                } else {
                    int var3 = this.field159 - this.field156;
                    this.field162.write(this.field150, this.field156, var3);
                    this.field162.write(this.field150, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field152 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field156 = (this.field156 + var2) % this.field159;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public final void method74(int arg0) {
        field158++;
        this.field162 = new class609();
        if (arg0 != 0) {
            this.field156 = 111;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([BIIB)V")
    public final void method75(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field153++;
        if (arg1 < 0 || arg2 < 0 || arg0.length < arg1 + arg2) {
            throw new IOException();
        }
        synchronized (this) {
            int var6 = 36 % ((arg3 + 36) / 42);
            if (this.field152 != null) {
                throw new IOException(this.field152.toString());
            }
            int var7;
            if (this.field156 <= this.field163) {
                var7 = this.field159 - (this.field163 - this.field156) - 1;
            } else {
                var7 = this.field156 - this.field163 - 1;
            }
            if (arg1 > var7) {
                throw new IOException("");
            }
            if (this.field159 < (this.field163 + arg1)) {
                int var8 = this.field159 - this.field163;
                class652.method3679(arg0, arg2, this.field150, this.field163, var8);
                class652.method3679(arg0, arg2 + var8, this.field150, 0, arg1 - var8);
            } else {
                class652.method3679(arg0, arg2, this.field150, this.field163, arg1);
            }
            this.field163 = (this.field163 + arg1) % this.field159;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class18(OutputStream arg0, int arg1) {
        this.field162 = arg0;
        this.field159 = arg1 + 1;
        this.field150 = new byte[this.field159];
        this.field155 = new Thread(this);
        this.field155.setDaemon(true);
        this.field155.start();
    }
}
