import jaggl.OpenGL;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class148 implements Runnable {

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    private int field2255 = 0;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    private int field2262 = 0;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field2264;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    private int field2269;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "[B")
    private byte[] field2257;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field2263;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field2256 = 0;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "Lqaa;")
    public static class27 field2252 = new class27(38, 3);

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "Ldm;")
    public static class50 field2266 = null;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public static int field2268 = 0;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "Lrg;")
    public static class639 field2267;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "Ljava/io/IOException;")
    private IOException field2259;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([FIIIIII)V", line = 3)
    public static final void method1143(float[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2260++;
        if (arg2 > 0 && !class278.method1826((byte) 118, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class278.method1826((byte) 123, arg1)) {
            int var7 = class209.method1468(-6411, arg6);
            if (arg3 > -41) {
                field2266 = null;
            }
            int var8 = 0;
            int var9 = arg1 <= arg2 ? arg1 : arg2;
            int var10 = arg2 >> 1;
            int var11 = arg1 >> 1;
            float[] var12 = arg0;
            float[] var13 = new float[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Df(arg5, var8, arg4, arg2, arg1, 0, arg6, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg2 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var16 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                var12 = var15;
                arg1 = var11;
                arg2 = var10;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 103)
    public final void method1144(int arg0) {
        field2261++;
        synchronized (this) {
            if (this.field2259 == null) {
                this.field2259 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field2263.join();
            if (arg0 <= 98) {
                this.method1144(-106);
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V", line = 128)
    public static void method1145(int arg0) {
        field2252 = null;
        field2267 = null;
        if (arg0 == 27663) {
            field2266 = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[BII)I", line = 140)
    public final int method1146(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2258++;
        if (arg0 < 0 || arg3 < 0 || arg1.length < (arg0 + arg3)) {
            throw new IOException();
        }
        synchronized (this) {
            if (arg2 != -27845) {
                this.run();
            }
            int var6;
            if (this.field2255 > this.field2262) {
                var6 = this.field2269 + this.field2262 - this.field2255;
            } else {
                var6 = this.field2262 - this.field2255;
            }
            if (var6 < arg0) {
                arg0 = var6;
            }
            if (arg0 == 0 && this.field2259 != null) {
                throw new IOException(this.field2259.toString());
            }
            if (this.field2269 < (this.field2255 + arg0)) {
                int var7 = this.field2269 - this.field2255;
                class622.method3597(this.field2257, this.field2255, arg1, arg3, var7);
                class622.method3597(this.field2257, 0, arg1, arg3 + var7, -var7 + arg0);
            } else {
                class622.method3597(this.field2257, this.field2255, arg1, arg3, arg0);
            }
            this.field2255 = (this.field2255 + arg0) % this.field2269;
            this.notifyAll();
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 336)
    public class148(InputStream arg0, int arg1) {
        this.field2264 = arg0;
        this.field2269 = arg1 + 1;
        this.field2257 = new byte[this.field2269];
        this.field2263 = new Thread(this);
        this.field2263.setDaemon(true);
        this.field2263.start();
    }

    @OriginalMember(owner = "client!ho", name = "run", descriptor = "()V", line = 190)
    public final void run() {
        field2253++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2259 != null) {
                        return;
                    }
                    if (this.field2255 == 0) {
                        var2 = this.field2269 - this.field2262 - 1;
                    } else if (this.field2255 >= this.field2262) {
                        var2 = this.field2255 - this.field2262 - 1;
                    } else {
                        var2 = this.field2269 - this.field2262;
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
                var3 = this.field2264.read(this.field2257, this.field2262, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field2259 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field2262 = (this.field2262 + var3) % this.field2269;
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V", line = 251)
    public static final void method1147(int arg0) {
        class483.field6841 = null;
        class435.field6079 = -1;
        class609.field8824 = -1;
        if (arg0 != 1) {
            method1147(-65);
        }
        class32.field424 = -1;
        field2251++;
        class501.field7165 = -1;
        class154.field2309 = null;
        class168.field2469 = null;
        class160.field2389 = null;
        class224.field3198 = null;
        class594.field8540 = null;
        class724.field10127 = null;
        class330.field4668.method3128(arg0 - 3);
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V", line = 273)
    public final void method1148(int arg0) {
        this.field2264 = new class651();
        field2265++;
        if (arg0 != 22708) {
            method1147(-15);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)Z", line = 288)
    public final boolean method1149(int arg0, int arg1) throws IOException {
        field2254++;
        if (arg0 <= 0 || arg0 >= this.field2269) {
            throw new IOException();
        }
        synchronized (this) {
            if (arg1 > -70) {
                this.field2264 = null;
            }
            int var4;
            if (this.field2255 > this.field2262) {
                var4 = this.field2269 + this.field2262 - this.field2255;
            } else {
                var4 = this.field2262 - this.field2255;
            }
            if (arg0 <= var4) {
                return true;
            } else if (this.field2259 == null) {
                return false;
            } else {
                throw new IOException(this.field2259.toString());
            }
        }
    }
}
