import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class136 {

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    private int field2454 = 0;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "J")
    private long field2444 = -1L;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "J")
    private long field2458 = -1L;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Lkg;")
    private class116 field2452;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "J")
    private long field2438;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "J")
    private long field2462;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "[B")
    private byte[] field2464;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "J")
    private long field2463;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "[B")
    private byte[] field2461;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Leh;")
    public static class53 field2443 = new class53(30);

    @OriginalMember(owner = "client!me", name = "s", descriptor = "Lkh;")
    public static class117 field2455 = class224.method1450((byte) -84, "b12_full");

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Lff;")
    public static class62 field2457 = new class62(32);

    @OriginalMember(owner = "client!me", name = "E", descriptor = "Lkh;")
    public static class117 field2466 = class224.method1450((byte) 14, "");

    @OriginalMember(owner = "client!me", name = "G", descriptor = "Lkh;")
    public static class117 field2468 = class224.method1450((byte) 125, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!me", name = "D", descriptor = "Lkh;")
    public static class117 field2465 = class224.method1450((byte) 113, "Ausw-=hlen");

    @OriginalMember(owner = "client!me", name = "F", descriptor = "Lkh;")
    private static class117 field2467 = class224.method1450((byte) 120, "Connecting to update server");

    @OriginalMember(owner = "client!me", name = "H", descriptor = "Lkh;")
    public static class117 field2469 = field2467;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    private int field2459;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "J")
    private long field2451;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "Lai;")
    public static class10 field2456;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BI)V")
    public final void method903(byte[] arg0, int arg1) throws IOException {
        if (arg1 != 21740) {
            this.field2461 = null;
        }
        field2445++;
        this.method910(arg0.length, (byte) 1, 0, arg0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lai;Lai;IBI)Lmg;")
    public static final class138 method904(class10 arg0, class10 arg1, int arg2, byte arg3, int arg4) {
        field2442++;
        int var5 = -74 / ((arg3 + 38) / 52);
        return class96.method654(arg2, -2158, arg4, arg1) ? class176.method1228(arg0.method104(-43, arg4, arg2), 88) : null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(JB)V")
    public final void method905(long arg0, byte arg1) throws IOException {
        field2453++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method916(arg1 + 92));
        }
        this.field2463 = arg0;
        if (arg1 != -92) {
            this.method916(37);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIILdd;JZ)V")
    public static final void method906(int arg0, int arg1, int arg2, int arg3, class38 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class28 var8 = new class28();
        var8.field683 = arg4;
        var8.field684 = arg1 * 128 + 64;
        var8.field679 = arg2 * 128 + 64;
        var8.field686 = arg3;
        var8.field687 = arg5;
        if (class109.field2063[arg0][arg1][arg2] == null) {
            class109.field2063[arg0][arg1][arg2] = new class170(arg0, arg1, arg2);
        }
        class109.field2063[arg0][arg1][arg2].field3074 = var8;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static void method907(byte arg0) {
        field2456 = null;
        field2467 = null;
        field2469 = null;
        field2468 = null;
        field2443 = null;
        field2465 = null;
        field2466 = null;
        field2455 = null;
        if (arg0 != -48) {
            field2455 = null;
        }
        field2457 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
    public static final void method908(boolean arg0) {
        while (true) {
            if (class18.field511.method398(class30.field722, 8) >= 11) {
                int var1 = class18.field511.method396(11, (byte) -9);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class43.field950[var1] == null) {
                        var2 = true;
                        class43.field950[var1] = new class56();
                        if (class114.field2135[var1] != null) {
                            class43.field950[var1].method430((byte) -100, class114.field2135[var1]);
                        }
                    }
                    class139.field2539[class229.field4121++] = var1;
                    class56 var3 = class43.field950[var1];
                    var3.field4226 = class44.field966;
                    int var4 = class25.field628[class18.field511.method396(3, (byte) -9)];
                    if (var2) {
                        var3.field4249 = var3.field4232 = var4;
                    }
                    int var5 = class18.field511.method396(1, (byte) -9);
                    if (var5 == 1) {
                        class203.field3679[class215.field3914++] = var1;
                    }
                    int var6 = class18.field511.method396(5, (byte) -9);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class18.field511.method396(5, (byte) -9);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class18.field511.method396(1, (byte) -9);
                    var3.method1513(class93.field1712.field4266[0] + var6, class93.field1712.field4259[0] - -var7, -26447, ~var8 == -2);
                    continue;
                }
            }
            field2441++;
            if (arg0) {
                method907((byte) -116);
            }
            class18.field511.method397(77);
            return;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
    public final void method909(byte arg0) throws IOException {
        this.method914(-126);
        field2446++;
        if (arg0 < 11) {
            field2469 = null;
        }
        this.field2452.method771(true);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IBI[B)V")
    public final void method910(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field2460++;
        try {
            if (arg0 + arg2 > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg0 - arg3.length);
            }
            if (this.field2458 != -1L && this.field2458 <= this.field2463 && (long) this.field2454 + this.field2458 >= this.field2463 - -((long) arg0)) {
                class2.method9(this.field2464, (int) (this.field2463 - this.field2458), arg3, arg2, arg0);
                this.field2463 += arg0;
                return;
            }
            if (arg1 != 1) {
                this.method916(42);
            }
            int var5 = arg2;
            int var6 = arg0;
            long var7 = this.field2463;
            if (this.field2444 <= this.field2463 && (long) this.field2459 + this.field2444 > this.field2463) {
                int var9 = (int) (this.field2444 + (long) this.field2459 - this.field2463);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                arg0 -= var9;
                class2.method9(this.field2461, (int) (this.field2463 - this.field2444), arg3, arg2, var9);
                this.field2463 += var9;
                arg2 += var9;
            }
            if (arg0 > this.field2461.length) {
                this.field2452.method770(this.field2463, 109);
                this.field2451 = this.field2463;
                while (arg0 > 0) {
                    int var10 = this.field2452.method772(arg3, 102, arg0, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 -= var10;
                    this.field2463 += var10;
                    arg2 += var10;
                    this.field2451 += var10;
                }
            } else if (arg0 > 0) {
                this.method915((byte) -117);
                int var11 = arg0;
                if (arg0 > this.field2459) {
                    var11 = this.field2459;
                }
                class2.method9(this.field2461, 0, arg3, arg2, var11);
                arg0 -= var11;
                arg2 += var11;
                this.field2463 += var11;
            }
            if (this.field2458 != -1L) {
                if (this.field2458 > this.field2463 && arg0 > 0) {
                    int var12 = (int) (this.field2458 - this.field2463) + arg2;
                    if (arg2 + arg0 < var12) {
                        var12 = arg0 + arg2;
                    }
                    while (var12 > arg2) {
                        arg0--;
                        arg3[arg2++] = 0;
                        this.field2463++;
                    }
                }
                long var13 = -1L;
                if (var7 <= this.field2458 && this.field2458 < var7 + (long) var6) {
                    var13 = this.field2458;
                } else if (var7 >= this.field2458 && this.field2458 + (long) this.field2454 > var7) {
                    var13 = var7;
                }
                long var15 = -1L;
                if (var7 < this.field2458 + (long) this.field2454 && this.field2458 + (long) this.field2454 <= var7 - -((long) var6)) {
                    var15 = (long) this.field2454 + this.field2458;
                } else if (var7 + (long) var6 > this.field2458 && (long) var6 + var7 <= (long) this.field2454 + this.field2458) {
                    var15 = (long) var6 + var7;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class2.method9(this.field2464, (int) (var13 - this.field2458), arg3, (int) (var13 - var7) + var5, var17);
                    if (var15 > this.field2463) {
                        arg0 = (int) ((long) arg0 + this.field2463 - var15);
                        this.field2463 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2451 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IILtc;III)V")
    public static final void method911(int arg0, int arg1, class211 arg2, int arg3, int arg4, int arg5) {
        field2439++;
        class124 var6 = new class124();
        var6.field2319 = arg2.field3831 * 128;
        var6.field2323 = arg2.field3786;
        int var7 = arg2.field3814;
        var6.field2327 = arg0 * 128;
        var6.field2328 = arg2.field3780;
        if (arg1 > -74) {
            field2457 = null;
        }
        var6.field2333 = arg2.field3796;
        var6.field2315 = arg4 * 128;
        var6.field2314 = arg3;
        var6.field2325 = arg2.field3777;
        int var8 = arg2.field3804;
        if (arg5 == 1 || arg5 == 3) {
            var8 = arg2.field3814;
            var7 = arg2.field3804;
        }
        var6.field2326 = (arg4 + var8) * 128;
        var6.field2321 = (arg0 + var7) * 128;
        if (arg2.field3792 != null) {
            var6.field2312 = arg2;
            var6.method863(0);
        }
        class18.field523.method325(126, var6);
        if (var6.field2323 != null) {
            var6.field2332 = var6.field2328 + (int) ((double) (var6.field2325 - var6.field2328) * Math.random());
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BIII)V")
    public final void method912(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2449++;
        try {
            if (this.field2462 < this.field2463 + (long) arg2) {
                this.field2462 = (long) arg2 + this.field2463;
            }
            if (this.field2458 != -1L && (this.field2458 > this.field2463 || (long) this.field2454 + this.field2458 < this.field2463)) {
                this.method914(-99);
            }
            if (this.field2458 != -1L && (long) arg2 + this.field2463 > (long) this.field2464.length + this.field2458) {
                int var5 = (int) ((long) this.field2464.length + this.field2458 - this.field2463);
                arg2 -= var5;
                class2.method9(arg0, arg3, this.field2464, (int) (this.field2463 - this.field2458), var5);
                arg3 += var5;
                this.field2463 += var5;
                this.field2454 = this.field2464.length;
                this.method914(-123);
            }
            if (this.field2464.length < arg2) {
                if (this.field2463 != this.field2451) {
                    this.field2452.method770(this.field2463, 112);
                    this.field2451 = this.field2463;
                }
                this.field2452.method773(arg3, 25302, arg2, arg0);
                this.field2451 += arg2;
                long var6 = -1L;
                if (this.field2463 >= this.field2444 && this.field2463 < this.field2444 + (long) this.field2459) {
                    var6 = this.field2463;
                } else if (this.field2463 <= this.field2444 && this.field2444 < (long) arg2 + this.field2463) {
                    var6 = this.field2444;
                }
                if (this.field2451 > this.field2438) {
                    this.field2438 = this.field2451;
                }
                long var8 = -1L;
                if (this.field2463 + (long) arg2 > this.field2444 && this.field2463 + (long) arg2 <= (long) this.field2459 + this.field2444) {
                    var8 = (long) arg2 + this.field2463;
                } else if (this.field2463 < (long) this.field2459 + this.field2444 && (long) arg2 + this.field2463 >= this.field2444 - -((long) this.field2459)) {
                    var8 = (long) this.field2459 + this.field2444;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class2.method9(arg0, (int) ((long) arg3 + var6 - this.field2463), this.field2461, (int) (var6 - this.field2444), var10);
                }
                this.field2463 += arg2;
            } else if (arg2 > 0) {
                if (this.field2458 == -1L) {
                    this.field2458 = this.field2463;
                }
                class2.method9(arg0, arg3, this.field2464, (int) (this.field2463 - this.field2458), arg2);
                this.field2463 += arg2;
                if ((long) this.field2454 < this.field2463 - this.field2458) {
                    this.field2454 = (int) (this.field2463 - this.field2458);
                }
            } else if (arg1 >= -101) {
                this.method913((byte) -85);
            }
        } catch (IOException var12) {
            this.field2451 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)J")
    public final long method913(byte arg0) {
        field2450++;
        if (arg0 <= 34) {
            field2467 = null;
        }
        return this.field2462;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    private final void method914(int arg0) throws IOException {
        if (arg0 > -91) {
            field2457 = null;
        }
        field2448++;
        if (this.field2458 == -1L) {
            return;
        }
        if (this.field2458 != this.field2451) {
            this.field2452.method770(this.field2458, 114);
            this.field2451 = this.field2458;
        }
        this.field2452.method773(0, 25302, this.field2454, this.field2464);
        long var2 = -1L;
        long var4 = -1L;
        if (this.field2444 < this.field2458 + (long) this.field2454 && (long) this.field2454 + this.field2458 <= (long) this.field2459 + this.field2444) {
            var4 = (long) this.field2454 + this.field2458;
        } else if ((long) this.field2459 + this.field2444 > this.field2458 && this.field2444 + (long) this.field2459 <= (long) this.field2454 + this.field2458) {
            var4 = this.field2444 + (long) this.field2459;
        }
        if (this.field2444 <= this.field2458 && (long) this.field2459 + this.field2444 > this.field2458) {
            var2 = this.field2458;
        } else if (this.field2458 <= this.field2444 && (long) this.field2454 + this.field2458 > this.field2444) {
            var2 = this.field2444;
        }
        this.field2451 += this.field2454;
        if (this.field2438 < this.field2451) {
            this.field2438 = this.field2451;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class2.method9(this.field2464, (int) (var2 - this.field2458), this.field2461, (int) (var2 - this.field2444), var6);
        }
        this.field2458 = -1L;
        this.field2454 = 0;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
    private final void method915(byte arg0) throws IOException {
        if (arg0 != -117) {
            this.method913((byte) 33);
        }
        field2447++;
        this.field2459 = 0;
        if (this.field2463 != this.field2451) {
            this.field2452.method770(this.field2463, 124);
            this.field2451 = this.field2463;
        }
        this.field2444 = this.field2463;
        while (this.field2459 < this.field2461.length) {
            int var2 = this.field2461.length - this.field2459;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2452.method772(this.field2461, 98, var2, this.field2459);
            if (var3 == -1) {
                break;
            }
            this.field2459 += var3;
            this.field2451 += var3;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method916(int arg0) {
        field2437++;
        if (arg0 != 0) {
            method906(-127, -117, 19, -79, null, 93L, false);
        }
        return this.field2452.method774(-1);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lkg;II)V")
    public class136(class116 arg0, int arg1, int arg2) throws IOException {
        this.field2452 = arg0;
        this.field2462 = this.field2438 = arg0.method775(1);
        this.field2464 = new byte[arg2];
        this.field2463 = 0L;
        this.field2461 = new byte[arg1];
    }
}
