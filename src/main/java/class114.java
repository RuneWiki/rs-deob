import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class114 {

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    private int field2309 = 32;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "J")
    private long field2319 = class201.method1313(29);

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "Z")
    private boolean field2334 = true;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    private int field2341 = 0;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    private int field2343 = 0;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "J")
    private long field2339 = 0L;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
    private int field2345 = 0;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "[Lch;")
    private class29[] field2344 = new class29[8];

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    private int field2338 = 0;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "J")
    private long field2342 = 0L;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "[Lch;")
    private class29[] field2346 = new class29[8];

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "[I")
    public static int[] field2308 = new int[128];

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Leh;")
    private static class47 field2316 = class195.method1282((byte) -4, "FULL");

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "[[S")
    public static short[][] field2311 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "[Z")
    public static boolean[] field2329 = new boolean[8];

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "Leh;")
    public static class47 field2328 = field2316;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "[S")
    public static short[] field2320 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    private int field2335;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public int field2336;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    public int field2337;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lch;")
    private class29 field2310;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "[I")
    public int[] field2331;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public final synchronized void method893(int arg0) {
        this.field2334 = true;
        field2314++;
        try {
            this.method500();
            if (arg0 > -78) {
                this.field2336 = -125;
            }
        } catch (Exception var2) {
            this.method496();
            this.field2339 = class201.method1313(29) + 2000L;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public static void method894(boolean arg0) {
        field2320 = null;
        field2316 = null;
        field2328 = null;
        field2308 = null;
        if (arg0) {
            field2308 = null;
        }
        field2311 = null;
        field2329 = null;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public void method497(int arg0) throws Exception {
        field2315++;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)V")
    public final synchronized void method895(boolean arg0) {
        if (class12.field248 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class12.field248.field480[var3] == this) {
                    class12.field248.field480[var3] = null;
                }
                if (class12.field248.field480[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class12.field248.field481 = true;
                while (class12.field248.field476) {
                    class76.method666(50L, 1);
                }
                class12.field248 = null;
            }
        }
        if (arg0) {
            this.method496();
            field2332++;
            this.field2331 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZILeh;Lah;Leh;I)V")
    public static final void method896(boolean arg0, int arg1, class47 arg2, class9 arg3, class47 arg4, int arg5) {
        field2318++;
        int var6 = arg3.method75(arg4, 31499);
        int var7 = arg3.method77(arg2, var6, true);
        if (arg5 != 0) {
            field2316 = null;
        }
        class79.method677(arg0, var6, var7, arg5 ^ 0x5A, arg3, arg1);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILch;Z)V")
    private final void method897(int arg0, class29 arg1, boolean arg2) {
        field2327++;
        int var4 = arg0 >> 5;
        class29 var5 = this.field2344[var4];
        if (!arg2) {
            this.method902(null, 42);
        }
        if (var5 == null) {
            this.field2346[var4] = arg1;
        } else {
            var5.field533 = arg1;
        }
        this.field2344[var4] = arg1;
        arg1.field532 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lch;I)V")
    public final synchronized void method898(class29 arg0, int arg1) {
        field2312++;
        if (arg1 != 256000) {
            field2316 = null;
        }
        this.field2310 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIII)V")
    public static final void method899(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2325++;
        if (class90.field1898 == 1) {
            class180.field3446[class201.field3907 / 100].method439(class167.field3231 - 8, class148.field2907 + -8);
        }
        if (class90.field1898 == 2) {
            class180.field3446[class201.field3907 / 100 + 4].method439(class167.field3231 - 8, class148.field2907 + -8);
        }
        class2.method11((byte) -56);
        if (class124.field2503) {
            int var5 = arg2 + 512 - 5;
            int var6 = arg0 + 20;
            class47.field946.method114(class5.method24(new class47[] { class51.field984, class167.method1133(class51.field993, (byte) 104) }, (byte) 99), var5, var6, 16776960, -1);
            int var10 = var6 + 15;
            Runtime var7 = Runtime.getRuntime();
            int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
            int var9 = 16776960;
            if (var8 > 32768 && class204.field4029) {
                var9 = 16711680;
            }
            if (var8 > 65536 && !class204.field4029) {
                var9 = 16711680;
            }
            class47.field946.method114(class5.method24(new class47[] { class84.field1790, class167.method1133(var8, (byte) 53), class16.field334 }, (byte) 123), var5, var10, var9, -1);
            var6 = var10 + 15;
        }
        if (arg4 != -1) {
            field2329 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()V")
    public void method500() throws Exception {
        field2324++;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "()V")
    public void method496() {
        field2322++;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "()V")
    public void method501() throws Exception {
        field2313++;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
    public final void method900(int arg0) {
        if (arg0 == -8) {
            field2323++;
            this.field2334 = true;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method498(Component arg0) throws Exception {
        field2321++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/Component;IIB)Lrg;")
    public static final class160 method901(Component arg0, int arg1, int arg2, byte arg3) {
        field2340++;
        try {
            Class var4 = Class.forName("t");
            class160 var5 = (class160) var4.getDeclaredConstructor().newInstance();
            if (arg3 < 41) {
                return null;
            } else {
                var5.method1098(arg1, -1, arg2, arg0);
                return var5;
            }
        } catch (Throwable var7) {
            class167 var6 = new class167();
            var6.method1098(arg1, -1, arg2, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([II)V")
    private final void method902(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class36.field697) {
            var3 = arg1 << 1;
        }
        class128.method957(arg0, 0, var3);
        this.field2343 -= arg1;
        if (this.field2310 != null && this.field2343 <= 0) {
            this.field2343 += class110.field2276 >> 4;
            class76.method665(0, this.field2310);
            this.method897(this.field2310.method168(), this.field2310, true);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class29 var10 = null;
                        class29 var11 = this.field2346[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class145 var12 = var11.field531;
                                if (var12 == null || var12.field2840 <= var8) {
                                    var11.field530 = true;
                                    int var13 = var11.method127();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2840 += var13;
                                    }
                                    if (var4 >= this.field2309) {
                                        break label107;
                                    }
                                    class29 var14 = var11.method153();
                                    if (var14 != null) {
                                        int var15 = var11.field532;
                                        while (var14 != null) {
                                            this.method897(var15 * var14.method168() >> 8, var14, true);
                                            var14 = var11.method128();
                                        }
                                    }
                                    class29 var16 = var11.field533;
                                    var11.field533 = null;
                                    if (var10 == null) {
                                        this.field2346[var7] = var16;
                                    } else {
                                        var10.field533 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2344[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field533;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class29 var18 = this.field2346[var17];
                this.field2346[var17] = this.field2344[var17] = null;
                while (var18 != null) {
                    class29 var19 = var18.field533;
                    var18.field533 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2343 < 0) {
            this.field2343 = 0;
        }
        if (this.field2310 != null) {
            this.field2310.method151(arg0, 0, arg1);
        }
        this.field2319 = class201.method1313(29);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public final synchronized void method903(byte arg0) {
        field2333++;
        if (this.field2331 == null) {
            return;
        }
        long var2 = class201.method1313(29);
        try {
            if (this.field2339 != 0L) {
                if (this.field2339 > var2) {
                    return;
                }
                this.method497(this.field2336);
                this.field2334 = true;
                this.field2339 = 0L;
            }
            int var4 = this.method499();
            if (this.field2345 - var4 > this.field2338) {
                this.field2338 = this.field2345 - var4;
            }
            int var5 = this.field2337 + this.field2335;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field2336) {
                this.field2336 += 1024;
                if (this.field2336 > 16384) {
                    this.field2336 = 16384;
                }
                var4 = 0;
                this.method496();
                this.method497(this.field2336);
                this.field2334 = true;
                if (var5 + 256 > this.field2336) {
                    var5 = this.field2336 - 256;
                    this.field2335 = var5 - this.field2337;
                }
            }
            while (var4 < var5) {
                this.method902(this.field2331, 256);
                this.method501();
                var4 += 256;
            }
            if (arg0 <= 13) {
                this.method893(-72);
            }
            if (var2 > this.field2342) {
                if (this.field2334) {
                    this.field2334 = false;
                } else if (this.field2338 == 0 && this.field2341 == 0) {
                    this.method496();
                    this.field2339 = var2 + 2000L;
                    return;
                } else {
                    this.field2335 = Math.min(this.field2341, this.field2338);
                    this.field2341 = this.field2338;
                }
                this.field2342 = var2 + 2000L;
                this.field2338 = 0;
            }
            this.field2345 = var4;
        } catch (Exception var7) {
            this.method496();
            this.field2339 = var2 + 2000L;
        }
        try {
            if (this.field2319 + 500000L < var2) {
                var2 = this.field2319;
            }
            while (var2 > this.field2319 + 5000L) {
                this.method904(256, false);
                this.field2319 += 256000 / class110.field2276;
            }
        } catch (Exception var6) {
            this.field2319 = var2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "()I")
    public int method499() throws Exception {
        field2317++;
        return this.field2336;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)V")
    private final void method904(int arg0, boolean arg1) {
        this.field2343 -= arg0;
        if (this.field2343 < 0) {
            this.field2343 = 0;
        }
        if (this.field2310 != null) {
            this.field2310.method136(arg0);
        }
        if (arg1) {
            this.method496();
        }
        field2330++;
    }
}
