import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class96 {

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    private int field2133 = 0;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "J")
    private long field2138 = -1L;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "J")
    private long field2148 = -1L;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lr;")
    private class100 field2125;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "J")
    private long field2135;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "J")
    private long field2127;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "[B")
    private byte[] field2122;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "[B")
    private byte[] field2137;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "J")
    private long field2134;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2130 = 0;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    public static int field2143 = 0;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field2141 = 0;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "Lec;")
    public static class28 field2139 = class28.method210(-46, "Enter name of friend to add to list");

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "Lec;")
    public static class28 field2146 = class28.method210(-46, " from your friend list first");

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Ljava/lang/Object;")
    public static Object field2129 = new Object();

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "Lec;")
    public static class28 field2152 = class28.method210(-46, "System update in: ");

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
    public static int field2151 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "Lpa;")
    public static class91 field2153 = new class91(64);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    private int field2128;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "J")
    private long field2149;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "Lwc;")
    public static class128 field2142;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lld;")
    public static class70 field2126;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "Lnd;")
    public static class82 field2147;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZ)V")
    public static final void method688(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < class64.field1430; var2++) {
            int var3 = (class64.field1429[var2] << 14) + 536870912;
            class90 var4 = class88.field1956[class64.field1429[var2]];
            if (var4 != null && var4.method343((byte) 110) && var4.field1996.field2228 == arg1 && var4.field1996.method731((byte) 50)) {
                int var5 = var4.field1446 >> 7;
                int var6 = var4.field1501 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var4.field1500 == 1 && (var4.field1446 & 0x7F) == 64 && (var4.field1501 & 0x7F) == 64) {
                        if (class86.field1926[var5][var6] == class72.field1597) {
                            continue;
                        }
                        class86.field1926[var5][var6] = class72.field1597;
                    }
                    if (!var4.field1996.field2244) {
                        var3 += Integer.MIN_VALUE;
                    }
                    class11.field179.method760(class122.field2657, var4.field1446, var4.field1501, class18.method107(var4.field1501, var4.field1446, arg0 ^ 0x800, class122.field2657), (var4.field1500 - 1) * 64 + 60, var4, var4.field1492, var3, var4.field1462);
                }
            }
        }
        field2123++;
        if (arg0 != -1) {
            method695(50);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public final void method689(byte arg0) throws IOException {
        field2140++;
        this.method697(0);
        if (arg0 < 66) {
            this.field2149 = 24L;
        }
        this.field2125.method714(-1);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    private final void method690(int arg0) throws IOException {
        field2124++;
        if (arg0 < 3) {
            this.method699(48, -88L);
        }
        this.field2128 = 0;
        if (this.field2149 != this.field2134) {
            this.field2125.method710(26512, this.field2134);
            this.field2149 = this.field2134;
        }
        this.field2138 = this.field2134;
        while (this.field2122.length > this.field2128) {
            int var2 = this.field2125.method713((byte) 91, this.field2128, this.field2122.length - this.field2128, this.field2122);
            if (var2 == -1) {
                break;
            }
            this.field2149 += var2;
            this.field2128 += var2;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILke;)V")
    public static final void method691(int arg0, class65 arg1) {
        arg1.field1470 = arg1.field1451;
        field2120++;
        if (arg1.field1484 == 0) {
            arg1.field1438 = 0;
            return;
        }
        if (arg1.field1505 != -1 && arg1.field1482 == 0) {
            class13 var2 = class23.method166(0, arg1.field1505);
            if (arg1.field1444 > 0 && var2.field226 == 0) {
                arg1.field1438++;
                return;
            }
            if (arg1.field1444 <= 0 && var2.field242 == 0) {
                arg1.field1438++;
                return;
            }
        }
        int var3 = arg1.field1501;
        int var4 = arg1.field1446;
        int var5 = arg1.field1487[arg1.field1484 - 1] * 128 + arg1.field1500 * 64;
        int var6 = arg1.field1466[arg1.field1484 - 1] * 128 + arg1.field1500 * 64;
        if (var5 - var4 > 256 || var5 - var4 < -256 || var6 - var3 > 256 || var6 - var3 < -256) {
            arg1.field1501 = var6;
            arg1.field1446 = var5;
            return;
        }
        int var7 = arg1.field1445;
        if (var4 < var5) {
            if (var6 > var3) {
                arg1.field1471 = 1280;
            } else if (var3 <= var6) {
                arg1.field1471 = 1536;
            } else {
                arg1.field1471 = 1792;
            }
        } else if (var4 > var5) {
            if (var3 < var6) {
                arg1.field1471 = 768;
            } else if (var3 <= var6) {
                arg1.field1471 = 512;
            } else {
                arg1.field1471 = 256;
            }
        } else if (var3 >= var6) {
            arg1.field1471 = 0;
        } else {
            arg1.field1471 = 1024;
        }
        int var8 = arg1.field1471 - arg1.field1492 & 0x7FF;
        if (arg0 != -22469) {
            method694(null, false, null, false);
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var9 = 4;
        if (arg1.field1492 != arg1.field1471 && arg1.field1463 == -1 && arg1.field1469 != 0) {
            var9 = 2;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg1.field1449;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg1.field1486;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg1.field1433;
        }
        if (arg1.field1484 > 2) {
            var9 = 6;
        }
        if (var7 == -1) {
            var7 = arg1.field1449;
        }
        if (arg1.field1484 > 3) {
            var9 = 8;
        }
        arg1.field1470 = var7;
        if (arg1.field1438 > 0 && arg1.field1484 > 1) {
            arg1.field1438--;
            var9 = 8;
        }
        if (arg1.field1494[arg1.field1484 - 1]) {
            var9 <<= 0x1;
        }
        if (var3 < var6) {
            arg1.field1501 += var9;
            if (var6 < arg1.field1501) {
                arg1.field1501 = var6;
            }
        } else if (var3 > var6) {
            arg1.field1501 -= var9;
            if (arg1.field1501 < var6) {
                arg1.field1501 = var6;
            }
        }
        if (var5 > var4) {
            arg1.field1446 += var9;
            if (var5 < arg1.field1446) {
                arg1.field1446 = var5;
            }
        } else if (var5 < var4) {
            arg1.field1446 -= var9;
            if (arg1.field1446 < var5) {
                arg1.field1446 = var5;
            }
        }
        if (var9 >= 8 && arg1.field1470 == arg1.field1449 && arg1.field1465 != -1) {
            arg1.field1470 = arg1.field1465;
        }
        if (arg1.field1446 != var5 || arg1.field1501 != var6) {
            return;
        }
        arg1.field1484--;
        if (arg1.field1444 > 0) {
            arg1.field1444--;
            return;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ln;I)Z")
    public static final boolean method692(class78 arg0, int arg1) {
        field2132++;
        int var2 = arg0.field1796;
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            class25.field561++;
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 < 101) {
                var2--;
            } else {
                var2 -= 101;
            }
            class118.field2507++;
            client.method124(-7765, class68.method537(1, new class28[] { class31.field666, class93.field2048[var2] }), 0, 0, 28, 0);
            client.method124(-7765, class68.method537(1, new class28[] { class118.field2505, class93.field2048[var2] }), 0, 0, 51, 0);
            return true;
        }
        if (arg1 >= -55) {
            field2139 = null;
        }
        if (var2 >= 401 && var2 <= 500) {
            class78.field1800++;
            client.method124(-7765, class68.method537(1, new class28[] { class31.field666, arg0.field1803 }), 0, 0, 30, 0);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[BII)V")
    public final void method693(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2150++;
        try {
            if ((long) arg3 + this.field2134 > this.field2127) {
                this.field2127 = (long) arg3 + this.field2134;
            }
            if (this.field2148 != -1L && (this.field2148 > this.field2134 || this.field2134 > (long) this.field2133 + this.field2148)) {
                this.method697(arg2);
            }
            if (this.field2148 != -1L && (long) arg3 + this.field2134 > (long) this.field2137.length + this.field2148) {
                int var5 = (int) ((long) this.field2137.length + this.field2148 - this.field2134);
                arg3 -= var5;
                class84.method637(arg1, arg0, this.field2137, (int) (this.field2134 - this.field2148), var5);
                arg0 += var5;
                this.field2134 += var5;
                this.field2133 = this.field2137.length;
                this.method697(arg2);
            }
            if (arg3 > this.field2137.length) {
                if (this.field2149 != this.field2134) {
                    this.field2125.method710(26512, this.field2134);
                    this.field2149 = this.field2134;
                }
                long var6 = -1L;
                long var8 = -1L;
                this.field2125.method711(arg3, -23, arg0, arg1);
                if (this.field2134 >= this.field2138 && this.field2134 < (long) this.field2128 + this.field2138) {
                    var6 = this.field2134;
                } else if (this.field2138 >= this.field2134 && this.field2138 < (long) arg3 + this.field2134) {
                    var6 = this.field2138;
                }
                if (this.field2138 < (long) arg3 + this.field2134 && (long) this.field2128 + this.field2138 >= (long) arg3 + this.field2134) {
                    var8 = (long) arg3 + this.field2134;
                } else if (this.field2138 + (long) this.field2128 > this.field2134 && this.field2134 + (long) arg3 >= (long) this.field2128 + this.field2138) {
                    var8 = this.field2138 + (long) this.field2128;
                }
                this.field2149 += arg3;
                if (this.field2135 < this.field2149) {
                    this.field2135 = this.field2149;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class84.method637(arg1, (int) ((long) arg0 + var6 - this.field2134), this.field2122, (int) (var6 - this.field2138), var10);
                }
                this.field2134 += arg3;
                return;
            }
            if (arg3 > 0) {
                if (this.field2148 == -1L) {
                    this.field2148 = this.field2134;
                }
                class84.method637(arg1, arg0, this.field2137, (int) (this.field2134 - this.field2148), arg3);
                this.field2134 += arg3;
                if (this.field2134 - this.field2148 > (long) this.field2133) {
                    this.field2133 = (int) (this.field2134 - this.field2148);
                }
                return;
            }
        } catch (IOException var12) {
            this.field2149 = -1L;
            throw var12;
        }
        if (arg2 != 0) {
            field2141 = -113;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lvb;ZLvb;Z)V")
    public static final void method694(class122 arg0, boolean arg1, class122 arg2, boolean arg3) {
        field2144++;
        class75.field1681 = arg2;
        if (!arg1) {
            field2152 = null;
        }
        class27.field577 = arg3;
        class92.field2032 = arg0;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public static void method695(int arg0) {
        field2153 = null;
        field2146 = null;
        field2129 = null;
        field2126 = null;
        field2139 = null;
        field2142 = null;
        if (arg0 != -1) {
            field2141 = 34;
        }
        field2152 = null;
        field2147 = null;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)J")
    public final long method696(byte arg0) {
        if (arg0 != -100) {
            this.method699(-77, 6L);
        }
        field2131++;
        return this.field2127;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    private final void method697(int arg0) throws IOException {
        if (this.field2148 != -1L) {
            if (this.field2149 != this.field2148) {
                this.field2125.method710(26512, this.field2148);
                this.field2149 = this.field2148;
            }
            this.field2125.method711(this.field2133, arg0 ^ 0x9, 0, this.field2137);
            this.field2149 += this.field2133;
            if (this.field2135 < this.field2149) {
                this.field2135 = this.field2149;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field2148 + (long) this.field2133 > this.field2138 && (long) this.field2128 + this.field2138 >= (long) this.field2133 + this.field2148) {
                var2 = (long) this.field2133 + this.field2148;
            } else if (this.field2148 < this.field2138 + (long) this.field2128 && this.field2148 + (long) this.field2133 >= (long) this.field2128 + this.field2138) {
                var2 = (long) this.field2128 + this.field2138;
            }
            if (this.field2148 >= this.field2138 && this.field2138 + (long) this.field2128 > this.field2148) {
                var4 = this.field2148;
            } else if (this.field2138 >= this.field2148 && this.field2148 + (long) this.field2133 > this.field2138) {
                var4 = this.field2138;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class84.method637(this.field2137, (int) (var4 - this.field2148), this.field2122, (int) (var4 - this.field2138), var6);
            }
            this.field2133 = 0;
            this.field2148 = -1L;
        }
        field2136++;
        if (arg0 != 0) {
            field2147 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[BI)V")
    public final void method698(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2145++;
        try {
            if (arg2.length < arg0 + arg1) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg2.length);
            }
            if (this.field2148 != -1L && this.field2134 >= this.field2148 && (long) this.field2133 + this.field2148 >= this.field2134 - -((long) arg1)) {
                class84.method637(this.field2137, (int) (this.field2134 - this.field2148), arg2, arg0, arg1);
                this.field2134 += arg1;
                return;
            }
            long var5 = this.field2134;
            int var7 = arg1;
            int var8 = arg0;
            if (this.field2134 >= this.field2138 && this.field2134 < (long) this.field2128 + this.field2138) {
                int var9 = (int) ((long) this.field2128 + this.field2138 - this.field2134);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class84.method637(this.field2122, (int) (this.field2134 - this.field2138), arg2, arg0, var9);
                arg0 += var9;
                this.field2134 += var9;
                arg1 -= var9;
            }
            if (arg1 > this.field2122.length) {
                this.field2125.method710(26512, this.field2134);
                this.field2149 = this.field2134;
                while (arg1 > 0) {
                    int var10 = this.field2125.method713((byte) 123, arg0, arg1, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    this.field2149 += var10;
                    arg0 += var10;
                    arg1 -= var10;
                    this.field2134 += var10;
                }
            } else if (arg1 > 0) {
                this.method690(120);
                int var11 = arg1;
                if (arg1 > this.field2128) {
                    var11 = this.field2128;
                }
                arg1 -= var11;
                class84.method637(this.field2122, 0, arg2, arg0, var11);
                this.field2134 += var11;
                arg0 += var11;
            }
            if ((long) arg3 != this.field2148) {
                if (this.field2148 > this.field2134 && arg1 > 0) {
                    int var12 = (int) (this.field2148 - this.field2134) + arg0;
                    if (arg0 + arg1 < var12) {
                        var12 = arg0 + arg1;
                    }
                    while (var12 > arg0) {
                        arg1--;
                        arg2[arg0++] = 0;
                        this.field2134++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 < this.field2148 + (long) this.field2133 && (long) this.field2133 + this.field2148 <= var5 - -((long) var7)) {
                    var15 = (long) this.field2133 + this.field2148;
                } else if (this.field2148 < var5 + (long) var7 && (long) var7 + var5 <= (long) this.field2133 + this.field2148) {
                    var15 = var5 + (long) var7;
                }
                if (var5 <= this.field2148 && this.field2148 < (long) var7 + var5) {
                    var13 = this.field2148;
                } else if (this.field2148 <= var5 && var5 < (long) this.field2133 + this.field2148) {
                    var13 = var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class84.method637(this.field2137, (int) (var13 - this.field2148), arg2, (int) (var13 - var5) + var8, var17);
                    if (this.field2134 < var15) {
                        arg1 = (int) ((long) arg1 + this.field2134 - var15);
                        this.field2134 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2149 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IJ)V")
    public final void method699(int arg0, long arg1) {
        field2121++;
        if (arg1 >= 0L && arg0 >= 57) {
            this.field2134 = arg1;
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lr;II)V")
    public class96(class100 arg0, int arg1, int arg2) throws IOException {
        this.field2125 = arg0;
        this.field2127 = this.field2135 = arg0.method712((byte) 114);
        this.field2122 = new byte[arg1];
        this.field2137 = new byte[arg2];
        this.field2134 = 0L;
    }
}
