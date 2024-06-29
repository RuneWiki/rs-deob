import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class172 {

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "J")
    private long field2761 = -1L;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "J")
    private long field2762 = -1L;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    private int field2764 = 0;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Lje;")
    private class62 field2752;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "J")
    private long field2755;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "J")
    private long field2767;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "J")
    private long field2746;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "[B")
    private byte[] field2750;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "[B")
    private byte[] field2756;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field2753 = 0;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "Z")
    public static boolean field2763 = false;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Lvv;")
    public static class313 field2751 = new class313(48, 10);

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field2768 = Boolean.FALSE;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    private int field2758;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "J")
    private long field2749;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[B)V")
    public final void method1161(int arg0, byte[] arg1) throws IOException {
        field2745++;
        this.method1168(arg0, arg1.length, arg1, ~arg0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)J")
    public final long method1162(byte arg0) {
        field2754++;
        if (arg0 != 66) {
            field2763 = true;
        }
        return this.field2767;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method1163(int arg0) {
        field2751 = null;
        int var1 = 48 % ((33 - arg0) / 55);
        field2768 = null;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
    private final void method1164(byte arg0) throws IOException {
        if (this.field2761 != -1L) {
            if (this.field2761 != this.field2749) {
                this.field2752.method409(-48, this.field2761);
                this.field2749 = this.field2761;
            }
            this.field2752.method408(0, this.field2764, 0, this.field2756);
            this.field2749 += this.field2764;
            if (this.field2755 < this.field2749) {
                this.field2755 = this.field2749;
            }
            long var2 = -1L;
            if (this.field2762 <= this.field2761 && (long) this.field2758 + this.field2762 > this.field2761) {
                var2 = this.field2761;
            } else if (this.field2761 <= this.field2762 && this.field2762 < ((long) this.field2764 + this.field2761)) {
                var2 = this.field2762;
            }
            long var4 = -1L;
            if (((long) this.field2764 + this.field2761) > this.field2762 && (this.field2761 + ((long) this.field2764)) <= ((long) this.field2758 + this.field2762)) {
                var4 = this.field2761 + ((long) this.field2764);
            } else if (this.field2761 < ((long) this.field2758 + this.field2762) && (long) this.field2758 + this.field2762 <= this.field2761 - -((long) this.field2764)) {
                var4 = this.field2762 + ((long) this.field2758);
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class85.method613(this.field2756, (int) (var2 - this.field2761), this.field2750, (int) (var2 - this.field2762), var6);
            }
            this.field2764 = 0;
            this.field2761 = -1L;
        }
        field2765++;
        if (arg0 != -115) {
            this.field2752 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[BII)V")
    public final void method1165(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2747++;
        try {
            if (this.field2767 < ((long) arg2 + this.field2746)) {
                this.field2767 = this.field2746 + ((long) arg2);
            }
            if ((long) arg0 != this.field2761 && (this.field2761 > this.field2746 || this.field2746 > (this.field2761 + ((long) this.field2764)))) {
                this.method1164((byte) -115);
            }
            if (this.field2761 != -1L && (long) arg2 + this.field2746 > this.field2761 - -((long) this.field2756.length)) {
                int var5 = (int) ((long) this.field2756.length + this.field2761 - this.field2746);
                class85.method613(arg1, arg3, this.field2756, (int) (this.field2746 - this.field2761), var5);
                arg3 += var5;
                this.field2746 += var5;
                arg2 -= var5;
                this.field2764 = this.field2756.length;
                this.method1164((byte) -115);
            }
            if (this.field2756.length < arg2) {
                if (this.field2749 != this.field2746) {
                    this.field2752.method409(-97, this.field2746);
                    this.field2749 = this.field2746;
                }
                this.field2752.method408(arg0 + 1, arg2, arg3, arg1);
                this.field2749 += arg2;
                if (this.field2755 < this.field2749) {
                    this.field2755 = this.field2749;
                }
                long var6 = -1L;
                if (this.field2762 <= this.field2746 && (long) this.field2758 + this.field2762 > this.field2746) {
                    var6 = this.field2746;
                } else if (this.field2762 >= this.field2746 && this.field2762 < this.field2746 + ((long) arg2)) {
                    var6 = this.field2762;
                }
                long var8 = -1L;
                if (this.field2762 < (this.field2746 + ((long) arg2)) && this.field2762 + ((long) this.field2758) >= (long) arg2 + this.field2746) {
                    var8 = (long) arg2 + this.field2746;
                } else if (((long) this.field2758 + this.field2762) > this.field2746 && ((long) arg2 + this.field2746) >= (this.field2762 + ((long) this.field2758))) {
                    var8 = (long) this.field2758 + this.field2762;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class85.method613(arg1, (int) ((long) arg3 + var6 - this.field2746), this.field2750, (int) (var6 - this.field2762), var10);
                }
                this.field2746 += arg2;
            } else if (arg2 > 0) {
                if (this.field2761 == -1L) {
                    this.field2761 = this.field2746;
                }
                class85.method613(arg1, arg3, this.field2756, (int) (this.field2746 - this.field2761), arg2);
                this.field2746 += arg2;
                if ((long) this.field2764 < this.field2746 - this.field2761) {
                    this.field2764 = (int) (this.field2746 - this.field2761);
                }
            }
        } catch (IOException var12) {
            this.field2749 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method1166(int arg0) {
        field2766++;
        return arg0 == 2149 ? this.field2752.method413(-1) : null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIZLsq;B)V")
    public static final void method1167(int arg0, int arg1, int arg2, int arg3, boolean arg4, class145 arg5, byte arg6) {
        field2757++;
        if (class238.field4104 >= 50 || arg5 == null || arg5.field2359 == null || arg5.field2359.length <= arg1 || arg5.field2359[arg1] == null) {
            return;
        }
        int var7 = arg5.field2359[arg1][0];
        int var8 = var7 >> 8;
        int var9 = var7 >> 5 & 0x7;
        int var10 = var7 & 0x1F;
        if (arg6 <= 22) {
            method1163(30);
        }
        if (arg5.field2359[arg1].length > 1) {
            int var11 = (int) ((double) arg5.field2359[arg1].length * Math.random());
            if (var11 > 0) {
                var8 = arg5.field2359[arg1][var11];
            }
        }
        if (var10 == 0) {
            if (arg4) {
                class500.method2962(var8, 255, 127, var9, 0);
            }
        } else if (class510.field7403.field5121 != 0) {
            int var12 = arg3 - 64 >> 7;
            int var13 = arg0 - 64 >> 7;
            class241.field4163[class238.field4104++] = new class452((byte) 1, var8, var9, 0, 255, (arg2 << 24) + (var12 << 16) + (var13 << 8) + var10);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II[BI)V")
    public final void method1168(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2760++;
        try {
            if (arg0 + arg1 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg0 - arg2.length);
            }
            if (this.field2761 != -1L && this.field2761 <= this.field2746 && ((long) arg1 + this.field2746) <= ((long) this.field2764 + this.field2761)) {
                class85.method613(this.field2756, (int) (this.field2746 - this.field2761), arg2, arg0, arg1);
                this.field2746 += arg1;
                return;
            }
            long var5 = this.field2746;
            int var7 = arg0;
            int var8 = arg1;
            if (this.field2762 <= this.field2746 && this.field2762 + ((long) this.field2758) > this.field2746) {
                int var9 = (int) (this.field2762 + (long) this.field2758 - this.field2746);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class85.method613(this.field2750, (int) (this.field2746 - this.field2762), arg2, arg0, var9);
                this.field2746 += var9;
                arg1 -= var9;
                arg0 += var9;
            }
            if (arg1 > this.field2750.length) {
                this.field2752.method409(-88, this.field2746);
                this.field2749 = this.field2746;
                while (arg1 > 0) {
                    int var10 = this.field2752.method412(arg1, arg0, arg2, true);
                    if (var10 == -1) {
                        break;
                    }
                    this.field2746 += var10;
                    arg1 -= var10;
                    arg0 += var10;
                    this.field2749 += var10;
                }
            } else if (arg1 > 0) {
                this.method1169((byte) 70);
                int var11 = arg1;
                if (this.field2758 < arg1) {
                    var11 = this.field2758;
                }
                class85.method613(this.field2750, 0, arg2, arg0, var11);
                arg0 += var11;
                arg1 -= var11;
                this.field2746 += var11;
            }
            if ((long) arg3 != this.field2761) {
                if (this.field2761 > this.field2746 && arg1 > 0) {
                    int var12 = arg0 + ((int) (this.field2761 - this.field2746));
                    if (arg0 + arg1 < var12) {
                        var12 = arg0 + arg1;
                    }
                    while (var12 > arg0) {
                        arg2[arg0++] = 0;
                        arg1--;
                        this.field2746++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field2761 && this.field2761 < ((long) var8 + var5)) {
                    var13 = this.field2761;
                } else if (this.field2761 <= var5 && var5 < ((long) this.field2764 + this.field2761)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field2764 + this.field2761 > var5 && ((long) var8 + var5) >= (this.field2761 + ((long) this.field2764))) {
                    var15 = (long) this.field2764 + this.field2761;
                } else if (((long) var8 + var5) > this.field2761 && ((long) var8 + var5) <= ((long) this.field2764 + this.field2761)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class85.method613(this.field2756, (int) (var13 - this.field2761), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field2746 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field2746));
                        this.field2746 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2749 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V")
    private final void method1169(byte arg0) throws IOException {
        this.field2758 = 0;
        field2748++;
        if (arg0 != 70) {
            this.field2767 = 50L;
        }
        if (this.field2749 != this.field2746) {
            this.field2752.method409(-91, this.field2746);
            this.field2749 = this.field2746;
        }
        this.field2762 = this.field2746;
        while (this.field2750.length > this.field2758) {
            int var2 = this.field2750.length - this.field2758;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2752.method412(var2, this.field2758, this.field2750, true);
            if (var3 == -1) {
                break;
            }
            this.field2758 += var3;
            this.field2749 += var3;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(JB)V")
    public final void method1170(long arg0, byte arg1) throws IOException {
        field2759++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1166(2149));
        }
        this.field2746 = arg0;
        int var4 = 54 / ((arg1 + 63) / 58);
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lje;II)V")
    public class172(class62 arg0, int arg1, int arg2) throws IOException {
        this.field2752 = arg0;
        this.field2767 = this.field2755 = arg0.method411((byte) 17);
        this.field2746 = 0L;
        this.field2750 = new byte[arg1];
        this.field2756 = new byte[arg2];
    }
}
