import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class161 {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    private int field2226 = 0;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "J")
    private long field2230 = -1L;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "J")
    private long field2232 = -1L;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "Lrl;")
    private class468 field2233;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "J")
    private long field2239;

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "J")
    private long field2243;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "[B")
    private byte[] field2237;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "[B")
    private byte[] field2234;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "J")
    private long field2227;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "Lmc;")
    public static class78 field2229 = new class78(7, 4);

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    private int field2238;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!rn", name = "t", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!rn", name = "u", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "J")
    private long field2228;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZI)Z", line = 7)
    public static final boolean method941(boolean arg0, int arg1) {
        if (arg0) {
            method949(49);
        }
        field2246++;
        return arg1 == 45 || arg1 == 11 || arg1 == 1011 || arg1 == 49 || arg1 == 30;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(JB)V", line = 20)
    public final void method942(long arg0, byte arg1) throws IOException {
        field2236++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method945(4));
        }
        this.field2227 = arg0;
        if (arg1 >= -79) {
            this.field2238 = 47;
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lrl;II)V", line = 361)
    public class161(class468 arg0, int arg1, int arg2) throws IOException {
        this.field2233 = arg0;
        this.field2243 = this.field2239 = arg0.method2751((byte) -127);
        this.field2237 = new byte[arg1];
        this.field2234 = new byte[arg2];
        this.field2227 = 0L;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II[BI)V", line = 49)
    public final void method943(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2242++;
        try {
            if (((long) arg3 + this.field2227) > this.field2243) {
                this.field2243 = (long) arg3 + this.field2227;
            }
            if (this.field2232 != -1L && (this.field2227 < this.field2232 || ((long) this.field2226 + this.field2232) < this.field2227)) {
                this.method947((byte) -74);
            }
            if (this.field2232 != -1L && ((long) this.field2234.length + this.field2232) < ((long) arg3 + this.field2227)) {
                int var5 = (int) ((long) this.field2234.length - (this.field2227 - this.field2232));
                class380.method2334(arg2, arg1, this.field2234, (int) (this.field2227 - this.field2232), var5);
                arg1 += var5;
                arg3 -= var5;
                this.field2227 += (long) var5;
                this.field2226 = this.field2234.length;
                this.method947((byte) -74);
            }
            if (arg3 > this.field2234.length) {
                if (this.field2228 != this.field2227) {
                    this.field2233.method2752(27836, this.field2227);
                    this.field2228 = this.field2227;
                }
                this.field2233.method2750(arg0 ^ 0x4AB4, arg2, arg3, arg1);
                this.field2228 += (long) arg3;
                if (this.field2228 > this.field2239) {
                    this.field2239 = this.field2228;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field2227 >= this.field2230 && (long) this.field2238 + this.field2230 > this.field2227) {
                    var6 = this.field2227;
                } else if (this.field2227 <= this.field2230 && (this.field2227 + ((long) arg3)) > this.field2230) {
                    var6 = this.field2230;
                }
                if (((long) arg3 + this.field2227) > this.field2230 && this.field2227 + ((long) arg3) <= (long) this.field2238 + this.field2230) {
                    var8 = (long) arg3 + this.field2227;
                } else if (this.field2227 < ((long) this.field2238 + this.field2230) && this.field2227 + ((long) arg3) >= (long) this.field2238 + this.field2230) {
                    var8 = (long) this.field2238 + this.field2230;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class380.method2334(arg2, (int) ((long) arg1 + var6 - this.field2227), this.field2237, (int) (var6 - this.field2230), var10);
                }
                this.field2227 += (long) arg3;
                return;
            }
            if (arg3 > 0) {
                if (this.field2232 == -1L) {
                    this.field2232 = this.field2227;
                }
                class380.method2334(arg2, arg1, this.field2234, (int) (this.field2227 - this.field2232), arg3);
                this.field2227 += (long) arg3;
                if (((long) this.field2226) < (this.field2227 - this.field2232)) {
                    this.field2226 = (int) (this.field2227 - this.field2232);
                }
                return;
            }
        } catch (IOException var12) {
            this.field2228 = -1L;
            throw var12;
        }
        if (arg0 != 19124) {
            this.field2226 = -20;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V", line = 168)
    private final void method944(byte arg0) throws IOException {
        this.field2238 = 0;
        field2235++;
        if (arg0 <= 32) {
            this.method946((byte) 0);
        }
        if (this.field2228 != this.field2227) {
            this.field2233.method2752(27836, this.field2227);
            this.field2228 = this.field2227;
        }
        this.field2230 = this.field2227;
        while (this.field2238 < this.field2237.length) {
            int var2 = this.field2237.length - this.field2238;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2233.method2749(var2, this.field2238, this.field2237, true);
            if (var3 == -1) {
                break;
            }
            this.field2238 += var3;
            this.field2228 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Ljava/io/File;", line = 212)
    private final File method945(int arg0) {
        field2245++;
        if (arg0 != 4) {
            this.field2233 = null;
        }
        return this.field2233.method2753(428);
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)J", line = 228)
    public final long method946(byte arg0) {
        if (arg0 > -3) {
            this.field2226 = 14;
        }
        field2241++;
        return this.field2243;
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)V", line = 246)
    private final void method947(byte arg0) throws IOException {
        field2240++;
        if (arg0 != -74) {
            method941(false, -77);
        }
        if (this.field2232 == -1L) {
            return;
        }
        if (this.field2232 != this.field2228) {
            this.field2233.method2752(27836, this.field2232);
            this.field2228 = this.field2232;
        }
        this.field2233.method2750(0, this.field2234, this.field2226, 0);
        this.field2228 += (long) this.field2226;
        if (this.field2239 < this.field2228) {
            this.field2239 = this.field2228;
        }
        long var2 = -1L;
        long var4 = -1L;
        if (this.field2232 >= this.field2230 && this.field2232 < (long) this.field2238 + this.field2230) {
            var2 = this.field2232;
        } else if (this.field2230 >= this.field2232 && (long) this.field2226 + this.field2232 > this.field2230) {
            var2 = this.field2230;
        }
        if (this.field2230 < (long) this.field2226 + this.field2232 && this.field2230 + ((long) this.field2238) >= (long) this.field2226 + this.field2232) {
            var4 = this.field2232 + ((long) this.field2226);
        } else if (((long) this.field2238 + this.field2230) > this.field2232 && ((long) this.field2238 + this.field2230) <= (this.field2232 + ((long) this.field2226))) {
            var4 = (long) this.field2238 + this.field2230;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class380.method2334(this.field2234, (int) (var2 - this.field2232), this.field2237, (int) (var2 - this.field2230), var6);
        }
        this.field2232 = -1L;
        this.field2226 = 0;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "([BB)V", line = 326)
    public final void method948(byte[] arg0, byte arg1) throws IOException {
        this.method950(arg0, true, 0, arg0.length);
        if (arg1 == 123) {
            field2231++;
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V", line = 337)
    public static void method949(int arg0) {
        field2229 = null;
        if (arg0 != 0) {
            method949(36);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "([BZII)V", line = 382)
    public final void method950(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        field2244++;
        try {
            if (arg0.length < (arg2 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg2 - arg0.length);
            }
            if (this.field2232 != -1L && this.field2227 >= this.field2232 && (this.field2227 + ((long) arg3)) <= ((long) this.field2226 + this.field2232)) {
                class380.method2334(this.field2234, (int) (this.field2227 - this.field2232), arg0, arg2, arg3);
                this.field2227 += (long) arg3;
                return;
            }
            if (!arg1) {
                method949(-51);
            }
            long var5 = this.field2227;
            int var7 = arg2;
            int var8 = arg3;
            if (this.field2227 >= this.field2230 && this.field2227 < this.field2230 + ((long) this.field2238)) {
                int var9 = (int) ((long) this.field2238 + this.field2230 - this.field2227);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class380.method2334(this.field2237, (int) (this.field2227 - this.field2230), arg0, arg2, var9);
                arg2 += var9;
                this.field2227 += (long) var9;
                arg3 -= var9;
            }
            if (this.field2237.length < arg3) {
                this.field2233.method2752(27836, this.field2227);
                this.field2228 = this.field2227;
                while (arg3 > 0) {
                    int var11 = this.field2233.method2749(arg3, arg2, arg0, true);
                    if (var11 == -1) {
                        break;
                    }
                    this.field2227 += (long) var11;
                    arg3 -= var11;
                    this.field2228 += (long) var11;
                    arg2 += var11;
                }
            } else if (arg3 > 0) {
                this.method944((byte) 40);
                int var10 = arg3;
                if (arg3 > this.field2238) {
                    var10 = this.field2238;
                }
                class380.method2334(this.field2237, 0, arg0, arg2, var10);
                arg2 += var10;
                this.field2227 += (long) var10;
                arg3 -= var10;
            }
            if (this.field2232 != -1L) {
                if (this.field2232 > this.field2227 && arg3 > 0) {
                    int var12 = (int) (this.field2232 - this.field2227) + arg2;
                    if (arg2 + arg3 < var12) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg2) {
                        arg3--;
                        arg0[arg2++] = 0;
                        this.field2227++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field2232 && this.field2232 < (long) var8 + var5) {
                    var13 = this.field2232;
                } else if (this.field2232 <= var5 && var5 < (long) this.field2226 + this.field2232) {
                    var13 = var5;
                }
                if ((long) this.field2226 + this.field2232 > var5 && (long) this.field2226 + this.field2232 <= var5 - -((long) var8)) {
                    var15 = (long) this.field2226 + this.field2232;
                } else if ((long) var8 + var5 > this.field2232 && ((long) var8 + var5) <= (this.field2232 + ((long) this.field2226))) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class380.method2334(this.field2234, (int) (var13 - this.field2232), arg0, (int) (var13 - var5) + var7, var17);
                    if (this.field2227 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field2227));
                        this.field2227 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2228 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }
}
