import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class74 {

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "J")
    private long field922 = -1L;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    private int field925 = 0;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "J")
    private long field932 = -1L;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "Lon;")
    private class81 field941;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "J")
    private long field931;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "J")
    private long field923;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "[B")
    private byte[] field921;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "[B")
    private byte[] field933;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "J")
    private long field939;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field924 = 0;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "[I")
    public static int[] field929 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "Ljava/lang/String;")
    public static String field942 = "K";

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    private int field937;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "J")
    private long field930;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "Lnk;")
    public static class16 field940;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "[Lpa;")
    public static class2[] field920;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILlf;)Lrf;", line = 7)
    public static final class306 method457(int arg0, class143 arg1) {
        arg1.method1043(true);
        field936++;
        int var2 = arg1.method1043(true);
        class306 var3 = class282.method2042(var2, -67);
        var3.field4769 = arg1.method1043(true);
        int var4 = arg1.method1043(true);
        for (int var5 = arg0; var5 < var4; var5++) {
            int var6 = arg1.method1043(true);
            var3.method45(arg0 - 15334, arg1, var6);
        }
        var3.method43((byte) -113);
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)Ljava/io/File;", line = 45)
    private final File method458(byte arg0) {
        field938++;
        return arg0 == 7 ? this.field941.method531(-1) : (File) null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IJ)V", line = 58)
    public final void method459(int arg0, long arg1) throws IOException {
        field928++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method458((byte) 7));
        } else if (arg0 == -8874) {
            this.field939 = arg1;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[BII)V", line = 89)
    public final void method460(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field935++;
        try {
            if ((arg2 + arg3) > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg1.length);
            }
            if (this.field932 != -1L && this.field932 <= this.field939 && (this.field939 + ((long) arg3)) <= ((long) this.field925 + this.field932)) {
                class8.method50(this.field921, (int) (this.field939 - this.field932), arg1, arg2, arg3);
                this.field939 += (long) arg3;
                return;
            }
            int var5 = arg2;
            int var6 = arg3;
            long var7 = this.field939;
            if (this.field939 >= this.field922 && ((long) this.field937 + this.field922) > this.field939) {
                int var9 = (int) ((long) this.field937 + this.field922 - this.field939);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                arg3 -= var9;
                class8.method50(this.field933, (int) (this.field939 - this.field922), arg1, arg2, var9);
                this.field939 += (long) var9;
                arg2 += var9;
            }
            if (arg3 > this.field933.length) {
                this.field941.method529(this.field939, 57);
                this.field930 = this.field939;
                while (arg3 > 0) {
                    int var11 = this.field941.method527(arg3, arg1, arg2, (byte) 2);
                    if (var11 == -1) {
                        break;
                    }
                    this.field930 += (long) var11;
                    this.field939 += (long) var11;
                    arg3 -= var11;
                    arg2 += var11;
                }
            } else if (arg3 > 0) {
                int var10 = arg3;
                this.method462(-114);
                if (this.field937 < arg3) {
                    var10 = this.field937;
                }
                arg3 -= var10;
                class8.method50(this.field933, 0, arg1, arg2, var10);
                this.field939 += (long) var10;
                arg2 += var10;
            }
            if (this.field932 != -1L) {
                if (this.field939 < this.field932 && arg3 > 0) {
                    int var12 = (int) (this.field932 - this.field939) + arg2;
                    if (arg2 + arg3 < var12) {
                        var12 = arg2 + arg3;
                    }
                    while (arg2 < var12) {
                        arg3--;
                        arg1[arg2++] = 0;
                        this.field939++;
                    }
                }
                long var13 = -1L;
                if (this.field932 >= var7 && ((long) var6 + var7) > this.field932) {
                    var13 = this.field932;
                } else if (this.field932 <= var7 && this.field932 + ((long) this.field925) > var7) {
                    var13 = var7;
                }
                long var15 = -1L;
                if ((long) this.field925 + this.field932 > var7 && ((long) this.field925 + this.field932) <= (var7 + ((long) var6))) {
                    var15 = (long) this.field925 + this.field932;
                } else if (this.field932 < ((long) var6 + var7) && (this.field932 + ((long) this.field925)) >= ((long) var6 + var7)) {
                    var15 = (long) var6 + var7;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class8.method50(this.field921, (int) (var13 - this.field932), arg1, (int) (var13 - var7) + var5, var17);
                    if (this.field939 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field939));
                        this.field939 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field930 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        } else if (arg0 != 29662) {
            field940 = (class16) null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([BI)V", line = 278)
    public final void method461(byte[] arg0, int arg1) throws IOException {
        field943++;
        int var3 = 15 / ((arg1 - 38) / 54);
        this.method460(29662, arg0, 0, arg0.length);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 291)
    private final void method462(int arg0) throws IOException {
        if (arg0 > -75) {
            method465((byte) -89);
        }
        field934++;
        this.field937 = 0;
        if (this.field939 != this.field930) {
            this.field941.method529(this.field939, 86);
            this.field930 = this.field939;
        }
        this.field922 = this.field939;
        while (this.field933.length > this.field937) {
            int var2 = this.field933.length - this.field937;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field941.method527(var2, this.field933, this.field937, (byte) 2);
            if (var3 == -1) {
                break;
            }
            this.field930 += (long) var3;
            this.field937 += var3;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V", line = 333)
    private final void method463(int arg0) throws IOException {
        if (arg0 != -1) {
            return;
        }
        field926++;
        if (this.field932 == -1L) {
            return;
        }
        if (this.field932 != this.field930) {
            this.field941.method529(this.field932, arg0 + 69);
            this.field930 = this.field932;
        }
        this.field941.method528(this.field921, this.field925, 0, (byte) -98);
        long var2 = -1L;
        if (this.field932 >= this.field922 && ((long) this.field937 + this.field922) > this.field932) {
            var2 = this.field932;
        } else if (this.field922 >= this.field932 && this.field922 < (this.field932 + ((long) this.field925))) {
            var2 = this.field922;
        }
        this.field930 += (long) this.field925;
        long var4 = -1L;
        if (this.field930 > this.field931) {
            this.field931 = this.field930;
        }
        if ((this.field932 + ((long) this.field925)) > this.field922 && (long) this.field937 + this.field922 >= this.field932 - -((long) this.field925)) {
            var4 = (long) this.field925 + this.field932;
        } else if ((long) this.field937 + this.field922 > this.field932 && (this.field932 + ((long) this.field925)) >= (this.field922 + ((long) this.field937))) {
            var4 = (long) this.field937 + this.field922;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class8.method50(this.field921, (int) (var2 - this.field932), this.field933, (int) (var2 - this.field922), var6);
        }
        this.field932 = -1L;
        this.field925 = 0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II[BI)V", line = 410)
    public final void method464(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field927++;
        try {
            if ((long) arg3 + this.field939 > this.field923) {
                this.field923 = (long) arg3 + this.field939;
            }
            if (this.field932 != -1L && (this.field939 < this.field932 || ((long) this.field925 + this.field932) < this.field939)) {
                this.method463(-1);
            }
            if (this.field932 != -1L && ((long) this.field921.length + this.field932) < ((long) arg3 + this.field939)) {
                int var5 = (int) (-this.field939 - (-this.field932 - (long) this.field921.length));
                class8.method50(arg2, arg0, this.field921, (int) (this.field939 - this.field932), var5);
                arg0 += var5;
                this.field939 += (long) var5;
                this.field925 = this.field921.length;
                arg3 -= var5;
                this.method463(-1);
            }
            if (this.field921.length >= arg3) {
                if (arg1 != 25756) {
                    field924 = -36;
                }
                if (arg3 > 0) {
                    if (this.field932 == -1L) {
                        this.field932 = this.field939;
                    }
                    class8.method50(arg2, arg0, this.field921, (int) (this.field939 - this.field932), arg3);
                    this.field939 += (long) arg3;
                    if (this.field939 - this.field932 > (long) this.field925) {
                        this.field925 = (int) (this.field939 - this.field932);
                    }
                }
            } else {
                long var6 = -1L;
                long var8 = -1L;
                if (this.field939 != this.field930) {
                    this.field941.method529(this.field939, 76);
                    this.field930 = this.field939;
                }
                this.field941.method528(arg2, arg3, arg0, (byte) 127);
                if (this.field939 >= this.field922 && this.field939 < ((long) this.field937 + this.field922)) {
                    var6 = this.field939;
                } else if (this.field922 >= this.field939 && (this.field939 + ((long) arg3)) > this.field922) {
                    var6 = this.field922;
                }
                this.field930 += (long) arg3;
                if (this.field931 < this.field930) {
                    this.field931 = this.field930;
                }
                if (this.field922 < ((long) arg3 + this.field939) && ((long) this.field937 + this.field922) >= ((long) arg3 + this.field939)) {
                    var8 = (long) arg3 + this.field939;
                } else if (((long) this.field937 + this.field922) > this.field939 && (this.field939 + ((long) arg3)) >= ((long) this.field937 + this.field922)) {
                    var8 = (long) this.field937 + this.field922;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class8.method50(arg2, (int) (var6 + (long) arg0 - this.field939), this.field933, (int) (var6 - this.field922), var10);
                }
                this.field939 += (long) arg3;
            }
        } catch (IOException var12) {
            this.field930 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V", line = 535)
    public static void method465(byte arg0) {
        field920 = null;
        if (arg0 != -92) {
            method467(-29, (String) null);
        }
        field940 = null;
        field929 = null;
        field942 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)J", line = 553)
    public final long method466(boolean arg0) {
        field918++;
        return arg0 ? this.field923 : 11L;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/lang/String;)I", line = 571)
    public static final int method467(int arg0, String arg1) {
        if (arg0 > -29) {
            field929 = (int[]) null;
        }
        field919++;
        return class176.method1225(126, arg1, true, 10);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lon;II)V", line = 605)
    public class74(class81 arg0, int arg1, int arg2) throws IOException {
        this.field941 = arg0;
        this.field923 = this.field931 = arg0.method530((byte) -31);
        this.field921 = new byte[arg2];
        this.field933 = new byte[arg1];
        this.field939 = 0L;
    }
}
