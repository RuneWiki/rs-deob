import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class208 {

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "J")
    private long field2924 = -1L;

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "I")
    private int field2936 = 0;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "J")
    private long field2923 = -1L;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "Lpk;")
    private class181 field2931;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "J")
    private long field2930;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "J")
    private long field2934;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "[B")
    private byte[] field2926;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "J")
    private long field2932;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "[B")
    private byte[] field2919;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "[I")
    public static int[] field2927 = new int[4];

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    private int field2935;

    @OriginalMember(owner = "client!rt", name = "u", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!rt", name = "v", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "J")
    private long field2925;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[BIB)V", line = 5)
    public final void method1345(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field2922++;
        try {
            if (this.field2934 < ((long) arg2 + this.field2932)) {
                this.field2934 = (long) arg2 + this.field2932;
            }
            if (this.field2924 != -1L && (this.field2932 < this.field2924 || (long) this.field2936 + this.field2924 < this.field2932)) {
                this.method1348((byte) -56);
            }
            if (this.field2924 != -1L && (long) arg2 + this.field2932 > (long) this.field2926.length + this.field2924) {
                int var5 = (int) (this.field2924 + (long) this.field2926.length - this.field2932);
                class359.method2053(arg1, arg0, this.field2926, (int) (this.field2932 - this.field2924), var5);
                this.field2932 += var5;
                arg0 += var5;
                arg2 -= var5;
                this.field2936 = this.field2926.length;
                this.method1348((byte) -39);
            }
            if (arg3 != -12) {
                this.method1346(-19);
            }
            if (this.field2926.length < arg2) {
                if (this.field2932 != this.field2925) {
                    this.field2931.method1247((byte) 75, this.field2932);
                    this.field2925 = this.field2932;
                }
                this.field2931.method1242(-125, arg1, arg2, arg0);
                this.field2925 += arg2;
                if (this.field2925 > this.field2930) {
                    this.field2930 = this.field2925;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field2923 <= this.field2932 && ((long) this.field2935 + this.field2923) > this.field2932) {
                    var6 = this.field2932;
                } else if (this.field2923 >= this.field2932 && ((long) arg2 + this.field2932) > this.field2923) {
                    var6 = this.field2923;
                }
                if ((long) arg2 + this.field2932 > this.field2923 && (this.field2932 + ((long) arg2)) <= ((long) this.field2935 + this.field2923)) {
                    var8 = (long) arg2 + this.field2932;
                } else if (((long) this.field2935 + this.field2923) > this.field2932 && ((long) arg2 + this.field2932) >= ((long) this.field2935 + this.field2923)) {
                    var8 = (long) this.field2935 + this.field2923;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class359.method2053(arg1, (int) ((long) arg0 + var6 - this.field2932), this.field2919, (int) (var6 - this.field2923), var10);
                }
                this.field2932 += arg2;
            } else if (arg2 > 0) {
                if (this.field2924 == -1L) {
                    this.field2924 = this.field2932;
                }
                class359.method2053(arg1, arg0, this.field2926, (int) (this.field2932 - this.field2924), arg2);
                this.field2932 += arg2;
                if (((long) this.field2936) < (this.field2932 - this.field2924)) {
                    this.field2936 = (int) (this.field2932 - this.field2924);
                }
            }
        } catch (IOException var12) {
            this.field2925 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)J", line = 133)
    public final long method1346(int arg0) {
        if (arg0 != 4650) {
            method1352((byte) -72);
        }
        field2938++;
        return this.field2934;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZJ)V", line = 146)
    public final void method1347(boolean arg0, long arg1) throws IOException {
        field2920++;
        if (!arg0) {
            this.method1349(89);
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1349(0));
        }
        this.field2932 = arg1;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V", line = 160)
    private final void method1348(byte arg0) throws IOException {
        field2937++;
        if (arg0 > -15) {
            this.method1346(-9);
        }
        if (this.field2924 == -1L) {
            return;
        }
        if (this.field2925 != this.field2924) {
            this.field2931.method1247((byte) -82, this.field2924);
            this.field2925 = this.field2924;
        }
        this.field2931.method1242(-100, this.field2926, this.field2936, 0);
        this.field2925 += this.field2936;
        if (this.field2930 < this.field2925) {
            this.field2930 = this.field2925;
        }
        long var2 = -1L;
        if (this.field2924 >= this.field2923 && (long) this.field2935 + this.field2923 > this.field2924) {
            var2 = this.field2924;
        } else if (this.field2923 >= this.field2924 && ((long) this.field2936 + this.field2924) > this.field2923) {
            var2 = this.field2923;
        }
        long var4 = -1L;
        if ((this.field2924 + ((long) this.field2936)) > this.field2923 && (long) this.field2935 + this.field2923 >= (long) this.field2936 + this.field2924) {
            var4 = this.field2924 + ((long) this.field2936);
        } else if ((this.field2923 + ((long) this.field2935)) > this.field2924 && ((long) this.field2936 + this.field2924) >= (this.field2923 + ((long) this.field2935))) {
            var4 = (long) this.field2935 + this.field2923;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class359.method2053(this.field2926, (int) (var2 - this.field2924), this.field2919, (int) (var2 - this.field2923), var6);
        }
        this.field2924 = -1L;
        this.field2936 = 0;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)Ljava/io/File;", line = 235)
    private final File method1349(int arg0) {
        if (arg0 == 0) {
            field2933++;
            return this.field2931.method1249(-6111);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "([BIII)V", line = 251)
    public final void method1350(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2929++;
        try {
            if (arg0.length < arg2 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (this.field2924 != -1L && this.field2924 <= this.field2932 && ((long) this.field2936 + this.field2924) >= (this.field2932 + ((long) arg3))) {
                class359.method2053(this.field2926, (int) (this.field2932 - this.field2924), arg0, arg2, arg3);
                this.field2932 += arg3;
                return;
            }
            long var5 = this.field2932;
            int var7 = arg2;
            int var8 = arg3;
            if (this.field2932 >= this.field2923 && this.field2932 < (long) this.field2935 + this.field2923) {
                int var9 = (int) ((long) this.field2935 - (this.field2932 - this.field2923));
                if (arg3 < var9) {
                    var9 = arg3;
                }
                class359.method2053(this.field2919, (int) (this.field2932 - this.field2923), arg0, arg2, var9);
                arg3 -= var9;
                arg2 += var9;
                this.field2932 += var9;
            }
            if (this.field2919.length < arg3) {
                this.field2931.method1247((byte) -92, this.field2932);
                this.field2925 = this.field2932;
                while (arg3 > 0) {
                    int var10 = this.field2931.method1245(48, arg0, arg3, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 -= var10;
                    this.field2932 += var10;
                    this.field2925 += var10;
                    arg2 += var10;
                }
            } else if (arg3 > 0) {
                this.method1354(false);
                int var11 = arg3;
                if (arg3 > this.field2935) {
                    var11 = this.field2935;
                }
                class359.method2053(this.field2919, 0, arg0, arg2, var11);
                arg2 += var11;
                this.field2932 += var11;
                arg3 -= var11;
            }
            if (this.field2924 != -1L) {
                if (this.field2932 < this.field2924 && arg3 > 0) {
                    int var12 = (int) (this.field2924 - this.field2932) + arg2;
                    if ((arg2 + arg3) < var12) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg2) {
                        arg3--;
                        arg0[arg2++] = 0;
                        this.field2932++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field2924 >= var5 && ((long) var8 + var5) > this.field2924) {
                    var13 = this.field2924;
                } else if (var5 >= this.field2924 && var5 < (long) this.field2936 + this.field2924) {
                    var13 = var5;
                }
                if (var5 < (this.field2924 + ((long) this.field2936)) && (this.field2924 + ((long) this.field2936)) <= ((long) var8 + var5)) {
                    var15 = (long) this.field2936 + this.field2924;
                } else if ((long) var8 + var5 > this.field2924 && (var5 + ((long) var8)) <= ((long) this.field2936 + this.field2924)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class359.method2053(this.field2926, (int) (var13 - this.field2924), arg0, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field2932) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field2932));
                        this.field2932 = var15;
                    }
                }
            }
        } catch (IOException var20) {
            this.field2925 = -1L;
            throw var20;
        }
        int var19 = 32 / ((arg1 + 56) / 60);
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[B)V", line = 435)
    public final void method1351(int arg0, byte[] arg1) throws IOException {
        field2918++;
        this.method1350(arg1, arg0 - 127, arg0, arg1.length);
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lpk;II)V", line = 502)
    public class208(class181 arg0, int arg1, int arg2) throws IOException {
        this.field2931 = arg0;
        this.field2934 = this.field2930 = arg0.method1244(0);
        this.field2926 = new byte[arg2];
        this.field2932 = 0L;
        this.field2919 = new byte[arg1];
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V", line = 460)
    public static void method1352(byte arg0) {
        field2927 = null;
        if (arg0 >= -92) {
            method1352((byte) 1);
        }
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)V", line = 488)
    public final void method1353(byte arg0) throws IOException {
        this.method1348((byte) -19);
        field2921++;
        this.field2931.method1248(0);
        if (arg0 < 95) {
            field2927 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V", line = 520)
    private final void method1354(boolean arg0) throws IOException {
        field2917++;
        this.field2935 = 0;
        if (this.field2932 != this.field2925) {
            this.field2931.method1247((byte) 90, this.field2932);
            this.field2925 = this.field2932;
        }
        this.field2923 = this.field2932;
        while (this.field2919.length > this.field2935) {
            int var2 = this.field2919.length - this.field2935;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2931.method1245(95, this.field2919, var2, this.field2935);
            if (var3 == -1) {
                break;
            }
            this.field2935 += var3;
            this.field2925 += var3;
        }
        if (!arg0) {
            ;
        }
    }
}
