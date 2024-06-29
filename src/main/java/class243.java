import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class243 implements Runnable {

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Z")
    private boolean field4129 = false;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    private int field4134 = 0;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Z")
    private boolean field4131 = false;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    private int field4150 = 0;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "Lff;")
    private class4 field4148;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "Ljava/net/Socket;")
    private Socket field4143;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Ljava/io/InputStream;")
    private InputStream field4130;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field4144;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "[I")
    public static int[] field4139 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field4127 = 0;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "Lta;")
    private class82 field4137;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "[B")
    private byte[] field4136;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 10)
    public final void method1626(int arg0) {
        field4147++;
        if (this.field4129) {
            return;
        }
        if (arg0 != -472090175) {
            this.field4150 = -86;
        }
        this.field4130 = new class214();
        this.field4144 = new class288();
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V", line = 26)
    public final void method1627(int arg0) {
        field4140++;
        if (this.field4129) {
            return;
        }
        synchronized (this) {
            if (arg0 <= 79) {
                return;
            }
            this.field4129 = true;
            this.notifyAll();
        }
        if (this.field4137 != null) {
            while (this.field4137.field1500 == 0) {
                class46.method381(1L, 91);
            }
            if (this.field4137.field1500 == 1) {
                try {
                    ((Thread) this.field4137.field1499).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field4137 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(JB)V", line = 65)
    public static final void method1628(long arg0, byte arg1) {
        field4132++;
        if (arg0 == 0L) {
            return;
        }
        int var3 = -31 / ((19 - arg1) / 58);
        for (int var4 = 0; var4 < class129.field2263; var4++) {
            if (class62.field1090[var4] == arg0) {
                class129.field2263--;
                for (int var5 = var4; var5 < class129.field2263; var5++) {
                    class62.field1090[var5] = class62.field1090[var5 + 1];
                    class22.field284[var5] = class22.field284[var5 + 1];
                }
                class302.field5190++;
                class7.field113 = class35.field549;
                class308.field5322.method1599(1, (byte) -50);
                class308.field5322.method330(255, arg0);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)I", line = 108)
    public final int method1629(int arg0) throws IOException {
        if (arg0 != 0) {
            method1638(-99L, true);
        }
        field4149++;
        return this.field4129 ? 0 : this.field4130.read();
    }

    @OriginalMember(owner = "client!hj", name = "run", descriptor = "()V", line = 134)
    public final void run() {
        field4145++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field4150 == this.field4134) {
                        if (this.field4129) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    var3 = this.field4134;
                    if (this.field4150 >= this.field4134) {
                        var4 = this.field4150 - this.field4134;
                    } else {
                        var4 = 5000 - this.field4134;
                    }
                }
                if (var4 > 0) {
                    try {
                        this.field4144.write(this.field4136, var3, var4);
                    } catch (IOException var12) {
                        this.field4131 = true;
                    }
                    this.field4134 = (this.field4134 + var4) % 5000;
                    try {
                        if (this.field4150 == this.field4134) {
                            this.field4144.flush();
                        }
                    } catch (IOException var11) {
                        this.field4131 = true;
                    }
                }
            }
            try {
                if (this.field4130 != null) {
                    this.field4130.close();
                }
                if (this.field4144 != null) {
                    this.field4144.close();
                }
                if (this.field4143 != null) {
                    this.field4143.close();
                }
            } catch (IOException var10) {
            }
            this.field4136 = null;
        } catch (Exception var15) {
            class7.method48((String) null, (byte) 77, var15);
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Ljava/net/Socket;Lff;)V", line = 594)
    public class243(Socket arg0, class4 arg1) throws IOException {
        this.field4148 = arg1;
        this.field4143 = arg0;
        this.field4143.setSoTimeout(30000);
        this.field4143.setTcpNoDelay(true);
        this.field4130 = this.field4143.getInputStream();
        this.field4144 = this.field4143.getOutputStream();
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIZIIII)V", line = 213)
    public static final void method1630(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3) {
            return;
        }
        field4141++;
        int var8 = arg2;
        int var9 = 0;
        int var10 = arg2 - arg7;
        int var11 = arg2 * arg2;
        int var12 = arg4 * arg4;
        int var13 = 0;
        int var14 = arg4 - arg7;
        int var15 = var14 * var14;
        int var16 = var11 << 1;
        int var17 = var10 * var10;
        int var18 = var12 << 1;
        int var19 = var17 << 1;
        int var20 = arg2 << 1;
        int var21 = var15 << 1;
        int var22 = (1 - var20) * var12 + var16;
        int var23 = var10 << 1;
        int var24 = var11 - (var20 - 1) * var18;
        int var25 = var17 - (var23 - 1) * var21;
        int var26 = (1 - var23) * var15 + var19;
        int var27 = var12 << 2;
        int var28 = var15 << 2;
        int var29 = var11 << 2;
        int var30 = var17 << 2;
        int var31 = var16 * 3;
        int var32 = (var23 - 3) * var21;
        int var33 = (var20 - 3) * var18;
        int var34 = var19 * 3;
        int var35 = var29;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        int var38 = (var10 - 1) * var28;
        int[] var39 = class308.field5329[arg6];
        class73.method550(-29903, var39, arg1 - var14, -arg4 + arg1, arg0);
        class73.method550(-29903, var39, arg1 + var14, -var14 + arg1, arg5);
        class73.method550(-29903, var39, arg1 + arg4, arg1 + var14, arg0);
        while (var8 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var24 += var35;
                    var13++;
                    var22 += var31;
                    var35 += var29;
                    var31 += var29;
                }
            }
            boolean var40 = var10 >= var8;
            if (var24 < 0) {
                var22 += var31;
                var24 += var35;
                var35 += var29;
                var13++;
                var31 += var29;
            }
            var22 += -var36;
            var24 += -var33;
            int var41 = arg1 + var13;
            var36 -= var27;
            var33 -= var27;
            int var42 = arg1 - var13;
            if (var40) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var25 += var37;
                        var26 += var34;
                        var37 += var30;
                        var9++;
                        var34 += var30;
                    }
                }
                if (var25 < 0) {
                    var9++;
                    var25 += var37;
                    var37 += var30;
                    var26 += var34;
                    var34 += var30;
                }
                var26 += -var38;
                var38 -= var28;
                var25 += -var32;
                var32 -= var28;
            }
            var8--;
            int var43 = arg6 + var8;
            int var44 = arg6 - var8;
            if (var40) {
                int var45 = arg1 + var9;
                int var46 = arg1 - var9;
                class73.method550(-29903, class308.field5329[var44], var46, var42, arg0);
                class73.method550(-29903, class308.field5329[var44], var45, var46, arg5);
                class73.method550(-29903, class308.field5329[var44], var41, var45, arg0);
                class73.method550(-29903, class308.field5329[var43], var46, var42, arg0);
                class73.method550(-29903, class308.field5329[var43], var45, var46, arg5);
                class73.method550(-29903, class308.field5329[var43], var41, var45, arg0);
            } else {
                class73.method550(-29903, class308.field5329[var44], var41, var42, arg0);
                class73.method550(-29903, class308.field5329[var43], var41, var42, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)V", line = 392)
    public static final void method1631(byte arg0, int arg1) {
        field4146++;
        if (arg0 == -96) {
            class171.field3045.method2075(arg1, 1);
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V", line = 403)
    public static void method1632(int arg0) {
        field4139 = null;
        if (arg0 < 70) {
            method1632(7);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)I", line = 413)
    public final int method1633(byte arg0) throws IOException {
        field4133++;
        if (this.field4129) {
            return 0;
        } else if (arg0 == -5) {
            return this.field4130.available();
        } else {
            return 54;
        }
    }

    @OriginalMember(owner = "client!hj", name = "finalize", descriptor = "()V", line = 443)
    protected final void finalize() {
        this.method1627(113);
        field4128++;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)I", line = 453)
    public static final int method1634(byte arg0) {
        if (arg0 != -40) {
            method1634((byte) -71);
        }
        field4126++;
        return 6;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[BII)V", line = 465)
    public final void method1635(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4138++;
        if (arg3 != -1078) {
            this.field4130 = (InputStream) null;
        }
        if (this.field4129) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field4130.read(arg1, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg0 += var5;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI[BI)V", line = 495)
    public final void method1636(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4135++;
        if (this.field4129) {
            return;
        }
        if (this.field4131) {
            this.field4131 = false;
            throw new IOException();
        }
        if (this.field4136 == null) {
            this.field4136 = new byte[5000];
        }
        if (arg0 != 20) {
            this.field4129 = true;
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field4136[this.field4150] = arg2[arg1 + var6];
                this.field4150 = (this.field4150 + 1) % 5000;
                if (((this.field4134 + 4900) % 5000) == this.field4150) {
                    throw new IOException();
                }
            }
            if (this.field4137 == null) {
                this.field4137 = this.field4148.method20(3, this, (byte) 126);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V", line = 551)
    public final void method1637(boolean arg0) throws IOException {
        field4142++;
        if (this.field4129) {
            return;
        }
        if (arg0) {
            field4127 = -114;
        }
        if (this.field4131) {
            this.field4131 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(JZ)V", line = 583)
    public static final void method1638(long arg0, boolean arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
        if (arg1) {
            field4127 = -83;
        }
        field4151++;
    }
}
