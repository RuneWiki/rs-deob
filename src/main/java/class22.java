import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class22 {

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    private int field335 = 0;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "J")
    private long field334 = -1L;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "J")
    private long field346 = -1L;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Lmea;")
    private class455 field338;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "J")
    private long field353;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "J")
    private long field352;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "J")
    private long field342;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[B")
    private byte[] field333;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "[B")
    private byte[] field339;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "J")
    private long field348;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Leia;")
    public static class255 field336;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field356;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    private final void method170(byte arg0) throws IOException {
        this.field343 = 0;
        field351++;
        if (this.field348 != this.field342) {
            this.field338.method2701(this.field342, (byte) -105);
            this.field348 = this.field342;
        }
        this.field346 = this.field342;
        while (this.field339.length > this.field343) {
            int var2 = this.field339.length - this.field343;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field338.method2703(this.field343, this.field339, var2, (byte) -82);
            if (var3 == -1) {
                break;
            }
            this.field343 += var3;
            this.field348 += var3;
        }
        if (arg0 != 83) {
            this.field333 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public final void method171(int arg0) throws IOException {
        this.method175((byte) 76);
        field354++;
        this.field338.method2702(-1);
        if (arg0 > -86) {
            this.field338 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([BI)V")
    public final void method172(byte[] arg0, int arg1) throws IOException {
        if (arg1 == 29669) {
            this.method173((byte) -36, arg0, 0, arg0.length);
            field345++;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B[BII)V")
    public final void method173(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field347++;
        try {
            if (arg1.length < arg2 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg1.length);
            }
            if (this.field334 != -1L && this.field342 >= this.field334 && ((long) arg3 + this.field342) <= (this.field334 + ((long) this.field335))) {
                class278.method1796(this.field333, (int) (this.field342 - this.field334), arg1, arg2, arg3);
                this.field342 += arg3;
                return;
            }
            if (arg0 >= -2) {
                method182();
            }
            long var5 = this.field342;
            int var7 = arg2;
            int var8 = arg3;
            if (this.field346 <= this.field342 && ((long) this.field343 + this.field346) > this.field342) {
                int var9 = (int) ((long) this.field343 + this.field346 - this.field342);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                class278.method1796(this.field339, (int) (this.field342 - this.field346), arg1, arg2, var9);
                this.field342 += var9;
                arg2 += var9;
                arg3 -= var9;
            }
            if (arg3 > this.field339.length) {
                this.field338.method2701(this.field342, (byte) -63);
                this.field348 = this.field342;
                while (arg3 > 0) {
                    int var11 = this.field338.method2703(arg2, arg1, arg3, (byte) -82);
                    if (var11 == -1) {
                        break;
                    }
                    this.field342 += var11;
                    this.field348 += var11;
                    arg2 += var11;
                    arg3 -= var11;
                }
            } else if (arg3 > 0) {
                this.method170((byte) 83);
                int var10 = arg3;
                if (arg3 > this.field343) {
                    var10 = this.field343;
                }
                class278.method1796(this.field339, 0, arg1, arg2, var10);
                arg3 -= var10;
                this.field342 += var10;
                arg2 += var10;
            }
            if (this.field334 != -1L) {
                if (this.field334 > this.field342 && arg3 > 0) {
                    int var12 = (int) (this.field334 - this.field342) + arg2;
                    if (arg2 + arg3 < var12) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg2) {
                        arg1[arg2++] = 0;
                        arg3--;
                        this.field342++;
                    }
                }
                long var13 = -1L;
                if (this.field334 >= var5 && ((long) var8 + var5) > this.field334) {
                    var13 = this.field334;
                } else if (var5 >= this.field334 && (long) this.field335 + this.field334 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field335 + this.field334) > var5 && var5 + ((long) var8) >= (long) this.field335 + this.field334) {
                    var15 = this.field334 + ((long) this.field335);
                } else if (this.field334 < ((long) var8 + var5) && var5 + ((long) var8) <= (long) this.field335 + this.field334) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class278.method1796(this.field333, (int) (var13 - this.field334), arg1, var7 + ((int) (var13 - var5)), var17);
                    if (this.field342 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field342));
                        this.field342 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field348 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZJ)V")
    public final void method174(boolean arg0, long arg1) throws IOException {
        field349++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method180(1));
        }
        if (!arg0) {
            method179((byte) 56);
        }
        this.field342 = arg1;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    private final void method175(byte arg0) throws IOException {
        field344++;
        int var2 = -44 / ((-arg0 - 11) / 61);
        if (this.field334 == -1L) {
            return;
        }
        if (this.field348 != this.field334) {
            this.field338.method2701(this.field334, (byte) -16);
            this.field348 = this.field334;
        }
        this.field338.method2700(0, this.field333, 1, this.field335);
        this.field348 += this.field335;
        if (this.field353 < this.field348) {
            this.field353 = this.field348;
        }
        long var3 = -1L;
        long var5 = -1L;
        if (this.field346 <= this.field334 && (long) this.field343 + this.field346 > this.field334) {
            var3 = this.field334;
        } else if (this.field346 >= this.field334 && ((long) this.field335 + this.field334) > this.field346) {
            var3 = this.field346;
        }
        if (this.field346 < (this.field334 + ((long) this.field335)) && ((long) this.field335 + this.field334) <= ((long) this.field343 + this.field346)) {
            var5 = (long) this.field335 + this.field334;
        } else if ((long) this.field343 + this.field346 > this.field334 && (long) this.field343 + this.field346 <= (long) this.field335 + this.field334) {
            var5 = (long) this.field343 + this.field346;
        }
        if (var3 > -1L && var5 > var3) {
            int var7 = (int) (var5 - var3);
            class278.method1796(this.field333, (int) (var3 - this.field334), this.field339, (int) (var3 - this.field346), var7);
        }
        this.field335 = 0;
        this.field334 = -1L;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIZ)I")
    public static final int method176(int arg0, int arg1, boolean arg2) {
        field350++;
        if (arg2) {
            return 0;
        }
        class166 var3 = class389.method2461((byte) -122, arg1, arg2);
        if (var3 == null) {
            return class744.field10278.method2290((byte) 102, arg1).field6242;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field2240.length; var5++) {
            if (var3.field2240[var5] == -1) {
                var4++;
            }
        }
        int var6 = var4 + (class744.field10278.method2290((byte) 125, arg1).field6242 - var3.field2240.length);
        int var7 = -62 % ((arg0 - 13) / 63);
        return var6;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)J")
    public final long method177(int arg0) {
        field341++;
        if (arg0 != -26316) {
            this.field346 = -46L;
        }
        return this.field352;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([BBII)V")
    public final void method178(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field355++;
        try {
            if (this.field352 < (long) arg3 + this.field342) {
                this.field352 = this.field342 + ((long) arg3);
            }
            if (this.field334 != -1L && (this.field342 < this.field334 || this.field342 > ((long) this.field335 + this.field334))) {
                this.method175((byte) 53);
            }
            if (this.field334 != -1L && ((long) arg3 + this.field342) > ((long) this.field333.length + this.field334)) {
                int var5 = (int) (this.field334 - (this.field342 - (long) this.field333.length));
                class278.method1796(arg0, arg2, this.field333, (int) (this.field342 - this.field334), var5);
                arg3 -= var5;
                this.field342 += var5;
                arg2 += var5;
                this.field335 = this.field333.length;
                this.method175((byte) -74);
            }
            if (this.field333.length < arg3) {
                if (this.field348 != this.field342) {
                    this.field338.method2701(this.field342, (byte) -120);
                    this.field348 = this.field342;
                }
                this.field338.method2700(arg2, arg0, 1, arg3);
                this.field348 += arg3;
                if (this.field348 > this.field353) {
                    this.field353 = this.field348;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field346 <= this.field342 && ((long) this.field343 + this.field346) > this.field342) {
                    var6 = this.field342;
                } else if (this.field346 >= this.field342 && ((long) arg3 + this.field342) > this.field346) {
                    var6 = this.field346;
                }
                if ((long) arg3 + this.field342 > this.field346 && (long) this.field343 + this.field346 >= (long) arg3 + this.field342) {
                    var8 = (long) arg3 + this.field342;
                } else if (((long) this.field343 + this.field346) > this.field342 && (this.field346 + ((long) this.field343)) <= ((long) arg3 + this.field342)) {
                    var8 = (long) this.field343 + this.field346;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class278.method1796(arg0, (int) ((long) arg2 + var6 - this.field342), this.field339, (int) (var6 - this.field346), var10);
                }
                this.field342 += arg3;
                return;
            }
            if (arg3 > 0) {
                if (this.field334 == -1L) {
                    this.field334 = this.field342;
                }
                class278.method1796(arg0, arg2, this.field333, (int) (this.field342 - this.field334), arg3);
                this.field342 += arg3;
                if ((this.field342 - this.field334) > ((long) this.field335)) {
                    this.field335 = (int) (this.field342 - this.field334);
                }
                return;
            }
        } catch (IOException var12) {
            this.field348 = -1L;
            throw var12;
        }
        if (arg1 < 61) {
            this.field343 = 59;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
    public static void method179(byte arg0) {
        if (arg0 < 80) {
            method181(false, -49, 18, -41);
        }
        field336 = null;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method180(int arg0) {
        if (arg0 == 1) {
            field337++;
            return this.field338.method2699(-88);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIII)I")
    public static final int method181(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field340++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (arg0) {
            return 107;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
    public static final void method182() {
        for (int var0 = 0; var0 < class490.field6806; var0++) {
            if (!class321.field4618[var0]) {
                class700 var1 = class369.field5356[var0];
                class540 var2 = var1.field9828;
                int var3 = var1.field9827;
                int var4 = var2.method3081(7036) - class30.field464;
                int var5 = (var4 * 2 >> class26.field388) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method3085(24859) - var4 >> class26.field388;
                int var9 = var2.method3084((byte) -16) - var4 >> class26.field388;
                int var10 = var2.method3084((byte) -16) + var4 >> class26.field388;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class710.field9947) {
                    var10 = class710.field9947 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field9813[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class405.field5875) {
                        var16 = class405.field5875 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class319 var19 = class771.method4264(var3, var17, var11, field356 == null ? (field356 = method183("nb")) : field356);
                        if (var19 != null && var19.field4586 != 0) {
                            if (var19.field4586 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field9813[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field9813[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field9813[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field9813[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class321.field4618[var0] = true;
                class528.field7227[var3].method1141(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lmea;II)V")
    public class22(class455 arg0, int arg1, int arg2) throws IOException {
        this.field338 = arg0;
        this.field352 = this.field353 = arg0.method2698(-83);
        this.field342 = 0L;
        this.field333 = new byte[arg2];
        this.field339 = new byte[arg1];
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method183(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
