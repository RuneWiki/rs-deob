import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class344 {

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "J")
    private long field5082 = -1L;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "J")
    private long field5089 = -1L;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    private int field5086 = 0;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Lsr;")
    private class568 field5099;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "J")
    private long field5080;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "J")
    private long field5090;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "[B")
    private byte[] field5091;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "[B")
    private byte[] field5095;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "J")
    private long field5094;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field5085 = 0;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    private int field5088;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "J")
    private long field5097;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 5)
    private final void method2131(byte arg0) throws IOException {
        field5083++;
        this.field5088 = 0;
        if (this.field5097 != this.field5094) {
            this.field5099.method3268((byte) -95, this.field5094);
            this.field5097 = this.field5094;
        }
        if (arg0 > -1) {
            return;
        }
        this.field5082 = this.field5094;
        while (this.field5088 < this.field5095.length) {
            int var2 = this.field5095.length - this.field5088;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field5099.method3269(var2, this.field5095, (byte) 122, this.field5088);
            if (var3 == -1) {
                break;
            }
            this.field5088 += var3;
            this.field5097 += var3;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 51)
    public final void method2132(int arg0) throws IOException {
        this.method2133((byte) -103);
        field5081++;
        if (arg0 != 20699) {
            this.field5097 = -118L;
        }
        this.field5099.method3271((byte) -111);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V", line = 64)
    private final void method2133(byte arg0) throws IOException {
        field5084++;
        if (this.field5089 != -1L) {
            if (this.field5097 != this.field5089) {
                this.field5099.method3268((byte) -48, this.field5089);
                this.field5097 = this.field5089;
            }
            this.field5099.method3273(0, this.field5086, this.field5091, true);
            this.field5097 += this.field5086;
            if (this.field5080 < this.field5097) {
                this.field5080 = this.field5097;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field5089 >= this.field5082 && this.field5089 < (long) this.field5088 + this.field5082) {
                var2 = this.field5089;
            } else if (this.field5082 >= this.field5089 && this.field5082 < this.field5089 + ((long) this.field5086)) {
                var2 = this.field5082;
            }
            if ((long) this.field5086 + this.field5089 > this.field5082 && this.field5082 + ((long) this.field5088) >= (long) this.field5086 + this.field5089) {
                var4 = (long) this.field5086 + this.field5089;
            } else if (this.field5089 < ((long) this.field5088 + this.field5082) && ((long) this.field5088 + this.field5082) <= (this.field5089 + ((long) this.field5086))) {
                var4 = (long) this.field5088 + this.field5082;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class667.method3739(this.field5091, (int) (var2 - this.field5089), this.field5095, (int) (var2 - this.field5082), var6);
            }
            this.field5089 = -1L;
            this.field5086 = 0;
        }
        int var7 = 80 % ((arg0 - 16) / 42);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BB)V", line = 138)
    public final void method2134(byte[] arg0, byte arg1) throws IOException {
        if (arg1 != 44) {
            this.method2138(106);
        }
        field5101++;
        this.method2137(arg0, 0, true, arg0.length);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)J", line = 149)
    public final long method2135(int arg0) {
        field5087++;
        if (arg0 != 32452) {
            method2140(null, (byte) 26);
        }
        return this.field5090;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III[B)V", line = 163)
    public final void method2136(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field5100++;
        try {
            if (arg1 > -49) {
                this.field5088 = 30;
            }
            if (this.field5090 < (this.field5094 + ((long) arg0))) {
                this.field5090 = (long) arg0 + this.field5094;
            }
            if (this.field5089 != -1L && (this.field5094 < this.field5089 || this.field5094 > (this.field5089 + ((long) this.field5086)))) {
                this.method2133((byte) 71);
            }
            if (this.field5089 != -1L && (long) this.field5091.length + this.field5089 < (long) arg0 + this.field5094) {
                int var5 = (int) (this.field5089 - (this.field5094 - (long) this.field5091.length));
                class667.method3739(arg3, arg2, this.field5091, (int) (this.field5094 - this.field5089), var5);
                arg0 -= var5;
                this.field5094 += var5;
                arg2 += var5;
                this.field5086 = this.field5091.length;
                this.method2133((byte) -82);
            }
            if (this.field5091.length < arg0) {
                if (this.field5097 != this.field5094) {
                    this.field5099.method3268((byte) -61, this.field5094);
                    this.field5097 = this.field5094;
                }
                this.field5099.method3273(arg2, arg0, arg3, true);
                this.field5097 += arg0;
                if (this.field5080 < this.field5097) {
                    this.field5080 = this.field5097;
                }
                long var6 = -1L;
                if (this.field5082 <= this.field5094 && (long) this.field5088 + this.field5082 > this.field5094) {
                    var6 = this.field5094;
                } else if (this.field5082 >= this.field5094 && this.field5082 < ((long) arg0 + this.field5094)) {
                    var6 = this.field5082;
                }
                long var8 = -1L;
                if (this.field5082 < (long) arg0 + this.field5094 && ((long) this.field5088 + this.field5082) >= ((long) arg0 + this.field5094)) {
                    var8 = (long) arg0 + this.field5094;
                } else if ((this.field5082 + ((long) this.field5088)) > this.field5094 && ((long) this.field5088 + this.field5082) <= ((long) arg0 + this.field5094)) {
                    var8 = (long) this.field5088 + this.field5082;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class667.method3739(arg3, (int) ((long) arg2 + var6 - this.field5094), this.field5095, (int) (var6 - this.field5082), var10);
                }
                this.field5094 += arg0;
            } else if (arg0 > 0) {
                if (this.field5089 == -1L) {
                    this.field5089 = this.field5094;
                }
                class667.method3739(arg3, arg2, this.field5091, (int) (this.field5094 - this.field5089), arg0);
                this.field5094 += arg0;
                if (((long) this.field5086) < (this.field5094 - this.field5089)) {
                    this.field5086 = (int) (this.field5094 - this.field5089);
                }
            }
        } catch (IOException var12) {
            this.field5097 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIZI)V", line = 289)
    public final void method2137(byte[] arg0, int arg1, boolean arg2, int arg3) throws IOException {
        field5098++;
        try {
            if (arg0.length < arg1 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (this.field5089 != -1L && this.field5089 <= this.field5094 && ((long) this.field5086 + this.field5089) >= ((long) arg3 + this.field5094)) {
                class667.method3739(this.field5091, (int) (this.field5094 - this.field5089), arg0, arg1, arg3);
                this.field5094 += arg3;
                return;
            }
            long var5 = this.field5094;
            int var7 = arg1;
            int var8 = arg3;
            if (this.field5082 <= this.field5094 && (long) this.field5088 + this.field5082 > this.field5094) {
                int var9 = (int) (this.field5082 + (long) this.field5088 - this.field5094);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                class667.method3739(this.field5095, (int) (this.field5094 - this.field5082), arg0, arg1, var9);
                arg1 += var9;
                arg3 -= var9;
                this.field5094 += var9;
            }
            if (this.field5095.length < arg3) {
                this.field5099.method3268((byte) -63, this.field5094);
                this.field5097 = this.field5094;
                while (arg3 > 0) {
                    int var11 = this.field5099.method3269(arg3, arg0, (byte) -75, arg1);
                    if (var11 == -1) {
                        break;
                    }
                    this.field5097 += var11;
                    arg1 += var11;
                    arg3 -= var11;
                    this.field5094 += var11;
                }
            } else if (arg3 > 0) {
                this.method2131((byte) -86);
                int var10 = arg3;
                if (arg3 > this.field5088) {
                    var10 = this.field5088;
                }
                class667.method3739(this.field5095, 0, arg0, arg1, var10);
                arg3 -= var10;
                arg1 += var10;
                this.field5094 += var10;
            }
            if (this.field5089 != -1L) {
                if (this.field5094 < this.field5089 && arg3 > 0) {
                    int var12 = (int) (this.field5089 - this.field5094) + arg1;
                    if ((arg1 + arg3) < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg1) {
                        arg3--;
                        arg0[arg1++] = 0;
                        this.field5094++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field5089 && this.field5089 < ((long) var8 + var5)) {
                    var13 = this.field5089;
                } else if (this.field5089 <= var5 && var5 < this.field5089 + ((long) this.field5086)) {
                    var13 = var5;
                }
                if (((long) this.field5086 + this.field5089) > var5 && (var5 + ((long) var8)) >= ((long) this.field5086 + this.field5089)) {
                    var15 = this.field5089 + ((long) this.field5086);
                } else if (this.field5089 < (long) var8 + var5 && ((long) this.field5086 + this.field5089) >= ((long) var8 + var5)) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class667.method3739(this.field5091, (int) (var13 - this.field5089), arg0, var7 + ((int) (var13 - var5)), var17);
                    if (this.field5094 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field5094));
                        this.field5094 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5097 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        } else if (!arg2) {
            method2140(null, (byte) 57);
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)Ljava/io/File;", line = 474)
    private final File method2138(int arg0) {
        field5093++;
        if (arg0 != -14061) {
            this.field5095 = null;
        }
        return this.field5099.method3270(29822);
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lsr;II)V", line = 676)
    public class344(class568 arg0, int arg1, int arg2) throws IOException {
        this.field5099 = arg0;
        this.field5090 = this.field5080 = arg0.method3272(false);
        this.field5091 = new byte[arg2];
        this.field5095 = new byte[arg1];
        this.field5094 = 0L;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(JB)V", line = 496)
    public final void method2139(long arg0, byte arg1) throws IOException {
        field5092++;
        int var4 = -124 / ((-arg1 - 40) / 33);
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2138(-14061));
        }
        this.field5094 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 522)
    public static final byte[] method2140(String arg0, byte arg1) {
        field5096++;
        int var2 = 19 / ((10 - arg1) / 57);
        int var3 = arg0.length();
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            char var6 = arg0.charAt(var5);
            if (!(var6 <= '\u0000' || var6 >= '\u0080') || !(var6 < ' ' || var6 > 'ÿ')) {
                var4[var5] = (byte) var6;
            } else if (var6 == '€') {
                var4[var5] = -128;
            } else if (var6 == '‚') {
                var4[var5] = -126;
            } else if (var6 == 'ƒ') {
                var4[var5] = -125;
            } else if (var6 == '„') {
                var4[var5] = -124;
            } else if (var6 == '…') {
                var4[var5] = -123;
            } else if (var6 == '†') {
                var4[var5] = -122;
            } else if (var6 == '‡') {
                var4[var5] = -121;
            } else if (var6 == 'ˆ') {
                var4[var5] = -120;
            } else if (var6 == '‰') {
                var4[var5] = -119;
            } else if (var6 == 'Š') {
                var4[var5] = -118;
            } else if (var6 == '‹') {
                var4[var5] = -117;
            } else if (var6 == 'Œ') {
                var4[var5] = -116;
            } else if (var6 == 'Ž') {
                var4[var5] = -114;
            } else if (var6 == '‘') {
                var4[var5] = -111;
            } else if (var6 == '’') {
                var4[var5] = -110;
            } else if (var6 == '“') {
                var4[var5] = -109;
            } else if (var6 == '”') {
                var4[var5] = -108;
            } else if (var6 == '•') {
                var4[var5] = -107;
            } else if (var6 == '–') {
                var4[var5] = -106;
            } else if (var6 == '—') {
                var4[var5] = -105;
            } else if (var6 == '˜') {
                var4[var5] = -104;
            } else if (var6 == '™') {
                var4[var5] = -103;
            } else if (var6 == 'š') {
                var4[var5] = -102;
            } else if (var6 == '›') {
                var4[var5] = -101;
            } else if (var6 == 'œ') {
                var4[var5] = -100;
            } else if (var6 == 'ž') {
                var4[var5] = -98;
            } else if (var6 == 'Ÿ') {
                var4[var5] = -97;
            } else {
                var4[var5] = 63;
            }
        }
        return var4;
    }
}
