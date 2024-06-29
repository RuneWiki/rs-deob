import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class455 {

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    private int field6396 = 0;

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "J")
    private long field6401 = -1L;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "J")
    private long field6400 = -1L;

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "Lvba;")
    private class38 field6407;

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "J")
    private long field6399;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "J")
    private long field6404;

    @OriginalMember(owner = "client!hca", name = "t", descriptor = "J")
    private long field6412;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "[B")
    private byte[] field6403;

    @OriginalMember(owner = "client!hca", name = "y", descriptor = "[B")
    private byte[] field6417;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "[Z")
    public static boolean[] field6397 = new boolean[8];

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "I")
    private int field6394;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!hca", name = "q", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!hca", name = "r", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!hca", name = "s", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!hca", name = "u", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!hca", name = "v", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!hca", name = "w", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!hca", name = "x", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!hca", name = "z", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "J")
    private long field6406;

    @OriginalMember(owner = "client!hca", name = "p", descriptor = "Lhn;")
    public static class670 field6408;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V", line = 5)
    private final void method2695(int arg0) throws IOException {
        this.field6394 = 0;
        field6418++;
        if (this.field6412 != this.field6406) {
            this.field6407.method438(this.field6412, -69);
            this.field6406 = this.field6412;
        }
        if (arg0 < 40) {
            this.field6399 = 42L;
        }
        this.field6401 = this.field6412;
        while (this.field6394 < this.field6417.length) {
            int var2 = this.field6417.length - this.field6394;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field6407.method440(this.field6394, -102, var2, this.field6417);
            if (var3 == -1) {
                break;
            }
            this.field6394 += var3;
            this.field6406 += var3;
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)Ljava/io/File;", line = 53)
    private final File method2696(int arg0) {
        if (arg0 != 0) {
            this.method2696(-20);
        }
        field6398++;
        return this.field6407.method444(126);
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)V", line = 66)
    public static void method2697(int arg0) {
        if (arg0 >= -126) {
            method2703(null, -89, 26, -128);
        }
        field6408 = null;
        field6397 = null;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(BJ)V", line = 77)
    public final void method2698(byte arg0, long arg1) throws IOException {
        if (arg0 >= -78) {
            this.field6403 = null;
        }
        field6402++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2696(0));
        }
        this.field6412 = arg1;
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Lvba;II)V", line = 575)
    public class455(class38 arg0, int arg1, int arg2) throws IOException {
        this.field6407 = arg0;
        this.field6404 = this.field6399 = arg0.method445(0);
        this.field6412 = 0L;
        this.field6403 = new byte[arg2];
        this.field6417 = new byte[arg1];
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)I", line = 94)
    public static final int method2699(int arg0, int arg1) {
        if (arg0 == 0) {
            field6405++;
            return arg1 >>> 8;
        } else {
            return 66;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "([BIIZ)V", line = 107)
    public final void method2700(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        field6413++;
        try {
            if (arg0.length < (arg1 + arg2)) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field6400 != -1L && this.field6400 <= this.field6412 && this.field6400 + ((long) this.field6396) >= this.field6412 - -((long) arg2)) {
                class252.method1545(this.field6403, (int) (this.field6412 - this.field6400), arg0, arg1, arg2);
                this.field6412 += arg2;
                return;
            }
            long var5 = this.field6412;
            int var7 = arg1;
            int var8 = arg2;
            if (arg3) {
                return;
            }
            if (this.field6412 >= this.field6401 && this.field6412 < (long) this.field6394 + this.field6401) {
                int var9 = (int) ((long) this.field6394 + this.field6401 - this.field6412);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                class252.method1545(this.field6417, (int) (this.field6412 - this.field6401), arg0, arg1, var9);
                this.field6412 += var9;
                arg1 += var9;
                arg2 -= var9;
            }
            if (this.field6417.length < arg2) {
                this.field6407.method438(this.field6412, -124);
                this.field6406 = this.field6412;
                while (arg2 > 0) {
                    int var11 = this.field6407.method440(arg1, -105, arg2, arg0);
                    if (var11 == -1) {
                        break;
                    }
                    this.field6412 += var11;
                    arg1 += var11;
                    this.field6406 += var11;
                    arg2 -= var11;
                }
            } else if (arg2 > 0) {
                this.method2695(78);
                int var10 = arg2;
                if (this.field6394 < arg2) {
                    var10 = this.field6394;
                }
                class252.method1545(this.field6417, 0, arg0, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field6412 += var10;
            }
            if (this.field6400 != -1L) {
                if (this.field6400 > this.field6412 && arg2 > 0) {
                    int var12 = (int) (this.field6400 - this.field6412) + arg1;
                    if ((arg1 + arg2) < var12) {
                        var12 = arg1 + arg2;
                    }
                    while (var12 > arg1) {
                        arg2--;
                        arg0[arg1++] = 0;
                        this.field6412++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field6400 && this.field6400 < (long) var8 + var5) {
                    var13 = this.field6400;
                } else if (var5 >= this.field6400 && var5 < ((long) this.field6396 + this.field6400)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (this.field6400 + ((long) this.field6396)) && this.field6400 + ((long) this.field6396) <= var5 - -((long) var8)) {
                    var15 = (long) this.field6396 + this.field6400;
                } else if ((long) var8 + var5 > this.field6400 && (long) var8 + var5 <= (long) this.field6396 + this.field6400) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class252.method1545(this.field6403, (int) (var13 - this.field6400), arg0, var7 + ((int) (var13 - var5)), var17);
                    if (this.field6412 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field6412));
                        this.field6412 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field6406 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)J", line = 294)
    public final long method2701(boolean arg0) {
        if (arg0) {
            method2699(118, -126);
        }
        field6416++;
        return this.field6404;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(III[B)V", line = 308)
    public final void method2702(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field6411++;
        try {
            if (((long) arg0 + this.field6412) > this.field6404) {
                this.field6404 = this.field6412 + ((long) arg0);
            }
            if (this.field6400 != -1L && (this.field6412 < this.field6400 || ((long) this.field6396 + this.field6400) < this.field6412)) {
                this.method2706(-1);
            }
            if (arg1 == 8) {
                if (this.field6400 != -1L && (this.field6412 + ((long) arg0)) > ((long) this.field6403.length + this.field6400)) {
                    int var5 = (int) ((long) this.field6403.length + this.field6400 - this.field6412);
                    class252.method1545(arg3, arg2, this.field6403, (int) (this.field6412 - this.field6400), var5);
                    arg2 += var5;
                    this.field6412 += var5;
                    arg0 -= var5;
                    this.field6396 = this.field6403.length;
                    this.method2706(-1);
                }
                if (this.field6403.length < arg0) {
                    if (this.field6412 != this.field6406) {
                        this.field6407.method438(this.field6412, 83);
                        this.field6406 = this.field6412;
                    }
                    this.field6407.method441(arg2, arg3, arg0, arg1 + 3755);
                    this.field6406 += arg0;
                    if (this.field6399 < this.field6406) {
                        this.field6399 = this.field6406;
                    }
                    long var6 = -1L;
                    long var8 = -1L;
                    if (this.field6412 >= this.field6401 && (long) this.field6394 + this.field6401 > this.field6412) {
                        var6 = this.field6412;
                    } else if (this.field6401 >= this.field6412 && (long) arg0 + this.field6412 > this.field6401) {
                        var6 = this.field6401;
                    }
                    if ((long) arg0 + this.field6412 > this.field6401 && (long) this.field6394 + this.field6401 >= (long) arg0 + this.field6412) {
                        var8 = (long) arg0 + this.field6412;
                    } else if (((long) this.field6394 + this.field6401) > this.field6412 && ((long) this.field6394 + this.field6401) <= ((long) arg0 + this.field6412)) {
                        var8 = (long) this.field6394 + this.field6401;
                    }
                    if (var6 > -1L && var8 > var6) {
                        int var10 = (int) (var8 - var6);
                        class252.method1545(arg3, (int) ((long) arg2 + var6 - this.field6412), this.field6417, (int) (var6 - this.field6401), var10);
                    }
                    this.field6412 += arg0;
                } else if (arg0 > 0) {
                    if (this.field6400 == -1L) {
                        this.field6400 = this.field6412;
                    }
                    class252.method1545(arg3, arg2, this.field6403, (int) (this.field6412 - this.field6400), arg0);
                    this.field6412 += arg0;
                    if ((this.field6412 - this.field6400) > ((long) this.field6396)) {
                        this.field6396 = (int) (this.field6412 - this.field6400);
                    }
                }
            }
        } catch (IOException var12) {
            this.field6406 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ln;III)V", line = 439)
    public static final void method2703(class17 arg0, int arg1, int arg2, int arg3) {
        class654.field9296 = arg0;
        class479.field6726 = arg1;
        int var4 = 17 / ((arg3 - 81) / 36);
        field6415++;
        class120.field1531 = arg2;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z[B)V", line = 457)
    public final void method2704(boolean arg0, byte[] arg1) throws IOException {
        this.method2700(arg1, 0, arg1.length, !arg0);
        field6395++;
        if (!arg0) {
            method2703(null, 114, 43, -16);
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(Z)V", line = 468)
    public final void method2705(boolean arg0) throws IOException {
        field6409++;
        if (arg0) {
            method2703(null, -102, 124, 66);
        }
        this.method2706(-1);
        this.field6407.method442((byte) -72);
    }

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "(I)V", line = 491)
    private final void method2706(int arg0) throws IOException {
        if ((long) arg0 != this.field6400) {
            if (this.field6406 != this.field6400) {
                this.field6407.method438(this.field6400, 123);
                this.field6406 = this.field6400;
            }
            this.field6407.method441(0, this.field6403, this.field6396, arg0 + 3764);
            this.field6406 += this.field6396;
            if (this.field6399 < this.field6406) {
                this.field6399 = this.field6406;
            }
            long var2 = -1L;
            if (this.field6401 <= this.field6400 && this.field6400 < ((long) this.field6394 + this.field6401)) {
                var2 = this.field6400;
            } else if (this.field6401 >= this.field6400 && this.field6401 < (this.field6400 + ((long) this.field6396))) {
                var2 = this.field6401;
            }
            long var4 = -1L;
            if ((long) this.field6396 + this.field6400 > this.field6401 && (this.field6400 + ((long) this.field6396)) <= (this.field6401 + ((long) this.field6394))) {
                var4 = (long) this.field6396 + this.field6400;
            } else if ((this.field6401 + ((long) this.field6394)) > this.field6400 && (this.field6401 + ((long) this.field6394)) <= ((long) this.field6396 + this.field6400)) {
                var4 = this.field6401 + ((long) this.field6394);
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class252.method1545(this.field6403, (int) (var2 - this.field6400), this.field6417, (int) (var2 - this.field6401), var6);
            }
            this.field6396 = 0;
            this.field6400 = -1L;
        }
        field6414++;
    }
}
