import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class66 implements Runnable {

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "Z")
    private boolean field1480 = false;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    private int field1472 = 0;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    private int field1468 = 0;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Z")
    private boolean field1469 = false;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Lbb;")
    private class10 field1460;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "Ljava/net/Socket;")
    private Socket field1491;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field1461;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1476;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lsc;")
    public static class128 field1464 = class129.method1017(false, "::fpson");

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1466 = 0;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "Lsc;")
    public static class128 field1483 = class129.method1017(false, "null");

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "Lsc;")
    public static class128 field1486 = class129.method1017(false, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "Lsc;")
    public static class128 field1484 = class129.method1017(false, ")4lang)4de");

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Lsc;")
    public static class128 field1473 = class129.method1017(false, "Benutzername: ");

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field1490 = 0;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "Lsc;")
    public static class128 field1481 = class129.method1017(false, "<br>(X");

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[[I")
    public static int[][] field1462 = new int[104][104];

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "Lsc;")
    private static class128 field1489 = class129.method1017(false, "Loaded title screen");

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Lsc;")
    public static class128 field1471 = field1489;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "Lsc;")
    public static class128 field1479 = class129.method1017(false, "(U0a )2 in: ");

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "Lsb;")
    public static class127 field1492 = new class127(8);

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lie;")
    private class61 field1463;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "[B")
    private byte[] field1474;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lsc;Lmc;B)I")
    public static final int method493(class128 arg0, class86 arg1, byte arg2) {
        field1477++;
        int var3 = arg1.field1924;
        arg1.method654(1183700424, arg0.field2920);
        arg1.field1924 += class147.field3403.method962(arg1.field1924, arg0.field2920, arg1.field1920, arg0.field2893, 0, 0);
        if (arg2 <= 102) {
            field1473 = null;
        }
        return arg1.field1924 - var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
    public static final int method494(int arg0, int arg1) {
        field1494++;
        class149 var2 = class112.method861(true, arg0);
        int var3 = var2.field3429;
        int var4 = var2.field3426;
        int var5 = var2.field3430;
        int var6 = class94.field2181[var4 - var3];
        if (arg1 != 104) {
            field1483 = null;
        }
        return var6 & class126.field2849[var5] >> var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([BIIILbe;[Lda;)V")
    public static final void method495(byte[] arg0, int arg1, int arg2, int arg3, class13 arg4, class23[] arg5) {
        if (arg3 != 0) {
            field1473 = null;
        }
        class86 var6 = new class86(arg0);
        field1493++;
        int var7 = -1;
        while (true) {
            int var8 = var6.method636((byte) 109);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method636((byte) 109);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var6.method646(-15447);
                int var14 = var9 >> 12;
                int var15 = var13 >> 2;
                int var16 = var13 & 0x3;
                int var17 = arg2 + var12;
                int var18 = arg1 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    int var19 = var14;
                    if ((class110.field2485[1][var17][var18] & 0x2) == 2) {
                        var19 = var14 - 1;
                    }
                    class23 var20 = null;
                    if (var19 >= 0) {
                        var20 = arg5[var19];
                    }
                    class104.method780(var7, var18, -3570, var16, var20, arg4, var17, var15, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z[BII)V")
    public final void method496(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1485++;
        if (this.field1480) {
            return;
        }
        if (this.field1469) {
            this.field1469 = false;
            throw new IOException();
        }
        if (this.field1474 == null) {
            this.field1474 = new byte[5000];
        }
        if (!arg0) {
            this.field1491 = null;
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field1474[this.field1468] = arg1[arg3 + var6];
                this.field1468 = (this.field1468 + 1) % 5000;
                if ((this.field1472 + 4900) % 5000 == this.field1468) {
                    throw new IOException();
                }
            }
            if (this.field1463 == null) {
                this.field1463 = this.field1460.method86(this, 82, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!jd", name = "run", descriptor = "()V")
    public final void run() {
        field1487++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1472 == this.field1468) {
                        if (this.field1480) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field1472 > this.field1468) {
                        var2 = 5000 - this.field1472;
                    } else {
                        var2 = this.field1468 - this.field1472;
                    }
                    var3 = this.field1472;
                }
                if (var2 > 0) {
                    try {
                        this.field1476.write(this.field1474, var3, var2);
                    } catch (IOException var9) {
                        this.field1469 = true;
                    }
                    this.field1472 = (this.field1472 + var2) % 5000;
                    try {
                        if (this.field1472 == this.field1468) {
                            this.field1476.flush();
                        }
                    } catch (IOException var8) {
                        this.field1469 = true;
                    }
                }
            }
            try {
                if (this.field1461 != null) {
                    this.field1461.close();
                }
                if (this.field1476 != null) {
                    this.field1476.close();
                }
                if (this.field1491 != null) {
                    this.field1491.close();
                }
            } catch (IOException var7) {
            }
            this.field1474 = null;
        } catch (Exception var12) {
            class116.method895(-1, var12, null);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[B)Lgf;")
    public static final class48 method497(int arg0, byte[] arg1) {
        int var2 = -124 % ((-arg0 - 66) / 48);
        field1475++;
        if (arg1 == null) {
            return null;
        } else {
            class48 var3 = new class48(arg1, class122.field2777, class36.field698, class150.field3443, class19.field361, class21.field412, class37.field721);
            class29.method239(-100);
            return var3;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)I")
    public final int method498(int arg0) throws IOException {
        if (arg0 > -24) {
            this.field1463 = null;
        }
        field1488++;
        return this.field1480 ? 0 : this.field1461.read();
    }

    @OriginalMember(owner = "client!jd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1470++;
        this.method502((byte) -1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static void method499(byte arg0) {
        field1484 = null;
        field1481 = null;
        field1473 = null;
        field1486 = null;
        field1483 = null;
        field1492 = null;
        field1462 = null;
        field1479 = null;
        if (arg0 >= 105) {
            field1471 = null;
            field1489 = null;
            field1464 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[BZ)V")
    public final void method500(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        if (arg3) {
            return;
        }
        field1465++;
        if (this.field1480) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field1461.read(arg2, arg0, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg1 -= var5;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)I")
    public final int method501(byte arg0) throws IOException {
        if (arg0 != 10) {
            this.field1474 = null;
        }
        field1478++;
        return this.field1480 ? 0 : this.field1461.available();
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Ljava/net/Socket;Lbb;)V")
    public class66(Socket arg0, class10 arg1) throws IOException {
        this.field1460 = arg1;
        this.field1491 = arg0;
        this.field1491.setSoTimeout(30000);
        this.field1491.setTcpNoDelay(true);
        this.field1461 = this.field1491.getInputStream();
        this.field1476 = this.field1491.getOutputStream();
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V")
    public final void method502(byte arg0) {
        field1467++;
        if (this.field1480) {
            return;
        }
        synchronized (this) {
            this.field1480 = true;
            if (arg0 != -1) {
                this.run();
            }
            this.notifyAll();
        }
        if (this.field1463 != null) {
            while (this.field1463.field1320 == 0) {
                class18.method164(false, 1L);
            }
            if (this.field1463.field1320 == 1) {
                try {
                    ((Thread) this.field1463.field1319).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1463 = null;
    }
}
