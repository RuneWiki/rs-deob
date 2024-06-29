import java.awt.Image;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class197 {

    @OriginalMember(owner = "client!v", name = "v", descriptor = "J")
    private long field3930 = -1L;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    private int field3927 = 0;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "J")
    private long field3914 = -1L;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "Lqa;")
    private class153 field3933;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "J")
    private long field3911;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "J")
    private long field3912;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "[B")
    private byte[] field3921;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "J")
    private long field3920;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "[B")
    private byte[] field3923;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field3934 = 0;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Ldd;")
    public static class35 field3909 = class180.method1196((byte) 126, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field3931 = 0;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "Ldd;")
    public static class35 field3932 = class180.method1196((byte) -14, "null");

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    private int field3913;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "J")
    private long field3935;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Ljava/awt/Image;")
    public static Image field3916;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)Ljava/io/File;")
    private final File method1285(byte arg0) {
        int var2 = 0 % ((arg0 - 42) / 49);
        field3928++;
        return this.field3933.method1031((byte) -77);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBII)I")
    public static final int method1286(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg3 / arg0;
        field3910++;
        int var5 = arg0 - 1 & arg3;
        int var6 = arg2 / arg0;
        int var7 = arg0 - 1 & arg2;
        int var8 = class114.method827(var6, var4, -1);
        int var9 = class114.method827(var6, var4 + 1, -1);
        int var10 = class114.method827(var6 + 1, var4, -1);
        if (arg1 < 90) {
            return -110;
        } else {
            int var11 = class114.method827(var6 + 1, var4 + 1, -1);
            int var12 = class9.method68(var5, (byte) -72, var9, var8, arg0);
            int var13 = class9.method68(var5, (byte) -72, var11, var10, arg0);
            return class9.method68(var7, (byte) -72, var13, var12, arg0);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    private final void method1287(int arg0) throws IOException {
        field3919++;
        if (this.field3930 != -1L) {
            if (this.field3935 != this.field3930) {
                this.field3933.method1029(21598, this.field3930);
                this.field3935 = this.field3930;
            }
            this.field3933.method1030(-52, this.field3923, this.field3927, 0);
            this.field3935 += this.field3927;
            if (this.field3935 > this.field3911) {
                this.field3911 = this.field3935;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field3930 >= this.field3914 && (long) this.field3913 + this.field3914 > this.field3930) {
                var4 = this.field3930;
            } else if (this.field3930 <= this.field3914 && (long) this.field3927 + this.field3930 > this.field3914) {
                var4 = this.field3914;
            }
            if (this.field3914 < (long) this.field3927 + this.field3930 && this.field3930 + (long) this.field3927 <= (long) this.field3913 + this.field3914) {
                var2 = (long) this.field3927 + this.field3930;
            } else if (this.field3930 < (long) this.field3913 + this.field3914 && (long) this.field3927 + this.field3930 >= (long) this.field3913 + this.field3914) {
                var2 = this.field3914 + (long) this.field3913;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class156.method1048(this.field3923, (int) (var4 - this.field3930), this.field3921, (int) (var4 - this.field3914), var6);
            }
            this.field3930 = -1L;
            this.field3927 = 0;
        }
        if (arg0 > -94) {
            this.method1285((byte) 52);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    private final void method1288(int arg0) throws IOException {
        this.field3913 = arg0;
        field3936++;
        if (this.field3935 != this.field3920) {
            this.field3933.method1029(21598, this.field3920);
            this.field3935 = this.field3920;
        }
        this.field3914 = this.field3920;
        while (this.field3921.length > this.field3913) {
            int var2 = this.field3933.method1032(this.field3921.length - this.field3913, (byte) 100, this.field3921, this.field3913);
            if (var2 == -1) {
                break;
            }
            this.field3935 += var2;
            this.field3913 += var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public static void method1289(int arg0) {
        field3909 = null;
        field3916 = null;
        field3932 = null;
        if (arg0 != 0) {
            field3909 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI[BI[Ld;)V")
    public static final void method1290(byte arg0, int arg1, byte[] arg2, int arg3, class31[] arg4) {
        field3918++;
        if (arg0 != -4) {
            return;
        }
        class26 var5 = new class26(arg2);
        int var6 = -1;
        while (true) {
            int var7 = var5.method245((byte) 99);
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method259((byte) -81);
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method221(-116);
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg3 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    class31 var18 = null;
                    int var19 = var12;
                    if ((class40.field894[1][var16][var17] & 0x2) == 2) {
                        var19 = var12 - 1;
                    }
                    if (var19 >= 0) {
                        var18 = arg4[var19];
                    }
                    class98.method744(arg0 ^ 0xFFFFFF97, var14, var15, var18, var16, var6, var17, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z[B)V")
    public final void method1291(boolean arg0, byte[] arg1) throws IOException {
        this.method1296(arg1.length, 0, arg1, 0);
        if (arg0) {
            method1298((byte) 36);
        }
        field3915++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III[B)V")
    public final void method1292(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3917++;
        try {
            if ((long) arg2 + this.field3920 > this.field3912) {
                this.field3912 = (long) arg2 + this.field3920;
            }
            if (arg1 == -1721) {
                if (this.field3930 != -1L && (this.field3930 > this.field3920 || (long) this.field3927 + this.field3930 < this.field3920)) {
                    this.method1287(-115);
                }
                if (this.field3930 != -1L && (long) this.field3923.length + this.field3930 < this.field3920 - -((long) arg2)) {
                    int var5 = (int) ((long) this.field3923.length + this.field3930 - this.field3920);
                    arg2 -= var5;
                    class156.method1048(arg3, arg0, this.field3923, (int) (this.field3920 - this.field3930), var5);
                    this.field3920 += var5;
                    arg0 += var5;
                    this.field3927 = this.field3923.length;
                    this.method1287(-127);
                }
                if (this.field3923.length < arg2) {
                    if (this.field3935 != this.field3920) {
                        this.field3933.method1029(21598, this.field3920);
                        this.field3935 = this.field3920;
                    }
                    this.field3933.method1030(-85, arg3, arg2, arg0);
                    long var6 = -1L;
                    if (this.field3914 <= this.field3920 && this.field3914 + (long) this.field3913 > this.field3920) {
                        var6 = this.field3920;
                    } else if (this.field3920 <= this.field3914 && this.field3920 + (long) arg2 > this.field3914) {
                        var6 = this.field3914;
                    }
                    this.field3935 += arg2;
                    if (this.field3911 < this.field3935) {
                        this.field3911 = this.field3935;
                    }
                    long var8 = -1L;
                    if (this.field3920 + (long) arg2 > this.field3914 && (long) this.field3913 + this.field3914 >= (long) arg2 + this.field3920) {
                        var8 = (long) arg2 + this.field3920;
                    } else if ((long) this.field3913 + this.field3914 > this.field3920 && (long) arg2 + this.field3920 >= this.field3914 - -((long) this.field3913)) {
                        var8 = (long) this.field3913 + this.field3914;
                    }
                    if (var6 > -1L && var8 > var6) {
                        int var10 = (int) (var8 - var6);
                        class156.method1048(arg3, (int) ((long) arg0 + var6 - this.field3920), this.field3921, (int) (var6 - this.field3914), var10);
                    }
                    this.field3920 += arg2;
                } else if (arg2 > 0) {
                    if (this.field3930 == -1L) {
                        this.field3930 = this.field3920;
                    }
                    class156.method1048(arg3, arg0, this.field3923, (int) (this.field3920 - this.field3930), arg2);
                    this.field3920 += arg2;
                    if (this.field3920 - this.field3930 > (long) this.field3927) {
                        this.field3927 = (int) (this.field3920 - this.field3930);
                    }
                }
            }
        } catch (IOException var12) {
            this.field3935 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BJ)V")
    public final void method1293(byte arg0, long arg1) throws IOException {
        field3937++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1285((byte) -15));
        }
        this.field3920 = arg1;
        if (arg0 < 10) {
            this.field3912 = -92L;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)J")
    public final long method1294(boolean arg0) {
        if (arg0) {
            field3922++;
            return this.field3912;
        } else {
            return 124L;
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
    public final void method1295(int arg0) throws IOException {
        this.method1287(arg0 - 95);
        this.field3933.method1033(arg0 - 1);
        field3925++;
        if (arg0 != 0) {
            method1299(-38, -49, false, true, true);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II[BI)V")
    public final void method1296(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3924++;
        try {
            if (arg2.length < arg3 + arg0) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg2.length);
            }
            if (arg1 != 0) {
                this.method1294(false);
            }
            if (this.field3930 != -1L && this.field3920 >= this.field3930 && (long) arg0 + this.field3920 <= (long) this.field3927 + this.field3930) {
                class156.method1048(this.field3923, (int) (this.field3920 - this.field3930), arg2, arg3, arg0);
                this.field3920 += arg0;
                return;
            }
            long var5 = this.field3920;
            int var7 = arg3;
            int var8 = arg0;
            if (this.field3914 <= this.field3920 && this.field3920 < (long) this.field3913 + this.field3914) {
                int var9 = (int) (this.field3914 + (long) this.field3913 - this.field3920);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                arg0 -= var9;
                class156.method1048(this.field3921, (int) (this.field3920 - this.field3914), arg2, arg3, var9);
                this.field3920 += var9;
                arg3 += var9;
            }
            if (arg0 > this.field3921.length) {
                this.field3933.method1029(21598, this.field3920);
                this.field3935 = this.field3920;
                while (arg0 > 0) {
                    int var10 = this.field3933.method1032(arg0, (byte) 100, arg2, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 -= var10;
                    this.field3935 += var10;
                    this.field3920 += var10;
                    arg3 += var10;
                }
            } else if (arg0 > 0) {
                this.method1288(0);
                int var11 = arg0;
                if (this.field3913 < arg0) {
                    var11 = this.field3913;
                }
                arg0 -= var11;
                class156.method1048(this.field3921, 0, arg2, arg3, var11);
                this.field3920 += var11;
                arg3 += var11;
            }
            if (this.field3930 != -1L) {
                if (this.field3930 > this.field3920 && arg0 > 0) {
                    int var12 = arg3 + (int) (this.field3930 - this.field3920);
                    if (arg0 + arg3 < var12) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg3) {
                        arg0--;
                        arg2[arg3++] = 0;
                        this.field3920++;
                    }
                }
                long var13 = -1L;
                if (var5 < (long) this.field3927 + this.field3930 && (long) this.field3927 + this.field3930 <= (long) var8 + var5) {
                    var13 = (long) this.field3927 + this.field3930;
                } else if (this.field3930 < var5 + (long) var8 && (long) this.field3927 + this.field3930 >= var5 - -((long) var8)) {
                    var13 = (long) var8 + var5;
                }
                long var15 = -1L;
                if (this.field3930 >= var5 && (long) var8 + var5 > this.field3930) {
                    var15 = this.field3930;
                } else if (var5 >= this.field3930 && var5 < this.field3930 + (long) this.field3927) {
                    var15 = var5;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class156.method1048(this.field3923, (int) (var15 - this.field3930), arg2, (int) (var15 - var5) + var7, var17);
                    if (var13 > this.field3920) {
                        arg0 = (int) ((long) arg0 + this.field3920 - var13);
                        this.field3920 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3935 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIILlc;IJIIII)Z")
    public static final boolean method1297(int arg0, int arg1, int arg2, int arg3, class110 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class48.method431(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
    public static final void method1298(byte arg0) {
        field3929++;
        if (class99.field2181 == 0) {
            class103.method768(4, 104, 104, class206.field4109);
            for (int var1 = 0; var1 < 4; var1++) {
                class167.field3375[var1] = new class31(104, 104);
            }
            class174.field3556 = new class12(512, 512);
            class134.field2852 = class72.field1712;
            class99.field2181 = 20;
            class176.field3595 = 5;
        } else if (class99.field2181 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 143;
                int var5 = var4 * 3 + 600;
                int var6 = class11.field211[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class15.method122(var2, 500, 800, 512, 334, 25, 3500);
            class99.field2181 = 30;
            class134.field2852 = class130.field2793;
            class176.field3595 = 10;
        } else if (class99.field2181 == 30) {
            class165.field3332 = method1299(-89, 0, true, false, true);
            class69.field1653 = method1299(-95, 1, true, false, true);
            class80.field1864 = method1299(-91, 2, false, true, true);
            class107.field2387 = method1299(-63, 3, true, false, true);
            class57.field1420 = method1299(-83, 4, true, false, true);
            class48.field1055 = method1299(-126, 5, true, true, true);
            class162.field3293 = method1299(-123, 6, true, true, false);
            class80.field1861 = method1299(arg0 - 50, 7, true, false, true);
            class78.field1815 = method1299(-124, 8, true, false, true);
            class79.field1855 = method1299(arg0 - 28, 9, false, true, true);
            class191.field3848 = method1299(-94, 10, true, false, true);
            class102.field2255 = method1299(arg0 + 3, 11, true, false, true);
            class134.field2871 = method1299(-70, 12, true, false, true);
            class137.field2936 = method1299(-92, 13, false, true, true);
            class198.field3946 = method1299(-104, 14, true, false, false);
            class44.field964 = method1299(-96, 15, true, false, true);
            class134.field2852 = class67.field1562;
            class176.field3595 = 20;
            class99.field2181 = 40;
        } else if (class99.field2181 == 40) {
            byte var7 = 0;
            int var8 = var7 + class165.field3332.method914(255) * 4 / 100;
            int var9 = var8 + class69.field1653.method914(arg0 + 330) * 4 / 100;
            int var10 = var9 + class80.field1864.method914(255) * 2 / 100;
            int var11 = var10 + class107.field2387.method914(255) * 2 / 100;
            int var12 = var11 + class57.field1420.method914(255) * 6 / 100;
            int var13 = var12 + class48.field1055.method914(255) * 4 / 100;
            int var14 = var13 + class162.field3293.method914(255) * 2 / 100;
            int var15 = var14 + class80.field1861.method914(255) * 60 / 100;
            int var16 = var15 + class78.field1815.method914(255) * 2 / 100;
            int var17 = var16 + class79.field1855.method914(255) * 2 / 100;
            int var18 = var17 + class191.field3848.method914(255) * 2 / 100;
            int var19 = var18 + class102.field2255.method914(255) * 2 / 100;
            int var20 = var19 + class134.field2871.method914(arg0 ^ 0xFFFFFF4A) * 2 / 100;
            int var21 = var20 + class137.field2936.method914(255) * 2 / 100;
            int var22 = var21 + class198.field3946.method914(255) * 2 / 100;
            int var23 = var22 + class44.field964.method914(255) * 2 / 100;
            if (var23 == 100) {
                class176.field3595 = 30;
                class134.field2852 = class67.field1564;
                class63.method524(class191.field3848, class162.field3293, (byte) -118, class78.field1815);
                class99.field2181 = 45;
            } else {
                if (var23 != 0) {
                    class134.field2852 = class63.method529(new class35[] { class89.field1997, class3.method19(var23, -29578), class101.field2225 }, (byte) 122);
                }
                class176.field3595 = 30;
            }
        } else if (class99.field2181 == 45) {
            class148.method1010(!class35.field781, 22050, 77, 2);
            class173 var24 = new class173();
            var24.method1122(128, 9, false);
            class24.field493 = class69.method564(class182.field3734, 0, 22050, 13307, class118.field2618);
            class24.field493.method1156(-98, var24);
            class127.method890(class57.field1420, class44.field964, var24, (byte) -76, class198.field3946);
            class26.field550 = class69.method564(class182.field3734, 1, 2048, 13307, class118.field2618);
            class88.field1958 = new class144();
            class26.field550.method1156(arg0 - 2, class88.field1958);
            class8.field164 = new class98(22050, class150.field3136);
            class99.field2181 = 50;
            class176.field3595 = 35;
            class134.field2852 = class39.field865;
        } else if (class99.field2181 == 50) {
            int var25 = 0;
            if (class15.field270 == null) {
                class15.field270 = class166.method1100(class137.field2936, class20.field387, class186.field3789, class78.field1815, arg0 ^ 0x7A8B);
            } else {
                var25++;
            }
            if (class68.field1600 == null) {
                class68.field1600 = class15.field270;
            } else {
                var25++;
            }
            if (class26.field574 == null) {
                class26.field574 = class166.method1100(class137.field2936, class20.field387, class137.field2934, class78.field1815, arg0 ^ 0x7A8B);
            } else {
                var25++;
            }
            if (class122.field2673 == null) {
                class122.field2673 = class166.method1100(class137.field2936, class20.field387, class136.field2918, class78.field1815, -31426);
            } else {
                var25++;
            }
            if (var25 < 4) {
                class134.field2852 = class63.method529(new class35[] { class93.field2059, class3.method19(var25 * 100 / 4, -29578), class101.field2225 }, (byte) 110);
                class176.field3595 = 40;
            } else {
                class134.field2852 = class9.field173;
                class99.field2181 = 60;
                class176.field3595 = 40;
            }
        } else if (class99.field2181 == 60) {
            int var26 = class92.method673(class191.field3848, class78.field1815, (byte) 65);
            int var27 = class125.method885((byte) -120);
            if (var27 > var26) {
                class134.field2852 = class63.method529(new class35[] { class183.field3758, class3.method19(var26 * 100 / var27, -29578), class101.field2225 }, (byte) 77);
                class176.field3595 = 50;
            } else {
                class176.field3595 = 50;
                class134.field2852 = class67.field1553;
                class59.method509(5, (byte) 118);
                class99.field2181 = 70;
            }
        } else if (class99.field2181 != 70) {
            if (arg0 != -75) {
                method1290((byte) 54, 42, null, -23, null);
            }
            if (class99.field2181 == 80) {
                int var28 = 0;
                if (class43.field940 == null) {
                    class43.field940 = class50.method447(class78.field1815, class20.field387, class7.field109, true);
                } else {
                    var28++;
                }
                if (class2.field34 == null) {
                    class2.field34 = class32.method305(class138.field2942, class78.field1815, (byte) 74, class20.field387);
                } else {
                    var28++;
                }
                if (class187.field3813 == null) {
                    class187.field3813 = class147.method1007(class116.field2589, class20.field387, -1, class78.field1815);
                } else {
                    var28++;
                }
                if (class38.field853 == null) {
                    class38.field853 = class147.method1007(class200.field4001, class20.field387, -1, class78.field1815);
                } else {
                    var28++;
                }
                if (class19.field381 == null) {
                    class19.field381 = class147.method1007(class134.field2851, class20.field387, -1, class78.field1815);
                } else {
                    var28++;
                }
                if (class178.field3664 == null) {
                    class178.field3664 = class147.method1007(class173.field3461, class20.field387, -1, class78.field1815);
                } else {
                    var28++;
                }
                if (class205.field4076 == null) {
                    class205.field4076 = class147.method1007(class43.field942, class20.field387, -1, class78.field1815);
                } else {
                    var28++;
                }
                if (class45.field982 == null) {
                    class45.field982 = class147.method1007(class188.field3820, class20.field387, -1, class78.field1815);
                } else {
                    var28++;
                }
                if (class100.field2211 == null) {
                    class100.field2211 = class147.method1007(class2.field26, class20.field387, -1, class78.field1815);
                } else {
                    var28++;
                }
                if (class97.field2154 == null) {
                    class97.field2154 = class50.method447(class78.field1815, class20.field387, class121.field2658, true);
                } else {
                    var28++;
                }
                if (class115.field2588 == null) {
                    class115.field2588 = class147.method1007(class201.field4018, class20.field387, -1, class78.field1815);
                } else {
                    var28++;
                }
                if (class43.field953 == null) {
                    class43.field953 = class147.method1007(class52.field1164, class20.field387, -1, class78.field1815);
                } else {
                    var28++;
                }
                if (class29.field589 == null) {
                    class29.field589 = class32.method305(class180.field3689, class78.field1815, (byte) 74, class20.field387);
                } else {
                    var28++;
                }
                if (class51.field1147 == null) {
                    class51.field1147 = class32.method305(class130.field2794, class78.field1815, (byte) 74, class20.field387);
                } else {
                    var28++;
                }
                if (class84.field1923 == null) {
                    class84.field1923 = class32.method305(class97.field2152, class78.field1815, (byte) 74, class20.field387);
                } else {
                    var28++;
                }
                if (var28 < 15) {
                    class134.field2852 = class63.method529(new class35[] { class17.field333, class3.method19(var28 * 100 / 13, arg0 - 29503), class101.field2225 }, (byte) 99);
                    class176.field3595 = 70;
                } else {
                    class15.field270.method1330(class51.field1147, null);
                    class26.field574.method1330(class51.field1147, null);
                    class122.field2673.method1330(class51.field1147, null);
                    if (class68.field1600 != class15.field270) {
                        class68.field1600.method1330(class51.field1147, null);
                    }
                    for (int var29 = 0; var29 < class100.field2211.length; var29++) {
                        class100.field2211[var29].method111();
                    }
                    for (int var30 = 0; var30 < class84.field1923.length; var30++) {
                        class84.field1923[var30].method164();
                    }
                    class43.field940.method111();
                    int var31 = (int) (Math.random() * 21.0D) - 10;
                    int var32 = (int) (Math.random() * 21.0D) - 10;
                    int var33 = (int) (Math.random() * 41.0D) - 20;
                    int var34 = (int) (Math.random() * 21.0D) - 10;
                    for (int var35 = 0; var35 < class187.field3813.length; var35++) {
                        class187.field3813[var35].method89(var31 + var33, var32 + var33, var33 + var34);
                    }
                    class2.field34[0].method165(var31 + var33, var32 + var33, var33 + var34);
                    class134.field2852 = class122.field2669;
                    class99.field2181 = 90;
                    class176.field3595 = 70;
                }
            } else if (class99.field2181 == 90) {
                if (class79.field1855.method38(-1390)) {
                    class115 var36 = new class115(class79.field1855, class78.field1815, 20, class35.field781 ? 64 : 128);
                    class11.method80(var36);
                    class11.method78(0.7F);
                    class134.field2852 = class135.field2898;
                    class176.field3595 = 90;
                    class99.field2181 = 110;
                } else {
                    class134.field2852 = class63.method529(new class35[] { class184.field3773, class3.method19(class79.field1855.method60(66), -29578), class101.field2225 }, (byte) 54);
                    class176.field3595 = 90;
                }
            } else if (class99.field2181 == 110) {
                class210.field4160 = new class68();
                class182.field3734.method387(class210.field4160, false, 10);
                class99.field2181 = 120;
                class176.field3595 = 94;
                class134.field2852 = class20.field403;
            } else if (class99.field2181 == 120) {
                if (class191.field3848.method50(class158.field3226, class20.field387, 0)) {
                    class63 var37 = new class63(class191.field3848.method58(1, class158.field3226, class20.field387));
                    class15.method121(var37, false);
                    class134.field2852 = class193.field3863;
                    class176.field3595 = 96;
                    class99.field2181 = 130;
                } else {
                    class134.field2852 = class63.method529(new class35[] { class3.field47, class52.field1172 }, (byte) 93);
                    class176.field3595 = 96;
                }
            } else if (class99.field2181 == 130) {
                if (!class107.field2387.method38(-1390)) {
                    class134.field2852 = class63.method529(new class35[] { class162.field3288, class3.method19(class107.field2387.method60(-94) * 4 / 5, -29578), class101.field2225 }, (byte) 103);
                    class176.field3595 = 100;
                } else if (!class134.field2871.method38(-1390)) {
                    class134.field2852 = class63.method529(new class35[] { class162.field3288, class3.method19(class134.field2871.method60(53) / 6 + 80, -29578), class101.field2225 }, (byte) 100);
                    class176.field3595 = 100;
                } else if (class137.field2936.method38(-1390)) {
                    class176.field3595 = 100;
                    class99.field2181 = 140;
                    class134.field2852 = class163.field3298;
                } else {
                    class134.field2852 = class63.method529(new class35[] { class162.field3288, class3.method19(class137.field2936.method60(arg0 ^ 0x31) / 20 + 96, -29578), class101.field2225 }, (byte) 85);
                    class176.field3595 = 100;
                }
            } else if (class99.field2181 == 140) {
                class48.field1055.method49(true, 30109, false);
                class162.field3293.method49(true, 30109, true);
                class78.field1815.method49(true, 30109, true);
                class137.field2936.method49(true, 30109, true);
                class191.field3848.method49(true, arg0 ^ 0xFFFF8A28, true);
                class59.method509(10, (byte) 111);
            }
        } else if (class80.field1864.method38(arg0 ^ 0x527)) {
            class46.method424((byte) -125, class80.field1864);
            class2.method15(class80.field1864, 6726);
            class124.method883(class80.field1861, 7252, class80.field1864);
            class97.method736(class80.field1864, -104, class35.field781, class80.field1861);
            class135.method929(class80.field1864, (byte) 89, class80.field1861);
            class88.method650((byte) 107, class80.field1861, class68.field1600, class22.field442, class80.field1864);
            class78.method594(class165.field3332, class69.field1653, class80.field1864, 1);
            class91.method669(class80.field1861, arg0 + 75, class80.field1864);
            class207.method1369(class80.field1864, arg0 - 2);
            class9.method69(arg0 ^ 0xFFFFFFA5, class80.field1864);
            class84.method629(8, class78.field1815, class137.field2936, class107.field2387, class80.field1861);
            class162.method1078(class80.field1864, 125);
            class99.method748(class80.field1864, -73);
            class176.field3595 = 60;
            class134.field2852 = class137.field2938;
            class17.method158(115);
            class99.field2181 = 80;
        } else {
            class134.field2852 = class63.method529(new class35[] { class78.field1816, class3.method19(class80.field1864.method60(-90), arg0 ^ 0x73C3), class101.field2225 }, (byte) 122);
            class176.field3595 = 60;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIZZZ)Lo;")
    private static final class134 method1299(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        if (arg0 > -51) {
            return null;
        }
        class72 var5 = null;
        if (class17.field344 != null) {
            var5 = new class72(arg1, class17.field344, class39.field858[arg1], 1000000);
        }
        field3926++;
        return new class134(var5, class184.field3776, arg1, arg3, arg2, arg4);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lqa;II)V")
    public class197(class153 arg0, int arg1, int arg2) throws IOException {
        this.field3933 = arg0;
        this.field3912 = this.field3911 = arg0.method1034((byte) -119);
        this.field3921 = new byte[arg1];
        this.field3920 = 0L;
        this.field3923 = new byte[arg2];
    }
}
