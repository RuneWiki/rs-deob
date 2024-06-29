import java.awt.Graphics;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class79 {

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    private int field1796 = 0;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "J")
    private long field1792 = -1L;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "J")
    private long field1805 = -1L;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Led;")
    private class33 field1794;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "J")
    private long field1786;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "J")
    private long field1784;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "J")
    private long field1790;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "[B")
    private byte[] field1782;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "[B")
    private byte[] field1793;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field1787 = -1;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lob;")
    public static class99 field1788 = new class99();

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public static int field1813 = 0;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "Lqf;")
    public static class117 field1815 = class72.method514(111, " <col=ffffff>");

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    private int field1795;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "J")
    private long field1801;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Lr;")
    public static class118 field1791;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "Ljb;")
    public static class64 field1812;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "Ljb;")
    public static class64 field1814;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "Lma;")
    public static class84 field1811;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(JI)V")
    public final void method610(long arg0, int arg1) {
        field1797++;
        if (arg0 >= 0L) {
            int var4 = -14 / ((48 - arg1) / 63);
            this.field1790 = arg0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)I")
    public static final int method611(int arg0, int arg1, int arg2, int arg3) {
        field1798++;
        int var4 = arg3 / arg0;
        int var5 = arg2 / arg0;
        int var6 = arg0 - 1 & arg3;
        int var7 = class56.method411(var5, var4, (byte) 122);
        int var8 = arg0 - 1 & arg2;
        if (arg1 >= -96) {
            field1815 = null;
        }
        int var9 = class56.method411(var5, var4 + 1, (byte) 111);
        int var10 = class56.method411(var5 + 1, var4, (byte) 113);
        int var11 = class56.method411(var5 + 1, var4 + 1, (byte) 127);
        int var12 = class83.method652(var7, var9, arg0, 65536, var6);
        int var13 = class83.method652(var10, var11, arg0, 65536, var6);
        return class83.method652(var12, var13, arg0, 65536, var8);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([BIII)V")
    public final void method612(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field1800++;
        try {
            if (arg2 == -1177) {
                if (this.field1784 < (long) arg3 + this.field1790) {
                    this.field1784 = (long) arg3 + this.field1790;
                }
                if (this.field1805 != -1L && (this.field1790 < this.field1805 || this.field1790 > (long) this.field1796 + this.field1805)) {
                    this.method620(126);
                }
                if (this.field1805 != -1L && this.field1790 + (long) arg3 > (long) this.field1782.length + this.field1805) {
                    int var5 = (int) (this.field1805 + (long) this.field1782.length - this.field1790);
                    arg3 -= var5;
                    class109.method822(arg0, arg1, this.field1782, (int) (this.field1790 - this.field1805), var5);
                    this.field1790 += var5;
                    this.field1796 = this.field1782.length;
                    this.method620(11);
                    arg1 += var5;
                }
                if (arg3 > this.field1782.length) {
                    if (this.field1801 != this.field1790) {
                        this.field1794.method261(-1, this.field1790);
                        this.field1801 = this.field1790;
                    }
                    this.field1794.method264(arg1, -16321, arg0, arg3);
                    long var6 = -1L;
                    if (this.field1790 >= this.field1792 && this.field1792 + (long) this.field1795 > this.field1790) {
                        var6 = this.field1790;
                    } else if (this.field1790 <= this.field1792 && (long) arg3 + this.field1790 > this.field1792) {
                        var6 = this.field1792;
                    }
                    long var8 = -1L;
                    this.field1801 += arg3;
                    if ((long) arg3 + this.field1790 > this.field1792 && (long) arg3 + this.field1790 <= (long) this.field1795 + this.field1792) {
                        var8 = (long) arg3 + this.field1790;
                    } else if ((long) this.field1795 + this.field1792 > this.field1790 && (long) arg3 + this.field1790 >= (long) this.field1795 + this.field1792) {
                        var8 = this.field1792 + (long) this.field1795;
                    }
                    if (this.field1786 < this.field1801) {
                        this.field1786 = this.field1801;
                    }
                    if (var6 > -1L && var6 < var8) {
                        int var10 = (int) (var8 - var6);
                        class109.method822(arg0, (int) ((long) arg1 + var6 - this.field1790), this.field1793, (int) (var6 - this.field1792), var10);
                    }
                    this.field1790 += arg3;
                } else if (arg3 > 0) {
                    if (this.field1805 == -1L) {
                        this.field1805 = this.field1790;
                    }
                    class109.method822(arg0, arg1, this.field1782, (int) (this.field1790 - this.field1805), arg3);
                    this.field1790 += arg3;
                    if (this.field1790 - this.field1805 > (long) this.field1796) {
                        this.field1796 = (int) (this.field1790 - this.field1805);
                    }
                }
            }
        } catch (IOException var12) {
            this.field1801 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLfd;)V")
    public static final void method613(byte arg0, class40 arg1) {
        class90.field2212 = arg1;
        field1802++;
        if (arg0 != -38) {
            field1814 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Lqf;")
    public static final class117 method614(int arg0, int arg1) {
        if (arg0 == 15591) {
            field1810++;
            return class48.method344(false, (byte) -123, 10, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public static void method615(boolean arg0) {
        field1814 = null;
        field1788 = null;
        field1815 = null;
        if (arg0) {
            field1811 = null;
            field1791 = null;
            field1812 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    private final void method616(byte arg0) throws IOException {
        field1785++;
        this.field1795 = 0;
        if (this.field1801 != this.field1790) {
            this.field1794.method261(-1, this.field1790);
            this.field1801 = this.field1790;
        }
        this.field1792 = this.field1790;
        if (arg0 < 35) {
            field1811 = null;
        }
        while (this.field1795 < this.field1793.length) {
            int var2 = this.field1794.method260((byte) -16, this.field1795, this.field1793, this.field1793.length - this.field1795);
            if (var2 == -1) {
                break;
            }
            this.field1795 += var2;
            this.field1801 += var2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)I")
    public static final int method617(int arg0, int arg1, int arg2) {
        field1806++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 0) {
                arg2 = 0;
            } else if (arg2 > 127) {
                arg2 = 127;
            }
            return 127 - arg2;
        } else {
            int var4 = (arg1 & 0x7F) * arg2 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return arg0 == 7371 ? (arg1 & 0xFF80) + var4 : -101;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([BIIB)V")
    public final void method618(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field1789++;
        try {
            if (arg3 != 42) {
                method617(-103, -47, 70);
            }
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field1805 != -1L && this.field1805 <= this.field1790 && (long) this.field1796 + this.field1805 >= this.field1790 - -((long) arg2)) {
                class109.method822(this.field1782, (int) (this.field1790 - this.field1805), arg0, arg1, arg2);
                this.field1790 += arg2;
                return;
            }
            long var5 = this.field1790;
            int var7 = arg1;
            int var8 = arg2;
            if (this.field1792 <= this.field1790 && (long) this.field1795 + this.field1792 > this.field1790) {
                int var9 = (int) ((long) this.field1795 + this.field1792 - this.field1790);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                class109.method822(this.field1793, (int) (this.field1790 - this.field1792), arg0, arg1, var9);
                this.field1790 += var9;
                arg1 += var9;
                arg2 -= var9;
            }
            if (arg2 > this.field1793.length) {
                this.field1794.method261(-1, this.field1790);
                this.field1801 = this.field1790;
                while (arg2 > 0) {
                    int var10 = this.field1794.method260((byte) -16, arg1, arg0, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    arg1 += var10;
                    this.field1801 += var10;
                    this.field1790 += var10;
                    arg2 -= var10;
                }
            } else if (arg2 > 0) {
                int var11 = arg2;
                this.method616((byte) 59);
                if (arg2 > this.field1795) {
                    var11 = this.field1795;
                }
                class109.method822(this.field1793, 0, arg0, arg1, var11);
                arg2 -= var11;
                this.field1790 += var11;
                arg1 += var11;
            }
            if (this.field1805 != -1L) {
                if (this.field1790 < this.field1805 && arg2 > 0) {
                    int var12 = (int) (this.field1805 - this.field1790) + arg1;
                    if (arg1 + arg2 < var12) {
                        var12 = arg1 + arg2;
                    }
                    while (var12 > arg1) {
                        arg2--;
                        arg0[arg1++] = 0;
                        this.field1790++;
                    }
                }
                long var13 = -1L;
                if (this.field1805 + (long) this.field1796 > var5 && (long) var8 + var5 >= (long) this.field1796 + this.field1805) {
                    var13 = (long) this.field1796 + this.field1805;
                } else if ((long) var8 + var5 > this.field1805 && (long) this.field1796 + this.field1805 >= (long) var8 + var5) {
                    var13 = (long) var8 + var5;
                }
                long var15 = -1L;
                if (this.field1805 >= var5 && var5 + (long) var8 > this.field1805) {
                    var15 = this.field1805;
                } else if (this.field1805 <= var5 && (long) this.field1796 + this.field1805 > var5) {
                    var15 = var5;
                }
                if (var15 > -1L && var13 > var15) {
                    int var17 = (int) (var13 - var15);
                    class109.method822(this.field1782, (int) (var15 - this.field1805), arg0, (int) (var15 - var5) + var7, var17);
                    if (this.field1790 < var13) {
                        arg2 = (int) ((long) arg2 + this.field1790 - var13);
                        this.field1790 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1801 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)V")
    public static final void method619(boolean arg0) {
        if (!arg0) {
            field1791 = null;
        }
        if (class8.field131 != null) {
            class53 var1 = class8.field131;
            synchronized (class8.field131) {
                class8.field131 = null;
            }
        }
        field1807++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    private final void method620(int arg0) throws IOException {
        if (this.field1805 != -1L) {
            if (this.field1805 != this.field1801) {
                this.field1794.method261(-1, this.field1805);
                this.field1801 = this.field1805;
            }
            long var2 = -1L;
            this.field1794.method264(0, -16321, this.field1782, this.field1796);
            long var4 = -1L;
            if (this.field1792 <= this.field1805 && this.field1805 < (long) this.field1795 + this.field1792) {
                var2 = this.field1805;
            } else if (this.field1805 <= this.field1792 && (long) this.field1796 + this.field1805 > this.field1792) {
                var2 = this.field1792;
            }
            this.field1801 += this.field1796;
            if ((long) this.field1796 + this.field1805 > this.field1792 && (long) this.field1795 + this.field1792 >= this.field1805 - -((long) this.field1796)) {
                var4 = (long) this.field1796 + this.field1805;
            } else if (this.field1805 < (long) this.field1795 + this.field1792 && (long) this.field1796 + this.field1805 >= (long) this.field1795 + this.field1792) {
                var4 = (long) this.field1795 + this.field1792;
            }
            if (this.field1801 > this.field1786) {
                this.field1786 = this.field1801;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class109.method822(this.field1782, (int) (var2 - this.field1805), this.field1793, (int) (var2 - this.field1792), var6);
            }
            this.field1805 = -1L;
            this.field1796 = 0;
        }
        int var7 = -47 % ((68 - arg0) / 42);
        field1799++;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public final void method621(int arg0) throws IOException {
        this.method620(119);
        field1804++;
        if (arg0 != -9837) {
            this.field1792 = -81L;
        }
        this.field1794.method263(121);
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)J")
    public final long method622(int arg0) {
        field1808++;
        return arg0 == -21138 ? this.field1784 : -40L;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III[B)Z")
    public static final boolean method623(int arg0, int arg1, int arg2, byte[] arg3) {
        field1809++;
        boolean var4 = true;
        if (arg0 != -23) {
            field1788 = null;
        }
        class77 var5 = new class77(arg3);
        int var6 = -1;
        label58: while (true) {
            int var7 = var5.method582(38);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method582(120);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method570((byte) 123) >> 2;
                    int var15 = var13 + arg1;
                    int var16 = var12 + arg2;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class148 var17 = class23.method181((byte) -86, var6);
                        if (var14 != 22 || !class20.field334 || var17.field3627 != 0 || var17.field3643 == 1 || var17.field3639) {
                            var9 = true;
                            if (!var17.method1187(-67)) {
                                class96.field2343++;
                                var4 = false;
                            }
                        }
                    }
                }
                int var10 = var5.method582(arg0 ^ 0xFFFFFFA7);
                if (var10 == 0) {
                    break;
                }
                var5.method570((byte) 123);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBLgd;I)V")
    public static final void method624(int arg0, int arg1, byte arg2, class46 arg3, int arg4) {
        class76.field1666.method214(8);
        if (arg2 != -73) {
            return;
        }
        class77.field1699.method951(0, 0);
        arg3.method325(class68.field1412, 55, 28, 16777215, 0);
        if (arg1 == 0) {
            arg3.method325(class26.field522, 55, 41, 65280, 0);
        }
        field1783++;
        if (arg1 == 1) {
            arg3.method325(class23.field452, 55, 41, 16776960, 0);
        }
        if (arg1 == 2) {
            arg3.method325(class101.field2434, 55, 41, 16711680, 0);
        }
        if (arg1 == 3) {
            arg3.method325(class135.field3242, 55, 41, 65535, 0);
        }
        arg3.method325(class3.field44, 184, 28, 16777215, 0);
        if (arg4 == 0) {
            arg3.method325(class26.field522, 184, 41, 65280, 0);
        }
        if (arg4 == 1) {
            arg3.method325(class23.field452, 184, 41, 16776960, 0);
        }
        if (arg4 == 2) {
            arg3.method325(class101.field2434, 184, 41, 16711680, 0);
        }
        arg3.method325(class107.field2546, 324, 28, 16777215, 0);
        if (arg0 == 0) {
            arg3.method325(class26.field522, 324, 41, 65280, 0);
        }
        if (arg0 == 1) {
            arg3.method325(class23.field452, 324, 41, 16776960, 0);
        }
        if (arg0 == 2) {
            arg3.method325(class101.field2434, 324, 41, 16711680, 0);
        }
        arg3.method319(class104.field2512, 417, 17, 85, 25, 16777215, 0, 1, 1, 0);
        try {
            Graphics var5 = class3.field64.getGraphics();
            class76.field1666.method210(0, 453, (byte) 78, var5);
        } catch (Exception var6) {
            class3.field64.repaint();
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Led;II)V")
    public class79(class33 arg0, int arg1, int arg2) throws IOException {
        this.field1794 = arg0;
        this.field1784 = this.field1786 = arg0.method262(-8624);
        this.field1790 = 0L;
        this.field1782 = new byte[arg2];
        this.field1793 = new byte[arg1];
    }
}
