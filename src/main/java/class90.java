import java.awt.Image;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class90 implements Runnable {

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    private int field1259 = 0;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    private int field1272 = 0;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "Ljava/io/InputStream;")
    private InputStream field1265;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    private int field1267;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "[B")
    private byte[] field1258;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field1263;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "[I")
    public static int[] field1273 = new int[2];

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Ljava/awt/Image;")
    public static Image field1261;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Ljava/io/IOException;")
    private IOException field1266;

    @OriginalMember(owner = "client!dk", name = "run", descriptor = "()V", line = 7)
    public final void run() {
        field1268++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1266 != null) {
                        return;
                    }
                    if (this.field1259 == 0) {
                        var2 = this.field1267 - this.field1272 - 1;
                    } else if (this.field1272 <= this.field1259) {
                        var2 = this.field1259 - this.field1272 - 1;
                    } else {
                        var2 = this.field1267 - this.field1272;
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
                var3 = this.field1265.read(this.field1258, this.field1272, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field1266 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field1272 = (this.field1272 + var3) % this.field1267;
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 67)
    public final void method618(byte arg0) {
        field1269++;
        synchronized (this) {
            if (this.field1266 == null) {
                this.field1266 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field1263.join();
            int var3 = 101 / ((18 - arg0) / 35);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z[I)Ljava/lang/String;", line = 90)
    public static final String method619(boolean arg0, int[] arg1) {
        field1264++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class3.field24;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class443 var5 = class248.field3649.method3633((byte) 54, arg1[var4]);
            if (var5.field6161 != -1) {
                class298 var6 = (class298) class117.field1551.method3898((byte) -42, (long) var5.field6161);
                if (var6 == null) {
                    class52 var7 = class52.method374(class671.field9318, var5.field6161, 0);
                    if (var7 != null) {
                        var6 = class129.field1802.method1496(var7, true);
                        class117.field1551.method3899(114, var6, (long) var5.field6161);
                    }
                }
                if (var6 != null) {
                    class719.field10005[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        if (arg0) {
            field1273 = null;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 143)
    public static void method620(int arg0) {
        field1261 = null;
        field1273 = null;
        int var1 = -126 % ((arg0 + 75) / 37);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II[BI)I", line = 154)
    public final int method621(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1271++;
        if (arg1 < 0 || arg3 < 0 || arg2.length < arg1 + arg3) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field1272 < this.field1259) {
                var6 = this.field1272 + this.field1267 - this.field1259;
            } else {
                var6 = this.field1272 - this.field1259;
            }
            if (arg0 != 31364) {
                this.run();
            }
            if (arg1 > var6) {
                arg1 = var6;
            }
            if (arg1 == 0 && this.field1266 != null) {
                throw new IOException(this.field1266.toString());
            }
            if (this.field1267 >= (this.field1259 + arg1)) {
                class245.method1646(this.field1258, this.field1259, arg2, arg3, arg1);
            } else {
                int var7 = this.field1267 - this.field1259;
                class245.method1646(this.field1258, this.field1259, arg2, arg3, var7);
                class245.method1646(this.field1258, 0, arg2, arg3 + var7, -var7 + arg1);
            }
            this.field1259 = (this.field1259 + arg1) % this.field1267;
            this.notifyAll();
            return arg1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)Z", line = 199)
    public final boolean method622(byte arg0, int arg1) throws IOException {
        field1260++;
        if (arg1 <= 0 || arg1 >= this.field1267) {
            throw new IOException();
        } else if (arg0 >= -82) {
            return false;
        } else {
            synchronized (this) {
                int var4;
                if (this.field1272 >= this.field1259) {
                    var4 = this.field1272 - this.field1259;
                } else {
                    var4 = this.field1272 + this.field1267 - this.field1259;
                }
                if (var4 >= arg1) {
                    return true;
                } else if (this.field1266 == null) {
                    return false;
                } else {
                    throw new IOException(this.field1266.toString());
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 264)
    public class90(InputStream arg0, int arg1) {
        this.field1265 = arg0;
        this.field1267 = arg1 + 1;
        this.field1258 = new byte[this.field1267];
        this.field1263 = new Thread(this);
        this.field1263.setDaemon(true);
        this.field1263.start();
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V", line = 235)
    public final void method623(int arg0) {
        this.field1265 = new class731();
        field1262++;
        if (arg0 != -16808) {
            this.method618((byte) 121);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBI)Z", line = 254)
    public static final boolean method624(int arg0, byte arg1, int arg2) {
        if (arg1 != -13) {
            field1273 = null;
        }
        field1270++;
        return class644.method3594(arg2, arg0, (byte) -48) & (class338.method2146(544, arg2, arg0) | (arg0 & 0x2000) != 0 | class526.method3124(arg0, arg2, 65536));
    }
}
