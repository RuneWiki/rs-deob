import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class140 {

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    private int field2396 = 0;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "J")
    private long field2399 = -1L;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "J")
    private long field2393 = -1L;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "Lqk;")
    private class8 field2401;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "J")
    private long field2404;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "J")
    private long field2408;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "[B")
    private byte[] field2400;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "[B")
    private byte[] field2388;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "J")
    private long field2392;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field2387 = 0;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Lhi;")
    public static class82 field2395 = class95.method664((byte) -88, "Abbrechen");

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "[I")
    public static int[] field2397 = new int[1000];

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "Lqc;")
    public static class329 field2409 = new class329(64);

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "Lhi;")
    public static class82 field2413 = class95.method664((byte) -110, "runes");

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    private int field2406;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "J")
    private long field2411;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II[BI)V", line = 5)
    public final void method948(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2405++;
        try {
            if (arg2.length < (arg1 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (arg0 != 0) {
                this.method951(11);
            }
            if (this.field2399 != -1L && this.field2399 <= this.field2392 && (long) arg1 + this.field2392 <= this.field2399 - -((long) this.field2396)) {
                class190.method1323(this.field2400, (int) (this.field2392 - this.field2399), arg2, arg3, arg1);
                this.field2392 += (long) arg1;
                return;
            }
            long var5 = this.field2392;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field2392 >= this.field2393 && (long) this.field2406 + this.field2393 > this.field2392) {
                int var9 = (int) ((long) this.field2406 + this.field2393 - this.field2392);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class190.method1323(this.field2388, (int) (this.field2392 - this.field2393), arg2, arg3, var9);
                this.field2392 += (long) var9;
                arg3 += var9;
            }
            if (arg1 > this.field2388.length) {
                this.field2401.method51(-95, this.field2392);
                this.field2411 = this.field2392;
                while (arg1 > 0) {
                    int var10 = this.field2401.method47(arg2, arg0 + 247, arg1, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    this.field2411 += (long) var10;
                    arg3 += var10;
                    this.field2392 += (long) var10;
                    arg1 -= var10;
                }
            } else if (arg1 > 0) {
                this.method958((byte) 111);
                int var11 = arg1;
                if (this.field2406 < arg1) {
                    var11 = this.field2406;
                }
                arg1 -= var11;
                class190.method1323(this.field2388, 0, arg2, arg3, var11);
                this.field2392 += (long) var11;
                arg3 += var11;
            }
            if (this.field2399 != -1L) {
                if (this.field2399 > this.field2392 && arg1 > 0) {
                    int var12 = (int) (this.field2399 - this.field2392) + arg3;
                    if (arg1 + arg3 < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg3) {
                        arg2[arg3++] = 0;
                        this.field2392++;
                        arg1--;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field2399 && this.field2399 < (long) var8 + var5) {
                    var13 = this.field2399;
                } else if (var5 >= this.field2399 && var5 < (long) this.field2396 + this.field2399) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (this.field2399 + ((long) this.field2396) > var5 && (long) var8 + var5 >= (long) this.field2396 + this.field2399) {
                    var15 = (long) this.field2396 + this.field2399;
                } else if ((var5 + ((long) var8)) > this.field2399 && (this.field2399 + ((long) this.field2396)) >= ((long) var8 + var5)) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class190.method1323(this.field2400, (int) (var13 - this.field2399), arg2, var7 + ((int) (var13 - var5)), var17);
                    if (this.field2392 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field2392));
                        this.field2392 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2411 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([IIIIII)V", line = 187)
    public static final void method949(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class16 var6 = class15.field120[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class88 var7 = var6.field166;
        if (var7 != null) {
            int var8 = var7.field1570;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class41 var10 = var6.field157;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field723;
        int var12 = var10.field729;
        int var13 = var10.field720;
        int var14 = var10.field712;
        int[] var15 = class283.field4760[var11];
        int[] var16 = class64.field1006[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([BI)V", line = 295)
    public final void method950(byte[] arg0, int arg1) throws IOException {
        this.method948(0, arg0.length, arg0, arg1);
        field2391++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Ljava/io/File;", line = 304)
    private final File method951(int arg0) {
        if (arg0 != 0) {
            method949((int[]) null, 13, 37, 71, -38, 101);
        }
        field2407++;
        return this.field2401.method49(arg0 ^ 0x3C6D);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V", line = 322)
    private final void method952(boolean arg0) throws IOException {
        if (arg0) {
            this.field2408 = 14L;
        }
        if (this.field2399 != -1L) {
            if (this.field2411 != this.field2399) {
                this.field2401.method51(-85, this.field2399);
                this.field2411 = this.field2399;
            }
            long var2 = -1L;
            this.field2401.method52(0, 0, this.field2396, this.field2400);
            this.field2411 += (long) this.field2396;
            if (this.field2404 < this.field2411) {
                this.field2404 = this.field2411;
            }
            long var4 = -1L;
            if (this.field2393 < (long) this.field2396 + this.field2399 && ((long) this.field2406 + this.field2393) >= (this.field2399 + ((long) this.field2396))) {
                var4 = (long) this.field2396 + this.field2399;
            } else if ((this.field2393 + ((long) this.field2406)) > this.field2399 && ((long) this.field2396 + this.field2399) >= ((long) this.field2406 + this.field2393)) {
                var4 = (long) this.field2406 + this.field2393;
            }
            if (this.field2393 <= this.field2399 && ((long) this.field2406 + this.field2393) > this.field2399) {
                var2 = this.field2399;
            } else if (this.field2399 <= this.field2393 && ((long) this.field2396 + this.field2399) > this.field2393) {
                var2 = this.field2393;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class190.method1323(this.field2400, (int) (var2 - this.field2399), this.field2388, (int) (var2 - this.field2393), var6);
            }
            this.field2396 = 0;
            this.field2399 = -1L;
        }
        field2410++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 407)
    public final void method953(byte arg0) throws IOException {
        field2389++;
        this.method952(false);
        this.field2401.method48(37);
        if (arg0 > -69) {
            this.method951(100);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V", line = 419)
    public static void method954(int arg0) {
        field2409 = null;
        if (arg0 == 0) {
            field2397 = null;
            field2395 = null;
            field2413 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)J", line = 437)
    public final long method955(int arg0) {
        field2394++;
        int var2 = -46 % ((arg0 + 63) / 41);
        return this.field2408;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(JB)V", line = 454)
    public final void method956(long arg0, byte arg1) throws IOException {
        field2402++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method951(0));
        }
        if (arg1 != 104) {
            method954(75);
        }
        this.field2392 = arg0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B[BII)V", line = 469)
    public final void method957(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2398++;
        try {
            if (this.field2408 < (this.field2392 + ((long) arg3))) {
                this.field2408 = this.field2392 + ((long) arg3);
            }
            if (arg0 == -94) {
                if (this.field2399 != -1L && (this.field2399 > this.field2392 || this.field2392 > (this.field2399 + ((long) this.field2396)))) {
                    this.method952(false);
                }
                if (this.field2399 != -1L && ((long) arg3 + this.field2392) > ((long) this.field2400.length + this.field2399)) {
                    int var5 = (int) ((long) this.field2400.length + this.field2399 - this.field2392);
                    arg3 -= var5;
                    class190.method1323(arg1, arg2, this.field2400, (int) (this.field2392 - this.field2399), var5);
                    arg2 += var5;
                    this.field2392 += (long) var5;
                    this.field2396 = this.field2400.length;
                    this.method952(false);
                }
                if (this.field2400.length < arg3) {
                    if (this.field2411 != this.field2392) {
                        this.field2401.method51(arg0 ^ 0x8, this.field2392);
                        this.field2411 = this.field2392;
                    }
                    long var6 = -1L;
                    long var8 = -1L;
                    this.field2401.method52(arg2, arg0 + 94, arg3, arg1);
                    if (this.field2392 >= this.field2393 && (long) this.field2406 + this.field2393 > this.field2392) {
                        var8 = this.field2392;
                    } else if (this.field2392 <= this.field2393 && (long) arg3 + this.field2392 > this.field2393) {
                        var8 = this.field2393;
                    }
                    if ((this.field2392 + ((long) arg3)) > this.field2393 && this.field2392 + ((long) arg3) <= this.field2393 - -((long) this.field2406)) {
                        var6 = this.field2392 + ((long) arg3);
                    } else if (this.field2392 < ((long) this.field2406 + this.field2393) && ((long) this.field2406 + this.field2393) <= (this.field2392 + ((long) arg3))) {
                        var6 = (long) this.field2406 + this.field2393;
                    }
                    this.field2411 += (long) arg3;
                    if (this.field2411 > this.field2404) {
                        this.field2404 = this.field2411;
                    }
                    if (var8 > -1L && var6 > var8) {
                        int var10 = (int) (var6 - var8);
                        class190.method1323(arg1, (int) ((long) arg2 + var8 - this.field2392), this.field2388, (int) (var8 - this.field2393), var10);
                    }
                    this.field2392 += (long) arg3;
                } else if (arg3 > 0) {
                    if (this.field2399 == -1L) {
                        this.field2399 = this.field2392;
                    }
                    class190.method1323(arg1, arg2, this.field2400, (int) (this.field2392 - this.field2399), arg3);
                    this.field2392 += (long) arg3;
                    if ((long) this.field2396 < this.field2392 - this.field2399) {
                        this.field2396 = (int) (this.field2392 - this.field2399);
                    }
                }
            }
        } catch (IOException var12) {
            this.field2411 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lqk;II)V", line = 673)
    public class140(class8 arg0, int arg1, int arg2) throws IOException {
        this.field2401 = arg0;
        this.field2408 = this.field2404 = arg0.method50(1);
        this.field2400 = new byte[arg2];
        this.field2388 = new byte[arg1];
        this.field2392 = 0L;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V", line = 614)
    private final void method958(byte arg0) throws IOException {
        int var2 = -125 / ((3 - arg0) / 63);
        field2390++;
        this.field2406 = 0;
        if (this.field2411 != this.field2392) {
            this.field2401.method51(-82, this.field2392);
            this.field2411 = this.field2392;
        }
        this.field2393 = this.field2392;
        while (this.field2406 < this.field2388.length) {
            int var3 = this.field2388.length - this.field2406;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field2401.method47(this.field2388, 247, var3, this.field2406);
            if (var4 == -1) {
                break;
            }
            this.field2411 += (long) var4;
            this.field2406 += var4;
        }
    }
}
