import java.awt.Image;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class214 implements Runnable {

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    private int field2820 = 0;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    private int field2818 = 0;

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2832;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    private int field2823;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "[B")
    private byte[] field2821;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field2824;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "Ljava/awt/Image;")
    public static Image field2819;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "Ljava/io/IOException;")
    private IOException field2828;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "[I")
    public static int[] field2822;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
    public static final void method1413(byte arg0) {
        field2827++;
        class239 var1 = class332.field4802;
        synchronized (class332.field4802) {
            class332.field4802.method1552(125);
            if (arg0 > -68) {
                method1415(107, 121, 19, 57, -124, -73);
            }
        }
        class239 var2 = class87.field1228;
        synchronized (class87.field1228) {
            class87.field1228.method1552(93);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[FIIIIII[FFIIFF)V")
    public static final void method1414(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float[] arg8, float arg9, int arg10, int arg11, float arg12, float arg13) {
        int var14 = arg11 - arg3;
        int var15 = arg10 - arg4;
        int var16 = arg5 - arg6;
        field2817++;
        float var17 = arg8[2] * (float) var15 + arg8[0] * (float) var16 + arg8[1] * (float) var14;
        float var18 = arg8[5] * (float) var15 + arg8[4] * (float) var14 + arg8[3] * (float) var16;
        float var19 = arg8[8] * (float) var15 + arg8[7] * (float) var14 + arg8[6] * (float) var16;
        float var20;
        float var21;
        if (arg0 == 0) {
            var21 = arg9 + 0.5F - var19;
            var20 = arg12 + var17 + 0.5F;
        } else if (arg0 == 1) {
            var20 = arg12 + var17 + 0.5F;
            var21 = arg9 + var19 + 0.5F;
        } else if (arg0 == 2) {
            var20 = arg12 + 0.5F - var17;
            var21 = arg13 + 0.5F - var18;
        } else if (arg0 == 3) {
            var21 = arg13 + 0.5F - var18;
            var20 = arg12 + var17 + 0.5F;
        } else if (arg0 == 4) {
            var20 = arg9 + var19 + 0.5F;
            var21 = arg13 + 0.5F - var18;
        } else {
            var20 = arg9 + 0.5F - var19;
            var21 = arg13 + 0.5F - var18;
        }
        if (arg2 == 1) {
            float var22 = var20;
            var20 = -var21;
            var21 = var22;
        } else if (arg2 == 2) {
            var21 = -var21;
            var20 = -var20;
        } else if (arg2 == 3) {
            float var23 = var20;
            var20 = var21;
            var21 = -var23;
        }
        arg1[1] = var21;
        arg1[arg7] = var20;
    }

    @OriginalMember(owner = "client!fq", name = "run", descriptor = "()V")
    public final void run() {
        field2826++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field2828 != null) {
                        return;
                    }
                    if (this.field2820 > this.field2818) {
                        var2 = this.field2823 + this.field2818 - this.field2820;
                    } else {
                        var2 = this.field2818 - this.field2820;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.field2832.flush();
                    } catch (IOException var16) {
                        this.field2828 = var16;
                        return;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var15) {
                    }
                }
            }
            try {
                if (this.field2823 < (this.field2820 + var2)) {
                    int var4 = this.field2823 - this.field2820;
                    this.field2832.write(this.field2821, this.field2820, var4);
                    this.field2832.write(this.field2821, 0, var2 - var4);
                } else {
                    this.field2832.write(this.field2821, this.field2820, var2);
                }
            } catch (IOException var18) {
                IOException var5 = var18;
                synchronized (this) {
                    this.field2828 = var5;
                    return;
                }
            }
            synchronized (this) {
                this.field2820 = (this.field2820 + var2) % this.field2823;
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIIII)V")
    public static final void method1415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2825++;
        int var6 = arg2 - arg4;
        int var7 = arg1 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class443.method2664(arg3, arg4, arg5, 84, arg1);
            }
        } else if (var7 == 0) {
            class468.method2765((byte) -102, arg5, arg3, arg2, arg4);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg4 * var8 >> 12);
            if (arg0 < 65) {
                field2822 = null;
            }
            int var10;
            int var11;
            if (arg4 < class174.field2335) {
                var10 = (class174.field2335 * var8 >> 12) + var9;
                var11 = class174.field2335;
            } else if (class751.field10402 < arg4) {
                var11 = class751.field10402;
                var10 = (class751.field10402 * var8 >> 12) + var9;
            } else {
                var10 = arg3;
                var11 = arg4;
            }
            int var12;
            int var13;
            if (arg2 < class174.field2335) {
                var12 = (class174.field2335 * var8 >> 12) + var9;
                var13 = class174.field2335;
            } else if (arg2 <= class751.field10402) {
                var12 = arg1;
                var13 = arg2;
            } else {
                var12 = (class751.field10402 * var8 >> 12) + var9;
                var13 = class751.field10402;
            }
            if (var12 < class523.field7178) {
                var13 = (class523.field7178 - var9 << 12) / var8;
                var12 = class523.field7178;
            } else if (class495.field6845 < var12) {
                var12 = class495.field6845;
                var13 = (class495.field6845 - var9 << 12) / var8;
            }
            if (class523.field7178 > var10) {
                var11 = (class523.field7178 - var9 << 12) / var8;
                var10 = class523.field7178;
            } else if (var10 > class495.field6845) {
                var10 = class495.field6845;
                var11 = (class495.field6845 - var9 << 12) / var8;
            }
            class296.method1879(arg5, true, var10, var12, var13, var11);
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)V")
    public final void method1416(byte arg0) {
        if (arg0 < 14) {
            this.field2820 = 72;
        }
        synchronized (this) {
            if (this.field2828 == null) {
                this.field2828 = new IOException("");
            }
            this.notifyAll();
        }
        field2831++;
        try {
            this.field2824.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[BII)V")
    public final void method1417(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2829++;
        if (arg3 < 0 || arg0 < 0 || arg0 + arg3 > arg1.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field2828 != null) {
                throw new IOException(this.field2828.toString());
            }
            int var6;
            if (this.field2820 > this.field2818) {
                var6 = this.field2820 - this.field2818 - 1;
            } else {
                var6 = this.field2820 + this.field2823 - this.field2818 - 1;
            }
            if (arg3 > var6) {
                throw new IOException("");
            }
            if ((this.field2818 + arg3) > this.field2823) {
                int var7 = this.field2823 - this.field2818;
                class278.method1796(arg1, arg0, this.field2821, this.field2818, var7);
                class278.method1796(arg1, arg0 + var7, this.field2821, 0, arg3 - var7);
            } else {
                class278.method1796(arg1, arg0, this.field2821, this.field2818, arg3);
            }
            this.field2818 = (this.field2818 + arg3) % this.field2823;
            this.notifyAll();
            if (arg2 != 0) {
                this.method1418(-19);
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public final void method1418(int arg0) {
        int var2 = 29 % ((arg0 + 7) / 35);
        field2830++;
        this.field2832 = new class154();
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(B)V")
    public static void method1419(byte arg0) {
        field2819 = null;
        field2822 = null;
        if (arg0 > -78) {
            field2819 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class214(OutputStream arg0, int arg1) {
        this.field2832 = arg0;
        this.field2823 = arg1 + 1;
        this.field2821 = new byte[this.field2823];
        this.field2824 = new Thread(this);
        this.field2824.setDaemon(true);
        this.field2824.start();
    }
}
