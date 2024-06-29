import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class171 implements Runnable {

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Z")
    private boolean field2812 = false;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    private int field2804 = 0;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    private int field2820 = 0;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "Z")
    private boolean field2825 = false;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Lim;")
    private class175 field2801;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "Ljava/net/Socket;")
    private Socket field2805;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Ljava/io/InputStream;")
    private InputStream field2811;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2809;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Ltl;")
    public static class59 field2802 = class85.method639("Hierhin gehen", 9588);

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Ltl;")
    public static class59 field2814 = class85.method639("Eingabeprozedur geladen)3", 9588);

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Lgb;")
    public static class212 field2798 = new class212(30);

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field2823 = 0;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "Ltl;")
    public static class59 field2826 = class85.method639("Hierhin gehen", 9588);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Loh;")
    private class257 field2800;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "Lme;")
    public static class295 field2824;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "[B")
    private byte[] field2797;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I", line = 4)
    public final int method1256(int arg0) throws IOException {
        field2822++;
        if (arg0 < 9) {
            this.finalize();
        }
        return this.field2812 ? 0 : this.field2811.available();
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 21)
    public final void method1257(int arg0) {
        if (arg0 != 1185568552) {
            method1266((byte) 113, (class5) null);
        }
        field2815++;
        if (this.field2812) {
            return;
        }
        synchronized (this) {
            this.field2812 = true;
            this.notifyAll();
        }
        if (this.field2800 != null) {
            while (this.field2800.field4256 == 0) {
                class183.method1360(false, 1L);
            }
            if (this.field2800.field4256 == 1) {
                try {
                    ((Thread) this.field2800.field4255).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field2800 = null;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)I", line = 58)
    public final int method1258(int arg0) throws IOException {
        field2816++;
        if (arg0 > -71) {
            this.field2805 = (Socket) null;
        }
        return this.field2812 ? 0 : this.field2811.read();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLs;)Lem;", line = 75)
    public static final class248 method1259(byte arg0, class170 arg1) {
        field2803++;
        class248 var2 = new class248();
        var2.field4133 = arg1.method1214(-18254);
        var2.field4132 = class9.method68(var2.field4133, (byte) -39);
        return arg0 == 48 ? var2 : (class248) null;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V", line = 92)
    public final void method1260(int arg0) {
        field2818++;
        if (!this.field2812) {
            this.field2811 = new class4();
            if (arg0 == 16711680) {
                this.field2809 = new class311();
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIII)I", line = 108)
    public static final int method1261(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class94.field1459) {
            class94.field1459 = false;
            arg1 = 1000000;
        }
        class150 var5 = class167.field2711[arg4][arg3];
        field2799++;
        int var6 = var5.field2479;
        float var7 = ((float) arg0 * 0.1F + 0.7F) * var5.field2468;
        float var8 = var5.field2458;
        float var9 = var5.field2472;
        int var10 = var5.field2466;
        if (!class148.field2429) {
            var10 = 0;
        }
        int var11 = var5.field2465;
        if (class231.field3800 != var6 || class157.field2575 != var7 || class173.field2844 != var8 || class100.field1612 != var9 || class6.field62 != var11 || class212.field3466 != var10) {
            class231.field3800 = var6;
            class10.field136 = class245.field4075;
            class108.field1803 = class119.field1952;
            class173.field2844 = var8;
            class212.field3466 = var10;
            class6.field62 = var11;
            class132.field2194 = class127.field2087;
            class100.field1612 = var9;
            class93.field1438 = class70.field1086;
            class191.field3191 = class56.field839;
            class213.field3497 = 0;
            class317.field5351 = class230.field3778;
            class157.field2575 = var7;
        }
        if (class213.field3497 < 65536) {
            class213.field3497 += arg1 * 250;
            if (class213.field3497 >= 65536) {
                class213.field3497 = 65536;
            }
            int var12 = 65536 - class213.field3497 >> 8;
            float var13 = (float) (65536 - class213.field3497) / 65536.0F;
            int var14 = class213.field3497 >> 8;
            class127.field2087 = ((class231.field3800 & 0xFF00) * var14 + (class132.field2194 & 0xFF00) * var12 & 0xFF0000) + ((class231.field3800 & 0xFF00FF) * var14 + (class132.field2194 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
            class245.field4075 = class212.field3466 * var14 + class10.field136 * var12 >> 8;
            class119.field1952 = ((class6.field62 & 0xFF00FF) * var14 + (class108.field1803 & 0xFF00FF) * var12 & 0xFF00FF00) + ((class6.field62 & 0xFF00) * var14 + (class108.field1803 & 0xFF00) * var12 & 0xFF0000) >> 8;
            float var15 = (float) class213.field3497 / 65536.0F;
            class70.field1086 = class93.field1438 * var13 + class173.field2844 * var15;
            class56.field839 = class191.field3191 * var13 + class157.field2575 * var15;
            class230.field3778 = class317.field5351 * var13 + class100.field1612 * var15;
        }
        class141.method1031(class127.field2087, class56.field839, class70.field1086, class230.field3778);
        if (arg2 == 1228) {
            class141.method1033(class119.field1952, class245.field4075);
            class141.method1024((float) class259.field4327, (float) class137.field2260, (float) class198.field3293);
            class141.method1030();
            return class119.field1952;
        } else {
            return -92;
        }
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V", line = 188)
    public static void method1262(int arg0) {
        field2814 = null;
        field2802 = null;
        field2826 = null;
        if (arg0 == 22223) {
            field2798 = null;
            field2824 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "finalize", descriptor = "()V", line = 204)
    protected final void finalize() {
        field2808++;
        this.method1257(1185568552);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)V", line = 212)
    public static final void method1263(int arg0, byte arg1) {
        class289.field4963.method1486(false, arg0);
        class124.field2054.method1486(false, arg0);
        field2795++;
        int var2 = 39 / ((40 - arg1) / 57);
        class67.field1015.method1486(false, arg0);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lme;I)V", line = 230)
    public static final void method1264(class295 arg0, int arg1) {
        class68.field1050 = arg0;
        field2821++;
        if (arg1 != -15638) {
            method1262(-65);
        }
    }

    @OriginalMember(owner = "client!mb", name = "run", descriptor = "()V", line = 242)
    public final void run() {
        field2806++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field2820 == this.field2804) {
                        if (this.field2812) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    if (this.field2804 > this.field2820) {
                        var3 = 5000 - this.field2804;
                    } else {
                        var3 = this.field2820 - this.field2804;
                    }
                    var4 = this.field2804;
                }
                if (var3 > 0) {
                    try {
                        this.field2809.write(this.field2797, var4, var3);
                    } catch (IOException var12) {
                        this.field2825 = true;
                    }
                    this.field2804 = (this.field2804 + var3) % 5000;
                    try {
                        if (this.field2820 == this.field2804) {
                            this.field2809.flush();
                        }
                    } catch (IOException var11) {
                        this.field2825 = true;
                    }
                }
            }
            try {
                if (this.field2811 != null) {
                    this.field2811.close();
                }
                if (this.field2809 != null) {
                    this.field2809.close();
                }
                if (this.field2805 != null) {
                    this.field2805.close();
                }
            } catch (IOException var10) {
            }
            this.field2797 = null;
        } catch (Exception var15) {
            class306.method2126((String) null, -13, var15);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V", line = 326)
    public final void method1265(boolean arg0) throws IOException {
        if (arg0) {
            return;
        }
        field2817++;
        if (!this.field2812 && this.field2825) {
            this.field2825 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLlj;)V", line = 351)
    public static final void method1266(byte arg0, class5 arg1) {
        field2813++;
        for (int var2 = 0; var2 < class29.field377.length; var2++) {
            class29.field377[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) ((double) var3 * Math.random() * 128.0D);
            class29.field377[var5] = (int) (Math.random() * 284.0D);
        }
        int var6 = 0;
        if (arg0 <= 112) {
            return;
        }
        while (var6 < 20) {
            for (int var7 = 1; var7 < (var3 - 1); var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class70.field1069[var9] = (class29.field377[var9 - 128] + class29.field377[var9 - 1] + class29.field377[var9 + 1] + class29.field377[var9 - -128]) / 4;
                }
            }
            int[] var10 = class29.field377;
            class29.field377 = class70.field1069;
            class70.field1069 = var10;
            var6++;
        }
        if (arg1 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1.field3157; var12++) {
            for (int var13 = 0; var13 < arg1.field3162; var13++) {
                if (arg1.field59[var11++] != 0) {
                    int var14 = var13 + arg1.field3165 + 16;
                    int var15 = var12 + arg1.field3171 + 16;
                    int var16 = (var15 << 7) + var14;
                    class29.field377[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Ljava/net/Socket;Lim;)V", line = 551)
    public class171(Socket arg0, class175 arg1) throws IOException {
        this.field2801 = arg1;
        this.field2805 = arg0;
        this.field2805.setSoTimeout(30000);
        this.field2805.setTcpNoDelay(true);
        this.field2811 = this.field2805.getInputStream();
        this.field2809 = this.field2805.getOutputStream();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([BIIB)V", line = 455)
    public final void method1267(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field2810++;
        if (this.field2812) {
            return;
        }
        if (this.field2825) {
            this.field2825 = false;
            throw new IOException();
        }
        if (this.field2797 == null) {
            this.field2797 = new byte[5000];
        }
        if (arg3 != 56) {
            return;
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field2797[this.field2820] = arg0[arg2 + var6];
                this.field2820 = (this.field2820 + 1) % 5000;
                if (((this.field2804 + 4900) % 5000) == this.field2820) {
                    throw new IOException();
                }
            }
            if (this.field2800 == null) {
                this.field2800 = this.field2801.method1290(3, this, 115);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z[BII)V", line = 510)
    public final void method1268(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0) {
            this.finalize();
        }
        field2796++;
        if (this.field2812) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field2811.read(arg1, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg3 += var5;
        }
    }
}
