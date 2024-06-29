import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class791 implements Runnable {

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    private int field10841 = 0;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    private int field10843 = 0;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field10831;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    private int field10845;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "[B")
    private byte[] field10834;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field10842;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Z")
    public static boolean field10839 = false;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field10832;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field10833;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field10835;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field10836;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field10837;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field10838;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field10840;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field10844;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Ljava/io/IOException;")
    private IOException field10830;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIB)Z")
    public static final boolean method4327(int arg0, int arg1, byte arg2) {
        if (arg2 >= -31) {
            return false;
        } else {
            field10832++;
            return (arg1 & 0x10000) != 0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public final void method4328(byte arg0) {
        field10844++;
        synchronized (this) {
            if (this.field10830 == null) {
                this.field10830 = new IOException("");
            }
            this.notifyAll();
            if (arg0 != 20) {
                field10839 = false;
            }
        }
        try {
            this.field10842.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!kb", name = "run", descriptor = "()V")
    public final void run() {
        field10836++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field10830 != null) {
                        return;
                    }
                    if (this.field10841 == 0) {
                        var2 = this.field10845 - this.field10843 - 1;
                    } else if (this.field10841 >= this.field10843) {
                        var2 = this.field10841 - this.field10843 - 1;
                    } else {
                        var2 = this.field10845 - this.field10843;
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
                var3 = this.field10831.read(this.field10834, this.field10843, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field10830 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field10843 = (this.field10843 + var3) % this.field10845;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
    public final void method4329(byte arg0) {
        this.field10831 = new class41();
        field10833++;
        int var2 = -9 / ((-arg0 - 19) / 55);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Z")
    public final boolean method4330(int arg0, int arg1) throws IOException {
        field10835++;
        if (arg0 <= ~arg1 || this.field10845 <= arg1) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field10843 < this.field10841) {
                var4 = this.field10845 + this.field10843 - this.field10841;
            } else {
                var4 = this.field10843 - this.field10841;
            }
            if (var4 >= arg1) {
                return true;
            } else if (this.field10830 == null) {
                return false;
            } else {
                throw new IOException(this.field10830.toString());
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILeo;IIIIIII)Z")
    public static final boolean method4331(int arg0, int arg1, int arg2, class340 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field10840++;
        int var11 = arg2;
        int var12 = arg1;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg2 - var13;
        int var16 = arg1 - var14;
        class391.field5073[var13][var14] = 99;
        class384.field4800[var13][var14] = 0;
        byte var17 = 0;
        class195.field2707[var17] = arg2;
        int var18 = 0;
        int var19 = -99 / ((-arg7 - 64) / 39);
        byte var10001 = var17;
        int var27 = var17 + 1;
        class57.field763[var10001] = arg1;
        int[][] var20 = arg3.field4160;
        while (var27 != var18) {
            var11 = class195.field2707[var18];
            var12 = class57.field763[var18];
            int var21 = var11 - var15;
            int var22 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var23 = var11 - arg3.field4158;
            int var24 = var12 - arg3.field4157;
            if (arg6 == -4) {
                if (arg8 == var11 && arg0 == var12) {
                    class317.field3948 = var11;
                    class425.field5594 = var12;
                    return true;
                }
            } else if (arg6 == -3) {
                if (class332.method1918(var12, (byte) -126, arg8, arg5, arg0, arg10, 2, 2, var11)) {
                    class317.field3948 = var11;
                    class425.field5594 = var12;
                    return true;
                }
            } else if (arg6 == -2) {
                if (arg3.method1968(2, 2, arg9, arg0, var11, (byte) 94, arg8, arg5, arg10, var12)) {
                    class425.field5594 = var12;
                    class317.field3948 = var11;
                    return true;
                }
            } else if (arg6 == -1) {
                if (arg3.method1972(arg5, var12, (byte) -79, var11, arg9, arg10, arg0, 2, arg8)) {
                    class425.field5594 = var12;
                    class317.field3948 = var11;
                    return true;
                }
            } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                if (arg3.method1963(-12959, arg0, var12, arg4, arg8, arg6, 2, var11)) {
                    class425.field5594 = var12;
                    class317.field3948 = var11;
                    return true;
                }
            } else if (arg3.method1967(arg0, true, 2, var12, arg6, arg4, var11, arg8)) {
                class425.field5594 = var12;
                class317.field3948 = var11;
                return true;
            }
            int var26 = class384.field4800[var21][var22] + 1;
            if (var21 > 0 && class391.field5073[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + 1] & 0x4E240000) == 0) {
                class195.field2707[var27] = var11 - 1;
                class57.field763[var27] = var12;
                var27 = var27 + 1 & 0xFFF;
                class391.field5073[var21 - 1][var22] = 2;
                class384.field4800[var21 - 1][var22] = var26;
            }
            if (var21 < 126 && class391.field5073[var21 + 1][var22] == 0 && (var20[var23 + 2][var24] & 0x60E40000) == 0 && (var20[var23 + 2][var24 + 1] & 0x78240000) == 0) {
                class195.field2707[var27] = var11 + 1;
                class57.field763[var27] = var12;
                var27 = var27 + 1 & 0xFFF;
                class391.field5073[var21 + 1][var22] = 8;
                class384.field4800[var21 + 1][var22] = var26;
            }
            if (var22 > 0 && class391.field5073[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + 1][var24 - 1] & 0x60E40000) == 0) {
                class195.field2707[var27] = var11;
                class57.field763[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class391.field5073[var21][var22 - 1] = 1;
                class384.field4800[var21][var22 - 1] = var26;
            }
            if (var22 < 126 && class391.field5073[var21][var22 + 1] == 0 && (var20[var23][var24 + 2] & 0x4E240000) == 0 && (var20[var23 + 1][var24 + 2] & 0x78240000) == 0) {
                class195.field2707[var27] = var11;
                class57.field763[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class391.field5073[var21][var22 + 1] = 4;
                class384.field4800[var21][var22 + 1] = var26;
            }
            if (var21 > 0 && var22 > 0 && class391.field5073[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24] & 0x4FA40000) == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0 && (var20[var23][var24 - 1] & 0x63E40000) == 0) {
                class195.field2707[var27] = var11 - 1;
                class57.field763[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class391.field5073[var21 - 1][var22 - 1] = 3;
                class384.field4800[var21 - 1][var22 - 1] = var26;
            }
            if (var21 < 126 && var22 > 0 && class391.field5073[var21 + 1][var22 - 1] == 0 && (var20[var23 + 1][var24 - 1] & 0x63E40000) == 0 && (var20[var23 + 2][var24 - 1] & 0x60E40000) == 0 && (var20[var23 + 2][var24] & 0x78E40000) == 0) {
                class195.field2707[var27] = var11 + 1;
                class57.field763[var27] = var12 - 1;
                class391.field5073[var21 + 1][var22 - 1] = 9;
                var27 = var27 + 1 & 0xFFF;
                class384.field4800[var21 + 1][var22 - 1] = var26;
            }
            if (var21 > 0 && var22 < 126 && class391.field5073[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][var24 + 1] & 0x4FA40000) == 0 && (var20[var23 - 1][var24 + 2] & 0x4E240000) == 0 && (var20[var23][var24 + 2] & 0x7E240000) == 0) {
                class195.field2707[var27] = var11 - 1;
                class57.field763[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class391.field5073[var21 - 1][var22 + 1] = 6;
                class384.field4800[var21 - 1][var22 + 1] = var26;
            }
            if (var21 < 126 && var22 < 126 && class391.field5073[var21 + 1][var22 + 1] == 0 && (var20[var23 + 1][var24 + 2] & 0x7E240000) == 0 && (var20[var23 + 2][var24 + 2] & 0x78240000) == 0 && (var20[var23 + 2][var24 + 1] & 0x78E40000) == 0) {
                class195.field2707[var27] = var11 + 1;
                class57.field763[var27] = var12 + 1;
                class391.field5073[var21 + 1][var22 + 1] = 12;
                var27 = var27 + 1 & 0xFFF;
                class384.field4800[var21 + 1][var22 + 1] = var26;
            }
        }
        class425.field5594 = var12;
        class317.field3948 = var11;
        return false;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB[BI)I")
    public final int method4332(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field10838++;
        if (arg3 < 0 || arg0 < 0 || (arg0 + arg3) > arg2.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field10843 < this.field10841) {
                var6 = this.field10845 + this.field10843 - this.field10841;
            } else {
                var6 = this.field10843 - this.field10841;
            }
            if (arg3 > var6) {
                arg3 = var6;
            }
            if (arg3 == 0 && this.field10830 != null) {
                throw new IOException(this.field10830.toString());
            }
            if (arg1 <= 56) {
                this.field10841 = -18;
            }
            if ((this.field10841 + arg3) > this.field10845) {
                int var7 = this.field10845 - this.field10841;
                class642.method3480(this.field10834, this.field10841, arg2, arg0, var7);
                class642.method3480(this.field10834, 0, arg2, arg0 + var7, -var7 + arg3);
            } else {
                class642.method3480(this.field10834, this.field10841, arg2, arg0, arg3);
            }
            this.field10841 = (this.field10841 + arg3) % this.field10845;
            this.notifyAll();
            return arg3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
    public class791(InputStream arg0, int arg1) {
        this.field10831 = arg0;
        this.field10845 = arg1 + 1;
        this.field10834 = new byte[this.field10845];
        this.field10842 = new Thread(this);
        this.field10842.setDaemon(true);
        this.field10842.start();
    }
}
