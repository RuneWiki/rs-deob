import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class75 extends class15 {

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "[J")
    private long[] field1507 = new long[10];

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    private int field1504 = 256;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    private int field1505 = 1;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    private int field1497 = 0;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "J")
    private long field1499 = class94.method779(-76);

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "[Lre;")
    public static class123[] field1496 = new class123[256];

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "Lpe;")
    public static class109 field1502 = class141.method1120(": ", 0);

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field1498 = 0;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "Z")
    public static boolean field1508 = false;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field1500 = 0;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
    public static int field1520 = 2;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "Lpe;")
    public static class109 field1511 = class141.method1120("Okay", 0);

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "Lpe;")
    private static class109 field1517 = class141.method1120("New User", 0);

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "Lpe;")
    public static class109 field1515 = field1517;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "Lcc;")
    public static class18 field1510;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
    public static final void method589(byte arg0) {
        field1506++;
        int var1 = 79 % ((59 - arg0) / 60);
        for (class133 var2 = (class133) class27.field630.method195((byte) 106); var2 != null; var2 = (class133) class27.field630.method198((byte) -52)) {
            if (var2.field2891 > 0) {
                var2.field2891--;
            }
            if (var2.field2891 != 0) {
                if (var2.field2904 > 0) {
                    var2.field2904--;
                }
                if (var2.field2904 == 0 && var2.field2908 >= 1 && var2.field2910 >= 1 && var2.field2908 <= 102 && var2.field2910 <= 102 && (var2.field2909 < 0 || class68.method530(var2.field2892, var2.field2909, 55))) {
                    class42.method385(var2.field2910, var2.field2907, var2.field2908, var2.field2909, var2.field2905, (byte) 58, var2.field2892, var2.field2914);
                    var2.field2904 = -1;
                    if (var2.field2909 == var2.field2903 && var2.field2903 == -1) {
                        var2.method101((byte) 125);
                    } else if (var2.field2909 == var2.field2903 && var2.field2907 == var2.field2900 && var2.field2906 == var2.field2892) {
                        var2.method101((byte) 105);
                    }
                }
            } else if (var2.field2903 < 0 || class68.method530(var2.field2906, var2.field2903, 123)) {
                class42.method385(var2.field2910, var2.field2900, var2.field2908, var2.field2903, var2.field2905, (byte) 84, var2.field2906, var2.field2914);
                var2.method101((byte) 121);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I")
    public final int method175(int arg0, int arg1, int arg2) {
        field1514++;
        int var4 = this.field1504;
        int var5 = this.field1505;
        this.field1504 = 300;
        this.field1505 = 1;
        this.field1499 = class94.method779(121);
        if (this.field1507[this.field1516] == 0L) {
            this.field1504 = var4;
            this.field1505 = var5;
        } else if (this.field1507[this.field1516] < this.field1499) {
            this.field1504 = (int) ((long) (arg0 * 2560) / (this.field1499 - this.field1507[this.field1516]));
        }
        if (this.field1504 < 25) {
            this.field1504 = 25;
        }
        if (this.field1504 > 256) {
            this.field1504 = 256;
            this.field1505 = (int) ((long) arg0 - (this.field1499 - this.field1507[this.field1516]) / 10L);
        }
        if (this.field1505 > arg0) {
            this.field1505 = arg0;
        }
        this.field1507[this.field1516] = this.field1499;
        this.field1516 = (this.field1516 + 1) % 10;
        if (this.field1505 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1507[var6] != 0L) {
                    this.field1507[var6] -= -((long) this.field1505);
                }
            }
        }
        int var7 = 0;
        if (arg1 >= -47) {
            field1498 = 102;
        }
        if (arg2 > this.field1505) {
            this.field1505 = arg2;
        }
        class99.method797((long) this.field1505, false);
        while (this.field1497 < 256) {
            this.field1497 += this.field1504;
            var7++;
        }
        this.field1497 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method590(int arg0) {
        field1517 = null;
        field1496 = null;
        field1515 = null;
        field1502 = null;
        field1510 = null;
        field1511 = null;
        if (arg0 <= 94) {
            method590(-37);
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V")
    public static final void method591(byte arg0) {
        int var1 = class113.field2484 * 128 + 64;
        field1509++;
        int var2 = class38.field835 * 128 + 64;
        int var3 = class126.method1019(var2, var1, 1, field1513) - class3.field75;
        if (var1 > class85.field1795) {
            class85.field1795 += (var1 - class85.field1795) * class84.field1792 / 1000 + class1.field15;
            if (var1 < class85.field1795) {
                class85.field1795 = var1;
            }
        }
        if (var2 > class154.field3518) {
            class154.field3518 += (var2 - class154.field3518) * class84.field1792 / 1000 + class1.field15;
            if (var2 < class154.field3518) {
                class154.field3518 = var2;
            }
        }
        if (class154.field3518 > var2) {
            class154.field3518 -= (class154.field3518 - var2) * class84.field1792 / 1000 + class1.field15;
            if (var2 > class154.field3518) {
                class154.field3518 = var2;
            }
        }
        if (class102.field2149 < var3) {
            class102.field2149 += class1.field15 + (var3 - class102.field2149) * class84.field1792 / 1000;
            if (var3 < class102.field2149) {
                class102.field2149 = var3;
            }
        }
        int var4 = class113.field2450 * 128 + 64;
        if (var1 < class85.field1795) {
            class85.field1795 -= (class85.field1795 - var1) * class84.field1792 / 1000 + class1.field15;
            if (var1 > class85.field1795) {
                class85.field1795 = var1;
            }
        }
        int var5 = class52.field1076 * 128 + 64;
        if (var3 < class102.field2149) {
            class102.field2149 -= (class102.field2149 - var3) * class84.field1792 / 1000 + class1.field15;
            if (var3 > class102.field2149) {
                class102.field2149 = var3;
            }
        }
        int var6 = class126.method1019(var4, var5, 1, field1513) - class94.field2029;
        int var7 = var5 - class85.field1795;
        if (arg0 <= 113) {
            method593(67, null, -24, null);
        }
        int var8 = var6 - class102.field2149;
        int var9 = var4 - class154.field3518;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
        int var13 = var12 - class57.field1158;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var11 > class116.field2591) {
            class116.field2591 += class52.field1074 + (var11 - class116.field2591) * class2.field42 / 1000;
            if (class116.field2591 > var11) {
                class116.field2591 = var11;
            }
        }
        if (var13 > 0) {
            class57.field1158 += class52.field1074 + class2.field42 * var13 / 1000;
            class57.field1158 &= 0x7FF;
        }
        if (var13 < 0) {
            class57.field1158 -= class52.field1074 + -var13 * class2.field42 / 1000;
            class57.field1158 &= 0x7FF;
        }
        if (class116.field2591 > var11) {
            class116.field2591 -= (class116.field2591 - var11) * class2.field42 / 1000 + class52.field1074;
            if (class116.field2591 < var11) {
                class116.field2591 = var11;
            }
        }
        int var14 = var12 - class57.field1158;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class57.field1158 = var12;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public final void method173(boolean arg0) {
        field1512++;
        int var2 = 0;
        if (arg0) {
            while (var2 < 10) {
                this.field1507[var2] = 0L;
                var2++;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILpe;)V")
    public static final void method592(int arg0, class109 arg1) {
        field1519++;
        if (class89.field1889 == null) {
            return;
        }
        int var2;
        for (var2 = arg0; class89.field1889.length > var2 && !arg1.method884(class89.field1889[var2].field2843, arg0 + 125); var2++) {
        }
        if (var2 < class89.field1889.length && class89.field1889[var2] != null) {
            class63.field1299.method535(107, arg0 - 25013);
            class84.field1778++;
            class63.field1299.method157((byte) 47, class89.field1889[var2].field267);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILpe;ILpe;)V")
    public static final void method593(int arg0, class109 arg1, int arg2, class109 arg3) {
        if (arg2 != -8870) {
            field1517 = null;
        }
        field1521++;
        class100.method806(arg0, null, (byte) 127, arg3, arg1);
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class75() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1507[var1] = this.field1499;
        }
    }
}
