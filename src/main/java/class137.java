import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class137 implements Runnable {

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    private int field2545 = 0;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Z")
    private boolean field2542 = false;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    private int field2552 = 0;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "Z")
    private boolean field2553 = false;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Lqg;")
    private class181 field2540;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "Ljava/net/Socket;")
    private Socket field2555;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Ljava/io/InputStream;")
    private InputStream field2546;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2543;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field2550 = 0;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Lid;")
    public static class92 field2535 = new class92(64);

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "Z")
    public static boolean field2557 = false;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lp;")
    private class163 field2536;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "[B")
    private byte[] field2554;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static void method910(int arg0) {
        field2535 = null;
        if (arg0 != -81) {
            method916(51, null, -2, true, -8, 35, 100, -94, -34);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)I")
    public final int method911(int arg0) throws IOException {
        field2544++;
        if (this.field2542) {
            return 0;
        } else {
            if (arg0 != 1) {
                method912((byte) 91, null);
            }
            return this.field2546.available();
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLnb;)V")
    public static final void method912(byte arg0, class144 arg1) {
        class139.field2580 = arg1;
        field2556++;
        if (arg0 != 64) {
            field2550 = 124;
        }
        class151.field2925 = class139.field2580.method944(arg0 + 64, 4);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II[BI)V")
    public final void method913(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2547++;
        if (this.field2542) {
            return;
        }
        if (this.field2553) {
            this.field2553 = false;
            throw new IOException();
        }
        if (arg3 != 17492) {
            method917(null);
        }
        if (this.field2554 == null) {
            this.field2554 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field2554[this.field2552] = arg2[arg1 + var6];
                this.field2552 = (this.field2552 + 1) % 5000;
                if ((this.field2545 + 4900) % 5000 == this.field2552) {
                    throw new IOException();
                }
            }
            if (this.field2536 == null) {
                this.field2536 = this.field2540.method1289(2, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)V")
    public static final void method914(int arg0, int arg1, int arg2) {
        if (arg2 != 4) {
            method914(-118, -76, -80);
        }
        field2541++;
        if (class211.method1447(0, arg0)) {
            class230.method1538(arg1, false, class78.field1418[arg0]);
        }
    }

    @OriginalMember(owner = "client!mf", name = "run", descriptor = "()V")
    public final void run() {
        field2537++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field2552 == this.field2545) {
                        if (this.field2542) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field2545;
                    if (this.field2545 <= this.field2552) {
                        var3 = this.field2552 - this.field2545;
                    } else {
                        var3 = 5000 - this.field2545;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field2543.write(this.field2554, var2, var3);
                    } catch (IOException var9) {
                        this.field2553 = true;
                    }
                    this.field2545 = (this.field2545 + var3) % 5000;
                    try {
                        if (this.field2552 == this.field2545) {
                            this.field2543.flush();
                        }
                    } catch (IOException var8) {
                        this.field2553 = true;
                    }
                }
            }
            try {
                if (this.field2546 != null) {
                    this.field2546.close();
                }
                if (this.field2543 != null) {
                    this.field2543.close();
                }
                if (this.field2555 != null) {
                    this.field2555.close();
                }
            } catch (IOException var7) {
            }
            this.field2554 = null;
        } catch (Exception var12) {
            class221.method1490((byte) 0, null, var12);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[BBI)V")
    public final void method915(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field2538++;
        if (arg2 != -93) {
            this.run();
        }
        if (this.field2542) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field2546.read(arg1, arg0, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILea;IZIIIII)V")
    public static final void method916(int arg0, class46 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2551++;
        if (arg2 != 0) {
            method910(27);
        }
        if (arg0 < 0 || arg0 >= 104 || arg6 < 0 || arg6 >= 104) {
            while (true) {
                int var11 = arg1.method347(arg2 ^ 0x6607);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg1.method347(26119);
                    return;
                }
                if (var11 <= 49) {
                    arg1.method347(26119);
                }
            }
        }
        if (!arg3) {
            class116.field2100[arg8][arg0][arg6] = 0;
        }
        while (true) {
            int var9 = arg1.method347(26119);
            if (var9 == 0) {
                if (arg3) {
                    class62.field1137[0][arg0][arg6] = class145.field2723[0][arg0][arg6];
                    return;
                } else if (arg8 == 0) {
                    class62.field1137[0][arg0][arg6] = -class217.method1472(arg0 + arg5 + 932731, 556238 - -arg6 - -arg4, arg2 - 14) * 8;
                    return;
                } else {
                    class62.field1137[arg8][arg0][arg6] = class62.field1137[arg8 - 1][arg0][arg6] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg1.method347(26119);
                if (!arg3) {
                    if (var10 == 1) {
                        var10 = 0;
                    }
                    if (arg8 == 0) {
                        class62.field1137[0][arg0][arg6] = -var10 * 8;
                        return;
                    }
                    class62.field1137[arg8][arg0][arg6] = class62.field1137[arg8 - 1][arg0][arg6] - var10 * 8;
                    return;
                }
                class62.field1137[0][arg0][arg6] = var10 * 8 + class145.field2723[0][arg0][arg6];
                return;
            }
            if (var9 <= 49) {
                class109.field1964[arg8][arg0][arg6] = arg1.method324(34);
                class8.field115[arg8][arg0][arg6] = (byte) ((var9 - 2) / 4);
                class234.field4379[arg8][arg0][arg6] = (byte) class70.method470(arg7 + var9 - 2, 3);
            } else if (var9 > 81) {
                class164.field3144[arg8][arg0][arg6] = (byte) (var9 - 81);
            } else if (!arg3) {
                class116.field2100[arg8][arg0][arg6] = (byte) (var9 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljj;)V")
    public static final void method917(class108 arg0) {
        for (int var1 = arg0.field1935; var1 <= arg0.field1942; var1++) {
            for (int var2 = arg0.field1938; var2 <= arg0.field1937; var2++) {
                class52 var3 = class29.field489[arg0.field1954][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field962; var4++) {
                        if (var3.field963[var4] == arg0) {
                            var3.field962--;
                            for (int var5 = var4; var5 < var3.field962; var5++) {
                                var3.field963[var5] = var3.field963[var5 + 1];
                                var3.field957[var5] = var3.field957[var5 + 1];
                            }
                            var3.field963[var3.field962] = null;
                            break;
                        }
                    }
                    var3.field954 = 0;
                    for (int var6 = 0; var6 < var3.field962; var6++) {
                        var3.field954 |= var3.field957[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method919(true);
        field2549++;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)I")
    public final int method918(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field2554 = null;
        }
        field2539++;
        return this.field2542 ? 0 : this.field2546.read();
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public final void method919(boolean arg0) {
        field2548++;
        if (this.field2542) {
            return;
        }
        synchronized (this) {
            this.field2542 = arg0;
            this.notifyAll();
        }
        if (this.field2536 != null) {
            while (this.field2536.field3136 == 0) {
                class21.method98(1L, (byte) 38);
            }
            if (this.field2536.field3136 == 1) {
                try {
                    ((Thread) this.field2536.field3131).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2536 = null;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Ljava/net/Socket;Lqg;)V")
    public class137(Socket arg0, class181 arg1) throws IOException {
        this.field2540 = arg1;
        this.field2555 = arg0;
        this.field2555.setSoTimeout(30000);
        this.field2555.setTcpNoDelay(true);
        this.field2546 = this.field2555.getInputStream();
        this.field2543 = this.field2555.getOutputStream();
    }
}
