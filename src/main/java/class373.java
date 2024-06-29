import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class373 {

    @OriginalMember(owner = "client!du", name = "k", descriptor = "J")
    private long field5379 = -1L;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    private int field5384 = 0;

    @OriginalMember(owner = "client!du", name = "y", descriptor = "J")
    private long field5393 = -1L;

    @OriginalMember(owner = "client!du", name = "w", descriptor = "Lqaa;")
    private class29 field5391;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "J")
    private long field5370;

    @OriginalMember(owner = "client!du", name = "s", descriptor = "J")
    private long field5387;

    @OriginalMember(owner = "client!du", name = "u", descriptor = "[B")
    private byte[] field5389;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "[B")
    private byte[] field5372;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "J")
    private long field5385;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "Z")
    public static boolean field5371 = false;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "J")
    public static volatile long field5369 = 0L;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5373 = null;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "I")
    public static int field5386 = -1;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    private int field5380;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!du", name = "t", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!du", name = "v", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!du", name = "x", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "J")
    private long field5377;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)Ljava/io/File;", line = 6)
    private final File method2311(int arg0) {
        field5390++;
        return arg0 < 119 ? null : this.field5391.method208(true);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IZI[B)V", line = 23)
    public final void method2312(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        field5381++;
        try {
            if (arg0 + arg2 > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg3.length);
            }
            if (this.field5393 != -1L && this.field5393 <= this.field5385 && (this.field5385 + ((long) arg2)) <= ((long) this.field5384 + this.field5393)) {
                class42.method288(this.field5389, (int) (this.field5385 - this.field5393), arg3, arg0, arg2);
                this.field5385 += arg2;
                return;
            }
            long var5 = this.field5385;
            int var7 = arg0;
            int var8 = arg2;
            if (this.field5379 <= this.field5385 && this.field5385 < ((long) this.field5380 + this.field5379)) {
                int var9 = (int) ((long) this.field5380 + this.field5379 - this.field5385);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class42.method288(this.field5372, (int) (this.field5385 - this.field5379), arg3, arg0, var9);
                this.field5385 += var9;
                arg0 += var9;
                arg2 -= var9;
            }
            if (arg2 > this.field5372.length) {
                this.field5391.method213((byte) -92, this.field5385);
                this.field5377 = this.field5385;
                while (arg2 > 0) {
                    int var11 = this.field5391.method212(arg3, arg2, arg0, 19065);
                    if (var11 == -1) {
                        break;
                    }
                    this.field5377 += var11;
                    arg2 -= var11;
                    arg0 += var11;
                    this.field5385 += var11;
                }
            } else if (arg2 > 0) {
                this.method2313(true);
                int var10 = arg2;
                if (arg2 > this.field5380) {
                    var10 = this.field5380;
                }
                class42.method288(this.field5372, 0, arg3, arg0, var10);
                arg0 += var10;
                arg2 -= var10;
                this.field5385 += var10;
            }
            if (arg1) {
                field5371 = false;
            }
            if (this.field5393 != -1L) {
                if (this.field5385 < this.field5393 && arg2 > 0) {
                    int var12 = (int) (this.field5393 - this.field5385) + arg0;
                    if (var12 > (arg0 + arg2)) {
                        var12 = arg0 + arg2;
                    }
                    while (arg0 < var12) {
                        arg2--;
                        arg3[arg0++] = 0;
                        this.field5385++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field5393 >= var5 && this.field5393 < (var5 + ((long) var8))) {
                    var13 = this.field5393;
                } else if (this.field5393 <= var5 && (long) this.field5384 + this.field5393 > var5) {
                    var13 = var5;
                }
                if (this.field5393 + ((long) this.field5384) > var5 && (var5 + ((long) var8)) >= ((long) this.field5384 + this.field5393)) {
                    var15 = this.field5393 + ((long) this.field5384);
                } else if (this.field5393 < (long) var8 + var5 && (long) var8 + var5 <= this.field5393 - -((long) this.field5384)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class42.method288(this.field5389, (int) (var13 - this.field5393), arg3, (int) (var13 - var5) + var7, var17);
                    if (this.field5385 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field5385));
                        this.field5385 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5377 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V", line = 216)
    private final void method2313(boolean arg0) throws IOException {
        if (!arg0) {
            this.field5384 = 34;
        }
        field5376++;
        this.field5380 = 0;
        if (this.field5385 != this.field5377) {
            this.field5391.method213((byte) -92, this.field5385);
            this.field5377 = this.field5385;
        }
        this.field5379 = this.field5385;
        while (this.field5372.length > this.field5380) {
            int var2 = this.field5372.length - this.field5380;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field5391.method212(this.field5372, var2, this.field5380, 19065);
            if (var3 == -1) {
                break;
            }
            this.field5377 += var3;
            this.field5380 += var3;
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V", line = 264)
    public static void method2314(int arg0) {
        field5373 = null;
        if (arg0 > -62) {
            method2322(30, -70);
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lqaa;II)V", line = 612)
    public class373(class29 arg0, int arg1, int arg2) throws IOException {
        this.field5391 = arg0;
        this.field5387 = this.field5370 = arg0.method215((byte) 109);
        this.field5389 = new byte[arg2];
        this.field5372 = new byte[arg1];
        this.field5385 = 0L;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "([BI)V", line = 278)
    public final void method2315(byte[] arg0, int arg1) throws IOException {
        field5375++;
        this.method2312(arg1, false, arg0.length, arg0);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(JZ)V", line = 289)
    public final void method2316(long arg0, boolean arg1) throws IOException {
        field5382++;
        if (!arg1) {
            this.method2311(22);
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2311(121));
        }
        this.field5385 = arg0;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V", line = 308)
    public final void method2317(byte arg0) throws IOException {
        this.method2319((byte) -96);
        field5392++;
        this.field5391.method210(14471);
        if (arg0 != -19) {
            this.field5372 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I[BBI)V", line = 320)
    public final void method2318(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field5383++;
        try {
            if ((long) arg0 + this.field5385 > this.field5387) {
                this.field5387 = this.field5385 + ((long) arg0);
            }
            if (this.field5393 != -1L && (this.field5393 > this.field5385 || (this.field5393 + ((long) this.field5384)) < this.field5385)) {
                this.method2319((byte) -96);
            }
            if (this.field5393 != -1L && ((long) arg0 + this.field5385) > ((long) this.field5389.length + this.field5393)) {
                int var5 = (int) ((long) this.field5389.length + this.field5393 - this.field5385);
                class42.method288(arg1, arg3, this.field5389, (int) (this.field5385 - this.field5393), var5);
                arg3 += var5;
                this.field5385 += var5;
                arg0 -= var5;
                this.field5384 = this.field5389.length;
                this.method2319((byte) -96);
            }
            if (arg0 <= this.field5389.length) {
                int var11 = 90 / ((arg2 + 24) / 45);
                if (arg0 > 0) {
                    if (this.field5393 == -1L) {
                        this.field5393 = this.field5385;
                    }
                    class42.method288(arg1, arg3, this.field5389, (int) (this.field5385 - this.field5393), arg0);
                    this.field5385 += arg0;
                    if ((this.field5385 - this.field5393) > ((long) this.field5384)) {
                        this.field5384 = (int) (this.field5385 - this.field5393);
                    }
                }
            } else {
                if (this.field5385 != this.field5377) {
                    this.field5391.method213((byte) -92, this.field5385);
                    this.field5377 = this.field5385;
                }
                this.field5391.method209(false, arg0, arg3, arg1);
                this.field5377 += arg0;
                if (this.field5370 < this.field5377) {
                    this.field5370 = this.field5377;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field5385 >= this.field5379 && this.field5385 < this.field5379 + ((long) this.field5380)) {
                    var6 = this.field5385;
                } else if (this.field5379 >= this.field5385 && this.field5379 < ((long) arg0 + this.field5385)) {
                    var6 = this.field5379;
                }
                if (this.field5379 < (long) arg0 + this.field5385 && ((long) arg0 + this.field5385) <= ((long) this.field5380 + this.field5379)) {
                    var8 = (long) arg0 + this.field5385;
                } else if (this.field5385 < (long) this.field5380 + this.field5379 && (this.field5379 + ((long) this.field5380)) <= ((long) arg0 + this.field5385)) {
                    var8 = this.field5379 + ((long) this.field5380);
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class42.method288(arg1, (int) (var6 + (long) arg3 - this.field5385), this.field5372, (int) (var6 - this.field5379), var10);
                }
                this.field5385 += arg0;
            }
        } catch (IOException var13) {
            this.field5377 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(B)V", line = 448)
    private final void method2319(byte arg0) throws IOException {
        if (this.field5393 != -1L) {
            if (this.field5393 != this.field5377) {
                this.field5391.method213((byte) -92, this.field5393);
                this.field5377 = this.field5393;
            }
            this.field5391.method209(false, this.field5384, 0, this.field5389);
            this.field5377 += this.field5384;
            if (this.field5370 < this.field5377) {
                this.field5370 = this.field5377;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field5379 <= this.field5393 && this.field5393 < (this.field5379 + ((long) this.field5380))) {
                var2 = this.field5393;
            } else if (this.field5379 >= this.field5393 && ((long) this.field5384 + this.field5393) > this.field5379) {
                var2 = this.field5379;
            }
            if (this.field5379 < ((long) this.field5384 + this.field5393) && (long) this.field5384 + this.field5393 <= (long) this.field5380 + this.field5379) {
                var4 = (long) this.field5384 + this.field5393;
            } else if (this.field5393 < ((long) this.field5380 + this.field5379) && (long) this.field5380 + this.field5379 <= this.field5393 - -((long) this.field5384)) {
                var4 = this.field5379 + ((long) this.field5380);
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class42.method288(this.field5389, (int) (var2 - this.field5393), this.field5372, (int) (var2 - this.field5379), var6);
            }
            this.field5393 = -1L;
            this.field5384 = 0;
        }
        field5374++;
        if (arg0 != -96) {
            method2314(-22);
        }
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(B)J", line = 529)
    public final long method2320(byte arg0) {
        field5378++;
        if (arg0 < 70) {
            method2322(-14, 102);
        }
        return this.field5387;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(III)V", line = 551)
    public static final void method2321(int arg0, int arg1, int arg2) {
        boolean var3 = class378.field5427[0][arg1][arg2] != null && class378.field5427[0][arg1][arg2].field5431 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class378.field5427[var4][arg1][arg2] == null) {
                class379 var5 = class378.field5427[var4][arg1][arg2] = new class379(var4);
                if (var3) {
                    var5.field5440++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(II)V", line = 581)
    public static final void method2322(int arg0, int arg1) {
        class265.field3746 = -1;
        field5388++;
        if (arg1 == 37) {
            class436.field6217 = 3.0F;
        } else if (arg1 == 50) {
            class436.field6217 = 4.0F;
        } else if (arg1 == 75) {
            class436.field6217 = 6.0F;
        } else if (arg1 == 100) {
            class436.field6217 = 8.0F;
        } else if (arg1 == 200) {
            class436.field6217 = 16.0F;
        }
        if (arg0 >= -88) {
            field5371 = true;
        }
        class265.field3746 = -1;
    }
}
