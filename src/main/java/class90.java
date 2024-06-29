import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class90 {

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "J")
    private long field1789 = -1L;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "J")
    private long field1787 = -1L;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
    private int field1806 = 0;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "Lgd;")
    private class64 field1802;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "J")
    private long field1808;

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "J")
    private long field1810;

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "J")
    private long field1811;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "[B")
    private byte[] field1779;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "[B")
    private byte[] field1794;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static volatile int field1780 = 0;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public static int field1804 = 0;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Lob;")
    public static class141 field1782 = class175.method1195(40, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field1799 = 0;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "Lob;")
    public static class141 field1803 = class175.method1195(40, "titlebox");

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "[I")
    public static int[] field1807 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    private int field1786;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "J")
    private long field1784;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "[I")
    public static int[] field1788;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method607(int arg0) throws IOException {
        this.method611((byte) -46);
        if (arg0 != 244) {
            field1796 = 71;
        }
        field1795++;
        this.field1802.method424((byte) 72);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lob;I)I")
    public static final int method608(class141 arg0, int arg1) {
        field1790++;
        if (class147.field2875 == 1) {
            return 7;
        } else if (arg0.method932(89, client.field587)) {
            return 1;
        } else if (arg0.method932(102, class41.field817)) {
            return 1;
        } else if (arg0.method932(118, class213.field4065)) {
            return 2;
        } else if (arg1 != 3379) {
            return -37;
        } else if (arg0.method932(arg1 ^ 0xFFFFF289, class46.field875)) {
            return 2;
        } else if (arg0.method932(123, class19.field333)) {
            return 3;
        } else if (arg0.method932(113, class22.field385)) {
            return 4;
        } else if (arg0.method932(124, class79.field1584)) {
            return 4;
        } else if (arg0.method932(arg1 - 3478, class6.field67)) {
            return 5;
        } else if (arg0.method932(arg1 - 3472, class87.field1724)) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([BIII)V")
    public final void method609(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field1797++;
        try {
            if (this.field1811 + (long) arg3 > this.field1810) {
                this.field1810 = this.field1811 + (long) arg3;
            }
            if (this.field1787 != -1L && (this.field1811 < this.field1787 || this.field1811 > (long) this.field1806 + this.field1787)) {
                this.method611((byte) -101);
            }
            if (this.field1787 != -1L && (long) arg3 + this.field1811 > (long) this.field1794.length + this.field1787) {
                int var5 = (int) (this.field1787 + (long) this.field1794.length - this.field1811);
                class149.method1039(arg0, arg2, this.field1794, (int) (this.field1811 - this.field1787), var5);
                this.field1811 += var5;
                arg2 += var5;
                arg3 -= var5;
                this.field1806 = this.field1794.length;
                this.method611((byte) 92);
            }
            if (arg3 <= this.field1794.length) {
                if (arg1 != -3818) {
                    method621((byte) -45);
                }
                if (arg3 > 0) {
                    if (this.field1787 == -1L) {
                        this.field1787 = this.field1811;
                    }
                    class149.method1039(arg0, arg2, this.field1794, (int) (this.field1811 - this.field1787), arg3);
                    this.field1811 += arg3;
                    if ((long) this.field1806 < this.field1811 - this.field1787) {
                        this.field1806 = (int) (this.field1811 - this.field1787);
                    }
                }
            } else {
                long var6 = -1L;
                if (this.field1811 != this.field1784) {
                    this.field1802.method423((byte) -93, this.field1811);
                    this.field1784 = this.field1811;
                }
                long var8 = -1L;
                this.field1802.method426(arg3, arg2, arg0, 1);
                this.field1784 += arg3;
                if (this.field1784 > this.field1808) {
                    this.field1808 = this.field1784;
                }
                if (this.field1789 <= this.field1811 && this.field1811 < (long) this.field1786 + this.field1789) {
                    var8 = this.field1811;
                } else if (this.field1811 <= this.field1789 && this.field1811 + (long) arg3 > this.field1789) {
                    var8 = this.field1789;
                }
                if ((long) arg3 + this.field1811 > this.field1789 && (long) arg3 + this.field1811 <= this.field1789 - -((long) this.field1786)) {
                    var6 = this.field1811 + (long) arg3;
                } else if ((long) this.field1786 + this.field1789 > this.field1811 && (long) arg3 + this.field1811 >= (long) this.field1786 + this.field1789) {
                    var6 = (long) this.field1786 + this.field1789;
                }
                if (var8 > -1L && var8 < var6) {
                    int var10 = (int) (var6 - var8);
                    class149.method1039(arg0, (int) ((long) arg2 + var8 - this.field1811), this.field1779, (int) (var8 - this.field1789), var10);
                }
                this.field1811 += arg3;
            }
        } catch (IOException var12) {
            this.field1784 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static void method610(byte arg0) {
        if (arg0 > 45) {
            field1807 = null;
            field1788 = null;
            field1803 = null;
            field1782 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    private final void method611(byte arg0) throws IOException {
        int var2 = 20 / ((35 - arg0) / 43);
        if (this.field1787 != -1L) {
            if (this.field1787 != this.field1784) {
                this.field1802.method423((byte) -44, this.field1787);
                this.field1784 = this.field1787;
            }
            long var3 = -1L;
            this.field1802.method426(this.field1806, 0, this.field1794, 1);
            if (this.field1789 <= this.field1787 && this.field1787 < (long) this.field1786 + this.field1789) {
                var3 = this.field1787;
            } else if (this.field1787 <= this.field1789 && this.field1789 < (long) this.field1806 + this.field1787) {
                var3 = this.field1789;
            }
            long var5 = -1L;
            if (this.field1789 < (long) this.field1806 + this.field1787 && (long) this.field1786 + this.field1789 >= this.field1787 - -((long) this.field1806)) {
                var5 = (long) this.field1806 + this.field1787;
            } else if (this.field1787 < (long) this.field1786 + this.field1789 && (long) this.field1786 + this.field1789 <= (long) this.field1806 + this.field1787) {
                var5 = (long) this.field1786 + this.field1789;
            }
            this.field1784 += this.field1806;
            if (this.field1784 > this.field1808) {
                this.field1808 = this.field1784;
            }
            if (var3 > -1L && var5 > var3) {
                int var7 = (int) (var5 - var3);
                class149.method1039(this.field1794, (int) (var3 - this.field1787), this.field1779, (int) (var3 - this.field1789), var7);
            }
            this.field1787 = -1L;
            this.field1806 = 0;
        }
        field1781++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[BII)V")
    public final void method612(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1793++;
        try {
            if (arg1.length < arg0 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg1.length);
            }
            if (this.field1787 != -1L && this.field1787 <= this.field1811 && (long) arg2 + this.field1811 <= (long) this.field1806 + this.field1787) {
                class149.method1039(this.field1794, (int) (this.field1811 - this.field1787), arg1, arg0, arg2);
                this.field1811 += arg2;
                return;
            }
            long var5 = this.field1811;
            if (arg3 != 5) {
                field1807 = null;
            }
            int var7 = arg0;
            int var8 = arg2;
            if (this.field1811 >= this.field1789 && this.field1811 < (long) this.field1786 + this.field1789) {
                int var9 = (int) (this.field1789 + (long) this.field1786 - this.field1811);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                arg2 -= var9;
                class149.method1039(this.field1779, (int) (this.field1811 - this.field1789), arg1, arg0, var9);
                arg0 += var9;
                this.field1811 += var9;
            }
            if (arg2 > this.field1779.length) {
                this.field1802.method423((byte) 117, this.field1811);
                this.field1784 = this.field1811;
                while (arg2 > 0) {
                    int var10 = this.field1802.method427(arg1, arg0, arg2, 0);
                    if (var10 == -1) {
                        break;
                    }
                    arg2 -= var10;
                    this.field1784 += var10;
                    this.field1811 += var10;
                    arg0 += var10;
                }
            } else if (arg2 > 0) {
                this.method622((byte) 108);
                int var11 = arg2;
                if (arg2 > this.field1786) {
                    var11 = this.field1786;
                }
                class149.method1039(this.field1779, 0, arg1, arg0, var11);
                arg0 += var11;
                arg2 -= var11;
                this.field1811 += var11;
            }
            if (this.field1787 != -1L) {
                if (this.field1811 < this.field1787 && arg2 > 0) {
                    int var12 = (int) (this.field1787 - this.field1811) + arg0;
                    if (arg0 + arg2 < var12) {
                        var12 = arg0 + arg2;
                    }
                    while (arg0 < var12) {
                        arg1[arg0++] = 0;
                        this.field1811++;
                        arg2--;
                    }
                }
                long var13 = -1L;
                if (this.field1787 >= var5 && this.field1787 < var5 + (long) var8) {
                    var13 = this.field1787;
                } else if (this.field1787 <= var5 && var5 < (long) this.field1806 + this.field1787) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < this.field1787 + (long) this.field1806 && var5 + (long) var8 >= (long) this.field1806 + this.field1787) {
                    var15 = (long) this.field1806 + this.field1787;
                } else if (this.field1787 < var5 + (long) var8 && this.field1787 + (long) this.field1806 >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class149.method1039(this.field1794, (int) (var13 - this.field1787), arg1, var7 + (int) (var13 - var5), var17);
                    if (var15 > this.field1811) {
                        arg2 = (int) ((long) arg2 + this.field1811 - var15);
                        this.field1811 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1784 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[B)V")
    public final void method613(int arg0, byte[] arg1) throws IOException {
        this.method612(0, arg1, arg1.length, 5);
        field1801++;
        if (arg0 < 101) {
            this.field1787 = 45L;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII[Lra;IIII)V")
    public static final void method614(int arg0, int arg1, int arg2, int arg3, int arg4, class170[] arg5, int arg6, int arg7, int arg8, int arg9) {
        class148.method1020(arg2, arg9, arg0, arg1);
        class44.method288();
        if (arg8 != 16) {
            method610((byte) 50);
        }
        field1785++;
        for (int var10 = 0; var10 < arg5.length; var10++) {
            class170 var11 = arg5[var10];
            if (var11 != null && (var11.field3400 == arg4 || arg4 == -1412584499 && class66.field1275 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class37.field739[class41.field807] = var11.field3353 + arg6;
                    class16.field289[class41.field807] = var11.field3372 + arg7;
                    class109.field2109[class41.field807] = var11.field3299;
                    class108.field2089[class41.field807] = var11.field3284;
                    var12 = class41.field807++;
                } else {
                    var12 = arg3;
                }
                var11.field3387 = var12;
                var11.field3285 = class20.field344;
                if (!var11.field3305 || !class20.method122((byte) -108, var11)) {
                    if (var11.field3314 > 0) {
                        class59.method399(var11, (byte) 48);
                    }
                    int var13 = var11.field3372 + arg7;
                    int var14 = var11.field3353 + arg6;
                    int var15 = var11.field3324;
                    if (class66.field1275 == var11) {
                        if (arg4 != -1412584499 && !var11.field3382) {
                            class113.field2171 = arg7;
                            class223.field4219 = arg5;
                            class111.field2134 = arg6;
                            continue;
                        }
                        if (!var11.field3382) {
                            var15 = 128;
                        }
                        if (class202.field3826 && class110.field2122) {
                            int var16 = class146.field2794;
                            int var17 = var16 - class213.field4069;
                            int var18 = class174.field3452;
                            if (var17 < class206.field3923) {
                                var17 = class206.field3923;
                            }
                            if (var11.field3299 + var17 > class206.field3923 + class204.field3915.field3299) {
                                var17 = class204.field3915.field3299 + class206.field3923 - var11.field3299;
                            }
                            var14 = var17;
                            int var19 = var18 - class195.field3732;
                            if (var19 < class162.field3135) {
                                var19 = class162.field3135;
                            }
                            if (class162.field3135 + class204.field3915.field3284 < var11.field3284 + var19) {
                                var19 = class162.field3135 + class204.field3915.field3284 - var11.field3284;
                            }
                            var13 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field3392 == 2) {
                        var20 = arg9;
                        var21 = arg1;
                        var22 = arg0;
                        var23 = arg2;
                    } else if (var11.field3392 == 9) {
                        int var26 = var14;
                        int var27 = var13;
                        int var28 = var11.field3299 + var14;
                        if (var28 < var14) {
                            var26 = var28;
                            var28 = var14;
                        }
                        int var30 = var11.field3284 + var13;
                        if (var13 > var30) {
                            var27 = var30;
                            var30 = var13;
                        }
                        var28++;
                        var20 = var27 > arg9 ? var27 : arg9;
                        var30++;
                        var23 = arg2 >= var26 ? arg2 : var26;
                        var21 = var30 >= arg1 ? arg1 : var30;
                        var22 = var28 < arg0 ? var28 : arg0;
                    } else {
                        var23 = var14 <= arg2 ? arg2 : var14;
                        var20 = var13 > arg9 ? var13 : arg9;
                        int var24 = var11.field3299 + var14;
                        var22 = var24 >= arg0 ? arg0 : var24;
                        int var25 = var11.field3284 + var13;
                        var21 = var25 < arg1 ? var25 : arg1;
                    }
                    if (!var11.field3305 || var23 < var22 && var21 > var20) {
                        if (var11.field3314 != 0) {
                            if (var11.field3314 == 1337) {
                                class141.field2730 = var14;
                                class175.field3475 = var13;
                                class195.method1314((byte) 121, var11.field3299, var14, var11.field3284, var13);
                                class148.method1020(arg2, arg9, arg0, arg1);
                                continue;
                            }
                            if (var11.field3314 == 1338) {
                                if (var11.method1173(0)) {
                                    class1.method4(arg8 ^ 0x14, var12, var11, var13, var14);
                                    class148.method1020(arg2, arg9, arg0, arg1);
                                }
                                continue;
                            }
                            if (var11.field3314 == 1339) {
                                if (var11.method1173(0)) {
                                    class46.method303(var12, var14, (byte) -9, var13, var11);
                                    class148.method1020(arg2, arg9, arg0, arg1);
                                }
                                continue;
                            }
                        }
                        int var32 = class146.field2794;
                        int var33 = class174.field3452;
                        if (!class114.field2180 && var23 <= var32 && var20 <= var33 && var22 > var32 && var21 > var33) {
                            class45.method299(var11, (byte) 119, var33 - var13, -var14 + var32);
                        }
                        if (var11.field3392 == 0) {
                            if (!var11.field3305 && class20.method122((byte) -36, var11) && class167.field3222 != var11) {
                                continue;
                            }
                            if (!var11.field3305) {
                                if (var11.field3383 > var11.field3316 - var11.field3284) {
                                    var11.field3383 = var11.field3316 - var11.field3284;
                                }
                                if (var11.field3383 < 0) {
                                    var11.field3383 = 0;
                                }
                            }
                            method614(var22, var21, var23, var12, var11.field3396, arg5, var14 - var11.field3346, var13 - var11.field3383, 16, var20);
                            if (var11.field3337 != null) {
                                method614(var22, var21, var23, var12, var11.field3396, var11.field3337, var14 - var11.field3346, -var11.field3383 + var13, arg8, var20);
                            }
                            class174 var34 = (class174) class173.field3437.method792((long) var11.field3396, 22346);
                            if (var34 != null) {
                                if (var34.field3459 == 0 && class146.field2794 >= var23 && var20 <= class174.field3452 && class146.field2794 < var22 && class174.field3452 < var21 && !class114.field2180 && !class97.field1923) {
                                    class188.field3637 = 1;
                                    class22.field396[0] = class42.field819;
                                    class157.field3026[0] = 1006;
                                    class223.field4210[0] = class111.field2128;
                                }
                                class16.method101(var23, var12, -127, var13, var22, var34.field3454, var21, var20, var14);
                            }
                            class148.method1020(arg2, arg9, arg0, arg1);
                            class44.method288();
                        }
                        if (class195.field3741[var12] || class176.field3490 > 1) {
                            if (var11.field3392 == 0 && !var11.field3305 && var11.field3316 > var11.field3284) {
                                class167.method1153(var11.field3284, var13, var11.field3383, var11.field3299 + var14, var11.field3316, 18768);
                            }
                            if (var11.field3392 != 1) {
                                if (var11.field3392 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var11.field3284; var36++) {
                                        for (int var37 = 0; var37 < var11.field3299; var37++) {
                                            int var38 = (var11.field3321 + 32) * var36 + var13;
                                            int var39 = (var11.field3340 + 32) * var37 + var14;
                                            if (var35 < 20) {
                                                var38 += var11.field3265[var35];
                                                var39 += var11.field3274[var35];
                                            }
                                            if (var11.field3385[var35] > 0) {
                                                boolean var41 = false;
                                                boolean var42 = false;
                                                int var43 = var11.field3385[var35] - 1;
                                                if (var39 + 32 > arg2 && var39 < arg0 && arg9 < var38 + 32 && arg1 > var38 || class146.field2852 == var11 && class174.field3464 == var35) {
                                                    class102 var44;
                                                    if (class29.field568 == 1 && class6.field71 == var35 && class16.field285 == var11.field3396) {
                                                        var44 = class85.method583(2, false, var43, -70, var11.field3319[var35], 0);
                                                    } else {
                                                        var44 = class85.method583(1, false, var43, -118, var11.field3319[var35], 3153952);
                                                    }
                                                    if (var44 == null) {
                                                        class38.method252(var11, arg8 ^ 0xFFFFFFBB);
                                                    } else if (class146.field2852 == var11 && class174.field3464 == var35) {
                                                        int var45 = class174.field3452 - class84.field1670;
                                                        int var46 = class146.field2794 - class46.field886;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (var46 < 5 && var46 > -5) {
                                                            var46 = 0;
                                                        }
                                                        if (class15.field271 < 5) {
                                                            var45 = 0;
                                                            var46 = 0;
                                                        }
                                                        var44.method664(var39 + var46, var38 - -var45, 128);
                                                        if (arg4 != -1) {
                                                            class170 var47 = arg5[arg4 & 0xFFFF];
                                                            int var48 = class148.field2887;
                                                            int var49 = class148.field2884;
                                                            if (var38 + var45 < var49 && var47.field3383 > 0) {
                                                                int var50 = (var49 - var38 - var45) * class34.field695 / 3;
                                                                if (var50 > class34.field695 * 10) {
                                                                    var50 = class34.field695 * 10;
                                                                }
                                                                if (var47.field3383 < var50) {
                                                                    var50 = var47.field3383;
                                                                }
                                                                class84.field1670 += var50;
                                                                var47.field3383 -= var50;
                                                                class38.method252(var47, -92);
                                                            }
                                                            if (var38 + var45 + 32 > var48 && var47.field3316 - var47.field3284 > var47.field3383) {
                                                                int var51 = (var38 + var45 + 32 - var48) * class34.field695 / 3;
                                                                if (var51 > class34.field695 * 10) {
                                                                    var51 = class34.field695 * 10;
                                                                }
                                                                if (var47.field3316 - var47.field3383 - var47.field3284 < var51) {
                                                                    var51 = var47.field3316 - var47.field3284 - var47.field3383;
                                                                }
                                                                var47.field3383 += var51;
                                                                class84.field1670 -= var51;
                                                                class38.method252(var47, arg8 - 142);
                                                            }
                                                        }
                                                    } else if (class191.field3693 == var11 && class17.field300 == var35) {
                                                        var44.method664(var39, var38, 128);
                                                    } else {
                                                        var44.method683(var39, var38);
                                                    }
                                                }
                                            } else if (var11.field3330 != null && var35 < 20) {
                                                class102 var40 = var11.method1168(-59, var35);
                                                if (var40 != null) {
                                                    var40.method683(var39, var38);
                                                } else if (class180.field3537) {
                                                    class38.method252(var11, -104);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var11.field3392 == 3) {
                                    int var52;
                                    if (class135.method851(var11, 0)) {
                                        var52 = var11.field3281;
                                        if (class167.field3222 == var11 && var11.field3298 != 0) {
                                            var52 = var11.field3298;
                                        }
                                    } else {
                                        var52 = var11.field3301;
                                        if (class167.field3222 == var11 && var11.field3350 != 0) {
                                            var52 = var11.field3350;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3318) {
                                            class148.method1030(var14, var13, var11.field3299, var11.field3284, var52);
                                        } else {
                                            class148.method1021(var14, var13, var11.field3299, var11.field3284, var52);
                                        }
                                    } else if (var11.field3318) {
                                        class148.method1033(var14, var13, var11.field3299, var11.field3284, var52, 256 - (var15 & 0xFF));
                                    } else {
                                        class148.method1025(var14, var13, var11.field3299, var11.field3284, var52, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field3392 == 4) {
                                    class80 var53 = var11.method1160(arg8 ^ 0x11, class22.field363);
                                    if (var53 != null) {
                                        class141 var54 = var11.field3325;
                                        int var55;
                                        if (class135.method851(var11, 0)) {
                                            var55 = var11.field3281;
                                            if (class167.field3222 == var11 && var11.field3298 != 0) {
                                                var55 = var11.field3298;
                                            }
                                            if (var11.field3307.method908(false) > 0) {
                                                var54 = var11.field3307;
                                            }
                                        } else {
                                            var55 = var11.field3301;
                                            if (class167.field3222 == var11 && var11.field3350 != 0) {
                                                var55 = var11.field3350;
                                            }
                                        }
                                        if (var11.field3305 && var11.field3359 != -1) {
                                            class50 var56 = class96.method645((byte) -61, var11.field3359);
                                            var54 = var56.field937;
                                            if (var54 == null) {
                                                var54 = class224.field4239;
                                            }
                                            if ((var56.field945 == 1 || var11.field3402 != 1) && var11.field3402 != -1) {
                                                var54 = class220.method1422(new class141[] { class114.field2185, var54, class93.field1856, class219.method1416(84, var11.field3402) }, -3);
                                            }
                                        }
                                        if (class181.field3555 == var11) {
                                            var55 = var11.field3301;
                                            var54 = class76.field1554;
                                        }
                                        if (!var11.field3305) {
                                            var54 = class30.method207(arg8 - 93, var54, var11);
                                        }
                                        var53.method871(var54, var14, var13, var11.field3299, var11.field3284, var55, var11.field3262 ? 0 : -1, var11.field3297, var11.field3338, var11.field3266);
                                    } else if (class180.field3537) {
                                        class38.method252(var11, -83);
                                    }
                                } else if (var11.field3392 == 5) {
                                    if (var11.field3305) {
                                        class102 var58;
                                        if (var11.field3359 == -1) {
                                            var58 = var11.method1172(false, (byte) -96);
                                        } else {
                                            var58 = class85.method583(var11.field3366, false, var11.field3359, -50, var11.field3402, var11.field3278);
                                        }
                                        if (var58 != null) {
                                            int var59 = var58.field1982;
                                            int var60 = var58.field1987;
                                            if (var11.field3279) {
                                                class148.method1037(var14, var13, var14 + var11.field3299, var11.field3284 + var13);
                                                int var61 = (var60 + var11.field3299 - 1) / var60;
                                                int var62 = (var59 + var11.field3284 - 1) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var11.field3312 != 0) {
                                                            var58.method680(var60 / 2 + var60 * var63 + var14, var59 / 2 + var13 - -(var59 * var64), var11.field3312, 4096);
                                                        } else if (var15 == 0) {
                                                            var58.method683(var14 + var60 * var63, var59 * var64 + var13);
                                                        } else {
                                                            var58.method664(var60 * var63 + var14, var13 - -(var59 * var64), 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class148.method1020(arg2, arg9, arg0, arg1);
                                            } else {
                                                int var65 = var11.field3299 * 4096 / var60;
                                                if (var11.field3312 != 0) {
                                                    var58.method680(var11.field3299 / 2 + var14, var13 - -(var11.field3284 / 2), var11.field3312, var65);
                                                } else if (var15 != 0) {
                                                    var58.method671(var14, var13, var11.field3299, var11.field3284, 256 - (var15 & 0xFF));
                                                } else if (var11.field3299 == var60 && var11.field3284 == var59) {
                                                    var58.method683(var14, var13);
                                                } else {
                                                    var58.method661(var14, var13, var11.field3299, var11.field3284);
                                                }
                                            }
                                        } else if (class180.field3537) {
                                            class38.method252(var11, -92);
                                        }
                                    } else {
                                        class102 var57 = var11.method1172(class135.method851(var11, 0), (byte) -96);
                                        if (var57 != null) {
                                            var57.method683(var14, var13);
                                        } else if (class180.field3537) {
                                            class38.method252(var11, -119);
                                        }
                                    }
                                } else if (var11.field3392 == 6) {
                                    boolean var66 = class135.method851(var11, 0);
                                    int var67;
                                    if (var66) {
                                        var67 = var11.field3388;
                                    } else {
                                        var67 = var11.field3379;
                                    }
                                    class56 var68 = null;
                                    int var69 = 0;
                                    if (var11.field3359 != -1) {
                                        class50 var74 = class96.method645((byte) -61, var11.field3359);
                                        if (var74 != null) {
                                            class50 var75 = var74.method332(var11.field3402, -87);
                                            var68 = var75.method328(arg8 - 141, null, 1, 0);
                                            if (var68 == null) {
                                                class38.method252(var11, -91);
                                            } else {
                                                var69 = -var68.method16() / 2;
                                            }
                                        }
                                    } else if (var11.field3315 == 5) {
                                        if (var11.field3327 == -1) {
                                            var68 = class144.field2779.method509(true, -1, -1, null, null);
                                        } else {
                                            int var70 = var11.field3327 & 0x7FF;
                                            if (class97.field1916 == var70) {
                                                var70 = 2047;
                                            }
                                            class38 var71 = class116.field2231[var70];
                                            class26 var72 = var67 == -1 ? null : class114.method736(arg8 + 15603, var67);
                                            if (var71 != null && (int) var71.field773.method926(19790) << 11 == (var11.field3327 & 0xFFFFF800)) {
                                                var68 = var71.field765.method509(true, var11.field3406, 0, null, var72);
                                            }
                                        }
                                    } else if (var67 == -1) {
                                        var68 = var11.method1161(var66, true, -1, null, class114.field2176.field765);
                                        if (var68 == null && class180.field3537) {
                                            class38.method252(var11, -123);
                                        }
                                    } else {
                                        class26 var73 = class114.method736(arg8 ^ 0x3D13, var67);
                                        var68 = var11.method1161(var66, true, var11.field3406, var73, class114.field2176.field765);
                                        if (var68 == null && class180.field3537) {
                                            class38.method252(var11, arg8 ^ 0xFFFFFFA0);
                                        }
                                    }
                                    if (var68 != null) {
                                        class44.method298(var14 + var11.field3299 / 2 + var11.field3363, var11.field3284 / 2 + var11.field3354 + var13);
                                        int var76 = class44.field854[var11.field3272] * var11.field3290 >> 16;
                                        int var77 = class44.field843[var11.field3272] * var11.field3290 >> 16;
                                        if (!var11.field3305) {
                                            var68.method376(0, var11.field3306, 0, var11.field3272, 0, var76, var77);
                                        } else if (var11.field3269) {
                                            var68.method386(0, var11.field3306, var11.field3381, var11.field3272, var11.field3323, var69 + var76 + var11.field3405, var11.field3405 + var77, var11.field3290);
                                        } else {
                                            var68.method376(0, var11.field3306, var11.field3381, var11.field3272, var11.field3323, var69 + var11.field3405 + var76, var11.field3405 + var77);
                                        }
                                        class44.method284();
                                    }
                                } else {
                                    if (var11.field3392 == 7) {
                                        class80 var78 = var11.method1160(1, class22.field363);
                                        if (var78 == null) {
                                            if (class180.field3537) {
                                                class38.method252(var11, -94);
                                            }
                                            continue;
                                        }
                                        int var79 = 0;
                                        for (int var80 = 0; var80 < var11.field3284; var80++) {
                                            for (int var81 = 0; var81 < var11.field3299; var81++) {
                                                if (var11.field3385[var79] > 0) {
                                                    class50 var82 = class96.method645((byte) -61, var11.field3385[var79] - 1);
                                                    class141 var83;
                                                    if (var82.field945 != 1 && var11.field3319[var79] == 1) {
                                                        var83 = class220.method1422(new class141[] { class114.field2185, var82.field937, class185.field3602 }, arg8 ^ 0xFFFFFFED);
                                                    } else {
                                                        var83 = class220.method1422(new class141[] { class114.field2185, var82.field937, class93.field1856, class219.method1416(104, var11.field3319[var79]) }, -3);
                                                    }
                                                    int var84 = var13 + (var11.field3321 + 12) * var80;
                                                    int var85 = (var11.field3340 + 115) * var81 + var14;
                                                    if (var11.field3297 == 0) {
                                                        var78.method866(var83, var85, var84, var11.field3301, var11.field3262 ? 0 : -1);
                                                    } else if (var11.field3297 == 1) {
                                                        var78.method873(var83, var11.field3299 / 2 + var85, var84, var11.field3301, var11.field3262 ? 0 : -1);
                                                    } else {
                                                        var78.method879(var83, var11.field3299 + var85 - 1, var84, var11.field3301, var11.field3262 ? 0 : -1);
                                                    }
                                                }
                                                var79++;
                                            }
                                        }
                                    }
                                    if (var11.field3392 == 8 && class16.field293 == var11 && class86.field1716 == class219.field4151) {
                                        int var86 = 0;
                                        int var87 = 0;
                                        class80 var88 = class125.field2409;
                                        class141 var89 = var11.field3325;
                                        class141 var90 = class30.method207(-69, var89, var11);
                                        while (var90.method908(false) > 0) {
                                            int var98 = var90.method910(class70.field1405, (byte) 121);
                                            class141 var99;
                                            if (var98 == -1) {
                                                var99 = var90;
                                                var90 = class111.field2128;
                                            } else {
                                                var99 = var90.method902(var98, 0, (byte) 105);
                                                var90 = var90.method907((byte) 103, var98 + 4);
                                            }
                                            int var100 = var88.method869(var99);
                                            var87 += var88.field2618 + 1;
                                            if (var100 > var86) {
                                                var86 = var100;
                                            }
                                        }
                                        var86 += 6;
                                        var87 += 7;
                                        int var91 = var11.field3284 + var13 + 5;
                                        int var92 = var14 + var11.field3299 - var86 - 5;
                                        if (var14 + 5 > var92) {
                                            var92 = var14 + 5;
                                        }
                                        if (arg1 < var87 + var91) {
                                            var91 = arg1 - var87;
                                        }
                                        if (var86 + var92 > arg0) {
                                            var92 = arg0 - var86;
                                        }
                                        class148.method1030(var92, var91, var86, var87, 16777120);
                                        class148.method1021(var92, var91, var86, var87, 0);
                                        int var93 = var88.field2618 + var91 + 2;
                                        class141 var94 = var11.field3325;
                                        class141 var95 = class30.method207(arg8 - 105, var94, var11);
                                        while (var95.method908(false) > 0) {
                                            int var96 = var95.method910(class70.field1405, (byte) 123);
                                            class141 var97;
                                            if (var96 == -1) {
                                                var97 = var95;
                                                var95 = class111.field2128;
                                            } else {
                                                var97 = var95.method902(var96, 0, (byte) 19);
                                                var95 = var95.method907((byte) -111, var96 + 4);
                                            }
                                            var88.method866(var97, var92 + 3, var93, 0, -1);
                                            var93 += var88.field2618 + 1;
                                        }
                                    }
                                    if (var11.field3392 == 9) {
                                        if (var11.field3336 == 1) {
                                            class148.method1027(var14, var13, var11.field3299 + var14, var11.field3284 + var13, var11.field3301);
                                        } else {
                                            int var101 = var11.field3299 < 0 ? -var11.field3299 : var11.field3299;
                                            int var102 = var101;
                                            int var103 = var11.field3284 >= 0 ? var11.field3284 : -var11.field3284;
                                            if (var101 < var103) {
                                                var102 = var103;
                                            }
                                            if (var102 != 0) {
                                                int var104 = (var11.field3299 << 16) / var102;
                                                int var105 = (var11.field3284 << 16) / var102;
                                                if (var104 < var105) {
                                                    var105 = -var105;
                                                } else {
                                                    var104 = -var104;
                                                }
                                                int var106 = var11.field3336 * var104 >> 17;
                                                int var107 = var14 - arg2;
                                                int var108 = var11.field3336 * var105 + 1 >> 17;
                                                int var109 = var11.field3336 * var105 >> 17;
                                                int var110 = var13 - arg9;
                                                int var111 = var11.field3336 * var104 + 1 >> 17;
                                                int var112 = var107 + var109;
                                                int var113 = var11.field3299 + var107 - var108;
                                                int var114 = var106 + var110;
                                                int var115 = var110 + var11.field3284 - var111;
                                                int var116 = var107 + var11.field3299 + var109;
                                                int var117 = var110 - var111;
                                                int var118 = var11.field3284 + var110 + var106;
                                                int var119 = var107 - var108;
                                                class44.method297(var112, var119, var113);
                                                class44.method280(var114, var117, var115, var112, var119, var113, var11.field3301);
                                                class44.method297(var112, var113, var116);
                                                class44.method280(var114, var115, var118, var112, var113, var116, var11.field3301);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method615(int arg0) {
        if (arg0 != -1) {
            field1799 = -33;
        }
        field1783++;
        return this.field1802.method422((byte) 99);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V")
    public static final void method616(byte arg0) {
        int var1 = 59 / ((arg0 + 13) / 53);
        class7.field108.method1385(9946);
        field1798++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public static final void method617(int arg0, int arg1, int arg2) {
        class153 var3 = class131.field2506[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field2923 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JI)V")
    public static final void method618(long arg0, int arg1) {
        field1809++;
        if (arg1 != 113) {
            method618(-40L, -58);
        }
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class88.field1750; var3++) {
            if (class131.field2499[var3] == arg0) {
                class88.field1750--;
                for (int var4 = var3; var4 < class88.field1750; var4++) {
                    class188.field3640[var4] = class188.field3640[var4 + 1];
                    class103.field1993[var4] = class103.field1993[var4 + 1];
                    class25.field478[var4] = class25.field478[var4 + 1];
                    class131.field2499[var4] = class131.field2499[var4 + 1];
                    class203.field3897[var4] = class203.field3897[var4 + 1];
                }
                class92.field1851++;
                class1.field11 = class174.field3461;
                class7.field120.method32(138, 12885);
                class7.field120.method978(arg1 - 227, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BJ)V")
    public final void method619(byte arg0, long arg1) throws IOException {
        if (arg0 != 14) {
            method608(null, -20);
        }
        field1805++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method615(arg0 ^ 0xFFFFFFF1));
        }
        this.field1811 = arg1;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)J")
    public final long method620(int arg0) {
        if (arg0 < 110) {
            return -36L;
        } else {
            field1791++;
            return this.field1810;
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
    public static final void method621(byte arg0) {
        field1792++;
        class114.field2180 = false;
        class45.field869 = 0;
        class7.field120.field2865 = 0;
        class187.field3632 = 0;
        class173.field3442 = -1;
        class106.field2029 = 0;
        class156.field3014.field2865 = 0;
        class224.field4233 = 0;
        class184.field3590 = 0;
        class57.field1105 = -1;
        class196.field3758 = -1;
        class188.field3637 = 0;
        class66.field1286 = -1;
        if (arg0 != 0) {
            field1803 = null;
        }
        for (int var1 = 0; var1 < class116.field2231.length; var1++) {
            if (class116.field2231[var1] != null) {
                class116.field2231[var1].field3877 = -1;
            }
        }
        for (int var2 = 0; var2 < class10.field172.length; var2++) {
            if (class10.field172[var2] != null) {
                class10.field172[var2].field3877 = -1;
            }
        }
        class187.method1249(32);
        class156.method1086(30, (byte) -120);
        for (int var3 = 0; var3 < 100; var3++) {
            class141.field2737[var3] = true;
        }
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(B)V")
    private final void method622(byte arg0) throws IOException {
        field1800++;
        int var2 = -102 / ((29 - arg0) / 60);
        this.field1786 = 0;
        if (this.field1811 != this.field1784) {
            this.field1802.method423((byte) 120, this.field1811);
            this.field1784 = this.field1811;
        }
        this.field1789 = this.field1811;
        while (this.field1786 < this.field1779.length) {
            int var3 = this.field1779.length - this.field1786;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field1802.method427(this.field1779, this.field1786, var3, 0);
            if (var4 == -1) {
                break;
            }
            this.field1786 += var4;
            this.field1784 += var4;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lgd;II)V")
    public class90(class64 arg0, int arg1, int arg2) throws IOException {
        this.field1802 = arg0;
        this.field1810 = this.field1808 = arg0.method425(0);
        this.field1811 = 0L;
        this.field1779 = new byte[arg1];
        this.field1794 = new byte[arg2];
    }
}
