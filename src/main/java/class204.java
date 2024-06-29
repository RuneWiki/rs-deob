import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class204 {

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    private int field3328 = 0;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "J")
    private long field3333 = -1L;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "J")
    private long field3332 = -1L;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "Lue;")
    private class110 field3336;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "J")
    private long field3338;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "J")
    private long field3319;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "J")
    private long field3337;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "[B")
    private byte[] field3329;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "[B")
    private byte[] field3318;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "Lab;")
    public static class279 field3339 = new class279(64);

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    private int field3315;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "J")
    private long field3330;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Loj;")
    public static class283 field3313;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([BI)V", line = 7)
    public final void method1364(byte[] arg0, int arg1) throws IOException {
        this.method1370(arg0, 25833, arg0.length, arg1);
        field3327++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)J", line = 28)
    public final long method1365(int arg0) {
        int var2 = 1 % ((arg0 + 5) / 39);
        field3316++;
        return this.field3319;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 40)
    private final void method1366(byte arg0) throws IOException {
        int var2 = 41 / ((69 - arg0) / 45);
        field3326++;
        this.field3315 = 0;
        if (this.field3337 != this.field3330) {
            this.field3336.method712(this.field3337, -31804);
            this.field3330 = this.field3337;
        }
        this.field3333 = this.field3337;
        while (this.field3318.length > this.field3315) {
            int var3 = this.field3318.length - this.field3315;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field3336.method715(this.field3315, (byte) 78, this.field3318, var3);
            if (var4 == -1) {
                break;
            }
            this.field3315 += var4;
            this.field3330 += (long) var4;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V", line = 81)
    public static final void method1367(boolean arg0) {
        field3314++;
        class197.field3167.method836((byte) -100);
        for (int var1 = 0; var1 < 32; var1++) {
            class106.field1840[var1] = 0L;
        }
        int var2 = 0;
        if (arg0) {
            field3324 = 46;
        }
        while (var2 < 32) {
            class32.field658[var2] = 0L;
            var2++;
        }
        class215.field3447 = 0;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)Lvj;", line = 107)
    public static final class103 method1368(int arg0) {
        if (arg0 != 16711680) {
            field3324 = -18;
        }
        field3321++;
        return class236.field3715.length <= class74.field1525 ? null : class236.field3715[class74.field1525++];
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZ)V", line = 129)
    public static final void method1369(int arg0, int arg1, boolean arg2) {
        class155 var3 = class269.method1795((byte) -113, arg1);
        int var4 = var3.field2528;
        field3322++;
        if (!arg2) {
            method1369(103, 13, false);
        }
        int var5 = var3.field2524;
        int var6 = var3.field2520;
        int var7 = class99.field1751[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class236.method1568(10372, var8 & arg0 << var5 | class40.field771[var4] & ~var8, var4);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([BIII)V", line = 159)
    public final void method1370(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3341++;
        try {
            if (arg0.length < arg2 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg3 - (arg0.length - arg2));
            }
            if (this.field3332 != -1L && this.field3337 >= this.field3332 && this.field3337 + ((long) arg2) <= this.field3332 - -((long) this.field3328)) {
                class129.method851(this.field3329, (int) (this.field3337 - this.field3332), arg0, arg3, arg2);
                this.field3337 += (long) arg2;
                return;
            }
            long var5 = this.field3337;
            int var7 = arg2;
            if (arg1 != 25833) {
                method1367(true);
            }
            int var8 = arg3;
            if (this.field3333 <= this.field3337 && this.field3337 < ((long) this.field3315 + this.field3333)) {
                int var9 = (int) ((long) this.field3315 + this.field3333 - this.field3337);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                arg2 -= var9;
                class129.method851(this.field3318, (int) (this.field3337 - this.field3333), arg0, arg3, var9);
                arg3 += var9;
                this.field3337 += (long) var9;
            }
            if (this.field3318.length < arg2) {
                this.field3336.method712(this.field3337, -31804);
                this.field3330 = this.field3337;
                while (arg2 > 0) {
                    int var10 = this.field3336.method715(arg3, (byte) 78, arg0, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    this.field3337 += (long) var10;
                    arg2 -= var10;
                    arg3 += var10;
                    this.field3330 += (long) var10;
                }
            } else if (arg2 > 0) {
                this.method1366((byte) 9);
                int var11 = arg2;
                if (arg2 > this.field3315) {
                    var11 = this.field3315;
                }
                arg2 -= var11;
                class129.method851(this.field3318, 0, arg0, arg3, var11);
                arg3 += var11;
                this.field3337 += (long) var11;
            }
            if (this.field3332 != -1L) {
                if (this.field3337 < this.field3332 && arg2 > 0) {
                    int var12 = arg3 + ((int) (this.field3332 - this.field3337));
                    if ((arg2 + arg3) < var12) {
                        var12 = arg2 + arg3;
                    }
                    while (arg3 < var12) {
                        arg2--;
                        arg0[arg3++] = 0;
                        this.field3337++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field3332 >= var5 && this.field3332 < ((long) var7 + var5)) {
                    var13 = this.field3332;
                } else if (var5 >= this.field3332 && var5 < ((long) this.field3328 + this.field3332)) {
                    var13 = var5;
                }
                if (var5 < (long) this.field3328 + this.field3332 && ((long) var7 + var5) >= ((long) this.field3328 + this.field3332)) {
                    var15 = (long) this.field3328 + this.field3332;
                } else if (((long) var7 + var5) > this.field3332 && this.field3332 + ((long) this.field3328) >= (long) var7 + var5) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class129.method851(this.field3329, (int) (var13 - this.field3332), arg0, (int) (var13 - var5) + var8, var17);
                    if (this.field3337 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field3337));
                        this.field3337 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3330 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BJ)V", line = 352)
    public final void method1371(byte arg0, long arg1) throws IOException {
        field3331++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1374((byte) 73));
        }
        this.field3337 = arg1;
        int var4 = -17 / ((arg0 + 31) / 53);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II[BI)V", line = 371)
    public final void method1372(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3325++;
        try {
            if (((long) arg3 + this.field3337) > this.field3319) {
                this.field3319 = (long) arg3 + this.field3337;
            }
            if (this.field3332 != -1L && (this.field3332 > this.field3337 || this.field3337 > (long) this.field3328 + this.field3332)) {
                this.method1376((byte) 83);
            }
            if ((long) arg1 != this.field3332 && ((long) this.field3329.length + this.field3332) < ((long) arg3 + this.field3337)) {
                int var5 = (int) (this.field3332 + (long) this.field3329.length - this.field3337);
                class129.method851(arg2, arg0, this.field3329, (int) (this.field3337 - this.field3332), var5);
                arg3 -= var5;
                arg0 += var5;
                this.field3337 += (long) var5;
                this.field3328 = this.field3329.length;
                this.method1376((byte) -99);
            }
            if (arg3 > this.field3329.length) {
                if (this.field3337 != this.field3330) {
                    this.field3336.method712(this.field3337, -31804);
                    this.field3330 = this.field3337;
                }
                this.field3336.method714(arg2, arg3, arg0, false);
                long var6 = -1L;
                this.field3330 += (long) arg3;
                if (this.field3333 <= this.field3337 && ((long) this.field3315 + this.field3333) > this.field3337) {
                    var6 = this.field3337;
                } else if (this.field3337 <= this.field3333 && (this.field3337 + ((long) arg3)) > this.field3333) {
                    var6 = this.field3333;
                }
                if (this.field3330 > this.field3338) {
                    this.field3338 = this.field3330;
                }
                long var8 = -1L;
                if (this.field3333 < (this.field3337 + ((long) arg3)) && ((long) arg3 + this.field3337) <= ((long) this.field3315 + this.field3333)) {
                    var8 = (long) arg3 + this.field3337;
                } else if (this.field3337 < (long) this.field3315 + this.field3333 && ((long) arg3 + this.field3337) >= ((long) this.field3315 + this.field3333)) {
                    var8 = (long) this.field3315 + this.field3333;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class129.method851(arg2, (int) ((long) arg0 + var6 - this.field3337), this.field3318, (int) (var6 - this.field3333), var10);
                }
                this.field3337 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field3332 == -1L) {
                    this.field3332 = this.field3337;
                }
                class129.method851(arg2, arg0, this.field3329, (int) (this.field3337 - this.field3332), arg3);
                this.field3337 += (long) arg3;
                if (this.field3337 - this.field3332 > (long) this.field3328) {
                    this.field3328 = (int) (this.field3337 - this.field3332);
                }
            }
        } catch (IOException var12) {
            this.field3330 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lue;II)V", line = 625)
    public class204(class110 arg0, int arg1, int arg2) throws IOException {
        this.field3336 = arg0;
        this.field3319 = this.field3338 = arg0.method716(0);
        this.field3337 = 0L;
        this.field3329 = new byte[arg2];
        this.field3318 = new byte[arg1];
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V", line = 500)
    public static final void method1373(int arg0) {
        class85.field1611.method1884(-22054);
        if (arg0 > -73) {
            field3324 = -71;
        }
        field3317++;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)Ljava/io/File;", line = 514)
    private final File method1374(byte arg0) {
        if (arg0 == 73) {
            field3335++;
            return this.field3336.method713(44);
        } else {
            return (File) null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V", line = 534)
    public static void method1375(int arg0) {
        if (arg0 > 50) {
            field3339 = null;
            field3313 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)V", line = 547)
    private final void method1376(byte arg0) throws IOException {
        field3342++;
        if (this.field3332 != -1L) {
            if (this.field3332 != this.field3330) {
                this.field3336.method712(this.field3332, -31804);
                this.field3330 = this.field3332;
            }
            long var2 = -1L;
            long var4 = -1L;
            this.field3336.method714(this.field3329, this.field3328, 0, false);
            if (this.field3333 <= this.field3332 && (long) this.field3315 + this.field3333 > this.field3332) {
                var2 = this.field3332;
            } else if (this.field3332 <= this.field3333 && this.field3333 < (long) this.field3328 + this.field3332) {
                var2 = this.field3333;
            }
            if (this.field3332 + ((long) this.field3328) > this.field3333 && (long) this.field3328 + this.field3332 <= (long) this.field3315 + this.field3333) {
                var4 = this.field3332 + ((long) this.field3328);
            } else if ((long) this.field3315 + this.field3333 > this.field3332 && this.field3332 + ((long) this.field3328) >= this.field3333 - -((long) this.field3315)) {
                var4 = (long) this.field3315 + this.field3333;
            }
            this.field3330 += (long) this.field3328;
            if (this.field3338 < this.field3330) {
                this.field3338 = this.field3330;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class129.method851(this.field3329, (int) (var2 - this.field3332), this.field3318, (int) (var2 - this.field3333), var6);
            }
            this.field3332 = -1L;
            this.field3328 = 0;
        }
        int var7 = 21 % ((arg0 + 50) / 49);
    }
}
