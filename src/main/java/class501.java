import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class501 implements Runnable {

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Z")
    private boolean field7461 = false;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Z")
    private boolean field7471 = false;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    private int field7477 = 0;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    private int field7481 = 0;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "Ljava/net/Socket;")
    private Socket field7474;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Lhu;")
    private class469 field7458;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Ljava/io/InputStream;")
    private InputStream field7462;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field7472;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "Lcm;")
    public static class449 field7480 = new class449(76, -1);

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "Lui;")
    public static class375 field7482 = new class375("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field7485 = 0;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "Lcm;")
    public static class449 field7484 = new class449(40, 3);

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field7488 = 0;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lhh;")
    private class125 field7457;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "Lns;")
    public static class438 field7486;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "[B")
    private byte[] field7475;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "[[[I")
    public static int[][][] field7483;

    @OriginalMember(owner = "client!ad", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field7476++;
        this.method2994(-1);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZIIIIIIII)V")
    public static final void method2989(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7470++;
        class309 var10 = null;
        for (class309 var11 = (class309) class255.field3530.method1970(64); var11 != null; var11 = (class309) class255.field3530.method1960(24)) {
            if (var11.field4635 == arg7 && var11.field4623 == arg4 && var11.field4636 == arg3 && var11.field4624 == arg9) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class309();
            var10.field4623 = arg4;
            var10.field4636 = arg3;
            var10.field4624 = arg9;
            var10.field4635 = arg7;
            if (arg4 >= 0 && arg3 >= 0 && class96.field1403 > arg4 && arg3 < class485.field7122) {
                class109.method718(-1, var10);
            }
            class255.field3530.method1958(var10, 0);
        }
        var10.field4637 = arg2;
        var10.field4632 = arg6;
        var10.field4631 = arg5;
        var10.field4626 = arg8;
        if (!arg1) {
            method2991(null, -120, -89);
        }
        var10.field4633 = arg0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public final void method2990(byte arg0) {
        field7465++;
        if (this.field7461) {
            return;
        }
        this.field7462 = new class526();
        this.field7472 = new class470();
        if (arg0 != -74) {
            this.field7472 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([FII)[F")
    public static final float[] method2991(float[] arg0, int arg1, int arg2) {
        field7463++;
        if (arg1 <= 50) {
            method2991(null, 105, 27);
        }
        float[] var3 = new float[arg2];
        class361.method2282(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method2992(int arg0) {
        field7483 = null;
        if (arg0 == 0) {
            field7480 = null;
            field7486 = null;
            field7482 = null;
            field7484 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIILjava/lang/String;ILjb;IBLse;Lea;Loa;)V")
    public static final void method2993(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, class499 arg6, int arg7, byte arg8, class4 arg9, class15 arg10, class33 arg11) {
        field7478++;
        int var12;
        if (class432.field6409 == 4) {
            var12 = (int) class482.field7022 & 0x3FFF;
        } else {
            var12 = (int) class482.field7022 + class384.field5871 & 0x3FFF;
        }
        int var13 = Math.max(arg6.field7348 / 2, arg6.field7386 / 2) + 10;
        int var14 = arg2 * arg2 + arg5 * arg5;
        if (var14 > (var13 * var13)) {
            return;
        }
        int var15 = class525.field7760[var12];
        if (arg8 >= -38) {
            field7482 = null;
        }
        int var16 = class525.field7763[var12];
        if (class432.field6409 != 4) {
            var15 = var15 * 256 / (class235.field3345 + 256);
            var16 = var16 * 256 / (class235.field3345 + 256);
        }
        int var17 = arg2 * var16 + arg5 * var15 >> 15;
        int var18 = arg5 * var16 - (arg2 * var15) >> 15;
        int var19 = arg9.method38(100, null, arg4, 0);
        int var20 = arg9.method36(null, -257, arg4, 0, 100);
        int var21 = var17 - var19 / 2;
        if (-arg6.field7348 <= var21 && var21 <= arg6.field7348 && (-arg6.field7386) <= var18 && arg6.field7386 >= var18) {
            arg11.method245(50, arg7, arg1, arg0, 1, 0, null, 0, arg10, 0, null, arg1 + (arg6.field7386 / 2) - arg3 - var18 - var20, arg6.field7348 / 2 + arg0 + var21, arg4, var19, 0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public final void method2994(int arg0) {
        field7459++;
        if (this.field7461) {
            return;
        }
        synchronized (this) {
            this.field7461 = true;
            this.notifyAll();
            if (arg0 != -1) {
                field7486 = null;
            }
        }
        if (this.field7457 != null) {
            while (this.field7457.field1791 == 0) {
                class106.method710(1L, (byte) 6);
            }
            if (this.field7457.field1791 == 1) {
                try {
                    ((Thread) this.field7457.field1793).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field7457 = null;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)I")
    public final int method2995(byte arg0) throws IOException {
        if (arg0 < 22) {
            return -66;
        } else {
            field7464++;
            return this.field7461 ? 0 : this.field7462.available();
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)I")
    public static final int method2996(int arg0, byte arg1) {
        field7460++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else {
            if (arg1 < 28) {
                field7484 = null;
            }
            if (arg0 == 6410 || arg0 == 34847) {
                return 6410;
            } else if (arg0 == 6402) {
                return 6402;
            } else {
                throw new IllegalArgumentException("");
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field7481 == this.field7477) {
                            if (this.field7461) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field7477;
                        if (this.field7481 >= this.field7477) {
                            var3 = this.field7481 - this.field7477;
                        } else {
                            var3 = 5000 - this.field7477;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field7472.write(this.field7475, var2, var3);
                    } catch (IOException var9) {
                        this.field7471 = true;
                    }
                    this.field7477 = (this.field7477 + var3) % 5000;
                    try {
                        if (this.field7481 == this.field7477) {
                            this.field7472.flush();
                        }
                    } catch (IOException var8) {
                        this.field7471 = true;
                    }
                    continue;
                }
                try {
                    if (this.field7462 != null) {
                        this.field7462.close();
                    }
                    if (this.field7472 != null) {
                        this.field7472.close();
                    }
                    if (this.field7474 != null) {
                        this.field7474.close();
                    }
                } catch (IOException var7) {
                }
                this.field7475 = null;
                break;
            }
        } catch (Exception var12) {
            class438.method2644(null, -1, var12);
        }
        field7468++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([BIBI)V")
    public final void method2997(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field7467++;
        if (this.field7461) {
            return;
        }
        if (arg2 != 98) {
            field7480 = null;
        }
        while (arg1 > 0) {
            int var5 = this.field7462.read(arg0, arg3, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
    public final void method2998(int arg0) throws IOException {
        field7469++;
        if (this.field7461) {
            return;
        }
        if (this.field7471) {
            this.field7471 = false;
            throw new IOException();
        } else if (arg0 != 0) {
            this.field7477 = -114;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([BIII)V")
    public final void method2999(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field7466++;
        if (this.field7461) {
            return;
        }
        if (this.field7471) {
            this.field7471 = false;
            throw new IOException();
        }
        if (this.field7475 == null) {
            this.field7475 = new byte[5000];
        }
        synchronized (this) {
            if (arg2 != 1) {
                field7484 = null;
            }
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field7475[this.field7481] = arg0[arg3 + var6];
                this.field7481 = (this.field7481 + 1) % 5000;
                if ((this.field7477 + 4900) % 5000 == this.field7481) {
                    throw new IOException();
                }
            }
            if (this.field7457 == null) {
                this.field7457 = this.field7458.method2792(3, this, -10265);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)I")
    public final int method3000(byte arg0) throws IOException {
        field7473++;
        int var2 = -116 % ((-arg0 - 20) / 53);
        return this.field7461 ? 0 : this.field7462.read();
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Ljava/net/Socket;Lhu;)V")
    public class501(Socket arg0, class469 arg1) throws IOException {
        this.field7474 = arg0;
        this.field7458 = arg1;
        this.field7474.setSoTimeout(30000);
        this.field7474.setTcpNoDelay(true);
        this.field7462 = this.field7474.getInputStream();
        this.field7472 = this.field7474.getOutputStream();
    }
}
