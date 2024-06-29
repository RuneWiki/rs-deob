import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class68 {

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Lsc;")
    private static class128 field1525 = class129.method1017(false, "To play on this world move to a free area first)3");

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Z")
    public static boolean field1522 = false;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Lsc;")
    private static class128 field1520 = class129.method1017(false, "wishes to duel with you)3");

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field1527 = 0;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static volatile int field1524 = 0;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field1529 = 0;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "[I")
    public static int[] field1528 = new int[32768];

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lsc;")
    public static class128 field1531 = class129.method1017(false, "welle:");

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Lsc;")
    public static class128 field1534 = field1520;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Lsc;")
    public static class128 field1535 = field1525;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Lsc;")
    public static class128 field1530 = class129.method1017(false, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Z")
    public static boolean field1532 = false;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Lsc;")
    public static class128 field1536 = class129.method1017(false, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lsf;")
    public static class131 field1523;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V")
    public static final void method514(int arg0, byte arg1) {
        class69.field1561 += arg0 * 128;
        field1533++;
        if (class9.field135.length < class69.field1561) {
            int var2 = (int) (Math.random() * 12.0D);
            class69.field1561 -= class9.field135.length;
            class77.method566(1, class43.field813[var2]);
        }
        short var3 = 256;
        if (arg1 > -91) {
            field1520 = null;
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var3 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class148.field3422[var4 + var5] - class9.field135[class9.field135.length - 1 & class69.field1561 + var4] * arg0 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class148.field3422[var4++] = var27;
        }
        for (int var8 = var3 - arg0; var8 < var3; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class148.field3422[var24 + var25] = 255;
                } else {
                    class148.field3422[var25 + var24] = 0;
                }
            }
        }
        if (class131.field3038 > 0) {
            class131.field3038 -= arg0 * 4;
        }
        if (class89.field2044 > 0) {
            class89.field2044 -= arg0 * 4;
        }
        if (class89.field2044 == 0 && class131.field3038 == 0) {
            int var9 = (int) ((double) (2000 / arg0) * Math.random());
            if (var9 == 1) {
                class131.field3038 = 1024;
            }
            if (var9 == 0) {
                class89.field2044 = 1024;
            }
        }
        for (int var10 = 0; var10 < var3 - arg0; var10++) {
            class157.field3604[var10] = class157.field3604[arg0 + var10];
        }
        for (int var11 = var3 - arg0; var11 < var3; var11++) {
            class157.field3604[var11] = (int) (Math.sin((double) class62.field1330 / 14.0D) * 16.0D + Math.sin((double) class62.field1330 / 15.0D) * 14.0D + Math.sin((double) class62.field1330 / 16.0D) * 12.0D);
            class62.field1330++;
        }
        class16.field298 += arg0;
        int var12 = (arg0 + (class29.field554 & 0x1)) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class16.field298 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class148.field3422[(var23 << 7) + var22] = 192;
        }
        class16.field298 = 0;
        for (int var14 = 0; var14 < var3; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var19 += class148.field3422[var20 + var12 + var21];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class148.field3422[var20 + var21 - var12 - 1];
                }
                if (var21 >= 0) {
                    class54.field1101[var21 + var20] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var3; var17++) {
                int var18 = var17 * 128;
                if (var3 > var12 + var17) {
                    var16 += class54.field1101[var12 * 128 + var15 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class54.field1101[var18 + var15 - (var12 + 1) * 128];
                }
                if (var17 >= 0) {
                    class148.field3422[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method515(int arg0) {
        field1528 = null;
        field1525 = null;
        field1531 = null;
        field1534 = null;
        field1523 = null;
        int var1 = 124 % ((arg0 - 55) / 53);
        field1520 = null;
        field1536 = null;
        field1530 = null;
        field1535 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)J")
    public static final synchronized long method516(boolean arg0) {
        field1526++;
        if (arg0) {
            return -116L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class112.field2531) {
            class94.field2165 += class112.field2531 - var1;
        }
        class112.field2531 = var1;
        return class94.field2165 + var1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Z")
    public static final boolean method517(int arg0, int arg1) {
        field1521++;
        if (arg0 >= -36) {
            field1528 = null;
        }
        return (arg1 & 0x1) != 0;
    }
}
