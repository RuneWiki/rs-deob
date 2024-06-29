import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class635 {

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "J")
    private long field8917 = -1L;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    private int field8927 = 0;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "J")
    private long field8932 = -1L;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "Lqia;")
    private class23 field8926;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "J")
    private long field8915;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "J")
    private long field8911;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "J")
    private long field8925;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "[B")
    private byte[] field8912;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "[B")
    private byte[] field8914;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field8929 = 0;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Lbu;")
    public static class21 field8908 = new class21(14, -2);

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field8913;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field8919;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    private int field8921;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "J")
    private long field8920;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field8916;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 11)
    public static void method3627(int arg0) {
        field8908 = null;
        field8916 = null;
        if (arg0 != 65280) {
            field8916 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([BB)V", line = 23)
    public final void method3628(byte[] arg0, byte arg1) throws IOException {
        this.method3636(arg0.length, 1, 0, arg0);
        if (arg1 == -10) {
            field8913++;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)Ljava/io/File;", line = 34)
    private final File method3629(int arg0) {
        field8919++;
        if (arg0 != 10101) {
            this.field8915 = 113L;
        }
        return this.field8926.method233(5);
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lqia;II)V", line = 608)
    public class635(class23 arg0, int arg1, int arg2) throws IOException {
        this.field8926 = arg0;
        this.field8911 = this.field8915 = arg0.method235((byte) 80);
        this.field8925 = 0L;
        this.field8912 = new byte[arg1];
        this.field8914 = new byte[arg2];
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(JJ)J", line = 62)
    public static long method3630(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V", line = 70)
    public final void method3631(int arg0) throws IOException {
        field8931++;
        if (arg0 < 79) {
            this.method3629(-80);
        }
        this.method3633(3);
        this.field8926.method230((byte) 88);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BJ)V", line = 82)
    public final void method3632(byte arg0, long arg1) throws IOException {
        int var4 = 102 % ((-arg0 - 36) / 38);
        field8924++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method3629(10101));
        }
        this.field8925 = arg1;
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V", line = 96)
    private final void method3633(int arg0) throws IOException {
        if (this.field8932 != -1L) {
            if (this.field8932 != this.field8920) {
                this.field8926.method234(arg0 - 8147, this.field8932);
                this.field8920 = this.field8932;
            }
            this.field8926.method236(this.field8927, 0, 1, this.field8914);
            this.field8920 += this.field8927;
            if (this.field8920 > this.field8915) {
                this.field8915 = this.field8920;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field8932 >= this.field8917 && ((long) this.field8921 + this.field8917) > this.field8932) {
                var2 = this.field8932;
            } else if (this.field8917 >= this.field8932 && this.field8917 < ((long) this.field8927 + this.field8932)) {
                var2 = this.field8917;
            }
            if ((this.field8932 + ((long) this.field8927)) > this.field8917 && ((long) this.field8921 + this.field8917) >= ((long) this.field8927 + this.field8932)) {
                var4 = this.field8932 + ((long) this.field8927);
            } else if (this.field8932 < (long) this.field8921 + this.field8917 && ((long) this.field8921 + this.field8917) <= ((long) this.field8927 + this.field8932)) {
                var4 = (long) this.field8921 + this.field8917;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class595.method3467(this.field8914, (int) (var2 - this.field8932), this.field8912, (int) (var2 - this.field8917), var6);
            }
            this.field8932 = -1L;
            this.field8927 = 0;
        }
        field8922++;
        if (arg0 != 3) {
            this.method3629(-21);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V", line = 174)
    public static final void method3634(byte arg0) {
        if (arg0 >= -79) {
            field8916 = null;
        }
        if (class145.field2121 == null || class356.field5015 == null) {
            class145.field2121 = new int[256];
            class356.field5015 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class145.field2121[var1] = (int) (Math.sin(var2) * 4096.0D);
                class356.field5015[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field8923++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[BII)V", line = 210)
    public final void method3635(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field8918++;
        try {
            if ((this.field8925 + ((long) arg0)) > this.field8911) {
                this.field8911 = (long) arg0 + this.field8925;
            }
            if (this.field8932 != -1L && (this.field8925 < this.field8932 || this.field8925 > this.field8932 + ((long) this.field8927))) {
                this.method3633(3);
            }
            if (this.field8932 != -1L && ((long) this.field8914.length + this.field8932) < ((long) arg0 + this.field8925)) {
                int var5 = (int) ((long) this.field8914.length + this.field8932 - this.field8925);
                class595.method3467(arg1, arg3, this.field8914, (int) (this.field8925 - this.field8932), var5);
                this.field8925 += var5;
                arg0 -= var5;
                arg3 += var5;
                this.field8927 = this.field8914.length;
                this.method3633(3);
            }
            if (arg2 != 16251) {
                this.field8927 = -52;
            }
            if (this.field8914.length < arg0) {
                if (this.field8925 != this.field8920) {
                    this.field8926.method234(-8144, this.field8925);
                    this.field8920 = this.field8925;
                }
                this.field8926.method236(arg0, arg3, 1, arg1);
                this.field8920 += arg0;
                if (this.field8920 > this.field8915) {
                    this.field8915 = this.field8920;
                }
                long var6 = -1L;
                if (this.field8925 >= this.field8917 && (long) this.field8921 + this.field8917 > this.field8925) {
                    var6 = this.field8925;
                } else if (this.field8917 >= this.field8925 && ((long) arg0 + this.field8925) > this.field8917) {
                    var6 = this.field8917;
                }
                long var8 = -1L;
                if (this.field8917 < ((long) arg0 + this.field8925) && this.field8917 + ((long) this.field8921) >= (long) arg0 + this.field8925) {
                    var8 = (long) arg0 + this.field8925;
                } else if (this.field8925 < this.field8917 + ((long) this.field8921) && (this.field8925 + ((long) arg0)) >= ((long) this.field8921 + this.field8917)) {
                    var8 = (long) this.field8921 + this.field8917;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class595.method3467(arg1, (int) ((long) arg3 - (this.field8925 - var6)), this.field8912, (int) (var6 - this.field8917), var10);
                }
                this.field8925 += arg0;
            } else if (arg0 > 0) {
                if (this.field8932 == -1L) {
                    this.field8932 = this.field8925;
                }
                class595.method3467(arg1, arg3, this.field8914, (int) (this.field8925 - this.field8932), arg0);
                this.field8925 += arg0;
                if ((this.field8925 - this.field8932) > ((long) this.field8927)) {
                    this.field8927 = (int) (this.field8925 - this.field8932);
                }
            }
        } catch (IOException var12) {
            this.field8920 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III[B)V", line = 339)
    public final void method3636(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field8930++;
        try {
            if (arg2 + arg0 > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg0 - arg3.length);
            }
            if (this.field8932 != -1L && this.field8925 >= this.field8932 && ((long) arg0 + this.field8925) <= ((long) this.field8927 + this.field8932)) {
                class595.method3467(this.field8914, (int) (this.field8925 - this.field8932), arg3, arg2, arg0);
                this.field8925 += arg0;
                return;
            }
            long var5 = this.field8925;
            if (arg1 != 1) {
                method3634((byte) 102);
            }
            int var7 = arg2;
            int var8 = arg0;
            if (this.field8925 >= this.field8917 && this.field8917 + ((long) this.field8921) > this.field8925) {
                int var9 = (int) (this.field8917 + (long) this.field8921 - this.field8925);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                class595.method3467(this.field8912, (int) (this.field8925 - this.field8917), arg3, arg2, var9);
                this.field8925 += var9;
                arg0 -= var9;
                arg2 += var9;
            }
            if (arg0 > this.field8912.length) {
                this.field8926.method234(-8144, this.field8925);
                this.field8920 = this.field8925;
                while (arg0 > 0) {
                    int var10 = this.field8926.method229(arg3, (byte) -88, arg0, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    this.field8925 += var10;
                    this.field8920 += var10;
                    arg2 += var10;
                    arg0 -= var10;
                }
            } else if (arg0 > 0) {
                this.method3639(49);
                int var11 = arg0;
                if (this.field8921 < arg0) {
                    var11 = this.field8921;
                }
                class595.method3467(this.field8912, 0, arg3, arg2, var11);
                arg0 -= var11;
                arg2 += var11;
                this.field8925 += var11;
            }
            if (this.field8932 != -1L) {
                if (this.field8925 < this.field8932 && arg0 > 0) {
                    int var12 = (int) (this.field8932 - this.field8925) + arg2;
                    if (var12 > arg0 + arg2) {
                        var12 = arg0 + arg2;
                    }
                    while (arg2 < var12) {
                        arg3[arg2++] = 0;
                        arg0--;
                        this.field8925++;
                    }
                }
                long var13 = -1L;
                if (this.field8932 >= var5 && this.field8932 < ((long) var8 + var5)) {
                    var13 = this.field8932;
                } else if (this.field8932 <= var5 && var5 < this.field8932 + ((long) this.field8927)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field8927 + this.field8932 && (this.field8932 + ((long) this.field8927)) <= ((long) var8 + var5)) {
                    var15 = (long) this.field8927 + this.field8932;
                } else if (this.field8932 < (long) var8 + var5 && ((long) this.field8927 + this.field8932) >= ((long) var8 + var5)) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class595.method3467(this.field8914, (int) (var13 - this.field8932), arg3, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field8925) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field8925));
                        this.field8925 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field8920 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)J", line = 526)
    public final long method3637(byte arg0) {
        if (arg0 == -127) {
            field8928++;
            return this.field8911;
        } else {
            return 112L;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V", line = 543)
    public static final void method3638(boolean arg0) {
        if (arg0) {
            field8908 = null;
        }
        class274.field3951.method502(class445.field6062, class21.field353.field10091.method1432(-126) == 1 ? class276.field3998 + 256 << 2 : -1, 0);
        field8909++;
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V", line = 562)
    private final void method3639(int arg0) throws IOException {
        field8910++;
        this.field8921 = 0;
        if (arg0 < 17) {
            return;
        }
        if (this.field8925 != this.field8920) {
            this.field8926.method234(-8144, this.field8925);
            this.field8920 = this.field8925;
        }
        this.field8917 = this.field8925;
        while (this.field8912.length > this.field8921) {
            int var2 = this.field8912.length - this.field8921;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field8926.method229(this.field8912, (byte) -88, var2, this.field8921);
            if (var3 == -1) {
                break;
            }
            this.field8921 += var3;
            this.field8920 += var3;
        }
    }
}
