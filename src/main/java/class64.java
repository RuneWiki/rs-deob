import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class64 {

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "J")
    private long field891 = -1L;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    private int field905 = 0;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "J")
    private long field896 = -1L;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "Lme;")
    private class20 field894;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "J")
    private long field904;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "J")
    private long field881;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[B")
    private byte[] field880;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "[B")
    private byte[] field888;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "J")
    private long field906;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
    public static int[] field879 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[I")
    public static int[] field878 = new int[50];

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field897 = 2;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Lqe;")
    public static class168 field884 = class66.method448("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 106);

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Lqe;")
    public static class168 field893 = class66.method448("m", 29);

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "[S")
    public static short[] field903 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    private int field892;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "J")
    private long field909;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "Lrd;")
    public static class207 field907;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "Leg;")
    public static class5 field899;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Lwd;")
    public static class67 field895;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([BB)V")
    public final void method427(byte[] arg0, byte arg1) throws IOException {
        this.method439(0, (byte) -114, arg0, arg0.length);
        if (arg1 != 83) {
            method428(74, -87, 125);
        }
        field902++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Z")
    public static final boolean method428(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class169.field2928; var3++) {
            class77 var4 = class197.field3417[var3];
            if (var4.field1156 == 1) {
                int var5 = var4.field1157 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1148 * var5 >> 8) + var4.field1154;
                    int var7 = (var4.field1160 * var5 >> 8) + var4.field1145;
                    int var8 = (var4.field1161 * var5 >> 8) + var4.field1159;
                    int var9 = (var4.field1146 * var5 >> 8) + var4.field1169;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1156 == 2) {
                int var10 = arg0 - var4.field1157;
                if (var10 > 0) {
                    int var11 = (var4.field1148 * var10 >> 8) + var4.field1154;
                    int var12 = (var4.field1160 * var10 >> 8) + var4.field1145;
                    int var13 = (var4.field1161 * var10 >> 8) + var4.field1159;
                    int var14 = (var4.field1146 * var10 >> 8) + var4.field1169;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1156 == 3) {
                int var15 = var4.field1154 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1155 * var15 >> 8) + var4.field1157;
                    int var17 = (var4.field1151 * var15 >> 8) + var4.field1150;
                    int var18 = (var4.field1161 * var15 >> 8) + var4.field1159;
                    int var19 = (var4.field1146 * var15 >> 8) + var4.field1169;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1156 == 4) {
                int var20 = arg2 - var4.field1154;
                if (var20 > 0) {
                    int var21 = (var4.field1155 * var20 >> 8) + var4.field1157;
                    int var22 = (var4.field1151 * var20 >> 8) + var4.field1150;
                    int var23 = (var4.field1161 * var20 >> 8) + var4.field1159;
                    int var24 = (var4.field1146 * var20 >> 8) + var4.field1169;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1156 == 5) {
                int var25 = arg1 - var4.field1159;
                if (var25 > 0) {
                    int var26 = (var4.field1155 * var25 >> 8) + var4.field1157;
                    int var27 = (var4.field1151 * var25 >> 8) + var4.field1150;
                    int var28 = (var4.field1148 * var25 >> 8) + var4.field1154;
                    int var29 = (var4.field1160 * var25 >> 8) + var4.field1145;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method429(int arg0) {
        int var2 = -99 / ((-arg0 - 19) / 54);
        field885++;
        return this.field894.method108(0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public final void method430(byte arg0) throws IOException {
        int var2 = 107 % ((82 - arg0) / 36);
        this.method433(91);
        field890++;
        this.field894.method104(-114);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)J")
    public final long method431(int arg0) {
        if (arg0 != -11744) {
            method440(null, 74, (byte) 63);
        }
        field882++;
        return this.field881;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II[BZ)V")
    public final void method432(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field887++;
        try {
            if (this.field881 < this.field906 + (long) arg1) {
                this.field881 = (long) arg1 + this.field906;
            }
            if (this.field896 != -1L && (this.field896 > this.field906 || this.field906 > (long) this.field905 + this.field896)) {
                this.method433(110);
            }
            if (this.field896 != -1L && (long) this.field888.length + this.field896 < (long) arg1 + this.field906) {
                int var5 = (int) (this.field896 + (long) this.field888.length - this.field906);
                arg1 -= var5;
                class22.method114(arg2, arg0, this.field888, (int) (this.field906 - this.field896), var5);
                arg0 += var5;
                this.field906 += var5;
                this.field905 = this.field888.length;
                this.method433(119);
            }
            if (arg1 > this.field888.length) {
                if (this.field909 != this.field906) {
                    this.field894.method107(this.field906, true);
                    this.field909 = this.field906;
                }
                long var6 = -1L;
                long var8 = -1L;
                this.field894.method103((byte) 1, arg0, arg1, arg2);
                if (this.field906 + (long) arg1 > this.field891 && (long) this.field892 + this.field891 >= (long) arg1 + this.field906) {
                    var8 = (long) arg1 + this.field906;
                } else if ((long) this.field892 + this.field891 > this.field906 && (long) arg1 + this.field906 >= this.field891 - -((long) this.field892)) {
                    var8 = (long) this.field892 + this.field891;
                }
                if (this.field906 >= this.field891 && (long) this.field892 + this.field891 > this.field906) {
                    var6 = this.field906;
                } else if (this.field891 >= this.field906 && (long) arg1 + this.field906 > this.field891) {
                    var6 = this.field891;
                }
                this.field909 += arg1;
                if (this.field909 > this.field904) {
                    this.field904 = this.field909;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class22.method114(arg2, (int) ((long) arg0 + var6 - this.field906), this.field880, (int) (var6 - this.field891), var10);
                }
                this.field906 += arg1;
            } else if (arg1 > 0) {
                if (this.field896 == -1L) {
                    this.field896 = this.field906;
                }
                class22.method114(arg2, arg0, this.field888, (int) (this.field906 - this.field896), arg1);
                this.field906 += arg1;
                if ((long) this.field905 < this.field906 - this.field896) {
                    this.field905 = (int) (this.field906 - this.field896);
                }
            } else if (!arg3) {
                this.field909 = 120L;
            }
        } catch (IOException var12) {
            this.field909 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
    private final void method433(int arg0) throws IOException {
        field886++;
        if (this.field896 != -1L) {
            if (this.field909 != this.field896) {
                this.field894.method107(this.field896, true);
                this.field909 = this.field896;
            }
            this.field894.method103((byte) 1, 0, this.field905, this.field888);
            long var2 = -1L;
            this.field909 += this.field905;
            long var4 = -1L;
            if (this.field891 < (long) this.field905 + this.field896 && (long) this.field892 + this.field891 >= (long) this.field905 + this.field896) {
                var2 = this.field896 + (long) this.field905;
            } else if (this.field896 < (long) this.field892 + this.field891 && (long) this.field892 + this.field891 <= this.field896 - -((long) this.field905)) {
                var2 = (long) this.field892 + this.field891;
            }
            if (this.field909 > this.field904) {
                this.field904 = this.field909;
            }
            if (this.field891 <= this.field896 && (long) this.field892 + this.field891 > this.field896) {
                var4 = this.field896;
            } else if (this.field891 >= this.field896 && this.field891 < (long) this.field905 + this.field896) {
                var4 = this.field891;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class22.method114(this.field888, (int) (var4 - this.field896), this.field880, (int) (var4 - this.field891), var6);
            }
            this.field905 = 0;
            this.field896 = -1L;
        }
        if (arg0 < 85) {
            method428(85, 9, -12);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public static final void method434(byte arg0) {
        if (arg0 >= -25) {
            field897 = 61;
        }
        field889++;
        for (int var1 = -1; var1 < class132.field2322; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class115.field1868[var1];
            }
            class121 var3 = class104.field1677[var2];
            if (var3 != null) {
                class257.method1716(var3.field171, var3, (byte) 71);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
    private final void method435(int arg0) throws IOException {
        field908++;
        if (arg0 >= -86) {
            field893 = null;
        }
        this.field892 = 0;
        if (this.field909 != this.field906) {
            this.field894.method107(this.field906, true);
            this.field909 = this.field906;
        }
        this.field891 = this.field906;
        while (this.field880.length > this.field892) {
            int var2 = this.field880.length - this.field892;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field894.method105(this.field880, 0, var2, this.field892);
            if (var3 == -1) {
                break;
            }
            this.field892 += var3;
            this.field909 += var3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
    public static void method436(int arg0) {
        field895 = null;
        field899 = null;
        if (arg0 != -29598) {
            field884 = null;
        }
        field907 = null;
        field903 = null;
        field893 = null;
        field884 = null;
        field879 = null;
        field878 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IJ)V")
    public final void method437(int arg0, long arg1) throws IOException {
        field901++;
        if (arg0 != -16099) {
            field879 = null;
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method429(-82));
        }
        this.field906 = arg1;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILmj;IB)V")
    public static final void method438(int arg0, class129 arg1, int arg2, byte arg3) {
        if (arg3 >= -73) {
            return;
        }
        if (arg1.field2278 == 0) {
            arg1.field2139 = arg1.field2254;
        } else if (arg1.field2278 == 1) {
            arg1.field2139 = (arg0 - arg1.field2175) / 2 + arg1.field2254;
        } else if (arg1.field2278 == 2) {
            arg1.field2139 = arg0 - arg1.field2254 - arg1.field2175;
        } else if (arg1.field2278 == 3) {
            arg1.field2139 = arg1.field2254 * arg0 >> 14;
        } else if (arg1.field2278 == 4) {
            arg1.field2139 = (arg1.field2254 * arg0 >> 14) + (arg0 - arg1.field2175) / 2;
        } else {
            arg1.field2139 = arg0 - (arg1.field2254 * arg0 >> 14) - arg1.field2175;
        }
        if (arg1.field2167 == 0) {
            arg1.field2231 = arg1.field2200;
        } else if (arg1.field2167 == 1) {
            arg1.field2231 = (arg2 - arg1.field2210) / 2 + arg1.field2200;
        } else if (arg1.field2167 == 2) {
            arg1.field2231 = arg2 - arg1.field2210 - arg1.field2200;
        } else if (arg1.field2167 == 3) {
            arg1.field2231 = arg1.field2200 * arg2 >> 14;
        } else if (arg1.field2167 == 4) {
            arg1.field2231 = (arg1.field2200 * arg2 >> 14) + (arg2 - arg1.field2210) / 2;
        } else {
            arg1.field2231 = arg2 - arg1.field2210 - (arg1.field2200 * arg2 >> 14);
        }
        field900++;
        if (!class125.field2051) {
            return;
        }
        if (client.method266(arg1) == 0 && arg1.field2230 != 0) {
            return;
        }
        if (arg1.field2231 < 0) {
            arg1.field2231 = 0;
        } else if (arg1.field2231 + arg1.field2210 > arg2) {
            arg1.field2231 = arg2 - arg1.field2210;
        }
        if (arg1.field2139 < 0) {
            arg1.field2139 = 0;
            return;
        }
        if (arg0 < arg1.field2175 + arg1.field2139) {
            arg1.field2139 = arg0 - arg1.field2175;
            return;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB[BI)V")
    public final void method439(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field898++;
        try {
            if (arg2.length < arg0 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg0 - arg2.length);
            }
            int var5 = -7 / ((arg1 + 45) / 57);
            if (this.field896 != -1L && this.field906 >= this.field896 && (long) this.field905 + this.field896 >= (long) arg3 + this.field906) {
                class22.method114(this.field888, (int) (this.field906 - this.field896), arg2, arg0, arg3);
                this.field906 += arg3;
                return;
            }
            int var6 = arg3;
            long var7 = this.field906;
            int var9 = arg0;
            if (this.field906 >= this.field891 && (long) this.field892 + this.field891 > this.field906) {
                int var10 = (int) (this.field891 + (long) this.field892 - this.field906);
                if (arg3 < var10) {
                    var10 = arg3;
                }
                arg3 -= var10;
                class22.method114(this.field880, (int) (this.field906 - this.field891), arg2, arg0, var10);
                this.field906 += var10;
                arg0 += var10;
            }
            if (this.field880.length < arg3) {
                this.field894.method107(this.field906, true);
                this.field909 = this.field906;
                while (arg3 > 0) {
                    int var11 = this.field894.method105(arg2, 0, arg3, arg0);
                    if (var11 == -1) {
                        break;
                    }
                    arg0 += var11;
                    this.field906 += var11;
                    arg3 -= var11;
                    this.field909 += var11;
                }
            } else if (arg3 > 0) {
                this.method435(-90);
                int var12 = arg3;
                if (this.field892 < arg3) {
                    var12 = this.field892;
                }
                class22.method114(this.field880, 0, arg2, arg0, var12);
                arg3 -= var12;
                this.field906 += var12;
                arg0 += var12;
            }
            if (this.field896 != -1L) {
                if (this.field896 > this.field906 && arg3 > 0) {
                    int var13 = arg0 + (int) (this.field896 - this.field906);
                    if (var13 > arg0 + arg3) {
                        var13 = arg0 + arg3;
                    }
                    while (var13 > arg0) {
                        arg3--;
                        arg2[arg0++] = 0;
                        this.field906++;
                    }
                }
                long var14 = -1L;
                long var16 = -1L;
                if (this.field896 >= var7 && this.field896 < (long) var6 + var7) {
                    var16 = this.field896;
                } else if (this.field896 <= var7 && (long) this.field905 + this.field896 > var7) {
                    var16 = var7;
                }
                if ((long) this.field905 + this.field896 > var7 && (long) var6 + var7 >= (long) this.field905 + this.field896) {
                    var14 = (long) this.field905 + this.field896;
                } else if (this.field896 < var7 + (long) var6 && this.field896 + (long) this.field905 >= (long) var6 + var7) {
                    var14 = var7 + (long) var6;
                }
                if (var16 > -1L && var16 < var14) {
                    int var18 = (int) (var14 - var16);
                    class22.method114(this.field888, (int) (var16 - this.field896), arg2, (int) (var16 - var7) + var9, var18);
                    if (var14 > this.field906) {
                        arg3 = (int) ((long) arg3 + this.field906 - var14);
                        this.field906 = var14;
                    }
                }
            }
        } catch (IOException var20) {
            this.field909 = -1L;
            throw var20;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lmj;IB)I")
    public static final int method440(class129 arg0, int arg1, byte arg2) {
        field883++;
        if (arg0.field2248 == null || arg1 >= arg0.field2248.length) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg0.field2248[arg1];
            byte var5 = 0;
            int var6 = 0;
            if (arg2 != 90) {
                method438(22, null, -118, (byte) -115);
            }
            while (true) {
                int var7 = 0;
                int var8 = var4[var3++];
                byte var9 = 0;
                if (var8 == 0) {
                    return var6;
                }
                if (var8 == 1) {
                    var7 = class173.field3011[var4[var3++]];
                }
                if (var8 == 2) {
                    var7 = class177.field3119[var4[var3++]];
                }
                if (var8 == 3) {
                    var7 = class179.field3154[var4[var3++]];
                }
                if (var8 == 4) {
                    int var10 = var4[var3++] << 16;
                    int var11 = var10 + var4[var3++];
                    class129 var12 = class257.method1713(var11, 126);
                    int var13 = var4[var3++];
                    if (var13 != -1 && (!class151.method1005(520, var13).field4204 || class59.field811)) {
                        for (int var14 = 0; var14 < var12.field2156.length; var14++) {
                            if (var13 + 1 == var12.field2156[var14]) {
                                var7 += var12.field2221[var14];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var7 = class92.field1441[var4[var3++]];
                }
                if (var8 == 6) {
                    var7 = class243.field4216[class177.field3119[var4[var3++]] - 1];
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 7) {
                    var7 = class92.field1441[var4[var3++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var7 = class7.field85.field1993;
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class106.field1699[var15]) {
                            var7 += class177.field3119[var15];
                        }
                    }
                }
                if (var8 == 10) {
                    int var16 = var4[var3++] << 16;
                    int var17 = var16 + var4[var3++];
                    class129 var18 = class257.method1713(var17, 126);
                    int var19 = var4[var3++];
                    if (var19 != -1 && (!class151.method1005(520, var19).field4204 || class59.field811)) {
                        for (int var20 = 0; var20 < var18.field2156.length; var20++) {
                            if (var19 + 1 == var18.field2156[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var7 = class2.field21;
                }
                if (var8 == 12) {
                    var7 = class165.field2809;
                }
                if (var8 == 13) {
                    int var21 = class92.field1441[var4[var3++]];
                    int var22 = var4[var3++];
                    var7 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var23 = var4[var3++];
                    var7 = class80.method531(107, var23);
                }
                if (var8 == 18) {
                    var7 = (class7.field85.field190 >> 7) + class246.field4261;
                }
                if (var8 == 19) {
                    var7 = (class7.field85.field166 >> 7) + class125.field2060;
                }
                if (var8 == 20) {
                    var7 = var4[var3++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var6 += var7;
                    }
                    if (var5 == 1) {
                        var6 -= var7;
                    }
                    if (var5 == 2 && var7 != 0) {
                        var6 /= var7;
                    }
                    if (var5 == 3) {
                        var6 *= var7;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lme;II)V")
    public class64(class20 arg0, int arg1, int arg2) throws IOException {
        this.field894 = arg0;
        this.field881 = this.field904 = arg0.method106(0);
        this.field880 = new byte[arg1];
        this.field888 = new byte[arg2];
        this.field906 = 0L;
    }
}
