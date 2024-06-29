import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class100 {

    @OriginalMember(owner = "client!r", name = "c", descriptor = "J")
    private long field2220 = -1L;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    private int field2226 = 0;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "J")
    private long field2243 = -1L;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Lqc;")
    private class98 field2223;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "J")
    private long field2224;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "J")
    private long field2232;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "[B")
    private byte[] field2218;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "[B")
    private byte[] field2227;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "J")
    private long field2230;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "Lva;")
    public static class121 field2234 = class107.method797("backright2", -10983);

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Lva;")
    public static class121 field2237 = class107.method797(":0", -10983);

    @OriginalMember(owner = "client!r", name = "B", descriptor = "Z")
    public static boolean field2245 = false;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2219 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    private int field2241;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "J")
    private long field2238;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "[I")
    public static int[] field2228;

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lqc;II)V", line = 764)
    public class100(class98 arg0, int arg1, int arg2) throws IOException {
        this.field2223 = arg0;
        this.field2232 = this.field2224 = arg0.method660((byte) 109);
        this.field2218 = new byte[arg2];
        this.field2227 = new byte[arg1];
        this.field2230 = 0L;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 29)
    private final void method672(byte arg0) throws IOException {
        this.field2241 = 0;
        if (arg0 != 52) {
            this.method682(-69);
        }
        field2240++;
        if (this.field2238 != this.field2230) {
            this.field2223.method664(118, this.field2230);
            this.field2238 = this.field2230;
        }
        this.field2220 = this.field2230;
        while (this.field2227.length > this.field2241) {
            int var2 = this.field2223.method663(this.field2241, this.field2227, this.field2227.length - this.field2241, -1);
            if (var2 == -1) {
                break;
            }
            this.field2238 += var2;
            this.field2241 += var2;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 82)
    public final void method673(int arg0) throws IOException {
        field2225++;
        this.method679((byte) 109);
        if (arg0 >= 57) {
            this.field2223.method665(true);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V", line = 96)
    public static final void method674(int arg0) {
        if (arg0 != -4653) {
            field2245 = true;
        }
        field2233++;
        for (class56 var1 = (class56) class108.field2461.method57((byte) 86); var1 != null; var1 = (class56) class108.field2461.method66(-29860)) {
            if (class121.field2807 != var1.field1301 || var1.field1293 < class115.field2614) {
                var1.method187((byte) 39);
            } else if (class115.field2614 >= var1.field1303) {
                if (var1.field1311 > 0) {
                    class50 var2 = class8.field110[var1.field1311 - 1];
                    if (var2 != null && var2.field750 >= 0 && var2.field750 < 13312 && var2.field742 >= 0 && var2.field742 < 13312) {
                        var1.method412(0, class47.method340(var2.field750, -6, var1.field1301, var2.field742) - var1.field1302, var2.field742, var2.field750, class115.field2614);
                    }
                }
                if (var1.field1311 < 0) {
                    int var3 = -var1.field1311 - 1;
                    class77 var4;
                    if (class101.field2257 == var3) {
                        var4 = class62.field1494;
                    } else {
                        var4 = class127.field2895[var3];
                    }
                    if (var4 != null && var4.field750 >= 0 && var4.field750 < 13312 && var4.field742 >= 0 && var4.field742 < 13312) {
                        var1.method412(arg0 ^ 0xFFFFEDD3, class47.method340(var4.field750, -6, var1.field1301, var4.field742) - var1.field1302, var4.field742, var4.field750, class115.field2614);
                    }
                }
                var1.method409(-80, class128.field2955);
                class58.field1348.method730(class121.field2807, (int) var1.field1306, (int) var1.field1308, (int) var1.field1275, 60, var1, var1.field1274, -1, false);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIILtc;)V", line = 160)
    public static final void method675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class113 arg7) {
        field2239++;
        if (arg6 >= 0 && arg6 < 104 && arg1 >= 0 && arg1 < 104) {
            class23.field613[arg3][arg6][arg1] = 0;
            while (true) {
                int var8 = arg7.method821(true);
                if (var8 == 0) {
                    if (arg3 == 0) {
                        class45.field1058[0][arg6][arg1] = -class75.method525(arg0 + arg1 + 556238, -15225, arg6 + arg4 + 932731) * 8;
                    } else {
                        class45.field1058[arg3][arg6][arg1] = class45.field1058[arg3 - 1][arg6][arg1] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg7.method821(true);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg3 == 0) {
                        class45.field1058[0][arg6][arg1] = -var9 * 8;
                    } else {
                        class45.field1058[arg3][arg6][arg1] = class45.field1058[arg3 - 1][arg6][arg1] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class48.field1161[arg3][arg6][arg1] = arg7.method841(true);
                    class115.field2621[arg3][arg6][arg1] = (byte) ((var8 - 2) / 4);
                    class33.field813[arg3][arg6][arg1] = (byte) class90.method614(arg2 + var8 - 2, 3);
                } else if (var8 <= 81) {
                    class23.field613[arg3][arg6][arg1] = (byte) (var8 - 49);
                } else {
                    class41.field928[arg3][arg6][arg1] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg7.method821(true);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg7.method821(true);
                    break;
                }
                if (var10 <= 49) {
                    arg7.method821(true);
                }
            }
        }
        if (arg5 < 110) {
            method674(-87);
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V", line = 246)
    public static void method676(int arg0) {
        if (arg0 != 14) {
            field2221 = 81;
        }
        field2237 = null;
        field2219 = null;
        field2234 = null;
        field2228 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V", line = 259)
    public static final void method677(byte arg0) {
        field2229++;
        int var1 = class91.field2064;
        int var2 = class40.field904;
        int var3 = class97.field2165;
        int var4 = class82.field1901;
        int var5 = 6116423;
        class55.method401(var1, var2, var3, var4, var5);
        class55.method401(var1 + 1, var2 - -1, var3 - 2, 16, 0);
        class55.method393(var1 + 1, var2 - -18, var3 - 2, var4 - 19, 0);
        class60.field1426.method897(class46.field1081, var1 + 3, var2 + 14, var5);
        int var6 = class34.field822;
        int var7 = class19.field514;
        if (class13.field240 == 0) {
            var7 -= 4;
            var6 -= 4;
        }
        if (class13.field240 == 1) {
            var6 -= 553;
            var7 -= 205;
        }
        if (arg0 <= 22) {
            method674(68);
        }
        if (class13.field240 == 2) {
            var6 -= 17;
            var7 -= 357;
        }
        for (int var8 = 0; var8 < class26.field654; var8++) {
            int var9 = (class26.field654 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var6 && var1 + var3 > var6 && var7 > var9 - 13 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class60.field1426.method903(class21.field564[var8], var1 + 3, var9, var10, true);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IJ)V", line = 324)
    public final void method678(int arg0, long arg1) {
        field2242++;
        if (arg1 >= 0L && arg0 == 3) {
            this.field2230 = arg1;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V", line = 350)
    private final void method679(byte arg0) throws IOException {
        if (arg0 < 46) {
            field2237 = null;
        }
        field2244++;
        if (this.field2243 == -1L) {
            return;
        }
        if (this.field2243 != this.field2238) {
            this.field2223.method664(106, this.field2243);
            this.field2238 = this.field2243;
        }
        long var2 = -1L;
        long var4 = -1L;
        this.field2223.method662(this.field2226, (byte) -99, this.field2218, 0);
        if ((long) this.field2226 + this.field2243 > this.field2220 && (long) this.field2241 + this.field2220 >= (long) this.field2226 + this.field2243) {
            var4 = (long) this.field2226 + this.field2243;
        } else if (this.field2243 < this.field2220 + (long) this.field2241 && (long) this.field2226 + this.field2243 >= (long) this.field2241 + this.field2220) {
            var4 = (long) this.field2241 + this.field2220;
        }
        this.field2238 += this.field2226;
        if (this.field2224 < this.field2238) {
            this.field2224 = this.field2238;
        }
        if (this.field2243 >= this.field2220 && this.field2243 < (long) this.field2241 + this.field2220) {
            var2 = this.field2243;
        } else if (this.field2243 <= this.field2220 && this.field2220 < this.field2243 + (long) this.field2226) {
            var2 = this.field2220;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class39.method263(this.field2218, (int) (var2 - this.field2243), this.field2227, (int) (var2 - this.field2220), var6);
        }
        this.field2226 = 0;
        this.field2243 = -1L;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([BIIZ)V", line = 426)
    public final void method680(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        if (!arg3) {
            return;
        }
        field2222++;
        try {
            if (this.field2232 < (long) arg2 + this.field2230) {
                this.field2232 = (long) arg2 + this.field2230;
            }
            if (this.field2243 != -1L && (this.field2243 > this.field2230 || this.field2243 + (long) this.field2226 < this.field2230)) {
                this.method679((byte) 67);
            }
            if (this.field2243 != -1L && (long) this.field2218.length + this.field2243 < this.field2230 - -((long) arg2)) {
                int var5 = (int) ((long) this.field2218.length + this.field2243 - this.field2230);
                class39.method263(arg0, arg1, this.field2218, (int) (this.field2230 - this.field2243), var5);
                arg2 -= var5;
                this.field2230 += var5;
                arg1 += var5;
                this.field2226 = this.field2218.length;
                this.method679((byte) 103);
            }
            if (this.field2218.length < arg2) {
                if (this.field2238 != this.field2230) {
                    this.field2223.method664(104, this.field2230);
                    this.field2238 = this.field2230;
                }
                this.field2223.method662(arg2, (byte) -105, arg0, arg1);
                this.field2238 += arg2;
                long var6 = -1L;
                if (this.field2224 < this.field2238) {
                    this.field2224 = this.field2238;
                }
                if (this.field2230 >= this.field2220 && this.field2220 + (long) this.field2241 > this.field2230) {
                    var6 = this.field2230;
                } else if (this.field2220 >= this.field2230 && this.field2220 < this.field2230 + (long) arg2) {
                    var6 = this.field2220;
                }
                long var8 = -1L;
                if ((long) arg2 + this.field2230 > this.field2220 && this.field2220 + (long) this.field2241 >= this.field2230 - -((long) arg2)) {
                    var8 = this.field2230 + (long) arg2;
                } else if ((long) this.field2241 + this.field2220 > this.field2230 && (long) this.field2241 + this.field2220 <= (long) arg2 + this.field2230) {
                    var8 = this.field2220 + (long) this.field2241;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class39.method263(arg0, (int) ((long) arg1 + var6 - this.field2230), this.field2227, (int) (var6 - this.field2220), var10);
                }
                this.field2230 += arg2;
            } else if (arg2 > 0) {
                if (this.field2243 == -1L) {
                    this.field2243 = this.field2230;
                }
                class39.method263(arg0, arg1, this.field2218, (int) (this.field2230 - this.field2243), arg2);
                this.field2230 += arg2;
                if (this.field2230 - this.field2243 > (long) this.field2226) {
                    this.field2226 = (int) (this.field2230 - this.field2243);
                }
            }
        } catch (IOException var12) {
            this.field2238 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[BI)V", line = 547)
    public final void method681(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2246++;
        int var5 = 31 % ((arg1 + 36) / 35);
        try {
            if (arg0 + arg3 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg2.length);
            }
            if (this.field2243 != -1L && this.field2230 >= this.field2243 && (long) arg0 + this.field2230 <= (long) this.field2226 + this.field2243) {
                class39.method263(this.field2218, (int) (this.field2230 - this.field2243), arg2, arg3, arg0);
                this.field2230 += arg0;
                return;
            }
            int var6 = arg3;
            long var7 = this.field2230;
            int var9 = arg0;
            if (this.field2230 >= this.field2220 && (long) this.field2241 + this.field2220 > this.field2230) {
                int var10 = (int) (this.field2220 + (long) this.field2241 - this.field2230);
                if (arg0 < var10) {
                    var10 = arg0;
                }
                arg0 -= var10;
                class39.method263(this.field2227, (int) (this.field2230 - this.field2220), arg2, arg3, var10);
                arg3 += var10;
                this.field2230 += var10;
            }
            if (arg0 > this.field2227.length) {
                this.field2223.method664(120, this.field2230);
                this.field2238 = this.field2230;
                while (arg0 > 0) {
                    int var11 = this.field2223.method663(arg3, arg2, arg0, -1);
                    if (var11 == -1) {
                        break;
                    }
                    arg3 += var11;
                    arg0 -= var11;
                    this.field2238 += var11;
                    this.field2230 += var11;
                }
            } else if (arg0 > 0) {
                this.method672((byte) 52);
                int var12 = arg0;
                if (this.field2241 < arg0) {
                    var12 = this.field2241;
                }
                class39.method263(this.field2227, 0, arg2, arg3, var12);
                this.field2230 += var12;
                arg0 -= var12;
                arg3 += var12;
            }
            if (this.field2243 != -1L) {
                if (this.field2243 > this.field2230 && arg0 > 0) {
                    int var13 = (int) (this.field2243 - this.field2230) + arg3;
                    if (arg0 + arg3 < var13) {
                        var13 = arg3 + arg0;
                    }
                    while (arg3 < var13) {
                        arg0--;
                        arg2[arg3++] = 0;
                        this.field2230++;
                    }
                }
                long var14 = -1L;
                long var16 = -1L;
                if (var7 <= this.field2243 && var7 + (long) var9 > this.field2243) {
                    var14 = this.field2243;
                } else if (var7 >= this.field2243 && (long) this.field2226 + this.field2243 > var7) {
                    var14 = var7;
                }
                if (var7 < (long) this.field2226 + this.field2243 && (long) this.field2226 + this.field2243 <= (long) var9 + var7) {
                    var16 = (long) this.field2226 + this.field2243;
                } else if (this.field2243 < (long) var9 + var7 && (long) this.field2226 + this.field2243 >= (long) var9 + var7) {
                    var16 = var7 + (long) var9;
                }
                if (var14 > -1L && var14 < var16) {
                    int var18 = (int) (var16 - var14);
                    class39.method263(this.field2218, (int) (var14 - this.field2243), arg2, (int) (var14 - var7) + var6, var18);
                    if (var16 > this.field2230) {
                        arg0 = (int) ((long) arg0 + this.field2230 - var16);
                        this.field2230 = var16;
                    }
                }
            }
        } catch (IOException var20) {
            this.field2238 = -1L;
            throw var20;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)J", line = 747)
    public final long method682(int arg0) {
        field2236++;
        if (arg0 != 17) {
            this.field2241 = -38;
        }
        return this.field2232;
    }
}
