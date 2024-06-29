import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public class class116 implements Runnable {

    @OriginalMember(owner = "client!rja", name = "c", descriptor = "I")
    private int field1463 = 0;

    @OriginalMember(owner = "client!rja", name = "p", descriptor = "I")
    private int field1476 = 0;

    @OriginalMember(owner = "client!rja", name = "m", descriptor = "Ljava/io/InputStream;")
    private InputStream field1473;

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "I")
    private int field1462;

    @OriginalMember(owner = "client!rja", name = "d", descriptor = "[B")
    private byte[] field1464;

    @OriginalMember(owner = "client!rja", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field1467;

    @OriginalMember(owner = "client!rja", name = "h", descriptor = "[I")
    public static int[] field1468 = new int[8];

    @OriginalMember(owner = "client!rja", name = "k", descriptor = "Loh;")
    public static class425 field1471 = new class425("", 10);

    @OriginalMember(owner = "client!rja", name = "r", descriptor = "Lhj;")
    public static class596 field1478 = new class596(26, 6);

    @OriginalMember(owner = "client!rja", name = "s", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1479 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!rja", name = "e", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!rja", name = "f", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!rja", name = "i", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!rja", name = "j", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!rja", name = "l", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!rja", name = "o", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!rja", name = "t", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!rja", name = "u", descriptor = "Lun;")
    public static class445 field1481;

    @OriginalMember(owner = "client!rja", name = "q", descriptor = "Ljava/io/IOException;")
    private IOException field1477;

    @OriginalMember(owner = "client!rja", name = "n", descriptor = "[Lcs;")
    public static class360[] field1474;

    @OriginalMember(owner = "client!rja", name = "run", descriptor = "()V", line = 6)
    public final void run() {
        field1465++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field1477 != null) {
                        return;
                    }
                    if (this.field1463 == 0) {
                        var2 = this.field1462 - this.field1476 - 1;
                    } else if (this.field1476 < this.field1463) {
                        var2 = this.field1463 - this.field1476 - 1;
                    } else {
                        var2 = this.field1462 - this.field1476;
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
                var3 = this.field1473.read(this.field1464, this.field1476, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field1477 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field1476 = (this.field1476 + var3) % this.field1462;
            }
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(I[BZIIII[BI)V", line = 64)
    public static final void method908(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        field1475++;
        int var9 = -(arg5 >> 2);
        if (arg2) {
            method912((byte) 20, -19, 37, 27, 19);
        }
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg1[var10001] += arg7[arg0++];
                int var14 = arg3++;
                arg1[var14] += arg7[arg0++];
                int var15 = arg3++;
                arg1[var15] += arg7[arg0++];
                int var16 = arg3++;
                arg1[var16] += arg7[arg0++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg1[var10001] += arg7[arg0++];
            }
            arg3 += arg6;
            arg0 += arg8;
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(B)V", line = 111)
    public final void method909(byte arg0) {
        field1470++;
        if (arg0 != -58) {
            this.field1463 = -37;
        }
        this.field1473 = new class770();
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(IZ)Z", line = 122)
    public final boolean method910(int arg0, boolean arg1) throws IOException {
        field1469++;
        if (arg0 <= 0 || arg0 >= this.field1462) {
            throw new IOException();
        }
        synchronized (this) {
            int var4;
            if (this.field1476 < this.field1463) {
                var4 = this.field1462 + this.field1476 - this.field1463;
            } else {
                var4 = this.field1476 - this.field1463;
            }
            if (arg1) {
                return true;
            } else if (var4 >= arg0) {
                return true;
            } else if (this.field1477 == null) {
                this.notifyAll();
                return false;
            } else {
                throw new IOException(this.field1477.toString());
            }
        }
    }

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "(B)V", line = 156)
    public final void method911(byte arg0) {
        field1472++;
        synchronized (this) {
            if (this.field1477 == null) {
                this.field1477 = new IOException("");
            }
            this.notifyAll();
        }
        try {
            this.field1467.join();
            if (arg0 <= 44) {
                field1478 = null;
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!rja", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 275)
    public class116(InputStream arg0, int arg1) {
        this.field1473 = arg0;
        this.field1462 = arg1 + 1;
        this.field1464 = new byte[this.field1462];
        this.field1467 = new Thread(this);
        this.field1467.setDaemon(true);
        this.field1467.start();
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(BIIII)I", line = 188)
    public static final int method912(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1461++;
        int var5 = arg1 & 0xF;
        if (arg0 >= -125) {
            return -120;
        } else {
            int var6 = var5 < 8 ? arg3 : arg4;
            int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg3 : arg2) : arg4;
            return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
        }
    }

    @OriginalMember(owner = "client!rja", name = "c", descriptor = "(B)V", line = 209)
    public static void method913(byte arg0) {
        field1478 = null;
        field1468 = null;
        field1471 = null;
        field1481 = null;
        field1479 = null;
        field1474 = null;
        if (arg0 <= 39) {
            method908(110, null, true, 107, 110, 54, 62, null, 89);
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(III[B)I", line = 224)
    public final int method914(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1466++;
        if (arg0 < 0 || arg1 < 0 || (arg0 + arg1) > arg3.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (arg2 > -35) {
                method913((byte) 37);
            }
            int var6;
            if (this.field1476 >= this.field1463) {
                var6 = this.field1476 - this.field1463;
            } else {
                var6 = this.field1462 + this.field1476 - this.field1463;
            }
            if (arg0 > var6) {
                arg0 = var6;
            }
            if (arg0 == 0 && this.field1477 != null) {
                throw new IOException(this.field1477.toString());
            }
            if ((this.field1463 + arg0) <= this.field1462) {
                class211.method1330(this.field1464, this.field1463, arg3, arg1, arg0);
            } else {
                int var7 = this.field1462 - this.field1463;
                class211.method1330(this.field1464, this.field1463, arg3, arg1, var7);
                class211.method1330(this.field1464, 0, arg3, arg1 + var7, arg0 - var7);
            }
            this.field1463 = (this.field1463 + arg0) % this.field1462;
            this.notifyAll();
            return arg0;
        }
    }
}
