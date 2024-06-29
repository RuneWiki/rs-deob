import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class494 {

    @OriginalMember(owner = "client!no", name = "b", descriptor = "J")
    private long field7293 = -1L;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "J")
    private long field7298 = -1L;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "I")
    private int field7313 = 0;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "Lrv;")
    private class71 field7308;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "J")
    private long field7311;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "J")
    private long field7303;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "J")
    private long field7300;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "[B")
    private byte[] field7309;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "[B")
    private byte[] field7295;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field7297 = 0;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "Lri;")
    public static class73 field7307 = new class73(42, 2);

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    private int field7301;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!no", name = "w", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!no", name = "y", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "J")
    private long field7310;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIZ[B)V", line = 8)
    public final void method2958(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        field7296++;
        try {
            if (arg0 + arg1 > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg0 - arg3.length);
            }
            if (arg2) {
                method2961((byte) -57);
            }
            if (this.field7298 != -1L && this.field7298 <= this.field7300 && (long) this.field7313 + this.field7298 >= (long) arg0 + this.field7300) {
                class520.method3071(this.field7309, (int) (this.field7300 - this.field7298), arg3, arg1, arg0);
                this.field7300 += arg0;
                return;
            }
            long var5 = this.field7300;
            int var7 = arg1;
            int var8 = arg0;
            if (this.field7300 >= this.field7293 && this.field7300 < (long) this.field7301 + this.field7293) {
                int var9 = (int) (-this.field7300 - (-this.field7293 - (long) this.field7301));
                if (arg0 < var9) {
                    var9 = arg0;
                }
                class520.method3071(this.field7295, (int) (this.field7300 - this.field7293), arg3, arg1, var9);
                this.field7300 += var9;
                arg0 -= var9;
                arg1 += var9;
            }
            if (this.field7295.length < arg0) {
                this.field7308.method413(-1, this.field7300);
                this.field7310 = this.field7300;
                while (arg0 > 0) {
                    int var10 = this.field7308.method411(arg1, (byte) -121, arg0, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    arg1 += var10;
                    arg0 -= var10;
                    this.field7300 += var10;
                    this.field7310 += var10;
                }
            } else if (arg0 > 0) {
                this.method2967((byte) -57);
                int var11 = arg0;
                if (this.field7301 < arg0) {
                    var11 = this.field7301;
                }
                class520.method3071(this.field7295, 0, arg3, arg1, var11);
                arg1 += var11;
                arg0 -= var11;
                this.field7300 += var11;
            }
            if (this.field7298 != -1L) {
                if (this.field7300 < this.field7298 && arg0 > 0) {
                    int var12 = (int) (this.field7298 - this.field7300) + arg1;
                    if (var12 > (arg0 + arg1)) {
                        var12 = arg1 + arg0;
                    }
                    while (arg1 < var12) {
                        arg0--;
                        arg3[arg1++] = 0;
                        this.field7300++;
                    }
                }
                long var13 = -1L;
                if (this.field7298 >= var5 && this.field7298 < ((long) var8 + var5)) {
                    var13 = this.field7298;
                } else if (this.field7298 <= var5 && var5 < (long) this.field7313 + this.field7298) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < ((long) this.field7313 + this.field7298) && (long) this.field7313 + this.field7298 <= var5 - -((long) var8)) {
                    var15 = this.field7298 + ((long) this.field7313);
                } else if (((long) var8 + var5) > this.field7298 && (long) this.field7313 + this.field7298 >= var5 - -((long) var8)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class520.method3071(this.field7309, (int) (var13 - this.field7298), arg3, var7 + ((int) (var13 - var5)), var17);
                    if (this.field7300 < var15) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field7300));
                        this.field7300 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field7310 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([BI)V", line = 194)
    public final void method2959(byte[] arg0, int arg1) throws IOException {
        if (arg1 != 78) {
            this.field7310 = 95L;
        }
        this.method2958(arg0.length, 0, false, arg0);
        field7312++;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IJ)V", line = 208)
    public final void method2960(int arg0, long arg1) throws IOException {
        field7306++;
        if ((long) arg0 > arg1) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2964((byte) 38));
        }
        this.field7300 = arg1;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V", line = 219)
    public static final void method2961(byte arg0) {
        class299.field4258.method2601(-21859);
        if (arg0 != 93) {
            field7307 = null;
        }
        field7299++;
        class225.field3302.method512(2);
        class94.field1399.method512(2);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)J", line = 239)
    public final long method2962(int arg0) {
        field7294++;
        if (arg0 >= -53) {
            this.field7313 = -125;
        }
        return this.field7303;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V", line = 252)
    private final void method2963(boolean arg0) throws IOException {
        field7304++;
        if (this.field7298 != -1L) {
            if (this.field7310 != this.field7298) {
                this.field7308.method413(-1, this.field7298);
                this.field7310 = this.field7298;
            }
            this.field7308.method408(this.field7313, 0, -112, this.field7309);
            this.field7310 += this.field7313;
            if (this.field7311 < this.field7310) {
                this.field7311 = this.field7310;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field7298 >= this.field7293 && this.field7298 < ((long) this.field7301 + this.field7293)) {
                var2 = this.field7298;
            } else if (this.field7298 <= this.field7293 && (long) this.field7313 + this.field7298 > this.field7293) {
                var2 = this.field7293;
            }
            if (this.field7293 < ((long) this.field7313 + this.field7298) && (long) this.field7301 + this.field7293 >= (long) this.field7313 + this.field7298) {
                var4 = (long) this.field7313 + this.field7298;
            } else if (((long) this.field7301 + this.field7293) > this.field7298 && this.field7298 + ((long) this.field7313) >= this.field7293 - -((long) this.field7301)) {
                var4 = this.field7293 + ((long) this.field7301);
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class520.method3071(this.field7309, (int) (var2 - this.field7298), this.field7295, (int) (var2 - this.field7293), var6);
            }
            this.field7313 = 0;
            this.field7298 = -1L;
        }
        if (!arg0) {
            method2961((byte) -49);
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lrv;II)V", line = 555)
    public class494(class71 arg0, int arg1, int arg2) throws IOException {
        this.field7308 = arg0;
        this.field7303 = this.field7311 = arg0.method409((byte) -99);
        this.field7300 = 0L;
        this.field7309 = new byte[arg2];
        this.field7295 = new byte[arg1];
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(B)Ljava/io/File;", line = 344)
    private final File method2964(byte arg0) {
        field7315++;
        return arg0 == 38 ? this.field7308.method412(false) : null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II[BI)V", line = 356)
    public final void method2965(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field7305++;
        try {
            if (arg0 != -28186) {
                method2961((byte) 55);
            }
            if (((long) arg1 + this.field7300) > this.field7303) {
                this.field7303 = (long) arg1 + this.field7300;
            }
            if (this.field7298 != -1L && (this.field7300 < this.field7298 || (long) this.field7313 + this.field7298 < this.field7300)) {
                this.method2963(true);
            }
            if (this.field7298 != -1L && ((long) arg1 + this.field7300) > ((long) this.field7309.length + this.field7298)) {
                int var5 = (int) ((long) this.field7309.length + this.field7298 - this.field7300);
                class520.method3071(arg2, arg3, this.field7309, (int) (this.field7300 - this.field7298), var5);
                arg3 += var5;
                this.field7300 += var5;
                arg1 -= var5;
                this.field7313 = this.field7309.length;
                this.method2963(true);
            }
            if (this.field7309.length < arg1) {
                if (this.field7310 != this.field7300) {
                    this.field7308.method413(arg0 ^ 0x6E19, this.field7300);
                    this.field7310 = this.field7300;
                }
                this.field7308.method408(arg1, arg3, -123, arg2);
                this.field7310 += arg1;
                if (this.field7311 < this.field7310) {
                    this.field7311 = this.field7310;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field7300 >= this.field7293 && this.field7293 + ((long) this.field7301) > this.field7300) {
                    var6 = this.field7300;
                } else if (this.field7300 <= this.field7293 && (long) arg1 + this.field7300 > this.field7293) {
                    var6 = this.field7293;
                }
                if (this.field7293 < ((long) arg1 + this.field7300) && ((long) this.field7301 + this.field7293) >= ((long) arg1 + this.field7300)) {
                    var8 = (long) arg1 + this.field7300;
                } else if ((long) this.field7301 + this.field7293 > this.field7300 && this.field7293 + ((long) this.field7301) <= (long) arg1 + this.field7300) {
                    var8 = (long) this.field7301 + this.field7293;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class520.method3071(arg2, (int) ((long) arg3 + var6 - this.field7300), this.field7295, (int) (var6 - this.field7293), var10);
                }
                this.field7300 += arg1;
            } else if (arg1 > 0) {
                if (this.field7298 == -1L) {
                    this.field7298 = this.field7300;
                }
                class520.method3071(arg2, arg3, this.field7309, (int) (this.field7300 - this.field7298), arg1);
                this.field7300 += arg1;
                if ((this.field7300 - this.field7298) > ((long) this.field7313)) {
                    this.field7313 = (int) (this.field7300 - this.field7298);
                }
            }
        } catch (IOException var12) {
            this.field7310 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V", line = 480)
    public static void method2966(int arg0) {
        field7307 = null;
        if (arg0 != 7926) {
            field7297 = -69;
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(B)V", line = 512)
    private final void method2967(byte arg0) throws IOException {
        this.field7301 = 0;
        field7314++;
        if (this.field7310 != this.field7300) {
            this.field7308.method413(-1, this.field7300);
            this.field7310 = this.field7300;
        }
        if (arg0 != -57) {
            return;
        }
        this.field7293 = this.field7300;
        while (this.field7301 < this.field7295.length) {
            int var2 = this.field7295.length - this.field7301;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field7308.method411(this.field7301, (byte) -83, var2, this.field7295);
            if (var3 == -1) {
                break;
            }
            this.field7301 += var3;
            this.field7310 += var3;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIC)C", line = 574)
    public static final char method2968(int arg0, int arg1, char arg2) {
        field7302++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 == 'Ñ' && arg0 != 0) {
                return 'N';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 == 'ñ' && arg0 != 0) {
                return 'n';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else if (arg1 > -45) {
            return (char) 65455;
        } else {
            return arg2;
        }
    }
}
