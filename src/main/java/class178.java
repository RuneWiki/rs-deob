import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class178 {

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    private int field3042 = 0;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "J")
    private long field3047 = -1L;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "J")
    private long field3058 = -1L;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Loj;")
    private class155 field3040;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "J")
    private long field3057;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "J")
    private long field3038;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "[B")
    private byte[] field3061;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "[B")
    private byte[] field3052;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "J")
    private long field3054;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Lc;")
    public static class103 field3053 = null;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "[I")
    public static int[] field3055 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Lve;")
    public static class184 field3039 = new class184(50);

    @OriginalMember(owner = "client!je", name = "A", descriptor = "[I")
    public static int[] field3063 = new int[1000];

    @OriginalMember(owner = "client!je", name = "z", descriptor = "[Lnd;")
    public static class249[] field3062 = new class249[50];

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    private int field3050;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "J")
    private long field3046;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "[Lvj;")
    public static class112[] field3051;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "[[B")
    public static byte[][] field3060;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    private final void method1197(int arg0) throws IOException {
        field3049++;
        if (arg0 <= 6) {
            field3055 = null;
        }
        this.field3050 = 0;
        if (this.field3054 != this.field3046) {
            this.field3040.method1017(false, this.field3054);
            this.field3046 = this.field3054;
        }
        this.field3058 = this.field3054;
        while (this.field3052.length > this.field3050) {
            int var2 = this.field3052.length - this.field3050;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3040.method1020(var2, 0, this.field3050, this.field3052);
            if (var3 == -1) {
                break;
            }
            this.field3050 += var3;
            this.field3046 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II[BB)V")
    public final void method1198(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field3045++;
        try {
            if ((arg0 + arg1) > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg2.length);
            }
            if (this.field3047 != -1L && this.field3054 >= this.field3047 && this.field3047 + ((long) this.field3042) >= this.field3054 - -((long) arg0)) {
                class248.method1724(this.field3061, (int) (this.field3054 - this.field3047), arg2, arg1, arg0);
                this.field3054 += (long) arg0;
                return;
            }
            if (arg3 != 79) {
                method1202(79);
            }
            long var5 = this.field3054;
            int var7 = arg1;
            int var8 = arg0;
            if (this.field3058 <= this.field3054 && this.field3054 < ((long) this.field3050 + this.field3058)) {
                int var9 = (int) (this.field3058 + (long) this.field3050 - this.field3054);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                class248.method1724(this.field3052, (int) (this.field3054 - this.field3058), arg2, arg1, var9);
                arg1 += var9;
                arg0 -= var9;
                this.field3054 += (long) var9;
            }
            if (this.field3052.length < arg0) {
                this.field3040.method1017(false, this.field3054);
                this.field3046 = this.field3054;
                while (arg0 > 0) {
                    int var10 = this.field3040.method1020(arg0, arg3 ^ 0x4F, arg1, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    arg1 += var10;
                    arg0 -= var10;
                    this.field3054 += (long) var10;
                    this.field3046 += (long) var10;
                }
            } else if (arg0 > 0) {
                this.method1197(44);
                int var11 = arg0;
                if (this.field3050 < arg0) {
                    var11 = this.field3050;
                }
                arg0 -= var11;
                class248.method1724(this.field3052, 0, arg2, arg1, var11);
                this.field3054 += (long) var11;
                arg1 += var11;
            }
            if (this.field3047 != -1L) {
                if (this.field3047 > this.field3054 && arg0 > 0) {
                    int var12 = (int) (this.field3047 - this.field3054) + arg1;
                    if ((arg0 + arg1) < var12) {
                        var12 = arg0 + arg1;
                    }
                    while (arg1 < var12) {
                        arg0--;
                        arg2[arg1++] = 0;
                        this.field3054++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field3047 && this.field3047 < var5 + ((long) var8)) {
                    var13 = this.field3047;
                } else if (this.field3047 <= var5 && var5 < ((long) this.field3042 + this.field3047)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < ((long) this.field3042 + this.field3047) && (long) var8 + var5 >= (long) this.field3042 + this.field3047) {
                    var15 = (long) this.field3042 + this.field3047;
                } else if (this.field3047 < (long) var8 + var5 && this.field3047 + ((long) this.field3042) >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class248.method1724(this.field3061, (int) (var13 - this.field3047), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field3054 < var15) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field3054));
                        this.field3054 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3046 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)J")
    public final long method1199(int arg0) {
        if (arg0 != -1) {
            this.field3058 = -122L;
        }
        field3041++;
        return this.field3038;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)Ljava/io/File;")
    private final File method1200(boolean arg0) {
        if (!arg0) {
            field3053 = null;
        }
        field3037++;
        return this.field3040.method1019(false);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([BB)V")
    public final void method1201(byte[] arg0, byte arg1) throws IOException {
        if (arg1 != 37) {
            method1202(19);
        }
        this.method1198(arg0.length, 0, arg0, (byte) 79);
        field3059++;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    public static void method1202(int arg0) {
        field3053 = null;
        field3039 = null;
        field3051 = null;
        if (arg0 <= 14) {
            method1202(-14);
        }
        field3055 = null;
        field3062 = null;
        field3063 = null;
        field3060 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(JI)V")
    public final void method1203(long arg0, int arg1) throws IOException {
        field3048++;
        if (arg1 != 65280) {
            field3060 = null;
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1200(true));
        }
        this.field3054 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III[B)V")
    public final void method1204(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3044++;
        try {
            if (this.field3054 + ((long) arg2) > this.field3038) {
                this.field3038 = (long) arg2 + this.field3054;
            }
            if (this.field3047 != -1L && (this.field3047 > this.field3054 || this.field3054 > ((long) this.field3042 + this.field3047))) {
                this.method1205(arg1 ^ 0xFFFFEB91);
            }
            if (this.field3047 != -1L && ((long) this.field3061.length + this.field3047) < ((long) arg2 + this.field3054)) {
                int var5 = (int) (this.field3047 + (long) this.field3061.length - this.field3054);
                arg2 -= var5;
                class248.method1724(arg3, arg0, this.field3061, (int) (this.field3054 - this.field3047), var5);
                arg0 += var5;
                this.field3054 += (long) var5;
                this.field3042 = this.field3061.length;
                this.method1205(-1);
            }
            if (this.field3061.length < arg2) {
                if (this.field3054 != this.field3046) {
                    this.field3040.method1017(false, this.field3054);
                    this.field3046 = this.field3054;
                }
                this.field3040.method1016(arg0, arg3, 1, arg2);
                this.field3046 += (long) arg2;
                if (this.field3046 > this.field3057) {
                    this.field3057 = this.field3046;
                }
                long var6 = -1L;
                if (this.field3054 >= this.field3058 && (long) this.field3050 + this.field3058 > this.field3054) {
                    var6 = this.field3054;
                } else if (this.field3054 <= this.field3058 && this.field3058 < ((long) arg2 + this.field3054)) {
                    var6 = this.field3058;
                }
                long var8 = -1L;
                if ((long) arg2 + this.field3054 > this.field3058 && this.field3058 + ((long) this.field3050) >= (long) arg2 + this.field3054) {
                    var8 = (long) arg2 + this.field3054;
                } else if (this.field3054 < this.field3058 + ((long) this.field3050) && (this.field3054 + ((long) arg2)) >= (this.field3058 + ((long) this.field3050))) {
                    var8 = this.field3058 + ((long) this.field3050);
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class248.method1724(arg3, (int) ((long) arg0 + var6 - this.field3054), this.field3052, (int) (var6 - this.field3058), var10);
                }
                this.field3054 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field3047 == -1L) {
                    this.field3047 = this.field3054;
                }
                class248.method1724(arg3, arg0, this.field3061, (int) (this.field3054 - this.field3047), arg2);
                this.field3054 += (long) arg2;
                if ((this.field3054 - this.field3047) > ((long) this.field3042)) {
                    this.field3042 = (int) (this.field3054 - this.field3047);
                }
            } else if (arg1 != 5230) {
                field3053 = null;
            }
        } catch (IOException var12) {
            this.field3046 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
    private final void method1205(int arg0) throws IOException {
        field3056++;
        if ((long) arg0 == this.field3047) {
            return;
        }
        long var2 = -1L;
        long var4 = -1L;
        if (this.field3047 != this.field3046) {
            this.field3040.method1017(false, this.field3047);
            this.field3046 = this.field3047;
        }
        this.field3040.method1016(0, this.field3061, arg0 + 2, this.field3042);
        if (this.field3058 <= this.field3047 && this.field3058 + ((long) this.field3050) > this.field3047) {
            var2 = this.field3047;
        } else if (this.field3058 >= this.field3047 && ((long) this.field3042 + this.field3047) > this.field3058) {
            var2 = this.field3058;
        }
        this.field3046 += (long) this.field3042;
        if (this.field3058 < this.field3047 + ((long) this.field3042) && ((long) this.field3042 + this.field3047) <= ((long) this.field3050 + this.field3058)) {
            var4 = (long) this.field3042 + this.field3047;
        } else if (this.field3058 + ((long) this.field3050) > this.field3047 && ((long) this.field3050 + this.field3058) <= ((long) this.field3042 + this.field3047)) {
            var4 = this.field3058 + ((long) this.field3050);
        }
        if (this.field3057 < this.field3046) {
            this.field3057 = this.field3046;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class248.method1724(this.field3061, (int) (var2 - this.field3047), this.field3052, (int) (var2 - this.field3058), var6);
        }
        this.field3047 = -1L;
        this.field3042 = 0;
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
    public final void method1206(int arg0) throws IOException {
        field3043++;
        this.method1205(arg0);
        this.field3040.method1018(true);
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Loj;II)V")
    public class178(class155 arg0, int arg1, int arg2) throws IOException {
        this.field3040 = arg0;
        this.field3038 = this.field3057 = arg0.method1015(26277);
        this.field3061 = new byte[arg2];
        this.field3052 = new byte[arg1];
        this.field3054 = 0L;
    }
}
