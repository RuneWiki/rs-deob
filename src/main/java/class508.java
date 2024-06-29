import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class508 implements Runnable {

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    private int field7386 = 0;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    private int field7399 = 0;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Ljava/io/InputStream;")
    private InputStream field7397;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    private int field7391;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "[B")
    private byte[] field7388;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field7390;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Z")
    public static boolean field7385 = false;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Ljava/io/IOException;")
    private IOException field7393;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BII)I", line = 5)
    public final int method3027(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field7384++;
        if (arg3 < 0 || arg0 < 0 || (arg0 + arg3) > arg1.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field7399 > this.field7386) {
                var6 = this.field7391 + this.field7386 - this.field7399;
            } else {
                var6 = this.field7386 - this.field7399;
            }
            if (arg3 > var6) {
                arg3 = var6;
            }
            if (~arg3 == arg2 && this.field7393 != null) {
                throw new IOException(this.field7393.toString());
            }
            if (this.field7391 < (this.field7399 + arg3)) {
                int var7 = this.field7391 - this.field7399;
                class210.method1330(this.field7388, this.field7399, arg1, arg0, var7);
                class210.method1330(this.field7388, 0, arg1, arg0 + var7, -var7 + arg3);
            } else {
                class210.method1330(this.field7388, this.field7399, arg1, arg0, arg3);
            }
            this.field7399 = (this.field7399 + arg3) % this.field7391;
            this.notifyAll();
            return arg3;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 51)
    public static final void method3028(int arg0) {
        class277 var1 = class4.field33;
        synchronized (class4.field33) {
            class4.field33.method1810(false);
        }
        field7383++;
        if (arg0 == 1) {
            class277 var2 = class191.field2508;
            synchronized (class191.field2508) {
                class191.field2508.method1810(false);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V", line = 68)
    public static final void method3029(int arg0) {
        field7389++;
        if (class639.field9187 < 1024.0F) {
            class639.field9187 = 1024.0F;
        }
        if (class639.field9187 > 3072.0F) {
            class639.field9187 = 3072.0F;
        }
        while (class388.field5967 >= 16384.0F) {
            class388.field5967 -= 16384.0F;
        }
        while (class388.field5967 < 0.0F) {
            class388.field5967 += 16384.0F;
        }
        int var1 = class325.field4695 >> 9;
        if (arg0 != -2368) {
            field7385 = false;
        }
        int var2 = class620.field8987 >> 9;
        int var3 = class399.method2547(class620.field8987, class325.field4695, (byte) 98, class226.field3179);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < class90.field1032 - 4 && var2 < (class30.field349 - 4)) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class226.field3179;
                    if (var7 < 3 && class647.method3709(var5, var6, -17206)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class273.field3824.field997 != null && class273.field3824.field997[var7] != null) {
                        var8 = (class273.field3824.field997[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 + var8 - class435.field6449[var7].method259(var5, var6);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 2) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class289.field4003) {
            class289.field4003 += (var10 - class289.field4003) / 24;
        } else if (class289.field4003 > var10) {
            class289.field4003 += (var10 - class289.field4003) / 80;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 291)
    public class508(InputStream arg0, int arg1) {
        this.field7397 = arg0;
        this.field7391 = arg1 + 1;
        this.field7388 = new byte[this.field7391];
        this.field7390 = new Thread(this);
        this.field7390.setDaemon(true);
        this.field7390.start();
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)Z", line = 160)
    public final boolean method3030(int arg0, byte arg1) throws IOException {
        int var3 = -23 / ((arg1 + 36) / 57);
        field7398++;
        if (arg0 <= 0 || this.field7391 <= arg0) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field7399 <= this.field7386) {
                var5 = this.field7386 - this.field7399;
            } else {
                var5 = this.field7391 + this.field7386 - this.field7399;
            }
            if (var5 >= arg0) {
                return true;
            } else if (this.field7393 == null) {
                return false;
            } else {
                throw new IOException(this.field7393.toString());
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "run", descriptor = "()V", line = 191)
    public final void run() {
        field7394++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field7393 != null) {
                        return;
                    }
                    if (this.field7399 == 0) {
                        var2 = this.field7391 - this.field7386 - 1;
                    } else if (this.field7386 > this.field7399) {
                        var2 = this.field7391 - this.field7386;
                    } else {
                        var2 = this.field7399 - this.field7386 - 1;
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
                var3 = this.field7397.read(this.field7388, this.field7386, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field7393 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field7386 = (this.field7386 + var3) % this.field7391;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V", line = 249)
    public final void method3031(int arg0) {
        field7396++;
        if (arg0 != -4) {
            this.field7399 = 57;
        }
        this.field7397 = new class384();
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 266)
    public final void method3032(byte arg0) {
        synchronized (this) {
            if (this.field7393 == null) {
                this.field7393 = new IOException("");
            }
            this.notifyAll();
            if (arg0 != -38) {
                method3028(-63);
            }
        }
        field7395++;
        try {
            this.field7390.join();
        } catch (InterruptedException var3) {
        }
    }
}
