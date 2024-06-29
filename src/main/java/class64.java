import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class64 {

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "J")
    private long field948 = -1L;

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "J")
    private long field949 = -1L;

    @OriginalMember(owner = "client!jt", name = "x", descriptor = "I")
    private int field962 = 0;

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "Lde;")
    private class353 field951;

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "J")
    private long field950;

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "J")
    private long field954;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "[B")
    private byte[] field939;

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "J")
    private long field955;

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "[B")
    private byte[] field957;

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "Lwt;")
    public static class194 field956 = new class194("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "Lgn;")
    public static class475 field960 = new class475(11, 7);

    @OriginalMember(owner = "client!jt", name = "y", descriptor = "I")
    public static int field963 = 10;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
    private int field959;

    @OriginalMember(owner = "client!jt", name = "w", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "J")
    private long field944;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(JI)V")
    public final void method445(long arg0, int arg1) throws IOException {
        if (arg1 >= -50) {
            return;
        }
        field952++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method452(true));
        }
        this.field955 = arg0;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
    private final void method446(int arg0) throws IOException {
        if (this.field948 != -1L) {
            if (this.field948 != this.field944) {
                this.field951.method2144(this.field948, (byte) -105);
                this.field944 = this.field948;
            }
            this.field951.method2140(this.field962, 1, 0, this.field957);
            this.field944 += this.field962;
            if (this.field944 > this.field950) {
                this.field950 = this.field944;
            }
            long var2 = -1L;
            if (this.field949 <= this.field948 && this.field948 < (long) this.field959 + this.field949) {
                var2 = this.field948;
            } else if (this.field949 >= this.field948 && this.field949 < ((long) this.field962 + this.field948)) {
                var2 = this.field949;
            }
            long var4 = -1L;
            if (this.field949 < (this.field948 + ((long) this.field962)) && (long) this.field962 + this.field948 <= (long) this.field959 + this.field949) {
                var4 = (long) this.field962 + this.field948;
            } else if (this.field949 + ((long) this.field959) > this.field948 && this.field948 + ((long) this.field962) >= this.field949 - -((long) this.field959)) {
                var4 = (long) this.field959 + this.field949;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class268.method1638(this.field957, (int) (var2 - this.field948), this.field939, (int) (var2 - this.field949), var6);
            }
            this.field962 = 0;
            this.field948 = -1L;
        }
        field942++;
        int var7 = -48 / ((15 - arg0) / 57);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V")
    private final void method447(boolean arg0) throws IOException {
        if (arg0) {
            this.field962 = -30;
        }
        this.field959 = 0;
        field941++;
        if (this.field955 != this.field944) {
            this.field951.method2144(this.field955, (byte) -119);
            this.field944 = this.field955;
        }
        this.field949 = this.field955;
        while (this.field959 < this.field939.length) {
            int var2 = this.field939.length - this.field959;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field951.method2139(this.field939, var2, this.field959, (byte) 79);
            if (var3 == -1) {
                break;
            }
            this.field944 += var3;
            this.field959 += var3;
        }
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)J")
    public final long method448(int arg0) {
        if (arg0 != -912076561) {
            this.method448(29);
        }
        field953++;
        return this.field954;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V")
    public static final void method449(int arg0, int arg1) {
        if (arg1 >= 80) {
            field958++;
            class338 var2 = class380.method2294((byte) 123, arg0, 6);
            var2.method2048(124);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II[BI)V")
    public final void method450(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field947++;
        try {
            if (arg2.length < (arg0 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg2.length);
            }
            if (arg1 != 20569) {
                this.field944 = -89L;
            }
            if (this.field948 != -1L && this.field948 <= this.field955 && (long) arg3 + this.field955 <= (long) this.field962 + this.field948) {
                class268.method1638(this.field957, (int) (this.field955 - this.field948), arg2, arg0, arg3);
                this.field955 += arg3;
                return;
            }
            long var5 = this.field955;
            int var7 = arg0;
            int var8 = arg3;
            if (this.field949 <= this.field955 && ((long) this.field959 + this.field949) > this.field955) {
                int var9 = (int) (this.field949 + (long) this.field959 - this.field955);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class268.method1638(this.field939, (int) (this.field955 - this.field949), arg2, arg0, var9);
                arg3 -= var9;
                arg0 += var9;
                this.field955 += var9;
            }
            if (this.field939.length < arg3) {
                this.field951.method2144(this.field955, (byte) -109);
                this.field944 = this.field955;
                while (arg3 > 0) {
                    int var10 = this.field951.method2139(arg2, arg3, arg0, (byte) -128);
                    if (var10 == -1) {
                        break;
                    }
                    this.field955 += var10;
                    arg3 -= var10;
                    arg0 += var10;
                    this.field944 += var10;
                }
            } else if (arg3 > 0) {
                this.method447(false);
                int var11 = arg3;
                if (arg3 > this.field959) {
                    var11 = this.field959;
                }
                class268.method1638(this.field939, 0, arg2, arg0, var11);
                arg0 += var11;
                this.field955 += var11;
                arg3 -= var11;
            }
            if (this.field948 != -1L) {
                if (this.field955 < this.field948 && arg3 > 0) {
                    int var12 = (int) (this.field948 - this.field955) + arg0;
                    if (var12 > (arg0 + arg3)) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg0) {
                        arg3--;
                        arg2[arg0++] = 0;
                        this.field955++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field948 >= var5 && this.field948 < ((long) var8 + var5)) {
                    var13 = this.field948;
                } else if (var5 >= this.field948 && var5 < (long) this.field962 + this.field948) {
                    var13 = var5;
                }
                if (var5 < (long) this.field962 + this.field948 && (long) this.field962 + this.field948 <= var5 - -((long) var8)) {
                    var15 = (long) this.field962 + this.field948;
                } else if (this.field948 < ((long) var8 + var5) && (long) var8 + var5 <= (long) this.field962 + this.field948) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class268.method1638(this.field957, (int) (var13 - this.field948), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field955 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field955));
                        this.field955 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field944 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field946++;
        int var8 = arg2 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class146.field1892 + ((class27.field445 - class146.field1892) * var8 / 100);
        if (arg7 != 13) {
            return;
        }
        int var10 = arg3 * var9 >> 8;
        int var11 = 16384 - arg5 & 0x3FFF;
        int var12 = 16384 - arg0 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class323.field4731[var11] * -var10 >> 15;
            var15 = class323.field4733[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class323.field4731[var12] * var15 >> 15;
            var15 = class323.field4733[var12] * var15 >> 15;
        }
        class236.field3317 = 0;
        class317.field4653 = arg5;
        class432.field6338 = arg4 - var14;
        class282.field4026 = arg1 - var15;
        class205.field2843 = arg6 - var13;
        class21.field284 = arg0;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(Z)Ljava/io/File;")
    private final File method452(boolean arg0) {
        field961++;
        if (!arg0) {
            method455((byte) 18);
        }
        return this.field951.method2143(0);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I[BII)V")
    public final void method453(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field945++;
        try {
            if (((long) arg0 + this.field955) > this.field954) {
                this.field954 = (long) arg0 + this.field955;
            }
            if (this.field948 != -1L && (this.field955 < this.field948 || (long) this.field962 + this.field948 < this.field955)) {
                this.method446(127);
            }
            if (this.field948 != -1L && ((long) arg0 + this.field955) > (this.field948 + ((long) this.field957.length))) {
                int var5 = (int) (this.field948 + (long) this.field957.length - this.field955);
                class268.method1638(arg1, arg3, this.field957, (int) (this.field955 - this.field948), var5);
                this.field955 += var5;
                arg0 -= var5;
                arg3 += var5;
                this.field962 = this.field957.length;
                this.method446(96);
            }
            if (arg0 > this.field957.length) {
                if (this.field955 != this.field944) {
                    this.field951.method2144(this.field955, (byte) -124);
                    this.field944 = this.field955;
                }
                this.field951.method2140(arg0, arg2 - 31057, arg3, arg1);
                this.field944 += arg0;
                if (this.field950 < this.field944) {
                    this.field950 = this.field944;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field949 <= this.field955 && this.field955 < ((long) this.field959 + this.field949)) {
                    var6 = this.field955;
                } else if (this.field955 <= this.field949 && (this.field955 + ((long) arg0)) > this.field949) {
                    var6 = this.field949;
                }
                if (this.field949 < (long) arg0 + this.field955 && (long) this.field959 + this.field949 >= (long) arg0 + this.field955) {
                    var8 = (long) arg0 + this.field955;
                } else if (this.field955 < (long) this.field959 + this.field949 && (long) this.field959 + this.field949 <= this.field955 - -((long) arg0)) {
                    var8 = this.field949 + ((long) this.field959);
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class268.method1638(arg1, (int) ((long) arg3 + var6 - this.field955), this.field939, (int) (var6 - this.field949), var10);
                }
                this.field955 += arg0;
            } else if (arg0 > 0) {
                if (this.field948 == -1L) {
                    this.field948 = this.field955;
                }
                class268.method1638(arg1, arg3, this.field957, (int) (this.field955 - this.field948), arg0);
                this.field955 += arg0;
                if ((long) this.field962 < this.field955 - this.field948) {
                    this.field962 = (int) (this.field955 - this.field948);
                }
            } else if (arg2 != 31058) {
                method449(11, -92);
            }
        } catch (IOException var12) {
            this.field944 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I[B)V")
    public final void method454(int arg0, byte[] arg1) throws IOException {
        field943++;
        this.method450(0, 20569, arg1, arg1.length);
        int var3 = -79 % ((arg0 + 29) / 60);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
    public static void method455(byte arg0) {
        int var1 = -53 / ((69 - arg0) / 43);
        field956 = null;
        field960 = null;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lde;II)V")
    public class64(class353 arg0, int arg1, int arg2) throws IOException {
        this.field951 = arg0;
        this.field954 = this.field950 = arg0.method2142((byte) -17);
        this.field939 = new byte[arg1];
        this.field955 = 0L;
        this.field957 = new byte[arg2];
    }
}
