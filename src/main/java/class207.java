import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class207 {

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Ltg;")
    public static class184 field3973 = class135.method812("Lade Konfiguration )2 ", 3);

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "[Ltg;")
    public static class184[] field3982 = new class184[100];

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Ltg;")
    public static class184 field3977 = class135.method812("Spiel)2Engine wird gestartet)3)3)3", 3);

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Ltg;")
    public static class184 field3991 = class135.method812("leuchten2:", 3);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    private int field3987;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "J")
    private long field3969;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "J")
    private long field3972;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "Z")
    public boolean field3989;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "[I")
    private int[] field3978;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "[I")
    private int[] field3979;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)I")
    public final int method1307(byte arg0) {
        if (arg0 < 29) {
            this.method1321(null, -87);
        }
        field3974++;
        return this.field3987 == -1 ? (this.field3979[0] << 25) + (this.field3978[0] << 15) + (this.field3979[4] << 20) + (this.field3978[11] << 5) + (this.field3978[8] << 10) + this.field3978[1] : class194.method1233(this.field3987, 32137).field792 + 305419896;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V")
    public final void method1308(int arg0, int arg1, int arg2) {
        if (arg0 != -12009) {
            method1311(null, -108);
        }
        field3990++;
        int var4 = class185.field3578[arg2];
        if (this.field3978[var4] != 0 && class26.method172(arg1, (byte) -105) != null) {
            this.field3978[var4] = class123.method748(arg1, Integer.MIN_VALUE);
            this.method1310(-18450);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static final void method1309(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        if (arg0 > 113) {
            field3970++;
            System.exit(1);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    private final void method1310(int arg0) {
        field3983++;
        long var2 = this.field3972;
        long[] var4 = class193.field3744;
        this.field3972 = -1L;
        int var5 = 0;
        if (arg0 != -18450) {
            return;
        }
        while (var5 < 12) {
            this.field3972 = var4[(int) (((long) (this.field3978[var5] >> 24) ^ this.field3972) & 0xFFL)] ^ this.field3972 >>> 8;
            this.field3972 = var4[(int) ((this.field3972 ^ (long) (this.field3978[var5] >> 16)) & 0xFFL)] ^ this.field3972 >>> 8;
            this.field3972 = this.field3972 >>> 8 ^ var4[(int) (((long) (this.field3978[var5] >> 8) ^ this.field3972) & 0xFFL)];
            this.field3972 = this.field3972 >>> 8 ^ var4[(int) (((long) this.field3978[var5] ^ this.field3972) & 0xFFL)];
            var5++;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3972 = this.field3972 >>> 8 ^ var4[(int) (((long) this.field3979[var6] ^ this.field3972) & 0xFFL)];
        }
        this.field3972 = var4[(int) (((long) (this.field3989 ? 1 : 0) ^ this.field3972) & 0xFFL)] ^ this.field3972 >>> 8;
        if (var2 != 0L && this.field3972 != var2) {
            class14.field275.method774(2, var2);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ltg;I)V")
    public static final void method1311(class184 arg0, int arg1) {
        field3992++;
        if (arg1 != -23777) {
            field3977 = null;
        }
        if (class57.field1022 >= 2) {
            if (arg0.method1150(class116.field2101, -96)) {
                System.gc();
            }
            if (arg0.method1150(class37.field694, arg1 ^ 0x5C95)) {
                class167.method1042(arg1 ^ 0xFFFFA337);
            }
            if (arg0.method1150(class206.field3961, -118)) {
                class74.field1378 = true;
            }
            if (arg0.method1150(class175.field3328, -97)) {
                class74.field1378 = false;
            }
            arg0.method1150(class31.field538, arg1 + 23659);
            arg0.method1150(class79.field1432, -121);
            if (arg0.method1150(class88.field1661, -99)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class159.field2883[var2].field1234[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg0.method1135((byte) 116, class83.field1490) && class65.field1247 != 0) {
                class51.method280(arg0.method1140(1, 6).method1146((byte) 89), 32601);
            }
            if (arg0.method1150(class12.field228, -110) && class65.field1247 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method1135((byte) 116, class126.field2273)) {
                class184.field3524 = arg0.method1140(arg1 ^ 0xFFFFA31E, 12).method1148(-4383).method1146((byte) 112);
                class149.method914(0, class144.method884(0, new class184[] { class120.field2166, class170.method1060(class184.field3524, -113) }), null, arg1 ^ 0x5CA7);
            }
            if (arg0.method1150(class159.field2844, -123)) {
                class84.field1530 = true;
            }
        }
        class117.field2122.method106(129, -22);
        class117.field2122.method583((byte) 14, arg0.method1159(false) - 1);
        class111.field2007++;
        class117.field2122.method600(arg0.method1140(1, 2), arg1 ^ 0xFFFFA360);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[IZI[I)V")
    public final void method1312(int arg0, int[] arg1, boolean arg2, int arg3, int[] arg4) {
        if (arg3 <= 122) {
            this.method1308(116, 35, 122);
        }
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class179.field3419; var7++) {
                    class170 var8 = class26.method172(var7, (byte) -105);
                    if (var8 != null && !var8.field3219 && var8.field3218 == var6 + (arg2 ? 7 : 0)) {
                        arg4[class185.field3578[var6]] = class123.method748(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field3987 = arg0;
        this.field3978 = arg4;
        field3981++;
        this.field3979 = arg1;
        this.field3989 = arg2;
        this.method1310(-18450);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lub;II)Loh;")
    public final class140 method1313(class188 arg0, int arg1, int arg2) {
        field3975++;
        if (this.field3987 != arg2) {
            return class194.method1233(this.field3987, 32137).method236(true, arg1, arg0);
        }
        class140 var4 = (class140) class34.field574.method773(this.field3972, arg2 ^ 0xFFFFFFFE);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field3978[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class26.method172(var15 & 0x3FFFFFFF, (byte) -105).method1057(true)) {
                        var5 = true;
                    }
                } else if (!class60.method336(var15 & 0x3FFFFFFF, 10).method740(this.field3989, 65536)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            int var7 = 0;
            class181[] var8 = new class181[12];
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field3978[var9];
                if ((var12 & 0x40000000) != 0) {
                    class181 var14 = class60.method336(var12 & 0x3FFFFFFF, 10).method745(this.field3989, true);
                    if (var14 != null) {
                        var8[var7++] = var14;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class181 var13 = class26.method172(var12 & 0x3FFFFFFF, (byte) -105).method1058(-128);
                    if (var13 != null) {
                        var8[var7++] = var13;
                    }
                }
            }
            class181 var10 = new class181(var8, var7);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class133.field2409[var11].length > this.field3979[var11]) {
                    var10.method1109(class6.field112[var11], class133.field2409[var11][this.field3979[var11]]);
                }
                if (this.field3979[var11] < class64.field1211[var11].length) {
                    var10.method1109(class122.field2209[var11], class64.field1211[var11][this.field3979[var11]]);
                }
            }
            var4 = var10.method1102(64, 768, -50, -10, -50, true, true);
            class34.field574.method776(var4, this.field3972, (byte) -125);
        }
        if (arg0 != null) {
            var4 = arg0.method1186(var4, arg1, 9999999);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILub;IILub;)Loh;")
    public final class140 method1314(int arg0, class188 arg1, int arg2, int arg3, class188 arg4) {
        field3986++;
        if (this.field3987 != -1) {
            return class194.method1233(this.field3987, 32137).method232((byte) -120, arg3, arg4, arg1, arg2);
        }
        long var6 = this.field3972;
        int[] var8 = this.field3978;
        if (arg1 != null && (arg1.field3643 >= 0 || arg1.field3634 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field3978[var9];
            }
            if (arg1.field3643 >= 0) {
                if (arg1.field3643 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class123.method748(arg1.field3643, 1073741824);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg1.field3634 >= 0) {
                if (arg1.field3634 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var8[3] = 0;
                } else {
                    var8[3] = class123.method748(1073741824, arg1.field3634);
                    var6 ^= var8[3];
                }
            }
        }
        class140 var10 = (class140) class14.field275.method773(var6, 1);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if ((var21 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var21) != 0 && !class26.method172(var21 & 0x3FFFFFFF, (byte) -105).method1055(119)) {
                        var11 = true;
                    }
                } else if (!class60.method336(var21 & 0x3FFFFFFF, arg0 + 5).method735(79, this.field3989)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3969 != -1L) {
                    var10 = (class140) class14.field275.method773(this.field3969, arg0 ^ 0x4);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class181[] var13 = new class181[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if ((var18 & 0x40000000) != 0) {
                        class181 var20 = class60.method336(var18 & 0x3FFFFFFF, 10).method739(this.field3989, (byte) 23);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    } else if ((var18 & Integer.MIN_VALUE) != 0) {
                        class181 var19 = class26.method172(var18 & 0x3FFFFFFF, (byte) -105).method1061(-92);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                class181 var16 = new class181(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (class133.field2409[var17].length > this.field3979[var17]) {
                        var16.method1109(class6.field112[var17], class133.field2409[var17][this.field3979[var17]]);
                    }
                    if (this.field3979[var17] < class64.field1211[var17].length) {
                        var16.method1109(class122.field2209[var17], class64.field1211[var17][this.field3979[var17]]);
                    }
                }
                var10 = var16.method1102(64, 850, -30, -50, -30, true, true);
                class14.field275.method776(var10, var6, (byte) 102);
                this.field3969 = var6;
            }
        }
        if (arg1 == null && arg4 == null) {
            return var10;
        }
        class140 var22;
        if (arg1 != null && arg4 != null) {
            var22 = arg1.method1196(-65536, var10, arg3, arg2, arg4);
        } else if (arg1 == null) {
            var22 = arg4.method1184((byte) -127, arg2, var10);
        } else {
            var22 = arg1.method1184((byte) -76, arg3, var10);
        }
        return arg0 == 5 ? var22 : null;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
    public static void method1315(byte arg0) {
        field3973 = null;
        field3982 = null;
        if (arg0 >= -65) {
            method1309(13);
        }
        field3991 = null;
        field3977 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIB)V")
    public final void method1316(int arg0, int arg1, byte arg2) {
        this.field3979[arg1] = arg0;
        this.method1310(arg2 - 18507);
        field3976++;
        if (arg2 != 57) {
            field3977 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)V")
    public final void method1317(int arg0, boolean arg1) {
        if (arg0 > -84) {
            this.method1320(false, (byte) -95);
        }
        field3971++;
        this.field3989 = arg1;
        this.method1310(-18450);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZII)V")
    public final void method1318(boolean arg0, int arg1, int arg2) {
        field3988++;
        if (arg2 == 1 && this.field3989 || arg1 != 1) {
            return;
        }
        int var4 = this.field3978[class185.field3578[arg2]];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 & 0x3FFFFFFF;
        class170 var6;
        do {
            if (arg0) {
                var5++;
                if (class179.field3419 <= var5) {
                    var5 = 0;
                }
            } else {
                var5--;
                if (var5 < 0) {
                    var5 = class179.field3419 - 1;
                }
            }
            var6 = class26.method172(var5, (byte) -105);
        } while (var6 == null || var6.field3219 || (this.field3989 ? 7 : 0) + arg2 != var6.field3218);
        this.field3978[class185.field3578[arg2]] = class123.method748(Integer.MIN_VALUE, var5);
        this.method1310(-18450);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZ)V")
    public final void method1319(int arg0, int arg1, boolean arg2) {
        field3984++;
        int var4 = this.field3979[arg1];
        if (arg2) {
            var4++;
            if (var4 >= class133.field2409[arg1].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class133.field2409[arg1].length - 1;
            }
        }
        this.field3979[arg1] = var4;
        if (arg0 != -1) {
            field3982 = null;
        }
        this.method1310(-18450);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZB)V")
    public final void method1320(boolean arg0, byte arg1) {
        field3985++;
        if (arg0 != this.field3989) {
            this.method1312(-1, this.field3979, arg0, 127, null);
            if (arg1 <= 42) {
                this.field3978 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lka;I)V")
    public final void method1321(class97 arg0, int arg1) {
        field3980++;
        arg0.method583((byte) 14, this.field3989 ? 1 : 0);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field3978[class185.field3578[var3]];
            if ((var5 & Integer.MIN_VALUE) == 0) {
                arg0.method589((byte) -87, 65535);
            } else {
                arg0.method589((byte) -83, var5 & 0x3FFFFFFF);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method583((byte) 14, this.field3979[var4]);
        }
        if (arg1 != 12) {
            this.field3972 = -93L;
        }
    }
}
