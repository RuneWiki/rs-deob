import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 extends class130 {

    @OriginalMember(owner = "client!kd", name = "xb", descriptor = "I")
    private int field1518 = -1;

    @OriginalMember(owner = "client!kd", name = "Cb", descriptor = "Z")
    private volatile boolean field1523 = false;

    @OriginalMember(owner = "client!kd", name = "Hb", descriptor = "Z")
    private boolean field1528 = false;

    @OriginalMember(owner = "client!kd", name = "Ob", descriptor = "I")
    private int field1535;

    @OriginalMember(owner = "client!kd", name = "Gb", descriptor = "Lve;")
    private class145 field1527;

    @OriginalMember(owner = "client!kd", name = "Ub", descriptor = "Lve;")
    private class145 field1541;

    @OriginalMember(owner = "client!kd", name = "Ab", descriptor = "[I")
    public static int[] field1521 = new int[200];

    @OriginalMember(owner = "client!kd", name = "sb", descriptor = "Loa;")
    private static class98 field1513 = class38.method349(255, "Moderator option: Mute player for 48 hours: <OFF>");

    @OriginalMember(owner = "client!kd", name = "Eb", descriptor = "Loa;")
    private static class98 field1525 = class38.method349(255, "To");

    @OriginalMember(owner = "client!kd", name = "Db", descriptor = "Z")
    public static boolean field1524 = false;

    @OriginalMember(owner = "client!kd", name = "zb", descriptor = "Loa;")
    private static class98 field1520 = class38.method349(255, "World");

    @OriginalMember(owner = "client!kd", name = "Bb", descriptor = "[I")
    public static int[] field1522 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!kd", name = "yb", descriptor = "Loa;")
    public static class98 field1519 = field1520;

    @OriginalMember(owner = "client!kd", name = "Fb", descriptor = "Loa;")
    public static class98 field1526 = class38.method349(255, "sch-Utteln:");

    @OriginalMember(owner = "client!kd", name = "Mb", descriptor = "Loa;")
    public static class98 field1533 = field1520;

    @OriginalMember(owner = "client!kd", name = "pb", descriptor = "Loa;")
    public static class98 field1510 = field1513;

    @OriginalMember(owner = "client!kd", name = "Tb", descriptor = "Loa;")
    public static class98 field1540 = field1525;

    @OriginalMember(owner = "client!kd", name = "ob", descriptor = "Ln;")
    public static class90 field1509 = new class90(64);

    @OriginalMember(owner = "client!kd", name = "mb", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!kd", name = "nb", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!kd", name = "qb", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!kd", name = "rb", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!kd", name = "tb", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!kd", name = "ub", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!kd", name = "wb", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!kd", name = "Ib", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!kd", name = "Jb", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!kd", name = "Kb", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!kd", name = "Lb", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!kd", name = "Nb", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!kd", name = "Qb", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client!kd", name = "Sb", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!kd", name = "Vb", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!kd", name = "Wb", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!kd", name = "vb", descriptor = "Loc;")
    public static class100 field1516;

    @OriginalMember(owner = "client!kd", name = "Pb", descriptor = "Lhf;")
    public static class55 field1536;

    @OriginalMember(owner = "client!kd", name = "lb", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1506;

    @OriginalMember(owner = "client!kd", name = "Rb", descriptor = "[Z")
    private volatile boolean[] field1538;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V")
    public static final void method588(byte arg0) {
        for (class126 var1 = (class126) class119.field2656.method512(72); var1 != null; var1 = (class126) class119.field2656.method513(-66)) {
            if (var1.field2813 != null) {
                class82.field1872.method1218(var1.field2813);
                var1.field2813 = null;
            }
            if (var1.field2810 != null) {
                class82.field1872.method1218(var1.field2810);
                var1.field2810 = null;
            }
        }
        ++field1542;
        class119.field2656.method519(true);
        if (arg0 != -89) {
            method600((class98) null, false, (class98) null, (class98) null);
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lve;Lve;IZZZ)V")
    public class73(class145 arg0, class145 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1535 = arg2;
        this.field1527 = arg0;
        this.field1541 = arg1;
        this.field1528 = arg5;
        class35.method335(this.field1535, this, true);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static void method589(int arg0) {
        field1519 = null;
        field1526 = null;
        field1536 = null;
        field1525 = null;
        field1506 = null;
        field1522 = null;
        field1521 = null;
        field1540 = null;
        field1520 = null;
        field1533 = null;
        field1510 = null;
        field1513 = null;
        if (arg0 == -1) {
            field1516 = null;
            field1509 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)V")
    private final void method590(byte arg0) {
        this.field1538 = new boolean[super.field3002.length];
        for (int var2 = 0; ~this.field1538.length < ~var2; ++var2) {
            this.field1538[var2] = false;
        }
        if (arg0 != 71) {
            field1533 = null;
        }
        ++field1532;
        if (this.field1527 == null) {
            this.field1523 = true;
        } else {
            this.field1518 = -1;
            for (int var3 = 0; var3 < this.field1538.length; ++var3) {
                if (~super.field3049[var3] < -1) {
                    class121.method961(true, this, var3, this.field1527);
                    this.field1518 = var3;
                }
            }
            if (this.field1518 == -1) {
                this.field1523 = true;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)V")
    public final void method591(int arg0, byte arg1) {
        if (arg1 <= 91) {
            field1533 = null;
        }
        ++field1512;
        if (this.field1527 != null && this.field1538 != null && this.field1538[arg0]) {
            class76.method623((byte) 106, this, this.field1527, arg0);
        } else {
            class44.method378((byte) 2, this.field1535, arg0, super.field3008[arg0], true, -100, this);
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public static final void method592(int arg0) {
        ++field1511;
        if (~class53.field1185 == -1) {
            class138.field3373 = new class22(4, 104, 104, class25.field616);
            for (int var1 = 0; var1 < 4; ++var1) {
                class137.field3323[var1] = new class149(104, 104);
            }
            class64.field1372 = new class60(512, 512);
            class81.field1835 = 5;
            class53.field1185 = 20;
            class80.field1759 = class1.field5;
        } else if (~class53.field1185 == -21) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; ++var3) {
                int var4 = var3 * 32 + 15 + 128;
                int var5 = class66.field1419[var4];
                int var6 = var4 * 3 + 600;
                var2[var3] = var5 * var6 >> 16;
            }
            class22.method255(var2, 500, 800, 512, 334);
            class80.field1759 = class91.field2095;
            class81.field1835 = 10;
            class53.field1185 = 30;
        } else if (class53.field1185 == 30) {
            class132.field3172 = class101.method833(true, true, false, 0, true);
            class127.field2845 = class101.method833(true, true, false, 1, true);
            client.field504 = class101.method833(true, true, true, 2, false);
            class14.field298 = class101.method833(true, true, false, 3, true);
            class15.field310 = class101.method833(true, true, false, 4, true);
            class3.field41 = class101.method833(true, true, true, 5, true);
            class121.field2714 = class101.method833(false, true, true, 6, true);
            class24.field589 = class101.method833(true, true, false, 7, true);
            class135.field3290 = class101.method833(true, true, false, 8, true);
            class57.field1270 = class101.method833(true, true, false, 9, true);
            class132.field3170 = class101.method833(true, true, false, 10, true);
            class3.field29 = class101.method833(true, true, false, 11, true);
            class123.field2748 = class101.method833(true, true, false, 12, true);
            class15.field305 = class101.method833(true, true, true, 13, false);
            class94.field2142 = class101.method833(false, true, false, 14, true);
            class98.field2299 = class101.method833(true, true, false, 15, true);
            class53.field1185 = 40;
            class80.field1759 = class94.field2141;
            class81.field1835 = 20;
        } else if (class53.field1185 == 40) {
            byte var7 = 0;
            int var8 = var7 + 4 * class132.field3172.method594(-1) / 100;
            int var9 = var8 + 4 * class127.field2845.method594(-1) / 100;
            int var10 = var9 + client.field504.method594(-1) * 2 / 100;
            int var11 = var10 + class14.field298.method594(-1) * 2 / 100;
            int var12 = var11 + class15.field310.method594(-1) * 6 / 100;
            int var13 = var12 + class3.field41.method594(-1) * 4 / 100;
            int var14 = var13 + 2 * class121.field2714.method594(-1) / 100;
            int var15 = var14 + 60 * class24.field589.method594(arg0 + 23335) / 100;
            int var16 = var15 + 2 * class135.field3290.method594(arg0 + 23335) / 100;
            int var17 = var16 + class57.field1270.method594(-1) * 2 / 100;
            int var18 = var17 + 2 * class132.field3170.method594(-1) / 100;
            int var19 = var18 + class3.field29.method594(-1) * 2 / 100;
            int var20 = var19 + class123.field2748.method594(-1) * 2 / 100;
            int var21 = var20 + class15.field305.method594(arg0 + 23335) * 2 / 100;
            int var22 = var21 + 2 * class94.field2142.method594(arg0 + 23335) / 100;
            int var23 = var22 + 2 * class98.field2299.method594(arg0 ^ 23335) / 100;
            if (~var23 != -101) {
                if (~var23 != -1) {
                    class80.field1759 = class102.method840(new class98[] { class98.field2278, class132.method1074(var23, (byte) -86), class15.field309 }, 10);
                }
                class81.field1835 = 30;
            } else {
                class80.field1759 = class140.field3427;
                class53.field1185 = 45;
                class81.field1835 = 30;
            }
        } else if (class53.field1185 == 45) {
            class86.method709(!class94.field2151, true, 22050, 2);
            class82 var24 = new class82();
            var24.method674((byte) 68, 9, 128);
            class84.field1965 = class6.method35(0, class10.field203, (byte) 114, field1506, 22050);
            class84.field1965.method651(-118, var24);
            class54.method447(class98.field2299, class94.field2142, -31700, var24, class15.field310);
            class41.field971 = class6.method35(1, class10.field203, (byte) -55, field1506, 2048);
            class82.field1872 = new class151();
            class41.field971.method651(-117, class82.field1872);
            class49.field1096 = new class21(22050, class8.field194);
            class81.field1835 = 35;
            class80.field1759 = class137.field3326;
            class53.field1185 = 50;
        } else if (~class53.field1185 == -51) {
            int var25 = 0;
            if (class145.field3525 == null) {
                class145.field3525 = class62.method501(class145.field3503, 836, class135.field3290, class3.field23);
            } else {
                ++var25;
            }
            if (class97.field2231 != null) {
                ++var25;
            } else {
                class97.field2231 = class62.method501(class145.field3503, 836, class135.field3290, class94.field2154);
            }
            if (class71.field1480 != null) {
                ++var25;
            } else {
                class71.field1480 = class62.method501(class145.field3503, arg0 ^ -22628, class135.field3290, class46.field1047);
            }
            if (~var25 > -4) {
                class80.field1759 = class102.method840(new class98[] { class1.field8, class132.method1074(var25 * 100 / 3, (byte) -109), class15.field309 }, 10);
                class81.field1835 = 40;
            } else {
                class81.field1835 = 40;
                class80.field1759 = class37.field910;
                class53.field1185 = 60;
            }
        } else if (~class53.field1185 == -61) {
            int var26 = class134.method1089(634, class132.field3170, class135.field3290);
            int var27 = class88.method716((byte) 77);
            if (~var27 < ~var26) {
                class80.field1759 = class102.method840(new class98[] { class4.field62, class132.method1074(var26 * 100 / var27, (byte) 115), class15.field309 }, 10);
                class81.field1835 = 50;
            } else {
                class80.field1759 = class29.field679;
                class81.field1835 = 50;
                class96.method768((byte) 98, 5);
                class53.field1185 = 70;
            }
        } else if (~class53.field1185 == -71) {
            if (!client.field504.method1057(true)) {
                class80.field1759 = class102.method840(new class98[] { class84.field1963, class132.method1074(client.field504.method595(true), (byte) 83), class15.field309 }, 10);
                class81.field1835 = 60;
            } else {
                class49.method417((byte) -44, client.field504);
                class124.method984(arg0 ^ 31354, client.field504);
                class96.method767(65, class24.field589, client.field504);
                class64.method524(class24.field589, arg0 + 23256, client.field504, class94.field2151);
                class150.method1210(client.field504, class24.field589, arg0 + 23403);
                class75.method616(client.field504, class4.field57, 10, class145.field3525, class24.field589);
                class141.method1127(class132.field3172, arg0 + 23335, class127.field2845, client.field504);
                class44.method377(client.field504, (byte) -106, class24.field589);
                class24.method266(false, client.field504);
                class51.method429(client.field504, true);
                class80.method640(class135.field3290, true, class14.field298, class24.field589);
                class21.method196(0, client.field504);
                class53.field1185 = 80;
                class81.field1835 = 60;
                class80.field1759 = class139.field3403;
            }
        } else if (~class53.field1185 != -81) {
            if (class53.field1185 == 85) {
                int var34 = class4.method20(class135.field3290, 0);
                int var35 = class111.method908(104);
                if (var35 > var34) {
                    class80.field1759 = class102.method840(new class98[] { class91.field2108, class132.method1074(var34 * 100 / var35, (byte) 38), class15.field309 }, 10);
                    class81.field1835 = 80;
                } else {
                    class80.field1759 = class1.field4;
                    class81.field1835 = 80;
                    class53.field1185 = 90;
                }
            } else if (~class53.field1185 == -91) {
                if (!class57.field1270.method1057(true)) {
                    class80.field1759 = class102.method840(new class98[] { class87.field1995, class132.method1074(class57.field1270.method595(true), (byte) 116), class15.field309 }, 10);
                    class81.field1835 = 90;
                } else {
                    class32 var36 = new class32(class57.field1270, class135.field3290, 20, 0.8D, class94.field2151 ? 64 : 128);
                    class66.method546(var36);
                    class66.method535(0.8D);
                    class81.field1835 = 90;
                    class53.field1185 = 110;
                    class80.field1759 = class56.field1245;
                }
            } else if (class53.field1185 == 110) {
                class20.field444 = new class62();
                class10.field203.method581(10, 25093, class20.field444);
                class81.field1835 = 94;
                class80.field1759 = class29.field683;
                class53.field1185 = 120;
            } else if (~class53.field1185 == -121) {
                if (!class132.field3170.method1053(class145.field3503, class79.field1729, arg0 + 24872)) {
                    class80.field1759 = class102.method840(new class98[] { class97.field2242, class131.field3060 }, 10);
                    class81.field1835 = 96;
                } else {
                    class6 var37 = new class6(class132.field3170.method1043(12323, class79.field1729, class145.field3503));
                    class135.method1096(var37, -93);
                    class80.field1759 = class18.field379;
                    class53.field1185 = 130;
                    class81.field1835 = 96;
                }
            } else if (~class53.field1185 == -131) {
                if (!class14.field298.method1057(true)) {
                    class80.field1759 = class102.method840(new class98[] { class1.field2, class132.method1074(4 * class14.field298.method595(true) / 5, (byte) -83), class15.field309 }, 10);
                    class81.field1835 = 100;
                } else if (!class123.field2748.method1057(true)) {
                    class80.field1759 = class102.method840(new class98[] { class1.field2, class132.method1074(class123.field2748.method595(true) / 6 + 80, (byte) 50), class15.field309 }, 10);
                    class81.field1835 = 100;
                } else if (!class15.field305.method1057(true)) {
                    class80.field1759 = class102.method840(new class98[] { class1.field2, class132.method1074(96 + class15.field305.method595(true) / 20, (byte) -102), class15.field309 }, 10);
                    class81.field1835 = 100;
                } else {
                    class81.field1835 = 100;
                    class80.field1759 = class106.field2438;
                    class53.field1185 = 140;
                }
            } else {
                if (arg0 != -23336) {
                    field1522 = null;
                }
                if (~class53.field1185 == -141) {
                    class96.method768((byte) 98, 10);
                }
            }
        } else {
            int var28 = 0;
            if (class96.field2218 != null) {
                ++var28;
            } else {
                class96.field2218 = class130.method1071(class145.field3503, class135.field3290, (byte) 126, class46.field1063);
            }
            if (class145.field3504 != null) {
                ++var28;
            } else {
                class145.field3504 = class130.method1071(class145.field3503, class135.field3290, (byte) 127, class44.field1014);
            }
            if (class21.field469 == null) {
                class21.field469 = class147.method1175(class135.field3290, class145.field3503, class35.field868, false);
            } else {
                ++var28;
            }
            if (class90.field2068 != null) {
                ++var28;
            } else {
                class90.field2068 = class150.method1200(class145.field3503, 2, class14.field300, class135.field3290);
            }
            if (class5.field77 != null) {
                ++var28;
            } else {
                class5.field77 = class150.method1200(class145.field3503, 2, class132.field3176, class135.field3290);
            }
            if (class33.field793 == null) {
                class33.field793 = class150.method1200(class145.field3503, 2, class8.field123, class135.field3290);
            } else {
                ++var28;
            }
            if (class6.field109 != null) {
                ++var28;
            } else {
                class6.field109 = class150.method1200(class145.field3503, arg0 + 23338, class132.field3230, class135.field3290);
            }
            if (class123.field2733 == null) {
                class123.field2733 = class150.method1200(class145.field3503, 2, class84.field1959, class135.field3290);
            } else {
                ++var28;
            }
            if (class19.field422 != null) {
                ++var28;
            } else {
                class19.field422 = class130.method1071(class145.field3503, class135.field3290, (byte) 126, class42.field984);
            }
            if (class84.field1956 != null) {
                ++var28;
            } else {
                class84.field1956 = class150.method1200(class145.field3503, 2, class29.field692, class135.field3290);
            }
            if (class10.field205 == null) {
                class10.field205 = class150.method1200(class145.field3503, 2, class115.field2586, class135.field3290);
            } else {
                ++var28;
            }
            if (class113.field2529 == null) {
                class113.field2529 = class150.method1200(class145.field3503, arg0 ^ -23334, class21.field472, class135.field3290);
            } else {
                ++var28;
            }
            if (class82.field1857 == null) {
                class82.field1857 = class147.method1175(class135.field3290, class145.field3503, class134.field3253, false);
            } else {
                ++var28;
            }
            if (class87.field1984 == null) {
                class87.field1984 = class147.method1175(class135.field3290, class145.field3503, class139.field3397, false);
            } else {
                ++var28;
            }
            if (~var28 > -15) {
                class80.field1759 = class102.method840(new class98[] { class30.field695, class132.method1074(var28 * 100 / 14, (byte) 111), class15.field309 }, 10);
                class81.field1835 = 70;
            } else {
                class145.field3504.method493();
                int var29 = -10 + (int) (Math.random() * 21.0D);
                int var30 = (int) (Math.random() * 21.0D) + -10;
                int var31 = (int) (Math.random() * 41.0D) + -20;
                int var32 = -10 + (int) (21.0D * Math.random());
                for (int var33 = 0; ~class90.field2068.length < ~var33; ++var33) {
                    class90.field2068[var33].method484(var29 - -var31, var30 + var31, var31 + var32);
                }
                class21.field469[0].method828(var29 + var31, var30 + var31, var31 + var32);
                class53.field1185 = 85;
                class81.field1835 = 70;
                class80.field1759 = class17.field359;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZBZI[B)V")
    public final void method593(boolean arg0, byte arg1, boolean arg2, int arg3, byte[] arg4) {
        if (arg1 > 37) {
            ++field1534;
            if (!arg0) {
                arg4[arg4.length + -2] = (byte) (super.field3017[arg3] >> 8);
                arg4[arg4.length + -1] = (byte) super.field3017[arg3];
                if (this.field1527 != null) {
                    class135.method1098(false, this.field1527, arg3, arg4);
                    this.field1538[arg3] = true;
                }
                if (arg2) {
                    super.field3002[arg3] = class55.method454(false, false, arg4);
                    return;
                }
            } else {
                if (this.field1523) {
                    throw new RuntimeException();
                }
                if (this.field1541 != null) {
                    class135.method1098(false, this.field1541, this.field1535, arg4);
                }
                this.method1050(-14456, arg4);
                this.method590((byte) 71);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)I")
    private final int method594(int arg0) {
        ++field1514;
        if (arg0 != -1) {
            field1510 = null;
        }
        if (this.field1523) {
            return 100;
        } else if (super.field3002 != null) {
            return 99;
        } else {
            int var2 = class6.method31(255, -66, this.field1535);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)I")
    private final int method595(boolean arg0) {
        ++field1529;
        int var2 = 0;
        int var3 = 0;
        if (!arg0) {
            field1520 = null;
        }
        for (int var4 = 0; var4 < super.field3002.length; ++var4) {
            if (super.field3049[var4] > 0) {
                var3 += this.method601(var4, false);
                var2 += 100;
            }
        }
        if (~var2 == -1) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)V")
    public final void method596(int arg0, int arg1) {
        class126.method992(arg0, 125, this.field1535);
        if (arg1 != -20531) {
            field1506 = null;
        }
        ++field1508;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(III)I")
    public static final int method597(int arg0, int arg1, int arg2) {
        ++field1539;
        if (arg2 > -13) {
            return 30;
        } else {
            class139 var3 = (class139) class67.field1422.method17(-16, (long) arg0);
            if (var3 == null) {
                return 0;
            } else {
                return ~arg1 <= -1 && ~var3.field3395.length < ~arg1 ? var3.field3395[arg1] : 0;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(II)V")
    public final void method598(int arg0, int arg1) {
        if (arg0 == 22695) {
            this.field1537 = arg1;
            if (this.field1541 == null) {
                class44.method378((byte) 0, 255, this.field1535, this.field1537, true, -121, this);
            } else {
                class76.method623((byte) 61, this, this.field1541, this.field1535);
            }
            ++field1515;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lve;[BIZZ)V")
    public final void method599(class145 arg0, byte[] arg1, int arg2, boolean arg3, boolean arg4) {
        ++field1507;
        if (this.field1541 != arg0) {
            if (!arg4 && ~this.field1518 == ~arg2) {
                this.field1523 = true;
            }
            if (arg1 == null || arg1.length <= 2) {
                this.field1538[arg2] = false;
                if (this.field1528 || arg4) {
                    class44.method378((byte) 2, this.field1535, arg2, super.field3008[arg2], arg4, -75, this);
                }
                return;
            }
            class56.field1247.reset();
            class56.field1247.update(arg1, 0, arg1.length + -2);
            int var6 = (int) class56.field1247.getValue();
            int var7 = ((arg1[arg1.length + -2] & 255) << 8) + (255 & arg1[arg1.length - 1]);
            if (~super.field3008[arg2] != ~var6 || ~super.field3017[arg2] != ~var7) {
                this.field1538[arg2] = false;
                if (this.field1528 || arg4) {
                    class44.method378((byte) 2, this.field1535, arg2, super.field3008[arg2], arg4, -108, this);
                }
                return;
            }
            this.field1538[arg2] = true;
            if (arg4) {
                super.field3002[arg2] = class55.method454(false, false, arg1);
            }
        } else {
            if (this.field1523) {
                throw new RuntimeException();
            }
            if (arg1 == null) {
                class44.method378((byte) 0, 255, this.field1535, this.field1537, true, -107, this);
                return;
            }
            class56.field1247.reset();
            class56.field1247.update(arg1, 0, arg1.length);
            int var8 = (int) class56.field1247.getValue();
            if (~this.field1537 != ~var8) {
                class44.method378((byte) 0, 255, this.field1535, this.field1537, true, -98, this);
                return;
            }
            this.method1050(-14456, arg1);
            this.method590((byte) 71);
        }
        if (arg3) {
            field1516 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Loa;ZLoa;Loa;)V")
    public static final void method600(class98 arg0, boolean arg1, class98 arg2, class98 arg3) {
        class80.field1776 = arg2;
        ++field1531;
        if (!arg1) {
            method597(-21, -80, -7);
        }
        class80.field1766 = arg0;
        class80.field1748 = arg3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)I")
    private final int method601(int arg0, boolean arg1) {
        ++field1517;
        if (super.field3002[arg0] != null) {
            return 100;
        } else if (arg1) {
            return -28;
        } else {
            return this.field1538[arg0] ? 100 : class6.method31(this.field1535, -83, arg0);
        }
    }
}
