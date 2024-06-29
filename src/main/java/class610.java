import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class610 implements Runnable {

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "Z")
    private boolean field8662 = false;

    @OriginalMember(owner = "client!dv", name = "p", descriptor = "I")
    private int field8669 = 0;

    @OriginalMember(owner = "client!dv", name = "t", descriptor = "Z")
    private boolean field8673 = false;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    private int field8663 = 0;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "Ljava/net/Socket;")
    private Socket field8665;

    @OriginalMember(owner = "client!dv", name = "u", descriptor = "Lk;")
    private class525 field8674;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "Ljava/io/InputStream;")
    private InputStream field8658;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field8664;

    @OriginalMember(owner = "client!dv", name = "r", descriptor = "Lhga;")
    public static class158 field8671 = new class158(31, -2);

    @OriginalMember(owner = "client!dv", name = "v", descriptor = "Ltr;")
    public static class268 field8675 = new class268(16);

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "[I")
    public static int[] field8679 = new int[13];

    @OriginalMember(owner = "client!dv", name = "y", descriptor = "Lor;")
    public static class594 field8678 = new class594();

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    public static int field8654;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field8657;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
    public static int field8661;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public static int field8667;

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "I")
    public static int field8668;

    @OriginalMember(owner = "client!dv", name = "q", descriptor = "I")
    public static int field8670;

    @OriginalMember(owner = "client!dv", name = "s", descriptor = "I")
    public static int field8672;

    @OriginalMember(owner = "client!dv", name = "x", descriptor = "I")
    public static int field8677;

    @OriginalMember(owner = "client!dv", name = "A", descriptor = "Lbca;")
    public static class613 field8680;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "Lsw;")
    private class701 field8666;

    @OriginalMember(owner = "client!dv", name = "w", descriptor = "[B")
    private byte[] field8676;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)I", line = 4)
    public final int method3546(int arg0) throws IOException {
        if (arg0 != 3) {
            field8671 = null;
        }
        field8667++;
        return this.field8662 ? 0 : this.field8658.available();
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V", line = 24)
    public final void method3547(int arg0) {
        field8661++;
        if (this.field8662) {
            return;
        }
        this.field8658 = new class127();
        this.field8664 = new class646();
        if (arg0 != 0) {
            method3551(false);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V", line = 41)
    public final void method3548(byte arg0) throws IOException {
        field8656++;
        if (this.field8662) {
            return;
        }
        if (arg0 >= -118) {
            this.method3554((byte) -90);
        }
        if (this.field8673) {
            this.field8673 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Ljava/net/Socket;Lk;)V", line = 506)
    public class610(Socket arg0, class525 arg1) throws IOException {
        this.field8665 = arg0;
        this.field8674 = arg1;
        this.field8665.setSoTimeout(30000);
        this.field8665.setTcpNoDelay(true);
        this.field8658 = this.field8665.getInputStream();
        this.field8664 = this.field8665.getOutputStream();
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIII[II)Z", line = 69)
    public static final boolean method3549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        if (arg2 < arg3) {
            arg2 = 0;
        }
        field8670++;
        if (arg1 > class245.field3908) {
            arg1 = class245.field3908;
        }
        if (arg1 <= arg2) {
            return true;
        }
        int var8 = arg2 + arg0 - 1;
        int var9 = arg1 - arg2 >> 2;
        int var10 = arg2 * arg7 + arg5;
        if (class182.field3061 == 1) {
            class504.field7375 += var9;
            while (true) {
                var9--;
                if (var9 < 0) {
                    int var16 = arg1 - arg2 & 0x3;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            return true;
                        }
                        var8++;
                        if (var10 < arg6[var8]) {
                            arg6[var8] = var10;
                        }
                        var10 += arg7;
                    }
                }
                var8++;
                if (arg6[var8] > var10) {
                    arg6[var8] = var10;
                }
                int var17 = arg7 + var10;
                var8++;
                if (arg6[var8] > var17) {
                    arg6[var8] = var17;
                }
                int var18 = arg7 + var17;
                var8++;
                if (arg6[var8] > var18) {
                    arg6[var8] = var18;
                }
                int var19 = arg7 + var18;
                var8++;
                if (var19 < arg6[var8]) {
                    arg6[var8] = var19;
                }
                var10 = arg7 + var19;
            }
        } else {
            int var11 = var10 - 38400;
            while (true) {
                var9--;
                if (var9 < 0) {
                    int var12 = arg1 - arg2 & 0x3;
                    while (true) {
                        var12--;
                        if (var12 < 0) {
                            return true;
                        }
                        var8++;
                        if (var11 < arg6[var8]) {
                            return false;
                        }
                        var11 += arg7;
                    }
                }
                var8++;
                if (arg6[var8] > var11) {
                    return false;
                }
                int var13 = arg7 + var11;
                var8++;
                if (var13 < arg6[var8]) {
                    return false;
                }
                int var14 = arg7 + var13;
                var8++;
                if (var14 < arg6[var8]) {
                    return false;
                }
                int var15 = arg7 + var14;
                var8++;
                if (var15 < arg6[var8]) {
                    return false;
                }
                var11 = arg7 + var15;
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "run", descriptor = "()V", line = 167)
    public final void run() {
        field8655++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field8669 == this.field8663) {
                        if (this.field8662) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field8669;
                    if (this.field8669 > this.field8663) {
                        var3 = 5000 - this.field8669;
                    } else {
                        var3 = this.field8663 - this.field8669;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field8664.write(this.field8676, var2, var3);
                    } catch (IOException var9) {
                        this.field8673 = true;
                    }
                    this.field8669 = (this.field8669 + var3) % 5000;
                    try {
                        if (this.field8669 == this.field8663) {
                            this.field8664.flush();
                        }
                    } catch (IOException var8) {
                        this.field8673 = true;
                    }
                }
            }
            try {
                if (this.field8658 != null) {
                    this.field8658.close();
                }
                if (this.field8664 != null) {
                    this.field8664.close();
                }
                if (this.field8665 != null) {
                    this.field8665.close();
                }
            } catch (IOException var7) {
            }
            this.field8676 = null;
        } catch (Exception var12) {
            class660.method3790(10216, var12, null);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(JB)V", line = 237)
    public static final void method3550(long arg0, byte arg1) {
        if (arg1 != 91) {
            return;
        }
        field8659++;
        int var3 = class132.field2156 + class567.field8141.field9696;
        int var4 = class567.field8141.field9705 + class529.field7711;
        if (class686.field9621 - var3 < -2000 || (class686.field9621 - var3) > 2000 || class473.field7001 - var4 < -2000 || class473.field7001 - var4 > 2000) {
            class686.field9621 = var3;
            class473.field7001 = var4;
        }
        if (class686.field9621 != var3) {
            int var5 = var3 - class686.field9621;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class686.field9621 += var6;
        }
        if (!class17.field282.field4878) {
            class162.field2746 += (float) arg0 * class254.field4045 / 6.0F;
            class37.field514 += (float) arg0 * class574.field8188 / 6.0F;
        }
        if (class473.field7001 != var4) {
            int var7 = var4 - class473.field7001;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class473.field7001 += var8;
        }
        class220.method1634((byte) 28);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Z)V", line = 327)
    public static void method3551(boolean arg0) {
        field8675 = null;
        field8671 = null;
        field8678 = null;
        field8679 = null;
        field8680 = null;
        if (!arg0) {
            method3550(29L, (byte) -65);
        }
    }

    @OriginalMember(owner = "client!dv", name = "finalize", descriptor = "()V", line = 342)
    protected final void finalize() {
        this.method3554((byte) 126);
        field8660++;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "([BIIZ)V", line = 354)
    public final void method3552(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        field8672++;
        if (this.field8662) {
            return;
        }
        if (this.field8673) {
            this.field8673 = false;
            throw new IOException();
        }
        if (!arg3) {
            this.field8658 = null;
        }
        if (this.field8676 == null) {
            this.field8676 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field8676[this.field8663] = arg0[arg1 + var6];
                this.field8663 = (this.field8663 + 1) % 5000;
                if ((this.field8669 + 4900) % 5000 == this.field8663) {
                    throw new IOException();
                }
            }
            if (this.field8666 == null) {
                this.field8666 = this.field8674.method3180(this, false, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(B)I", line = 407)
    public final int method3553(byte arg0) throws IOException {
        field8668++;
        if (arg0 > -1) {
            this.field8666 = null;
        }
        return this.field8662 ? 0 : this.field8658.read();
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(B)V", line = 422)
    public final void method3554(byte arg0) {
        field8657++;
        if (arg0 < 92 || this.field8662) {
            return;
        }
        synchronized (this) {
            this.field8662 = true;
            this.notifyAll();
        }
        if (this.field8666 != null) {
            while (this.field8666.field9884 == 0) {
                class549.method3313(1L, 124);
            }
            if (this.field8666.field9884 == 1) {
                try {
                    ((Thread) this.field8666.field9885).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field8666 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "([BIII)V", line = 467)
    public final void method3555(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field8654++;
        if (this.field8662) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field8658.read(arg0, arg3, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 -= var5;
            arg3 += var5;
        }
        if (arg2 > -77) {
            this.method3547(-4);
        }
    }
}
