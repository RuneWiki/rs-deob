import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class23 {

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    private int field397 = 0;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "J")
    private long field380 = -1L;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "J")
    private long field403 = -1L;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Lwc;")
    private class245 field391;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "J")
    private long field395;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "J")
    private long field385;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "J")
    private long field405;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "[B")
    private byte[] field383;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[B")
    private byte[] field384;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field382 = 0;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "S")
    public static short field394 = 320;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Ljava/lang/String;")
    public static String field398 = "Please wait...";

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "[I")
    public static int[] field406 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "J")
    private long field407;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "Lac;")
    public static class139 field399;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "Lel;")
    public static class213 field409;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "[I")
    public static int[] field389;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "[Lel;")
    public static class213[] field387;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    private final void method197(byte arg0) throws IOException {
        field393++;
        this.field381 = 0;
        if (this.field407 != this.field405) {
            this.field391.method1664(this.field405, -82);
            this.field407 = this.field405;
        }
        this.field380 = this.field405;
        while (this.field381 < this.field383.length) {
            int var2 = this.field383.length - this.field381;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field391.method1665(86, this.field383, var2, this.field381);
            if (var3 == -1) {
                break;
            }
            this.field407 += (long) var3;
            this.field381 += var3;
        }
        int var4 = -29 / ((arg0 + 36) / 51);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)V")
    public static final void method198(byte arg0, int arg1) {
        if (arg0 < 79) {
            method203(-47, 5, -12);
        }
        field402++;
        class272.field4346.method1166((byte) 23, arg1);
        class141.field2102.method1166((byte) 23, arg1);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)Ljava/io/File;")
    private final File method199(byte arg0) {
        field386++;
        return arg0 > -64 ? null : this.field391.method1661((byte) 54);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[BI)V")
    public final void method200(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field396++;
        try {
            if (arg2.length < arg1 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg1 - arg2.length);
            }
            if ((long) arg0 != this.field403 && this.field403 <= this.field405 && (long) arg1 + this.field405 <= this.field403 - -((long) this.field397)) {
                class81.method638(this.field384, (int) (this.field405 - this.field403), arg2, arg3, arg1);
                this.field405 += (long) arg1;
                return;
            }
            long var5 = this.field405;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field380 <= this.field405 && this.field405 < (long) this.field381 + this.field380) {
                int var9 = (int) ((long) this.field381 + this.field380 - this.field405);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class81.method638(this.field383, (int) (this.field405 - this.field380), arg2, arg3, var9);
                arg3 += var9;
                this.field405 += (long) var9;
                arg1 -= var9;
            }
            if (arg1 > this.field383.length) {
                this.field391.method1664(this.field405, -105);
                this.field407 = this.field405;
                while (arg1 > 0) {
                    int var11 = this.field391.method1665(82, arg2, arg1, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    this.field405 += (long) var11;
                    this.field407 += (long) var11;
                    arg3 += var11;
                    arg1 -= var11;
                }
            } else if (arg1 > 0) {
                this.method197((byte) 49);
                int var10 = arg1;
                if (arg1 > this.field381) {
                    var10 = this.field381;
                }
                arg1 -= var10;
                class81.method638(this.field383, 0, arg2, arg3, var10);
                this.field405 += (long) var10;
                arg3 += var10;
            }
            if (this.field403 != -1L) {
                if (this.field405 < this.field403 && arg1 > 0) {
                    int var12 = (int) (this.field403 - this.field405) + arg3;
                    if (var12 > arg1 + arg3) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg3) {
                        arg2[arg3++] = 0;
                        this.field405++;
                        arg1--;
                    }
                }
                long var13 = -1L;
                if (this.field403 >= var5 && this.field403 < (long) var8 + var5) {
                    var13 = this.field403;
                } else if (var5 >= this.field403 && var5 < (long) this.field397 + this.field403) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field397 + this.field403 && ((long) var8 + var5) >= ((long) this.field397 + this.field403)) {
                    var15 = this.field403 + ((long) this.field397);
                } else if (this.field403 < var5 + ((long) var8) && ((long) var8 + var5) <= ((long) this.field397 + this.field403)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class81.method638(this.field384, (int) (var13 - this.field403), arg2, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field405) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field405));
                        this.field405 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field407 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(JB)V")
    public final void method201(long arg0, byte arg1) throws IOException {
        field388++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method199((byte) -113));
        }
        int var4 = 72 / ((4 - arg1) / 59);
        this.field405 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([BIZI)V")
    public final void method202(byte[] arg0, int arg1, boolean arg2, int arg3) throws IOException {
        field392++;
        try {
            if (((long) arg1 + this.field405) > this.field385) {
                this.field385 = (long) arg1 + this.field405;
            }
            if (this.field403 != -1L && (this.field403 > this.field405 || ((long) this.field397 + this.field403) < this.field405)) {
                this.method207(128);
            }
            if (!arg2) {
                if (this.field403 != -1L && this.field405 + ((long) arg1) > (long) this.field384.length + this.field403) {
                    int var5 = (int) (this.field403 + (long) this.field384.length - this.field405);
                    class81.method638(arg0, arg3, this.field384, (int) (this.field405 - this.field403), var5);
                    this.field405 += (long) var5;
                    arg3 += var5;
                    this.field397 = this.field384.length;
                    this.method207(128);
                    arg1 -= var5;
                }
                if (this.field384.length < arg1) {
                    long var6 = -1L;
                    if (this.field407 != this.field405) {
                        this.field391.method1664(this.field405, -110);
                        this.field407 = this.field405;
                    }
                    long var8 = -1L;
                    this.field391.method1662(arg1, (byte) 30, arg3, arg0);
                    this.field407 += (long) arg1;
                    if (this.field405 >= this.field380 && (long) this.field381 + this.field380 > this.field405) {
                        var6 = this.field405;
                    } else if (this.field380 >= this.field405 && (long) arg1 + this.field405 > this.field380) {
                        var6 = this.field380;
                    }
                    if (this.field380 < ((long) arg1 + this.field405) && (long) arg1 + this.field405 <= (long) this.field381 + this.field380) {
                        var8 = this.field405 + ((long) arg1);
                    } else if (this.field405 < (this.field380 + ((long) this.field381)) && (long) arg1 + this.field405 >= (long) this.field381 + this.field380) {
                        var8 = (long) this.field381 + this.field380;
                    }
                    if (this.field395 < this.field407) {
                        this.field395 = this.field407;
                    }
                    if (var6 > -1L && var6 < var8) {
                        int var10 = (int) (var8 - var6);
                        class81.method638(arg0, (int) (var6 + (long) arg3 - this.field405), this.field383, (int) (var6 - this.field380), var10);
                    }
                    this.field405 += (long) arg1;
                } else if (arg1 > 0) {
                    if (this.field403 == -1L) {
                        this.field403 = this.field405;
                    }
                    class81.method638(arg0, arg3, this.field384, (int) (this.field405 - this.field403), arg1);
                    this.field405 += (long) arg1;
                    if ((long) this.field397 < this.field405 - this.field403) {
                        this.field397 = (int) (this.field405 - this.field403);
                    }
                }
            }
        } catch (IOException var12) {
            this.field407 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I")
    public static final int method203(int arg0, int arg1, int arg2) {
        field390++;
        int var3 = arg0 + (arg2 * 57);
        if (arg1 != 255) {
            field394 = 25;
        }
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)J")
    public final long method204(int arg0) {
        if (arg0 == 15914854) {
            field408++;
            return this.field385;
        } else {
            return 53L;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLkc;)V")
    public static final void method205(boolean arg0, class296 arg1) {
        if (class41.field686 == arg1.field4661 || arg1.field4727 == -1 || arg1.field4701 != 0 || (arg1.field4705 + 1) > class250.method1700(arg1.field4727, -57).field1602[arg1.field4765]) {
            int var2 = class41.field686 - arg1.field4714;
            int var3 = arg1.field4661 - arg1.field4714;
            int var4 = arg1.field4683 * 128 + (arg1.method1013(0) * 64);
            int var5 = arg1.field4682 * 128 + (arg1.method1013(0) * 64);
            int var6 = arg1.field4703 * 128 + arg1.method1013(0) * 64;
            int var7 = arg1.field4737 * 128 + arg1.method1013(0) * 64;
            arg1.field4709 = ((var3 - var2) * var5 + var2 * var7) / var3;
            arg1.field4725 = ((var3 - var2) * var4 + var2 * var6) / var3;
        }
        if (arg0) {
            field389 = null;
        }
        if (arg1.field4757 == 0) {
            arg1.field4696 = 1024;
        }
        field400++;
        if (arg1.field4757 == 1) {
            arg1.field4696 = 1536;
        }
        if (arg1.field4757 == 2) {
            arg1.field4696 = 0;
        }
        arg1.field4745 = 0;
        if (arg1.field4757 == 3) {
            arg1.field4696 = 512;
        }
        arg1.field4719 = arg1.field4696;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([BI)V")
    public final void method206(byte[] arg0, int arg1) throws IOException {
        int var3 = 13 % ((arg1 - 57) / 47);
        this.method200(-1, arg0.length, arg0, 0);
        field404++;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    private final void method207(int arg0) throws IOException {
        field401++;
        if (this.field403 != -1L) {
            long var2 = -1L;
            if (this.field407 != this.field403) {
                this.field391.method1664(this.field403, -74);
                this.field407 = this.field403;
            }
            long var4 = -1L;
            this.field391.method1662(this.field397, (byte) 36, 0, this.field384);
            this.field407 += (long) this.field397;
            if (this.field380 <= this.field403 && this.field380 + ((long) this.field381) > this.field403) {
                var4 = this.field403;
            } else if (this.field380 >= this.field403 && ((long) this.field397 + this.field403) > this.field380) {
                var4 = this.field380;
            }
            if (this.field407 > this.field395) {
                this.field395 = this.field407;
            }
            if (((long) this.field397 + this.field403) > this.field380 && ((long) this.field381 + this.field380) >= ((long) this.field397 + this.field403)) {
                var2 = this.field403 + ((long) this.field397);
            } else if (this.field380 + ((long) this.field381) > this.field403 && ((long) this.field397 + this.field403) >= ((long) this.field381 + this.field380)) {
                var2 = this.field380 + ((long) this.field381);
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class81.method638(this.field384, (int) (var4 - this.field403), this.field383, (int) (var4 - this.field380), var6);
            }
            this.field403 = -1L;
            this.field397 = 0;
        }
        if (arg0 != 128) {
            method198((byte) -58, -87);
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V")
    public static void method208(byte arg0) {
        field398 = null;
        field399 = null;
        field409 = null;
        if (arg0 <= -119) {
            field389 = null;
            field406 = null;
            field387 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lwc;II)V")
    public class23(class245 arg0, int arg1, int arg2) throws IOException {
        this.field391 = arg0;
        this.field385 = this.field395 = arg0.method1660((byte) -85);
        this.field405 = 0L;
        this.field383 = new byte[arg1];
        this.field384 = new byte[arg2];
    }
}
