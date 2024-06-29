import java.applet.Applet;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class421 {

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "J")
    private long field6120 = -1L;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "J")
    private long field6125 = -1L;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
    private int field6145 = 0;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "Lem;")
    private class203 field6141;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "J")
    private long field6123;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "J")
    private long field6121;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "[B")
    private byte[] field6137;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "[B")
    private byte[] field6143;

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "J")
    private long field6144;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "[I")
    public static int[] field6139 = new int[200];

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "[I")
    public static int[] field6136 = new int[6];

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
    private int field6135;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "J")
    private long field6134;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "Ljava/applet/Applet;")
    public static Applet field6129;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V", line = 7)
    private final void method2526(byte arg0) throws IOException {
        if (this.field6120 != -1L) {
            if (this.field6134 != this.field6120) {
                this.field6141.method1349(this.field6120, (byte) 116);
                this.field6134 = this.field6120;
            }
            this.field6141.method1345(this.field6145, 0, this.field6143, -4290);
            this.field6134 += this.field6145;
            if (this.field6123 < this.field6134) {
                this.field6123 = this.field6134;
            }
            long var2 = -1L;
            if (this.field6120 >= this.field6125 && this.field6120 < this.field6125 + ((long) this.field6135)) {
                var2 = this.field6120;
            } else if (this.field6120 <= this.field6125 && ((long) this.field6145 + this.field6120) > this.field6125) {
                var2 = this.field6125;
            }
            long var4 = -1L;
            if ((long) this.field6145 + this.field6120 > this.field6125 && (long) this.field6145 + this.field6120 <= this.field6125 - -((long) this.field6135)) {
                var4 = (long) this.field6145 + this.field6120;
            } else if ((long) this.field6135 + this.field6125 > this.field6120 && (long) this.field6135 + this.field6125 <= (long) this.field6145 + this.field6120) {
                var4 = (long) this.field6135 + this.field6125;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class476.method2792(this.field6143, (int) (var2 - this.field6120), this.field6137, (int) (var2 - this.field6125), var6);
            }
            this.field6120 = -1L;
            this.field6145 = 0;
        }
        field6138++;
        if (arg0 > -48) {
            this.method2530(17);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BLvq;)V", line = 81)
    public static final void method2527(byte arg0, class425 arg1) {
        int var2 = 96 % ((arg0 + 50) / 39);
        field6128++;
        if ((arg1 instanceof class577)) {
            class577 var4 = (class577) arg1;
            if (var4.field8121 == null) {
                return;
            }
            class333.method2102(class648.field9106.field3019 != var4.field3019, var4, (byte) 99);
        } else if (arg1 instanceof class491) {
            class491 var3 = (class491) arg1;
            class696.method3885(class648.field9106.field3019 != var3.field3019, (byte) 75, var3);
            return;
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lem;II)V", line = 495)
    public class421(class203 arg0, int arg1, int arg2) throws IOException {
        this.field6141 = arg0;
        this.field6121 = this.field6123 = arg0.method1351(-63);
        this.field6137 = new byte[arg1];
        this.field6143 = new byte[arg2];
        this.field6144 = 0L;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(B)V", line = 118)
    private final void method2528(byte arg0) throws IOException {
        field6130++;
        if (arg0 < 8) {
            this.method2536(52);
        }
        this.field6135 = 0;
        if (this.field6144 != this.field6134) {
            this.field6141.method1349(this.field6144, (byte) 117);
            this.field6134 = this.field6144;
        }
        this.field6125 = this.field6144;
        while (this.field6135 < this.field6137.length) {
            int var2 = this.field6137.length - this.field6135;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field6141.method1350(var2, this.field6135, (byte) -128, this.field6137);
            if (var3 == -1) {
                break;
            }
            this.field6135 += var3;
            this.field6134 += var3;
        }
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(B)V", line = 167)
    public static final void method2529(byte arg0) {
        field6131++;
        if (class420.field6113 == 7) {
            class88.method764(0, false);
            return;
        }
        class477.field6781 = class274.field4181;
        if (arg0 == 80) {
            class274.field4181 = null;
            class112.method868(13, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)J", line = 188)
    public final long method2530(int arg0) {
        field6119++;
        int var2 = -75 / ((arg0 + 75) / 46);
        return this.field6121;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[B)V", line = 201)
    public final void method2531(int arg0, byte[] arg1) throws IOException {
        this.method2532(-1, 0, arg1, arg1.length);
        field6146++;
        int var3 = 85 / ((55 - arg0) / 55);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II[BI)V", line = 214)
    public final void method2532(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field6127++;
        try {
            if (arg2.length < (arg1 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if ((long) arg0 != this.field6120 && this.field6120 <= this.field6144 && ((long) this.field6145 + this.field6120) >= ((long) arg3 + this.field6144)) {
                class476.method2792(this.field6143, (int) (this.field6144 - this.field6120), arg2, arg1, arg3);
                this.field6144 += arg3;
                return;
            }
            long var5 = this.field6144;
            int var7 = arg1;
            int var8 = arg3;
            if (this.field6144 >= this.field6125 && ((long) this.field6135 + this.field6125) > this.field6144) {
                int var9 = (int) ((long) this.field6135 + this.field6125 - this.field6144);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                class476.method2792(this.field6137, (int) (this.field6144 - this.field6125), arg2, arg1, var9);
                arg1 += var9;
                this.field6144 += var9;
                arg3 -= var9;
            }
            if (arg3 > this.field6137.length) {
                this.field6141.method1349(this.field6144, (byte) 121);
                this.field6134 = this.field6144;
                while (arg3 > 0) {
                    int var10 = this.field6141.method1350(arg3, arg1, (byte) -127, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 -= var10;
                    this.field6134 += var10;
                    this.field6144 += var10;
                    arg1 += var10;
                }
            } else if (arg3 > 0) {
                this.method2528((byte) 104);
                int var11 = arg3;
                if (this.field6135 < arg3) {
                    var11 = this.field6135;
                }
                class476.method2792(this.field6137, 0, arg2, arg1, var11);
                arg3 -= var11;
                arg1 += var11;
                this.field6144 += var11;
            }
            if (this.field6120 != -1L) {
                if (this.field6144 < this.field6120 && arg3 > 0) {
                    int var12 = arg1 + ((int) (this.field6120 - this.field6144));
                    if (arg1 + arg3 < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (arg1 < var12) {
                        arg2[arg1++] = 0;
                        arg3--;
                        this.field6144++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field6120 >= var5 && (var5 + ((long) var8)) > this.field6120) {
                    var13 = this.field6120;
                } else if (this.field6120 <= var5 && var5 < this.field6120 + ((long) this.field6145)) {
                    var13 = var5;
                }
                if (((long) this.field6145 + this.field6120) > var5 && (var5 + ((long) var8)) >= ((long) this.field6145 + this.field6120)) {
                    var15 = (long) this.field6145 + this.field6120;
                } else if (((long) var8 + var5) > this.field6120 && ((long) var8 + var5) <= ((long) this.field6145 + this.field6120)) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class476.method2792(this.field6143, (int) (var13 - this.field6120), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field6144 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field6144));
                        this.field6144 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field6134 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(JI)V", line = 402)
    public final void method2533(long arg0, int arg1) throws IOException {
        if (arg1 != 0) {
            method2529((byte) -15);
        }
        field6122++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2536(-8142));
        }
        this.field6144 = arg0;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V", line = 419)
    public static void method2534(int arg0) {
        field6129 = null;
        field6139 = null;
        field6136 = null;
        if (arg0 != 0) {
            field6140 = 100;
        }
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)V", line = 463)
    public final void method2535(int arg0) throws IOException {
        field6133++;
        this.method2526((byte) -49);
        if (arg0 == 0) {
            this.field6141.method1344((byte) 125);
        }
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)Ljava/io/File;", line = 481)
    private final File method2536(int arg0) {
        if (arg0 != -8142) {
            method2527((byte) -86, null);
        }
        field6126++;
        return this.field6141.method1348(13427);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z[BII)V", line = 513)
    public final void method2537(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field6142++;
        try {
            if (((long) arg3 + this.field6144) > this.field6121) {
                this.field6121 = this.field6144 + ((long) arg3);
            }
            if (this.field6120 != -1L && (this.field6144 < this.field6120 || (long) this.field6145 + this.field6120 < this.field6144)) {
                this.method2526((byte) -100);
            }
            if (this.field6120 != -1L && (long) arg3 + this.field6144 > this.field6120 - -((long) this.field6143.length)) {
                int var5 = (int) (this.field6120 + (long) this.field6143.length - this.field6144);
                class476.method2792(arg1, arg2, this.field6143, (int) (this.field6144 - this.field6120), var5);
                arg2 += var5;
                this.field6144 += var5;
                arg3 -= var5;
                this.field6145 = this.field6143.length;
                this.method2526((byte) -81);
            }
            if (arg0) {
                field6136 = null;
            }
            if (arg3 > this.field6143.length) {
                if (this.field6144 != this.field6134) {
                    this.field6141.method1349(this.field6144, (byte) 115);
                    this.field6134 = this.field6144;
                }
                this.field6141.method1345(arg3, arg2, arg1, -4290);
                this.field6134 += arg3;
                if (this.field6134 > this.field6123) {
                    this.field6123 = this.field6134;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field6125 <= this.field6144 && this.field6144 < (long) this.field6135 + this.field6125) {
                    var6 = this.field6144;
                } else if (this.field6125 >= this.field6144 && ((long) arg3 + this.field6144) > this.field6125) {
                    var6 = this.field6125;
                }
                if ((long) arg3 + this.field6144 > this.field6125 && this.field6125 + ((long) this.field6135) >= this.field6144 - -((long) arg3)) {
                    var8 = (long) arg3 + this.field6144;
                } else if (((long) this.field6135 + this.field6125) > this.field6144 && ((long) arg3 + this.field6144) >= ((long) this.field6135 + this.field6125)) {
                    var8 = (long) this.field6135 + this.field6125;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class476.method2792(arg1, (int) ((long) arg2 + var6 - this.field6144), this.field6137, (int) (var6 - this.field6125), var10);
                }
                this.field6144 += arg3;
            } else if (arg3 > 0) {
                if (this.field6120 == -1L) {
                    this.field6120 = this.field6144;
                }
                class476.method2792(arg1, arg2, this.field6143, (int) (this.field6144 - this.field6120), arg3);
                this.field6144 += arg3;
                if ((long) this.field6145 < this.field6144 - this.field6120) {
                    this.field6145 = (int) (this.field6144 - this.field6120);
                }
            }
        } catch (IOException var12) {
            this.field6134 = -1L;
            throw var12;
        }
    }
}
