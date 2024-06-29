import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class340 implements Runnable {

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "Z")
    private boolean field4969 = false;

    @OriginalMember(owner = "client!wha", name = "f", descriptor = "I")
    private int field4973 = 0;

    @OriginalMember(owner = "client!wha", name = "q", descriptor = "Z")
    private boolean field4984 = false;

    @OriginalMember(owner = "client!wha", name = "y", descriptor = "I")
    private int field4992 = 0;

    @OriginalMember(owner = "client!wha", name = "A", descriptor = "Ljava/net/Socket;")
    private Socket field4994;

    @OriginalMember(owner = "client!wha", name = "d", descriptor = "Lfc;")
    private class731 field4971;

    @OriginalMember(owner = "client!wha", name = "g", descriptor = "Ljava/io/InputStream;")
    private InputStream field4974;

    @OriginalMember(owner = "client!wha", name = "i", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4976;

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "I")
    private int field4970;

    @OriginalMember(owner = "client!wha", name = "m", descriptor = "[F")
    public static float[] field4980 = new float[16384];

    @OriginalMember(owner = "client!wha", name = "x", descriptor = "[F")
    public static float[] field4991 = new float[16384];

    @OriginalMember(owner = "client!wha", name = "C", descriptor = "Lnf;")
    public static class19 field4996;

    @OriginalMember(owner = "client!wha", name = "D", descriptor = "[I")
    public static int[] field4997;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!wha", name = "h", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!wha", name = "j", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!wha", name = "k", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!wha", name = "l", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!wha", name = "n", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!wha", name = "o", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!wha", name = "p", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!wha", name = "r", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!wha", name = "s", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!wha", name = "t", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!wha", name = "v", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!wha", name = "w", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!wha", name = "z", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!wha", name = "B", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!wha", name = "e", descriptor = "Leha;")
    private class162 field4972;

    @OriginalMember(owner = "client!wha", name = "E", descriptor = "Ltm;")
    public static class334 field4998;

    @OriginalMember(owner = "client!wha", name = "u", descriptor = "[B")
    private byte[] field4988;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IILjl;II)V")
    public static final void method2164(int arg0, int arg1, class595 arg2, int arg3, int arg4) {
        field4993++;
        if (arg3 != -1) {
            method2176(52, null, null, null, null);
        }
        for (class447 var5 = (class447) class19.field197.method3463((byte) -50); var5 != null; var5 = (class447) class19.field197.method3469((byte) 107)) {
            if (var5.field6523 == arg0 && arg1 << 9 == var5.field6511 && (arg4 << 9) == var5.field6502 && var5.field6524.field8386 == arg2.field8386) {
                if (var5.field6518 != null) {
                    class324.field4793.method2223(var5.field6518);
                    var5.field6518 = null;
                }
                if (var5.field6509 != null) {
                    class324.field4793.method2223(var5.field6509);
                    var5.field6509 = null;
                }
                var5.method636((byte) 97);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(Z)V")
    public final void method2165(boolean arg0) {
        field4977++;
        if (this.field4969) {
            return;
        }
        synchronized (this) {
            this.field4969 = true;
            this.notifyAll();
        }
        if (this.field4972 != null) {
            while (this.field4972.field2512 == 0) {
                class484.method2932(!arg0, 1L);
            }
            if (this.field4972.field2512 == 1) {
                try {
                    ((Thread) this.field4972.field2517).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field4972 = null;
        if (arg0) {
            method2167(127, -27);
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(III[B)V")
    public final void method2166(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field4975++;
        if (this.field4969) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field4974.read(arg3, arg2, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg1 -= var5;
        }
        if (arg0 != -1) {
            method2170(-15, 68, -116, -49, 90, 89, 123, -96, -16, -90);
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(II)V")
    public static final void method2167(int arg0, int arg1) {
        class577.field8182 = -1;
        class560.field7944 = -1;
        class140.field2198 = null;
        class730.field10244 = arg1;
        field4968++;
        class540.field7712 = arg0;
        class259.field4052 = null;
        class371.field5634 = false;
        class442.field6421 = 1;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
    public static void method2168(int arg0) {
        field4998 = null;
        field4997 = null;
        field4996 = null;
        field4980 = null;
        if (arg0 != 100) {
            field4996 = null;
        }
        field4991 = null;
    }

    @OriginalMember(owner = "client!wha", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4979++;
        this.method2165(false);
    }

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)V")
    public final void method2169(int arg0) {
        field4986++;
        if (this.field4969) {
            return;
        }
        this.field4974 = new class560();
        this.field4976 = new class242();
        if (arg0 >= -108) {
            this.field4992 = -49;
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 86 % ((arg9 - 37) / 39);
        if (arg1 == arg4 && arg0 == arg2 && arg3 == arg5 && arg6 == arg7) {
            class399.method2466(arg8, arg5, arg6, -1, arg4, arg0);
        } else {
            int var11 = arg4;
            int var12 = arg0;
            int var13 = arg4 * 3;
            int var14 = arg0 * 3;
            int var15 = arg1 * 3;
            int var16 = arg2 * 3;
            int var17 = arg3 * 3;
            int var18 = arg7 * 3;
            int var19 = var15 + arg5 - arg4 - var17;
            int var20 = arg6 + var16 - var18 - arg0;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 + var18 - var16 - var16;
            int var23 = var15 - var13;
            int var24 = var16 - var14;
            for (int var25 = 128; var25 <= 4096; var25 += 128) {
                int var26 = var25 * var25 >> 12;
                int var27 = var25 * var26 >> 12;
                int var28 = var19 * var27;
                int var29 = var20 * var27;
                int var30 = var21 * var26;
                int var31 = var22 * var26;
                int var32 = var23 * var25;
                int var33 = var24 * var25;
                int var34 = (var28 + var30 + var32 >> 12) + arg4;
                int var35 = (var29 + var31 + var33 >> 12) + arg0;
                class399.method2466(arg8, var34, var35, -1, var11, var12);
                var12 = var35;
                var11 = var34;
            }
        }
        field4985++;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I[BII)V")
    public final void method2171(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4989++;
        if (this.field4969) {
            return;
        }
        if (this.field4984) {
            this.field4984 = false;
            throw new IOException();
        }
        if (this.field4988 == null) {
            this.field4988 = new byte[this.field4970];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field4988[this.field4973] = arg1[arg0 + var6];
                this.field4973 = (this.field4973 + 1) % this.field4970;
                if (((this.field4970 + this.field4992 - 100) % this.field4970) == this.field4973) {
                    throw new IOException();
                }
            }
            if (arg2 == 1) {
                if (this.field4972 == null) {
                    this.field4972 = this.field4971.method4066(-24533, this, 3);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class251[] var7 = class541.field7732;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class251 var9 = var7[var8];
            if (var9 != null && var9.field3993 == 2) {
                class165.method1233(arg1, var9.field4000, var9.field3995, arg0, var9.field3996, (byte) -117, arg3 >> 1, var9.field3997 * 2, arg6 >> 1);
                if (class457.field6635[0] > -1 && class199.field3403 % 20 < 10) {
                    class34 var10 = class466.field6800[var9.field3991];
                    int var11 = arg4 - (12 - class457.field6635[0]);
                    int var12 = class457.field6635[1] + arg2 - 28;
                    var10.method182(var11, var12);
                    class438.method2696(var12, var10.method184() + var12, var11 + var10.method177(), (byte) 90, var11);
                }
            }
        }
        if (arg5 == 20) {
            field4990++;
        }
    }

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "(I)I")
    public final int method2173(int arg0) throws IOException {
        field4983++;
        if (arg0 <= 20) {
            this.field4969 = false;
        }
        return this.field4969 ? 0 : this.field4974.available();
    }

    @OriginalMember(owner = "client!wha", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field4992 == this.field4973) {
                            if (this.field4969) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field4992 > this.field4973) {
                            var2 = this.field4970 - this.field4992;
                        } else {
                            var2 = this.field4973 - this.field4992;
                        }
                        var3 = this.field4992;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field4976.write(this.field4988, var3, var2);
                    } catch (IOException var9) {
                        this.field4984 = true;
                    }
                    this.field4992 = (this.field4992 + var2) % this.field4970;
                    try {
                        if (this.field4992 == this.field4973) {
                            this.field4976.flush();
                        }
                    } catch (IOException var8) {
                        this.field4984 = true;
                    }
                    continue;
                }
                try {
                    if (this.field4974 != null) {
                        this.field4974.close();
                    }
                    if (this.field4976 != null) {
                        this.field4976.close();
                    }
                    if (this.field4994 != null) {
                        this.field4994.close();
                    }
                } catch (IOException var7) {
                }
                this.field4988 = null;
                break;
            }
        } catch (Exception var12) {
            class333.method2135(var12, null, -105);
        }
        field4982++;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)V")
    public final void method2174(byte arg0) throws IOException {
        field4978++;
        if (this.field4969) {
            return;
        }
        if (this.field4984) {
            this.field4984 = false;
            throw new IOException();
        } else if (arg0 != 27) {
            method2167(89, 13);
        }
    }

    @OriginalMember(owner = "client!wha", name = "d", descriptor = "(I)I")
    public final int method2175(int arg0) throws IOException {
        field4981++;
        if (arg0 != -28) {
            method2170(-26, 76, 113, -15, -13, -86, 111, -120, -109, -15);
        }
        return this.field4969 ? 0 : this.field4974.read();
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(ILla;Lla;Lla;Lla;)V")
    public static final void method2176(int arg0, class422 arg1, class422 arg2, class422 arg3, class422 arg4) {
        class334.field4889 = arg2;
        class567.field8046 = arg4;
        field4995++;
        class478.field6932 = arg1;
        class158.field2453 = new class353[class334.field4889.method2628(38)][];
        if (arg0 == 2493) {
            class229.field3705 = new boolean[class334.field4889.method2628(-104)];
        }
    }

    @OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Ljava/net/Socket;Lfc;I)V")
    public class340(Socket arg0, class731 arg1, int arg2) throws IOException {
        this.field4994 = arg0;
        this.field4971 = arg1;
        this.field4994.setSoTimeout(30000);
        this.field4994.setTcpNoDelay(true);
        this.field4974 = this.field4994.getInputStream();
        this.field4976 = this.field4994.getOutputStream();
        this.field4970 = arg2;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(BIII)I")
    public static final int method2177(byte arg0, int arg1, int arg2, int arg3) {
        field4987++;
        if (class612.field8632 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = 76 % ((arg0 + 78) / 48);
        int var7 = arg3 - class729.field10228;
        int var8 = arg2 - class729.field10239;
        for (class302 var9 = (class302) class729.field10210.method3463((byte) -50); var9 != null; var9 = (class302) class729.field10210.method3469((byte) 107)) {
            if (var9.field4601 == arg1) {
                int var10 = var9.field4604;
                int var11 = var9.field4605;
                int var12 = class729.field10239 + var11 | class729.field10228 + var10 << 14;
                int var13 = (var7 - var10) * (var7 - var10) + (var8 - var11) * (var8 - var11);
                if (var4 < 0 || var5 > var13) {
                    var5 = var13;
                    var4 = var12;
                }
            }
        }
        return var4;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4980[var2] = (float) Math.sin((double) var2 * var0);
            field4991[var2] = (float) Math.cos((double) var2 * var0);
        }
        field4996 = new class19();
        field4997 = new int[1];
    }
}
