import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class456 implements Runnable {

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Z")
    private boolean field6296 = false;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    private int field6297 = 0;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Z")
    private boolean field6303 = false;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    private int field6306 = 0;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "Ljava/net/Socket;")
    private Socket field6317;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "Ldq;")
    private class14 field6316;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "Ljava/io/InputStream;")
    private InputStream field6315;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field6295;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "Ltm;")
    public static class112 field6304 = new class112("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "[I")
    public static int[] field6320 = new int[14];

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "La;")
    private class420 field6298;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "[B")
    private byte[] field6312;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "[I")
    public static int[] field6318;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)I")
    public final int method2630(byte arg0) throws IOException {
        field6311++;
        if (arg0 < 70) {
            field6318 = null;
        }
        return this.field6296 ? 0 : this.field6315.read();
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method2631(int arg0) {
        field6318 = null;
        field6320 = null;
        field6304 = null;
        if (arg0 > -85) {
            field6313 = -10;
        }
    }

    @OriginalMember(owner = "client!jg", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field6305++;
        this.method2632(32214);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public final void method2632(int arg0) {
        field6310++;
        if (this.field6296) {
            return;
        }
        synchronized (this) {
            this.field6296 = true;
            if (arg0 != 32214) {
                this.run();
            }
            this.notifyAll();
        }
        if (this.field6298 != null) {
            while (this.field6298.field5789 == 0) {
                class258.method1603(-649, 1L);
            }
            if (this.field6298.field5789 == 1) {
                try {
                    ((Thread) this.field6298.field5791).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field6298 = null;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
    public final void method2633(byte arg0) {
        if (arg0 <= 78) {
            return;
        }
        field6300++;
        if (!this.field6296) {
            this.field6315 = new class410();
            this.field6295 = new class423();
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)I")
    public final int method2634(int arg0) throws IOException {
        field6319++;
        if (this.field6296) {
            return 0;
        } else {
            if (arg0 >= -43) {
                this.run();
            }
            return this.field6315.available();
        }
    }

    @OriginalMember(owner = "client!jg", name = "run", descriptor = "()V")
    public final void run() {
        field6309++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field6306 == this.field6297) {
                        if (this.field6296) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field6297;
                    if (this.field6306 < this.field6297) {
                        var3 = 5000 - this.field6297;
                    } else {
                        var3 = this.field6306 - this.field6297;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field6295.write(this.field6312, var2, var3);
                    } catch (IOException var9) {
                        this.field6303 = true;
                    }
                    this.field6297 = (this.field6297 + var3) % 5000;
                    try {
                        if (this.field6306 == this.field6297) {
                            this.field6295.flush();
                        }
                    } catch (IOException var8) {
                        this.field6303 = true;
                    }
                }
            }
            try {
                if (this.field6315 != null) {
                    this.field6315.close();
                }
                if (this.field6295 != null) {
                    this.field6295.close();
                }
                if (this.field6317 != null) {
                    this.field6317.close();
                }
            } catch (IOException var7) {
            }
            this.field6312 = null;
        } catch (Exception var12) {
            class181.method1190((byte) -120, (String) null, var12);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II[BI)V")
    public final void method2635(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field6308++;
        if (this.field6296) {
            return;
        }
        if (this.field6303) {
            this.field6303 = false;
            throw new IOException();
        }
        if (this.field6312 == null) {
            this.field6312 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field6312[this.field6306] = arg2[arg0 + var6];
                this.field6306 = (this.field6306 + 1) % 5000;
                if (((this.field6297 + 4900) % 5000) == this.field6306) {
                    throw new IOException();
                }
            }
            if (this.field6298 == null) {
                this.field6298 = this.field6316.method115(this, (byte) 76, 3);
            }
            this.notifyAll();
        }
        if (arg3 != -15109) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Ljava/net/Socket;Ldq;)V")
    public class456(Socket arg0, class14 arg1) throws IOException {
        this.field6317 = arg0;
        this.field6316 = arg1;
        this.field6317.setSoTimeout(30000);
        this.field6317.setTcpNoDelay(true);
        this.field6315 = this.field6317.getInputStream();
        this.field6295 = this.field6317.getOutputStream();
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lpf;IB)Z")
    public static final boolean method2636(class133 arg0, int arg1, byte arg2) {
        field6314++;
        int var3 = arg0.method801((byte) -87, 2);
        if (var3 == 0) {
            if (arg0.method801((byte) -87, 1) != 0) {
                method2636(arg0, arg1, (byte) -19);
            }
            int var4 = arg0.method801((byte) -87, 6);
            int var5 = arg0.method801((byte) -87, 6);
            boolean var6 = arg0.method801((byte) -87, 1) == 1;
            if (var6) {
                class10.field193[class318.field4331++] = arg1;
            }
            if (class310.field4235[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class23 var7 = class310.field4235[arg1] = new class23();
            var7.field1119 = arg1;
            if (class293.field4020[arg1] != null) {
                var7.method188(false, class293.field4020[arg1]);
            }
            var7.method511(-14423, class84.field1266[arg1]);
            var7.field1096 = class189.field2713[arg1];
            int var8 = class10.field194[arg1];
            int var9 = var8 >> 28;
            int var10 = var8 >> 14 & 0xFF;
            int var11 = var8 & 0xFF;
            var7.field1147[0] = class238.field3357[arg1];
            var7.field6766 = (byte) var9;
            var7.method201((byte) -117, (var10 << 6) + var4 - class153.field2204, (var11 << 6) + -class325.field4472 + var5);
            var7.field396 = -1;
            return true;
        } else if (var3 == 1) {
            int var12 = arg0.method801((byte) -87, 2);
            int var13 = class10.field194[arg1];
            class10.field194[arg1] = (class347.method2074((var13 >> 28) + var12, 3) << 28) + class347.method2074(var13, 268435455);
            return false;
        } else if (var3 == 2) {
            int var14 = arg0.method801((byte) -87, 5);
            int var15 = var14 >> 3;
            int var16 = var14 & 0x7;
            int var17 = class10.field194[arg1];
            int var18 = (var17 >> 28) + var15 & 0x3;
            int var19 = (var17 & 0x3FFD70) >> 14;
            int var20 = var17 & 0xFF;
            if (var16 == 0) {
                var19--;
                var20--;
            }
            if (var16 == 1) {
                var20--;
            }
            if (var16 == 2) {
                var19++;
                var20--;
            }
            if (var16 == 3) {
                var19--;
            }
            if (var16 == 4) {
                var19++;
            }
            if (var16 == 5) {
                var20++;
                var19--;
            }
            if (var16 == 6) {
                var20++;
            }
            if (var16 == 7) {
                var20++;
                var19++;
            }
            class10.field194[arg1] = (var19 << 14) + (var18 << 28) + var20;
            return false;
        } else {
            int var21 = arg0.method801((byte) -87, 18);
            int var22 = var21 >> 16;
            int var23 = var21 >> 8 & 0xFF;
            int var24 = var21 & 0xFF;
            int var25 = class10.field194[arg1];
            if (arg2 != -19) {
                return true;
            }
            int var26 = (var25 >> 28) + var22 & 0x3;
            int var27 = (var25 >> 14) + var23 & 0xFF;
            int var28 = var24 + var25 & 0xFF;
            class10.field194[arg1] = (var26 << 28) + (var27 << 14) + var28;
            return false;
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V")
    public final void method2637(int arg0) throws IOException {
        field6301++;
        if (this.field6296) {
            return;
        }
        if (this.field6303) {
            this.field6303 = false;
            throw new IOException();
        } else if (arg0 > -90) {
            field6320 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([BIII)V")
    public final void method2638(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field6302++;
        if (arg3 != 421464188 || this.field6296) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field6315.read(arg0, arg2, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg1 -= var5;
        }
    }
}
