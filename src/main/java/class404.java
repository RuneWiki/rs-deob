import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class404 implements Runnable {

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    private int field5301 = 0;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
    private int field5315 = 0;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
    private int field5311;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field5310;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "[B")
    private byte[] field5302;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field5314;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "Z")
    public static boolean field5312 = false;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "Lcea;")
    public static class180 field5308 = new class180("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "Ljava/io/IOException;")
    private IOException field5303;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "[I")
    public static int[] field5317;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "([BBII)I", line = 4)
    public final int method2303(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field5305++;
        if (arg2 < 0 || arg3 < 0 || arg0.length < arg2 + arg3) {
            throw new IndexOutOfBoundsException();
        } else if (arg1 == -36) {
            synchronized (this) {
                int var6;
                if (this.field5315 > this.field5301) {
                    var6 = this.field5301 + this.field5311 - this.field5315;
                } else {
                    var6 = this.field5301 - this.field5315;
                }
                if (var6 < arg2) {
                    arg2 = var6;
                }
                if (arg2 == 0 && this.field5303 != null) {
                    throw new IOException(this.field5303.toString());
                }
                if (this.field5311 < this.field5315 + arg2) {
                    int var7 = this.field5311 - this.field5315;
                    class345.method1932(this.field5302, this.field5315, arg0, arg3, var7);
                    class345.method1932(this.field5302, 0, arg0, arg3 + var7, arg2 - var7);
                } else {
                    class345.method1932(this.field5302, this.field5315, arg0, arg3, arg2);
                }
                this.field5315 = (this.field5315 + arg2) % this.field5311;
                this.notifyAll();
                return arg2;
            }
        } else {
            return -95;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 48)
    public static final void method2304(int arg0) {
        class512.field7236.method1165(((float) class565.field8299.field2201 * 0.1F + 0.7F) * class196.field2377);
        field5304++;
        class512.field7236.method1188(class98.field1199, class229.field2840, class433.field5866, (float) (class462.field6384 << 0), (float) (class69.field661 << 0), (float) (class7.field55 << 0));
        class512.field7236.method1189(class78.field914);
        if (arg0 < 89) {
            field5317 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[I)Ljava/lang/String;", line = 62)
    public static final String method2305(int arg0, int[] arg1) {
        field5313++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class310.field3963;
        for (int var4 = arg0; var4 < arg1.length; var4++) {
            class433 var5 = class240.field3001.method3444(true, arg1[var4]);
            if (var5.field5859 != -1) {
                class52 var6 = (class52) class29.field200.method3682(arg0, (long) var5.field5859);
                if (var6 == null) {
                    class3 var7 = class3.method18(class39.field299, var5.field5859, 0);
                    if (var7 != null) {
                        var6 = class210.field2560.method1101(var7, true);
                        class29.field200.method3684(var6, 0, (long) var5.field5859);
                    }
                }
                if (var6 != null) {
                    class7.field59[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ap", name = "run", descriptor = "()V", line = 112)
    public final void run() {
        field5316++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field5303 != null) {
                        return;
                    }
                    if (this.field5315 == 0) {
                        var2 = this.field5311 - this.field5301 - 1;
                    } else if (this.field5301 > this.field5315) {
                        var2 = this.field5311 - this.field5301;
                    } else {
                        var2 = this.field5315 - this.field5301 - 1;
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
                var3 = this.field5310.read(this.field5302, this.field5301, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field5303 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field5301 = (this.field5301 + var3) % this.field5311;
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ)Z", line = 169)
    public final boolean method2306(int arg0, boolean arg1) throws IOException {
        field5307++;
        if (arg0 <= 0 || this.field5311 <= arg0) {
            throw new IndexOutOfBoundsException();
        }
        synchronized (this) {
            if (!arg1) {
                return true;
            }
            int var5;
            if (this.field5315 <= this.field5301) {
                var5 = this.field5301 - this.field5315;
            } else {
                var5 = this.field5311 + this.field5301 - this.field5315;
            }
            if (arg0 <= var5) {
                return true;
            } else if (this.field5303 == null) {
                return false;
            } else {
                throw new IOException(this.field5303.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 266)
    public class404(InputStream arg0, int arg1) {
        this.field5311 = arg1 + 1;
        this.field5310 = arg0;
        this.field5302 = new byte[this.field5311];
        this.field5314 = new Thread(this);
        this.field5314.setDaemon(true);
        this.field5314.start();
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V", line = 208)
    public final void method2307(int arg0) {
        field5309++;
        synchronized (this) {
            if (this.field5303 == null) {
                this.field5303 = new IOException("");
            }
            this.notifyAll();
        }
        if (arg0 != 0) {
            this.method2309(-35);
        }
        try {
            this.field5314.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V", line = 233)
    public static void method2308(int arg0) {
        if (arg0 != -1) {
            method2305(-36, null);
        }
        field5308 = null;
        field5317 = null;
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)V", line = 256)
    public final void method2309(int arg0) {
        int var2 = 53 / ((arg0 - 8) / 37);
        field5306++;
        this.field5310 = new class511();
    }
}
