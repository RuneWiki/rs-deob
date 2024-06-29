import java.awt.Component;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class29 {

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "J")
    private long field422 = -1L;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "J")
    private long field416 = -1L;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "I")
    private int field439 = 0;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Lee;")
    private class309 field421;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "J")
    private long field426;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "J")
    private long field437;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "[B")
    private byte[] field441;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "J")
    private long field418;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "[B")
    private byte[] field424;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field415 = 0;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "J")
    private long field438;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "Lgn;")
    public static class321 field430;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z[B)V", line = 12)
    public final void method256(boolean arg0, byte[] arg1) throws IOException {
        this.method263(-87, 0, arg1.length, arg1);
        field417++;
        if (!arg0) {
            method258(true);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Ljava/io/File;", line = 24)
    private final File method257(int arg0) {
        if (arg0 == 9585) {
            field420++;
            return this.field421.method2137(0);
        } else {
            return (File) null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V", line = 36)
    public static void method258(boolean arg0) {
        field430 = null;
        if (!arg0) {
            method260(26, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V", line = 50)
    public static final void method259(int arg0, int arg1) {
        class34 var2 = class91.method656(arg0, -2, arg1);
        field423++;
        var2.method306(arg1 ^ 0xF);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)V", line = 66)
    public static final void method260(int arg0, byte arg1) {
        field434++;
        short var2 = 256;
        if (var2 < arg0) {
            arg0 = var2;
        }
        int var3 = -30 / ((4 - arg1) / 56);
        if (arg0 > 10) {
            arg0 = 10;
        }
        class33.field489 += arg0 * 128;
        if (class33.field489 > class224.field3556.length) {
            class33.field489 -= class224.field3556.length;
            int var4 = (int) (Math.random() * 12.0D);
            class204.method1505(class47.field621[var4], (byte) 78);
        }
        int var5 = 0;
        int var6 = arg0 * 128;
        int var7 = (var2 - arg0) * 128;
        for (int var8 = 0; var8 < var7; var8++) {
            int var9 = class57.field789[var5 + var6] - class224.field3556[class33.field489 + var5 & class224.field3556.length - 1] * arg0 / 6;
            if (var9 < 0) {
                var9 = 0;
            }
            class57.field789[var5++] = var9;
        }
        for (int var10 = var2 - arg0; var10 < var2; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > 10 && var12 < 118) {
                    class57.field789[var11 + var12] = 255;
                } else {
                    class57.field789[var11 + var12] = 0;
                }
            }
        }
        for (int var14 = 0; var14 < (var2 - arg0); var14++) {
            class183.field2967[var14] = class183.field2967[arg0 + var14];
        }
        for (int var15 = var2 - arg0; var15 < var2; var15++) {
            class183.field2967[var15] = (int) (Math.sin((double) class11.field208 / 14.0D) * 16.0D + Math.sin((double) class11.field208 / 15.0D) * 14.0D + Math.sin((double) class11.field208 / 16.0D) * 12.0D);
            class11.field208++;
        }
        int var16 = ((class229.field3595 & 0x1) + arg0) / 2;
        class131.field1942 += arg0;
        if (var16 <= 0) {
            return;
        }
        for (int var17 = 0; var17 < class131.field1942; var17++) {
            int var18 = (int) (Math.random() * 128.0D) + 128;
            int var19 = (int) (Math.random() * 124.0D) + 2;
            class57.field789[(var18 << 7) + var19] = 192;
        }
        class131.field1942 = 0;
        for (int var20 = 0; var20 < var2; var20++) {
            int var21 = var20 * 128;
            int var22 = 0;
            for (int var23 = -var16; var23 < 128; var23++) {
                if (var23 + var16 < 128) {
                    var22 += class57.field789[var21 + var23 + var16];
                }
                if (var23 - var16 - 1 >= 0) {
                    var22 -= class57.field789[var21 + var23 - var16 - 1];
                }
                if (var23 >= 0) {
                    class15.field257[var23 + var21] = var22 / (var16 * 2 + 1);
                }
            }
        }
        for (int var24 = 0; var24 < 128; var24++) {
            int var25 = 0;
            for (int var26 = -var16; var26 < var2; var26++) {
                int var27 = var26 * 128;
                if (var16 + var26 < var2) {
                    var25 += class15.field257[var16 * 128 + var24 + var27];
                }
                if ((var26 - var16 - 1) >= 0) {
                    var25 -= class15.field257[var24 - (((var16 + 1) * 128) - var27)];
                }
                if (var26 >= 0) {
                    class57.field789[var24 + var27] = var25 / (var16 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILjava/awt/Component;II)Lwh;", line = 239)
    public static final class63 method261(int arg0, Component arg1, int arg2, int arg3) {
        field436++;
        try {
            Class var4 = Class.forName("se");
            class63 var5 = (class63) var4.getDeclaredConstructor().newInstance();
            var5.method513(2, arg2, arg3, arg1);
            if (arg0 != 0) {
                method264(25);
            }
            return var5;
        } catch (Throwable var8) {
            class76 var7 = new class76();
            var7.method513(2, arg2, arg3, arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIIIZ)V", line = 265)
    public static final void method262(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg1 >= -98) {
            method260(-110, (byte) 114);
        }
        field429++;
        class21.method211(arg3, arg0, arg2, arg4, (byte) -117, class318.field5036.length - 1, 0);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lee;II)V", line = 790)
    public class29(class309 arg0, int arg1, int arg2) throws IOException {
        this.field421 = arg0;
        this.field437 = this.field426 = arg0.method2138((byte) 108);
        this.field441 = new byte[arg1];
        this.field418 = 0L;
        this.field424 = new byte[arg2];
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III[B)V", line = 287)
    public final void method263(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field425++;
        try {
            if (arg3.length < arg1 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg3.length);
            }
            if (this.field416 != -1L && this.field418 >= this.field416 && (long) arg2 + this.field418 <= this.field416 - -((long) this.field439)) {
                class54.method422(this.field424, (int) (this.field418 - this.field416), arg3, arg1, arg2);
                this.field418 += (long) arg2;
                return;
            }
            int var5 = arg1;
            int var6 = arg2;
            long var7 = this.field418;
            if (this.field422 <= this.field418 && (long) this.field435 + this.field422 > this.field418) {
                int var9 = (int) (this.field422 + (long) this.field435 - this.field418);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                class54.method422(this.field441, (int) (this.field418 - this.field422), arg3, arg1, var9);
                this.field418 += (long) var9;
                arg1 += var9;
                arg2 -= var9;
            }
            if (this.field441.length < arg2) {
                this.field421.method2134(this.field418, -1);
                this.field438 = this.field418;
                while (arg2 > 0) {
                    int var11 = this.field421.method2133(arg3, arg1, (byte) 109, arg2);
                    if (var11 == -1) {
                        break;
                    }
                    arg2 -= var11;
                    this.field438 += (long) var11;
                    this.field418 += (long) var11;
                    arg1 += var11;
                }
            } else if (arg2 > 0) {
                int var10 = arg2;
                this.method265(124);
                if (this.field435 < arg2) {
                    var10 = this.field435;
                }
                class54.method422(this.field441, 0, arg3, arg1, var10);
                this.field418 += (long) var10;
                arg2 -= var10;
                arg1 += var10;
            }
            if (this.field416 != -1L) {
                if (this.field418 < this.field416 && arg2 > 0) {
                    int var12 = (int) (this.field416 - this.field418) + arg1;
                    if (var12 > (arg1 + arg2)) {
                        var12 = arg1 + arg2;
                    }
                    while (arg1 < var12) {
                        arg3[arg1++] = 0;
                        this.field418++;
                        arg2--;
                    }
                }
                long var13 = -1L;
                if (this.field416 >= var7 && this.field416 < (long) var6 + var7) {
                    var13 = this.field416;
                } else if (this.field416 <= var7 && this.field416 + ((long) this.field439) > var7) {
                    var13 = var7;
                }
                long var15 = -1L;
                if (var7 < this.field416 + ((long) this.field439) && (long) this.field439 + this.field416 <= (long) var6 + var7) {
                    var15 = (long) this.field439 + this.field416;
                } else if (this.field416 < (long) var6 + var7 && (long) var6 + var7 <= this.field416 - -((long) this.field439)) {
                    var15 = (long) var6 + var7;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class54.method422(this.field424, (int) (var13 - this.field416), arg3, (int) (var13 - var7) + var5, var17);
                    if (this.field418 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field418));
                        this.field418 = var15;
                    }
                }
            }
        } catch (IOException var20) {
            this.field438 = -1L;
            throw var20;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
        int var19 = 113 % ((arg0 - 46) / 55);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V", line = 478)
    public static final void method264(int arg0) {
        field431++;
        if (!class56.field783) {
            return;
        }
        class136 var1 = class294.method2048((byte) 115, class51.field646, class63.field920);
        if (var1 != null && var1.field2133 != null) {
            class15 var2 = new class15();
            var2.field243 = var1.field2133;
            var2.field248 = var1;
            class172.method1282(var2, (byte) 73);
        }
        class337.field5258 = arg0;
        class56.field783 = false;
        class167.method1250(var1, 412);
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V", line = 504)
    private final void method265(int arg0) throws IOException {
        if (arg0 < 115) {
            return;
        }
        field419++;
        this.field435 = 0;
        if (this.field438 != this.field418) {
            this.field421.method2134(this.field418, -1);
            this.field438 = this.field418;
        }
        this.field422 = this.field418;
        while (this.field435 < this.field441.length) {
            int var2 = this.field441.length - this.field435;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field421.method2133(this.field441, this.field435, (byte) 119, var2);
            if (var3 == -1) {
                break;
            }
            this.field435 += var3;
            this.field438 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(III[B)V", line = 550)
    public final void method266(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field414++;
        try {
            if (this.field437 < ((long) arg1 + this.field418)) {
                this.field437 = (long) arg1 + this.field418;
            }
            if (this.field416 != -1L && (this.field418 < this.field416 || this.field418 > (long) this.field439 + this.field416)) {
                this.method267(47);
            }
            if (this.field416 != -1L && ((long) arg1 + this.field418) > (this.field416 + ((long) this.field424.length))) {
                int var5 = (int) (this.field416 + (long) this.field424.length - this.field418);
                arg1 -= var5;
                class54.method422(arg3, arg2, this.field424, (int) (this.field418 - this.field416), var5);
                this.field418 += (long) var5;
                arg2 += var5;
                this.field439 = this.field424.length;
                this.method267(arg0 + 32034);
            }
            if (arg0 != -32050) {
                method258(true);
            }
            if (arg1 > this.field424.length) {
                if (this.field438 != this.field418) {
                    this.field421.method2134(this.field418, arg0 ^ 0x7D31);
                    this.field438 = this.field418;
                }
                long var6 = -1L;
                this.field421.method2136((byte) 45, arg3, arg1, arg2);
                long var8 = -1L;
                if (this.field422 < ((long) arg1 + this.field418) && (this.field422 + ((long) this.field435)) >= (this.field418 + ((long) arg1))) {
                    var6 = (long) arg1 + this.field418;
                } else if (((long) this.field435 + this.field422) > this.field418 && (this.field422 + ((long) this.field435)) <= (this.field418 + ((long) arg1))) {
                    var6 = (long) this.field435 + this.field422;
                }
                if (this.field422 <= this.field418 && ((long) this.field435 + this.field422) > this.field418) {
                    var8 = this.field418;
                } else if (this.field418 <= this.field422 && (long) arg1 + this.field418 > this.field422) {
                    var8 = this.field422;
                }
                this.field438 += (long) arg1;
                if (this.field438 > this.field426) {
                    this.field426 = this.field438;
                }
                if (var8 > -1L && var6 > var8) {
                    int var10 = (int) (var6 - var8);
                    class54.method422(arg3, (int) (var8 + (long) arg2 - this.field418), this.field441, (int) (var8 - this.field422), var10);
                }
                this.field418 += (long) arg1;
            } else if (arg1 > 0) {
                if (this.field416 == -1L) {
                    this.field416 = this.field418;
                }
                class54.method422(arg3, arg2, this.field424, (int) (this.field418 - this.field416), arg1);
                this.field418 += (long) arg1;
                if ((long) this.field439 < this.field418 - this.field416) {
                    this.field439 = (int) (this.field418 - this.field416);
                }
            }
        } catch (IOException var12) {
            this.field438 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V", line = 677)
    private final void method267(int arg0) throws IOException {
        if (this.field416 != -1L) {
            if (this.field438 != this.field416) {
                this.field421.method2134(this.field416, -1);
                this.field438 = this.field416;
            }
            this.field421.method2136((byte) -63, this.field424, this.field439, 0);
            this.field438 += (long) this.field439;
            long var2 = -1L;
            long var4 = -1L;
            if (((long) this.field439 + this.field416) > this.field422 && (this.field422 + ((long) this.field435)) >= ((long) this.field439 + this.field416)) {
                var4 = (long) this.field439 + this.field416;
            } else if (this.field416 < ((long) this.field435 + this.field422) && ((long) this.field435 + this.field422) <= ((long) this.field439 + this.field416)) {
                var4 = (long) this.field435 + this.field422;
            }
            if (this.field422 <= this.field416 && this.field416 < ((long) this.field435 + this.field422)) {
                var2 = this.field416;
            } else if (this.field416 <= this.field422 && ((long) this.field439 + this.field416) > this.field422) {
                var2 = this.field422;
            }
            if (this.field438 > this.field426) {
                this.field426 = this.field438;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class54.method422(this.field424, (int) (var2 - this.field416), this.field441, (int) (var2 - this.field422), var6);
            }
            this.field416 = -1L;
            this.field439 = 0;
        }
        field433++;
        int var7 = 112 % ((-arg0 - 52) / 32);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(JI)V", line = 749)
    public final void method268(long arg0, int arg1) throws IOException {
        if (arg1 != 128) {
            return;
        }
        field440++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method257(9585));
        }
        this.field418 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)J", line = 774)
    public final long method269(byte arg0) {
        if (arg0 != 62) {
            field430 = (class321) null;
        }
        field432++;
        return this.field437;
    }
}
