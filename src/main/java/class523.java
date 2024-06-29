import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class523 {

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    private int field7488 = 0;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "J")
    private long field7492 = -1L;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "J")
    private long field7497 = -1L;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "Lip;")
    private class647 field7502;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "J")
    private long field7499;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "J")
    private long field7482;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "[B")
    private byte[] field7503;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "J")
    private long field7485;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "[B")
    private byte[] field7495;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Llc;")
    public static class590 field7486 = new class590("LIVE", 0);

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "Lpr;")
    public static class407 field7498 = new class407(80, 8);

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    private int field7500;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "J")
    private long field7504;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([BIBI)V", line = 15)
    public final void method2979(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field7501++;
        try {
            if (arg1 + arg3 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (this.field7497 != -1L && this.field7497 <= this.field7485 && (this.field7485 + ((long) arg1)) <= ((long) this.field7488 + this.field7497)) {
                class652.method3679(this.field7495, (int) (this.field7485 - this.field7497), arg0, arg3, arg1);
                this.field7485 += arg1;
                return;
            }
            long var5 = this.field7485;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field7492 <= this.field7485 && (long) this.field7500 + this.field7492 > this.field7485) {
                int var9 = (int) ((long) this.field7500 + this.field7492 - this.field7485);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class652.method3679(this.field7503, (int) (this.field7485 - this.field7492), arg0, arg3, var9);
                arg3 += var9;
                arg1 -= var9;
                this.field7485 += var9;
            }
            if (arg1 > this.field7503.length) {
                this.field7502.method3634(this.field7485, -84);
                this.field7504 = this.field7485;
                while (arg1 > 0) {
                    int var11 = this.field7502.method3630(false, arg0, arg1, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    this.field7504 += var11;
                    arg1 -= var11;
                    this.field7485 += var11;
                    arg3 += var11;
                }
            } else if (arg1 > 0) {
                this.method2981((byte) 0);
                int var10 = arg1;
                if (arg1 > this.field7500) {
                    var10 = this.field7500;
                }
                class652.method3679(this.field7503, 0, arg0, arg3, var10);
                this.field7485 += var10;
                arg3 += var10;
                arg1 -= var10;
            }
            if (arg2 != 91) {
                return;
            }
            if (this.field7497 != -1L) {
                if (this.field7485 < this.field7497 && arg1 > 0) {
                    int var12 = (int) (this.field7497 - this.field7485) + arg3;
                    if (arg1 + arg3 < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg3) {
                        arg0[arg3++] = 0;
                        arg1--;
                        this.field7485++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field7497 >= var5 && this.field7497 < (long) var8 + var5) {
                    var13 = this.field7497;
                } else if (var5 >= this.field7497 && var5 < (long) this.field7488 + this.field7497) {
                    var13 = var5;
                }
                if (((long) this.field7488 + this.field7497) > var5 && (long) var8 + var5 >= (long) this.field7488 + this.field7497) {
                    var15 = (long) this.field7488 + this.field7497;
                } else if (this.field7497 < (long) var8 + var5 && ((long) this.field7488 + this.field7497) >= ((long) var8 + var5)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class652.method3679(this.field7495, (int) (var13 - this.field7497), arg0, (int) (var13 - var5) + var7, var17);
                    if (this.field7485 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field7485));
                        this.field7485 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field7504 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 199)
    public final void method2980(int arg0) throws IOException {
        if (arg0 != 16383) {
            method2988((byte) 5);
        }
        field7496++;
        this.method2982((byte) 82);
        this.field7502.method3633(0);
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lip;II)V", line = 597)
    public class523(class647 arg0, int arg1, int arg2) throws IOException {
        this.field7502 = arg0;
        this.field7482 = this.field7499 = arg0.method3632((byte) 47);
        this.field7503 = new byte[arg1];
        this.field7485 = 0L;
        this.field7495 = new byte[arg2];
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 232)
    private final void method2981(byte arg0) throws IOException {
        field7494++;
        this.field7500 = 0;
        if (this.field7504 != this.field7485) {
            this.field7502.method3634(this.field7485, -124);
            this.field7504 = this.field7485;
        }
        this.field7492 = this.field7485;
        if (arg0 != 0) {
            return;
        }
        while (this.field7500 < this.field7503.length) {
            int var2 = this.field7503.length - this.field7500;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field7502.method3630(false, this.field7503, var2, this.field7500);
            if (var3 == -1) {
                break;
            }
            this.field7504 += var3;
            this.field7500 += var3;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V", line = 283)
    private final void method2982(byte arg0) throws IOException {
        field7493++;
        if (this.field7497 != -1L) {
            if (this.field7504 != this.field7497) {
                this.field7502.method3634(this.field7497, -70);
                this.field7504 = this.field7497;
            }
            this.field7502.method3635(this.field7488, 1, this.field7495, 0);
            this.field7504 += this.field7488;
            if (this.field7499 < this.field7504) {
                this.field7499 = this.field7504;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field7497 >= this.field7492 && ((long) this.field7500 + this.field7492) > this.field7497) {
                var2 = this.field7497;
            } else if (this.field7497 <= this.field7492 && this.field7492 < ((long) this.field7488 + this.field7497)) {
                var2 = this.field7492;
            }
            if (this.field7492 < (long) this.field7488 + this.field7497 && ((long) this.field7500 + this.field7492) >= ((long) this.field7488 + this.field7497)) {
                var4 = this.field7497 + ((long) this.field7488);
            } else if (((long) this.field7500 + this.field7492) > this.field7497 && (long) this.field7500 + this.field7492 <= this.field7497 - -((long) this.field7488)) {
                var4 = (long) this.field7500 + this.field7492;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class652.method3679(this.field7495, (int) (var2 - this.field7497), this.field7503, (int) (var2 - this.field7492), var6);
            }
            this.field7488 = 0;
            this.field7497 = -1L;
        }
        if (arg0 != 82) {
            this.method2984(false);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([BI)V", line = 360)
    public final void method2983(byte[] arg0, int arg1) throws IOException {
        field7491++;
        this.method2979(arg0, arg0.length, (byte) 91, arg1);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)J", line = 369)
    public final long method2984(boolean arg0) {
        field7484++;
        return arg0 ? this.field7482 : -25L;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(JI)V", line = 383)
    public final void method2985(long arg0, int arg1) throws IOException {
        field7487++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2986(0));
        }
        this.field7485 = arg0;
        if (arg1 >= -123) {
            method2989(null, 70, null, -122, 33L, false, 64, 61, 6);
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)Ljava/io/File;", line = 401)
    private final File method2986(int arg0) {
        field7483++;
        if (arg0 != 0) {
            this.method2986(50);
        }
        return this.field7502.method3636((byte) 41);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[BII)V", line = 413)
    public final void method2987(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field7489++;
        try {
            if ((this.field7485 + ((long) arg0)) > this.field7482) {
                this.field7482 = (long) arg0 + this.field7485;
            }
            if (this.field7497 != -1L && (this.field7497 > this.field7485 || this.field7497 + ((long) this.field7488) < this.field7485)) {
                this.method2982((byte) 82);
            }
            if (this.field7497 != -1L && (long) this.field7495.length + this.field7497 < (long) arg0 + this.field7485) {
                int var5 = (int) ((long) this.field7495.length + this.field7497 - this.field7485);
                class652.method3679(arg1, arg3, this.field7495, (int) (this.field7485 - this.field7497), var5);
                this.field7485 += var5;
                arg0 -= var5;
                arg3 += var5;
                this.field7488 = this.field7495.length;
                this.method2982((byte) 82);
            }
            if (arg0 > this.field7495.length) {
                if (this.field7504 != this.field7485) {
                    this.field7502.method3634(this.field7485, arg2 ^ 0x5F);
                    this.field7504 = this.field7485;
                }
                this.field7502.method3635(arg0, 1, arg1, arg3);
                this.field7504 += arg0;
                if (this.field7504 > this.field7499) {
                    this.field7499 = this.field7504;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field7485 >= this.field7492 && ((long) this.field7500 + this.field7492) > this.field7485) {
                    var6 = this.field7485;
                } else if (this.field7492 >= this.field7485 && this.field7492 < (long) arg0 + this.field7485) {
                    var6 = this.field7492;
                }
                if (this.field7492 < (long) arg0 + this.field7485 && (long) arg0 + this.field7485 <= this.field7492 - -((long) this.field7500)) {
                    var8 = (long) arg0 + this.field7485;
                } else if (this.field7485 < (long) this.field7500 + this.field7492 && (long) arg0 + this.field7485 >= (long) this.field7500 + this.field7492) {
                    var8 = (long) this.field7500 + this.field7492;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class652.method3679(arg1, (int) ((long) arg3 + var6 - this.field7485), this.field7503, (int) (var6 - this.field7492), var10);
                }
                this.field7485 += arg0;
            } else if (~arg0 < arg2) {
                if (this.field7497 == -1L) {
                    this.field7497 = this.field7485;
                }
                class652.method3679(arg1, arg3, this.field7495, (int) (this.field7485 - this.field7497), arg0);
                this.field7485 += arg0;
                if (((long) this.field7488) < (this.field7485 - this.field7497)) {
                    this.field7488 = (int) (this.field7485 - this.field7497);
                }
            }
        } catch (IOException var12) {
            this.field7504 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)V", line = 530)
    public static void method2988(byte arg0) {
        if (arg0 >= -19) {
            method2988((byte) -113);
        }
        field7498 = null;
        field7486 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lfa;ILep;IJZIII)V", line = 545)
    public static final void method2989(class213 arg0, int arg1, class382 arg2, int arg3, long arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field7490++;
        int var10 = arg1 * arg1 + arg8 * arg8;
        if (arg4 < ((long) var10)) {
            return;
        }
        int var11 = Math.min(arg2.field5035 / 2, arg2.field4958 / 2);
        if ((var11 * var11) >= var10) {
            class406.method2206(class638.field9066[arg7], arg3, arg6, arg0, arg1, 16383, arg8, arg2);
        } else {
            var11 -= 10;
            int var12;
            if (class5.field41 == 4) {
                var12 = (int) class90.field1041 & 0x3FFF;
            } else {
                var12 = (int) class90.field1041 + class628.field8908 & 0x3FFF;
            }
            int var13 = class285.field3655[var12];
            int var14 = class285.field3656[var12];
            if (class5.field41 != 4) {
                var14 = var14 * 256 / (class599.field8520 + 256);
                var13 = var13 * 256 / (class599.field8520 + 256);
            }
            int var15 = arg1 * var13 + (arg8 * var14) >> 14;
            int var16 = arg1 * var14 - arg8 * var13 >> 14;
            double var17 = Math.atan2((double) var15, (double) var16);
            int var19 = (int) (Math.sin(var17) * (double) var11);
            int var20 = (int) ((double) var11 * Math.cos(var17));
            class589.field8385[arg7].method2609((float) arg2.field5035 / 2.0F + (float) arg6 + (float) var19, (float) arg2.field4958 / 2.0F + (float) arg3 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
        }
        if (arg5) {
            field7498 = null;
        }
    }
}
