import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class181 implements Runnable {

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    private int field2747 = 0;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    private int field2762 = 0;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "Z")
    private boolean field2752 = false;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "Z")
    private boolean field2763 = false;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "Ljava/net/Socket;")
    private Socket field2753;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Lhf;")
    private class154 field2742;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "Ljava/io/InputStream;")
    private InputStream field2764;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2745;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field2749 = 0;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "[J")
    public static long[] field2746 = new long[1000];

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "Z")
    public static boolean field2765 = true;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "Lma;")
    public static class5 field2768 = class12.method119("<col=ff9040>", (byte) 80);

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "F")
    public static float field2759;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "Lni;")
    public static class202 field2767;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "Loi;")
    private class32 field2756;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "[B")
    private byte[] field2755;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "[I")
    public static int[] field2751;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "[I")
    public static int[] field2754;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "[[[I")
    public static int[][][] field2769;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)I", line = 15)
    public final int method1179(int arg0) throws IOException {
        field2757++;
        if (arg0 != 0) {
            this.finalize();
        }
        return this.field2763 ? 0 : this.field2764.read();
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)I", line = 30)
    public final int method1180(boolean arg0) throws IOException {
        if (arg0) {
            this.field2745 = (OutputStream) null;
        }
        field2744++;
        return this.field2763 ? 0 : this.field2764.available();
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIZII)V", line = 60)
    public static final void method1181(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        int var8 = 0;
        field2760++;
        if (arg5) {
            return;
        }
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg2 - arg4;
        int var12 = arg0 - arg4;
        int var13 = arg2 * arg2;
        int var14 = arg0 * arg0;
        int var15 = var14 << 1;
        int var16 = var11 * var11;
        int var17 = var12 * var12;
        int var18 = var13 << 1;
        int var19 = var17 << 1;
        int var20 = var12 << 1;
        int var21 = var16 << 1;
        int var22 = arg0 << 1;
        int var23 = (1 - var20) * var16 + var19;
        int var24 = var14 - ((var22 - 1) * var18);
        int var25 = var17 - (var20 - 1) * var21;
        int var26 = (1 - var22) * var13 + var15;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var16 << 2;
        int var30 = var17 << 2;
        int var31 = var15 * 3;
        int var32 = (var22 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var20 - 3) * var21;
        int var35 = (arg0 - 1) * var27;
        int var36 = var28;
        int var37 = (var12 - 1) * var29;
        int var38 = var30;
        if (arg7 >= class294.field4956 && class101.field1505 >= arg7) {
            int[] var39 = class137.field2032[arg7];
            int var40 = class76.method533(class57.field899, arg1 - arg2, true, class301.field5073);
            int var41 = class76.method533(class57.field899, arg1 + arg2, true, class301.field5073);
            int var42 = class76.method533(class57.field899, arg1 - var11, true, class301.field5073);
            int var43 = class76.method533(class57.field899, arg1 + var11, true, class301.field5073);
            class239.method1690(var40, 23267, var42, var39, arg6);
            class239.method1690(var42, 23267, var43, var39, arg3);
            class239.method1690(var43, 23267, var41, var39, arg6);
        }
        while (var9 > 0) {
            if (var26 < 0) {
                while (var26 < 0) {
                    var24 += var36;
                    var26 += var31;
                    var8++;
                    var31 += var28;
                    var36 += var28;
                }
            }
            if (var24 < 0) {
                var26 += var31;
                var31 += var28;
                var8++;
                var24 += var36;
                var36 += var28;
            }
            var26 += -var35;
            var24 += -var32;
            var32 -= var27;
            boolean var44 = var12 >= var9;
            var9--;
            var35 -= var27;
            if (var44) {
                if (var23 < 0) {
                    while (var23 < 0) {
                        var10++;
                        var25 += var38;
                        var38 += var30;
                        var23 += var33;
                        var33 += var30;
                    }
                }
                if (var25 < 0) {
                    var10++;
                    var25 += var38;
                    var38 += var30;
                    var23 += var33;
                    var33 += var30;
                }
                var23 += -var37;
                var37 -= var29;
                var25 += -var34;
                var34 -= var29;
            }
            int var45 = arg7 + var9;
            int var46 = arg7 - var9;
            if (class294.field4956 <= var45 && var46 <= class101.field1505) {
                int var47 = class76.method533(class57.field899, arg1 + var8, true, class301.field5073);
                int var48 = class76.method533(class57.field899, arg1 - var8, true, class301.field5073);
                if (var44) {
                    int var49 = class76.method533(class57.field899, arg1 + var10, true, class301.field5073);
                    int var50 = class76.method533(class57.field899, arg1 - var10, true, class301.field5073);
                    if (class294.field4956 <= var46) {
                        int[] var51 = class137.field2032[var46];
                        class239.method1690(var48, 23267, var50, var51, arg6);
                        class239.method1690(var50, 23267, var49, var51, arg3);
                        class239.method1690(var49, 23267, var47, var51, arg6);
                    }
                    if (class101.field1505 >= var45) {
                        int[] var52 = class137.field2032[var45];
                        class239.method1690(var48, 23267, var50, var52, arg6);
                        class239.method1690(var50, 23267, var49, var52, arg3);
                        class239.method1690(var49, 23267, var47, var52, arg6);
                    }
                } else {
                    if (class294.field4956 <= var46) {
                        class239.method1690(var48, 23267, var47, class137.field2032[var46], arg6);
                    }
                    if (class101.field1505 >= var45) {
                        class239.method1690(var48, 23267, var47, class137.field2032[var45], arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V", line = 263)
    public static final void method1182(byte arg0) {
        field2748++;
        int var1 = -94 / ((arg0 - 1) / 57);
        int var2 = class200.method1313(0);
        if (var2 == 0) {
            class141.field2081 = (byte[][][]) null;
            class141.method906(0, 0);
        } else if (var2 == 1) {
            class80.method548((byte) 0, -4);
            class141.method906(512, -101);
            class189.method1241(0);
        } else {
            class80.method548((byte) (class60.field938 - 4 & 0xFF), -4);
            class141.method906(2, -38);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III[B)V", line = 293)
    public final void method1183(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2766++;
        if (this.field2763) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field2764.read(arg3, arg1, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg1 += var5;
        }
        if (arg2 != -14925) {
            this.field2742 = (class154) null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "finalize", descriptor = "()V", line = 320)
    protected final void finalize() {
        field2758++;
        this.method1184(false);
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Ljava/net/Socket;Lhf;)V", line = 540)
    public class181(Socket arg0, class154 arg1) throws IOException {
        this.field2753 = arg0;
        this.field2742 = arg1;
        this.field2753.setSoTimeout(30000);
        this.field2753.setTcpNoDelay(true);
        this.field2764 = this.field2753.getInputStream();
        this.field2745 = this.field2753.getOutputStream();
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(Z)V", line = 346)
    public final void method1184(boolean arg0) {
        field2743++;
        if (this.field2763) {
            return;
        }
        synchronized (this) {
            this.field2763 = true;
            this.notifyAll();
        }
        if (arg0) {
            this.finalize();
        }
        if (this.field2756 != null) {
            while (this.field2756.field497 == 0) {
                class116.method759(-1, 1L);
            }
            if (this.field2756.field497 == 1) {
                try {
                    ((Thread) this.field2756.field496).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field2756 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II[BI)V", line = 390)
    public final void method1185(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2750++;
        if (this.field2763) {
            return;
        }
        if (this.field2752) {
            this.field2752 = false;
            throw new IOException();
        }
        if (this.field2755 == null) {
            this.field2755 = new byte[5000];
        }
        synchronized (this) {
            if (arg0 != -22036) {
                this.finalize();
            }
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field2755[this.field2762] = arg2[arg3 + var6];
                this.field2762 = (this.field2762 + 1) % 5000;
                if (((this.field2747 + 4900) % 5000) == this.field2762) {
                    throw new IOException();
                }
            }
            if (this.field2756 == null) {
                this.field2756 = this.field2742.method991(this, false, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!sj", name = "run", descriptor = "()V", line = 449)
    public final void run() {
        field2761++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field2762 == this.field2747) {
                        if (this.field2763) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    if (this.field2747 > this.field2762) {
                        var3 = 5000 - this.field2747;
                    } else {
                        var3 = this.field2762 - this.field2747;
                    }
                    var4 = this.field2747;
                }
                if (var3 > 0) {
                    try {
                        this.field2745.write(this.field2755, var4, var3);
                    } catch (IOException var12) {
                        this.field2752 = true;
                    }
                    this.field2747 = (this.field2747 + var3) % 5000;
                    try {
                        if (this.field2762 == this.field2747) {
                            this.field2745.flush();
                        }
                    } catch (IOException var11) {
                        this.field2752 = true;
                    }
                }
            }
            try {
                if (this.field2764 != null) {
                    this.field2764.close();
                }
                if (this.field2745 != null) {
                    this.field2745.close();
                }
                if (this.field2753 != null) {
                    this.field2753.close();
                }
            } catch (IOException var10) {
            }
            this.field2755 = null;
        } catch (Exception var15) {
            class98.method630((String) null, -112, var15);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V", line = 520)
    public static void method1186(int arg0) {
        if (arg0 != 578550114) {
            method1186(-31);
        }
        field2754 = null;
        field2769 = (int[][][]) null;
        field2746 = null;
        field2767 = null;
        field2751 = null;
        field2768 = null;
    }
}
