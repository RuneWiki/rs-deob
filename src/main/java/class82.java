import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class82 {

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field1508 = 0;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Lkb;")
    public static class93 field1514 = class76.method390("Abbrechen", 0);

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Lh;")
    public static class65 field1511 = null;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "Lkb;")
    private static class93 field1517 = class76.method390("Loading config )2 ", 0);

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Lkb;")
    public static class93 field1509 = field1517;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field1504 = 0;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "[I")
    public static int[] field1519 = new int[100];

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Z")
    public static boolean field1515 = false;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "[I")
    public static int[] field1513;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method417(int arg0) {
        field1514 = null;
        field1519 = null;
        field1511 = null;
        field1509 = null;
        field1513 = null;
        if (arg0 == 1585128487) {
            field1517 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    public static final void method418(boolean arg0) {
        if (class112.field2083[96]) {
            class43.field713 += (-class43.field713 - 24) / 2;
        } else if (class112.field2083[97]) {
            class43.field713 += (24 - class43.field713) / 2;
        } else {
            class43.field713 /= 2;
        }
        class30.field510 = class43.field713 / 2 + class30.field510 & 0x7FF;
        int var1 = class106.field1940.field2032 + class166.field3328;
        field1503++;
        int var2 = class21.field341 + class106.field1940.field2045;
        if (class4.field70 - var1 < -500 || class4.field70 - var1 > 500 || class203.field3926 - var2 < -500 || class203.field3926 - var2 > 500) {
            class4.field70 = var1;
            class203.field3926 = var2;
        }
        if (!arg0) {
            method418(true);
        }
        if (class112.field2083[98]) {
            class155.field3048 += (12 - class155.field3048) / 2;
        } else if (class112.field2083[99]) {
            class155.field3048 += (-class155.field3048 - 12) / 2;
        } else {
            class155.field3048 /= 2;
        }
        if (class4.field70 != var1) {
            class4.field70 += (var1 - class4.field70) / 16;
        }
        class113.field2108 += class155.field3048 / 2;
        int var3 = 0;
        int var4 = class4.field70 >> 7;
        if (class113.field2108 < 128) {
            class113.field2108 = 128;
        }
        if (class203.field3926 != var2) {
            class203.field3926 += (var2 - class203.field3926) / 16;
        }
        int var5 = class203.field3926 >> 7;
        if (class113.field2108 > 383) {
            class113.field2108 = 383;
        }
        int var6 = class189.method1226(class203.field3926, -1, class4.field70, class114.field2145);
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class114.field2145;
                    if (var9 < 3 && (class136.field2637[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class151.field2935[var9][var7][var8];
                    if (var10 > var3) {
                        var3 = var10;
                    }
                }
            }
        }
        int var11 = var3 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (field1508 < var11) {
            field1508 += (var11 - field1508) / 24;
        } else if (var11 < field1508) {
            field1508 += (var11 - field1508) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public static final void method419(byte arg0) {
        class124.field2313 = 0;
        class161.field3222 = 0;
        int var1 = 88 / ((arg0 + 30) / 51);
        field1516++;
        class207.method1343((byte) -65);
        class13.method70(-26411);
        class67.method353(2);
        for (int var2 = 0; var2 < class161.field3222; var2++) {
            int var4 = class171.field3397[var2];
            if (class21.field338 != class143.field2791[var4].field2073) {
                class143.field2791[var4].field1364 = null;
                class143.field2791[var4] = null;
            }
        }
        if (class157.field3109 != class59.field942.field3153) {
            throw new RuntimeException("gnp1 pos:" + class59.field942.field3153 + " psize:" + class157.field3109);
        }
        for (int var3 = 0; var3 < class195.field3788; var3++) {
            if (class143.field2791[class49.field794[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class195.field3788);
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lkb;Lrd;B)I")
    public static final int method420(class93 arg0, class158 arg1, byte arg2) {
        if (arg2 != -119) {
            method417(98);
        }
        field1501++;
        int var3 = arg1.field3153;
        arg1.method1045(arg2 + 32887, arg0.field1701);
        arg1.field3153 += class64.field1014.method1156(arg0.field1701, -24842, arg1.field3162, arg0.field1726, arg1.field3153, 0);
        return arg1.field3153 - var3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lld;Z)V")
    public static final void method421(class104 arg0, boolean arg1) {
        if (!arg1) {
            field1502++;
            class111.method599(200000, arg0, 96);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public static final void method422(int arg0) {
        if (arg0 != 0) {
            field1507 = -127;
        }
        field1512++;
        try {
            if (class61.field967 == null) {
                class61.field967 = new class167(class77.field1393, class203.method1321(new class93[] { class61.field980, class43.field715, class174.field3442 }, 94).method511(false));
            } else {
                byte[] var1 = class61.field967.method1130((byte) 122);
                if (var1 != null) {
                    class158 var2 = new class158(var1);
                    class192.field3743 = var2.method1071(28101);
                    class183.field3615 = new class80[class192.field3743];
                    for (int var3 = 0; var3 < class192.field3743; var3++) {
                        class80 var4 = class183.field3615[var3] = new class80();
                        int var5 = var2.method1071(28101);
                        var4.field1424 = (var5 & 0x8000) != 0;
                        var4.field1420 = var5 & 0x7FFF;
                        var4.field1423 = var2.method1035(arg0 + 255);
                        var4.field1430 = var2.method1083(true);
                        var4.field1429 = var3;
                        var4.field1416 = class177.method1168(false, var4.field1423);
                    }
                    class111.method602(-31721, class183.field3615, class152.field2936, class183.field3615.length - 1, class95.field1765, 0);
                    class61.field967 = null;
                    class157.field3105 = true;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class61.field967 = null;
        }
    }
}
