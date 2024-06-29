import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class136 {

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "J")
    private long field1734 = -1L;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "J")
    private long field1742 = -1L;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    private int field1752 = 0;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Lgba;")
    private class523 field1733;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "J")
    private long field1743;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "J")
    private long field1741;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "J")
    private long field1751;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "[B")
    private byte[] field1736;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "[B")
    private byte[] field1731;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field1750 = 1407;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    private int field1744;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "J")
    private long field1738;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)J")
    public final long method908(int arg0) {
        if (arg0 >= -98) {
            this.field1742 = -47L;
        }
        field1754++;
        return this.field1741;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method909(int arg0) {
        if (arg0 != 5396) {
            this.method909(-60);
        }
        field1748++;
        return this.field1733.method3118(arg0 ^ 0xFFFFEAA0);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILgs;)V")
    public static final void method910(int arg0, class432 arg1) {
        field1740++;
        if (arg0 != 255) {
            field1750 = 75;
        }
        arg1.method2590((byte) 127);
        int var2 = class173.field2193;
        class723 var3 = class724.field10031 = class413.field5787[var2] = new class723();
        var3.field9186 = var2;
        int var4 = arg1.method2591(arg0 - 285, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        var3.field9219[0] = var6 - class444.field6151;
        int var7 = var4 & 0x3FFF;
        var3.field3470 = (var3.field9219[0] << 9) + (var3.method3744(arg0 ^ 0xFE) << 8);
        var3.field9214[0] = var7 - class236.field3535;
        var3.field3460 = (var3.field9214[0] << 9) + (var3.method3744(1) << 8);
        class435.field6040 = var3.field3467 = var3.field3469 = var5;
        if (class123.method865(var3.field9219[0], var3.field9214[0], arg0 ^ 0xDC)) {
            var3.field3469++;
        }
        if (class546.field7594[var2] != null) {
            var3.method4026(103, class546.field7594[var2]);
        }
        class783.field10748 = 0;
        class244.field3610[class783.field10748++] = var2;
        class148.field1942[var2] = 0;
        class169.field2154 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method2591(-30, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class119 var13 = class293.field4306[var8] = new class119();
                var13.field1587 = 0;
                var13.field1590 = -1;
                var13.field1591 = false;
                var13.field1586 = false;
                var13.field1592 = (var10 << 28) + (var11 << 14) + var12;
                class172.field2189[class169.field2154++] = var8;
                class148.field1942[var8] = 0;
            }
        }
        arg1.method2596((byte) -33);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[BI)V")
    public final void method911(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1732++;
        try {
            if (this.field1741 < (long) arg3 + this.field1751) {
                this.field1741 = this.field1751 + ((long) arg3);
            }
            if (arg1 != -13467) {
                this.field1744 = 53;
            }
            if (this.field1742 != -1L && (this.field1742 > this.field1751 || this.field1751 > ((long) this.field1752 + this.field1742))) {
                this.method916((byte) -102);
            }
            if (this.field1742 != -1L && this.field1742 + ((long) this.field1731.length) < this.field1751 - -((long) arg3)) {
                int var5 = (int) (this.field1742 + (long) this.field1731.length - this.field1751);
                class335.method2118(arg2, arg0, this.field1731, (int) (this.field1751 - this.field1742), var5);
                arg0 += var5;
                arg3 -= var5;
                this.field1751 += var5;
                this.field1752 = this.field1731.length;
                this.method916((byte) -104);
            }
            if (arg3 > this.field1731.length) {
                if (this.field1751 != this.field1738) {
                    this.field1733.method3113((byte) -110, this.field1751);
                    this.field1738 = this.field1751;
                }
                this.field1733.method3116(arg0, 1, arg3, arg2);
                this.field1738 += arg3;
                if (this.field1743 < this.field1738) {
                    this.field1743 = this.field1738;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field1734 <= this.field1751 && (long) this.field1744 + this.field1734 > this.field1751) {
                    var6 = this.field1751;
                } else if (this.field1751 <= this.field1734 && this.field1734 < (long) arg3 + this.field1751) {
                    var6 = this.field1734;
                }
                if (this.field1751 + ((long) arg3) > this.field1734 && (long) this.field1744 + this.field1734 >= (long) arg3 + this.field1751) {
                    var8 = (long) arg3 + this.field1751;
                } else if (this.field1751 < ((long) this.field1744 + this.field1734) && (long) arg3 + this.field1751 >= this.field1734 - -((long) this.field1744)) {
                    var8 = (long) this.field1744 + this.field1734;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class335.method2118(arg2, (int) ((long) arg0 + var6 - this.field1751), this.field1736, (int) (var6 - this.field1734), var10);
                }
                this.field1751 += arg3;
            } else if (arg3 > 0) {
                if (this.field1742 == -1L) {
                    this.field1742 = this.field1751;
                }
                class335.method2118(arg2, arg0, this.field1731, (int) (this.field1751 - this.field1742), arg3);
                this.field1751 += arg3;
                if (((long) this.field1752) < (this.field1751 - this.field1742)) {
                    this.field1752 = (int) (this.field1751 - this.field1742);
                }
            }
        } catch (IOException var12) {
            this.field1738 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
    public final void method912(int arg0) throws IOException {
        if (arg0 == 1) {
            field1749++;
            this.method916((byte) -120);
            this.field1733.method3121((byte) 32);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
    private final void method913(boolean arg0) throws IOException {
        if (arg0) {
            this.method909(-29);
        }
        field1747++;
        this.field1744 = 0;
        if (this.field1751 != this.field1738) {
            this.field1733.method3113((byte) -116, this.field1751);
            this.field1738 = this.field1751;
        }
        this.field1734 = this.field1751;
        while (this.field1736.length > this.field1744) {
            int var2 = this.field1736.length - this.field1744;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1733.method3115(this.field1744, (byte) 44, var2, this.field1736);
            if (var3 == -1) {
                break;
            }
            this.field1744 += var3;
            this.field1738 += var3;
        }
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V")
    public static final void method914(int arg0) {
        int var1 = 0;
        int var2 = 11 % ((arg0 - 27) / 58);
        while (class429.field5988 > var1) {
            int var3 = class425.field5934[var1];
            class685 var4 = (class685) class450.field6288.method3669(false, (long) var3);
            if (var4 != null) {
                class359 var5 = var4.field9573;
                class219.method1355(var5.field5172.field8899, (byte) 120, var5);
            }
            var1++;
        }
        field1746++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[B)V")
    public final void method915(int arg0, byte[] arg1) throws IOException {
        this.method919(arg0, arg1.length, -1, arg1);
        field1745++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    private final void method916(byte arg0) throws IOException {
        field1739++;
        if (this.field1742 != -1L) {
            if (this.field1742 != this.field1738) {
                this.field1733.method3113((byte) -113, this.field1742);
                this.field1738 = this.field1742;
            }
            this.field1733.method3116(0, 1, this.field1752, this.field1731);
            this.field1738 += this.field1752;
            if (this.field1738 > this.field1743) {
                this.field1743 = this.field1738;
            }
            long var2 = -1L;
            if (this.field1742 >= this.field1734 && this.field1742 < this.field1734 + ((long) this.field1744)) {
                var2 = this.field1742;
            } else if (this.field1734 >= this.field1742 && ((long) this.field1752 + this.field1742) > this.field1734) {
                var2 = this.field1734;
            }
            long var4 = -1L;
            if ((long) this.field1752 + this.field1742 > this.field1734 && (long) this.field1752 + this.field1742 <= (long) this.field1744 + this.field1734) {
                var4 = (long) this.field1752 + this.field1742;
            } else if (this.field1742 < ((long) this.field1744 + this.field1734) && ((long) this.field1752 + this.field1742) >= ((long) this.field1744 + this.field1734)) {
                var4 = (long) this.field1744 + this.field1734;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class335.method2118(this.field1731, (int) (var2 - this.field1742), this.field1736, (int) (var2 - this.field1734), var6);
            }
            this.field1752 = 0;
            this.field1742 = -1L;
        }
        if (arg0 >= -92) {
            this.method908(-60);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIILha;IIIIIILka;IILgf;)Lka;")
    public static final class231 method917(int arg0, int arg1, int arg2, class473 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class231 arg10, int arg11, int arg12, class73 arg13) {
        field1737++;
        if (arg10 == null) {
            return null;
        }
        int var14 = 2055;
        if (arg13 != null) {
            int var15 = var14 | arg13.method541(-1, false, arg2, (byte) -43);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = ((long) arg4 << 48) + ((long) ((arg7 << 24) + (arg8 << 16) + arg6) + ((long) arg0 << 32));
        class39 var18 = class4.field26;
        class231 var19;
        synchronized (class4.field26) {
            var19 = (class231) class4.field26.method312(0, var16);
        }
        if (var19 == null || arg3.method188(var19.method1587(), var14) != 0) {
            if (var19 != null) {
                var14 = arg3.method198(var14, var19.method1587());
            }
            byte var20;
            if (arg6 == 1) {
                var20 = 9;
            } else if (arg6 == 2) {
                var20 = 12;
            } else if (arg6 == 3) {
                var20 = 15;
            } else if (arg6 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            byte var21 = 3;
            int[] var22 = new int[] { 64, 96, 128 };
            class534 var23 = new class534(var20 * var21 + 1, var20 * var21 * 2 + -var20, 0);
            int var24 = var23.method3163(0, 0, 0, false);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class448.field6265[var30] * var27 >> 14;
                    int var32 = class448.field6270[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method3163(0, var32, var31, false);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg7 * var34 + arg8 * var35 >> 8);
                short var37 = (short) (((arg0 & 0x7F) * var35 + (arg4 & 0x7F) * var34 & 0x7F00) + ((arg0 & 0xFC00) * var35 + (arg4 & 0xFC00) * var34 & 0xFC0000) + ((arg0 & 0x380) * var35 + (arg4 & 0x380) * var34 & 0x38000) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method3164(6118, var25[0][var38], var24, var25[0][(var38 + 1) % var20], (byte) 1, (short) -1, var36, (byte) -1, var37);
                    } else {
                        var23.method3164(6118, var25[var33][(var38 + 1) % var20], var25[var33 - 1][var38], var25[var33 - 1][(var38 + 1) % var20], (byte) 1, (short) -1, var36, (byte) -1, var37);
                        var23.method3164(6118, var25[var33][var38], var25[var33 - 1][var38], var25[var33][(var38 + 1) % var20], (byte) 1, (short) -1, var36, (byte) -1, var37);
                    }
                }
            }
            var19 = arg3.method231(var23, var14, class18.field124, 64, 768);
            class39 var39 = class4.field26;
            synchronized (class4.field26) {
                class4.field26.method305(var19, var16, 18320);
            }
        }
        int var40 = arg10.method1544();
        int var41 = arg10.method1583();
        int var42 = arg10.method1566();
        int var43 = arg10.method1537();
        class146 var44 = null;
        if (arg13 != null) {
            int var45 = arg13.field816[arg2];
            var44 = class571.field8029.method3694(var45 >> 16, 3702);
            arg2 = var45 & 0xFFFF;
        }
        class231 var46;
        if (var44 == null) {
            var46 = var19.method1584((byte) 3, var14, true);
            var46.method1550(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method1565(var40 + var41 >> 1, 0, var42 + var43 >> 1);
        } else {
            var46 = var19.method1584((byte) 3, var14, true);
            var46.method1550(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method1565(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            var46.method1555(122, arg2, var44);
        }
        if (arg9 != 0) {
            var46.method1569(arg9);
        }
        int var47 = -28 / ((arg12 + 73) / 36);
        if (arg5 != 0) {
            var46.method1559(arg5);
        }
        if (arg1 != 0) {
            var46.method1565(0, arg1, 0);
        }
        return var46;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IJ)V")
    public final void method918(int arg0, long arg1) throws IOException {
        field1735++;
        if (arg1 < (long) arg0) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method909(5396));
        }
        this.field1751 = arg1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III[B)V")
    public final void method919(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1753++;
        try {
            if (arg0 + arg1 > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg3.length);
            }
            if (this.field1742 != -1L && this.field1742 <= this.field1751 && ((long) this.field1752 + this.field1742) >= ((long) arg1 + this.field1751)) {
                class335.method2118(this.field1731, (int) (this.field1751 - this.field1742), arg3, arg0, arg1);
                this.field1751 += arg1;
                return;
            }
            long var5 = this.field1751;
            int var7 = arg0;
            int var8 = arg1;
            if (this.field1751 >= this.field1734 && this.field1751 < (long) this.field1744 + this.field1734) {
                int var9 = (int) ((long) this.field1744 + this.field1734 - this.field1751);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class335.method2118(this.field1736, (int) (this.field1751 - this.field1734), arg3, arg0, var9);
                arg0 += var9;
                arg1 -= var9;
                this.field1751 += var9;
            }
            if (this.field1736.length < arg1) {
                this.field1733.method3113((byte) -113, this.field1751);
                this.field1738 = this.field1751;
                while (arg1 > 0) {
                    int var11 = this.field1733.method3115(arg0, (byte) 80, arg1, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    arg1 -= var11;
                    this.field1738 += var11;
                    this.field1751 += var11;
                    arg0 += var11;
                }
            } else if (arg1 > 0) {
                this.method913(false);
                int var10 = arg1;
                if (this.field1744 < arg1) {
                    var10 = this.field1744;
                }
                class335.method2118(this.field1736, 0, arg3, arg0, var10);
                arg1 -= var10;
                arg0 += var10;
                this.field1751 += var10;
            }
            if ((long) arg2 != this.field1742) {
                if (this.field1742 > this.field1751 && arg1 > 0) {
                    int var12 = (int) (this.field1742 - this.field1751) + arg0;
                    if (var12 > arg0 + arg1) {
                        var12 = arg0 + arg1;
                    }
                    while (arg0 < var12) {
                        arg1--;
                        arg3[arg0++] = 0;
                        this.field1751++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field1742 && var5 + ((long) var8) > this.field1742) {
                    var13 = this.field1742;
                } else if (var5 >= this.field1742 && (long) this.field1752 + this.field1742 > var5) {
                    var13 = var5;
                }
                if (((long) this.field1752 + this.field1742) > var5 && ((long) this.field1752 + this.field1742) <= (var5 + ((long) var8))) {
                    var15 = this.field1742 + ((long) this.field1752);
                } else if (this.field1742 < (long) var8 + var5 && (long) this.field1752 + this.field1742 >= (long) var8 + var5) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class335.method2118(this.field1731, (int) (var13 - this.field1742), arg3, var7 + ((int) (var13 - var5)), var17);
                    if (this.field1751 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field1751));
                        this.field1751 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1738 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lgba;II)V")
    public class136(class523 arg0, int arg1, int arg2) throws IOException {
        this.field1733 = arg0;
        this.field1741 = this.field1743 = arg0.method3114((byte) -113);
        this.field1751 = 0L;
        this.field1736 = new byte[arg1];
        this.field1731 = new byte[arg2];
    }
}
