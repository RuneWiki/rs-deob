import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class462 {

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    private int field6380 = 0;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "J")
    private long field6385 = -1L;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "J")
    private long field6397 = -1L;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "Lsr;")
    private class164 field6394;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "J")
    private long field6381;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "J")
    private long field6392;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "J")
    private long field6383;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "[B")
    private byte[] field6393;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "[B")
    private byte[] field6386;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field6404 = 0;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    private int field6384;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "J")
    private long field6395;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "[[Lcr;")
    public static class403[][] field6402;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    private final void method2628(int arg0) throws IOException {
        this.field6384 = 0;
        field6391++;
        if (arg0 != -200000001) {
            this.method2630(105);
        }
        if (this.field6395 != this.field6383) {
            this.field6394.method1111(this.field6383, false);
            this.field6395 = this.field6383;
        }
        this.field6397 = this.field6383;
        while (this.field6384 < this.field6393.length) {
            int var2 = this.field6393.length - this.field6384;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field6394.method1110(this.field6393, this.field6384, 15596, var2);
            if (var3 == -1) {
                break;
            }
            this.field6395 += var3;
            this.field6384 += var3;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([BB)V")
    public final void method2629(byte[] arg0, byte arg1) throws IOException {
        this.method2632(0, arg0, -1, arg0.length);
        if (arg1 <= 19) {
            this.field6397 = 12L;
        }
        field6388++;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method2630(int arg0) {
        field6382++;
        if (arg0 >= -65) {
            field6404 = -54;
        }
        return this.field6394.method1107(false);
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
    public static final void method2631(int arg0) {
        class169.field2465.method176(-1);
        if (arg0 < 98) {
            field6398 = 12;
        }
        field6389++;
        class301.field3985.method176(-1);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[BII)V")
    public final void method2632(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field6399++;
        try {
            if ((arg0 + arg3) > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg1.length);
            }
            if (this.field6385 != -1L && this.field6383 >= this.field6385 && ((long) this.field6380 + this.field6385) >= ((long) arg3 + this.field6383)) {
                class254.method1529(this.field6386, (int) (this.field6383 - this.field6385), arg1, arg0, arg3);
                this.field6383 += arg3;
                return;
            }
            long var5 = this.field6383;
            int var7 = arg0;
            int var8 = arg3;
            if (this.field6397 <= this.field6383 && this.field6397 + ((long) this.field6384) > this.field6383) {
                int var9 = (int) (this.field6397 + (long) this.field6384 - this.field6383);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class254.method1529(this.field6393, (int) (this.field6383 - this.field6397), arg1, arg0, var9);
                arg3 -= var9;
                arg0 += var9;
                this.field6383 += var9;
            }
            if (this.field6393.length < arg3) {
                this.field6394.method1111(this.field6383, false);
                this.field6395 = this.field6383;
                while (arg3 > 0) {
                    int var10 = this.field6394.method1110(arg1, arg0, 15596, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 -= var10;
                    arg0 += var10;
                    this.field6395 += var10;
                    this.field6383 += var10;
                }
            } else if (arg3 > 0) {
                this.method2628(arg2 ^ 0xBEBC200);
                int var11 = arg3;
                if (arg3 > this.field6384) {
                    var11 = this.field6384;
                }
                class254.method1529(this.field6393, 0, arg1, arg0, var11);
                arg3 -= var11;
                this.field6383 += var11;
                arg0 += var11;
            }
            if (this.field6385 != -1L) {
                if (this.field6383 < this.field6385 && arg3 > 0) {
                    int var12 = (int) (this.field6385 - this.field6383) + arg0;
                    if (var12 > arg0 + arg3) {
                        var12 = arg0 + arg3;
                    }
                    while (arg0 < var12) {
                        arg3--;
                        arg1[arg0++] = 0;
                        this.field6383++;
                    }
                }
                long var13 = -1L;
                if (this.field6385 >= var5 && this.field6385 < var5 + ((long) var8)) {
                    var13 = this.field6385;
                } else if (var5 >= this.field6385 && var5 < (long) this.field6380 + this.field6385) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field6380 + this.field6385 && ((long) this.field6380 + this.field6385) <= (var5 + ((long) var8))) {
                    var15 = (long) this.field6380 + this.field6385;
                } else if (var5 + ((long) var8) > this.field6385 && ((long) this.field6380 + this.field6385) >= ((long) var8 + var5)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class254.method1529(this.field6386, (int) (var13 - this.field6385), arg1, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field6383) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field6383));
                        this.field6383 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field6395 = -1L;
            throw var19;
        }
        if (arg2 > ~arg3) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lda;Lda;Z)V")
    public static final void method2633(class42 arg0, class42 arg1, boolean arg2) {
        if (arg1.field630 != null) {
            arg1.method300(false);
        }
        field6403++;
        arg1.field630 = arg0.field630;
        arg1.field619 = arg0;
        arg1.field630.field619 = arg1;
        if (!arg2) {
            method2635((byte) 48);
        }
        arg1.field619.field630 = arg1;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
    private final void method2634(int arg0) throws IOException {
        if (this.field6385 != -1L) {
            if (this.field6395 != this.field6385) {
                this.field6394.method1111(this.field6385, false);
                this.field6395 = this.field6385;
            }
            this.field6394.method1108((byte) -60, 0, this.field6386, this.field6380);
            this.field6395 += this.field6380;
            if (this.field6381 < this.field6395) {
                this.field6381 = this.field6395;
            }
            long var2 = -1L;
            if (this.field6385 >= this.field6397 && this.field6385 < (long) this.field6384 + this.field6397) {
                var2 = this.field6385;
            } else if (this.field6385 <= this.field6397 && ((long) this.field6380 + this.field6385) > this.field6397) {
                var2 = this.field6397;
            }
            long var4 = -1L;
            if ((long) this.field6380 + this.field6385 > this.field6397 && (long) this.field6380 + this.field6385 <= (long) this.field6384 + this.field6397) {
                var4 = (long) this.field6380 + this.field6385;
            } else if ((long) this.field6384 + this.field6397 > this.field6385 && this.field6397 + ((long) this.field6384) <= (long) this.field6380 + this.field6385) {
                var4 = (long) this.field6384 + this.field6397;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class254.method1529(this.field6386, (int) (var2 - this.field6385), this.field6393, (int) (var2 - this.field6397), var6);
            }
            this.field6385 = -1L;
            this.field6380 = 0;
        }
        if (arg0 <= 23) {
            this.field6392 = 57L;
        }
        field6400++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static void method2635(byte arg0) {
        int var1 = -75 % ((arg0 + 50) / 35);
        field6402 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II[BI)V")
    public final void method2636(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field6396++;
        try {
            if (((long) arg0 + this.field6383) > this.field6392) {
                this.field6392 = this.field6383 + ((long) arg0);
            }
            if (this.field6385 != -1L && (this.field6385 > this.field6383 || this.field6383 > (this.field6385 + ((long) this.field6380)))) {
                this.method2634(44);
            }
            if (this.field6385 != -1L && ((long) this.field6386.length + this.field6385) < ((long) arg0 + this.field6383)) {
                int var5 = (int) (this.field6385 + (long) this.field6386.length - this.field6383);
                class254.method1529(arg2, arg1, this.field6386, (int) (this.field6383 - this.field6385), var5);
                arg1 += var5;
                this.field6383 += var5;
                arg0 -= var5;
                this.field6380 = this.field6386.length;
                this.method2634(105);
            }
            if (arg0 > this.field6386.length) {
                if (this.field6395 != this.field6383) {
                    this.field6394.method1111(this.field6383, false);
                    this.field6395 = this.field6383;
                }
                this.field6394.method1108((byte) -60, arg1, arg2, arg0);
                this.field6395 += arg0;
                if (this.field6395 > this.field6381) {
                    this.field6381 = this.field6395;
                }
                long var6 = -1L;
                if (this.field6397 <= this.field6383 && (long) this.field6384 + this.field6397 > this.field6383) {
                    var6 = this.field6383;
                } else if (this.field6397 >= this.field6383 && ((long) arg0 + this.field6383) > this.field6397) {
                    var6 = this.field6397;
                }
                long var8 = -1L;
                if (((long) arg0 + this.field6383) > this.field6397 && (long) arg0 + this.field6383 <= (long) this.field6384 + this.field6397) {
                    var8 = (long) arg0 + this.field6383;
                } else if (((long) this.field6384 + this.field6397) > this.field6383 && (long) arg0 + this.field6383 >= this.field6397 - -((long) this.field6384)) {
                    var8 = (long) this.field6384 + this.field6397;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class254.method1529(arg2, (int) ((long) arg1 + var6 - this.field6383), this.field6393, (int) (var6 - this.field6397), var10);
                }
                this.field6383 += arg0;
                return;
            }
            if (arg0 > 0) {
                if (this.field6385 == -1L) {
                    this.field6385 = this.field6383;
                }
                class254.method1529(arg2, arg1, this.field6386, (int) (this.field6383 - this.field6385), arg0);
                this.field6383 += arg0;
                if ((this.field6383 - this.field6385) > ((long) this.field6380)) {
                    this.field6380 = (int) (this.field6383 - this.field6385);
                }
                return;
            }
        } catch (IOException var13) {
            this.field6395 = -1L;
            throw var13;
        }
        int var12 = -31 % ((12 - arg3) / 47);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(JI)V")
    public final void method2637(long arg0, int arg1) throws IOException {
        field6390++;
        if (arg1 > -102) {
            method2631(-94);
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2630(-94));
        }
        this.field6383 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
    public static final void method2638(int arg0, int arg1) {
        if (arg0 != -31757) {
            field6387 = 104;
        }
        if (class342.field4520 == 0) {
            class399.field5369.method1932((byte) 127, arg1);
        } else {
            class528.field7808 = arg1;
        }
        field6379++;
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)J")
    public final long method2639(int arg0) {
        field6401++;
        if (arg0 != 2) {
            this.field6383 = 21L;
        }
        return this.field6392;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lsr;II)V")
    public class462(class164 arg0, int arg1, int arg2) throws IOException {
        this.field6394 = arg0;
        this.field6392 = this.field6381 = arg0.method1112(106);
        this.field6383 = 0L;
        this.field6393 = new byte[arg1];
        this.field6386 = new byte[arg2];
    }
}
