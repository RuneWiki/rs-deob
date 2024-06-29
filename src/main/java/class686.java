import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class686 implements Runnable {

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "Z")
    private boolean field9522 = false;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "Z")
    private boolean field9527 = false;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
    private int field9528 = 0;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
    private int field9540 = 0;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "Ltd;")
    private class477 field9526;

    @OriginalMember(owner = "client!sv", name = "w", descriptor = "Ljava/net/Socket;")
    private Socket field9544;

    @OriginalMember(owner = "client!sv", name = "x", descriptor = "Ljava/io/InputStream;")
    private InputStream field9545;

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field9534;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
    private int field9543;

    @OriginalMember(owner = "client!sv", name = "y", descriptor = "Lsaa;")
    public static class345 field9546 = new class345(4, 1);

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public static int field9523;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field9524;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
    public static int field9529;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "I")
    public static int field9530;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "I")
    public static int field9531;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "I")
    public static int field9532;

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "I")
    public static int field9535;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
    public static int field9536;

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
    public static int field9537;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
    public static int field9538;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "I")
    public static int field9539;

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
    public static int field9541;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "Lhu;")
    private class141 field9542;

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "Ljc;")
    public static class462 field9533;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "[B")
    private byte[] field9525;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
    public final void method3865(byte arg0) throws IOException {
        field9530++;
        if (!this.field9527 && arg0 > 70 && this.field9522) {
            this.field9522 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public final void method3866(int arg0) {
        field9538++;
        if (arg0 == 26931 && !this.field9527) {
            this.field9545 = new class35();
            this.field9534 = new class290();
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)V")
    public static final void method3867(int arg0, int arg1, int arg2) {
        if (class293.field4278 != arg2) {
            class581.field8200 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class581.field8200[var3] = (var3 << 12) / arg2;
            }
            class625.field8759 = arg2 - 1;
            class293.field4278 = arg2;
            class602.field8438 = arg2 * 32;
        }
        field9536++;
        if (class270.field3923 != arg1) {
            if (class293.field4278 == arg1) {
                class633.field8892 = class581.field8200;
            } else {
                class633.field8892 = new int[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    class633.field8892[var4] = (var4 << 12) / arg1;
                }
            }
            class305.field4391 = arg1 - 1;
            class270.field3923 = arg1;
        }
        if (arg0 != -9851) {
            field9533 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)I")
    public final int method3868(byte arg0) throws IOException {
        field9524++;
        if (this.field9527) {
            return 0;
        } else if (arg0 == 47) {
            return this.field9545.available();
        } else {
            return -109;
        }
    }

    @OriginalMember(owner = "client!sv", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method3871((byte) 115);
        field9539++;
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(B)I")
    public final int method3869(byte arg0) throws IOException {
        field9531++;
        if (this.field9527) {
            return 0;
        } else {
            if (arg0 != -64) {
                this.field9527 = false;
            }
            return this.field9545.read();
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BILjs;)Z")
    public static final boolean method3870(byte arg0, int arg1, class349 arg2) {
        field9541++;
        int var3 = arg2.method2216(-126, 2);
        if (var3 == 0) {
            if (arg2.method2216(-121, 1) != 0) {
                method3870((byte) -114, arg1, arg2);
            }
            int var4 = arg2.method2216(-107, 6);
            int var5 = arg2.method2216(-100, 6);
            boolean var6 = arg2.method2216(-113, 1) == 1;
            if (var6) {
                class436.field5881[class725.field10029++] = arg1;
            }
            if (class767.field10560[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class642 var7 = class451.field6312[arg1];
            class702 var8 = class767.field10560[arg1] = new class702();
            var8.field4640 = arg1;
            if (class85.field932[arg1] != null) {
                var8.method3969((byte) -86, class85.field932[arg1]);
            }
            var8.method2103(false, true, var7.field8989);
            var8.field4584 = var7.field8981;
            int var9 = var7.field8988;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FC5EA) >> 14;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class124.field1922;
            var8.field9777 = var7.field8983;
            var8.field9767 = var7.field8984;
            int var14 = (var12 << 6) + var5 - class88.field999;
            var8.field4674[0] = class256.field3766[arg1];
            var8.field5755 = var8.field5749 = (byte) var10;
            if (class124.method941(4, var14, var13)) {
                var8.field5749++;
            }
            var8.method3978(var13, var14, (byte) 125);
            var8.field9758 = false;
            class451.field6312[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg2.method2216(-98, 2);
            int var16 = class451.field6312[arg1].field8988;
            class451.field6312[arg1].field8988 = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg2.method2216(-125, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class451.field6312[arg1].field8988;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = (var20 & 0x3FD627) >> 14;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var23--;
                var22--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var22++;
                var23--;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var23++;
                var22--;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var22++;
                var23++;
            }
            class451.field6312[arg1].field8988 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg2.method2216(-127, 18);
            if (arg0 > -83) {
                field9533 = null;
            }
            int var25 = var24 >> 16;
            int var26 = (var24 & 0xFFEF) >> 8;
            int var27 = var24 & 0xFF;
            int var28 = class451.field6312[arg1].field8988;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = var27 + var28 & 0xFF;
            class451.field6312[arg1].field8988 = (var29 << 28) + (var30 << 14) + var31;
            return false;
        }
    }

    @OriginalMember(owner = "client!sv", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field9540 == this.field9528) {
                            if (this.field9527) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field9540 <= this.field9528) {
                            var2 = this.field9528 - this.field9540;
                        } else {
                            var2 = this.field9543 - this.field9540;
                        }
                        var3 = this.field9540;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field9534.write(this.field9525, var3, var2);
                    } catch (IOException var9) {
                        this.field9522 = true;
                    }
                    this.field9540 = (this.field9540 + var2) % this.field9543;
                    try {
                        if (this.field9540 == this.field9528) {
                            this.field9534.flush();
                        }
                    } catch (IOException var8) {
                        this.field9522 = true;
                    }
                    continue;
                }
                try {
                    if (this.field9545 != null) {
                        this.field9545.close();
                    }
                    if (this.field9534 != null) {
                        this.field9534.close();
                    }
                    if (this.field9544 != null) {
                        this.field9544.close();
                    }
                } catch (IOException var7) {
                }
                this.field9525 = null;
                break;
            }
        } catch (Exception var12) {
            class678.method3848(null, var12, false);
        }
        field9523++;
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(B)V")
    public final void method3871(byte arg0) {
        field9537++;
        if (arg0 < 90) {
            this.field9540 = -123;
        }
        if (this.field9527) {
            return;
        }
        synchronized (this) {
            this.field9527 = true;
            this.notifyAll();
        }
        if (this.field9542 != null) {
            while (this.field9542.field2089 == 0) {
                class107.method828(1L, (byte) -64);
            }
            if (this.field9542.field2089 == 1) {
                try {
                    ((Thread) this.field9542.field2092).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field9542 = null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IZI[B)V")
    public final void method3872(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        field9535++;
        if (!arg1) {
            this.field9527 = false;
        }
        if (this.field9527) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field9545.read(arg3, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(III)Z")
    public static final boolean method3873(int arg0, int arg1, int arg2) {
        field9529++;
        if (arg1 != 1963081224) {
            field9533 = null;
        }
        return class133.method982((byte) 85, arg0, arg2) || class26.method240(10420, arg2, arg0);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)V")
    public static void method3874(boolean arg0) {
        field9546 = null;
        if (arg0) {
            field9533 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Ljava/net/Socket;Ltd;I)V")
    public class686(Socket arg0, class477 arg1, int arg2) throws IOException {
        this.field9526 = arg1;
        this.field9544 = arg0;
        this.field9544.setSoTimeout(30000);
        this.field9544.setTcpNoDelay(true);
        this.field9545 = this.field9544.getInputStream();
        this.field9534 = this.field9544.getOutputStream();
        this.field9543 = arg2;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II[BI)V")
    public final void method3875(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field9532++;
        int var5 = -39 % ((arg1 - 8) / 61);
        if (this.field9527) {
            return;
        }
        if (this.field9522) {
            this.field9522 = false;
            throw new IOException();
        }
        if (this.field9525 == null) {
            this.field9525 = new byte[this.field9543];
        }
        synchronized (this) {
            for (int var7 = 0; var7 < arg3; var7++) {
                this.field9525[this.field9528] = arg2[arg0 + var7];
                this.field9528 = (this.field9528 + 1) % this.field9543;
                if (((this.field9543 + this.field9540 - 100) % this.field9543) == this.field9528) {
                    throw new IOException();
                }
            }
            if (this.field9542 == null) {
                this.field9542 = this.field9526.method2850(3, this, 110);
            }
            this.notifyAll();
        }
    }
}
