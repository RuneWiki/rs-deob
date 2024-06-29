import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class13 {

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    private int field142 = 0;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "J")
    private long field148 = -1L;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "J")
    private long field143 = -1L;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "Lkd;")
    private class77 field147;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "J")
    private long field134;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "J")
    private long field137;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "[B")
    private byte[] field133;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "J")
    private long field151;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "[B")
    private byte[] field132;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "[J")
    public static long[] field152 = new long[256];

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "Z")
    public static boolean field155;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "F")
    public static float field156;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    private int field149;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "J")
    private long field150;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 4)
    public static final void method93(int arg0) {
        field153++;
        int var1 = -75 / ((arg0 + 38) / 63);
        if (class226.field3250 != null) {
            class307 var2 = class226.field3250;
            synchronized (class226.field3250) {
                class226.field3250 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[BIB)V", line = 26)
    public final void method94(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field135++;
        try {
            if (this.field137 < ((long) arg2 + this.field151)) {
                this.field137 = this.field151 + ((long) arg2);
            }
            if (arg3 != 42) {
                method93(-18);
            }
            if (this.field148 != -1L && (this.field151 < this.field148 || this.field151 > (this.field148 + ((long) this.field142)))) {
                this.method99(-1);
            }
            if (this.field148 != -1L && ((long) this.field132.length + this.field148) < ((long) arg2 + this.field151)) {
                int var5 = (int) ((long) this.field132.length + this.field148 - this.field151);
                arg2 -= var5;
                class87.method635(arg1, arg0, this.field132, (int) (this.field151 - this.field148), var5);
                arg0 += var5;
                this.field151 += (long) var5;
                this.field142 = this.field132.length;
                this.method99(arg3 ^ 0xFFFFFFD5);
            }
            if (arg2 > this.field132.length) {
                long var6 = -1L;
                long var8 = -1L;
                if (this.field151 != this.field150) {
                    this.field147.method549(this.field151, (byte) 2);
                    this.field150 = this.field151;
                }
                this.field147.method552(arg2, arg0, true, arg1);
                if (this.field151 >= this.field143 && this.field143 + ((long) this.field149) > this.field151) {
                    var8 = this.field151;
                } else if (this.field151 <= this.field143 && ((long) arg2 + this.field151) > this.field143) {
                    var8 = this.field143;
                }
                this.field150 += (long) arg2;
                if ((long) arg2 + this.field151 > this.field143 && (long) arg2 + this.field151 <= (long) this.field149 + this.field143) {
                    var6 = (long) arg2 + this.field151;
                } else if (this.field151 < ((long) this.field149 + this.field143) && (long) this.field149 + this.field143 <= (long) arg2 + this.field151) {
                    var6 = this.field143 + ((long) this.field149);
                }
                if (this.field150 > this.field134) {
                    this.field134 = this.field150;
                }
                if (var8 > -1L && var6 > var8) {
                    int var10 = (int) (var6 - var8);
                    class87.method635(arg1, (int) ((long) arg0 + var8 - this.field151), this.field133, (int) (var8 - this.field143), var10);
                }
                this.field151 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field148 == -1L) {
                    this.field148 = this.field151;
                }
                class87.method635(arg1, arg0, this.field132, (int) (this.field151 - this.field148), arg2);
                this.field151 += (long) arg2;
                if (((long) this.field142) < (this.field151 - this.field148)) {
                    this.field142 = (int) (this.field151 - this.field148);
                }
            }
        } catch (IOException var12) {
            this.field150 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 157)
    private final void method95(int arg0) throws IOException {
        this.field149 = 0;
        field140++;
        if (this.field151 != this.field150) {
            this.field147.method549(this.field151, (byte) 2);
            this.field150 = this.field151;
        }
        this.field143 = this.field151;
        if (arg0 != 8) {
            field152 = (long[]) null;
        }
        while (this.field149 < this.field133.length) {
            int var2 = this.field133.length - this.field149;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field147.method550(this.field133, -24047, var2, this.field149);
            if (var3 == -1) {
                break;
            }
            this.field150 += (long) var3;
            this.field149 += var3;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)J", line = 206)
    public final long method96(byte arg0) {
        field141++;
        if (arg0 >= -22) {
            this.field132 = (byte[]) null;
        }
        return this.field137;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lkd;II)V", line = 589)
    public class13(class77 arg0, int arg1, int arg2) throws IOException {
        this.field147 = arg0;
        this.field137 = this.field134 = arg0.method551((byte) -12);
        this.field133 = new byte[arg1];
        this.field151 = 0L;
        this.field132 = new byte[arg2];
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZJ)V", line = 238)
    public final void method97(boolean arg0, long arg1) throws IOException {
        if (!arg0) {
            field155 = false;
        }
        field138++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method101((byte) 119));
        }
        this.field151 = arg1;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V", line = 256)
    public static void method98(byte arg0) {
        field152 = null;
        if (arg0 != 35) {
            method93(74);
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V", line = 272)
    private final void method99(int arg0) throws IOException {
        if (this.field148 != -1L) {
            if (this.field150 != this.field148) {
                this.field147.method549(this.field148, (byte) 2);
                this.field150 = this.field148;
            }
            this.field147.method552(this.field142, 0, true, this.field132);
            this.field150 += (long) this.field142;
            if (this.field150 > this.field134) {
                this.field134 = this.field150;
            }
            long var2 = -1L;
            if ((long) this.field142 + this.field148 > this.field143 && (long) this.field142 + this.field148 <= (long) this.field149 + this.field143) {
                var2 = this.field148 + ((long) this.field142);
            } else if (this.field148 < (long) this.field149 + this.field143 && ((long) this.field149 + this.field143) <= ((long) this.field142 + this.field148)) {
                var2 = (long) this.field149 + this.field143;
            }
            long var4 = -1L;
            if (this.field143 <= this.field148 && this.field148 < ((long) this.field149 + this.field143)) {
                var4 = this.field148;
            } else if (this.field148 <= this.field143 && this.field143 < ((long) this.field142 + this.field148)) {
                var4 = this.field143;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class87.method635(this.field132, (int) (var4 - this.field148), this.field133, (int) (var4 - this.field143), var6);
            }
            this.field148 = -1L;
            this.field142 = 0;
        }
        if (arg0 == -1) {
            field145++;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[BII)V", line = 348)
    public final void method100(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field139++;
        try {
            if (arg1.length < (arg2 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg2 - (arg1.length - arg3));
            }
            if (this.field148 != -1L && this.field151 >= this.field148 && (long) this.field142 + this.field148 >= (long) arg3 + this.field151) {
                class87.method635(this.field132, (int) (this.field151 - this.field148), arg1, arg2, arg3);
                this.field151 += (long) arg3;
                return;
            }
            int var5 = arg3;
            int var6 = arg2;
            long var7 = this.field151;
            if (this.field143 <= this.field151 && this.field143 + ((long) this.field149) > this.field151) {
                int var9 = (int) ((long) this.field149 + this.field143 - this.field151);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class87.method635(this.field133, (int) (this.field151 - this.field143), arg1, arg2, var9);
                arg3 -= var9;
                this.field151 += (long) var9;
                arg2 += var9;
            }
            if (this.field133.length < arg3) {
                this.field147.method549(this.field151, (byte) 2);
                this.field150 = this.field151;
                while (arg3 > 0) {
                    int var10 = this.field147.method550(arg1, arg0 - 24047, arg3, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    this.field150 += (long) var10;
                    arg3 -= var10;
                    arg2 += var10;
                    this.field151 += (long) var10;
                }
            } else if (arg3 > 0) {
                int var11 = arg3;
                this.method95(8);
                if (this.field149 < arg3) {
                    var11 = this.field149;
                }
                arg3 -= var11;
                class87.method635(this.field133, 0, arg1, arg2, var11);
                this.field151 += (long) var11;
                arg2 += var11;
            }
            if (this.field148 != -1L) {
                if (this.field151 < this.field148 && arg3 > 0) {
                    int var12 = arg2 + ((int) (this.field148 - this.field151));
                    if (var12 > (arg2 + arg3)) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg2) {
                        arg1[arg2++] = 0;
                        this.field151++;
                        arg3--;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var7 <= this.field148 && this.field148 < ((long) var5 + var7)) {
                    var15 = this.field148;
                } else if (var7 >= this.field148 && (long) this.field142 + this.field148 > var7) {
                    var15 = var7;
                }
                if ((long) this.field142 + this.field148 > var7 && (this.field148 + ((long) this.field142)) <= ((long) var5 + var7)) {
                    var13 = (long) this.field142 + this.field148;
                } else if (this.field148 < (long) var5 + var7 && ((long) var5 + var7) <= ((long) this.field142 + this.field148)) {
                    var13 = (long) var5 + var7;
                }
                if (var15 > -1L && var13 > var15) {
                    int var17 = (int) (var13 - var15);
                    class87.method635(this.field132, (int) (var15 - this.field148), arg1, (int) (var15 - var7) + var6, var17);
                    if (var13 > this.field151) {
                        arg3 = (int) ((long) arg3 - (var13 - this.field151));
                        this.field151 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field150 = -1L;
            throw var19;
        }
        if (arg0 < arg3) {
            throw new EOFException();
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field152[var0] = var1;
        }
        field155 = false;
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(B)Ljava/io/File;", line = 540)
    private final File method101(byte arg0) {
        if (arg0 <= 16) {
            this.method96((byte) 41);
        }
        field136++;
        return this.field147.method553((byte) 126);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[B)V", line = 578)
    public final void method102(int arg0, byte[] arg1) throws IOException {
        this.method100(arg0 + arg0, arg1, 0, arg1.length);
        field154++;
    }
}
