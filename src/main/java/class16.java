import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class16 implements Runnable {

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    private int field145 = 0;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    private int field141 = 0;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field144;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "[B")
    private byte[] field151;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field142;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "Z")
    public static boolean field153 = false;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Ljava/io/IOException;")
    private IOException field148;

    @OriginalMember(owner = "client!qk", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        field152++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field148 != null) {
                        return;
                    }
                    if (this.field141 == 0) {
                        var2 = this.field150 - this.field145 - 1;
                    } else if (this.field145 > this.field141) {
                        var2 = this.field150 - this.field145;
                    } else {
                        var2 = this.field141 - this.field145 - 1;
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
                var3 = this.field144.read(this.field151, this.field145, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field148 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field145 = (this.field145 + var3) % this.field150;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBIII)V", line = 68)
    public static final void method75(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = -25 % ((-arg1 - 60) / 56);
        field154++;
        if (class3.field27 != 1) {
            return;
        }
        int var6 = arg3 / class125.field1313;
        int var7 = arg4 / class125.field1313;
        int var8 = arg0 / class541.field7787;
        int var9 = arg2 / class541.field7787;
        if (class712.field10031 <= var6 || var7 < 0 || var8 >= class486.field6971 || var9 < 0) {
            return;
        }
        if (class712.field10031 <= var7) {
            var7 = class712.field10031 - 1;
        }
        if (class486.field6971 <= var9) {
            var9 = class486.field6971 - 1;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        for (int var10 = var8; var10 <= var9; var10++) {
            int var11 = class747.method4151(-115595585, class486.field6971, class515.field7347 + var10) * class712.field10031;
            for (int var12 = var6; var12 <= var7; var12++) {
                int var13 = class747.method4151(-115595585, class712.field10031, class261.field3244 + var12) + var11;
                class11.field87[var13] = class660.field9427;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II[BZ)I", line = 128)
    public final int method76(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field155++;
        if (arg0 < 0 || arg1 < 0 || (arg0 + arg1) > arg2.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field145 < this.field141) {
                var6 = this.field150 + this.field145 - this.field141;
            } else {
                var6 = this.field145 - this.field141;
            }
            if (arg0 > var6) {
                arg0 = var6;
            }
            if (arg0 == 0 && this.field148 != null) {
                throw new IOException(this.field148.toString());
            }
            if ((this.field141 + arg0) > this.field150) {
                int var7 = this.field150 - this.field141;
                class143.method894(this.field151, this.field141, arg2, arg1, var7);
                class143.method894(this.field151, 0, arg2, arg1 + var7, -var7 + arg0);
            } else {
                class143.method894(this.field151, this.field141, arg2, arg1, arg0);
            }
            this.field141 = (this.field141 + arg0) % this.field150;
            if (arg3) {
                return 101;
            } else {
                this.notifyAll();
                return arg0;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 172)
    public final void method77(int arg0) {
        synchronized (this) {
            if (this.field148 == null) {
                this.field148 = new IOException("");
            }
            this.notifyAll();
        }
        field149++;
        if (arg0 > -117) {
            this.method79(-9);
        }
        try {
            this.field142.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 247)
    public class16(InputStream arg0, int arg1) {
        this.field150 = arg1 + 1;
        this.field144 = arg0;
        this.field151 = new byte[this.field150];
        this.field142 = new Thread(this);
        this.field142.setDaemon(true);
        this.field142.start();
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)Z", line = 200)
    public final boolean method78(int arg0, byte arg1) throws IOException {
        field143++;
        if (arg1 != -45) {
            this.run();
        }
        if (arg0 <= 0 || arg0 >= this.field150) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field145 >= this.field141) {
                var4 = this.field145 - this.field141;
            } else {
                var4 = this.field150 + this.field145 - this.field141;
            }
            if (arg0 <= var4) {
                return true;
            } else if (this.field148 == null) {
                return false;
            } else {
                throw new IOException(this.field148.toString());
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 236)
    public final void method79(int arg0) {
        field146++;
        this.field144 = new class139();
        if (arg0 != -1) {
            this.method77(-120);
        }
    }
}
