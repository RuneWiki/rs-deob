import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class197 {

    @OriginalMember(owner = "client!hga", name = "s", descriptor = "J")
    private long field2977 = -1L;

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "J")
    private long field2964 = -1L;

    @OriginalMember(owner = "client!hga", name = "t", descriptor = "I")
    private int field2978 = 0;

    @OriginalMember(owner = "client!hga", name = "p", descriptor = "Lji;")
    private class694 field2974;

    @OriginalMember(owner = "client!hga", name = "n", descriptor = "J")
    private long field2972;

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "J")
    private long field2968;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "[B")
    private byte[] field2965;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "[B")
    private byte[] field2966;

    @OriginalMember(owner = "client!hga", name = "x", descriptor = "J")
    private long field2982;

    @OriginalMember(owner = "client!hga", name = "l", descriptor = "[Lnf;")
    public static class138[] field2970 = new class138[2048];

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
    private int field2960;

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!hga", name = "k", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!hga", name = "m", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!hga", name = "q", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!hga", name = "r", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!hga", name = "u", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!hga", name = "w", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!hga", name = "v", descriptor = "J")
    private long field2980;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZ[BI)V", line = 7)
    public final void method1397(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        field2973++;
        try {
            if (arg3 + arg0 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg2.length);
            }
            if (arg1) {
                return;
            }
            if (this.field2964 != -1L && this.field2982 >= this.field2964 && ((long) this.field2978 + this.field2964) >= (this.field2982 + ((long) arg0))) {
                class171.method1263(this.field2966, (int) (this.field2982 - this.field2964), arg2, arg3, arg0);
                this.field2982 += arg0;
                return;
            }
            long var5 = this.field2982;
            int var7 = arg3;
            int var8 = arg0;
            if (this.field2982 >= this.field2977 && this.field2982 < ((long) this.field2960 + this.field2977)) {
                int var9 = (int) (this.field2977 + (long) this.field2960 - this.field2982);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class171.method1263(this.field2965, (int) (this.field2982 - this.field2977), arg2, arg3, var9);
                arg3 += var9;
                this.field2982 += var9;
                arg0 -= var9;
            }
            if (arg0 > this.field2965.length) {
                this.field2974.method3899(this.field2982, (byte) 67);
                this.field2980 = this.field2982;
                while (arg0 > 0) {
                    int var11 = this.field2974.method3904(arg3, arg0, arg2, -51);
                    if (var11 == -1) {
                        break;
                    }
                    this.field2982 += var11;
                    this.field2980 += var11;
                    arg0 -= var11;
                    arg3 += var11;
                }
            } else if (arg0 > 0) {
                this.method1408(-5155);
                int var10 = arg0;
                if (arg0 > this.field2960) {
                    var10 = this.field2960;
                }
                class171.method1263(this.field2965, 0, arg2, arg3, var10);
                this.field2982 += var10;
                arg3 += var10;
                arg0 -= var10;
            }
            if (this.field2964 != -1L) {
                if (this.field2964 > this.field2982 && arg0 > 0) {
                    int var12 = (int) (this.field2964 - this.field2982) + arg3;
                    if ((arg0 + arg3) < var12) {
                        var12 = arg0 + arg3;
                    }
                    while (arg3 < var12) {
                        arg2[arg3++] = 0;
                        arg0--;
                        this.field2982++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field2964 >= var5 && ((long) var8 + var5) > this.field2964) {
                    var13 = this.field2964;
                } else if (var5 >= this.field2964 && var5 < (long) this.field2978 + this.field2964) {
                    var13 = var5;
                }
                if ((long) this.field2978 + this.field2964 > var5 && ((long) this.field2978 + this.field2964) <= (var5 + ((long) var8))) {
                    var15 = (long) this.field2978 + this.field2964;
                } else if ((var5 + ((long) var8)) > this.field2964 && var5 + ((long) var8) <= this.field2964 - -((long) this.field2978)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class171.method1263(this.field2966, (int) (var13 - this.field2964), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field2982 < var15) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field2982));
                        this.field2982 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2980 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V", line = 196)
    private final void method1398(byte arg0) throws IOException {
        field2971++;
        if (arg0 != -119) {
            this.field2977 = 51L;
        }
        if (this.field2964 == -1L) {
            return;
        }
        if (this.field2980 != this.field2964) {
            this.field2974.method3899(this.field2964, (byte) 67);
            this.field2980 = this.field2964;
        }
        this.field2974.method3898(this.field2966, (byte) 80, this.field2978, 0);
        this.field2980 += this.field2978;
        if (this.field2980 > this.field2972) {
            this.field2972 = this.field2980;
        }
        long var2 = -1L;
        if (this.field2977 <= this.field2964 && (long) this.field2960 + this.field2977 > this.field2964) {
            var2 = this.field2964;
        } else if (this.field2964 <= this.field2977 && this.field2977 < this.field2964 + ((long) this.field2978)) {
            var2 = this.field2977;
        }
        long var4 = -1L;
        if (this.field2977 < (this.field2964 + ((long) this.field2978)) && ((long) this.field2960 + this.field2977) >= ((long) this.field2978 + this.field2964)) {
            var4 = (long) this.field2978 + this.field2964;
        } else if (this.field2964 < ((long) this.field2960 + this.field2977) && (long) this.field2960 + this.field2977 <= (long) this.field2978 + this.field2964) {
            var4 = (long) this.field2960 + this.field2977;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class171.method1263(this.field2966, (int) (var2 - this.field2964), this.field2965, (int) (var2 - this.field2977), var6);
        }
        this.field2964 = -1L;
        this.field2978 = 0;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)Ljava/io/File;", line = 275)
    private final File method1399(int arg0) {
        if (arg0 == 0) {
            field2979++;
            return this.field2974.method3902(-1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(JB)V", line = 286)
    public final void method1400(long arg0, byte arg1) throws IOException {
        if (arg1 != 2) {
            field2959 = -91;
        }
        field2967++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1399(0));
        }
        this.field2982 = arg0;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(III[B)V", line = 304)
    public final void method1401(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2962++;
        try {
            if (this.field2968 < (long) arg0 + this.field2982) {
                this.field2968 = (long) arg0 + this.field2982;
            }
            if (this.field2964 != -1L && (this.field2964 > this.field2982 || this.field2982 > ((long) this.field2978 + this.field2964))) {
                this.method1398((byte) -119);
            }
            if (this.field2964 != -1L && ((long) arg0 + this.field2982) > ((long) this.field2966.length + this.field2964)) {
                int var5 = (int) ((long) this.field2966.length + this.field2964 - this.field2982);
                class171.method1263(arg3, arg1, this.field2966, (int) (this.field2982 - this.field2964), var5);
                arg1 += var5;
                arg0 -= var5;
                this.field2982 += var5;
                this.field2978 = this.field2966.length;
                this.method1398((byte) -119);
            }
            if (this.field2966.length < arg0) {
                if (this.field2982 != this.field2980) {
                    this.field2974.method3899(this.field2982, (byte) 67);
                    this.field2980 = this.field2982;
                }
                this.field2974.method3898(arg3, (byte) -126, arg0, arg1);
                this.field2980 += arg0;
                if (this.field2972 < this.field2980) {
                    this.field2972 = this.field2980;
                }
                long var6 = -1L;
                if (this.field2977 <= this.field2982 && ((long) this.field2960 + this.field2977) > this.field2982) {
                    var6 = this.field2982;
                } else if (this.field2982 <= this.field2977 && this.field2977 < (long) arg0 + this.field2982) {
                    var6 = this.field2977;
                }
                long var8 = -1L;
                if (this.field2977 < (long) arg0 + this.field2982 && (long) this.field2960 + this.field2977 >= (long) arg0 + this.field2982) {
                    var8 = this.field2982 + ((long) arg0);
                } else if (this.field2982 < ((long) this.field2960 + this.field2977) && (long) this.field2960 + this.field2977 <= (long) arg0 + this.field2982) {
                    var8 = (long) this.field2960 + this.field2977;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class171.method1263(arg3, (int) ((long) arg1 + var6 - this.field2982), this.field2965, (int) (var6 - this.field2977), var10);
                }
                this.field2982 += arg0;
            } else if (~arg0 < arg2) {
                if (this.field2964 == -1L) {
                    this.field2964 = this.field2982;
                }
                class171.method1263(arg3, arg1, this.field2966, (int) (this.field2982 - this.field2964), arg0);
                this.field2982 += arg0;
                if (((long) this.field2978) < (this.field2982 - this.field2964)) {
                    this.field2978 = (int) (this.field2982 - this.field2964);
                }
            }
        } catch (IOException var12) {
            this.field2980 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)V", line = 429)
    public final void method1402(boolean arg0) throws IOException {
        if (arg0) {
            this.field2966 = null;
        }
        field2981++;
        this.method1398((byte) -119);
        this.field2974.method3900(113);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(B[B)V", line = 449)
    public final void method1403(byte arg0, byte[] arg1) throws IOException {
        int var3 = 119 / ((arg0 - 17) / 62);
        this.method1397(arg1.length, false, arg1, 0);
        field2975++;
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(B)J", line = 466)
    public final long method1404(byte arg0) {
        field2961++;
        return arg0 == 97 ? this.field2968 : 20L;
    }

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "(B)V", line = 479)
    public static void method1405(byte arg0) {
        field2970 = null;
        if (arg0 < 118) {
            field2970 = null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lji;II)V", line = 603)
    public class197(class694 arg0, int arg1, int arg2) throws IOException {
        this.field2974 = arg0;
        this.field2968 = this.field2972 = arg0.method3896(-8486);
        this.field2965 = new byte[arg1];
        this.field2966 = new byte[arg2];
        this.field2982 = 0L;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(ZIIIIIII)V", line = 493)
    public static final void method1406(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if ((arg0 ? class420.field5820.field9451.method1367(17539) : class420.field5820.field9448.method1367(17539)) != 0 && arg5 != 0 && class57.field884 < 50 && arg4 != -1) {
            class278.field4014[class57.field884++] = new class420((byte) (arg0 ? 3 : 2), arg4, arg5, arg2, arg7, arg3, arg6, null);
        }
        if (arg1 == -12468) {
            field2963++;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(BLjava/lang/Object;Z)[B", line = 511)
    public static final byte[] method1407(byte arg0, Object arg1, boolean arg2) {
        field2969++;
        if (arg1 == null) {
            return null;
        } else if (arg0 < 42) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class134.method1120(true, var3) : var3;
        } else if (arg1 instanceof class637) {
            class637 var4 = (class637) arg1;
            return var4.method1476((byte) -56);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)V", line = 546)
    private final void method1408(int arg0) throws IOException {
        if (arg0 != -5155) {
            this.field2968 = -120L;
        }
        this.field2960 = 0;
        field2976++;
        if (this.field2982 != this.field2980) {
            this.field2974.method3899(this.field2982, (byte) 67);
            this.field2980 = this.field2982;
        }
        this.field2977 = this.field2982;
        while (this.field2965.length > this.field2960) {
            int var2 = this.field2965.length - this.field2960;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2974.method3904(this.field2960, var2, this.field2965, arg0 ^ 0xFFFFEBA1);
            if (var3 == -1) {
                break;
            }
            this.field2980 += var3;
            this.field2960 += var3;
        }
    }
}
