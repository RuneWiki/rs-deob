import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class8 extends RuntimeException {

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Ljava/lang/Throwable;")
    public Throwable field127;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Ljava/lang/String;")
    public String field118;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field121 = 0;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "[S")
    public static short[] field125 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!b", name = "b", descriptor = "B")
    public static byte field117 = 0;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "[I")
    public static int[] field126 = new int[5];

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Lod;")
    public static class101 field130 = class46.method335(-71, "Spieler");

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Lw;")
    public static class153 field122 = new class153();

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Lod;")
    public static class101 field131 = class46.method335(74, "<img=0>");

    @OriginalMember(owner = "client!b", name = "s", descriptor = "[I")
    public static int[] field134 = new int[25];

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field133 = 0;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "Lod;")
    public static class101 field136 = class46.method335(-54, " weitere Optionen");

    @OriginalMember(owner = "client!b", name = "t", descriptor = "Lod;")
    public static class101 field135 = class46.method335(119, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static final void method37(int arg0) {
        field123++;
        if (class94.field2033 == 0) {
            class33.field857 = new class81(4, 104, 104, class20.field431);
            for (int var1 = 0; var1 < 4; var1++) {
                class57.field1331[var1] = new class47(104, 104);
            }
            class130.field2956 = new class122(512, 512);
            class85.field1877 = class92.field1985;
            class119.field2625 = 5;
            class94.field2033 = 20;
        } else if (class94.field2033 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 143;
                int var5 = var4 * 3 + 600;
                int var6 = class124.field2709[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class81.method546(var2, 500, 800, 512, 334);
            class119.field2625 = 10;
            class94.field2033 = 30;
            class85.field1877 = class18.field390;
        } else if (arg0 == -15) {
            if (class94.field2033 == 30) {
                class47.field1113 = class101.method719(true, 0, true, false, true);
                class27.field717 = class101.method719(true, 1, true, false, true);
                class86.field1907 = class101.method719(true, 2, true, true, false);
                class150.field3436 = class101.method719(true, 3, true, false, true);
                class141.field3258 = class101.method719(true, 4, true, false, true);
                class152.field3469 = class101.method719(true, 5, true, true, true);
                class12.field245 = class101.method719(true, 6, false, true, true);
                class31.field810 = class101.method719(true, 7, true, false, true);
                class20.field442 = class101.method719(true, 8, true, false, true);
                class54.field1236 = class101.method719(true, 9, true, false, true);
                class85.field1864 = class101.method719(true, 10, true, false, true);
                class97.field2103 = class101.method719(true, 11, true, false, true);
                class130.field2960 = class101.method719(true, 12, true, false, true);
                class153.field3478 = class101.method719(true, 13, true, true, false);
                class132.field3025 = class101.method719(true, 14, false, false, true);
                class131.field2983 = class101.method719(true, 15, true, false, true);
                class119.field2625 = 20;
                class94.field2033 = 40;
                class85.field1877 = class115.field2544;
            } else if (class94.field2033 == 40) {
                byte var7 = 0;
                int var8 = var7 + class47.field1113.method1021(13605) * 4 / 100;
                int var9 = var8 + class27.field717.method1021(13605) * 4 / 100;
                int var10 = var9 + class86.field1907.method1021(13605) * 2 / 100;
                int var11 = var10 + class150.field3436.method1021(arg0 ^ 0xFFFFCAD4) * 2 / 100;
                int var12 = var11 + class141.field3258.method1021(13605) * 6 / 100;
                int var13 = var12 + class152.field3469.method1021(13605) * 4 / 100;
                int var14 = var13 + class12.field245.method1021(arg0 ^ 0xFFFFCAD4) * 2 / 100;
                int var15 = var14 + class31.field810.method1021(arg0 + 13620) * 60 / 100;
                int var16 = var15 + class20.field442.method1021(13605) * 2 / 100;
                int var17 = var16 + class54.field1236.method1021(arg0 ^ 0xFFFFCAD4) * 2 / 100;
                int var18 = var17 + class85.field1864.method1021(arg0 ^ 0xFFFFCAD4) * 2 / 100;
                int var19 = var18 + class97.field2103.method1021(13605) * 2 / 100;
                int var20 = var19 + class130.field2960.method1021(13605) * 2 / 100;
                int var21 = var20 + class153.field3478.method1021(13605) * 2 / 100;
                int var22 = var21 + class132.field3025.method1021(13605) * 2 / 100;
                int var23 = var22 + class131.field2983.method1021(arg0 ^ 0xFFFFCAD4) * 2 / 100;
                if (var23 == 100) {
                    class85.field1877 = class64.field1466;
                    class94.field2033 = 45;
                    class119.field2625 = 30;
                } else {
                    if (var23 != 0) {
                        class85.field1877 = class15.method101(99, new class101[] { class111.field2367, class82.method592(false, var23), class43.field1026 });
                    }
                    class119.field2625 = 30;
                }
            } else if (class94.field2033 == 45) {
                class135.method1040((byte) 122, !class10.field152, 22050, 2);
                class11 var24 = new class11();
                var24.method70(9, 128, 123);
                class105.field2259 = method43((byte) -43, 22050, class129.field2954, class134.field3062, 0);
                class105.field2259.method144((byte) 96, var24);
                class36.method263(class131.field2983, class141.field3258, class132.field3025, false, var24);
                class138.field3150 = method43((byte) -43, 2048, class129.field2954, class134.field3062, 1);
                class133.field3039 = new class72();
                class138.field3150.method144((byte) 96, class133.field3039);
                class44.field1049 = new class106(22050, class140.field3224);
                class94.field2033 = 50;
                class85.field1877 = class18.field381;
                class119.field2625 = 35;
            } else if (class94.field2033 == 50) {
                int var25 = 0;
                if (class118.field2612 == null) {
                    class118.field2612 = class82.method605(arg0 - 828883234, class20.field442, class49.field1164, class153.field3478, class26.field672);
                } else {
                    var25++;
                }
                if (class157.field3625 == null) {
                    class157.field3625 = class82.method605(-828883249, class20.field442, class43.field1031, class153.field3478, class26.field672);
                } else {
                    var25++;
                }
                if (class34.field867 == null) {
                    class34.field867 = class82.method605(-828883249, class20.field442, class89.field1943, class153.field3478, class26.field672);
                } else {
                    var25++;
                }
                if (var25 < 3) {
                    class85.field1877 = class15.method101(arg0 + 125, new class101[] { class119.field2635, class82.method592(false, var25 * 100 / 3), class43.field1026 });
                    class119.field2625 = 40;
                } else {
                    class85.field1877 = class73.field1577;
                    class94.field2033 = 60;
                    class119.field2625 = 40;
                }
            } else if (class94.field2033 == 60) {
                int var26 = class11.method55(class85.field1864, class20.field442, -1);
                int var27 = class106.method761((byte) 0);
                if (var27 > var26) {
                    class85.field1877 = class15.method101(-44, new class101[] { class62.field1377, class82.method592(false, var26 * 100 / var27), class43.field1026 });
                    class119.field2625 = 50;
                } else {
                    class119.field2625 = 50;
                    class85.field1877 = class28.field752;
                    class35.method262(0, 5);
                    class94.field2033 = 70;
                }
            } else if (class94.field2033 == 70) {
                if (class86.field1907.method105(61)) {
                    class65.method447(class86.field1907, arg0 ^ 0xFFFFF8CB);
                    class32.method249(class86.field1907, 0);
                    class102.method745(class86.field1907, 2, class31.field810);
                    class48.method361(1, class10.field152, class86.field1907, class31.field810);
                    class118.method889(class86.field1907, class31.field810, true);
                    class141.method1124(class86.field1907, (byte) 92, class32.field821, class31.field810, class118.field2612);
                    class140.method1119(class86.field1907, (byte) 44, class27.field717, class47.field1113);
                    class154.method1190((byte) 85, class31.field810, class86.field1907);
                    class138.method1073(class86.field1907, 1);
                    class97.method676((byte) -122, class86.field1907);
                    class1.method6(-30734, class153.field3478, class150.field3436, class20.field442, class31.field810);
                    class105.method755(class86.field1907, (byte) 124);
                    class130.method1005(class86.field1907, (byte) -109);
                    class119.field2625 = 60;
                    class94.field2033 = 80;
                    class85.field1877 = class46.field1088;
                } else {
                    class85.field1877 = class15.method101(-45, new class101[] { class22.field500, class82.method592(false, class86.field1907.method1017(true)), class43.field1026 });
                    class119.field2625 = 60;
                }
            } else if (class94.field2033 == 80) {
                int var28 = 0;
                if (class31.field800 == null) {
                    class31.field800 = class28.method226(class26.field672, class20.field442, (byte) 20, class20.field440);
                } else {
                    var28++;
                }
                if (class7.field115 == null) {
                    class7.field115 = class28.method226(class26.field672, class20.field442, (byte) 20, class130.field2959);
                } else {
                    var28++;
                }
                if (class27.field726 == null) {
                    class27.field726 = class100.method691(class73.field1576, class20.field442, class26.field672, arg0 ^ 0x74D);
                } else {
                    var28++;
                }
                if (class153.field3495 == null) {
                    class153.field3495 = class40.method304(class26.field672, class17.field367, class20.field442, -1);
                } else {
                    var28++;
                }
                if (class94.field2031 == null) {
                    class94.field2031 = class40.method304(class26.field672, class99.field2143, class20.field442, arg0 + 14);
                } else {
                    var28++;
                }
                if (class36.field919 == null) {
                    class36.field919 = class40.method304(class26.field672, class101.field2195, class20.field442, -1);
                } else {
                    var28++;
                }
                if (class46.field1086 == null) {
                    class46.field1086 = class40.method304(class26.field672, class27.field715, class20.field442, -1);
                } else {
                    var28++;
                }
                if (class154.field3507 == null) {
                    class154.field3507 = class40.method304(class26.field672, class25.field654, class20.field442, -1);
                } else {
                    var28++;
                }
                if (class138.field3209 == null) {
                    class138.field3209 = class40.method304(class26.field672, class131.field2999, class20.field442, -1);
                } else {
                    var28++;
                }
                if (class147.field3368 == null) {
                    class147.field3368 = class40.method304(class26.field672, class120.field2650, class20.field442, -1);
                } else {
                    var28++;
                }
                if (class143.field3301 == null) {
                    class143.field3301 = class40.method304(class26.field672, class147.field3360, class20.field442, arg0 + 14);
                } else {
                    var28++;
                }
                if (class44.field1057 == null) {
                    class44.field1057 = class100.method691(class144.field3321, class20.field442, class26.field672, -1860);
                } else {
                    var28++;
                }
                if (class43.field1040 == null) {
                    class43.field1040 = class100.method691(class41.field992, class20.field442, class26.field672, -1860);
                } else {
                    var28++;
                }
                if (class6.field79 == null) {
                    class6.field79 = class147.method1158(class20.field442, class150.field3443, class26.field672, (byte) -109);
                } else {
                    var28++;
                }
                if (var28 < 14) {
                    class85.field1877 = class15.method101(arg0 ^ 0x18, new class101[] { class24.field626, class82.method592(false, var28 * 100 / 14), class43.field1026 });
                    class119.field2625 = 70;
                } else {
                    class114.field2499 = class43.field1040;
                    int var29 = (int) (Math.random() * 21.0D) - 10;
                    class7.field115.method928();
                    int var30 = (int) (Math.random() * 21.0D) - 10;
                    int var31 = (int) (Math.random() * 41.0D) - 20;
                    int var32 = (int) (Math.random() * 21.0D) - 10;
                    for (int var33 = 0; var33 < class153.field3495.length; var33++) {
                        class153.field3495[var33].method931(var30 + var31, var29 + var31, var31 + var32);
                    }
                    class27.field726[0].method883(var30 + var31, var29 - -var31, var31 + var32);
                    class53.method384((byte) -49);
                    class94.field2033 = 90;
                    class85.field1877 = class28.field758;
                    class119.field2625 = 70;
                }
            } else if (class94.field2033 == 90) {
                if (class54.field1236.method105(-128)) {
                    class118 var34 = new class118(class54.field1236, class20.field442, 20, 0.8D, class10.field152 ? 64 : 128);
                    class124.method958(var34);
                    class124.method949(0.8D);
                    class119.field2625 = 90;
                    class94.field2033 = 110;
                    class85.field1877 = class153.field3502;
                } else {
                    class85.field1877 = class15.method101(arg0 - 34, new class101[] { class118.field2616, class82.method592(false, class54.field1236.method1017(true)), class43.field1026 });
                    class119.field2625 = 90;
                }
            } else if (class94.field2033 == 110) {
                class39.field941 = new class44();
                class129.field2954.method1170(10, arg0 + 20934, class39.field941);
                class119.field2625 = 94;
                class94.field2033 = 120;
                class85.field1877 = class20.field444;
            } else if (class94.field2033 == 120) {
                if (class85.field1864.method115(class49.field1159, (byte) 117, class26.field672)) {
                    class52 var35 = new class52(class85.field1864.method109((byte) 110, class49.field1159, class26.field672));
                    class131.method1012(arg0 ^ 0x7A, var35);
                    class119.field2625 = 96;
                    class94.field2033 = 130;
                    class85.field1877 = class41.field996;
                } else {
                    class85.field1877 = class15.method101(arg0 + 135, new class101[] { class65.field1468, class78.field1620 });
                    class119.field2625 = 96;
                }
            } else if (class94.field2033 == 130) {
                if (!class150.field3436.method105(-127)) {
                    class85.field1877 = class15.method101(-10, new class101[] { class23.field550, class82.method592(false, class150.field3436.method1017(true) * 4 / 5), class43.field1026 });
                    class119.field2625 = 100;
                } else if (!class130.field2960.method105(arg0 ^ 0xFFFFFFEE)) {
                    class85.field1877 = class15.method101(-2, new class101[] { class23.field550, class82.method592(false, class130.field2960.method1017(true) / 6 + 80), class43.field1026 });
                    class119.field2625 = 100;
                } else if (class153.field3478.method105(6)) {
                    class94.field2033 = 140;
                    class119.field2625 = 100;
                    class85.field1877 = class140.field3226;
                } else {
                    class85.field1877 = class15.method101(-120, new class101[] { class23.field550, class82.method592(false, class153.field3478.method1017(true) / 20 + 96), class43.field1026 });
                    class119.field2625 = 100;
                }
            } else if (class94.field2033 == 140) {
                class35.method262(0, 10);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public static void method38(int arg0) {
        field131 = null;
        field126 = null;
        field122 = null;
        field136 = null;
        field134 = null;
        field135 = null;
        if (arg0 != 4937) {
            field136 = null;
        }
        field125 = null;
        field130 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)Lne;")
    public static final class95 method39(int arg0, byte arg1) {
        field124++;
        class95 var2 = (class95) class99.field2139.method140(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class134.field3081.method114((byte) -116, 12, arg0);
        if (arg1 >= -30) {
            method41(null, 10, 86);
        }
        class95 var4 = new class95();
        if (var3 != null) {
            var4.method665(new class138(var3), 17093);
        }
        var4.method666((byte) -35);
        class99.field2139.method141(var4, (long) arg0, (byte) -122);
        return var4;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([BI)Lme;")
    public static final class88 method40(byte[] arg0, int arg1) {
        field128++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 <= 98) {
            method39(80, (byte) 87);
        }
        class88 var2 = new class88(arg0, class2.field31, class32.field822, class150.field3434, class138.field3173, class93.field1998, class67.field1503);
        class63.method433(4096);
        return var2;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class8(Throwable arg0, String arg1) {
        this.field127 = arg0;
        this.field118 = arg1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ltf;II)Lod;")
    public static final class101 method41(class138 arg0, int arg1, int arg2) {
        field129++;
        try {
            class101 var3 = new class101();
            var3.field2231 = arg0.method1052(-63);
            int var4 = 103 / ((arg2 + 41) / 42);
            if (arg1 < var3.field2231) {
                var3.field2231 = arg1;
            }
            var3.field2223 = new byte[var3.field2231];
            arg0.field3175 += class6.field95.method380(0, var3.field2223, var3.field2231, arg0.field3175, arg0.field3213, 8030);
            return var3;
        } catch (Exception var5) {
            return class13.field282;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BII)V")
    public static final void method42(byte arg0, int arg1, int arg2) {
        field119++;
        if (class54.field1244 < 2 && class49.field1158 == 0 && !class106.field2292) {
            return;
        }
        class101 var3;
        if (class49.field1158 == 1 && class54.field1244 < 2) {
            var3 = class15.method101(1, new class101[] { class101.field2208, class101.field2176, class132.field3036, class32.field832 });
        } else if (class106.field2292 && class54.field1244 < 2) {
            var3 = class15.method101(arg0 ^ 0x39, new class101[] { class149.field3395, class101.field2176, class15.field302, class32.field832 });
        } else {
            var3 = class54.method394(false, class54.field1244 - 1);
        }
        if (class54.field1244 > 2) {
            var3 = class15.method101(86, new class101[] { var3, class67.field1518, class82.method592(false, class54.field1244 - 2), class65.field1479 });
        }
        if (arg0 == 80) {
            class34.field867.method856(var3, arg2 + 4, arg1 + 15, 16777215, 0, class143.field3305 / 1000);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BILve;Ljava/awt/Component;I)Lcc;")
    private static final class18 method43(byte arg0, int arg1, class151 arg2, Component arg3, int arg4) {
        field120++;
        if (class140.field3224 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class18 var5 = (class18) Class.forName("td").getDeclaredConstructor().newInstance();
                var5.field370 = new int[(class7.field105 ? 2 : 1) * 256];
                var5.field402 = arg1;
                var5.method133(arg3);
                var5.field397 = (arg1 & -1024) + 1024;
                if (var5.field397 > 16384) {
                    var5.field397 = 16384;
                }
                var5.method128(var5.field397);
                if (class43.field1029 > 0 && class79.field1664 == null) {
                    class79.field1664 = new class102();
                    class79.field1664.field2237 = arg2;
                    arg2.method1170(class43.field1029, 20919, class79.field1664);
                }
                if (class79.field1664 != null) {
                    if (class79.field1664.field2241[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class79.field1664.field2241[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class16 var6 = new class16(arg2, arg4);
                    var6.field370 = new int[(class7.field105 ? 2 : 1) * 256];
                    var6.field402 = arg1;
                    var6.method133(arg3);
                    if (arg0 != -43) {
                        method41(null, -46, -101);
                    }
                    var6.field397 = 16384;
                    var6.method128(var6.field397);
                    if (class43.field1029 > 0 && class79.field1664 == null) {
                        class79.field1664 = new class102();
                        class79.field1664.field2237 = arg2;
                        arg2.method1170(class43.field1029, 20919, class79.field1664);
                    }
                    if (class79.field1664 != null) {
                        if (class79.field1664.field2241[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class79.field1664.field2241[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class18();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
