import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class247 implements Runnable {

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
    private int field3944 = 0;

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
    private int field3950 = 0;

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
    private int field3951;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3940;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "[B")
    private byte[] field3935;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field3936;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "J")
    public static long field3938 = 0L;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "[B")
    public static byte[] field3933 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "Z")
    public static boolean field3946 = false;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "Lri;")
    public static class97 field3943;

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "Ljava/io/IOException;")
    private IOException field3948;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method1758(int arg0, int arg1, int arg2) {
        if (arg1 >= -83) {
            method1758(-105, 126, -119);
        }
        field3941++;
        return (class643.method3729(-1, arg0, arg2) | class542.method3282((byte) -111, arg2, arg0) | class159.method1307(arg2, 29840, arg0)) & class546.method3297(arg0, -26033, arg2);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V", line = 16)
    public final void method1759(byte arg0) {
        synchronized (this) {
            if (this.field3948 == null) {
                this.field3948 = new IOException("");
            }
            this.notifyAll();
        }
        field3949++;
        try {
            this.field3936.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 != 91) {
            this.field3940 = null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(B)V", line = 36)
    public final void method1760(byte arg0) {
        field3934++;
        if (arg0 != 0) {
            this.run();
        }
        this.field3940 = new class676();
    }

    @OriginalMember(owner = "client!kv", name = "run", descriptor = "()V", line = 48)
    public final void run() {
        field3942++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3948 != null) {
                        return;
                    }
                    if (this.field3950 < this.field3944) {
                        var2 = this.field3951 + this.field3950 - this.field3944;
                    } else {
                        var2 = this.field3950 - this.field3944;
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
                if (this.field3944 + var2 <= this.field3951) {
                    this.field3940.write(this.field3935, this.field3944, var2);
                } else {
                    int var3 = this.field3951 - this.field3944;
                    this.field3940.write(this.field3935, this.field3944, var3);
                    this.field3940.write(this.field3935, 0, var2 - var3);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field3948 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field3944 = (this.field3944 + var2) % this.field3951;
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V", line = 108)
    public static void method1761(int arg0) {
        field3943 = null;
        if (arg0 != 3203) {
            field3947 = -125;
        }
        field3933 = null;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II[BI)V", line = 137)
    public final void method1762(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3939++;
        if (arg1 < 0 || arg0 < 0 || arg2.length < arg0 + arg1) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3948 != null) {
                throw new IOException(this.field3948.toString());
            }
            int var6;
            if (this.field3944 <= this.field3950) {
                var6 = this.field3944 + this.field3951 - this.field3950 - 1;
            } else {
                var6 = this.field3944 - (this.field3950 + 1);
            }
            if (var6 < arg1) {
                throw new IOException("");
            }
            if (this.field3951 < this.field3950 + arg1) {
                int var7 = this.field3951 - this.field3950;
                class398.method2566(arg2, arg0, this.field3935, this.field3950, var7);
                class398.method2566(arg2, arg0 + var7, this.field3935, 0, arg1 - var7);
            } else {
                class398.method2566(arg2, arg0, this.field3935, this.field3950, arg1);
            }
            if (arg3 != 1) {
                method1764(115, -116, 15, -24, -75, -25, -100);
            }
            this.field3950 = (this.field3950 + arg1) % this.field3951;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 204)
    public class247(OutputStream arg0, int arg1) {
        this.field3951 = arg1 + 1;
        this.field3940 = arg0;
        this.field3935 = new byte[this.field3951];
        this.field3936 = new Thread(this);
        this.field3936.setDaemon(true);
        this.field3936.start();
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/String;)V", line = 190)
    public static final void method1763(String arg0, String arg1, String arg2, boolean arg3, int arg4, int arg5, String arg6) {
        if (!arg3) {
            field3945++;
            class635.method3690(arg1, null, arg2, arg4, -1, -23694, arg0, arg6, arg5);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIII)Ldd;", line = 219)
    public static final class654 method1764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3937++;
        long var7 = (long) arg0 * 76724863L ^ (long) arg6 * 32147369L ^ (long) arg4 * 97549L ^ (long) arg1 * 67481L ^ (long) arg5 * 475427L ^ (long) arg3 * 986053L;
        class654 var9 = (class654) class524.field7648.method560(false, var7);
        if (var9 == null) {
            class654 var10 = class529.field7721.method348(arg1, arg4, arg5, arg3, arg6, arg0);
            class524.field7648.method559(var10, var7, 0);
            int var11 = -25 % ((67 - arg2) / 56);
            return var10;
        } else {
            return var9;
        }
    }
}
