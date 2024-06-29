import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class173 implements Runnable {

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    private int field3159 = 0;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "Z")
    private boolean field3172 = false;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "Z")
    private boolean field3170 = false;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    private int field3154 = 0;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "Ljava/net/Socket;")
    private Socket field3173;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "Lsd;")
    private class42 field3174;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field3166;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3164;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static volatile int field3156 = 0;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Lhj;")
    public static class69 field3158 = class181.method1318("_labels", (byte) -115);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Lnc;")
    public static class83 field3155;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "Lnc;")
    public static class83 field3171;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "Lue;")
    private class86 field3175;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "[B")
    private byte[] field3169;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)I")
    public final int method1263(int arg0) throws IOException {
        field3165++;
        if (this.field3170) {
            return 0;
        } else {
            if (arg0 != 2) {
                method1268(87);
            }
            return this.field3166.read();
        }
    }

    @OriginalMember(owner = "client!tc", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field3159 == this.field3154) {
                            if (this.field3170) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field3154;
                        if (this.field3159 < this.field3154) {
                            var3 = 5000 - this.field3154;
                        } else {
                            var3 = this.field3159 - this.field3154;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field3164.write(this.field3169, var2, var3);
                    } catch (IOException var9) {
                        this.field3172 = true;
                    }
                    this.field3154 = (this.field3154 + var3) % 5000;
                    try {
                        if (this.field3159 == this.field3154) {
                            this.field3164.flush();
                        }
                    } catch (IOException var8) {
                        this.field3172 = true;
                    }
                    continue;
                }
                try {
                    if (this.field3166 != null) {
                        this.field3166.close();
                    }
                    if (this.field3164 != null) {
                        this.field3164.close();
                    }
                    if (this.field3173 != null) {
                        this.field3173.close();
                    }
                } catch (IOException var7) {
                }
                this.field3169 = null;
                break;
            }
        } catch (Exception var12) {
            class222.method1575((String) null, var12, -37);
        }
        field3157++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lfh;B)V")
    public static final void method1264(class128 arg0, byte arg1) {
        if (arg1 != -5) {
            field3158 = null;
        }
        field3160++;
        while (true) {
            while (arg0.field2385.length > arg0.field2379) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg0.method937(false) == 1) {
                    var3 = true;
                    var4 = arg0.method937(false);
                    var2 = arg0.method937(false);
                }
                int var5 = arg0.method937(false);
                int var6 = arg0.method937(false);
                int var7 = var5 * 64 - class250.field4539;
                int var8 = class209.field3806 + class22.field306 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class84.field1626 > var7 + 63 && var8 < class22.field306) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var4 * 8 <= var11 && (var4 * 8 + 8) > var11 && var2 * 8 <= var12 && var12 < var2 * 8 + 8) {
                                int var13 = arg0.method937(false);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method937(false);
                                        if (class168.field3098[var9][var10] == null) {
                                            class168.field3098[var9][var10] = new byte[4096];
                                        }
                                        class168.field3098[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method912(91);
                                        if (class140.field2616[var9][var10] == null) {
                                            class140.field2616[var9][var10] = new short[4096];
                                        }
                                        class140.field2616[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg0.method937(false) & 0xFF << 16) - (-((arg0.method937(false) & 0xFF) << 8) - (arg0.method937(false) & 0xFF));
                                        if (class17.field226[var9][var10] == null) {
                                            class17.field226[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class12 var17 = class145.method1102(var16, 0);
                                        if (var17.field120 != null) {
                                            var17 = var17.method63(88);
                                            if (var17 == null || var17.field154 == -1) {
                                                continue;
                                            }
                                        }
                                        class17.field226[var9][var10][(63 - var12 << 6) + var11] = var17.field179 + 1;
                                        class268 var18 = new class268();
                                        var18.field4765 = var8;
                                        var18.field4776 = var17.field154;
                                        var18.field4761 = var7;
                                        class231.field4224.method1727(arg1 ^ 0x63, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var3 ? 64 : 4096); var19++) {
                        int var20 = arg0.method937(false);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field2379++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field2379 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field2379 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([BIII)V")
    public final void method1265(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3161++;
        if (arg1 > -49) {
            this.method1270((byte) 9);
        }
        if (this.field3170) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field3166.read(arg0, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg3 -= var5;
        }
    }

    @OriginalMember(owner = "client!tc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1270((byte) 41);
        field3153++;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public static final void method1266(int arg0) {
        if (arg0 < 106) {
            field3155 = null;
        }
        field3167++;
        for (int var1 = 0; var1 < class156.field2917; var1++) {
            int var2 = class102.field1908[var1];
            class108 var3 = class35.field491[var2];
            int var4 = class199.field3595.method937(false);
            if ((var4 & 0x2) != 0) {
                var4 += class199.field3595.method937(false) << 8;
            }
            class134.method1000(var4, var3, true, var2);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([BBII)V")
    public final void method1267(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field3163++;
        if (this.field3170) {
            return;
        }
        if (this.field3172) {
            this.field3172 = false;
            throw new IOException();
        }
        if (this.field3169 == null) {
            this.field3169 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field3169[this.field3159] = arg0[arg2 + var6];
                this.field3159 = (this.field3159 + 1) % 5000;
                if (((this.field3154 + 4900) % 5000) == this.field3159) {
                    throw new IOException();
                }
            }
            if (arg1 != 6) {
                this.field3172 = false;
            }
            if (this.field3175 == null) {
                this.field3175 = this.field3174.method232(this, 3, (byte) 107);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
    public static void method1268(int arg0) {
        field3158 = null;
        if (arg0 < -51) {
            field3155 = null;
            field3171 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)I")
    public final int method1269(byte arg0) throws IOException {
        field3168++;
        if (this.field3170) {
            return 0;
        } else {
            if (arg0 != -85) {
                method1266(-89);
            }
            return this.field3166.available();
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
    public final void method1270(byte arg0) {
        field3162++;
        if (this.field3170) {
            return;
        }
        synchronized (this) {
            this.field3170 = true;
            this.notifyAll();
        }
        if (arg0 != 41) {
            method1266(31);
        }
        if (this.field3175 != null) {
            while (this.field3175.field1663 == 0) {
                class59.method356(false, 1L);
            }
            if (this.field3175.field1663 == 1) {
                try {
                    ((Thread) this.field3175.field1666).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3175 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ljava/net/Socket;Lsd;)V")
    public class173(Socket arg0, class42 arg1) throws IOException {
        this.field3173 = arg0;
        this.field3174 = arg1;
        this.field3173.setSoTimeout(30000);
        this.field3173.setTcpNoDelay(true);
        this.field3166 = this.field3173.getInputStream();
        this.field3164 = this.field3173.getOutputStream();
    }
}
