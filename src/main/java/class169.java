import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class169 implements Runnable {

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    private int field2763 = 0;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Z")
    private boolean field2771 = false;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Z")
    private boolean field2764 = false;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    private int field2770 = 0;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Ljava/net/Socket;")
    private Socket field2766;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Lcj;")
    private class75 field2753;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field2762;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2772;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2773 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!e", name = "x", descriptor = "[[S")
    public static short[][] field2776 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!e", name = "z", descriptor = "[[S")
    public static short[][] field2778 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 115, 88, 59, 35, 16, 2, 823, 1837, 4019, 7091, 10169, 14259, 17331, 21427, 27571, 30643, -31821, -27721, -24647, -21593, -16587, -13391, 790, 5014, 7056, 1156, 15124, 19986, 30610, -30830, -27758, -23664, -17518, -14446, -9328, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 115, 88, 59, 35, 16, 2, 819, 929, 792, 2743, 2729, 3858, 4923, 4907, 4884, 7995, 7966, 11069, 11047, 11028, 18227, 18204, 18314, 30397, 30373, 30350, -31175, -31197, -32116, -25920, -25939, -25960, -21833, -21849, -21740, -19008, -18011, -18928, -11845, -11867, -14736, 23440, 22032, 21642, 1752, 4946, 8916, 14036, 25948, 32472, -27950, -20778, -15660, -7470, 8097, 7830, 5392, 4890, 4882, 788, 530, -22756, -24044, 13964 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 115, 88, 59, 35, 16, 2, 819, 929, 792, 2743, 2729, 3858, 4923, 4907, 4884, 7995, 7966, 11069, 11047, 11028, 18227, 18204, 18314, 30397, 30373, 30350, -31175, -31197, -32116, -25920, -25939, -25960, -21833, -21849, -21740, -19008, -18011, -18928, -11845, -11867, -14736, 23440, 22032, 21642, 1752, 4946, 8916, 14036, 25948, 32472, -27950, -20778, -15660, -7470, 8097, 7830, 5392, 4890, 4882, 788, 530, -22756, -24044, 13964 } };

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field2774 = 0;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public static int field2779 = 0;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public static int field2775 = 0;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Lhj;")
    private class112 field2757;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "[B")
    private byte[] field2767;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([BIII)V", line = 5)
    public final void method1226(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2765++;
        if (this.field2764) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field2762.read(arg0, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg3 -= var5;
        }
        if (arg1 != 14451) {
            method1230(23, (float[]) null);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)I", line = 35)
    public final int method1227(int arg0) throws IOException {
        field2761++;
        if (arg0 == 0) {
            return this.field2764 ? 0 : this.field2762.available();
        } else {
            return -105;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Luf;", line = 51)
    public static final class168 method1228(int arg0, int arg1) {
        if (arg1 != 0) {
            method1230(-94, (float[]) null);
        }
        field2754++;
        return class272.method1878(arg0, false, arg1 - 1, 10);
    }

    @OriginalMember(owner = "client!e", name = "finalize", descriptor = "()V", line = 62)
    protected final void finalize() {
        this.method1229(545);
        field2760++;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V", line = 70)
    public final void method1229(int arg0) {
        field2756++;
        if (this.field2764) {
            return;
        }
        synchronized (this) {
            this.field2764 = true;
            this.notifyAll();
        }
        if (arg0 != 545) {
            return;
        }
        if (this.field2757 != null) {
            while (this.field2757.field1746 == 0) {
                class300.method2054(arg0 ^ 0x22B, 1L);
            }
            if (this.field2757.field1746 == 1) {
                try {
                    ((Thread) this.field2757.field1742).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field2757 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[F)[F", line = 107)
    public static final float[] method1230(int arg0, float[] arg1) {
        field2759++;
        if (arg1 == null) {
            return null;
        } else {
            float[] var2 = new float[arg1.length];
            class185.method1312(arg1, arg0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z[I[Ljava/lang/Object;)V", line = 121)
    public static final void method1231(boolean arg0, int[] arg1, Object[] arg2) {
        class92.method649(92, arg1.length - 1, arg1, 0, arg2);
        field2758++;
        if (arg0) {
            method1231(false, (int[]) null, (Object[]) null);
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)I", line = 134)
    public final int method1232(int arg0) throws IOException {
        field2768++;
        if (arg0 != 0) {
            this.field2766 = (Socket) null;
        }
        return this.field2764 ? 0 : this.field2762.read();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B[BII)V", line = 153)
    public final void method1233(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2755++;
        if (this.field2764) {
            return;
        }
        if (this.field2771) {
            this.field2771 = false;
            throw new IOException();
        }
        if (this.field2767 == null) {
            this.field2767 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 65 / ((91 - arg0) / 33);
            for (int var7 = 0; var7 < arg2; var7++) {
                this.field2767[this.field2763] = arg1[arg3 + var7];
                this.field2763 = (this.field2763 + 1) % 5000;
                if ((this.field2770 + 4900) % 5000 == this.field2763) {
                    throw new IOException();
                }
            }
            if (this.field2757 == null) {
                this.field2757 = this.field2753.method429(this, 0, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Ljava/net/Socket;Lcj;)V", line = 242)
    public class169(Socket arg0, class75 arg1) throws IOException {
        this.field2766 = arg0;
        this.field2753 = arg1;
        this.field2766.setSoTimeout(30000);
        this.field2766.setTcpNoDelay(true);
        this.field2762 = this.field2766.getInputStream();
        this.field2772 = this.field2766.getOutputStream();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 219)
    public static void method1234(byte arg0) {
        field2773 = null;
        field2778 = (short[][]) null;
        int var1 = 121 % ((arg0 + 13) / 35);
        field2776 = (short[][]) null;
    }

    @OriginalMember(owner = "client!e", name = "run", descriptor = "()V", line = 257)
    public final void run() {
        field2769++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field2770 == this.field2763) {
                        if (this.field2764) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    if (this.field2763 >= this.field2770) {
                        var3 = this.field2763 - this.field2770;
                    } else {
                        var3 = 5000 - this.field2770;
                    }
                    var4 = this.field2770;
                }
                if (var3 > 0) {
                    try {
                        this.field2772.write(this.field2767, var4, var3);
                    } catch (IOException var12) {
                        this.field2771 = true;
                    }
                    this.field2770 = (this.field2770 + var3) % 5000;
                    try {
                        if (this.field2770 == this.field2763) {
                            this.field2772.flush();
                        }
                    } catch (IOException var11) {
                        this.field2771 = true;
                    }
                }
            }
            try {
                if (this.field2762 != null) {
                    this.field2762.close();
                }
                if (this.field2772 != null) {
                    this.field2772.close();
                }
                if (this.field2766 != null) {
                    this.field2766.close();
                }
            } catch (IOException var10) {
            }
            this.field2767 = null;
        } catch (Exception var15) {
            class43.method234(var15, -15954, (String) null);
        }
    }
}
