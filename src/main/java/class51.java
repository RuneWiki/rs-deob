import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class51 {

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "J")
    private long field1004 = -1L;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    private int field1011 = 0;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "J")
    private long field1018 = -1L;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "Lje;")
    private class68 field1005;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "J")
    private long field994;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "J")
    private long field1015;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "[B")
    private byte[] field1016;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "J")
    private long field1008;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "[B")
    private byte[] field1013;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "[F")
    public static float[] field1003 = new float[4];

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "Lmh;")
    public static class128 field998 = class22.method156(124, "<col=80ff00>");

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "Lmh;")
    public static class128 field1012 = class22.method156(127, "Texturen geladen)3");

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "Z")
    public static boolean field1009 = false;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    private int field1002;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "J")
    private long field993;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "Z")
    public static boolean field1000;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Ljava/io/File;", line = 9)
    private final File method345(int arg0) {
        field996++;
        if (arg0 != 12771) {
            method351(true);
        }
        return this.field1005.method456((byte) 86);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V", line = 27)
    private final void method346(int arg0) throws IOException {
        this.field1002 = 0;
        if (this.field993 != this.field1008) {
            this.field1005.method458(this.field1008, -26545);
            this.field993 = this.field1008;
        }
        if (arg0 != 24468) {
            this.field1005 = (class68) null;
        }
        this.field1004 = this.field1008;
        field1001++;
        while (this.field1016.length > this.field1002) {
            int var2 = this.field1016.length - this.field1002;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1005.method455(this.field1016, 0, this.field1002, var2);
            if (var3 == -1) {
                break;
            }
            this.field993 += (long) var3;
            this.field1002 += var3;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BII[B)V", line = 68)
    public final void method347(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1017++;
        try {
            if (this.field1015 < (this.field1008 + ((long) arg2))) {
                this.field1015 = (long) arg2 + this.field1008;
            }
            if (this.field1018 != -1L && (this.field1018 > this.field1008 || ((long) this.field1011 + this.field1018) < this.field1008)) {
                this.method354(0);
            }
            if (this.field1018 != -1L && (long) this.field1013.length + this.field1018 < (long) arg2 + this.field1008) {
                int var5 = (int) ((long) this.field1013.length + this.field1018 - this.field1008);
                arg2 -= var5;
                class224.method1546(arg3, arg1, this.field1013, (int) (this.field1008 - this.field1018), var5);
                arg1 += var5;
                this.field1008 += (long) var5;
                this.field1011 = this.field1013.length;
                this.method354(0);
            }
            if (arg2 > this.field1013.length) {
                if (this.field993 != this.field1008) {
                    this.field1005.method458(this.field1008, -26545);
                    this.field993 = this.field1008;
                }
                this.field1005.method453(arg3, (byte) -117, arg1, arg2);
                long var6 = -1L;
                this.field993 += (long) arg2;
                if (this.field993 > this.field994) {
                    this.field994 = this.field993;
                }
                long var8 = -1L;
                if (((long) arg2 + this.field1008) > this.field1004 && (this.field1008 + ((long) arg2)) <= (this.field1004 + ((long) this.field1002))) {
                    var8 = (long) arg2 + this.field1008;
                } else if (this.field1008 < (long) this.field1002 + this.field1004 && this.field1004 + ((long) this.field1002) <= (long) arg2 + this.field1008) {
                    var8 = (long) this.field1002 + this.field1004;
                }
                if (this.field1004 <= this.field1008 && (long) this.field1002 + this.field1004 > this.field1008) {
                    var6 = this.field1008;
                } else if (this.field1008 <= this.field1004 && this.field1004 < (this.field1008 + ((long) arg2))) {
                    var6 = this.field1004;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class224.method1546(arg3, (int) ((long) arg1 - (this.field1008 - var6)), this.field1016, (int) (var6 - this.field1004), var10);
                }
                this.field1008 += (long) arg2;
            } else if (arg0 < -86 && arg2 > 0) {
                if (this.field1018 == -1L) {
                    this.field1018 = this.field1008;
                }
                class224.method1546(arg3, arg1, this.field1013, (int) (this.field1008 - this.field1018), arg2);
                this.field1008 += (long) arg2;
                if ((this.field1008 - this.field1018) > ((long) this.field1011)) {
                    this.field1011 = (int) (this.field1008 - this.field1018);
                }
            }
        } catch (IOException var12) {
            this.field993 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(JI)V", line = 198)
    public final void method348(long arg0, int arg1) throws IOException {
        field1007++;
        if ((long) arg1 > arg0) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method345(12771));
        }
        this.field1008 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V", line = 213)
    public final void method349(int arg0) throws IOException {
        this.method354(0);
        field999++;
        int var2 = 14 % ((-arg0 - 10) / 45);
        this.field1005.method457(1);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[B)V", line = 227)
    public final void method350(int arg0, byte[] arg1) throws IOException {
        this.method353(arg1.length, arg1, -1, 0);
        field995++;
        int var3 = 47 / ((-arg0 - 54) / 34);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V", line = 248)
    public static void method351(boolean arg0) {
        field998 = null;
        if (arg0) {
            field1000 = true;
        }
        field1012 = null;
        field1003 = null;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)J", line = 261)
    public final long method352(int arg0) {
        if (arg0 == -1) {
            field1006++;
            return this.field1015;
        } else {
            return -25L;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[BII)V", line = 288)
    public final void method353(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1014++;
        try {
            if (arg0 + arg3 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 - (arg1.length - arg0));
            }
            if (this.field1018 != -1L && this.field1018 <= this.field1008 && ((long) this.field1011 + this.field1018) >= ((long) arg0 + this.field1008)) {
                class224.method1546(this.field1013, (int) (this.field1008 - this.field1018), arg1, arg3, arg0);
                this.field1008 += (long) arg0;
                return;
            }
            long var5 = this.field1008;
            int var7 = arg0;
            int var8 = arg3;
            if (this.field1008 >= this.field1004 && (long) this.field1002 + this.field1004 > this.field1008) {
                int var9 = (int) (this.field1004 - (this.field1008 - (long) this.field1002));
                if (arg0 < var9) {
                    var9 = arg0;
                }
                class224.method1546(this.field1016, (int) (this.field1008 - this.field1004), arg1, arg3, var9);
                arg3 += var9;
                arg0 -= var9;
                this.field1008 += (long) var9;
            }
            if (this.field1016.length < arg0) {
                this.field1005.method458(this.field1008, -26545);
                this.field993 = this.field1008;
                while (arg0 > 0) {
                    int var10 = this.field1005.method455(arg1, 0, arg3, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 += var10;
                    this.field1008 += (long) var10;
                    arg0 -= var10;
                    this.field993 += (long) var10;
                }
            } else if (arg0 > 0) {
                this.method346(24468);
                int var11 = arg0;
                if (this.field1002 < arg0) {
                    var11 = this.field1002;
                }
                class224.method1546(this.field1016, 0, arg1, arg3, var11);
                arg3 += var11;
                arg0 -= var11;
                this.field1008 += (long) var11;
            }
            if (this.field1018 != -1L) {
                if (this.field1018 > this.field1008 && arg0 > 0) {
                    int var12 = (int) (this.field1018 - this.field1008) + arg3;
                    if (arg0 + arg3 < var12) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg3) {
                        arg1[arg3++] = 0;
                        this.field1008++;
                        arg0--;
                    }
                }
                long var13 = -1L;
                if (this.field1018 >= var5 && this.field1018 < (long) var7 + var5) {
                    var13 = this.field1018;
                } else if (var5 >= this.field1018 && var5 < ((long) this.field1011 + this.field1018)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((this.field1018 + ((long) this.field1011)) > var5 && (long) var7 + var5 >= (long) this.field1011 + this.field1018) {
                    var15 = (long) this.field1011 + this.field1018;
                } else if ((long) var7 + var5 > this.field1018 && ((long) var7 + var5) <= (this.field1018 + ((long) this.field1011))) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class224.method1546(this.field1013, (int) (var13 - this.field1018), arg1, (int) (var13 - var5) + var8, var17);
                    if (this.field1008 < var15) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field1008));
                        this.field1008 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field993 = -1L;
            throw var19;
        }
        if (arg2 > ~arg0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lje;II)V", line = 572)
    public class51(class68 arg0, int arg1, int arg2) throws IOException {
        this.field1005 = arg0;
        this.field1015 = this.field994 = arg0.method454(-1);
        this.field1016 = new byte[arg1];
        this.field1008 = 0L;
        this.field1013 = new byte[arg2];
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)V", line = 491)
    private final void method354(int arg0) throws IOException {
        if (this.field1018 != -1L) {
            if (this.field993 != this.field1018) {
                this.field1005.method458(this.field1018, -26545);
                this.field993 = this.field1018;
            }
            long var2 = -1L;
            long var4 = -1L;
            this.field1005.method453(this.field1013, (byte) -117, 0, this.field1011);
            this.field993 += (long) this.field1011;
            if (this.field1018 >= this.field1004 && ((long) this.field1002 + this.field1004) > this.field1018) {
                var2 = this.field1018;
            } else if (this.field1004 >= this.field1018 && this.field1004 < ((long) this.field1011 + this.field1018)) {
                var2 = this.field1004;
            }
            if (this.field993 > this.field994) {
                this.field994 = this.field993;
            }
            if (((long) this.field1011 + this.field1018) > this.field1004 && (long) this.field1011 + this.field1018 <= (long) this.field1002 + this.field1004) {
                var4 = this.field1018 + ((long) this.field1011);
            } else if (this.field1004 + ((long) this.field1002) > this.field1018 && ((long) this.field1011 + this.field1018) >= ((long) this.field1002 + this.field1004)) {
                var4 = (long) this.field1002 + this.field1004;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class224.method1546(this.field1013, (int) (var2 - this.field1018), this.field1016, (int) (var2 - this.field1004), var6);
            }
            this.field1018 = -1L;
            this.field1011 = 0;
        }
        field997++;
        if (arg0 != 0) {
            field1012 = (class128) null;
        }
    }
}
