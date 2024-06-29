import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class182 implements Runnable {

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    private int field2859 = 0;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    private int field2867 = 0;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Z")
    private boolean field2864 = false;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "Z")
    private boolean field2879 = false;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Lvd;")
    private class4 field2861;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Ljava/net/Socket;")
    private Socket field2863;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Ljava/io/InputStream;")
    private InputStream field2853;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2856;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field2869 = -1;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lng;")
    public static class79 field2854 = new class79();

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field2874 = -2;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "Z")
    public static boolean field2877 = true;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "J")
    public static long field2880 = 0L;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public static int field2876 = 0;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "Lfc;")
    public static class125 field2875;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Lac;")
    private class139 field2855;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Lvh;")
    public static class292 field2858;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "[B")
    private byte[] field2866;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "[I")
    public static int[] field2878;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[BB)V")
    public final void method1299(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        if (arg3 < 123) {
            field2876 = 65;
        }
        field2862++;
        if (this.field2879) {
            return;
        }
        if (this.field2864) {
            this.field2864 = false;
            throw new IOException();
        }
        if (this.field2866 == null) {
            this.field2866 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field2866[this.field2867] = arg2[arg0 + var6];
                this.field2867 = (this.field2867 + 1) % 5000;
                if ((this.field2859 + 4900) % 5000 == this.field2867) {
                    throw new IOException();
                }
            }
            if (this.field2855 == null) {
                this.field2855 = this.field2861.method25(false, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)I")
    public static final int method1300(int arg0) {
        field2868++;
        if (arg0 != 0) {
            field2876 = 119;
        }
        return (class84.field1259 << 17) + (client.field2386 & 0x3 << 11) + ((class106.field1665 ? 1 : 0) << 9) + ((class178.field2730 ? 1 : 0) << 8) + ((class140.field2089 ? 1 : 0) << 7) + ((class201.field3105 ? 1 : 0) << 6) + ((class122.field1835 ? 1 : 0) << 3) + (class150.field2228 & 0x7) - (-((class109.field1685 ? 1 : 0) << 4) + -((class292.field4536 ? 1 : 0) << 5) - ((class216.field3309 ? 1 : 0) << 10) - (((class142.field2111 ? 1 : 0) << 13) - (-((class218.field3335 ? 1 : 0) << 15) + -((class40.field678 ? 1 : 0) << 16)) + ((class189.field2971 ? 1 : 0) << 19) + ((class174.field2684 == 0 ? 0 : 1) << 20) + ((class85.field1274 == 0 ? 0 : 1) << 21) - -((class70.field1106 == 0 ? 0 : 1) << 22) + (class249.method1685() << 23)));
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III[B)V")
    public final void method1301(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2870++;
        if (this.field2879) {
            return;
        }
        while (arg2 > 0) {
            int var6 = this.field2853.read(arg3, arg0, arg2);
            if (var6 <= 0) {
                throw new EOFException();
            }
            arg0 += var6;
            arg2 -= var6;
        }
        int var5 = -97 % ((arg1 + 74) / 40);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)I")
    public final int method1302(int arg0) throws IOException {
        field2852++;
        if (this.field2879) {
            return 0;
        } else {
            int var2 = -11 % ((27 - arg0) / 57);
            return this.field2853.available();
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILcc;IIIII)V")
    public static final void method1303(int arg0, int arg1, class222 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2850++;
        int var8 = arg1 * arg1 + arg4 * arg4;
        if (arg5 < var8) {
            return;
        }
        int var9 = 80 % ((21 - arg7) / 34);
        int var10 = Math.min(arg2.field3408 / 2, arg2.field3561 / 2);
        if (var10 * var10 >= var8) {
            class152.method1100(true, class152.field2242[arg0], arg3, arg4, arg6, arg2, arg1);
            return;
        }
        var10 -= 10;
        int var11 = (int) class50.field818 + class67.field1057 & 0x7FF;
        int var12 = class224.field3601[var11];
        int var13 = var12 * 256 / (class285.field4487 + 256);
        int var14 = class224.field3597[var11];
        int var15 = var14 * 256 / (class285.field4487 + 256);
        int var16 = arg1 * var15 - arg4 * var13 >> 16;
        int var17 = arg1 * var13 + arg4 * var15 >> 16;
        double var18 = Math.atan2((double) var17, (double) var16);
        int var20 = (int) (Math.sin(var18) * (double) var10);
        int var21 = (int) (Math.cos(var18) * (double) var10);
        ((class51) class176.field2723[arg0]).method437(arg2.field3408 / 2 + var20 + arg3 - 10, arg2.field3561 / 2 + arg6 + -var21 + -10, 20, 20, 15, 15, var18, 256);
    }

    @OriginalMember(owner = "client!bc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2860++;
        this.method1306((byte) -36);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILcc;ZB)V")
    public static final void method1304(int arg0, int arg1, class222 arg2, boolean arg3, byte arg4) {
        int var5 = arg2.field3408;
        if (arg2.field3428 == 0) {
            arg2.field3408 = arg2.field3487;
        } else if (arg2.field3428 == 1) {
            arg2.field3408 = arg1 - arg2.field3487;
        } else if (arg2.field3428 == 2) {
            arg2.field3408 = arg2.field3487 * arg1 >> 14;
        } else if (arg2.field3428 == 3) {
            if (arg2.field3552 == 2) {
                arg2.field3408 = (arg2.field3487 - 1) * arg2.field3547 + arg2.field3487 * 32;
            } else if (arg2.field3552 == 7) {
                arg2.field3408 = (arg2.field3487 - 1) * arg2.field3547 + arg2.field3487 * 115;
            }
        }
        field2857++;
        int var6 = arg2.field3561;
        if (arg2.field3398 == 0) {
            arg2.field3561 = arg2.field3479;
        } else if (arg2.field3398 == 1) {
            arg2.field3561 = arg0 - arg2.field3479;
        } else if (arg2.field3398 == 2) {
            arg2.field3561 = arg2.field3479 * arg0 >> 14;
        } else if (arg2.field3398 == 3) {
            if (arg2.field3552 == 2) {
                arg2.field3561 = (arg2.field3479 - 1) * arg2.field3410 + arg2.field3479 * 32;
            } else if (arg2.field3552 == 7) {
                arg2.field3561 = (arg2.field3479 - 1) * arg2.field3410 + arg2.field3479 * 12;
            }
        }
        if (arg2.field3428 == 4) {
            arg2.field3408 = arg2.field3561 * arg2.field3437 / arg2.field3390;
        }
        if (arg2.field3398 == 4) {
            arg2.field3561 = arg2.field3408 * arg2.field3390 / arg2.field3437;
        }
        if (arg4 >= -97) {
            field2874 = 118;
        }
        if (class136.field2057 && (client.method1159(arg2).field477 != 0 || arg2.field3552 == 0)) {
            if (arg2.field3561 < 5 && arg2.field3408 < 5) {
                arg2.field3561 = 5;
                arg2.field3408 = 5;
            } else {
                if (arg2.field3408 <= 0) {
                    arg2.field3408 = 5;
                }
                if (arg2.field3561 <= 0) {
                    arg2.field3561 = 5;
                }
            }
        }
        if (arg2.field3388 == 1337) {
            class308.field4938 = arg2;
        }
        if (arg3 && arg2.field3435 != null && arg2.field3408 != var5 || arg2.field3561 != var6) {
            class26 var7 = new class26();
            var7.field453 = arg2;
            var7.field450 = arg2.field3435;
            class49.field801.method12(var7, 12);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public final void method1305(boolean arg0) throws IOException {
        field2851++;
        if (this.field2879) {
            return;
        }
        if (this.field2864) {
            this.field2864 = false;
            throw new IOException();
        } else if (!arg0) {
            this.field2856 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public final void method1306(byte arg0) {
        field2871++;
        if (this.field2879) {
            return;
        }
        synchronized (this) {
            this.field2879 = true;
            if (arg0 >= -25) {
                method1304(-41, -112, (class222) null, false, (byte) 47);
            }
            this.notifyAll();
        }
        if (this.field2855 != null) {
            while (this.field2855.field2082 == 0) {
                class122.method922(1L, (byte) -100);
            }
            if (this.field2855.field2082 == 1) {
                try {
                    ((Thread) this.field2855.field2080).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2855 = null;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
    public static void method1307(byte arg0) {
        field2878 = null;
        if (arg0 != 38) {
            field2858 = null;
        }
        field2875 = null;
        field2854 = null;
        field2858 = null;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public final void method1308(int arg0) {
        if (arg0 != 770) {
            this.method1306((byte) -25);
        }
        field2865++;
        if (!this.field2879) {
            this.field2853 = new class266();
            this.field2856 = new class159();
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)I")
    public final int method1309(byte arg0) throws IOException {
        int var2 = 51 / ((63 - arg0) / 57);
        field2873++;
        return this.field2879 ? 0 : this.field2853.read();
    }

    @OriginalMember(owner = "client!bc", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field2867 == this.field2859) {
                            if (this.field2879) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field2859;
                        if (this.field2867 < this.field2859) {
                            var3 = 5000 - this.field2859;
                        } else {
                            var3 = this.field2867 - this.field2859;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field2856.write(this.field2866, var2, var3);
                    } catch (IOException var9) {
                        this.field2864 = true;
                    }
                    this.field2859 = (this.field2859 + var3) % 5000;
                    try {
                        if (this.field2867 == this.field2859) {
                            this.field2856.flush();
                        }
                    } catch (IOException var8) {
                        this.field2864 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2853 != null) {
                        this.field2853.close();
                    }
                    if (this.field2856 != null) {
                        this.field2856.close();
                    }
                    if (this.field2863 != null) {
                        this.field2863.close();
                    }
                } catch (IOException var7) {
                }
                this.field2866 = null;
                break;
            }
        } catch (Exception var12) {
            class79.method624((String) null, var12, 0);
        }
        field2872++;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Ljava/net/Socket;Lvd;)V")
    public class182(Socket arg0, class4 arg1) throws IOException {
        this.field2861 = arg1;
        this.field2863 = arg0;
        this.field2863.setSoTimeout(30000);
        this.field2863.setTcpNoDelay(true);
        this.field2853 = this.field2863.getInputStream();
        this.field2856 = this.field2863.getOutputStream();
    }
}
