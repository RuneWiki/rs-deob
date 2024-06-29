import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class172 {

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
    public static int[] field630 = new int[25];

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "[Lma;")
    public static class120[] field632 = new class120[32768];

    @OriginalMember(owner = "client!client", name = "N", descriptor = "Lrd;")
    public static class173 field623 = class133.method843("Art", 98);

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field626 = 2;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lrd;")
    private static class173 field634 = class133.method843("Please wait )2 attempting to reestablish)3", -94);

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Lrd;")
    public static class173 field644 = field634;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Lrd;")
    private static class173 field642 = class133.method843(" from your ignore list first)3", -99);

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Lrd;")
    public static class173 field629 = field642;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Llc;")
    public static class112 field637 = new class112(8);

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "[I")
    public static int[] field645 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Lbc;")
    public static class14 field646;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)V")
    public static final void method239(byte arg0, int arg1, int arg2) {
        if (class211.field4079 != 0 && arg2 != -1) {
            class103.method642(false, class116.field2151, false, class211.field4079, 0, arg2);
            class138.field2588 = true;
        }
        field633++;
        if (arg0 != -68) {
            field637 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method240(int arg0) {
        field643++;
        if (class195.field3785 == 0) {
            class212.method1391(4, 104, 104, class46.field975);
            for (int var2 = 0; var2 < 4; var2++) {
                class35.field760[var2] = new class177(104, 104);
            }
            class30.field620 = new class180(512, 512);
            class87.field1703 = class84.field1677;
            class195.field3785 = 20;
            class87.field1696 = 5;
            return;
        }
        if (arg0 != 100) {
            this.method244(-37, (byte) 83);
        }
        if (class195.field3785 == 20) {
            int[] var3 = new int[9];
            for (int var4 = 0; var4 < 9; var4++) {
                int var5 = var4 * 32 + 128 + 15;
                int var6 = class72.field1396[var5];
                int var7 = var5 * 3 + 600;
                var3[var4] = var6 * var7 >> 16;
            }
            class152.method1000(var3, 500, 800, 512, 334, 25, 3500);
            class87.field1703 = class48.field1016;
            class87.field1696 = 10;
            class195.field3785 = 30;
        } else if (class195.field3785 == 30) {
            class175.field3444 = class145.method912((byte) -106, 0, true, true, false);
            class179.field3522 = class145.method912((byte) -112, 1, true, true, false);
            class40.field830 = class145.method912((byte) -101, 2, true, false, true);
            class160.field2982 = class145.method912((byte) -121, 3, true, true, false);
            class74.field1444 = class145.method912((byte) -110, 4, true, true, false);
            class111.field2054 = class145.method912((byte) -125, 5, true, true, true);
            class114.field2106 = class145.method912((byte) -123, 6, false, true, true);
            class143.field2683 = class145.method912((byte) -116, 7, true, true, false);
            class145.field2700 = class145.method912((byte) -125, 8, true, true, false);
            class93.field1747 = class145.method912((byte) -117, 9, true, false, true);
            class187.field3659 = class145.method912((byte) -121, 10, true, true, false);
            class116.field2151 = class145.method912((byte) -100, 11, true, true, false);
            class54.field1091 = class145.method912((byte) -100, 12, true, true, false);
            class58.field1152 = class145.method912((byte) -112, 13, true, false, true);
            class8.field156 = class145.method912((byte) -104, 14, false, true, false);
            class184.field3610 = class145.method912((byte) -126, 15, true, true, false);
            class108.field2016 = class145.method912((byte) -128, 16, true, true, false);
            class140.field2605 = class145.method912((byte) -109, 17, true, true, false);
            class38.field805 = class145.method912((byte) -100, 18, true, true, false);
            class84.field1672 = class145.method912((byte) -109, 19, true, true, false);
            class15.field347 = class145.method912((byte) -113, 20, true, true, false);
            class159.field2976 = class145.method912((byte) -113, 21, true, true, false);
            class182.field3584 = class145.method912((byte) -113, 22, true, true, false);
            class87.field1703 = class220.field4229;
            class195.field3785 = 40;
            class87.field1696 = 20;
        } else if (class195.field3785 == 40) {
            byte var8 = 0;
            int var9 = var8 + class175.field3444.method9(-22) * 4 / 100;
            int var10 = var9 + class179.field3522.method9(-118) * 4 / 100;
            int var11 = var10 + class40.field830.method9(-118) / 100;
            int var12 = var11 + class160.field2982.method9(-118) * 2 / 100;
            int var13 = var12 + class74.field1444.method9(arg0 ^ 0xFFFFFFEC) * 6 / 100;
            int var14 = var13 + class111.field2054.method9(59) * 4 / 100;
            int var15 = var14 + class114.field2106.method9(28) * 2 / 100;
            int var16 = var15 + class143.field2683.method9(arg0 ^ 0xFFFFFFE0) * 54 / 100;
            int var17 = var16 + class145.field2700.method9(-123) * 2 / 100;
            int var18 = var17 + class93.field1747.method9(-27) * 2 / 100;
            int var19 = var18 + class187.field3659.method9(-124) * 2 / 100;
            int var20 = var19 + class116.field2151.method9(42) * 2 / 100;
            int var21 = var20 + class54.field1091.method9(-2) * 2 / 100;
            int var22 = var21 + class58.field1152.method9(arg0 ^ 0xFFFFFFEF) * 2 / 100;
            int var23 = var22 + class8.field156.method9(arg0 ^ 0x1) * 2 / 100;
            int var24 = var23 + class184.field3610.method9(76) * 2 / 100;
            int var25 = var24 + class108.field2016.method9(arg0 ^ 0x6A) / 100;
            int var26 = var25 + class140.field2605.method9(arg0 ^ 0xFFFFFFEC) / 100;
            int var27 = var26 + class38.field805.method9(-122) / 100;
            int var28 = var27 + class84.field1672.method9(3) / 100;
            int var29 = var28 + class15.field347.method9(-126) / 100;
            int var30 = var29 + class159.field2976.method9(4) / 100;
            int var31 = var30 + class182.field3584.method9(103) / 100;
            if (var31 == 100) {
                class87.field1696 = 30;
                class87.field1703 = class67.field1300;
                class140.method870(class187.field3659, arg0 + 6, class145.field2700, class114.field2106);
                class195.field3785 = 45;
            } else {
                if (var31 != 0) {
                    class87.field1703 = class173.method1158(-3, new class173[] { class38.field802, class93.method588(var31, true), class22.field482 });
                }
                class87.field1696 = 30;
            }
        } else if (class195.field3785 == 45) {
            class4.method24(-19005, 22050, 2, !class107.field2003);
            class13 var32 = new class13();
            var32.method78(false, 128, 9);
            class140.field2604 = class8.method58(27865, 22050, 0, class165.field3183, class64.field1264);
            class140.field2604.method483(arg0 ^ 0xFFFFFFA9, var32);
            class1.method1(class8.field156, var32, (byte) 123, class74.field1444, class184.field3610);
            class60.field1199 = class8.method58(27865, 2048, 1, class165.field3183, class64.field1264);
            class171.field3308 = new class113();
            class60.field1199.method483(-113, class171.field3308);
            class182.field3573 = new class26(22050, class52.field1072);
            class87.field1703 = class26.field543;
            class87.field1696 = 35;
            class195.field3785 = 50;
        } else if (class195.field3785 == 50) {
            int var33 = 0;
            if (class7.field130 == null) {
                class7.field130 = class94.method591((byte) -110, class19.field430, class58.field1152, class208.field4049, class145.field2700);
            } else {
                var33++;
            }
            if (class134.field2548 == null) {
                class134.field2548 = class7.field130;
            } else {
                var33++;
            }
            if (class150.field2851 == null) {
                class150.field2851 = class94.method591((byte) -62, class211.field4091, class58.field1152, class208.field4049, class145.field2700);
            } else {
                var33++;
            }
            if (class158.field2955 == null) {
                class158.field2955 = class94.method591((byte) -100, class161.field2997, class58.field1152, class208.field4049, class145.field2700);
            } else {
                var33++;
            }
            if (var33 < 4) {
                class87.field1703 = class173.method1158(-3, new class173[] { class174.field3425, class93.method588(var33 * 100 / 4, true), class22.field482 });
                class87.field1696 = 40;
            } else {
                class87.field1703 = class75.field1483;
                class195.field3785 = 60;
                class87.field1696 = 40;
            }
        } else if (class195.field3785 == 60) {
            int var34 = class204.method1359(class145.field2700, 0, class187.field3659);
            int var35 = class199.method1317(false);
            if (var35 > var34) {
                class87.field1703 = class173.method1158(-3, new class173[] { class103.field1909, class93.method588(var34 * 100 / var35, true), class22.field482 });
                class87.field1696 = 50;
            } else {
                class87.field1696 = 50;
                class195.field3785 = 65;
                class87.field1703 = class181.field3561;
            }
        } else if (class195.field3785 == 65) {
            class87.field1703 = class207.field4028;
            class87.field1696 = 50;
            class148.method978(5, arg0 ^ 0x2228);
            class195.field3785 = 70;
        } else if (class195.field3785 == 70) {
            class40.field830.method122(-114);
            byte var36 = 0;
            int var37 = var36 + class40.field830.method127(false);
            class108.field2016.method122(-111);
            int var38 = var37 + class108.field2016.method127(false);
            class140.field2605.method122(arg0 - 221);
            int var39 = var38 + class140.field2605.method127(false);
            class38.field805.method122(-117);
            int var40 = var39 + class38.field805.method127(false);
            class84.field1672.method122(-121);
            int var41 = var40 + class84.field1672.method127(false);
            class15.field347.method122(-113);
            int var42 = var41 + class15.field347.method127(false);
            class159.field2976.method122(-112);
            int var43 = var42 + class159.field2976.method127(false);
            class182.field3584.method122(-123);
            int var44 = var43 + class182.field3584.method127(false);
            if (var44 < 800) {
                class87.field1703 = class173.method1158(-3, new class173[] { class109.field2037, class93.method588(var44 / 8, true), class22.field482 });
                class87.field1696 = 60;
            } else {
                class158.method1040(class40.field830, (byte) 86);
                class99.method607(arg0 - 100, class40.field830);
                class217.method1420(class143.field2683, class40.field830, (byte) 53);
                class56.method363(101, class108.field2016, class107.field2003, class143.field2683);
                class208.method1375(class38.field805, class143.field2683, true);
                class62.method395(class175.field3446, class134.field2548, class84.field1672, class143.field2683, -1);
                class116.method708(15069, class179.field3522, class175.field3444, class15.field347);
                class87.method559(arg0 - 186, class143.field2683, class159.field2976);
                class57.method365((byte) 0, class182.field3584);
                class160.method1047((byte) -105, class40.field830);
                class149.method984(class160.field2982, class143.field2683, (byte) 115, class58.field1152, class145.field2700);
                class34.method269(16024, class40.field830);
                class191.method1276(class140.field2605, false);
                class87.field1696 = 60;
                class87.field1703 = class36.field772;
                class126.method807(-1);
                class195.field3785 = 80;
            }
        } else if (class195.field3785 == 80) {
            int var45 = 0;
            if (class71.field1386 == null) {
                class71.field1386 = class117.method713(21313, class145.field2700, class126.field2390, class208.field4049);
            } else {
                var45++;
            }
            if (class139.field2600 == null) {
                class139.field2600 = class193.method1285(class145.field2700, (byte) -124, class181.field3560, class208.field4049);
            } else {
                var45++;
            }
            if (class46.field971 == null) {
                class46.field971 = class47.method327(class208.field4049, (byte) 96, class75.field1474, class145.field2700);
            } else {
                var45++;
            }
            if (class81.field1593 == null) {
                class81.field1593 = class47.method327(class208.field4049, (byte) 96, class63.field1238, class145.field2700);
            } else {
                var45++;
            }
            if (class26.field547 == null) {
                class26.field547 = class47.method327(class208.field4049, (byte) 96, class46.field979, class145.field2700);
            } else {
                var45++;
            }
            if (class211.field4080 == null) {
                class211.field4080 = class47.method327(class208.field4049, (byte) 96, class190.field3720, class145.field2700);
            } else {
                var45++;
            }
            if (class203.field3954 == null) {
                class203.field3954 = class47.method327(class208.field4049, (byte) 96, class211.field4093, class145.field2700);
            } else {
                var45++;
            }
            if (class14.field302 == null) {
                class14.field302 = class47.method327(class208.field4049, (byte) 96, class20.field449, class145.field2700);
            } else {
                var45++;
            }
            if (class11.field178 == null) {
                class11.field178 = class47.method327(class208.field4049, (byte) 96, class166.field3193, class145.field2700);
            } else {
                var45++;
            }
            if (class31.field665 == null) {
                class31.field665 = class117.method713(21313, class145.field2700, class52.field1067, class208.field4049);
            } else {
                var45++;
            }
            if (class25.field541 == null) {
                class25.field541 = class47.method327(class208.field4049, (byte) 96, class157.field2946, class145.field2700);
            } else {
                var45++;
            }
            if (class82.field1600 == null) {
                class82.field1600 = class47.method327(class208.field4049, (byte) 96, class29.field594, class145.field2700);
            } else {
                var45++;
            }
            if (class82.field1604 == null) {
                class82.field1604 = class193.method1285(class145.field2700, (byte) 83, class120.field2212, class208.field4049);
            } else {
                var45++;
            }
            if (class48.field1029 == null) {
                class48.field1029 = class193.method1285(class145.field2700, (byte) 52, class51.field1055, class208.field4049);
            } else {
                var45++;
            }
            if (class208.field4041 == null) {
                class208.field4041 = class193.method1285(class145.field2700, (byte) 56, class208.field4050, class208.field4049);
            } else {
                var45++;
            }
            if (var45 < 15) {
                class87.field1703 = class173.method1158(arg0 - 103, new class173[] { class31.field655, class93.method588(var45 * 100 / 13, true), class22.field482 });
                class87.field1696 = 70;
            } else {
                class7.field130.method537(class48.field1029, null);
                class150.field2851.method537(class48.field1029, null);
                class158.field2955.method537(class48.field1029, null);
                if (class7.field130 != class134.field2548) {
                    class134.field2548.method537(class48.field1029, null);
                }
                for (int var46 = 0; var46 < class11.field178.length; var46++) {
                    class11.field178[var46].method1211();
                }
                for (int var47 = 0; var47 < class208.field4041.length; var47++) {
                    class208.field4041[var47].method290();
                }
                class71.field1386.method1211();
                int var48 = (int) (Math.random() * 21.0D) - 10;
                int var49 = (int) (Math.random() * 21.0D) - 10;
                int var50 = (int) (Math.random() * 41.0D) - 20;
                int var51 = (int) (Math.random() * 21.0D) - 10;
                for (int var52 = 0; var52 < class46.field971.length; var52++) {
                    class46.field971[var52].method1220(var48 + var50, var51 - -var50, var49 + var50);
                }
                class139.field2600[0].method292(var48 + var50, var50 + var51, var49 + var50);
                class87.field1703 = class15.field346;
                class87.field1696 = 70;
                class195.field3785 = 90;
            }
        } else if (class195.field3785 == 90) {
            if (class93.field1747.method122(-123)) {
                class186 var53 = new class186(class93.field1747, class145.field2700, 20, class107.field2003 ? 64 : 128);
                class72.method443(var53);
                class72.method438(0.7F);
                class87.field1696 = 90;
                class87.field1703 = class171.field3312;
                class195.field3785 = 110;
            } else {
                class87.field1703 = class173.method1158(-3, new class173[] { class129.field2438, class93.method588(class93.field1747.method127(false), true), class22.field482 });
                class87.field1696 = 90;
            }
        } else if (class195.field3785 == 110) {
            class160.field2986 = new class3();
            class64.field1264.method835(10, -24542, class160.field2986);
            class195.field3785 = 120;
            class87.field1703 = class122.field2298;
            class87.field1696 = 94;
        } else if (class195.field3785 == 120) {
            if (class187.field3659.method130(class208.field4049, false, class155.field2929)) {
                class36 var54 = new class36(class187.field3659.method121(class208.field4049, class155.field2929, -72));
                class172.method1109(0, var54);
                class87.field1703 = class221.field4243;
                class87.field1696 = 96;
                class195.field3785 = 130;
            } else {
                class87.field1703 = class173.method1158(-3, new class173[] { class176.field3455, class187.field3646 });
                class87.field1696 = 96;
            }
        } else if (class195.field3785 == 130) {
            if (!class160.field2982.method122(-122)) {
                class87.field1703 = class173.method1158(-3, new class173[] { class63.field1236, class93.method588(class160.field2982.method127(false) * 4 / 5, true), class22.field482 });
                class87.field1696 = 100;
            } else if (!class54.field1091.method122(-114)) {
                class87.field1703 = class173.method1158(arg0 - 103, new class173[] { class63.field1236, class93.method588(80 - -(class54.field1091.method127(false) / 6), true), class22.field482 });
                class87.field1696 = 100;
            } else if (class58.field1152.method122(-120)) {
                class87.field1696 = 100;
                class87.field1703 = class99.field1804;
                class195.field3785 = 140;
            } else {
                class87.field1703 = class173.method1158(arg0 - 103, new class173[] { class63.field1236, class93.method588(class58.field1152.method127(false) / 20 + 96, true), class22.field482 });
                class87.field1696 = 100;
            }
        } else if (class195.field3785 == 140) {
            class111.field2054.method136(false, true, (byte) -98);
            class114.field2106.method136(true, true, (byte) -128);
            class145.field2700.method136(true, true, (byte) -120);
            class58.field1152.method136(true, true, (byte) -119);
            class187.field3659.method136(true, true, (byte) -97);
            class148.method978(10, 8780);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field640++;
        try {
            if (arg0.length != 7) {
                class190.method1270(1);
            }
            class133.field2521 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class105.field1970 = 0;
            } else if (arg0[1].equals("office")) {
                class105.field1970 = 1;
            } else if (arg0[1].equals("local")) {
                class105.field1970 = 2;
            } else {
                class190.method1270(1);
            }
            if (arg0[2].equals("live")) {
                class164.field3045 = 0;
            } else if (arg0[2].equals("rc")) {
                class164.field3045 = 1;
            } else if (arg0[2].equals("wip")) {
                class164.field3045 = 2;
            } else {
                class190.method1270(1);
            }
            if (arg0[3].equals("lowmem")) {
                class217.method1419((byte) 121);
            } else if (arg0[3].equals("highmem")) {
                class199.method1322(0);
            } else {
                class190.method1270(1);
            }
            if (arg0[4].equals("free")) {
                class175.field3446 = false;
            } else if (arg0[4].equals("members")) {
                class175.field3446 = true;
            } else {
                class190.method1270(1);
            }
            if (arg0[5].equals("english")) {
                class48.field1013 = 0;
            } else if (arg0[5].equals("german")) {
                class219.method1431(32);
                class48.field1013 = 1;
                class208.field4052 = class36.field782;
            } else {
                class190.method1270(1);
            }
            if (arg0[6].equals("game0")) {
                class48.field1022 = 0;
            } else if (arg0[6].equals("game1")) {
                class48.field1022 = 1;
            } else {
                class190.method1270(1);
            }
            class164.field3034 = 0;
            class59.field1166 = class208.field4049;
            class51.field1046 = "127.0.0.1";
            client var1 = new client();
            var1.method1108(489, class164.field3045 + 32, 503, 23, "runescape", (byte) -104, 765);
            class31.field653.setLocation(40, 40);
        } catch (Exception var3) {
            class74.method461((byte) -117, var3, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method241(int arg0) {
        field628++;
        if (class24.field525 != 1000 && arg0 == 3) {
            boolean var2 = class150.method987(12820);
            if (!var2) {
                this.method242(-1);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method242(int arg0) {
        field624++;
        if (class214.field4159 >= 4) {
            this.method1103("js5crc", (byte) 55);
            class24.field525 = 1000;
            return;
        }
        if (class125.field2361 >= 4) {
            if (class24.field525 <= 5) {
                this.method1103("js5io", (byte) 55);
                class24.field525 = 1000;
                return;
            }
            class125.field2361 = 3;
            class182.field3575 = 3000;
        }
        if (arg0 > ~class182.field3575--) {
            return;
        }
        try {
            if (class149.field2837 == 0) {
                class66.field1292 = class64.field1264.method833(class67.field1296, (byte) -108, class51.field1046);
                class149.field2837++;
            }
            if (class149.field2837 == 1) {
                if (class66.field1292.field4254 == 2) {
                    this.method244(-1, (byte) 34);
                    return;
                }
                if (class66.field1292.field4254 == 1) {
                    class149.field2837++;
                }
            }
            if (class149.field2837 == 2) {
                class100.field1826 = new class170((Socket) class66.field1292.field4256, class64.field1264);
                class121 var2 = new class121(5);
                var2.method752(15, (byte) -128);
                var2.method775(732495312, 489);
                class100.field1826.method1097(0, var2.field2218, 5, (byte) -84);
                class149.field2837++;
                class187.field3639 = class97.method599(arg0 ^ 0xFFFFFFFA);
            }
            if (class149.field2837 == 3) {
                if (class24.field525 <= 5 || class100.field1826.method1094(arg0 + 1) > 0) {
                    int var3 = class100.field1826.method1096(-31883);
                    if (var3 != 0) {
                        this.method244(var3, (byte) 34);
                        return;
                    }
                    class149.field2837++;
                } else if (class97.method599(5) - class187.field3639 > 30000L) {
                    this.method244(-2, (byte) 34);
                    return;
                }
            }
            if (class149.field2837 == 4) {
                class193.method1283(-123, class100.field1826, class24.field525 > 20);
                class100.field1826 = null;
                class149.field2837 = 0;
                class42.field863 = 0;
                class66.field1292 = null;
            }
        } catch (IOException var4) {
            this.method244(-3, (byte) 34);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method243(byte arg0) {
        boolean var2 = class106.method654((byte) 84);
        field625++;
        if (arg0 < 3) {
            return;
        }
        if (var2 && class138.field2588 && class140.field2604 != null) {
            class140.field2604.method494(2000);
        }
        if (class22.field483) {
            class109.method665(false, class165.field3183);
            class152.method999(class165.field3183, true);
            if (class161.field2994 != null) {
                class161.field2994.method339(class165.field3183, 1);
            }
            this.method1112((byte) -42);
            class30.method232(58, class165.field3183);
            class134.method851(class165.field3183, false);
            if (class161.field2994 != null) {
                class161.field2994.method338(class165.field3183, 64);
            }
        }
        if (class24.field525 == 0) {
            class79.method478(0, null, class87.field1703, class87.field1696);
        } else if (class24.field525 == 5) {
            class100.method615(-20, class7.field130, class158.field2955);
        } else if (class24.field525 == 10) {
            class100.method615(-20, class7.field130, class158.field2955);
        } else if (class24.field525 == 20) {
            class100.method615(-20, class7.field130, class158.field2955);
        } else if (class24.field525 == 25) {
            if (class119.field2185 == 1) {
                if (class89.field1722 < class197.field3834) {
                    class89.field1722 = class197.field3834;
                }
                int var4 = (class89.field1722 - class197.field3834) * 50 / class89.field1722;
                class140.method876(class173.method1158(-3, new class173[] { class221.field4252, class93.field1753, class93.method588(var4, true), class165.field3160 }), false, -14911);
            } else if (class119.field2185 == 2) {
                if (class51.field1058 < class217.field4197) {
                    class51.field1058 = class217.field4197;
                }
                int var3 = (class51.field1058 - class217.field4197) * 50 / class51.field1058 + 50;
                class140.method876(class173.method1158(-3, new class173[] { class221.field4252, class93.field1753, class93.method588(var3, true), class165.field3160 }), false, -14911);
            } else {
                class140.method876(class221.field4252, false, -14911);
            }
        } else if (class24.field525 == 30) {
            class215.method1412((byte) -62);
        } else if (class24.field525 == 40) {
            class140.method876(class173.method1158(-3, new class173[] { class127.field2393, class117.field2163, field644 }), false, -14911);
        }
        if (class24.field525 == 30 && class114.field2117 == 0 && !class202.field3912) {
            try {
                Graphics var7 = class165.field3183.getGraphics();
                for (int var8 = 0; var8 < class67.field1297; var8++) {
                    if (class177.field3477[var8]) {
                        class67.field1307.method410(var7, (byte) 127, class145.field2707[var8], class36.field776[var8], class167.field3215[var8], class179.field3520[var8]);
                        class177.field3477[var8] = false;
                    }
                }
            } catch (Exception var9) {
                class165.field3183.repaint();
            }
        } else if (class24.field525 > 0) {
            try {
                Graphics var5 = class165.field3183.getGraphics();
                class67.field1307.method411(0, 0, var5, 91);
                class202.field3912 = false;
                for (int var6 = 0; var6 < class67.field1297; var6++) {
                    class177.field3477[var6] = false;
                }
            } catch (Exception var10) {
                class165.field3183.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method244(int arg0, byte arg1) {
        class42.field863++;
        if (class67.field1296 == class111.field2056) {
            class67.field1296 = class25.field535;
        } else {
            class67.field1296 = class111.field2056;
        }
        field627++;
        class66.field1292 = null;
        if (arg1 != 34) {
            return;
        }
        class149.field2837 = 0;
        class100.field1826 = null;
        if (class42.field863 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class24.field525 <= 5) {
                this.method1103("js5connect_full", (byte) 55);
                class24.field525 = 1000;
            } else {
                class182.field3575 = 3000;
            }
        } else if (class42.field863 >= 2 && arg0 == 6) {
            this.method1103("js5connect_outofdate", (byte) 55);
            class24.field525 = 1000;
        } else if (class42.field863 >= 4) {
            if (class24.field525 > 5) {
                class182.field3575 = 3000;
            } else {
                this.method1103("js5connect", (byte) 55);
                class24.field525 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field639++;
        if (!this.method1114(-1)) {
            return;
        }
        class133.field2521 = Integer.parseInt(this.getParameter("worldid"));
        class164.field3045 = Integer.parseInt(this.getParameter("modewhat"));
        class105.field1970 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class217.method1419((byte) 121);
        } else {
            class199.method1322(0);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class175.field3446 = true;
        } else {
            class175.field3446 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class219.method1431(32);
            class208.field4052 = class36.field782;
            class48.field1013 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class48.field1022 = 1;
        } else {
            class48.field1022 = 0;
        }
        try {
            class221.field4241 = Integer.parseInt(this.getParameter("js"));
            class96.field1770 = Integer.parseInt(this.getParameter("plug"));
            class164.field3034 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var5) {
        }
        class59.field1166 = class199.field3864.method1126(this, (byte) 126);
        if (class59.field1166 == null) {
            class59.field1166 = class208.field4049;
        }
        class51.field1046 = this.getCodeBase().getHost();
        this.method1104(class164.field3045 + 32, false, 765, 503, 489);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method245(byte arg0) {
        if (class160.field2986 != null) {
            class160.field2986.field31 = false;
        }
        class160.field2986 = null;
        if (class34.field738 != null) {
            class34.field738.method1095((byte) 126);
            class34.field738 = null;
        }
        class109.method665(false, class165.field3183);
        class152.method999(class165.field3183, true);
        field641++;
        int var2 = -115 % ((arg0 - 41) / 60);
        if (class161.field2994 != null) {
            class161.field2994.method339(class165.field3183, 1);
        }
        class4.method31(-11);
        class99.method605(-17429);
        class161.field2994 = null;
        if (class140.field2604 != null) {
            class140.field2604.method481((byte) -76);
        }
        if (class60.field1199 != null) {
            class60.field1199.method481((byte) -76);
        }
        class76.method470(-9691);
        class81.method503(-17448);
        try {
            if (class202.field3895 != null) {
                class202.field3895.method1012(7416);
            }
            if (class73.field1430 != null) {
                for (int var3 = 0; var3 < class73.field1430.length; var3++) {
                    if (class73.field1430[var3] != null) {
                        class73.field1430[var3].method1012(7416);
                    }
                }
            }
            if (class191.field3732 != null) {
                class191.field3732.method1012(7416);
            }
            if (class219.field4217 != null) {
                class219.field4217.method1012(7416);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method246(int arg0) {
        class217.field4203++;
        if (class217.field4203 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class73.field1433 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class126.field2368.setSeed((long) class73.field1433);
        }
        field638++;
        this.method241(3);
        class158.method1039(false);
        class67.method418(65535);
        if (arg0 != 140) {
            field644 = null;
        }
        class196.method1305(-112);
        class203.method1347(arg0 - 5613);
        class143.method902((byte) -107);
        if (class161.field2994 != null) {
            int var3 = class161.field2994.method340(true);
            class166.field3202 = var3;
        }
        if (class24.field525 == 0) {
            this.method240(100);
            class199.method1320(0);
        } else if (class24.field525 == 5) {
            class47.method331(this, (byte) 7);
            this.method240(100);
            class199.method1320(0);
        } else if (class24.field525 == 10) {
            class47.method331(this, (byte) 7);
        } else if (class24.field525 == 20) {
            class47.method331(this, (byte) 7);
            class54.method354((byte) -5);
        } else if (class24.field525 == 25) {
            class82.method512(-6);
        }
        if (class24.field525 == 30) {
            class73.method453((byte) 100);
        } else if (class24.field525 == 40) {
            class54.method354((byte) -5);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public static void method247(byte arg0) {
        if (arg0 <= 62) {
            field630 = null;
        }
        field629 = null;
        field630 = null;
        field642 = null;
        field646 = null;
        field637 = null;
        field644 = null;
        field623 = null;
        field632 = null;
        field634 = null;
        field645 = null;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method248(byte arg0) {
        field631++;
        method247((byte) 97);
        class173.method1139((byte) -87);
        class172.method1106((byte) 106);
        class38.method284(83);
        class84.method549(-137);
        class3.method21(false);
        class67.method420((byte) -127);
        class121.method765(false);
        class170.method1098(55);
        class1.method3(false);
        class153.method1011(255);
        class111.method671(-26956);
        class120.method730(2);
        class155.method1028(-68);
        class177.method1186(127);
        class165.method1068((byte) -24);
        class212.method1390((byte) -122);
        class145.method917(-15);
        class112.method682((byte) 95);
        class190.method1271((byte) 91);
        class55.method356((byte) 122);
        class135.method853(-2);
        class79.method487((byte) -73);
        class26.method201(-88);
        if (arg0 < 74) {
            field623 = null;
        }
        class114.method697(14058);
        class178.method1202(12);
        class147.method969(0);
        class189.method1264(false);
        class45.method313((byte) -5);
        class157.method1036(106);
        class129.method825(5);
        class42.method305((byte) 126);
        class12.method72((byte) -96);
        class7.method48(-1);
        class213.method1396();
        class54.method352(-1);
        class17.method152(-17624);
        class105.method650(0);
        class5.method42(-17165);
        class126.method804((byte) -96);
        class35.method275((byte) -123);
        class107.method655(-118);
        class216.method1415((byte) 54);
        class22.method186(false);
        class141.method896();
        class52.method351((byte) -104);
        class132.method841();
        class101.method617(29530);
        class15.method145(88);
        class71.method432(-28078);
        class179.method1204(1);
        class97.method598((byte) -33);
        class68.method423(1171);
        class144.method906((byte) 125);
        class14.method123(false);
        class13.method84(1933848104);
        class151.method992(false);
        class8.method56((byte) 109);
        class66.method416(120);
        class40.method296(-3903);
        class204.method1356(33);
        class176.method1173((byte) -64);
        class122.method788(false);
        class119.method724(127);
        class220.method1436(-3);
        class56.method358(false);
        class28.method226(-22);
        class181.method1234(false);
        class27.method222();
        class30.method234(59);
        class72.method435();
        class60.method383(-96);
        class200.method1336();
        class133.method847((byte) 90);
        class194.method1288(0);
        class25.method194(112);
        class211.method1388((byte) 115);
        class196.method1309(1);
        class4.method26(110);
        class59.method376(0);
        class19.method163(127);
        class102.method622();
        class41.method301((byte) -127);
        class123.method793((byte) 45);
        class131.method840((byte) -81);
        class207.method1370((byte) 82);
        class139.method866(-54);
        class108.method658((byte) 69);
        class83.method532();
        class186.method1250((byte) -122);
        class57.method371((byte) -1);
        class36.method279(-249);
        class140.method871((byte) 84);
        class138.method864(0);
        class152.method997((byte) 0);
        class37.method282(-52);
        class87.method562((byte) -62);
        class116.method707(-121);
        class215.method1410(0);
        class9.method63(-7329);
        class117.method712(-115);
        class161.method1049(310);
        class217.method1421(-112);
        class44.method311();
        class46.method322((byte) 68);
        class100.method614(45);
        class76.method466(30335);
        class205.method1362((byte) 93);
        class166.method1075(-78);
        class93.method589(100);
        class175.method1167(32);
        class118.method715(-1);
        class158.method1037((byte) -36);
        class92.method584((byte) -17);
        class47.method329(1);
        class99.method610(69);
        class94.method592(false);
        class34.method266(33);
        class198.method1316(-126);
        class24.method192(-97);
        class201.method1339();
        class61.method388();
        class109.method666(false);
        class171.method1102(-19967);
        class136.method856();
        class148.method977(false);
        class104.method645((byte) -26);
        class90.method574();
        class70.method430(true);
        class43.method308((byte) -126);
        class134.method849(true);
        class128.method816();
        class50.method347();
        class18.method156(125);
        class183.method1243(true);
        class199.method1321(-16860);
        class91.method581((byte) -83);
        class191.method1275(-91);
        class202.method1346(0);
        class82.method508(-710177144);
        class103.method641(-105);
        class203.method1348((byte) -10);
        class98.method600(-6561);
        class127.method808((byte) 124);
        class96.method595(-44);
        class78.method472(3);
        class51.method349(3291);
        class159.method1043(255);
        class214.method1406(0);
        class48.method333(true);
        class219.method1429(-20843);
        class174.method1162((byte) -68);
        class23.method187(true);
        class164.method1059(-15);
        class208.method1378(-118615391);
        class168.method1083(-35);
        class169.method1092(4096);
        class143.method905((byte) -12);
        class187.method1254(20342);
        class160.method1046(-99);
        class182.method1239(-1);
        class193.method1284(110);
        class69.method426((byte) -128);
        class110.method667(0);
        class64.method404(0);
        class149.method982((byte) -117);
        class195.method1296(true);
        class209.method1381((byte) -23);
        class163.method1052(103);
        class75.method462((byte) -123);
        class80.method500((byte) -112);
        class20.method180((byte) -121);
        class74.method459(-109);
        class31.method253(16777216);
        class29.method228(true);
        class223.method1441((byte) -128);
        class188.method1260(122);
        class63.method402(1560916428);
        class125.method802(false);
        class150.method986(765);
        class81.method504(-128);
        class167.method1078(127);
        class58.method375(0);
        class184.method1247(0);
        class106.method651(-2);
        class21.method182(14340);
        class11.method69(113);
        class221.method1437(-117);
        class62.method397(-128);
        class73.method451((byte) 9);
        class197.method1311(true);
        class124.method800(-103);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method249(int arg0) {
        field635++;
        class25.field535 = class105.field1970 == 0 ? 443 : class133.field2521 + 50000;
        class111.field2056 = class105.field1970 == 0 ? 43594 : class133.field2521 + 40000;
        if (class48.field1022 == 1) {
            class147.field2767 = class101.field1849;
            class52.field1071 = class189.field3709;
            class164.field3043 = class211.field4084;
            class158.field2965 = class46.field982;
        } else {
            class147.field2767 = class190.field3721;
            class52.field1071 = class68.field1320;
            class164.field3043 = class123.field2315;
            class158.field2965 = class51.field1057;
        }
        class67.field1296 = class111.field2056;
        class30.method235(190);
        class30.method232(arg0 + 78, class165.field3183);
        class134.method851(class165.field3183, false);
        class161.field2994 = class171.method1100(arg0 + 19);
        if (arg0 != -20) {
            return;
        }
        if (class161.field2994 != null) {
            class161.field2994.method338(class165.field3183, arg0 + 84);
        }
        class14.field304 = class130.field2454;
        try {
            if (class64.field1264.field2457 != null) {
                class202.field3895 = new class153(class64.field1264.field2457, 5200, 0);
                for (int var2 = 0; var2 < 23; var2++) {
                    class73.field1430[var2] = new class153(class64.field1264.field2448[var2], 6000, 0);
                }
                class191.field3732 = new class153(class64.field1264.field2452, 6000, 0);
                class197.field3848 = new class111(255, class202.field3895, class191.field3732, 500000);
                class219.field4217 = new class153(class64.field1264.field2463, 24, 0);
                class64.field1264.field2448 = null;
                class64.field1264.field2463 = null;
                class64.field1264.field2452 = null;
                class64.field1264.field2457 = null;
            }
        } catch (IOException var3) {
            class202.field3895 = null;
            class197.field3848 = null;
            class191.field3732 = null;
            class219.field4217 = null;
        }
        if (class105.field1970 != 0) {
            class57.field1128 = true;
        }
    }
}
