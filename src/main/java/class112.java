import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class112 {

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "J")
    private long field1846 = -1L;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "J")
    private long field1871 = -1L;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    private int field1864 = 0;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "Ldc;")
    private class237 field1852;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "J")
    private long field1853;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "J")
    private long field1858;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "J")
    private long field1863;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "[B")
    private byte[] field1867;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "[B")
    private byte[] field1850;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "[[S")
    public static short[][] field1848 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field1847 = 0;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "[[S")
    public static short[][] field1869 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    private int field1861;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "J")
    private long field1862;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method814(String arg0, byte arg1) {
        field1865++;
        if (arg1 != -113) {
            field1856 = -47;
        }
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class185.field2910; var2++) {
            if (arg0.equalsIgnoreCase(class214.field3497[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(JB)V")
    public final void method815(long arg0, byte arg1) throws IOException {
        field1859++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method827(0));
        }
        this.field1863 = arg0;
        if (arg1 != -2) {
            method818(-68, (char) 65493, (byte) 35, (StringBuffer) null);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)J")
    public final long method816(int arg0) {
        if (arg0 < 43) {
            method817((byte) -96);
        }
        field1866++;
        return this.field1858;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public static void method817(byte arg0) {
        field1869 = null;
        int var1 = -50 % ((arg0 + 28) / 61);
        field1848 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ICBLjava/lang/StringBuffer;)Ljava/lang/StringBuffer;")
    public static final StringBuffer method818(int arg0, char arg1, byte arg2, StringBuffer arg3) {
        int var4 = arg3.length();
        arg3.setLength(arg0);
        int var5 = var4;
        int var6 = -55 % ((43 - arg2) / 48);
        while (arg0 > var5) {
            arg3.setCharAt(var5, arg1);
            var5++;
        }
        field1849++;
        return arg3;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 + arg2;
        field1872++;
        int var8 = arg0 - arg1;
        int var9 = arg1 + arg4;
        int var10 = arg5 - arg1;
        if (arg3 != 0) {
            method817((byte) -96);
        }
        for (int var11 = arg2; var11 < var7; var11++) {
            class56.method420(class29.field452[var11], arg6, -7, arg4, arg5);
        }
        for (int var12 = arg0; var12 > var8; var12--) {
            class56.method420(class29.field452[var12], arg6, -7, arg4, arg5);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class29.field452[var13];
            class56.method420(var14, arg6, -7, arg4, var9);
            class56.method420(var14, arg6, -7, var10, arg5);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
    private final void method820(boolean arg0) throws IOException {
        if (arg0) {
            return;
        }
        this.field1861 = 0;
        if (this.field1863 != this.field1862) {
            this.field1852.method1648(-1, this.field1863);
            this.field1862 = this.field1863;
        }
        field1860++;
        this.field1871 = this.field1863;
        while (this.field1867.length > this.field1861) {
            int var2 = this.field1867.length - this.field1861;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1852.method1645(this.field1861, 0, var2, this.field1867);
            if (var3 == -1) {
                break;
            }
            this.field1862 += (long) var3;
            this.field1861 += var3;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([BI)V")
    public final void method821(byte[] arg0, int arg1) throws IOException {
        field1854++;
        this.method822(arg0, (byte) -80, arg0.length, arg1);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([BBII)V")
    public final void method822(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field1868++;
        try {
            if (arg0.length < arg2 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (this.field1846 != -1L && this.field1846 <= this.field1863 && (this.field1863 + ((long) arg2)) <= ((long) this.field1864 + this.field1846)) {
                class140.method973(this.field1850, (int) (this.field1863 - this.field1846), arg0, arg3, arg2);
                this.field1863 += (long) arg2;
                return;
            }
            long var5 = this.field1863;
            if (arg1 != -80) {
                return;
            }
            int var7 = arg2;
            int var8 = arg3;
            if (this.field1863 >= this.field1871 && ((long) this.field1861 + this.field1871) > this.field1863) {
                int var9 = (int) (this.field1871 + (long) this.field1861 - this.field1863);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                arg2 -= var9;
                class140.method973(this.field1867, (int) (this.field1863 - this.field1871), arg0, arg3, var9);
                this.field1863 += (long) var9;
                arg3 += var9;
            }
            if (this.field1867.length < arg2) {
                this.field1852.method1648(arg1 + 79, this.field1863);
                this.field1862 = this.field1863;
                while (arg2 > 0) {
                    int var11 = this.field1852.method1645(arg3, 0, arg2, arg0);
                    if (var11 == -1) {
                        break;
                    }
                    arg3 += var11;
                    arg2 -= var11;
                    this.field1862 += (long) var11;
                    this.field1863 += (long) var11;
                }
            } else if (arg2 > 0) {
                this.method820(false);
                int var10 = arg2;
                if (arg2 > this.field1861) {
                    var10 = this.field1861;
                }
                arg2 -= var10;
                class140.method973(this.field1867, 0, arg0, arg3, var10);
                this.field1863 += (long) var10;
                arg3 += var10;
            }
            if (this.field1846 != -1L) {
                if (this.field1863 < this.field1846 && arg2 > 0) {
                    int var12 = arg3 + ((int) (this.field1846 - this.field1863));
                    if (var12 > arg2 + arg3) {
                        var12 = arg2 + arg3;
                    }
                    while (arg3 < var12) {
                        arg0[arg3++] = 0;
                        this.field1863++;
                        arg2--;
                    }
                }
                long var13 = -1L;
                if (this.field1846 >= var5 && (long) var7 + var5 > this.field1846) {
                    var13 = this.field1846;
                } else if (this.field1846 <= var5 && (long) this.field1864 + this.field1846 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field1864 + this.field1846) > var5 && ((long) var7 + var5) >= (this.field1846 + ((long) this.field1864))) {
                    var15 = (long) this.field1864 + this.field1846;
                } else if (this.field1846 < (long) var7 + var5 && var5 + ((long) var7) <= (long) this.field1864 + this.field1846) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class140.method973(this.field1850, (int) (var13 - this.field1846), arg0, var8 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field1863) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field1863));
                        this.field1863 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1862 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
    public final void method823(byte arg0) throws IOException {
        if (arg0 < 97) {
            this.field1864 = -34;
        }
        field1857++;
        this.method825(-1);
        this.field1852.method1646(0);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([BIBI)V")
    public final void method824(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        int var5 = 47 / ((arg2 - 30) / 55);
        field1855++;
        try {
            if (((long) arg3 + this.field1863) > this.field1858) {
                this.field1858 = (long) arg3 + this.field1863;
            }
            if (this.field1846 != -1L && (this.field1846 > this.field1863 || this.field1863 > (this.field1846 + ((long) this.field1864)))) {
                this.method825(-1);
            }
            if (this.field1846 != -1L && ((long) this.field1850.length + this.field1846) < ((long) arg3 + this.field1863)) {
                int var6 = (int) ((long) this.field1850.length + this.field1846 - this.field1863);
                class140.method973(arg0, arg1, this.field1850, (int) (this.field1863 - this.field1846), var6);
                arg3 -= var6;
                arg1 += var6;
                this.field1863 += (long) var6;
                this.field1864 = this.field1850.length;
                this.method825(-1);
            }
            if (arg3 > this.field1850.length) {
                if (this.field1863 != this.field1862) {
                    this.field1852.method1648(-1, this.field1863);
                    this.field1862 = this.field1863;
                }
                this.field1852.method1647(arg3, -17135, arg1, arg0);
                this.field1862 += (long) arg3;
                if (this.field1862 > this.field1853) {
                    this.field1853 = this.field1862;
                }
                long var7 = -1L;
                if (this.field1871 <= this.field1863 && this.field1863 < (long) this.field1861 + this.field1871) {
                    var7 = this.field1863;
                } else if (this.field1863 <= this.field1871 && (long) arg3 + this.field1863 > this.field1871) {
                    var7 = this.field1871;
                }
                long var9 = -1L;
                if (this.field1871 < (long) arg3 + this.field1863 && (long) arg3 + this.field1863 <= this.field1871 - -((long) this.field1861)) {
                    var9 = (long) arg3 + this.field1863;
                } else if (this.field1863 < this.field1871 + ((long) this.field1861) && (long) this.field1861 + this.field1871 <= (long) arg3 + this.field1863) {
                    var9 = (long) this.field1861 + this.field1871;
                }
                if (var7 > -1L && var9 > var7) {
                    int var11 = (int) (var9 - var7);
                    class140.method973(arg0, (int) (var7 + (long) arg1 - this.field1863), this.field1867, (int) (var7 - this.field1871), var11);
                }
                this.field1863 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field1846 == -1L) {
                    this.field1846 = this.field1863;
                }
                class140.method973(arg0, arg1, this.field1850, (int) (this.field1863 - this.field1846), arg3);
                this.field1863 += (long) arg3;
                if (((long) this.field1864) < (this.field1863 - this.field1846)) {
                    this.field1864 = (int) (this.field1863 - this.field1846);
                }
            }
        } catch (IOException var13) {
            this.field1862 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
    private final void method825(int arg0) throws IOException {
        field1870++;
        if ((long) arg0 == this.field1846) {
            return;
        }
        if (this.field1862 != this.field1846) {
            this.field1852.method1648(-1, this.field1846);
            this.field1862 = this.field1846;
        }
        this.field1852.method1647(this.field1864, arg0 ^ 0x42EE, 0, this.field1850);
        long var2 = -1L;
        if (((long) this.field1864 + this.field1846) > this.field1871 && (long) this.field1861 + this.field1871 >= (long) this.field1864 + this.field1846) {
            var2 = (long) this.field1864 + this.field1846;
        } else if ((long) this.field1861 + this.field1871 > this.field1846 && ((long) this.field1861 + this.field1871) <= ((long) this.field1864 + this.field1846)) {
            var2 = (long) this.field1861 + this.field1871;
        }
        this.field1862 += (long) this.field1864;
        long var4 = -1L;
        if (this.field1846 >= this.field1871 && this.field1846 < ((long) this.field1861 + this.field1871)) {
            var4 = this.field1846;
        } else if (this.field1871 >= this.field1846 && this.field1871 < (long) this.field1864 + this.field1846) {
            var4 = this.field1871;
        }
        if (this.field1862 > this.field1853) {
            this.field1853 = this.field1862;
        }
        if (var4 > -1L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class140.method973(this.field1850, (int) (var4 - this.field1846), this.field1867, (int) (var4 - this.field1871), var6);
        }
        this.field1864 = 0;
        this.field1846 = -1L;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLog;Ljava/lang/String;)I")
    public static final int method826(byte arg0, class221 arg1, String arg2) {
        field1845++;
        int var3 = arg1.field3655;
        if (arg0 != -56) {
            method826((byte) -124, (class221) null, (String) null);
        }
        byte[] var4 = class19.method190(arg2, 127);
        arg1.method1536(var4.length, (byte) -113);
        arg1.field3655 += class126.field2044.method466((byte) 104, arg1.field3655, arg1.field3653, 0, var4.length, var4);
        return arg1.field3655 - var3;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method827(int arg0) {
        field1851++;
        if (arg0 != 0) {
            this.field1853 = 93L;
        }
        return this.field1852.method1649((byte) 126);
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ldc;II)V")
    public class112(class237 arg0, int arg1, int arg2) throws IOException {
        this.field1852 = arg0;
        this.field1858 = this.field1853 = arg0.method1650(0);
        this.field1863 = 0L;
        this.field1867 = new byte[arg1];
        this.field1850 = new byte[arg2];
    }
}
