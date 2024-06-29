import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class151 {

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lbe;")
    private class13 field3457 = new class13();

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lec;")
    public static class32 field3458 = class73.method594(")4l", true);

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Lec;")
    private static class32 field3463 = class73.method594("b12_full", true);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3455 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lec;")
    public static class32 field3468 = class73.method594(" <col=ffff00>", true);

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Lec;")
    private static class32 field3464 = class73.method594("Loading textures )2 ", true);

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Z")
    public static boolean field3470 = false;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static volatile int field3469 = 0;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "Lec;")
    public static class32 field3471 = class73.method594(" weitere Optionen", true);

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field3474 = 99;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "Lec;")
    private static class32 field3475 = class73.method594("cyan:", true);

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Lec;")
    public static class32 field3472 = field3475;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lec;")
    public static class32 field3465 = field3475;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "Lec;")
    public static class32 field3473 = class73.method594("Schrifts-=tze geladen)3", true);

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Lec;")
    public static class32 field3466 = field3464;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Lea;")
    public static class30 field3456;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3467;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLbe;)V")
    public final void method1170(byte arg0, class13 arg1) {
        if (arg1.field216 != null) {
            arg1.method68(false);
        }
        arg1.field216 = this.field3457;
        arg1.field212 = this.field3457.field212;
        field3460++;
        int var3 = -64 % ((46 - arg0) / 34);
        arg1.field216.field212 = arg1;
        arg1.field212.field216 = arg1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public static void method1171(boolean arg0) {
        field3463 = null;
        field3455 = null;
        field3471 = null;
        if (arg0) {
            method1171(false);
        }
        field3456 = null;
        field3473 = null;
        field3464 = null;
        field3468 = null;
        field3467 = null;
        field3465 = null;
        field3475 = null;
        field3472 = null;
        field3466 = null;
        field3458 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Lbe;")
    public final class13 method1172(byte arg0) {
        class13 var2 = this.field3457.field212;
        if (arg0 > -73) {
            this.method1172((byte) 62);
        }
        field3459++;
        return this.field3457 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lbe;I)V")
    public final void method1173(class13 arg0, int arg1) {
        if (arg0.field216 != null) {
            arg0.method68(false);
        }
        arg0.field212 = this.field3457;
        arg0.field216 = this.field3457.field216;
        if (arg1 != 2048) {
            this.method1173(null, -63);
        }
        arg0.field216.field212 = arg0;
        field3462++;
        arg0.field212.field216 = arg0;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
    public static final void method1174(byte arg0) {
        field3461++;
        if (class13.field221 == 0) {
            class159.field3659 = new class150(4, 104, 104, class70.field1631);
            for (int var1 = 0; var1 < 4; var1++) {
                class105.field2484[var1] = new class117(104, 104);
            }
            class142.field3254 = new class49(512, 512);
            class13.field221 = 20;
            class74.field1744 = class8.field155;
            class8.field142 = 5;
        } else if (class13.field221 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class7.field113[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class150.method1129(var2, 500, 800, 512, 334);
            class8.field142 = 10;
            class74.field1744 = class83.field1940;
            class13.field221 = 30;
        } else if (class13.field221 == 30) {
            class92.field2126 = class132.method1009(0, (byte) 126, true, false, true);
            class38.field924 = class132.method1009(1, (byte) 126, true, false, true);
            class64.field1489 = class132.method1009(2, (byte) 120, true, true, false);
            class66.field1533 = class132.method1009(3, (byte) 125, true, false, true);
            class1.field6 = class132.method1009(4, (byte) 122, true, false, true);
            class134.field3117 = class132.method1009(5, (byte) 123, true, true, true);
            class124.field2889 = class132.method1009(6, (byte) 123, false, true, true);
            class147.field3348 = class132.method1009(7, (byte) 127, true, false, true);
            class30.field572 = class132.method1009(8, (byte) 124, true, false, true);
            class82.field1921 = class132.method1009(9, (byte) 119, true, false, true);
            class72.field1702 = class132.method1009(10, (byte) 127, true, false, true);
            class98.field2270 = class132.method1009(11, (byte) 124, true, false, true);
            class98.field2248 = class132.method1009(12, (byte) 127, true, false, true);
            class157.field3598 = class132.method1009(13, (byte) 124, true, true, false);
            class103.field2426 = class132.method1009(14, (byte) 121, false, false, true);
            class146.field3319 = class132.method1009(15, (byte) 124, true, false, true);
            class8.field142 = 20;
            class74.field1744 = class70.field1627;
            class13.field221 = 40;
        } else if (class13.field221 == 40) {
            byte var7 = 0;
            int var8 = var7 + class92.field2126.method339(20181) * 4 / 100;
            int var9 = var8 + class38.field924.method339(20181) * 4 / 100;
            int var10 = var9 + class64.field1489.method339(arg0 + 20273) * 2 / 100;
            int var11 = var10 + class66.field1533.method339(arg0 ^ 0xFFFFB171) * 2 / 100;
            int var12 = var11 + class1.field6.method339(20181) * 6 / 100;
            int var13 = var12 + class134.field3117.method339(20181) * 4 / 100;
            int var14 = var13 + class124.field2889.method339(20181) * 2 / 100;
            int var15 = var14 + class147.field3348.method339(arg0 + 20273) * 60 / 100;
            int var16 = var15 + class30.field572.method339(20181) * 2 / 100;
            int var17 = var16 + class82.field1921.method339(20181) * 2 / 100;
            int var18 = var17 + class72.field1702.method339(20181) * 2 / 100;
            int var19 = var18 + class98.field2270.method339(20181) * 2 / 100;
            int var20 = var19 + class98.field2248.method339(20181) * 2 / 100;
            int var21 = var20 + class157.field3598.method339(20181) * 2 / 100;
            int var22 = var21 + class103.field2426.method339(20181) * 2 / 100;
            int var23 = var22 + class146.field3319.method339(20181) * 2 / 100;
            if (var23 == 100) {
                class74.field1744 = class105.field2487;
                class13.field221 = 45;
                class8.field142 = 30;
            } else {
                if (var23 != 0) {
                    class74.field1744 = class52.method403(new class32[] { class54.field1275, class159.method1230(var23, arg0 + 92), class128.field2938 }, (byte) -20);
                }
                class8.field142 = 30;
            }
        } else if (class13.field221 == 45) {
            class13.method71(!class154.field3531, 22050, arg0 - 14130, 2);
            class15 var24 = new class15();
            var24.method86((byte) -108, 9, 128);
            class36.field745 = class64.method495(class154.field3518, 0, 22050, (byte) 62, class107.field2541);
            class36.field745.method892(var24, 256000);
            class47.method350(class1.field6, class103.field2426, var24, (byte) 19, class146.field3319);
            class29.field525 = class64.method495(class154.field3518, 1, 2048, (byte) 62, class107.field2541);
            class37.field882 = new class116();
            class29.field525.method892(class37.field882, 256000);
            class130.field3009 = new class33(22050, class139.field3213);
            class13.field221 = 50;
            class8.field142 = 35;
            class74.field1744 = class57.field1327;
        } else if (class13.field221 == 50) {
            int var25 = 0;
            if (client.field392 == null) {
                client.field392 = class112.method881((byte) -62, class30.field572, class157.field3598, class77.field1787, class50.field1156);
            } else {
                var25++;
            }
            if (class121.field2878 == null) {
                class121.field2878 = class112.method881((byte) -68, class30.field572, class157.field3598, class77.field1787, class64.field1488);
            } else {
                var25++;
            }
            if (class38.field914 == null) {
                class38.field914 = class112.method881((byte) -59, class30.field572, class157.field3598, class77.field1787, field3463);
            } else {
                var25++;
            }
            if (var25 < 3) {
                class74.field1744 = class52.method403(new class32[] { class73.field1730, class159.method1230(var25 * 100 / 3, 0), class128.field2938 }, (byte) -20);
                class8.field142 = 40;
            } else {
                class74.field1744 = class29.field528;
                class8.field142 = 40;
                class13.field221 = 60;
            }
        } else if (class13.field221 == 60) {
            int var26 = class142.method1076(-27706, class30.field572, class72.field1702);
            int var27 = class112.method885(-104);
            if (var27 > var26) {
                class74.field1744 = class52.method403(new class32[] { class85.field1987, class159.method1230(var26 * 100 / var27, 0), class128.field2938 }, (byte) -20);
                class8.field142 = 50;
            } else {
                class8.field142 = 50;
                class74.field1744 = class52.field1183;
                class54.method426(0, 5);
                class13.field221 = 70;
            }
        } else if (class13.field221 != 70) {
            if (arg0 != -92) {
                field3463 = null;
            }
            if (class13.field221 == 80) {
                int var28 = 0;
                if (class3.field46 == null) {
                    class3.field46 = class2.method8(class30.field572, class77.field1787, class29.field536, 32554);
                } else {
                    var28++;
                }
                if (class48.field1138 == null) {
                    class48.field1138 = class2.method8(class30.field572, class77.field1787, class3.field51, 32554);
                } else {
                    var28++;
                }
                if (class62.field1435 == null) {
                    class62.field1435 = class56.method444(class77.field1787, class23.field422, -11, class30.field572);
                } else {
                    var28++;
                }
                if (class111.field2603 == null) {
                    class111.field2603 = class62.method475(class134.field3124, class30.field572, true, class77.field1787);
                } else {
                    var28++;
                }
                if (class30.field587 == null) {
                    class30.field587 = class62.method475(class31.field595, class30.field572, true, class77.field1787);
                } else {
                    var28++;
                }
                if (class30.field578 == null) {
                    class30.field578 = class62.method475(class100.field2317, class30.field572, true, class77.field1787);
                } else {
                    var28++;
                }
                if (class9.field168 == null) {
                    class9.field168 = class62.method475(class4.field64, class30.field572, true, class77.field1787);
                } else {
                    var28++;
                }
                if (class131.field3021 == null) {
                    class131.field3021 = class62.method475(class4.field69, class30.field572, true, class77.field1787);
                } else {
                    var28++;
                }
                if (class97.field2235 == null) {
                    class97.field2235 = class62.method475(class50.field1163, class30.field572, true, class77.field1787);
                } else {
                    var28++;
                }
                if (class1.field2 == null) {
                    class1.field2 = class62.method475(class52.field1179, class30.field572, true, class77.field1787);
                } else {
                    var28++;
                }
                if (class28.field515 == null) {
                    class28.field515 = class62.method475(class144.field3285, class30.field572, true, class77.field1787);
                } else {
                    var28++;
                }
                if (class98.field2254 == null) {
                    class98.field2254 = class56.method444(class77.field1787, class143.field3276, arg0 ^ 0x51, class30.field572);
                } else {
                    var28++;
                }
                if (class132.field3038 == null) {
                    class132.field3038 = class56.method444(class77.field1787, class39.field938, -11, class30.field572);
                } else {
                    var28++;
                }
                if (class20.field369 == null) {
                    class20.field369 = class136.method1035(class77.field1787, class30.field572, false, class137.field3186);
                } else {
                    var28++;
                }
                if (var28 < 14) {
                    class74.field1744 = class52.method403(new class32[] { class63.field1460, class159.method1230(var28 * 100 / 14, 0), class128.field2938 }, (byte) -20);
                    class8.field142 = 70;
                } else {
                    class99.field2298 = class132.field3038;
                    int var29 = (int) (Math.random() * 21.0D) - 10;
                    class48.field1138.method375();
                    int var30 = (int) (Math.random() * 21.0D) - 10;
                    int var31 = (int) (Math.random() * 21.0D) - 10;
                    int var32 = (int) (Math.random() * 41.0D) - 20;
                    for (int var33 = 0; var33 < class111.field2603.length; var33++) {
                        class111.field2603[var33].method390(var29 + var32, var30 + var32, var31 + var32);
                    }
                    class62.field1435[0].method402(var29 + var32, var30 + var32, var31 + var32);
                    class107.method866((byte) -77);
                    class74.field1744 = class117.field2783;
                    class8.field142 = 70;
                    class13.field221 = 90;
                }
            } else if (class13.field221 == 90) {
                if (class82.field1921.method208(86)) {
                    class140 var34 = new class140(class82.field1921, class30.field572, 20, 0.8D, class154.field3531 ? 64 : 128);
                    class7.method41(var34);
                    class7.method29(0.8D);
                    class13.field221 = 110;
                    class74.field1744 = class129.field2982;
                    class8.field142 = 90;
                } else {
                    class74.field1744 = class52.method403(new class32[] { field3466, class159.method1230(class82.field1921.method344(0), arg0 + 92), class128.field2938 }, (byte) -20);
                    class8.field142 = 90;
                }
            } else if (class13.field221 == 110) {
                class137.field3176 = new class132();
                class154.field3518.method175(10, class137.field3176, arg0 + 197);
                class8.field142 = 94;
                class13.field221 = 120;
                class74.field1744 = class109.field2570;
            } else if (class13.field221 == 120) {
                if (class72.field1702.method210(class126.field2929, class77.field1787, -122)) {
                    class14 var35 = new class14(class72.field1702.method219(class126.field2929, arg0 ^ 0xFFFFF5A4, class77.field1787));
                    class129.method999(var35, 32767);
                    class74.field1744 = class85.field1989;
                    class8.field142 = 96;
                    class13.field221 = 130;
                } else {
                    class74.field1744 = class52.method403(new class32[] { class157.field3604, class38.field923 }, (byte) -20);
                    class8.field142 = 96;
                }
            } else if (class13.field221 == 130) {
                if (!class66.field1533.method208(arg0 ^ 0xFFFFFFFD)) {
                    class74.field1744 = class52.method403(new class32[] { class9.field167, class159.method1230(class66.field1533.method344(0) * 4 / 5, arg0 + 92), class128.field2938 }, (byte) -20);
                    class8.field142 = 100;
                } else if (!class98.field2248.method208(88)) {
                    class74.field1744 = class52.method403(new class32[] { class9.field167, class159.method1230(class98.field2248.method344(0) / 6 + 80, 0), class128.field2938 }, (byte) -20);
                    class8.field142 = 100;
                } else if (class157.field3598.method208(-115)) {
                    class13.field221 = 140;
                    class74.field1744 = class85.field1990;
                    class8.field142 = 100;
                } else {
                    class74.field1744 = class52.method403(new class32[] { class9.field167, class159.method1230(class157.field3598.method344(0) / 20 + 96, 0), class128.field2938 }, (byte) -20);
                    class8.field142 = 100;
                }
            } else if (class13.field221 == 140) {
                class54.method426(arg0 + 92, 10);
            }
        } else if (class64.field1489.method208(arg0 ^ 0xFFFFFFF6)) {
            class89.method677(class64.field1489, arg0 ^ 0xFFFFFFA7);
            class52.method410((byte) -114, class64.field1489);
            class139.method1046(class147.field3348, (byte) 5, class64.field1489);
            class74.method600(class147.field3348, 112, class154.field3531, class64.field1489);
            class136.method1036(class64.field1489, class147.field3348, (byte) 116);
            class19.method134(class147.field3348, class64.field1489, class146.field3317, client.field392, (byte) 78);
            class77.method618(class38.field924, class64.field1489, (byte) -85, class92.field2126);
            class3.method11((byte) -73, class147.field3348, class64.field1489);
            class26.method185(class64.field1489, arg0 + 92);
            class139.method1047(class64.field1489, arg0 + 108);
            class85.method660(class30.field572, true, class147.field3348, class157.field3598, class66.field1533);
            class9.method55(class64.field1489, 8);
            class98.method766(class64.field1489, -128);
            class74.field1744 = class43.field1005;
            class8.field142 = 60;
            class13.field221 = 80;
        } else {
            class74.field1744 = class52.method403(new class32[] { class66.field1553, class159.method1230(class64.field1489.method344(0), 0), class128.field2938 }, (byte) -20);
            class8.field142 = 60;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)Lbe;")
    public final class13 method1175(int arg0) {
        class13 var2 = this.field3457.field212;
        field3454++;
        if (arg0 < 84) {
            method1171(true);
        }
        if (this.field3457 == var2) {
            return null;
        } else {
            var2.method68(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class151() {
        this.field3457.field216 = this.field3457;
        this.field3457.field212 = this.field3457;
    }
}
