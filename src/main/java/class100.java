import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class100 implements class143 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Z")
    public static boolean field1488 = false;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "[[S")
    public static short[][] field1491 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "[Lpj;")
    public static class159[] field1495 = new class159[6];

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Lve;")
    public static class233 field1496;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method668(int arg0) {
        field1495 = null;
        field1491 = null;
        if (arg0 != -27106) {
            method671(81);
        }
        field1496 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I")
    public static final int method669(int arg0, int arg1) {
        field1494++;
        if (arg0 != 17477) {
            method669(-85, -12);
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([IIJB)Ljava/lang/String;")
    public final String method670(int[] arg0, int arg1, long arg2, byte arg3) {
        field1493++;
        if (arg1 == 0) {
            class31 var6 = class51.method342(arg0[0], 22771);
            return var6.method221(29294, (int) arg2);
        }
        int var7 = 57 % ((arg3 + 16) / 45);
        if (arg1 == 1 || arg1 == 10) {
            class273 var8 = class259.method1735((int) arg2, -14667);
            return var8.field4375;
        } else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
            return class51.method342(arg0[0], 22771).method221(29294, (int) arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static final void method671(int arg0) {
        class245.field3667 &= 0x7FF;
        int var1 = class104.field1544 >> 7;
        field1492++;
        int var2 = class25.field332 >> 7;
        int var3 = -23 / ((arg0 + 63) / 48);
        if (class103.field1535 < 128) {
            class103.field1535 = 128;
        }
        if (class103.field1535 > 383) {
            class103.field1535 = 383;
        }
        int var4 = class81.method542(class104.field1544, -1, class163.field2364, class25.field332);
        int var5 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var6 = var1 - 4; var6 <= var1 + 4; var6++) {
                for (int var7 = var2 - 4; var7 <= (var2 + 4); var7++) {
                    int var8 = class163.field2364;
                    if (var8 < 3 && (class189.field2684[1][var6][var7] & 0x2) == 2) {
                        var8++;
                    }
                    int var9 = (class111.field1600[var8][var6][var7] & 0xFF) * 8 + var4 - class107.field1556[var8][var6][var7];
                    if (var9 > var5) {
                        var5 = var9;
                    }
                }
            }
        }
        int var10 = var5 * 192;
        if (var10 > 98048) {
            var10 = 98048;
        }
        if (var10 < 32768) {
            var10 = 32768;
        }
        if (var10 > class29.field414) {
            class29.field414 += (var10 - class29.field414) / 24;
        } else if (var10 < class29.field414) {
            class29.field414 += (var10 - class29.field414) / 80;
            return;
        }
    }
}
