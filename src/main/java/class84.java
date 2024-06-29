import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class84 implements Runnable {

    @OriginalMember(owner = "client!gea", name = "f", descriptor = "I")
    private int field1180 = 0;

    @OriginalMember(owner = "client!gea", name = "l", descriptor = "I")
    private int field1186 = 0;

    @OriginalMember(owner = "client!gea", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1185;

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "I")
    private int field1178;

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "[B")
    private byte[] field1177;

    @OriginalMember(owner = "client!gea", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field1182;

    @OriginalMember(owner = "client!gea", name = "m", descriptor = "Ltb;")
    public static class450 field1187 = new class450(50);

    @OriginalMember(owner = "client!gea", name = "n", descriptor = "Z")
    public static boolean field1188 = false;

    @OriginalMember(owner = "client!gea", name = "o", descriptor = "Z")
    public static boolean field1189 = false;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!gea", name = "i", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!gea", name = "j", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!gea", name = "g", descriptor = "Ljava/io/IOException;")
    private IOException field1181;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(II[BI)V", line = 4)
    public final void method480(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1179++;
        if (arg3 < 0 || arg0 < 0 || (arg0 + arg3) > arg2.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field1181 != null) {
                throw new IOException(this.field1181.toString());
            }
            if (arg1 != 0) {
                field1188 = false;
            }
            int var6;
            if (this.field1186 >= this.field1180) {
                var6 = this.field1180 + this.field1178 - this.field1186 - 1;
            } else {
                var6 = this.field1180 - this.field1186 - 1;
            }
            if (arg3 > var6) {
                throw new IOException("");
            }
            if ((this.field1186 + arg3) <= this.field1178) {
                class293.method1645(arg2, arg0, this.field1177, this.field1186, arg3);
            } else {
                int var7 = this.field1178 - this.field1186;
                class293.method1645(arg2, arg0, this.field1177, this.field1186, var7);
                class293.method1645(arg2, arg0 + var7, this.field1177, 0, arg3 - var7);
            }
            this.field1186 = (this.field1186 + arg3) % this.field1178;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!gea", name = "run", descriptor = "()V", line = 52)
    public final void run() {
        field1176++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1181 != null) {
                        return;
                    }
                    if (this.field1186 < this.field1180) {
                        var2 = this.field1178 + this.field1186 - this.field1180;
                    } else {
                        var2 = this.field1186 - this.field1180;
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
                if ((this.field1180 + var2) > this.field1178) {
                    int var3 = this.field1178 - this.field1180;
                    this.field1185.write(this.field1177, this.field1180, var3);
                    this.field1185.write(this.field1177, 0, var2 - var3);
                } else {
                    this.field1185.write(this.field1177, this.field1180, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field1181 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field1180 = (this.field1180 + var2) % this.field1178;
            }
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)Lej;", line = 113)
    public static final class480 method481(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field1183++;
        class480 var1 = (class480) class284.field3528.method807(true);
        if (var1 == null) {
            return new class480();
        } else {
            class685.field9618--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V", line = 135)
    public final void method482(int arg0) {
        field1184++;
        synchronized (this) {
            if (this.field1181 == null) {
                this.field1181 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            if (arg0 >= -78) {
                method481(-86);
            }
            this.field1182.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(I)V", line = 156)
    public final void method483(int arg0) {
        field1175++;
        if (arg0 != 10454) {
            this.run();
        }
        this.field1185 = new class572();
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 187)
    public class84(OutputStream arg0, int arg1) {
        this.field1185 = arg0;
        this.field1178 = arg1 + 1;
        this.field1177 = new byte[this.field1178];
        this.field1182 = new Thread(this);
        this.field1182.setDaemon(true);
        this.field1182.start();
    }

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "(I)V", line = 172)
    public static void method484(int arg0) {
        if (arg0 == 0) {
            field1187 = null;
        }
    }
}
