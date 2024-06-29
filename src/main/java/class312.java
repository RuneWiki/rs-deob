import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class312 {

    @OriginalMember(owner = "client!km", name = "s", descriptor = "Lcd;")
    public static class64 field5291 = class44.method335((byte) 71, "weiss:");

    @OriginalMember(owner = "client!km", name = "q", descriptor = "Lcd;")
    public static class64 field5289 = class44.method335((byte) 71, "0");

    @OriginalMember(owner = "client!km", name = "m", descriptor = "Lcc;")
    public static class237 field5285 = new class237();

    @OriginalMember(owner = "client!km", name = "x", descriptor = "Lcd;")
    public static class64 field5296 = class44.method335((byte) 71, "lila:");

    @OriginalMember(owner = "client!km", name = "y", descriptor = "[Lrb;")
    public static class211[] field5297 = new class211[27];

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public int field5295;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "J")
    private long field5290;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "J")
    private long field5293;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Z")
    public boolean field5280;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "[I")
    private int[] field5273;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "[I")
    private int[] field5274;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)V", line = 4)
    public final void method2151(int arg0, int arg1, int arg2) {
        if (arg1 != 1073741823) {
            field5289 = (class64) null;
        }
        field5279++;
        this.field5274[arg0] = arg2;
        this.method2154(119);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 19)
    public static final void method2152(int arg0) {
        field5276++;
        while (class108.field1991.method1215(arg0 ^ 0x9, class26.field428) >= 27) {
            int var1 = class108.field1991.method1220(arg0 ^ 0xFFFFA285, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class2.field12[var1] == null) {
                class2.field12[var1] = new class232();
                var2 = true;
            }
            class232 var3 = class2.field12[var1];
            class254.field4422[class218.field3707++] = var1;
            var3.field1911 = class29.field482;
            if (var3.field3911 != null && var3.field3911.method62(8968)) {
                class220.method1566(var3, false);
            }
            int var4 = class108.field1991.method1220(-23932, 1);
            var3.field3911 = class9.method79((byte) 94, class108.field1991.method1220(arg0 - 23933, 14));
            int var5 = class108.field1991.method1220(-23932, 1);
            if (var5 == 1) {
                class89.field1616[class228.field3878++] = var1;
            }
            int var6 = class108.field1991.method1220(-23932, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class83.field1527[class108.field1991.method1220(-23932, 3)];
            if (var2) {
                var3.field1889 = var3.field1863 = var7;
            }
            int var8 = class108.field1991.method1220(arg0 - 23933, 5);
            var3.method760(var3.field3911.field141, 0);
            var3.field1861 = var3.field3911.field111;
            var3.field1895 = var3.field3911.field113;
            var3.field1886 = var3.field3911.field158;
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.field1901 = var3.field3911.field132;
            var3.field1854 = var3.field3911.field112;
            var3.field1856 = var3.field3911.field124;
            var3.field1873 = var3.field3911.field167;
            var3.field1887 = var3.field3911.field162;
            if (var3.field1887 == 0) {
                var3.field1863 = 0;
            }
            var3.method758(var3.method325(-12808), var4 == 1, class139.field2472.field1876[0] + var6, (byte) 104, class139.field2472.field1898[0] + var8);
            if (var3.field3911.method62(8968)) {
                class296.method2065(var3.field1876[0], var3.field1898[0], -91, class20.field364, var3, 0, (class290) null, (class41) null);
            }
        }
        if (arg0 != 1) {
            field5285 = (class237) null;
        }
        class108.field1991.method1210(true);
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V", line = 103)
    public static final void method2153(int arg0) {
        class141.field2487.method1198(false);
        if (arg0 != 255) {
            field5291 = (class64) null;
        }
        field5294++;
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V", line = 115)
    private final void method2154(int arg0) {
        field5286++;
        long var2 = this.field5290;
        long[] var4 = class17.field350;
        if (arg0 <= 114) {
            return;
        }
        this.field5290 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field5290 = var4[(int) (((long) (this.field5273[var5] >> 24) ^ this.field5290) & 0xFFL)] ^ this.field5290 >>> 8;
            this.field5290 = var4[(int) ((this.field5290 ^ (long) (this.field5273[var5] >> 16)) & 0xFFL)] ^ this.field5290 >>> 8;
            this.field5290 = var4[(int) ((this.field5290 ^ (long) (this.field5273[var5] >> 8)) & 0xFFL)] ^ this.field5290 >>> 8;
            this.field5290 = var4[(int) (((long) this.field5273[var5] ^ this.field5290) & 0xFFL)] ^ this.field5290 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field5290 = this.field5290 >>> 8 ^ var4[(int) ((this.field5290 ^ (long) this.field5274[var6]) & 0xFFL)];
        }
        this.field5290 = this.field5290 >>> 8 ^ var4[(int) ((this.field5290 ^ (long) (this.field5280 ? 1 : 0)) & 0xFFL)];
        if (var2 != 0L && this.field5290 != var2) {
            class195.field3332.method1189(var2, -36);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lia;Lia;IIZ)Lam;", line = 161)
    public final class243 method2155(class199 arg0, class199 arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            this.method2154(105);
        }
        field5284++;
        if (this.field5295 != -1) {
            return class9.method79((byte) 94, this.field5295).method70(arg2, arg0, arg3, 0, arg1);
        }
        int[] var6 = this.field5273;
        long var7 = this.field5290;
        if (arg0 != null && (arg0.field3391 >= 0 || arg0.field3412 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field5273[var9];
            }
            if (arg0.field3391 >= 0) {
                if (arg0.field3391 == 65535) {
                    var6[5] = 0;
                    var7 ^= 0xFFFFFFFF00000000L;
                } else {
                    var6[5] = class11.method91(arg0.field3391, 1073741824);
                    var7 ^= (long) var6[5] << 32;
                }
            }
            if (arg0.field3412 >= 0) {
                if (arg0.field3412 == 65535) {
                    var7 ^= 0xFFFFFFFFL;
                    var6[3] = 0;
                } else {
                    var6[3] = class11.method91(1073741824, arg0.field3412);
                    var7 ^= (long) var6[3];
                }
            }
        }
        class243 var10 = (class243) class195.field3332.method1194(var7, (byte) -105);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = var6[var12];
                if ((var13 & 0x40000000) == 0) {
                    if ((var13 & Integer.MIN_VALUE) != 0 && !class296.method2069(false, var13 & 0x3FFFFFFF).method1916((byte) -126)) {
                        var11 = true;
                    }
                } else if (!class132.method949(var13 & 0x3FFFFFFF, false).method703(-97, this.field5280)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field5293 != -1L) {
                    var10 = (class243) class195.field3332.method1194(this.field5293, (byte) -86);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class150[] var14 = new class150[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var6[var16];
                    if ((var17 & 0x40000000) != 0) {
                        class150 var18 = class132.method949(var17 & 0x3FFFFFFF, false).method697(this.field5280, -1);
                        if (var18 != null) {
                            var14[var15++] = var18;
                        }
                    } else if ((Integer.MIN_VALUE & var17) != 0) {
                        class150 var19 = class296.method2069(arg4, var17 & 0x3FFFFFFF).method1915(50);
                        if (var19 != null) {
                            var14[var15++] = var19;
                        }
                    }
                }
                int var20 = var6[0];
                if ((var20 & 0x40000000) != 0) {
                    class92 var21 = class132.method949(var20 & 0x3FFFFFFF, arg4);
                    if (var21.field1702 != null) {
                        for (int var22 = 0; var22 < var21.field1702.length; var22++) {
                            if (var21.field1702[var22] != null && var14[var22 + 1] != null) {
                                int var23 = var21.field1702[var22][0];
                                int var24 = var21.field1702[var22][1];
                                int var25 = var21.field1702[var22][2];
                                int var26 = var21.field1702[var22][4];
                                int var27 = var21.field1702[var22][3];
                                int var28 = var21.field1702[var22][5];
                                var14[var22 + 1].method1062(var23, var24, var25);
                                var14[var22 + 1].method1075(var27, var26, var28);
                            }
                        }
                    }
                }
                class150 var29 = new class150(var14, var15);
                for (int var30 = 0; var30 < 5; var30++) {
                    if (this.field5274[var30] < class140.field2480[var30].length) {
                        var29.method1087(class147.field2599[var30], class140.field2480[var30][this.field5274[var30]]);
                    }
                    if (this.field5274[var30] < class54.field884[var30].length) {
                        var29.method1087(class36.field578[var30], class54.field884[var30][this.field5274[var30]]);
                    }
                }
                var10 = var29.method1076(64, 850, -30, -50, -30);
                if (class123.field2216) {
                    ((class217) var10).method1546(false, false, true, true, false, false, true);
                }
                class195.field3332.method1190(12669, var10, var7);
                this.field5293 = var7;
            }
        }
        if (arg0 == null && arg1 == null) {
            return var10;
        }
        class243 var31;
        if (arg0 != null && arg1 != null) {
            var31 = arg0.method1401((byte) -97, var10, arg3, arg1, arg2);
        } else if (arg0 == null) {
            var31 = arg1.method1398(65535, var10, arg2);
        } else {
            var31 = arg0.method1398(65535, var10, arg3);
        }
        return var31;
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V", line = 385)
    public static final void method2156(int arg0) {
        class56.field947.method1187(0);
        if (arg0 > -114) {
            field5296 = (class64) null;
        }
        field5282++;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B[IZI[I)V", line = 396)
    public final void method2157(byte arg0, int[] arg1, boolean arg2, int arg3, int[] arg4) {
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class53.field877; var7++) {
                    class276 var8 = class296.method2069(false, var7);
                    if (var8 != null && !var8.field4747 && var8.field4741 == var6 + (arg2 ? 7 : 0)) {
                        arg4[class272.field4671[var6]] = class11.method91(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field5280 = arg2;
        this.field5295 = arg3;
        field5292++;
        this.field5274 = arg1;
        if (arg0 == -61) {
            this.field5273 = arg4;
            this.method2154(117);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lia;BIII)Lam;", line = 445)
    public final class243 method2158(class199 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field5287++;
        long var6 = (long) arg3 | (long) arg3 << 32 | (long) (arg4 << 16);
        class243 var8 = (class243) class96.field1759.method1194(var6, (byte) -87);
        if (var8 == null) {
            class150[] var9 = new class150[2];
            int var10 = 0;
            if (!class296.method2069(false, arg3).method1911(0) || !class296.method2069(false, arg4).method1911(0)) {
                return null;
            }
            class150 var11 = class296.method2069(false, arg3).method1912(113);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class150 var12 = class296.method2069(false, arg4).method1912(arg1 ^ 0xFFFFFF8D);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class150 var13 = new class150(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class140.field2480[var14].length > this.field5274[var14]) {
                    var13.method1087(class147.field2599[var14], class140.field2480[var14][this.field5274[var14]]);
                }
                if (this.field5274[var14] < class54.field884[var14].length) {
                    var13.method1087(class36.field578[var14], class54.field884[var14][this.field5274[var14]]);
                }
            }
            var8 = var13.method1076(64, 768, -50, -10, -50);
            class96.field1759.method1190(12669, var8, var6);
        }
        if (arg0 != null) {
            var8 = arg0.method1397(41, arg2, var8);
        }
        if (arg1 == -54) {
            return var8;
        } else {
            return (class243) null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V", line = 509)
    public static void method2159(boolean arg0) {
        field5297 = null;
        field5285 = null;
        field5296 = null;
        if (arg0) {
            method2156(63);
        }
        field5289 = null;
        field5291 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IZZIIII)V", line = 530)
    public static final void method2160(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class137.field2440 = arg0;
        class227.field3857 = arg4;
        class156.field2751 = arg6;
        field5278++;
        class94.field1749 = arg3;
        class258.field4456 = arg5;
        if (arg2 && class227.field3857 >= 100) {
            class119.field2156 = class137.field2440 * 128 + 64;
            class99.field1791 = class258.field4456 * 128 + 64;
            class268.field4622 = class15.method169(class119.field2156, 13257, class20.field364, class99.field1791) - class94.field1749;
        }
        if (!arg1) {
            method2160(-91, true, false, -89, -88, -66, 14);
        }
        class238.field4054 = 2;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BILia;)Lam;", line = 562)
    public final class243 method2161(byte arg0, int arg1, class199 arg2) {
        field5288++;
        if (this.field5295 != -1) {
            return class9.method79((byte) 94, this.field5295).method67(arg1, false, arg2);
        }
        if (arg0 != 96) {
            this.method2164(21, 82, 104);
        }
        class243 var4 = (class243) class96.field1759.method1194(this.field5290, (byte) -128);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field5273[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var7) != 0 && !class296.method2069(false, var7 & 0x3FFFFFFF).method1911(arg0 ^ 0x60)) {
                        var5 = true;
                    }
                } else if (!class132.method949(var7 & 0x3FFFFFFF, false).method708(this.field5280, (byte) 100)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class150[] var8 = new class150[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field5273[var10];
                if ((var11 & 0x40000000) != 0) {
                    class150 var13 = class132.method949(var11 & 0x3FFFFFFF, false).method691((byte) -53, this.field5280);
                    if (var13 != null) {
                        var8[var9++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var11) != 0) {
                    class150 var12 = class296.method2069(false, var11 & 0x3FFFFFFF).method1912(97);
                    if (var12 != null) {
                        var8[var9++] = var12;
                    }
                }
            }
            class150 var14 = new class150(var8, var9);
            for (int var15 = 0; var15 < 5; var15++) {
                if (this.field5274[var15] < class140.field2480[var15].length) {
                    var14.method1087(class147.field2599[var15], class140.field2480[var15][this.field5274[var15]]);
                }
                if (this.field5274[var15] < class54.field884[var15].length) {
                    var14.method1087(class36.field578[var15], class54.field884[var15][this.field5274[var15]]);
                }
            }
            var4 = var14.method1076(64, 768, -50, -10, -50);
            class96.field1759.method1190(12669, var4, this.field5290);
        }
        if (arg2 != null) {
            var4 = arg2.method1397(84, arg1, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZB)V", line = 676)
    public final void method2162(boolean arg0, byte arg1) {
        if (arg1 <= -39) {
            this.field5280 = arg0;
            this.method2154(118);
            field5275++;
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(Z)I", line = 695)
    public final int method2163(boolean arg0) {
        if (arg0) {
            this.field5280 = true;
        }
        field5277++;
        return this.field5295 == -1 ? (this.field5274[4] << 20) + (this.field5274[0] << 25) - (-(this.field5273[0] << 15) - (this.field5273[8] << 10)) - (-(this.field5273[11] << 5) + -this.field5273[1]) : class9.method79((byte) 94, this.field5295).field129 + 305419896;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(III)V", line = 718)
    public final void method2164(int arg0, int arg1, int arg2) {
        field5283++;
        if (arg1 != 255) {
            this.method2151(-85, 83, 102);
        }
        int var4 = class272.field4671[arg2];
        if (this.field5273[var4] != 0 && class296.method2069(false, arg0) != null) {
            this.field5273[var4] = class11.method91(arg0, Integer.MIN_VALUE);
            this.method2154(arg1 - 136);
        }
    }
}
