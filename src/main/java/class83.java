import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class83 {

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    private int field2162 = 65000;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "Ld;")
    private class19 field2167 = null;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "Ld;")
    private class19 field2164 = null;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    private int field2143;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lv;")
    private static class122 field2146 = class55.method425(-63, "Walk here");

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2148 = 0;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Lv;")
    public static class122 field2156 = class55.method425(-89, "Ausw\u001c1hlen");

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field2151 = 0;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "[I")
    public static int[] field2159 = new int[128];

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lv;")
    public static class122 field2154 = field2146;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Lv;")
    public static class122 field2157 = class55.method425(-78, "@or1@");

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Lv;")
    public static class122 field2150 = class55.method425(-98, "::fpson");

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Lv;")
    private static class122 field2158 = class55.method425(-80, "To create a new account you need to");

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "Lv;")
    public static class122 field2165 = class55.method425(-79, "mapdots");

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lv;")
    public static class122 field2153 = field2158;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Lv;")
    private static class122 field2155 = class55.method425(-66, "wishes to trade with you)3");

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Lv;")
    public static class122 field2147 = class55.method425(-103, "Absender:");

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lv;")
    public static class122 field2149 = field2155;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field2166 = 0;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "Lv;")
    public static class122 field2172 = class55.method425(-54, "@gr1@");

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field2173 = 128;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field2168 = 0;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "Lrc;")
    public static class105 field2169;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Lmb;")
    public static class74 field2152;

    @OriginalMember(owner = "client!ne", name = "toString", descriptor = "()Ljava/lang/String;", line = 17)
    public final String toString() {
        field2144++;
        return "Cache:" + this.field2143;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II[BI)Z", line = 26)
    public final boolean method671(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 != 0) {
            return true;
        }
        field2170++;
        class19 var5 = this.field2167;
        synchronized (this.field2167) {
            if (arg0 < 0 || this.field2162 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method672(false, arg0, arg3, arg2, true);
            if (!var6) {
                var6 = this.method672(false, arg0, arg3, arg2, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZII[BZ)Z", line = 62)
    private final boolean method672(boolean arg0, int arg1, int arg2, byte[] arg3, boolean arg4) {
        field2171++;
        class19 var6 = this.field2167;
        synchronized (this.field2167) {
            try {
                int var8;
                if (arg4) {
                    if ((long) (arg2 * 6 + 6) > this.field2164.method192(-107)) {
                        return false;
                    }
                    this.field2164.method198(true, (long) (arg2 * 6));
                    this.field2164.method196(true, 6, 0, class69.field1814);
                    var8 = ((class69.field1814[4] & 0xFF) << 8) + ((class69.field1814[3] & 0xFF) << 16) + (class69.field1814[5] & 0xFF);
                    if (var8 <= 0 || (long) var8 > this.field2167.method192(-85) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2167.method192(-98) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                if (arg0) {
                    field2165 = null;
                }
                int var10 = 0;
                class69.field1814[0] = (byte) (arg1 >> 16);
                int var11 = 0;
                class69.field1814[1] = (byte) (arg1 >> 8);
                class69.field1814[2] = (byte) arg1;
                class69.field1814[3] = (byte) (var8 >> 16);
                class69.field1814[4] = (byte) (var8 >> 8);
                class69.field1814[5] = (byte) var8;
                this.field2164.method198(true, (long) (arg2 * 6));
                this.field2164.method191((byte) -113, class69.field1814, 6, 0);
                while (var10 < arg1) {
                    int var12 = 0;
                    if (arg4) {
                        label108: {
                            this.field2167.method198(true, (long) (var8 * 520));
                            try {
                                this.field2167.method196(true, 8, 0, class69.field1814);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class69.field1814[6] & 0xFF) + (((class69.field1814[4] & 0xFF) << 16) + ((class69.field1814[5] & 0xFF) << 8));
                            int var13 = ((class69.field1814[2] & 0xFF) << 8) + (class69.field1814[3] & 0xFF);
                            int var14 = ((class69.field1814[0] & 0xFF) << 8) + (class69.field1814[1] & 0xFF);
                            int var15 = class69.field1814[7] & 0xFF;
                            if (arg2 == var14 && var11 == var13 && this.field2143 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field2167.method192(-112) / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg4 = false;
                        var12 = (int) ((this.field2167.method192(-128) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    class69.field1814[0] = (byte) (arg2 >> 8);
                    class69.field1814[1] = (byte) arg2;
                    int var18 = arg1 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class69.field1814[2] = (byte) (var11 >> 8);
                    class69.field1814[3] = (byte) var11;
                    class69.field1814[4] = (byte) (var12 >> 16);
                    var11++;
                    class69.field1814[5] = (byte) (var12 >> 8);
                    class69.field1814[6] = (byte) var12;
                    class69.field1814[7] = (byte) this.field2143;
                    this.field2167.method198(true, (long) (var8 * 520));
                    var8 = var12;
                    this.field2167.method191((byte) -113, class69.field1814, 8, 0);
                    this.field2167.method191((byte) -113, arg3, var18, var10);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)[B", line = 215)
    public final byte[] method673(int arg0, byte arg1) {
        field2145++;
        class19 var3 = this.field2167;
        synchronized (this.field2167) {
            if (arg1 != 18) {
                return null;
            }
            try {
                if (this.field2164.method192(-82) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field2164.method198(true, (long) (arg0 * 6));
                this.field2164.method196(true, 6, 0, class69.field1814);
                int var6 = (class69.field1814[5] & 0xFF) + ((class69.field1814[3] & 0xFF) << 16) + ((class69.field1814[4] & 0xFF) << 8);
                int var7 = ((class69.field1814[0] & 0xFF) << 16) + ((class69.field1814[1] & 0xFF) << 8) + (class69.field1814[2] & 0xFF);
                if (var7 < 0 || var7 > this.field2162) {
                    return null;
                } else if (var6 > 0 && this.field2167.method192(-103) / 520L >= (long) var6) {
                    byte[] var10 = new byte[var7];
                    int var11 = 0;
                    int var12 = 0;
                    label74: while (var7 > var11) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field2167.method198(true, (long) (var6 * 520));
                        int var14 = var7 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field2167.method196(true, var14 + 8, 0, class69.field1814);
                        int var15 = ((class69.field1814[0] & 0xFF) << 8) + (class69.field1814[1] & 0xFF);
                        int var16 = ((class69.field1814[4] & 0xFF) << 16) + ((class69.field1814[5] & 0xFF) << 8) + (class69.field1814[6] & 0xFF);
                        int var17 = ((class69.field1814[2] & 0xFF) << 8) + (class69.field1814[3] & 0xFF);
                        int var18 = class69.field1814[7] & 0xFF;
                        if (arg0 == var15 && var12 == var17 && this.field2143 == var18) {
                            if (var16 >= 0 && this.field2167.method192(-110) / 520L >= (long) var16) {
                                var6 = var16;
                                var12++;
                                int var21 = 0;
                                while (true) {
                                    if (var14 <= var21) {
                                        continue label74;
                                    }
                                    var10[var11++] = class69.field1814[var21 + 8];
                                    var21++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(ILd;Ld;I)V", line = 705)
    public class83(int arg0, class19 arg1, class19 arg2, int arg3) {
        this.field2143 = arg0;
        this.field2167 = arg1;
        this.field2162 = arg3;
        this.field2164 = arg2;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 307)
    public static final void method674(int arg0) {
        field2160++;
        class10.field242 = true;
        class8.method88((byte) 108);
        if (class51.field1318) {
            class103.field2545.method811(class51.field1319, 239, 40, 0);
            class103.field2545.method811(class59.method454(new class122[] { class51.field1294, class33.field833 }, arg0 ^ 0x1438), 239, 60, 128);
        } else if (field2166 == 1) {
            class103.field2545.method811(class127.field3071, 239, 40, 0);
            class103.field2545.method811(class59.method454(new class122[] { class51.field1312, class33.field833 }, 5176), 239, 60, 128);
        } else if (field2166 == 2) {
            class103.field2545.method811(class125.field3052, 239, 40, 0);
            class103.field2545.method811(class59.method454(new class122[] { class51.field1312, class33.field833 }, 5176), 239, 60, 128);
        } else if (field2166 == 3) {
            if (class51.field1312 != class51.field1306) {
                class107.method835(class51.field1312, 56);
                class51.field1306 = class51.field1312;
            }
            class105 var1 = class60.field1553;
            class117.method890(0, 0, 463, 77);
            for (int var2 = 0; var2 < class5.field129; var2++) {
                int var3 = var2 * 14 + 18 - class28.field725;
                if (var3 > 0 && var3 < 110) {
                    var1.method811(class112.field2717[var2], 239, var3, 0);
                }
            }
            class117.method891();
            if (class5.field129 > 5) {
                class26.method266(class5.field129 * 14 + 7, 0, 77, 463, (byte) 5, class28.field725);
            }
            if (class51.field1312.method946(70) == 0) {
                class103.field2545.method811(class112.field2752, 239, 40, 255);
            } else if (class5.field129 == 0) {
                class103.field2545.method811(class34.field866, 239, 40, 0);
            }
            var1.method811(class59.method454(new class122[] { class51.field1312, class33.field833 }, arg0 ^ 0x1438), 239, 90, 0);
            class117.method901(0, 77, 479, 0);
        } else if (class74.field1995 != null) {
            class103.field2545.method811(class74.field1995, 239, 40, 0);
            class103.field2545.method811(class60.field1545, 239, 60, 128);
        } else if (class6.field155 != -1) {
            boolean var4 = class47.method387(0, 0, 0, class6.field155, 479, ~arg0, -1, 2, 96);
            if (!var4) {
                class103.field2558 = true;
            }
        } else if (class51.field1323 == -1) {
            class105 var5 = class60.field1553;
            class117.method890(0, 0, 463, 77);
            int var6 = 0;
            for (int var7 = 0; var7 < 100; var7++) {
                if (class8.field194[var7] != null) {
                    int var9 = class33.field832 + 70 - var6 * 14;
                    int var10 = class67.field1734[var7];
                    class122 var11 = class8.field195[var7];
                    byte var12 = 0;
                    if (var11 != null && var11.method948(class41.field1029, (byte) 94)) {
                        var11 = var11.method960(5, 126);
                        var12 = 1;
                    }
                    if (var11 != null && var11.method948(class26.field702, (byte) 71)) {
                        var12 = 2;
                        var11 = var11.method960(5, 126);
                    }
                    if (var10 == 0) {
                        var6++;
                        if (var9 > 0 && var9 < 110) {
                            var5.method800(class8.field194[var7], 4, var9, 0);
                        }
                    }
                    if ((var10 == 1 || var10 == 2) && (var10 == 1 || class84.field2176 == 0 || class84.field2176 == 1 && class75.method637(0, var11))) {
                        if (var9 > 0 && var9 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                class81.field2123[0].method63(var13, var9 - 12);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                class81.field2123[1].method63(var13, var9 - 12);
                                var13 += 14;
                            }
                            var5.method800(class59.method454(new class122[] { var11, class51.field1292 }, 5176), var13, var9, 0);
                            int var14 = var13 + var5.method809(var11) + 8;
                            var5.method800(class8.field194[var7], var14, var9, 255);
                        }
                        var6++;
                    }
                    if ((var10 == 3 || var10 == 7) && class33.field829 == 0 && (var10 == 7 || class19.field496 == 0 || class19.field496 == 1 && class75.method637(arg0, var11))) {
                        if (var9 > 0 && var9 < 110) {
                            byte var15 = 4;
                            var5.method800(class94.field2407, var15, var9, 0);
                            int var16 = var15 + var5.method809(class94.field2407);
                            int var17 = var16 + var5.method803(32);
                            if (var12 == 1) {
                                class81.field2123[0].method63(var17, var9 - 12);
                                var17 += 14;
                            }
                            if (var12 == 2) {
                                class81.field2123[1].method63(var17, var9 - 12);
                                var17 += 14;
                            }
                            var5.method800(class59.method454(new class122[] { var11, class51.field1292 }, 5176), var17, var9, 0);
                            int var18 = var17 + var5.method809(var11) + 8;
                            var5.method800(class8.field194[var7], var18, var9, 8388608);
                        }
                        var6++;
                    }
                    if (var10 == 4 && (class36.field905 == 0 || class36.field905 == 1 && class75.method637(arg0, var11))) {
                        var6++;
                        if (var9 > 0 && var9 < 110) {
                            var5.method800(class59.method454(new class122[] { var11, class67.field1733, class8.field194[var7] }, 5176), 4, var9, 8388736);
                        }
                    }
                    if (var10 == 5 && class33.field829 == 0 && class19.field496 < 2) {
                        var6++;
                        if (var9 > 0 && var9 < 110) {
                            var5.method800(class8.field194[var7], 4, var9, 8388608);
                        }
                    }
                    if (var10 == 6 && class33.field829 == 0 && class19.field496 < 2) {
                        var6++;
                        if (var9 > 0 && var9 < 110) {
                            var5.method800(class59.method454(new class122[] { class88.field2267, class67.field1733, var11, class51.field1292 }, 5176), 4, var9, 0);
                            var5.method800(class8.field194[var7], var5.method809(class59.method454(new class122[] { class88.field2267, class67.field1733, var11 }, 5176)) + 12, var9, 8388608);
                        }
                    }
                    if (var10 == 8 && (class36.field905 == 0 || class36.field905 == 1 && class75.method637(0, var11))) {
                        var6++;
                        if (var9 > 0 && var9 < 110) {
                            var5.method800(class59.method454(new class122[] { var11, class67.field1733, class8.field194[var7] }, 5176), 4, var9, 8270336);
                        }
                    }
                }
            }
            class117.method891();
            class29.field744 = var6 * 14 + 7;
            if (class29.field744 < 78) {
                class29.field744 = 78;
            }
            class26.method266(class29.field744, 0, 77, 463, (byte) 5, class29.field744 - class33.field832 - 77);
            class122 var8;
            if (class70.field1828 == null || class70.field1828.field1448 == null) {
                var8 = class88.field2261;
            } else {
                var8 = class70.field1828.field1448;
            }
            var5.method800(class59.method454(new class122[] { var8, class51.field1292 }, arg0 + 5176), 4, 90, 0);
            var5.method800(class59.method454(new class122[] { class51.field1317, class33.field833 }, 5176), var5.method809(class59.method454(new class122[] { var8, class120.field2907 }, arg0 + 5176)) + 6, 90, 255);
            class117.method901(0, 77, 479, 0);
        } else {
            boolean var19 = class47.method387(0, 0, 0, class51.field1323, 479, ~arg0, -1, 3, 96);
            if (!var19) {
                class103.field2558 = true;
            }
        }
        if (class50.field1261 && class7.field176 == 2) {
            class59.method456(-124);
        }
        class47.method392(false);
        if (arg0 != 0) {
            method675(true);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V", line = 669)
    public static void method675(boolean arg0) {
        field2147 = null;
        field2159 = null;
        field2146 = null;
        field2158 = null;
        field2153 = null;
        field2157 = null;
        field2149 = null;
        field2152 = null;
        field2155 = null;
        field2169 = null;
        field2154 = null;
        if (arg0) {
            field2157 = null;
        }
        field2165 = null;
        field2156 = null;
        field2172 = null;
        field2150 = null;
    }
}
