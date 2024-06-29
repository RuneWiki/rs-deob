import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class706 implements Runnable {

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "I")
    private int field9646 = 0;

    @OriginalMember(owner = "client!nfa", name = "n", descriptor = "I")
    private int field9658 = 0;

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "I")
    private int field9647;

    @OriginalMember(owner = "client!nfa", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field9654;

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "[B")
    private byte[] field9650;

    @OriginalMember(owner = "client!nfa", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field9656;

    @OriginalMember(owner = "client!nfa", name = "m", descriptor = "Ljea;")
    public static class474 field9657 = new class474(3, 5);

    @OriginalMember(owner = "client!nfa", name = "r", descriptor = "[B")
    public static byte[] field9662 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

    @OriginalMember(owner = "client!nfa", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field9661 = new String[100];

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "I")
    public static int field9645;

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "I")
    public static int field9649;

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "I")
    public static int field9651;

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "I")
    public static int field9652;

    @OriginalMember(owner = "client!nfa", name = "i", descriptor = "I")
    public static int field9653;

    @OriginalMember(owner = "client!nfa", name = "k", descriptor = "I")
    public static int field9655;

    @OriginalMember(owner = "client!nfa", name = "o", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!nfa", name = "p", descriptor = "I")
    public static int field9660;

    @OriginalMember(owner = "client!nfa", name = "s", descriptor = "Lip;")
    public static class734 field9663;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "Ljava/io/IOException;")
    private IOException field9648;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BLjava/lang/String;)J", line = 3)
    public static final long method3921(byte arg0, String arg1) {
        field9652++;
        long var2 = 0L;
        if (arg0 != 14) {
            field9661 = null;
        }
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nfa", name = "run", descriptor = "()V", line = 49)
    public final void run() {
        field9655++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field9648 != null) {
                        return;
                    }
                    if (this.field9646 == 0) {
                        var2 = this.field9647 - this.field9658 - 1;
                    } else if (this.field9658 > this.field9646) {
                        var2 = this.field9647 - this.field9658;
                    } else {
                        var2 = this.field9646 - this.field9658 - 1;
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
                var3 = this.field9654.read(this.field9650, this.field9658, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field9648 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field9658 = (this.field9658 + var3) % this.field9647;
            }
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(III[B)I", line = 107)
    public final int method3922(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field9653++;
        if (arg1 < 0 || arg0 < 0 || arg0 + arg1 > arg3.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (arg2 > -66) {
                return 3;
            }
            int var7;
            if (this.field9646 <= this.field9658) {
                var7 = this.field9658 - this.field9646;
            } else {
                var7 = this.field9658 + this.field9647 - this.field9646;
            }
            if (var7 < arg1) {
                arg1 = var7;
            }
            if (arg1 == 0 && this.field9648 != null) {
                throw new IOException(this.field9648.toString());
            }
            if ((this.field9646 + arg1) > this.field9647) {
                int var8 = this.field9647 - this.field9646;
                class421.method2534(this.field9650, this.field9646, arg3, arg0, var8);
                class421.method2534(this.field9650, 0, arg3, arg0 + var8, -var8 + arg1);
            } else {
                class421.method2534(this.field9650, this.field9646, arg3, arg0, arg1);
            }
            this.field9646 = (this.field9646 + arg1) % this.field9647;
            this.notifyAll();
            return arg1;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 256)
    public class706(InputStream arg0, int arg1) {
        this.field9647 = arg1 + 1;
        this.field9654 = arg0;
        this.field9650 = new byte[this.field9647];
        this.field9656 = new Thread(this);
        this.field9656.setDaemon(true);
        this.field9656.start();
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)Z", line = 155)
    public final boolean method3923(int arg0, int arg1) throws IOException {
        field9645++;
        int var3 = 110 / ((-arg0 - 36) / 58);
        if (arg1 <= 0 || this.field9647 <= arg1) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field9658 >= this.field9646) {
                var5 = this.field9658 - this.field9646;
            } else {
                var5 = this.field9647 + this.field9658 - this.field9646;
            }
            if (arg1 <= var5) {
                return true;
            } else if (this.field9648 == null) {
                return false;
            } else {
                throw new IOException(this.field9648.toString());
            }
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lln;Z)Z", line = 187)
    public static final boolean method3924(class398 arg0, boolean arg1) {
        field9649++;
        if (arg1) {
            method3921((byte) -120, null);
        }
        return arg0 == null ? false : class776.method4269(arg0.field5708, arg0.field5695 - arg0.field5696, arg0.field5696, arg0.field5700 - arg0.field5708, arg0.field5703, 132, arg0.field5693 - arg0.field5703);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V", line = 202)
    public final void method3925(int arg0) {
        this.field9654 = new class238();
        if (arg0 >= -16) {
            this.field9646 = -22;
        }
        field9659++;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V", line = 215)
    public final void method3926(byte arg0) {
        field9660++;
        synchronized (this) {
            if (this.field9648 == null) {
                this.field9648 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field9656.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 != 90) {
            this.method3925(-36);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(B)V", line = 236)
    public static void method3927(byte arg0) {
        field9657 = null;
        field9663 = null;
        if (arg0 == 14) {
            field9661 = null;
            field9662 = null;
        }
    }
}
