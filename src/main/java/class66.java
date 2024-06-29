import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class66 {

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "[B")
    private byte[] field1285 = new byte[4];

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Lwg;")
    private class222 field1279;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "J")
    private long field1275;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Lrd;")
    private static class173 field1273 = class133.method843("yellow:", -120);

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field1278 = 0;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "[J")
    public static long[] field1280 = new long[256];

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Lrd;")
    public static class173 field1277 = field1273;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lrd;")
    public static class173 field1272 = field1273;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "[I")
    public static int[] field1293;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "Lwg;")
    public static class222 field1292;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1289;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "[B")
    private byte[] field1276;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "[I")
    public static int[] field1290;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)[B")
    public final byte[] method412(byte arg0) throws IOException {
        field1282++;
        if (class97.method599(arg0 - 73) > this.field1275) {
            throw new IOException("fdt");
        }
        if (this.field1286 == 0) {
            if (this.field1279.field4254 == 2) {
                throw new IOException("fds");
            }
            if (this.field1279.field4254 == 1) {
                this.field1289 = (DataInputStream) this.field1279.field4256;
                this.field1286 = 1;
            }
        }
        if (arg0 != 78) {
            return null;
        }
        if (this.field1286 == 1) {
            int var2 = this.field1289.available();
            if (var2 > 0) {
                if (var2 + this.field1284 > 4) {
                    var2 = 4 - this.field1284;
                }
                this.field1284 += this.field1289.read(this.field1285, this.field1284, var2);
                if (this.field1284 == 4) {
                    int var3 = (new class121(this.field1285)).method776(-68);
                    this.field1276 = new byte[var3];
                    this.field1286 = 2;
                }
            }
        }
        if (this.field1286 == 2) {
            int var4 = this.field1289.available();
            if (var4 > 0) {
                if (this.field1276.length < this.field1287 + var4) {
                    var4 = this.field1276.length - this.field1287;
                }
                this.field1287 += this.field1289.read(this.field1276, this.field1287, var4);
                if (this.field1276.length == this.field1287) {
                    return this.field1276;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)Z")
    public static final boolean method413(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class125.field2363 * arg0 + class125.field2350 * arg2 >> 16;
        int var5 = class125.field2363 * arg2 - class125.field2350 * arg0 >> 16;
        int var6 = class24.field517 * var5 + class17.field365 * arg1 >> 16;
        int var7 = class24.field517 * arg1 - class17.field365 * var5 >> 16;
        if (var6 >= 50 && var6 <= arg3) {
            int var8 = (var4 << 9) / var6 + class36.field769;
            int var9 = (var7 << 9) / var6 + class209.field4060;
            return var8 >= class21.field466 && var8 <= class214.field4155 && var9 >= class189.field3677 && var9 <= field1288;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
    public static final void method414(int arg0, int arg1, int arg2) {
        field1281++;
        class131 var3 = class23.method188(arg2, (byte) 89);
        int var4 = var3.field2471;
        int var5 = var3.field2468;
        int var6 = var3.field2477;
        int var7 = class11.field188[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class45.field913[var4] = class21.method181(class209.method1383(var8, arg0 << var5), class209.method1383(class45.field913[var4], ~var8));
        if (arg1 < 50) {
            method416(-58);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lrc;I)V")
    public static final void method415(class172 arg0, int arg1) {
        if (arg1 != -2394) {
            method416(89);
        }
        field1274++;
        if (class120.field2208 != 1) {
            return;
        }
        short var2 = 280;
        if (var2 <= class41.field849 && var2 + 14 >= class41.field849 && class23.field493 >= 4 && class23.field493 <= 18) {
            class7.method49(0, 0, (byte) -91);
            return;
        }
        if (var2 + 15 <= class41.field849 && var2 + 80 >= class41.field849 && class23.field493 >= 4 && class23.field493 <= 18) {
            class7.method49(0, 1, (byte) -21);
            return;
        }
        short var3 = 390;
        if (var3 <= class41.field849 && var3 + 14 >= class41.field849 && class23.field493 >= 4 && class23.field493 <= 18) {
            class7.method49(1, 0, (byte) 121);
            return;
        }
        if (class41.field849 >= var3 + 15 && var3 + 80 >= class41.field849 && class23.field493 >= 4 && class23.field493 <= 18) {
            class7.method49(1, 1, (byte) 127);
            return;
        }
        short var4 = 500;
        if (var4 <= class41.field849 && class41.field849 <= var4 + 14 && class23.field493 >= 4 && class23.field493 <= 18) {
            class7.method49(2, 0, (byte) -7);
            return;
        }
        if (var4 + 15 <= class41.field849 && var4 + 80 >= class41.field849 && class23.field493 >= 4 && class23.field493 <= 18) {
            class7.method49(2, 1, (byte) 121);
            return;
        }
        short var5 = 610;
        if (class41.field849 >= var5 && class41.field849 <= var5 + 14 && class23.field493 >= 4 && class23.field493 <= 18) {
            class7.method49(3, 0, (byte) -36);
            return;
        }
        if (var5 + 15 <= class41.field849 && var5 + 80 >= class41.field849 && class23.field493 >= 4 && class23.field493 <= 18) {
            class7.method49(3, 1, (byte) 122);
            return;
        }
        if (class41.field849 >= 708 && class23.field493 >= 4 && class41.field849 <= 758 && class23.field493 <= 20) {
            class24.field526 = false;
            class166.field3208.method1226(0, 0);
            class15.field345.method1226(382, 0);
            class112.field2085.method291(382 - class112.field2085.field812 / 2, 18);
            return;
        }
        if (class100.field1833 == -1) {
            return;
        }
        class40 var6 = class198.field3861[class100.field1833];
        if (class175.field3446 == var6.field834) {
            byte[] var7 = class173.method1158(-3, new class173[] { var6.field833, class40.field817 }).method1135((byte) -101);
            class51.field1046 = new String(var7, 0, var7.length);
            if (class105.field1970 != 0) {
                class105.field1970 = 0;
                class25.field535 = 443;
                class67.field1296 = 43594;
                class111.field2056 = 43594;
            }
            class24.field526 = false;
            class133.field2521 = var6.field822;
            class166.field3208.method1226(0, 0);
            class15.field345.method1226(382, 0);
            class112.field2085.method291(382 - class112.field2085.field812 / 2, 18);
            return;
        }
        class173 var8 = class173.method1158(-3, new class173[] { class121.field2271, var6.field833, class40.field817, class208.field4052, class219.field4210, class93.method588(class107.field2003 ? 1 : 0, true), class91.field1730, class93.method588(class96.field1770, true), class76.field1493, class93.method588(class221.field4241, true) });
        try {
            arg0.getAppletContext().showDocument(var8.method1129((byte) 64), "_self");
            return;
        } catch (Exception var9) {
            return;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method416(int arg0) {
        field1272 = null;
        field1280 = null;
        field1277 = null;
        field1273 = null;
        int var1 = -105 % ((arg0 - 63) / 37);
        field1292 = null;
        field1290 = null;
        field1293 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
    public static final void method417(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class9.field166 == 0 && !class182.field3582) {
            class19.method172((byte) 118, (short) 30, 0L, class197.field3844, arg0 - arg4, class208.field4049, arg3 - arg1);
            class178.field3489++;
        }
        if (arg2 < 39) {
            field1280 = null;
        }
        long var5 = -1L;
        for (int var7 = 0; var7 < class213.field4140; var7++) {
            long var8 = class213.field4127[var7];
            int var10 = (int) var8 & 0x7F;
            int var11 = (int) var8 >> 29 & 0x3;
            int var12 = (int) var8 >> 7 & 0x7F;
            int var13 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            if (var5 != var8) {
                var5 = var8;
                if (var11 == 2 && class159.method1045(class172.field3347, var10, var12, var8)) {
                    class4 var14 = class182.method1237(true, var13);
                    if (var14.field84 != null) {
                        var14 = var14.method37(false);
                    }
                    if (var14 == null) {
                        continue;
                    }
                    if (class9.field166 == 1) {
                        class19.method172((byte) 104, (short) 28, var8, class20.field444, var10, class173.method1158(-3, new class173[] { class150.field2849, class104.field1931, var14.field52 }), var12);
                        class59.field1161++;
                    } else if (!class182.field3582) {
                        class94.field1754++;
                        class173[] var15 = var14.field96;
                        if (class176.field3461) {
                            var15 = class118.method716(0, var15);
                        }
                        if (var15 != null) {
                            for (int var16 = 4; var16 >= 0; var16--) {
                                if (var15[var16] != null) {
                                    short var17 = 0;
                                    class42.field859++;
                                    if (var16 == 0) {
                                        var17 = 42;
                                    }
                                    if (var16 == 1) {
                                        var17 = 2;
                                    }
                                    if (var16 == 2) {
                                        var17 = 36;
                                    }
                                    if (var16 == 3) {
                                        var17 = 20;
                                    }
                                    if (var16 == 4) {
                                        var17 = 1003;
                                    }
                                    class19.method172((byte) 118, var17, var8, var15[var16], var10, class173.method1158(-3, new class173[] { class38.field799, var14.field52 }), var12);
                                }
                            }
                        }
                        class19.method172((byte) -118, (short) 1002, (long) var14.field90, class167.field3233, var10, class173.method1158(-3, new class173[] { class38.field799, var14.field52 }), var12);
                    } else if ((class36.field780 & 0x4) == 4) {
                        class19.method172((byte) -58, (short) 37, var8, class48.field1023, var10, class173.method1158(-3, new class173[] { class42.field868, class104.field1931, var14.field52 }), var12);
                        class187.field3636++;
                    }
                }
                if (var11 == 1) {
                    class120 var18 = client.field632[var13];
                    if (var18.field2215.field929 == 1 && (var18.field2820 & 0x7F) == 64 && (var18.field2801 & 0x7F) == 64) {
                        for (int var19 = 0; var19 < field1291; var19++) {
                            class120 var22 = client.field632[class139.field2597[var19]];
                            if (var22 != null && var18 != var22 && var22.field2215.field929 == 1 && var18.field2820 == var22.field2820 && var18.field2801 == var22.field2801) {
                                class205.method1363(var22.field2215, 55, var10, class139.field2597[var19], var12);
                            }
                        }
                        for (int var20 = 0; var20 < class18.field378; var20++) {
                            class212 var21 = class183.field3600[class189.field3703[var20]];
                            if (var21 != null && var18.field2820 == var21.field2820 && var18.field2801 == var21.field2801) {
                                class216.method1417(class189.field3703[var20], 8, var21, var10, var12);
                            }
                        }
                    }
                    class205.method1363(var18.field2215, 60, var10, var13, var12);
                }
                if (var11 == 0) {
                    class212 var23 = class183.field3600[var13];
                    if ((var23.field2820 & 0x7F) == 64 && (var23.field2801 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field1291; var24++) {
                            class120 var27 = client.field632[class139.field2597[var24]];
                            if (var27 != null && var27.field2215.field929 == 1 && var23.field2820 == var27.field2820 && var23.field2801 == var27.field2801) {
                                class205.method1363(var27.field2215, 114, var10, class139.field2597[var24], var12);
                            }
                        }
                        for (int var25 = 0; var25 < class18.field378; var25++) {
                            class212 var26 = class183.field3600[class189.field3703[var25]];
                            if (var26 != null && var23 != var26 && var23.field2820 == var26.field2820 && var23.field2801 == var26.field2801) {
                                class216.method1417(class189.field3703[var25], 8, var26, var10, var12);
                            }
                        }
                    }
                    class216.method1417(var13, 8, var23, var10, var12);
                }
                if (var11 == 3) {
                    class145 var28 = class160.field2985[class172.field3347][var10][var12];
                    if (var28 != null) {
                        for (class205 var29 = (class205) var28.method918(4226); var29 != null; var29 = (class205) var28.method923(16)) {
                            class19 var30 = class195.method1298(1639, var29.field4009);
                            if (class9.field166 == 1) {
                                class19.method172((byte) -69, (short) 46, (long) var29.field4009, class20.field444, var10, class173.method1158(-3, new class173[] { class150.field2849, class106.field1985, var30.field399 }), var12);
                                class23.field503++;
                            } else if (!class182.field3582) {
                                class4.field92++;
                                class173[] var31 = var30.field407;
                                if (class176.field3461) {
                                    var31 = class118.method716(0, var31);
                                }
                                for (int var32 = 4; var32 >= 0; var32--) {
                                    if (var31 != null && var31[var32] != null) {
                                        byte var33 = 0;
                                        if (var32 == 0) {
                                            var33 = 19;
                                        }
                                        if (var32 == 1) {
                                            var33 = 35;
                                        }
                                        if (var32 == 2) {
                                            var33 = 17;
                                        }
                                        if (var32 == 3) {
                                            var33 = 1;
                                        }
                                        class37.field788++;
                                        if (var32 == 4) {
                                            var33 = 38;
                                        }
                                        class19.method172((byte) -50, var33, (long) var29.field4009, var31[var32], var10, class173.method1158(-3, new class173[] { class214.field4151, var30.field399 }), var12);
                                    } else if (var32 == 2) {
                                        class211.field4073++;
                                        class19.method172((byte) -61, (short) 17, (long) var29.field4009, class18.field373, var10, class173.method1158(-3, new class173[] { class214.field4151, var30.field399 }), var12);
                                    }
                                }
                                class19.method172((byte) -61, (short) 1006, (long) var29.field4009, class167.field3233, var10, class173.method1158(-3, new class173[] { class214.field4151, var30.field399 }), var12);
                            } else if ((class36.field780 & 0x1) == 1) {
                                class19.method172((byte) 113, (short) 48, (long) var29.field4009, class48.field1023, var10, class173.method1158(-3, new class173[] { class42.field868, class106.field1985, var30.field399 }), var12);
                                class111.field2061++;
                            }
                        }
                    }
                }
            }
        }
        field1283++;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lna;Ljava/net/URL;)V")
    public class66(class130 arg0, URL arg1) {
        this.field1279 = arg0.method832(arg1, 0);
        this.field1286 = 0;
        this.field1275 = class97.method599(5) + 30000L;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1280[var0] = var1;
        }
        field1291 = 0;
        field1293 = new int[128];
    }
}
