import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class155 {

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "J")
    private long field2918 = -1L;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "J")
    private long field2924 = -1L;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
    private int field2944 = 0;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "Ljj;")
    private class103 field2943;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "J")
    private long field2920;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "J")
    private long field2919;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "[B")
    private byte[] field2914;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "J")
    private long field2928;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "[B")
    private byte[] field2926;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Ljd;")
    public static class86 field2934 = class122.method868("Bitte entfernen Sie ", true);

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "Ljd;")
    private static class86 field2931 = class122.method868("Please wait )2 attempting to reestablish)3", true);

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "Ljd;")
    private static class86 field2927 = class122.method868("Loaded textures", true);

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "Ljd;")
    public static class86 field2936 = field2927;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "Ljd;")
    public static class86 field2939 = field2931;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field2938 = 0;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "Ljd;")
    public static class86 field2942 = class122.method868("overlay", true);

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    private int field2940;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "J")
    private long field2921;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
    private final void method1126(boolean arg0) throws IOException {
        this.field2940 = 0;
        field2922++;
        if (this.field2928 != this.field2921) {
            this.field2943.method741((byte) -119, this.field2928);
            this.field2921 = this.field2928;
        }
        if (arg0) {
            return;
        }
        this.field2918 = this.field2928;
        while (this.field2914.length > this.field2940) {
            int var2 = this.field2914.length - this.field2940;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2943.method742(this.field2940, 0, var2, this.field2914);
            if (var3 == -1) {
                break;
            }
            this.field2921 += (long) var3;
            this.field2940 += var3;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public final void method1127(int arg0) throws IOException {
        if (arg0 != -13973) {
            method1134(118);
        }
        field2933++;
        this.method1136(66);
        this.field2943.method740(1);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method1128(byte arg0) {
        int var1 = 86 % ((28 - arg0) / 51);
        field2931 = null;
        field2934 = null;
        field2939 = null;
        field2927 = null;
        field2942 = null;
        field2936 = null;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)J")
    public final long method1129(int arg0) {
        if (arg0 == 2408) {
            field2917++;
            return this.field2919;
        } else {
            return -87L;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)Ljava/io/File;")
    private final File method1130(byte arg0) {
        int var2 = 57 % ((68 - arg0) / 56);
        field2916++;
        return this.field2943.method737(0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[BII)V")
    public final void method1131(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2935++;
        try {
            if (((long) arg3 + this.field2928) > this.field2919) {
                this.field2919 = (long) arg3 + this.field2928;
            }
            if (this.field2924 != -1L && (this.field2928 < this.field2924 || this.field2924 + ((long) this.field2944) < this.field2928)) {
                this.method1136(111);
            }
            if (this.field2924 != -1L && (long) this.field2926.length + this.field2924 < (long) arg3 + this.field2928) {
                int var5 = (int) (this.field2924 - (this.field2928 - (long) this.field2926.length));
                arg3 -= var5;
                class250.method1687(arg1, arg0, this.field2926, (int) (this.field2928 - this.field2924), var5);
                arg0 += var5;
                this.field2928 += (long) var5;
                this.field2944 = this.field2926.length;
                this.method1136(117);
            }
            if (arg3 > this.field2926.length) {
                if (this.field2928 != this.field2921) {
                    this.field2943.method741((byte) -125, this.field2928);
                    this.field2921 = this.field2928;
                }
                this.field2943.method739(arg1, 1, arg3, arg0);
                this.field2921 += (long) arg3;
                long var6 = -1L;
                long var8 = -1L;
                if (this.field2928 >= this.field2918 && (long) this.field2940 + this.field2918 > this.field2928) {
                    var6 = this.field2928;
                } else if (this.field2928 <= this.field2918 && (long) arg3 + this.field2928 > this.field2918) {
                    var6 = this.field2918;
                }
                if (this.field2918 < ((long) arg3 + this.field2928) && (long) this.field2940 + this.field2918 >= this.field2928 - -((long) arg3)) {
                    var8 = (long) arg3 + this.field2928;
                } else if (((long) this.field2940 + this.field2918) > this.field2928 && ((long) arg3 + this.field2928) >= (this.field2918 + ((long) this.field2940))) {
                    var8 = (long) this.field2940 + this.field2918;
                }
                if (this.field2920 < this.field2921) {
                    this.field2920 = this.field2921;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class250.method1687(arg1, (int) ((long) arg0 + var6 - this.field2928), this.field2914, (int) (var6 - this.field2918), var10);
                }
                this.field2928 += (long) arg3;
            } else if (arg2 >= 70 && arg3 > 0) {
                if (this.field2924 == -1L) {
                    this.field2924 = this.field2928;
                }
                class250.method1687(arg1, arg0, this.field2926, (int) (this.field2928 - this.field2924), arg3);
                this.field2928 += (long) arg3;
                if ((long) this.field2944 < this.field2928 - this.field2924) {
                    this.field2944 = (int) (this.field2928 - this.field2924);
                }
            }
        } catch (IOException var12) {
            this.field2921 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I[BII)V")
    public final void method1132(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2937++;
        try {
            if (arg2 + arg3 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg1.length);
            }
            if (this.field2924 != -1L && this.field2924 <= this.field2928 && (long) arg3 + this.field2928 <= (long) this.field2944 + this.field2924) {
                class250.method1687(this.field2926, (int) (this.field2928 - this.field2924), arg1, arg2, arg3);
                this.field2928 += (long) arg3;
                return;
            }
            long var5 = this.field2928;
            if (arg0 > -74) {
                this.field2940 = 16;
            }
            int var7 = arg3;
            int var8 = arg2;
            if (this.field2928 >= this.field2918 && this.field2928 < (long) this.field2940 + this.field2918) {
                int var9 = (int) ((long) this.field2940 + this.field2918 - this.field2928);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                arg3 -= var9;
                class250.method1687(this.field2914, (int) (this.field2928 - this.field2918), arg1, arg2, var9);
                arg2 += var9;
                this.field2928 += (long) var9;
            }
            if (arg3 > this.field2914.length) {
                this.field2943.method741((byte) -127, this.field2928);
                this.field2921 = this.field2928;
                while (arg3 > 0) {
                    int var11 = this.field2943.method742(arg2, 0, arg3, arg1);
                    if (var11 == -1) {
                        break;
                    }
                    arg2 += var11;
                    this.field2928 += (long) var11;
                    this.field2921 += (long) var11;
                    arg3 -= var11;
                }
            } else if (arg3 > 0) {
                this.method1126(false);
                int var10 = arg3;
                if (this.field2940 < arg3) {
                    var10 = this.field2940;
                }
                class250.method1687(this.field2914, 0, arg1, arg2, var10);
                arg2 += var10;
                arg3 -= var10;
                this.field2928 += (long) var10;
            }
            if (this.field2924 != -1L) {
                if (this.field2928 < this.field2924 && arg3 > 0) {
                    int var12 = (int) (this.field2924 - this.field2928) + arg2;
                    if (var12 > arg2 + arg3) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg2) {
                        arg1[arg2++] = 0;
                        this.field2928++;
                        arg3--;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field2924 && (long) var7 + var5 > this.field2924) {
                    var13 = this.field2924;
                } else if (this.field2924 <= var5 && ((long) this.field2944 + this.field2924) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (this.field2924 + ((long) this.field2944)) && (long) this.field2944 + this.field2924 <= var5 - -((long) var7)) {
                    var15 = (long) this.field2944 + this.field2924;
                } else if (this.field2924 < (long) var7 + var5 && (long) this.field2944 + this.field2924 >= (long) var7 + var5) {
                    var15 = var5 + ((long) var7);
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class250.method1687(this.field2926, (int) (var13 - this.field2924), arg1, (int) (var13 - var5) + var8, var17);
                    if (var15 > this.field2928) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field2928));
                        this.field2928 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2921 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B[B)V")
    public final void method1133(byte arg0, byte[] arg1) throws IOException {
        this.method1132(-100, arg1, 0, arg1.length);
        field2941++;
        if (arg0 < 11) {
            this.method1129(-22);
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)Z")
    public static final boolean method1134(int arg0) {
        field2930++;
        if (class45.field1007 == 0) {
            int var1 = 33 / ((arg0 + 46) / 41);
            return class253.field4504.method317((byte) -25);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZJ)V")
    public final void method1135(boolean arg0, long arg1) throws IOException {
        if (!arg0) {
            field2927 = null;
        }
        field2925++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1130((byte) -48));
        }
        this.field2928 = arg1;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
    private final void method1136(int arg0) throws IOException {
        if (arg0 < 49) {
            this.field2919 = -116L;
        }
        if (this.field2924 != -1L) {
            if (this.field2924 != this.field2921) {
                this.field2943.method741((byte) -116, this.field2924);
                this.field2921 = this.field2924;
            }
            this.field2943.method739(this.field2926, 1, this.field2944, 0);
            this.field2921 += (long) this.field2944;
            if (this.field2920 < this.field2921) {
                this.field2920 = this.field2921;
            }
            long var2 = -1L;
            if (this.field2924 >= this.field2918 && ((long) this.field2940 + this.field2918) > this.field2924) {
                var2 = this.field2924;
            } else if (this.field2924 <= this.field2918 && this.field2918 < (long) this.field2944 + this.field2924) {
                var2 = this.field2918;
            }
            long var4 = -1L;
            if (this.field2918 < (long) this.field2944 + this.field2924 && (long) this.field2940 + this.field2918 >= (long) this.field2944 + this.field2924) {
                var4 = (long) this.field2944 + this.field2924;
            } else if (this.field2924 < (long) this.field2940 + this.field2918 && ((long) this.field2944 + this.field2924) >= ((long) this.field2940 + this.field2918)) {
                var4 = (long) this.field2940 + this.field2918;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class250.method1687(this.field2926, (int) (var2 - this.field2924), this.field2914, (int) (var2 - this.field2918), var6);
            }
            this.field2944 = 0;
            this.field2924 = -1L;
        }
        field2915++;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Ljj;II)V")
    public class155(class103 arg0, int arg1, int arg2) throws IOException {
        this.field2943 = arg0;
        this.field2919 = this.field2920 = arg0.method738(-4551);
        this.field2914 = new byte[arg1];
        this.field2928 = 0L;
        this.field2926 = new byte[arg2];
    }
}
