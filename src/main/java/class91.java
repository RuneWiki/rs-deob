import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class91 implements Runnable {

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Z")
    private boolean field2231 = false;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "Z")
    private boolean field2239 = false;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
    private int field2244 = 0;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
    private int field2261 = 0;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "Ljava/net/Socket;")
    private Socket field2249;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "Lvb;")
    private class124 field2260;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "Ljava/io/InputStream;")
    private InputStream field2264;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2238;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Lmc;")
    public static class75 field2222 = class30.method234(true, "blaugr-Un:");

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Lmc;")
    public static class75 field2234 = class30.method234(true, "(U1");

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "Lmc;")
    private static class75 field2242 = class30.method234(true, "You have only just left another world)3");

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field2230 = 0;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "Lmc;")
    public static class75 field2245 = class30.method234(true, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Lmc;")
    private static class75 field2224 = class30.method234(true, "System update in: ");

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field2236 = 0;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field2233 = -1;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Lmc;")
    private static class75 field2229 = class30.method234(true, "Please try using a different world)3");

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "[[I")
    public static int[][] field2258 = new int[104][104];

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "Lmc;")
    public static class75 field2248 = field2229;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lmc;")
    public static class75 field2223 = field2229;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "Lmc;")
    public static class75 field2240 = field2229;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "Lmc;")
    public static class75 field2246 = field2229;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "Lmc;")
    public static class75 field2262 = field2224;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "Lmc;")
    public static class75 field2252 = field2229;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lmc;")
    public static class75 field2225 = field2229;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "Lmc;")
    public static class75 field2243 = class30.method234(true, "::fpson");

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public static int field2255 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "Lmc;")
    public static class75 field2257 = field2242;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "Lud;")
    private class121 field2232;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "Lpb;")
    public static class92 field2250;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "[B")
    private byte[] field2227;

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Ljava/net/Socket;Lvb;)V", line = 480)
    public class91(Socket arg0, class124 arg1) throws IOException {
        this.field2249 = arg0;
        this.field2260 = arg1;
        this.field2249.setSoTimeout(30000);
        this.field2249.setTcpNoDelay(true);
        this.field2264 = this.field2249.getInputStream();
        this.field2238 = this.field2249.getOutputStream();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)I", line = 24)
    public final int method753(int arg0) throws IOException {
        field2241++;
        if (arg0 == 0) {
            return this.field2239 ? 0 : this.field2264.available();
        } else {
            return -70;
        }
    }

    @OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V", line = 58)
    protected final void finalize() {
        this.method756(-101);
        field2256++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V", line = 89)
    public static final void method754(byte arg0) {
        field2247++;
        if (!class85.field2106) {
            return;
        }
        class112.field2844 = null;
        class43.field1033 = null;
        class32.field722 = null;
        class88.field2176 = null;
        class58.field1465 = null;
        class79.field2010 = null;
        class70.field1784 = null;
        class119.field2933 = null;
        class41.field999 = null;
        class70.field1781 = null;
        class23.field437 = null;
        class101.field2615 = null;
        class38.field904 = null;
        class131.field3189 = null;
        class79.field1991 = null;
        if (arg0 != -70) {
            return;
        }
        class41.field995 = null;
        class94.field2358 = null;
        class62.field1612 = null;
        class131.field3176 = null;
        class70.field1789 = null;
        class109.field2778 = null;
        class100.field2586 = null;
        class117.method931(553, 10);
        class130.method1016(-28, true);
        class85.field2106 = false;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)I", line = 127)
    public static final int method755(int arg0, int arg1, int arg2) {
        field2254++;
        int var3 = arg0 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        int var6 = -45 % ((-arg1 - 1) / 60);
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V", line = 148)
    public final void method756(int arg0) {
        field2253++;
        if (this.field2239) {
            return;
        }
        synchronized (this) {
            int var3 = -53 / ((arg0 - 32) / 34);
            this.field2239 = true;
            this.notifyAll();
        }
        if (this.field2232 != null) {
            while (this.field2232.field2964 == 0) {
                class13.method86(1L, 1);
            }
            if (this.field2232.field2964 == 1) {
                try {
                    ((Thread) this.field2232.field2959).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2232 = null;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V", line = 189)
    public static void method757(int arg0) {
        field2245 = null;
        if (arg0 != 1978886640) {
            field2258 = null;
        }
        field2250 = null;
        field2257 = null;
        field2246 = null;
        field2222 = null;
        field2234 = null;
        field2224 = null;
        field2240 = null;
        field2243 = null;
        field2223 = null;
        field2252 = null;
        field2258 = null;
        field2225 = null;
        field2248 = null;
        field2229 = null;
        field2262 = null;
        field2242 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIII)V", line = 218)
    public static final void method758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 2048 - arg0 & 0x7FF;
        field2259++;
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg5;
        if (var7 != 0) {
            int var12 = class93.field2345[var7];
            int var13 = class93.field2354[var7];
            int var14 = var10 * var13 - arg5 * var12 >> 16;
            var11 = var10 * var12 + arg5 * var13 >> 16;
            var10 = var14;
        }
        if (var8 != 0) {
            int var15 = class93.field2345[var8];
            int var16 = class93.field2354[var8];
            int var17 = var11 * var15 + var9 * var16 >> 16;
            var11 = var11 * var16 - var9 * var15 >> 16;
            var9 = var17;
        }
        if (arg4 <= 42) {
            method754((byte) -59);
        }
        class84.field2082 = arg2 - var9;
        class37.field889 = arg0;
        class12.field235 = arg6 - var10;
        class111.field2809 = arg3;
        class44.field1057 = arg1 - var11;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)I", line = 272)
    public final int method759(byte arg0) throws IOException {
        field2228++;
        if (arg0 <= 9) {
            method762(38, -91, null, -31);
        }
        return this.field2239 ? 0 : this.field2264.read();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[BII)V", line = 295)
    public final void method760(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2251++;
        if (this.field2239) {
            return;
        }
        if (arg3 != 5000) {
            this.method756(119);
        }
        while (arg2 > 0) {
            int var5 = this.field2264.read(arg1, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II[BI)V", line = 321)
    public final void method761(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2263++;
        if (this.field2239) {
            return;
        }
        if (this.field2231) {
            this.field2231 = false;
            throw new IOException();
        }
        if (this.field2227 == null) {
            this.field2227 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = arg1; var6 < arg0; var6++) {
                this.field2227[this.field2244] = arg2[arg3 + var6];
                this.field2244 = (this.field2244 + 1) % 5000;
                if ((this.field2261 + 4900) % 5000 == this.field2244) {
                    throw new IOException();
                }
            }
            if (this.field2232 == null) {
                this.field2232 = this.field2260.method986(0, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!pa", name = "run", descriptor = "()V", line = 370)
    public final void run() {
        field2235++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2261 == this.field2244) {
                        if (this.field2239) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field2244 >= this.field2261) {
                        var2 = this.field2244 - this.field2261;
                    } else {
                        var2 = 5000 - this.field2261;
                    }
                    var3 = this.field2261;
                }
                if (var2 > 0) {
                    try {
                        this.field2238.write(this.field2227, var3, var2);
                    } catch (IOException var9) {
                        this.field2231 = true;
                    }
                    this.field2261 = (this.field2261 + var2) % 5000;
                    try {
                        if (this.field2261 == this.field2244) {
                            this.field2238.flush();
                        }
                    } catch (IOException var8) {
                        this.field2231 = true;
                    }
                }
            }
            try {
                if (this.field2264 != null) {
                    this.field2264.close();
                }
                if (this.field2238 != null) {
                    this.field2238.close();
                }
                if (this.field2249 != null) {
                    this.field2249.close();
                }
            } catch (IOException var7) {
            }
            this.field2227 = null;
        } catch (Exception var12) {
            class114.method918(12541, null, var12);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILaa;I)V", line = 496)
    public static final void method762(int arg0, int arg1, class2 arg2, int arg3) {
        int var4 = arg0 * arg0 + arg1 * arg1;
        if (arg3 != 20) {
            method758(-22, 77, -105, -8, 12, 22, 69);
        }
        if (var4 > 4225 && var4 < 90000) {
            int var5 = class97.field2455 + class43.field1025 & 0x7FF;
            int var6 = class93.field2345[var5];
            int var7 = var6 * 256 / (field2230 + 256);
            int var8 = class93.field2354[var5];
            int var9 = var8 * 256 / (field2230 + 256);
            int var10 = arg1 * var9 - arg0 * var7 >> 16;
            int var11 = arg0 * var9 + arg1 * var7 >> 16;
            double var12 = Math.atan2((double) var11, (double) var10);
            int var14 = (int) (Math.sin(var12) * 63.0D);
            int var15 = (int) (Math.cos(var12) * 57.0D);
            class76.field1940.method8(var14 + 94 + 4 - 10, 83 - (var15 + 20), 20, 20, 15, 15, var12, 256);
        } else {
            class10.method71((byte) 96, arg1, arg2, arg0);
        }
        field2237++;
    }
}
