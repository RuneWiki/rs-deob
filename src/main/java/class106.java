import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class106 {

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    private int field1781 = 0;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "J")
    private long field1785 = -1L;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "J")
    private long field1803 = -1L;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Lcj;")
    private class261 field1772;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "J")
    private long field1780;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "J")
    private long field1795;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "[B")
    private byte[] field1802;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "J")
    private long field1773;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "[B")
    private byte[] field1792;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field1774 = 0;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Lmb;")
    public static class96 field1779 = class243.method1708("settings=", (byte) 116);

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lmb;")
    public static class96 field1775 = class243.method1708("Loaded world list data", (byte) 121);

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "Lmb;")
    public static class96 field1793 = class243.method1708("Fps:", (byte) 99);

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    public static int field1800 = 0;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "Lmb;")
    public static class96 field1805 = class243.method1708("leuchten2:", (byte) 103);

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "[Lmb;")
    public static class96[] field1804 = new class96[100];

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lui;")
    public static class78 field1771 = new class78();

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    private int field1770;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "J")
    private long field1806;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "[Lmb;")
    public static class96[] field1782;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "[[[I")
    public static int[][][] field1790;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "[[[S")
    public static short[][][] field1807;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I[BZI)V")
    public final void method783(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        field1777++;
        try {
            if (arg0 + arg3 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg1.length);
            }
            if (arg2) {
                field1776 = -120;
            }
            if (this.field1785 != -1L && this.field1785 <= this.field1773 && (this.field1773 + ((long) arg0)) <= (this.field1785 + ((long) this.field1781))) {
                class102.method772(this.field1802, (int) (this.field1773 - this.field1785), arg1, arg3, arg0);
                this.field1773 += (long) arg0;
                return;
            }
            long var5 = this.field1773;
            int var7 = arg3;
            int var8 = arg0;
            if (this.field1803 <= this.field1773 && (long) this.field1770 + this.field1803 > this.field1773) {
                int var9 = (int) (this.field1803 + (long) this.field1770 - this.field1773);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                class102.method772(this.field1792, (int) (this.field1773 - this.field1803), arg1, arg3, var9);
                arg3 += var9;
                arg0 -= var9;
                this.field1773 += (long) var9;
            }
            if (arg0 > this.field1792.length) {
                this.field1772.method1806(this.field1773, -83);
                this.field1806 = this.field1773;
                while (arg0 > 0) {
                    int var10 = this.field1772.method1807(arg1, arg0, arg3, 97);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 -= var10;
                    this.field1773 += (long) var10;
                    arg3 += var10;
                    this.field1806 += (long) var10;
                }
            } else if (arg0 > 0) {
                this.method793(true);
                int var11 = arg0;
                if (this.field1770 < arg0) {
                    var11 = this.field1770;
                }
                class102.method772(this.field1792, 0, arg1, arg3, var11);
                arg3 += var11;
                this.field1773 += (long) var11;
                arg0 -= var11;
            }
            if (this.field1785 != -1L) {
                if (this.field1785 > this.field1773 && arg0 > 0) {
                    int var12 = (int) (this.field1785 - this.field1773) + arg3;
                    if (var12 > arg0 + arg3) {
                        var12 = arg0 + arg3;
                    }
                    while (arg3 < var12) {
                        arg1[arg3++] = 0;
                        arg0--;
                        this.field1773++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field1785 && this.field1785 < var5 + ((long) var8)) {
                    var15 = this.field1785;
                } else if (var5 >= this.field1785 && (long) this.field1781 + this.field1785 > var5) {
                    var15 = var5;
                }
                if (var5 < ((long) this.field1781 + this.field1785) && ((long) var8 + var5) >= (this.field1785 + ((long) this.field1781))) {
                    var13 = (long) this.field1781 + this.field1785;
                } else if (this.field1785 < ((long) var8 + var5) && ((long) var8 + var5) <= ((long) this.field1781 + this.field1785)) {
                    var13 = (long) var8 + var5;
                }
                if (var15 > -1L && var13 > var15) {
                    int var17 = (int) (var13 - var15);
                    class102.method772(this.field1802, (int) (var15 - this.field1785), arg1, (int) (var15 - var5) + var7, var17);
                    if (var13 > this.field1773) {
                        arg0 = (int) ((long) arg0 - (var13 - this.field1773));
                        this.field1773 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1806 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IJ)V")
    public final void method784(int arg0, long arg1) throws IOException {
        field1798++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method787(-17153));
        }
        this.field1773 = arg1;
        if (arg0 != -1658) {
            method788(97);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB[BI)V")
    public final void method785(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 != 71) {
            method797((byte) -80);
        }
        field1797++;
        try {
            if ((this.field1773 + ((long) arg3)) > this.field1795) {
                this.field1795 = (long) arg3 + this.field1773;
            }
            if (this.field1785 != -1L && (this.field1773 < this.field1785 || ((long) this.field1781 + this.field1785) < this.field1773)) {
                this.method790(true);
            }
            if (this.field1785 != -1L && ((long) this.field1802.length + this.field1785) < ((long) arg3 + this.field1773)) {
                int var5 = (int) (this.field1785 + (long) this.field1802.length - this.field1773);
                class102.method772(arg2, arg0, this.field1802, (int) (this.field1773 - this.field1785), var5);
                arg3 -= var5;
                this.field1773 += (long) var5;
                arg0 += var5;
                this.field1781 = this.field1802.length;
                this.method790(true);
            }
            if (this.field1802.length < arg3) {
                if (this.field1806 != this.field1773) {
                    this.field1772.method1806(this.field1773, -103);
                    this.field1806 = this.field1773;
                }
                this.field1772.method1808(arg2, arg3, arg0, arg1 - 3);
                this.field1806 += (long) arg3;
                if (this.field1806 > this.field1780) {
                    this.field1780 = this.field1806;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field1773 >= this.field1803 && this.field1773 < ((long) this.field1770 + this.field1803)) {
                    var8 = this.field1773;
                } else if (this.field1803 >= this.field1773 && this.field1803 < ((long) arg3 + this.field1773)) {
                    var8 = this.field1803;
                }
                if ((long) arg3 + this.field1773 > this.field1803 && ((long) this.field1770 + this.field1803) >= (this.field1773 + ((long) arg3))) {
                    var6 = this.field1773 + ((long) arg3);
                } else if (this.field1773 < ((long) this.field1770 + this.field1803) && (long) this.field1770 + this.field1803 <= (long) arg3 + this.field1773) {
                    var6 = (long) this.field1770 + this.field1803;
                }
                if (var8 > -1L && var8 < var6) {
                    int var10 = (int) (var6 - var8);
                    class102.method772(arg2, (int) (var8 + (long) arg0 - this.field1773), this.field1792, (int) (var8 - this.field1803), var10);
                }
                this.field1773 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field1785 == -1L) {
                    this.field1785 = this.field1773;
                }
                class102.method772(arg2, arg0, this.field1802, (int) (this.field1773 - this.field1785), arg3);
                this.field1773 += (long) arg3;
                if (((long) this.field1781) < (this.field1773 - this.field1785)) {
                    this.field1781 = (int) (this.field1773 - this.field1785);
                }
            }
        } catch (IOException var12) {
            this.field1806 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Z")
    public static final boolean method786(int arg0) {
        field1783++;
        return arg0 <= 39 ? true : class130.field2353;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method787(int arg0) {
        if (arg0 == -17153) {
            field1799++;
            return this.field1772.method1805(-121);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
    public static final void method788(int arg0) {
        field1796++;
        if (!class266.field4644) {
            return;
        }
        class266.field4644 = false;
        if (arg0 >= 56) {
            class192.field3321 = null;
            class96.field1610 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1786++;
        int var7 = 0;
        class244.method1713(4080, arg2);
        int var8 = arg2;
        int var9 = arg2 - arg6;
        if (arg0 != 30867) {
            field1774 = 48;
        }
        int var10 = -arg2;
        if (var9 < 0) {
            var9 = 0;
        }
        int var11 = -var9;
        int var12 = -1;
        int var13 = -1;
        int var14 = var9;
        if (client.field1994 <= arg5 && arg5 <= class9.field149) {
            int[] var15 = class229.field3939[arg5];
            int var16 = class268.method1841(class162.field2884, class9.field145, arg0 - 30867, -arg2 + arg4);
            int var17 = class268.method1841(class162.field2884, class9.field145, 0, arg2 + arg4);
            int var18 = class268.method1841(class162.field2884, class9.field145, 0, arg4 - var9);
            int var19 = class268.method1841(class162.field2884, class9.field145, 0, arg4 + var9);
            class36.method283(var16, var15, var18, (byte) -86, arg3);
            class36.method283(var18, var15, var19, (byte) -97, arg1);
            class36.method283(var19, var15, var17, (byte) -71, arg3);
        }
        while (var8 > var7) {
            var12 += 2;
            var13 += 2;
            var10 += var12;
            var11 += var13;
            if (var11 >= 0 && var14 >= 1) {
                var14--;
                var11 -= var14 << 1;
                class26.field442[var14] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var8--;
                var10 -= var8 << 1;
                int var20 = arg5 + var8;
                int var21 = arg5 - var8;
                if (client.field1994 <= var20 && class9.field149 >= var21) {
                    if (var8 < var9) {
                        int var22 = class26.field442[var8];
                        int var23 = class268.method1841(class162.field2884, class9.field145, 0, arg4 + var7);
                        int var24 = class268.method1841(class162.field2884, class9.field145, 0, arg4 - var7);
                        int var25 = class268.method1841(class162.field2884, class9.field145, arg0 - 30867, arg4 + var22);
                        int var26 = class268.method1841(class162.field2884, class9.field145, arg0 ^ 0x7893, arg4 - var22);
                        if (class9.field149 >= var20) {
                            int[] var27 = class229.field3939[var20];
                            class36.method283(var24, var27, var26, (byte) -113, arg3);
                            class36.method283(var26, var27, var25, (byte) -128, arg1);
                            class36.method283(var25, var27, var23, (byte) -115, arg3);
                        }
                        if (client.field1994 <= var21) {
                            int[] var28 = class229.field3939[var21];
                            class36.method283(var24, var28, var26, (byte) -124, arg3);
                            class36.method283(var26, var28, var25, (byte) -95, arg1);
                            class36.method283(var25, var28, var23, (byte) -101, arg3);
                        }
                    } else {
                        int var29 = class268.method1841(class162.field2884, class9.field145, arg0 - 30867, arg4 + var7);
                        int var30 = class268.method1841(class162.field2884, class9.field145, 0, arg4 - var7);
                        if (class9.field149 >= var20) {
                            class36.method283(var30, class229.field3939[var20], var29, (byte) -66, arg3);
                        }
                        if (client.field1994 <= var21) {
                            class36.method283(var30, class229.field3939[var21], var29, (byte) -102, arg3);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (client.field1994 <= var32 && class9.field149 >= var31) {
                int var33 = arg4 + var8;
                int var34 = arg4 - var8;
                if (class9.field145 <= var33 && class162.field2884 >= var34) {
                    int var35 = class268.method1841(class162.field2884, class9.field145, 0, var33);
                    int var36 = class268.method1841(class162.field2884, class9.field145, 0, var34);
                    if (var7 < var9) {
                        int var37 = var7 > var14 ? class26.field442[var7] : var14;
                        int var38 = class268.method1841(class162.field2884, class9.field145, 0, arg4 + var37);
                        int var39 = class268.method1841(class162.field2884, class9.field145, 0, arg4 - var37);
                        if (class9.field149 >= var32) {
                            int[] var40 = class229.field3939[var32];
                            class36.method283(var36, var40, var39, (byte) -67, arg3);
                            class36.method283(var39, var40, var38, (byte) -76, arg1);
                            class36.method283(var38, var40, var35, (byte) -92, arg3);
                        }
                        if (var31 >= client.field1994) {
                            int[] var41 = class229.field3939[var31];
                            class36.method283(var36, var41, var39, (byte) -70, arg3);
                            class36.method283(var39, var41, var38, (byte) -117, arg1);
                            class36.method283(var38, var41, var35, (byte) -99, arg3);
                        }
                    } else {
                        if (class9.field149 >= var32) {
                            class36.method283(var36, class229.field3939[var32], var35, (byte) -124, arg3);
                        }
                        if (var31 >= client.field1994) {
                            class36.method283(var36, class229.field3939[var31], var35, (byte) -71, arg3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
    private final void method790(boolean arg0) throws IOException {
        field1791++;
        if (this.field1785 != -1L) {
            if (this.field1806 != this.field1785) {
                this.field1772.method1806(this.field1785, -122);
                this.field1806 = this.field1785;
            }
            this.field1772.method1808(this.field1802, this.field1781, 0, 78);
            this.field1806 += (long) this.field1781;
            if (this.field1806 > this.field1780) {
                this.field1780 = this.field1806;
            }
            long var2 = -1L;
            if (this.field1785 >= this.field1803 && this.field1785 < ((long) this.field1770 + this.field1803)) {
                var2 = this.field1785;
            } else if (this.field1785 <= this.field1803 && (long) this.field1781 + this.field1785 > this.field1803) {
                var2 = this.field1803;
            }
            long var4 = -1L;
            if (this.field1803 < (long) this.field1781 + this.field1785 && this.field1785 + ((long) this.field1781) <= (long) this.field1770 + this.field1803) {
                var4 = this.field1785 + ((long) this.field1781);
            } else if (this.field1785 < this.field1803 + ((long) this.field1770) && (long) this.field1770 + this.field1803 <= (long) this.field1781 + this.field1785) {
                var4 = this.field1803 + ((long) this.field1770);
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class102.method772(this.field1802, (int) (var2 - this.field1785), this.field1792, (int) (var2 - this.field1803), var6);
            }
            this.field1785 = -1L;
            this.field1781 = 0;
        }
        if (!arg0) {
            method786(112);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BZ)I")
    public static final int method791(byte arg0, boolean arg1) {
        field1801++;
        long var2 = class155.method1133(123);
        if (arg0 != 31) {
            field1793 = null;
        }
        for (class149 var4 = arg1 ? (class149) class245.field4257.method1074(false) : (class149) class245.field4257.method1087((byte) 105); var4 != null; var4 = (class149) class245.field4257.method1087((byte) 117)) {
            if (var2 > (var4.field2631 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field2631 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field4304;
                    class54.field937[var5] = class44.field758[var5];
                    var4.method1743((byte) 66);
                    return var5;
                }
                var4.method1743((byte) 108);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)J")
    public final long method792(int arg0) {
        if (arg0 != 100) {
            field1775 = null;
        }
        field1784++;
        return this.field1795;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)V")
    private final void method793(boolean arg0) throws IOException {
        this.field1770 = 0;
        field1788++;
        if (this.field1806 != this.field1773) {
            this.field1772.method1806(this.field1773, -84);
            this.field1806 = this.field1773;
        }
        this.field1803 = this.field1773;
        while (this.field1792.length > this.field1770) {
            int var2 = this.field1792.length - this.field1770;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1772.method1807(this.field1792, var2, this.field1770, 118);
            if (var3 == -1) {
                break;
            }
            this.field1770 += var3;
            this.field1806 += (long) var3;
        }
        if (!arg0) {
            this.method792(-27);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([BI)V")
    public final void method794(byte[] arg0, int arg1) throws IOException {
        field1794++;
        this.method783(arg0.length, arg0, false, 0);
        if (arg1 != -23122) {
            method789(-106, 68, -3, -10, -92, 86, 72);
        }
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V")
    public static final void method795(int arg0) {
        class269.field4691.method96(false);
        field1778++;
        if (arg0 != -1) {
            method789(60, 48, 29, 61, -60, 71, 110);
        }
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V")
    public final void method796(int arg0) throws IOException {
        field1789++;
        if (arg0 != 2) {
            this.field1792 = null;
        }
        this.method790(true);
        this.field1772.method1804(0);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method797(byte arg0) {
        field1782 = null;
        if (arg0 != 76) {
            return;
        }
        field1805 = null;
        field1804 = null;
        field1807 = null;
        field1771 = null;
        field1790 = null;
        field1793 = null;
        field1779 = null;
        field1775 = null;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lcj;II)V")
    public class106(class261 arg0, int arg1, int arg2) throws IOException {
        this.field1772 = arg0;
        this.field1795 = this.field1780 = arg0.method1803(-10);
        this.field1802 = new byte[arg2];
        this.field1773 = 0L;
        this.field1792 = new byte[arg1];
    }
}
