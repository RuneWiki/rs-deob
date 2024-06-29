import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class59 implements Runnable {

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    private int field942 = 0;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Z")
    private boolean field944 = false;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "Z")
    private boolean field973 = false;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
    private int field966 = 0;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field956;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Llb;")
    private class207 field948;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field955;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field945;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Lid;")
    public static class226 field952 = new class226();

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "Leg;")
    private static class37 field962 = class174.method1167("K", -50);

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "Leg;")
    private static class37 field960 = class174.method1167("glow2:", 62);

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "Leg;")
    public static class37 field964 = field960;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public static int field969 = 0;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static volatile int field959 = 0;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "Leg;")
    public static class37 field965 = field962;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "Leg;")
    public static class37 field971 = field960;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Leg;")
    public static class37 field957 = field962;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field963 = 0;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "I")
    public static int field978 = 0;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    public static int field975 = 0;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "Leg;")
    private static class37 field979 = class174.method1167("red:", 122);

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "Leg;")
    public static class37 field974 = field979;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "Leg;")
    public static class37 field980 = field979;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "Ljl;")
    public static class101 field968;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Llc;")
    private class251 field943;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "[B")
    private byte[] field958;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "[I")
    public static int[] field972;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public final void method419(byte arg0) {
        field946++;
        if (arg0 != -66) {
            method424(-8, (class101) null);
        }
        if (this.field973) {
            return;
        }
        synchronized (this) {
            this.field973 = true;
            this.notifyAll();
        }
        if (this.field943 != null) {
            while (this.field943.field4488 == 0) {
                class144.method1008(108, 1L);
            }
            if (this.field943.field4488 == 1) {
                try {
                    ((Thread) this.field943.field4483).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field943 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([BIII)V")
    public final void method420(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field950++;
        if (this.field973) {
            return;
        }
        if (this.field944) {
            this.field944 = false;
            throw new IOException();
        }
        if (this.field958 == null) {
            this.field958 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field958[this.field942] = arg0[arg1 + var6];
                this.field942 = (this.field942 + 1) % 5000;
                if (((this.field966 + 4900) % 5000) == this.field942) {
                    throw new IOException();
                }
            }
            if (arg3 != -13789) {
                this.method419((byte) 5);
            }
            if (this.field943 == null) {
                this.field943 = this.field948.method1423(this, 113, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!uh", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field953++;
        this.method419((byte) -66);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZ)I")
    public static final int method421(int arg0, boolean arg1) {
        field951++;
        if (arg1) {
            method428(-106);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
    public final void method422(boolean arg0) throws IOException {
        field970++;
        if (this.field973) {
            return;
        }
        if (this.field944) {
            this.field944 = false;
            throw new IOException();
        } else if (arg0) {
            method429(-78, 82, -77, -46, -85, 122, -59, -89, -103, 38);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public final void method423(byte arg0) {
        if (arg0 <= 108) {
            this.field966 = 104;
        }
        field954++;
        if (!this.field973) {
            this.field955 = new class25();
            this.field945 = new class102();
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILjl;)V")
    public static final void method424(int arg0, class101 arg1) {
        field949++;
        if (arg0 != 18) {
            field962 = null;
        }
        class93.field1470 = arg1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II[BI)V")
    public final void method425(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field947++;
        if (this.field973) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field955.read(arg2, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg0 -= var5;
        }
        if (arg1 != 3714) {
            method427(true, 104, (class183) null);
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)I")
    public final int method426(byte arg0) throws IOException {
        field961++;
        if (this.field973) {
            return 0;
        } else {
            if (arg0 != 41) {
                field975 = 84;
            }
            return this.field955.read();
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZILaa;)V")
    public static final void method427(boolean arg0, int arg1, class183 arg2) {
        field977++;
        if (arg0) {
            int var3 = class199.field3390;
            int var4 = var3 * 956 / 503;
            class47.field734.method700((class249.field4479 - var4) / 2, 0, var4, var3);
            class181.field3019.method109(class249.field4479 / 2 - class181.field3019.field3527 / 2, 18);
        }
        arg2.method1203(class145.field2474, class249.field4479 / 2, class199.field3390 / 2 - 26, 16777215, -1);
        int var5 = class199.field3390 / 2 - 18;
        class122.method861(class249.field4479 / 2 - 152, var5, 304, 34, 9179409);
        class122.method861(class249.field4479 / 2 - 151, var5 - -1, 302, 32, 0);
        class122.method873(class249.field4479 / 2 - 150, var5 + 2, class202.field3456 * 3, 30, 9179409);
        class122.method873(class202.field3456 * 3 + class249.field4479 / 2 - 150, var5 + 2, 300 - (class202.field3456 * 3), 30, 0);
        arg2.method1203(class96.field1509, class249.field4479 / arg1, class199.field3390 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method428(int arg0) {
        field960 = null;
        field952 = null;
        field962 = null;
        if (arg0 != 300) {
            field959 = 115;
        }
        field968 = null;
        field957 = null;
        field979 = null;
        field972 = null;
        field964 = null;
        field974 = null;
        field965 = null;
        field971 = null;
        field980 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -15 / ((arg4 + 93) / 32);
        if (arg3 == arg6 && arg2 == arg7 && arg5 == arg9 && arg1 == arg8) {
            class170.method1135(arg9, arg6, arg8, (byte) 108, arg0, arg2);
        } else {
            int var11 = arg6;
            int var12 = arg2;
            int var13 = arg6 * 3;
            int var14 = arg2 * 3;
            int var15 = arg3 * 3;
            int var16 = arg7 * 3;
            int var17 = arg1 * 3;
            int var18 = arg5 * 3;
            int var19 = var16 + arg8 - arg2 - var17;
            int var20 = arg9 + var15 - var18 - arg6;
            int var21 = var15 - var13;
            int var22 = var17 + var14 - var16 - var16;
            int var23 = var16 - var14;
            int var24 = var13 + var18 - var15 - var15;
            for (int var25 = 128; var25 <= 4096; var25 += 128) {
                int var26 = var25 * var25 >> 12;
                int var27 = var25 * var26 >> 12;
                int var28 = var19 * var27;
                int var29 = var24 * var26;
                int var30 = var20 * var27;
                int var31 = var22 * var26;
                int var32 = var23 * var25;
                int var33 = var21 * var25;
                int var34 = (var30 - (-var29 - var33) >> 12) + arg6;
                int var35 = arg2 + (var28 + var31 + var32 >> 12);
                class170.method1135(var34, var11, var35, (byte) 108, arg0, var12);
                var12 = var35;
                var11 = var34;
            }
        }
        field981++;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)I")
    public final int method430(boolean arg0) throws IOException {
        if (arg0) {
            field962 = null;
        }
        field967++;
        return this.field973 ? 0 : this.field955.available();
    }

    @OriginalMember(owner = "client!uh", name = "run", descriptor = "()V")
    public final void run() {
        field976++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field966 == this.field942) {
                        if (this.field973) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field966 <= this.field942) {
                        var2 = this.field942 - this.field966;
                    } else {
                        var2 = 5000 - this.field966;
                    }
                    var3 = this.field966;
                }
                if (var2 > 0) {
                    try {
                        this.field945.write(this.field958, var3, var2);
                    } catch (IOException var9) {
                        this.field944 = true;
                    }
                    this.field966 = (this.field966 + var2) % 5000;
                    try {
                        if (this.field966 == this.field942) {
                            this.field945.flush();
                        }
                    } catch (IOException var8) {
                        this.field944 = true;
                    }
                }
            }
            try {
                if (this.field955 != null) {
                    this.field955.close();
                }
                if (this.field945 != null) {
                    this.field945.close();
                }
                if (this.field956 != null) {
                    this.field956.close();
                }
            } catch (IOException var7) {
            }
            this.field958 = null;
        } catch (Exception var12) {
            class200.method1392(58, (String) null, var12);
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Ljava/net/Socket;Llb;)V")
    public class59(Socket arg0, class207 arg1) throws IOException {
        this.field956 = arg0;
        this.field948 = arg1;
        this.field956.setSoTimeout(30000);
        this.field956.setTcpNoDelay(true);
        this.field955 = this.field956.getInputStream();
        this.field945 = this.field956.getOutputStream();
    }
}
