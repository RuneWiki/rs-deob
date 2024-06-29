import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class349 {

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "J")
    private long field5206 = -1L;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "J")
    private long field5196 = -1L;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    private int field5195 = 0;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "Loaa;")
    private class263 field5207;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "J")
    private long field5202;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "J")
    private long field5194;

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "[B")
    private byte[] field5209;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "J")
    private long field5193;

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "[B")
    private byte[] field5210;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field5192 = 0;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    private int field5205;

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "J")
    private long field5203;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    private final void method2255(int arg0) throws IOException {
        if (arg0 > -47) {
            this.field5203 = -82L;
        }
        field5200++;
        if (this.field5206 == -1L) {
            return;
        }
        if (this.field5206 != this.field5203) {
            this.field5207.method1720(true, this.field5206);
            this.field5203 = this.field5206;
        }
        this.field5207.method1724(this.field5209, 0, this.field5195, 0);
        this.field5203 += this.field5195;
        if (this.field5202 < this.field5203) {
            this.field5202 = this.field5203;
        }
        long var2 = -1L;
        if (this.field5196 <= this.field5206 && (long) this.field5205 + this.field5196 > this.field5206) {
            var2 = this.field5206;
        } else if (this.field5196 >= this.field5206 && this.field5196 < ((long) this.field5195 + this.field5206)) {
            var2 = this.field5196;
        }
        long var4 = -1L;
        if (((long) this.field5195 + this.field5206) > this.field5196 && (long) this.field5205 + this.field5196 >= (long) this.field5195 + this.field5206) {
            var4 = (long) this.field5195 + this.field5206;
        } else if (this.field5196 + ((long) this.field5205) > this.field5206 && (this.field5196 + ((long) this.field5205)) <= ((long) this.field5195 + this.field5206)) {
            var4 = (long) this.field5205 + this.field5196;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class692.method3873(this.field5209, (int) (var2 - this.field5206), this.field5210, (int) (var2 - this.field5196), var6);
        }
        this.field5206 = -1L;
        this.field5195 = 0;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
    private final void method2256(int arg0) throws IOException {
        field5212++;
        this.field5205 = 0;
        if (this.field5203 != this.field5193) {
            this.field5207.method1720(true, this.field5193);
            this.field5203 = this.field5193;
        }
        this.field5196 = this.field5193;
        if (arg0 != -1) {
            this.field5196 = 24L;
        }
        while (this.field5205 < this.field5210.length) {
            int var2 = this.field5210.length - this.field5205;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field5207.method1728(this.field5210, this.field5205, (byte) -65, var2);
            if (var3 == -1) {
                break;
            }
            this.field5203 += var3;
            this.field5205 += var3;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[BII)V")
    public final void method2257(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field5201++;
        try {
            if (arg1.length < (arg3 + arg2)) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg2 - arg1.length);
            }
            if ((long) arg0 != this.field5206 && this.field5193 >= this.field5206 && ((long) arg2 + this.field5193) <= ((long) this.field5195 + this.field5206)) {
                class692.method3873(this.field5209, (int) (this.field5193 - this.field5206), arg1, arg3, arg2);
                this.field5193 += arg2;
                return;
            }
            long var5 = this.field5193;
            int var7 = arg3;
            int var8 = arg2;
            if (this.field5196 <= this.field5193 && this.field5193 < (long) this.field5205 + this.field5196) {
                int var9 = (int) ((long) this.field5205 + this.field5196 - this.field5193);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class692.method3873(this.field5210, (int) (this.field5193 - this.field5196), arg1, arg3, var9);
                arg3 += var9;
                arg2 -= var9;
                this.field5193 += var9;
            }
            if (arg2 > this.field5210.length) {
                this.field5207.method1720(true, this.field5193);
                this.field5203 = this.field5193;
                while (arg2 > 0) {
                    int var10 = this.field5207.method1728(arg1, arg3, (byte) -65, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    arg2 -= var10;
                    arg3 += var10;
                    this.field5193 += var10;
                    this.field5203 += var10;
                }
            } else if (arg2 > 0) {
                this.method2256(-1);
                int var11 = arg2;
                if (arg2 > this.field5205) {
                    var11 = this.field5205;
                }
                class692.method3873(this.field5210, 0, arg1, arg3, var11);
                arg2 -= var11;
                this.field5193 += var11;
                arg3 += var11;
            }
            if (this.field5206 != -1L) {
                if (this.field5206 > this.field5193 && arg2 > 0) {
                    int var12 = (int) (this.field5206 - this.field5193) + arg3;
                    if (arg2 + arg3 < var12) {
                        var12 = arg2 + arg3;
                    }
                    while (arg3 < var12) {
                        arg2--;
                        arg1[arg3++] = 0;
                        this.field5193++;
                    }
                }
                long var13 = -1L;
                if (this.field5206 >= var5 && var5 + ((long) var8) > this.field5206) {
                    var13 = this.field5206;
                } else if (var5 >= this.field5206 && var5 < ((long) this.field5195 + this.field5206)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field5195 + this.field5206 && (long) var8 + var5 >= this.field5206 - -((long) this.field5195)) {
                    var15 = (long) this.field5195 + this.field5206;
                } else if (this.field5206 < (var5 + ((long) var8)) && (this.field5206 + ((long) this.field5195)) >= ((long) var8 + var5)) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class692.method3873(this.field5209, (int) (var13 - this.field5206), arg1, (int) (var13 - var5) + var7, var17);
                    if (this.field5193 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field5193));
                        this.field5193 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5203 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method2258(int arg0) {
        field5199++;
        if (arg0 > -59) {
            this.field5205 = 21;
        }
        return this.field5207.method1723(65280);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([BIIZ)V")
    public final void method2259(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        field5208++;
        try {
            if (arg3) {
                this.method2261((byte) -7);
            }
            if ((long) arg2 + this.field5193 > this.field5194) {
                this.field5194 = (long) arg2 + this.field5193;
            }
            if (this.field5206 != -1L && (this.field5206 > this.field5193 || this.field5206 + ((long) this.field5195) < this.field5193)) {
                this.method2255(-119);
            }
            if (this.field5206 != -1L && ((long) arg2 + this.field5193) > ((long) this.field5209.length + this.field5206)) {
                int var5 = (int) ((long) this.field5209.length + this.field5206 - this.field5193);
                class692.method3873(arg0, arg1, this.field5209, (int) (this.field5193 - this.field5206), var5);
                this.field5193 += var5;
                arg2 -= var5;
                arg1 += var5;
                this.field5195 = this.field5209.length;
                this.method2255(-77);
            }
            if (this.field5209.length < arg2) {
                if (this.field5203 != this.field5193) {
                    this.field5207.method1720(true, this.field5193);
                    this.field5203 = this.field5193;
                }
                this.field5207.method1724(arg0, 0, arg2, arg1);
                this.field5203 += arg2;
                if (this.field5202 < this.field5203) {
                    this.field5202 = this.field5203;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field5193 >= this.field5196 && (this.field5196 + ((long) this.field5205)) > this.field5193) {
                    var6 = this.field5193;
                } else if (this.field5193 <= this.field5196 && this.field5196 < (this.field5193 + ((long) arg2))) {
                    var6 = this.field5196;
                }
                if (this.field5196 < (this.field5193 + ((long) arg2)) && (long) this.field5205 + this.field5196 >= (long) arg2 + this.field5193) {
                    var8 = this.field5193 + ((long) arg2);
                } else if ((long) this.field5205 + this.field5196 > this.field5193 && this.field5193 + ((long) arg2) >= this.field5196 - -((long) this.field5205)) {
                    var8 = (long) this.field5205 + this.field5196;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class692.method3873(arg0, (int) ((long) arg1 + var6 - this.field5193), this.field5210, (int) (var6 - this.field5196), var10);
                }
                this.field5193 += arg2;
            } else if (arg2 > 0) {
                if (this.field5206 == -1L) {
                    this.field5206 = this.field5193;
                }
                class692.method3873(arg0, arg1, this.field5209, (int) (this.field5193 - this.field5206), arg2);
                this.field5193 += arg2;
                if (((long) this.field5195) < (this.field5193 - this.field5206)) {
                    this.field5195 = (int) (this.field5193 - this.field5206);
                }
            }
        } catch (IOException var12) {
            this.field5203 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BJ)V")
    public final void method2260(byte arg0, long arg1) throws IOException {
        field5211++;
        int var4 = 56 / ((arg0 + 36) / 39);
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2258(-123));
        }
        this.field5193 = arg1;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)J")
    public final long method2261(byte arg0) {
        field5198++;
        return arg0 > -40 ? 126L : this.field5194;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([BI)V")
    public final void method2262(byte[] arg0, int arg1) throws IOException {
        this.method2257(~arg1, arg0, arg0.length, arg1);
        field5197++;
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V")
    public final void method2263(int arg0) throws IOException {
        field5204++;
        this.method2255(-128);
        if (arg0 == 6459) {
            this.field5207.method1726((byte) -128);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Loaa;II)V")
    public class349(class263 arg0, int arg1, int arg2) throws IOException {
        this.field5207 = arg0;
        this.field5194 = this.field5202 = arg0.method1721(0);
        this.field5209 = new byte[arg2];
        this.field5193 = 0L;
        this.field5210 = new byte[arg1];
    }
}
