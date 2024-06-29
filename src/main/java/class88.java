import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class88 {

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1519 = 0;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Luh;")
    public static class198 field1522 = new class198();

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "J")
    public static volatile long field1525 = 0L;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Lub;")
    private static class227 field1524 = class257.method1749(" from your friend list first)3", 17263);

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "[I")
    public static int[] field1532 = new int[64];

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field1533 = 0;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lub;")
    public static class227 field1528 = null;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "Lub;")
    private static class227 field1534 = class257.method1749("Please wait)3)3)3", 17263);

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Lub;")
    public static class227 field1523 = field1534;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Lub;")
    public static class227 field1531 = class257.method1749("<img=0>", 17263);

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lub;")
    public static class227 field1529 = field1524;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Ln;")
    public static class138 field1530;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Lnd;")
    public static class202 field1526;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIIII)V")
    public static final void method524(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1518++;
        class246.method1644(arg1, class59.field1094[arg3], arg4 + arg2, arg4 - arg2, 1);
        int var5 = arg2;
        if (arg0 != 83) {
            method524((byte) 16, 84, -65, -51, 71);
        }
        int var6 = 0;
        int var7 = -arg2;
        int var8 = -1;
        while (var5 > var6) {
            var6++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                var5--;
                var7 -= var5 << 1;
                int[] var9 = class59.field1094[arg3 + var5];
                int[] var10 = class59.field1094[arg3 - var5];
                int var11 = arg4 + var6;
                int var12 = arg4 - var6;
                class246.method1644(arg1, var9, var11, var12, 1);
                class246.method1644(arg1, var10, var11, var12, 1);
            }
            int var13 = arg4 - var5;
            int var14 = arg4 + var5;
            int[] var15 = class59.field1094[arg3 - var6];
            int[] var16 = class59.field1094[arg3 + var6];
            class246.method1644(arg1, var16, var14, var13, 1);
            class246.method1644(arg1, var15, var14, var13, 1);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static final void method525(byte arg0) {
        field1520++;
        class98.field1712.method1723(-4173);
        if (arg0 > -26) {
            method525((byte) 50);
        }
        class131.field2292.method1723(-4173);
        class31.field498.method1723(-4173);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
    public static final void method526(byte arg0) {
        class98.field1712.method1728(true);
        class131.field2292.method1728(true);
        class31.field498.method1728(true);
        if (arg0 >= 2) {
            field1521++;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1517++;
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            class38.field642 = -1;
            class71.field1249 = -1;
            return;
        }
        int var8 = class193.method1227(arg0, true, class64.field1171, arg1) - arg6;
        int var9 = arg1 - field1527;
        int var10 = class62.field1136[class161.field2724];
        int var11 = arg0 - class184.field3135;
        int var12 = class62.field1143[class103.field1812];
        int var13 = class62.field1143[class161.field2724];
        int var14 = class62.field1136[class103.field1812];
        int var15 = var9 * var10 + var11 * var13 >> 16;
        int var16 = var8 - class25.field422;
        int var17 = var9 * var13 - var10 * var11 >> 16;
        int var19 = var12 * var16 - (var14 * var17) >> 16;
        int var20 = var12 * var17 + var14 * var16 >> 16;
        if (arg5 != 0) {
            method525((byte) -29);
        }
        if (var20 >= 50) {
            class71.field1249 = (var19 << 9) / var20 + arg4;
            class38.field642 = (var15 << 9) / var20 + arg2;
        } else {
            class71.field1249 = -1;
            class38.field642 = -1;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method528(int arg0) {
        field1526 = null;
        field1524 = null;
        field1522 = null;
        field1529 = null;
        field1531 = null;
        field1532 = null;
        field1528 = null;
        field1530 = null;
        if (arg0 != 1) {
            method525((byte) -121);
        }
        field1523 = null;
        field1534 = null;
    }
}
