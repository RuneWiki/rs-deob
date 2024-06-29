import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class25 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Lac;")
    public static class4 field447 = new class4();

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Lje;")
    public static class67 field462 = class85.method592(255, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Lje;")
    public static class67 field460 = class85.method592(255, "Konfig geladen)3");

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field463 = 0;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field458 = 0;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
    public static int[] field455 = new int[128];

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[S")
    public static short[] field457 = new short[] { -1, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field461 = 0;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lfd;")
    public static class40 field450;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "Lna;")
    public static class91 field456;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "[I")
    public static int[] field464;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
    public static final void method168(int arg0, int arg1) {
        field449++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class154.field3501[arg0];
        int var3 = class101.field2267[arg0];
        int var4 = class46.field847[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var5 = class126.field2766[arg0];
        if (var3 == 37) {
            class150.method1153(8526);
            class72 var6 = class67.method467((byte) -13, var2);
            class135.field3053 = var4;
            class134.field3027 = 1;
            class81.field1783 = var5;
            class89.field1975 = var2;
            class23.method160((byte) -29, var6);
            class3.field41 = class49.method314(new class67[] { class135.field3051, class123.method961(var5, 1658).field2302, class50.field964 }, 0);
            if (class3.field41 == null) {
                class3.field41 = class16.field275;
            }
            return;
        }
        if (var3 == 3) {
            class39.field695++;
            class154.method1171(var4, arg1 ^ 0xFFFFEC4E, var5, var2);
            class69.field1399.method285(48, (byte) 64);
            class69.field1399.method625(-128, var5 >> 14 & 0x7FFF);
            class69.field1399.method655(var2 + class35.field647, -1735580088);
            class69.field1399.method655(var4 + class130.field2863, arg1 ^ 0x6772CA0C);
        }
        if (var3 == 47) {
            class24 var7 = class152.field3479[var5];
            if (var7 != null) {
                class106.field2428++;
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var7.field2993[0], var7.field2942[0], class37.field667.field2942[0], 0);
                class16.field281 = class50.field961;
                class149.field3410 = 0;
                class91.field1983 = 2;
                class81.field1787 = class126.field2773;
                class69.field1399.method285(187, (byte) 64);
                class69.field1399.method666(var5, -32768);
            }
        }
        if (var3 == 5) {
            class69.field1399.method285(121, (byte) 64);
            class69.field1399.method629((byte) 48, var2);
            class72 var8 = class67.method467((byte) -13, var2);
            if (var8.field1547 != null && var8.field1547[0][0] == 5) {
                int var9 = var8.field1547[0][1];
                if (class42.field804[var9] != var8.field1522[0]) {
                    class42.field804[var9] = var8.field1522[0];
                    class59.method412(arg1 ^ 0x13C6, var9);
                }
            }
            class91.field2048++;
        }
        if (var3 == 1007) {
            class149.field3410 = 0;
            class159.field3644++;
            class91.field1983 = 2;
            class16.field281 = class50.field961;
            class81.field1787 = class126.field2773;
            class69.field1399.method285(217, (byte) 64);
            class69.field1399.method625(arg1 + 4924, var5);
        }
        if (var3 == 15 && class154.method1171(var4, 10, var5, var2)) {
            class67.field1298++;
            class69.field1399.method285(175, (byte) 64);
            class69.field1399.method625(-128, class39.field708);
            class69.field1399.method633(-1230655272, class12.field224);
            class69.field1399.method655(class35.field647 + var2, arg1 + -1735575036);
            class69.field1399.method625(-128, class130.field2863 + var4);
            class69.field1399.method666(var5 >> 14 & 0x7FFF, -32768);
        }
        if (var3 == 1002) {
            class154.method1171(var4, 10, var5, var2);
            class84.field1867++;
            class69.field1399.method285(10, (byte) 64);
            class69.field1399.method666(class130.field2863 + var4, arg1 ^ 0x6C44);
            class69.field1399.method655(class35.field647 + var2, arg1 + -1735575036);
            class69.field1399.method625(-128, var5 >> 14 & 0x7FFF);
        }
        if (var3 == 36) {
            class72 var10 = class106.method836(var4, var2, 13);
            if (var10 != null) {
                class150.method1153(8526);
                class101.method805(var2, class121.method954(false, class140.method1063(var10, (byte) -67)), arg1 + 5116, var4);
                class134.field3027 = 0;
                class41.field777 = class34.method217(var10, -4);
                if (class41.field777 == null) {
                    class41.field777 = class159.field3653;
                }
                if (!var10.field1485) {
                    class142.field3255 = class49.method314(new class67[] { class103.field2319, var10.field1505, class50.field964 }, 0);
                    return;
                }
                class142.field3255 = class49.method314(new class67[] { var10.field1534, class50.field964 }, 0);
            }
            return;
        }
        if (var3 == 23) {
            class83 var11 = class85.field1885[var5];
            if (var11 != null) {
                class150.field3445++;
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var11.field2993[0], var11.field2942[0], class37.field667.field2942[0], 0);
                class16.field281 = class50.field961;
                class149.field3410 = 0;
                class91.field1983 = 2;
                class81.field1787 = class126.field2773;
                class69.field1399.method285(186, (byte) 64);
                class69.field1399.method666(var5, -32768);
                class69.field1399.method638(class12.field224, true);
                class69.field1399.method666(class39.field708, -32768);
            }
        }
        if (var3 == 11 && class68.field1384 == null) {
            class63.method427((byte) 65, var2, var4);
            class68.field1384 = class106.method836(var4, var2, arg1 + 5065);
            class23.method160((byte) -29, class68.field1384);
        }
        if (var3 == 43) {
            class71.field1439++;
            class69.field1399.method285(60, (byte) 64);
            class69.field1399.method654(arg1 ^ 0xFFFF87DC, var4);
            class69.field1399.method640(class12.field224, arg1 ^ 0xFFFFEC15);
            class69.field1399.method625(arg1 + 4924, class39.field708);
            class69.field1399.method640(var2, 126);
        }
        if (var3 == 16) {
            class46.field858++;
            class69.field1399.method285(53, (byte) 64);
            class69.field1399.method629((byte) -41, var2);
            class69.field1399.method666(class81.field1783, -32768);
            class69.field1399.method640(class89.field1975, 67);
            class69.field1399.method666(var4, -32768);
            class69.field1399.method666(class135.field3053, -32768);
            class69.field1399.method655(var5, -1735580088);
            class149.field3423 = 0;
            class138.field3108 = class67.method467((byte) -13, var2);
            class9.field214 = var4;
        }
        if (var3 == 13) {
            class81.method574((byte) -30);
        }
        if (var3 == 7) {
            class50.field963++;
            class154.method1171(var4, 10, var5, var2);
            class69.field1399.method285(96, (byte) 64);
            class69.field1399.method655(var5 >> 14 & 0x7FFF, arg1 - 1735575036);
            class69.field1399.method625(-128, var4 + class130.field2863);
            class69.field1399.method655(class35.field647 + var2, arg1 ^ 0x6772CA0C);
        }
        if (var3 == 30) {
            class154.method1171(var4, 10, var5, var2);
            class69.field1399.method285(169, (byte) 64);
            field459++;
            class69.field1399.method654(27544, class35.field647 + var2);
            class69.field1399.method655(class130.field2863 + var4, -1735580088);
            class69.field1399.method655(var5 >> 14 & 0x7FFF, arg1 - 1735575036);
        }
        if (var3 == 49) {
            class104.field2365++;
            boolean var12 = class120.method949(class37.field667.field2993[0], 0, 2, false, 0, (byte) 78, 0, 0, var2, var4, class37.field667.field2942[0], 0);
            if (!var12) {
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var2, var4, class37.field667.field2942[0], 0);
            }
            class91.field1983 = 2;
            class149.field3410 = 0;
            class81.field1787 = class126.field2773;
            class16.field281 = class50.field961;
            class69.field1399.method285(98, (byte) 64);
            class69.field1399.method666(class130.field2863 + var4, -32768);
            class69.field1399.method654(27544, class35.field647 + var2);
            class69.field1399.method654(arg1 ^ 0xFFFF87DC, var5);
        }
        if (var3 == 17) {
            class83 var14 = class85.field1885[var5];
            if (var14 != null) {
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var14.field2993[0], var14.field2942[0], class37.field667.field2942[0], 0);
                class81.field1787 = class126.field2773;
                class149.field3410 = 0;
                class91.field1983 = 2;
                class16.field281 = class50.field961;
                class69.field1399.method285(168, (byte) 64);
                class69.field1399.method625(-128, var5);
                class98.field2186++;
            }
        }
        if (var3 == 6) {
            class128.field2803++;
            class69.field1399.method285(13, (byte) 64);
            class69.field1399.method655(var5, -1735580088);
            class69.field1399.method625(arg1 ^ 0x13C4, var4);
            class69.field1399.method633(-1230655272, var2);
            class149.field3423 = 0;
            class138.field3108 = class67.method467((byte) -13, var2);
            class9.field214 = var4;
        }
        if (var3 == 22) {
            class134.field3044.method355(class128.field2817, var4, var2);
        }
        if (var3 == 26) {
            class66.field1282++;
            boolean var15 = class120.method949(class37.field667.field2993[0], 0, 2, false, 0, (byte) 78, 0, 0, var2, var4, class37.field667.field2942[0], 0);
            if (!var15) {
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var2, var4, class37.field667.field2942[0], 0);
            }
            class149.field3410 = 0;
            class16.field281 = class50.field961;
            class81.field1787 = class126.field2773;
            class91.field1983 = 2;
            class69.field1399.method285(59, (byte) 64);
            class69.field1399.method666(class130.field2863 + var4, -32768);
            class69.field1399.method625(-128, var5);
            class69.field1399.method666(class35.field647 + var2, -32768);
        }
        if (var3 == 19) {
            class83 var17 = class85.field1885[var5];
            if (var17 != null) {
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var17.field2993[0], var17.field2942[0], class37.field667.field2942[0], 0);
                class91.field1983 = 2;
                class16.field281 = class50.field961;
                class149.field3410 = 0;
                class81.field1787 = class126.field2773;
                class69.field1399.method285(83, (byte) 64);
                class80.field1760++;
                class69.field1399.method625(arg1 + 4924, var5);
            }
        }
        if (var3 == 39) {
            class24 var18 = class152.field3479[var5];
            if (var18 != null) {
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var18.field2993[0], var18.field2942[0], class37.field667.field2942[0], 0);
                class81.field1787 = class126.field2773;
                class16.field281 = class50.field961;
                class149.field3410 = 0;
                class91.field1983 = 2;
                class69.field1399.method285(106, (byte) 64);
                class69.field1399.method655(var5, -1735580088);
                class55.field1068++;
            }
        }
        if (var3 == 24) {
            class145.field3334++;
            boolean var19 = class120.method949(class37.field667.field2993[0], 0, 2, false, 0, (byte) 78, 0, 0, var2, var4, class37.field667.field2942[0], 0);
            if (!var19) {
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var2, var4, class37.field667.field2942[0], 0);
            }
            class149.field3410 = 0;
            class81.field1787 = class126.field2773;
            class16.field281 = class50.field961;
            class91.field1983 = 2;
            class69.field1399.method285(140, (byte) 64);
            class69.field1399.method666(class130.field2863 + var4, -32768);
            class69.field1399.method654(27544, var5);
            class69.field1399.method654(27544, var2 + class35.field647);
        }
        if (var3 == 31) {
            class83 var21 = class85.field1885[var5];
            if (var21 != null) {
                class138.field3128++;
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var21.field2993[0], var21.field2942[0], class37.field667.field2942[0], 0);
                class149.field3410 = 0;
                class16.field281 = class50.field961;
                class91.field1983 = 2;
                class81.field1787 = class126.field2773;
                class69.field1399.method285(241, (byte) 64);
                class69.field1399.method654(27544, var5);
            }
        }
        if (var3 == 40) {
            class24 var22 = class152.field3479[var5];
            if (var22 != null) {
                class67.field1350++;
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var22.field2993[0], var22.field2942[0], class37.field667.field2942[0], 0);
                class81.field1787 = class126.field2773;
                class149.field3410 = 0;
                class16.field281 = class50.field961;
                class91.field1983 = 2;
                class69.field1399.method285(123, (byte) 64);
                class69.field1399.method666(var5, arg1 ^ 0x6C44);
            }
        }
        if (var3 == 9) {
            class69.field1399.method285(112, (byte) 64);
            class72.field1477++;
            class69.field1399.method625(arg1 ^ 0x13C4, var4);
            class69.field1399.method666(var5, arg1 ^ 0x6C44);
            class69.field1399.method629((byte) 111, var2);
            class149.field3423 = 0;
            class138.field3108 = class67.method467((byte) -13, var2);
            class9.field214 = var4;
        }
        if (arg1 != -5052) {
            return;
        }
        if (var3 == 57) {
            class83 var23 = class85.field1885[var5];
            if (var23 != null) {
                class138.field3124++;
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var23.field2993[0], var23.field2942[0], class37.field667.field2942[0], 0);
                class149.field3410 = 0;
                class16.field281 = class50.field961;
                class81.field1787 = class126.field2773;
                class91.field1983 = 2;
                class69.field1399.method285(178, (byte) 64);
                class69.field1399.method625(arg1 + 4924, var5);
            }
        }
        if (var3 == 41) {
            class69.field1399.method285(116, (byte) 64);
            class127.field2796++;
            class69.field1399.method625(-128, var4);
            class69.field1399.method633(arg1 ^ 0x495A5C9C, var2);
            class69.field1399.method666(var5, -32768);
            class149.field3423 = 0;
            class138.field3108 = class67.method467((byte) -13, var2);
            class9.field214 = var4;
        }
        if (var3 == 35) {
            class83 var24 = class85.field1885[var5];
            if (var24 != null) {
                class138.field3129++;
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var24.field2993[0], var24.field2942[0], class37.field667.field2942[0], 0);
                class149.field3410 = 0;
                class91.field1983 = 2;
                class81.field1787 = class126.field2773;
                class16.field281 = class50.field961;
                class69.field1399.method285(63, (byte) 64);
                class69.field1399.method654(27544, var5);
            }
        }
        if (var3 == 14) {
            class84.field1859++;
            class69.field1399.method285(243, (byte) 64);
            class69.field1399.method655(var4, arg1 - 1735575036);
            class69.field1399.method629((byte) -119, var2);
            class69.field1399.method654(27544, var5);
            class149.field3423 = 0;
            class138.field3108 = class67.method467((byte) -13, var2);
            class9.field214 = var4;
        }
        if (var3 == 50) {
            class83 var25 = class85.field1885[var5];
            if (var25 != null) {
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var25.field2993[0], var25.field2942[0], class37.field667.field2942[0], 0);
                class16.field281 = class50.field961;
                class148.field3398++;
                class149.field3410 = 0;
                class91.field1983 = 2;
                class81.field1787 = class126.field2773;
                class69.field1399.method285(102, (byte) 64);
                class69.field1399.method666(var5, arg1 - 27716);
            }
        }
        if (var3 == 51) {
            class79.field1731++;
            class69.field1399.method285(108, (byte) 64);
            class69.field1399.method666(var4, -32768);
            class69.field1399.method629((byte) -123, var2);
            class69.field1399.method655(var5, -1735580088);
            class149.field3423 = 0;
            class138.field3108 = class67.method467((byte) -13, var2);
            class9.field214 = var4;
        }
        if (var3 == 48) {
            class24 var26 = class152.field3479[var5];
            if (var26 != null) {
                class126.field2765++;
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var26.field2993[0], var26.field2942[0], class37.field667.field2942[0], 0);
                class91.field1983 = 2;
                class81.field1787 = class126.field2773;
                class16.field281 = class50.field961;
                class149.field3410 = 0;
                class69.field1399.method285(236, (byte) 64);
                class69.field1399.method625(-128, var5);
            }
        }
        if (var3 == 28) {
            class69.field1399.method285(164, (byte) 64);
            class69.field1399.method655(var5, -1735580088);
            class69.field1399.method625(-128, var4);
            class17.field301++;
            class69.field1399.method633(-1230655272, var2);
            class149.field3423 = 0;
            class138.field3108 = class67.method467((byte) -13, var2);
            class9.field214 = var4;
        }
        if (var3 == 4 && class154.method1171(var4, 10, var5, var2)) {
            class69.field1399.method285(75, (byte) 64);
            class69.field1399.method654(27544, var5 >> 14 & 0x7FFF);
            class69.field1399.method654(27544, var2 + class35.field647);
            class69.field1399.method666(class135.field3053, -32768);
            class93.field2094++;
            class69.field1399.method666(var4 + class130.field2863, arg1 + -27716);
            class69.field1399.method625(-128, class81.field1783);
            class69.field1399.method640(class89.field1975, 82);
        }
        if (var3 == 18) {
            class69.field1399.method285(23, (byte) 64);
            class69.field1399.method655(var4, -1735580088);
            class69.field1399.method640(var2, 119);
            class69.field1399.method625(arg1 ^ 0x13C4, var5);
            class76.field1631++;
            class149.field3423 = 0;
            class138.field3108 = class67.method467((byte) -13, var2);
            class9.field214 = var4;
        }
        if (var3 == 2) {
            class24 var27 = class152.field3479[var5];
            if (var27 != null) {
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var27.field2993[0], var27.field2942[0], class37.field667.field2942[0], 0);
                class91.field1983 = 2;
                class149.field3410 = 0;
                class16.field281 = class50.field961;
                class30.field535++;
                class81.field1787 = class126.field2773;
                class69.field1399.method285(58, (byte) 64);
                class69.field1399.method654(27544, var5);
                class69.field1399.method654(27544, class81.field1783);
                class69.field1399.method666(class135.field3053, -32768);
                class69.field1399.method640(class89.field1975, 121);
            }
        }
        if (var3 == 21) {
            class69.field1399.method285(176, (byte) 64);
            class55.field1082++;
            class69.field1399.method629((byte) 118, var2);
            class69.field1399.method654(27544, var5);
            class69.field1399.method625(-128, var4);
            class149.field3423 = 0;
            class138.field3108 = class67.method467((byte) -13, var2);
            class9.field214 = var4;
        }
        if (var3 == 33) {
            class75.field1604++;
            class69.field1399.method285(31, (byte) 64);
            class69.field1399.method625(-128, var5);
            class69.field1399.method640(var2, arg1 ^ 0xFFFFEC28);
            class69.field1399.method654(27544, class39.field708);
            class69.field1399.method625(arg1 + 4924, var4);
            class69.field1399.method640(class12.field224, arg1 + 5172);
            class149.field3423 = 0;
            class138.field3108 = class67.method467((byte) -13, var2);
            class9.field214 = var4;
        }
        if (var3 == 45) {
            class24 var28 = class152.field3479[var5];
            if (var28 != null) {
                class19.field359++;
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var28.field2993[0], var28.field2942[0], class37.field667.field2942[0], 0);
                class81.field1787 = class126.field2773;
                class149.field3410 = 0;
                class16.field281 = class50.field961;
                class91.field1983 = 2;
                class69.field1399.method285(174, (byte) 64);
                class69.field1399.method625(-128, class39.field708);
                class69.field1399.method633(-1230655272, class12.field224);
                class69.field1399.method654(27544, var5);
            }
        }
        if (var3 == 29) {
            class97.field2177++;
            boolean var29 = class120.method949(class37.field667.field2993[0], 0, 2, false, 0, (byte) 78, 0, 0, var2, var4, class37.field667.field2942[0], 0);
            if (!var29) {
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var2, var4, class37.field667.field2942[0], 0);
            }
            class16.field281 = class50.field961;
            class91.field1983 = 2;
            class81.field1787 = class126.field2773;
            class149.field3410 = 0;
            class69.field1399.method285(94, (byte) 64);
            class69.field1399.method655(var2 + class35.field647, -1735580088);
            class69.field1399.method625(-128, var5);
            class69.field1399.method625(-128, class130.field2863 + var4);
        }
        if (var3 == 12) {
            boolean var31 = class120.method949(class37.field667.field2993[0], 0, 2, false, 0, (byte) 78, 0, 0, var2, var4, class37.field667.field2942[0], 0);
            if (!var31) {
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var2, var4, class37.field667.field2942[0], 0);
            }
            class81.field1787 = class126.field2773;
            class149.field3410 = 0;
            class91.field1983 = 2;
            class16.field281 = class50.field961;
            class69.field1399.method285(105, (byte) 64);
            class123.field2749++;
            class69.field1399.method625(arg1 ^ 0x13C4, class135.field3053);
            class69.field1399.method633(arg1 - 1230650220, class89.field1975);
            class69.field1399.method655(var5, -1735580088);
            class69.field1399.method625(-128, var4 + class130.field2863);
            class69.field1399.method654(27544, class35.field647 + var2);
            class69.field1399.method625(-128, class81.field1783);
        }
        if (var3 == 25) {
            class24 var33 = class152.field3479[var5];
            if (var33 != null) {
                class44.field830++;
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var33.field2993[0], var33.field2942[0], class37.field667.field2942[0], 0);
                class149.field3410 = 0;
                class91.field1983 = 2;
                class81.field1787 = class126.field2773;
                class16.field281 = class50.field961;
                class69.field1399.method285(28, (byte) 64);
                class69.field1399.method666(var5, -32768);
            }
        }
        if (var3 == 34) {
            class105.field2396++;
            class69.field1399.method285(233, (byte) 64);
            class69.field1399.method666(var4, arg1 - 27716);
            class69.field1399.method666(var5, -32768);
            class69.field1399.method629((byte) 65, var2);
            class149.field3423 = 0;
            class138.field3108 = class67.method467((byte) -13, var2);
            class9.field214 = var4;
        }
        if (var3 == 44) {
            boolean var34 = class120.method949(class37.field667.field2993[0], 0, 2, false, 0, (byte) 78, 0, 0, var2, var4, class37.field667.field2942[0], 0);
            if (!var34) {
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var2, var4, class37.field667.field2942[0], 0);
            }
            class91.field1983 = 2;
            class81.field1787 = class126.field2773;
            class16.field281 = class50.field961;
            class77.field1660++;
            class149.field3410 = 0;
            class69.field1399.method285(185, (byte) 64);
            class69.field1399.method625(-128, var5);
            class69.field1399.method625(arg1 ^ 0x13C4, class35.field647 + var2);
            class69.field1399.method666(class130.field2863 + var4, -32768);
        }
        if (var3 == 32) {
            class75.field1605++;
            class69.field1399.method285(145, (byte) 64);
            class69.field1399.method625(arg1 ^ 0x13C4, var4);
            class69.field1399.method654(27544, var5);
            class69.field1399.method629((byte) -111, var2);
            class149.field3423 = 0;
            class138.field3108 = class67.method467((byte) -13, var2);
            class9.field214 = var4;
        }
        if (var3 == 58) {
            class101.field2280++;
            boolean var36 = class120.method949(class37.field667.field2993[0], 0, 2, false, 0, (byte) 78, 0, 0, var2, var4, class37.field667.field2942[0], 0);
            if (!var36) {
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var2, var4, class37.field667.field2942[0], 0);
            }
            class81.field1787 = class126.field2773;
            class91.field1983 = 2;
            class16.field281 = class50.field961;
            class149.field3410 = 0;
            class69.field1399.method285(101, (byte) 64);
            class69.field1399.method655(var2 + class35.field647, -1735580088);
            class69.field1399.method666(var5, -32768);
            class69.field1399.method655(class130.field2863 + var4, -1735580088);
            class69.field1399.method666(class39.field708, -32768);
            class69.field1399.method640(class12.field224, 54);
        }
        if (var3 == 1006) {
            class91.field1983 = 2;
            class149.field3410 = 0;
            class81.field1787 = class126.field2773;
            class16.field281 = class50.field961;
            class69.field1399.method285(242, (byte) 64);
            class69.field1399.method625(arg1 ^ 0x13C4, var5 >> 14 & 0x7FFF);
            class50.field959++;
        }
        if (var3 == 46) {
            class72 var38 = class67.method467((byte) -13, var2);
            boolean var39 = true;
            if (var38.field1553 > 0) {
                var39 = class105.method833((byte) 62, var38);
            }
            if (var39) {
                class69.field1399.method285(121, (byte) 64);
                class69.field1399.method629((byte) -85, var2);
                class91.field2048++;
            }
        }
        if (var3 == 8) {
            class83 var40 = class85.field1885[var5];
            if (var40 != null) {
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var40.field2993[0], var40.field2942[0], class37.field667.field2942[0], 0);
                class16.field281 = class50.field961;
                class91.field1983 = 2;
                class81.field1787 = class126.field2773;
                class149.field3410 = 0;
                class69.field1399.method285(237, (byte) 64);
                class69.field1399.method654(arg1 + 32596, class135.field3053);
                class131.field2880++;
                class69.field1399.method655(class81.field1783, -1735580088);
                class69.field1399.method633(-1230655272, class89.field1975);
                class69.field1399.method655(var5, -1735580088);
            }
        }
        if (var3 == 1003) {
            class72 var41 = class67.method467((byte) -13, var2);
            if (var41 == null || var41.field1482[var4] < 100000) {
                class69.field1399.method285(217, (byte) 64);
                class159.field3644++;
                class69.field1399.method625(-128, var5);
            } else {
                class88.method614(class49.method314(new class67[] { class60.method420(var41.field1482[var4], 28498), class29.field520, class123.method961(var5, arg1 ^ 0xFFFFEA3E).field2302 }, 0), class52.field1030, 112, 0);
            }
            class149.field3423 = 0;
            class138.field3108 = class67.method467((byte) -13, var2);
            class9.field214 = var4;
        }
        if (var3 == 20) {
            class83 var42 = class85.field1885[var5];
            if (var42 != null) {
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var42.field2993[0], var42.field2942[0], class37.field667.field2942[0], 0);
                class149.field3410 = 0;
                class16.field281 = class50.field961;
                class91.field1983 = 2;
                class81.field1787 = class126.field2773;
                class69.field1399.method285(244, (byte) 64);
                class56.field1111++;
                class69.field1399.method655(var5, arg1 ^ 0x6772CA0C);
            }
        }
        if (var3 == 10 || var3 == 1004) {
            class85.method599(var4, class31.field543[arg0], -55, var2, var5);
        }
        if (var3 == 38) {
            class69.field1399.method285(121, (byte) 64);
            class91.field2048++;
            class69.field1399.method629((byte) -76, var2);
            class72 var43 = class67.method467((byte) -13, var2);
            if (var43.field1547 != null && var43.field1547[0][0] == 5) {
                int var44 = var43.field1547[0][1];
                class42.field804[var44] = 1 - class42.field804[var44];
                class59.method412(-128, var44);
            }
        }
        if (var3 == 42) {
            class83 var45 = class85.field1885[var5];
            if (var45 != null) {
                class120.method949(class37.field667.field2993[0], 0, 2, false, 1, (byte) 78, 1, 0, var45.field2993[0], var45.field2942[0], class37.field667.field2942[0], 0);
                class2.field9++;
                class16.field281 = class50.field961;
                class149.field3410 = 0;
                class91.field1983 = 2;
                class81.field1787 = class126.field2773;
                class69.field1399.method285(225, (byte) 64);
                class69.field1399.method625(arg1 ^ 0x13C4, var5);
            }
        }
        if (var3 == 1) {
            class154.method1171(var4, 10, var5, var2);
            class69.field1399.method285(255, (byte) 64);
            class69.field1399.method666(class35.field647 + var2, -32768);
            class69.field1399.method666(class130.field2863 + var4, -32768);
            class138.field3105++;
            class69.field1399.method666(var5 >> 14 & 0x7FFF, -32768);
        }
        if (var3 == 1001) {
            class81.field1787 = class126.field2773;
            class149.field3410 = 0;
            class91.field1983 = 2;
            class16.field281 = class50.field961;
            class24 var46 = class152.field3479[var5];
            if (var46 != null) {
                class112 var47 = var46.field442;
                if (var47.field2536 != null) {
                    var47 = var47.method890(arg1 + 5051);
                }
                if (var47 != null) {
                    class82.field1808++;
                    class69.field1399.method285(38, (byte) 64);
                    class69.field1399.method666(var47.field2541, -32768);
                }
            }
        }
        if (class134.field3027 != 0) {
            class134.field3027 = 0;
            class23.method160((byte) -29, class67.method467((byte) -13, class89.field1975));
        }
        if (class38.field691) {
            class150.method1153(8526);
        }
        if (class138.field3108 != null && class149.field3423 == 0) {
            class23.method160((byte) -29, class138.field3108);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BILfd;)Lkd;")
    public static final class73 method169(byte arg0, int arg1, class40 arg2) {
        field451++;
        if (arg0 >= -81) {
            return null;
        } else if (class83.method585(0, arg2, arg1)) {
            return class31.method197((byte) -23);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method170(int arg0) {
        field447 = null;
        int var1 = 11 / ((-arg0 - 32) / 63);
        field450 = null;
        field455 = null;
        field462 = null;
        field456 = null;
        field464 = null;
        field457 = null;
        field460 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lta;I)V")
    public static final void method171(class133 arg0, int arg1) {
        if (arg1 != 24323) {
            method170(81);
        }
        field448++;
        arg0.field2959 = false;
        if (arg0.field2960 != -1) {
            class93 var2 = class49.method316(arg0.field2960, false);
            if (var2 == null || var2.field2075 == null) {
                arg0.field2960 = -1;
            } else {
                arg0.field2980++;
                if (arg0.field2973 < var2.field2075.length && var2.field2072[arg0.field2973] < arg0.field2980) {
                    arg0.field2980 = 1;
                    arg0.field2973++;
                    class14.method104(arg0.field2973, arg0.field2957, arg0.field2963, -125, var2);
                }
                if (var2.field2075.length <= arg0.field2973) {
                    arg0.field2980 = 0;
                    arg0.field2973 = 0;
                    class14.method104(arg0.field2973, arg0.field2957, arg0.field2963, -126, var2);
                }
            }
        }
        if (arg0.field2990 != -1 && arg0.field2983 <= class34.field627) {
            if (arg0.field2941 < 0) {
                arg0.field2941 = 0;
            }
            int var3 = class79.method566(arg0.field2990, false).field3294;
            if (var3 == -1) {
                arg0.field2990 = -1;
            } else {
                class93 var4 = class49.method316(var3, false);
                if (var4 == null || var4.field2075 == null) {
                    arg0.field2990 = -1;
                } else {
                    arg0.field2966++;
                    if (var4.field2075.length > arg0.field2941 && arg0.field2966 > var4.field2072[arg0.field2941]) {
                        arg0.field2966 = 1;
                        arg0.field2941++;
                        class14.method104(arg0.field2941, arg0.field2957, arg0.field2963, -128, var4);
                    }
                    if (var4.field2075.length <= arg0.field2941 && (arg0.field2941 < 0 || arg0.field2941 >= var4.field2075.length)) {
                        arg0.field2990 = -1;
                    }
                }
            }
        }
        if (arg0.field2991 != -1 && arg0.field2987 <= 1) {
            class93 var5 = class49.method316(arg0.field2991, false);
            if (var5.field2095 == 1 && arg0.field2950 > 0 && arg0.field2956 <= class34.field627 && arg0.field2952 < class34.field627) {
                arg0.field2987 = 1;
                return;
            }
        }
        if (arg0.field2991 != -1 && arg0.field2987 == 0) {
            class93 var6 = class49.method316(arg0.field2991, false);
            if (var6 == null || var6.field2075 == null) {
                arg0.field2991 = -1;
            } else {
                arg0.field2933++;
                if (arg0.field2975 < var6.field2075.length && var6.field2072[arg0.field2975] < arg0.field2933) {
                    arg0.field2933 = 1;
                    arg0.field2975++;
                    class14.method104(arg0.field2975, arg0.field2957, arg0.field2963, arg1 - 24451, var6);
                }
                if (arg0.field2975 >= var6.field2075.length) {
                    arg0.field2975 -= var6.field2088;
                    arg0.field2944++;
                    if (arg0.field2944 >= var6.field2089) {
                        arg0.field2991 = -1;
                    } else if (arg0.field2975 >= 0 && var6.field2075.length > arg0.field2975) {
                        class14.method104(arg0.field2975, arg0.field2957, arg0.field2963, -128, var6);
                    } else {
                        arg0.field2991 = -1;
                    }
                }
                arg0.field2959 = var6.field2096;
            }
        }
        if (arg0.field2987 > 0) {
            arg0.field2987--;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static final void method172(int arg0) {
        field453++;
        if (arg0 != 0) {
            field450 = null;
        }
        if (class41.field773 && class2.field13 != class128.field2817) {
            class158.method1218(class37.field667.field2942[0], class128.field2817, class159.field3654, class159.field3656, class37.field667.field2993[0], arg0 + 5151);
        } else if (class56.field1131 != class128.field2817) {
            class56.field1131 = class128.field2817;
            class154.method1165(class128.field2817, 0);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)I")
    public static final int method173(int arg0, boolean arg1) {
        field452++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (!arg1) {
            return 61;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }
}
