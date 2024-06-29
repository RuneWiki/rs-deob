import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class124 {

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "J")
    private long field2151 = -1L;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "J")
    private long field2156 = -1L;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    private int field2168 = 0;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "Ljj;")
    private class104 field2161;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "J")
    private long field2163;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "J")
    private long field2150;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "J")
    private long field2144;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "[B")
    private byte[] field2152;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "[B")
    private byte[] field2147;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "[I")
    public static int[] field2146 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field2158 = 0;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "Lqk;")
    private static class207 field2154 = class24.method212(255, "K");

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "Lqk;")
    public static class207 field2162 = field2154;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Lqk;")
    public static class207 field2140 = field2154;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "Lqk;")
    public static class207 field2169 = class24.method212(255, "1");

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    private int field2160;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "J")
    private long field2153;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "[Luh;")
    public static class100[] field2170;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIILvg;)V")
    public static final void method867(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        field2142++;
        if (class268.field4751 >= 400) {
            return;
        }
        if (arg4.field1293 != null) {
            arg4 = arg4.method517(-110);
        }
        if (arg4 == null || !arg4.field1301) {
            return;
        }
        class207 var5 = arg4.field1321;
        if (~arg4.field1314 != arg2) {
            class207 var6 = class171.field3035 == 1 ? class171.field3030 : class20.field331;
            var5 = class105.method757(false, new class207[] { var5, class75.method541(class202.field3565.field224, arg4.field1314, -9), class150.field2633, var6, class262.method1815(arg4.field1314, (byte) 123), class270.field4776 });
        }
        if (class34.field680 == 1) {
            class136.field2344++;
            class156.method1143((short) 11, arg1, (long) arg0, class60.field1093, arg3, -28775, class156.field2744, class105.method757(false, new class207[] { class235.field4336, class186.field3293, var5 }));
        } else if (class4.field71) {
            class119 var14 = class269.field4757 == -1 ? null : class276.method1880(class269.field4757, (byte) -47);
            if ((class60.field1096 & 0x2) != 0 && var14 == null || arg4.method516(class269.field4757, false, var14.field2061) != var14.field2061) {
                class156.method1143((short) 34, arg1, (long) arg0, class127.field2218, arg3, -28775, class49.field969, class105.method757(false, new class207[] { class243.field4422, class186.field3293, var5 }));
                class214.field3813++;
            }
        } else {
            class160.field2835++;
            class207[] var7 = arg4.field1295;
            if (class32.field654) {
                var7 = class221.method1576(-38, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class171.field3035 != 0 || !var7[var8].method1462(class275.field4829, true))) {
                        class15.field245++;
                        byte var9 = 0;
                        int var10 = -1;
                        if (var8 == 0) {
                            var9 = 57;
                        }
                        if (arg4.field1277 == var8) {
                            var10 = arg4.field1319;
                        }
                        if (var8 == 1) {
                            var9 = 6;
                        }
                        if (arg4.field1286 == var8) {
                            var10 = arg4.field1278;
                        }
                        if (var8 == 2) {
                            var9 = 43;
                        }
                        if (var8 == 3) {
                            var9 = 40;
                        }
                        if (var8 == 4) {
                            var9 = 13;
                        }
                        class156.method1143(var9, arg1, (long) arg0, var10, arg3, -28775, var7[var8], class105.method757(false, new class207[] { class196.field3446, var5 }));
                    }
                }
            }
            if (class171.field3035 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].method1462(class275.field4829, true)) {
                        class44.field859++;
                        short var12 = 0;
                        short var13 = 0;
                        if (arg4.field1314 > class202.field3565.field224) {
                            var12 = 2000;
                        }
                        if (var11 == 0) {
                            var13 = 57;
                        }
                        if (var11 == 1) {
                            var13 = 6;
                        }
                        if (var11 == 2) {
                            var13 = 43;
                        }
                        if (var11 == 3) {
                            var13 = 40;
                        }
                        if (var11 == 4) {
                            var13 = 13;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class156.method1143(var13, arg1, (long) arg0, arg4.field1276, arg3, -28775, var7[var11], class105.method757(false, new class207[] { class196.field3446, var5 }));
                    }
                }
            }
            class156.method1143((short) 1001, arg1, (long) arg0, class186.field3290, arg3, -28775, class209.field3701, class105.method757(false, new class207[] { class196.field3446, var5 }));
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIZ)V")
    public static final void method868(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class215.method1544(arg2 - arg3, arg2 + arg3, class15.field238[arg0], arg1, -92);
        int var5 = arg3;
        int var6 = -arg3;
        int var7 = -1;
        if (arg4) {
            method870(17);
        }
        int var8 = 0;
        while (var8 < var5) {
            var8++;
            var7 += 2;
            var6 += var7;
            if (var6 >= 0) {
                var5--;
                var6 -= var5 << 1;
                int[] var9 = class15.field238[arg0 + var5];
                int[] var10 = class15.field238[arg0 - var5];
                int var11 = arg2 - var8;
                int var12 = arg2 + var8;
                class215.method1544(var11, var12, var9, arg1, 89);
                class215.method1544(var11, var12, var10, arg1, 80);
            }
            int var13 = arg2 + var5;
            int var14 = arg2 - var5;
            int[] var15 = class15.field238[arg0 + var8];
            int[] var16 = class15.field238[arg0 - var8];
            class215.method1544(var14, var13, var15, arg1, 111);
            class215.method1544(var14, var13, var16, arg1, 117);
        }
        field2148++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)Ljava/io/File;")
    private final File method869(boolean arg0) {
        field2149++;
        if (arg0) {
            method872(-13);
        }
        return this.field2161.method749(0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static void method870(int arg0) {
        field2154 = null;
        field2162 = null;
        field2146 = null;
        field2140 = null;
        if (arg0 < -76) {
            field2169 = null;
            field2170 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I[B)V")
    public final void method871(int arg0, byte[] arg1) throws IOException {
        field2143++;
        this.method873(arg0, -1, arg1, arg1.length);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
    public static final void method872(int arg0) {
        if (class34.field677 != null) {
            class34.field677.method442(43);
        }
        if (class200.field3532 != null) {
            class200.field3532.method442(60);
        }
        class177.method1262(false, 2, 22050, class190.field3348);
        class34.field677 = class30.method238(104, 22050, arg0, class20.field326, class112.field1949);
        class34.field677.method452(2000, class189.field3337);
        class200.field3532 = class30.method238(122, 2048, 1, class20.field326, class112.field1949);
        class200.field3532.method452(2000, class65.field1177);
        field2167++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II[BI)V")
    public final void method873(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2155++;
        try {
            if (arg2.length < (arg0 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg2.length);
            }
            if (this.field2156 != -1L && this.field2156 <= this.field2144 && (this.field2144 + ((long) arg3)) <= ((long) this.field2168 + this.field2156)) {
                class274.method1857(this.field2147, (int) (this.field2144 - this.field2156), arg2, arg0, arg3);
                this.field2144 += (long) arg3;
                return;
            }
            long var5 = this.field2144;
            int var7 = arg3;
            int var8 = arg0;
            if (this.field2144 >= this.field2151 && this.field2144 < ((long) this.field2160 + this.field2151)) {
                int var9 = (int) ((long) this.field2160 + this.field2151 - this.field2144);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                class274.method1857(this.field2152, (int) (this.field2144 - this.field2151), arg2, arg0, var9);
                arg3 -= var9;
                this.field2144 += (long) var9;
                arg0 += var9;
            }
            if (this.field2152.length < arg3) {
                this.field2161.method748((byte) -83, this.field2144);
                this.field2153 = this.field2144;
                while (arg3 > 0) {
                    int var11 = this.field2161.method750(arg3, (byte) 36, arg0, arg2);
                    if (var11 == -1) {
                        break;
                    }
                    this.field2144 += (long) var11;
                    arg3 -= var11;
                    arg0 += var11;
                    this.field2153 += (long) var11;
                }
            } else if (arg3 > 0) {
                this.method880(0);
                int var10 = arg3;
                if (arg3 > this.field2160) {
                    var10 = this.field2160;
                }
                class274.method1857(this.field2152, 0, arg2, arg0, var10);
                arg0 += var10;
                this.field2144 += (long) var10;
                arg3 -= var10;
            }
            if ((long) arg1 != this.field2156) {
                if (this.field2144 < this.field2156 && arg3 > 0) {
                    int var12 = (int) (this.field2156 - this.field2144) + arg0;
                    if (var12 > arg0 + arg3) {
                        var12 = arg0 + arg3;
                    }
                    while (arg0 < var12) {
                        arg3--;
                        arg2[arg0++] = 0;
                        this.field2144++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field2156 && this.field2156 < (long) var7 + var5) {
                    var13 = this.field2156;
                } else if (var5 >= this.field2156 && (long) this.field2168 + this.field2156 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < ((long) this.field2168 + this.field2156) && (long) var7 + var5 >= (long) this.field2168 + this.field2156) {
                    var15 = (long) this.field2168 + this.field2156;
                } else if (((long) var7 + var5) > this.field2156 && (long) this.field2168 + this.field2156 >= (long) var7 + var5) {
                    var15 = var5 + ((long) var7);
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class274.method1857(this.field2147, (int) (var13 - this.field2156), arg2, (int) (var13 - var5) + var8, var17);
                    if (this.field2144 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field2144));
                        this.field2144 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2153 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)J")
    public final long method874(boolean arg0) {
        if (arg0) {
            return 4L;
        } else {
            field2145++;
            return this.field2150;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III[B)V")
    public final void method875(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2139++;
        try {
            if (this.field2150 < ((long) arg0 + this.field2144)) {
                this.field2150 = this.field2144 + ((long) arg0);
            }
            if (this.field2156 != -1L && (this.field2144 < this.field2156 || ((long) this.field2168 + this.field2156) < this.field2144)) {
                this.method877(78);
            }
            if ((long) arg1 != this.field2156 && (long) arg0 + this.field2144 > (long) this.field2147.length + this.field2156) {
                int var5 = (int) (this.field2156 + (long) this.field2147.length - this.field2144);
                arg0 -= var5;
                class274.method1857(arg3, arg2, this.field2147, (int) (this.field2144 - this.field2156), var5);
                this.field2144 += (long) var5;
                this.field2168 = this.field2147.length;
                arg2 += var5;
                this.method877(arg1 + 64);
            }
            if (this.field2147.length < arg0) {
                if (this.field2153 != this.field2144) {
                    this.field2161.method748((byte) 56, this.field2144);
                    this.field2153 = this.field2144;
                }
                this.field2161.method753((byte) 98, arg2, arg3, arg0);
                long var6 = -1L;
                if (this.field2144 >= this.field2151 && ((long) this.field2160 + this.field2151) > this.field2144) {
                    var6 = this.field2144;
                } else if (this.field2151 >= this.field2144 && this.field2151 < (this.field2144 + ((long) arg0))) {
                    var6 = this.field2151;
                }
                long var8 = -1L;
                this.field2153 += (long) arg0;
                if (this.field2153 > this.field2163) {
                    this.field2163 = this.field2153;
                }
                if (this.field2151 < (this.field2144 + ((long) arg0)) && ((long) arg0 + this.field2144) <= ((long) this.field2160 + this.field2151)) {
                    var8 = (long) arg0 + this.field2144;
                } else if (this.field2144 < ((long) this.field2160 + this.field2151) && ((long) arg0 + this.field2144) >= ((long) this.field2160 + this.field2151)) {
                    var8 = (long) this.field2160 + this.field2151;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class274.method1857(arg3, (int) ((long) arg2 + var6 - this.field2144), this.field2152, (int) (var6 - this.field2151), var10);
                }
                this.field2144 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field2156 == -1L) {
                    this.field2156 = this.field2144;
                }
                class274.method1857(arg3, arg2, this.field2147, (int) (this.field2144 - this.field2156), arg0);
                this.field2144 += (long) arg0;
                if ((this.field2144 - this.field2156) > ((long) this.field2168)) {
                    this.field2168 = (int) (this.field2144 - this.field2156);
                }
            }
        } catch (IOException var12) {
            this.field2153 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
    public static final void method876(int arg0) {
        class125.field2178 = new class132();
        int var1 = 81 % ((arg0 - 19) / 50);
        field2159++;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
    private final void method877(int arg0) throws IOException {
        int var2 = -5 % ((arg0 + 16) / 62);
        field2141++;
        if (this.field2156 == -1L) {
            return;
        }
        if (this.field2156 != this.field2153) {
            this.field2161.method748((byte) -110, this.field2156);
            this.field2153 = this.field2156;
        }
        this.field2161.method753((byte) 98, 0, this.field2147, this.field2168);
        this.field2153 += (long) this.field2168;
        long var3 = -1L;
        long var5 = -1L;
        if (this.field2151 <= this.field2156 && this.field2156 < (this.field2151 + ((long) this.field2160))) {
            var5 = this.field2156;
        } else if (this.field2156 <= this.field2151 && (long) this.field2168 + this.field2156 > this.field2151) {
            var5 = this.field2151;
        }
        if (this.field2151 < ((long) this.field2168 + this.field2156) && ((long) this.field2160 + this.field2151) >= ((long) this.field2168 + this.field2156)) {
            var3 = this.field2156 + ((long) this.field2168);
        } else if ((long) this.field2160 + this.field2151 > this.field2156 && (long) this.field2168 + this.field2156 >= (long) this.field2160 + this.field2151) {
            var3 = (long) this.field2160 + this.field2151;
        }
        if (this.field2153 > this.field2163) {
            this.field2163 = this.field2153;
        }
        if (var5 > -1L && var3 > var5) {
            int var7 = (int) (var3 - var5);
            class274.method1857(this.field2147, (int) (var5 - this.field2156), this.field2152, (int) (var5 - this.field2151), var7);
        }
        this.field2168 = 0;
        this.field2156 = -1L;
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V")
    public final void method878(int arg0) throws IOException {
        this.method877(-127);
        if (arg0 >= -25) {
            this.method874(true);
        }
        field2157++;
        this.field2161.method751((byte) 36);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IJ)V")
    public final void method879(int arg0, long arg1) throws IOException {
        field2165++;
        if (arg1 < (long) arg0) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method869(false));
        }
        this.field2144 = arg1;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Ljj;II)V")
    public class124(class104 arg0, int arg1, int arg2) throws IOException {
        this.field2161 = arg0;
        this.field2150 = this.field2163 = arg0.method752((byte) 107);
        this.field2144 = 0L;
        this.field2152 = new byte[arg1];
        this.field2147 = new byte[arg2];
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V")
    private final void method880(int arg0) throws IOException {
        field2166++;
        this.field2160 = arg0;
        if (this.field2153 != this.field2144) {
            this.field2161.method748((byte) -88, this.field2144);
            this.field2153 = this.field2144;
        }
        this.field2151 = this.field2144;
        while (this.field2152.length > this.field2160) {
            int var2 = this.field2152.length - this.field2160;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2161.method750(var2, (byte) 36, this.field2160, this.field2152);
            if (var3 == -1) {
                break;
            }
            this.field2160 += var3;
            this.field2153 += (long) var3;
        }
    }
}
