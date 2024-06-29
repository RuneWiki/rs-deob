import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class165 {

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    private int field2342 = 0;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "J")
    private long field2346 = -1L;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "J")
    private long field2369 = -1L;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "Loe;")
    private class10 field2363;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "J")
    private long field2344;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "J")
    private long field2356;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "[B")
    private byte[] field2348;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "[B")
    private byte[] field2350;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "J")
    private long field2349;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2343 = "Examine";

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    public static int field2353 = 0;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field2352 = 0;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    private int field2341;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "J")
    private long field2345;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "Lph;")
    public static class361 field2365;

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "Lvf;")
    public static class42 field2370;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "[[I")
    public static int[][] field2358;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[B)V", line = 9)
    public final void method1166(int arg0, byte[] arg1) throws IOException {
        this.method1169((byte) 122, arg1, arg1.length, 0);
        field2364++;
        int var3 = -97 % ((arg0 + 74) / 33);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(JI)V", line = 21)
    public final void method1167(long arg0, int arg1) throws IOException {
        if (arg1 != 8) {
            return;
        }
        field2362++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1170(28419));
        }
        this.field2349 = arg0;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Loe;II)V", line = 901)
    public class165(class10 arg0, int arg1, int arg2) throws IOException {
        this.field2363 = arg0;
        this.field2356 = this.field2344 = arg0.method57((byte) 61);
        this.field2348 = new byte[arg2];
        this.field2350 = new byte[arg1];
        this.field2349 = 0L;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V", line = 41)
    private final void method1168(byte arg0) throws IOException {
        field2367++;
        this.field2341 = 0;
        if (this.field2349 != this.field2345) {
            this.field2363.method61((byte) -87, this.field2349);
            this.field2345 = this.field2349;
        }
        this.field2346 = this.field2349;
        if (arg0 != 99) {
            this.method1176(-68);
        }
        while (this.field2350.length > this.field2341) {
            int var2 = this.field2350.length - this.field2341;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2363.method62(this.field2350, arg0 ^ 0xFFFFFF9C, this.field2341, var2);
            if (var3 == -1) {
                break;
            }
            this.field2345 += (long) var3;
            this.field2341 += var3;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B[BII)V", line = 99)
    public final void method1169(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2368++;
        try {
            if (arg1.length < (arg2 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg2 - arg1.length);
            }
            if (this.field2369 != -1L && this.field2369 <= this.field2349 && ((long) arg2 + this.field2349) <= (this.field2369 + ((long) this.field2342))) {
                class84.method684(this.field2348, (int) (this.field2349 - this.field2369), arg1, arg3, arg2);
                this.field2349 += (long) arg2;
                return;
            }
            long var5 = this.field2349;
            if (arg0 < 101) {
                method1179(23);
            }
            int var7 = arg2;
            int var8 = arg3;
            if (this.field2349 >= this.field2346 && (this.field2346 + ((long) this.field2341)) > this.field2349) {
                int var9 = (int) (this.field2346 + (long) this.field2341 - this.field2349);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                arg2 -= var9;
                class84.method684(this.field2350, (int) (this.field2349 - this.field2346), arg1, arg3, var9);
                this.field2349 += (long) var9;
                arg3 += var9;
            }
            if (this.field2350.length < arg2) {
                this.field2363.method61((byte) -87, this.field2349);
                this.field2345 = this.field2349;
                while (arg2 > 0) {
                    int var11 = this.field2363.method62(arg1, -1, arg3, arg2);
                    if (var11 == -1) {
                        break;
                    }
                    this.field2345 += (long) var11;
                    this.field2349 += (long) var11;
                    arg2 -= var11;
                    arg3 += var11;
                }
            } else if (arg2 > 0) {
                this.method1168((byte) 99);
                int var10 = arg2;
                if (arg2 > this.field2341) {
                    var10 = this.field2341;
                }
                arg2 -= var10;
                class84.method684(this.field2350, 0, arg1, arg3, var10);
                this.field2349 += (long) var10;
                arg3 += var10;
            }
            if (this.field2369 != -1L) {
                if (this.field2369 > this.field2349 && arg2 > 0) {
                    int var12 = (int) (this.field2369 - this.field2349) + arg3;
                    if (var12 > arg2 + arg3) {
                        var12 = arg3 + arg2;
                    }
                    while (arg3 < var12) {
                        arg1[arg3++] = 0;
                        this.field2349++;
                        arg2--;
                    }
                }
                long var13 = -1L;
                if (this.field2369 >= var5 && this.field2369 < (var5 + ((long) var7))) {
                    var13 = this.field2369;
                } else if (this.field2369 <= var5 && (long) this.field2342 + this.field2369 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field2342 + this.field2369 > var5 && (long) var7 + var5 >= (long) this.field2342 + this.field2369) {
                    var15 = this.field2369 + ((long) this.field2342);
                } else if (this.field2369 < (long) var7 + var5 && ((long) var7 + var5) <= ((long) this.field2342 + this.field2369)) {
                    var15 = var5 + ((long) var7);
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class84.method684(this.field2348, (int) (var13 - this.field2369), arg1, (int) (var13 - var5) + var8, var17);
                    if (this.field2349 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field2349));
                        this.field2349 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2345 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Ljava/io/File;", line = 287)
    private final File method1170(int arg0) {
        field2354++;
        return arg0 == 28419 ? this.field2363.method58((byte) -82) : (File) null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III[B)V", line = 301)
    public final void method1171(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2360++;
        try {
            if (this.field2356 < this.field2349 + ((long) arg2)) {
                this.field2356 = this.field2349 + ((long) arg2);
            }
            if (this.field2369 != -1L && (this.field2349 < this.field2369 || this.field2349 > (long) this.field2342 + this.field2369)) {
                this.method1175(19892);
            }
            if ((long) arg1 != this.field2369 && ((long) arg2 + this.field2349) > ((long) this.field2348.length + this.field2369)) {
                int var5 = (int) ((long) this.field2348.length - (this.field2349 - this.field2369));
                arg2 -= var5;
                class84.method684(arg3, arg0, this.field2348, (int) (this.field2349 - this.field2369), var5);
                this.field2349 += (long) var5;
                arg0 += var5;
                this.field2342 = this.field2348.length;
                this.method1175(19892);
            }
            if (arg2 > this.field2348.length) {
                if (this.field2349 != this.field2345) {
                    this.field2363.method61((byte) -87, this.field2349);
                    this.field2345 = this.field2349;
                }
                this.field2363.method60(arg3, arg2, arg0, arg1 ^ 0xFFFFFFD1);
                long var6 = -1L;
                if (this.field2346 <= this.field2349 && ((long) this.field2341 + this.field2346) > this.field2349) {
                    var6 = this.field2349;
                } else if (this.field2349 <= this.field2346 && this.field2346 < ((long) arg2 + this.field2349)) {
                    var6 = this.field2346;
                }
                this.field2345 += (long) arg2;
                if (this.field2345 > this.field2344) {
                    this.field2344 = this.field2345;
                }
                long var8 = -1L;
                if ((this.field2349 + ((long) arg2)) > this.field2346 && ((long) this.field2341 + this.field2346) >= (this.field2349 + ((long) arg2))) {
                    var8 = (long) arg2 + this.field2349;
                } else if (((long) this.field2341 + this.field2346) > this.field2349 && this.field2349 + ((long) arg2) >= this.field2346 - -((long) this.field2341)) {
                    var8 = (long) this.field2341 + this.field2346;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class84.method684(arg3, (int) ((long) arg0 + var6 - this.field2349), this.field2350, (int) (var6 - this.field2346), var10);
                }
                this.field2349 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2369 == -1L) {
                    this.field2369 = this.field2349;
                }
                class84.method684(arg3, arg0, this.field2348, (int) (this.field2349 - this.field2369), arg2);
                this.field2349 += (long) arg2;
                if ((this.field2349 - this.field2369) > ((long) this.field2342)) {
                    this.field2342 = (int) (this.field2349 - this.field2369);
                }
            }
        } catch (IOException var12) {
            this.field2345 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Lqf;", line = 427)
    public static final class359 method1172(int arg0, int arg1, int arg2) {
        class359 var3 = class231.method1719(arg2, arg1 ^ 0xFFFFFFAE);
        field2355++;
        if (arg0 == arg1) {
            return var3;
        } else if (var3 == null || var3.field5579 == null || arg0 >= var3.field5579.length) {
            return null;
        } else {
            return var3.field5579[arg0];
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V", line = 446)
    public static final void method1173(boolean arg0) {
        if (class260.field3879 != null) {
            class75 var1 = class260.field3879;
            synchronized (class260.field3879) {
                class260.field3879 = null;
            }
        }
        field2351++;
        if (arg0) {
            method1174(94);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V", line = 473)
    public static void method1174(int arg0) {
        if (arg0 > 86) {
            field2370 = null;
            field2358 = (int[][]) null;
            field2343 = null;
            field2365 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V", line = 487)
    private final void method1175(int arg0) throws IOException {
        field2361++;
        if (arg0 != 19892) {
            method1174(-123);
        }
        if (this.field2369 == -1L) {
            return;
        }
        if (this.field2369 != this.field2345) {
            this.field2363.method61((byte) -87, this.field2369);
            this.field2345 = this.field2369;
        }
        long var2 = -1L;
        this.field2363.method60(this.field2348, this.field2342, 0, 12);
        if (this.field2369 >= this.field2346 && ((long) this.field2341 + this.field2346) > this.field2369) {
            var2 = this.field2369;
        } else if (this.field2346 >= this.field2369 && ((long) this.field2342 + this.field2369) > this.field2346) {
            var2 = this.field2346;
        }
        long var4 = -1L;
        this.field2345 += (long) this.field2342;
        if (this.field2346 < ((long) this.field2342 + this.field2369) && (long) this.field2342 + this.field2369 <= (long) this.field2341 + this.field2346) {
            var4 = (long) this.field2342 + this.field2369;
        } else if (((long) this.field2341 + this.field2346) > this.field2369 && (long) this.field2342 + this.field2369 >= (long) this.field2341 + this.field2346) {
            var4 = (long) this.field2341 + this.field2346;
        }
        if (this.field2345 > this.field2344) {
            this.field2344 = this.field2345;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class84.method684(this.field2348, (int) (var2 - this.field2369), this.field2350, (int) (var2 - this.field2346), var6);
        }
        this.field2369 = -1L;
        this.field2342 = 0;
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)J", line = 562)
    public final long method1176(int arg0) {
        field2359++;
        if (arg0 != -10584) {
            field2353 = 59;
        }
        return this.field2356;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)Lfj;", line = 575)
    public static final class37 method1177(int arg0, int arg1) {
        field2340++;
        class37 var2 = (class37) class38.field561.method461((byte) 120, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class99.field1400.method2520(1, arg1, (byte) -25);
        class37 var4 = new class37();
        if (var3 != null) {
            var4.method270(-26308, arg1, new class190(var3));
        }
        if (arg0 != 26277) {
            field2370 = (class42) null;
        }
        class38.field561.method460(var4, -26089, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZILsb;IIZIIIIII)V", line = 599)
    public static final void method1178(boolean arg0, int arg1, class190 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg7 >= arg8 && arg7 < 104 && arg1 >= 0 && arg1 < 104) {
            if (!arg5 && !arg0) {
                class230.field3491[arg3][arg7][arg1] = 0;
            }
            while (true) {
                int var12 = arg2.method1319(arg8 + 255);
                if (var12 == 0) {
                    if (arg5) {
                        class132.field1930[0][arg7 + arg6][arg1 + arg9] = class287.field4340[0][arg6 + arg7][arg1 + arg9];
                    } else if (arg3 == 0) {
                        class132.field1930[0][arg6 + arg7][arg1 + arg9] = -class217.method1567(arg11 + 932731, arg10 + 556238, (byte) -122) * 8;
                    } else {
                        class132.field1930[arg3][arg7 + arg6][arg1 + arg9] = class132.field1930[arg3 - 1][arg6 + arg7][arg1 + arg9] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg2.method1319(255);
                    if (arg5) {
                        class132.field1930[0][arg7 + arg6][arg1 + arg9] = var13 * 8 + class287.field4340[0][arg6 + arg7][arg1 + arg9];
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg3 == 0) {
                            class132.field1930[0][arg6 + arg7][arg1 + arg9] = -var13 * 8;
                        } else {
                            class132.field1930[arg3][arg6 + arg7][arg1 + arg9] = class132.field1930[arg3 - 1][arg7 + arg6][arg1 + arg9] - (var13 * 8);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg0) {
                        arg2.method1319(255);
                    } else {
                        class261.field3913[arg3][arg7][arg1] = arg2.method1322(arg8 + 9813);
                        class300.field4492[arg3][arg7][arg1] = (byte) ((var12 - 2) / 4);
                        class132.field1933[arg3][arg7][arg1] = (byte) class287.method2076(arg4 + var12 - 2, 3);
                    }
                } else if (var12 <= 81) {
                    if (!arg5 && !arg0) {
                        class230.field3491[arg3][arg7][arg1] = (byte) (var12 - 49);
                    }
                } else if (!arg0) {
                    class126.field1826[arg3][arg7][arg1] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg2.method1319(255);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg2.method1319(255);
                    break;
                }
                if (var14 <= 49) {
                    arg2.method1319(255);
                }
            }
        }
        field2366++;
    }

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)V", line = 713)
    public static final void method1179(int arg0) {
        if (class181.field2603 == 2) {
            if (class193.field2807 == class152.field2192 && class354.field5444 == class255.field3814) {
                class181.field2603 = 0;
                if (class33.field471 && class236.field3549[81] && class264.field4043 > 2) {
                    class172.method1208(arg0 ^ 0xFFFFFFF5, class264.field4043 - 2);
                } else {
                    class172.method1208(10, class264.field4043 - 1);
                }
            }
        } else if (class193.field2807 == class180.field2592 && class255.field3814 == class227.field3425) {
            class181.field2603 = 0;
            if (class33.field471 && class236.field3549[81] && class264.field4043 > 2) {
                class172.method1208(10, class264.field4043 - 2);
            } else {
                class172.method1208(arg0 ^ 0xFFFFFFF5, class264.field4043 - 1);
            }
        } else {
            class181.field2603 = 2;
            class354.field5444 = class227.field3425;
            class152.field2192 = class180.field2592;
        }
        if (arg0 != -1) {
            field2353 = 60;
        }
        field2347++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIIIILh;IZJ)Z", line = 776)
    public static final boolean method1180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class111 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class240.field3567 == class132.field1930;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class18.field295 || var16 >= class146.field2109) {
                    return false;
                }
                class167 var17 = class302.field4502[arg0][var15][var16];
                if (var17 != null && var17.field2407 >= 5) {
                    return false;
                }
            }
        }
        class180 var18 = new class180();
        var18.field2585 = arg11;
        var18.field2579 = arg0;
        var18.field2600 = arg5;
        var18.field2589 = arg6;
        var18.field2599 = arg7;
        var18.field2591 = arg8;
        var18.field2596 = arg9;
        var18.field2590 = arg1;
        var18.field2580 = arg2;
        var18.field2581 = arg1 + arg3 - 1;
        var18.field2601 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class302.field4502[var22][var19][var20] == null) {
                        class302.field4502[var22][var19][var20] = new class167(var22, var19, var20);
                    }
                }
                class167 var23 = class302.field4502[arg0][var19][var20];
                var23.field2406[var23.field2407] = var18;
                var23.field2413[var23.field2407] = var21;
                var23.field2409 |= var21;
                var23.field2407++;
                if (var13 && field2358[var19][var20] != 0) {
                    var14 = field2358[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (field2358[var24][var25] == 0) {
                        field2358[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class344.field5330[class352.field5421++] = var18;
        }
        return true;
    }
}
