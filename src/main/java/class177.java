import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class177 {

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "Lo;")
    private class204 field3192 = new class204();

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "Lo;")
    private class204 field3194 = new class204();

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "Lo;")
    private class204 field3195 = new class204();

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "Lo;")
    private class204 field3196 = new class204();

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "Lvh;")
    private class53 field3200 = new class53(4);

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public volatile int field3201 = 0;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "B")
    private byte field3202 = 0;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public volatile int field3204 = 0;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "Lvh;")
    private class53 field3203 = new class53(8);

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "Lud;")
    public static class279 field3180 = class130.method1024("overlay", 255);

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Lud;")
    public static class279 field3178 = class130.method1024("Chargement de l(W-Bcran)2titre )2 ", 255);

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "Z")
    public static boolean field3185 = false;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    private int field3197;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "J")
    private long field3199;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "Lpm;")
    private class103 field3205;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Lok;")
    public static class149 field3171;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "Lcb;")
    private class280 field3198;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V", line = 5)
    public final void method1370(byte arg0) {
        if (this.field3198 != null) {
            this.field3198.method2027(124);
        }
        int var2 = 35 / ((arg0 + 14) / 40);
        field3176++;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V", line = 22)
    public static void method1371(byte arg0) {
        field3178 = null;
        field3180 = null;
        field3171 = null;
        int var1 = 103 / ((arg0 + 38) / 32);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLok;I)Llj;", line = 33)
    public static final class50 method1372(byte arg0, class149 arg1, int arg2) {
        field3190++;
        if (arg0 >= -99) {
            field3180 = (class279) null;
        }
        return class125.method993(arg1, 119, arg2) ? class100.method854(-48) : null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)I", line = 51)
    public final int method1373(int arg0) {
        field3174++;
        return arg0 == 0 ? this.field3192.method1514(arg0 ^ 0x5156) + this.field3194.method1514(arg0 ^ 0x5156) : 124;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)V", line = 62)
    public final void method1374(byte arg0) {
        field3175++;
        try {
            this.field3198.method2024(-1);
        } catch (Exception var3) {
        }
        this.field3201++;
        this.field3204 = -1;
        this.field3198 = null;
        this.field3202 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        if (arg0 != -86) {
            this.method1383((class280) null, true, 12);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)I", line = 80)
    public static final int method1375(int arg0, int arg1) {
        field3193++;
        return arg0 > -107 ? 74 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)I", line = 97)
    private final int method1376(int arg0) {
        field3188++;
        return arg0 >= -77 ? -97 : this.field3195.method1514(20822) + this.field3196.method1514(20822);
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)Z", line = 108)
    public final boolean method1377(int arg0) {
        if (arg0 < 72) {
            field3180 = (class279) null;
        }
        field3172++;
        return this.method1373(0) >= 20;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)Z", line = 122)
    public final boolean method1378(int arg0) {
        if (this.field3198 != null) {
            long var2 = class127.method1015(21504);
            int var4 = (int) (var2 - this.field3199);
            this.field3199 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3197 += var4;
            if (this.field3197 > 30000) {
                try {
                    this.field3198.method2024(-1);
                } catch (Exception var30) {
                }
                this.field3198 = null;
            }
        }
        field3181++;
        if (this.field3198 == null) {
            return this.method1373(0) == 0 && this.method1376(-84) == 0;
        }
        try {
            this.field3198.method2025(5000);
            if (arg0 != 5) {
                return true;
            }
            for (class103 var6 = (class103) this.field3192.method1511((byte) 78); var6 != null; var6 = (class103) this.field3192.method1515(arg0 - 122)) {
                this.field3200.field1142 = 0;
                this.field3200.method464(1, false);
                this.field3200.method502((byte) 92, (int) var6.field2103);
                this.field3198.method2021(4, this.field3200.field1168, 0, arg0 - 2);
                this.field3194.method1513(var6, 256);
            }
            for (class103 var7 = (class103) this.field3195.method1511((byte) 102); var7 != null; var7 = (class103) this.field3195.method1515(-123)) {
                this.field3200.field1142 = 0;
                this.field3200.method464(0, false);
                this.field3200.method502((byte) 92, (int) var7.field2103);
                this.field3198.method2021(4, this.field3200.field1168, 0, 3);
                this.field3196.method1513(var7, 256);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field3198.method2023(102);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field3197 = 0;
                byte var10 = 0;
                if (this.field3205 == null) {
                    var10 = 8;
                } else if (this.field3205.field1941 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field3203.field1142;
                    if (var11 > var9) {
                        var11 = var9;
                    }
                    this.field3198.method2026(arg0 ^ 0xFFFFFF85, this.field3203.field1168, var11, this.field3203.field1142);
                    if (this.field3202 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3203.field1168[this.field3203.field1142 + var12] = (byte) class13.method92(this.field3203.field1168[this.field3203.field1142 + var12], this.field3202);
                        }
                    }
                    this.field3203.field1142 += var11;
                    if (var10 <= this.field3203.field1142) {
                        if (this.field3205 == null) {
                            this.field3203.field1142 = 0;
                            int var13 = this.field3203.method483(-116);
                            int var14 = this.field3203.method468(28214);
                            int var15 = this.field3203.method483(-103);
                            int var16 = var15 & 0x7F;
                            int var17 = this.field3203.method453(1);
                            boolean var18 = (var15 & 0x80) != 0;
                            Object var19 = null;
                            long var20 = (long) ((var13 << 16) + var14);
                            class103 var22;
                            if (var18) {
                                for (var22 = (class103) this.field3196.method1511((byte) 99); var22 != null && var22.field2103 != var20; var22 = (class103) this.field3196.method1515(-121)) {
                                }
                            } else {
                                for (var22 = (class103) this.field3194.method1511((byte) 68); var22 != null && var22.field2103 != var20; var22 = (class103) this.field3194.method1515(-109)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            this.field3205 = var22;
                            int var23 = var16 == 0 ? 5 : 9;
                            this.field3205.field1932 = new class53(var17 + var23 + this.field3205.field1930);
                            this.field3205.field1932.method464(var16, false);
                            this.field3205.field1932.method444((byte) 46, var17);
                            this.field3205.field1941 = 8;
                            this.field3203.field1142 = 0;
                        } else if (this.field3205.field1941 != 0) {
                            throw new IOException();
                        } else if (this.field3203.field1168[0] == -1) {
                            this.field3205.field1941 = 1;
                            this.field3203.field1142 = 0;
                        } else {
                            this.field3205 = null;
                        }
                    }
                } else {
                    int var24 = this.field3205.field1932.field1168.length - this.field3205.field1930;
                    int var25 = 512 - this.field3205.field1941;
                    if ((var24 - this.field3205.field1932.field1142) < var25) {
                        var25 = var24 - this.field3205.field1932.field1142;
                    }
                    if (var25 > var9) {
                        var25 = var9;
                    }
                    this.field3198.method2026(arg0 ^ 0x54, this.field3205.field1932.field1168, var25, this.field3205.field1932.field1142);
                    if (this.field3202 != 0) {
                        for (int var26 = 0; var26 < var25; var26++) {
                            this.field3205.field1932.field1168[this.field3205.field1932.field1142 + var26] = (byte) class13.method92(this.field3205.field1932.field1168[this.field3205.field1932.field1142 + var26], this.field3202);
                        }
                    }
                    this.field3205.field1941 += var25;
                    this.field3205.field1932.field1142 += var25;
                    if (this.field3205.field1932.field1142 == var24) {
                        this.field3205.method926((byte) -8);
                        this.field3205.field4920 = false;
                        this.field3205 = null;
                    } else if (this.field3205.field1941 == 512) {
                        this.field3205.field1941 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field3198.method2024(-1);
            } catch (Exception var29) {
            }
            this.field3198 = null;
            this.field3201++;
            this.field3204 = -2;
            return this.method1373(0) == 0 && this.method1376(-88) == 0;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V", line = 400)
    private final void method1379(boolean arg0) {
        field3184++;
        if (this.field3198 == null) {
            return;
        }
        try {
            this.field3200.field1142 = 0;
            this.field3200.method464(6, arg0);
            this.field3200.method502((byte) 92, 3);
            this.field3198.method2021(4, this.field3200.field1168, 0, 3);
        } catch (IOException var5) {
            try {
                this.field3198.method2024(-1);
            } catch (Exception var4) {
            }
            this.field3201++;
            this.field3198 = null;
            this.field3204 = -2;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZB)V", line = 425)
    public final void method1380(boolean arg0, byte arg1) {
        field3173++;
        if (this.field3198 == null) {
            return;
        }
        try {
            this.field3200.field1142 = 0;
            this.field3200.method464(arg0 ? 2 : 3, false);
            if (arg1 < 121) {
                field3180 = (class279) null;
            }
            this.field3200.method502((byte) 92, 0);
            this.field3198.method2021(4, this.field3200.field1168, 0, 3);
        } catch (IOException var6) {
            try {
                this.field3198.method2024(-1);
            } catch (Exception var5) {
            }
            this.field3204 = -2;
            this.field3201++;
            this.field3198 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIBII)I", line = 463)
    public static final int method1381(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        int var7 = -15 % ((-arg4 - 55) / 63);
        int var8 = arg5 & 0x3;
        if ((arg0 & 0x1) == 1) {
            int var9 = arg1;
            arg1 = arg2;
            arg2 = var9;
        }
        field3189++;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 1 + 7 - arg1 - arg3;
        } else {
            return 1 + 7 - arg2 - arg6;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lai;IIII)V", line = 494)
    public static final void method1382(class125 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3187++;
        if (class194.field3488 >= 400) {
            return;
        }
        if (arg0.field2321 != null) {
            arg0 = arg0.method999(arg1 - 9642);
        }
        if (arg0 == null || !arg0.field2334) {
            return;
        }
        class279 var5 = arg0.field2289;
        if (arg0.field2296 != 0) {
            class279 var6 = class214.field3764 == 1 ? class223.field3949 : class318.field5579;
            var5 = class115.method929(new class279[] { var5, class205.method1521(class72.field1420.field4196, (byte) -19, arg0.field2296), class169.field3063, var6, class191.method1447(5, arg0.field2296), class251.field4488 }, (byte) 60);
        }
        if (arg1 != 22744) {
            method1382((class125) null, 21, 112, -29, 58);
        }
        if (class98.field1839 == 1) {
            class245.method1750(class94.field1770, (short) 36, (long) arg4, (byte) 92, arg3, class115.method929(new class279[] { class141.field2564, class320.field5590, var5 }, (byte) 60), class8.field334, arg2);
            class29.field687++;
        } else if (class38.field848) {
            class205 var7 = class248.field4409 == -1 ? null : class247.method1768(class248.field4409, (byte) 106);
            if ((class271.field4839 & 0x2) != 0 && (var7 == null || arg0.method996(-5017, class248.field4409, var7.field3651) != var7.field3651)) {
                class86.field1631++;
                class245.method1750(class230.field4016, (short) 47, (long) arg4, (byte) -82, arg3, class115.method929(new class279[] { class73.field1429, class320.field5590, var5 }, (byte) 60), class244.field4332, arg2);
            }
        } else {
            class279[] var8 = arg0.field2272;
            class295.field5261++;
            if (class324.field5666) {
                var8 = class123.method985(var8, -5);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class214.field3764 != 0 || !var8[var9].method2010(class54.field1192, (byte) 84))) {
                        class275.field4885++;
                        byte var10 = 0;
                        if (var9 == 0) {
                            var10 = 30;
                        }
                        int var11 = -1;
                        if (var9 == 1) {
                            var10 = 23;
                        }
                        if (var9 == 2) {
                            var10 = 32;
                        }
                        if (var9 == 3) {
                            var10 = 8;
                        }
                        if (var9 == 4) {
                            var10 = 58;
                        }
                        if (arg0.field2273 == var9) {
                            var11 = arg0.field2326;
                        }
                        if (arg0.field2283 == var9) {
                            var11 = arg0.field2263;
                        }
                        class245.method1750(var11, var10, (long) arg4, (byte) -117, arg3, class115.method929(new class279[] { class117.field2131, var5 }, (byte) 60), var8[var9], arg2);
                    }
                }
            }
            if (class214.field3764 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].method2010(class54.field1192, (byte) 103)) {
                        class182.field3335++;
                        short var13 = 0;
                        if (class72.field1420.field4196 < arg0.field2296) {
                            var13 = 2000;
                        }
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 30;
                        }
                        if (var12 == 1) {
                            var14 = 23;
                        }
                        if (var12 == 2) {
                            var14 = 32;
                        }
                        if (var12 == 3) {
                            var14 = 8;
                        }
                        if (var12 == 4) {
                            var14 = 58;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class245.method1750(arg0.field2306, var14, (long) arg4, (byte) 81, arg3, class115.method929(new class279[] { class117.field2131, var5 }, (byte) 60), var8[var12], arg2);
                    }
                }
            }
            class245.method1750(class233.field4089, (short) 1003, (long) arg4, (byte) -108, arg3, class115.method929(new class279[] { class117.field2131, var5 }, (byte) 60), class143.field2600, arg2);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lcb;ZI)V", line = 658)
    public final void method1383(class280 arg0, boolean arg1, int arg2) {
        if (arg2 != 15565) {
            this.field3202 = -72;
        }
        if (this.field3198 != null) {
            try {
                this.field3198.method2024(-1);
            } catch (Exception var11) {
            }
            this.field3198 = null;
        }
        this.field3198 = arg0;
        this.method1379(false);
        this.method1380(arg1, (byte) 125);
        this.field3203.field1142 = 0;
        this.field3205 = null;
        field3183++;
        while (true) {
            class103 var5 = (class103) this.field3194.method1517(false);
            if (var5 == null) {
                while (true) {
                    class103 var6 = (class103) this.field3196.method1517(false);
                    if (var6 == null) {
                        if (this.field3202 != 0) {
                            try {
                                this.field3200.field1142 = 0;
                                this.field3200.method464(4, false);
                                this.field3200.method464(this.field3202, false);
                                this.field3200.method505(0, (byte) 7);
                                this.field3198.method2021(4, this.field3200.field1168, 0, 3);
                            } catch (IOException var10) {
                                try {
                                    this.field3198.method2024(-1);
                                } catch (Exception var9) {
                                }
                                this.field3204 = -2;
                                this.field3198 = null;
                                this.field3201++;
                            }
                        }
                        this.field3197 = 0;
                        this.field3199 = class127.method1015(21504);
                        return;
                    }
                    this.field3195.method1513(var6, 256);
                }
            }
            this.field3192.method1513(var5, 256);
        }
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V", line = 727)
    public final void method1384(int arg0) {
        field3191++;
        if (this.field3198 == null) {
            return;
        }
        try {
            this.field3200.field1142 = 0;
            this.field3200.method464(7, false);
            this.field3200.method502((byte) 92, 0);
            this.field3198.method2021(4, this.field3200.field1168, 0, 3);
            if (arg0 > -50) {
                this.method1386(-15);
            }
        } catch (IOException var5) {
            try {
                this.field3198.method2024(-1);
            } catch (Exception var4) {
            }
            this.field3198 = null;
            this.field3201++;
            this.field3204 = -2;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZIIB)Lpm;", line = 755)
    public final class103 method1385(int arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field3186++;
        long var6 = (long) ((arg3 << 16) + arg0);
        class103 var8 = new class103();
        var8.field4914 = arg1;
        var8.field2103 = var6;
        if (arg2 != -1436181648) {
            return (class103) null;
        }
        var8.field1930 = arg4;
        if (arg1) {
            if (this.method1373(0) >= 20) {
                throw new RuntimeException();
            }
            this.field3192.method1513(var8, 256);
        } else if (this.method1376(-101) < 20) {
            this.field3195.method1513(var8, 256);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "(I)V", line = 797)
    public final void method1386(int arg0) {
        if (arg0 <= 0) {
            field3177++;
            if (this.field3198 != null) {
                this.field3198.method2024(-1);
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(Z)Z", line = 817)
    public final boolean method1387(boolean arg0) {
        field3179++;
        if (arg0) {
            this.method1383((class280) null, true, 85);
        }
        return this.method1376(-128) >= 20;
    }
}
