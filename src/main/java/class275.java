import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class275 {

    @OriginalMember(owner = "client!up", name = "p", descriptor = "J")
    private long field3503 = -1L;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    private int field3492 = 0;

    @OriginalMember(owner = "client!up", name = "y", descriptor = "J")
    private long field3512 = -1L;

    @OriginalMember(owner = "client!up", name = "u", descriptor = "Lrq;")
    private class38 field3508;

    @OriginalMember(owner = "client!up", name = "o", descriptor = "J")
    private long field3502;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "J")
    private long field3494;

    @OriginalMember(owner = "client!up", name = "s", descriptor = "[B")
    private byte[] field3506;

    @OriginalMember(owner = "client!up", name = "z", descriptor = "[B")
    private byte[] field3513;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "J")
    private long field3496;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "Ljd;")
    public static class408 field3490 = new class408(4, 1, 1, 1);

    @OriginalMember(owner = "client!up", name = "t", descriptor = "Loi;")
    public static class169 field3507 = new class169("K", "T", "K", "K");

    @OriginalMember(owner = "client!up", name = "x", descriptor = "I")
    public static int field3511 = -1;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "[[I")
    public static int[][] field3509 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!up", name = "w", descriptor = "Ldg;")
    public static class12 field3510 = new class12(14, 1);

    @OriginalMember(owner = "client!up", name = "A", descriptor = "Ldg;")
    public static class12 field3514 = new class12(15, 4);

    @OriginalMember(owner = "client!up", name = "B", descriptor = "Ldg;")
    public static class12 field3515 = new class12(16, -2);

    @OriginalMember(owner = "client!up", name = "C", descriptor = "Ldg;")
    public static class12 field3516 = new class12(17, 0);

    @OriginalMember(owner = "client!up", name = "D", descriptor = "Ldg;")
    public static class12 field3517 = new class12(18, -2);

    @OriginalMember(owner = "client!up", name = "E", descriptor = "Ldg;")
    public static class12 field3518 = new class12(20, 6);

    @OriginalMember(owner = "client!up", name = "F", descriptor = "Ldg;")
    public static class12 field3519 = new class12(21, 8);

    @OriginalMember(owner = "client!up", name = "G", descriptor = "Ldg;")
    public static class12 field3520 = new class12(22, -2);

    @OriginalMember(owner = "client!up", name = "H", descriptor = "Ldg;")
    public static class12 field3521 = new class12(23, 4);

    @OriginalMember(owner = "client!up", name = "I", descriptor = "Ldg;")
    public static class12 field3522 = new class12(24, -1);

    @OriginalMember(owner = "client!up", name = "J", descriptor = "[Ldg;")
    private static class12[] field3523 = new class12[32];

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!up", name = "j", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!up", name = "l", descriptor = "I")
    private int field3499;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!up", name = "r", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!up", name = "q", descriptor = "J")
    private long field3504;

    static {
        class12[] var0 = class112.method736(1336147968);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3523[var0[var1].field195] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I[B)V", line = 6)
    public final void method1686(int arg0, byte[] arg1) throws IOException {
        this.method1695(arg1, 22393, arg1.length, 0);
        if (arg0 < 77) {
            this.method1692(26);
        }
        field3489++;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V", line = 17)
    public static void method1687(int arg0) {
        field3515 = null;
        field3510 = null;
        field3509 = null;
        field3514 = null;
        field3507 = null;
        field3490 = null;
        field3519 = null;
        field3523 = null;
        field3516 = null;
        field3518 = null;
        field3520 = null;
        field3521 = null;
        if (arg0 == 11464) {
            field3522 = null;
            field3517 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "([BIII)V", line = 52)
    public final void method1688(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3501++;
        try {
            int var5 = 26 % ((arg3 + 72) / 40);
            if (this.field3494 < ((long) arg2 + this.field3496)) {
                this.field3494 = (long) arg2 + this.field3496;
            }
            if (this.field3503 != -1L && (this.field3503 > this.field3496 || (long) this.field3492 + this.field3503 < this.field3496)) {
                this.method1694(-7551);
            }
            if (this.field3503 != -1L && (this.field3503 + ((long) this.field3506.length)) < ((long) arg2 + this.field3496)) {
                int var6 = (int) (this.field3503 + (long) this.field3506.length - this.field3496);
                class526.method3113(arg0, arg1, this.field3506, (int) (this.field3496 - this.field3503), var6);
                arg2 -= var6;
                this.field3496 += var6;
                arg1 += var6;
                this.field3492 = this.field3506.length;
                this.method1694(-7551);
            }
            if (arg2 > this.field3506.length) {
                if (this.field3504 != this.field3496) {
                    this.field3508.method242(this.field3496, 0);
                    this.field3504 = this.field3496;
                }
                this.field3508.method246(arg2, arg1, 1, arg0);
                this.field3504 += arg2;
                if (this.field3502 < this.field3504) {
                    this.field3502 = this.field3504;
                }
                long var7 = -1L;
                long var9 = -1L;
                if (this.field3512 <= this.field3496 && (this.field3512 + ((long) this.field3499)) > this.field3496) {
                    var7 = this.field3496;
                } else if (this.field3496 <= this.field3512 && ((long) arg2 + this.field3496) > this.field3512) {
                    var7 = this.field3512;
                }
                if (((long) arg2 + this.field3496) > this.field3512 && (long) this.field3499 + this.field3512 >= this.field3496 - -((long) arg2)) {
                    var9 = (long) arg2 + this.field3496;
                } else if (this.field3496 < ((long) this.field3499 + this.field3512) && ((long) arg2 + this.field3496) >= (this.field3512 + ((long) this.field3499))) {
                    var9 = (long) this.field3499 + this.field3512;
                }
                if (var7 > -1L && var9 > var7) {
                    int var11 = (int) (var9 - var7);
                    class526.method3113(arg0, (int) ((long) arg1 + var7 - this.field3496), this.field3513, (int) (var7 - this.field3512), var11);
                }
                this.field3496 += arg2;
            } else if (arg2 > 0) {
                if (this.field3503 == -1L) {
                    this.field3503 = this.field3496;
                }
                class526.method3113(arg0, arg1, this.field3506, (int) (this.field3496 - this.field3503), arg2);
                this.field3496 += arg2;
                if ((this.field3496 - this.field3503) > ((long) this.field3492)) {
                    this.field3492 = (int) (this.field3496 - this.field3503);
                }
            }
        } catch (IOException var13) {
            this.field3504 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IJ)V", line = 178)
    public final void method1689(int arg0, long arg1) throws IOException {
        field3488++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1693((byte) -97));
        }
        int var4 = 31 / ((arg0 + 73) / 37);
        this.field3496 = arg1;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IB)V", line = 193)
    public static final void method1690(int arg0, byte arg1) {
        field3500++;
        if (arg1 <= 7) {
            field3521 = null;
        }
        if (arg0 != -1 && class54.field737[arg0]) {
            class47.field681.method1291((byte) -127, arg0);
            class296.field3842[arg0] = null;
            class221.field2855[arg0] = null;
            class54.field737[arg0] = false;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(JIIZI)Ljava/lang/String;", line = 214)
    public static final String method1691(long arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field3495++;
        char var6 = ',';
        char var7 = '.';
        if (arg4 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg4 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            var8 = true;
            arg0 = -arg0;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg0 * 10)));
            if (arg0 == 0L) {
                if (arg2 > -107) {
                    field3515 = null;
                }
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)J", line = 294)
    public final long method1692(int arg0) {
        if (arg0 != 3645) {
            field3515 = null;
        }
        field3493++;
        return this.field3494;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)Ljava/io/File;", line = 308)
    private final File method1693(byte arg0) {
        field3491++;
        return arg0 > -89 ? null : this.field3508.method245(true);
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lrq;II)V", line = 671)
    public class275(class38 arg0, int arg1, int arg2) throws IOException {
        this.field3508 = arg0;
        this.field3494 = this.field3502 = arg0.method241(30);
        this.field3506 = new byte[arg2];
        this.field3513 = new byte[arg1];
        this.field3496 = 0L;
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V", line = 333)
    private final void method1694(int arg0) throws IOException {
        if (this.field3503 != -1L) {
            if (this.field3504 != this.field3503) {
                this.field3508.method242(this.field3503, 0);
                this.field3504 = this.field3503;
            }
            this.field3508.method246(this.field3492, 0, arg0 ^ 0xFFFFE280, this.field3506);
            this.field3504 += this.field3492;
            if (this.field3504 > this.field3502) {
                this.field3502 = this.field3504;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field3503 >= this.field3512 && ((long) this.field3499 + this.field3512) > this.field3503) {
                var2 = this.field3503;
            } else if (this.field3503 <= this.field3512 && (long) this.field3492 + this.field3503 > this.field3512) {
                var2 = this.field3512;
            }
            if ((this.field3503 + ((long) this.field3492)) > this.field3512 && this.field3503 + ((long) this.field3492) <= (long) this.field3499 + this.field3512) {
                var4 = (long) this.field3492 + this.field3503;
            } else if ((long) this.field3499 + this.field3512 > this.field3503 && ((long) this.field3492 + this.field3503) >= ((long) this.field3499 + this.field3512)) {
                var4 = this.field3512 + ((long) this.field3499);
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class526.method3113(this.field3506, (int) (var2 - this.field3503), this.field3513, (int) (var2 - this.field3512), var6);
            }
            this.field3503 = -1L;
            this.field3492 = 0;
        }
        field3498++;
        if (arg0 != -7551) {
            field3511 = -5;
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "([BIII)V", line = 413)
    public final void method1695(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3497++;
        try {
            if (arg0.length < arg2 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg2 - arg0.length);
            }
            if (this.field3503 != -1L && this.field3503 <= this.field3496 && ((long) this.field3492 + this.field3503) >= ((long) arg2 + this.field3496)) {
                class526.method3113(this.field3506, (int) (this.field3496 - this.field3503), arg0, arg3, arg2);
                this.field3496 += arg2;
                return;
            }
            long var5 = this.field3496;
            int var7 = arg3;
            int var8 = arg2;
            if (this.field3496 >= this.field3512 && this.field3512 + ((long) this.field3499) > this.field3496) {
                int var9 = (int) ((long) this.field3499 - (this.field3496 - this.field3512));
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class526.method3113(this.field3513, (int) (this.field3496 - this.field3512), arg0, arg3, var9);
                arg3 += var9;
                arg2 -= var9;
                this.field3496 += var9;
            }
            if (arg2 > this.field3513.length) {
                this.field3508.method242(this.field3496, 0);
                this.field3504 = this.field3496;
                while (arg2 > 0) {
                    int var10 = this.field3508.method244(arg3, arg2, arg0, arg1 - 22288);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 += var10;
                    this.field3504 += var10;
                    this.field3496 += var10;
                    arg2 -= var10;
                }
            } else if (arg2 > 0) {
                this.method1696(-200000001);
                int var11 = arg2;
                if (this.field3499 < arg2) {
                    var11 = this.field3499;
                }
                class526.method3113(this.field3513, 0, arg0, arg3, var11);
                arg3 += var11;
                this.field3496 += var11;
                arg2 -= var11;
            }
            if (this.field3503 != -1L) {
                if (this.field3503 > this.field3496 && arg2 > 0) {
                    int var12 = arg3 + ((int) (this.field3503 - this.field3496));
                    if (var12 > arg2 + arg3) {
                        var12 = arg3 + arg2;
                    }
                    while (var12 > arg3) {
                        arg0[arg3++] = 0;
                        arg2--;
                        this.field3496++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field3503 >= var5 && this.field3503 < var5 + ((long) var8)) {
                    var13 = this.field3503;
                } else if (this.field3503 <= var5 && var5 < ((long) this.field3492 + this.field3503)) {
                    var13 = var5;
                }
                if (((long) this.field3492 + this.field3503) > var5 && ((long) var8 + var5) >= ((long) this.field3492 + this.field3503)) {
                    var15 = (long) this.field3492 + this.field3503;
                } else if (this.field3503 < (long) var8 + var5 && ((long) this.field3492 + this.field3503) >= (var5 + ((long) var8))) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class526.method3113(this.field3506, (int) (var13 - this.field3503), arg0, (int) (var13 - var5) + var7, var17);
                    if (this.field3496 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field3496));
                        this.field3496 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3504 = -1L;
            throw var19;
        }
        if (arg1 == 22393 && arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!up", name = "d", descriptor = "(I)V", line = 619)
    private final void method1696(int arg0) throws IOException {
        field3505++;
        this.field3499 = 0;
        if (this.field3504 != this.field3496) {
            this.field3508.method242(this.field3496, 0);
            this.field3504 = this.field3496;
        }
        this.field3512 = this.field3496;
        if (arg0 != -200000001) {
            return;
        }
        while (this.field3513.length > this.field3499) {
            int var2 = this.field3513.length - this.field3499;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3508.method244(this.field3499, var2, this.field3513, -37);
            if (var3 == -1) {
                break;
            }
            this.field3504 += var3;
            this.field3499 += var3;
        }
    }
}
