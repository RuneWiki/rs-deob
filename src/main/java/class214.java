import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class214 implements Runnable {

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    private int field3651 = 0;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    private int field3657 = 0;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Z")
    private boolean field3653 = false;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "Z")
    private boolean field3664 = false;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field3649;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Laf;")
    private class67 field3659;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Ljava/io/InputStream;")
    private InputStream field3658;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3656;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field3652 = 0;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field3647 = 0;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "[I")
    public static int[] field3669 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Ljj;")
    private class103 field3662;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "Lnf;")
    public static class155 field3672;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "[B")
    private byte[] field3670;

    @OriginalMember(owner = "client!me", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field3657 == this.field3651) {
                            if (this.field3653) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.field3657;
                        if (this.field3651 >= this.field3657) {
                            var3 = this.field3651 - this.field3657;
                        } else {
                            var3 = 5000 - this.field3657;
                        }
                    }
                    if (var3 <= 0) {
                        continue;
                    }
                    try {
                        this.field3656.write(this.field3670, var2, var3);
                    } catch (IOException var9) {
                        this.field3664 = true;
                    }
                    this.field3657 = (this.field3657 + var3) % 5000;
                    try {
                        if (this.field3657 == this.field3651) {
                            this.field3656.flush();
                        }
                    } catch (IOException var8) {
                        this.field3664 = true;
                    }
                    continue;
                }
                try {
                    if (this.field3658 != null) {
                        this.field3658.close();
                    }
                    if (this.field3656 != null) {
                        this.field3656.close();
                    }
                    if (this.field3649 != null) {
                        this.field3649.close();
                    }
                } catch (IOException var7) {
                }
                this.field3670 = null;
                break;
            }
        } catch (Exception var12) {
            class158.method1123((String) null, (byte) -122, var12);
        }
        field3667++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)[Lgj;")
    public static final class225[] method1430(byte arg0) {
        field3663++;
        if (arg0 != 76) {
            method1430((byte) -38);
        }
        class225[] var1 = new class225[class92.field1668];
        for (int var2 = 0; var2 < class92.field1668; var2++) {
            int var3 = class175.field3063[var2] * class174.field3060[var2];
            byte[] var4 = class127.field2221[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class139.field2398[class272.method1817(var4[var6], 255)];
            }
            var1[var2] = new class225(class52.field1094, class43.field944, class252.field4341[var2], class226.field3868[var2], class174.field3060[var2], class175.field3063[var2], var5);
        }
        class190.method1291((byte) 103);
        return var1;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
    public final void method1431(byte arg0) {
        if (arg0 != 49) {
            this.field3656 = null;
        }
        field3661++;
        if (this.field3653) {
            return;
        }
        synchronized (this) {
            this.field3653 = true;
            this.notifyAll();
        }
        if (this.field3662 != null) {
            while (this.field3662.field1823 == 0) {
                class84.method645(1, 1L);
            }
            if (this.field3662.field1823 == 1) {
                try {
                    ((Thread) this.field3662.field1826).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3662 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method1432(int arg0) {
        field3669 = null;
        field3672 = null;
        if (arg0 <= 94) {
            method1432(12);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIIIZIII)Z")
    public static final boolean method1433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        field3646++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class119.field2092[var12][var31] = 0;
                class203.field3484[var12][var31] = 99999999;
            }
        }
        if (arg11 != 19782) {
            method1433(-1, -25, 82, -55, -113, -1, 87, -110, false, -87, 67, 85);
        }
        class119.field2092[arg2][arg3] = 99;
        int var13 = arg3;
        class203.field3484[arg2][arg3] = 0;
        int var14 = arg2;
        byte var15 = 0;
        class36.field793[var15] = arg2;
        int var32 = var15 + 1;
        class94.field1673[var15] = arg3;
        int var16 = 0;
        boolean var17 = false;
        int[][] var18 = class146.field2613[class274.field4798].field470;
        while (var32 != var16) {
            var13 = class94.field1673[var16];
            var14 = class36.field793[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg4 == var14 && arg9 == var13) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && class146.field2613[class274.field4798].method226(arg9, (byte) -44, 2, arg6, var14, arg5 - 1, var13, arg4)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && class146.field2613[class274.field4798].method224(var14, arg5 - 1, arg6, (byte) 12, arg4, 2, var13, arg9)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg0 != 0 && class146.field2613[class274.field4798].method235(arg0, 2, arg4, var14, arg1, arg9, arg7, 8507, var13)) {
                var17 = true;
                break;
            }
            int var30 = class203.field3484[var14][var13] + 1;
            if (var14 > 0 && class119.field2092[var14 - 1][var13] == 0 && (var18[var14 - 1][var13] & 0x12C010E) == 0 && (var18[var14 - 1][var13 + 1] & 0x12C0138) == 0) {
                class36.field793[var32] = var14 - 1;
                class94.field1673[var32] = var13;
                class119.field2092[var14 - 1][var13] = 2;
                class203.field3484[var14 - 1][var13] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && class119.field2092[var14 + 1][var13] == 0 && (var18[var14 + 2][var13] & 0x12C0183) == 0 && (var18[var14 + 2][var13 + 1] & 0x12C01E0) == 0) {
                class36.field793[var32] = var14 + 1;
                class94.field1673[var32] = var13;
                var32 = var32 + 1 & 0xFFF;
                class119.field2092[var14 + 1][var13] = 8;
                class203.field3484[var14 + 1][var13] = var30;
            }
            if (var13 > 0 && class119.field2092[var14][var13 - 1] == 0 && (var18[var14][var13 - 1] & 0x12C010E) == 0 && (var18[var14 + 1][var13 - 1] & 0x12C0183) == 0) {
                class36.field793[var32] = var14;
                class94.field1673[var32] = var13 - 1;
                var32 = var32 + 1 & 0xFFF;
                class119.field2092[var14][var13 - 1] = 1;
                class203.field3484[var14][var13 - 1] = var30;
            }
            if (var13 < 102 && class119.field2092[var14][var13 + 1] == 0 && (var18[var14][var13 + 2] & 0x12C0138) == 0 && (var18[var14 + 1][var13 + 2] & 0x12C01E0) == 0) {
                class36.field793[var32] = var14;
                class94.field1673[var32] = var13 + 1;
                class119.field2092[var14][var13 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class203.field3484[var14][var13 + 1] = var30;
            }
            if (var14 > 0 && var13 > 0 && class119.field2092[var14 - 1][var13 - 1] == 0 && (var18[var14 - 1][var13] & 0x12C0138) == 0 && (var18[var14 - 1][var13 - 1] & 0x12C010E) == 0 && (var18[var14][var13 - 1] & 0x12C0183) == 0) {
                class36.field793[var32] = var14 - 1;
                class94.field1673[var32] = var13 - 1;
                var32 = var32 + 1 & 0xFFF;
                class119.field2092[var14 - 1][var13 - 1] = 3;
                class203.field3484[var14 - 1][var13 - 1] = var30;
            }
            if (var14 < 102 && var13 > 0 && class119.field2092[var14 + 1][var13 - 1] == 0 && (var18[var14 + 1][var13 - 1] & 0x12C010E) == 0 && (var18[var14 + 2][var13 - 1] & 0x12C0183) == 0 && (var18[var14 + 2][var13] & 0x12C01E0) == 0) {
                class36.field793[var32] = var14 + 1;
                class94.field1673[var32] = var13 - 1;
                class119.field2092[var14 + 1][var13 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class203.field3484[var14 + 1][var13 - 1] = var30;
            }
            if (var14 > 0 && var13 < 102 && class119.field2092[var14 - 1][var13 + 1] == 0 && (var18[var14 - 1][var13 + 1] & 0x12C010E) == 0 && (var18[var14 - 1][var13 + 2] & 0x12C0138) == 0 && (var18[var14][var13 + 2] & 0x12C01E0) == 0) {
                class36.field793[var32] = var14 - 1;
                class94.field1673[var32] = var13 + 1;
                class119.field2092[var14 - 1][var13 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class203.field3484[var14 - 1][var13 + 1] = var30;
            }
            if (var14 < 102 && var13 < 102 && class119.field2092[var14 + 1][var13 + 1] == 0 && (var18[var14 + 1][var13 + 2] & 0x12C0138) == 0 && (var18[var14 + 2][var13 + 2] & 0x12C01E0) == 0 && (var18[var14 + 2][var13 + 1] & 0x12C0183) == 0) {
                class36.field793[var32] = var14 + 1;
                class94.field1673[var32] = var13 + 1;
                var32 = var32 + 1 & 0xFFF;
                class119.field2092[var14 + 1][var13 + 1] = 12;
                class203.field3484[var14 + 1][var13 + 1] = var30;
            }
        }
        class94.field1678 = 0;
        if (!var17) {
            if (!arg8) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg4 - var21; var22 <= arg4 + var21; var22++) {
                for (int var23 = arg9 - var21; var23 <= (arg9 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class203.field3484[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (arg4 > var22) {
                            var24 = arg4 - var22;
                        } else if (arg4 + arg7 - 1 < var22) {
                            var24 = var22 - arg7 - (arg4 - 1);
                        }
                        if (arg9 > var23) {
                            var25 = arg9 - var23;
                        } else if (arg9 + arg0 - 1 < var23) {
                            var25 = var23 + 1 - arg0 - arg9;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var19 || var19 == var26 && class203.field3484[var22][var23] < var20) {
                            var13 = var23;
                            var19 = var26;
                            var14 = var22;
                            var20 = class203.field3484[var22][var23];
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg2 == var14 && arg3 == var13) {
                return false;
            }
            class94.field1678 = 1;
        }
        byte var27 = 0;
        class36.field793[var27] = var14;
        int var33 = var27 + 1;
        class94.field1673[var27] = var13;
        int var28;
        int var29 = var28 = class119.field2092[var14][var13];
        while (arg2 != var14 || arg3 != var13) {
            if (var28 != var29) {
                var28 = var29;
                class36.field793[var33] = var14;
                class94.field1673[var33++] = var13;
            }
            if ((var29 & 0x2) != 0) {
                var14++;
            } else if ((var29 & 0x8) != 0) {
                var14--;
            }
            if ((var29 & 0x1) != 0) {
                var13++;
            } else if ((var29 & 0x4) != 0) {
                var13--;
            }
            var29 = class119.field2092[var14][var13];
        }
        if (var33 > 0) {
            class104.method778(arg10, 3, var33);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III[B)V")
    public final void method1434(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3665++;
        if (this.field3653) {
            return;
        }
        if (arg1 != -26363) {
            this.field3653 = true;
        }
        if (this.field3664) {
            this.field3664 = false;
            throw new IOException();
        }
        if (this.field3670 == null) {
            this.field3670 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field3670[this.field3651] = arg3[arg0 + var6];
                this.field3651 = (this.field3651 + 1) % 5000;
                if ((this.field3657 + 4900) % 5000 == this.field3651) {
                    throw new IOException();
                }
            }
            if (this.field3662 == null) {
                this.field3662 = this.field3659.method542(this, 0, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(III[B)V")
    public final void method1435(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 != 18461) {
            field3669 = null;
        }
        field3668++;
        if (this.field3653) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field3658.read(arg3, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZII[Lw;IB)V")
    public static final void method1436(boolean arg0, int arg1, int arg2, class141[] arg3, int arg4, byte arg5) {
        for (int var6 = 0; var6 < arg3.length; var6++) {
            class141 var7 = arg3[var6];
            if (var7 != null && var7.field2535 == arg1) {
                class22.method209(true, arg0, arg4, arg2, var7);
                class45.method422((byte) -118, arg4, arg2, var7);
                if (var7.field2461 - var7.field2575 < var7.field2555) {
                    var7.field2555 = var7.field2461 - var7.field2575;
                }
                if (var7.field2555 < 0) {
                    var7.field2555 = 0;
                }
                if (var7.field2413 > (var7.field2500 - var7.field2490)) {
                    var7.field2413 = var7.field2500 - var7.field2490;
                }
                if (var7.field2413 < 0) {
                    var7.field2413 = 0;
                }
                if (var7.field2529 == 0) {
                    class230.method1523(arg0, var7, 7318);
                }
            }
        }
        if (arg5 >= -102) {
            method1439((byte) -17, (class32) null);
        }
        field3666++;
    }

    @OriginalMember(owner = "client!me", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1431((byte) 49);
        field3648++;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)I")
    public final int method1437(byte arg0) throws IOException {
        if (arg0 != 85) {
            this.field3670 = null;
        }
        field3655++;
        return this.field3653 ? 0 : this.field3658.read();
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)I")
    public final int method1438(int arg0) throws IOException {
        if (arg0 != 12) {
            this.method1431((byte) -128);
        }
        field3650++;
        return this.field3653 ? 0 : this.field3658.available();
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BLie;)Lnc;")
    public static final class84 method1439(byte arg0, class32 arg1) {
        if (arg0 == 96) {
            field3671++;
            return new class84(arg1.method309(-489706920), arg1.method309(arg0 - 489707016), arg1.method309(arg0 - 489707016), arg1.method309(-489706920), arg1.method313((byte) -80), arg1.method313((byte) -80), arg1.method316((byte) 113));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ljava/net/Socket;Laf;)V")
    public class214(Socket arg0, class67 arg1) throws IOException {
        this.field3649 = arg0;
        this.field3659 = arg1;
        this.field3649.setSoTimeout(30000);
        this.field3649.setTcpNoDelay(true);
        this.field3658 = this.field3649.getInputStream();
        this.field3656 = this.field3649.getOutputStream();
    }
}
