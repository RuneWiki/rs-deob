import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class105 {

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    private int field1458 = 0;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "J")
    private long field1468 = -1L;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "J")
    private long field1479 = -1L;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "Lih;")
    private class331 field1464;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "J")
    private long field1467;

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "J")
    private long field1474;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "J")
    private long field1475;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "[B")
    private byte[] field1463;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "[B")
    private byte[] field1476;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "J")
    private long field1457;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "Lvg;")
    public static class108 field1480;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "Lfl;")
    public static class387 field1477;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "Z")
    public static boolean field1478;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)J")
    public final long method794(int arg0) {
        field1473++;
        if (arg0 != 250) {
            this.field1463 = null;
        }
        return this.field1474;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIB)V")
    public static final void method795(int arg0, int arg1, byte arg2) {
        if (arg2 <= -83) {
            field1465++;
            class26 var3 = class217.method1445(true, arg0, 13);
            var3.method158(28194);
            var3.field341 = arg1;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
    public static void method796(boolean arg0) {
        field1480 = null;
        if (!arg0) {
            field1477 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
    public static final void method797(int arg0) {
        class408 var1 = class323.field4386;
        synchronized (class323.field4386) {
            class323.field4386.method2530((byte) -80);
        }
        field1471++;
        if (arg0 > -124) {
            method805(-110, true, 29, -126);
        }
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
    private final void method798(int arg0) throws IOException {
        if (arg0 != -17290) {
            return;
        }
        field1462++;
        if (this.field1468 == -1L) {
            return;
        }
        if (this.field1468 != this.field1457) {
            this.field1464.method2007(10795, this.field1468);
            this.field1457 = this.field1468;
        }
        this.field1464.method2008(0, true, this.field1458, this.field1476);
        this.field1457 += (long) this.field1458;
        if (this.field1457 > this.field1467) {
            this.field1467 = this.field1457;
        }
        long var2 = -1L;
        long var4 = -1L;
        if (this.field1468 >= this.field1479 && this.field1479 + ((long) this.field1466) > this.field1468) {
            var2 = this.field1468;
        } else if (this.field1479 >= this.field1468 && ((long) this.field1458 + this.field1468) > this.field1479) {
            var2 = this.field1479;
        }
        if (((long) this.field1458 + this.field1468) > this.field1479 && (long) this.field1466 + this.field1479 >= (long) this.field1458 + this.field1468) {
            var4 = (long) this.field1458 + this.field1468;
        } else if (this.field1468 < ((long) this.field1466 + this.field1479) && ((long) this.field1458 + this.field1468) >= (this.field1479 + ((long) this.field1466))) {
            var4 = (long) this.field1466 + this.field1479;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class79.method643(this.field1476, (int) (var2 - this.field1468), this.field1463, (int) (var2 - this.field1479), var6);
        }
        this.field1468 = -1L;
        this.field1458 = 0;
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)Ljava/io/File;")
    private final File method799(int arg0) {
        if (arg0 != -1) {
            this.field1464 = null;
        }
        field1459++;
        return this.field1464.method2005((byte) -120);
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V")
    private final void method800(int arg0) throws IOException {
        field1455++;
        this.field1466 = 0;
        if (arg0 != 21289) {
            field1480 = null;
        }
        if (this.field1475 != this.field1457) {
            this.field1464.method2007(10795, this.field1475);
            this.field1457 = this.field1475;
        }
        this.field1479 = this.field1475;
        while (this.field1463.length > this.field1466) {
            int var2 = this.field1463.length - this.field1466;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1464.method2006(this.field1463, (byte) -114, this.field1466, var2);
            if (var3 == -1) {
                break;
            }
            this.field1457 += (long) var3;
            this.field1466 += var3;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([BIII)V")
    public final void method801(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field1472++;
        try {
            if (arg0.length < (arg2 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (arg1 != 1) {
                return;
            }
            if (this.field1468 != -1L && this.field1475 >= this.field1468 && ((long) arg2 + this.field1475) <= ((long) this.field1458 + this.field1468)) {
                class79.method643(this.field1476, (int) (this.field1475 - this.field1468), arg0, arg3, arg2);
                this.field1475 += (long) arg2;
                return;
            }
            long var5 = this.field1475;
            int var7 = arg3;
            int var8 = arg2;
            if (this.field1475 >= this.field1479 && this.field1475 < ((long) this.field1466 + this.field1479)) {
                int var9 = (int) ((long) this.field1466 + this.field1479 - this.field1475);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                class79.method643(this.field1463, (int) (this.field1475 - this.field1479), arg0, arg3, var9);
                arg2 -= var9;
                this.field1475 += (long) var9;
                arg3 += var9;
            }
            if (this.field1463.length < arg2) {
                this.field1464.method2007(10795, this.field1475);
                this.field1457 = this.field1475;
                while (arg2 > 0) {
                    int var11 = this.field1464.method2006(arg0, (byte) -45, arg3, arg2);
                    if (var11 == -1) {
                        break;
                    }
                    arg2 -= var11;
                    this.field1457 += (long) var11;
                    arg3 += var11;
                    this.field1475 += (long) var11;
                }
            } else if (arg2 > 0) {
                this.method800(21289);
                int var10 = arg2;
                if (this.field1466 < arg2) {
                    var10 = this.field1466;
                }
                class79.method643(this.field1463, 0, arg0, arg3, var10);
                arg3 += var10;
                this.field1475 += (long) var10;
                arg2 -= var10;
            }
            if (this.field1468 != -1L) {
                if (this.field1468 > this.field1475 && arg2 > 0) {
                    int var12 = (int) (this.field1468 - this.field1475) + arg3;
                    if ((arg2 + arg3) < var12) {
                        var12 = arg2 + arg3;
                    }
                    while (arg3 < var12) {
                        arg2--;
                        arg0[arg3++] = 0;
                        this.field1475++;
                    }
                }
                long var13 = -1L;
                if (this.field1468 >= var5 && (var5 + ((long) var8)) > this.field1468) {
                    var13 = this.field1468;
                } else if (var5 >= this.field1468 && var5 < this.field1468 + ((long) this.field1458)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field1458 + this.field1468 && (long) var8 + var5 >= this.field1468 - -((long) this.field1458)) {
                    var15 = (long) this.field1458 + this.field1468;
                } else if (this.field1468 < ((long) var8 + var5) && (long) this.field1458 + this.field1468 >= (long) var8 + var5) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class79.method643(this.field1476, (int) (var13 - this.field1468), arg0, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field1475) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field1475));
                        this.field1475 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1457 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IJ)V")
    public final void method802(int arg0, long arg1) throws IOException {
        field1460++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method799(-1));
        }
        if (arg0 > -103) {
            method795(-37, 98, (byte) 106);
        }
        this.field1475 = arg1;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I[B)V")
    public final void method803(int arg0, byte[] arg1) throws IOException {
        int var3 = -24 % ((arg0 - 82) / 44);
        this.method801(arg1, 1, arg1.length, 0);
        field1461++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II[BI)V")
    public final void method804(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1469++;
        try {
            if (((long) arg1 + this.field1475) > this.field1474) {
                this.field1474 = (long) arg1 + this.field1475;
            }
            if (this.field1468 != -1L && (this.field1475 < this.field1468 || this.field1475 > ((long) this.field1458 + this.field1468))) {
                this.method798(arg3 - 17290);
            }
            if (this.field1468 != -1L && this.field1468 + ((long) this.field1476.length) < (long) arg1 + this.field1475) {
                int var5 = (int) ((long) this.field1476.length + this.field1468 - this.field1475);
                class79.method643(arg2, arg0, this.field1476, (int) (this.field1475 - this.field1468), var5);
                arg0 += var5;
                arg1 -= var5;
                this.field1475 += (long) var5;
                this.field1458 = this.field1476.length;
                this.method798(-17290);
            }
            if (this.field1476.length < arg1) {
                if (this.field1475 != this.field1457) {
                    this.field1464.method2007(10795, this.field1475);
                    this.field1457 = this.field1475;
                }
                this.field1464.method2008(arg0, true, arg1, arg2);
                this.field1457 += (long) arg1;
                if (this.field1457 > this.field1467) {
                    this.field1467 = this.field1457;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field1475 >= this.field1479 && ((long) this.field1466 + this.field1479) > this.field1475) {
                    var6 = this.field1475;
                } else if (this.field1479 >= this.field1475 && ((long) arg1 + this.field1475) > this.field1479) {
                    var6 = this.field1479;
                }
                if (this.field1479 < (this.field1475 + ((long) arg1)) && this.field1475 + ((long) arg1) <= this.field1479 - -((long) this.field1466)) {
                    var8 = (long) arg1 + this.field1475;
                } else if (this.field1475 < ((long) this.field1466 + this.field1479) && ((long) arg1 + this.field1475) >= (this.field1479 + ((long) this.field1466))) {
                    var8 = this.field1479 + ((long) this.field1466);
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class79.method643(arg2, (int) ((long) arg0 + var6 - this.field1475), this.field1463, (int) (var6 - this.field1479), var10);
                }
                this.field1475 += (long) arg1;
            } else if (arg3 == 0 && arg1 > 0) {
                if (this.field1468 == -1L) {
                    this.field1468 = this.field1475;
                }
                class79.method643(arg2, arg0, this.field1476, (int) (this.field1475 - this.field1468), arg1);
                this.field1475 += (long) arg1;
                if (this.field1475 - this.field1468 > (long) this.field1458) {
                    this.field1458 = (int) (this.field1475 - this.field1468);
                }
            }
        } catch (IOException var12) {
            this.field1457 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZII)V")
    public static final void method805(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            field1477 = null;
        }
        if (arg2 == 0) {
            class88.field1232.method1151(162, (byte) 121);
            class349.field4705++;
        }
        field1470++;
        if (arg2 == 1) {
            class408.field5685++;
            class88.field1232.method1151(250, (byte) -110);
        }
        class88.field1232.method2280(class146.field2122.method1474(-20986, 82) ? 1 : 0, 1537846408);
        class88.field1232.method2286(arg3 + class6.field65, -65);
        class88.field1232.method2279((byte) -71, class371.field5148 + arg0);
        class399.field5526 = false;
        class93.field1300 = arg3;
        class233.field3265 = arg0;
        class49.method404(-95);
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lih;II)V")
    public class105(class331 arg0, int arg1, int arg2) throws IOException {
        this.field1464 = arg0;
        this.field1474 = this.field1467 = arg0.method2004(-91);
        this.field1475 = 0L;
        this.field1463 = new byte[arg1];
        this.field1476 = new byte[arg2];
    }
}
