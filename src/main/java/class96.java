import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class96 {

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    private int field1543 = 0;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "J")
    private long field1541 = -1L;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "J")
    private long field1559 = -1L;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Lvm;")
    private class77 field1531;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "J")
    private long field1555;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "J")
    private long field1533;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "[B")
    private byte[] field1538;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "[B")
    private byte[] field1552;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "J")
    private long field1536;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Lsf;")
    public static class108 field1529 = class140.method973(255, "<)4col>");

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field1532 = 0;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field1547 = 0;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field1540 = 0;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "Lsf;")
    public static class108 field1548 = class140.method973(255, "(U");

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field1556 = 0;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "Lsf;")
    public static class108 field1549 = class140.method973(255, "; Max)2Age=");

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "[Llj;")
    public static class51[] field1558 = new class51[2048];

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "Laj;")
    public static class1 field1554 = new class1();

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "J")
    private long field1557;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lik;")
    public static class262 field1525;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "Lik;")
    public static class262 field1535;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "Z")
    public static boolean field1560;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Ljava/io/File;", line = 4)
    private final File method650(int arg0) {
        field1551++;
        return arg0 == 0 ? this.field1531.method506(false) : (File) null;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V", line = 22)
    private final void method651(int arg0) throws IOException {
        if (arg0 != -1353) {
            this.field1533 = 75L;
        }
        field1545++;
        if (this.field1541 == -1L) {
            return;
        }
        if (this.field1557 != this.field1541) {
            this.field1531.method504(this.field1541, false);
            this.field1557 = this.field1541;
        }
        this.field1531.method508(this.field1543, this.field1552, arg0 ^ 0xFFFFB666, 0);
        this.field1557 += (long) this.field1543;
        long var2 = -1L;
        if (this.field1557 > this.field1555) {
            this.field1555 = this.field1557;
        }
        long var4 = -1L;
        if (this.field1541 >= this.field1559 && ((long) this.field1534 + this.field1559) > this.field1541) {
            var4 = this.field1541;
        } else if (this.field1541 <= this.field1559 && this.field1559 < (this.field1541 + ((long) this.field1543))) {
            var4 = this.field1559;
        }
        if (this.field1559 < (this.field1541 + ((long) this.field1543)) && (long) this.field1543 + this.field1541 <= this.field1559 - -((long) this.field1534)) {
            var2 = (long) this.field1543 + this.field1541;
        } else if (this.field1541 < (long) this.field1534 + this.field1559 && ((long) this.field1543 + this.field1541) >= (this.field1559 + ((long) this.field1534))) {
            var2 = (long) this.field1534 + this.field1559;
        }
        if (var4 > -1L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class23.method156(this.field1552, (int) (var4 - this.field1541), this.field1538, (int) (var4 - this.field1559), var6);
        }
        this.field1541 = -1L;
        this.field1543 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V", line = 104)
    public static final void method652(int arg0) {
        if (class308.field5347 != null) {
            class308.field5347.method1405(arg0 - 15923);
        }
        if (class261.field4601 != null) {
            class261.field4601.method1405(arg0 - 15923);
        }
        class83.method559(class131.field2242, 22050, 2, (byte) -121);
        if (arg0 != 15) {
            method659(true);
        }
        class308.field5347 = class320.method2217(0, class289.field5052, class13.field158, (byte) 106, 22050);
        class308.field5347.method1402(-53, class52.field774);
        class261.field4601 = class320.method2217(1, class289.field5052, class13.field158, (byte) -118, 2048);
        class261.field4601.method1402(-39, class213.field3789);
        field1544++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([BI)V", line = 130)
    public final void method653(byte[] arg0, int arg1) throws IOException {
        field1526++;
        this.method654(arg0.length, arg0, (byte) 40, arg1);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[BBI)V", line = 138)
    public final void method654(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field1528++;
        try {
            if (arg1.length < (arg3 + arg0)) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg0 - arg1.length);
            }
            if (this.field1541 != -1L && this.field1536 >= this.field1541 && (long) arg0 + this.field1536 <= this.field1541 - -((long) this.field1543)) {
                class23.method156(this.field1552, (int) (this.field1536 - this.field1541), arg1, arg3, arg0);
                this.field1536 += (long) arg0;
                return;
            }
            long var5 = this.field1536;
            int var7 = arg3;
            int var8 = arg0;
            if (this.field1536 >= this.field1559 && ((long) this.field1534 + this.field1559) > this.field1536) {
                int var9 = (int) (this.field1559 + (long) this.field1534 - this.field1536);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class23.method156(this.field1538, (int) (this.field1536 - this.field1559), arg1, arg3, var9);
                arg3 += var9;
                arg0 -= var9;
                this.field1536 += (long) var9;
            }
            if (arg0 > this.field1538.length) {
                this.field1531.method504(this.field1536, false);
                this.field1557 = this.field1536;
                while (arg0 > 0) {
                    int var10 = this.field1531.method507(arg3, arg2 - 41, arg1, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    this.field1536 += (long) var10;
                    arg3 += var10;
                    arg0 -= var10;
                    this.field1557 += (long) var10;
                }
            } else if (arg0 > 0) {
                this.method662(-2451);
                int var11 = arg0;
                if (this.field1534 < arg0) {
                    var11 = this.field1534;
                }
                arg0 -= var11;
                class23.method156(this.field1538, 0, arg1, arg3, var11);
                arg3 += var11;
                this.field1536 += (long) var11;
            }
            if (this.field1541 != -1L) {
                if (this.field1541 > this.field1536 && arg0 > 0) {
                    int var12 = (int) (this.field1541 - this.field1536) + arg3;
                    if (var12 > arg0 + arg3) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg3) {
                        arg1[arg3++] = 0;
                        this.field1536++;
                        arg0--;
                    }
                }
                long var13 = -1L;
                if (this.field1541 >= var5 && this.field1541 < (long) var8 + var5) {
                    var13 = this.field1541;
                } else if (var5 >= this.field1541 && ((long) this.field1543 + this.field1541) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field1543 + this.field1541 && ((long) var8 + var5) >= (this.field1541 + ((long) this.field1543))) {
                    var15 = (long) this.field1543 + this.field1541;
                } else if (this.field1541 < (var5 + ((long) var8)) && (long) this.field1543 + this.field1541 >= var5 - -((long) var8)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class23.method156(this.field1552, (int) (var13 - this.field1541), arg1, (int) (var13 - var5) + var7, var17);
                    if (this.field1536 < var15) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field1536));
                        this.field1536 = var15;
                    }
                }
            }
            if (arg2 != 40) {
                this.field1534 = 5;
            }
        } catch (IOException var19) {
            this.field1557 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IJ)V", line = 324)
    public final void method655(int arg0, long arg1) throws IOException {
        field1546++;
        if ((long) arg0 > arg1) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method650(0));
        }
        this.field1536 = arg1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZIIIIIFZI)[[I", line = 351)
    public static final int[][] method656(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, boolean arg7, int arg8) {
        int[][] var9 = new int[arg3][arg2];
        class283 var10 = new class283();
        var10.field4964 = arg1;
        var10.field4959 = arg4;
        var10.field4966 = arg5;
        var10.field4944 = arg7;
        if (arg0) {
            field1529 = (class108) null;
        }
        var10.field4951 = (int) (arg6 * 4096.0F);
        var10.method116(true);
        field1550++;
        class316.method2199(arg2, arg3, -32527);
        for (int var11 = 0; var11 < arg3; var11++) {
            var10.method2038(var9[var11], var11, (byte) -79);
        }
        return var9;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)J", line = 391)
    public final long method657(int arg0) {
        if (arg0 != -1) {
            field1540 = 50;
        }
        field1537++;
        return this.field1533;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V", line = 408)
    public final void method658(int arg0) throws IOException {
        field1527++;
        if (arg0 == 15) {
            this.method651(-1353);
            this.field1531.method503((byte) -126);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V", line = 431)
    public static final void method659(boolean arg0) {
        while (true) {
            if (class293.field5127.method1435(class191.field3471, (byte) -18) >= 11) {
                int var1 = class293.field5127.method1431((byte) -94, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (field1558[var1] == null) {
                        field1558[var1] = new class51();
                        var2 = true;
                        if (class209.field3740[var1] != null) {
                            field1558[var1].method361(class209.field3740[var1], 60723746);
                        }
                    }
                    class194.field3511[class43.field569++] = var1;
                    class51 var3 = field1558[var1];
                    var3.field4459 = class116.field2000;
                    int var4 = class293.field5127.method1431((byte) -94, 1);
                    int var5 = class276.field4831[class293.field5127.method1431((byte) -94, 3)];
                    if (var2) {
                        var3.field4486 = var3.field4518 = var5;
                    }
                    int var6 = class293.field5127.method1431((byte) -94, 1);
                    if (var6 == 1) {
                        class283.field4947[class312.field5400++] = var1;
                    }
                    int var7 = class293.field5127.method1431((byte) -94, 5);
                    int var8 = class293.field5127.method1431((byte) -94, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method362(-17550, ~var4 == -2, class95.field1513.field4498[0] + var7, class95.field1513.field4482[0] - -var8);
                    continue;
                }
            }
            class293.field5127.method1430(-21016);
            field1542++;
            if (!arg0) {
                method652(66);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)V", line = 493)
    public static void method660(boolean arg0) {
        field1549 = null;
        field1529 = null;
        field1525 = null;
        field1548 = null;
        field1554 = null;
        field1558 = null;
        field1535 = null;
        if (arg0) {
            field1525 = (class262) null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lvm;II)V", line = 712)
    public class96(class77 arg0, int arg1, int arg2) throws IOException {
        this.field1531 = arg0;
        this.field1533 = this.field1555 = arg0.method505(24044);
        this.field1538 = new byte[arg1];
        this.field1552 = new byte[arg2];
        this.field1536 = 0L;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III[B)V", line = 522)
    public final void method661(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1553++;
        try {
            if (this.field1533 < (long) arg0 + this.field1536) {
                this.field1533 = (long) arg0 + this.field1536;
            }
            if (this.field1541 != -1L && (this.field1541 > this.field1536 || (long) this.field1543 + this.field1541 < this.field1536)) {
                this.method651(-1353);
            }
            int var5 = -121 % ((arg1 + 51) / 45);
            if (this.field1541 != -1L && (long) this.field1552.length + this.field1541 < this.field1536 - -((long) arg0)) {
                int var6 = (int) (this.field1541 - (this.field1536 - (long) this.field1552.length));
                arg0 -= var6;
                class23.method156(arg3, arg2, this.field1552, (int) (this.field1536 - this.field1541), var6);
                this.field1536 += (long) var6;
                this.field1543 = this.field1552.length;
                this.method651(-1353);
                arg2 += var6;
            }
            if (this.field1552.length < arg0) {
                if (this.field1557 != this.field1536) {
                    this.field1531.method504(this.field1536, false);
                    this.field1557 = this.field1536;
                }
                this.field1531.method508(arg0, arg3, 19665, arg2);
                long var7 = -1L;
                if (((long) arg0 + this.field1536) > this.field1559 && (long) this.field1534 + this.field1559 >= (long) arg0 + this.field1536) {
                    var7 = (long) arg0 + this.field1536;
                } else if (((long) this.field1534 + this.field1559) > this.field1536 && ((long) this.field1534 + this.field1559) <= ((long) arg0 + this.field1536)) {
                    var7 = (long) this.field1534 + this.field1559;
                }
                long var9 = -1L;
                if (this.field1536 >= this.field1559 && ((long) this.field1534 + this.field1559) > this.field1536) {
                    var9 = this.field1536;
                } else if (this.field1536 <= this.field1559 && ((long) arg0 + this.field1536) > this.field1559) {
                    var9 = this.field1559;
                }
                this.field1557 += (long) arg0;
                if (this.field1557 > this.field1555) {
                    this.field1555 = this.field1557;
                }
                if (var9 > -1L && var9 < var7) {
                    int var11 = (int) (var7 - var9);
                    class23.method156(arg3, (int) ((long) arg2 + var9 - this.field1536), this.field1538, (int) (var9 - this.field1559), var11);
                }
                this.field1536 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field1541 == -1L) {
                    this.field1541 = this.field1536;
                }
                class23.method156(arg3, arg2, this.field1552, (int) (this.field1536 - this.field1541), arg0);
                this.field1536 += (long) arg0;
                if (((long) this.field1543) < (this.field1536 - this.field1541)) {
                    this.field1543 = (int) (this.field1536 - this.field1541);
                }
            }
        } catch (IOException var13) {
            this.field1557 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V", line = 653)
    private final void method662(int arg0) throws IOException {
        if (arg0 != -2451) {
            method652(-20);
        }
        field1530++;
        this.field1534 = 0;
        if (this.field1557 != this.field1536) {
            this.field1531.method504(this.field1536, false);
            this.field1557 = this.field1536;
        }
        this.field1559 = this.field1536;
        while (this.field1534 < this.field1538.length) {
            int var2 = this.field1538.length - this.field1534;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1531.method507(this.field1534, arg0 + 2450, this.field1538, var2);
            if (var3 == -1) {
                break;
            }
            this.field1557 += (long) var3;
            this.field1534 += var3;
        }
    }
}
