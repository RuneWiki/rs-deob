import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class255 {

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    private int field3717 = 0;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "J")
    private long field3721 = -1L;

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "J")
    private long field3731 = -1L;

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "Lin;")
    private class211 field3729;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "J")
    private long field3724;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "J")
    private long field3720;

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "[B")
    private byte[] field3732;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "J")
    private long field3719;

    @OriginalMember(owner = "client!lt", name = "v", descriptor = "[B")
    private byte[] field3736;

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "Lrk;")
    public static class419 field3733 = new class419();

    @OriginalMember(owner = "client!lt", name = "w", descriptor = "[Lil;")
    public static class67[] field3737 = new class67[8];

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
    private int field3723;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!lt", name = "t", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "J")
    private long field3716;

    @OriginalMember(owner = "client!lt", name = "u", descriptor = "[I")
    public static int[] field3735;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZIIIILdda;)V")
    public static final void method1610(boolean arg0, int arg1, int arg2, int arg3, int arg4, class597 arg5) {
        class636.field9266 = arg1;
        class62.field731 = arg3;
        class534.field7910 = arg2;
        class110.field1406 = 1;
        if (arg4 != 0) {
            method1610(false, 127, -43, 114, 61, null);
        }
        field3728++;
        class548.field8167 = 10000;
        class212.field3119 = arg0;
        class42.field504 = arg5;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II[BI)V")
    public final void method1611(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3726++;
        try {
            if (((long) arg0 + this.field3719) > this.field3720) {
                this.field3720 = (long) arg0 + this.field3719;
            }
            if (this.field3721 != -1L && (this.field3721 > this.field3719 || this.field3719 > (long) this.field3717 + this.field3721)) {
                this.method1613(-1);
            }
            if (this.field3721 != -1L && ((long) arg0 + this.field3719) > ((long) this.field3732.length + this.field3721)) {
                int var5 = (int) ((long) this.field3732.length + this.field3721 - this.field3719);
                class473.method2883(arg2, arg3, this.field3732, (int) (this.field3719 - this.field3721), var5);
                arg0 -= var5;
                this.field3719 += var5;
                arg3 += var5;
                this.field3717 = this.field3732.length;
                this.method1613(-1);
            }
            if (arg0 > this.field3732.length) {
                if (this.field3719 != this.field3716) {
                    this.field3729.method1369(this.field3719, false);
                    this.field3716 = this.field3719;
                }
                this.field3729.method1368((byte) 37, arg3, arg0, arg2);
                this.field3716 += arg0;
                if (this.field3724 < this.field3716) {
                    this.field3724 = this.field3716;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field3731 <= this.field3719 && this.field3719 < (this.field3731 + ((long) this.field3723))) {
                    var6 = this.field3719;
                } else if (this.field3731 >= this.field3719 && this.field3731 < ((long) arg0 + this.field3719)) {
                    var6 = this.field3731;
                }
                if ((this.field3719 + ((long) arg0)) > this.field3731 && (long) arg0 + this.field3719 <= (long) this.field3723 + this.field3731) {
                    var8 = this.field3719 + ((long) arg0);
                } else if (((long) this.field3723 + this.field3731) > this.field3719 && ((long) this.field3723 + this.field3731) <= ((long) arg0 + this.field3719)) {
                    var8 = this.field3731 + ((long) this.field3723);
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class473.method2883(arg2, (int) ((long) arg3 + var6 - this.field3719), this.field3736, (int) (var6 - this.field3731), var10);
                }
                this.field3719 += arg0;
                return;
            }
            if (arg0 > 0) {
                if (this.field3721 == -1L) {
                    this.field3721 = this.field3719;
                }
                class473.method2883(arg2, arg3, this.field3732, (int) (this.field3719 - this.field3721), arg0);
                this.field3719 += arg0;
                if ((this.field3719 - this.field3721) > ((long) this.field3717)) {
                    this.field3717 = (int) (this.field3719 - this.field3721);
                }
                return;
            }
        } catch (IOException var13) {
            this.field3716 = -1L;
            throw var13;
        }
        int var12 = 47 / ((arg1 + 14) / 53);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)V")
    public static void method1612(boolean arg0) {
        field3737 = null;
        if (arg0) {
            field3737 = null;
        }
        field3733 = null;
        field3735 = null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
    private final void method1613(int arg0) throws IOException {
        field3718++;
        if (arg0 != -1) {
            this.field3729 = null;
        }
        if (this.field3721 == -1L) {
            return;
        }
        if (this.field3721 != this.field3716) {
            this.field3729.method1369(this.field3721, false);
            this.field3716 = this.field3721;
        }
        this.field3729.method1368((byte) 37, 0, this.field3717, this.field3732);
        this.field3716 += this.field3717;
        if (this.field3716 > this.field3724) {
            this.field3724 = this.field3716;
        }
        long var2 = -1L;
        long var4 = -1L;
        if (this.field3731 <= this.field3721 && this.field3721 < ((long) this.field3723 + this.field3731)) {
            var2 = this.field3721;
        } else if (this.field3731 >= this.field3721 && this.field3721 + ((long) this.field3717) > this.field3731) {
            var2 = this.field3731;
        }
        if (this.field3731 < ((long) this.field3717 + this.field3721) && (long) this.field3717 + this.field3721 <= (long) this.field3723 + this.field3731) {
            var4 = (long) this.field3717 + this.field3721;
        } else if ((long) this.field3723 + this.field3731 > this.field3721 && this.field3721 + ((long) this.field3717) >= (long) this.field3723 + this.field3731) {
            var4 = (long) this.field3723 + this.field3731;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class473.method2883(this.field3732, (int) (var2 - this.field3721), this.field3736, (int) (var2 - this.field3731), var6);
        }
        this.field3721 = -1L;
        this.field3717 = 0;
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
    private final void method1614(int arg0) throws IOException {
        this.field3723 = 0;
        if (arg0 < 27) {
            return;
        }
        field3725++;
        if (this.field3719 != this.field3716) {
            this.field3729.method1369(this.field3719, false);
            this.field3716 = this.field3719;
        }
        this.field3731 = this.field3719;
        while (this.field3723 < this.field3736.length) {
            int var2 = this.field3736.length - this.field3723;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3729.method1370(var2, this.field3736, (byte) 117, this.field3723);
            if (var3 == -1) {
                break;
            }
            this.field3723 += var3;
            this.field3716 += var3;
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(Z)Ljava/io/File;")
    private final File method1615(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field3722++;
            return this.field3729.method1371((byte) 113);
        }
    }

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)J")
    public final long method1616(int arg0) {
        field3730++;
        if (arg0 != -1) {
            method1612(false);
        }
        return this.field3720;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "([BIII)V")
    public final void method1617(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3715++;
        try {
            if ((arg1 + arg2) > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg0.length);
            }
            if (this.field3721 != -1L && this.field3719 >= this.field3721 && (long) this.field3717 + this.field3721 >= (long) arg1 + this.field3719) {
                class473.method2883(this.field3732, (int) (this.field3719 - this.field3721), arg0, arg2, arg1);
                this.field3719 += arg1;
                return;
            }
            long var5 = this.field3719;
            int var7 = arg2;
            int var8 = arg1;
            if (this.field3731 <= this.field3719 && this.field3719 < (long) this.field3723 + this.field3731) {
                int var9 = (int) ((long) this.field3723 + this.field3731 - this.field3719);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class473.method2883(this.field3736, (int) (this.field3719 - this.field3731), arg0, arg2, var9);
                arg1 -= var9;
                this.field3719 += var9;
                arg2 += var9;
            }
            if (this.field3736.length < arg1) {
                this.field3729.method1369(this.field3719, false);
                this.field3716 = this.field3719;
                while (arg1 > 0) {
                    int var11 = this.field3729.method1370(arg1, arg0, (byte) 111, arg2);
                    if (var11 == -1) {
                        break;
                    }
                    this.field3719 += var11;
                    this.field3716 += var11;
                    arg1 -= var11;
                    arg2 += var11;
                }
            } else if (arg1 > 0) {
                this.method1614(arg3 + 17633);
                int var10 = arg1;
                if (this.field3723 < arg1) {
                    var10 = this.field3723;
                }
                class473.method2883(this.field3736, 0, arg0, arg2, var10);
                arg2 += var10;
                arg1 -= var10;
                this.field3719 += var10;
            }
            if (this.field3721 != -1L) {
                if (this.field3719 < this.field3721 && arg1 > 0) {
                    int var12 = arg2 + ((int) (this.field3721 - this.field3719));
                    if ((arg1 + arg2) < var12) {
                        var12 = arg1 + arg2;
                    }
                    while (arg2 < var12) {
                        arg1--;
                        arg0[arg2++] = 0;
                        this.field3719++;
                    }
                }
                long var13 = -1L;
                if (this.field3721 >= var5 && this.field3721 < (long) var8 + var5) {
                    var13 = this.field3721;
                } else if (var5 >= this.field3721 && var5 < ((long) this.field3717 + this.field3721)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < this.field3721 + ((long) this.field3717) && (long) this.field3717 + this.field3721 <= var5 - -((long) var8)) {
                    var15 = (long) this.field3717 + this.field3721;
                } else if (this.field3721 < (long) var8 + var5 && (long) this.field3717 + this.field3721 >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class473.method2883(this.field3732, (int) (var13 - this.field3721), arg0, (int) (var13 - var5) + var7, var17);
                    if (this.field3719 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field3719));
                        this.field3719 = var15;
                    }
                }
            }
            if (arg3 != -17510) {
                this.field3732 = null;
            }
        } catch (IOException var19) {
            this.field3716 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B[B)V")
    public final void method1618(byte arg0, byte[] arg1) throws IOException {
        int var3 = 30 % ((arg0 - 62) / 46);
        field3727++;
        this.method1617(arg1, arg1.length, 0, -17510);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(JB)V")
    public final void method1619(long arg0, byte arg1) throws IOException {
        field3734++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1615(false));
        }
        this.field3719 = arg0;
        if (arg1 != 65) {
            this.field3731 = -107L;
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lin;II)V")
    public class255(class211 arg0, int arg1, int arg2) throws IOException {
        this.field3729 = arg0;
        this.field3720 = this.field3724 = arg0.method1372((byte) 125);
        this.field3732 = new byte[arg2];
        this.field3719 = 0L;
        this.field3736 = new byte[arg1];
    }
}
