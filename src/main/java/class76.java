import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class76 implements Runnable {

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "Z")
    private boolean field1424 = false;

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
    private int field1426 = 0;

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "I")
    private int field1438 = 0;

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "Z")
    private boolean field1435 = false;

    @OriginalMember(owner = "client!qw", name = "A", descriptor = "Ljava/net/Socket;")
    private Socket field1448;

    @OriginalMember(owner = "client!qw", name = "z", descriptor = "Lvk;")
    private class367 field1447;

    @OriginalMember(owner = "client!qw", name = "r", descriptor = "Ljava/io/InputStream;")
    private InputStream field1439;

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1433;

    @OriginalMember(owner = "client!qw", name = "y", descriptor = "I")
    private int field1446;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "[[B")
    public static byte[][] field1422 = new byte[50][];

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "[B")
    public static byte[] field1427 = new byte[520];

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "Lek;")
    public static class505 field1432 = new class505();

    @OriginalMember(owner = "client!qw", name = "B", descriptor = "Lqe;")
    public static class465 field1449 = new class465(100, 6);

    @OriginalMember(owner = "client!qw", name = "C", descriptor = "Lek;")
    public static class505 field1450 = new class505();

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!qw", name = "h", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!qw", name = "t", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!qw", name = "u", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!qw", name = "v", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!qw", name = "w", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!qw", name = "x", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "Lav;")
    private class637 field1428;

    @OriginalMember(owner = "client!qw", name = "s", descriptor = "[B")
    private byte[] field1440;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Z)V", line = 12)
    public static void method759(boolean arg0) {
        field1450 = null;
        field1432 = null;
        field1427 = null;
        field1449 = null;
        if (!arg0) {
            field1422 = null;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(BII)V", line = 26)
    public static final void method760(byte arg0, int arg1, int arg2) {
        field1434++;
        if (arg0 == -39) {
            class354 var3 = class501.method3012(arg2, 16, 2145997216);
            var3.method2222(-41);
            var3.field4990 = arg1;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(III[B)V", line = 40)
    public final void method761(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1443++;
        if (arg1 > -111 || this.field1435) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field1439.read(arg3, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg2 += var5;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V", line = 66)
    public final void method762(int arg0) throws IOException {
        if (arg0 != -19861) {
            this.run();
        }
        field1429++;
        if (!this.field1435 && this.field1424) {
            this.field1424 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!qw", name = "run", descriptor = "()V", line = 92)
    public final void run() {
        field1431++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1438 == this.field1426) {
                        if (this.field1435) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field1426;
                    if (this.field1438 >= this.field1426) {
                        var3 = this.field1438 - this.field1426;
                    } else {
                        var3 = this.field1446 - this.field1426;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field1433.write(this.field1440, var2, var3);
                    } catch (IOException var9) {
                        this.field1424 = true;
                    }
                    this.field1426 = (this.field1426 + var3) % this.field1446;
                    try {
                        if (this.field1438 == this.field1426) {
                            this.field1433.flush();
                        }
                    } catch (IOException var8) {
                        this.field1424 = true;
                    }
                }
            }
            try {
                if (this.field1439 != null) {
                    this.field1439.close();
                }
                if (this.field1433 != null) {
                    this.field1433.close();
                }
                if (this.field1448 != null) {
                    this.field1448.close();
                }
            } catch (IOException var7) {
            }
            this.field1440 = null;
        } catch (Exception var12) {
            class621.method3591(null, var12, (byte) -61);
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)V", line = 161)
    public final void method763(int arg0) {
        field1441++;
        if (!this.field1435) {
            this.field1439 = new class127();
            if (arg0 == 0) {
                this.field1433 = new class366();
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILdm;)V", line = 177)
    public static final void method764(int arg0, class50 arg1) {
        field1445++;
        if (class439.field6128 == arg1.field740) {
            if (class468.field6748.field4939 == null) {
                arg1.field819 = 0;
                arg1.field780 = 0;
            } else {
                arg1.field875 = 150;
                arg1.field733 = (int) (Math.sin((double) class605.field8787 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field851 = 5;
                arg1.field780 = class675.field9486;
                arg1.field819 = class46.method415(false, class468.field6748.field4939);
                arg1.field853 = class468.field6748.field939;
                arg1.field798 = class468.field6748.field923;
                arg1.field751 = 0;
                arg1.field714 = class468.field6748.field970;
                class718 var2 = arg1.field853 == -1 ? null : class698.field9806.method851(arg1.field853, -2);
                if (var2 != null) {
                    class127.method984(arg0 - 6038, var2, arg1.field714);
                }
            }
        } else if (arg0 != 2047) {
            method760((byte) -48, -42, 24);
        }
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Ljava/net/Socket;Lvk;I)V", line = 443)
    public class76(Socket arg0, class367 arg1, int arg2) throws IOException {
        this.field1448 = arg0;
        this.field1447 = arg1;
        this.field1448.setSoTimeout(30000);
        this.field1448.setTcpNoDelay(true);
        this.field1439 = this.field1448.getInputStream();
        this.field1433 = this.field1448.getOutputStream();
        this.field1446 = arg2;
    }

    @OriginalMember(owner = "client!qw", name = "finalize", descriptor = "()V", line = 223)
    protected final void finalize() {
        field1444++;
        this.method769((byte) -128);
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(ZII[B)V", line = 232)
    public final void method765(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1425++;
        if (this.field1435) {
            return;
        }
        if (this.field1424) {
            this.field1424 = false;
            throw new IOException();
        }
        if (this.field1440 == null) {
            this.field1440 = new byte[this.field1446];
        }
        if (arg0) {
            method766(null, -37);
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field1440[this.field1438] = arg3[arg2 + var6];
                this.field1438 = (this.field1438 + 1) % this.field1446;
                if ((this.field1446 + this.field1426 - 100) % this.field1446 == this.field1438) {
                    throw new IOException();
                }
            }
            if (this.field1428 == null) {
                this.field1428 = this.field1447.method2295(3, (byte) 100, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lwc;I)I", line = 284)
    public static final int method766(class66 arg0, int arg1) {
        field1437++;
        String var2 = class439.method2636((byte) 108, arg0);
        int[] var3 = null;
        if (class449.method2676(arg0.field1198, arg1 ^ 0xFFFFFFAB)) {
            var3 = class558.field7942.method721(-105, (int) arg0.field1194).field3672;
        } else if (arg0.field1191 != -1) {
            var3 = class558.field7942.method721(arg1 + 99, arg0.field1191).field3672;
        } else if (class237.method1607(84, arg0.field1198)) {
            class272 var6 = (class272) class758.field10539.method4203(true, (long) ((int) arg0.field1194));
            if (var6 != null) {
                class84 var7 = var6.field3885;
                class488 var8 = var7.field1523;
                if (var8.field6923 != null) {
                    var8 = var8.method2926(8730, class742.field10408);
                }
                if (var8 != null) {
                    var3 = var8.field6935;
                }
            }
        } else if (class56.method513(arg0.field1198, (byte) 40)) {
            Object var4 = null;
            class414 var5;
            if (arg0.field1198 == 1012) {
                var5 = class66.field1181.method131(2, (int) arg0.field1194);
            } else {
                var5 = class66.field1181.method131(2, (int) (arg0.field1194 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field5720 != null) {
                var5 = var5.method2513(class742.field10408, true);
            }
            if (var5 != null) {
                var3 = var5.field5727;
            }
        }
        if (var3 != null) {
            var2 = var2 + class387.method2418(var3, (byte) -104);
        }
        int var9 = class419.field5896.method2068(arg1, class698.field9810, var2);
        if (arg0.field1196) {
            var9 += class388.field5429.method93() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "(I)I", line = 355)
    public final int method767(int arg0) throws IOException {
        field1436++;
        if (arg0 != 0) {
            this.field1424 = true;
        }
        return this.field1435 ? 0 : this.field1439.read();
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)I", line = 378)
    public final int method768(byte arg0) throws IOException {
        field1423++;
        if (this.field1435) {
            return 0;
        } else {
            if (arg0 != 81) {
                this.field1447 = null;
            }
            return this.field1439.available();
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(B)V", line = 397)
    public final void method769(byte arg0) {
        field1430++;
        if (arg0 > -125) {
            this.field1424 = false;
        }
        if (this.field1435) {
            return;
        }
        synchronized (this) {
            this.field1435 = true;
            this.notifyAll();
        }
        if (this.field1428 != null) {
            while (this.field1428.field9091 == 0) {
                class246.method1639(1L, (byte) -72);
            }
            if (this.field1428.field9091 == 1) {
                try {
                    ((Thread) this.field1428.field9093).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1428 = null;
    }
}
