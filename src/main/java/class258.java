import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class258 {

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    private int field4215 = 0;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "J")
    private long field4213 = -1L;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "J")
    private long field4223 = -1L;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "Lmc;")
    private class203 field4229;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "J")
    private long field4222;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "J")
    private long field4224;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "[B")
    private byte[] field4230;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "J")
    private long field4217;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "[B")
    private byte[] field4216;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    private int field4210;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "J")
    private long field4228;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 5)
    private final void method1801(int arg0) throws IOException {
        if (arg0 != 0) {
            return;
        }
        field4225++;
        if (this.field4213 == -1L) {
            return;
        }
        long var2 = -1L;
        if (this.field4228 != this.field4213) {
            this.field4229.method1385(arg0 ^ 0x0, this.field4213);
            this.field4228 = this.field4213;
        }
        long var4 = -1L;
        this.field4229.method1386(0, this.field4216, arg0 - 1, this.field4215);
        this.field4228 += (long) this.field4215;
        if (this.field4223 < (long) this.field4215 + this.field4213 && ((long) this.field4215 + this.field4213) <= ((long) this.field4210 + this.field4223)) {
            var4 = (long) this.field4215 + this.field4213;
        } else if ((long) this.field4210 + this.field4223 > this.field4213 && (this.field4223 + ((long) this.field4210)) <= ((long) this.field4215 + this.field4213)) {
            var4 = (long) this.field4210 + this.field4223;
        }
        if (this.field4222 < this.field4228) {
            this.field4222 = this.field4228;
        }
        if (this.field4213 >= this.field4223 && (long) this.field4210 + this.field4223 > this.field4213) {
            var2 = this.field4213;
        } else if (this.field4223 >= this.field4213 && (long) this.field4215 + this.field4213 > this.field4223) {
            var2 = this.field4223;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class89.method689(this.field4216, (int) (var2 - this.field4213), this.field4230, (int) (var2 - this.field4223), var6);
        }
        this.field4213 = -1L;
        this.field4215 = 0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(JI)V", line = 82)
    public final void method1802(long arg0, int arg1) throws IOException {
        field4227++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1805(-1));
        }
        if (arg1 < 10) {
            method1809(-112, -127, -56, 45, (class181[]) null, -62, -85, 111, -48, -114);
        }
        this.field4217 = arg0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lek;I)V", line = 97)
    public static final void method1803(class206 arg0, int arg1) {
        if (arg1 != 0) {
            method1809(-26, 21, 81, 57, (class181[]) null, -125, 6, 109, 26, 58);
        }
        class25.field656 = arg0;
        field4219++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[BII)V", line = 113)
    public final void method1804(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4218++;
        try {
            if (arg1.length < arg2 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg2 - arg1.length);
            }
            if (this.field4213 != -1L && this.field4217 >= this.field4213 && ((long) arg3 + this.field4217) <= ((long) this.field4215 + this.field4213)) {
                class89.method689(this.field4216, (int) (this.field4217 - this.field4213), arg1, arg2, arg3);
                this.field4217 += (long) arg3;
                return;
            }
            long var5 = this.field4217;
            int var7 = arg2;
            int var8 = arg3;
            if (arg0 != 13875) {
                this.method1806(-15);
            }
            if (this.field4223 <= this.field4217 && (long) this.field4210 + this.field4223 > this.field4217) {
                int var9 = (int) (this.field4223 + (long) this.field4210 - this.field4217);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                arg3 -= var9;
                class89.method689(this.field4230, (int) (this.field4217 - this.field4223), arg1, arg2, var9);
                this.field4217 += (long) var9;
                arg2 += var9;
            }
            if (arg3 > this.field4230.length) {
                this.field4229.method1385(0, this.field4217);
                this.field4228 = this.field4217;
                while (arg3 > 0) {
                    int var11 = this.field4229.method1389(arg2, -21270, arg1, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    arg3 -= var11;
                    this.field4228 += (long) var11;
                    arg2 += var11;
                    this.field4217 += (long) var11;
                }
            } else if (arg3 > 0) {
                int var10 = arg3;
                this.method1810(arg0 - 13875);
                if (this.field4210 < arg3) {
                    var10 = this.field4210;
                }
                arg3 -= var10;
                class89.method689(this.field4230, 0, arg1, arg2, var10);
                arg2 += var10;
                this.field4217 += (long) var10;
            }
            if (this.field4213 != -1L) {
                if (this.field4213 > this.field4217 && arg3 > 0) {
                    int var12 = (int) (this.field4213 - this.field4217) + arg2;
                    if ((arg2 + arg3) < var12) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg2) {
                        arg1[arg2++] = 0;
                        this.field4217++;
                        arg3--;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field4213 && (long) var8 + var5 > this.field4213) {
                    var13 = this.field4213;
                } else if (this.field4213 <= var5 && (long) this.field4215 + this.field4213 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field4215 + this.field4213 > var5 && (long) this.field4215 + this.field4213 <= var5 - -((long) var8)) {
                    var15 = this.field4213 + ((long) this.field4215);
                } else if ((var5 + ((long) var8)) > this.field4213 && ((long) var8 + var5) <= (this.field4213 + ((long) this.field4215))) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class89.method689(this.field4216, (int) (var13 - this.field4213), arg1, (int) (var13 - var5) + var7, var17);
                    if (this.field4217 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field4217));
                        this.field4217 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4228 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Ljava/io/File;", line = 299)
    private final File method1805(int arg0) {
        if (arg0 != -1) {
            this.field4222 = -91L;
        }
        field4211++;
        return this.field4229.method1387((byte) 55);
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)J", line = 314)
    public final long method1806(int arg0) {
        if (arg0 != 2) {
            this.field4216 = (byte[]) null;
        }
        field4209++;
        return this.field4224;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Lmi;", line = 326)
    public static final class300 method1807(int arg0, int arg1) {
        if (arg1 < 56) {
            method1807(13, -58);
        }
        field4226++;
        class300 var2 = (class300) class287.field4695.method893((long) arg0, 96);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class206.field3418.method1404(class219.method1523(-105, arg0), class16.method166(arg0, (byte) -113), (byte) -104);
        class300 var4 = new class300();
        var4.field4860 = arg0;
        if (var3 != null) {
            var4.method2147(-2, new class146(var3));
        }
        var4.method2143(-126);
        class287.field4695.method888((long) arg0, var4, 48);
        return var4;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lmc;II)V", line = 1935)
    public class258(class203 arg0, int arg1, int arg2) throws IOException {
        this.field4229 = arg0;
        this.field4224 = this.field4222 = arg0.method1388(0);
        this.field4230 = new byte[arg1];
        this.field4217 = 0L;
        this.field4216 = new byte[arg2];
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I[BII)V", line = 375)
    public final void method1808(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4208++;
        try {
            if ((long) arg0 + this.field4217 > this.field4224) {
                this.field4224 = (long) arg0 + this.field4217;
            }
            if (this.field4213 != -1L && (this.field4213 > this.field4217 || ((long) this.field4215 + this.field4213) < this.field4217)) {
                this.method1801(0);
            }
            if (this.field4213 != -1L && (long) arg0 + this.field4217 > (long) this.field4216.length + this.field4213) {
                int var5 = (int) ((long) this.field4216.length + this.field4213 - this.field4217);
                class89.method689(arg1, arg2, this.field4216, (int) (this.field4217 - this.field4213), var5);
                arg0 -= var5;
                this.field4217 += (long) var5;
                arg2 += var5;
                this.field4215 = this.field4216.length;
                this.method1801(0);
            }
            if (this.field4216.length < arg0) {
                long var6 = -1L;
                long var8 = -1L;
                if (this.field4228 != this.field4217) {
                    this.field4229.method1385(0, this.field4217);
                    this.field4228 = this.field4217;
                }
                this.field4229.method1386(arg2, arg1, -1, arg0);
                if (((long) arg0 + this.field4217) > this.field4223 && ((long) arg0 + this.field4217) <= (this.field4223 + ((long) this.field4210))) {
                    var8 = (long) arg0 + this.field4217;
                } else if (this.field4217 < (long) this.field4210 + this.field4223 && ((long) arg0 + this.field4217) >= ((long) this.field4210 + this.field4223)) {
                    var8 = (long) this.field4210 + this.field4223;
                }
                if (this.field4217 >= this.field4223 && this.field4217 < (long) this.field4210 + this.field4223) {
                    var6 = this.field4217;
                } else if (this.field4217 <= this.field4223 && (this.field4217 + ((long) arg0)) > this.field4223) {
                    var6 = this.field4223;
                }
                this.field4228 += (long) arg0;
                if (this.field4222 < this.field4228) {
                    this.field4222 = this.field4228;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class89.method689(arg1, (int) ((long) arg2 + var6 - this.field4217), this.field4230, (int) (var6 - this.field4223), var10);
                }
                this.field4217 += (long) arg0;
                return;
            }
            if (arg0 > 0) {
                if (this.field4213 == -1L) {
                    this.field4213 = this.field4217;
                }
                class89.method689(arg1, arg2, this.field4216, (int) (this.field4217 - this.field4213), arg0);
                this.field4217 += (long) arg0;
                if ((long) this.field4215 < this.field4217 - this.field4213) {
                    this.field4215 = (int) (this.field4217 - this.field4213);
                }
                return;
            }
        } catch (IOException var12) {
            this.field4228 = -1L;
            throw var12;
        }
        if (arg3 > -34) {
            method1803((class206) null, -98);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII[Lg;IIIII)V", line = 505)
    public static final void method1809(int arg0, int arg1, int arg2, int arg3, class181[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4214++;
        if (class241.field4016) {
            class337.method2385(arg0, arg3, arg8, arg6);
        } else {
            class270.method1891(arg0, arg3, arg8, arg6);
            class305.method2226();
        }
        for (int var10 = 0; var10 < arg4.length; var10++) {
            class181 var11 = arg4[var10];
            if (var11 != null && (var11.field2970 == arg5 || arg5 == -1412584499 && class323.field5231 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class260.field4257[class87.field1522] = var11.field3125 + arg2;
                    class54.field1074[class87.field1522] = var11.field3011 + arg1;
                    class220.field3657[class87.field1522] = var11.field3024;
                    class83.field1438[class87.field1522] = var11.field2972;
                    var12 = class87.field1522++;
                } else {
                    var12 = arg7;
                }
                var11.field3094 = var12;
                var11.field3071 = class267.field4371;
                if (!var11.field3058 || !client.method1987(var11)) {
                    if (var11.field3059 > 0) {
                        class88.method669(4906, var11);
                    }
                    int var13 = var11.field3011 + arg1;
                    int var14 = var11.field3125 + arg2;
                    int var15 = var11.field3105;
                    if (class323.field5230 && (client.method1990(var11).field5380 != 0 || var11.field3098 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class323.field5231 == var11) {
                        if (arg5 != -1412584499 && !var11.field3140) {
                            class91.field1615 = arg4;
                            class140.field2374 = arg1;
                            class306.field4981 = arg2;
                            continue;
                        }
                        if (!var11.field3140) {
                            var15 = 128;
                        }
                        if (class264.field4327 && class132.field2275) {
                            int var16 = class73.field1339;
                            int var17 = class26.field662;
                            int var18 = var17 - class97.field1760;
                            int var19 = var16 - class269.field4377;
                            if (class79.field1403 > var18) {
                                var18 = class79.field1403;
                            }
                            if (var19 < class233.field3818) {
                                var19 = class233.field3818;
                            }
                            if (var11.field2972 + var18 > class79.field1403 - -class16.field476.field2972) {
                                var18 = class16.field476.field2972 + class79.field1403 - var11.field2972;
                            }
                            if (var11.field3024 + var19 > class233.field3818 + class16.field476.field3024) {
                                var19 = class16.field476.field3024 + class233.field3818 - var11.field3024;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field3098 == 2) {
                        var20 = arg0;
                        var21 = arg6;
                        var22 = arg3;
                        var23 = arg8;
                    } else {
                        var22 = var13 <= arg3 ? arg3 : var13;
                        var20 = arg0 < var14 ? var14 : arg0;
                        int var24 = var14 + var11.field3024;
                        int var25 = var11.field2972 + var13;
                        if (var11.field3098 == 9) {
                            var24++;
                            var25++;
                        }
                        var21 = arg6 > var25 ? var25 : arg6;
                        var23 = var24 < arg8 ? var24 : arg8;
                    }
                    if (!var11.field3058 || var20 < var23 && var22 < var21) {
                        if (var11.field3059 != 0) {
                            if (var11.field3059 == 1337 || var11.field3059 == 1403) {
                                class338.field5359 = var11;
                                class284.field4633 = var14;
                                class353.field5640 = var13;
                                class114.method844(var11.field2972, var13, var14, var11.field3059 == 1403, false, var11.field3024);
                                class213.field3524[var12] = true;
                                if (class241.field4016) {
                                    class337.method2385(arg0, arg3, arg8, arg6);
                                } else {
                                    class270.method1891(arg0, arg3, arg8, arg6);
                                }
                                continue;
                            }
                            if (var11.field3059 == 1338) {
                                if (!var11.method1277(true)) {
                                    continue;
                                }
                                class33.method242(var12, var13, -28034, var11, var14);
                                if (class241.field4016) {
                                    class337.method2385(arg0, arg3, arg8, arg6);
                                } else {
                                    class270.method1891(arg0, arg3, arg8, arg6);
                                }
                                if (class174.field2885 != 0 && class174.field2885 != 3 || class5.field87 || var20 > class57.field1135 || class250.field4111 < var22 || class57.field1135 >= var23 || class250.field4111 >= var21) {
                                    continue;
                                }
                                int var41 = class57.field1135 - var14;
                                int var42 = class250.field4111 - var13;
                                int var43 = var11.field3015[var42];
                                if (var43 > var41 || var41 > var43 + var11.field2973[var42]) {
                                    continue;
                                }
                                int var44 = var42 - var11.field2972 / 2;
                                int var45 = var41 - var11.field3024 / 2;
                                int var46;
                                if (class69.field1280 == 4) {
                                    var46 = (int) class354.field5652 & 0x7FF;
                                } else {
                                    var46 = (int) class354.field5652 + class192.field3253 & 0x7FF;
                                }
                                int var47 = class305.field4959[var46];
                                int var48 = class305.field4957[var46];
                                if (class69.field1280 != 4) {
                                    var47 = (class292.field4726 + 256) * var47 >> 8;
                                    var48 = (class292.field4726 + 256) * var48 >> 8;
                                }
                                int var49 = var44 * var47 + var45 * var48 >> 11;
                                int var50 = var44 * var48 - (var45 * var47) >> 11;
                                int var51;
                                int var52;
                                if (class69.field1280 == 4) {
                                    var51 = class250.field4114 + var49 >> 7;
                                    var52 = class212.field3511 - var50 >> 7;
                                } else {
                                    var51 = class96.field1750.field199 + var49 + 64 - (class96.field1750.method49((byte) -117) * 64) >> 7;
                                    var52 = class96.field1750.field213 - var50 - (class96.field1750.method49((byte) -99) * 64 + -64) >> 7;
                                }
                                if (class52.field1046 && (class332.field5295 & 0x40) != 0) {
                                    class181 var53 = class204.method1392(class119.field2126, 1, class354.field5650);
                                    if (var53 == null) {
                                        class266.method1865(arg9 ^ 0x0);
                                    } else {
                                        class358.method2530(" ->", 1L, var52, (short) 25, false, class112.field2047, var51, class13.field397);
                                    }
                                    continue;
                                }
                                if (class141.field2383 == 1) {
                                    class358.method2530("", 1L, var52, (short) 35, false, class338.field5354, var51, -1);
                                }
                                class358.method2530("", 1L, var52, (short) 31, false, class216.field3608, var51, -1);
                                continue;
                            }
                            if (var11.field3059 == 1339) {
                                if (var11.method1277(true)) {
                                    class277.method1964(var14, var11, var13, var12, 120);
                                    if (class241.field4016) {
                                        class337.method2385(arg0, arg3, arg8, arg6);
                                    } else {
                                        class270.method1891(arg0, arg3, arg8, arg6);
                                    }
                                }
                                continue;
                            }
                            if (var11.field3059 == 1400) {
                                class340.method2408((byte) 103, var14, var11.field2972, var11.field3024, var13);
                                class213.field3524[var12] = true;
                                class117.field2084[var12] = true;
                                if (class241.field4016) {
                                    class337.method2385(arg0, arg3, arg8, arg6);
                                } else {
                                    class270.method1891(arg0, arg3, arg8, arg6);
                                }
                                continue;
                            }
                            if (var11.field3059 == 1401) {
                                class109.method814(var14, var11.field3024, var13, var11.field2972, (byte) 0);
                                class213.field3524[var12] = true;
                                class117.field2084[var12] = true;
                                if (class241.field4016) {
                                    class337.method2385(arg0, arg3, arg8, arg6);
                                } else {
                                    class270.method1891(arg0, arg3, arg8, arg6);
                                }
                                continue;
                            }
                            if (var11.field3059 == 1402) {
                                if (!class241.field4016) {
                                    class66.method524(var14, var13, -1);
                                    class213.field3524[var12] = true;
                                    class117.field2084[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field3059 == 1405) {
                                if (!class36.field786) {
                                    continue;
                                }
                                int var26 = var13 + 15;
                                int var27 = var11.field3024 + var14;
                                class14.field416.method626("Fps:" + class194.field3264, var27, var26, 16776960, -1);
                                Runtime var28 = Runtime.getRuntime();
                                int var140 = var26 + 15;
                                int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                int var30 = 16776960;
                                if (var29 > 65536) {
                                    var30 = 16711680;
                                }
                                class14.field416.method626("Mem:" + var29 + "k", var27, var140, var30, -1);
                                var26 = var140 + 15;
                                if (class241.field4016) {
                                    int var31 = 16776960;
                                    int var32 = (class239.field3978 + class239.field3976 + class239.field3975) / 1024;
                                    if (var32 > 65536) {
                                        var31 = 16711680;
                                    }
                                    class14.field416.method626("Card:" + var32 + "k", var27, var26, var31, -1);
                                    var26 += 15;
                                }
                                int var33 = 0;
                                int var34 = 16776960;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 29; var37++) {
                                    var33 += class191.field3236[var37].method1765(arg9 - 2075541943);
                                    var35 += class191.field3236[var37].method1764(-21571);
                                    var36 += class191.field3236[var37].method1758(arg9 ^ 0xFFFFFFB3);
                                }
                                int var38 = var36 * 100 / var33;
                                int var39 = var35 * 10000 / var33;
                                String var40 = "Cache:" + class148.method1064(2, true, 0, (long) var39, 89) + "% (" + var38 + "%)";
                                class173.field2877.method626(var40, var27, var26, var34, -1);
                                var26 += 12;
                                if (class214.field3530 > 0) {
                                    class173.field2877.method626("Particles: " + class214.field3540 + " / " + class214.field3530, var27, var26, var34, -1);
                                }
                                var26 += 12;
                                class213.field3524[var12] = true;
                                class117.field2084[var12] = true;
                                continue;
                            }
                            if (var11.field3059 == 1406) {
                                class216.field3609 = var11;
                                class317.field5170 = var13;
                                class309.field5045 = var14;
                                continue;
                            }
                        }
                        if (!class5.field87) {
                            if (var11.field3098 == 0 && var11.field2971 && var20 <= class57.field1135 && var22 <= class250.field4111 && class57.field1135 < var23 && var21 > class250.field4111 && !class323.field5230) {
                                class107.field1938[0] = 1004;
                                class73.field1327[0] = class229.field3756;
                                class317.field5173[0] = class137.field2342;
                                class137.field2343 = 1;
                                class300.field4889[0] = "";
                            }
                            if (class57.field1135 >= var20 && var22 <= class250.field4111 && var23 > class57.field1135 && class250.field4111 < var21) {
                                class86.method665(-1, class57.field1135 - var14, -var13 + class250.field4111, var11);
                            }
                        }
                        if (var11.field3098 == 0) {
                            if (!var11.field3058 && client.method1987(var11) && class292.field4731 != var11) {
                                continue;
                            }
                            if (!var11.field3058) {
                                if (var11.field2992 > var11.field3089 - var11.field2972) {
                                    var11.field2992 = var11.field3089 - var11.field2972;
                                }
                                if (var11.field2992 < 0) {
                                    var11.field2992 = 0;
                                }
                            }
                            if (class241.field4016 && var11.field3059 == 1407) {
                                class163.method1175(var14, var13, var11.field3024, var11.field2972);
                            }
                            method1809(var20, var13 - var11.field2992, -var11.field3035 + var14, var22, arg4, var11.field3103, var21, var12, var23, -1);
                            if (var11.field3095 != null) {
                                method1809(var20, var13 - var11.field2992, -var11.field3035 + var14, var22, var11.field3095, var11.field3103, var21, var12, var23, arg9);
                            }
                            class355 var54 = (class355) class34.field758.method2344(arg9 ^ 0x0, (long) var11.field3103);
                            if (var54 != null) {
                                if (var54.field5661 == 0 && !class5.field87 && var20 <= class57.field1135 && var22 <= class250.field4111 && class57.field1135 < var23 && var21 > class250.field4111 && !class323.field5230) {
                                    class317.field5173[0] = class137.field2342;
                                    class300.field4889[0] = "";
                                    class73.field1327[0] = class229.field3756;
                                    class107.field1938[0] = 1004;
                                    class137.field2343 = 1;
                                }
                                class251.method1773(var54.field5657, var21, var20, var12, -28629, var14, var22, var23, var13);
                            }
                            if (class241.field4016 && var11.field3059 == 1407) {
                                class163.method1165();
                                class44.field911 = true;
                            }
                            if (class241.field4016) {
                                class337.method2385(arg0, arg3, arg8, arg6);
                            } else {
                                class270.method1891(arg0, arg3, arg8, arg6);
                                class305.method2226();
                            }
                        }
                        if (class237.field3877[var12] || class346.field5524 > 1) {
                            if (var11.field3098 == 0 && !var11.field3058 && var11.field3089 > var11.field2972) {
                                class295.method2118(var13, var11.field3024 + var14, var11.field3089, var11.field2972, (byte) -128, var11.field2992);
                            }
                            if (var11.field3098 != 1) {
                                if (var11.field3098 == 2) {
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var11.field3057; var56++) {
                                        for (int var57 = 0; var57 < var11.field2981; var57++) {
                                            int var58 = (var11.field3007 + 32) * var57 + var14;
                                            int var59 = (var11.field3034 + 32) * var56 + var13;
                                            if (var55 < 20) {
                                                var58 += var11.field3078[var55];
                                                var59 += var11.field3141[var55];
                                            }
                                            if (var11.field2983[var55] > 0) {
                                                boolean var60 = false;
                                                boolean var61 = false;
                                                int var62 = var11.field2983[var55] - 1;
                                                if ((var58 + 32) > arg0 && arg8 > var58 && arg3 < (var59 + 32) && arg6 > var59 || class240.field3991 == var11 && class55.field1096 == var55) {
                                                    class75 var63;
                                                    if (class222.field3674 == 1 && class303.field4936 == var55 && class15.field452 == var11.field3103) {
                                                        var63 = class143.method977(2, var11.field2999, var11.field2989[var55], -256, (class260) null, 0, var62);
                                                    } else {
                                                        var63 = class143.method977(1, var11.field2999, var11.field2989[var55], arg9 ^ 0xFF, (class260) null, 3153952, var62);
                                                    }
                                                    if (class305.field4966) {
                                                        class213.field3524[var12] = true;
                                                    }
                                                    if (var63 == null) {
                                                        class52.method459(128, var11);
                                                    } else if (class240.field3991 == var11 && class55.field1096 == var55) {
                                                        int var64 = class73.field1339 - class55.field1087;
                                                        int var65 = class26.field662 - class127.field2226;
                                                        if (var64 < 5 && var64 > -5) {
                                                            var64 = 0;
                                                        }
                                                        if (var65 < 5 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        if (class88.field1535 < 5) {
                                                            var64 = 0;
                                                            var65 = 0;
                                                        }
                                                        var63.method565(var58 + var64, var59 + var65, 128);
                                                        if (arg5 != -1) {
                                                            class181 var66 = arg4[arg5 & 0xFFFF];
                                                            int var67;
                                                            int var68;
                                                            if (class241.field4016) {
                                                                var67 = class337.field5349;
                                                                var68 = class337.field5350;
                                                            } else {
                                                                var68 = class270.field4407;
                                                                var67 = class270.field4399;
                                                            }
                                                            if (var68 > (var59 + var65) && var66.field2992 > 0) {
                                                                int var69 = (var68 - var59 - var65) * class197.field3303 / 3;
                                                                if (class197.field3303 * 10 < var69) {
                                                                    var69 = class197.field3303 * 10;
                                                                }
                                                                if (var66.field2992 < var69) {
                                                                    var69 = var66.field2992;
                                                                }
                                                                class127.field2226 += var69;
                                                                var66.field2992 -= var69;
                                                                class52.method459(128, var66);
                                                            }
                                                            if (var59 + var65 + 32 > var67 && var66.field2992 < var66.field3089 - var66.field2972) {
                                                                int var70 = (var59 + var65 + 32 - var67) * class197.field3303 / 3;
                                                                if (var70 > (class197.field3303 * 10)) {
                                                                    var70 = class197.field3303 * 10;
                                                                }
                                                                if (var70 > (var66.field3089 - var66.field2972 - var66.field2992)) {
                                                                    var70 = var66.field3089 - var66.field2972 - var66.field2992;
                                                                }
                                                                class127.field2226 -= var70;
                                                                var66.field2992 += var70;
                                                                class52.method459(128, var66);
                                                            }
                                                        }
                                                    } else if (class299.field4852 == var11 && class282.field4620 == var55) {
                                                        var63.method565(var58, var59, 128);
                                                    } else {
                                                        var63.method568(var58, var59);
                                                    }
                                                }
                                            } else if (var11.field3097 != null && var55 < 20) {
                                                class75 var71 = var11.method1271(arg9 + 1, var55);
                                                if (var71 != null) {
                                                    var71.method568(var58, var59);
                                                } else if (class341.field5406) {
                                                    class52.method459(128, var11);
                                                }
                                            }
                                            var55++;
                                        }
                                    }
                                } else if (var11.field3098 == 3) {
                                    int var139;
                                    if (class13.method133(false, var11)) {
                                        var139 = var11.field2969;
                                        if (class292.field4731 == var11 && var11.field2982 != 0) {
                                            var139 = var11.field2982;
                                        }
                                    } else {
                                        var139 = var11.field3063;
                                        if (class292.field4731 == var11 && var11.field3033 != 0) {
                                            var139 = var11.field3033;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3111) {
                                            if (class241.field4016) {
                                                class337.method2378(var14, var13, var11.field3024, var11.field2972, var139);
                                            } else {
                                                class270.method1894(var14, var13, var11.field3024, var11.field2972, var139);
                                            }
                                        } else if (class241.field4016) {
                                            class337.method2387(var14, var13, var11.field3024, var11.field2972, var139);
                                        } else {
                                            class270.method1904(var14, var13, var11.field3024, var11.field2972, var139);
                                        }
                                    } else if (var11.field3111) {
                                        if (class241.field4016) {
                                            class337.method2380(var14, var13, var11.field3024, var11.field2972, var139, 256 - (var15 & 0xFF));
                                        } else {
                                            class270.method1890(var14, var13, var11.field3024, var11.field2972, var139, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class241.field4016) {
                                        class337.method2377(var14, var13, var11.field3024, var11.field2972, var139, 256 - (var15 & 0xFF));
                                    } else {
                                        class270.method1901(var14, var13, var11.field3024, var11.field2972, var139, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field3098 == 4) {
                                    class84 var72 = var11.method1269(-1, class144.field2424);
                                    if (var72 != null) {
                                        String var73 = var11.field3001;
                                        int var74;
                                        if (class13.method133(false, var11)) {
                                            var74 = var11.field2969;
                                            if (class292.field4731 == var11 && var11.field2982 != 0) {
                                                var74 = var11.field2982;
                                            }
                                            if (var11.field3029.length() > 0) {
                                                var73 = var11.field3029;
                                            }
                                        } else {
                                            var74 = var11.field3063;
                                            if (class292.field4731 == var11 && var11.field3033 != 0) {
                                                var74 = var11.field3033;
                                            }
                                        }
                                        if (var11.field3058 && var11.field3084 != -1) {
                                            class11 var75 = class296.method2124(arg9 + 1, var11.field3084);
                                            var73 = var75.field318;
                                            if (var73 == null) {
                                                var73 = "null";
                                            }
                                            if ((var75.field338 == 1 || var11.field3091 != 1) && var11.field3091 != -1) {
                                                var73 = "<col=ff9040>" + var73 + "</col> x" + class90.method693((byte) 127, var11.field3091);
                                            }
                                        }
                                        if (class140.field2371 == var11) {
                                            var73 = class52.field1053;
                                            var74 = var11.field3063;
                                        }
                                        if (!var11.field3058) {
                                            var73 = class149.method1070(var73, var11, -24642);
                                        }
                                        var72.method634(var73, var14, var13, var11.field3024, var11.field2972, var74, var11.field2980 ? 0 : -1, var11.field3107, var11.field3056, var11.field2966);
                                    } else if (class341.field5406) {
                                        class52.method459(128, var11);
                                    }
                                } else if (var11.field3098 == 5) {
                                    if (!var11.field3058) {
                                        class75 var92 = var11.method1266(arg9 + 113, class13.method133(false, var11));
                                        if (var92 != null) {
                                            var92.method568(var14, var13);
                                        } else if (class341.field5406) {
                                            class52.method459(128, var11);
                                        }
                                    } else if (var11.field3083 >= 0) {
                                        class17 var76 = var11.method1273(-124);
                                        if (class241.field4016) {
                                            var76.method170(0, var14, var13, var11.field3024, var11.field2972, var11.field3049, var11.field2976, 0);
                                        } else {
                                            var76.method169(0, var14, var13, var11.field3024, var11.field2972, var11.field3049, var11.field2976, 0);
                                        }
                                    } else {
                                        class75 var77;
                                        if (var11.field3084 == -1) {
                                            var77 = var11.method1266(arg9 ^ 0xFFFFFFC5, false);
                                        } else if (var11.field3076 && class96.field1750.field1775 != null) {
                                            var77 = class143.method977(var11.field3088, var11.field2999, var11.field3091, -256, class96.field1750.field1775, var11.field3132, var11.field3084);
                                        } else {
                                            var77 = class143.method977(var11.field3088, var11.field2999, var11.field3091, -256, (class260) null, var11.field3132, var11.field3084);
                                        }
                                        if (var77 != null) {
                                            int var78 = var77.field1359;
                                            int var79 = var77.field1355;
                                            if (var11.field3030) {
                                                int var80 = (var79 + var11.field2972 - 1) / var79;
                                                int var81 = (var78 - (1 - var11.field3024)) / var78;
                                                if (class241.field4016) {
                                                    class337.method2370(var14, var13, var11.field3024 + var14, var11.field2972 + var13);
                                                    boolean var82 = class172.method1221(var77.field1353, 0);
                                                    boolean var83 = class172.method1221(var77.field1356, 0);
                                                    class265 var84 = (class265) var77;
                                                    if (var82 && var83) {
                                                        if (var15 == 0) {
                                                            var84.method1857(var14, var13, var81, var80);
                                                        } else {
                                                            var84.method1861(var14, var13, 256 - (var15 & 0xFF), var81, var80);
                                                        }
                                                    } else if (var82) {
                                                        for (int var88 = 0; var88 < var80; var88++) {
                                                            if (var15 == 0) {
                                                                var84.method1857(var14, var79 * var88 + var13, var81, 1);
                                                            } else {
                                                                var84.method1861(var14, var79 * var88 + var13, 256 - (var15 & 0xFF), var81, 1);
                                                            }
                                                        }
                                                    } else if (var83) {
                                                        for (int var87 = 0; var87 < var81; var87++) {
                                                            if (var15 == 0) {
                                                                var84.method1857(var78 * var87 + var14, var13, 1, var80);
                                                            } else {
                                                                var84.method1861(var14 + (var78 * var87), var13, 256 - (var15 & 0xFF), 1, var80);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var85 = 0; var85 < var81; var85++) {
                                                            for (int var86 = 0; var86 < var80; var86++) {
                                                                if (var15 == 0) {
                                                                    var77.method568(var78 * var85 + var14, var79 * var86 + var13);
                                                                } else {
                                                                    var77.method565(var14 + (var78 * var85), var13 - -(var79 * var86), 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class337.method2385(arg0, arg3, arg8, arg6);
                                                } else {
                                                    class270.method1902(var14, var13, var11.field3024 + var14, var11.field2972 + var13);
                                                    for (int var89 = 0; var89 < var81; var89++) {
                                                        for (int var90 = 0; var90 < var80; var90++) {
                                                            if (var11.field2968 != 0) {
                                                                var77.method579(4096, var78 * var89 + (var78 / 2) + var14, var79 / 2 + var79 * var90 + var13, var11.field2968, (byte) 8);
                                                            } else if (var15 == 0) {
                                                                var77.method568(var14 + (var78 * var89), var79 * var90 + var13);
                                                            } else {
                                                                var77.method565(var14 + (var78 * var89), var79 * var90 + var13, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class270.method1891(arg0, arg3, arg8, arg6);
                                                }
                                            } else {
                                                int var91 = var11.field3024 * 4096 / var78;
                                                if (var11.field2968 != 0) {
                                                    var77.method579(var91, var11.field3024 / 2 + var14, var11.field2972 / 2 + var13, var11.field2968, (byte) 8);
                                                } else if (var15 != 0) {
                                                    var77.method566(var14, var13, var11.field3024, var11.field2972, 256 - (var15 & 0xFF));
                                                } else if (var11.field3024 == var78 && var11.field2972 == var79) {
                                                    var77.method568(var14, var13);
                                                } else {
                                                    var77.method569(var14, var13, var11.field3024, var11.field2972);
                                                }
                                            }
                                        } else if (class341.field5406) {
                                            class52.method459(arg9 + 129, var11);
                                        }
                                    }
                                } else if (var11.field3098 == 6) {
                                    boolean var120 = class13.method133(false, var11);
                                    int var121;
                                    if (var120) {
                                        var121 = var11.field3052;
                                    } else {
                                        var121 = var11.field3092;
                                    }
                                    class42 var122 = null;
                                    int var123 = 0;
                                    if (var11.field3084 != -1) {
                                        class11 var128 = class296.method2124(0, var11.field3084);
                                        if (var128 != null) {
                                            class11 var129 = var128.method113(var11.field3091, 116);
                                            class300 var130 = var121 == -1 ? null : method1807(var121, arg9 ^ 0xFFFFFF94);
                                            if (var11.field3076 && class96.field1750.field1775 != null) {
                                                var122 = var129.method109(var11.field3102, var11.field3100, class96.field1750.field1775, 1, var130, var11.field3010, (byte) 4);
                                            } else {
                                                var122 = var129.method109(var11.field3102, var11.field3100, (class260) null, 1, var130, var11.field3010, (byte) 4);
                                            }
                                            if (var122 == null) {
                                                class52.method459(128, var11);
                                            } else {
                                                var123 = -var122.method340() / 2;
                                            }
                                        }
                                    } else if (var11.field3118 == 5) {
                                        if (var11.field3002 == -1) {
                                            var122 = class235.field3850.method1835(0, false, -1, (byte) -103, (class242[]) null, (class300) null, (class300) null, true, -1, 0, -1, -1);
                                        } else {
                                            int var124 = var11.field3002;
                                            class98 var125;
                                            if (class96.field1752 == var124) {
                                                var125 = class96.field1750;
                                            } else {
                                                var125 = class182.field3151[var124];
                                            }
                                            class300 var126 = var121 == -1 ? null : method1807(var121, arg9 + 84);
                                            if (var125 != null && (var124 == 2047 || class278.method1970(var125.field1779, false) == var11.field2996)) {
                                                var122 = var125.field1775.method1835(0, false, -1, (byte) -40, (class242[]) null, (class300) null, var126, true, 0, 0, -1, var11.field3100);
                                            }
                                        }
                                    } else if (var121 == -1) {
                                        var122 = var11.method1274(-127, -1, (class300) null, class96.field1750.field1775, var120, -1, 0);
                                        if (var122 == null && class341.field5406) {
                                            class52.method459(128, var11);
                                        }
                                    } else {
                                        class300 var127 = method1807(var121, 69);
                                        var122 = var11.method1274(-109, var11.field3010, var127, class96.field1750.field1775, var120, var11.field3100, var11.field3102);
                                        if (var122 == null && class341.field5406) {
                                            class52.method459(arg9 + 129, var11);
                                        }
                                    }
                                    if (var122 != null) {
                                        int var131;
                                        if (var11.field3113 > 0) {
                                            var131 = (var11.field3024 << 8) / var11.field3113;
                                        } else {
                                            var131 = 256;
                                        }
                                        int var132;
                                        if (var11.field3061 > 0) {
                                            var132 = (var11.field2972 << 8) / var11.field3061;
                                        } else {
                                            var132 = 256;
                                        }
                                        int var133 = (var11.field3131 * var132 >> 8) + var11.field2972 / 2 + var13;
                                        int var134 = (var11.field3014 * var131 >> 8) + var11.field3024 / 2 + var14;
                                        if (class241.field4016) {
                                            if (var11.field3046) {
                                                class241.method1714(var134, var133, var11.field3114, var11.field3090, var131, var132);
                                            } else {
                                                class241.method1717(var134, var133, var131, var132);
                                                class241.method1698((float) var11.field2993, (float) var11.field3090 * 1.5F);
                                            }
                                            class241.method1695();
                                            class241.method1705(true);
                                            class241.method1696(false);
                                            class212.method1466(class152.field2601, (byte) -3);
                                            if (class44.field911) {
                                                class337.method2374();
                                                class241.method1721();
                                                class337.method2385(arg0, arg3, arg8, arg6);
                                                class44.field911 = false;
                                            }
                                            if (var11.field3064) {
                                                class241.method1689();
                                            }
                                            int var135 = class305.field4957[var11.field3000] * var11.field3114 >> 16;
                                            int var136 = class305.field4959[var11.field3000] * var11.field3114 >> 16;
                                            if (var11.field3058) {
                                                var122.method326(0, var11.field3130, var11.field3055, var11.field3000, var11.field3012, var136 + var123 + var11.field3139, var11.field3139 + var135, -1L);
                                            } else {
                                                var122.method326(0, var11.field3130, 0, var11.field3000, 0, var136, var135, -1L);
                                            }
                                            if (var11.field3064) {
                                                class241.method1700();
                                            }
                                        } else {
                                            class305.method2217(var134, var133);
                                            int var137 = class305.field4959[var11.field3000] * var11.field3114 >> 16;
                                            int var138 = class305.field4957[var11.field3000] * var11.field3114 >> 16;
                                            if (!var11.field3058) {
                                                var122.method326(0, var11.field3130, 0, var11.field3000, 0, var137, var138, -1L);
                                            } else if (var11.field3046) {
                                                ((class95) var122).method722(0, var11.field3130, var11.field3055, var11.field3000, var11.field3012, var137 + var123 + var11.field3139, var11.field3139 + var138, var11.field3114);
                                            } else {
                                                var122.method326(0, var11.field3130, var11.field3055, var11.field3000, var11.field3012, var11.field3139 + var137 + var123, var138 - -var11.field3139, -1L);
                                            }
                                            class305.method2228();
                                        }
                                    }
                                } else {
                                    if (var11.field3098 == 7) {
                                        class84 var93 = var11.method1269(-1, class144.field2424);
                                        if (var93 == null) {
                                            if (class341.field5406) {
                                                class52.method459(128, var11);
                                            }
                                            continue;
                                        }
                                        int var94 = 0;
                                        for (int var95 = 0; var95 < var11.field3057; var95++) {
                                            for (int var96 = 0; var96 < var11.field2981; var96++) {
                                                if (var11.field2983[var94] > 0) {
                                                    class11 var97 = class296.method2124(0, var11.field2983[var94] - 1);
                                                    String var98;
                                                    if (var97.field338 != 1 && var11.field2989[var94] == 1) {
                                                        var98 = "<col=ff9040>" + var97.field318 + "</col>";
                                                    } else {
                                                        var98 = "<col=ff9040>" + var97.field318 + "</col> x" + class90.method693((byte) -61, var11.field2989[var94]);
                                                    }
                                                    int var99 = (var11.field3034 + 12) * var95 + var13;
                                                    int var100 = (var11.field3007 + 115) * var96 + var14;
                                                    if (var11.field3107 == 0) {
                                                        var93.method619(var98, var100, var99, var11.field3063, var11.field2980 ? 0 : -1);
                                                    } else if (var11.field3107 == 1) {
                                                        var93.method629(var98, var100 + 57, var99, var11.field3063, var11.field2980 ? 0 : -1);
                                                    } else {
                                                        var93.method626(var98, var100 + 115 - 1, var99, var11.field3063, var11.field2980 ? 0 : -1);
                                                    }
                                                }
                                                var94++;
                                            }
                                        }
                                    }
                                    if (var11.field3098 == 8 && class171.field2831 == var11 && class99.field1822 == class68.field1263) {
                                        int var101 = 0;
                                        class84 var102 = class14.field416;
                                        int var103 = 0;
                                        String var104 = var11.field3001;
                                        String var105 = class149.method1070(var104, var11, -24642);
                                        while (var105.length() > 0) {
                                            int var106 = var105.indexOf("<br>");
                                            String var107;
                                            if (var106 == -1) {
                                                var107 = var105;
                                                var105 = "";
                                            } else {
                                                var107 = var105.substring(0, var106);
                                                var105 = var105.substring(var106 + 4);
                                            }
                                            int var108 = var102.method636(var107);
                                            var103 += var102.field1450 + 1;
                                            if (var101 < var108) {
                                                var101 = var108;
                                            }
                                        }
                                        var103 += 7;
                                        var101 += 6;
                                        int var109 = var11.field3024 + var14 - var101 - 5;
                                        if (var109 < (var14 + 5)) {
                                            var109 = var14 + 5;
                                        }
                                        if (arg8 < var101 + var109) {
                                            var109 = arg8 - var101;
                                        }
                                        int var110 = var13 + var11.field2972 + 5;
                                        if ((var110 + var103) > arg6) {
                                            var110 = arg6 - var103;
                                        }
                                        if (class241.field4016) {
                                            class337.method2378(var109, var110, var101, var103, 16777120);
                                            class337.method2387(var109, var110, var101, var103, 0);
                                        } else {
                                            class270.method1894(var109, var110, var101, var103, 16777120);
                                            class270.method1904(var109, var110, var101, var103, 0);
                                        }
                                        String var111 = var11.field3001;
                                        int var112 = var110 + var102.field1450 + 2;
                                        String var113 = class149.method1070(var111, var11, arg9 - 24641);
                                        while (var113.length() > 0) {
                                            int var114 = var113.indexOf("<br>");
                                            String var115;
                                            if (var114 == -1) {
                                                var115 = var113;
                                                var113 = "";
                                            } else {
                                                var115 = var113.substring(0, var114);
                                                var113 = var113.substring(var114 + 4);
                                            }
                                            var102.method619(var115, var109 + 3, var112, 0, -1);
                                            var112 += var102.field1450 + 1;
                                        }
                                    }
                                    if (var11.field3098 == 9) {
                                        int var116;
                                        int var117;
                                        int var118;
                                        int var119;
                                        if (var11.field3123) {
                                            var116 = var13;
                                            var117 = var11.field2972 + var13;
                                            var118 = var11.field3024 + var14;
                                            var119 = var14;
                                        } else {
                                            var117 = var13;
                                            var116 = var11.field2972 + var13;
                                            var119 = var14;
                                            var118 = var11.field3024 + var14;
                                        }
                                        if (var11.field3129 == 1) {
                                            if (class241.field4016) {
                                                class337.method2376(var119, var117, var118, var116, var11.field3063);
                                            } else {
                                                class270.method1909(var119, var117, var118, var116, var11.field3063);
                                            }
                                        } else if (class241.field4016) {
                                            class337.method2368(var119, var117, var118, var116, var11.field3063, var11.field3129);
                                        } else {
                                            class270.method1889(var119, var117, var118, var116, var11.field3063, var11.field3129);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg9 == -1) {
            ;
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)V", line = 1843)
    private final void method1810(int arg0) throws IOException {
        field4212++;
        this.field4210 = arg0;
        if (this.field4228 != this.field4217) {
            this.field4229.method1385(0, this.field4217);
            this.field4228 = this.field4217;
        }
        this.field4223 = this.field4217;
        while (this.field4230.length > this.field4210) {
            int var2 = this.field4230.length - this.field4210;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4229.method1389(this.field4210, arg0 - 21270, this.field4230, var2);
            if (var3 == -1) {
                break;
            }
            this.field4228 += (long) var3;
            this.field4210 += var3;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[B)V", line = 1885)
    public final void method1811(int arg0, byte[] arg1) throws IOException {
        field4220++;
        this.method1804(13875, arg1, 0, arg1.length);
        if (arg0 != 200000000) {
            this.field4222 = -118L;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BB)V", line = 1897)
    public static final void method1812(byte arg0, byte arg1) {
        if (class306.field4975 == null) {
            class306.field4975 = new byte[4][104][104];
        }
        field4221++;
        int var2 = 0;
        if (arg1 != -50) {
            return;
        }
        while (var2 < 4) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class306.field4975[var2][var3][var4] = arg0;
                }
            }
            var2++;
        }
    }
}
