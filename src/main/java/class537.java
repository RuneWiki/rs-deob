import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class537 {

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "J")
    private long field7995 = -1L;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    private int field7990 = 0;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "J")
    private long field8000 = -1L;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "Lhd;")
    private class633 field7997;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "J")
    private long field7982;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "J")
    private long field7983;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "[B")
    private byte[] field8001;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "[B")
    private byte[] field7985;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "J")
    private long field7993;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "Ltda;")
    public static class546 field7986 = new class546(2, 4, 4, 0);

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "[S")
    public static short[] field8005 = new short[256];

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "Ljava/lang/String;")
    public static String field8006 = "";

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "Ljava/lang/String;")
    public static String field8008 = null;

    @OriginalMember(owner = "client!tq", name = "B", descriptor = "Lada;")
    public static class144 field8009 = new class144(58, 8);

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    private int field7984;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field7987;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public static int field7998;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
    public static int field7999;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
    public static int field8002;

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
    public static int field8003;

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "I")
    public static int field8007;

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "J")
    private long field8004;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
    private final void method3251(int arg0) throws IOException {
        field7989++;
        if (arg0 != 4) {
            this.field8000 = -58L;
        }
        if (this.field8000 == -1L) {
            return;
        }
        if (this.field8004 != this.field8000) {
            this.field7997.method3681(this.field8000, -82);
            this.field8004 = this.field8000;
        }
        this.field7997.method3682((byte) -13, this.field8001, this.field7990, 0);
        this.field8004 += this.field7990;
        if (this.field7982 < this.field8004) {
            this.field7982 = this.field8004;
        }
        long var2 = -1L;
        if (this.field8000 >= this.field7995 && (this.field7995 + ((long) this.field7984)) > this.field8000) {
            var2 = this.field8000;
        } else if (this.field7995 >= this.field8000 && this.field7995 < (long) this.field7990 + this.field8000) {
            var2 = this.field7995;
        }
        long var4 = -1L;
        if (this.field7995 < ((long) this.field7990 + this.field8000) && ((long) this.field7990 + this.field8000) <= (this.field7995 + ((long) this.field7984))) {
            var4 = (long) this.field7990 + this.field8000;
        } else if (this.field7995 + ((long) this.field7984) > this.field8000 && ((long) this.field7984 + this.field7995) <= ((long) this.field7990 + this.field8000)) {
            var4 = (long) this.field7984 + this.field7995;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class648.method3737(this.field8001, (int) (var2 - this.field8000), this.field7985, (int) (var2 - this.field7995), var6);
        }
        this.field7990 = 0;
        this.field8000 = -1L;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
    private final void method3252(int arg0) throws IOException {
        if (arg0 < 62) {
            return;
        }
        field7992++;
        this.field7984 = 0;
        if (this.field8004 != this.field7993) {
            this.field7997.method3681(this.field7993, -98);
            this.field8004 = this.field7993;
        }
        this.field7995 = this.field7993;
        while (this.field7984 < this.field7985.length) {
            int var2 = this.field7985.length - this.field7984;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field7997.method3683(115, var2, this.field7984, this.field7985);
            if (var3 == -1) {
                break;
            }
            this.field7984 += var3;
            this.field8004 += var3;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BJ)V")
    public final void method3253(byte arg0, long arg1) throws IOException {
        field7996++;
        if (arg0 < 124) {
            this.method3258(-21);
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method3258(-24));
        }
        this.field7993 = arg1;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBLkda;I)Lfd;")
    public static final class451 method3254(int arg0, byte arg1, class328 arg2, int arg3) {
        if (arg1 == 1) {
            field7988++;
            byte[] var4 = arg2.method1966(arg3, arg0, true);
            return var4 == null ? null : new class451(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)J")
    public final long method3255(byte arg0) {
        field7999++;
        if (arg0 > -43) {
            this.field7984 = -126;
        }
        return this.field7983;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BC)Z")
    public static final boolean method3256(byte arg0, char arg1) {
        if (arg0 <= 62) {
            method3256((byte) -31, 'B');
        }
        field7998++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BZIZI)I")
    public static final int method3257(byte arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field7994++;
        class38 var5 = class487.method2920(arg3, 13993, arg2);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        if (arg0 < 123) {
            return -86;
        }
        while (var5.field466.length > var7) {
            if (var5.field466[var7] >= 0 && class150.field2242.field9095 > var5.field466[var7]) {
                class540 var8 = class150.field2242.method3606((byte) -109, var5.field466[var7]);
                int var9 = var8.method3281(0, class516.field7358.method1274(-44, arg4).field2720, arg4);
                if (arg1) {
                    var6 += var5.field465[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
            var7++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method3258(int arg0) {
        field7991++;
        int var2 = -74 % ((11 - arg0) / 33);
        return this.field7997.method3684(87);
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(I)V")
    public static void method3259(int arg0) {
        field8006 = null;
        if (arg0 != 0) {
            field8008 = null;
        }
        field8005 = null;
        field8009 = null;
        field8008 = null;
        field7986 = null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[BBI)V")
    public final void method3260(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field7987++;
        try {
            if (arg2 > -39) {
                return;
            }
            if (arg1.length < (arg0 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg1.length);
            }
            if (this.field8000 != -1L && this.field8000 <= this.field7993 && ((long) this.field7990 + this.field8000) >= (this.field7993 + ((long) arg3))) {
                class648.method3737(this.field8001, (int) (this.field7993 - this.field8000), arg1, arg0, arg3);
                this.field7993 += arg3;
                return;
            }
            long var5 = this.field7993;
            int var7 = arg0;
            int var8 = arg3;
            if (this.field7995 <= this.field7993 && ((long) this.field7984 + this.field7995) > this.field7993) {
                int var9 = (int) ((long) this.field7984 + this.field7995 - this.field7993);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class648.method3737(this.field7985, (int) (this.field7993 - this.field7995), arg1, arg0, var9);
                arg3 -= var9;
                this.field7993 += var9;
                arg0 += var9;
            }
            if (arg3 > this.field7985.length) {
                this.field7997.method3681(this.field7993, -92);
                this.field8004 = this.field7993;
                while (arg3 > 0) {
                    int var11 = this.field7997.method3683(72, arg3, arg0, arg1);
                    if (var11 == -1) {
                        break;
                    }
                    arg0 += var11;
                    this.field7993 += var11;
                    arg3 -= var11;
                    this.field8004 += var11;
                }
            } else if (arg3 > 0) {
                this.method3252(101);
                int var10 = arg3;
                if (arg3 > this.field7984) {
                    var10 = this.field7984;
                }
                class648.method3737(this.field7985, 0, arg1, arg0, var10);
                this.field7993 += var10;
                arg3 -= var10;
                arg0 += var10;
            }
            if (this.field8000 != -1L) {
                if (this.field8000 > this.field7993 && arg3 > 0) {
                    int var12 = (int) (this.field8000 - this.field7993) + arg0;
                    if ((arg0 + arg3) < var12) {
                        var12 = arg0 + arg3;
                    }
                    while (arg0 < var12) {
                        arg3--;
                        arg1[arg0++] = 0;
                        this.field7993++;
                    }
                }
                long var13 = -1L;
                if (this.field8000 >= var5 && (var5 + ((long) var8)) > this.field8000) {
                    var13 = this.field8000;
                } else if (this.field8000 <= var5 && (long) this.field7990 + this.field8000 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field7990 + this.field8000) > var5 && (this.field8000 + ((long) this.field7990)) <= ((long) var8 + var5)) {
                    var15 = this.field8000 + ((long) this.field7990);
                } else if (this.field8000 < (long) var8 + var5 && (long) this.field7990 + this.field8000 >= (long) var8 + var5) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class648.method3737(this.field8001, (int) (var13 - this.field8000), arg1, var7 + ((int) (var13 - var5)), var17);
                    if (this.field7993 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field7993));
                        this.field7993 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field8004 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB[BI)V")
    public final void method3261(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field8003++;
        try {
            if (arg1 != -52) {
                this.method3258(-76);
            }
            if (((long) arg3 + this.field7993) > this.field7983) {
                this.field7983 = (long) arg3 + this.field7993;
            }
            if (this.field8000 != -1L && (this.field8000 > this.field7993 || this.field7993 > this.field8000 + ((long) this.field7990))) {
                this.method3251(4);
            }
            if (this.field8000 != -1L && (this.field8000 + ((long) this.field8001.length)) < (this.field7993 + ((long) arg3))) {
                int var5 = (int) (-this.field7993 - (-this.field8000 - (long) this.field8001.length));
                class648.method3737(arg2, arg0, this.field8001, (int) (this.field7993 - this.field8000), var5);
                arg0 += var5;
                arg3 -= var5;
                this.field7993 += var5;
                this.field7990 = this.field8001.length;
                this.method3251(4);
            }
            if (arg3 > this.field8001.length) {
                if (this.field8004 != this.field7993) {
                    this.field7997.method3681(this.field7993, -97);
                    this.field8004 = this.field7993;
                }
                this.field7997.method3682((byte) -13, arg2, arg3, arg0);
                this.field8004 += arg3;
                if (this.field7982 < this.field8004) {
                    this.field7982 = this.field8004;
                }
                long var6 = -1L;
                if (this.field7995 <= this.field7993 && this.field7993 < ((long) this.field7984 + this.field7995)) {
                    var6 = this.field7993;
                } else if (this.field7993 <= this.field7995 && this.field7995 < this.field7993 + ((long) arg3)) {
                    var6 = this.field7995;
                }
                long var8 = -1L;
                if (this.field7995 < (this.field7993 + ((long) arg3)) && this.field7993 + ((long) arg3) <= (long) this.field7984 + this.field7995) {
                    var8 = (long) arg3 + this.field7993;
                } else if (this.field7993 < (long) this.field7984 + this.field7995 && ((long) this.field7984 + this.field7995) <= (this.field7993 + ((long) arg3))) {
                    var8 = (long) this.field7984 + this.field7995;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class648.method3737(arg2, (int) (var6 + (long) arg0 - this.field7993), this.field7985, (int) (var6 - this.field7995), var10);
                }
                this.field7993 += arg3;
            } else if (arg3 > 0) {
                if (this.field8000 == -1L) {
                    this.field8000 = this.field7993;
                }
                class648.method3737(arg2, arg0, this.field8001, (int) (this.field7993 - this.field8000), arg3);
                this.field7993 += arg3;
                if (((long) this.field7990) < (this.field7993 - this.field8000)) {
                    this.field7990 = (int) (this.field7993 - this.field8000);
                }
            }
        } catch (IOException var12) {
            this.field8004 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[B)V")
    public final void method3262(int arg0, byte[] arg1) throws IOException {
        if (arg0 != 8) {
            field8007 = 44;
        }
        field8002++;
        this.method3260(0, arg1, (byte) -93, arg1.length);
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lhd;II)V")
    public class537(class633 arg0, int arg1, int arg2) throws IOException {
        this.field7997 = arg0;
        this.field7983 = this.field7982 = arg0.method3686(79);
        this.field8001 = new byte[arg2];
        this.field7985 = new byte[arg1];
        this.field7993 = 0L;
    }
}
