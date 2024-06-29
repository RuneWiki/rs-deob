import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class14 {

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    private int field335 = 0;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "J")
    private long field346 = -1L;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "J")
    private long field347 = -1L;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Lvh;")
    private class197 field326;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "J")
    private long field337;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "J")
    private long field333;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "[B")
    private byte[] field324;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "J")
    private long field323;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "[B")
    private byte[] field342;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field320 = 0;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lgg;")
    public static class63 field322 = class116.method911(43, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "Lgg;")
    public static class63 field341 = class116.method911(43, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "Lgg;")
    public static class63 field345 = class116.method911(43, "(U(Y");

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field336 = 0;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "[[I")
    public static int[][] field349 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "Lgg;")
    private static class63 field340 = class116.method911(43, "Checking for updates )2 ");

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Lgg;")
    public static class63 field329 = field340;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "Lgg;")
    private static class63 field351 = class116.method911(43, " has logged out)3");

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field321 = 0;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "Lgg;")
    public static class63 field339 = field351;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "[I")
    public static int[] field352 = new int[5];

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "J")
    private long field319;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "[Z")
    public static boolean[] field332;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III[B)V")
    public final void method156(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field330++;
        try {
            if (arg0 == 2855) {
                if (this.field323 + (long) arg2 > this.field333) {
                    this.field333 = (long) arg2 + this.field323;
                }
                if (this.field347 != -1L && (this.field323 < this.field347 || this.field323 > (long) this.field335 + this.field347)) {
                    this.method161(-1);
                }
                if (this.field347 != -1L && (long) arg2 + this.field323 > (long) this.field342.length + this.field347) {
                    int var5 = (int) ((long) this.field342.length + this.field347 - this.field323);
                    arg2 -= var5;
                    class102.method847(arg3, arg1, this.field342, (int) (this.field323 - this.field347), var5);
                    arg1 += var5;
                    this.field323 += var5;
                    this.field335 = this.field342.length;
                    this.method161(-1);
                }
                if (arg2 > this.field342.length) {
                    if (this.field323 != this.field319) {
                        this.field326.method1287(this.field323, arg0 + 23219);
                        this.field319 = this.field323;
                    }
                    this.field326.method1285(arg2, -73, arg1, arg3);
                    this.field319 += arg2;
                    long var6 = -1L;
                    if (this.field337 < this.field319) {
                        this.field337 = this.field319;
                    }
                    if (this.field346 <= this.field323 && this.field323 < (long) this.field325 + this.field346) {
                        var6 = this.field323;
                    } else if (this.field346 >= this.field323 && this.field346 < this.field323 + (long) arg2) {
                        var6 = this.field346;
                    }
                    long var8 = -1L;
                    if (this.field323 + (long) arg2 > this.field346 && (long) arg2 + this.field323 <= (long) this.field325 + this.field346) {
                        var8 = (long) arg2 + this.field323;
                    } else if ((long) this.field325 + this.field346 > this.field323 && (long) arg2 + this.field323 >= (long) this.field325 + this.field346) {
                        var8 = (long) this.field325 + this.field346;
                    }
                    if (var6 > -1L && var6 < var8) {
                        int var10 = (int) (var8 - var6);
                        class102.method847(arg3, (int) ((long) arg1 + var6 - this.field323), this.field324, (int) (var6 - this.field346), var10);
                    }
                    this.field323 += arg2;
                } else if (arg2 > 0) {
                    if (this.field347 == -1L) {
                        this.field347 = this.field323;
                    }
                    class102.method847(arg3, arg1, this.field342, (int) (this.field323 - this.field347), arg2);
                    this.field323 += arg2;
                    if ((long) this.field335 < this.field323 - this.field347) {
                        this.field335 = (int) (this.field323 - this.field347);
                    }
                }
            }
        } catch (IOException var12) {
            this.field319 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([BIII)V")
    public final void method157(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field318++;
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field347 != -1L && this.field323 >= this.field347 && (long) this.field335 + this.field347 >= (long) arg1 + this.field323) {
                class102.method847(this.field342, (int) (this.field323 - this.field347), arg0, arg2, arg1);
                this.field323 += arg1;
                return;
            }
            long var5 = this.field323;
            int var7 = arg2;
            int var8 = -85 % ((arg3 - 43) / 60);
            int var9 = arg1;
            if (this.field323 >= this.field346 && this.field323 < this.field346 + (long) this.field325) {
                int var10 = (int) (this.field346 + (long) this.field325 - this.field323);
                if (var10 > arg1) {
                    var10 = arg1;
                }
                arg1 -= var10;
                class102.method847(this.field324, (int) (this.field323 - this.field346), arg0, arg2, var10);
                this.field323 += var10;
                arg2 += var10;
            }
            if (this.field324.length < arg1) {
                this.field326.method1287(this.field323, 26074);
                this.field319 = this.field323;
                while (arg1 > 0) {
                    int var12 = this.field326.method1286((byte) -111, arg1, arg0, arg2);
                    if (var12 == -1) {
                        break;
                    }
                    arg1 -= var12;
                    this.field323 += var12;
                    arg2 += var12;
                    this.field319 += var12;
                }
            } else if (arg1 > 0) {
                int var11 = arg1;
                this.method166((byte) -90);
                if (this.field325 < arg1) {
                    var11 = this.field325;
                }
                arg1 -= var11;
                class102.method847(this.field324, 0, arg0, arg2, var11);
                arg2 += var11;
                this.field323 += var11;
            }
            if (this.field347 != -1L) {
                if (this.field347 > this.field323 && arg1 > 0) {
                    int var13 = (int) (this.field347 - this.field323) + arg2;
                    if (var13 > arg1 + arg2) {
                        var13 = arg1 + arg2;
                    }
                    while (arg2 < var13) {
                        arg1--;
                        arg0[arg2++] = 0;
                        this.field323++;
                    }
                }
                long var14 = -1L;
                if (var5 <= this.field347 && (long) var9 + var5 > this.field347) {
                    var14 = this.field347;
                } else if (var5 >= this.field347 && this.field347 + (long) this.field335 > var5) {
                    var14 = var5;
                }
                long var16 = -1L;
                if (var5 < (long) this.field335 + this.field347 && (long) this.field335 + this.field347 <= (long) var9 + var5) {
                    var16 = (long) this.field335 + this.field347;
                } else if (var5 + (long) var9 > this.field347 && this.field347 + (long) this.field335 >= (long) var9 + var5) {
                    var16 = (long) var9 + var5;
                }
                if (var14 > -1L && var16 > var14) {
                    int var18 = (int) (var16 - var14);
                    class102.method847(this.field342, (int) (var14 - this.field347), arg0, (int) (var14 - var5) + var7, var18);
                    if (var16 > this.field323) {
                        arg1 = (int) ((long) arg1 + this.field323 - var16);
                        this.field323 = var16;
                    }
                }
            }
        } catch (IOException var20) {
            this.field319 = -1L;
            throw var20;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method158(int arg0) {
        field332 = null;
        field339 = null;
        field352 = null;
        field345 = null;
        field329 = null;
        field351 = null;
        field322 = null;
        field340 = null;
        field341 = null;
        if (arg0 <= 87) {
            field322 = null;
        }
        field349 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Ljava/io/File;")
    private final File method159(byte arg0) {
        field331++;
        if (arg0 != 51) {
            field339 = null;
        }
        return this.field326.method1288(126);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IJ)V")
    public final void method160(int arg0, long arg1) throws IOException {
        field327++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method159((byte) 51));
        }
        this.field323 = arg1;
        int var4 = -23 % ((-arg0 - 56) / 62);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    private final void method161(int arg0) throws IOException {
        if ((long) arg0 != this.field347) {
            if (this.field347 != this.field319) {
                this.field326.method1287(this.field347, 26074);
                this.field319 = this.field347;
            }
            this.field326.method1285(this.field335, -73, 0, this.field342);
            this.field319 += this.field335;
            long var2 = -1L;
            if (this.field347 >= this.field346 && this.field347 < (long) this.field325 + this.field346) {
                var2 = this.field347;
            } else if (this.field346 >= this.field347 && this.field346 < (long) this.field335 + this.field347) {
                var2 = this.field346;
            }
            long var4 = -1L;
            if ((long) this.field335 + this.field347 > this.field346 && (long) this.field335 + this.field347 <= this.field346 - -((long) this.field325)) {
                var4 = (long) this.field335 + this.field347;
            } else if (this.field347 < (long) this.field325 + this.field346 && (long) this.field335 + this.field347 >= (long) this.field325 + this.field346) {
                var4 = (long) this.field325 + this.field346;
            }
            if (this.field319 > this.field337) {
                this.field337 = this.field319;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class102.method847(this.field342, (int) (var2 - this.field347), this.field324, (int) (var2 - this.field346), var6);
            }
            this.field335 = 0;
            this.field347 = -1L;
        }
        field348++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([BI)V")
    public final void method162(byte[] arg0, int arg1) throws IOException {
        field343++;
        this.method157(arg0, arg0.length, arg1, 117);
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)J")
    public final long method163(int arg0) {
        if (arg0 == -15307) {
            field350++;
            return this.field333;
        } else {
            return -5L;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
    public static final void method164(byte arg0) {
        field334++;
        if (class171.field3553 != null) {
            class171.field3553.method509(true);
            class171.field3553 = null;
        }
        if (arg0 != 0) {
            method165(76, 60, -87);
        }
        class48.method475((byte) 120);
        class169.method1144();
        for (int var1 = 0; var1 < 4; var1++) {
            class157.field3267[var1].method714(arg0 - 77);
        }
        System.gc();
        class91.method779((byte) 102, 2);
        class164.field3377 = false;
        class6.field158 = -1;
        class125.method949(false);
        class121.method931(10, 1);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)I")
    public static final int method165(int arg0, int arg1, int arg2) {
        field353++;
        if (arg2 != -1) {
            return 0;
        }
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V")
    private final void method166(byte arg0) throws IOException {
        field328++;
        int var2 = -56 / ((arg0 - 47) / 52);
        this.field325 = 0;
        if (this.field323 != this.field319) {
            this.field326.method1287(this.field323, 26074);
            this.field319 = this.field323;
        }
        this.field346 = this.field323;
        while (this.field325 < this.field324.length) {
            int var3 = this.field326.method1286((byte) -111, this.field324.length - this.field325, this.field324, this.field325);
            if (var3 == -1) {
                break;
            }
            this.field325 += var3;
            this.field319 += var3;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lvh;II)V")
    public class14(class197 arg0, int arg1, int arg2) throws IOException {
        this.field326 = arg0;
        this.field333 = this.field337 = arg0.method1290((byte) -84);
        this.field324 = new byte[arg1];
        this.field323 = 0L;
        this.field342 = new byte[arg2];
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
    public final void method167(int arg0) throws IOException {
        field338++;
        this.method161(arg0 ^ 0xFFFFFFFE);
        this.field326.method1289(arg0);
    }
}
