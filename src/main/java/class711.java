import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class711 implements Runnable {

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    private int field9917 = 0;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    private int field9927 = 0;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field9920;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    private int field9923;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "[B")
    private byte[] field9916;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field9919;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field9915 = 0;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field9925 = 0;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field9921;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field9924;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field9926;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field9928;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field9929;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Ljava/io/IOException;")
    private IOException field9922;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public final void method3991(int arg0) {
        field9921++;
        this.field9920 = new class680();
        if (arg0 != -25638) {
            this.field9920 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method3992(String arg0, String arg1, String arg2, byte arg3) {
        int var4 = -61 % ((12 - arg3) / 60);
        field9928++;
        for (int var5 = arg1.indexOf(arg0); var5 != -1; var5 = arg1.indexOf(arg0, arg2.length() + var5)) {
            arg1 = arg1.substring(0, var5) + arg2 + arg1.substring(var5 + arg0.length());
        }
        return arg1;
    }

    @OriginalMember(owner = "client!nj", name = "run", descriptor = "()V")
    public final void run() {
        field9929++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field9922 != null) {
                        return;
                    }
                    if (this.field9917 >= this.field9927) {
                        var2 = this.field9917 - this.field9927;
                    } else {
                        var2 = this.field9923 + this.field9917 - this.field9927;
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
                if (this.field9923 >= this.field9927 + var2) {
                    this.field9920.write(this.field9916, this.field9927, var2);
                } else {
                    int var3 = this.field9923 - this.field9927;
                    this.field9920.write(this.field9916, this.field9927, var3);
                    this.field9920.write(this.field9916, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field9922 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field9927 = (this.field9927 + var2) % this.field9923;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public final void method3993(byte arg0) {
        field9926++;
        synchronized (this) {
            if (arg0 >= -44) {
                return;
            }
            if (this.field9922 == null) {
                this.field9922 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field9919.join();
        } catch (InterruptedException var5) {
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([BIII)V")
    public final void method3994(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field9924++;
        if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field9922 != null) {
                throw new IOException(this.field9922.toString());
            } else if (arg3 == -26012) {
                int var6;
                if (this.field9917 < this.field9927) {
                    var6 = this.field9927 - this.field9917 - 1;
                } else {
                    var6 = this.field9927 + this.field9923 - this.field9917 - 1;
                }
                if (var6 < arg2) {
                    throw new IOException("");
                }
                if (this.field9923 >= (this.field9917 + arg2)) {
                    class34.method245(arg0, arg1, this.field9916, this.field9917, arg2);
                } else {
                    int var7 = this.field9923 - this.field9917;
                    class34.method245(arg0, arg1, this.field9916, this.field9917, var7);
                    class34.method245(arg0, arg1 + var7, this.field9916, 0, arg2 - var7);
                }
                this.field9917 = (this.field9917 + arg2) % this.field9923;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class711(OutputStream arg0, int arg1) {
        this.field9920 = arg0;
        this.field9923 = arg1 + 1;
        this.field9916 = new byte[this.field9923];
        this.field9919 = new Thread(this);
        this.field9919.setDaemon(true);
        this.field9919.start();
    }
}
