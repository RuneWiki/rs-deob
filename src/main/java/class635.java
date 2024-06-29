import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class635 {

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "J")
    private long field8895 = -1L;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "J")
    private long field8906 = -1L;

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "I")
    private int field8920 = 0;

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "Lcu;")
    private class479 field8910;

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "J")
    private long field8903;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "J")
    private long field8896;

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "[B")
    private byte[] field8904;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "[B")
    private byte[] field8897;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "J")
    private long field8911;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
    public static int field8901 = 0;

    @OriginalMember(owner = "client!cv", name = "y", descriptor = "[I")
    public static int[] field8919 = new int[1];

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
    public static int field8905;

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
    private int field8907;

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!cv", name = "u", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!cv", name = "v", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!cv", name = "w", descriptor = "I")
    public static int field8917;

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "J")
    private long field8913;

    @OriginalMember(owner = "client!cv", name = "x", descriptor = "Lpl;")
    public static class612 field8918;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IBI[B)V", line = 4)
    public final void method3550(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field8900++;
        try {
            if ((arg0 + arg2) > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg3.length);
            }
            if (this.field8906 != -1L && this.field8911 >= this.field8906 && (long) arg2 + this.field8911 <= this.field8906 - -((long) this.field8920)) {
                class293.method1645(this.field8904, (int) (this.field8911 - this.field8906), arg3, arg0, arg2);
                this.field8911 += arg2;
                return;
            }
            long var5 = this.field8911;
            int var7 = arg0;
            int var8 = arg2;
            if (this.field8895 <= this.field8911 && (long) this.field8907 + this.field8895 > this.field8911) {
                int var9 = (int) ((long) this.field8907 + this.field8895 - this.field8911);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class293.method1645(this.field8897, (int) (this.field8911 - this.field8895), arg3, arg0, var9);
                arg2 -= var9;
                this.field8911 += var9;
                arg0 += var9;
            }
            if (arg1 <= 78) {
                return;
            }
            if (this.field8897.length < arg2) {
                this.field8910.method2609(this.field8911, -1);
                this.field8913 = this.field8911;
                while (arg2 > 0) {
                    int var11 = this.field8910.method2607(arg0, arg3, arg2, 3);
                    if (var11 == -1) {
                        break;
                    }
                    this.field8911 += var11;
                    this.field8913 += var11;
                    arg2 -= var11;
                    arg0 += var11;
                }
            } else if (arg2 > 0) {
                this.method3554(0);
                int var10 = arg2;
                if (this.field8907 < arg2) {
                    var10 = this.field8907;
                }
                class293.method1645(this.field8897, 0, arg3, arg0, var10);
                arg0 += var10;
                arg2 -= var10;
                this.field8911 += var10;
            }
            if (this.field8906 != -1L) {
                if (this.field8906 > this.field8911 && arg2 > 0) {
                    int var12 = (int) (this.field8906 - this.field8911) + arg0;
                    if (var12 > arg0 + arg2) {
                        var12 = arg0 + arg2;
                    }
                    while (arg0 < var12) {
                        arg2--;
                        arg3[arg0++] = 0;
                        this.field8911++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field8906 >= var5 && this.field8906 < (long) var8 + var5) {
                    var13 = this.field8906;
                } else if (this.field8906 <= var5 && var5 < ((long) this.field8920 + this.field8906)) {
                    var13 = var5;
                }
                if ((this.field8906 + ((long) this.field8920)) > var5 && ((long) var8 + var5) >= ((long) this.field8920 + this.field8906)) {
                    var15 = this.field8906 + ((long) this.field8920);
                } else if ((var5 + ((long) var8)) > this.field8906 && (this.field8906 + ((long) this.field8920)) >= ((long) var8 + var5)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class293.method1645(this.field8904, (int) (var13 - this.field8906), arg3, (int) (var13 - var5) + var7, var17);
                    if (this.field8911 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field8911));
                        this.field8911 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field8913 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "([BII)[B", line = 198)
    public static final byte[] method3551(byte[] arg0, int arg1, int arg2) {
        field8909++;
        if (arg2 != 27995) {
            method3553(84);
        }
        byte[] var3 = new byte[arg1];
        class293.method1645(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V", line = 213)
    private final void method3552(int arg0) throws IOException {
        if (this.field8906 != -1L) {
            if (this.field8913 != this.field8906) {
                this.field8910.method2609(this.field8906, arg0);
                this.field8913 = this.field8906;
            }
            this.field8910.method2605(0, (byte) 59, this.field8920, this.field8904);
            this.field8913 += this.field8920;
            if (this.field8903 < this.field8913) {
                this.field8903 = this.field8913;
            }
            long var2 = -1L;
            if (this.field8895 <= this.field8906 && ((long) this.field8907 + this.field8895) > this.field8906) {
                var2 = this.field8906;
            } else if (this.field8906 <= this.field8895 && this.field8895 < ((long) this.field8920 + this.field8906)) {
                var2 = this.field8895;
            }
            long var4 = -1L;
            if (this.field8895 < (this.field8906 + ((long) this.field8920)) && ((long) this.field8907 + this.field8895) >= (this.field8906 + ((long) this.field8920))) {
                var4 = (long) this.field8920 + this.field8906;
            } else if ((long) this.field8907 + this.field8895 > this.field8906 && ((long) this.field8920 + this.field8906) >= ((long) this.field8907 + this.field8895)) {
                var4 = (long) this.field8907 + this.field8895;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class293.method1645(this.field8904, (int) (var2 - this.field8906), this.field8897, (int) (var2 - this.field8895), var6);
            }
            this.field8920 = 0;
            this.field8906 = -1L;
        }
        field8908++;
        if (arg0 != -1) {
            field8901 = -42;
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V", line = 289)
    public static void method3553(int arg0) {
        field8918 = null;
        field8919 = null;
        if (arg0 != -5715) {
            field8919 = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "(I)V", line = 304)
    private final void method3554(int arg0) throws IOException {
        field8912++;
        this.field8907 = arg0;
        if (this.field8913 != this.field8911) {
            this.field8910.method2609(this.field8911, -1);
            this.field8913 = this.field8911;
        }
        this.field8895 = this.field8911;
        while (this.field8897.length > this.field8907) {
            int var2 = this.field8897.length - this.field8907;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field8910.method2607(this.field8907, this.field8897, var2, 3);
            if (var3 == -1) {
                break;
            }
            this.field8907 += var3;
            this.field8913 += var3;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IJ)V", line = 346)
    public final void method3555(int arg0, long arg1) throws IOException {
        field8915++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method3558((byte) -53));
        }
        if (arg0 != 13755) {
            method3551(null, -90, 66);
        }
        this.field8911 = arg1;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "([BIII)V", line = 366)
    public final void method3556(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field8905++;
        try {
            if (this.field8896 < ((long) arg2 + this.field8911)) {
                this.field8896 = this.field8911 + ((long) arg2);
            }
            if (this.field8906 != -1L && (this.field8906 > this.field8911 || this.field8911 > (long) this.field8920 + this.field8906)) {
                this.method3552(arg3 - 27896);
            }
            if (this.field8906 != -1L && (long) arg2 + this.field8911 > (long) this.field8904.length + this.field8906) {
                int var5 = (int) (this.field8906 + (long) this.field8904.length - this.field8911);
                class293.method1645(arg0, arg1, this.field8904, (int) (this.field8911 - this.field8906), var5);
                this.field8911 += var5;
                arg2 -= var5;
                arg1 += var5;
                this.field8920 = this.field8904.length;
                this.method3552(-1);
            }
            if (arg2 > this.field8904.length) {
                if (this.field8913 != this.field8911) {
                    this.field8910.method2609(this.field8911, arg3 ^ 0xFFFF9308);
                    this.field8913 = this.field8911;
                }
                this.field8910.method2605(arg1, (byte) -122, arg2, arg0);
                this.field8913 += arg2;
                if (this.field8913 > this.field8903) {
                    this.field8903 = this.field8913;
                }
                long var6 = -1L;
                if (this.field8895 <= this.field8911 && this.field8911 < (long) this.field8907 + this.field8895) {
                    var6 = this.field8911;
                } else if (this.field8911 <= this.field8895 && ((long) arg2 + this.field8911) > this.field8895) {
                    var6 = this.field8895;
                }
                long var8 = -1L;
                if (this.field8895 < ((long) arg2 + this.field8911) && this.field8911 + ((long) arg2) <= (long) this.field8907 + this.field8895) {
                    var8 = (long) arg2 + this.field8911;
                } else if ((long) this.field8907 + this.field8895 > this.field8911 && ((long) this.field8907 + this.field8895) <= ((long) arg2 + this.field8911)) {
                    var8 = (long) this.field8907 + this.field8895;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class293.method1645(arg0, (int) ((long) arg1 + var6 - this.field8911), this.field8897, (int) (var6 - this.field8895), var10);
                }
                this.field8911 += arg2;
            } else if (arg2 > 0) {
                if (this.field8906 == -1L) {
                    this.field8906 = this.field8911;
                }
                class293.method1645(arg0, arg1, this.field8904, (int) (this.field8911 - this.field8906), arg2);
                this.field8911 += arg2;
                if (this.field8911 - this.field8906 > (long) this.field8920) {
                    this.field8920 = (int) (this.field8911 - this.field8906);
                }
            } else if (arg3 != 27895) {
                this.field8913 = -95L;
            }
        } catch (IOException var12) {
            this.field8913 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZB)V", line = 494)
    public static final void method3557(boolean arg0, byte arg1) {
        field8914++;
        class311.method1798(4, class523.field7111, arg0, class316.field4063, class244.field3022);
        int var2 = -81 % ((48 - arg1) / 55);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)Ljava/io/File;", line = 509)
    private final File method3558(byte arg0) {
        field8902++;
        if (arg0 > -20) {
            this.field8897 = null;
        }
        return this.field8910.method2606((byte) -126);
    }

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "(I)J", line = 522)
    public final long method3559(int arg0) {
        field8917++;
        return arg0 == 0 ? this.field8896 : -95L;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lcu;II)V", line = 581)
    public class635(class479 arg0, int arg1, int arg2) throws IOException {
        this.field8910 = arg0;
        this.field8896 = this.field8903 = arg0.method2604(0);
        this.field8904 = new byte[arg2];
        this.field8897 = new byte[arg1];
        this.field8911 = 0L;
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)V", line = 547)
    public final void method3560(byte arg0) throws IOException {
        if (arg0 == 101) {
            field8916++;
            this.method3552(-1);
            this.field8910.method2603((byte) -127);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z[B)V", line = 560)
    public final void method3561(boolean arg0, byte[] arg1) throws IOException {
        this.method3550(0, (byte) 106, arg1.length, arg1);
        if (arg0) {
            field8901 = -5;
        }
        field8899++;
    }
}
