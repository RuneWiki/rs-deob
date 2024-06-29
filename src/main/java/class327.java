import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class327 implements Runnable {

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    private int field4627 = 0;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    private int field4630 = 0;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4632;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    private int field4624;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "[B")
    private byte[] field4626;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field4622;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "Lqe;")
    public static class465 field4629 = new class465(26, -2);

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "Lqaa;")
    public static class27 field4634 = new class27(66, -1);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "Ljava/io/IOException;")
    private IOException field4633;

    @OriginalMember(owner = "client!hp", name = "run", descriptor = "()V")
    public final void run() {
        field4623++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field4633 != null) {
                        return;
                    }
                    if (this.field4630 > this.field4627) {
                        var2 = this.field4627 + this.field4624 - this.field4630;
                    } else {
                        var2 = this.field4627 - this.field4630;
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
                if (this.field4630 + var2 > this.field4624) {
                    int var3 = this.field4624 - this.field4630;
                    this.field4632.write(this.field4626, this.field4630, var3);
                    this.field4632.write(this.field4626, 0, var2 - var3);
                } else {
                    this.field4632.write(this.field4626, this.field4630, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field4633 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field4630 = (this.field4630 + var2) % this.field4624;
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public final void method2086(int arg0) {
        field4628++;
        if (arg0 != 28650) {
            this.field4632 = null;
        }
        synchronized (this) {
            if (this.field4633 == null) {
                this.field4633 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field4622.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
    public static void method2087(int arg0) {
        field4629 = null;
        field4634 = null;
        if (arg0 != 0) {
            method2091('A', 126, null);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZI[BI)V")
    public final void method2088(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4631++;
        if (arg1 < 0 || arg3 < 0 || (arg1 + arg3) > arg2.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field4633 != null) {
                throw new IOException(this.field4633.toString());
            }
            int var6;
            if (this.field4627 >= this.field4630) {
                var6 = this.field4624 + this.field4630 - this.field4627 - 1;
            } else {
                var6 = this.field4630 - this.field4627 - 1;
            }
            if (arg0) {
                this.method2090(-98);
            }
            if (var6 < arg1) {
                throw new IOException("");
            }
            if (this.field4624 < (this.field4627 + arg1)) {
                int var7 = this.field4624 - this.field4627;
                class622.method3597(arg2, arg3, this.field4626, this.field4627, var7);
                class622.method3597(arg2, arg3 + var7, this.field4626, 0, arg1 - var7);
            } else {
                class622.method3597(arg2, arg3, this.field4626, this.field4627, arg1);
            }
            this.field4627 = (this.field4627 + arg1) % this.field4624;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/lang/String;IB)Lbl;")
    public static final class646 method2089(String arg0, int arg1, byte arg2) {
        field4621++;
        class646 var3;
        try {
            var3 = (class646) Class.forName("nia").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class365();
        }
        var3.field9153 = arg1;
        if (arg2 != -72) {
            field4629 = null;
        }
        var3.field9156 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)V")
    public final void method2090(int arg0) {
        if (arg0 == 0) {
            field4625++;
            this.field4632 = new class21();
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class327(OutputStream arg0, int arg1) {
        this.field4632 = arg0;
        this.field4624 = arg1 + 1;
        this.field4626 = new byte[this.field4624];
        this.field4622 = new Thread(this);
        this.field4622.setDaemon(true);
        this.field4622.start();
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method2091(char arg0, int arg1, String arg2) {
        field4620++;
        if (arg1 != 26911) {
            field4634 = null;
        }
        int var3 = class715.method3980(false, arg0, arg2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2.charAt(var8) != arg0; var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }
}
