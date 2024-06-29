import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class586 implements Runnable {

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
    private int field8291 = 0;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
    private int field8286 = 0;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field8288;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    private int field8285;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "[B")
    private byte[] field8284;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field8283;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "Ldba;")
    public static class101 field8292 = new class101(1, 3);

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "Lwq;")
    public static class176 field8296 = null;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "Ljo;")
    public static class351 field8297 = new class351(70, 3);

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "[I")
    public static int[] field8298 = new int[1000];

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    public static int field8289;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
    public static int field8290;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
    public static int field8294;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "Ljava/io/IOException;")
    private IOException field8295;

    @OriginalMember(owner = "client!pu", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        field8290++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field8295 != null) {
                        return;
                    }
                    if (this.field8286 >= this.field8291) {
                        var2 = this.field8286 - this.field8291;
                    } else {
                        var2 = this.field8285 + this.field8286 - this.field8291;
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
                if (this.field8285 < (this.field8291 + var2)) {
                    int var3 = this.field8285 - this.field8291;
                    this.field8288.write(this.field8284, this.field8291, var3);
                    this.field8288.write(this.field8284, 0, var2 - var3);
                } else {
                    this.field8288.write(this.field8284, this.field8291, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field8295 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field8291 = (this.field8291 + var2) % this.field8285;
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V", line = 65)
    public final void method3396(int arg0) {
        this.field8288 = new class60();
        field8289++;
        int var2 = 29 / ((arg0 + 59) / 53);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V", line = 75)
    public static void method3397(byte arg0) {
        field8297 = null;
        if (arg0 != -76) {
            method3398(null, (byte) 96, null);
        }
        field8292 = null;
        field8296 = null;
        field8298 = null;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lsu;BLsu;)V", line = 93)
    public static final void method3398(class219 arg0, byte arg1, class219 arg2) {
        if (arg0.field3125 != null) {
            arg0.method1512(false);
        }
        field8293++;
        arg0.field3126 = arg2;
        arg0.field3125 = arg2.field3125;
        if (arg1 != -126) {
            field8297 = null;
        }
        arg0.field3125.field3126 = arg0;
        arg0.field3126.field3125 = arg0;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V", line = 119)
    public final void method3399(byte arg0) {
        field8282++;
        synchronized (this) {
            if (arg0 != 127) {
                this.field8284 = null;
            }
            if (this.field8295 == null) {
                this.field8295 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field8283.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I[BII)V", line = 140)
    public final void method3400(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field8287++;
        if (arg2 < 0 || arg3 < 0 || arg1.length < (arg2 + arg3)) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field8295 != null) {
                throw new IOException(this.field8295.toString());
            }
            int var6;
            if (this.field8291 > this.field8286) {
                var6 = this.field8291 - this.field8286 - 1;
            } else {
                var6 = this.field8285 + this.field8291 - this.field8286 - 1;
            }
            if (arg2 > var6) {
                throw new IOException("");
            }
            if (this.field8286 + arg2 > this.field8285) {
                int var7 = this.field8285 - this.field8286;
                class42.method288(arg1, arg3, this.field8284, this.field8286, var7);
                class42.method288(arg1, arg3 + var7, this.field8284, 0, arg2 - var7);
            } else {
                class42.method288(arg1, arg3, this.field8284, this.field8286, arg2);
            }
            this.field8286 = (this.field8286 + arg2) % this.field8285;
            this.notifyAll();
            if (arg0 != -1) {
                this.field8295 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 209)
    public class586(OutputStream arg0, int arg1) {
        this.field8288 = arg0;
        this.field8285 = arg1 + 1;
        this.field8284 = new byte[this.field8285];
        this.field8283 = new Thread(this);
        this.field8283.setDaemon(true);
        this.field8283.start();
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)V", line = 191)
    public static final void method3401(int arg0, int arg1, int arg2) {
        field8294++;
        if (arg2 == -23355) {
            class678 var3 = class630.method3597(29636, 5, (long) arg1);
            var3.method3834((byte) -124);
            var3.field9649 = arg0;
        }
    }
}
