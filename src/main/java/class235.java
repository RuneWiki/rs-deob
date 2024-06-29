import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class235 implements Runnable {

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    private int field3202 = 0;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
    private int field3211 = 0;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "Z")
    private boolean field3203 = false;

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "Z")
    private boolean field3217 = false;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "Loq;")
    private class775 field3206;

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "Ljava/net/Socket;")
    private Socket field3218;

    @OriginalMember(owner = "client!qu", name = "r", descriptor = "Ljava/io/InputStream;")
    private InputStream field3219;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3212;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    private int field3209;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!qu", name = "s", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!qu", name = "t", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!qu", name = "u", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!qu", name = "v", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!qu", name = "w", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!qu", name = "y", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!qu", name = "z", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!qu", name = "A", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "Ltba;")
    private class339 field3213;

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "Lqc;")
    public static class400 field3214;

    @OriginalMember(owner = "client!qu", name = "x", descriptor = "Lsc;")
    public static class472 field3225;

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "[B")
    private byte[] field3215;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "[Lpu;")
    public static class772[] field3205;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)I")
    public final int method1557(byte arg0) throws IOException {
        field3226++;
        if (this.field3203) {
            return 0;
        } else if (arg0 <= 93) {
            return 41;
        } else {
            return this.field3219.read();
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
    public static void method1558(int arg0) {
        field3214 = null;
        if (arg0 != -1) {
            method1558(-4);
        }
        field3225 = null;
        field3205 = null;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)I")
    public static final int method1559(int arg0, int arg1, int arg2) {
        if (arg2 < 89) {
            return 109;
        }
        field3220++;
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)V")
    public final void method1560(byte arg0) {
        if (arg0 < 81) {
            method1561(1, 92, -28, -54, null, 120, -82, 98, -25, -109, -20);
        }
        field3216++;
        if (!this.field3203) {
            this.field3219 = new class168();
            this.field3212 = new class593();
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIILeo;IIIIII)Z")
    public static final boolean method1561(int arg0, int arg1, int arg2, int arg3, class340 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3207++;
        int var11 = arg5;
        int var12 = arg9;
        byte var13 = 64;
        byte var14 = 64;
        if (arg1 > -125) {
            field3224 = 93;
        }
        int var15 = arg5 - var13;
        class391.field5073[var13][var14] = 99;
        int var16 = arg9 - var14;
        class384.field4800[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class195.field2707[var17] = arg5;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class57.field763[var10001] = arg9;
        int[][] var19 = arg4.field4160;
        while (var26 != var18) {
            var11 = class195.field2707[var18];
            var12 = class57.field763[var18];
            int var20 = var11 - arg4.field4158;
            int var21 = var12 - arg4.field4157;
            int var22 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var23 = var11 - var15;
            if (arg3 == -4) {
                if (arg8 == var11 && arg0 == var12) {
                    class317.field3948 = var11;
                    class425.field5594 = var12;
                    return true;
                }
            } else if (arg3 == -3) {
                if (class332.method1918(var12, (byte) -119, arg8, arg10, arg0, arg2, 1, 1, var11)) {
                    class317.field3948 = var11;
                    class425.field5594 = var12;
                    return true;
                }
            } else if (arg3 == -2) {
                if (arg4.method1968(1, 1, arg6, arg0, var11, (byte) 120, arg8, arg10, arg2, var12)) {
                    class425.field5594 = var12;
                    class317.field3948 = var11;
                    return true;
                }
            } else if (arg3 == -1) {
                if (arg4.method1972(arg10, var12, (byte) -79, var11, arg6, arg2, arg0, 1, arg8)) {
                    class425.field5594 = var12;
                    class317.field3948 = var11;
                    return true;
                }
            } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                if (arg4.method1963(-12959, arg0, var12, arg7, arg8, arg3, 1, var11)) {
                    class425.field5594 = var12;
                    class317.field3948 = var11;
                    return true;
                }
            } else if (arg4.method1967(arg0, true, 1, var12, arg3, arg7, var11, arg8)) {
                class425.field5594 = var12;
                class317.field3948 = var11;
                return true;
            }
            int var25 = class384.field4800[var23][var22] + 1;
            if (var23 > 0 && class391.field5073[var23 - 1][var22] == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0) {
                class195.field2707[var26] = var11 - 1;
                class57.field763[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class391.field5073[var23 - 1][var22] = 2;
                class384.field4800[var23 - 1][var22] = var25;
            }
            if (var23 < 127 && class391.field5073[var23 + 1][var22] == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0) {
                class195.field2707[var26] = var11 + 1;
                class57.field763[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class391.field5073[var23 + 1][var22] = 8;
                class384.field4800[var23 + 1][var22] = var25;
            }
            if (var22 > 0 && class391.field5073[var23][var22 - 1] == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class195.field2707[var26] = var11;
                class57.field763[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class391.field5073[var23][var22 - 1] = 1;
                class384.field4800[var23][var22 - 1] = var25;
            }
            if (var22 < 127 && class391.field5073[var23][var22 + 1] == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class195.field2707[var26] = var11;
                class57.field763[var26] = var12 + 1;
                class391.field5073[var23][var22 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class384.field4800[var23][var22 + 1] = var25;
            }
            if (var23 > 0 && var22 > 0 && class391.field5073[var23 - 1][var22 - 1] == 0 && (var19[var20 - 1][var21 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class195.field2707[var26] = var11 - 1;
                class57.field763[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class391.field5073[var23 - 1][var22 - 1] = 3;
                class384.field4800[var23 - 1][var22 - 1] = var25;
            }
            if (var23 < 127 && var22 > 0 && class391.field5073[var23 + 1][var22 - 1] == 0 && (var19[var20 + 1][var21 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class195.field2707[var26] = var11 + 1;
                class57.field763[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class391.field5073[var23 + 1][var22 - 1] = 9;
                class384.field4800[var23 + 1][var22 - 1] = var25;
            }
            if (var23 > 0 && var22 < 127 && class391.field5073[var23 - 1][var22 + 1] == 0 && (var19[var20 - 1][var21 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class195.field2707[var26] = var11 - 1;
                class57.field763[var26] = var12 + 1;
                class391.field5073[var23 - 1][var22 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class384.field4800[var23 - 1][var22 + 1] = var25;
            }
            if (var23 < 127 && var22 < 127 && class391.field5073[var23 + 1][var22 + 1] == 0 && (var19[var20 + 1][var21 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class195.field2707[var26] = var11 + 1;
                class57.field763[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class391.field5073[var23 + 1][var22 + 1] = 12;
                class384.field4800[var23 + 1][var22 + 1] = var25;
            }
        }
        class317.field3948 = var11;
        class425.field5594 = var12;
        return false;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "([BZII)V")
    public final void method1562(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        field3228++;
        if (this.field3203) {
            return;
        }
        if (this.field3217) {
            this.field3217 = false;
            throw new IOException();
        }
        if (this.field3215 == null) {
            this.field3215 = new byte[this.field3209];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field3215[this.field3211] = arg0[arg2 + var6];
                this.field3211 = (this.field3211 + 1) % this.field3209;
                if ((this.field3202 - (100 - this.field3209)) % this.field3209 == this.field3211) {
                    throw new IOException();
                }
            }
            if (this.field3213 == null) {
                this.field3213 = this.field3206.method4248(this, 0, 3);
            }
            this.notifyAll();
            if (arg1) {
                this.method1560((byte) -91);
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(B)V")
    public final void method1563(byte arg0) throws IOException {
        field3208++;
        if (this.field3203) {
            return;
        }
        if (this.field3217) {
            this.field3217 = false;
            throw new IOException();
        } else if (arg0 >= -72) {
            method1561(42, -13, -72, 93, null, 95, 42, -85, -57, 80, -70);
        }
    }

    @OriginalMember(owner = "client!qu", name = "run", descriptor = "()V")
    public final void run() {
        field3222++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field3211 == this.field3202) {
                        if (this.field3203) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field3202 <= this.field3211) {
                        var2 = this.field3211 - this.field3202;
                    } else {
                        var2 = this.field3209 - this.field3202;
                    }
                    var3 = this.field3202;
                }
                if (var2 > 0) {
                    try {
                        this.field3212.write(this.field3215, var3, var2);
                    } catch (IOException var9) {
                        this.field3217 = true;
                    }
                    this.field3202 = (this.field3202 + var2) % this.field3209;
                    try {
                        if (this.field3211 == this.field3202) {
                            this.field3212.flush();
                        }
                    } catch (IOException var8) {
                        this.field3217 = true;
                    }
                }
            }
            try {
                if (this.field3219 != null) {
                    this.field3219.close();
                }
                if (this.field3212 != null) {
                    this.field3212.close();
                }
                if (this.field3218 != null) {
                    this.field3218.close();
                }
            } catch (IOException var7) {
            }
            this.field3215 = null;
        } catch (Exception var12) {
            class416.method2401(1, var12, null);
        }
    }

    @OriginalMember(owner = "client!qu", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field3227++;
        this.method1566(-2);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II[BI)V")
    public final void method1564(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 != 0) {
            this.field3206 = null;
        }
        field3210++;
        if (this.field3203) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field3219.read(arg2, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)I")
    public final int method1565(int arg0) throws IOException {
        if (arg0 != 20045) {
            this.field3219 = null;
        }
        field3221++;
        return this.field3203 ? 0 : this.field3219.available();
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V")
    public final void method1566(int arg0) {
        field3223++;
        if (this.field3203) {
            return;
        }
        synchronized (this) {
            if (arg0 != -2) {
                this.field3206 = null;
            }
            this.field3203 = true;
            this.notifyAll();
        }
        if (this.field3213 != null) {
            while (this.field3213.field4144 == 0) {
                class591.method3181(1L, 0);
            }
            if (this.field3213.field4144 == 1) {
                try {
                    ((Thread) this.field3213.field4142).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3213 = null;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(JJ)J")
    public static long method1567(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Ljava/net/Socket;Loq;I)V")
    public class235(Socket arg0, class775 arg1, int arg2) throws IOException {
        this.field3206 = arg1;
        this.field3218 = arg0;
        this.field3218.setSoTimeout(30000);
        this.field3218.setTcpNoDelay(true);
        this.field3219 = this.field3218.getInputStream();
        this.field3212 = this.field3218.getOutputStream();
        this.field3209 = arg2;
    }
}
